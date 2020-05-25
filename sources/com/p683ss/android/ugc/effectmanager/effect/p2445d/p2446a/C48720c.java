package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48696a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48717a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48766a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48797g;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48801h;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48809j;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48813k;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48828o;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48832p;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48835q;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48850u;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.c */
public final class C48720c implements C48686a, C48717a {

    /* renamed from: a */
    private final C48890g f122365a;

    /* renamed from: b */
    private final Handler f122366b = new C48685j(this);

    /* renamed from: c */
    private final C48565a f122367c;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.c$a */
    public static abstract class C48721a implements C48650e<Boolean> {
        /* renamed from: a */
        public abstract void mo96302a(C48649d dVar);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.c$b */
    public static final class C48722b extends C48721a {

        /* renamed from: a */
        final /* synthetic */ C48696a f122368a;

        C48722b(C48696a aVar) {
            this.f122368a = aVar;
        }

        /* renamed from: a */
        public final void mo96302a(C48649d dVar) {
            C52711k.m112240b(dVar, "exceptionResult");
            C48696a aVar = this.f122368a;
            if (aVar != null) {
                aVar.mo8639a(dVar);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C48696a aVar = this.f122368a;
            if (aVar != null) {
                aVar.mo8640a(booleanValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C52711k.m112240b(message, "msg");
    }

    public C48720c(C48565a aVar) {
        C52711k.m112240b(aVar, "mEffectContext");
        this.f122367c = aVar;
        C48890g gVar = this.f122367c.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122365a = gVar;
    }

    /* renamed from: a */
    public final String mo96294a(String str, boolean z, C48702g gVar) {
        C48653h hVar;
        C52711k.m112240b(str, "panel");
        String a = C48679o.m105350a();
        if (z) {
            hVar = new C48809j(this.f122367c, str, a, this.f122366b);
        } else {
            hVar = new C48813k(this.f122367c, str, a, this.f122366b);
        }
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(hVar, gVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96290a(String str, int i, int i2, C48708m mVar) {
        String a = C48679o.m105350a();
        C48835q qVar = new C48835q(this.f122367c, a, str, i, i2, this.f122366b);
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(qVar, mVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96292a(String str, String str2, int i, int i2, C48708m mVar) {
        C52711k.m112240b(str, "keyWord");
        String a = C48679o.m105350a();
        C48850u uVar = new C48850u(this.f122367c, a, str, str2, i, i2, this.f122366b);
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(uVar, mVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96293a(String str, String str2, int i, Map<String, String> map, C48696a aVar) {
        String a = C48679o.m105350a();
        C48722b bVar = new C48722b(aVar);
        C48766a aVar2 = new C48766a(this.f122367c, a, this.f122366b, str, str2, i, map);
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(aVar2, bVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96295a(String str, boolean z, String str2, int i, int i2, boolean z2, C48707l lVar) {
        C48653h hVar;
        String str3 = str;
        C52711k.m112240b(str, "panel");
        String a = C48679o.m105350a();
        if (z2) {
            hVar = new C48828o(this.f122367c, str, a, this.f122366b);
        } else {
            C48832p pVar = new C48832p(this.f122367c, str, a, z, str2, i, i2, this.f122366b);
            hVar = pVar;
        }
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(hVar, lVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96291a(String str, String str2, int i, int i2, int i3, String str3, boolean z, C48701f fVar) {
        C48653h hVar;
        String str4 = str;
        C52711k.m112240b(str, "panel");
        String a = C48679o.m105350a();
        if (z) {
            C48797g gVar = new C48797g(this.f122367c, str, a, str2, i, i2, i3, str3, this.f122366b);
            hVar = gVar;
        } else {
            C48801h hVar2 = new C48801h(this.f122367c, str, a, str2, i, i2, i3, str3, this.f122366b);
            hVar = hVar2;
        }
        C48681i iVar = this.f122365a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(hVar, fVar);
        }
        return a;
    }
}
