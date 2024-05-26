package grigdim.nationsDemo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id", unique = true, nullable = false)
    private int guestId;

    @Column(name = "name", unique = true, nullable = false)
    private String guestName;

    public Guest() {
    }

    public Guest(int guestId, String guestName) {
        this.guestId = guestId;
        this.guestName = guestName;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
