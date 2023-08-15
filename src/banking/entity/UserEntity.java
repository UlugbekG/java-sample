package banking.entity;

public class UserEntity {
    private String id;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String address;
    private boolean isSingle;

    private

    public UserEntity(String id, String firstname, String lastname, String phoneNumber, String address, boolean isSingle) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isSingle = isSingle;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User {" + firstname + ", "
                + lastname + ", "
                + phoneNumber + ", "
                + address + ". }";
    }
}