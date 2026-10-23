public class TecnicoHardware extends Tecnico implements Atendimento{
    public TecnicoHardware(String nome){
        super(nome,"Hardware");
    }

    @Override
    public void realizarAtendimento(){
        System.out.println("Técnico de hardware " + getNome() + " esta realizando manutencão física sendo troca de peça ou limpeza.");
    }
}
