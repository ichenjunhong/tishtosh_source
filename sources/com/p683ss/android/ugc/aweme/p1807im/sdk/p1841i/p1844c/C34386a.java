package com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c;

import android.content.ContentValues;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34383a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.C35056a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.c.a */
public class C34386a {

    /* renamed from: a */
    private static C34386a f88749a;

    private C34386a() {
    }

    /* renamed from: d */
    public static void m78289d() {
        C34381b.m78276a().mo72384a("FRIENDS_RELATION", (String) null, (String[]) null);
    }

    /* renamed from: a */
    public static C34386a m78287a() {
        if (f88749a == null) {
            synchronized (C34386a.class) {
                if (f88749a == null) {
                    f88749a = new C34386a();
                }
            }
        }
        return f88749a;
    }

    /* renamed from: b */
    public static String m78288b() {
        C34383a[] values;
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists FRIENDS_RELATION (");
        for (C34383a aVar : C34383a.values()) {
            sb.append(aVar.key);
            sb.append(" ");
            sb.append(aVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2.substring(0, sb2.length() - 1));
        sb3.append(");");
        return sb3.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Integer> mo72388c() {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            r2.<init>()     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            java.lang.String r3 = "select * from FRIENDS_RELATION"
            r2.append(r3)     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            com.ss.android.ugc.aweme.im.sdk.i.a.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1842a.C34381b.m78276a()     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            android.database.Cursor r2 = r3.mo72382a(r2, r1)     // Catch:{ Exception -> 0x005e, all -> 0x0056 }
            if (r2 == 0) goto L_0x0050
        L_0x001e:
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            if (r3 == 0) goto L_0x0050
            if (r2 != 0) goto L_0x0028
            r3 = r1
            goto L_0x0034
        L_0x0028:
            com.ss.android.ugc.aweme.im.sdk.i.b.a r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34383a.COLUMN_SEC_UID     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
        L_0x0034:
            if (r2 != 0) goto L_0x0038
            r4 = 0
            goto L_0x0044
        L_0x0038:
            com.ss.android.ugc.aweme.im.sdk.i.b.a r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1843b.C34383a.COLUMN_RELATION_TYPE     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            int r4 = r2.getColumnIndex(r4)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            int r4 = r2.getInt(r4)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
        L_0x0044:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x004e, all -> 0x004c }
            goto L_0x001e
        L_0x004c:
            r0 = move-exception
            goto L_0x0058
        L_0x004e:
            r1 = r2
            goto L_0x005e
        L_0x0050:
            if (r2 == 0) goto L_0x0063
            r2.close()
            goto L_0x0063
        L_0x0056:
            r0 = move-exception
            r2 = r1
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2.close()
        L_0x005d:
            throw r0
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r1.close()
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34386a.mo72388c():java.util.Map");
    }

    /* renamed from: a */
    public final void mo72387a(C35056a aVar) {
        if (aVar.getSecUserIds() != null && aVar.getSecUserIds().size() != 0) {
            C34381b.m78276a().mo72385b();
            int relationType = aVar.getRelationType();
            for (String str : aVar.getSecUserIds()) {
                if (str != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C34383a.COLUMN_RELATION_TYPE.key, Integer.valueOf(relationType));
                    contentValues.put(C34383a.COLUMN_SEC_UID.key, str);
                    C34381b.m78276a().mo72381a("FRIENDS_RELATION", (String) null, contentValues);
                }
            }
            C34381b.m78276a().mo72386c();
        }
    }
}
