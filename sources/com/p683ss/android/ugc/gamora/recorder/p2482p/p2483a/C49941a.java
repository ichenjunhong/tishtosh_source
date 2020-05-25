package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49942b.C49943a;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.a */
public final class C49941a implements C49943a {

    /* renamed from: a */
    private final C52670a<C52860x> f125128a;

    /* renamed from: a */
    public final void mo97740a(int i) {
        this.f125128a.invoke();
    }

    public C49941a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "changeCallback");
        this.f125128a = aVar;
    }

    /* renamed from: a */
    public final void mo97741a(int i, C49971b bVar) {
        C52711k.m112240b(bVar, "item");
        this.f125128a.invoke();
    }

    /* renamed from: a */
    public final void mo97742a(C49971b bVar, C49971b bVar2) {
        this.f125128a.invoke();
    }

    /* renamed from: a */
    public final void mo97743a(List<? extends C49971b> list, List<? extends C49971b> list2) {
        C52711k.m112240b(list, "oldItems");
        C52711k.m112240b(list2, "newItems");
        this.f125128a.invoke();
    }
}
