package pe.edu.dps.Users;

import pe.edu.dps.Sessions.Schedule;
import pe.edu.dps.Sessions.Session;
import pe.edu.dps.Users.ElementTherapist.AmountPayment;
import pe.edu.dps.Users.ElementTherapist.BachelorDegree;
import pe.edu.dps.Users.ElementTherapist.Qualification;
import pe.edu.dps.Chats.Inbox;

import java.util.List;

public class Therapist extends Person {
    private BachelorDegree degree;
    private List<Patient> patients;
    private List<Schedule> scheduleAvalible;
    private List<Session> sessions;
    private Inbox inbox;
    private AmountPayment payment;

    public void addSchedule(){

    }
}
