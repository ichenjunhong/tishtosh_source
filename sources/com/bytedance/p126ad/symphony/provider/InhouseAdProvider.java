package com.bytedance.p126ad.symphony.provider;

import android.content.Context;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p127a.p128a.C2677d;
import com.bytedance.p126ad.symphony.p129b.C2699d;
import com.bytedance.p126ad.symphony.p134e.p135a.C2723a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2724b;
import com.bytedance.p126ad.symphony.p137g.C2737b.C2738a;
import com.bytedance.p126ad.symphony.p138h.C2739a;

/* renamed from: com.bytedance.ad.symphony.provider.InhouseAdProvider */
public class InhouseAdProvider extends AbsNativeAdProvider {
    private static C2677d sInhouseAdPlaceholder = new C2677d();

    /* access modifiers changed from: protected */
    public String getTag() {
        return "InhouseAdProvider";
    }

    public boolean hasValidAd(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        return true;
    }

    public C2676c getNextAd(String str) {
        return sInhouseAdPlaceholder;
    }

    public InhouseAdProvider(Context context, C2723a aVar, C2699d dVar) {
        super(context, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public void loadAdAsync(String str, C2724b bVar, C2739a aVar, final C2738a aVar2) {
        runOnAdThread(new Runnable() {
            public final void run() {
                if (aVar2 != null) {
                    aVar2.mo7287a("", "Fake Inhouse Failed");
                }
            }
        });
    }
}
