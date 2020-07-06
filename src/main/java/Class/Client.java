package Class;

public class Client implements Interface.Client {
    private String firstname;
    private String lastname;
    private int phoneNumber;
    private Device modelByModelId;

    public Device getModelByModelId() {
        return modelByModelId;
    }
    public void setModelByModelId(Device modelByModelId) {
        this.modelByModelId = modelByModelId;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
