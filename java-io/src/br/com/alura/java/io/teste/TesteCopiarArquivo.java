package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		Socket s =  new Socket();
							//rede        		//console		//arquivo
		InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("lorem.txt")
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = s.getOutputStream(); //System.out;//new FileOutputStream("lorem2.txt"); com o file escreve e sai no lorem 2
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		String linha = br.readLine();
			//não deve ser null				//linha não deve ser vazia
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();

		}

		br.close();
		bw.close();
	}
}