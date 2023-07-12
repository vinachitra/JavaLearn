import java.util.Scanner;

public class TypeDataNumber {
	
	public static void main(String[] args) {
		
		byte iniByte = 100;
		short iniShort = 1000;
		int iniInt = 1000000;
		long iniLong = 10000000;
		long iniLong2 = 10_000_000L;
		
		float iniFloat = 10.12F;
		double iniDouble = 12.2424;
		
		int decimalInt = 24;   		// I defined a variable name of decimalInt
		int temp = 24;
		
		int hexInt = 0xA132B;
		int binInt = 0b01010101;
		
		System.out.println(iniLong2);
		
		//System.out.println(hexInt);
		//true  & false = false
		//true & true => true
		//false & false => false
		//
		//true || false => true
		//true || true => true
		//false || false => false
//		
//		int temp2 = 30%5; //=> 5x5 +2 = 27
//		
//		String a = "155" ;
//		a = a + ","+a;
//		System.out.println("a = " + a);
//		Scanner scan = new Scanner(System.in);
//		
////		System.out.print("Your age : ");
////		int age = scan.nextInt();
////		System.out.println("Your next age is " + (age+1));
//		System.out.print("Your number : ");
//		int number = scan.nextInt();
//		System.out.println("Number =  1,241,274,128");
//		// 234343000434 => 
//		int x = 0;
//		while(x<number) {
//			System.out.println("Sayi = " + x);
//			x = x+1;
//		}
//		
//		if(decimalInt == temp && temp > 28 ) { //&&=>and  || => or
//			System.out.println("Decimal Int is equal temp and temp bigger 28");
//		}
//		else if(decimalInt != temp && temp < 28) {
//			System.out.println("Decimal Int is not equal temp and temp lower 28");
//			
//		}
//		else if(decimalInt == temp && temp < 28) {
//			System.out.println("Decimal Int is equal temp and temp lower 28");
//			
//		}
//		else {	// another condition
//			System.out.println("I dont know what u write");
			
//		}
		
		// Kode Switch Statement
		
		var nilai3 = "E";
		switch (nilai3) {
			case "A":
				System.out.println("Anda Lulus dengan Baik");
				break;
			
			case "B":
			case "C":
				System.out.println("Anda Lulus");
				break;
			
			case "D":
				System.out.println("Anda Tidak Lulus");
				break;
				
			default:
				System.out.println("Pilih Jurusan Lain");
		}
		
		// Kode Switch Lambda
		
		var nilai4 = "A";
		
		switch (nilai4) {
		case "A" -> System.out.println("Wow Anda Lulus dengan Sangat Baik");
		case "B", "C" -> System.out.println("Anda Lulus");
		case "D" -> System.out.println("Anda Tidak Lulus");
		default -> {
			System.out.println("Anda Salah Pilih Jurusan");
		}
		}
		
		// Kode Switch Tanpa Yield
		
		var nilai5 = "D";
		String ucapan;
		
		switch (nilai5) {
		case "A" -> ucapan = "Wow Anda Lulus dengan Sangat Baik";
		case "B", "C" -> ucapan = "Anda Lulus";
		case "D" -> ucapan = "Anda Tidak Lulus";
		default -> ucapan = "Anda Salah Pilih Jurusan";
		}
		System.out.println(ucapan);
		
		// Kode Switch dengan Yield
		
		var nilai6 = "E";
		String ucapan2 = switch (nilai6) {
		case "A":
			yield "Wow Anda Lulus dengan Sangat Baik";
		case "B", "C":
			yield "Anda Lulus";
		case "D":
			yield "Anda Tidak Lulus";
		default:
			yield "Anda Salah Pilih Jurusan";
		};
		System.out.println(ucapan2);
		
		// Kode dengan Ternary Operator
		
		var nilai7 = 70;
		String ucapan3 = nilai7>= 75 ? "Selamat Anda Lulus" : "Silakan Coba Lagi";
		
		System.out.println(ucapan3);
		
		// For Loop : Kode Perulangan Tanpa Henti
		
//		for (;;) { // Kondisi akan selalu TRUE
//			System.out.println("Perulangan Tanpa Henti");
//		}
		
		// Kode Perulangan dengan Kondisi
		
		var counter = 1;
		
		for (; counter <=10; ) {
			System.out.println("Perulangan ke-" + counter);
			counter ++;
		}
		
		// Kode Perulangan dengan Init Statement
		
		for (var counter1 = 3; counter1 <= 13; ) {
			System.out.println("Perulangan ke-" + counter1);
			counter1 ++;
		}
		
		// Kode Perulangan dengan Post Statement
		
		for (var counter2 = 34; counter2 >= 20 ; counter2 --) {
			System.out.println("Perulangan ke-" + counter2);
		}
	
	}
}




