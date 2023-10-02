package javaPatikasi;
import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
	    
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kilonuzu Girin:");
		float kilo = input.nextFloat();
		System.out.print("Boyunuzu Girin(metre cinsinden):");
		float boy=input.nextFloat();
		
		float vki= kilo/(boy*boy);
		System.out.println("Vücut Kitle İndeksiniz"+vki);
	}

}
