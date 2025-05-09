public class Player {
    private String name;
    private String surname;
    private String nationalCode;
    private String dateOfBirth;
    private String position;

    public Player(String name, String surname, String nationalCode, String dateOfBirth, String position) {
        this.name = name;
        this.surname = surname;
        this.nationalCode = nationalCode;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
