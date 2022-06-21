import java.util.Scanner;

public class Elevador {

    private int andarTotal;
    private int qntdAndar;
    private int capacidadeElevadorAtrio = 10;
    private int capacidadeElevadorEntrada = 10;
    private int capacidadeElevadorBiblioteca = 10;
    private int pessoasPresentesElevadorAtrio = 0;
    private int pessoasPresentesElevadorEntrada = 0;
    private int pessoasPresentesElevadorBiblioteca = 0;


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

    public int getCapacidadeElevadorAtrio() {
        return capacidadeElevadorAtrio;
    }

    public void setCapacidadeElevadorAtrio(int capacidadeElevadorAtrio) {
        this.capacidadeElevadorAtrio = capacidadeElevadorAtrio;
    }

    public int getCapacidadeElevadorEntrada() {
        return capacidadeElevadorEntrada;
    }

    public void setCapacidadeElevadorEntrada(int capacidadeElevadorEntrada) {
        this.capacidadeElevadorEntrada = capacidadeElevadorEntrada;
    }

    public int getCapacidadeElevadorBiblioteca() {
        return capacidadeElevadorBiblioteca;
    }

    public void setCapacidadeElevadorBiblioteca(int capacidadeElevadorBiblioteca) {
        this.capacidadeElevadorBiblioteca = capacidadeElevadorBiblioteca;
    }

    public int getPessoasPresentesElevadorAtrio() {
        return pessoasPresentesElevadorAtrio;
    }

    public void setPessoasPresentesElevadorAtrio(int pessoasPresentesElevadorAtrio) {
        this.pessoasPresentesElevadorAtrio = pessoasPresentesElevadorAtrio;
    }

    public int getPessoasPresentesElevadorEntrada() {
        return pessoasPresentesElevadorEntrada;
    }

    public void setPessoasPresentesElevadorEntrada(int pessoasPresentesElevadorEntrada) {
        this.pessoasPresentesElevadorEntrada = pessoasPresentesElevadorEntrada;
    }

    public int getPessoasPresentesElevadorBiblioteca() {
        return pessoasPresentesElevadorBiblioteca;
    }

    public void setPessoasPresentesElevadorBiblioteca(int pessoasPresentesElevadorBiblioteca) {
        this.pessoasPresentesElevadorBiblioteca = pessoasPresentesElevadorBiblioteca;
    }



    public void entraBiblioteca(){
        this.pessoasPresentesElevadorBiblioteca += 1;
    }
    public void entraEntrada(){
        this.pessoasPresentesElevadorEntrada += 1;
    }
    public void entraAtrio(){
        this.pessoasPresentesElevadorAtrio += 1;
    }

    public void saiBiblioteca(){
        this.capacidadeElevadorBiblioteca-= 1;
    }
    public void saiEntrada(){
        this.capacidadeElevadorEntrada-= 1;
    }
    public void saiAtrio(){
        this.capacidadeElevadorAtrio-= 1;
    }



