public class Circulo {
    int radio;
    float dimaetro;
    double circunferencia;

    Circulo(){
        System.out.println("Intancia de la clase");
    }
    
    Circulo(int radio){
        this.radio = radio;
        this.dimaetro = getDiametro();
        this.circunferencia = getCircunferencia();
        printCirculo();
    }

    float getDiametro (){
        return 2 * this.radio;
    }

    double getCircunferencia(){
        return Math.PI * this.dimaetro;
    }

    double getArea(){
        return this.radio * this.radio * Math.PI;
    }

    void printCirculo(){
        System.out.println("Radio -> " + this.radio);
        System.out.println("Diametro  -> " + this.dimaetro);
        System.out.println("Circunferencia  -> " + this.circunferencia);
    }

    void printCirculoInt(){
        System.out.println("Radio -> " + Math.floor(this.radio));
        System.out.println("Diametro  -> " + Math.floor(this.dimaetro));
        System.out.println("Circunferencia  -> " + Math.floor(this.circunferencia));
    }


    double diff(Circulo ref){
        return this.circunferencia - ref.circunferencia;
    }

    double[] coordenadas(double angulo){
        double[] coord = new double[]{0,0};


        // Coordenada X
        coord[0] =  this.radio * Math.cos(angulo);
        // Coordenada Y
        coord[1] =  this.radio * Math.sin(angulo);

        return coord;

    }


    // double[] cordenadas(double angulo){
    //     // double[] coord = new double[]{0,0};
    //     // double y = 0;
    //     // double x = 0;

    //     // x = this.radio * Math.cos(angulo);
    //     // y = this.radio * Math.sin(angulo);

    //     // coord[0] = x;
    //     // coord[1] = y;

    //     // return coord;
    // }

}
