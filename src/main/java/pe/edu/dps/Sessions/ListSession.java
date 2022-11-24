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
}
