package live.mukeshtechlab.adapter.translate.translationProviderAdapter;

import live.mukeshtechlab.adapter.translate.TranslationRequest;
import live.mukeshtechlab.adapter.translate.external.GoogleTranslateApi;
import live.mukeshtechlab.adapter.translate.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationProviderAdapter implements TranslationProviderAdapter {

    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest translationRequest) {
        return googleTranslateApi.convert(new GoogleTranslationRequest(
            translationRequest.getText(),
            translationRequest.getSourceLanguage(),
            translationRequest.getTargetLanguage(),
            translationRequest.getConfidenceThreshold()
        ));
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
