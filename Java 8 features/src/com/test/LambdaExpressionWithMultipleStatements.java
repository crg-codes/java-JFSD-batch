package com.test;

@FunctionalInterface
interface IAverage
{
	double avg(int array[]);
}
public class LambdaExpressionWithMultipleStatements {

	public static void main(String[] args) {
		
		IAverage average=(withLambdaArray) -> {

			double sum=0;
			int arraySize=withLambdaArray.length;
			
			System.out.println(arraySize);
			
			for(int i=0;i<arraySize;i++)
			{
				sum+=withLambdaArray[i];
			}
			
			System.out.println(sum);
			
			return (sum/arraySize);
	};
	
	int array[]= {1,2,3,4,5,6,7};
	System.out.println(average.avg(array));

	}	
}
