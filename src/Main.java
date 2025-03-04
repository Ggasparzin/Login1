public class Main {
    public static void main(String[] args) {
        String Nome = "Digite seu nome: ";
        String rNome = "Carlos";

        String Idade = "Digite sua idade: ";
        int rIdade = 30;

        String Altura = "Digite sua altura em metros: ";
        double rAltura = 1.72;

        int soma = 50 - rIdade;

        String Estudante = "Você é estudante?";
        boolean rEstudante = false;


            if(rIdade > 50){
                System.out.println("Olá, " + rNome + " Você já passou dos 50 anos. ");
            }
            else{
                System.out.println("Olá, " + rNome + "! Em " + soma + " anos você tera 50 anos.");
            }
            System.out.println("Sua altura em centímetros é: " + rAltura * 100 + " cm.");
            if(rEstudante){
                System.out.println(Estudante + " Sim. ");
            }
            else{
                System.out.println(Estudante + " Não. ");
        }
    }
}