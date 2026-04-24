package Java.core.associacao.exercicio.dominio;

public class Seminarios {
    private String titulo;
    private Estudantes[] estudante;
//    private Professores professor; // apagar essa bomba
    private Local lugar;
    public Seminarios(String titulo){
        this.titulo = titulo;
    }

    public Seminarios(String titulo,Local lugar){
        this.titulo = titulo;

        this.lugar = lugar;

    }

    public Seminarios(String titulo, Estudantes[] estudante, Local lugar){
        this.titulo = titulo;
        this.estudante = estudante;
        this.lugar = lugar;
    }



    public void imprimir(){
        System.out.println("Titulo do semiário: "+titulo);
        System.out.println("Alunos:");
        if (estudante == null) return;
        for (Estudantes aluno : estudante){
            System.out.print(aluno.getNome()+" ");
        }
        System.out.println(" ");
        System.out.println("Ministrado: "+ lugar.getEndereco());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudantes[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudantes[] estudante) {
        this.estudante = estudante;
    }

    public Local getLugar() {
        return lugar;
    }

    public void setLugar(Local lugar) {
        this.lugar = lugar;
    }
}
