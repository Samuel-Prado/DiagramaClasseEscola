
import domain.Aluno;
import domain.Curso;
import domain.Pessoa;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Pessoa p = new Pessoa(

                "Samuel Pado Soares",
                "Rua do morango",
                "3499979392"

        );

        Aluno a = new Aluno(

                p.getNome(),
                p.getTelefone(),
                p.getEndereco(),
                "320.430.425.019-2",
                "Matriculado"

        );

        Professor pr = new Professor(

                "Cricia",
                "Rua do cachorro",
                "34153730560",
                "Doutorado"

        );

        Curso c = new Curso(

                "DS",
                "Desenvolvimento de Sistema"

        );

        System.out.println(p);
        System.out.println(a);
        System.out.println(pr);
    }
}
