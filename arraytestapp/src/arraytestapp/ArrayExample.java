package arraytestapp;

public class ArrayExample {

	public static void main(String[] args) {
		
		//static initialization
		int arr[]= {10,20,30,40};
		int length=arr.length;
		
		System.out.println(length);
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		
		String strArr[]= {"we","love","Java"};
		length=strArr.length;
		
		System.out.println(length);
		
		for(int i=0;i<strArr.length;i++)
		{
			
			System.out.println(strArr[i]);
		}
		
		
		for(String s:strArr)
		{
			System.out.println(s);
		}
		

	}

}
