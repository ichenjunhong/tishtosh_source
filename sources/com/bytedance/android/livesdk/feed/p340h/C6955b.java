package com.bytedance.android.livesdk.feed.p340h;

import android.arch.lifecycle.C0199s;
import android.arch.p010b.C0082h;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.h.b */
final /* synthetic */ class C6955b implements C0199s {

    /* renamed from: a */
    private final C6953a f19034a;

    C6955b(C6953a aVar) {
        this.f19034a = aVar;
    }

    public final void onChanged(Object obj) {
        C6953a aVar = this.f19034a;
        C0082h<FeedItem> hVar = (C0082h) obj;
        if (hVar != null) {
            boolean z = false;
            if (aVar.f19027a != null) {
                aVar.f19027a.mo122a(aVar.f19028b);
                z = true;
            }
            aVar.f19027a = hVar;
            aVar.f19027a.mo123a(null, aVar.f19028b);
            if (z) {
                aVar.mo13147i_();
                aVar.mo15419f();
            }
        }
    }
}
