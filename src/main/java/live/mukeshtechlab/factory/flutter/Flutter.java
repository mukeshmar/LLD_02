package live.mukeshtechlab.factory.flutter;

import live.mukeshtechlab.factory.flutter.components.uiFactory.UIFactory;

public class Flutter {
    // Factory of Factories / Abstract Factories
    public UIFactory getUiFactory(Platform os){
        return UIFactoryFactory.getUIFactory(os);
    }

    // Non-Factory Methods
    public void refreshUI() {
        System.out.println("Refreshing UI");
    }

    public void setTheme() {
        System.out.println("Setting Theme");
    }
}
