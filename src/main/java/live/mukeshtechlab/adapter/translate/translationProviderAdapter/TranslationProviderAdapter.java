package live.mukeshtechlab.adapter.translate.translationProviderAdapter;

import live.mukeshtechlab.adapter.translate.TranslationRequest;

import java.util.List;

public interface TranslationProviderAdapter {
    public String translate(TranslationRequest translationRequest);
    public List<String> getSupportedLanguages();
}