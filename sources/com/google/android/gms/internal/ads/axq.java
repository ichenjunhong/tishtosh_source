package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class axq<FieldDescriptorType extends axs<FieldDescriptorType>> {

    /* renamed from: d */
    static final axq f41528d = new axq(true);

    /* renamed from: a */
    final bae<FieldDescriptorType, Object> f41529a = bae.m35065a(16);

    /* renamed from: b */
    public boolean f41530b;

    /* renamed from: c */
    boolean f41531c;

    private axq() {
    }

    private axq(boolean z) {
        mo29799b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29798a() {
        return this.f41529a.isEmpty();
    }

    /* renamed from: b */
    public final void mo29799b() {
        if (!this.f41530b) {
            this.f41529a.mo29913a();
            this.f41530b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axq)) {
            return false;
        }
        return this.f41529a.equals(((axq) obj).f41529a);
    }

    public final int hashCode() {
        return this.f41529a.hashCode();
    }

    /* renamed from: c */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo29800c() {
        if (this.f41531c) {
            return new ayp(this.f41529a.entrySet().iterator());
        }
        return this.f41529a.entrySet().iterator();
    }

    /* renamed from: a */
    private final Object m34676a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f41529a.get(fielddescriptortype);
        return obj instanceof aym ? aym.m34789a() : obj;
    }

    /* renamed from: b */
    private final void m34681b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo29810d()) {
            m34679a(fielddescriptortype.mo29808b(), obj);
            r7 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m34679a(fielddescriptortype.mo29808b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof aym) {
            this.f41531c = true;
        }
        this.f41529a.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.aym) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.ayc) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m34679a(com.google.android.gms.internal.ads.bbj r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.ayb.m34768a(r3)
            int[] r0 = com.google.android.gms.internal.ads.axr.f41532a
            com.google.android.gms.internal.ads.bbp r2 = r2.zzawa()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.azj
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.aym
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.ayc
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.awo
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.axq.m34679a(com.google.android.gms.internal.ads.bbj, java.lang.Object):void");
    }

    /* renamed from: d */
    public final boolean mo29802d() {
        for (int i = 0; i < this.f41529a.mo29914b(); i++) {
            if (!m34682b(this.f41529a.mo29915b(i))) {
                return false;
            }
        }
        for (Entry b : this.f41529a.mo29916c()) {
            if (!m34682b(b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m34682b(Entry<FieldDescriptorType, Object> entry) {
        axs axs = (axs) entry.getKey();
        if (axs.mo29809c() == bbp.MESSAGE) {
            if (axs.mo29810d()) {
                for (azj h : (List) entry.getValue()) {
                    if (!h.mo29822h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof azj) {
                    if (!((azj) value).mo29822h()) {
                        return false;
                    }
                } else if (value instanceof aym) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo29797a(axq<FieldDescriptorType> axq) {
        for (int i = 0; i < axq.f41529a.mo29914b(); i++) {
            m34683c(axq.f41529a.mo29915b(i));
        }
        for (Entry c : axq.f41529a.mo29916c()) {
            m34683c(c);
        }
    }

    /* renamed from: a */
    private static Object m34677a(Object obj) {
        if (obj instanceof azr) {
            return ((azr) obj).mo29903a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: c */
    private final void m34683c(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        axs axs = (axs) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aym) {
            value = aym.m34789a();
        }
        if (axs.mo29810d()) {
            Object a = m34676a((FieldDescriptorType) axs);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m34677a(a2));
            }
            this.f41529a.put(axs, a);
        } else if (axs.mo29809c() == bbp.MESSAGE) {
            Object a3 = m34676a((FieldDescriptorType) axs);
            if (a3 == null) {
                this.f41529a.put(axs, m34677a(value));
                return;
            }
            if (a3 instanceof azr) {
                obj = axs.mo29807a((azr) a3, (azr) value);
            } else {
                obj = axs.mo29806a(((azj) a3).mo29825l(), (azj) value).mo29832e();
            }
            this.f41529a.put(axs, obj);
        } else {
            this.f41529a.put(axs, m34677a(value));
        }
    }

    /* renamed from: a */
    static void m34678a(axf axf, bbj bbj, int i, Object obj) throws IOException {
        if (bbj == bbj.GROUP) {
            azj azj = (azj) obj;
            axf.mo29708a(i, 3);
            azj.mo29820a(axf);
            axf.mo29708a(i, 4);
            return;
        }
        axf.mo29708a(i, bbj.zzawb());
        switch (axr.f41533b[bbj.ordinal()]) {
            case 1:
                axf.mo29703a(((Double) obj).doubleValue());
                return;
            case 2:
                axf.mo29704a(((Float) obj).floatValue());
                return;
            case 3:
                axf.mo29715a(((Long) obj).longValue());
                return;
            case 4:
                axf.mo29715a(((Long) obj).longValue());
                return;
            case 5:
                axf.mo29705a(((Integer) obj).intValue());
                return;
            case 6:
                axf.mo29734c(((Long) obj).longValue());
                return;
            case 7:
                axf.mo29736d(((Integer) obj).intValue());
                return;
            case 8:
                axf.mo29721a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((azj) obj).mo29820a(axf);
                return;
            case 10:
                axf.mo29717a((azj) obj);
                return;
            case 11:
                if (obj instanceof awo) {
                    axf.mo29716a((awo) obj);
                    return;
                } else {
                    axf.mo29719a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof awo) {
                    axf.mo29716a((awo) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                axf.mo29735c(bArr, 0, bArr.length);
                return;
            case 13:
                axf.mo29723b(((Integer) obj).intValue());
                return;
            case 14:
                axf.mo29736d(((Integer) obj).intValue());
                return;
            case 15:
                axf.mo29734c(((Long) obj).longValue());
                return;
            case 16:
                axf.mo29731c(((Integer) obj).intValue());
                return;
            case 17:
                axf.mo29728b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof ayc)) {
                    axf.mo29705a(((Integer) obj).intValue());
                    break;
                } else {
                    axf.mo29705a(((ayc) obj).zzac());
                    return;
                }
        }
    }

    /* renamed from: a */
    static int m34675a(Entry<FieldDescriptorType, Object> entry) {
        axs axs = (axs) entry.getKey();
        Object value = entry.getValue();
        if (axs.mo29809c() != bbp.MESSAGE || axs.mo29810d() || axs.mo29811e()) {
            return m34673a(axs, value);
        }
        if (value instanceof aym) {
            return axf.m34433b(((axs) entry.getKey()).mo29805a(), (ayq) (aym) value);
        }
        return axf.m34447d(((axs) entry.getKey()).mo29805a(), (azj) value);
    }

    /* renamed from: a */
    static int m34674a(bbj bbj, int i, Object obj) {
        int e = axf.m34450e(i);
        if (bbj == bbj.GROUP) {
            e <<= 1;
        }
        return e + m34680b(bbj, obj);
    }

    /* renamed from: b */
    private static int m34680b(bbj bbj, Object obj) {
        switch (axr.f41533b[bbj.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return axf.m34448d(((Long) obj).longValue());
            case 4:
                return axf.m34452e(((Long) obj).longValue());
            case 5:
                return axf.m34453f(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                return axf.m34445c((azj) obj);
            case 10:
                if (obj instanceof aym) {
                    return axf.m34429a((ayq) (aym) obj);
                }
                return axf.m34438b((azj) obj);
            case 11:
                if (obj instanceof awo) {
                    return axf.m34437b((awo) obj);
                }
                return axf.m34440b((String) obj);
            case 12:
                if (obj instanceof awo) {
                    return axf.m34437b((awo) obj);
                }
                return axf.m34441b((byte[]) obj);
            case 13:
                return axf.m34457g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return axf.m34461h(((Integer) obj).intValue());
            case 17:
                return axf.m34456f(((Long) obj).longValue());
            case 18:
                if (obj instanceof ayc) {
                    return axf.m34464i(((ayc) obj).zzac());
                }
                return axf.m34464i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    static int m34673a(axs<?> axs, Object obj) {
        bbj b = axs.mo29808b();
        int a = axs.mo29805a();
        if (!axs.mo29810d()) {
            return m34674a(b, a, obj);
        }
        int i = 0;
        if (axs.mo29811e()) {
            for (Object b2 : (List) obj) {
                i += m34680b(b, b2);
            }
            return axf.m34450e(a) + i + axf.m34466j(i);
        }
        for (Object a2 : (List) obj) {
            i += m34674a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        axq axq = new axq();
        for (int i = 0; i < this.f41529a.mo29914b(); i++) {
            Entry b = this.f41529a.mo29915b(i);
            axq.m34681b((FieldDescriptorType) (axs) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f41529a.mo29916c()) {
            axq.m34681b((FieldDescriptorType) (axs) entry.getKey(), entry.getValue());
        }
        axq.f41531c = this.f41531c;
        return axq;
    }
}
