package com.p683ss.android.ugc.playerkit.videoview.p2498d;

import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g.C50151a;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.h */
public final class C50152h implements C50151a {

    /* renamed from: a */
    private List<C50149g> f125662a;

    /* renamed from: b */
    private C50146d f125663b;

    /* renamed from: c */
    private int f125664c;

    /* renamed from: a */
    public final C50146d mo97947a() {
        return this.f125663b;
    }

    /* renamed from: a */
    public final C50147e mo97948a(C50146d dVar) {
        if (this.f125664c < this.f125662a.size()) {
            return ((C50149g) this.f125662a.get(this.f125664c)).mo95151a(new C50152h(this.f125662a, dVar, this.f125664c + 1));
        }
        throw new AssertionError();
    }

    public C50152h(List<C50149g> list, C50146d dVar, int i) {
        this.f125662a = list;
        this.f125663b = dVar;
        this.f125664c = i;
    }
}
