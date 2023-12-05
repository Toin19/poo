import java.util.List;
public class App {
   public static void main(String[] args) {
       iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

       System.out.println("Alunos cadastrados");
       System.out.println();
       alunoRepository.adicionar(new Aluno("João Farias", "1234567890"));
       alunoRepository.adicionar(new Aluno("Antônio", "4563217891"));
       alunoRepository.adicionar(new Aluno("Carlos", "7895432167"));
       alunoRepository.adicionar(new Aluno("Eduardo", "3213421325"));
       alunoRepository.adicionar(new Aluno("Lucas Paz", "6543212547"));

       List<Aluno> alunos = alunoRepository.listar();
       for (Aluno aluno : alunos) {
           System.out.println(aluno.getNome() + " : " + aluno.getMatricula());
       }
       System.out.println();

       
       Aluno alunoBuscado = alunoRepository.buscar("Carlos");
      

       if(alunoBuscado == null){
         System.out.println("O aluno não foi encontrado");
         return;
       }
       if(alunoBuscado.getMatricula().length() != 10){
        System.out.println("Matricula inválida:" + alunoBuscado);
       }
    


       System.out.println("Aluno buscado e removido: " + alunoBuscado.getNome());
       
       alunoRepository.remover(alunoBuscado);
       
       System.out.println();
       System.out.println("Alunos restantes: ");
       System.out.println();
       alunos = alunoRepository.listar();
       for (Aluno aluno : alunos) {
           System.out.println(aluno.getNome());
       }
   }
}



