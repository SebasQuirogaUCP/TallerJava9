package taller9;


public class ArrayReales implements Estadistica {
private double array[] = new double[10];
private double nuevoArray[] = new double[10];

    public ArrayReales(){
        for (int i = 0; i < 10; i++) {
            array[i]=(double) (Math.random() * 30) + 1;
            System.out.println(array[i]);
        }
        System.out.println("************************\n");
        
        
    }

    @Override
    public double menorValor() {
        double temp = array[0];
        for (int i = 0; i < 10; i++) {
            if(array[i]> temp){
                temp=array[i];
            }
            
        }
        return temp;
    }

    @Override
    public double mayorValor() {
       double temp2=array[0];
        for (int i = 0; i < 10; i++) {
            if(array[i] < temp2){
                temp2=array[i];
            }
            
        }
        return temp2;
    }
    

    @Override
    public double total() {
        double cont=0;
        for (int i = 0; i < 10; i++) {
            cont=array[i]+cont;            
        }
        
        return cont;
    }

    @Override
    public double[] array() {
        return array;
    }
    
    
    
    

}
