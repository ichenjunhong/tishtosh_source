package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15464q;
import java.util.Iterator;
import java.util.LinkedList;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ks */
final class C16031ks {

    /* renamed from: a */
    final LinkedList<C16032kt> f45117a = new LinkedList<>();

    /* renamed from: b */
    public zzyv f45118b;

    /* renamed from: c */
    public final String f45119c;

    /* renamed from: d */
    public final int f45120d;

    /* renamed from: e */
    public boolean f45121e;

    C16031ks(zzyv zzyv, String str, int i) {
        C15464q.m32123a(zzyv);
        C15464q.m32123a(str);
        this.f45118b = zzyv;
        this.f45119c = str;
        this.f45120d = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16032kt mo31138a(zzyv zzyv) {
        if (zzyv != null) {
            this.f45118b = zzyv;
        }
        return (C16032kt) this.f45117a.remove();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo31137a() {
        return this.f45117a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo31140b() {
        Iterator it = this.f45117a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C16032kt) it.next()).f45126e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo31139a(C15997jl jlVar) {
        C16032kt ktVar = new C16032kt(this, jlVar);
        this.f45117a.add(ktVar);
        return ktVar.mo31143a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo31141c() {
        Iterator it = this.f45117a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C16032kt) it.next()).mo31143a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo31142d() {
        this.f45121e = true;
    }
}
