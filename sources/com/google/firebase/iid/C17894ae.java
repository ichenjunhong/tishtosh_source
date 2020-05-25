package com.google.firebase.iid;

import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.ae */
final class C17894ae {

    /* renamed from: a */
    private int f49724a;

    /* renamed from: b */
    private final Map<Integer, C15180h<Void>> f49725b = new C0777a();

    /* renamed from: c */
    private final C17942z f49726c;

    C17894ae(C17942z zVar) {
        this.f49726c = zVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C15179g<Void> mo34734a(String str) {
        String a;
        C15180h hVar;
        int i;
        synchronized (this.f49726c) {
            a = this.f49726c.mo34793a();
            C17942z zVar = this.f49726c;
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(str).length());
            sb.append(a);
            sb.append(",");
            sb.append(str);
            zVar.mo34794a(sb.toString());
        }
        hVar = new C15180h();
        Map<Integer, C15180h<Void>> map = this.f49725b;
        if (TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = a.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.f49724a + i), hVar);
        return hVar.f39202a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo34735a() {
        return m43875b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = (com.google.android.gms.p1033b.C15180h) r4.f49725b.remove(java.lang.Integer.valueOf(r4.f49724a));
        m43876b(r0);
        r4.f49724a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r2.mo28005a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (m43874a(r5, r0) != false) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34736a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m43875b()     // Catch:{ all -> 0x0038 }
            r1 = 1
            if (r0 != 0) goto L_0x000d
            com.google.firebase.iid.FirebaseInstanceId.m43846f()     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            return r1
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            boolean r2 = m43874a(r5, r0)
            if (r2 != 0) goto L_0x0016
            r5 = 0
            return r5
        L_0x0016:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.b.h<java.lang.Void>> r2 = r4.f49725b     // Catch:{ all -> 0x0035 }
            int r3 = r4.f49724a     // Catch:{ all -> 0x0035 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0035 }
            com.google.android.gms.b.h r2 = (com.google.android.gms.p1033b.C15180h) r2     // Catch:{ all -> 0x0035 }
            r4.m43876b(r0)     // Catch:{ all -> 0x0035 }
            int r0 = r4.f49724a     // Catch:{ all -> 0x0035 }
            int r0 = r0 + r1
            r4.f49724a = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo28005a(r0)
            goto L_0x0000
        L_0x0035:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r5
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17894ae.mo34736a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    /* renamed from: b */
    private final String m43875b() {
        String a;
        synchronized (this.f49726c) {
            a = this.f49726c.mo34793a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* renamed from: b */
    private final synchronized boolean m43876b(String str) {
        synchronized (this.f49726c) {
            String a = this.f49726c.mo34793a();
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (!a.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                return false;
            }
            String valueOf3 = String.valueOf(",");
            String valueOf4 = String.valueOf(str);
            this.f49726c.mo34794a(a.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length()));
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m43874a(FirebaseInstanceId firebaseInstanceId, String str) {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        C17890aa e = firebaseInstanceId.mo34721e();
                        if (e != null && !e.mo34729b(firebaseInstanceId.f49700d.mo34783b())) {
                            firebaseInstanceId.mo34716a(firebaseInstanceId.f49701e.mo34751a(FirebaseInstanceId.m43845d(), e.f49715a, str3));
                            boolean f = FirebaseInstanceId.m43846f();
                            break;
                        } else {
                            throw new IOException("token not available");
                        }
                    case 1:
                        C17890aa e2 = firebaseInstanceId.mo34721e();
                        if (e2 != null && !e2.mo34729b(firebaseInstanceId.f49700d.mo34783b())) {
                            firebaseInstanceId.mo34716a(firebaseInstanceId.f49701e.mo34754b(FirebaseInstanceId.m43845d(), e2.f49715a, str3));
                            FirebaseInstanceId.m43846f();
                            break;
                        } else {
                            throw new IOException("token not available");
                        }
                }
            } catch (IOException e3) {
                String str4 = "Topic sync failed: ";
                String valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() != 0) {
                    str4.concat(valueOf);
                } else {
                    new String(str4);
                }
                return false;
            }
        }
        return true;
    }
}
