/*14. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods (instance methods):*/

package homeworkweek7;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person p = new Person();
        p.getFirstName();
        p.getLastName();
        p.getAge();
        p.setFirstName("James");
        p.setLastName("Bond");
        p.setAge(101);
        p.isTeen();
        p.getFullName();

        System.out.println("fullName=" + p.getFullName());
        System.out.println();
        System.out.println("teen=" + p.isTeen());

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String LastName) {


        lastName = LastName;
    }

    public void setAge(int age) {
        this.age = age;

    }


    public String getFirstName() {
        Person p = new Person();
        return firstName;
    }

    public String getLastName() {
        Person p = new Person();
        return lastName;
    }

    public void getAge() {
        Person p = new Person();
        if(age < 0 &&  age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }



    public boolean isTeen() {
        Person p = new Person();
        if (age > 12 && age < 20)
            return true;
        return false;


    }

    public String getFullName() {
        Person p = new Person();
        return (firstName + " " + lastName);

    }
}


