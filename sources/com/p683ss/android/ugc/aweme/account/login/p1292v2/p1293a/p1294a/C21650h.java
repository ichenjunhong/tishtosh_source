package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.h */
public final class C21650h extends C21838c {

    /* renamed from: b */
    private final C21829b f58671b;

    /* renamed from: c */
    private final String f58672c;

    /* renamed from: a */
    public final boolean mo45905a() {
        C21135a b = C21839d.f59130a.mo45973b((Fragment) this.f58671b);
        C21829b bVar = this.f58671b;
        String a = C21134a.m53619a(b);
        C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNumber(phone)");
        C21677s.m54407a(bVar, a, this.f58672c, C21848h.SIGN_UP, this.f58671b.mo45965k()).mo6491b();
        return true;
    }

    public C21650h(C21829b bVar, String str) {
        C52711k.m112240b(bVar, "frag");
        C52711k.m112240b(str, "smsCodeKey");
        super(bVar);
        this.f58671b = bVar;
        this.f58672c = str;
    }
}
