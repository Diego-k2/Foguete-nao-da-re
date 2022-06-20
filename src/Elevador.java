import java.util.Scanner;

public class Elevador {

    private int andarTotal;
    private int qntdAndar;
    private int capacidadeElevador = 10;
    private int pessoasPresentesElevador = 0;


    public int getAndarTotal() {
        return andarTotal;
    }

    public void setAndarTotal(int andarTotal) {
        this.andarTotal = andarTotal;
    }

    public int getQntdAndar() {
        return qntdAndar;
    }

    public void setQntdAndar(int qntdAndar) {
        this.qntdAndar = qntdAndar;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasPresentesElevador() {
        return pessoasPresentesElevador;
    }

    public void setPessoasPresentesElevador(int pessoasPresentesElevador) {
        this.pessoasPresentesElevador = pessoasPresentesElevador;
    }



    public void entra(){
        this.pessoasPresentesElevador += 1;
    }

    public void sai(){
        this.capacidadeElevador-= 1;
    }

    public void sobe(String elevador){

        if(elevador.equals("entrada")){
            if(andarTotal == 0 || andarTotal == -1){
                System.out.println("Digite o andar que você deseja ir");
                Scanner entrada = new Scanner(System.in);
                int andar = entrada.nextInt();
                switch(andar){
                    case(2):
                        System.out.println("Subindo para o segundo andar");
                        andarTotal = 2;
                        break;
                    case(4):
                        System.out.println("Subindo para o quarto andar");
                        andarTotal = 4;
                        break;
                    case(5):
                        System.out.println("Subindo para o quinto andar");
                        andarTotal = 5;
                        break;
                    default:
                        System.out.println("Este elevador não presta serviço para esse andar");
                }
            }

        }else if(elevador.equals("atrio")){

        } else if(elevador.equals("biblioteca")){

        } else {
            System.out.println("Elevador não existe");
        }
    }

    public void desce(String elevador){

        if(elevador.equals("entrada")){

        } else if(elevador.equals("atrio")){

        } else if(elevador.equals("biblioteca")) {

        } else {
            System.out.println("Elevador não existe");
        }

    }




}
