package br.univille.algoritmocomplexidade;

import java.io.IOException;
import java.util.Random;

public class Main {
	
	
	public static void main(String[] args) {
		
		try{
			GenerateCSV genCSV = new GenerateCSV();

			genCSV.populateCSV("1-ASC;");
			genCSV.populateCSV("2-ASC;");
			genCSV.populateCSV("2-DESC;");
			genCSV.populateCSV("2-RDM;");
			genCSV.populateCSV("3-ASC;");
			genCSV.populateCSV("\n");
			
			for (int n = 1; n <= 100; n++){
				int[] ascVector   	= new int[n];
				int[] descVector 	= new int[n];
				int[] randomVector	= new int[n];

				ascVector(ascVector);
				descVector(descVector);
				randomVector(randomVector);
				
				AlgMinMax alg = new AlgMinMax();
								
				genCSV.populateCSV(alg.minMax1(ascVector) + ";");
				genCSV.populateCSV(alg.minMax2(ascVector) + ";");
				genCSV.populateCSV(alg.minMax2(descVector) + ";");
				genCSV.populateCSV(alg.minMax2(randomVector) + ";");
				genCSV.populateCSV(alg.minMax3(ascVector) 	+ ";");
				genCSV.populateCSV("\n");
			}
			genCSV.saveCSV();
		}catch(IOException e){
			System.out.println(e);
		}
	}

	private static int[] ascVector (int[] valor)  {
		
		for (int i = 0; i < valor.length; i++){
			valor[i] = i;
		}
		return valor;
	}
	
	private static int[] descVector (int[] valor)  {
		int gol = 99;
		for (int i = 0; i < valor.length; i++){
			valor[i] = gol - i;
		}
		return valor;
	}
	
	private static int[] randomVector (int[] valor)  {
		
		for (int i = 0; i < valor.length; i++){
			Random aleatorio = new Random();
			valor[i] = aleatorio.nextInt(100);
		}
		return valor;
	}
	
}