
  import java.util.Scanner;
  public class Livros {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as vendas de cada dia da semana
        int[] vendas = new int[7];
        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};

        // Solicita a quantidade de livros vendidos para cada dia da semana
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a quantidade de livros vendidos na " + diasSemana[i] + ": ");
            vendas[i] = scanner.nextInt();
        }

        // Encontra o dia com a maior venda
        int maxVendas = vendas[0];
        int diaMaiorVenda = 0;
        for (int i = 1; i < 7; i++) {
            if (vendas[i] > maxVendas) {
                maxVendas = vendas[i];
                diaMaiorVenda = i;
            }
        }

        // Exibe o dia com a maior venda e a quantidade de livros vendidos
        System.out.println("O dia com a maior venda foi " + diasSemana[diaMaiorVenda] + " com " + maxVendas + " livros vendidos.");

        scanner.close();
    
}

}
