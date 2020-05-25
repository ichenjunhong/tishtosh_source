package com.facebook.p914c.p916b;

import com.C2240a;
import com.facebook.common.p919c.C13671a;
import com.facebook.common.p919c.C13672b;
import com.facebook.common.p919c.C13673c;
import com.facebook.common.p919c.C13673c.C13674a;
import com.facebook.common.p919c.C13673c.C13675b;
import com.facebook.common.p919c.C13673c.C13676c;
import com.facebook.common.p919c.C13673c.C13677d;
import com.facebook.common.p920d.C13680c;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.time.C13736a;
import com.facebook.common.time.C13738c;
import com.facebook.p913b.C13613a;
import com.facebook.p913b.C13614b;
import com.facebook.p914c.p915a.C13616a;
import com.facebook.p914c.p915a.C13625i;
import com.facebook.p914c.p916b.C13640d.C13641a;
import com.facebook.p914c.p916b.C13640d.C13642b;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.c.b.a */
public class C13626a implements C13640d {

    /* renamed from: a */
    public static final Class<?> f35538a = C13626a.class;

    /* renamed from: b */
    static final long f35539b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    public final File f35540c;

    /* renamed from: d */
    public final File f35541d;

    /* renamed from: e */
    public final C13616a f35542e;

    /* renamed from: f */
    public final C13736a f35543f;

    /* renamed from: g */
    private final boolean f35544g;

    /* renamed from: com.facebook.c.b.a$a */
    class C13628a implements C13672b {

        /* renamed from: a */
        final List<C13641a> f35545a;

        /* renamed from: a */
        public final void mo25487a(File file) {
        }

        /* renamed from: c */
        public final void mo25489c(File file) {
        }

        private C13628a() {
            this.f35545a = new ArrayList();
        }

        /* renamed from: b */
        public final void mo25488b(File file) {
            C13630c a = C13626a.this.mo25477a(file);
            if (a != null && a.f35551a == ".cnt") {
                this.f35545a.add(new C13629b(a.f35552b, file));
            }
        }
    }

    /* renamed from: com.facebook.c.b.a$b */
    static class C13629b implements C13641a {

        /* renamed from: a */
        public final C13614b f35547a;

        /* renamed from: b */
        private final String f35548b;

        /* renamed from: c */
        private long f35549c;

        /* renamed from: d */
        private long f35550d;

        /* renamed from: a */
        public final String mo25490a() {
            return this.f35548b;
        }

        /* renamed from: b */
        public final long mo25491b() {
            if (this.f35550d < 0) {
                this.f35550d = this.f35547a.f35532a.lastModified();
            }
            return this.f35550d;
        }

        /* renamed from: c */
        public final long mo25492c() {
            if (this.f35549c < 0) {
                this.f35549c = this.f35547a.mo25467b();
            }
            return this.f35549c;
        }

        private C13629b(String str, File file) {
            C13689i.m27652a(file);
            this.f35548b = (String) C13689i.m27652a(str);
            this.f35547a = C13614b.m27487a(file);
            this.f35549c = -1;
            this.f35550d = -1;
        }
    }

    /* renamed from: com.facebook.c.b.a$c */
    static class C13630c {

        /* renamed from: a */
        public final String f35551a;

