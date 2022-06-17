package eraser;
import java.util.ArrayList;

public class Eraser4 {

    /*
     * Cet algorithme s'inspire de l'algorithme 2 et du 3.
     * Il ajoute les caractères un à un dans un ArrayList, et lorsqu'un espace est rencontré, il 
     * vérifie si le caractère précédent était un espace, grâce à la variable etaitEspace.
     * Si un espace était présent avant, il ajoute l'espace dans le même indice de l'ArrayList que l'ancien espace, 
     * ce qui fait qu'à la fin les espaces seuls se retrouvent seuls dans un indice de l'ArrayList.
     * Il n'a donc pas besoin de vérifier le caractère précédent, car la variable etaitEspace est présente, ce qui
     * le rend plus optimisé que l'algorithme 3.
     * 
     */
    public static String erase(String str) {

        if (str.equals("")) {
            return "";
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(Character.toString(str.charAt(0)));
        int itab = 0;


        int len = str.length();
        int i;
        boolean etaitEspace = false;

        for (i=1 ; i<len ; i++) {

            String car = Character.toString(str.charAt(i));

            //Si le caractère n'est pas un espace
            if (! car.equals(" ")) {
                arrayList.add(car);
                etaitEspace = false;
                itab++;

            //Si le caractère est un espace
            } else {

                //Si le caractère précédent était un espace
                if (! etaitEspace) {
                    arrayList.add(" ");
                    etaitEspace = true;
                    itab++;

                //Si c'est le premier espace trouvé
                } else {
                    arrayList.set(itab,arrayList.get(itab)+" ");
                }
            }
        }

        ArrayList<String> aRemove = new ArrayList<String>();
        aRemove.add(" ");

        //On supprime tous les espaces solitaires de l'ArrayList
        arrayList.removeAll(aRemove);

        return String.join("", arrayList);
    }
    
}