
public class Fatorial {
        public long calcularFatorial(int n) {
        if (n == 0 || n == 1) return 1;
        else {
            long resultado = 1;
            for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
            }
            return resultado;
        }
        }


    
}
