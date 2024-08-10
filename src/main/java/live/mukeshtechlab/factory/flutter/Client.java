package live.mukeshtechlab.factory.flutter;

import live.mukeshtechlab.factory.flutter.components.button.Button;
import live.mukeshtechlab.factory.flutter.components.dropDown.DropDown;
import live.mukeshtechlab.factory.flutter.components.menu.Menu;
import live.mukeshtechlab.factory.flutter.uiFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        // Create UIFactory
        UIFactory uiFactory = flutter.getUiFactory(Platform.ANDROID);

        // Button
        Button button = uiFactory.createButton();
        button.clickButton();

        // Drop-Down
        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();

        // Menu
        Menu menu = uiFactory.createMenu();
        menu.getMenu();

    }
}
