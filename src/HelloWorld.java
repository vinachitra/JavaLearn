import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String name = "Chitra";
		int age = 37;
		System.out.println(name+ " "+age +" yasinda");
				
		String name2;
		name2 = "Revina Chitra Sagita";
		
		int age2 = 37;
		String address = "Indonesia";
		
		System.out.println(name2 + " " + age2 + " " + address);
		
//		final String name3 = "SEZER";
//		var age3 = 29;
//		var address3 = "Istanbul";
//		
//		name3 = "Chitra"; // error
		
		// Kode Array
		
		String[] arrayString;
		arrayString = new String [4];
		
		arrayString [0] = "Revina";
		arrayString [1] = "Chitra";
		arrayString [2] = "Sagita";
		arrayString [3] = "Female";
		
		System.out.println(arrayString [0]);
		System.out.println(arrayString [1]);
		System.out.println(arrayString [2]);
		System.out.println(arrayString [3]);
		
		String[] Namaku = {
				"Revina" , "Chitra" , "Sagita"
		};
		
		int[] arrayInt = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8
		};
		
		long[] arrayLong = {
				2L, 4L, 6L, 8L, 10L, 12L, 14L, 16L
		};
		
		 System.out.println(arrayLong.length);
		 
		// Kode Array di dalam Array
		 
		String [][] members = {
				{"Revina", "Chitra", "Sagita"},
				{"Sezer", "Furkan", "Kirpitci"},
				{"Onur", "Taylan"},
		};
		
		String[] member1 = members [0]; // jika hanya 1 kurung, berarti mengakses data keseluruhan
		System.out.println(member1 [0]);
		
		System.out.println(members[1][0]); // jika ingin mengambil data di dalam dgn menggunakan 2 kurung
		System.out.println(members[2][1]);
		
		// Operasi Perbandingan
		
		int value1 = 343;
		int value2 = 343;
		
		System.out.println(value1 > value2);
		System.out.println(value1 < value2);
		System.out.println(value1 >= value2);
		System.out.println(value1 <= value2);
		System.out.println(value1 == value2);
		System.out.println(value1 != value2);
		
		// Kode Operasi Boolean
		
		var absen = 70;
		var nilaiAkhir = 80;
		
		boolean lulusAbsen = absen >= 75;
		boolean lulusNilaiAkhir = nilaiAkhir >= 75;
		
		var lulus = lulusAbsen && lulusNilaiAkhir;
		System.out.println(lulus);
		
		// Kode Statement
		
		// Assignment Statement
		double aValue = 78649.3;
		
		// Increment Statement
		aValue++;
		
		// Method invocation Statement
		System.out.println("Hello World!");
		
		// Object Creation Statemnet
//		Date date = new Date (); // Pembuatan object baru
		
		// Kode if Statement
		
		var nilai = 65;
		var absen1 = 85;
		
		if (nilai >= 75 && absen1 >= 75) {
			System.out.println(" Selamat Anda Lulus");
		} else {
			System.out.println("Maaf Anda Gagal");
		}
		
		// Kode else if Statement
		
		int nilaiUjian = 0;
		int nilaiAbsen = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Nilai Ujian = ");
		nilaiUjian = scan.nextInt();
		
		System.out.print("Nilai Absen = ");
		nilaiAbsen = scan.nextInt();
		
		if (nilaiUjian >= 80 && nilaiAbsen >= 80) {
			System.out.println("Nilai Anda A");
			
		} else if (nilaiUjian >= 65 && nilaiAbsen >= 65) {
			System.out.println("Nilai Anda B");
			
		} else if (nilaiUjian >= 50 && nilaiAbsen >= 50) {
			System.out.println("Nilai Anda C");
			
		} else if (nilaiUjian >= 35 && nilaiAbsen >= 35) {
			System.out.println("Nilai Anda D");
			
		} else {
			System.out.println("Nilai Anda E");
			
		}
	}
}
