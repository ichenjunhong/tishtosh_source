package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.b */
public final class C43513b implements C43523j {

    /* renamed from: a */
    private boolean f110061a = true;

    /* renamed from: b */
    private boolean f110062b;

    /* renamed from: c */
    private int f110063c;

    /* renamed from: d */
    private int f110064d;

    /* renamed from: e */
    private int f110065e;

    /* renamed from: f */
    private int f110066f;

    /* renamed from: g */
    private int f110067g;

    /* renamed from: h */
    private final C43524k f110068h;

    /* renamed from: b */
    public final int mo88547b(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i == 48) {
                return 3;
            }
            if (i == 80) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: c */
    public final int mo88549c() {
        return this.f110065e;
    }

    public final int cc_() {
        return this.f110066f;
    }

    public final int cd_() {
        return this.f110064d;
    }

    /* renamed from: d */
    public final int mo88553d() {
        return this.f110063c;
    }

    /* renamed from: g */
    public final int mo88559g() {
        return this.f110067g;
    }

    /* renamed from: e */
    public final boolean mo88556e() {
        return this.f110061a;
    }

    /* renamed from: f */
    public final boolean mo88558f() {
        return this.f110062b;
    }

    /* renamed from: b */
    public final void mo88548b(boolean z) {
        this.f110062b = z;
    }

    /* renamed from: e */
    public final void mo88555e(int i) {
        this.f110065e = i;
    }

    /* renamed from: f */
    public final void mo88557f(int i) {
        this.f110067g = i;
    }

    /* renamed from: d */
    public final void mo88554d(int i) {
        this.f110064d = i;
    }

    public C43513b(C43524k kVar) {
        C52711k.m112240b(kVar, "popupWindow");
        this.f110068h = kVar;
    }

    /* renamed from: a */
    public final void mo88545a(int i) {
        this.f110063c = i;
        C43522i o = this.f110068h.mo88575o();
        C52711k.m112236a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo88544b();
        if (b != null) {
            b.setBgColor(i);
        }
    }

    /* renamed from: c */
    public final void mo88550c(int i) {
        this.f110066f = i;
        C43522i o = this.f110068h.mo88575o();
        C52711k.m112236a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo88544b();
        if (b != null) {
            b.setBubbleOrientation(mo88547b(this.f110066f));
        }
    }

    /* renamed from: a */
    public final void mo88546a(boolean z) {
        this.f110061a = z;
        C43522i o = this.f110068h.mo88575o();
        C52711k.m112236a((Object) o, "popupWindow.bubbleLayout");
        FixBubbleLayout b = o.mo88544b();
        if (b != null) {
            b.setNeedPath(z);
        }
    }
}
