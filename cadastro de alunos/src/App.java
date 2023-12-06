import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;
import models.Aluno;
import repositories.ArrayListAlunoRepository;

public class App {
    public static void main(String[] args) {
        iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

       
   alunoRepository.adicionar(new Aluno("Eduardo Ferreira", "9849637410"));
   alunoRepository.adicionar(new Aluno("Anderson Cordeiro", "7418527889"));
   alunoRepository.adicionar(new Aluno("João Farias", "9637419635"));
   alunoRepository.adicionar(new Aluno("Antônio Alexandre", "8527417845"));
   alunoRepository.adicionar(new Aluno("Lucas Paz", "4185258472"));

            System.out.println();
        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        try {
            
            Aluno alunoBuscado = alunoRepository.buscar("Lucas Paz");
            System.out.println();
            System.out.println("Aluno buscado: " + alunoBuscado.getNome() + " Matrícula: " + alunoBuscado.getMatricula());
            System.out.println();

            alunoRepository.remover(alunoBuscado);
        } catch (AlunoNaoEncontradoException | MatriculaInvalidaException e) {
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
        } 

        for (Aluno aluno : alunoRepository.listar()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            
        }
            System.out.println();
        
    }
}