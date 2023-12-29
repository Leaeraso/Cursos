package domain;

import java.util.Date;

public class Client extends Person{
    private int clientID;
    private Date registrationDate;
    private boolean vip;
    private static int clientCounter;

    public Client(Date registrationDate, boolean vip, String name, char gender, int age, String adress) {
        super(name, gender, age, adress);
        this.registrationDate = registrationDate;
        this.vip = vip;
        this.clientID = ++Client.clientCounter;
    }
    
    public int getClientID(){
        return this.clientID;
    }    
    
    public Date getRegistrationDate(){
        return this.registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate){
        this.registrationDate = registrationDate;
    }
    
    public boolean isVip(){
        return this.vip;
    }
    
    public void set(boolean vip){
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("clientID=").append(clientID);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
