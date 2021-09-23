import javax.print.Doc;

public class Doctor {

    static int id = 0;
    String name;
    String lastname;
    String speciality;

    Doctor (){
        id = 0;
        System.out.println("We are created a object");
        id++;
    }

    Doctor (String name, String lastname){
        this.name = name;
        this.lastname = lastname;
        id++;
    }

    public void showName(){
        System.out.println("Doctor: "+ id + " - " + name + " " + lastname);
    }    

    public void showId(){
        System.out.println("id: "+ id);
    }

    static int sum(int a, int b){
        return a + b;
    }
}
