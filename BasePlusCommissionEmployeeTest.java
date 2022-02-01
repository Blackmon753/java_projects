public class BasePlusCommissionEmployeeTest
{
   public static void main(String[] args) 
   {
     // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee2 = 
         new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
       
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee2.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee2.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee2.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee2.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee2.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee2.getBaseSalary());
 
      employee2.setBaseSalary(1000); 
       
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee2.toString());
   } 
} 