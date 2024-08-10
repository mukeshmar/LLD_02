package live.mukeshtechlab.factory.flutter.uiFactory;

import live.mukeshtechlab.factory.flutter.components.button.AndroidButton;
import live.mukeshtechlab.factory.flutter.components.button.Button;
import live.mukeshtechlab.factory.flutter.components.dropDown.AndroidDropDown;
import live.mukeshtechlab.factory.flutter.components.dropDown.DropDown;
import live.mukeshtechlab.factory.flutter.components.menu.AndroidMenu;
import live.mukeshtechlab.factory.flutter.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
