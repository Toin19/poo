public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public String sexo;

    Pessoa (){} 
    Pessoa (String nome, int idade, double altura, double peso, String sexo) { 
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double calcularImc (){ 
        return peso / (altura*altura); 
    }

    public void imprimir () { 

        double imc = calcularImc(); 

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("IMC: " + Math.round(imc)); 

        if (imc <= 18.5){
            System.out.println("Abaixo do peso normal\n");
        } else if ( imc <= 25){
            System.out.println("Peso Normal\n");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Acima do peso normal\n");
        } else {
            System.out.println("Obesidade\n");
        }
   }
}
    

