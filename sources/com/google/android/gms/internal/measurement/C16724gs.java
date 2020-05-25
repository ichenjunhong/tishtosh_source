package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16739c;
import com.google.android.gms.internal.measurement.C16736hd.C16740d;
import java.io.IOException;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gs */
final class C16724gs extends C16723gr<Object> {
    C16724gs() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32199a(C16775ik ikVar) {
        return ikVar instanceof C16739c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16726gu<Object> mo32193a(Object obj) {
        return ((C16739c) obj).zzbyj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C16726gu<Object> mo32200b(Object obj) {
        C16739c cVar = (C16739c) obj;
        if (cVar.zzbyj.f47004b) {
            cVar.zzbyj = (C16726gu) cVar.zzbyj.clone();
        }
        return cVar.zzbyj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo32201c(Object obj) {
        mo32193a(obj).mo32204b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <UT, UB> UB mo32195a(C16792ja jaVar, Object obj, C16721gq gqVar, C16726gu<Object> guVar, UB ub, C16812ju<UT, UB> juVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo32192a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32198a(C16838kp kpVar, Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32197a(C16792ja jaVar, Object obj, C16721gq gqVar, C16726gu<Object> guVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32196a(C16691fs fsVar, Object obj, C16721gq gqVar, C16726gu<Object> guVar) throws IOException {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo32194a(C16721gq gqVar, C16775ik ikVar, int i) {
        return (C16740d) gqVar.f46997b.get(new C16722a(ikVar, i));
    }
}
