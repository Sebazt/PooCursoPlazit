
public class Doctor {

    //atributos de la clase

    static int id = 0; // autoincrementado con una nueva instancia
    String name;
    String speciality;
    public  String email;


    // constructor

    Doctor(String _name, String _speciality){
        this.name =_name;
        this.speciality = _speciality;
        System.out.println("Hola en java esto es un constructor.");
        id++;
    }

    //métodos de la clase

    public void getName(){
        System.out.println(name);
    }

    public void getId(){
        System.out.println("Id Doctor: "+id);
    }


}
