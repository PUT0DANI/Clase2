public class Ejercicio1 {
    static void main() {

        for (int i = 1; i <= 1000; i++){
            int suma = 0;
            for (int j = 1; j <= i ;j++){
                if (i % j == 0 && i != j){
                    suma += j;
                }

            }
            if (suma == i){
                System.out.println(suma);

            }
        }
    }
}
