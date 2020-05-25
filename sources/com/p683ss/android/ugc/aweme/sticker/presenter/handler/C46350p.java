package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.p */
public final class C46350p extends C46306b {

    /* renamed from: a */
    public Effect f116942a;

    /* renamed from: b */
    public final C20426a f116943b;

    /* renamed from: c */
    private final LiveData<Boolean> f116944c;

    /* renamed from: a */
    public final void mo93028a() {
        this.f116942a = null;
        if (C52711k.m112239a((Object) (Boolean) this.f116944c.getValue(), (Object) Boolean.valueOf(false))) {
            this.f116943b.mo43302b();
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46059g.m100072a("voice_recognization", aVar.f116852a);
    }

    public C46350p(C20426a aVar, LiveData<Boolean> liveData) {
        C52711k.m112240b(aVar, "mediaController");
        C52711k.m112240b(liveData, "isRecording");
        this.f116943b = aVar;
        this.f116944c = liveData;
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        this.f116942a = aVar.f116852a;
        this.f116943b.mo43286a();
    }
}
