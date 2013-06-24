import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

/**
 * Componente (objeto) reune as operações (funcionalidades) para manipulação em arquivo texto.
 *
 * Esse componente é utilizado em diversas demonstrações no material da Academia do Programador.
 *
 * Author: Globalcode 
 */
public class Arquivo {

    private String nomeArquivo;
    private Reader in;
    private Writer out;
    private BufferedReader leitor;

    private Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public static Arquivo abrirLeitura(String nomeArquivo) {
        Arquivo a;
        try {
            a = new Arquivo(nomeArquivo);
            a.in = new FileReader(new File(nomeArquivo));
            a.leitor = new BufferedReader(a.in);
            log("Arquivo aberto para leitura", nomeArquivo);
        } catch (IOException e) {
            a = null;
            log("Problema ao tentar abrir arquivo para leitura", nomeArquivo);
        }
        return a;
    }

    public static Arquivo abrirEscrita(String nomeArquivo, String operacao) {
        Arquivo a;
        File f = new File(nomeArquivo);
        try {
            a = new Arquivo(nomeArquivo);
            boolean append = false;
            if (operacao.equalsIgnoreCase("new")) {
                f.createNewFile();
            } else if (operacao.equalsIgnoreCase("truncate")) {
                append = false;
            } else if (operacao.equalsIgnoreCase("append")) {
                append = true;
            }
            a.out = new FileWriter(f, append);
            log("Arquivo aberto para escrita", nomeArquivo);
        } catch (IOException e) {
            a = null;
            log("Problema ao tentar abrir arquivo para escrita", nomeArquivo);
        }
        return a;
    }

    public static void escrever(Arquivo a, String texto) {
        if (a != null) {
            try {
                BufferedWriter b = new BufferedWriter(a.out);
                b.write(texto);
                b.newLine();
                b.flush();
                log("Texto escrito no arquivo : " + texto, a.nomeArquivo);
            } catch (IOException e) {
                log("Problema ao tentar escrever no arquivo", a.nomeArquivo);
            }
        } else {
            log("Arquivo nao esta aberto para escrita.", "");
        }
    }

    public static String lerLinha(Arquivo a) {
        if (a != null) {
            String texto = null;
            try {
                texto = a.leitor.readLine();
            } catch (IOException e) {
                log("Problema ao tentar ler do arquivo", a.nomeArquivo);
            }
            return texto;
        } else {
            log("Arquivo nao esta aberto para leitura.", "");
        }
        return null;
    }

    public static void fechar(Arquivo a) {
        if (a != null) {
            try {
                if (a.in != null) {
                    a.in.close();
                }
            } catch (IOException e) { }
            try {
                if (a.out != null) {
                    a.out.close();
                }
            } catch (IOException e) { }
            log("Fechando arquivo", a.nomeArquivo);
        } else {
            log("Arquivo nao esta aberto.", "");
        }
    }

    public static String[] separaTokens(String linha, String separador) {
        StringTokenizer s = new StringTokenizer(linha, separador);
        String[] tokens = new String[s.countTokens()];
        for (int i = 0; s.hasMoreTokens(); i++) {
            tokens[i] = s.nextToken();
        }
        return tokens;
    }

    public static void renomear(String nomeArquivo1, String nomeArquivo2) {
        File f1 = new File(nomeArquivo1);
        if (f1.exists()) {
            File f2 = new File(nomeArquivo2);
            f1.renameTo(f2);
            log("Renomeando arquivo", nomeArquivo1);
        } else {
            log("Arquivo nao existe.", nomeArquivo1);
        }
    }

    public static void apagar(String nomeArquivo) {
        File f = new File(nomeArquivo);
        if (f.exists()) {
            f.delete();
            log("Apagando arquivo.", nomeArquivo);
        }

    }

    private static void log(String texto, String nomeArquivo) {
        //System.out.println("log - " + nomeArquivo + " - " + texto);
    }
}
