package com.bytedance.p126ad.symphony.provider;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.p126ad.symphony.p129b.C2698c;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.provider.C2749a.C2751a;

/* renamed from: com.bytedance.ad.symphony.provider.AbsInterstitialAdProvider */
public abstract class AbsInterstitialAdProvider extends C2749a<Object, C2698c> {
    public static final int ADMOB_PROVIDER_ID = getInterstitialAdProviderId(2);
    public static final int FACEBOOK_PROVIDER_ID = getInterstitialAdProviderId(1);
    public static final SparseArray<C2751a> SUPPORT_INTERSTITIAL_AD_PROVIDERS = new SparseArray<>();

    public static int getInterstitialAdProviderId(int i) {
        return i + 50;
    }

    static {
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(FACEBOOK_PROVIDER_ID, new C2751a(FACEBOOK_PROVIDER_ID, "interstitial-facebook", "com.bytedance.ad.symphony.interstitial.fb.FbInterstitialAdProvider"));
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(ADMOB_PROVIDER_ID, new C2751a(ADMOB_PROVIDER_ID, "interstitial-admob", "com.bytedance.ad.symphony.interstitial.admob.AdMobInterstitialAdProvider"));
    }

    public static boolean isAdMobInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == ADMOB_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == FACEBOOK_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public AbsInterstitialAdProvider(Context context, C2723a aVar, C2698c cVar) {
        super(context, aVar, cVar);
    }
}
