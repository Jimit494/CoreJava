import java.util.Objects;

public class Address {
    private Integer id;
    private String streetName;
    private String city;
    private String state;
    private String zip;

    public Address(Integer id, String streetName, String city, String state, String zip) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getId(), address.getId()) &&
                Objects.equals(getStreetName(), address.getStreetName()) &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getState(), address.getState()) &&
                Objects.equals(getZip(), address.getZip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStreetName(), getCity(), getState(), getZip());
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
