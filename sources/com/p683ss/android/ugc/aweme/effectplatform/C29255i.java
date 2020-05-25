package com.p683ss.android.ugc.aweme.effectplatform;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.i */
public final class C29255i implements C48701f {

    /* renamed from: a */
    public final String f76609a;

    /* renamed from: b */
    public final C48701f f76610b;

    /* renamed from: c */
    private final C17429o f76611c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
        CategoryPageModel categoryPageModel = (CategoryPageModel) obj;
        long a = this.f76611c.mo33754a(TimeUnit.MILLISECONDS);
        C48701f fVar = this.f76610b;
        if (fVar != null) {
            fVar.mo8638a(categoryPageModel);
        }
        C47702b.f120193a.mo94984a("tool_performance_api", C42438az.m93209a().mo86526a("api_type", C29257k.m68954a(this.f76609a)).mo86524a("duration", a).mo86523a("status", 0).f107329a);
    }

    /* renamed from: a */
    public final void mo59186a(C48649d dVar) {
        Integer num;
        long a = this.f76611c.mo33754a(TimeUnit.MILLISECONDS);
        C48701f fVar = this.f76610b;
        if (fVar != null) {
            fVar.mo59186a(dVar);
        }
        C47702b bVar = C47702b.f120193a;
        String str = "tool_performance_api";
        C42438az a2 = C42438az.m93209a().mo86526a("api_type", C29257k.m68954a(this.f76609a)).mo86524a("duration", a).mo86523a("status", 1).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0));
        String str2 = "error_code";
        if (dVar != null) {
            num = Integer.valueOf(dVar.f122279a);
        } else {
            num = null;
        }
        bVar.mo94984a(str, a2.mo86525a(str2, (Object) num).f107329a);
    }

    public C29255i(String str, C48701f fVar) {
        C52711k.m112240b(str, "panel");
        this.f76609a = str;
        this.f76610b = fVar;
        C17429o b = C17429o.m42675b();
        C52711k.m112236a((Object) b, "Stopwatch.createStarted()");
        this.f76611c = b;
    }
}
