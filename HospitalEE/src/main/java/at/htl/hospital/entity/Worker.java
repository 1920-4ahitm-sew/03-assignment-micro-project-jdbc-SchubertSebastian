package at.htl.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name="WORK_WORKER")
@NamedQueries(
        @NamedQuery(
                name = "Worker.findall",
                query = "select w from Worker w"

        )
)
public class Worker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vname;
    private String nname;
    private int age;

    public Worker(String vname, String nname, int age) {
        this.vname = vname;
        this.nname = nname;
        this.age = age;
    }

    public Worker() {
    }

    public Long getId() {
        return id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "vname='" + vname + '\'' +
                ", nname='" + nname + '\'' +
                ", age=" + age +
                '}';
    }
}
