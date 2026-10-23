public class Computador {
    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado;

    public Computador(){}

    public Computador(String patrimonio, String modelo, String sistemaOperacional){
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.ligado = false;
    }

    public String getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(String patrimonio){
        this.patrimonio = patrimonio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getSistemaOperacional(){
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void exibirInformacoes() {
        System.out.println("Patrimonio: " + patrimonio + " | Modelo: " + modelo + " | SO: " + sistemaOperacional);
    }
}
