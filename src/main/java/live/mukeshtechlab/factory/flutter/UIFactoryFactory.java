package live.mukeshtechlab.factory.flutter;

import live.mukeshtechlab.factory.flutter.components.uiFactory.AndroidUIFactory;
import live.mukeshtechlab.factory.flutter.components.uiFactory.IosUIFactory;
import live.mukeshtechlab.factory.flutter.components.uiFactory.UIFactory;
import live.mukeshtechlab.factory.flutter.components.uiFactory.WindowsUIFactory;


// UIFactory Helper Class
public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform os){
        if(os.equals(os.ANDROID)){
            return new AndroidUIFactory();
        }
        else if (os.equals(os.IOS)){
            return new IosUIFactory();
        }
        else if (os.equals(os.WINDOWS)){
            return new WindowsUIFactory();
        }
        throw new RuntimeException("Platform doesn't support. Please use Android, iOS, or Windows only.");
    }
}
