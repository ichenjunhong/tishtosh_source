package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fj */
public final class C16682fj implements C16667ev {

    /* renamed from: a */
    public static final Map<String, C16682fj> f46921a = new HashMap();

    /* renamed from: b */
    final Object f46922b = new Object();

    /* renamed from: c */
    volatile Map<String, ?> f46923c;

    /* renamed from: d */
    final List<Object> f46924d = new ArrayList();

    /* renamed from: e */
    private final SharedPreferences f46925e;

    /* renamed from: f */
    private final OnSharedPreferenceChangeListener f46926f = new C16683fk(this);

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.measurement.fj, java.lang.Object, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [com.google.android.gms.internal.measurement.fj, java.lang.Object, java.lang.String]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Object, java.lang.String, com.google.android.gms.internal.measurement.fj]
      mth insns count: 38
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C16682fj m39846a(android.content.Context r4, java.lang.String r5) {
        /*
            boolean r5 = com.google.android.gms.internal.measurement.C16662eq.m39809a()
            r0 = 1
            r1 = 0
            r2 = 0
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "direct_boot:"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x001f
            boolean r5 = com.google.android.gms.internal.measurement.C16662eq.m39809a()
            if (r5 == 0) goto L_0x001f
            boolean r5 = com.google.android.gms.internal.measurement.C16662eq.m39810a(r4)
            if (r5 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.Class<com.google.android.gms.internal.measurement.fj> r5 = com.google.android.gms.internal.measurement.C16682fj.class
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.fj> r0 = f46921a     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.measurement.fj r0 = (com.google.android.gms.internal.measurement.C16682fj) r0     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.fj r0 = new com.google.android.gms.internal.measurement.fj     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "direct_boot:"
            boolean r3 = r2.startsWith(r3)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x004e
            boolean r3 = com.google.android.gms.internal.measurement.C16662eq.m39809a()     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0043
            android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x005c }
        L_0x0043:
            r3 = 12
            java.lang.String r3 = r2.substring(r3)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r4 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r3, r1)     // Catch:{ all -> 0x005c }
            goto L_0x0052
        L_0x004e:
            android.content.SharedPreferences r4 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r2, r1)     // Catch:{ all -> 0x005c }
        L_0x0052:
            r0.<init>(r4)     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.fj> r4 = f46921a     // Catch:{ all -> 0x005c }
            r4.put(r2, r0)     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            return r0
        L_0x005c:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16682fj.m39846a(android.content.Context, java.lang.String):com.google.android.gms.internal.measurement.fj");
    }

    private C16682fj(SharedPreferences sharedPreferences) {
        this.f46925e = sharedPreferences;
        this.f46925e.registerOnSharedPreferenceChangeListener(this.f46926f);
    }

    /* renamed from: a */
    public final Object mo31976a(String str) {
        Map<String, ?> map = this.f46923c;
        if (map == null) {
            synchronized (this.f46922b) {
                map = this.f46923c;
                if (map == null) {
                    map = this.f46925e.getAll();
                    this.f46923c = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
