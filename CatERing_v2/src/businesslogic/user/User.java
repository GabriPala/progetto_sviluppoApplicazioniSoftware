package businesslogic.user;

public class User {

    /*dipende dal evento/menù in cui è stato chiamato? in questo caso bisogna passare qualcosa come parametro e non
      basta aver due boolean*/

    private boolean chef;               // modificato
    private boolean organizer;          // modificato

    public boolean isChef() {
        // TODO: questo è da implementare, versione di prova
        return chef;            // modificato
    }

    public boolean isOrganizer() {
        return organizer;
    }
}
