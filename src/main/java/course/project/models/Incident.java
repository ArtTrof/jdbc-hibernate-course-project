package course.project.models;

import jakarta.persistence.*;

@Entity
@Table(name="incident")
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="service_name")
    private String serviceName;
    @Column(name="is_active")
    private boolean isActive;
    @Column(name="problem_description")
    private String problemDescription;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }
}