        /* renamed from: b */
        public final String f35552b;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35551a);
            sb.append("(");
            sb.append(this.f35552b);
            sb.append(")");
            return sb.toString();
        }

        C13630c(String str, String str2) {
            this.f35551a = str;
            this.f35552b = str2;
        }
    }

    /* renamed from: com.facebook.c.b.a$d */
    static class C13631d extends IOException {

        /* renamed from: a */
        public final long f35553a;

        /* renamed from: b */
        public final long f35554b;

        public C13631d(long j, long j2) {
            StringBuilder sb = new StringBuilder("File was not written completely. Expected: ");
            sb.append(j);
            sb.append(", found: ");
            sb.append(j2);
            super(sb.toString());
            this.f35553a = j;
            this.f35554b = j2;
        }
    }

    /* renamed from: com.facebook.c.b.a$e */
    class C13632e implements C13642b {

        /* renamed from: a */
        final File f35555a;

        /* renamed from: c */
        private final String f35557c;

        /* renamed from: a */
        public final boolean mo25496a() {
            if (!this.f35555a.exists() || this.f35555a.delete()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C13613a mo25494a(Object obj) throws IOException {
            File a = C13626a.this.mo25479a(this.f35557c);
            try {
                File file = this.f35555a;
                C13689i.m27652a(file);
                C13689i.m27652a(a);
                a.delete();
                if (!file.renameTo(a)) {
                    Throwable th = null;
                    if (a.exists()) {
                        th = new C13675b(a.getAbsolutePath());
                    } else if (!file.getParentFile().exists()) {
                        th = new C13676c(file.getAbsolutePath());
                    } else if (!file.exists()) {
                        th = new FileNotFoundException(file.getAbsolutePath());
                    }
                    StringBuilder sb = new StringBuilder("Unknown error renaming ");
                    sb.append(file.getAbsolutePath());
                    sb.append(" to ");
                    sb.append(a.getAbsolutePath());
                    throw new C13677d(sb.toString(), th);
                }
                if (a.exists()) {
                    a.setLastModified(C13626a.this.f35543f.mo25665a());
                }
                return C13614b.m27487a(a);
            } catch (C13677d e) {
                e.getCause();
                throw e;
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void mo25495a(C13625i iVar, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f35555a);
                try {
                    C13680c cVar = new C13680c(fileOutputStream);
                    iVar.mo25475a(cVar);
                    cVar.flush();
                    long j = cVar.f35658a;
                    fileOutputStream.close();
                    if (this.f35555a.length() != j) {
                        throw new C13631d(j, this.f35555a.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                throw e;
            }
        }

        public C13632e(String str, File file) {
            this.f35557c = str;
            this.f35555a = file;
        }
    }

    /* renamed from: com.facebook.c.b.a$f */
    class C13633f implements C13672b {

        /* renamed from: b */
        private boolean f35559b;

        private C13633f() {
        }

        /* renamed from: a */
        public final void mo25487a(File file) {
            if (!this.f35559b && file.equals(C13626a.this.f35541d)) {
                this.f35559b = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            if (r10.lastModified() > (r9.f35558a.f35543f.mo25665a() - com.facebook.p914c.p916b.C13626a.f35539b)) goto L_0x0034;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25488b(java.io.File r10) {
            /*
                r9 = this;
                boolean r0 = r9.f35559b
                if (r0 == 0) goto L_0x0036
                com.facebook.c.b.a r0 = com.facebook.p914c.p916b.C13626a.this
                com.facebook.c.b.a$c r0 = r0.mo25477a(r10)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r1 = 0
                goto L_0x0034
            L_0x0010:
                java.lang.String r3 = r0.f35551a
                java.lang.String r4 = ".tmp"
                if (r3 != r4) goto L_0x002a
                long r3 = r10.lastModified()
                com.facebook.c.b.a r0 = com.facebook.p914c.p916b.C13626a.this
                com.facebook.common.time.a r0 = r0.f35543f
                long r5 = r0.mo25665a()
                long r7 = com.facebook.p914c.p916b.C13626a.f35539b
                long r5 = r5 - r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x000e
                goto L_0x0034
            L_0x002a:
                java.lang.String r0 = r0.f35551a
                java.lang.String r3 = ".cnt"
                if (r0 != r3) goto L_0x0031
                r2 = 1
            L_0x0031:
                com.facebook.common.p920d.C13689i.m27657b(r2)
            L_0x0034:
                if (r1 != 0) goto L_0x0039
            L_0x0036:
                r10.delete()
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p914c.p916b.C13626a.C13633f.mo25488b(java.io.File):void");
        }

        /* renamed from: c */
        public final void mo25489c(File file) {
            if (!C13626a.this.f35540c.equals(file) && !this.f35559b) {
                file.delete();
            }
            if (this.f35559b && file.equals(C13626a.this.f35541d)) {
                this.f35559b = false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25480a() {
        return this.f35544g;
    }

    /* renamed from: c */
    public final void mo25484c() {
        C13671a.m27625a(this.f35540c);
    }

    /* renamed from: d */
    public final /* synthetic */ Collection mo25486d() throws IOException {
        C13628a aVar = new C13628a();
        C13671a.m27624a(this.f35541d, aVar);
        return Collections.unmodifiableList(aVar.f35545a);
    }

    /* renamed from: b */
    public final void mo25483b() {
        C13671a.m27624a(this.f35540c, new C13633f());
    }

    /* renamed from: d */
    private File m27506d(String str) {
        return new File(m27505c(str));
    }

    /* renamed from: a */
    public final long mo25476a(C13641a aVar) {
        return m27504b(((C13629b) aVar).f35547a.f35532a);
    }

    /* renamed from: b */
    public final long mo25481b(String str) {
        return m27504b(mo25479a(str));
    }

    /* renamed from: b */
    private static long m27504b(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* renamed from: c */
    private String m27505c(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35541d);
        sb.append(File.separator);
        sb.append(valueOf);
        return sb.toString();
    }

    /* renamed from: a */
    public final C13630c mo25477a(File file) {
        C13630c cVar;
        String str;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            if (".cnt".equals(substring)) {
                str = ".cnt";
            } else if (".tmp".equals(substring)) {
                str = ".tmp";
            } else {
                str = null;
            }
            if (str != null) {
                String substring2 = name.substring(0, lastIndexOf);
                if (str.equals(".tmp")) {
                    int lastIndexOf2 = substring2.lastIndexOf(46);
                    if (lastIndexOf2 > 0) {
                        substring2 = substring2.substring(0, lastIndexOf2);
                    }
                }
                cVar = new C13630c(str, substring2);
                if (cVar == null && m27506d(cVar.f35552b).equals(file.getParentFile())) {
                    return cVar;
                }
                return null;
            }
        }
        cVar = null;
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo25479a(String str) {
        C13630c cVar = new C13630c(".cnt", str);
        String c = m27505c(cVar.f35552b);
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(File.separator);
        sb.append(cVar.f35552b);
        sb.append(cVar.f35551a);
        return new File(sb.toString());
    }

    /* renamed from: c */
    public final boolean mo25485c(String str, Object obj) {
        return mo25479a(str).exists();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        new java.lang.StringBuilder("failed to read folder to check if external: ").append(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m27503a(java.io.File r1, com.facebook.p914c.p915a.C13616a r2) {
        /*
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x001e }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0013 }
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x0014 }
            goto L_0x001f
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001e }
            java.lang.String r0 = "failed to read folder to check if external: "
            r2.<init>(r0)     // Catch:{ Exception -> 0x001e }
            r2.append(r1)     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            r2 = 0
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p914c.p916b.C13626a.m27503a(java.io.File, com.facebook.c.a.a):boolean");
    }

    /* renamed from: a */
    public final C13642b mo25478a(String str, Object obj) throws IOException {
        C13630c cVar = new C13630c(".tmp", str);
        File d = m27506d(cVar.f35552b);
        if (!d.exists()) {
            try {
                C13673c.m27630a(d);
            } catch (C13674a e) {
                throw e;
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.f35552b);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            return new C13632e(str, File.createTempFile(sb.toString(), ".tmp", d));
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public final C13613a mo25482b(String str, Object obj) {
        File a = mo25479a(str);
        if (!a.exists()) {
            return null;
        }
        a.setLastModified(this.f35543f.mo25665a());
        return C13614b.m27487a(a);
    }

    public C13626a(File file, int i, C13616a aVar) {
        C13689i.m27652a(file);
        this.f35540c = file;
        this.f35544g = m27503a(file, aVar);
        boolean z = true;
        this.f35541d = new File(this.f35540c, C2240a.m6773a(null, "%s.ols%d.%d", new Object[]{"v2", Integer.valueOf(100), Integer.valueOf(i)}));
        this.f35542e = aVar;
        if (this.f35540c.exists()) {
            if (!this.f35541d.exists()) {
                C13671a.m27626b(this.f35540c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C13673c.m27630a(this.f35541d);
            } catch (C13674a unused) {
                new StringBuilder("version directory could not be created: ").append(this.f35541d);
            }
        }
        this.f35543f = C13738c.m27790b();
    }
}
