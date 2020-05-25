package com.p683ss.android.ugc.aweme.tools.beauty.p2353xs;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.effectplatform.C29243d;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48893h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.xs.EffectPlatformForXS */
public class EffectPlatformForXS implements C0183j, C29252f {

    /* renamed from: a */
    C29243d f118580a;

    /* renamed from: b */
    public C48890g f118581b;

    /* renamed from: a */
    public final void mo59138a(String str, boolean z, C48702g gVar) {
        m101947a();
        this.f118580a.mo59175a(str, z, gVar);
    }

    /* renamed from: a */
    public final void mo59139a(String str, boolean z, String str2, int i, int i2, C48707l lVar) {
        this.f118580a.mo59182b(str, z, str2, i, i2, lVar);
    }

    /* renamed from: a */
    public final void mo59134a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C48701f fVar) {
        this.f118580a.mo59171a(str, str2, z, i, i2, i3, str3, fVar);
    }

    /* renamed from: a */
    public final void mo59137a(String str, boolean z, int i, int i2, C48708m mVar) {
        m101947a();
        this.f118580a.mo59174a(str, z, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo59132a(String str, String str2, C48705j jVar) {
        m101947a();
        this.f118580a.mo59169a(str, str2, jVar);
    }

    /* renamed from: a */
    public final void mo59141a(List<String> list, Map<String, String> map, boolean z, C48704i iVar) {
        m101947a();
        this.f118580a.mo59178a(list, map, z, iVar);
    }

    /* renamed from: a */
    public final void mo59140a(List<String> list, Map<String, String> map, C48703h hVar) {
        m101947a();
        this.f118580a.mo59177a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo59131a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        this.f118580a.mo59168a(str, str2, i, i2, map, sVar);
    }

    /* renamed from: a */
    public final void mo59133a(String str, String str2, C48715t tVar) {
        this.f118580a.mo59170a(str, str2, tVar);
    }

    /* renamed from: a */
    public final void mo59136a(String str, List<String> list, String str2, C48710o oVar) {
        this.f118580a.mo59173a(str, list, str2, oVar);
    }

    /* renamed from: a */
    public final void mo59135a(String str, List<String> list, Boolean bool, C48711p pVar) {
        this.f118580a.mo59172a(str, list, bool, pVar);
    }

    /* renamed from: a */
    public final boolean mo59142a(Effect effect) {
        return this.f118580a.mo59179a(effect);
    }

    /* renamed from: d */
    public final void mo59146d() {
        this.f118580a.mo59184c();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void destroy() {
        this.f118580a.mo59180b();
    }

    /* renamed from: e */
    public final C48893h mo59148e() {
        return this.f118580a.f76577b;
    }

    /* renamed from: a */
    private void m101947a() {
        String str;
        if (this.f118581b == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f118581b.f122959e) || TextUtils.equals("0", this.f118581b.f122959e)) {
            C48890g gVar = this.f118581b;
            if (AppLog.getServerDeviceId() == null) {
                str = "0";
            } else {
                str = AppLog.getServerDeviceId();
            }
            gVar.f122959e = str;
        }
    }

    /* renamed from: a */
    public final void mo59122a(C0184k kVar) {
        kVar.getLifecycle().mo324a(this);
    }

    /* renamed from: b */
    public final boolean mo59145b(Effect effect) {
        return this.f118580a.f76577b.mo96693b(effect);
    }

    /* renamed from: a */
    public final void mo59125a(String str) {
        if (this.f118580a != null) {
            this.f118580a.mo59161a(str);
        }
    }

    /* renamed from: a */
    public final void mo59123a(Effect effect, C48705j jVar) {
        m101947a();
        this.f118580a.mo59159a(effect, jVar);
    }

    /* renamed from: a */
    public final void mo59124a(ProviderEffect providerEffect, C48697b bVar) {
        m101947a();
        this.f118580a.mo59160a(providerEffect, bVar);
    }

    /* renamed from: a */
    public final void mo59126a(String str, C48702g gVar) {
        m101947a();
        this.f118580a.mo59162a(str, gVar);
    }

    /* renamed from: a */
    public final void mo59127a(String str, C48706k kVar) {
        this.f118580a.mo59163a(str, kVar);
    }

    /* renamed from: a */
    public final void mo59128a(String str, C48709n nVar) {
        this.f118580a.mo59164a(str, nVar);
    }

    /* renamed from: b */
    public final void mo59143b(String str, boolean z, C48702g gVar) {
        m101947a();
        this.f118580a.mo59181b(str, z, gVar);
    }

    /* renamed from: b */
    public final void mo59144b(List<String> list, Map<String, String> map, C48703h hVar) {
        if (this.f118580a != null) {
            this.f118580a.mo59183b(list, map, hVar);
        }
    }

    /* renamed from: a */
    public final void mo59130a(String str, String str2, int i, int i2, C48708m mVar) {
        m101947a();
        this.f118580a.mo59167a(str, str2, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo59129a(String str, String str2, int i, int i2, int i3, String str3, C48701f fVar) {
        this.f118580a.mo59165a(str, str2, i, i2, i3, str3, fVar);
    }
}
