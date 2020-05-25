package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.C2240a;
import com.google.android.play.core.p1051c.C17253ac;
import com.google.android.play.core.p1051c.C17278b;
import com.google.android.play.core.p1051c.C17291d;
import com.google.android.play.core.p1051c.C17295h;
import com.google.android.play.core.p1053e.C17356u;
import com.google.android.play.core.p1053e.C17358w;
import com.google.android.play.core.p1053e.C17359x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitcompat.a */
public final class C17383a {

    /* renamed from: a */
    private static final AtomicReference<C17383a> f48908a = new AtomicReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17386d f48909b;

    /* renamed from: c */
    private final Set<String> f48910c = new HashSet();

    private C17383a(Context context) {
        try {
            this.f48909b = new C17386d(context);
        } catch (NameNotFoundException | IOException e) {
            throw new C17278b("Failed to initialize FileStorage", e);
        }
    }

    /* renamed from: a */
    private static void m42569a(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File path : set) {
            ((Integer) C17253ac.m42255a((Object) assets, "addAssetPath", Integer.class, String.class, path.getPath())).intValue();
        }
    }

    /* renamed from: a */
    public static boolean m42570a(Context context) {
        return m42571a(context, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC, Splitter:B:15:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m42572a(com.google.android.play.core.splitcompat.C17400r r2) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x001c }
            java.io.File r2 = r2.mo33690a()     // Catch:{ IOException -> 0x001c }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001c }
            java.lang.String r2 = "classes.dex"
            java.util.zip.ZipEntry r2 = r1.getEntry(r2)     // Catch:{ IOException -> 0x0019 }
            if (r2 == 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r1.close()     // Catch:{ IOException -> 0x0019 }
            return r2
        L_0x0019:
            r2 = move-exception
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r2 = move-exception
        L_0x001d:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            com.google.android.play.core.p1051c.C17261ak.m42289a(r2, r0)
        L_0x0027:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C17383a.m42572a(com.google.android.play.core.splitcompat.r):boolean");
    }

    /* renamed from: b */
    private static List<String> m42573b(Context context) throws IOException {
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
        } catch (NameNotFoundException e) {
            throw new IOException(C2240a.m6772a("Cannot load data for application '%s'", new Object[]{packageName}), e);
        }
    }

    /* renamed from: b */
    public static boolean m42575b() {
        return f48908a.get() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Set<String> mo33684a() {
        return new HashSet(this.f48910c);
    }

    /* renamed from: a */
    public static boolean m42571a(Context context, boolean z) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        boolean compareAndSet = f48908a.compareAndSet(null, new C17383a(context));
        C17383a aVar = (C17383a) f48908a.get();
        if (compareAndSet) {
            C17291d dVar = new C17291d(context, C17384b.m42579a(), new C17253ac(context, aVar.f48909b, new C17295h()), aVar.f48909b, new C17359x());
            C17356u.m42512a(dVar);
            C17358w.f48872a.compareAndSet(null, new C17396n(aVar));
            C17384b.m42579a().execute(new C17398p(context));
        }
        try {
            aVar.m42574b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0179 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b9 A[Catch:{ all -> 0x0009 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m42574b(android.content.Context r14, boolean r15) throws java.io.IOException {
        /*
            r13 = this;
            monitor-enter(r13)
            if (r15 == 0) goto L_0x000c
            com.google.android.play.core.splitcompat.d r0 = r13.f48909b     // Catch:{ all -> 0x0009 }
            r0.mo33697a()     // Catch:{ all -> 0x0009 }
            goto L_0x0018
        L_0x0009:
            r14 = move-exception
            goto L_0x01f2
        L_0x000c:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.C17384b.m42579a()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.o r1 = new com.google.android.play.core.splitcompat.o     // Catch:{ all -> 0x0009 }
            r1.<init>(r13)     // Catch:{ all -> 0x0009 }
            r0.execute(r1)     // Catch:{ all -> 0x0009 }
        L_0x0018:
            java.util.List r0 = m42573b(r14)     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.d r1 = r13.f48909b     // Catch:{ all -> 0x0009 }
            java.util.Set r1 = r1.mo33706f()     // Catch:{ all -> 0x0009 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x002b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r4 = (com.google.android.play.core.splitcompat.C17400r) r4     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r4.mo33691b()     // Catch:{ all -> 0x0009 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x002b
            if (r15 == 0) goto L_0x0049
            com.google.android.play.core.splitcompat.d r5 = r13.f48909b     // Catch:{ all -> 0x0009 }
            r5.mo33705e(r4)     // Catch:{ all -> 0x0009 }
            goto L_0x004c
        L_0x0049:
            r2.add(r4)     // Catch:{ all -> 0x0009 }
        L_0x004c:
            r3.remove()     // Catch:{ all -> 0x0009 }
            goto L_0x002b
        L_0x0050:
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0009 }
            if (r3 != 0) goto L_0x0062
            java.util.concurrent.Executor r3 = com.google.android.play.core.splitcompat.C17384b.m42579a()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r4 = new com.google.android.play.core.splitcompat.q     // Catch:{ all -> 0x0009 }
            r4.<init>(r13, r2)     // Catch:{ all -> 0x0009 }
            r3.execute(r4)     // Catch:{ all -> 0x0009 }
        L_0x0062:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x006b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r4 = (com.google.android.play.core.splitcompat.C17400r) r4     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r4.mo33691b()     // Catch:{ all -> 0x0009 }
            boolean r5 = com.google.android.play.core.p1053e.C17361z.m42518a(r4)     // Catch:{ all -> 0x0009 }
            if (r5 != 0) goto L_0x006b
            r2.add(r4)     // Catch:{ all -> 0x0009 }
            goto L_0x006b
        L_0x0085:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0089:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0009 }
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0009 }
            boolean r4 = com.google.android.play.core.p1053e.C17361z.m42518a(r3)     // Catch:{ all -> 0x0009 }
            if (r4 != 0) goto L_0x0089
            r2.add(r3)     // Catch:{ all -> 0x0009 }
            goto L_0x0089
        L_0x009f:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            int r3 = r1.size()     // Catch:{ all -> 0x0009 }
            r0.<init>(r3)     // Catch:{ all -> 0x0009 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x00ac:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0009 }
            r4 = 0
            if (r3 == 0) goto L_0x00e7
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r3 = (com.google.android.play.core.splitcompat.C17400r) r3     // Catch:{ all -> 0x0009 }
            java.lang.String r5 = r3.mo33691b()     // Catch:{ all -> 0x0009 }
            java.lang.String r6 = "config."
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x0009 }
            if (r5 != 0) goto L_0x00e3
            java.lang.String r5 = r3.mo33691b()     // Catch:{ all -> 0x0009 }
            java.lang.String r6 = "config."
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x00d4
            java.lang.String r4 = ""
            goto L_0x00dd
        L_0x00d4:
            java.lang.String r6 = "\\.config\\."
            r7 = 2
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ all -> 0x0009 }
            r4 = r5[r4]     // Catch:{ all -> 0x0009 }
        L_0x00dd:
            boolean r4 = r2.contains(r4)     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x00ac
        L_0x00e3:
            r0.add(r3)     // Catch:{ all -> 0x0009 }
            goto L_0x00ac
        L_0x00e7:
            com.google.android.play.core.splitcompat.g r1 = new com.google.android.play.core.splitcompat.g     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.d r2 = r13.f48909b     // Catch:{ all -> 0x0009 }
            r1.<init>(r2)     // Catch:{ all -> 0x0009 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0009 }
            r3 = 21
            if (r2 < r3) goto L_0x01ea
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0009 }
            switch(r2) {
                case 21: goto L_0x0122;
                case 22: goto L_0x011c;
                case 23: goto L_0x0116;
                case 24: goto L_0x0110;
                case 25: goto L_0x010a;
                case 26: goto L_0x0104;
                case 27: goto L_0x00fa;
                default: goto L_0x00f9;
            }     // Catch:{ all -> 0x0009 }
        L_0x00f9:
            goto L_0x0128
        L_0x00fa:
            int r2 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ all -> 0x0009 }
            if (r2 != 0) goto L_0x0128
            com.google.android.play.core.c.x r2 = new com.google.android.play.core.c.x     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x0104:
            com.google.android.play.core.c.s r2 = new com.google.android.play.core.c.s     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x010a:
            com.google.android.play.core.c.t r2 = new com.google.android.play.core.c.t     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x0110:
            com.google.android.play.core.c.q r2 = new com.google.android.play.core.c.q     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x0116:
            com.google.android.play.core.c.m r2 = new com.google.android.play.core.c.m     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x011c:
            com.google.android.play.core.c.n r2 = new com.google.android.play.core.c.n     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x0122:
            com.google.android.play.core.c.g r2 = new com.google.android.play.core.c.g     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            goto L_0x012d
        L_0x0128:
            com.google.android.play.core.c.w r2 = new com.google.android.play.core.c.w     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
        L_0x012d:
            java.lang.ClassLoader r3 = r14.getClassLoader()     // Catch:{ all -> 0x0009 }
            r5 = 1
            if (r15 == 0) goto L_0x013c
            java.util.Set r1 = r1.mo33709a()     // Catch:{ all -> 0x0009 }
            r2.mo33594a(r3, r1)     // Catch:{ all -> 0x0009 }
            goto L_0x0170
        L_0x013c:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0140:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0009 }
            if (r7 == 0) goto L_0x0170
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r7 = (com.google.android.play.core.splitcompat.C17400r) r7     // Catch:{ all -> 0x0009 }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0009 }
            r8.<init>(r5)     // Catch:{ all -> 0x0009 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r9.<init>()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.f r10 = new com.google.android.play.core.splitcompat.f     // Catch:{ all -> 0x0009 }
            r10.<init>(r1, r7, r9, r8)     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.C17389g.m42605a(r7, r10)     // Catch:{ all -> 0x0009 }
            boolean r7 = r8.get()     // Catch:{ all -> 0x0009 }
            if (r7 == 0) goto L_0x0165
            goto L_0x0166
        L_0x0165:
            r9 = 0
        L_0x0166:
            if (r9 != 0) goto L_0x016c
            r6.remove()     // Catch:{ all -> 0x0009 }
            goto L_0x0140
        L_0x016c:
            r2.mo33594a(r3, r9)     // Catch:{ all -> 0x0009 }
            goto L_0x0140
        L_0x0170:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r1.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0179:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0009 }
            if (r7 == 0) goto L_0x01c1
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r7 = (com.google.android.play.core.splitcompat.C17400r) r7     // Catch:{ all -> 0x0009 }
            boolean r8 = m42572a(r7)     // Catch:{ all -> 0x0009 }
            if (r8 == 0) goto L_0x01b6
            com.google.android.play.core.splitcompat.d r8 = r13.f48909b     // Catch:{ all -> 0x0009 }
            java.lang.String r9 = r7.mo33691b()     // Catch:{ all -> 0x0009 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0009 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0009 }
            java.io.File r8 = r8.mo33703d()     // Catch:{ all -> 0x0009 }
            java.lang.String r12 = "dex"
            r11.<init>(r8, r12)     // Catch:{ all -> 0x0009 }
            java.io.File r8 = com.google.android.play.core.splitcompat.C17386d.m42587b(r11)     // Catch:{ all -> 0x0009 }
            r10.<init>(r8, r9)     // Catch:{ all -> 0x0009 }
            java.io.File r8 = com.google.android.play.core.splitcompat.C17386d.m42587b(r10)     // Catch:{ all -> 0x0009 }
            java.io.File r9 = r7.mo33690a()     // Catch:{ all -> 0x0009 }
            boolean r8 = r2.mo33595a(r3, r8, r9, r15)     // Catch:{ all -> 0x0009 }
            if (r8 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r8 = 0
            goto L_0x01b7
        L_0x01b6:
            r8 = 1
        L_0x01b7:
            if (r8 == 0) goto L_0x0179
            java.io.File r7 = r7.mo33690a()     // Catch:{ all -> 0x0009 }
            r1.add(r7)     // Catch:{ all -> 0x0009 }
            goto L_0x0179
        L_0x01c1:
            m42569a(r14, r1)     // Catch:{ all -> 0x0009 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x01c8:
            boolean r15 = r14.hasNext()     // Catch:{ all -> 0x0009 }
            if (r15 == 0) goto L_0x01e8
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.r r15 = (com.google.android.play.core.splitcompat.C17400r) r15     // Catch:{ all -> 0x0009 }
            java.io.File r0 = r15.mo33690a()     // Catch:{ all -> 0x0009 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x01c8
            java.util.Set<java.lang.String> r0 = r13.f48910c     // Catch:{ all -> 0x0009 }
            java.lang.String r15 = r15.mo33691b()     // Catch:{ all -> 0x0009 }
            r0.add(r15)     // Catch:{ all -> 0x0009 }
            goto L_0x01c8
        L_0x01e8:
            monitor-exit(r13)
            return
        L_0x01ea:
            java.lang.AssertionError r14 = new java.lang.AssertionError     // Catch:{ all -> 0x0009 }
            java.lang.String r15 = "Unsupported Android Version"
            r14.<init>(r15)     // Catch:{ all -> 0x0009 }
            throw r14     // Catch:{ all -> 0x0009 }
        L_0x01f2:
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C17383a.m42574b(android.content.Context, boolean):void");
    }
}
