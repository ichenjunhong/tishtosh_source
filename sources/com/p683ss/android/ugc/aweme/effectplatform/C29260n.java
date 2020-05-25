package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.n */
public final class C29260n implements C48699d {

    /* renamed from: c */
    public static final C29261a f76618c = new C29261a(null);

    /* renamed from: a */
    public final String f76619a;

    /* renamed from: b */
    public final C48705j f76620b;

    /* renamed from: d */
    private final C17429o f76621d;

    /* renamed from: e */
    private final boolean f76622e;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.n$a */
    public static final class C29261a {
        private C29261a() {
        }

        public /* synthetic */ C29261a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C48705j m68963a(String str, C48699d dVar) {
            C29260n nVar = new C29260n(str, dVar, false, 4, null);
            return nVar;
        }
    }

    /* renamed from: a */
    public final void mo8643a(Effect effect) {
        C48705j jVar = this.f76620b;
        if (jVar != null) {
            jVar.mo8643a(effect);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8638a(Object obj) {
        String str;
        Effect effect = (Effect) obj;
        long a = this.f76621d.mo33754a(TimeUnit.MILLISECONDS);
        C48705j jVar = this.f76620b;
        if (jVar != null) {
            jVar.mo8638a(effect);
        }
        C47702b bVar = C47702b.f120193a;
        String str2 = "tool_performance_resource_download";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f76619a)).mo86524a("duration", a).mo86523a("status", 0);
        String str3 = "resource_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        bVar.mo94984a(str2, a2.mo86526a(str3, str).mo86527a("is_auto_download", this.f76622e).f107329a);
    }

    /* renamed from: a */
    public final void mo8644a(Effect effect, C48649d dVar) {
        String str;
        C52711k.m112240b(dVar, "e");
        long a = this.f76621d.mo33754a(TimeUnit.MILLISECONDS);
        C48705j jVar = this.f76620b;
        if (jVar != null) {
            jVar.mo8644a(effect, dVar);
        }
        C47702b bVar = C47702b.f120193a;
        String str2 = "tool_performance_resource_download";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f76619a)).mo86524a("duration", a).mo86523a("status", 1);
        String str3 = "resource_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        bVar.mo94984a(str2, a2.mo86526a(str3, str).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0)).mo86523a("error_code", dVar.f122279a).mo86527a("is_auto_download", this.f76622e).f107329a);
    }

    public C29260n(String str, C48705j jVar, boolean z) {
        this.f76619a = str;
        this.f76620b = jVar;
        this.f76622e = z;
        C17429o b = C17429o.m42675b();
        C52711k.m112236a((Object) b, "Stopwatch.createStarted()");
        this.f76621d = b;
    }

    /* renamed from: a */
    public final void mo59191a(Effect effect, int i, long j) {
        if (this.f76620b instanceof C48699d) {
            ((C48699d) this.f76620b).mo59191a(effect, i, j);
        }
    }

    public /* synthetic */ C29260n(String str, C48705j jVar, boolean z, int i, C52707g gVar) {
        this(str, jVar, false);
    }
}
