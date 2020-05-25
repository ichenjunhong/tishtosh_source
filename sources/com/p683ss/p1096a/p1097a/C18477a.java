package com.p683ss.p1096a.p1097a;

import com.p683ss.p1096a.p1098b.C18481a;

/* renamed from: com.ss.a.a.a */
public final class C18477a {

    /* renamed from: a */
    public static String f50888a = "https://";

    /* renamed from: b */
    public static int f50889b = 255;

    /* renamed from: c */
    public static int f50890c = 0;

    /* renamed from: d */
    public static String f50891d = "";

    /* renamed from: e */
    public static String f50892e = "";

    /* renamed from: a */
    public static String m44711a() {
        StringBuilder sb;
        String str;
        String str2 = f50888a;
        switch (f50889b) {
            case 2:
                sb = new StringBuilder();
                sb.append(str2);
                str = new String(C18481a.m44726a("736d722d73672e627974656f7665727365612e636f6d"));
                break;
            case 3:
                sb = new StringBuilder();
                sb.append(str2);
                str = new String(C18481a.m44726a("736d722d616c6976612e627974656f7665727365612e636f6d"));
                break;
            default:
                return str2;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized void m44712a(int i) {
        synchronized (C18477a.class) {
            f50889b = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m44713a(int r1, java.lang.String r2) {
        /*
            java.lang.Class<com.ss.a.a.a> r0 = com.p683ss.p1096a.p1097a.C18477a.class
            monitor-enter(r0)
            switch(r1) {
                case 1025: goto L_0x000a;
                case 1026: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x0011
        L_0x0007:
            f50892e = r2     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000a:
            f50891d = r2     // Catch:{ all -> 0x000e }
            monitor-exit(r0)
            return
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0011:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p1096a.p1097a.C18477a.m44713a(int, java.lang.String):void");
    }

    /* renamed from: b */
    public static String m44714b() {
        StringBuilder sb;
        String str;
        String str2 = f50888a;
        switch (f50889b) {
            case 2:
                if (f50890c == 1180) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str = new String(C18481a.m44726a("7665726966792d73672e74696b746f6b762e636f6d"));
                    break;
                } else {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str = new String(C18481a.m44726a("7665726966792d73672e627974656f7665727365612e636f6d"));
                    break;
                }
            case 3:
                if (f50890c == 1233) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str = new String(C18481a.m44726a("766572696669636174696f6e2d76612e6d75736963616c2e6c79"));
                    break;
                } else {
                    sb = new StringBuilder();
                    sb.append(str2);
                    str = new String(C18481a.m44726a("766572696669636174696f6e2d76612e627974656f7665727365612e636f6d"));
                    break;
                }
            default:
                return str2;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static synchronized void m44715b(int i) {
        synchronized (C18477a.class) {
            f50890c = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r4.append(r0);
        r0 = r4.toString();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44716c(int r4) {
        /*
            java.lang.String r0 = f50888a
            java.lang.String r1 = f50891d
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x000d
            java.lang.String r4 = f50891d
            return r4
        L_0x000d:
            int r1 = f50889b
            r2 = 1
            switch(r1) {
                case 2: goto L_0x0062;
                case 3: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00b5
        L_0x0015:
            if (r4 != 0) goto L_0x004c
            int r1 = f50890c
            r3 = 1233(0x4d1, float:1.728E-42)
            if (r1 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "786c6f672d76612e627974656f7665727365612e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r0.<init>(r3)
        L_0x0030:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x004c
        L_0x0038:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "786c6f672d76612e6d75736963616c2e6c79"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r0.<init>(r3)
            goto L_0x0030
        L_0x004c:
            if (r4 != r2) goto L_0x00b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "6264732d76612e627974656f7665727365612e636f6d"
            byte[] r1 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r1)
            r0.<init>(r1)
            goto L_0x00ae
        L_0x0062:
            if (r4 != 0) goto L_0x0099
            int r1 = f50890c
            r3 = 1180(0x49c, float:1.654E-42)
            if (r1 == r3) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "786c6f672e627974656f7665727365612e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r0.<init>(r3)
        L_0x007d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0099
        L_0x0085:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "786c6f672e74696b746f6b762e636f6d"
            byte[] r3 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r3)
            r0.<init>(r3)
            goto L_0x007d
        L_0x0099:
            if (r4 != r2) goto L_0x00b5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "6264732d73672e627974656f7665727365612e636f6d"
            byte[] r1 = com.p683ss.p1096a.p1098b.C18481a.m44726a(r1)
            r0.<init>(r1)
        L_0x00ae:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p1096a.p1097a.C18477a.m44716c(int):java.lang.String");
    }
}
