### Aula 10 **Generics em POO e Java**

#### Objetivo
Compreender o conceito de *Generics* em Programação Orientada a Objetos, sua aplicação em Java, e como utilizá-los para criar código mais seguro e reutilizável.

---

### **1. Introdução aos Generics**

#### O que são Generics?
Generics são uma funcionalidade em Java que permite definir classes, interfaces, e métodos com parâmetros de tipo. Eles oferecem:
- **Reutilização de código**: Você pode criar classes ou métodos que funcionam com diferentes tipos.
- **Segurança de tipo em tempo de compilação**: Reduz erros de *casting* em tempo de execução.
- **Legibilidade**: O código fica mais claro, já que o tipo é explícito.

#### Exemplo inicial: Sem Generics
```java
import java.util.ArrayList;

public class SemGenerics {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Texto");
        lista.add(42); // Aceita qualquer tipo, sem restrição.

        // O casting manual é necessário:
        String valor = (String) lista.get(0);
        System.out.println(valor);

        // Erro em tempo de execução (ClassCastException):
        // String valorInvalido = (String) lista.get(1);
    }
}
```

#### Exemplo inicial: Com Generics
```java
import java.util.ArrayList;

public class ComGenerics {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Texto");
        // lista.add(42); // Erro de compilação: apenas Strings são aceitas.

        String valor = lista.get(0); // Não é necessário cast.
        System.out.println(valor);
    }
}
```

---

### **2. Benefícios dos Generics**
1. **Segurança de tipo**: Evita erros ao misturar tipos incompatíveis.
2. **Evita casting explícito**: Facilita a leitura do código.
3. **Reutilização de código**: Permite criar classes e métodos genéricos para diferentes tipos de dados.

---

### **3. Generics em Classes**

#### Sintaxe básica
Uma classe genérica é declarada com parâmetros de tipo entre `<>`.

```java
public class Caixa<T> {
    private T valor;

    public void adicionar(T valor) {
        this.valor = valor;
    }

    public T obter() {
        return valor;
    }
}
```

#### Uso de uma classe genérica
```java
public class TesteCaixa {
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.adicionar("Olá, Generics!");
        System.out.println(caixaDeTexto.obter());

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.adicionar(123);
        System.out.println(caixaDeNumero.obter());
    }
}
```

---

### **4. Generics em Métodos**

#### Sintaxe básica
Você pode criar métodos genéricos que funcionam com diferentes tipos.

```java
public class Util {
    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }
}
```

#### Uso do método genérico
```java
public class TesteMetodoGenerico {
    public static void main(String[] args) {
        Util.imprimir("Olá, método genérico!");
        Util.imprimir(123);
        Util.imprimir(3.14);
    }
}
```

---

### **5. Generics em Interfaces**

#### Exemplo de interface genérica
```java
public interface Repositorio<T> {
    void salvar(T objeto);
    T buscar(int id);
}
```

#### Implementação da interface
```java
public class RepositorioMemoria<T> implements Repositorio<T> {
    private List<T> dados = new ArrayList<>();

    @Override
    public void salvar(T objeto) {
        dados.add(objeto);
        System.out.println("Objeto salvo: " + objeto);
    }

    @Override
    public T buscar(int id) {
        return dados.get(id);
    }
}
```

#### Uso da interface genérica
```java
public class TesteRepositorio {
    public static void main(String[] args) {
        Repositorio<String> repo = new RepositorioMemoria<>();
        repo.salvar("Objeto 1");
        System.out.println(repo.buscar(0));
    }
}
```

---

### **6. Generics com Limitação de Tipos (Bounded Types)**

#### Limitar o tipo com `extends`
Você pode restringir os tipos genéricos para aceitar apenas subclasses de uma classe ou implementações de uma interface.

```java
public class Comparador<T extends Number> {
    public double somar(T numero1, T numero2) {
        return numero1.doubleValue() + numero2.doubleValue();
    }
}
```

#### Uso de tipos limitados
```java
public class TesteComparador {
    public static void main(String[] args) {
        Comparador<Integer> comparador = new Comparador<>();
        System.out.println(comparador.somar(10, 20));

        Comparador<Double> comparadorDouble = new Comparador<>();
        System.out.println(comparadorDouble.somar(10.5, 20.3));
    }
}
```

---

### **7. Wildcards (Curingas)**

#### O que é um wildcard?
Um wildcard (`?`) permite flexibilidade ao trabalhar com tipos genéricos desconhecidos.

#### Exemplos de uso
1. **Unbounded wildcard (`?`)**: Aceita qualquer tipo.
   ```java
   public static void imprimirLista(List<?> lista) {
       for (Object obj : lista) {
           System.out.println(obj);
       }
   }
   ```

2. **Bounded wildcard (`? extends`)**: Aceita subclasses de um tipo específico.
   ```java
   public static void imprimirNumeros(List<? extends Number> numeros) {
       for (Number num : numeros) {
           System.out.println(num);
       }
   }
   ```

3. **Lower-bounded wildcard (`? super`)**: Aceita superclasses de um tipo específico.
   ```java
   public static void adicionarNumeros(List<? super Integer> lista) {
       lista.add(10);
       lista.add(20);
   }
   ```

### **8. Referências Bibliográficas**
- Bloch, J. *Effective Java*. 3rd Edition, Addison-Wesley, 2018.
- Horstmann, C. *Core Java Volume I – Fundamentals*. 11th Edition, Prentice Hall, 2018.
- Oracle Java Documentation: [Generics](https://docs.oracle.com/javase/tutorial/java/generics/).

