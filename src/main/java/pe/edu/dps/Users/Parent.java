package pe.edu.dps.Users;

<<<<<<< HEAD
import
public class Parent
{
    private int dni;
    private String celNumber;

=======
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
>>>>>>> 2297912c9ad41b2be42b3677852c3b8bf04473e4
}
