package com.google.android.gms.internal.ads;

@C16299uq
public final class bwy {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r2 = r2 | ((r0[r1 + 1] & 255) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r0 = ((r0[r1] & 255) | r2) * -862048943;
        r4 = r4 ^ (((r0 >>> 17) | (r0 << 15)) * 461845907);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        r9 = r9 ^ r4;
        r9 = (r9 ^ (r9 >>> 16)) * -2048144789;
        r9 = (r9 ^ (r9 >>> 13)) * -1028477387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        return r9 ^ (r9 >>> 16);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m36937a(java.lang.String r9) {
        /*
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r9.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0007 }
            goto L_0x000b
        L_0x0007:
            byte[] r0 = r9.getBytes()
        L_0x000b:
            int r9 = r0.length
            r1 = r9 & -4
            r2 = 0
            int r1 = r1 + r2
            r3 = 0
            r4 = 0
        L_0x0012:
            r5 = 461845907(0x1b873593, float:2.2368498E-22)
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            if (r3 >= r1) goto L_0x004f
            byte r7 = r0[r3]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r3 + 1
            byte r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r3 + 2
            byte r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r7 = r7 | r8
            int r8 = r3 + 3
            byte r8 = r0[r8]
            int r8 = r8 << 24
            r7 = r7 | r8
            int r7 = r7 * r6
            int r6 = r7 << 15
            int r7 = r7 >>> 17
            r6 = r6 | r7
            int r6 = r6 * r5
            r4 = r4 ^ r6
            int r5 = r4 << 13
            int r4 = r4 >>> 19
            r4 = r4 | r5
            int r4 = r4 * 5
            r5 = -430675100(0xffffffffe6546b64, float:-2.5078068E23)
            int r4 = r4 + r5
            int r3 = r3 + 4
            goto L_0x0012
        L_0x004f:
            r3 = r9 & 3
            switch(r3) {
                case 1: goto L_0x0066;
                case 2: goto L_0x005d;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0075
        L_0x0055:
            int r2 = r1 + 2
            byte r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
        L_0x005d:
            int r3 = r1 + 1
            byte r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
        L_0x0066:
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            int r0 = r0 * r6
            int r1 = r0 << 15
            int r0 = r0 >>> 17
            r0 = r0 | r1
            int r0 = r0 * r5
            r4 = r4 ^ r0
        L_0x0075:
            r9 = r9 ^ r4
            int r0 = r9 >>> 16
            r9 = r9 ^ r0
            r0 = -2048144789(0xffffffff85ebca6b, float:-2.217365E-35)
            int r9 = r9 * r0
            int r0 = r9 >>> 13
            r9 = r9 ^ r0
            r0 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
            int r9 = r9 * r0
            int r0 = r9 >>> 16
            r9 = r9 ^ r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bwy.m36937a(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (r4 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d4, code lost:
        if (r4 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] m36938a(java.lang.String r11, boolean r12) {
        /*
            if (r11 != 0) goto L_0x0004
            r11 = 0
            return r11
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            char[] r1 = r11.toCharArray()
            int r11 = r11.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0015:
            if (r3 >= r11) goto L_0x00db
            int r6 = java.lang.Character.codePointAt(r1, r3)
            int r7 = java.lang.Character.charCount(r6)
            boolean r8 = java.lang.Character.isLetter(r6)
            r9 = 1
            if (r8 == 0) goto L_0x0083
            java.lang.Character$UnicodeBlock r8 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HIRAGANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            if (r8 != r10) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r8 = 0
            goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            if (r8 != 0) goto L_0x0081
            r8 = 65382(0xff66, float:9.162E-41)
            if (r6 < r8) goto L_0x0072
            r8 = 65437(0xff9d, float:9.1697E-41)
            if (r6 <= r8) goto L_0x007c
        L_0x0072:
            r8 = 65441(0xffa1, float:9.1702E-41)
            if (r6 < r8) goto L_0x007e
            r8 = 65500(0xffdc, float:9.1785E-41)
            if (r6 > r8) goto L_0x007e
        L_0x007c:
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            if (r8 == 0) goto L_0x0083
        L_0x0081:
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
        L_0x0092:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r7)
            r0.add(r4)
        L_0x009a:
            r4 = 0
            goto L_0x00d8
        L_0x009c:
            boolean r8 = java.lang.Character.isLetterOrDigit(r6)
            if (r8 != 0) goto L_0x00d4
            int r8 = java.lang.Character.getType(r6)
            r10 = 6
            if (r8 == r10) goto L_0x00d4
            int r8 = java.lang.Character.getType(r6)
            r10 = 8
            if (r8 != r10) goto L_0x00b2
            goto L_0x00d4
        L_0x00b2:
            if (r12 == 0) goto L_0x00c7
            int r8 = java.lang.Character.charCount(r6)
            if (r8 != r9) goto L_0x00c7
            char[] r6 = java.lang.Character.toChars(r6)
            char r6 = r6[r2]
            r8 = 39
            if (r6 != r8) goto L_0x00c7
            if (r4 != 0) goto L_0x00d7
            goto L_0x00d6
        L_0x00c7:
            if (r4 == 0) goto L_0x00d8
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
            goto L_0x009a
        L_0x00d4:
            if (r4 != 0) goto L_0x00d7
        L_0x00d6:
            r5 = r3
        L_0x00d7:
            r4 = 1
        L_0x00d8:
            int r3 = r3 + r7
            goto L_0x0015
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            java.lang.String r11 = new java.lang.String
            int r3 = r3 - r5
            r11.<init>(r1, r5, r3)
            r0.add(r11)
        L_0x00e6:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bwy.m36938a(java.lang.String, boolean):java.lang.String[]");
    }
}
