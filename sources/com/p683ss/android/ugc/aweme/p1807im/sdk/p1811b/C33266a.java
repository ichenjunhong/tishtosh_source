package com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b;

import android.content.Context;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34544a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34546c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a */
public abstract class C33266a {

    /* renamed from: a */
    public final Context f86290a;

    /* renamed from: b */
    public C33267a f86291b;

    /* renamed from: c */
    public final ViewGroup f86292c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$a */
    public interface C33267a {
    }

    /* renamed from: a */
    public void mo70613a(C34544a aVar, boolean z) {
        C52711k.m112240b(aVar, "acBannerData");
    }

    /* renamed from: a */
    public void mo70614a(C34546c cVar, boolean z) {
        C52711k.m112240b(cVar, "dxBannerData");
    }

    public C33266a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "layout");
        this.f86292c = viewGroup;
        Context context = this.f86292c.getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        this.f86290a = context;
    }
}
