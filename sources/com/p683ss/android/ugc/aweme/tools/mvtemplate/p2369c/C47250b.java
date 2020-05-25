package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.b */
public final class C47250b {

    /* renamed from: a */
    public static final C47250b f119319a = new C47250b();

    private C47250b() {
    }

    /* renamed from: b */
    private static boolean m102578b(MvThemeData mvThemeData) {
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.mo94475c()) && !TextUtils.isEmpty(mvThemeData.mo94472a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m102577a(MvThemeData mvThemeData) {
        if (mvThemeData != null) {
            C23569o.m57776a("mv_resource_download_error_state", 11, C23088c.m56631a().mo47824a("url", mvThemeData.mo94475c()).mo47824a("mv_res_id", mvThemeData.mo94472a()).mo47824a("mv_res_name", mvThemeData.mo94479f()).mo47825b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r2 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r2 == null) goto L_0x0057;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94519a(com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r5, com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d r6, boolean r7) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = m102578b(r5)
            if (r0 != 0) goto L_0x000c
            m102577a(r5)
        L_0x000c:
            if (r7 == 0) goto L_0x0016
            java.lang.String r5 = "mv_resource_download_error_state"
            r6 = 0
            r7 = 0
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r5, r6, r7)
            return
        L_0x0016:
            java.lang.String r7 = "mv_resource_download_error_state"
            r0 = 1
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r2 = "url"
            java.lang.String r3 = r5.mo94475c()
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "mv_res_id"
            java.lang.String r3 = r5.mo94472a()
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r2, r3)
            java.lang.String r2 = "mv_res_name"
            java.lang.String r5 = r5.mo94479f()
            com.ss.android.ugc.aweme.app.f.c r5 = r1.mo47824a(r2, r5)
            java.lang.String r1 = "error_code"
            if (r6 == 0) goto L_0x0047
            int r2 = r6.f122279a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r2 = ""
        L_0x0049:
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r1, r2)
            java.lang.String r1 = "error_message"
            if (r6 == 0) goto L_0x0057
            java.lang.String r2 = r6.toString()
            if (r2 != 0) goto L_0x0059
        L_0x0057:
            java.lang.String r2 = ""
        L_0x0059:
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r1, r2)
            java.lang.String r1 = "exception"
            if (r6 == 0) goto L_0x006f
            java.lang.Exception r2 = r6.f122281c
            if (r2 != 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            java.lang.Exception r6 = r6.f122281c
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r6 = com.facebook.common.p920d.C13696m.m27668c(r6)
            goto L_0x0071
        L_0x006f:
            java.lang.String r6 = ""
        L_0x0071:
            com.ss.android.ugc.aweme.app.f.c r5 = r5.mo47824a(r1, r6)
            org.json.JSONObject r5 = r5.mo47825b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r7, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47250b.mo94519a(com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData, com.ss.android.ugc.effectmanager.common.g.d, boolean):void");
    }
}
