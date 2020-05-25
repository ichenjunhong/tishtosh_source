package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.c */
public final class C41252c implements C35889c {

    /* renamed from: a */
    public static final String f104695a = f104695a;

    /* renamed from: b */
    public static final String f104696b = f104696b;

    /* renamed from: c */
    public static final String f104697c = f104697c;

    /* renamed from: d */
    public static final String f104698d = f104698d;

    /* renamed from: e */
    public static final String f104699e = f104699e;

    /* renamed from: f */
    public static final C41253a f104700f = new C41253a(null);

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.c$a */
    public static final class C41253a {
        private C41253a() {
        }

        public /* synthetic */ C41253a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        TeaAgent.activeUser(AwemeApplication.m56199a());
        C23859b.m58575b().mo49465a((Context) AwemeApplication.m56199a(), f104696b, C11010c.m22288i());
        C23859b.m58575b().mo49465a((Context) AwemeApplication.m56199a(), f104697c, C11010c.m22295p());
        C23859b.m58575b().mo49465a((Context) AwemeApplication.m56199a(), f104698d, AppLog.getServerDeviceId());
        C23859b.m58575b().mo49465a((Context) AwemeApplication.m56199a(), f104699e, AppLog.getInstallId());
        C18898c.m46010a(context, "monitor", "app_alert", 0, 0);
    }
}
