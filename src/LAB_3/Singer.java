package LAB_3;

public class Singer {
    String name;
    String gender;
    String nationality;
    Date debutYear;

    public Singer(String name, String gender, String nationality, Date debutYear) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(Date debutYear) {
        this.debutYear = debutYear;
    }


    public String toString() {
        return String.format("Name: %s\n Gender: %s\n Nationality: %s\n Debut_Year: %s\n", name, gender, nationality, debutYear);
    }
}
