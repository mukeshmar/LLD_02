package live.mukeshtechlab.adapter.translate.translationProviderAdapter;

import live.mukeshtechlab.adapter.translate.TranslationRequest;
import live.mukeshtechlab.adapter.translate.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationProviderAdapter implements TranslationProviderAdapter {
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(
                translationRequest.getText(),
                translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage()
        );
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
