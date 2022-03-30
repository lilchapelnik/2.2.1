package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "model")
    private String model;
    @Column (name = "series")
    private int series;
    public Car (){}
    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }
    public String getModel (){ return model;}
    public String setModel () {return this.model;}
    public int getSeries () { return series;}
    public int setSeries() {return series;}
    }

