package live.mukeshtechlab.adapter.translate;

import live.mukeshtechlab.adapter.translate.translationProviderAdapter.TranslationProviderAdapter;

import java.util.List;

public class TranslationManager {
    private TranslationProviderAdapter translationProviderAdapter;

    public TranslationManager(TranslationProviderAdapter translationProviderAdapter) {
        this.translationProviderAdapter = translationProviderAdapter;
    }

    public String translate(
            String text,
            String sourceLanguage,
            String targetLanguage,
            String provider
    ) {
        return translationProviderAdapter.translate(
                new TranslationRequest(text, sourceLanguage, targetLanguage, 0.8)
        );
    }

    public List<String> getSupportedLanguages() {
        return translationProviderAdapter.getSupportedLanguages();
    }

}
