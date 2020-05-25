package com.bytedance.jirafast.p751d;

import android.content.Context;
import android.database.ContentObserver;

/* renamed from: com.bytedance.jirafast.d.m */
public final class C12044m extends ContentObserver {

    /* renamed from: b */
    public static boolean f31837b;

    /* renamed from: c */
    public static C12044m f31838c;

    /* renamed from: d */
    private static final String[] f31839d = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: a */
    public Context f31840a;

    /* renamed from: e */
    private int f31841e;

    public C12044m(Context context) {
        super(null);
        this.f31840a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ff A[SYNTHETIC, Splitter:B:58:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0106 A[SYNTHETIC, Splitter:B:66:0x0106] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChange(boolean r11) {
        /*
            r10 = this;
            super.onChange(r11)
            com.bytedance.jirafast.d.a r11 = com.bytedance.jirafast.p751d.C12015a.m24416a()
            java.lang.String r0 = com.bytedance.jirafast.p751d.C12015a.f31775p
            boolean r11 = r11.mo22758c(r0)
            if (r11 != 0) goto L_0x010b
            boolean r11 = f31837b
            if (r11 != 0) goto L_0x0015
            goto L_0x010b
        L_0x0015:
            com.bytedance.jirafast.d.d r11 = com.bytedance.jirafast.p751d.C12020d.m24434a()
            r0 = 0
            r11.mo22764a(r0)
            r11 = 2
            java.lang.String[] r3 = new java.lang.String[r11]
            java.lang.String r11 = "date_added"
            r7 = 0
            r3[r7] = r11
            java.lang.String r11 = "_data"
            r8 = 1
            r3[r8] = r11
            android.content.Context r11 = r10.f31840a     // Catch:{ Exception -> 0x0103, all -> 0x00f9 }
            android.content.ContentResolver r1 = r11.getContentResolver()     // Catch:{ Exception -> 0x0103, all -> 0x00f9 }
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0103, all -> 0x00f9 }
            r4 = 0
            r5 = 0
            java.lang.String r6 = "date_modified desc"
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0103, all -> 0x00f9 }
            if (r11 != 0) goto L_0x0043
            if (r11 == 0) goto L_0x0042
            r11.close()     // Catch:{ Exception -> 0x0042 }
            return
        L_0x0042:
            return
        L_0x0043:
            int r0 = r11.getCount()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r1 = r10.f31841e     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r1 != 0) goto L_0x004e
            r10.f31841e = r0     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            goto L_0x0059
        L_0x004e:
            int r1 = r10.f31841e     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r1 < r0) goto L_0x0059
            if (r11 == 0) goto L_0x0058
            r11.close()     // Catch:{ Exception -> 0x0058 }
            return
        L_0x0058:
            return
        L_0x0059:
            r10.f31841e = r0     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            boolean r0 = r11.moveToFirst()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "_data"
            int r0 = r11.getColumnIndex(r0)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            java.lang.String r1 = "date_added"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            long r1 = r11.getLong(r1)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            long r3 = r3 - r1
            r1 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x00f1
            java.lang.String r1 = r0.toLowerCase()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            java.lang.String[] r2 = f31839d     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r3 = r2.length     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r4 = 0
        L_0x0091:
            if (r4 >= r3) goto L_0x00a0
            r5 = r2[r4]     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r5 == 0) goto L_0x009d
            r1 = 1
            goto L_0x00a1
        L_0x009d:
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00f1
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            android.content.Context r2 = r10.f31840a     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r2 = com.bytedance.jirafast.p751d.C12048o.m24506b(r2)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            android.content.Context r3 = r10.f31840a     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r3 = com.bytedance.jirafast.p751d.C12048o.m24504a(r3)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r2.inJustDecodeBounds = r8     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            android.graphics.BitmapFactory.decodeFile(r0, r2)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r3 = r1.x     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r4 = r2.outWidth     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r3 < r4) goto L_0x00cb
            int r1 = r1.y     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            int r2 = r2.outHeight     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            if (r1 < r2) goto L_0x00cb
            r7 = 1
        L_0x00cb:
            if (r7 == 0) goto L_0x00f1
            com.bytedance.jirafast.b.e r0 = com.bytedance.jirafast.p749b.C12001e.obtainImg(r0)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r2.<init>()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r2.add(r0)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            com.bytedance.jirafast.b.d r0 = new com.bytedance.jirafast.b.d     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r7 = 0
            java.lang.String r8 = "yijin@qq,xcom"
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            com.bytedance.jirafast.d.d r1 = com.bytedance.jirafast.p751d.C12020d.m24434a()     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
            r1.mo22765a(r0)     // Catch:{ Exception -> 0x0104, all -> 0x00f7 }
        L_0x00f1:
            if (r11 == 0) goto L_0x010a
            r11.close()     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            return
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f9:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00fd:
            if (r11 == 0) goto L_0x0102
            r11.close()     // Catch:{ Exception -> 0x0102 }
        L_0x0102:
            throw r0
        L_0x0103:
            r11 = r0
        L_0x0104:
            if (r11 == 0) goto L_0x010a
            r11.close()     // Catch:{ Exception -> 0x0109 }
        L_0x0109:
            return
        L_0x010a:
            return
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12044m.onChange(boolean):void");
    }
}
