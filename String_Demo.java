package my_fr_mr_prj;

public class String_Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String line="Hadoop is a open source framwork,Hadoop"
				+ " is good framework for handling big data";
		
	
		String newLine=line.replace(",", " ");
		String lines[]=newLine.split(" ");
		int i=0;
		int count=0;
		String [] strArray=new String[lines.length];
	
	
		while (i<lines.length){
			strArray[i]=lines[i];
		//	System.out.println(lines[i]);
			if(lines[i].equals("Hadoop"))
				count++;
			i++;
		}
         System.out.println("Hadoop word Occured in a string "+count+" times.");
         for(int j=0;j<strArray.length;j++){
        	 System.out.print(strArray[j]+" ");
        	 
         }
		
	}

}
