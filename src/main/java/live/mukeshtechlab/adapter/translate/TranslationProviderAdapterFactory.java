package live.mukeshtechlab.adapter.translate;

import live.mukeshtechlab.adapter.translate.translationProviderAdapter.GoogleTranslationProviderAdapter;
import live.mukeshtechlab.adapter.translate.translationProviderAdapter.MicrosoftTranslationProviderAdapter;
import live.mukeshtechlab.adapter.translate.translationProviderAdapter.TranslationProviderAdapter;

public class TranslationProviderAdapterFactory {
    public static TranslationProviderAdapter getTranslationProviderAdapter(TranslationProviderType providerType){
        if(providerType.equals(TranslationProviderType.GOOGLE)){
            return new GoogleTranslationProviderAdapter();
        }

        else if (providerType.equals(TranslationProviderType.MICROSOFT)){
            return new MicrosoftTranslationProviderAdapter();
        }

        throw new IllegalArgumentException("Translation ProviderType is Invalid");
    }
}
