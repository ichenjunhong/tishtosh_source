package com.p683ss.android.ugc.effectmanager.common.p2433a;

import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.InputStream;
import java.util.regex.Pattern;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.d */
public final class C48596d implements C48620c {

    /* renamed from: a */
    public C48620c f122168a;

    /* renamed from: b */
    private boolean f122169b;

    /* renamed from: a */
    public final void mo96151a(Pattern pattern) {
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            cVar.mo96151a(pattern);
        }
    }

    /* renamed from: b */
    public final InputStream mo96152b(String str) {
        C52711k.m112240b(str, "key");
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            return cVar.mo96152b(str);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo96153c(String str) {
        C52711k.m112240b(str, "key");
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            return cVar.mo96153c(str);
        }
        return false;
    }

    /* renamed from: c_ */
    public final String mo96154c_(String str) {
        C52711k.m112240b(str, "key");
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            return cVar.mo96154c_(str);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo96155d(String str) {
        C52711k.m112240b(str, "key");
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            return cVar.mo96155d(str);
        }
        return false;
    }

    public C48596d(C48890g gVar) {
        C48620c cVar;
        C52711k.m112240b(gVar, "configuration");
        this.f122169b = gVar.f122954G;
        if (this.f122169b) {
            cVar = new C48601h(gVar);
        } else {
            cVar = C48604i.m105155a(gVar);
        }
        this.f122168a = cVar;
    }

    /* renamed from: a */
    public final void mo96149a(Effect effect) throws Exception {
        C52711k.m112240b(effect, "effect");
        C48620c cVar = this.f122168a;
        if (cVar instanceof C48604i) {
            C48620c cVar2 = this.f122168a;
            if (cVar2 != null) {
                ((C48604i) cVar2).mo96163a(effect);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
        }
        if (cVar instanceof C48601h) {
            C48620c cVar3 = this.f122168a;
            if (cVar3 != null) {
                C48601h hVar = (C48601h) cVar3;
                C52711k.m112240b(effect, "effect");
                C48671i.f122310a.mo96258b(effect.getZipPath(), effect.getUnzipPath());
                C48608a aVar = hVar.f122207e;
                if (aVar != null) {
                    aVar.mo96177d(C48608a.m105182f(effect.getId()));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(effect.getId());
                sb.append(".zip");
                hVar.mo96153c(sb.toString());
                C48598f fVar = C48601h.f122179a;
                if (fVar != null) {
                    fVar.mo96158a(effect);
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.NewEffectDiskLruCache");
            }
        }
    }

    /* renamed from: a */
    public final long mo96148a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        C48620c cVar = this.f122168a;
        if (cVar != null) {
            return cVar.mo96148a(str, str2);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo96150a(Effect effect, InputStream inputStream, String str, long j, C48625b bVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(inputStream, "inputStream");
        C48620c cVar = this.f122168a;
        if (cVar instanceof C48604i) {
            C48620c cVar2 = this.f122168a;
            if (cVar2 != null) {
                ((C48604i) cVar2).mo96164a(effect, inputStream, j, bVar);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
        }
        if (cVar instanceof C48601h) {
            C48620c cVar3 = this.f122168a;
            if (cVar3 != null) {
                ((C48601h) cVar3).mo96161a(effect, inputStream, str, j, bVar);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.NewEffectDiskLruCache");
            }
        }
    }
}
