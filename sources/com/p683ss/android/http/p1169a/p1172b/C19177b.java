package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19175b;
import com.p683ss.android.http.p1169a.C19186d;
import com.p683ss.android.http.p1169a.p1174d.C19188b;
import com.p683ss.android.http.p1169a.p1174d.C19190d;

/* renamed from: com.ss.android.http.a.b.b */
public final class C19177b implements C19175b, Cloneable {

    /* renamed from: a */
    private final String f52870a;

    /* renamed from: b */
    private final String f52871b;

    /* renamed from: c */
    private final C19186d[] f52872c;

    /* renamed from: a */
    public final String mo39120a() {
        return this.f52870a;
    }

    /* renamed from: b */
    public final String mo39121b() {
        return this.f52871b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: c */
    public final C19186d[] mo39122c() {
        return (C19186d[]) this.f52872c.clone();
    }

    public final int hashCode() {
        int a = C19190d.m46779a(C19190d.m46779a(17, (Object) this.f52870a), (Object) this.f52871b);
        for (C19186d a2 : this.f52872c) {
            a = C19190d.m46779a(a, (Object) a2);
        }
        return a;
    }

    public final String toString() {
        C19188b bVar = new C19188b(64);
        bVar.mo39151a(this.f52870a);
        if (this.f52871b != null) {
            bVar.mo39151a("=");
            bVar.mo39151a(this.f52871b);
        }
        for (C19186d valueOf : this.f52872c) {
            bVar.mo39151a("; ");
            bVar.mo39151a(String.valueOf(valueOf));
        }
        return bVar.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r7 == null) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r6 != r7) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r7 instanceof com.p683ss.android.http.p1169a.C19175b
            if (r2 == 0) goto L_0x0049
            com.ss.android.http.a.b.b r7 = (com.p683ss.android.http.p1169a.p1172b.C19177b) r7
            java.lang.String r2 = r6.f52870a
            java.lang.String r3 = r7.f52870a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r6.f52871b
            java.lang.String r3 = r7.f52871b
            boolean r2 = com.p683ss.android.http.p1169a.p1174d.C19190d.m46780a(r2, r3)
            if (r2 == 0) goto L_0x0048
            com.ss.android.http.a.d[] r2 = r6.f52872c
            com.ss.android.http.a.d[] r7 = r7.f52872c
            if (r2 != 0) goto L_0x002e
            if (r7 != 0) goto L_0x002c
        L_0x002a:
            r7 = 1
            goto L_0x0045
        L_0x002c:
            r7 = 0
            goto L_0x0045
        L_0x002e:
            if (r7 == 0) goto L_0x002c
            int r3 = r2.length
            int r4 = r7.length
            if (r3 != r4) goto L_0x002c
            r3 = 0
        L_0x0035:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x002a
            r4 = r2[r3]
            r5 = r7[r3]
            boolean r4 = com.p683ss.android.http.p1169a.p1174d.C19190d.m46780a(r4, r5)
            if (r4 == 0) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0045:
            if (r7 == 0) goto L_0x0048
            return r1
        L_0x0048:
            return r0
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.http.p1169a.p1172b.C19177b.equals(java.lang.Object):boolean");
    }

    public C19177b(String str, String str2, C19186d[] dVarArr) {
        if (str != null) {
            this.f52870a = str;
            this.f52871b = str2;
            if (dVarArr != null) {
                this.f52872c = dVarArr;
            } else {
                this.f52872c = new C19186d[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
