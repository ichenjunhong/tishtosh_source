package com.bytedance.android.livesdk.p284b;

import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.bytedance.android.livesdk.b.c */
public final class C4645c extends C53037e {

    /* renamed from: c */
    private C4644b f12691c;

    /* renamed from: d */
    private List<?> f12692d = new ArrayList();

    /* renamed from: a */
    public final void mo10432a(List list) {
        if (list != null) {
            this.f12691c = new C4644b(this.f12692d, list);
            C2201v.m6614b(C1208c.m3654a(this.f12691c)).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C4646d<Object>(this, list), C4647e.f12695a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10433a(List list, C1211b bVar) throws Exception {
        super.mo10432a(list);
        try {
            bVar.mo3931a((C1322a) this);
        } catch (Exception e) {
            C8064d.m16005b();
            C8064d.m9718a(6, e.getStackTrace());
        }
        this.f12692d.clear();
        this.f12692d.addAll(list);
    }
}
