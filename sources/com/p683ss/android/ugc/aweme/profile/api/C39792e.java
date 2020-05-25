package com.p683ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;

/* renamed from: com.ss.android.ugc.aweme.profile.api.e */
public final class C39792e {

    /* renamed from: a */
    private static C39792e f101566a;

    /* renamed from: a */
    public static C39792e m88511a() {
        if (f101566a == null) {
            f101566a = new C39792e();
        }
        return f101566a;
    }

    /* renamed from: a */
    public static void m88512a(Handler handler, String str) {
        C39795h.m88517a(str);
        C23566n.m57766a().mo48750a(handler, new C39794g(str), 0);
    }

    /* renamed from: b */
    private static void m88514b(Handler handler, String str) {
        C39795h.m88517a(str);
        C23566n.m57766a().mo48750a(handler, new C39793f(str), 0);
    }

    /* renamed from: a */
    public final void mo80873a(Handler handler, String str, int i) {
        m88513a(handler, str, null, 0);
    }

    /* renamed from: a */
    private void m88513a(Handler handler, String str, String str2, int i) {
        String str3;
        if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
            str3 = C39791d.m88509b(null, str, null, i);
        } else {
            str3 = C39791d.m88504a(str, (String) null, i);
        }
        m88514b(handler, str3);
    }

    /* renamed from: a */
    public final void mo80874a(Handler handler, String str, String str2, String str3, int i) {
        String str4;
        if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
            str4 = C39791d.m88509b(str2, str, str3, i);
        } else {
            str4 = C39791d.m88505a(str, str2, str3, i);
        }
        m88512a(handler, str4);
    }
}
