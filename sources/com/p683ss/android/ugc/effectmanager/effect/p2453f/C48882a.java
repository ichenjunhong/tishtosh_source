package com.p683ss.android.ugc.effectmanager.effect.p2453f;

import com.p683ss.android.ugc.effectmanager.common.p2433a.C48593c.C48594a;
import com.p683ss.android.ugc.effectmanager.common.p2433a.C48596d;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48632h;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48694b;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.f.a */
public final class C48882a implements C48632h {

    /* renamed from: a */
    public Effect f122933a;

    /* renamed from: b */
    public String f122934b;

    /* renamed from: c */
    public String f122935c;

    /* renamed from: d */
    public C48694b f122936d;

    /* renamed from: e */
    public C48642c f122937e;

    /* renamed from: a */
    public final boolean mo96212a(String str) {
        C52711k.m112240b(str, "zipFilePath");
        String parent = new File(str).getParent();
        String str2 = this.f122936d.f122359c;
        C52711k.m112236a((Object) str2, "arguments.effectDir");
        C52711k.m112236a((Object) parent, "dirPath");
        if (!C52711k.m112239a((Object) str2, (Object) parent)) {
            C48642c cVar = this.f122937e;
            if (cVar != null) {
                cVar.mo59187a("effect_download_error", 1, C48670h.m105314a().mo96255a("app_id", this.f122934b).mo96255a("access_key", this.f122935c).mo96255a("effect_id", this.f122933a.getEffectId()).mo96255a("EffectDir", str2).mo96255a("zippath", parent).mo96256b());
            }
        }
        C48620c a = C48594a.m105132a().mo96146a(parent);
        if (a instanceof C48596d) {
            ((C48596d) a).mo96149a(this.f122933a);
        } else {
            C48671i.f122310a.mo96258b(str, this.f122933a.getUnzipPath());
            C48671i.f122310a.mo96260b(str);
        }
        return true;
    }

    public C48882a(String str, String str2, C48694b bVar, C48642c cVar) {
        C52711k.m112240b(str, "appId");
        C52711k.m112240b(str2, "accessKey");
        C52711k.m112240b(bVar, "arguments");
        this.f122934b = str;
        this.f122935c = str2;
        this.f122936d = bVar;
        this.f122937e = cVar;
        Effect effect = this.f122936d.f122357a;
        C52711k.m112236a((Object) effect, "arguments.effect");
        this.f122933a = effect;
    }
}
