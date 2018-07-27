package br.univille.algoritmocomplexidade;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCSV {

	static FileWriter writer;
	
	public GenerateCSV() throws IOException {
		writer = new FileWriter("/algminmax.csv");
	}
	
	public void populateCSV(String value) throws IOException {
		writer.append(value);
	}
	
	public void saveCSV() throws IOException {
		writer.flush();
		writer.close();
		System.out.println("Arquivo CSV criado com Sucesso!");
	}
}
