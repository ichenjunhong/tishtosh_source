package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.jw */
final class C16814jw extends C16812ju<C16813jv, C16813jv> {
    C16814jw() {
    }

    /* renamed from: a */
    private static void m40641a(Object obj, C16813jv jvVar) {
        ((C16736hd) obj).zzbyd = jvVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo32371d(Object obj) {
        ((C16736hd) obj).zzbyd.mo32377c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ int mo32373f(Object obj) {
        return ((C16813jv) obj).mo32378d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ int mo32372e(Object obj) {
        C16813jv jvVar = (C16813jv) obj;
        int i = jvVar.f47218d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < jvVar.f47215a; i3++) {
            i2 += (C16709gj.m40021e(1) << 1) + C16709gj.m40029g(2, jvVar.f47216b[i3] >>> 3) + C16709gj.m40013c(3, (C16691fs) jvVar.f47217c[i3]);
        }
        jvVar.f47218d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo32370c(Object obj, Object obj2) {
        C16813jv jvVar = (C16813jv) obj;
        C16813jv jvVar2 = (C16813jv) obj2;
        if (jvVar2.equals(C16813jv.m40633a())) {
            return jvVar;
        }
        int i = jvVar.f47215a + jvVar2.f47215a;
        int[] copyOf = Arrays.copyOf(jvVar.f47216b, i);
        System.arraycopy(jvVar2.f47216b, 0, copyOf, jvVar.f47215a, jvVar2.f47215a);
        Object[] copyOf2 = Arrays.copyOf(jvVar.f47217c, i);
        System.arraycopy(jvVar2.f47217c, 0, copyOf2, jvVar.f47215a, jvVar2.f47215a);
        return new C16813jv(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo32367b(Object obj, C16838kp kpVar) throws IOException {
        C16813jv jvVar = (C16813jv) obj;
        if (kpVar.mo32144a() == C16741e.f47100k) {
            for (int i = jvVar.f47215a - 1; i >= 0; i--) {
                kpVar.mo32152a(jvVar.f47216b[i] >>> 3, jvVar.f47217c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < jvVar.f47215a; i2++) {
            kpVar.mo32152a(jvVar.f47216b[i2] >>> 3, jvVar.f47217c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32362a(Object obj, C16838kp kpVar) throws IOException {
        ((C16813jv) obj).mo32375a(kpVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo32368b(Object obj, Object obj2) {
        m40641a(obj, (C16813jv) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo32369c(Object obj) {
        C16813jv jvVar = ((C16736hd) obj).zzbyd;
        if (jvVar != C16813jv.m40633a()) {
            return jvVar;
        }
        C16813jv b = C16813jv.m40635b();
        m40641a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo32365b(Object obj) {
        return ((C16736hd) obj).zzbyd;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32363a(Object obj, Object obj2) {
        m40641a(obj, (C16813jv) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo32357a(Object obj) {
        C16813jv jvVar = (C16813jv) obj;
        jvVar.mo32377c();
        return jvVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo32356a() {
        return C16813jv.m40635b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32361a(Object obj, int i, Object obj2) {
        ((C16813jv) obj).mo32374a((i << 3) | 3, (Object) (C16813jv) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32360a(Object obj, int i, C16691fs fsVar) {
        ((C16813jv) obj).mo32374a((i << 3) | 2, (Object) fsVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo32366b(Object obj, int i, long j) {
        ((C16813jv) obj).mo32374a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32358a(Object obj, int i, int i2) {
        ((C16813jv) obj).mo32374a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo32359a(Object obj, int i, long j) {
        ((C16813jv) obj).mo32374a(i << 3, (Object) Long.valueOf(j));
    }
}
