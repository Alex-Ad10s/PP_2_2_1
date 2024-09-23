package hiber.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import java.io.Serializable;


@Entity
@Table(name = "cars")
public class Car implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @MapsId
    @OneToOne(mappedBy = "car", fetch = FetchType.LAZY)
    private User user;

    public Car() {
    }

    public Car(String model, int series, User user) {
        this.model = model;
        this.series = series;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long carId) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
