public class Pessoa {
    public String nome;
    public int idade;
    public double peso;
    public double altura;
    public String sexo;
    
    Pessoa(String nome, int idade, double peso, double altura, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public double calcIMC(){
        return this.peso / (this.altura * this.altura);
    }

    public void imprimir(){
        double imc = calcIMC();
        String classificção;

        if (imc <= 18.5) {
             classificção = "Abaixo do peso normal";
        } else if (imc > 18.5 && imc< 25 ) {
            classificção = "Peso normal";
        }else if (imc > 25 && imc < 30) {
            classificção = "Acima do peso normal";
        }else{
            classificção = "Obesidade";
        }

        System.out.println("Nome " + nome);
        System.out.println("IMC " + imc);
        System.out.println("Classificação " + classificção);
            
        }
    }
    

