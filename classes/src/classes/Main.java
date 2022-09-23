package classes;

public class Main {

	public static void main(String[] args) {
		//classlar gruplama yapmaya yararlar.
		CustomerManager customerManager= new CustomerManager(); //classlar referans tiptir. 
		CustomerManager customerManager2= new CustomerManager ();
		customerManager = customerManager2;
		customerManager2.Add();
		customerManager2.Remove();
		customerManager2.Update();
		//diziler referans tiptir integer olmasının ya da başka bir şey önemi yoktur.
		
		//value 
		int sayı1 = 10;
		int sayı2 = 20;
		sayı2 = sayı1;
		sayı1 = 30;
		System.out.println(sayı2);
		
		int[] sayılar1 = new int [] {1,2,3};
		int[] sayılar2 = new int [] {4,5,6};
		sayılar2 = sayılar1;
		sayılar1[0] = 10;
		System.out.println(sayılar2[0]);

	}

}


	


