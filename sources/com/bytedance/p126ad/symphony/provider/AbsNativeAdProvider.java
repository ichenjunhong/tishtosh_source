package com.bytedance.p126ad.symphony.provider;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p129b.C2699d;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.provider.C2749a.C2751a;

/* renamed from: com.bytedance.ad.symphony.provider.AbsNativeAdProvider */
public abstract class AbsNativeAdProvider extends C2749a<C2676c, C2699d> {
    public static final int ADMOB_PROVIDER_ID = getNativeAdProviderId(2);
    public static final int FACEBOOK_PROVIDER_ID = getNativeAdProviderId(1);
    public static final int HEADERBIDDING_PROVIDER_ID = getNativeAdProviderId(9);
    public static final int IMOBILE_PROVIDER_ID = getNativeAdProviderId(8);
    public static final int INHOUSE_PROVIDER_ID = getNativeAdProviderId(7);
    public static final int INMOBI_PROVIDER_ID = getNativeAdProviderId(10);
    public static final int MOPUB_PROVIDER_ID = getNativeAdProviderId(5);
    public static final SparseArray<C2751a> SUPPORT_NATIVE_AD_PROVIDERS = new SparseArray<>();

    public static int getNativeAdProviderId(int i) {
        return i + 0;
    }

    public void markBidLoss(String str) {
    }

    static {
        SUPPORT_NATIVE_AD_PROVIDERS.put(FACEBOOK_PROVIDER_ID, new C2751a(FACEBOOK_PROVIDER_ID, "native-facebook", "com.bytedance.ad.symphony.nativead.fb.FbNativeAdProvider"));
        SUPPORT_NATIVE_AD_PROVIDERS.put(ADMOB_PROVIDER_ID, new C2751a(ADMOB_PROVIDER_ID, "native-admob", "com.bytedance.ad.symphony.nativead.admob.AdMobNativeAdProvider"));
        SUPPORT_NATIVE_AD_PROVIDERS.put(IMOBILE_PROVIDER_ID, new C2751a(IMOBILE_PROVIDER_ID, "native-imobile", "com.bytedance.ad.symphony.nativead.imobile.IMobileNativeAdProvider"));
        SUPPORT_NATIVE_AD_PROVIDERS.put(HEADERBIDDING_PROVIDER_ID, new C2751a(HEADERBIDDING_PROVIDER_ID, "native-header_bidding", "com.bytedance.ad.symphony.nativead.fb.hb.FbHbAdProvider"));
        SUPPORT_NATIVE_AD_PROVIDERS.put(INMOBI_PROVIDER_ID, new C2751a(INMOBI_PROVIDER_ID, "native-inmobi", "com.bytedance.ad.symphony.nativead.inmobi.InmobiNativeAdProvider"));
    }

    public static boolean isHeaderBiddingProvider(int i) {
        return isFbNativeHbProvider(i);
    }

    public static boolean isAdMobNativeAdProvider(int i) {
        if (getRealProviderId(i) == ADMOB_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbNativeAdProvider(int i) {
        if (getRealProviderId(i) == FACEBOOK_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbNativeHbProvider(int i) {
        if (getRealProviderId(i) == HEADERBIDDING_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isIMobileNativeAdProvider(int i) {
        if (getRealProviderId(i) == IMOBILE_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isInhouseNativeAdProvider(int i) {
        if (getRealProviderId(i) == INHOUSE_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isInmobiNativeAdProvider(int i) {
        if (getRealProviderId(i) == INMOBI_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public AbsNativeAdProvider(Context context, C2723a aVar, C2699d dVar) {
        super(context, aVar, dVar);
    }
}
