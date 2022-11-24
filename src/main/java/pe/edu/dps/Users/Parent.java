package pe.edu.dps.Users;
import pe.edu.dps.Users.ElementTherapist.Qualification;
import pe.edu.dps.Users.Patient;
import pe.edu.dps.Subscription.Subscription;
import pe.edu.dps.Chats.Inbox;
import java.util.List;

public class Parent extends Person {
    private int dni;
    private String celNumer;
    private Inbox inbox;
    private List<Qualification> qualifiedTerapist;
    private List<Patient> tutored;
    private Subscription subscription;

    public void addTutored(Patient patient) {

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCelNumer() {
        return celNumer;
    }

    public void setCelNumer(String celNumer) {
        this.celNumer = celNumer;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public List<Qualification> getQualifiedTerapist() {
        return qualifiedTerapist;
    }

    public void setQualifiedTerapist(List<Qualification> qualifiedTerapist) {
        this.qualifiedTerapist = qualifiedTerapist;
    }

    public List<Patient> getTutored() {
        return tutored;
    }

    public void setTutored(List<Patient> tutored) {
        this.tutored = tutored;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
