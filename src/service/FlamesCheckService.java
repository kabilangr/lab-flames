package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		name1=name1.trim();
		name2=name2.trim();
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		String name1_split[]=name1.split(" ");
		String name2_split[]=name2.split(" ");
		name1="";
		name2="";
		for(int i=0;i<name1_split.length;i++) {
			name1=name1+name1_split[i];
		}
		for(int i=0;i<name2_split.length;i++) {
			name2=name2+name2_split[i];
		}
		int length=name1.length()+name2.length();
		boolean name_ch[]=new boolean[name2.length()];
		for(int i=0;i<name2.length();i++)
		{
			name_ch[i]=false;
		}
		for(int i=0;i<name1.length();i++) {
			for(int j=0;j<name2.length();j++)
			{
				if((name_ch[j]==false)&&(name1.charAt(i)==name2.charAt(j))) {
					name_ch[j]=true;
					length=length-2;
					break;
				}
			}
		}
		boolean flames_ch[]=new boolean[6];
		for(int i=0;i<6;i++)
			flames_ch[i]=true;
		int count=6;
		int k=1,deleted_letter=0;
		int j;
		for(j=0;j<=count;j++) {
			if(k<=length) {
				if(j==count) {
					j=0;
				}
				if(flames_ch[j]==true) {
					k=k+1;
				}
			}
			if((k-1)==length) {
				deleted_letter=deleted_letter+1;
				flames_ch[j]=false;
				k=1;
			}
		}
		String str1="flames";
		for(int i=0;i<6;i++)
		{
			if(flames_ch[i]==true)
			{
				System.out.println(str1.charAt(i));
				return str1.charAt(i);
			}
		}
		return 0;
	}
}