public class TecnicoSoftware extends Tecnico implements Atendimento{
    public TecnicoSoftware (String nome){
        super(nome,"Software");
    }
    @Override
    public void realizarAtendimento() {
        System.out.println("Técnico de software " + getNome() + " está realizando diagnostico lógico reinstalando drivers.");
    }
}
