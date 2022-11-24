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
    public BachelorDegree getDegree() {
        return degree;
    }

    public void setDegree(BachelorDegree degree) {
        this.degree = degree;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Schedule> getScheduleAvalible() {
        return scheduleAvalible;
    }

    public void setScheduleAvalible(List<Schedule> scheduleAvalible) {
        this.scheduleAvalible = scheduleAvalible;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public Inbox getInbox() {
        return inbox;
    }

    public void setInbox(Inbox inbox) {
        this.inbox = inbox;
    }

    public AmountPayment getPayment() {
        return payment;
    }

    public void setPayment(AmountPayment payment) {
        this.payment = payment;
    }

}
