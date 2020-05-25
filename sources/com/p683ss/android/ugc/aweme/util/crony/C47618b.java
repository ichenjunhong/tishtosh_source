package com.p683ss.android.ugc.aweme.util.crony;

/* renamed from: com.ss.android.ugc.aweme.util.crony.b */
public final class C47618b implements C47619c {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo94932a(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1245625446: goto L_0x0066;
                case 0: goto L_0x005c;
                case 100: goto L_0x0052;
                case 103: goto L_0x0047;
                case 117: goto L_0x003d;
                case 118: goto L_0x0033;
                case 3599307: goto L_0x0029;
                case 94746189: goto L_0x001e;
                case 688591589: goto L_0x0014;
                case 1109191185: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0070
        L_0x000a:
            java.lang.String r0 = "deviceId"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 3
            goto L_0x0071
        L_0x0014:
            java.lang.String r0 = "versionCode"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 5
            goto L_0x0071
        L_0x001e:
            java.lang.String r0 = "clear"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 9
            goto L_0x0071
        L_0x0029:
            java.lang.String r0 = "user"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0033:
            java.lang.String r0 = "v"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 6
            goto L_0x0071
        L_0x003d:
            java.lang.String r0 = "u"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 2
            goto L_0x0071
        L_0x0047:
            java.lang.String r0 = "g"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 8
            goto L_0x0071
        L_0x0052:
            java.lang.String r0 = "d"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 4
            goto L_0x0071
        L_0x005c:
            java.lang.String r0 = ""
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 0
            goto L_0x0071
        L_0x0066:
            java.lang.String r0 = "gitsha"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0070
            r3 = 7
            goto L_0x0071
        L_0x0070:
            r3 = -1
        L_0x0071:
            switch(r3) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00d0;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00aa;
                case 9: goto L_0x0077;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r3 = "don't support key"
            return r3
        L_0x0077:
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r0 = "MainTabPreferences"
            android.content.SharedPreferences r3 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r3, r0, r1)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.clear()
            r3.apply()
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r3 = r3.getFollowGuideShown()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.mo47776a(r0)
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.String r0 = "清除成功，建议冷起"
            com.bytedance.ies.dmt.ui.d.a r3 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r3, r0)
            r3.mo19066a()
            java.lang.String r3 = "OK"
            return r3
        L_0x00aa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "GitSHA: "
            r3.<init>(r0)
            java.lang.String r0 = com.bytedance.ies.ugc.p694a.C11010c.m22291l()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "UpdateVersionCode:"
            r3.<init>(r0)
            long r0 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00d0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "DeviceId:"
            r3.<init>(r0)
            java.lang.String r0 = com.p683ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00e3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "userID:"
            r3.<init>(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r0 = r0.getCurUserId()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L_0x00fa:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "UserId: "
            r3.<init>(r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r0 = r0.getCurUserId()
            r3.append(r0)
            java.lang.String r0 = "\nDeviceId: "
            r3.append(r0)
            java.lang.String r0 = com.p683ss.android.common.applog.TeaAgent.getServerDeviceId()
            r3.append(r0)
            java.lang.String r0 = "\nUpdateVerionCode: "
            r3.append(r0)
            long r0 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()
            r3.append(r0)
            java.lang.String r0 = "\nGitSHA: "
            r3.append(r0)
            java.lang.String r0 = com.bytedance.ies.ugc.p694a.C11010c.m22291l()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.util.crony.C47618b.mo94932a(java.lang.String):java.lang.String");
    }
}
