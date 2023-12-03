import java.util.List;
public class App {
   public static void main(String[] args) {
       iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

       System.out.println("Alunos cadastrados \n");
       alunoRepository.adicionar(new Aluno("João Farias", "123"));
       alunoRepository.adicionar(new Aluno("Antônio", "456"));
       alunoRepository.adicionar(new Aluno("Carlos", "789"));
       alunoRepository.adicionar(new Aluno("Eduardo", "321"));
       alunoRepository.adicionar(new Aluno("Lucas Paz \n", "654"));

       List<Aluno> alunos = alunoRepository.listar();
       for (Aluno aluno : alunos) {
           System.out.println(aluno.getNome());
       }

       Aluno alunoBuscado = alunoRepository.buscar("Carlos");
       System.out.println("Aluno removido: " + alunoBuscado.getNome() + "\n");
       System.out.println("Alunos ataulizados: \n");

       alunoRepository.remover(alunoBuscado);

       alunos = alunoRepository.listar();
       for (Aluno aluno : alunos) {
           System.out.println(aluno.getNome());
       }
   }
}

