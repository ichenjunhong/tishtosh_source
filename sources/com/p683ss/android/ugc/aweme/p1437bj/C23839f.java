package com.p683ss.android.ugc.aweme.p1437bj;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39578az;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w.C39646a;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bj.f */
public final class C23839f implements C39578az {

    /* renamed from: com.ss.android.ugc.aweme.bj.f$a */
    static final class C23840a implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C39646a f63501a;

        C23840a(C39646a aVar) {
            this.f63501a = aVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            this.f63501a.mo80715a(strArr, iArr);
        }
    }

    /* renamed from: a */
    public final boolean mo49437a() {
        return C47946e.m103735a();
    }

    /* renamed from: a */
    public final int mo49434a(Context context) {
        C52711k.m112240b(context, "context");
        return C47946e.m103737c(context);
    }

    /* renamed from: b */
    public final int mo49439b(Context context) {
        C52711k.m112240b(context, "context");
        return C47946e.m103734a(context);
    }

    /* renamed from: c */
    public final int mo49440c(Context context) {
        C52711k.m112240b(context, "context");
        return C47946e.m103736b(context);
    }

    /* renamed from: d */
    public final void mo49441d(Context context) {
        C52711k.m112240b(context, "context");
        C47720bh.m103294a(context);
    }

    /* renamed from: a */
    public final int mo49435a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "permission");
        return C0636b.m2090a(context, str);
    }

    /* renamed from: a */
    public final boolean mo49438a(Activity activity, String str) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "permission");
        return C0636b.m1719a(activity, str);
    }

    /* renamed from: a */
    public final void mo49436a(FragmentActivity fragmentActivity, C39646a aVar, String... strArr) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aVar, "requestListener");
        C52711k.m112240b(strArr, "permissions");
        C23361b.m57419a(fragmentActivity, strArr, new C23840a(aVar));
    }
}
