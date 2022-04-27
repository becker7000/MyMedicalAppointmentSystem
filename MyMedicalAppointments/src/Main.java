import model.*;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        showMenu();

        /*
        Doctor myDoctor = new Doctor("Goyo","goyo@gmail.com");

        //Imprimiendo las citas:
        for (Doctor.AvailableAppointment availableAppointment :
                myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment);
        }

        //Imprementando elementos de una lista.
        Day day= Day.MONDAY;
        System.out.println("\n\t "+day.WEDNESDEY.getSpanish());

        System.out.println(myDoctor.toString());

        Patient p1 = new Patient("Laura","lau23@gmail.com");
        Nurse n1 = new Nurse("Karla","kar90@gmail.com","Prevención");

        myDoctor.showDataUser();
        n1.showDataUser();
        p1.showDataUser();

        //Clase anonima: hack para poder instanciar clases abstractas como USer.
        User u1 = new User("Becker","becker782@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("\n\t Nombre: "+getName());
                System.out.println("\t Correo: "+getEmail());
            }
        };

        u1.showDataUser();

        //
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        */
    }
}
