package pe.edu.dps.Sessions;

import pe.edu.dps.Sessions.Session;

import java.util.List;

public class ListSession {
    private List<Session> sessionsF;
    private List<Session> sessionsR;
    private int amount;

    public void addSessionMiss(Session session){

    }
    public void addSessionDone(Session session){

    }
    public Session getSessionF(int id){
        return sessionsF.get(id);
    }
    public Session getSessionR(int id){
        return sessionsR.get(id);
    }

    public List<Session> getSessionsF() {
        return sessionsF;
    }

    public void setSessionsF(List<Session> sessionsF) {
        this.sessionsF = sessionsF;
    }

    public List<Session> getSessionsR() {
        return sessionsR;
    }

    public void setSessionsR(List<Session> sessionsR) {
        this.sessionsR = sessionsR;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
