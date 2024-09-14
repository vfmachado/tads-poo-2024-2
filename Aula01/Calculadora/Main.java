package Aula01.Calculadora;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double resultado;

        resultado = calc.multiplica(5, 8); // 40
        System.out.println(resultado);

        calc.salvarMemoria();   // salvou 40

        calc.soma(10, 2);   // 20

        calc.estado();   // 20

        calc.memoria();  // 40

        calc.dividir(calc.memoria(), 10);    // 4

        calc.multiplica(3) // vai pegar o estado
                        // 4 * 3 = 12

    }

}
