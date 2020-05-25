package com.bytedance.android.live.broadcast.effect.sticker.p209a;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.effect.sticker.C3284c;
import com.bytedance.android.live.broadcast.effect.sticker.C3285d;
import com.bytedance.android.live.broadcast.effect.sticker.C3286e;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.a.a */
public abstract class C3277a implements C3043d {

    /* renamed from: a */
    public final C48893h f9454a = ((IHostContext) C4116c.m10249a(IHostContext.class)).getEffectManager();

    /* renamed from: b */
    public final List<C3044a> f9455b = new ArrayList();

    /* renamed from: c */
    public final List<String> f9456c = new ArrayList();

    /* renamed from: a */
    public void mo8279a() {
        this.f9455b.clear();
    }

    /* renamed from: a */
    private static C3286e mo8647a(String str) {
        if (C3037b.f8913a.equals(str)) {
            return new C3284c();
        }
        if (C3037b.f8914b.equals(str)) {
            return new C3285d();
        }
        return new C3286e();
    }

    /* renamed from: a */
    public final boolean mo8282a(C8688c cVar) {
        if (cVar == null) {
            return true;
        }
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USE_EFFECT_DOWNLOAD_CACHE.mo9431a()).booleanValue() && this.f9456c.contains(cVar.f23759t)) {
            return true;
        }
        if (C48580c.m105108a()) {
            return C48580c.m105110b().mo96134a(this.f9454a, C3287f.m9012a(cVar));
        }
        return this.f9454a.mo96687a(C3287f.m9012a(cVar));
    }

    /* renamed from: a */
    public final void mo8646a(String str, String str2, C48715t tVar) {
        if (this.f9454a != null) {
            this.f9454a.mo96676a(str, str2, tVar);
        }
    }

    /* renamed from: a */
    public final void mo8281a(final String str, C8688c cVar, final C3044a aVar) {
        if (cVar != null && cVar.f23741b != null && !cVar.f23741b.f8730b.isEmpty() && !mo8282a(cVar)) {
            final C3286e a = mo8647a(str);
            a.mo8659e();
            this.f9454a.mo96665a(C3287f.m9012a(cVar), (C48705j) new C48705j() {
                /* renamed from: a */
                public final void mo8643a(Effect effect) {
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    Effect effect = (Effect) obj;
                    C8688c a = C3287f.m9010a(effect);
                    a.f23761v = false;
                    a.f23760u = true;
                    a.mo8655b();
                    C3277a.this.f9456c.add(effect.getUnzipPath());
                    for (C3044a c : C3277a.this.f9455b) {
                        c.mo8285c(str, a);
                    }
                    if (aVar != null) {
                        aVar.mo8285c(str, a);
                    }
                }

                /* renamed from: a */
                public final void mo8644a(Effect effect, C48649d dVar) {
                    C48893h hVar = C3277a.this.f9454a;
                    if (effect != null) {
                        hVar.f123013d.mo96153c(effect.getId());
                        C48620c cVar = hVar.f123013d;
                        StringBuilder sb = new StringBuilder();
                        sb.append(effect.getId());
                        sb.append(".zip");
                        cVar.mo96153c(sb.toString());
                    }
                    C8688c a = C3287f.m9010a(effect);
                    a.f23761v = false;
                    a.mo8656b(dVar.f122279a, dVar.f122280b);
                    for (C3044a b : C3277a.this.f9455b) {
                        b.mo8284b(str, a);
                    }
                    if (aVar != null) {
                        aVar.mo8284b(str, a);
                    }
                }
            });
            cVar.f23761v = true;
            for (C3044a a2 : this.f9455b) {
                a2.mo8283a(str, cVar);
            }
            if (aVar != null) {
                aVar.mo8283a(str, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo8645a(String str, String str2, C48710o oVar) {
        if (oVar != null) {
            if (this.f9454a == null || str == null || str2 == null || TextUtils.equals("NULL", str2.toUpperCase())) {
                oVar.mo8642b();
            } else {
                this.f9454a.mo96675a(str, str2, oVar);
            }
        }
    }
}
