package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b;

import android.content.Context;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a */
public abstract class C25797a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68220a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25797a.class), "animLoopCount", "getAnimLoopCount()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25797a.class), "autoDisappear", "getAutoDisappear()Z"))};

    /* renamed from: b */
    public final Context f68221b;

    /* renamed from: c */
    public C25773a f68222c;

    /* renamed from: d */
    public C25749d f68223d;

    /* renamed from: e */
    final C52668f f68224e = C52732g.m112285a(new C25798a(this));

    /* renamed from: f */
    final C52668f f68225f = C52732g.m112285a(new C25799b(this));

    /* renamed from: g */
    public final FrameLayout f68226g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a$a */
    static final class C25798a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C25797a f68227a;

        C25798a(C25797a aVar) {
            this.f68227a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            C25773a aVar = this.f68227a.f68222c;
            if (aVar != null) {
                i = aVar.f68160h;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a$b */
    static final class C25799b extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C25797a f68228a;

        C25799b(C25797a aVar) {
            this.f68228a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            C25773a aVar = this.f68228a.f68222c;
            if (aVar != null) {
                z = aVar.f68161i;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public abstract void mo53002a();

    /* renamed from: b */
    public abstract void mo53004b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo53005c() {
        m62435a(true, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53003a(String str) {
        m62435a(false, str);
    }

    public C25797a(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "eggLayout");
        this.f68226g = frameLayout;
        Context context = this.f68226g.getContext();
        C52711k.m112236a((Object) context, "eggLayout.context");
        this.f68221b = context;
    }

    /* renamed from: a */
    private final void m62435a(boolean z, String str) {
        C25815a.m62455a().mo52806a().mo52964a(this.f68222c, z, str);
    }
}
