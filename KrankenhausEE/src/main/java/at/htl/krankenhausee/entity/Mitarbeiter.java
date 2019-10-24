package at.htl.krankenhausee.entity;

import javax.persistence.*;

@Entity
@Table(name="MIT_MITARBEITER")
@NamedQueries(
     @NamedQuery(
             name = "Mitarbeiter.findall",
             query = "select m from Mitarbeiter m"
     )
)
public class Mitarbeiter {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vname;
    private String nname;
    private int alter;

    public Mitarbeiter(String vname, String nname, int alter) {
        this.vname = vname;
        this.nname = nname;
        this.alter = alter;
    }

    public Mitarbeiter() {
    }

    public Long getId() {
        return id;
    }

    /*public void setId(Long id) {
        this.id = id;
    }*/

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

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
