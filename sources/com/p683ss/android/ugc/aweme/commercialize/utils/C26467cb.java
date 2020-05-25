package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cb */
public final class C26467cb {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69754a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26467cb.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C26467cb f69755b = new C26467cb();

    /* renamed from: c */
    private static final String f69756c = f69756c;

    /* renamed from: d */
    private static final C52668f f69757d = C52732g.m112285a(C26468a.f69760a);

    /* renamed from: e */
    private static boolean f69758e = true;

    /* renamed from: f */
    private static String f69759f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cb$a */
    static final class C26468a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C26468a f69760a = new C26468a();

        C26468a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("undisplay_ad_keva_name");
        }
    }

    private C26467cb() {
    }

    /* renamed from: a */
    private final Keva m63993a() {
        return (Keva) f69757d.getValue();
    }

    /* renamed from: a */
    public final String mo54181a(Set<Long> set) {
        boolean z;
        C52711k.m112240b(set, "discardCidSet");
        HashSet<Long> hashSet = new HashSet<>(set);
        StringBuilder sb = new StringBuilder();
        for (Long l : hashSet) {
            C52711k.m112236a((Object) l, "it");
            sb.append(l.longValue());
            sb.append(",");
        }
        CharSequence charSequence = sb;
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.deleteCharAt(C52830p.m112461f(charSequence));
        }
        f69759f = sb.toString();
        m63993a().storeString(f69756c, f69759f);
        return f69759f;
    }
}
