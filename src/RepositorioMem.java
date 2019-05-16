import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    ArrayList<Coima> coimaL = new ArrayList<>();
    ArrayList<Copia> copiaL = new ArrayList<>();
    ArrayList<Devolucao> devolucaoL = new ArrayList<>();
    ArrayList<Emprestimo> emprestimoL = new ArrayList<>();
    ArrayList<Encomenda> encomendaL = new ArrayList<>();
    ArrayList<EntradaNovoLivro> enNovoLivroL = new ArrayList<>();
    ArrayList<Livro> livroL = new ArrayList<>();
    ArrayList<Notificacao> notificacaoL = new ArrayList<>();
    ArrayList<PropostaAquisicao> propAquisicaoL = new ArrayList<>();
    ArrayList<Requisicao> requisicaoL = new ArrayList<>();
    ArrayList<RequisicaoCompra> requisicaoCompraL = new ArrayList<>();
    ArrayList<TipoUtilizador> tipoUtilizadorL = new ArrayList<>();
    ArrayList<Utilizador> utilizadorL = new ArrayList<>();

    //1ºSprint

    ArrayList<SalaEstudo> salaEstudoL = new ArrayList<>();
    ArrayList<Aluno> alunoL = new ArrayList<>();
    ArrayList<Docente> docenteL = new ArrayList<>();
    ArrayList<Professor> professorL = new ArrayList<>();
    ArrayList<Funcionario> funcionarioL = new ArrayList<>();
    ArrayList<Horario> horarioL = new ArrayList<>();
    ArrayList<Disciplina> disciplinaL = new ArrayList<>();

    //-----------



    public RepositorioMem() {
    }

    public void adicionaCoima(Coima coima) {
        coimaL.add(coima);
    }

    public void adicionaCopia(Copia copia) {
        copiaL.add(copia);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        devolucaoL.add(devolucao);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        emprestimoL.add(emprestimo);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        encomendaL.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        enNovoLivroL.add(entradaNovoLivro);
    }

    public void adicionaLivro(Livro livro) {
        livroL.add(livro);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        notificacaoL.add(notificacao);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
        propAquisicaoL.add(proposta);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        requisicaoL.add(requisicao);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        requisicaoCompraL.add(requisicaoCompra);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        tipoUtilizadorL.add(tipo);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        utilizadorL.add(utilizador);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {

        for (Emprestimo i : emprestimoL) {
            if (i.getRequisicao() == r)
                return i;
        }
        return null;
    }


    //1º Sprint

    public void adicionaSalaEstudo(SalaEstudo salaEstudo) {
        salaEstudoL.add(salaEstudo);
    }

    public void adicionaAluno(Aluno aluno) {
        alunoL.add(aluno);
    }

    public void adicionaDocente(Docente docente){
        docenteL.add(docente);
    }

    public void adicionaProfessor(Professor professor) {
        professorL.add(professor);
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        funcionarioL.add(funcionario);
    }

    public void adicionaHorarios(Horario horario) {
        horarioL.add(horario);
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinaL.add(disciplina);
    }


    public void entradaAlunoNaSala(SalaEstudo salaEstudo, Aluno aluno){

        if(salaEstudo == null || aluno == null) return;

        if(salaEstudo.addAlunoSala(aluno) == true)
            System.out.println("Foi efetuada uma nova entrada de aluno na sala!\n");
        else
            System.out.println("Nao foi efetuada a entrada do aluno na sala");

    }


}