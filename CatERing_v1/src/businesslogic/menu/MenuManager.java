package businesslogic.menu;

import businesslogic.UseCaseLogicException;
import businesslogic.user.User;

import java.util.ArrayList;

public class MenuManager {
    private String[] menuFeatures;
    private Menu currentMenu;
    private ArrayList<MenuEventReceiver> eventReceivers;

    public Menu createMenu() throws UseCaseLogicException {
        return this.createMenu(null);
    }

    public Menu createMenu(String title) throws UseCaseLogicException {
        User user=null;// = userMgr.getCurrentUser();

        if (!user.isChef()) {
            throw new UseCaseLogicException();
        }

        Menu m = new Menu(user, title, menuFeatures);
        this.setCurrentMenu(m);
        this.notifyMenuAdded(m);

        return m;
    }

    private void notifyMenuAdded(Menu m) {
        for (MenuEventReceiver er: this.eventReceivers) {
            er.updateMenuCreated(m);
        }
    }

    public void setCurrentMenu(Menu m) {
        this.currentMenu = m;
    }
}
