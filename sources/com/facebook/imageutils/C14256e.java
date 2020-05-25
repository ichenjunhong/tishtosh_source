package com.facebook.imageutils;

/* renamed from: com.facebook.imageutils.e */
public final class C14256e {
    /* renamed from: a */
    public static int m29213a(int i) {
        return C14258g.m29216a(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ IOException -> 0x00fd }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a A[Catch:{ IOException -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad A[Catch:{ IOException -> 0x00fd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29214a(java.io.InputStream r11) {
        /*
            r0 = 0
            com.facebook.common.p920d.C13689i.m27652a(r11)     // Catch:{ IOException -> 0x00fd }
        L_0x0004:
            r1 = 1
            int r2 = com.facebook.imageutils.C14257f.m29215a(r11, r1, r0)     // Catch:{ IOException -> 0x00fd }
            r3 = 255(0xff, float:3.57E-43)
            r4 = 2
            if (r2 != r3) goto L_0x0036
            r2 = 255(0xff, float:3.57E-43)
        L_0x0010:
            if (r2 != r3) goto L_0x0017
            int r2 = com.facebook.imageutils.C14257f.m29215a(r11, r1, r0)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0010
        L_0x0017:
            r3 = 225(0xe1, float:3.15E-43)
            if (r2 != r3) goto L_0x001d
            r2 = 1
            goto L_0x0037
        L_0x001d:
            r3 = 216(0xd8, float:3.03E-43)
            if (r2 == r3) goto L_0x0004
            if (r2 == r1) goto L_0x0004
            r3 = 217(0xd9, float:3.04E-43)
            if (r2 == r3) goto L_0x0036
            r3 = 218(0xda, float:3.05E-43)
            if (r2 != r3) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            int r1 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r0)     // Catch:{ IOException -> 0x00fd }
            int r1 = r1 - r4
            long r1 = (long) r1     // Catch:{ IOException -> 0x00fd }
            r11.skip(r1)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0004
        L_0x0036:
            r2 = 0
        L_0x0037:
            r3 = 4
            if (r2 == 0) goto L_0x0056
            int r2 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r0)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 - r4
            r5 = 6
            if (r2 <= r5) goto L_0x0056
            int r5 = com.facebook.imageutils.C14257f.m29215a(r11, r3, r0)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -4
            int r6 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r0)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -2
            r7 = 1165519206(0x45786966, float:3974.5874)
            if (r5 != r7) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 != 0) goto L_0x005a
            return r0
        L_0x005a:
            com.facebook.imageutils.g$a r5 = new com.facebook.imageutils.g$a     // Catch:{ IOException -> 0x00fd }
            r6 = 0
            r5.<init>()     // Catch:{ IOException -> 0x00fd }
            r6 = 8
            if (r2 > r6) goto L_0x0066
        L_0x0064:
            r2 = 0
            goto L_0x00a8
        L_0x0066:
            int r7 = com.facebook.imageutils.C14257f.m29215a(r11, r3, r0)     // Catch:{ IOException -> 0x00fd }
            r5.f37167b = r7     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -4
            int r7 = r5.f37167b     // Catch:{ IOException -> 0x00fd }
            r8 = 1229531648(0x49492a00, float:823968.0)
            if (r7 == r8) goto L_0x0084
            int r7 = r5.f37167b     // Catch:{ IOException -> 0x00fd }
            r9 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r7 == r9) goto L_0x0084
            java.lang.Class<?> r2 = com.facebook.imageutils.C14258g.f37165a     // Catch:{ IOException -> 0x00fd }
            java.lang.String r7 = "Invalid TIFF header"
            com.facebook.common.p921e.C13697a.m27692c(r2, r7)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0064
        L_0x0084:
            int r7 = r5.f37167b     // Catch:{ IOException -> 0x00fd }
            if (r7 != r8) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            r5.f37166a = r7     // Catch:{ IOException -> 0x00fd }
            boolean r7 = r5.f37166a     // Catch:{ IOException -> 0x00fd }
            int r7 = com.facebook.imageutils.C14257f.m29215a(r11, r3, r7)     // Catch:{ IOException -> 0x00fd }
            r5.f37168c = r7     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -4
            int r7 = r5.f37168c     // Catch:{ IOException -> 0x00fd }
            if (r7 < r6) goto L_0x00a0
            int r7 = r5.f37168c     // Catch:{ IOException -> 0x00fd }
            int r7 = r7 - r6
            if (r7 <= r2) goto L_0x00a8
        L_0x00a0:
            java.lang.Class<?> r2 = com.facebook.imageutils.C14258g.f37165a     // Catch:{ IOException -> 0x00fd }
            java.lang.String r7 = "Invalid offset"
            com.facebook.common.p921e.C13697a.m27692c(r2, r7)     // Catch:{ IOException -> 0x00fd }
            goto L_0x0064
        L_0x00a8:
            int r7 = r5.f37168c     // Catch:{ IOException -> 0x00fd }
            int r7 = r7 - r6
            if (r2 == 0) goto L_0x00fc
            if (r7 <= r2) goto L_0x00b0
            goto L_0x00fc
        L_0x00b0:
            long r8 = (long) r7     // Catch:{ IOException -> 0x00fd }
            r11.skip(r8)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 - r7
            boolean r6 = r5.f37166a     // Catch:{ IOException -> 0x00fd }
            r7 = 14
            if (r2 < r7) goto L_0x00dd
            int r7 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r6)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -2
        L_0x00c1:
            int r8 = r7 + -1
            if (r7 <= 0) goto L_0x00dd
            r7 = 12
            if (r2 < r7) goto L_0x00dd
            int r7 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r6)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -2
            r9 = 274(0x112, float:3.84E-43)
            if (r7 != r9) goto L_0x00d4
            goto L_0x00de
        L_0x00d4:
            r9 = 10
            r11.skip(r9)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + -10
            r7 = r8
            goto L_0x00c1
        L_0x00dd:
            r2 = 0
        L_0x00de:
            boolean r5 = r5.f37166a     // Catch:{ IOException -> 0x00fd }
            r6 = 10
            if (r2 >= r6) goto L_0x00e5
            return r0
        L_0x00e5:
            int r2 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r5)     // Catch:{ IOException -> 0x00fd }
            r6 = 3
            if (r2 == r6) goto L_0x00ed
            return r0
        L_0x00ed:
            int r2 = com.facebook.imageutils.C14257f.m29215a(r11, r3, r5)     // Catch:{ IOException -> 0x00fd }
            if (r2 == r1) goto L_0x00f4
            return r0
        L_0x00f4:
            int r1 = com.facebook.imageutils.C14257f.m29215a(r11, r4, r5)     // Catch:{ IOException -> 0x00fd }
            com.facebook.imageutils.C14257f.m29215a(r11, r4, r5)     // Catch:{ IOException -> 0x00fd }
            return r1
        L_0x00fc:
            return r0
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imageutils.C14256e.m29214a(java.io.InputStream):int");
    }
}
