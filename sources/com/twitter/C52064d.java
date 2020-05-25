package com.twitter;

/* renamed from: com.twitter.d */
public final class C52064d {

    /* renamed from: a */
    public int f129642a = 23;

    /* renamed from: b */
    public int f129643b = 23;

    /* renamed from: c */
    private C52059a f129644c = new C52059a();

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo108752a(java.lang.String r9) {
        /*
            r8 = this;
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFC
            java.lang.String r9 = java.text.Normalizer.normalize(r9, r0)
            int r0 = r9.length()
            r1 = 0
            int r0 = r9.codePointCount(r1, r0)
            com.twitter.a r1 = r8.f129644c
            if (r9 == 0) goto L_0x0085
            int r2 = r9.length()
            if (r2 == 0) goto L_0x0085
            boolean r2 = r1.f129617a
            if (r2 == 0) goto L_0x0024
            r2 = 46
        L_0x001f:
            int r2 = r9.indexOf(r2)
            goto L_0x0027
        L_0x0024:
            r2 = 58
            goto L_0x001f
        L_0x0027:
            r3 = -1
            if (r2 != r3) goto L_0x002b
            goto L_0x0085
        L_0x002b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.regex.Pattern r3 = com.twitter.C52062b.f129631h
            java.util.regex.Matcher r9 = r3.matcher(r9)
        L_0x0036:
            boolean r3 = r9.find()
            if (r3 == 0) goto L_0x0089
            r3 = 4
            java.lang.String r3 = r9.group(r3)
            if (r3 != 0) goto L_0x0058
            boolean r3 = r1.f129617a
            if (r3 == 0) goto L_0x0036
            java.util.regex.Pattern r3 = com.twitter.C52062b.f129633j
            r4 = 2
            java.lang.String r4 = r9.group(r4)
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x0036
        L_0x0058:
            r3 = 3
            java.lang.String r4 = r9.group(r3)
            int r5 = r9.start(r3)
            int r3 = r9.end(r3)
            java.util.regex.Pattern r6 = com.twitter.C52062b.f129632i
            java.util.regex.Matcher r6 = r6.matcher(r4)
            boolean r7 = r6.find()
            if (r7 == 0) goto L_0x007a
            java.lang.String r4 = r6.group()
            int r3 = r4.length()
            int r3 = r3 + r5
        L_0x007a:
            com.twitter.a$a r6 = new com.twitter.a$a
            com.twitter.a$a$a r7 = com.twitter.C52059a.C52060a.C52061a.URL
            r6.<init>(r5, r3, r4, r7)
            r2.add(r6)
            goto L_0x0036
        L_0x0085:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0089:
            java.util.Iterator r9 = r2.iterator()
        L_0x008d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r1 = r9.next()
            com.twitter.a$a r1 = (com.twitter.C52059a.C52060a) r1
            int r2 = r1.f129618a
            int r3 = r1.f129619b
            int r2 = r2 - r3
            int r0 = r0 + r2
            java.lang.String r1 = r1.f129620c
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "https://"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x00b0
            int r1 = r8.f129643b
            goto L_0x00b2
        L_0x00b0:
            int r1 = r8.f129642a
        L_0x00b2:
            int r0 = r0 + r1
            goto L_0x008d
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.C52064d.mo108752a(java.lang.String):int");
    }
}
