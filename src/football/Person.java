package football;

public class Person {
    protected final String firstName;
    protected final String lastName;
    protected int age;
    protected final String nationality;

    public Person(String firstName, String lastName, int age, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        if(age > -1 && age < 130) this.age = age;
        else {
            System.out.println("Wrong Age");
            this.age = -1;

        }
    }

    public boolean equals(Object other){
        if (other == this) { return true; }
        if (other == null) { return false; }
        if (other.getClass() != this.getClass()) { return false; }
        Person that = (Person)other;
        return (this.firstName.equals(that.firstName)) &&
                (this.lastName.equals(that.lastName)) && (this.age == that.age);
    }

    public char getFirstLetterFName(){
        return firstName.charAt(0);
    }

    public char getFirstLetterLName(){
        return lastName.charAt(0);
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}