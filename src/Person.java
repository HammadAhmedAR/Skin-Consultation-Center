abstract public class Person {
    private String name;
    private String surname;
    private int dateOfBirth;
    private Long MobNo;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getMobNo() {
        return MobNo;
    }

    public void setMobNo(Long mobNo) {
        MobNo = mobNo;
    }
}
