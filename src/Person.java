package src;

public class Person {

    // Propriétés publiques
    public String firstName;
    public String lastName;

    // Propriétés privées
    private int age;
    private String address;

    // Constructeur
    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // Méthode publique pour obtenir l'âge
    public int getAge() {
        return age;
    }

    // Méthode publique pour définir l'âge
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    // Méthode publique pour obtenir l'adresse
    public String getAddress() {
        return address;
    }

    // Méthode publique pour définir l'adresse
    public void setAddress(String address) {
        this.address = address;
    }

    // Méthode publique pour afficher les informations complètes de la personne
    public void displayPersonInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Méthode publique pour obtenir le nom complet
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        // Création d'un objet Person
        Person person = new Person("John", "Doe", 30, "123 Main St");

        // Utilisation des méthodes pour accéder et modifier les propriétés privées
        person.setAge(35);
        person.setAddress("456 Elm St");

        // Affichage des informations complètes de la personne
        person.displayPersonInfo();

        // Affichage du nom complet
        System.out.println("Full Name: " + person.getFullName());
    }
}

