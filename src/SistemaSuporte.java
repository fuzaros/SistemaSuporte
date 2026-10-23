public class SistemaSuporte {
    public static void main(){
        String nomeSistema = "IT Solutions HelpDesk";
        String versao = "1.0";
        String nomeTecnico = "Wallyson Gomes";
        int chamadosAbertos = 4;
        String statusSistema = "Operacional";

        System.out.println("=== " + nomeSistema + " ===");
        System.out.println("Versão: " + versao);
        System.out.println("Técnico responsavel:" + nomeTecnico);
        System.out.println("Status do Sistema: " + statusSistema);
        System.out.println("Chamados Abertos Atuais: " + chamadosAbertos);
        System.out.println("------------------------------------------");
        if (chamadosAbertos > 0){
            System.out.println("Status: Existem chamados aguardando atendimento.");
        }else{
            System.out.println("Status: Nenhum chamado pendente.");
        }
    }
}
