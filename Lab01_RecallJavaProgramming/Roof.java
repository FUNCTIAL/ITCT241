// Trying to minimize code

public class Roof {
    public static void main(String[] args) {
        int width = 12;
        int roofheight;
        int startroofwidth; 
        
        // Set the roof width
        if ((width%2) != 0) {
            roofheight = (width/2)+1;
            startroofwidth = 1;
        }
        else {
            roofheight = (width/2);
            startroofwidth = 2;
        }
        
        int space = (width - startroofwidth)/2;
        
        for(int i = 0; i < roofheight; i++){
            
            for (int k = 0; k < space; k++){
                System.out.print(" ");
            }

            for (int j = 0; j < startroofwidth; j++){
                if (j == 0){
                    if (i==0){
                        if (startroofwidth == 1) {
                            System.out.print("_");
                        }
                        else{
                            System.out.print("/");
                        }
                    }
                    else{
                        System.out.print("/");
                    }
                }
                else if (j == startroofwidth-1) {
                    System.out.print("\\");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.print("\n");
            startroofwidth = startroofwidth + 2;
            space = (width - startroofwidth)/2;
        }
    }
}