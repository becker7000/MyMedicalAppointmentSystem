package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributos:
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email) {
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailableAppointments(ArrayList<AvailableAppointment> availableAppointments) {
        this.availableAppointments = availableAppointments;
    }

    //Comportamiento:
    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tmodel.Doctor{" +
                "speciality='" + speciality + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("\n\t Hospital: La raza"+
                            "\n\t Departamento: Cardiología");
    }

    //Clases anidadas:
    public static class AvailableAppointment{

        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\n\tAvailableAppointment{" +
                    "date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }

    }

}
