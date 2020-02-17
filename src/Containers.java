import javax.lang.model.type.IntersectionType;
import java.lang.reflect.Array;
import java.util.*;


public class Containers {
    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<>();
        
        // Afegeix els números 10, 20 i 15
        l1.add(10);
        l1.add(20);
        l1.add(15);

        // Imprimeix la llista
        System.out.println(l1);

        // Elimina el segon element
        l1.remove(1);

        // Imprimeix la llista
        System.out.println(l1);

        // Crea llista d'enters anomenada "l2"
        List<Integer> l2 = new ArrayList<>();

        // Afegeix els números 3, 6 i 9
        l2.add(3);
        l2.add(6);
        l2.add(9);
 
        // Afegeix la llista l1 a la llista l2
        l1.addAll(l2);

        // Imprimeix la llista l2
        System.out.println(l1);

        // Elimina tots els valors de l1
        l1.clear();

        // Afegeix els tres primers elements de l2 a l1
        l1.add(l2.get(0));
        l1.add(l2.get(1));
        l1.add(l2.get(2));

        // Comprova si dins l1 hi ha el número 6
        System.out.println(l1.contains(6));

        // Afegeix el numero 6 un altre cop a l1 al principi de la llista

        l1.add(0,l2.get(1));
        System.out.println(l1);

        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        System.out.println(l1.indexOf(9));
        System.out.println(l1);

        // A l1, substitueix l'element a la posició 1 per el valor 5
        l1.set(1,5);
        System.out.println(l1);

        // A l1, insereix a la posició 2 l'element 4
        l1.set(2,4);

        // Imprimeix la llista l1
        System.out.println(l1);

        // Converteix l1 a array i imprimeix-ho
        Integer[] i = new Integer[l1.size()];

        for (int j = 0; j < i.length; j++) {
            i[j] = l1.get(j);
        }

        Integer[] ar = new Integer[l1.size()];
        l1.toArray(ar);
        System.out.println(Arrays.toString(ar));




    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
        List<Integer> l1 = new ArrayList<>();

        // Afegeix a l1 els elements 10, 20, 50 i 90
        l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(90);

        // Treu Iterator (it)
        Iterator<Integer> it = l1.iterator();

        // Mentre hi hagi element següent, imprimeix l'element

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

        // Torna a crear l'objecte iterator i has de recórrer la llista, però has d'esborrar l'element "50"
        it = l1.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i == 50) {
                it.remove();
            }

        }

        // Imprimeix la llista
        it = l1.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println(element);
        }

        // Crea un ListIterator de la llista l1 (anomenat "li")

        ListIterator<Integer> li = l1.listIterator();
 
        // Avança l'iterador fins al final de la llista

        while (li.hasNext()) {
            li.next();
        }

        // Recorre la llista al reves amb l'iterador, imprimint els elements


        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        while (li.hasNext()) {
            System.out.printf("Numero: %d , Index: %d ", li.next(), li.nextIndex());
            System.out.println();
        }

    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList

        Queue<Integer> cua = new LinkedList<>();

        // Afegeix els elements 12, 14 i 99 a la cua

        cua.add(12);
        cua.add(14);
        cua.add(99);

        // Mostra el primer element (sense treurer-lo) de la cúa i imprimeix-ho

        

        // Treu el primer element de la cúa

        // Imprimeix la cúa


        // Declara una cúa de prioritat anomenada "cuaPrioritat"

        // Afegeix els elements 5, 2, -1, 9 i 7

        // Imprimeix la cúa

        // Fes un bucle que vagi traient cada element i l'imprimeixi de la cúa de prioritat, mentre en quedin

    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList
        LinkedList<Integer> stack = new LinkedList<>();
        // Igual que una pila con linkedlist pero podemos quitar por las dos partes.
        //Deque<Integer> stack2 = new LinkedList<>();

        // Push a la pila dels valors 15, 56, 21 i -5
        stack.push(15);
        stack.push(56);
        stack.push(21);
        stack.push(-5);
        // Imprimeix la pila
        /*for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }*/

        for (Object i: stack) {
            System.out.println(i);
        }
        // Imprimeix el valor de damunt la pila, sense treurer-lo
        System.out.println(stack.getFirst());

        // Treu i imprimeix els valors de la pila
        int aux = 0;
        while (aux <= stack.size()) {
            System.out.println("El stack actual: ");
            for (Object i : stack) {
                System.out.println(i);
            }
            System.out.println("Quitamos el primero");
            System.out.println(stack.getFirst());
            stack.removeFirst();
            aux++;
        }


    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"
        Set<Integer> l1 = new HashSet<>();

        // Afegeix els elements 14, 6 i 3
        l1.add(14);
        l1.add(6);
        l1.add(3);

        // Imprimeix el conjunt
        System.out.println(l1);
        // Afegeix l'element 6 un altre cop
        l1.add(6);
        // Imprimeix el conjunt
        System.out.println(l1);

        // Construeix un conjunt de caràcters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Després, imprimeix el conjuntj
        String s = "ESTERNOCLEIDOMASTOIDEO";

        Set<Character> i = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            i.add(s.charAt(j));
        }
        System.out.println(i);

        // Empra un iterador (it) per recórrer tot el conjunt de caràcters anterior i imprimeix element a element
        Iterator<Character> it = i.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String
        Map<String, String> map = new HashMap<>();

        // Introdueix el parell: "RENAULT" - "CLIO"
        map.put("RENAULT","CLIO");
        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"
        map.put("VOLKSWAGEN","GOLF");
        // Introdueix el parell: "PEUGEOT" - "308"
        map.put("PEUGEOT","308");
        // Introdueix el parell: "HONDA" - "CIVIC"
        map.put("HONDA","CIVIC");
        // Introdueix el parell: "PEUGEOT" - "RCZ"
        map.put("PEGUEOT" , "RCZ");
        // Imprimeix el mapa
        System.out.println(map);

        // Treu el conjunt de claus del mapa (variable kset)
        Set<String> aux = map.keySet();

        // Imprimeix aquest conjunt
        System.out.println(aux);

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho
        System.out.println(map.get("PEUGEOUT"));


        // Mitjançant un iterador, imprimeix tots els parells clau-valor del mapa
        Iterator<String> it = aux.iterator();

        // Empra un mapa que associi un caràcter a un número enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"

        System.out.println("-----------------------------------------------------------");
        Map<Character, Integer> mapa = new HashMap<>();
        String aux2 = "ESTERNOCLEIDOMASTOIDEO";

        for (int i = 0; i < aux2.length(); i++) {
            if (mapa.containsKey(aux2.charAt(i))) {
                int aux3 = mapa.get(aux2.charAt(i));
                mapa.remove(aux2.charAt(i));
                mapa.put(aux2.charAt(i),(aux3 + 1));
            } else {
                mapa.put(aux2.charAt(i),1);
            }
        }

        System.out.println(mapa);
        
        
    }
}

