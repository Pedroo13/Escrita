package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("Lorem2.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		
		PrintStream ps = new PrintStream(new File("Lorem2.txt"));
		//bw.write("mano na moral mesmo so queria tomar um monster");
		//fw.write("\r\n"); //caracter especial pula linha
		//bw.write(System.lineSeparator()); //mesma coisa "separador de linha"
		//bw.newLine();
		//bw.write("alguem compra um celular novo pra mim");
		PrintWriter pw =  new PrintWriter("Lorem2.txt");

		ps.println("mano na moral mesmo so queria tomar um monster");
		ps.println();
		ps.println();
		ps.println("alguem compra um celular novo pra mim");

		ps.close();
	}
}