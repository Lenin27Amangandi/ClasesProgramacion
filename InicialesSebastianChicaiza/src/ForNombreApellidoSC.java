import java.util.Scanner;

public class ForNombreApellidoSC {
    public void ForMetodoNombreApellidoSC(){
                System.out.println("Ingrese el Caracter con el que quiere formar las letras SC: ");
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        int s = 0;
        
        for(int i=0; i < 5;){
            System.out.print("Ingrese el tamaño con que quiere imprimir las letras SC (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        }
        sc.close();
        int alto = s;
        int ancho = s * 2 + 1;
        char x ='-';
        char matriz[][] = new char [alto][ancho];
        
        for(int i = 0; i < alto; i++ ){
            for(int j = 0; j < ancho; j++){
                matriz[i][j]=x;
            }
        }

        float space1 = ancho/2;
        int space = (int)space1;

        int smedio;
        if (s%2 == 0){
            smedio = s/2;
        }else{
            float sdecimal = s/2;
            int sentero = (int)sdecimal;
            smedio = sentero + 1; 
        }

        
        for(int i = 0; i < space; i++){
            matriz[0][i] = c;
        }

        for(int i = 1; i < smedio; i++){
            matriz[i][0] = c;
        }

        for(int i = 1; i < space; i++){
            matriz[smedio-1][i] = c;
        }

        for(int i = smedio -1; i < alto; i++){
            matriz[i][space -1] = c;
        }

        for(int i = 0; i < space; i++){
            matriz[alto -1][i]=c;
        }

        for(int i = space +1; i < ancho ;i++){
            matriz[0][i]=c;
        }

        for(int i = 1; i < alto ;i++){
            matriz[i][space +1]=c;
        }

        for(int i = space +1; i < ancho; i++){
            matriz[alto -1][i]=c;
        }
        for(int i=0; i < alto; i++){
            for(int j=0; j < ancho; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
