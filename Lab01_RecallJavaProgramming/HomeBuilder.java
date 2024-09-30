// File: HomeBuilder.java
// Description: Build house with base, walls, and roof
// Assignment Number: 1
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: <YOUR GRADER’S NAME>
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class HomeBuilder {

    int width = 12;
    int wallheight = 4;
    
    void printBase(){
        for (int i = 0; i < width; i++){
            System.out.print("=");
        }
    }

    void printBaseANDWall(){
        for (int j = 0; j < wallheight; j++){
            for (int i = 0; i < (width); i++){
                if ((i == 0) || (i == 1) || (i == width-1) || (i == width-2)) {
                    System.out.print("|");
                }
                else{
                    System.out.print(" ");
                }         
            }
            System.out.print("\n");
        }
        printBase();
    }

    void printAllHouse(){      
        int roofheight;
        int startroofwidth; 
        
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

        printBaseANDWall();
    }

    public void main() {
        printAllHouse(); 
    }

}