public class Human {
    String name;

    String town;

    int yearOfBirth;

    String jobTitle;

    Human(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    Human(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString(){
        return name + town + yearOfBirth + jobTitle;
    }

}
