package com.p683ss.android.ugc.aweme.account.login.p1282b;

import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.account.p1277j.C21001e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.l */
public class C21107l extends C13139p {
    public void onSuccess(C12993e<C13120s> eVar) {
        C21001e.m53384b();
    }

    public void onError(C12993e<C13120s> eVar, int i) {
        Integer num;
        String str;
        String str2 = null;
        if (eVar != null) {
            num = Integer.valueOf(eVar.f34000c);
        } else {
            num = null;
        }
        if (num == null) {
            str = "";
        } else {
            if (eVar == null) {
                C52711k.m112234a();
            }
            str = String.valueOf(eVar.f34000c);
        }
        if (eVar != null) {
            str2 = eVar.f34001d;
        }
        C21001e.m53382a(str, str2);
    }
}
