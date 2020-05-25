package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48743c;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48794f;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48825n;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.e */
public final class C48724e implements C48686a, C48743c {

    /* renamed from: a */
    public static final C48725a f122372a = new C48725a(null);

    /* renamed from: e */
    private static final String f122373e = f122373e;

    /* renamed from: b */
    private final C48890g f122374b;

    /* renamed from: c */
    private final Handler f122375c = new C48685j(this);

    /* renamed from: d */
    private final C48565a f122376d;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.e$a */
    public static final class C48725a {
        private C48725a() {
        }

        public /* synthetic */ C48725a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C52711k.m112240b(message, "msg");
    }

    public C48724e(C48565a aVar) {
        C52711k.m112240b(aVar, "mEffectContext");
        this.f122376d = aVar;
        C48890g gVar = this.f122376d.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122374b = gVar;
    }

    /* renamed from: a */
    public final String mo96312a(String str, C48706k kVar) {
        String a = C48679o.m105350a();
        C48825n nVar = new C48825n(this.f122376d, str, a, this.f122375c);
        C48681i iVar = this.f122374b.f122971q;
        if (iVar != null) {
            iVar.mo96270a(nVar, kVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96313a(String str, List<String> list, boolean z, C48711p pVar) {
        String a = C48679o.m105350a();
        C48794f fVar = new C48794f(this.f122376d, str, a, this.f122375c, list, z);
        this.f122374b.f122971q.mo96270a(fVar, pVar);
        return a;
    }
}
