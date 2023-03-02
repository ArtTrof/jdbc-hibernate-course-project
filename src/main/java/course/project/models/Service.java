package course.project.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="service_name")
    private String serviceName;
    @Column(name="is_active")
    private boolean isActive;
    @Column(name="service_month_price")
    private long  serviceMonthPrice;
    @Column(name="customer_id")
    private int customerId;
    @ManyToMany(mappedBy = "services")
    private List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public long getServiceMonthPrice() {
        return serviceMonthPrice;
    }

    public void setServiceMonthPrice(long serviceMonthPrice) {
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
