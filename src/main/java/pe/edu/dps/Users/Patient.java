package pe.edu.dps.Users;

import pe.edu.dps.Sessions.ListSession;
import pe.edu.dps.Exercise.ListExercise;
import pe.edu.dps.Sessions.Schedule;
import pe.edu.dps.Users.ElementPatient.Performance;

public class Patient extends Person{
    private ListSession sessions;
    private Performance performance;
    private ListExercise activities;

    public void addSession(Schedule schedule, Therapist therapist){

    }
    public void updatePerformace(){

    }

    public ListSession getSessions() {
        return sessions;
    }

    public void setSessions(ListSession sessions) {
        this.sessions = sessions;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public ListExercise getActivities() {
        return activities;
    }

    public void setActivities(ListExercise activities) {
        this.activities = activities;
    }
}
