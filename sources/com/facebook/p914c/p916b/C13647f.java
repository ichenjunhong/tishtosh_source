package com.facebook.p914c.p916b;

import com.facebook.common.p919c.C13673c;
import com.facebook.common.p919c.C13673c.C13674a;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p921e.C13697a;
import com.facebook.p913b.C13613a;
import com.facebook.p914c.p915a.C13616a;
import com.facebook.p914c.p916b.C13640d.C13641a;
import com.facebook.p914c.p916b.C13640d.C13642b;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.c.b.f */
public class C13647f implements C13640d {

    /* renamed from: b */
    private static final Class<?> f35613b = C13647f.class;

    /* renamed from: a */
    volatile C13648a f35614a = new C13648a(null, null);

    /* renamed from: c */
    private final int f35615c;

    /* renamed from: d */
    private final C13691k<File> f35616d;

    /* renamed from: e */
    private final String f35617e;

    /* renamed from: f */
    private final C13616a f35618f;

    /* renamed from: com.facebook.c.b.f$a */
    static class C13648a {

        /* renamed from: a */
        public final C13640d f35619a;

        /* renamed from: b */
        public final File f35620b;

        C13648a(File file, C13640d dVar) {
            this.f35619a = dVar;
            this.f35620b = file;
        }
    }

    /* renamed from: c */
    public final void mo25484c() throws IOException {
        m27574e().mo25484c();
    }

    /* renamed from: d */
    public final Collection<C13641a> mo25486d() throws IOException {
        return m27574e().mo25486d();
    }

    /* renamed from: b */
    public final void mo25483b() {
        try {
            m27574e().mo25483b();
        } catch (IOException e) {
            C13697a.m27686b(f35613b, "purgeUnexpectedResources", (Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0019  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.p914c.p916b.C13640d m27574e() throws java.io.IOException {
        /*
            r4 = this;
            monitor-enter(r4)
            com.facebook.c.b.f$a r0 = r4.f35614a     // Catch:{ all -> 0x005a }
            com.facebook.c.b.d r1 = r0.f35619a     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0016
            java.io.File r1 = r0.f35620b     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0016
            java.io.File r0 = r0.f35620b     // Catch:{ all -> 0x005a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x004e
            com.facebook.c.b.f$a r0 = r4.f35614a     // Catch:{ all -> 0x005a }
            com.facebook.c.b.d r0 = r0.f35619a     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x002c
            com.facebook.c.b.f$a r0 = r4.f35614a     // Catch:{ all -> 0x005a }
            java.io.File r0 = r0.f35620b     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x002c
            com.facebook.c.b.f$a r0 = r4.f35614a     // Catch:{ all -> 0x005a }
            java.io.File r0 = r0.f35620b     // Catch:{ all -> 0x005a }
            com.facebook.common.p919c.C13671a.m27626b(r0)     // Catch:{ all -> 0x005a }
        L_0x002c:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005a }
            com.facebook.common.d.k<java.io.File> r1 = r4.f35616d     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.mo23157b()     // Catch:{ all -> 0x005a }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r4.f35617e     // Catch:{ all -> 0x005a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x005a }
            r4.m27573a(r0)     // Catch:{ all -> 0x005a }
            com.facebook.c.b.a r1 = new com.facebook.c.b.a     // Catch:{ all -> 0x005a }
            int r2 = r4.f35615c     // Catch:{ all -> 0x005a }
            com.facebook.c.a.a r3 = r4.f35618f     // Catch:{ all -> 0x005a }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x005a }
            com.facebook.c.b.f$a r2 = new com.facebook.c.b.f$a     // Catch:{ all -> 0x005a }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x005a }
            r4.f35614a = r2     // Catch:{ all -> 0x005a }
        L_0x004e:
            com.facebook.c.b.f$a r0 = r4.f35614a     // Catch:{ all -> 0x005a }
            com.facebook.c.b.d r0 = r0.f35619a     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = com.facebook.common.p920d.C13689i.m27652a(r0)     // Catch:{ all -> 0x005a }
            com.facebook.c.b.d r0 = (com.facebook.p914c.p916b.C13640d) r0     // Catch:{ all -> 0x005a }
            monitor-exit(r4)
            return r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p914c.p916b.C13647f.m27574e():com.facebook.c.b.d");
    }

    /* renamed from: a */
    public final boolean mo25480a() {
        try {
            return m27574e().mo25480a();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final long mo25476a(C13641a aVar) throws IOException {
        return m27574e().mo25476a(aVar);
    }

    /* renamed from: b */
    public final long mo25481b(String str) throws IOException {
        return m27574e().mo25481b(str);
    }

    /* renamed from: a */
    private void m27573a(File file) throws IOException {
        try {
            C13673c.m27630a(file);
            C13697a.m27685b(f35613b, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (C13674a e) {
            throw e;
        }
    }

    /* renamed from: c */
    public final boolean mo25485c(String str, Object obj) throws IOException {
        return m27574e().mo25485c(str, obj);
    }

    /* renamed from: b */
    public final C13613a mo25482b(String str, Object obj) throws IOException {
        return m27574e().mo25482b(str, obj);
    }

    /* renamed from: a */
    public final C13642b mo25478a(String str, Object obj) throws IOException {
        return m27574e().mo25478a(str, obj);
    }

    public C13647f(int i, C13691k<File> kVar, String str, C13616a aVar) {
        this.f35615c = i;
        this.f35618f = aVar;
        this.f35616d = kVar;
        this.f35617e = str;
    }
}
