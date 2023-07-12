public class KonversiNumber {
	
	 public static void main(String[] args) {
		 
		 byte iniByte = 10;
		 short iniShort = iniByte;
		 int iniInt = iniShort;
		 long iniLong = iniInt;
		 float iniFloat = iniLong;
		 double iniDouble = iniFloat;
		 
		 float iniFloat2 = (float) iniDouble;
		 long iniLong2 = (long) iniFloat2;
		 int iniInt2 = (int) iniLong2;
		 short iniShort2 = (short) iniInt2;
		 
		 
		 char s = 'S';
		 char e = 'E';
		 char z = 'Z';
		 char r = 'R';
		 
		 System.out.print(s);
		 System.out.print(e);
		 System.out.print(z);
		 System.out.print(e);
		 System.out.println(r);
		 
		 String firstname = "Sezer";
		 String middlename = "Furkan";
		 String lastname = "Kirpitci";
		 
		 String fullname = firstname + " " + middlename + " " + lastname;
		 
		 System.out.println(firstname + " " + middlename + " " + lastname);
		 System.out.println(fullname);
		 
		 var name = "Revina Chitra Sagita";
		 var age = 37;
		 var address = "Padang";
		 
		 System.out.println(name + " " + age + " " + address);
		 
		 boolean benar = true;
		 boolean salah = false;
		 
		 System.out.println(benar);
		 System.out.println(salah);
		 
		 // Augmented Assignments
		 
		 int c = 789;
		 
		 c += 10;
		 System.out.println(c);
		 
		 c -= 15;
		 System.out.println(c);
		 
		 c *= 10;
		 System.out.println(c);
		 
		 // Kode Unary Operator
		 
		 int a = +100;
		 int b = - 45;
		 
		 b++;
		 System.out.println(b);

		 a++;
		 System.out.println(a);
		 
		 a--;
		 System.out.println(a);
		 
		 System.out.println(!true);
	}

}
