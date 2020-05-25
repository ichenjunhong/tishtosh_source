package com.p683ss.android.ugc.aweme.account.util;

import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.util.o */
public final class C22275o {

    /* renamed from: a */
    public static final C22275o f60044a = new C22275o();

    private C22275o() {
    }

    /* renamed from: a */
    private static boolean m55132a(Integer num) {
        if (num == null || num.intValue() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m55130a(C12990b bVar) {
        Integer num;
        String str = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f34000c);
        } else {
            num = null;
        }
        if (bVar != null) {
            str = bVar.f34001d;
        }
        return m55131a(num, str);
    }

    /* renamed from: a */
    public static final String m55131a(Integer num, String str) {
        String str2;
        boolean z;
        if (!m55132a(num)) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return str;
            }
        }
        if (C23826bi.m58460b() == null) {
            str2 = "Sorry, error occurred";
        } else {
            str2 = C23826bi.m58460b().getString(R.string.cg1);
        }
        C52711k.m112236a((Object) str2, "if (ModuleStore.getAppli…navailable)\n            }");
        return str2;
    }
}
