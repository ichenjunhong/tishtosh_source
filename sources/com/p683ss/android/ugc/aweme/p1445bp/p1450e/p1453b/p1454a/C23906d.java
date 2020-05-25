package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.d */
public final class C23906d implements C23905c {

    /* renamed from: c */
    public static final C23907a f63574c = new C23907a(null);

    /* renamed from: a */
    public boolean f63575a;

    /* renamed from: b */
    public boolean f63576b;

    /* renamed from: d */
    private final List<File> f63577d;

    /* renamed from: e */
    private final Set<String> f63578e;

    /* renamed from: f */
    private final Set<String> f63579f;

    /* renamed from: com.ss.android.ugc.aweme.bp.e.b.a.d$a */
    public static final class C23907a {
        private C23907a() {
        }

        public /* synthetic */ C23907a(C52707g gVar) {
            this();
        }
    }

    public C23906d() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo49510a() {
        for (File file : this.f63577d) {
            file.delete();
            C39629l.m88232a().mo58577h().mo49486a().mo49530b(file);
        }
        this.f63577d.clear();
    }

    public C23906d(Set<String> set, Set<String> set2) {
        C52711k.m112240b(set, "prefixWhiteList");
        C52711k.m112240b(set2, "inclusionWhiteList");
        this.f63578e = set;
        this.f63579f = set2;
        this.f63576b = true;
        this.f63577d = new ArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49508a(java.io.File r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "file"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            boolean r0 = r8.f63576b
            if (r0 == 0) goto L_0x0012
            if (r10 == 0) goto L_0x0012
            boolean r10 = r9.isDirectory()
            if (r10 == 0) goto L_0x0012
            return
        L_0x0012:
            boolean r10 = r8.f63575a
            if (r10 != 0) goto L_0x001d
            boolean r10 = r9.isDirectory()
            if (r10 == 0) goto L_0x001d
            return
        L_0x001d:
            java.util.Set<java.lang.String> r10 = r8.f63578e
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
            r1 = 0
        L_0x0027:
            boolean r2 = r10.hasNext()
            r3 = 0
            r4 = 2
            r5 = -1
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r10.next()
            if (r1 >= 0) goto L_0x0039
            p2628d.p2629a.C52575l.m112100b()
        L_0x0039:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r9.getPath()
            java.lang.String r7 = "file.path"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            boolean r2 = p2628d.p2650m.C52830p.m112411b(r6, r2, r0, r4, r3)
            if (r2 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x004e:
            r1 = -1
        L_0x004f:
            if (r1 != r5) goto L_0x0087
            java.util.Set<java.lang.String> r10 = r8.f63579f
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r1 = 0
        L_0x005a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0082
            java.lang.Object r2 = r10.next()
            if (r1 >= 0) goto L_0x0069
            p2628d.p2629a.C52575l.m112100b()
        L_0x0069:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r9.getPath()
            java.lang.String r7 = "file.path"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p2628d.p2650m.C52830p.m112456b(r6, r2, r0, r4, r3)
            if (r2 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x005a
        L_0x0082:
            r1 = -1
        L_0x0083:
            if (r1 != r5) goto L_0x0087
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            if (r10 == 0) goto L_0x008f
            java.util.List<java.io.File> r10 = r8.f63577d
            r10.add(r0, r9)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23906d.mo49508a(java.io.File, boolean):void");
    }

    public /* synthetic */ C23906d(Set set, Set set2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            set = C52555ag.m112062a();
        }
        if ((i & 2) != 0) {
            set2 = C52555ag.m112062a();
        }
        this(set, set2);
    }
}
