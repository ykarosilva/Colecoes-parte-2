
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class SepararPorSexo {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Map<String, String> pessoas = new HashMap<>();

	        while (true) {
	            System.out.print("Informe o nome da pessoa \n"
	            		+ "Digite 'sair' para encerrar");
	            String nome = in.nextLine();

	            if (nome.equalsIgnoreCase("sair")) {
	                break;
	            }

	            System.out.print("Informe o sexo da pessoa (Masculino/Feminino): ");
	            String sexo = in.nextLine();

	            pessoas.put(nome, sexo);
	        }

	        Map<String, String> masculino = new HashMap<>();
	        Map<String, String> feminino = new HashMap<>();

	        for (Map.Entry<String, String> entry : pessoas.entrySet()) {
	            String nome = entry.getKey();
	            String sexo = entry.getValue();

	            if (sexo.equalsIgnoreCase("Masculino")) {
	                masculino.put(nome, sexo);
	            } else if (sexo.equalsIgnoreCase("Feminino")) {
	                feminino.put(nome, sexo);
	            }
	        }

	        System.out.println("\nPessoas do sexo masculino:");
	        for (Map.Entry<String, String> entry : masculino.entrySet()) {
	            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
	        }

	        System.out.println("\nPessoas do sexo feminino:");
	        for (Map.Entry<String, String> entry : feminino.entrySet()) {
	            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
	        }
	    }
	}


