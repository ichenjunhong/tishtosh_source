package com.bytedance.p126ad.symphony.p139i;

import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.provider.AbsInterstitialAdProvider;
import com.bytedance.p126ad.symphony.provider.AbsNativeAdProvider;

/* renamed from: com.bytedance.ad.symphony.i.b */
public final class C2743b {
    /* renamed from: a */
    public static boolean m7832a(C2673a aVar) {
        if (aVar.mo7232a() == null || aVar.mo7232a() == null || !AbsNativeAdProvider.isFbNativeAdProvider(aVar.mo7232a().f8252c)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m7833b(C2673a aVar) {
        if (aVar.mo7232a() == null || aVar.mo7232a() == null || !AbsNativeAdProvider.isFbNativeHbProvider(aVar.mo7232a().f8252c)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m7834c(C2673a aVar) {
        if (aVar.mo7232a() == null || aVar.mo7232a() == null || !AbsInterstitialAdProvider.isFbInterstitialAdProvider(aVar.mo7232a().f8252c)) {
            return false;
        }
        return true;
    }
}
