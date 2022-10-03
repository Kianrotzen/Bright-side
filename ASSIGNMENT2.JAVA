public class App {
    public static void main(String[] args) throws Exception {

        // FOR LOOP
        for (int  firstnameCount = 5; firstnameCount != 0; firstnameCount--) {
            System.out.println("Kian Rotzen Genesis");
           
            if (firstnameCount == 3) {
                System.out.println("Wait! Timeout! I need to go to the bathroom!");
                 break;
            }
        }
        
        
        // DO WHILE
        int surNameCount = 5; 
        do {
            System.out.println("Inovejas");
            surNameCount--; 
        } while (surNameCount != 0);
        
        
        
        // WHILE
        int nickNameCount = 0; 
         
        while (nickNameCount != 0) {
       
        nickNameCount--;
        
        if(nickNameCount == 3){
           
            System.out.println("SKIP THIS PROCEED TO THE NEXT LOOP");
            continue;
        }
        
         System.out.println("Gene");
       }
    }
}
