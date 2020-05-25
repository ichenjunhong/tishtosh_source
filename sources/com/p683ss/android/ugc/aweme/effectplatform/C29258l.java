package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.l */
public final class C29258l implements C48705j {

    /* renamed from: a */
    public final String f76615a;

    /* renamed from: b */
    public final C48705j f76616b;

    /* renamed from: c */
    private final C17429o f76617c = C17429o.m42675b();

    /* renamed from: a */
    public final void mo8643a(Effect effect) {
        C48705j jVar = this.f76616b;
        if (jVar != null) {
            jVar.mo8643a(effect);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8638a(Object obj) {
        String str;
        Effect effect = (Effect) obj;
        long a = this.f76617c.mo33754a(TimeUnit.MILLISECONDS);
        C48705j jVar = this.f76616b;
        if (jVar != null) {
            jVar.mo8638a(effect);
        }
        C47702b bVar = C47702b.f120193a;
        String str2 = "tool_performance_resource_download";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f76615a)).mo86524a("duration", a).mo86523a("status", 0);
        String str3 = "resource_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        bVar.mo94984a(str2, a2.mo86526a(str3, str).f107329a);
    }

    public C29258l(String str, C48705j jVar) {
        this.f76615a = str;
        this.f76616b = jVar;
    }

    /* renamed from: a */
    public final void mo8644a(Effect effect, C48649d dVar) {
        String str;
        C52711k.m112240b(dVar, "e");
        long a = this.f76617c.mo33754a(TimeUnit.MILLISECONDS);
        C48705j jVar = this.f76616b;
        if (jVar != null) {
            jVar.mo8644a(effect, dVar);
        }
        C47702b bVar = C47702b.f120193a;
        String str2 = "tool_performance_resource_download";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f76615a)).mo86524a("duration", a).mo86523a("status", 1);
        String str3 = "resource_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        bVar.mo94984a(str2, a2.mo86526a(str3, str).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0)).mo86523a("error_code", dVar.f122279a).f107329a);
    }
}
