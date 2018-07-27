package br.univille.algoritmocomplexidade;

public class AlgMinMax {

	public int minMax1(int vector[]) {
		int max = vector[0];
		int min = vector[0];
		int operation = 0;
		
		for( int i = 0; i < (vector.length); i++ ) {
			operation += 1;
			if (vector[i] > max){
				operation +=1;
				max = vector[i] ;
			} 
			operation += 1;
			if ( vector[i] < min){
				operation += 1;
				min = vector[i];
			}
		}
		return operation;
	}

	public int minMax2(int vector[]) {
		int max = vector[0];
		int min = vector[0];
		int operation = 0;
		
		for(int i = 0; i < (vector.length) ; i++ ){
			
			operation++;
			if (vector[i] > max){
				operation++;
				max = vector[i] ;
			} else {
				operation++;
				if ( vector[i] < min){
					operation++;
					min = vector[i];
				}
			}
		}
		
		return operation;
	}
	

	public int minMax3(int vector[]) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int operation = 0;
		int vectorLength = vector.length;
		int x, i, y;
		
		if((vectorLength % 2) == 1)
			vectorLength--;
		
		for( i = 0; i < vectorLength; i+=2 ){
			
			operation++;
			if (i == vector.length) {
				operation++;
				i = i - 1;
			}

			operation++;
			if (vector[i] < vector[i+1]) {
				operation++;
				x = i; y = i + 1;
			} else {
				operation++;
				x = i + 1; y = i;
			}

			operation++;
			if (vector[x] < min) {
				operation++;
				min = vector[x];
			}

			operation++;
			if (vector[y] > max) {
				operation++;
				max = vector[y];
			}
		}
		return operation;
	}
}
