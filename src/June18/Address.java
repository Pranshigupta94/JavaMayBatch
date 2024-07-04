package June18;

public class Address {
    String Street;
    String city;
    String province;
    String postalCode;


    public Address(String street, String city, String province, String postalCode) {
        Street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
