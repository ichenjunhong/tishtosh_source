package com.p683ss.android.ugc.aweme.main;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.c */
public final class C36546c {

    /* renamed from: a */
    public static final C36546c f93635a = new C36546c();

    /* renamed from: com.ss.android.ugc.aweme.main.c$a */
    static final class C36547a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f93636a;

        C36547a(String str) {
            this.f93636a = str;
        }

        public final /* synthetic */ Object call() {
            String str;
            if (AudioUtils.m57298c(C11010c.m22280a())) {
                str = "on";
            } else {
                str = "off";
            }
            C26890h.m65011a("earphone_status", C23089d.m56640a().mo47829a("plugin_type", this.f93636a).mo47829a("to_status", str).f61491a);
            return C52860x.f131107a;
        }
    }

    private C36546c() {
    }

    /* renamed from: a */
    public static final void m82442a(String str) {
        C52711k.m112240b(str, "pluginType");
        C0013i.m18a((Callable<TResult>) new C36547a<TResult>(str), (Executor) C26890h.m65003a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r5 == null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m82443a(java.lang.String r3, java.lang.String r4, com.p683ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r0 = "earphone_unplug"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "video_status"
            com.ss.android.ugc.aweme.app.f.d r3 = r1.mo47829a(r2, r3)
            java.lang.String r1 = "enter_from"
            if (r4 != 0) goto L_0x0012
            java.lang.String r4 = ""
        L_0x0012:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r1, r4)
            java.lang.String r4 = "group_id"
            if (r5 == 0) goto L_0x0020
            java.lang.String r1 = r5.getAid()
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r1 = ""
        L_0x0022:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r1)
            java.lang.String r4 = "author_id"
            if (r5 == 0) goto L_0x0030
            java.lang.String r5 = r5.getAuthorUid()
            if (r5 != 0) goto L_0x0032
        L_0x0030:
            java.lang.String r5 = ""
        L_0x0032:
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.C36546c.m82443a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
