package danielgallo;



public class Persona {
    String Nombre;
    String Apellido;
    String Dni;
    String Fnacimiento;
    String Pnacimiento;
    char Genero;
    
    

   

    public Persona (String Nombre, String Apellido, String Dni, String Fnacimiento, String Pnacimiento, char genero){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.Fnacimiento = Fnacimiento;
        this.Pnacimiento = Pnacimiento;
        this.Genero = genero;
    }
   

     public void printPersona (){
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("DNI: " + Dni);
        System.out.println("Fecha de nacimiento: " + Fnacimiento);
        System.out.println("País de nacimiento: " + Pnacimiento);
        String s = String.valueOf(Genero);
        System.out.println("Género: " + s);
     }

   

}
