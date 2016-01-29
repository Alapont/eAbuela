package main;

import java.util.Scanner;

public class Matame {
	public static void main(String[] args){
		Vault v=new Vault();
		Scanner s=new Scanner(System.in);
		String in="";
		while (!in.equals("calla zalamero")||in.equals("oiis")){
				System.out.print(v.getMessage()+" ");
				in=s.nextLine();
		}
		s.close();
	}
}
