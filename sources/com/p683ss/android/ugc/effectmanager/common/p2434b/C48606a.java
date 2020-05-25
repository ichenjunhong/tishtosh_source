package com.p683ss.android.ugc.effectmanager.common.p2434b;

import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48614c;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48615b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Set;
import java.util.regex.Pattern;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a */
public class C48606a implements C48620c {

    /* renamed from: f */
    public static final C48607a f122204f = new C48607a(null);

    /* renamed from: a */
    private final MessageDigest f122205a;

    /* renamed from: b */
    private final String f122206b;

    /* renamed from: e */
    public C48608a f122207e;

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$a */
    public static final class C48607a {
        private C48607a() {
        }

        public /* synthetic */ C48607a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo96167a() {
        return this.f122206b;
    }

    /* renamed from: e */
    private final C48614c mo96159e(String str) {
        String f = C48608a.m105182f(str);
        try {
            C48608a aVar = this.f122207e;
            if (aVar != null) {
                return aVar.mo96168a(f);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final InputStream mo96152b(String str) {
        C52711k.m112240b(str, "key");
        C48614c e = mo96159e(str);
        if (e != null) {
            return e.mo96193a(0);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo96153c(String str) {
        C52711k.m112240b(str, "key");
        String f = C48608a.m105182f(str);
        try {
            C48608a aVar = this.f122207e;
            if (aVar != null) {
                return aVar.mo96174c(f);
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo96155d(String str) {
        C52711k.m112240b(str, "key");
        String f = C48608a.m105182f(str);
        C48608a aVar = this.f122207e;
        if (aVar != null) {
            return aVar.mo96178e(f);
        }
        return false;
    }

    /* renamed from: a */
    public void mo96151a(Pattern pattern) {
        if (pattern != null) {
            C48608a aVar = this.f122207e;
            if (aVar != null) {
                Set<String> d = aVar.mo96176d();
                if (d != null) {
                    for (String str : d) {
                        if (pattern.matcher(str).matches()) {
                            C52711k.m112236a((Object) str, "it");
                            mo96153c(str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[Catch:{ Exception -> 0x0043 }] */
    /* renamed from: c_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96154c_(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.io.InputStream r5 = r4.mo96152b(r5)
            r0 = 0
            if (r5 == 0) goto L_0x004e
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0044, all -> 0x0038 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0044, all -> 0x0038 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0044, all -> 0x0038 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ Exception -> 0x0044, all -> 0x0038 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0044, all -> 0x0038 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
            r1.<init>()     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
        L_0x0021:
            if (r3 == 0) goto L_0x002b
            r1.append(r3)     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
            goto L_0x0021
        L_0x002b:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0045, all -> 0x0036 }
            r5.close()     // Catch:{ Exception -> 0x0035 }
            r2.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            return r1
        L_0x0036:
            r0 = move-exception
            goto L_0x003b
        L_0x0038:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x003b:
            r5.close()     // Catch:{ Exception -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r2 = r0
        L_0x0045:
            r5.close()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            return r0
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a.mo96154c_(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.mo96183b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v3 com.ss.android.ugc.effectmanager.common.b.d) = (r2v0 com.ss.android.ugc.effectmanager.common.b.d), (r2v2 com.ss.android.ugc.effectmanager.common.b.d), (r2v2 com.ss.android.ugc.effectmanager.common.b.d), (r2v5 com.ss.android.ugc.effectmanager.common.b.d), (r2v5 com.ss.android.ugc.effectmanager.common.b.d), (r2v0 com.ss.android.ugc.effectmanager.common.b.d), (r2v0 com.ss.android.ugc.effectmanager.common.b.d) binds: [B:1:0x0011, B:30:0x0057, B:31:?, B:17:0x0049, B:18:?, B:7:0x001d, B:8:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC, Splitter:B:30:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d A[SYNTHETIC, Splitter:B:33:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0064 A[SYNTHETIC, Splitter:B:39:0x0064] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo96148a(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "value"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r7 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.m105182f(r7)
            r0 = 0
            r2 = 0
            com.ss.android.ugc.effectmanager.common.b.a.a r3 = r6.f122207e     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            if (r3 == 0) goto L_0x001a
            com.ss.android.ugc.effectmanager.common.b.a.a$a r7 = r3.mo96171b(r7)     // Catch:{ IOException -> 0x0054, all -> 0x0052 }
            goto L_0x001b
        L_0x001a:
            r7 = r2
        L_0x001b:
            if (r7 == 0) goto L_0x0047
            com.ss.android.ugc.effectmanager.common.b.d r3 = new com.ss.android.ugc.effectmanager.common.b.d     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r4 = 0
            java.io.OutputStream r4 = r7.mo96181a(r4)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            java.lang.String r5 = "newOutputStream(0)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            java.nio.charset.Charset r2 = p2628d.p2650m.C52808d.f131043a     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            byte[] r8 = r8.getBytes(r2)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r2)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3.write(r8)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3.flush()     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r7.mo96182a()     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r2 = r3
            goto L_0x0047
        L_0x0042:
            r7 = move-exception
            r2 = r3
            goto L_0x005b
        L_0x0045:
            r2 = r3
            goto L_0x0055
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            long r3 = r2.f122253a     // Catch:{ IOException -> 0x0055, all -> 0x0052 }
            r0 = r3
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            return r0
        L_0x0052:
            r7 = move-exception
            goto L_0x005b
        L_0x0054:
            r7 = r2
        L_0x0055:
            if (r7 == 0) goto L_0x0062
            r7.mo96183b()     // Catch:{ IOException -> 0x0061, all -> 0x0052 }
            goto L_0x0062
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r7
        L_0x0061:
        L_0x0062:
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a.mo96148a(java.lang.String, java.lang.String):long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52847n<String, Boolean> mo96165a(String str, InputStream inputStream, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(inputStream, "modelStream");
        return m105165b(str, inputStream, str2, 0, null);
    }

    private C48606a(String str, int i, int i2, long j, C48615b bVar) {
        C52711k.m112240b(str, "cacheDir");
        this.f122206b = str;
        this.f122205a = MessageDigest.getInstance("MD5");
        try {
            this.f122207e = C48608a.m105177a(new File(this.f122206b), i, i2, j, bVar);
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0068 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p2628d.C52847n<java.lang.String, java.lang.Boolean> mo96166a(java.lang.String r7, java.io.InputStream r8, java.lang.String r9, long r10, com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b r12) throws java.lang.RuntimeException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "inputStream"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)     // Catch:{ all -> 0x007f }
            r0 = 0
            r1 = 0
            com.ss.android.ugc.effectmanager.common.b.a.a r2 = r6.f122207e     // Catch:{ IOException -> 0x0061 }
            if (r2 == 0) goto L_0x0016
            com.ss.android.ugc.effectmanager.common.b.a.a$a r2 = r2.mo96171b(r7)     // Catch:{ IOException -> 0x0061 }
            r1 = r2
        L_0x0016:
            if (r1 == 0) goto L_0x0072
            com.ss.android.ugc.effectmanager.common.b.d r2 = new com.ss.android.ugc.effectmanager.common.b.d     // Catch:{ IOException -> 0x0061 }
            java.security.DigestOutputStream r3 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x0061 }
            java.io.OutputStream r4 = r1.mo96181a(r0)     // Catch:{ IOException -> 0x0061 }
            java.security.MessageDigest r5 = r6.f122205a     // Catch:{ IOException -> 0x0061 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0061 }
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ IOException -> 0x0061 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0061 }
            r3 = r2
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ IOException -> 0x0061 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105319a(r8, r3, r10, r12)     // Catch:{ IOException -> 0x0061 }
            r2.close()     // Catch:{ IOException -> 0x0061 }
            java.security.MessageDigest r8 = r6.f122205a     // Catch:{ IOException -> 0x0061 }
            byte[] r8 = r8.digest()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r8 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k.m105343a(r8)     // Catch:{ IOException -> 0x0061 }
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r9)     // Catch:{ IOException -> 0x0061 }
            if (r8 == 0) goto L_0x005d
            r1.mo96182a()     // Catch:{ IOException -> 0x0061 }
            d.n r8 = new d.n     // Catch:{ IOException -> 0x0061 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0061 }
            java.lang.String r10 = r6.f122206b     // Catch:{ IOException -> 0x0061 }
            r9.<init>(r10, r7)     // Catch:{ IOException -> 0x0061 }
            java.lang.String r7 = r9.getAbsolutePath()     // Catch:{ IOException -> 0x0061 }
            r9 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ IOException -> 0x0061 }
            r8.<init>(r7, r9)     // Catch:{ IOException -> 0x0061 }
            monitor-exit(r6)
            return r8
        L_0x005d:
            r1.mo96183b()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0072
        L_0x0061:
            r7 = move-exception
            if (r1 == 0) goto L_0x0072
            r1.mo96183b()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0072
        L_0x0068:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x007f }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x007f }
            r8.<init>(r7)     // Catch:{ all -> 0x007f }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x007f }
            throw r8     // Catch:{ all -> 0x007f }
        L_0x0072:
            d.n r7 = new d.n     // Catch:{ all -> 0x007f }
            java.lang.String r8 = ""
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007f }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x007f }
            monitor-exit(r6)
            return r7
        L_0x007f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a.mo96166a(java.lang.String, java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.common.c.b):d.n");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:65|66|(0)|(0)|72|73) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:(2:38|39)|40|41|(1:43)|44|45|46|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0114 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010c A[SYNTHETIC, Splitter:B:68:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111 A[Catch:{ IOException -> 0x0114 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x0114=Splitter:B:72:0x0114, B:44:0x00c9=Splitter:B:44:0x00c9} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p2628d.C52847n<java.lang.String, java.lang.Boolean> m105165b(java.lang.String r6, java.io.InputStream r7, java.lang.String r8, long r9, com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b r11) throws java.lang.RuntimeException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r9 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r9)     // Catch:{ all -> 0x0115 }
            java.lang.String r9 = "modelStream"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r9)     // Catch:{ all -> 0x0115 }
            r9 = 0
            com.ss.android.ugc.effectmanager.common.b.a.a r10 = r5.f122207e     // Catch:{ Exception -> 0x00fa, all -> 0x00f5 }
            if (r10 == 0) goto L_0x0015
            com.ss.android.ugc.effectmanager.common.b.a.a$a r6 = r10.mo96171b(r6)     // Catch:{ Exception -> 0x00fa, all -> 0x00f5 }
            goto L_0x0016
        L_0x0015:
            r6 = r9
        L_0x0016:
            java.util.zip.ZipInputStream r10 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00f1, all -> 0x00ee }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00f1, all -> 0x00ee }
            r11.<init>(r7)     // Catch:{ Exception -> 0x00f1, all -> 0x00ee }
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch:{ Exception -> 0x00f1, all -> 0x00ee }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00f1, all -> 0x00ee }
            java.util.zip.ZipEntry r7 = r10.getNextEntry()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r11 = "inZip.nextEntry"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r11)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r11 = "szName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r11)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r11 = r7
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r1 = ".."
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r0.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r1 = 2
            r2 = 0
            boolean r11 = p2628d.p2650m.C52830p.m112456b(r11, r0, r2, r1, r9)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            if (r11 != 0) goto L_0x00d4
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r0 = r5.f122206b     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r11.<init>(r0, r7)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            boolean r7 = r11.exists()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            if (r7 == 0) goto L_0x0062
            r11.delete()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            goto L_0x006b
        L_0x0062:
            java.io.File r7 = r11.getParentFile()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            if (r7 == 0) goto L_0x006b
            r7.mkdirs()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
        L_0x006b:
            com.ss.android.ugc.effectmanager.common.b.d r7 = new com.ss.android.ugc.effectmanager.common.b.d     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.security.DigestOutputStream r0 = new java.security.DigestOutputStream     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            if (r6 == 0) goto L_0x0076
            java.io.OutputStream r1 = r6.mo96181a(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            goto L_0x0077
        L_0x0076:
            r1 = r9
        L_0x0077:
            java.security.MessageDigest r3 = r5.f122205a     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.io.OutputStream r0 = (java.io.OutputStream) r0     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r0 = r10
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r1 = r7
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r3 = 0
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105319a(r0, r1, r3, r9)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r7.close()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.security.MessageDigest r7 = r5.f122205a     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            byte[] r7 = r7.digest()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r7 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k.m105343a(r7)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r8)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            if (r7 == 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00a4
            r6.mo96182a()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
        L_0x00a4:
            d.n r7 = new d.n     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r8 = r11.getAbsolutePath()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r9 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r10.close()     // Catch:{ IOException -> 0x00ba }
            if (r6 == 0) goto L_0x00ba
            r6.mo96184c()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            monitor-exit(r5)
            return r7
        L_0x00bc:
            if (r6 == 0) goto L_0x00c1
            r6.mo96183b()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
        L_0x00c1:
            r10.close()     // Catch:{ IOException -> 0x00c9 }
            if (r6 == 0) goto L_0x00c9
            r6.mo96184c()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            d.n r6 = new d.n     // Catch:{ all -> 0x0115 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0115 }
            r6.<init>(r9, r7)     // Catch:{ all -> 0x0115 }
            monitor-exit(r5)
            return r6
        L_0x00d4:
            com.ss.android.ugc.effectmanager.common.d.d r8 = new com.ss.android.ugc.effectmanager.common.d.d     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r11 = "Entry is outside dir"
            r9.<init>(r11)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r9.append(r7)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            r8.<init>(r7)     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
            throw r8     // Catch:{ Exception -> 0x00ec, all -> 0x00ea }
        L_0x00ea:
            r7 = move-exception
            goto L_0x010a
        L_0x00ec:
            r7 = move-exception
            goto L_0x00f3
        L_0x00ee:
            r7 = move-exception
            r10 = r9
            goto L_0x010a
        L_0x00f1:
            r7 = move-exception
            r10 = r9
        L_0x00f3:
            r9 = r6
            goto L_0x00fd
        L_0x00f5:
            r6 = move-exception
            r7 = r6
            r6 = r9
            r10 = r6
            goto L_0x010a
        L_0x00fa:
            r6 = move-exception
            r7 = r6
            r10 = r9
        L_0x00fd:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0107 }
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x0107 }
            r6.<init>(r7)     // Catch:{ all -> 0x0107 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0107 }
            throw r6     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r6 = move-exception
            r7 = r6
            r6 = r9
        L_0x010a:
            if (r10 == 0) goto L_0x010f
            r10.close()     // Catch:{ IOException -> 0x0114 }
        L_0x010f:
            if (r6 == 0) goto L_0x0114
            r6.mo96184c()     // Catch:{ IOException -> 0x0114 }
        L_0x0114:
            throw r7     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.C48606a.m105165b(java.lang.String, java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.common.c.b):d.n");
    }

    public /* synthetic */ C48606a(String str, int i, int i2, long j, C48615b bVar, int i3, C52707g gVar) {
        int i4;
        int i5;
        if ((i3 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        if ((i3 & 16) != 0) {
            bVar = null;
        }
        this(str, i4, i5, j, bVar);
    }
}
