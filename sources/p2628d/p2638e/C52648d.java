package p2628d.p2638e;

import java.io.File;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.e.d */
public final class C52648d {

    /* renamed from: a */
    public final File f130930a;

    /* renamed from: b */
    public final List<File> f130931b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f130931b, (java.lang.Object) r3.f130931b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p2628d.p2638e.C52648d
            if (r0 == 0) goto L_0x001d
            d.e.d r3 = (p2628d.p2638e.C52648d) r3
            java.io.File r0 = r2.f130930a
            java.io.File r1 = r3.f130930a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.io.File> r0 = r2.f130931b
            java.util.List<java.io.File> r3 = r3.f130931b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2628d.p2638e.C52648d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        File file = this.f130930a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f130931b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.f130930a);
        sb.append(", segments=");
        sb.append(this.f130931b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo110268a() {
        return this.f130931b.size();
    }

    public C52648d(File file, List<? extends File> list) {
        C52711k.m112240b(file, "root");
        C52711k.m112240b(list, "segments");
        this.f130930a = file;
        this.f130931b = list;
    }
}
