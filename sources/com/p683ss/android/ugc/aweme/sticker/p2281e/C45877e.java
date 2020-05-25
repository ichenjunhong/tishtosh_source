package com.p683ss.android.ugc.aweme.sticker.p2281e;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatform.C29259m;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.e */
public final class C45877e implements C45874b {

    /* renamed from: a */
    private final C17429o f115894a = C17429o.m42675b();

    /* renamed from: b */
    private final String f115895b;

    /* renamed from: c */
    private final int f115896c;

    /* renamed from: d */
    private final C45874b f115897d;

    /* renamed from: b */
    public final void mo92254b(Effect effect) {
        C45874b bVar = this.f115897d;
        if (bVar != null) {
            bVar.mo92254b(effect);
        }
    }

    /* renamed from: a */
    public final void mo92251a(Effect effect) {
        String str;
        long a = this.f115894a.mo33754a(TimeUnit.MILLISECONDS);
        C45874b bVar = this.f115897d;
        if (bVar != null) {
            bVar.mo92251a(effect);
        }
        C47702b bVar2 = C47702b.f120193a;
        String str2 = "tool_performance_resource_download_user_view";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f115895b)).mo86524a("duration", a).mo86523a("status", 0);
        String str3 = "resource_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        bVar2.mo94984a(str2, a2.mo86526a(str3, str).mo86523a("hit_cache", this.f115896c).f107329a);
    }

    /* renamed from: a */
    public final void mo92252a(Effect effect, int i) {
        C45874b bVar = this.f115897d;
        if (bVar != null) {
            bVar.mo92252a(effect, i);
        }
    }

    /* renamed from: a */
    public final void mo92253a(Effect effect, C48649d dVar) {
        String str;
        long a = this.f115894a.mo33754a(TimeUnit.MILLISECONDS);
        C45874b bVar = this.f115897d;
        if (bVar != null) {
            bVar.mo92253a(effect, dVar);
        }
        C47702b bVar2 = C47702b.f120193a;
        String str2 = "tool_performance_resource_download_user_view";
        C42438az a2 = C42438az.m93209a().mo86526a("resource_type", C29259m.m68958a(this.f115895b)).mo86524a("duration", a).mo86523a("status", 1);
        String str3 = "resource_id";
        Integer num = null;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        C42438az a3 = a2.mo86526a(str3, str).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0));
        String str4 = "error_code";
        if (dVar != null) {
            num = Integer.valueOf(dVar.f122279a);
        }
        bVar2.mo94984a(str2, a3.mo86525a(str4, (Object) num).mo86523a("hit_cache", this.f115896c).f107329a);
    }

    public C45877e(String str, int i, C45874b bVar) {
        this.f115895b = str;
        this.f115896c = i;
        this.f115897d = bVar;
    }
}
