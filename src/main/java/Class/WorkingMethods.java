package Class;

import Interface.DAO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WorkingMethods implements Interface.WorkingMethods {
    private String firstName;
    private String lastName;
    private int phone;
    private String model;
    private String version;
    private int repairCode;
    private String time;
    private int price;

    WorkingMethods(String firstnameField, String lastnameField, int phone_numberField, String modelField,
                   String versionField, int repair_codeField, String timeField, int priceField){
        this.firstName = firstnameField;
        this.lastName = lastnameField;
        this.phone = phone_numberField;
        this.model = modelField;
        this.version = versionField;
        this.repairCode = repair_codeField;
        this.time = timeField;
        this.price = priceField;
    }
    public void create(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Client, Integer> dao = new DAOMechanism(factory);

            Client client = new Client();
            client.setFirstname(firstName);
            client.setLastname(lastName);
            client.setPhoneNumber(phone);
            Device device = new Device();
            device.setModel(model);
            device.setVersion(version);
            device.setRepairCode(repairCode);
            device.setTime(time);
            device.setPrice(price);
            client.setModelByModelId(device);
            dao.create(client);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    };
    public void delete(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Client, Integer> dao = new DAOMechanism(factory);

            Client client = new Client();
            client.setFirstname(firstName);
            client.setLastname(lastName);
            client.setPhoneNumber(phone);
            Device device = new Device();
            device.setModel(model);
            device.setVersion(version);
            device.setRepairCode(repairCode);
            device.setTime(time);
            device.setPrice(price);
            client.setModelByModelId(device);
            dao.delete(client);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    };
    public void update(){
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Client, Integer> dao = new DAOMechanism(factory);

            Client client = new Client();
            client.setFirstname(firstName);
            client.setLastname(lastName);
            client.setPhoneNumber(phone);
            Device device = new Device();
            device.setModel(model);
            device.setVersion(version);
            device.setRepairCode(repairCode);
            device.setTime(time);
            device.setPrice(price);
            client.setModelByModelId(device);
            dao.update(client);

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    };
}
