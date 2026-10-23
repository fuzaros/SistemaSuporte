public class Chamado {
    private int numero;
    private String descricao;
    private String status;

    private Computador computador;
    private Tecnico tecnico;

    private static int totalChamados = 0;

    public Chamado(int numero, String descricao, String status){
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
        totalChamados++;
    }

    public static int getTotalChamados(){
        return totalChamados;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public Computador getComputador() {
        return computador;
    }
    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }



    public void exibirDetalhesChamado(){
        System.out.println("=== CHAMADO #" + numero + " ===");
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
        if (computador != null){
            System.out.println("Computador Vinculado -> ");
            computador.exibirInformacoes();
        }

        if (tecnico != null){
            System.out.println("Técnico responsavel: " + tecnico.getNome() + "( "+ tecnico.getEspecialidade() + ")" );
        }
        System.out.println("-----------------------------------");
    }
}
