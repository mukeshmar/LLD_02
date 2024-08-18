package live.mukeshtechlab.adapter.translate;

public class Client {
    public static void main(String[] args) {

        TranslationManager translationManager = new TranslationManager(
                TranslationProviderAdapterFactory.getTranslationProviderAdapter(
                        TranslationProviderType.GOOGLE
                )
        );

        String afterTranslate = translationManager.translate(
                "Hello World",
                "English",
                "Hindi",
                "Mukesh"
        );

        System.out.println(afterTranslate);

        System.out.println(translationManager.getSupportedLanguages());

    }
}
