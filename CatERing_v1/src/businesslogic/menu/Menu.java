package businesslogic.menu;

import businesslogic.user.User;
import java.util.ArrayList;

public class Menu {
    private String title;
    private boolean published;
    private boolean inUse;
    private String[] features;
    private boolean[] featureValues;
    private ArrayList<MenuItem> freeItems;
    private ArrayList<Section> sections;

    private User owner;

    public Menu(User user, String title, String[] menuFeatures) {
        if (title != null) {
            this.title = title;
        }

        this.owner = user;

        this.features = menuFeatures;

        this.sections = new ArrayList<>();
        this.freeItems = new ArrayList<>();

        this.featureValues = new boolean[menuFeatures.length];
    }
}
