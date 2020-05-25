package com.p683ss.android.agilelogger;

import com.p683ss.android.agilelogger.C18778a.C18779a;
import com.p683ss.android.agilelogger.p1134d.C18807a;
import com.p683ss.android.agilelogger.p1134d.C18809b;
import com.p683ss.android.agilelogger.p1134d.C18810c;
import com.p683ss.android.agilelogger.p1135e.C18812a;
import com.p683ss.android.agilelogger.p1136f.C18828i;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.agilelogger.c */
public final class C18802c extends Thread {

    /* renamed from: a */
    public volatile C18783b f51949a;

    /* renamed from: b */
    public volatile C18812a f51950b;

    /* renamed from: c */
    public ConcurrentLinkedQueue<C18816f> f51951c;

    /* renamed from: d */
    private final Object f51952d = new Object();

    /* renamed from: e */
    private volatile boolean f51953e = true;

    /* renamed from: f */
    private volatile boolean f51954f;

    /* renamed from: g */
    private volatile Set<String> f51955g = null;

    /* renamed from: h */
    private C18779a f51956h;

    /* renamed from: a */
    public final void mo38396a() {
        if (!this.f51954f) {
            synchronized (this.f51952d) {
                this.f51952d.notify();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:108|109) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r9.f51954f = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0245 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            super.run()
        L_0x0003:
            boolean r0 = r9.f51953e
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r9.f51952d
            monitor-enter(r0)
            r1 = 1
            r9.f51954f = r1     // Catch:{ all -> 0x024a }
            r2 = 0
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.android.agilelogger.f> r3 = r9.f51951c     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r3 = r3.poll()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.f r3 = (com.p683ss.android.agilelogger.C18816f) r3     // Catch:{ InterruptedException -> 0x0245 }
            if (r3 != 0) goto L_0x0023
            r9.f51954f = r2     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r3 = r9.f51952d     // Catch:{ InterruptedException -> 0x0245 }
            r3.wait()     // Catch:{ InterruptedException -> 0x0245 }
            r9.f51954f = r1     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0247
        L_0x0023:
            int r1 = r3.f51985a     // Catch:{ InterruptedException -> 0x0245 }
            switch(r1) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x003f;
                case 2: goto L_0x0034;
                case 3: goto L_0x002f;
                case 4: goto L_0x002a;
                default: goto L_0x0028;
            }     // Catch:{ InterruptedException -> 0x0245 }
        L_0x0028:
            goto L_0x0241
        L_0x002a:
            r9.m45873b(r3)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0241
        L_0x002f:
            r9.m45872a(r3)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0241
        L_0x0034:
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x0241
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            r1.mo38407a()     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0241
        L_0x003f:
            boolean r1 = r3 instanceof com.p683ss.android.agilelogger.C18816f     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x0241
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x0241
            java.lang.String r1 = ""
            int[] r4 = com.p683ss.android.agilelogger.C18802c.C188031.f51957a     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.f.a$a r5 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            int r5 = r5.ordinal()     // Catch:{ InterruptedException -> 0x0245 }
            r4 = r4[r5]     // Catch:{ InterruptedException -> 0x0245 }
            switch(r4) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009d;
                case 4: goto L_0x0092;
                case 5: goto L_0x0087;
                case 6: goto L_0x007c;
                case 7: goto L_0x0071;
                case 8: goto L_0x0066;
                case 9: goto L_0x0058;
                default: goto L_0x0056;
            }     // Catch:{ InterruptedException -> 0x0245 }
        L_0x0056:
            goto L_0x00d3
        L_0x0058:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45903a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x0066:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Thread r4 = (java.lang.Thread) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45901a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x0071:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45902a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x007c:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45898a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x0087:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45899a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x0092:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45900a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x009d:
            com.ss.android.agilelogger.f.a$a r1 = r3.f51991g     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18817a.m45900a(r1, r4)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x00a8:
            java.lang.Object r1 = r3.f51993i     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 != 0) goto L_0x00b5
            java.lang.Object r1 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18829j.m45923a(r1)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0245 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51993i     // Catch:{ InterruptedException -> 0x0245 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Object r4 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r4 = com.p683ss.android.agilelogger.p1136f.C18829j.m45923a(r4)     // Catch:{ InterruptedException -> 0x0245 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00d3
        L_0x00cf:
            java.lang.Object r1 = r3.f51992h     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException -> 0x0245 }
        L_0x00d3:
            r3.f51988d = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            r1.mo38408a(r3)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0241
        L_0x00dc:
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r1.f51931c     // Catch:{ InterruptedException -> 0x0245 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x010f
            com.ss.android.agilelogger.c r1 = com.p683ss.android.agilelogger.C18778a.f51918e     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x010a
            com.ss.android.agilelogger.c r1 = com.p683ss.android.agilelogger.C18778a.f51918e     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.e.a r1 = r1.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x010a
            java.util.List<com.ss.android.agilelogger.d.c> r4 = r1.f51976a     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x010a
            java.util.List<com.ss.android.agilelogger.d.c> r1 = r1.f51976a     // Catch:{ InterruptedException -> 0x0245 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x0245 }
        L_0x00fa:
            boolean r4 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x010a
            java.lang.Object r4 = r1.next()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.d.c r4 = (com.p683ss.android.agilelogger.p1134d.C18810c) r4     // Catch:{ InterruptedException -> 0x0245 }
            r4.mo38402b()     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x00fa
        L_0x010a:
            r1 = 0
            com.p683ss.android.agilelogger.C18778a.f51918e = r1     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0241
        L_0x010f:
            android.content.Context r1 = com.p683ss.android.agilelogger.C18778a.m45838a()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.d.a$a r4 = new com.ss.android.agilelogger.d.a$a     // Catch:{ InterruptedException -> 0x0245 }
            r4.<init>(r1)     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r5 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r5 = r5.f51932d     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51964c = r5     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r5 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            int r5 = r5.f51935g     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51966e = r5     // Catch:{ InterruptedException -> 0x0245 }
            java.io.File r5 = new java.io.File     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r6 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r6 = r6.f51931c     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r8 = ".logCache_"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = com.p683ss.android.agilelogger.p1136f.C18826g.m45919a(r1)     // Catch:{ InterruptedException -> 0x0245 }
            r7.append(r1)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r7.toString()     // Catch:{ InterruptedException -> 0x0245 }
            r5.<init>(r6, r1)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51963b = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            boolean r1 = r1.f51933e     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51968g = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            boolean r1 = r1.f51934f     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51969h = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            int r1 = r1.f51936h     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51965d = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            int r1 = r1.f51937i     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 > 0) goto L_0x015e
            r1 = 3
        L_0x015e:
            r4.f51970i = r1     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.b r1 = r9.f51949a     // Catch:{ InterruptedException -> 0x0245 }
            int r1 = r1.f51929a     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 >= 0) goto L_0x0168
            int r1 = com.p683ss.android.agilelogger.p1124a.C18782a.f51928c     // Catch:{ InterruptedException -> 0x0245 }
        L_0x0168:
            r4.f51971j = r1     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r4.f51964c     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x0239
            java.lang.String r1 = r4.f51963b     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 != 0) goto L_0x01b3
            android.content.Context r1 = r4.f51962a     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r5 = android.os.Environment.getExternalStorageState()     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r6 = "mounted"
            boolean r5 = r5.equals(r6)     // Catch:{ InterruptedException -> 0x0245 }
            if (r5 == 0) goto L_0x018f
            java.lang.String r5 = "alog"
            java.io.File r5 = r1.getExternalFilesDir(r5)     // Catch:{ InterruptedException -> 0x0245 }
            if (r5 == 0) goto L_0x018f
            java.lang.String r5 = "alog"
            java.io.File r1 = r1.getExternalFilesDir(r5)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x019b
        L_0x018f:
            java.io.File r5 = new java.io.File     // Catch:{ InterruptedException -> 0x0245 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r6 = "alog"
            r5.<init>(r1, r6)     // Catch:{ InterruptedException -> 0x0245 }
            r1 = r5
        L_0x019b:
            if (r1 == 0) goto L_0x01a6
            boolean r5 = r1.exists()     // Catch:{ InterruptedException -> 0x0245 }
            if (r5 != 0) goto L_0x01a6
            r1.mkdirs()     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01a6:
            java.io.File r5 = new java.io.File     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r6 = ".alog"
            r5.<init>(r1, r6)     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r1 = r5.getAbsolutePath()     // Catch:{ InterruptedException -> 0x0245 }
            r4.f51963b = r1     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01b3:
            int r1 = r4.f51965d     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 != 0) goto L_0x01bb
            r1 = 10240(0x2800, float:1.4349E-41)
            r4.f51965d = r1     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01bb:
            com.ss.android.agilelogger.d.a r1 = new com.ss.android.agilelogger.d.a     // Catch:{ InterruptedException -> 0x0245 }
            r1.<init>(r4)     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.e.a$a r4 = new com.ss.android.agilelogger.e.a$a     // Catch:{ InterruptedException -> 0x0245 }
            r4.<init>()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.e.a r5 = r4.f51978a     // Catch:{ InterruptedException -> 0x0245 }
            java.util.List<com.ss.android.agilelogger.d.c> r6 = r5.f51976a     // Catch:{ InterruptedException -> 0x0245 }
            if (r6 == 0) goto L_0x01d0
            java.util.List<com.ss.android.agilelogger.d.c> r5 = r5.f51976a     // Catch:{ InterruptedException -> 0x0245 }
            r5.add(r1)     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01d0:
            com.ss.android.agilelogger.e.a r4 = r4.f51978a     // Catch:{ InterruptedException -> 0x0245 }
            r9.f51950b = r4     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.a$a r4 = r9.f51956h     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x01e4
            com.ss.android.agilelogger.AgileDelegate r4 = r1.f51959a     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x01e2
            com.ss.android.agilelogger.AgileDelegate r1 = r1.f51959a     // Catch:{ InterruptedException -> 0x0245 }
            r1.mo38384a()     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x01e4
        L_0x01e2:
            com.ss.android.agilelogger.a$b r1 = com.p683ss.android.agilelogger.C18778a.C18780b.NOT_INIT     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01e4:
            java.util.Set<java.lang.String> r1 = r9.f51955g     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x01f4
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            java.util.Set<java.lang.String> r4 = r9.f51955g     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x01f4
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r4)     // Catch:{ InterruptedException -> 0x0245 }
            r1.f51977b = r4     // Catch:{ InterruptedException -> 0x0245 }
        L_0x01f4:
            java.util.List r1 = com.p683ss.android.agilelogger.C18778a.m45847b()     // Catch:{ InterruptedException -> 0x0245 }
            int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0245 }
            if (r1 == 0) goto L_0x0241
            com.ss.android.agilelogger.e.a r1 = r9.f51950b     // Catch:{ InterruptedException -> 0x0245 }
            java.util.List<com.ss.android.agilelogger.d.c> r1 = r1.f51976a     // Catch:{ InterruptedException -> 0x0245 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x0245 }
        L_0x0206:
            boolean r4 = r1.hasNext()     // Catch:{ InterruptedException -> 0x0245 }
            if (r4 == 0) goto L_0x0241
            java.lang.Object r4 = r1.next()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.d.c r4 = (com.p683ss.android.agilelogger.p1134d.C18810c) r4     // Catch:{ InterruptedException -> 0x0245 }
            boolean r5 = r4 instanceof com.p683ss.android.agilelogger.p1134d.C18807a     // Catch:{ InterruptedException -> 0x0245 }
            if (r5 == 0) goto L_0x0206
            java.util.List r5 = com.p683ss.android.agilelogger.C18778a.m45847b()     // Catch:{ InterruptedException -> 0x0245 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ InterruptedException -> 0x0245 }
        L_0x021e:
            boolean r6 = r5.hasNext()     // Catch:{ InterruptedException -> 0x0245 }
            if (r6 == 0) goto L_0x0206
            java.lang.Object r6 = r5.next()     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.e r6 = (com.p683ss.android.agilelogger.C18811e) r6     // Catch:{ InterruptedException -> 0x0245 }
            if (r6 == 0) goto L_0x021e
            r7 = r4
            com.ss.android.agilelogger.d.a r7 = (com.p683ss.android.agilelogger.p1134d.C18807a) r7     // Catch:{ InterruptedException -> 0x0245 }
            com.ss.android.agilelogger.AgileDelegate r7 = r7.f51959a     // Catch:{ InterruptedException -> 0x0245 }
            long r7 = r7.getAlogFuncAddr()     // Catch:{ InterruptedException -> 0x0245 }
            r6.mo38406a(r7)     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x021e
        L_0x0239:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ InterruptedException -> 0x0245 }
            java.lang.String r3 = "log path cannot be null!"
            r1.<init>(r3)     // Catch:{ InterruptedException -> 0x0245 }
            throw r1     // Catch:{ InterruptedException -> 0x0245 }
        L_0x0241:
            r3.mo38409b()     // Catch:{ InterruptedException -> 0x0245 }
            goto L_0x0247
        L_0x0245:
            r9.f51954f = r2     // Catch:{ all -> 0x024a }
        L_0x0247:
            monitor-exit(r0)     // Catch:{ all -> 0x024a }
            goto L_0x0003
        L_0x024a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x024a }
            throw r1
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.agilelogger.C18802c.run():void");
    }

    /* renamed from: a */
    private void m45872a(C18816f fVar) {
        if (this.f51949a != null) {
            this.f51949a.f51935g = ((Integer) fVar.f51992h).intValue();
        }
        if (this.f51950b != null) {
            List<C18810c> list = this.f51950b.f51976a;
            if (list != null) {
                for (C18810c cVar : list) {
                    if (cVar instanceof C18809b) {
                        ((C18809b) cVar).mo38403a(((Integer) fVar.f51992h).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m45873b(C18816f fVar) {
        C18828i.f52007a = 0;
        List<C18810c> list = this.f51950b.f51976a;
        if (list != null) {
            for (C18810c cVar : list) {
                if (cVar instanceof C18807a) {
                    AgileDelegate agileDelegate = ((C18807a) cVar).f51959a;
                    if (agileDelegate.f51913a != 0) {
                        agileDelegate.changeLogPath(agileDelegate.f51913a, false);
                    }
                }
            }
        }
    }

    public C18802c(String str, C18783b bVar, C18779a aVar) {
        super(str);
        this.f51949a = bVar;
        this.f51951c = new ConcurrentLinkedQueue<>();
        C18816f fVar = new C18816f();
        fVar.f51985a = 0;
        this.f51951c.add(fVar);
        this.f51956h = aVar;
    }
}
