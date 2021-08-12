
    import java.util.Scanner;

class result {
    static int escalaOrigem;
    static int escalaDesejada;
    static float temperatura;
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a escala de origem: 1 [celsius], 2 [fahrenheit], 3 [kelvin] ");
        escalaOrigem = teclado.nextInt();
        System.out.printf("Digite a escala de desejada: 1 [celsius], 2 [fahrenheit], 3 [kelvin] ");
        escalaDesejada = teclado.nextInt();
        System.out.print("Digite a temperatura: ");
        temperatura = teclado.nextFloat();
        
        double f,c,k;
        if (escalaDesejada == 2 && escalaOrigem == 1) {
            c = (temperatura * 1.8) + 32;
            System.out.printf("A temperatura é : " + c +"°F");
        }
        else if (escalaDesejada == 1 && escalaOrigem == 2) {
            c = (temperatura - 32) / 1.8;
          
            System.out.printf("A temperatura é : "+c+"°C" );

        }  else if (escalaDesejada == 1 && escalaOrigem == 3) {
            k = temperatura + 273;
          
            System.out.printf("A temperatura é : "+k+"K" );
        }else if (escalaDesejada == 3 && escalaOrigem == 1) {
            k = temperatura - 273;
          
            System.out.printf("A temperatura é : "+k+"°C" );
        }else if (escalaDesejada == 2 && escalaOrigem == 3) {
            f = ((temperatura-32)*(5/9))+237;
          
            System.out.printf("A temperatura é : "+f+"K" );
        }else if (escalaDesejada == 3 && escalaOrigem == 2) {
            f = ((temperatura - 237)* 1.8) + 32;
          
            System.out.printf("A temperatura é : "+f+"°F" );
        }


        teclado.close();
        }

}

