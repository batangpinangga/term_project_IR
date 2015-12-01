package analysis;



public class TermWeight {
	
	public static double deltaTfIdf(String word, String[] docsWords,double dfPlus,double dfMinus){
		double tf=getTf(word,docsWords);
		double delta=Math.log((dfPlus+1)/(dfMinus+1)) / Math.log(2);
		return tf*delta ;
	}
	
	public static double BM25 (String word, String[] docsWords,int numDocsContainingWord,int numDocuments,int averageLength){
		double k1=1.20;
		double b=0.75;
		double L=docsWords.length;
		double first=((numDocuments-numDocsContainingWord+0.5)/(numDocsContainingWord+0.5));
		double second=((k1+1)*(getTf(word,docsWords)))/(k1*((1-b)+b*L/averageLength)+(getTf(word,docsWords)));
		return Math.log(first*second);
	}
	
	
	public static double getWordTfidf(String word, String[] docsWords, int numDocsContainingWord,int numDocuments) {
		double tf=getTf(word, docsWords);
		double idf=getIdf(numDocuments,numDocsContainingWord);
		
		return tf*idf;
		
	}
	
 

	public static double getIdf(int numDocuments,int numDocsContainingWord) {
		
		
		return Math.log(((numDocuments*1.0)/numDocsContainingWord));
	}


	public static double getTf(String word, String[] docsWords) {
		//number of occurences of this word in document
		int termFreqency=0;
		for(int i=0;i<docsWords.length;i++){
			if (word==docsWords[i]){
				termFreqency++;
			}
		}
		return Math.log(1+(termFreqency/(double)docsWords.length));
	}
	
	
}
