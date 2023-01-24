public class Insecto {
    double weeks;
    double insecto = 0;
    public Insecto(double semanas){
        this.weeks = semanas;
    }

    public double cantidadInsectos(int weeks){

        for(int i = 0; i< this.weeks; i++){
            insecto=insecto+Math.pow(2,i);
        }
        return insecto;
    }
    public void getTotal(){
        System.out.print(insecto);
    }

}
