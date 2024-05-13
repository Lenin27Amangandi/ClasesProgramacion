public class inicialNombreApellido {

    public void nombreApellidoFor(){
        System.out.println("FOR:    ");
        int altura = 6;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < altura; j++) {
                System.out.print(" ");
            }
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
    public void nombreApellidoWhile(){
        System.out.println("WHILE:  ");
        int altura=6;
        int i =0;

        while(i <altura){

            int j =0;
            while(j< altura *2-1){
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            j=0;
            while (j<altura){
                System.out.print(" ");
                j++;
            }
            j=0;
            while (j < altura){
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

    public void nombreApellidoDoWhile(){
        System.out.println("DO WHILE:   ");
       int altura =6;
       int i = 0;
       do {
            int j =0;
            while(j< altura *2-1){
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            j=0;
            while (j<altura){
                System.out.print(" ");
                j++;
            }
            j=0;
            while (j < altura){
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