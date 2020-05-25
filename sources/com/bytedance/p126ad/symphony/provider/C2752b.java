package com.bytedance.p126ad.symphony.provider;

import com.bytedance.p126ad.symphony.p127a.C2673a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p137g.C2737b.C2738a;
import com.bytedance.p126ad.symphony.p138h.C2739a;

/* renamed from: com.bytedance.ad.symphony.provider.b */
public interface C2752b<AD extends C2673a> {

    /* renamed from: com.bytedance.ad.symphony.provider.b$a */
    public interface C2753a {
        /* renamed from: a */
        void mo7260a(String str);

        /* renamed from: a */
        void mo7261a(String str, String str2, int i, String str3, double d);
    }

    AD getNextAd(String str);

    String getPlacementId(String str);

    int getProviderId();

    boolean hasValidAd(String str);

    void setAdConfig(C2723a aVar);

    void tryPreloadAd(String str, C2739a aVar, C2738a aVar2);
}
