package br.com;

import java.io.*;

public class Atv4 {

    public static void main(String[] args) {
        int lineCount = 0;
        try {
            FileReader fileReader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
                lineCount++;
            }

            bufferedReader.close();

            System.out.println("Numero de linhas é igual a: " + lineCount);

            // FileWriter fileWriter = new FileWriter("meuarquivo.txt");
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // bufferedWriter.newLine();
            //bufferedWriter.write("Adicionando texto ao arquivo 'meuarquivo.txt'");

            //bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}