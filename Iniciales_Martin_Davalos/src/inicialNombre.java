public class inicialNombre {

    public  void nombreFor() {
        int altura = 6;
       System.out.println("FOR: ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }

    public void nombreWhile(){
        System.out.println("WHILE:  ");
        int altura =6;
        int i =0;
        while (i<altura){
                int j =0;
                while (j < altura * 2 - 1) {
                    if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
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

    public void nombreDoWhile(){
        System.out.println("DO WHILE:   ");
        int altura =6;
        int i =0;
        do {
            int j =0;
            while (j < altura * 2 - 1) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura ) || (i + j == altura * 2 - 3 && j >= altura)) {
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


