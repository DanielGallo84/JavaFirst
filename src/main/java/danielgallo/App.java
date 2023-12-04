package danielgallo;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        

        Persona p1 = new Persona("Dani", "Gallo",  "4581632-U", "12-11-1984", "BC" , 'H');
        p1.printPersona();
        Persona p2 = new Persona ("Jimi", "Hendrix", "011235813-Z", "27-11-1942", "USA", 'H');
        p2.printPersona();
    }

}
