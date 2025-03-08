import java.util.*;
class Employee{
       int id;
	   String name;
	   double salary;
	   String address;
	   double phno;
	   Employee(int id, String name, double salary, String address, double phno){
	         
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.address = address;
			this. phno = phno;
		    }

}
class EmployeeDemo{
   public static void main(String args[]){
   Employee e[] = new Employee[15];
   Scanner sc = new Scanner(System.in);
   for(int i =0; i<e.length; i++) {
   System.out.println("Enter your id ");
   int id = sc.nextInt();
   sc.nextLine();
   System.out.println("Enter your name ");
   String name = sc.nextLine();
   System.out.println("Enter your salary");
   double salary = sc.nextDouble();
   sc.nextLine();
   System.out.println("Enter your address ");
   String address = sc.nextLine();
   
   System.out.println("Enter your phno");
   double phno = sc.nextDouble();
   
   e[i] = new Employee(id, name, salary, address, phno);
   }
   
   for(int i=0; i<e.length;i++){
     System.out.println(e[i].id);
	 System.out.println(e[i].name);
	 System.out.println(e[i].salary);
	 System.out.println(e[i].address);
	 System.out.println(e[i].phno);
   }
  }
}