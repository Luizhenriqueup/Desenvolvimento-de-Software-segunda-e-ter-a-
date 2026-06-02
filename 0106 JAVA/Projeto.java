/*Sistemas academia

login: usuario e senha
personal: (Tem acesso a quais alunos estão cadastrados nele)
aluno: (Tem acesso ao )
cadastro (cadastro do aluno, bonus para alunos novos)
Tipos de valores (vip ou n vip) ( horario ou mensal ou anual)
Tipo de horários e dias (Treino)
cancelamento (cancelamento)
mudança de valor (mudança de vip ou n vip)
Aviso de vencimento (Avisa quando estiver terminando a mensalidade)
maquinas livres (mostra a quantidade de maquinas e quais estão livres)
personal livres (mostra quantos personal tem e quantos estão livres)*/

class Usuario{
    private String login;
    private int senha;

    public Usuario(String login, int senha){
        this.login = login;
        this.senha = senha;
    }
    public String getlogin(){
        return login;
    }
    public int getsenha(){
        return senha;
    }
}
