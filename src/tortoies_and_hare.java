import java.util.Random;

public class tortoies_and_hare {
    
    public static void main(String[] args) {
        
        int startPositionTortoise = 1;
        int startPositionHare = 1;
        int T = 1;
        int H = 1;
        String[] way = new String[70];

        Random r = new Random();
        
        System.out.println("BANG!!!!! \n" + "AND THEY'RE OFF!!!!!");

        while( T < 70 && H < 70 ){

            int Torti_add = r.nextInt(10) + 1;
            int Hare_add = r.nextInt(10) + 1;

            if(Torti_add <= 5){
                T += 3;
            } else if(Torti_add <= 7){
                T -= 6;
            }else{
                T += 1;
            }

            if(Hare_add <= 2){

            }else if(Hare_add <= 4){
                H += 9;
            }else if(Hare_add == 5){
                H -= 12;
            }else if(Hare_add <= 8){
                H += 1;
            }else{
                H -= 2;
            } 

            if(T < 1){
                T = startPositionTortoise;  
            }
            if(H < 1){
                H = startPositionHare;
            }
            if(H > 70){
                H = 70;
            }
            if(T > 70){
                T =70;
            }

            
            for(int i = 0; i < 70; i++){
                way[i] = "-";
            }
            if(T == H){
                for(int i = 0; i < 70 ;i++){
                    if(i == T-1){
                        System.out.print("OUCH");
                        i+=3;
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }else{
                way[T-1] = "T";
                way[H-1] = "H";

                for( String m : way){
                System.out.print(m);

                }
                System.out.println();
            }
        } 

        if(T == 70){
                System.out.println("TORTOISE WINS!!! YAY!!!");
            } else if(H == 70){
                System.out.println("Hare wins.Yuch.");
            } else if(H == 70 && T == 70){
                System.out.println("TORTOISE WINS!!! YAY!!!");
            }


    }  
}
