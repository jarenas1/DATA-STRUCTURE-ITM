package objects;

public class Person {
    private String name;
    private String lastname;
    private String address;
    private Long phone;
    //we´re using Long because Int Type only accpets 7 characters as maxi


    public Person(String name, String lastname, String address, Long phone) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
