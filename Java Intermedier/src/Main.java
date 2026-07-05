import Carro.Carro2;

import java.util.*;

public class Main{
    public static void main(String[] args){

        Carro2 sandero = new Carro2("Sandero", "Preto", 2020, "AVC098");

        List<String> list = new ArrayList<>();
        list.add("Felype Moura");
        list.add("Luis Felype");
        list.add("Luis Martins");
        list.add("Felype Martins");
        list.add("Felype Souza");

        System.out.println("List " + list);

        Set<String> Nomes = new HashSet<>();
        Nomes.add("Hello");
        Nomes.add("Hello");
        Nomes.add("Luis");

        System.out.println("SetStrings " + Nomes);
        System.out.println("SetStrings " + Nomes.contains("Luis"));

        Map<String, String> map = new HashMap<>();

        map.put("name", "Luis");
        map.put("lastName", "Martins");

        System.out.println(map.get("name"));

        Queue<String> queue = new LinkedList<>();
        queue.add("Fernanda");
        queue.add("Kipper");

        System.out.println("Queue " + queue);
        System.out.println("Queue " + queue.peek());
        System.out.println("Queue " + queue);

        //Stream API
        //Realizar operações funcionais nas nossas colletions (estrutura de dados)
        //filter, map, agregações de uma coleção

        String felypes = list.stream().filter(nome -> nome.startsWith("Felype")).map(nome -> nome.replaceAll(" ", "" )).reduce("", (a, b) -> a + b);
        System.out.println("Felypes: " + felypes);
    }
}