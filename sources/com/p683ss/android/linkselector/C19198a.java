package com.p683ss.android.linkselector;

import com.p683ss.android.linkselector.p1175a.C19199a;
import com.p683ss.android.linkselector.p1176b.C19202b;
import com.p683ss.android.linkselector.p1178d.C19207b;
import com.p683ss.android.linkselector.p1178d.C19207b.C19208a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.linkselector.a */
final class C19198a implements C19208a {

    /* renamed from: a */
    List<C19202b> f52908a = new ArrayList();

    /* renamed from: b */
    C19199a f52909b;

    /* renamed from: c */
    private Pattern f52910c = Pattern.compile(".*(?=://)");

    /* renamed from: d */
    private Pattern f52911d = Pattern.compile("(?<=://)([^/]*)");

    /* renamed from: e */
    private List<C19202b> f52912e = new ArrayList();

    /* renamed from: f */
    private C19207b f52913f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39184a() {
        if (this.f52912e.size() != 1) {
            this.f52913f.mo39199a(this.f52912e);
        }
    }

    C19198a(List<C19202b> list) {
        this.f52912e.clear();
        this.f52912e.addAll(list);
        this.f52913f = new C19207b(this);
        this.f52909b = new C19199a();
    }

    /* renamed from: a */
    public final void mo39185a(List<C19202b> list) {
        StringBuilder sb = new StringBuilder("on sort done = ");
        sb.append(list.size());
        sb.append(" selector:");
        sb.append(this);
        sb.append(" thread:");
        sb.append(Thread.currentThread());
        this.f52908a.clear();
        this.f52908a.addAll(list);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd A[LOOP:0: B:1:0x0002->B:16:0x00cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo39183a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.util.List<com.ss.android.linkselector.b.b> r2 = r13.f52908a
            int r2 = r2.size()
            r3 = 1
            if (r1 >= r2) goto L_0x00d1
            java.util.List<com.ss.android.linkselector.b.b> r2 = r13.f52908a
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.linkselector.b.b r2 = (com.p683ss.android.linkselector.p1176b.C19202b) r2
            com.ss.android.linkselector.a.a r4 = r13.f52909b
            if (r2 != 0) goto L_0x001a
        L_0x0017:
            r4 = 0
            goto L_0x00c2
        L_0x001a:
            boolean r5 = r2.mo39188a()
            if (r5 != 0) goto L_0x0034
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.mo39194g()
            r4.append(r5)
            java.lang.String r5 = " is available"
            r4.append(r5)
        L_0x0031:
            r4 = 1
            goto L_0x00c2
        L_0x0034:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r2.mo39191d()
            long r5 = r5 - r7
            int r7 = r2.mo39192e()
            long r7 = r4.mo39186a(r7)
            r9 = 60000(0xea60, double:2.9644E-319)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0089
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "unlock "
            r7.<init>(r8)
            java.lang.String r8 = r2.mo39194g()
            r7.append(r8)
            java.lang.String r8 = ", locked count = "
            r7.append(r8)
            int r8 = r2.mo39192e()
            r7.append(r8)
            java.lang.String r8 = ", should lock "
            r7.append(r8)
            int r8 = r2.mo39192e()
            long r11 = r4.mo39186a(r8)
            long r11 = r11 / r9
            r7.append(r11)
            java.lang.String r4 = " min, already locked "
            r7.append(r4)
            long r5 = r5 / r9
            r7.append(r5)
            java.lang.String r4 = " min"
            r7.append(r4)
            r2.mo39190c()
            goto L_0x0031
        L_0x0089:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r2.mo39194g()
            r7.append(r8)
            java.lang.String r8 = " is locked, locked count = "
            r7.append(r8)
            int r8 = r2.mo39192e()
            r7.append(r8)
            java.lang.String r8 = ", should lock "
            r7.append(r8)
            int r8 = r2.mo39192e()
            long r11 = r4.mo39186a(r8)
            long r11 = r11 / r9
            r7.append(r11)
            java.lang.String r4 = " min, already locked "
            r7.append(r4)
            long r5 = r5 / r9
            r7.append(r5)
            java.lang.String r4 = " min"
            r7.append(r4)
            goto L_0x0017
        L_0x00c2:
            if (r4 == 0) goto L_0x00cd
            java.util.List<com.ss.android.linkselector.b.b> r4 = r13.f52908a
            int r4 = r4.size()
            int r1 = r4 - r1
            goto L_0x00d3
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x00d1:
            r2 = 0
            r1 = 0
        L_0x00d3:
            if (r2 != 0) goto L_0x00e7
            java.util.List<com.ss.android.linkselector.b.b> r4 = r13.f52912e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00e7
            java.util.List<com.ss.android.linkselector.b.b> r1 = r13.f52912e
            java.lang.Object r1 = r1.get(r0)
            r2 = r1
            com.ss.android.linkselector.b.b r2 = (com.p683ss.android.linkselector.p1176b.C19202b) r2
            goto L_0x00e8
        L_0x00e7:
            r0 = r1
        L_0x00e8:
            if (r0 > r3) goto L_0x00ed
            r13.mo39184a()
        L_0x00ed:
            if (r2 == 0) goto L_0x0107
            java.util.regex.Pattern r0 = r13.f52910c
            java.util.regex.Matcher r14 = r0.matcher(r14)
            java.lang.String r0 = r2.f52919e
            java.lang.String r14 = r14.replaceFirst(r0)
            java.util.regex.Pattern r0 = r13.f52911d
            java.util.regex.Matcher r14 = r0.matcher(r14)
            java.lang.String r0 = r2.f52918d
            java.lang.String r14 = r14.replaceFirst(r0)
        L_0x0107:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.linkselector.C19198a.mo39183a(java.lang.String):java.lang.String");
    }
}
