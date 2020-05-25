package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.c.c */
public class C34388c {

    /* renamed from: a */
    private static C34388c f88751a;

    /* renamed from: a */
    public static C34388c m78316a() {
        if (f88751a == null) {
            synchronized (C34388c.class) {
                if (f88751a == null) {
                    f88751a = new C34388c();
                }
            }
        }
        return f88751a;
    }

    /* renamed from: b */
    public static String m78317b() {
        C34385c[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists USER_EXTRA (");
        for (C34385c cVar : C34385c.values()) {
            sb.append(cVar.key);
            sb.append(" ");
            sb.append(cVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r7 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r7 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.UserExtra mo72395a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r2 = "select * from USER_EXTRA where "
            r1.<init>(r2)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            com.ss.android.ugc.aweme.im.sdk.i.b.c r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c.COLUMN_UID     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r1.append(r2)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r2 = " = "
            r1.append(r2)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r1.append(r7)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            android.database.Cursor r7 = r1.mo72382a(r7, r0)     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            if (r7 == 0) goto L_0x0073
            boolean r1 = r7.moveToNext()     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0073
            if (r7 != 0) goto L_0x002e
            goto L_0x006b
        L_0x002e:
            com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra r1 = new com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra     // Catch:{ Exception -> 0x0071 }
            r1.<init>()     // Catch:{ Exception -> 0x0071 }
            com.ss.android.ugc.aweme.im.sdk.i.b.c r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c.COLUMN_UID     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0071 }
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = r7.getString(r2)     // Catch:{ Exception -> 0x0071 }
            r1.setUid(r2)     // Catch:{ Exception -> 0x0071 }
            com.ss.android.ugc.aweme.im.sdk.i.b.c r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c.COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0071 }
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x0071 }
            int r2 = r7.getInt(r2)     // Catch:{ Exception -> 0x0071 }
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r1.setIsDisableShowFollowBar(r2)     // Catch:{ Exception -> 0x0071 }
            com.ss.android.ugc.aweme.im.sdk.i.b.c r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34385c.COLUMN_IS_SAY_HELLO_LOGGER     // Catch:{ Exception -> 0x0071 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0071 }
            int r2 = r7.getColumnIndex(r2)     // Catch:{ Exception -> 0x0071 }
            int r2 = r7.getInt(r2)     // Catch:{ Exception -> 0x0071 }
            if (r2 <= 0) goto L_0x0067
            r3 = 1
        L_0x0067:
            r1.setIsSayHelloLogger(r3)     // Catch:{ Exception -> 0x0071 }
            r0 = r1
        L_0x006b:
            if (r7 == 0) goto L_0x0070
            r7.close()
        L_0x0070:
            return r0
        L_0x0071:
            r1 = move-exception
            goto L_0x007d
        L_0x0073:
            if (r7 == 0) goto L_0x0093
            goto L_0x0090
        L_0x0076:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0095
        L_0x007b:
            r1 = move-exception
            r7 = r0
        L_0x007d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = "getUserExtraByUid "
            r2.<init>(r3)     // Catch:{ all -> 0x0094 }
            r2.append(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0094 }
            com.bytedance.p702im.core.internal.utils.C11467e.m23472d(r1)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0093
        L_0x0090:
            r7.close()
        L_0x0093:
            return r0
        L_0x0094:
            r0 = move-exception
        L_0x0095:
            if (r7 == 0) goto L_0x009a
            r7.close()
        L_0x009a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34388c.mo72395a(java.lang.String):com.ss.android.ugc.aweme.im.sdk.chat.model.UserExtra");
    }
}
