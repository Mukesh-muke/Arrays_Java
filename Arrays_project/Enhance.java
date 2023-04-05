package Arrays_project;

public class Enhance {
    public static void main(String[] args) {
        int a [][] = {
            {10,20,30,70},
            {30,40,50},
            {60,70,80,67,90}
        };
        for(int k[] : a){
            for(int l : k){
            System.out.print(" " + l);
        }
        System.out.println("");  
    }
    
}
}