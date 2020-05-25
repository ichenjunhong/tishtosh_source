package com.bytedance.p126ad.symphony.p129b.p130a;

import com.bytedance.p126ad.symphony.p129b.C2697b;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.provider.AbsBannerAdProvider;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.b.a.c */
public final class C2691c extends C2683a<Object> implements C2697b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7249a() {
        return "BannerAdManager";
    }

    public C2691c(C2692d dVar) {
        super(dVar, "sp_banner_fill_strategy", "{\"display_sort\":[101000,102000,103000],\"preload_sort\":[[101000],[102000],[103000]]}");
    }

    /* renamed from: b */
    public final void mo7265b(List<C2723a> list) {
        mo7252a(list, AbsBannerAdProvider.SUPPORT_BANNER_AD_PROVIDERS, C2697b.class);
    }
}
