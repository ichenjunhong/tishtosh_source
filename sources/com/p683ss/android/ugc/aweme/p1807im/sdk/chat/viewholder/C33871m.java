package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.m */
public final /* synthetic */ class C33871m implements Runnable {

    /* renamed from: a */
    private final C33849j f87858a;

    public C33871m(C33849j jVar) {
        this.f87858a = jVar;
    }

    public final void run() {
        C33849j jVar = this.f87858a;
        if (jVar.f87813b != null) {
            for (Entry value : jVar.f87813b.entrySet()) {
                ((C33850a) value.getValue()).mo71829d();
            }
        }
    }
}
