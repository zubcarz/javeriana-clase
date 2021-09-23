public class Alumnos {
    static int id = 1;
    private int idUser = 0;
    public String name;
    String lastname;
    int age = 0;
    float[] notes; 

    Alumnos() {
        // System.out.println("constructor");
        id++;
    }

    Alumnos(String name, String lastName) {
        this.name = name;
        this.lastname = lastName;
        showName();
        id++;
    }

    public void showName() {
        System.out.println("My name is: -> " + name + " " + lastname);
        UiComponents.generalMenu();
    }

    public int showName(int i) {
        return 1;
    }

    public void showId(){
        System.out.println("My Id -> " + id);
    }

    public void updateNote(int index, float newValue){

    }

    public void deleteNote(int index, float newValue){

    }

    public void addTwo(){
        idUser = idUser +2;
    }

}
