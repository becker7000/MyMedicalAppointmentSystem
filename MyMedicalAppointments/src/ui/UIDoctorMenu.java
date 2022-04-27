package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<Doctor>();

    public static void showDoctorMenu(){
        int response=0;
        do {
            System.out.println("\n\t Hello doctor, welcome to My Medical Appoinments System...");
            System.out.println("\n\t Welcome "+ UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment.");
            System.out.println("2. My scheduled appointments.");
            System.out.println("3. Logout.");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){

                case 1 -> {
                    showAddAvailableAppointmentsMenu();
                }

                case 2 -> {

                }

                case 3 -> {
                    UIMenu.showMenu();
                }

            }

        }while(response!=0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response=0;
        do{
            System.out.println("\n:: Add Available Appointment");
            System.out.println(":: Select a Mounth");
            int i = 1;
            for (String m : UIMenu.MOUNTS )
                System.out.printf("\n\t %d) %s",i++,m);
            System.out.println("\n\t 14) Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());
            if(response>0 && response <=12){
                //1,2,3,...
                int mounthSelected = response;
                System.out.println("Mes seleccionado: "+UIMenu.MOUNTS[mounthSelected-1]);
                System.out.println("Inserte the date available: [dd/mm/yyyy] ");
                String date = sc.nextLine();
                System.out.println("Your date is: "+date+
                                    "\n\t 1)Correct 2)Change date");
                int responseDate = Integer.parseInt(sc.nextLine());
                if(response==2)
                    continue;

                int responseTime=0;
                String time = "";
                do {
                    System.out.println("Insert te time available for date: "+date+"[16:00] ");
                    time=sc.nextLine();
                    System.out.println("Your time is: "+time+
                            "\n\t 1)Correct 2)Change time");
                    responseTime=Integer.parseInt(sc.nextLine());
                }while(responseTime==2);

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);

            }else if(response==14){
                showDoctorMenu();
            }

        }while(response!=0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor){
        if(doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }

}
