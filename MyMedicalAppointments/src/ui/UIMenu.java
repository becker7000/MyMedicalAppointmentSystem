package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MOUNTS={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    //Clase con puros métodos:
    /*
    * Los métodos estaticos nos pueden ayudar a crear comportamiento
    * sin necestidad de crear una instancia de la clase a la que
    * pertenecen.
    * */
    public static void showMenu(){
        System.out.println("Welcome to my appointments");
        System.out.println("Choose an option:");

        int response; //Variable
        do{
            System.out.println("1) Doctor");
            System.out.println("2) Patient");
            System.out.println("3) Exit");
            Scanner sc = new Scanner(System.in);
            response=Integer.parseInt(sc.nextLine());
            switch (response) {
                case 1 -> {
                    System.out.println("Doctor");
                    authUser(1);
                    response=0;
                }
                case 2 -> {
                    System.out.print("\nPatient");
                    authUser(2);
                    response = 0;
                }
                case 3 -> {
                    System.out.println("Thank you for you visit");
                    response = 0;
                }
                default -> System.out.println("Please select a correct answer");
            }
        }while(response!=0);

    }

    private static void authUser(int userType){

        //userType = 1 -> Doctor
        //userType = 2 -> Patient

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Juan Mendoza","jua71_men@gmail.com"));
        doctors.add(new Doctor("Carol Armendariz","arme_car@gmail.com"));
        doctors.add(new Doctor("Tania Lopez","tan700_loen@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lupita Sanchez","lu7127_an@gmail.com"));
        patients.add(new Patient("Paco Garcia","gar0_0@gmail.com"));
        patients.add(new Patient("Luis Vergara","luis_v11@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [pista@gmail.com] ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType==1){
                for(Doctor d : doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect=true; //Centinela
                        //Obteniendo datos del usuario:
                        doctorLogged=d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType==2){
                for(Patient p : patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect=true; //Centinela
                        //Obteniendo datos del usuario:
                        patientLogged=p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        }while(!emailCorrect);

    }

    static void showPatientMenu(){
        int response;
        do{
            System.out.println("\n\n1) Book an appointment");
            System.out.println("2) My appointments");
            System.out.println("3) Return");

            Scanner sc = new Scanner(System.in);
            response=Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> {
                    for(int i=1; i<=3;i++){
                        System.out.println(i+". "+MOUNTS[i]);
                    }
                    System.out.println("::Book an appointment");
                }

                case 2 -> System.out.println("::My appointments");
                case 3 -> {
                    showMenu();
                    response = 0;
                }
                default -> System.out.println("Please select a correct answer");
            }
        }while(response!=0);
    }

}
