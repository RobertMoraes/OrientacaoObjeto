package orientacaoobjeto.composicaoMuitosPraMuitos;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Carlos");
        Aluno aluno2 = new Aluno("João Pedro");
        Aluno aluno3 = new Aluno("João Paulo");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("JavaScript");
        Curso curso3 = new Curso("Python");

        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno1);

        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno2);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Curso " + curso1.nome + ".\nAluno: " + aluno.nome + ".");
        }

        aluno3.adicionarCurso(curso1);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Curso " + curso1.nome + ".\nAluno: " + aluno.nome + ".");
        }

        System.out.println(aluno1.cursos.get(0).alunos);
        System.out.println(curso3.alunos.get(0).cursos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
