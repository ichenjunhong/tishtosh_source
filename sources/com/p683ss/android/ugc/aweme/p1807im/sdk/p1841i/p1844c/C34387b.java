package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34840b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.c.b */
public class C34387b {

    /* renamed from: a */
    private static C34387b f88750a;

    private C34387b() {
    }

    /* renamed from: c */
    public static String m78299c() {
        return "SIMPLE_USER";
    }

    /* renamed from: i */
    public static void m78305i() {
        C34381b.m78276a().mo72384a("SIMPLE_USER", (String) null, (String[]) null);
    }

    /* renamed from: a */
    public static C34387b m78292a() {
        if (f88750a == null) {
            synchronized (C34387b.class) {
                if (f88750a == null) {
                    f88750a = new C34387b();
                }
            }
        }
        return f88750a;
    }

    /* renamed from: d */
    public static String m78300d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C34384b.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 2");
        return sb.toString();
    }

    /* renamed from: g */
    public static String m78303g() {
        StringBuilder sb = new StringBuilder();
        sb.append(C34384b.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 1");
        return sb.toString();
    }

    /* renamed from: h */
    public static String m78304h() {
        StringBuilder sb = new StringBuilder();
        sb.append(C34384b.COLUMN_FOLLOW_STATUS.key);
        sb.append(" != 0");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m78301e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C34384b.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 2");
        sb.append(" and ");
        sb.append(C34384b.COLUMN_USER_SHARE_STATUS.key);
        sb.append(" != 2");
        return sb.toString();
    }

    /* renamed from: f */
    public static String m78302f() {
        StringBuilder sb = new StringBuilder();
        sb.append(C34384b.COLUMN_FOLLOW_STATUS.key);
        sb.append(" == 1");
        sb.append(" and ");
        sb.append(C34384b.COLUMN_USER_SHARE_STATUS.key);
        sb.append(" != 2");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m78306j() {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "select * from SIMPLE_USER"
            com.ss.android.ugc.aweme.im.sdk.i.a.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            android.database.Cursor r2 = r3.mo72382a(r2, r1)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
            if (r2 == 0) goto L_0x0021
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x001f, all -> 0x001c }
            if (r1 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r0
        L_0x001c:
            r0 = move-exception
            r1 = r2
            goto L_0x0028
        L_0x001f:
            r1 = r2
            goto L_0x002e
        L_0x0021:
            if (r2 == 0) goto L_0x0033
            r2.close()
            goto L_0x0033
        L_0x0027:
            r0 = move-exception
        L_0x0028:
            if (r1 == 0) goto L_0x002d
            r1.close()
        L_0x002d:
            throw r0
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78306j():boolean");
    }

    /* renamed from: b */
    public static String m78295b() {
        C34384b[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists SIMPLE_USER (");
        for (C34384b bVar : C34384b.values()) {
            sb.append(bVar.key);
            sb.append(" ");
            sb.append(bVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[SYNTHETIC, Splitter:B:23:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m78307k() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "select * from SIMPLE_USER"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = " where "
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0057 }
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = " != -1"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = " and "
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_USER_SHARE_STATUS     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0057 }
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = " != 2"
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            android.database.Cursor r1 = r2.mo72382a(r1, r0)     // Catch:{ Exception -> 0x0057 }
            if (r1 == 0) goto L_0x004f
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x004a, all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            return r0
        L_0x0045:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0062
        L_0x004a:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0058
        L_0x004f:
            if (r1 == 0) goto L_0x0060
            r1.close()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x0055:
            r1 = move-exception
            goto L_0x0062
        L_0x0057:
            r1 = move-exception
        L_0x0058:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r1)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            r0 = 0
            return r0
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78307k():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC, Splitter:B:23:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC, Splitter:B:29:0x004b] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m78308l() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x003e }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x003e }
            r1.append(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r2 = " != 0"
            r1.append(r2)     // Catch:{ Exception -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003e }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x003e }
            android.database.Cursor r1 = r2.mo72382a(r1, r0)     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0036
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            return r0
        L_0x002c:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0049
        L_0x0031:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x003f
        L_0x0036:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x0047
        L_0x003c:
            r1 = move-exception
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0047
            r0.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            r0 = 0
            return r0
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78308l():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC, Splitter:B:26:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m78309m() {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0068 }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_FOLLOW_STATUS     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0068 }
            r1.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = " == 2"
            r1.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0068 }
            java.lang.CharSequence r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()     // Catch:{ Exception -> 0x0068 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0068 }
            if (r3 != 0) goto L_0x0042
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            r3.<init>()     // Catch:{ Exception -> 0x0068 }
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = " and "
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_UID     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r1.key     // Catch:{ Exception -> 0x0068 }
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = " != "
            r3.append(r1)     // Catch:{ Exception -> 0x0068 }
            r3.append(r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0068 }
        L_0x0042:
            com.ss.android.ugc.aweme.im.sdk.i.a.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x0068 }
            android.database.Cursor r1 = r2.mo72382a(r1, r0)     // Catch:{ Exception -> 0x0068 }
            if (r1 == 0) goto L_0x0060
            int r0 = r1.getCount()     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            return r0
        L_0x0056:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0073
        L_0x005b:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0069
        L_0x0060:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ Exception -> 0x0071 }
            goto L_0x0071
        L_0x0066:
            r1 = move-exception
            goto L_0x0073
        L_0x0068:
            r1 = move-exception
        L_0x0069:
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r1)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            r0 = 0
            return r0
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78309m():int");
    }

    /* renamed from: a */
    public static void m78294a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C34381b a = C34381b.m78276a();
            StringBuilder sb = new StringBuilder("delete from SIMPLE_USER where ");
            sb.append(C34384b.COLUMN_UID.key);
            sb.append(" = ");
            sb.append(str);
            a.mo72383a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo72391a(List<IMUser> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                m78296b((IMUser) list.get(i));
            }
            C34381b.m78276a().mo72385b();
            for (IMUser iMUser : list) {
                if (iMUser != null && !IMUser.isInvalidUser(iMUser.getUid())) {
                    C34381b.m78276a().mo72381a("SIMPLE_USER", (String) null, m78298c(iMUser));
                }
            }
            C34381b.m78276a().mo72386c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r5 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> mo72394c(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.<init>()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " and "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " is not null  and "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_INITIAL_LETTER     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = " is not null  order by "
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_SORT_WEIGHT     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r5 = r5.key     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r2.append(r5)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            android.database.Cursor r5 = r5.mo72382a(r2, r1)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            if (r5 == 0) goto L_0x005b
        L_0x004a:
            boolean r1 = r5.moveToNext()     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            if (r1 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m78293a(r5)     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            r0.add(r1)     // Catch:{ Exception -> 0x0066, all -> 0x0058 }
            goto L_0x004a
        L_0x0058:
            r0 = move-exception
            r1 = r5
            goto L_0x005f
        L_0x005b:
            if (r5 == 0) goto L_0x006b
            goto L_0x0068
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            throw r0
        L_0x0065:
            r5 = r1
        L_0x0066:
            if (r5 == 0) goto L_0x006b
        L_0x0068:
            r5.close()
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.mo72394c(java.lang.String):java.util.List");
    }

    /* renamed from: b */
    private static void m78296b(IMUser iMUser) {
        String c = C34839a.m78908c(iMUser.getDisplayName());
        iMUser.setSortWeight(C34840b.m78911a().mo72960b(c));
        iMUser.setInitialLetter(C34840b.m78911a().mo72959a(c));
        try {
            iMUser.setAvatarStr(C35277o.m79761a(iMUser.getAvatarThumb()));
        } catch (Exception unused) {
        }
        if (!C35279p.m79763a()) {
            iMUser.setRemarkPinyin(C34839a.m78908c(iMUser.getRemarkName()).toLowerCase());
            iMUser.setRemarkInitial(C34839a.m78906b(iMUser.getRemarkName()).toLowerCase());
            iMUser.setNickNamePinyin(C34839a.m78908c(iMUser.getNickName()).toLowerCase());
            iMUser.setNickNameInitial(C34839a.m78906b(iMUser.getNickName()).toLowerCase());
            iMUser.setContactNamePinyin(C34839a.m78908c(iMUser.getContactName()).toLowerCase());
            iMUser.setContactNameInitial(C34839a.m78906b(iMUser.getContactName()).toLowerCase());
        }
    }

    /* renamed from: a */
    private static IMUser m78293a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_UID.key)));
        iMUser.setSecUid(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_SEC_UID.key)));
        iMUser.setNickName(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_NICK_NAME.key)));
        iMUser.setSignature(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_SIGNATURE.key)));
        iMUser.setAvatarStr(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_AVATAR_THUMB.key)));
        iMUser.setFollowStatus(cursor.getInt(cursor.getColumnIndex(C34384b.COLUMN_FOLLOW_STATUS.key)));
        iMUser.setUniqueId(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_UNIQUE_ID.key)));
        iMUser.setWeiboVerify(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_WEIBO_VERIFY.key)));
        iMUser.setCustomVerify(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_CUSTOM_VERIFY.key)));
        iMUser.setEnterpriseVerifyReason(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_ENTERPRISE_VERIFY_REASON.key)));
        iMUser.setVerificationType(cursor.getInt(cursor.getColumnIndex(C34384b.COLUMN_VERIFICATION_TYPE.key)));
        iMUser.setRemarkName(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_REMARK_NAME.key)));
        iMUser.setSortWeight(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_SORT_WEIGHT.key)));
        iMUser.setInitialLetter(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_INITIAL_LETTER.key)));
        iMUser.setShortId(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_SHORT_ID.key)));
        iMUser.setRemarkPinyin(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_REMARK_PINYIN.key)));
        iMUser.setRemarkInitial(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_REMARK_INITIAL.key)));
        iMUser.setNickNamePinyin(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_NICK_NAME_PINYIN.key)));
        iMUser.setNickNameInitial(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_NICK_NAME_INITIAL.key)));
        iMUser.setCommerceUserLevel(cursor.getInt(cursor.getColumnIndex(C34384b.COLUMN_COMMERCE_USER_LEVEL.key)));
        iMUser.setContactName(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_CONTACT_NAME.key)));
        iMUser.setContactNamePinyin(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_CONTACT_NAME_PINYIN.key)));
        iMUser.setContactNameInitial(cursor.getString(cursor.getColumnIndex(C34384b.COLUMN_CONTACT_NAME_INITIAL.key)));
        iMUser.setShareStatus(cursor.getInt(cursor.getColumnIndex(C34384b.COLUMN_USER_SHARE_STATUS.key)));
        return iMUser;
    }

    /* renamed from: b */
    public static void m78297b(List<IMUser> list) {
        if (list != null && !list.isEmpty()) {
            C34381b.m78276a().mo72385b();
            for (IMUser iMUser : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C34384b.COLUMN_UID.key, iMUser.getUid());
                contentValues.put(C34384b.COLUMN_SEC_UID.key, iMUser.getSecUid());
                contentValues.put(C34384b.COLUMN_NICK_NAME.key, iMUser.getNickName());
                contentValues.put(C34384b.COLUMN_SIGNATURE.key, iMUser.getSignature());
                contentValues.put(C34384b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
                contentValues.put(C34384b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
                contentValues.put(C34384b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
                contentValues.put(C34384b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
                contentValues.put(C34384b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
                contentValues.put(C34384b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
                contentValues.put(C34384b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
                contentValues.put(C34384b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
                contentValues.put(C34384b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
                contentValues.put(C34384b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
                contentValues.put(C34384b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
                contentValues.put(C34384b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
                StringBuilder sb = new StringBuilder();
                sb.append(C34384b.COLUMN_UID.key);
                sb.append("=?");
                C34381b.m78276a().mo72380a("SIMPLE_USER", contentValues, sb.toString(), new String[]{iMUser.getUid()});
            }
            C34381b.m78276a().mo72386c();
        }
    }

    /* renamed from: c */
    private static ContentValues m78298c(IMUser iMUser) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C34384b.COLUMN_UID.key, iMUser.getUid());
        contentValues.put(C34384b.COLUMN_SEC_UID.key, iMUser.getSecUid());
        contentValues.put(C34384b.COLUMN_NICK_NAME.key, iMUser.getNickName());
        contentValues.put(C34384b.COLUMN_SIGNATURE.key, iMUser.getSignature());
        contentValues.put(C34384b.COLUMN_AVATAR_THUMB.key, iMUser.getAvatarStr());
        contentValues.put(C34384b.COLUMN_FOLLOW_STATUS.key, Integer.valueOf(iMUser.getFollowStatus()));
        contentValues.put(C34384b.COLUMN_UNIQUE_ID.key, iMUser.getUniqueId());
        contentValues.put(C34384b.COLUMN_WEIBO_VERIFY.key, iMUser.getWeiboVerify());
        contentValues.put(C34384b.COLUMN_CUSTOM_VERIFY.key, iMUser.getCustomVerify());
        contentValues.put(C34384b.COLUMN_ENTERPRISE_VERIFY_REASON.key, iMUser.getEnterpriseVerifyReason());
        contentValues.put(C34384b.COLUMN_VERIFICATION_TYPE.key, Integer.valueOf(iMUser.getVerificationType()));
        contentValues.put(C34384b.COLUMN_REMARK_NAME.key, iMUser.getRemarkName());
        contentValues.put(C34384b.COLUMN_SORT_WEIGHT.key, iMUser.getSortWeight());
        contentValues.put(C34384b.COLUMN_INITIAL_LETTER.key, iMUser.getInitialLetter());
        contentValues.put(C34384b.COLUMN_SHORT_ID.key, iMUser.getShortId());
        contentValues.put(C34384b.COLUMN_REMARK_PINYIN.key, iMUser.getRemarkPinyin());
        contentValues.put(C34384b.COLUMN_REMARK_INITIAL.key, iMUser.getRemarkInitial());
        contentValues.put(C34384b.COLUMN_NICK_NAME_PINYIN.key, iMUser.getNickNamePinyin());
        contentValues.put(C34384b.COLUMN_NICK_NAME_INITIAL.key, iMUser.getNickNameInitial());
        contentValues.put(C34384b.COLUMN_COMMERCE_USER_LEVEL.key, Integer.valueOf(iMUser.getCommerceUserLevel()));
        contentValues.put(C34384b.COLUMN_CONTACT_NAME.key, iMUser.getContactName());
        contentValues.put(C34384b.COLUMN_CONTACT_NAME_PINYIN.key, iMUser.getContactNamePinyin());
        contentValues.put(C34384b.COLUMN_CONTACT_NAME_INITIAL.key, iMUser.getContactNameInitial());
        contentValues.put(C34384b.COLUMN_USER_SHARE_STATUS.key, Integer.valueOf(iMUser.getShareStatus()));
        return contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r5 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r5 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser mo72393b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = "select * from SIMPLE_USER where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            com.ss.android.ugc.aweme.im.sdk.i.b.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34384b.COLUMN_UID     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r1.append(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r2 = " = "
            r1.append(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r1.append(r5)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            android.database.Cursor r5 = r1.mo72382a(r5, r0)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            if (r5 == 0) goto L_0x003a
            boolean r1 = r5.moveToNext()     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r1 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = m78293a(r5)     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r5 == 0) goto L_0x0034
            r5.close()
        L_0x0034:
            return r1
        L_0x0035:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x003e
        L_0x003a:
            if (r5 == 0) goto L_0x004a
            goto L_0x0047
        L_0x003d:
            r5 = move-exception
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r5
        L_0x0044:
            r5 = r0
        L_0x0045:
            if (r5 == 0) goto L_0x004a
        L_0x0047:
            r5.close()
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.mo72393b(java.lang.String):com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* renamed from: a */
    public final boolean mo72392a(IMUser iMUser) {
        if (iMUser == null || IMUser.isInvalidUser(iMUser.getUid())) {
            return false;
        }
        m78296b(iMUser);
        if (C34381b.m78276a().mo72381a("SIMPLE_USER", (String) null, m78298c(iMUser)) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r4 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r4 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> mo72389a(java.util.List<java.lang.String> r4, int r5, int r6) {
        /*
            r3 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r0.<init>()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r1 = "select * from SIMPLE_USER"
            r0.append(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            boolean r1 = r4.isEmpty()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = " where sec_uid in ("
            r0.append(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r1 = 0
        L_0x001c:
            int r2 = r4.size()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r1 >= r2) goto L_0x0046
            java.lang.String r2 = "\""
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.Object r2 = r4.get(r1)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            int r2 = r4.size()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            int r2 = r2 + -1
            if (r1 == r2) goto L_0x003e
            java.lang.String r2 = "\","
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            goto L_0x0043
        L_0x003e:
            java.lang.String r2 = "\""
            r0.append(r2)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
        L_0x0043:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0046:
            java.lang.String r4 = ")"
            r0.append(r4)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
        L_0x004b:
            java.lang.String r4 = " limit 30"
            r0.append(r4)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            android.database.Cursor r4 = r4.mo72382a(r0, r6)     // Catch:{ Exception -> 0x007a, all -> 0x0073 }
            if (r4 == 0) goto L_0x0070
        L_0x005e:
            boolean r6 = r4.moveToNext()     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            if (r6 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = m78293a(r4)     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            r5.add(r6)     // Catch:{ Exception -> 0x007b, all -> 0x006c }
            goto L_0x005e
        L_0x006c:
            r5 = move-exception
            r6 = r4
            r4 = r5
            goto L_0x0074
        L_0x0070:
            if (r4 == 0) goto L_0x0080
            goto L_0x007d
        L_0x0073:
            r4 = move-exception
        L_0x0074:
            if (r6 == 0) goto L_0x0079
            r6.close()
        L_0x0079:
            throw r4
        L_0x007a:
            r4 = r6
        L_0x007b:
            if (r4 == 0) goto L_0x0080
        L_0x007d:
            r4.close()
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.mo72389a(java.util.List, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r5 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r5 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> mo72390a(java.util.List<java.lang.String> r5, int r6, int r7, java.lang.String r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.<init>()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = "select * from SIMPLE_USER"
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = " where "
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r5 == 0) goto L_0x004a
            boolean r8 = r5.isEmpty()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r8 != 0) goto L_0x004a
            java.lang.String r8 = " and uid not in ("
            r2.append(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r8 = 0
        L_0x0026:
            int r3 = r5.size()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r8 >= r3) goto L_0x0045
            java.lang.Object r3 = r5.get(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            int r3 = r5.size()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            int r3 = r3 + -1
            if (r8 == r3) goto L_0x0042
            java.lang.String r3 = ","
            r2.append(r3)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x0042:
            int r8 = r8 + 1
            goto L_0x0026
        L_0x0045:
            java.lang.String r5 = ")"
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x004a:
            if (r6 <= 0) goto L_0x0054
            java.lang.String r5 = " limit "
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x0054:
            if (r7 <= 0) goto L_0x005e
            java.lang.String r5 = " offset "
            r2.append(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            r2.append(r7)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
        L_0x005e:
            com.ss.android.ugc.aweme.im.sdk.i.a.b r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            android.database.Cursor r5 = r5.mo72382a(r6, r1)     // Catch:{ Exception -> 0x0088, all -> 0x0081 }
            if (r5 == 0) goto L_0x007e
        L_0x006c:
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            if (r6 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.im.service.model.IMUser r6 = m78293a(r5)     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            r0.add(r6)     // Catch:{ Exception -> 0x0089, all -> 0x007a }
            goto L_0x006c
        L_0x007a:
            r6 = move-exception
            r1 = r5
            r5 = r6
            goto L_0x0082
        L_0x007e:
            if (r5 == 0) goto L_0x008e
            goto L_0x008b
        L_0x0081:
            r5 = move-exception
        L_0x0082:
            if (r1 == 0) goto L_0x0087
            r1.close()
        L_0x0087:
            throw r5
        L_0x0088:
            r5 = r1
        L_0x0089:
            if (r5 == 0) goto L_0x008e
        L_0x008b:
            r5.close()
        L_0x008e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.mo72390a(java.util.List, int, int, java.lang.String):java.util.List");
    }
}
