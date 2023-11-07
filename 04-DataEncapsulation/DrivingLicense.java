import java.time.Year;

public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    
    public DrivingLicense(String name, String surname, String address, String postCode, String city,
            String licenseNumber, int yearOfIssue, String licenseCategory) {
        this.setName(name);
        this.setSurname(surname);
        this.setAddress(address);
        this.setPostCode(postCode);;
        this.setCity(city);
        this.setLicenseNumber(licenseNumber);;
        this.setYearOfIssue(yearOfIssue);;
        this.setLicenseCategory(licenseCategory);;
    }


    public void display() {
        System.out.println( "DrivingLicense [name=" + getName() + ", surname=" + getSurname() + ", address=" + getAddress() + ", postCode="
                + getPostCode() + ", city=" + getCity() + ", licenseNumber=" + getLicenseNumber() + ", yearOfIssue=" + getYearOfIssue()
                + ", licenseCategory=" + getLicenseCategory() + "]");
    }
    @Override
    public String toString() {
        return "DrivingLicense [name=" + name + ", surname=" + surname + ", address=" + address + ", postCode="
                + postCode + ", city=" + city + ", licenseNumber=" + licenseNumber + ", yearOfIssue=" + yearOfIssue
                + ", licenseCategory=" + licenseCategory + "]";
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getPostCode() {
        return postCode;
    }
    public String getCity() {
        return city;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getLicenseCategory() {
        return licenseCategory;
    }
    public void setName(String name) {
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue>=1980 && yearOfIssue<=Year.now().getValue()){
            this.yearOfIssue = yearOfIssue;
        }
    }
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }
}
