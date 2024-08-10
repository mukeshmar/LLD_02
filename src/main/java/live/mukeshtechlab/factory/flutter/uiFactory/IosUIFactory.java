package live.mukeshtechlab.factory.flutter.uiFactory;

import live.mukeshtechlab.factory.flutter.components.button.Button;
import live.mukeshtechlab.factory.flutter.components.button.IosButton;
import live.mukeshtechlab.factory.flutter.components.dropDown.DropDown;
import live.mukeshtechlab.factory.flutter.components.dropDown.IosDropDown;
import live.mukeshtechlab.factory.flutter.components.menu.IosMenu;
import live.mukeshtechlab.factory.flutter.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
