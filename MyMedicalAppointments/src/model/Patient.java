package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    //Atributos:
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses =new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    //Getters and setters
    public void setWeight(double weight){
        this.weight=weight;
    }

    public String getWeight(){
        return this.weight+" kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return height + " m.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tmodel.Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("\n\t Zona: CDMX"+
                            "\n\t Antiguedad: 2014");
    }
}
