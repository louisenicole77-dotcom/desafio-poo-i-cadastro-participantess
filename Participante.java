public class Participante {
    private String nome;
    private String email;
    private String tipoParticipacao;

    public Participante(String nome, String email, String tipoParticipacao) {
        this.nome = nome;
        this.email = email;
        this.tipoParticipacao = tipoParticipacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoParticipacao(String tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Tipo de participação: " + tipoParticipacao);
        System.out.println("-----------------------------------");
    }
}
