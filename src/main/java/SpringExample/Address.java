package SpringExample;

public class Address {
    String city;
    String state;
    int zipcode;


    public Address(){

    }

    public Address(String city) {

        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "SpringExample.Address{" +
                "city='" + city + '\'' +
                ", State='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
