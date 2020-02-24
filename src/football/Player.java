package football;


public class Player extends Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String position;

    public Player(String id, String name, String firstName, String lastName, String dateOfBirth, String nationality, String position) {
        super(firstName,lastName,2019 - Integer.parseInt(dateOfBirth.substring(0,4)),nationality);
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    public void update(){
        age = 2019 - Integer.parseInt(dateOfBirth.substring(0,4));
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nNationality: " + this.nationality + "\nPosition: " + this.position;
    }
    public void showInfo(){
        System.out.println("Name: " + firstName);

        System.out.println("Age: " + Integer.toString(age)); //Doesnt work, dont know why.
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Nationality: " + nationality);
        System.out.println("Position: " + position);
    }
}
