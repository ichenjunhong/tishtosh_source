package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16728gw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gu */
final class C16726gu<FieldDescriptorType extends C16728gw<FieldDescriptorType>> {

    /* renamed from: d */
    static final C16726gu f47002d = new C16726gu(true);

    /* renamed from: a */
    final C16796je<FieldDescriptorType, Object> f47003a = C16796je.m40586a(16);

    /* renamed from: b */
    public boolean f47004b;

    /* renamed from: c */
    boolean f47005c;

    private C16726gu() {
    }

    private C16726gu(boolean z) {
        mo32204b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32203a() {
        return this.f47003a.isEmpty();
    }

    /* renamed from: b */
    public final void mo32204b() {
        if (!this.f47004b) {
            this.f47003a.mo32314a();
            this.f47004b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16726gu)) {
            return false;
        }
        return this.f47003a.equals(((C16726gu) obj).f47003a);
    }

    public final int hashCode() {
        return this.f47003a.hashCode();
    }

    /* renamed from: c */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo32205c() {
        if (this.f47005c) {
            return new C16754hq(this.f47003a.entrySet().iterator());
        }
        return this.f47003a.entrySet().iterator();
    }

    /* renamed from: a */
    private final Object m40245a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f47003a.get(fielddescriptortype);
        return obj instanceof C16751hn ? C16751hn.m40330a() : obj;
    }

    /* renamed from: b */
    private final void m40250b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo32215d()) {
            m40248a(fielddescriptortype.mo32213b(), obj);
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
                m40248a(fielddescriptortype.mo32213b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof C16751hn) {
            this.f47005c = true;
        }
        this.f47003a.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C16751hn) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C16744hg) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m40248a(com.google.android.gms.internal.measurement.C16832kj r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C16743hf.m40314a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C16727gv.f47006a
            com.google.android.gms.internal.measurement.ko r2 = r2.zzyv()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16775ik
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16751hn
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16744hg
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C16691fs
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16726gu.m40248a(com.google.android.gms.internal.measurement.kj, java.lang.Object):void");
    }

    /* renamed from: d */
    public final boolean mo32207d() {
        for (int i = 0; i < this.f47003a.mo32315b(); i++) {
            if (!m40251b(this.f47003a.mo32316b(i))) {
                return false;
            }
        }
        for (Entry b : this.f47003a.mo32317c()) {
            if (!m40251b(b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m40251b(Entry<FieldDescriptorType, Object> entry) {
        C16728gw gwVar = (C16728gw) entry.getKey();
        if (gwVar.mo32214c() == C16837ko.zzcek) {
            if (gwVar.mo32215d()) {
                for (C16775ik e : (List) entry.getValue()) {
                    if (!e.mo32227e()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C16775ik) {
                    if (!((C16775ik) value).mo32227e()) {
                        return false;
                    }
                } else if (value instanceof C16751hn) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo32202a(C16726gu<FieldDescriptorType> guVar) {
        for (int i = 0; i < guVar.f47003a.mo32315b(); i++) {
            m40252c(guVar.f47003a.mo32316b(i));
        }
        for (Entry c : guVar.f47003a.mo32317c()) {
            m40252c(c);
        }
    }

    /* renamed from: a */
    private static Object m40246a(Object obj) {
        if (obj instanceof C16782ir) {
            return ((C16782ir) obj).mo32306a();
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
    private final void m40252c(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C16728gw gwVar = (C16728gw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C16751hn) {
            value = C16751hn.m40330a();
        }
        if (gwVar.mo32215d()) {
            Object a = m40245a((FieldDescriptorType) gwVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m40246a(a2));
            }
            this.f47003a.put(gwVar, a);
        } else if (gwVar.mo32214c() == C16837ko.zzcek) {
            Object a3 = m40245a((FieldDescriptorType) gwVar);
            if (a3 == null) {
                this.f47003a.put(gwVar, m40246a(value));
                return;
            }
            if (a3 instanceof C16782ir) {
                obj = gwVar.mo32212a((C16782ir) a3, (C16782ir) value);
            } else {
                obj = gwVar.mo32211a(((C16775ik) a3).mo32231h(), (C16775ik) value).mo32239d();
            }
            this.f47003a.put(gwVar, obj);
        } else {
            this.f47003a.put(gwVar, m40246a(value));
        }
    }

    /* renamed from: a */
    static void m40247a(C16709gj gjVar, C16832kj kjVar, int i, Object obj) throws IOException {
        if (kjVar == C16832kj.GROUP) {
            C16775ik ikVar = (C16775ik) obj;
            gjVar.mo32114a(i, 3);
            ikVar.mo32226a(gjVar);
            gjVar.mo32114a(i, 4);
            return;
        }
        gjVar.mo32114a(i, kjVar.zzyw());
        switch (C16727gv.f47007b[kjVar.ordinal()]) {
            case 1:
                gjVar.mo32109a(((Double) obj).doubleValue());
                return;
            case 2:
                gjVar.mo32110a(((Float) obj).floatValue());
                return;
            case 3:
                gjVar.mo32121a(((Long) obj).longValue());
                return;
            case 4:
                gjVar.mo32121a(((Long) obj).longValue());
                return;
            case 5:
                gjVar.mo32111a(((Integer) obj).intValue());
                return;
            case 6:
                gjVar.mo32139c(((Long) obj).longValue());
                return;
            case 7:
                gjVar.mo32141d(((Integer) obj).intValue());
                return;
            case 8:
                gjVar.mo32127a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C16775ik) obj).mo32226a(gjVar);
                return;
            case 10:
                gjVar.mo32123a((C16775ik) obj);
                return;
            case 11:
                if (obj instanceof C16691fs) {
                    gjVar.mo32122a((C16691fs) obj);
                    return;
                } else {
                    gjVar.mo32125a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C16691fs) {
                    gjVar.mo32122a((C16691fs) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                gjVar.mo32140c(bArr, 0, bArr.length);
                return;
            case 13:
                gjVar.mo32129b(((Integer) obj).intValue());
                return;
            case 14:
                gjVar.mo32141d(((Integer) obj).intValue());
                return;
            case 15:
                gjVar.mo32139c(((Long) obj).longValue());
                return;
            case 16:
                gjVar.mo32136c(((Integer) obj).intValue());
                return;
            case 17:
                gjVar.mo32134b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C16744hg)) {
                    gjVar.mo32111a(((Integer) obj).intValue());
                    break;
                } else {
                    gjVar.mo32111a(((C16744hg) obj).zzc());
                    return;
                }
        }
    }

    /* renamed from: a */
    static int m40244a(Entry<FieldDescriptorType, Object> entry) {
        C16728gw gwVar = (C16728gw) entry.getKey();
        Object value = entry.getValue();
        if (gwVar.mo32214c() != C16837ko.zzcek || gwVar.mo32215d() || gwVar.mo32216e()) {
            return m40242a(gwVar, value);
        }
        if (value instanceof C16751hn) {
            return C16709gj.m40005b(((C16728gw) entry.getKey()).mo32210a(), (C16755hr) (C16751hn) value);
        }
        return C16709gj.m40019d(((C16728gw) entry.getKey()).mo32210a(), (C16775ik) value);
    }

    /* renamed from: a */
    static int m40243a(C16832kj kjVar, int i, Object obj) {
        int e = C16709gj.m40021e(i);
        if (kjVar == C16832kj.GROUP) {
            e <<= 1;
        }
        return e + m40249b(kjVar, obj);
    }

    /* renamed from: b */
    private static int m40249b(C16832kj kjVar, Object obj) {
        switch (C16727gv.f47007b[kjVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return C16709gj.m40020d(((Long) obj).longValue());
            case 4:
                return C16709gj.m40023e(((Long) obj).longValue());
            case 5:
                return C16709gj.m40024f(((Integer) obj).intValue());
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
                return C16709gj.m40016c((C16775ik) obj);
            case 10:
                if (obj instanceof C16751hn) {
                    return C16709gj.m40001a((C16755hr) (C16751hn) obj);
                }
                return C16709gj.m40010b((C16775ik) obj);
            case 11:
                if (obj instanceof C16691fs) {
                    return C16709gj.m40009b((C16691fs) obj);
                }
                return C16709gj.m40012b((String) obj);
            case 12:
                if (obj instanceof C16691fs) {
                    return C16709gj.m40009b((C16691fs) obj);
                }
                return C16709gj.m40002a((byte[]) obj);
            case 13:
                return C16709gj.m40028g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return C16709gj.m40032h(((Integer) obj).intValue());
            case 17:
                return C16709gj.m40027f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C16744hg) {
                    return C16709gj.m40035i(((C16744hg) obj).zzc());
                }
                return C16709gj.m40035i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    static int m40242a(C16728gw<?> gwVar, Object obj) {
        C16832kj b = gwVar.mo32213b();
        int a = gwVar.mo32210a();
        if (!gwVar.mo32215d()) {
            return m40243a(b, a, obj);
        }
        int i = 0;
        if (gwVar.mo32216e()) {
            for (Object b2 : (List) obj) {
                i += m40249b(b, b2);
            }
            return C16709gj.m40021e(a) + i + C16709gj.m40037j(i);
        }
        for (Object a2 : (List) obj) {
            i += m40243a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C16726gu guVar = new C16726gu();
        for (int i = 0; i < this.f47003a.mo32315b(); i++) {
            Entry b = this.f47003a.mo32316b(i);
            guVar.m40250b((FieldDescriptorType) (C16728gw) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f47003a.mo32317c()) {
            guVar.m40250b((FieldDescriptorType) (C16728gw) entry.getKey(), entry.getValue());
        }
        guVar.f47005c = this.f47005c;
        return guVar;
    }
}
