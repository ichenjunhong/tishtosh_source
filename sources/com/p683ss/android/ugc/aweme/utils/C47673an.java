package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import com.p683ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.an */
public final class C47673an {

    /* renamed from: a */
    public static final String[] f120153a = {"android.permission.READ_CONTACTS"};

    /* renamed from: a */
    public static List<ContactModelV2> m103183a(Context context) {
        return m103182a(context, null, false).f120150a;
    }

    /* renamed from: b */
    public static boolean m103185b(Context context) {
        if (C0726c.m2090a(context, "android.permission.READ_CONTACTS") != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m103184a(Activity activity, C32753b bVar) {
        C23361b.m57419a(activity, new String[]{"android.permission.READ_CONTACTS"}, new C47674ao(bVar, activity));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x022d, code lost:
        switch(r8) {
            case 0: goto L_0x0311;
            case 1: goto L_0x0303;
            case 2: goto L_0x02e0;
            case 3: goto L_0x02ce;
            case 4: goto L_0x02bc;
            case 5: goto L_0x02aa;
            case 6: goto L_0x028f;
            case 7: goto L_0x0281;
            case 8: goto L_0x0250;
            case 9: goto L_0x0234;
            default: goto L_0x0230;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0230, code lost:
        r33 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0234, code lost:
        r33 = r1;
        r30 = r2.getString(r2.getColumnIndex("data2"));
        r29 = r2.getString(r2.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0264, code lost:
        r33 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r7.put(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r36.getResources(), r2.getInt(r2.getColumnIndex("data5")), r2.getString(r2.getColumnIndex("data6"))).toString(), r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0281, code lost:
        r33 = r1;
        r23 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028f, code lost:
        r33 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x029c, code lost:
        if (r2.getInt(r2.getColumnIndex("data2")) != 3) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x029e, code lost:
        r28 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02aa, code lost:
        r33 = r1;
        r6.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bc, code lost:
        r33 = r1;
        r5.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ce, code lost:
        r33 = r1;
        r4.add(r2.getString(r2.getColumnIndex("data1")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02e0, code lost:
        r33 = r1;
        r25 = r2.getString(r2.getColumnIndex("data1"));
        r27 = r2.getString(r2.getColumnIndex("data5"));
        r26 = r2.getString(r2.getColumnIndex("data4"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0303, code lost:
        r33 = r1;
        r24 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0311, code lost:
        r33 = r1;
        r1 = r2.getString(r2.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0322, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0328, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032a, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032d, code lost:
        r1 = r1.trim();
        r15 = java.util.regex.Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033f, code lost:
        if (r15.find() == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0341, code lost:
        r15 = r15.group(0);
        r8 = new java.lang.StringBuilder();
        r8.append(r15);
        r8.append(com.p683ss.android.ugc.aweme.login.utils.C36331b.m81967b(r1.substring(r1.indexOf(r15) + r15.length())));
        r1 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0368, code lost:
        r1 = com.p683ss.android.ugc.aweme.login.utils.C36331b.m81967b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0370, code lost:
        if (r3.contains(r1) != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0372, code lost:
        r3.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0381, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0382, code lost:
        r32 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0438, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0439, code lost:
        r5 = r12;
        r3 = r13;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x043f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0440, code lost:
        r5 = r12;
        r3 = r13;
        r4 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0445, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0446, code lost:
        r4 = r1;
        r5 = r12;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x044b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x044c, code lost:
        r4 = r1;
        r32 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0472, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0477, code lost:
        r1 = r20 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x047a, code lost:
        if (r3.length <= r1) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0484, code lost:
        if (r4.f120151b.length > r1) goto L_0x0486;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0486, code lost:
        r11.section = r4.f120151b[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x048f, code lost:
        r0 = r4.f120151b[r20];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04a6, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04ab, code lost:
        r2 = r20 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04ae, code lost:
        if (r3.length <= r2) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04b7, code lost:
        if (r4.f120151b.length > r2) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04b9, code lost:
        r11.section = r4.f120151b[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04c0, code lost:
        r11.section = r4.f120151b[r20];
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0445 A[ExcHandler: all (th java.lang.Throwable), PHI: r1 
      PHI: (r1v14 com.ss.android.ugc.aweme.utils.am) = (r1v1 com.ss.android.ugc.aweme.utils.am), (r1v1 com.ss.android.ugc.aweme.utils.am), (r1v15 com.ss.android.ugc.aweme.utils.am), (r1v15 com.ss.android.ugc.aweme.utils.am) binds: [B:55:0x0122, B:71:0x014f, B:76:0x0192, B:83:0x01b1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:55:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.utils.C47672am m103182a(android.content.Context r36, java.lang.String r37, boolean r38) {
        /*
            com.ss.android.ugc.aweme.utils.am r1 = new com.ss.android.ugc.aweme.utils.am
            r1.<init>()
            android.content.ContentResolver r8 = r36.getContentResolver()
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI
            r9 = 21
            if (r38 == 0) goto L_0x0023
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r9) goto L_0x0023
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX"
            java.lang.String r3 = "true"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
            android.net.Uri r0 = r0.build()
        L_0x0023:
            r3 = r0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            r7 = r37
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)
            if (r10 != 0) goto L_0x0031
            return r1
        L_0x0031:
            int r0 = r10.getCount()
            if (r0 != 0) goto L_0x003b
            r10.close()
            return r1
        L_0x003b:
            android.os.Bundle r0 = r10.getExtras()
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r9) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0064
            java.lang.String r2 = "android.provider.extra.ADDRESS_BOOK_INDEX_TITLES"
            java.lang.String[] r2 = r0.getStringArray(r2)
            java.lang.String r3 = "android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS"
            int[] r0 = r0.getIntArray(r3)
            r1.f120151b = r2
            r1.f120152c = r0
            goto L_0x0066
        L_0x0064:
            r0 = 0
            r2 = 0
        L_0x0066:
            r9 = 0
            r12 = 1
            if (r2 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006e
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x0087
            int r2 = r2.length
            int r3 = r0.length
            int r2 = java.lang.Math.min(r2, r3)
            int[] r3 = new int[r2]
            r4 = 0
            r5 = 0
        L_0x007b:
            if (r4 >= r2) goto L_0x0085
            r3[r4] = r5
            r6 = r0[r4]
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L_0x007b
        L_0x0085:
            r13 = r3
            goto L_0x0088
        L_0x0087:
            r13 = 0
        L_0x0088:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r0 = r10.getCount()
            r14.<init>(r0)
            r1.f120150a = r14
            r15 = 7
            java.lang.String[] r7 = new java.lang.String[r15]
            java.lang.String r0 = "data1"
            r7[r9] = r0
            java.lang.String r0 = "data2"
            r7[r12] = r0
            java.lang.String r0 = "data3"
            r16 = 2
            r7[r16] = r0
            java.lang.String r0 = "data4"
            r6 = 3
            r7[r6] = r0
            java.lang.String r0 = "data5"
            r17 = 4
            r7[r17] = r0
            java.lang.String r0 = "data6"
            r18 = 5
            r7[r18] = r0
            java.lang.String r0 = "mimetype"
            r19 = 6
            r7[r19] = r0
            r5 = 0
            r20 = 0
        L_0x00be:
            boolean r0 = r10.moveToNext()
            if (r0 == 0) goto L_0x04c7
            com.ss.android.ugc.aweme.friends.model.ContactModelV2 r4 = new com.ss.android.ugc.aweme.friends.model.ContactModelV2
            r4.<init>()
            java.lang.String r0 = "_id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0464, all -> 0x045e }
            long r2 = r10.getLong(r0)     // Catch:{ Exception -> 0x0464, all -> 0x045e }
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x0464, all -> 0x045e }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x0464, all -> 0x045e }
            java.lang.String r2 = "entities"
            android.net.Uri r3 = android.net.Uri.withAppendedPath(r0, r2)     // Catch:{ Exception -> 0x0464, all -> 0x045e }
            r0 = 0
            r21 = 0
            r22 = 0
            r2 = r8
            r11 = r4
            r4 = r7
            r12 = r5
            r5 = r0
            r15 = 3
            r6 = r21
            r21 = r7
            r7 = r22
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0457, all -> 0x0452 }
            if (r2 != 0) goto L_0x0122
            if (r2 == 0) goto L_0x00fb
            r2.close()
        L_0x00fb:
            if (r13 == 0) goto L_0x011b
            int r0 = r13.length
            int r2 = r20 + 1
            if (r0 <= r2) goto L_0x0115
            r0 = r13[r2]
            if (r12 >= r0) goto L_0x0107
            goto L_0x0115
        L_0x0107:
            java.lang.String[] r0 = r1.f120151b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x0112
            java.lang.String[] r0 = r1.f120151b
            r0 = r0[r2]
            r11.section = r0
        L_0x0112:
            r20 = r2
            goto L_0x011b
        L_0x0115:
            java.lang.String[] r0 = r1.f120151b
            r0 = r0[r20]
        L_0x0119:
            r11.section = r0
        L_0x011b:
            int r5 = r12 + 1
            r7 = r21
            r6 = 3
            goto L_0x049f
        L_0x0122:
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            if (r0 != 0) goto L_0x014d
            r2.close()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            if (r2 == 0) goto L_0x0130
            r2.close()
        L_0x0130:
            if (r13 == 0) goto L_0x011b
            int r0 = r13.length
            int r2 = r20 + 1
            if (r0 <= r2) goto L_0x0148
            r0 = r13[r2]
            if (r12 >= r0) goto L_0x013c
            goto L_0x0148
        L_0x013c:
            java.lang.String[] r0 = r1.f120151b
            int r0 = r0.length
            if (r0 <= r2) goto L_0x0112
            java.lang.String[] r0 = r1.f120151b
            r0 = r0[r2]
            r11.section = r0
            goto L_0x0112
        L_0x0148:
            java.lang.String[] r0 = r1.f120151b
            r0 = r0[r20]
            goto L_0x0119
        L_0x014d:
            java.lang.String r0 = "display_name"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r3.<init>()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r4.<init>()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r5.<init>()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r6.<init>()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r7.<init>()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.lang.String r9 = "photo_uri"
            int r9 = r10.getColumnIndex(r9)     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            java.lang.String r9 = r10.getString(r9)     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x018a:
            boolean r22 = r2.moveToNext()     // Catch:{ Exception -> 0x044b, all -> 0x0445 }
            if (r22 == 0) goto L_0x0387
            java.lang.String r15 = "mimetype"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x0381, all -> 0x0445 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0381, all -> 0x0445 }
            boolean r22 = com.bytedance.common.utility.C9431p.m18664a(r15)     // Catch:{ Exception -> 0x0381, all -> 0x0445 }
            if (r22 != 0) goto L_0x0376
            r22 = -1
            int r31 = r15.hashCode()     // Catch:{ Exception -> 0x0381, all -> 0x0445 }
            switch(r31) {
                case -1569536764: goto L_0x021d;
                case -1328682538: goto L_0x0211;
                case -1079224304: goto L_0x0204;
                case -1079210633: goto L_0x01f8;
                case 3430506: goto L_0x01ec;
                case 456415478: goto L_0x01e0;
                case 684173810: goto L_0x01d4;
                case 689862072: goto L_0x01c8;
                case 950831081: goto L_0x01ba;
                case 2034973555: goto L_0x01ad;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            r32 = r8
            goto L_0x022c
        L_0x01ad:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/nickname"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 1
            goto L_0x022d
        L_0x01ba:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/im"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 8
            goto L_0x022d
        L_0x01c8:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/organization"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 2
            goto L_0x022d
        L_0x01d4:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/phone_v2"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 0
            goto L_0x022d
        L_0x01e0:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/website"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 5
            goto L_0x022d
        L_0x01ec:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/sip_address"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 4
            goto L_0x022d
        L_0x01f8:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/note"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 7
            goto L_0x022d
        L_0x0204:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/name"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 9
            goto L_0x022d
        L_0x0211:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/contact_event"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 6
            goto L_0x022d
        L_0x021d:
            r32 = r8
            java.lang.String r8 = "vnd.android.cursor.item/email_v2"
            boolean r8 = r15.equals(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            if (r8 == 0) goto L_0x022c
            r8 = 3
            goto L_0x022d
        L_0x0229:
            r0 = move-exception
            goto L_0x0384
        L_0x022c:
            r8 = -1
        L_0x022d:
            switch(r8) {
                case 0: goto L_0x0311;
                case 1: goto L_0x0303;
                case 2: goto L_0x02e0;
                case 3: goto L_0x02ce;
                case 4: goto L_0x02bc;
                case 5: goto L_0x02aa;
                case 6: goto L_0x028f;
                case 7: goto L_0x0281;
                case 8: goto L_0x0250;
                case 9: goto L_0x0234;
                default: goto L_0x0230;
            }     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
        L_0x0230:
            r33 = r1
            goto L_0x037a
        L_0x0234:
            java.lang.String r8 = "data2"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            java.lang.String r15 = "data3"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            r33 = r1
            r30 = r8
            r29 = r15
            goto L_0x037a
        L_0x0250:
            java.lang.String r8 = "data5"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            int r8 = r2.getInt(r8)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            java.lang.String r15 = "data6"
            int r15 = r2.getColumnIndex(r15)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            java.lang.String r15 = r2.getString(r15)     // Catch:{ Exception -> 0x0229, all -> 0x0445 }
            r33 = r1
            android.content.res.Resources r1 = r36.getResources()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.CharSequence r1 = android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabel(r1, r8, r15)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r8 = "data1"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r8 = r2.getString(r8)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r7.put(r1, r8)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x0281:
            r33 = r1
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r23 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x028f:
            r33 = r1
            java.lang.String r1 = "data2"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            int r1 = r2.getInt(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r8 = 3
            if (r1 != r8) goto L_0x037a
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r28 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x02aa:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r6.add(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x02bc:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r5.add(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x02ce:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r4.add(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x02e0:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r25 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = "data5"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r27 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = "data4"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r26 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x0303:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r24 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x0311:
            r33 = r1
            r8 = 3
            java.lang.String r1 = "data1"
            int r1 = r2.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            boolean r15 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            if (r15 != 0) goto L_0x037a
            boolean r15 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            if (r15 == 0) goto L_0x032d
            java.lang.String r1 = ""
            goto L_0x036c
        L_0x032d:
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r15 = "\\+[0-9]{1,3}[ \\-]"
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.util.regex.Matcher r15 = r15.matcher(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            boolean r22 = r15.find()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            if (r22 == 0) goto L_0x0368
            r8 = 0
            java.lang.String r15 = r15.group(r8)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r8.<init>()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r8.append(r15)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            int r22 = r1.indexOf(r15)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            int r15 = r15.length()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            int r15 = r22 + r15
            java.lang.String r1 = r1.substring(r15)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.login.utils.C36331b.m81967b(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r8.append(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x036c
        L_0x0368:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.login.utils.C36331b.m81967b(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
        L_0x036c:
            boolean r8 = r3.contains(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            if (r8 != 0) goto L_0x037a
            r3.add(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            goto L_0x037a
        L_0x0376:
            r33 = r1
            r32 = r8
        L_0x037a:
            r8 = r32
            r1 = r33
            r15 = 3
            goto L_0x018a
        L_0x0381:
            r0 = move-exception
            r32 = r8
        L_0x0384:
            r4 = r1
            goto L_0x044f
        L_0x0387:
            r33 = r1
            r32 = r8
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r8 = 18
            if (r1 < r8) goto L_0x03b7
            java.lang.String r1 = "contact_last_updated_timestamp"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x043f, all -> 0x0438 }
            r35 = r12
            r34 = r13
            long r12 = r10.getLong(r1)     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            java.util.Date r1 = new java.util.Date     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            java.lang.String r12 = "yyyy-MM-dd hh:mm:ss"
            java.util.Locale r13 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r8.<init>(r12, r13)     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            java.lang.String r1 = r8.format(r1)     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r8 = r1
            r1 = r24
            goto L_0x03be
        L_0x03b7:
            r35 = r12
            r34 = r13
            r1 = r24
            r8 = 0
        L_0x03be:
            r11.nickName = r1     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.name = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r26
            r11.jobDesc = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r25
            r11.organization = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r27
            r11.department = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.emails = r4     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.urls = r6     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r23
            r11.note = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r28
            r11.birthday = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.addresses = r5     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.instantMessageAddresses = r7     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.modificationDate = r8     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.phoneNumber = r3     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r11.mImageUrl = r9     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r29
            r11.familyName = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r0 = r30
            r11.givenName = r0     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            r14.add(r11)     // Catch:{ Exception -> 0x0430, all -> 0x0427 }
            if (r2 == 0) goto L_0x03f4
            r2.close()
        L_0x03f4:
            if (r34 == 0) goto L_0x041f
            r3 = r34
            int r0 = r3.length
            int r1 = r20 + 1
            if (r0 <= r1) goto L_0x0415
            r0 = r3[r1]
            r5 = r35
            if (r5 >= r0) goto L_0x0406
            r4 = r33
            goto L_0x0419
        L_0x0406:
            r4 = r33
            java.lang.String[] r0 = r4.f120151b
            int r0 = r0.length
            if (r0 <= r1) goto L_0x048c
            java.lang.String[] r0 = r4.f120151b
            r0 = r0[r1]
            r11.section = r0
            goto L_0x048c
        L_0x0415:
            r4 = r33
            r5 = r35
        L_0x0419:
            java.lang.String[] r0 = r4.f120151b
            r0 = r0[r20]
            goto L_0x0493
        L_0x041f:
            r4 = r33
            r3 = r34
            r5 = r35
            goto L_0x0495
        L_0x0427:
            r0 = move-exception
            r4 = r33
            r3 = r34
            r5 = r35
            goto L_0x04a4
        L_0x0430:
            r0 = move-exception
            r4 = r33
            r3 = r34
            r5 = r35
            goto L_0x046d
        L_0x0438:
            r0 = move-exception
            r5 = r12
            r3 = r13
            r4 = r33
            goto L_0x04a4
        L_0x043f:
            r0 = move-exception
            r5 = r12
            r3 = r13
            r4 = r33
            goto L_0x046d
        L_0x0445:
            r0 = move-exception
            r4 = r1
            r5 = r12
            r3 = r13
            goto L_0x04a4
        L_0x044b:
            r0 = move-exception
            r4 = r1
            r32 = r8
        L_0x044f:
            r5 = r12
            r3 = r13
            goto L_0x046d
        L_0x0452:
            r0 = move-exception
            r4 = r1
            r5 = r12
            r3 = r13
            goto L_0x0462
        L_0x0457:
            r0 = move-exception
            r4 = r1
            r32 = r8
            r5 = r12
            r3 = r13
            goto L_0x046c
        L_0x045e:
            r0 = move-exception
            r11 = r4
            r3 = r13
            r4 = r1
        L_0x0462:
            r2 = 0
            goto L_0x04a4
        L_0x0464:
            r0 = move-exception
            r11 = r4
            r21 = r7
            r32 = r8
            r3 = r13
            r4 = r1
        L_0x046c:
            r2 = 0
        L_0x046d:
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18311a(r0)     // Catch:{ all -> 0x04a3 }
            if (r2 == 0) goto L_0x0475
            r2.close()
        L_0x0475:
            if (r3 == 0) goto L_0x0495
            int r0 = r3.length
            int r1 = r20 + 1
            if (r0 <= r1) goto L_0x048f
            r0 = r3[r1]
            if (r5 >= r0) goto L_0x0481
            goto L_0x048f
        L_0x0481:
            java.lang.String[] r0 = r4.f120151b
            int r0 = r0.length
            if (r0 <= r1) goto L_0x048c
            java.lang.String[] r0 = r4.f120151b
            r0 = r0[r1]
            r11.section = r0
        L_0x048c:
            r20 = r1
            goto L_0x0495
        L_0x048f:
            java.lang.String[] r0 = r4.f120151b
            r0 = r0[r20]
        L_0x0493:
            r11.section = r0
        L_0x0495:
            int r5 = r5 + 1
            r13 = r3
            r1 = r4
            r7 = r21
            r8 = r32
            r6 = 3
            r9 = 0
        L_0x049f:
            r12 = 1
            r15 = 7
            goto L_0x00be
        L_0x04a3:
            r0 = move-exception
        L_0x04a4:
            if (r2 == 0) goto L_0x04a9
            r2.close()
        L_0x04a9:
            if (r3 == 0) goto L_0x04c6
            int r1 = r3.length
            int r2 = r20 + 1
            if (r1 <= r2) goto L_0x04c0
            r1 = r3[r2]
            if (r5 < r1) goto L_0x04c0
            java.lang.String[] r1 = r4.f120151b
            int r1 = r1.length
            if (r1 <= r2) goto L_0x04c6
            java.lang.String[] r1 = r4.f120151b
            r1 = r1[r2]
            r11.section = r1
            goto L_0x04c6
        L_0x04c0:
            java.lang.String[] r1 = r4.f120151b
            r1 = r1[r20]
            r11.section = r1
        L_0x04c6:
            throw r0
        L_0x04c7:
            r4 = r1
            r10.close()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47673an.m103182a(android.content.Context, java.lang.String, boolean):com.ss.android.ugc.aweme.utils.am");
    }
}
