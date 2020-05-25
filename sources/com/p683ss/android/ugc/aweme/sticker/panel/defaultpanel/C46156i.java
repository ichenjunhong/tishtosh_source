package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.support.p030v4.app.Fragment;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46188h;
import com.p683ss.android.ugc.aweme.sticker.panel.C46189i;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.i */
public final class C46156i implements C46189i<AVDmtTabItemView, Fragment> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116476a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46156i.class), "defaultCategoryView", "getDefaultCategoryView()Lcom/ss/android/ugc/aweme/sticker/panel/defaultpanel/DefaultCategoryView;"))};

    /* renamed from: b */
    public final C12361b f116477b;

    /* renamed from: c */
    private final C52668f f116478c = C52732g.m112285a(new C46157a(this));

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.i$a */
    static final class C46157a extends C52712l implements C52670a<C46153h> {

        /* renamed from: a */
        final /* synthetic */ C46156i f116479a;

        C46157a(C46156i iVar) {
            this.f116479a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C12361b bVar = this.f116479a.f116477b;
            this.f116479a.f116477b.mo23375b(C45805a.class, (String) null);
            return new C46153h(bVar, null);
        }
    }

    public C46156i(C12361b bVar) {
        C52711k.m112240b(bVar, "container");
        this.f116477b = bVar;
    }

    /* renamed from: a */
    public final C46188h<AVDmtTabItemView, Fragment> mo92850a(String str) {
        C46189i iVar = (C46189i) this.f116477b.mo23375b(C46189i.class, (String) null);
        if (iVar != null) {
            C46188h<AVDmtTabItemView, Fragment> a = iVar.mo92850a(str);
            if (a != null) {
                return a;
            }
        }
        return (C46153h) this.f116478c.getValue();
    }
}
