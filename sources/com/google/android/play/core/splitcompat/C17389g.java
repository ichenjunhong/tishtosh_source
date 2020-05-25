package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.play.core.splitcompat.g */
public final class C17389g {

    /* renamed from: a */
    private static final Pattern f48921a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: b */
    private final C17386d f48922b;

    C17389g(C17386d dVar) throws IOException {
        this.f48922b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2 A[SYNTHETIC, Splitter:B:30:0x00a2] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m42605a(com.google.android.play.core.splitcompat.C17400r r8, com.google.android.play.core.splitcompat.C17392j r9) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x009e }
            java.io.File r8 = r8.mo33690a()     // Catch:{ IOException -> 0x009e }
            r1.<init>(r8)     // Catch:{ IOException -> 0x009e }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x009c }
            r8.<init>()     // Catch:{ IOException -> 0x009c }
            java.util.Enumeration r0 = r1.entries()     // Catch:{ IOException -> 0x009c }
        L_0x0013:
            boolean r2 = r0.hasMoreElements()     // Catch:{ IOException -> 0x009c }
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r0.nextElement()     // Catch:{ IOException -> 0x009c }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ IOException -> 0x009c }
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x009c }
            java.util.regex.Pattern r4 = f48921a     // Catch:{ IOException -> 0x009c }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ IOException -> 0x009c }
            boolean r4 = r3.matches()     // Catch:{ IOException -> 0x009c }
            if (r4 == 0) goto L_0x0013
            r4 = 1
            java.lang.String r4 = r3.group(r4)     // Catch:{ IOException -> 0x009c }
            r5 = 2
            java.lang.String r3 = r3.group(r5)     // Catch:{ IOException -> 0x009c }
            java.lang.Object r5 = r8.get(r4)     // Catch:{ IOException -> 0x009c }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x009c }
            if (r5 != 0) goto L_0x0049
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x009c }
            r5.<init>()     // Catch:{ IOException -> 0x009c }
            r8.put(r4, r5)     // Catch:{ IOException -> 0x009c }
        L_0x0049:
            com.google.android.play.core.splitcompat.l r4 = new com.google.android.play.core.splitcompat.l     // Catch:{ IOException -> 0x009c }
            r4.<init>(r2, r3)     // Catch:{ IOException -> 0x009c }
            r5.add(r4)     // Catch:{ IOException -> 0x009c }
            goto L_0x0013
        L_0x0052:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException -> 0x009c }
            r0.<init>()     // Catch:{ IOException -> 0x009c }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x009c }
            int r3 = r2.length     // Catch:{ IOException -> 0x009c }
            r4 = 0
        L_0x005b:
            if (r4 >= r3) goto L_0x008c
            r5 = r2[r4]     // Catch:{ IOException -> 0x009c }
            boolean r6 = r8.containsKey(r5)     // Catch:{ IOException -> 0x009c }
            if (r6 == 0) goto L_0x0089
            java.lang.Object r5 = r8.get(r5)     // Catch:{ IOException -> 0x009c }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x009c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x009c }
        L_0x006f:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x009c }
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x009c }
            com.google.android.play.core.splitcompat.l r6 = (com.google.android.play.core.splitcompat.C17394l) r6     // Catch:{ IOException -> 0x009c }
            java.lang.String r7 = r6.f48930a     // Catch:{ IOException -> 0x009c }
            boolean r7 = r0.containsKey(r7)     // Catch:{ IOException -> 0x009c }
            if (r7 != 0) goto L_0x006f
            java.lang.String r7 = r6.f48930a     // Catch:{ IOException -> 0x009c }
            r0.put(r7, r6)     // Catch:{ IOException -> 0x009c }
            goto L_0x006f
        L_0x0089:
            int r4 = r4 + 1
            goto L_0x005b
        L_0x008c:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ IOException -> 0x009c }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x009c }
            r8.<init>(r0)     // Catch:{ IOException -> 0x009c }
            r9.mo33708a(r1, r8)     // Catch:{ IOException -> 0x009c }
            r1.close()     // Catch:{ IOException -> 0x009c }
            return
        L_0x009c:
            r8 = move-exception
            goto L_0x00a0
        L_0x009e:
            r8 = move-exception
            r1 = r0
        L_0x00a0:
            if (r1 == 0) goto L_0x00aa
            r1.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r9 = move-exception
            com.google.android.play.core.p1051c.C17261ak.m42289a(r8, r9)
        L_0x00aa:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C17389g.m42605a(com.google.android.play.core.splitcompat.r, com.google.android.play.core.splitcompat.j):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33710a(C17400r rVar, Set<C17394l> set, C17395m mVar) throws IOException {
        for (C17394l lVar : set) {
            File a = this.f48922b.mo33696a(rVar.mo33691b(), lVar.f48930a);
            mVar.mo33711a(lVar, a, a.exists() && a.length() == lVar.f48931b.getSize());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<File> mo33709a() throws IOException {
        boolean z;
        Set<C17400r> f = this.f48922b.mo33706f();
        C17386d dVar = this.f48922b;
        ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = dVar.mo33704e().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C17400r) it.next()).mo33691b().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                this.f48922b.mo33700b(str);
            }
        }
        HashSet hashSet = new HashSet();
        for (C17400r rVar : f) {
            HashSet hashSet2 = new HashSet();
            m42605a(rVar, new C17390h(this, hashSet2, rVar));
            for (File file2 : this.f48922b.mo33702c(rVar.mo33691b())) {
                if (!hashSet2.contains(file2)) {
                    this.f48922b.mo33698a(file2);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
