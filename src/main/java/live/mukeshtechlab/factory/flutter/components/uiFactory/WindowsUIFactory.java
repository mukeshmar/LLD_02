package live.mukeshtechlab.factory.flutter.components.uiFactory;

import live.mukeshtechlab.factory.flutter.components.button.Button;
import live.mukeshtechlab.factory.flutter.components.button.WindowsButton;
import live.mukeshtechlab.factory.flutter.components.dropDown.DropDown;
import live.mukeshtechlab.factory.flutter.components.dropDown.WindowsDropDown;
import live.mukeshtechlab.factory.flutter.components.menu.Menu;
import live.mukeshtechlab.factory.flutter.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
