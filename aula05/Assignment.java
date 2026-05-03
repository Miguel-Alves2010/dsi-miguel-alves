package aula05;

public class Assignment {  //Arquivo para teste de operadores de atribuição
  public static void main(String[] args) {

    // =
    // Define um valor para a variável
    int a = 5;
    System.out.println(a);

    // += 
    // Soma um valor à variável
    int b = 5;
    b += 3; // b = b + 3
    System.out.println(b);

    // -=
    // Subtrai um valor da variável
    int c = 5;
    c -= 3; // c = c - 3
    System.out.println(c);

    // *=
    // Multiplica o valor da variável
    int d = 5;
    d *= 3; // d = d * 3
    System.out.println(d);

    // /=
    // Divide o valor da variável
    int e = 6;
    e /= 3; // e = e / 3
    System.out.println(e);

    // %= 
    // Retorna o resto da divisão
    int f = 5;
    f %= 3; // f = f % 3
    System.out.println(f);

    // &=
    // Mantém 1 apenas onde ambos os bits são 1
    int g = 5;
    g &= 3; // g = g & 3
    System.out.println(g);

    // |= 
    // Retorna 1 se pelo menos um bit for 1
    int h = 5;
    h |= 3; // h = h | 3
    System.out.println(h);

    // ^=
    // Retorna 1 se os bits forem diferentes
    int i = 5;
    i ^= 3; // i = i ^ 3
    System.out.println(i);

    // >>=
    // Move os bits para a direita (divide por 2)
    int j = 8;
    j >>= 1; // j = j >> 1
    System.out.println(j);

    // <<= 
    // Move os bits para a esquerda (multiplica por 2)
    int k = 2;
    k <<= 2; // k = k << 2
    System.out.println(k);
  }
}