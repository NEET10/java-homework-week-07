package javaprogramsweek7;


    public class Program7_14_Person {
        String firstName;    String lastName;    int age;     //instance variables
        public static void main(String[] args) {
        Program7_14_Person person = new Program7_14_Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
    public String getFirstName() {              //with return with parameters methods &without parameters
        return firstName;
    }    // with returns no parameters
    public String getLastName() {
        return lastName;
    }       // with returns no parameters
    public int getAge() {
        return age;
    }                        // with returns no parameters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }   //no  returns with parameters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }        //no returns with parameters
    public void setAge(int age) {            //no returns with parameters
        if (age > 0 && age <= 100) {            // && operator use
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen() {                        // with returns no parameters
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }
    public String getFullName() {
        if (firstName.isEmpty()) {             //String is Empty() method
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }
}






