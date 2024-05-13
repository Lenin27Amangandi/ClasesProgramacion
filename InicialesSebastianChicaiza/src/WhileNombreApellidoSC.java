import java.util.Scanner;

public class WhileNombreApellidoSC {
    public void WhileMetodoNombreApellidoSC(){
        System.out.println("Ingrese el Caracter con el que quiere formar las letras SC: ");
        Scanner sc = new Scanner(System.in);
        
        char c = sc.next().charAt(0);
        int s = 0;
        
        int i = 0;
        while (i < 5){
            System.out.print("Ingrese el tamaño con que quiere imprimir las letras SC (Debe ser de minimo 5):");
            s = sc.nextInt();
            i = s;
        }
        sc.close();
        int alto = s;
        int ancho = s * 2 + 1;
        char x ='-';
        char matriz[][] = new char [alto][ancho];
        
        i = 0;
        while (i < alto){
            int j = 0;
            while (j < ancho){
                matriz[i][j]=x;
                j++;
            }
            i++;
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

        
        i = 0;
        while (i < space){
            matriz[0][i] = c;
            i++;
        }

        i = 1;
        while (i < smedio){
            matriz[i][0] = c;
            i++;
        }

        i = 1;
        while (i < space){
            matriz[smedio-1][i] = c;
            i++;
        }

        i = smedio -1;
        while (i < alto){
            matriz[i][space -1] = c;
            i++;
        }

        i = 0;
        while (i < space){
            matriz[alto -1][i]=c;
            i++;
        }

        i = space +1;
        while (i < ancho){
            matriz[0][i]=c;
            i++;
        }

        i = 1;
        while (i < alto){
            matriz[i][space +1]=c;
            i++;
        }

        i = space +1;
        while (i < ancho){
            matriz[alto -1][i]=c;
            i++;
        }
        i=0;
        while (i < alto){
            int j=0;
            while (j < ancho){
                System.out.print(matriz[i][j]+" ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
