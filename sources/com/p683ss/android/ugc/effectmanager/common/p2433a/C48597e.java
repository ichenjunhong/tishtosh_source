package com.p683ss.android.ugc.effectmanager.common.p2433a;

import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.e */
public final class C48597e {

    /* renamed from: a */
    private final File f122170a;

    /* renamed from: b */
    private final File f122171b;

    /* renamed from: c */
    private final File f122172c;

    /* renamed from: d */
    private Writer f122173d;

    /* renamed from: e */
    private int f122174e;

    /* renamed from: f */
    private final LinkedHashMap<String, String> f122175f = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|(1:18)(1:19)|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7.f122174e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r0.mo96197b() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        m105144b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r7.f122173d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r7.f122170a, true), com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0069 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0091=Splitter:B:22:0x0091, B:9:0x0036=Splitter:B:9:0x0036} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105141a() throws java.io.IOException {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.common.b.a.c r0 = new com.ss.android.ugc.effectmanager.common.b.a.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r7.f122170a
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo96196a()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r0.mo96196a()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r0.mo96196a()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = "id.to.effectid"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0091
            r1 = 0
            r2 = 0
        L_0x0036:
            java.lang.String r3 = r0.mo96196a()     // Catch:{ EOFException -> 0x0069 }
            r4 = 32
            int r4 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x0069 }
            r5 = -1
            if (r4 == r5) goto L_0x0055
            java.lang.String r5 = r3.substring(r1, r4)     // Catch:{ EOFException -> 0x0069 }
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x0069 }
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r7.f122175f     // Catch:{ EOFException -> 0x0069 }
            r4.put(r5, r3)     // Catch:{ EOFException -> 0x0069 }
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0055:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0069 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0069 }
            java.lang.String r5 = "unexpected Map line: "
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0069 }
            r4.append(r3)     // Catch:{ EOFException -> 0x0069 }
            java.lang.String r3 = r4.toString()     // Catch:{ EOFException -> 0x0069 }
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0069 }
            throw r1     // Catch:{ EOFException -> 0x0069 }
        L_0x0069:
            r7.f122174e = r2     // Catch:{ all -> 0x00ba }
            boolean r1 = r0.mo96197b()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0075
            r7.m105144b()     // Catch:{ all -> 0x00ba }
            goto L_0x008d
        L_0x0075:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r7.f122170a     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r1.<init>(r2)     // Catch:{ all -> 0x00ba }
            r7.f122173d = r1     // Catch:{ all -> 0x00ba }
        L_0x008d:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105323a(r0)
            return
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = "unexpected Map header: ["
            r5.<init>(r6)     // Catch:{ all -> 0x00ba }
            r5.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x00ba }
            r5.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x00ba }
            r5.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "]"
            r5.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r1)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105323a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2433a.C48597e.m105141a():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private synchronized void m105144b() throws IOException {
        if (this.f122173d != null) {
            this.f122173d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f122171b), C48671i.m105322a()));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.f122174e = 0;
            for (Entry entry : this.f122175f.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append(' ');
                sb.append((String) entry.getValue());
                sb.append(10);
                bufferedWriter.write(sb.toString());
                this.f122174e++;
            }
            bufferedWriter.close();
            if (this.f122170a.exists()) {
                m105143a(this.f122170a, this.f122172c, true);
            }
            m105143a(this.f122171b, this.f122170a, false);
            this.f122172c.delete();
            this.f122173d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f122170a, true), C48671i.m105322a()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo96156a(String str) {
        return (String) this.f122175f.get(str);
    }

    /* renamed from: a */
    private static void m105142a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public C48597e(File file) {
        this.f122170a = new File(file, "effectidmap");
        this.f122171b = new File(file, "effectidmap.tmp");
        this.f122172c = new File(file, "effectidmap.bak");
        try {
            if (this.f122172c.exists()) {
                if (this.f122170a.exists()) {
                    this.f122172c.delete();
                } else {
                    m105143a(this.f122172c, this.f122170a, false);
                }
            }
            if (this.f122170a.exists()) {
                m105141a();
            } else {
                m105144b();
            }
        } catch (IOException e) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("EffectIdMapFile ");
            sb.append(file);
            sb.append(" is corrupt: ");
            sb.append(e.getMessage());
            sb.append(", removing");
            printStream.println(sb.toString());
            this.f122170a.delete();
        }
    }

    /* renamed from: a */
    public final void mo96157a(String str, String str2) {
        if (!this.f122175f.containsKey(str)) {
            this.f122175f.put(str, str2);
            try {
                if (this.f122173d != null) {
                    if (!this.f122170a.exists()) {
                        m105144b();
                    }
                    Writer writer = this.f122173d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(' ');
                    sb.append(str2);
                    sb.append(10);
                    writer.write(sb.toString());
                    this.f122173d.flush();
                    return;
                }
                throw new IllegalStateException("map file is closed");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m105143a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m105142a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
