package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44521b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c.C44524a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.d */
public final class C43515d implements C43525l {

    /* renamed from: a */
    public final C43524k f110077a;

    /* renamed from: b */
    private C44523c f110078b;

    /* renamed from: c */
    private boolean f110079c;

    /* renamed from: d */
    private long f110080d = 800;

    /* renamed from: e */
    private long f110081e = 200;

    /* renamed from: f */
    private long f110082f = 7000;

    /* renamed from: g */
    private boolean f110083g;

    /* renamed from: h */
    private Runnable f110084h = new C43517b(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.d$a */
    public static final class C43516a implements C44524a {

        /* renamed from: a */
        final /* synthetic */ C43515d f110085a;

        /* renamed from: a */
        public final void mo88582a() {
        }

        /* renamed from: b */
        public final void mo88583b() {
            this.f110085a.mo88581a();
        }

        C43516a(C43515d dVar) {
            this.f110085a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.d$b */
    static final class C43517b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43515d f110086a;

        C43517b(C43515d dVar) {
            this.f110086a = dVar;
        }

        public final void run() {
            C43515d dVar = this.f110086a;
            C43523j q = this.f110086a.f110077a.mo88577q();
            C52711k.m112236a((Object) q, "popupWindow.bubbleParams");
            dVar.mo88562a(false, q.cc_());
        }
    }

    /* renamed from: r */
    public final long mo88578r() {
        return this.f110082f;
    }

    /* renamed from: s */
    public final Runnable mo88579s() {
        return this.f110084h;
    }

    public final void dismiss() {
        this.f110077a.dismiss();
    }

    /* renamed from: a */
    public final void mo88581a() {
        C44523c cVar = this.f110078b;
        if (cVar != null) {
            cVar.mo90457a();
        }
    }

    /* renamed from: h */
    public final void mo88568h() {
        if (!this.f110079c) {
            C43523j q = this.f110077a.mo88577q();
            C52711k.m112236a((Object) q, "popupWindow.bubbleParams");
            mo88562a(false, q.cc_());
            this.f110077a.getContentView().removeCallbacks(this.f110084h);
            this.f110077a.mo88577q().mo88554d(0);
            this.f110077a.mo88577q().mo88555e(0);
        }
    }

    /* renamed from: i */
    public final void mo88569i() {
        if (!this.f110079c) {
            C43522i o = this.f110077a.mo88575o();
            C52711k.m112236a((Object) o, "popupWindow.bubbleLayout");
            FixBubbleLayout b = o.mo88544b();
            if (b != null) {
                b.setVisibility(8);
            }
            mo88581a();
            this.f110077a.getContentView().removeCallbacks(this.f110084h);
            this.f110077a.mo88577q().mo88554d(0);
            this.f110077a.mo88577q().mo88555e(0);
            this.f110077a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo88560a(long j) {
        this.f110080d = j;
    }

    /* renamed from: b */
    public final void mo88563b(long j) {
        this.f110082f = j;
    }

    /* renamed from: c */
    public final void mo88564c(boolean z) {
        this.f110083g = z;
    }

    /* renamed from: e */
    public final void mo88567e(boolean z) {
        this.f110079c = z;
    }

    /* renamed from: a */
    public final void mo88561a(C44523c cVar) {
        this.f110078b = cVar;
    }

    public C43515d(C43524k kVar) {
        C52711k.m112240b(kVar, "popupWindow");
        this.f110077a = kVar;
    }

    /* renamed from: a */
    public final void mo88562a(boolean z, int i) {
        if (!z) {
            this.f110079c = true;
        }
        if (this.f110078b == null) {
            C44521b bVar = new C44521b(this.f110083g, this.f110080d, this.f110081e, this.f110077a);
            this.f110078b = bVar;
        }
        if (z) {
            C44523c cVar = this.f110078b;
            if (cVar == null) {
                C52711k.m112234a();
            }
            C43522i o = this.f110077a.mo88575o();
            C52711k.m112236a((Object) o, "popupWindow.bubbleLayout");
            FixBubbleLayout b = o.mo88544b();
            C52711k.m112236a((Object) b, "popupWindow.bubbleLayout.bubbleView");
            cVar.mo90458a(b, i, null);
            return;
        }
        C44523c cVar2 = this.f110078b;
        if (cVar2 == null) {
            C52711k.m112234a();
        }
        C43522i o2 = this.f110077a.mo88575o();
        C52711k.m112236a((Object) o2, "popupWindow.bubbleLayout");
        FixBubbleLayout b2 = o2.mo88544b();
        C52711k.m112236a((Object) b2, "popupWindow.bubbleLayout.bubbleView");
        cVar2.mo90459b(b2, i, new C43516a(this));
    }
}
