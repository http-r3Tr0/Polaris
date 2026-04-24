package Java.core.associacao.exercicio.dominio;

import dominio.Estudante;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminariosMinistrados;

    public Professores(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminarios[] seminariosMinistrados){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminariosMinistrados = seminariosMinistrados;
    }

    public void imprimir(){

        System.out.println("----------");
        System.out.println("Professor: "+this.nome);
        if (this.seminariosMinistrados == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminarios seminarios : seminariosMinistrados){
            System.out.println(seminarios.getTitulo());
            System.out.println(seminarios.getLugar().getEndereco());
            if (seminarios.getEstudante() == null|| seminarios.getEstudante().length == 0) continue;
            System.out.println("** Alunos **");
            for (Estudantes aluno: seminarios.getEstudante()){
                System.out.println("Aluno: "+aluno.getNome()+" Idade "+aluno.getIdade());

            }
        }
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminariosMinistrados() {
        return seminariosMinistrados;
    }

    public void setSeminariosMinistrados(Seminarios[] seminariosMinistrados) {
        this.seminariosMinistrados = seminariosMinistrados;
    }
}
