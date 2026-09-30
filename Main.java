public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Ana", "ana@email.com", "Cosplay");
        Participante participante2 = new Participante("Bruno", "bruno@email.com", "Campeonato");
        Participante participante3 = new Participante("Carla", "carla@email.com", "Palestra");

        System.out.println("=== CADASTRO DE PARTICIPANTES ===");
        participante1.exibirInformacoes();
        participante2.exibirInformacoes();
        participante3.exibirInformacoes();

        participante1.setEmail("ana.novo@email.com");

        System.out.println("=== TESTE DE ALTERAÇÃO ===");
        System.out.println("Novo e-mail de Ana: " + participante1.getEmail());
    }
}
