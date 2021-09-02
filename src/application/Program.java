package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("tax payer #"+i+"data");
			System.out.print("individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("anual income: ");
			double anualInc = sc.nextDouble();
			
			if(ch == 'i') {
			System.out.print("heath expenditures: ");
			double heathExp = sc.nextDouble();
			list.add(new Individual(name, anualInc, heathExp));
			}
			else if(ch == 'c') {
				System.out.print("numbers of employees: ");
				Integer empl= sc.nextInt();
				list.add(new Company(name, anualInc, empl));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0 ;
		for(TaxPayer taxp : list) {
			sum += taxp.tax();
			System.out.println(taxp.getName() +  ":$" + String.format("%.2f",taxp.tax()));
		}

	}

}
