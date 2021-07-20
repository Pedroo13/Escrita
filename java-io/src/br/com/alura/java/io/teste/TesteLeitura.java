package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

        public static void main(String[] args) throws IOException {

                //Fluxo de Entrada com Arquivo
                FileInputStream fis = new FileInputStream("lorem.txt");
                //melhorando os dados binarios cara caracteres 
                //InputStream
                Reader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                //pegar todos os caracteres de uma linha
                String linha = br.readLine();
                				//leitura de linha por linha 
                while(linha != null) {
                    System.out.println(linha);
                    linha = br.readLine();

                }

                br.close();
                //finaliza a entrada
        }
}