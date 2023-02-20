import java.util.ArrayList;
import java.util.Collections;

public class ArraysOchListor {
    public static void main(String[] args) {

        // Array[] - lista av värden som ligger i rad i minnet, statisk storlek.
        // Olika listor - ArrayList(), Hashet(), Hashmap(), LinkedList().

        // En array ar en rad med data som ligger i minne.
        // int[] nuffror1 = new int[3];
        // int[] nuffror2 = {1, 2, 3};


        int[] nuffror1 = new int[3];
        nuffror1[0] = 13;
        nuffror1[1] = 37;
        nuffror1[2] = 1337;

        int[] nuffror2 = {1, 2, 3};
        System.out.println(nuffror2[1]);
        System.out.println("--------------------------\n");

        // ---------- LISTOR ----------
        //Listor växer dynamiskt, arrayer är statiskt stora.
        //ArrayList() - en dynamisk samling av objekt som kan växa eller krympa efter behov
        //Hashet() - Datastruktur i Java som används för att lagra unika element utan att tillåta () -> dubletter
        //Hashmap() - Datastruktur i java som tillåter lagring av värden i par av nycklar och värden.

        //LinkedList() - Datastruktur som består av en kedja av noder där varje nod har en referens till nästa nod och som
        // möjliggör dynamiskt läggande tilloch borttagande av element.
        // ---------- ----------


        // C.R.U.D (L)
        // Crud även kallad CRUDL är ett mänster man alltid följer när man arbetar med datamängder.
        // C - create, R -read, U - update, D - Delete, L - List (brukar klassifieras i R delen.

        //ARRAYLISTOR

        // Arraylist - add / create
        // <array>.add = ("");
        // Arraylist - read.
        // Man använder Get metoden för att hämta ut värdet vid ett specifikt index. På en array skriver man [1]
        // men på en lista blir det Get(1).
        // String andraElementet = minLista.get(1);
        //System.out.println("andraElementet")

        // Update, när man uppdaterar använder man Set, som inparameter skickar man in index och vilket värde som ska stoppas in:
        //  minLista.set(1, "Pear");

        //Remove, remove används för att ta bort ett element ur listan, man gör det genom att ange position. Vilket index den befinner sig på.
        // minLista.remove(0);

        //Skriva ut innehållet i lista
        //System.out.prntln("Element i listan);
        //for (String element : minLista) {
        //System.out.println(element);

        // ------------------------------------------------------------------
        // Array är INTE dynamisk
        // ArrayList ÄR dynamisk
        // ------------------------------------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2001);
        list.add(2010);
        list.add(2015);

        for (int i = 0; i < list.size(); i++) { // printa ut alla index.
            System.out.println("index " + i + " : " + list.get(i));
        }
        list.remove(0); // tar bort index 0, vilket är start-index.
        System.out.println(" ------------------------------------------------------------------");

        for (int i = 0; i < list.size(); i++) { // printa ut alla index, igen.
            System.out.println("index " + i + " : " + list.get(i));
        }
        Integer[] myArray = {1, 2, 3, 4, 5};
        Collections.addAll(list, myArray);

        if (list.contains(2001)) { // ser om 2001 finns i list listan.
            System.out.println("Boken finns");
        } else {
            System.out.println("Boken finns inte");
        }

        int bokPos = list.indexOf(2001); // hämta "2001" nuvarande index (plats).
        System.out.println("Boken finns på index " + bokPos);


        // list.ensureCapacity(); // bestämmer storleken på listan.
list.lastIndexOf();
        list.add();
        list.addAll();
        list.clear(); //rensa lista
        list.contains(); //söka upp något i lista
        list.indexOf(); // söka efter specifikt värde.
        list.remove(); // tar bort objekt, eller int index.
        list.sort(); // sortera listan snyggt
        list.toArray() // omvandlar listan till array.
        list.trimToSize(); // återskapar listan på fint sätt
        list.set(); // Update index pos?
        list.forEach(System.out::println);

        System.out.println("--------------------------\n");
    }
}
