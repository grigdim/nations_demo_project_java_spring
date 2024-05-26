package grigdim.nationsDemo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vips")
public class Vip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vip_id", unique = true, nullable = false)
    private int vipId;

    @Column(name = "name", unique = true, nullable = false)
    private String vipName;

    public Vip() {
    }

    public Vip(int vipId, String vipName) {
        this.vipId = vipId;
        this.vipName = vipName;
    }

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }
}
