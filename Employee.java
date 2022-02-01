
public class Employee {
   private final String firstName;                              
   private final String lastName;                               
   private final String socialSecurityNumber;  //basic info that all employee classes will use
   
    public Employee(String firstName, String lastName, String socialSecurityNumber){
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;  //actually assigning the base info
    }
          
    public String getFirstName()
   {
      return firstName;
   }
 
   // return last name
   public String getLastName()
   {
      return lastName;
   }
 
   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // getters so I can make the above variables private while still changing them later
   @Override
   public String toString()
   {
      return String.format("%s: %s %s%n%s:", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber());
    }
}
