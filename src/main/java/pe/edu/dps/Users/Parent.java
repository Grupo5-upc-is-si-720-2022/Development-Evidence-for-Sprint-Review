package pe.edu.dps.Users;

import pe.edu.dps.Users.ElementTherapist.Qualification;
import pe.edu.dps.Users.Patient;
import pe.edu.dps.Subscription.Subscription;
import java.util.List;

public class Parent extends Person {
    private int dni;
    private String celNumer;
    private List<Qualification> qualifiedTerapist;
    private List<Patient> tutored;
    private Subscription subscription;

    public void addTutored(Patient patient){

    }
}
