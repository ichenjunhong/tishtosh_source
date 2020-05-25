package com.bytedance.android.live.broadcast.p212g;

import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.p218d.C3445a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.g.b */
public final class C3398b implements C3445a {

    /* renamed from: a */
    public C3397a f9698a;

    /* renamed from: b */
    private Room f9699b;

    /* renamed from: c */
    private C1690c f9700c;

    /* renamed from: a */
    public final void mo8750a() {
        if (this.f9700c != null && !this.f9700c.isDisposed()) {
            this.f9700c.dispose();
        }
    }

    public C3398b(Room room) {
        this.f9699b = room;
    }

    /* renamed from: a */
    public final void mo8751a(int i, int i2) {
        this.f9700c = C3395f.m9156f().mo8742c().mo9024g().sendStatus(this.f9699b.getId(), i, this.f9699b.getStreamId(), i2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3399c<Object>(this), (C1710e<? super Throwable>) new C3400d<Object>(this));
    }
}
