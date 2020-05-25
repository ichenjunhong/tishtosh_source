package com.p683ss.android.ugc.aweme.profile.util;

import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.profile.util.r */
public final class C40567r {
    /* renamed from: a */
    public static File m89999a() {
        return new File(C48016e.m103934a("profileHeader"), "profileHeaderCrop.png");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[SYNTHETIC, Splitter:B:22:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0032 A[SYNTHETIC, Splitter:B:28:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90000a(java.lang.String r4, int r5, int r6) {
        /*
            r0 = 0
            if (r5 <= 0) goto L_0x0036
            if (r6 > 0) goto L_0x0006
            goto L_0x0036
        L_0x0006:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0030, all -> 0x0028 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0030, all -> 0x0028 }
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            r3 = 1
            r4.inJustDecodeBounds = r3     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r4)     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            int r1 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            if (r5 > r1) goto L_0x001f
            int r4 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x0026, all -> 0x0024 }
            if (r6 <= r4) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            r2.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r0
        L_0x0024:
            r4 = move-exception
            goto L_0x002a
        L_0x0026:
            r1 = r2
            goto L_0x0030
        L_0x0028:
            r4 = move-exception
            r2 = r1
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            throw r4
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            return r0
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.util.C40567r.m90000a(java.lang.String, int, int):boolean");
    }
}