    public void sobe(String elevador){

        if(elevador.equals("entrada")){
            if(this.capacidadeElevadorEntrada > 0) {
                System.out.println("O elevador da entrada presta serviço para o " +
                        "\n -1° Andar \n 0° Andar\n 2° Andar \n 4° Andar \n 5°Andar");
                if (andarTotal == 0 || andarTotal == -1) {
                    int andar = teclado();
                    switch (andar) {
                        case (2):
                            System.out.println("Subindo para o segundo andar");
                            andarTotal = 2;
                            break;
                        case (4):
                            System.out.println("Subindo para o quarto andar");
                            andarTotal = 4;
                            break;
                        case (5):
                            System.out.println("Subindo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if (andarTotal == 2) {
                    int andar = teclado();
                    switch (andar) {
                        case (4):
                            System.out.println("Subindo para o quarto andar");
                            andarTotal = 4;
                            break;
                        case (5):
                            System.out.println("Subindo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if (andarTotal == 4) {
                    int andar = teclado();
                    switch (andar) {
                        case (5):
                            System.out.println("Subindo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                }
            } else {
                System.out.println("Elevador está lotado");
            }
        }else if(elevador.equals("atrio")){
                if(this.capacidadeElevadorAtrio > 0){
                    System.out.println("O elevador do atrio presta serviço para o " +
                            "\n -1° Andar \n 0° Andar\n 2° Andar \n 3° Andar \n 5°Andar");
                    if(andarTotal == 0 || andarTotal == -1){
                        int andar = teclado();
                        switch(andar){
                            case(2):
                                System.out.println("Subindo para o segundo andar");
                                andarTotal = 2;
                                break;
                            case(3):
                                System.out.println("Subindo para o terceiro andar");
                                andarTotal = 4;
                                break;
                            case(5):
                                System.out.println("Subindo para o quinto andar");
                                andarTotal = 5;
                                break;
                            default:
                                System.out.println("Este elevador não presta serviço para esse andar");
                        }
                    } else if(andarTotal == 2) {
                        int andar = teclado();
                        switch(andar){
                            case(3):
                                System.out.println("Subindo para o terceiro andar");
                                andarTotal = 4;
                                break;
                            case(5):
                                System.out.println("Subindo para o quinto andar");
                                andarTotal = 5;
                                break;
                            default:
                                System.out.println("Este elevador não presta serviço para esse andar");
                        }
                    } else if(andarTotal == 3) {
                        int andar = teclado();
                        switch (andar) {
                            case (5):
                                System.out.println("Subindo para o quinto andar");
                                andarTotal = 5;
                                break;
                            default:
                                System.out.println("Este elevador não presta serviço para esse andar");
                        }
                    }
                } else {
                    System.out.println("O elevador está lotado");
                }
            } else if(elevador.equals("biblioteca")){
                if(this.capacidadeElevadorAtrio > 0){
                    System.out.println("O elevador da entrada presta serviço para o " +
                            "\n -1° Andar \n 0° Andar\n 1° Andar \n 4° Andar \n 5°Andar");
                    if(andarTotal == 0 || andarTotal == -1){
                        int andar = teclado();
                        switch(andar){
                            case(1):
                                System.out.println("Subindo para o primeiro andar");
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
                    } else if(andarTotal == 1) {
                        int andar = teclado();
                        switch(andar){
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
                    } else if(andarTotal == 4) {
                        int andar = teclado();
                        switch (andar) {
                            case (5):
                                System.out.println("Subindo para o quinto andar");
                                andarTotal = 5;
                                break;
                            default:
                                System.out.println("Este elevador não presta serviço para esse andar");
                        }
                    }
                } else {
                    System.out.println("O elevador está lotado");
                }
            } else {
                System.out.println("Elevador não existe");
            }
        }




    public void desce(String elevador){

        if(elevador.equals("entrada")){
            if(this.capacidadeElevadorEntrada > 0) {
                System.out.println("O elevador da entrada presta serviço para o " +
                        "\n -1° Andar \n 0° Andar\n 2° Andar \n 4° Andar \n 5°Andar");
                if (andarTotal == 0 || andarTotal == -1) {
                    int andar = teclado();
                    switch (andar) {
                        case (2):
                            System.out.println("Descendo para o segundo andar");
                            andarTotal = 2;
                            break;
                        case (4):
                            System.out.println("Descendo para o quarto andar");
                            andarTotal = 4;
                            break;
                        case (5):
                            System.out.println("Descendo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if (andarTotal == 2) {
                    int andar = teclado();
                    switch (andar) {
                        case (4):
                            System.out.println("Descendo para o quarto andar");
                            andarTotal = 4;
                            break;
                        case (5):
                            System.out.println("Descendo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if (andarTotal == 4) {
                    int andar = teclado();
                    switch (andar) {
                        case (5):
                            System.out.println("Subindo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                }
            } else {
                System.out.println("Elevador está lotado");
            }
        } else if(elevador.equals("atrio")){
            if(this.capacidadeElevadorAtrio > 0){
                System.out.println("O elevador do atrio presta serviço para o " +
                        "\n -1° Andar \n 0° Andar\n 2° Andar \n 3° Andar \n 5°Andar");
                if(andarTotal == 0 || andarTotal == -1){
                    int andar = teclado();
                    switch(andar){
                        case(2):
                            System.out.println("Descendo para o segundo andar");
                            andarTotal = 2;
                            break;
                        case(3):
                            System.out.println("Descendo para o terceiro andar");
                            andarTotal = 4;
                            break;
                        case(5):
                            System.out.println("Descendo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if(andarTotal == 2) {
                    int andar = teclado();
                    switch(andar){
                        case(3):
                            System.out.println("Descendo para o terceiro andar");
                            andarTotal = 4;
                            break;
                        case(5):
                            System.out.println("Descendo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                } else if(andarTotal == 3) {
                    int andar = teclado();
                    switch (andar) {
                        case (5):
                            System.out.println("Descendo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                }
            } else {
                System.out.println("O elevador está lotado");
            }
        } else if(elevador.equals("biblioteca")) {
            if(this.capacidadeElevadorAtrio > 0){
                System.out.println("O elevador da entrada presta serviço para o " +
                        "\n -1° Andar \n 0° Andar\n 1° Andar \n 4° Andar \n 5°Andar");
                if(andarTotal == 0 || andarTotal == -1){
                    int andar = teclado();
                    switch(andar){
                        case(1):
                            System.out.println("Subindo para o primeiro andar");
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
                } else if(andarTotal == 1) {
                    int andar = teclado();
                    switch(andar){
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
                } else if(andarTotal == 4) {
                    int andar = teclado();
                    switch (andar) {
                        case (5):
                            System.out.println("Subindo para o quinto andar");
                            andarTotal = 5;
                            break;
                        default:
                            System.out.println("Este elevador não presta serviço para esse andar");
                    }
                }
            } else {
                System.out.println("O elevador está lotado");
            }
        } else {
            System.out.println("Elevador não existe");
        }

    }


    private int teclado(){
        System.out.println("Digite o andar que você deseja ir");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }





}
