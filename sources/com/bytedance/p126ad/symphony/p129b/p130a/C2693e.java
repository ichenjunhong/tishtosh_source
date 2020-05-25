package com.bytedance.p126ad.symphony.p129b.p130a;

import com.bytedance.p126ad.symphony.p129b.C2698c;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.provider.AbsInterstitialAdProvider;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.b.a.e */
public final class C2693e extends C2683a<Object> implements C2698c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7249a() {
        return "InterstitialAdManager";
    }

    public C2693e(C2694f fVar) {
        super(fVar, "sp_interstitial_fill_strategy", "{\"display_sort\":[51000,52000],\"preload_sort\":[[51000],[52000],[5000]]}");
    }

    /* renamed from: b */
    public final void mo7266b(List<C2723a> list) {
        mo7252a(list, AbsInterstitialAdProvider.SUPPORT_INTERSTITIAL_AD_PROVIDERS, C2698c.class);
    }
}
