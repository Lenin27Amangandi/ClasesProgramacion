public class inicialApellido {

    public void apellidoFor(){
        System.out.println("FOR:    ");
        int altura =6;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || (i == 0 || i == altura - 1) && j < altura - 1 || j == altura - 1 && (i != 0 && i != altura - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void apellidoWhile(){

        System.out.println("WHILE: ");
        int altura =6;
        int i =0;
        while(i < altura){
            int j =0;
            while(j < altura){
                if (j == 0 || (i == 0 || i == altura - 1) && j < altura - 1 || j == altura - 1 && (i != 0 && i != altura - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                } 
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
    public void apellidoDoWhile(){
        System.out.println("DO WHILE:   ");
        int altura =6;
        int i = 0;
        do {
            int j =0;
            while(j < altura){
                if (j == 0 || (i == 0 || i == altura - 1) && j < altura - 1 || j == altura - 1 && (i != 0 && i != altura - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                } 
                j++;
            }
            System.out.println();
            i++;
        } while (i<altura);
    }
}