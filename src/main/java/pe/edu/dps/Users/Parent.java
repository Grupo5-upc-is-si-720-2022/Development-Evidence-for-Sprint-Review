package pe.edu.dps.Users;

import pe.edu.dps.Users.ElementTherapist.Qualification;
import java.util.List;

public class Parent extends Person {
    private int dni;
    private String celNumer;
    private List<Qualification> qualifiedTerapist;
    private List<Patient> tutored;
}
