public class Book {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int phoneNum;
    private int zip;

    public Book(String firstName, String lastName, String address, String email, int phoneNum, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNum = phoneNum;
        this.zip = zip;

    }

    public Book() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Book{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address= '" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email+'" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", zip=" + zip + '\'' +
                '}';
    }

}
