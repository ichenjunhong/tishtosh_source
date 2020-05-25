package com.p683ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.o */
public final class C29262o implements C48707l {

    /* renamed from: c */
    public static final C29263a f76623c = new C29263a(null);

    /* renamed from: a */
    public final String f76624a;

    /* renamed from: b */
    public final C48707l f76625b;

    /* renamed from: d */
    private final C17429o f76626d;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.o$a */
    public static final class C29263a {
        private C29263a() {
        }

        public /* synthetic */ C29263a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C48707l m68967a(String str, C48707l lVar) {
            C52711k.m112240b(str, "panel");
            C52711k.m112240b(lVar, "listener");
            return new C29262o(str, lVar, null);
        }
    }

    /* renamed from: a */
    private final String m68964a() {
        if (TextUtils.equals(this.f76624a, "default")) {
            return "effect_panel_info";
        }
        return C29257k.m68954a(this.f76624a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
        PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
        long a = this.f76626d.mo33754a(TimeUnit.MILLISECONDS);
        C48707l lVar = this.f76625b;
        if (lVar != null) {
            lVar.mo8638a(panelInfoModel);
        }
        C47702b.f120193a.mo94984a("tool_performance_api", C42438az.m93209a().mo86526a("api_type", m68964a()).mo86524a("duration", a).mo86523a("status", 0).f107329a);
    }

    /* renamed from: a */
    public final void mo59192a(C48649d dVar) {
        Integer num;
        long a = this.f76626d.mo33754a(TimeUnit.MILLISECONDS);
        C48707l lVar = this.f76625b;
        if (lVar != null) {
            lVar.mo59192a(dVar);
        }
        C47702b bVar = C47702b.f120193a;
        String str = "tool_performance_api";
        C42438az a2 = C42438az.m93209a().mo86526a("api_type", m68964a()).mo86524a("duration", a).mo86523a("status", 1).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0));
        String str2 = "error_code";
        if (dVar != null) {
            num = Integer.valueOf(dVar.f122279a);
        } else {
            num = null;
        }
        bVar.mo94984a(str, a2.mo86525a(str2, (Object) num).f107329a);
    }

    private C29262o(String str, C48707l lVar) {
        this.f76624a = str;
        this.f76625b = lVar;
        this.f76626d = C17429o.m42675b();
    }

    public /* synthetic */ C29262o(String str, C48707l lVar, C52707g gVar) {
        this(str, lVar);
    }
}
