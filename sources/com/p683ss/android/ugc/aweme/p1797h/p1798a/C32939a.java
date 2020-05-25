package com.p683ss.android.ugc.aweme.p1797h.p1798a;

import android.net.Uri;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.p1797h.p1799b.C32946a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.h.a.a */
public class C32939a {

    /* renamed from: c */
    private static C32939a f85601c;

    /* renamed from: a */
    public boolean f85602a;

    /* renamed from: b */
    public C32946a f85603b;

    /* renamed from: d */
    private C32944d f85604d;

    /* renamed from: e */
    private C32946a f85605e;

    private C32939a() {
    }

    /* renamed from: e */
    private static boolean m75841e() {
        return false;
    }

    /* renamed from: a */
    public static C32939a m75837a() {
        if (f85601c == null) {
            synchronized (C32939a.class) {
                if (f85601c == null) {
                    f85601c = new C32939a();
                }
            }
        }
        return f85601c;
    }

    /* renamed from: b */
    public final C32942b mo69832b() {
        if (!m75841e() || this.f85604d == null || this.f85604d.f85619c == null) {
            return null;
        }
        for (C32942b bVar : this.f85604d.f85619c) {
            if (bVar.f85613f == C20854a.m53167g().getCurUser().getLoginPlatform() && bVar.f85612e) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private boolean m75839c() {
        HashMap hashMap;
        int i;
        try {
            hashMap = (HashMap) new C17971f().mo34885a((String) C23183v.m56778a().mo47924t().mo47782d(), new C17956a<HashMap<String, Integer>>() {
            }.f49843c);
        } catch (C18091u unused) {
            hashMap = null;
        }
        int intValue = ((Integer) SharePrefCache.inst().getCompleteProfilePolicyTimes().mo47782d()).intValue();
        if (hashMap == null || !hashMap.containsKey(C20854a.m53167g().getCurUserId())) {
            i = 0;
        } else {
            i = ((Integer) hashMap.get(C20854a.m53167g().getCurUserId())).intValue();
        }
        if (i >= intValue) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m75840d() {
        HashMap hashMap;
        long j;
        try {
            hashMap = (HashMap) new C17971f().mo34885a((String) C23183v.m56778a().mo47923s().mo47782d(), new C17956a<HashMap<String, Long>>() {
            }.f49843c);
        } catch (C18091u unused) {
            hashMap = null;
        }
        if (hashMap == null || !hashMap.containsKey(C20854a.m53167g().getCurUserId())) {
            j = 0;
        } else {
            j = ((Long) hashMap.get(C20854a.m53167g().getCurUserId())).longValue();
        }
        if (((int) ((((System.currentTimeMillis() - j) / 1000) / 3600) / 24)) < ((Integer) SharePrefCache.inst().getCompleteProfilePolicyInterval().mo47782d()).intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo69831a(boolean z) {
        if (!m75841e()) {
            return false;
        }
        if (z) {
            if (this.f85603b == null || !this.f85603b.mo69837b(System.currentTimeMillis())) {
                return false;
            }
            return true;
        } else if (this.f85605e == null || !this.f85605e.mo69837b(System.currentTimeMillis())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m75838b(List<String> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (i < 100 && i2 < 100) {
            return false;
        }
        Set<String> set = (Set) SharePrefCache.inst().getDefaultAvatarUrl().mo47782d();
        if (set != null && !set.isEmpty()) {
            String str = (String) list.get(0);
            for (String parse : set) {
                try {
                    if (str.contains(Uri.parse(parse).getLastPathSegment())) {
                        return false;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        if (android.text.TextUtils.isDigitsOnly(r14) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (android.text.TextUtils.isDigitsOnly(r14) != false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.p1797h.p1798a.C32943c mo69830a(java.util.List<java.lang.String> r12, int r13, int r14) {
        /*
            r11 = this;
            boolean r0 = m75841e()
            r1 = 0
            if (r0 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            r12.<init>(r1)
            return r12
        L_0x000d:
            boolean r0 = r11.m75839c()
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            r12.<init>(r1)
            return r12
        L_0x0019:
            boolean r0 = r11.m75840d()
            if (r0 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            r12.<init>(r1)
            return r12
        L_0x0025:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r2 = 2
            r3 = 0
            if (r0 != 0) goto L_0x0037
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            r12.<init>(r1, r3, r2)
            return r12
        L_0x0037:
            boolean r12 = m75838b(r12, r13, r14)
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r12 == 0) goto L_0x0055
            com.ss.android.ugc.aweme.app.SharePrefCache r12 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r12 = r12.getProfilePerfectionAvatar()
            java.lang.Object r12 = r12.mo47782d()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            float r12 = r12 * r13
            int r12 = (int) r12
            goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            java.lang.String r14 = r0.getNickname()
            java.lang.String r4 = "user"
            java.lang.String r5 = "用户"
            boolean r6 = android.text.TextUtils.isEmpty(r14)
            r7 = 1
            if (r6 == 0) goto L_0x0067
        L_0x0065:
            r14 = 0
            goto L_0x009d
        L_0x0067:
            boolean r6 = r14.startsWith(r4)
            if (r6 == 0) goto L_0x0082
            int r4 = r4.length()
            java.lang.String r14 = r14.substring(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            if (r4 != 0) goto L_0x009c
            boolean r14 = android.text.TextUtils.isDigitsOnly(r14)
            if (r14 != 0) goto L_0x0065
            goto L_0x009c
        L_0x0082:
            boolean r4 = r14.startsWith(r5)
            if (r4 == 0) goto L_0x009c
            int r4 = r5.length()
            java.lang.String r14 = r14.substring(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            if (r4 != 0) goto L_0x009c
            boolean r14 = android.text.TextUtils.isDigitsOnly(r14)
            if (r14 != 0) goto L_0x0065
        L_0x009c:
            r14 = 1
        L_0x009d:
            if (r14 == 0) goto L_0x00b4
            com.ss.android.ugc.aweme.app.SharePrefCache r14 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r14 = r14.getProfilePerfectionNickname()
            java.lang.Object r14 = r14.mo47782d()
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r14 = r14 * r13
            goto L_0x00b5
        L_0x00b4:
            r14 = 0
        L_0x00b5:
            int r14 = (int) r14
            java.lang.String r4 = r0.getUniqueId()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00d5
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r4 = r4.getProfilePerfectionShortId()
            java.lang.Object r4 = r4.mo47782d()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 * r13
            goto L_0x00d6
        L_0x00d5:
            r4 = 0
        L_0x00d6:
            int r4 = (int) r4
            int r5 = r0.getGender()
            if (r5 == 0) goto L_0x00f2
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r5 = r5.getProfilePerfectionGender()
            java.lang.Object r5 = r5.mo47782d()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 * r13
            goto L_0x00f3
        L_0x00f2:
            r5 = 0
        L_0x00f3:
            int r5 = (int) r5
            java.lang.String r6 = r0.getBirthday()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0113
            com.ss.android.ugc.aweme.app.SharePrefCache r6 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r6 = r6.getProfilePerfectionBirthday()
            java.lang.Object r6 = r6.mo47782d()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r6 = r6 * r13
            goto L_0x0114
        L_0x0113:
            r6 = 0
        L_0x0114:
            int r6 = (int) r6
            java.lang.String r8 = r0.getSchoolName()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0134
            com.ss.android.ugc.aweme.app.SharePrefCache r8 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r8 = r8.getProfilePerfectionSchool()
            java.lang.Object r8 = r8.mo47782d()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            float r8 = r8 * r13
            goto L_0x0135
        L_0x0134:
            r8 = 0
        L_0x0135:
            int r8 = (int) r8
            java.lang.String r9 = r0.getSignature()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0155
            com.ss.android.ugc.aweme.app.SharePrefCache r9 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r9 = r9.getProfilePerfectionSignature()
            java.lang.Object r9 = r9.mo47782d()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            float r9 = r9 * r13
            goto L_0x0156
        L_0x0155:
            r9 = 0
        L_0x0156:
            int r9 = (int) r9
            java.lang.String r10 = r0.getIsoCountryCode()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x016b
            java.lang.String r0 = r0.getCity()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017f
        L_0x016b:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r0 = r0.getProfilePerfectionLocation()
            java.lang.Object r0 = r0.mo47782d()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r3 = r0 * r13
        L_0x017f:
            int r0 = (int) r3
            int r14 = r14 + r12
            int r14 = r14 + r4
            int r14 = r14 + r5
            int r14 = r14 + r6
            int r14 = r14 + r8
            int r14 = r14 + r9
            int r14 = r14 + r0
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r0 = r0.getProfileCompletionThreshold()
            java.lang.Object r0 = r0.mo47782d()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r0 * r13
            int r13 = (int) r0
            if (r14 < r13) goto L_0x01a5
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            float r13 = (float) r14
            r12.<init>(r1, r13, r1)
            return r12
        L_0x01a5:
            if (r12 == 0) goto L_0x01ae
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            float r13 = (float) r14
            r12.<init>(r7, r13, r7)
            return r12
        L_0x01ae:
            com.ss.android.ugc.aweme.h.a.c r12 = new com.ss.android.ugc.aweme.h.a.c
            float r13 = (float) r14
            r12.<init>(r7, r13, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1797h.p1798a.C32939a.mo69830a(java.util.List, int, int):com.ss.android.ugc.aweme.h.a.c");
    }
}
