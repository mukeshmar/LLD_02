package live.mukeshtechlab.factory.flutter.uiFactory;

import live.mukeshtechlab.factory.flutter.components.button.Button;
import live.mukeshtechlab.factory.flutter.components.dropDown.DropDown;
import live.mukeshtechlab.factory.flutter.components.menu.Menu;


// Abstract Factory
public interface UIFactory {

    // Below all are Factory Methods
    public Button createButton();
    public DropDown createDropDown();
    public Menu createMenu();
}
