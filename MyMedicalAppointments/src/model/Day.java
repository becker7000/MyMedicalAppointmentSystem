package model;

public enum Day {
    MONDAY("LUNES"),
    TUESDAY("MARTES"),
    WEDNESDEY("MIERCOLES"),
    THURSDAY("JUEVES"),
    FRIDAY("VIERNES"),
    SATURDAY("SABADO"),
    SUNDAY("DOMINGO");

    private String spanish;

    private Day(String s){
        spanish=s;
    }

    public String getSpanish(){
        return spanish;
    }

}
