package p2628d.p2638e;

/* renamed from: d.e.k */
public class C52661k extends C52660j {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        p2628d.p2638e.C52647c.m112189a(r1, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m112200a(java.io.File r1, java.nio.charset.Charset r2) {
        /*
            java.lang.String r0 = "$this$readText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            java.lang.String r0 = "charset"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r0, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r0 = r1
            java.io.InputStreamReader r0 = (java.io.InputStreamReader) r0     // Catch:{ Throwable -> 0x0028 }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ Throwable -> 0x0028 }
            java.lang.String r0 = p2628d.p2638e.C52666o.m112218b(r0)     // Catch:{ Throwable -> 0x0028 }
            p2628d.p2638e.C52647c.m112189a(r1, r2)
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x002a
        L_0x0028:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0026 }
        L_0x002a:
            p2628d.p2638e.C52647c.m112189a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2638e.C52661k.m112200a(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        p2628d.p2638e.C52647c.m112189a(r0, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m112203a(java.io.File r2, byte[] r3) {
        /*
            java.lang.String r0 = "$this$appendBytes"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "array"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = 0
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch:{ Throwable -> 0x001f }
            r1.write(r3)     // Catch:{ Throwable -> 0x001f }
            p2628d.p2638e.C52647c.m112189a(r0, r2)
            return
        L_0x001d:
            r3 = move-exception
            goto L_0x0021
        L_0x001f:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001d }
        L_0x0021:
            p2628d.p2638e.C52647c.m112189a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2638e.C52661k.m112203a(java.io.File, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        p2628d.p2638e.C52647c.m112189a(r3, r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m112201a(java.io.File r1, java.lang.String r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "$this$writeText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            java.lang.String r0 = "text"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "charset"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r3 = "$this$writeBytes"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.lang.String r3 = "array"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r1)
            java.io.Closeable r3 = (java.io.Closeable) r3
            r1 = 0
            r0 = r3
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch:{ Throwable -> 0x0036 }
            r0.write(r2)     // Catch:{ Throwable -> 0x0036 }
            p2628d.p2638e.C52647c.m112189a(r3, r1)
            return
        L_0x0034:
            r2 = move-exception
            goto L_0x0038
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0038:
            p2628d.p2638e.C52647c.m112189a(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2638e.C52661k.m112201a(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }
}
