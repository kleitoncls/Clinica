
import java.util.Scanner;

public class Clinica {
    public static void main(String[] args){
        Scanner pq = new Scanner(System.in);
        System.out.println("Digite 1 para cadastrar médico ou 2 para paciente e 3 para criar novos atendimento.");

        int resposta = pq.nextInt();


        if(resposta ==1) {
            Paciente p1 = new Paciente();
            System.out.println("Informe o nome do paciente: ");
            Scanner sc = new Scanner(System.in);
            p1.nome = sc.nextLine();
            System.out.println("Possui qual plano de saude?");
            p1.planodeSaude=sc.nextLine();
            System.out.println("Informe o endereço do paciente: ");
            p1.endereco = sc.nextLine();
            System.out.println("Data de nascimento");
            p1.datadenascimento = sc.nextLine();
            System.out.println("informe o Telefone: ");
            p1.telefone = sc.nextLine();
            System.out.println("Nome"+ p1.nome);
            System.out.println("Endereço: " + p1.endereco);
            System.out.println("Data de nascimento: " + p1.endereco);
            System.out.println("Numero de telefone: " + p1.telefone);
        } else if(resposta ==2){
            Medico m1 = new Medico();

            System.out.println("Inform o nome do medico: ");
            Scanner sc = new Scanner(System.in);
            m1.Nome=sc.nextLine();
            System.out.println("Informe o endereço do médico: ");
            m1.endereco=sc.nextLine();
            System.out.println("Informe a especialidade do médico: ");
            m1.especialidade=sc.nextLine();
            System.out.println("Informe o cpf do medico: ");
            m1.cpf=sc.nextLine();
            System.out.println("informe a data de nascimento: ");
            m1.datadenascimento=sc.nextLine();
            System.out.println("Informar o CRM");
            m1.crm=sc.nextLine();
            System.out.println("Dr."+m1.Nome);
            System.out.println("Endereço "+m1.endereco);
            System.out.println("Especialidade é:"+m1.especialidade);
            System.out.println("Numero do CRM é :"+m1.crm );

        }else{
            AtendimentoMedico a1= new AtendimentoMedico();
            System.out.println("Informe o nome do paciente");
            Scanner sc = new Scanner(System.in);
            a1.nome=sc.nextLine();
            System.out.println("Sintomas do paciente: ");
            a1.sintomas=sc.nextLine();
            System.out.println("Uso de alguma medicaçao?");
            a1.medicacaoUso=sc.nextLine();
            System.out.println("Possui alguma doença cronica?");
            a1.doencaCronica=sc.nextLine();
            System.out.println("Alergico a algum medicamento?");
            a1.efeitoRemedio=sc.nextLine();
            System.out.println("Data do agendamento: ");
            a1.data=sc.nextLine();
            System.out.println("Paciente "+a1.nome);
            System.out.println("Data do atendimento: " +a1.data);
            System.out.println("Alergico: "+a1.efeitoRemedio);


        }


    }
}
