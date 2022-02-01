
public class CommissionEmployeeTest {
 public static void main(String[] args) 
   {
      CommissionEmployee employee1 = new CommissionEmployee(
         "Sue", "Jones", "222-22-2222", 10000, .06);     
       
      // get commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee1.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee1.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee1.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee1.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee1.getCommissionRate());
 
      employee1.setGrossSales(5000); 
      employee1.setCommissionRate(.1); 
       
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee1);
    }
}