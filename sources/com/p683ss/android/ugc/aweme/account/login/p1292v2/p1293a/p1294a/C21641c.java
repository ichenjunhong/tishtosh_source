package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.p1303p.C22100a.C22101a;
import p064c.p065a.C2193n;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.c */
public final class C21641c extends C21838c {

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.c$a */
    static final class C21642a<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ C21641c f58660a;

        C21642a(C21641c cVar) {
            this.f58660a = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21839d.m54508a((Fragment) this.f58660a.f59129a, true);
            C21829b bVar = this.f58660a.f59129a;
            Bundle arguments = this.f58660a.f59129a.getArguments();
            if (arguments == null) {
                C52711k.m112234a();
            }
            arguments.putInt("next_page", C21850i.EMAIL_SMS_VERIFY.getValue());
            C52711k.m112236a((Object) arguments, "fragment.arguments!!.app…RIFY.value)\n            }");
            bVar.mo45961a(arguments);
        }
    }

    /* renamed from: a */
    public final boolean mo45905a() {
        ((C2193n) C22101a.m54911a().invoke(this.f59129a, C21839d.f59130a.mo45972a((Fragment) this.f59129a), "user_click")).mo6496c((C1710e<? super T>) new C21642a<Object>(this)).mo6491b();
        return true;
    }

    public C21641c(C21829b bVar) {
        C52711k.m112240b(bVar, "fragment");
        super(bVar);
    }
}
