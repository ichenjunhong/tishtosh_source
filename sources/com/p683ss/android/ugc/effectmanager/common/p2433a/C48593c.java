package com.p683ss.android.ugc.effectmanager.common.p2433a;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.c */
public final class C48593c {

    /* renamed from: a */
    public static final C52668f f122163a = C52732g.m112286a(C52757k.SYNCHRONIZED, C48595b.f122167a);

    /* renamed from: b */
    public static final C48594a f122164b = new C48594a(null);

    /* renamed from: c */
    private HashMap<String, C48620c> f122165c;

    /* renamed from: com.ss.android.ugc.effectmanager.common.a.c$a */
    public static final class C48594a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f122166a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C48594a.class), "instance", "getInstance()Lcom/ss/android/ugc/effectmanager/common/cache/EffectCacheManager;"))};

        private C48594a() {
        }

        /* renamed from: a */
        public static C48593c m105132a() {
            return (C48593c) C48593c.f122163a.getValue();
        }

        public /* synthetic */ C48594a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.a.c$b */
    static final class C48595b extends C52712l implements C52670a<C48593c> {

        /* renamed from: a */
        public static final C48595b f122167a = new C48595b();

        C48595b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C48593c(null);
        }
    }

    private C48593c() {
        this.f122165c = new HashMap<>();
    }

    public /* synthetic */ C48593c(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final synchronized C48620c mo96146a(String str) {
        C52711k.m112240b(str, "dirPath");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!this.f122165c.containsKey(str)) {
            return null;
        }
        return (C48620c) this.f122165c.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo96147a(String str, C48620c cVar) {
        C52711k.m112240b(str, "dirPath");
        this.f122165c.put(str, cVar);
    }
}
