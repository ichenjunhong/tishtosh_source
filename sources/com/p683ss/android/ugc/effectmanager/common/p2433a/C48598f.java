package com.p683ss.android.ugc.effectmanager.common.p2433a;

import android.util.LruCache;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.f */
public final class C48598f extends C48606a {

    /* renamed from: a */
    public static final C48599a f122176a = new C48599a(null);

    /* renamed from: b */
    private final C48641b f122177b;

    /* renamed from: c */
    private final LruCache<String, Effect> f122178c = new LruCache<>(30);

    /* renamed from: com.ss.android.ugc.effectmanager.common.a.f$a */
    public static final class C48599a {
        private C48599a() {
        }

        public /* synthetic */ C48599a(C52707g gVar) {
            this();
        }
    }

    public C48598f(C48890g gVar) {
        C52711k.m112240b(gVar, "effectConfiguration");
        StringBuilder sb = new StringBuilder();
        File file = gVar.f122964j;
        C52711k.m112236a((Object) file, "effectConfiguration.effectDir");
        sb.append(file.getAbsolutePath());
        sb.append("/effectmodelmap");
        super(sb.toString(), 0, 0, 3145728, null, 22, null);
        this.f122177b = gVar.f122976v;
    }

    /* renamed from: a */
    public final void mo96158a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        try {
            C48641b bVar = this.f122177b;
            if (bVar != null) {
                String a = bVar.mo59190a(effect);
                if (a != null) {
                    this.f122178c.put(effect.getId(), effect);
                    String id = effect.getId();
                    C52711k.m112236a((Object) id, "effect.id");
                    super.mo96148a(id, a);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final Effect mo96159e(String str) {
        C52711k.m112240b(str, "effectId");
        Effect effect = (Effect) this.f122178c.get(str);
        if (effect != null) {
            return effect;
        }
        try {
            InputStream b = super.mo96152b(str);
            if (b == null) {
                return null;
            }
            C48641b bVar = this.f122177b;
            if (bVar != null) {
                return (Effect) bVar.mo59189a(b, Effect.class);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
