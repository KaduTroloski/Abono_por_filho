import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.SQLOutput;
import java.util.Scanner;

public class abono {
    public static void main(String[] args) throws IOException{
        String nome, nomemaior, nomemenor, cont;
        Integer filhos, abonofilho, qtdfilhos, dias, i, qtdmaior2600;
        Double salario, maiorsalario, menorsalario, media, salariototal, somasalario;
        Scanner ler = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        qtdmaior2600 = 0;
        i = 0;
        nomemenor = "";
        nomemaior = "";
        somasalario = Double.valueOf(0);
        qtdfilhos = 0;
        menorsalario = Double.valueOf(99999999);
        maiorsalario = Double.valueOf(0);
        cont = "S";
        while (cont.equals("S")) {
            i = i + 1;
            System.out.print("Digite o nome do funcionario: ");
            nome = br.readLine();
            System.out.print("Digite o salario do funcionario: ");
            salario = ler.nextDouble();
           System.out.print("Digite os dias trabalhados do funcionario: ");
            dias = ler.nextInt();
            System.out.print("Digite o numero de filhos do funcionario: ");
            filhos = ler.nextInt();
            qtdfilhos = qtdfilhos + filhos;
            if(filhos == 0){
                abonofilho = 0;
            } else {
            if (filhos == 1) {
                abonofilho = 100;
            } else {
                if (filhos == 2) {
                    abonofilho = 200;
                } else {
                    if (filhos == 3) {
                        abonofilho = 300;
                    } else {
                        if (filhos == 4) {
                            abonofilho = 400;
                        } else {
                            abonofilho = 400;
                            }
                        }
                     }
                }
            }
                salariototal = salario * dias;
                salariototal = salariototal / 30;
                salariototal = salariototal + abonofilho;
                System.out.println(nome + ", Seu salario total é de: " + salariototal);
                System.out.print("deseja continuar(S/N): ");
                cont = ler.next().toUpperCase();
                somasalario = somasalario + salariototal;
                System.out.println("/////////////////////////////////////////////////////////////////////");
                if (salariototal >= 2600) {
                    qtdmaior2600 = qtdmaior2600 + 1;
                }
                    if (maiorsalario < salariototal) {
                        maiorsalario = salariototal;
                        nomemaior = nome;
                    }
                        if (menorsalario > salariototal) {
                            menorsalario = salariototal;
                            nomemenor = nome;
                        }



            }
            media = somasalario / i;
            System.out.println("A soma dos salarios é: " + somasalario);
            System.out.println("O menor salario é do(a): " + nomemenor + ", com o valor de: " + menorsalario);
            System.out.println("O maior salario é do(a): " + nomemaior + ", com o valor de: " + maiorsalario);
            System.out.println("A media dos salarios é: " + media);
            System.out.println("Quantidade de funcionarios coim salario superior a 2600: "+qtdmaior2600);
            System.out.println("A quanttidade total de filhos: "+qtdfilhos);

    }
}
