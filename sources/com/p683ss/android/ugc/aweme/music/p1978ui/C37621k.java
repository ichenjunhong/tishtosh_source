package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.k */
public final class C37621k implements C37620j {

    /* renamed from: a */
    public C37620j f95934a;

    /* renamed from: b */
    private Effect f95935b;

    /* renamed from: c */
    private boolean f95936c;

    /* renamed from: d */
    private C37643s f95937d;

    /* renamed from: e */
    private boolean f95938e;

    /* renamed from: f */
    private C37643s f95939f;

    /* renamed from: g */
    private boolean f95940g;

    /* renamed from: h */
    private int f95941h;

    /* renamed from: i */
    private Effect f95942i;

    /* renamed from: j */
    private Long f95943j = Long.valueOf(0);

    /* renamed from: k */
    private boolean f95944k;

    public C37621k(C37620j jVar) {
        this.f95934a = jVar;
    }

    /* renamed from: a */
    public final void mo77133a(Effect effect) {
        this.f95935b = effect;
        this.f95936c = true;
        C37620j jVar = this.f95934a;
        if (jVar != null) {
            jVar.mo77133a(effect);
        }
    }

    /* renamed from: b */
    public final void mo77134b(C37643s sVar) {
        C52711k.m112240b(sVar, "result");
        this.f95939f = sVar;
        this.f95940g = true;
        C37620j jVar = this.f95934a;
        if (jVar != null) {
            jVar.mo77134b(sVar);
        }
    }

    /* renamed from: a */
    public final void mo77135a(C37620j jVar) {
        if (this.f95936c && jVar != null) {
            jVar.mo77133a(this.f95935b);
        }
        if (this.f95944k && jVar != null) {
            jVar.mo77131a(this.f95941h, this.f95942i, this.f95943j);
        }
        if (this.f95940g && jVar != null) {
            C37643s sVar = this.f95939f;
            if (sVar == null) {
                C52711k.m112234a();
            }
            jVar.mo77134b(sVar);
        }
        if (this.f95938e && jVar != null) {
            C37643s sVar2 = this.f95937d;
            if (sVar2 == null) {
                C52711k.m112234a();
            }
            jVar.mo77132a(sVar2);
        }
        this.f95934a = jVar;
    }

    /* renamed from: a */
    public final void mo77132a(C37643s sVar) {
        C52711k.m112240b(sVar, "result");
        this.f95937d = sVar;
        this.f95938e = true;
        C37620j jVar = this.f95934a;
        if (jVar != null) {
            jVar.mo77132a(sVar);
        }
    }

    /* renamed from: a */
    public final void mo77131a(int i, Effect effect, Long l) {
        this.f95941h = i;
        this.f95942i = effect;
        this.f95943j = l;
        this.f95944k = true;
        C37620j jVar = this.f95934a;
        if (jVar != null) {
            jVar.mo77131a(i, effect, l);
        }
    }
}
