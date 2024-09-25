public class Livro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Nome do livro:");
            String nome = s.nextLine();

            System.out.println("Qual total de páginas do livro?");
            int paginas = s.nextInt();
            s.nextLine(); 

            if (paginas <= 0) {
                System.out.println("O total de páginas deve ser maior que zero, por favor, insira um valor válido.");
                return; 
            }

            System.out.println("Quantas páginas você já leu?");
            int paginasLidas = s.nextInt();
            s.nextLine(); 
            if (paginasLidas < 0 || paginasLidas > paginas) {
                System.out.println("Insira um número de páginas lidas maior ou igual a zero e menor ou igual ao total de páginas.");
                return; 
            }

            /* Calcular progressão */
            int porcentagem = (paginasLidas * 100) / paginas;
            System.out.println("Você leu " + porcentagem + "% do livro " + nome);

        } catch (InputMismatchException e) {
            System.out.println("Erro: por favor, insira valores numéricos válidos. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            s.close();
        }
    }
}
