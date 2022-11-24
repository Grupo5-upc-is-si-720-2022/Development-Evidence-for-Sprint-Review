package pe.edu.dps.Users;

import pe.edu.dps.Chats.Inbox;

public abstract class Person {
    private String name;
    private String lastName;
    private int age;
    private int uid;
    private String password;
    private Inbox messengerService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Inbox getMessengerService() {
        return messengerService;
    }

    public void setMessengerService(Inbox messengerService) {
        this.messengerService = messengerService;
    }
}
