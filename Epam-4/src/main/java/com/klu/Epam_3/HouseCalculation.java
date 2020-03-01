package com.klu.Epam_3;

import java.util.Scanner;

public class HouseCalculation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ms=sc.nextInt();
		int aoh=sc.nextInt();
		if(ms==1200)
		{
			StandardMaterials SM=new StandardMaterials(aoh);
		}
		else if(ms==1500)
		{
			AstandardMaterials Asm=new AstandardMaterials(aoh);
		}
		else if(ms==1800)
		{
			HstandardMaterials Hsm=new HstandardMaterials(aoh);
		}
		else if(ms==2500)
		{
			FHstandardMaterials FHsM=new FHstandardMaterials(aoh);
					
		}
			
		
	}

}
