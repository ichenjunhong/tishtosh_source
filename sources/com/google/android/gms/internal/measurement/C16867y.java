package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.stats.C15497a;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C16867y extends C16860r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16530aa f47583a = new C16530aa(this);

    /* renamed from: c */
    private C16565bi f47584c;

    /* renamed from: d */
    private final C16552aw f47585d;

    /* renamed from: e */
    private final C16584ca f47586e;

    protected C16867y(C16862t tVar) {
        super(tVar);
        this.f47586e = new C16584ca(tVar.f47336c);
        this.f47585d = new C16868z(this, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
    }

    /* renamed from: b */
    public final boolean mo32527b() {
        C15098l.m31266b();
        mo32516r();
        return this.f47584c != null;
    }

    /* renamed from: a */
    public final boolean mo32526a(C16564bh bhVar) {
        String i;
        C15464q.m32123a(bhVar);
        C15098l.m31266b();
        mo32516r();
        C16565bi biVar = this.f47584c;
        if (biVar == null) {
            return false;
        }
        if (bhVar.f46561f) {
            i = C16550au.m39486h();
        } else {
            i = C16550au.m39487i();
        }
        try {
            biVar.mo31825a(bhVar.f46556a, bhVar.f46559d, i, Collections.emptyList());
            m40975e();
            return true;
        } catch (RemoteException unused) {
            mo32493b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    /* renamed from: e */
    private final void m40975e() {
        this.f47586e.mo31857a();
        this.f47585d.mo31811a(((Long) C16559bc.f46503A.f46547a).longValue());
    }

    /* renamed from: c */
    public final boolean mo32528c() {
        C15098l.m31266b();
        mo32516r();
        if (this.f47584c != null) {
            return true;
        }
        C16565bi a = this.f47583a.mo31758a();
        if (a == null) {
            return false;
        }
        this.f47584c = a;
        m40975e();
        return true;
    }

    /* renamed from: d */
    public final void mo32529d() {
        C15098l.m31266b();
        mo32516r();
        try {
            C15497a.m32246a();
            C15497a.m32247a(mo32506g(), this.f47583a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f47584c != null) {
            this.f47584c = null;
            mo32510k().mo32475c();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m40973a(C16867y yVar, C16565bi biVar) {
        C15098l.m31266b();
        yVar.f47584c = biVar;
        yVar.m40975e();
        yVar.mo32510k().mo32476d();
    }

    /* renamed from: a */
    static /* synthetic */ void m40972a(C16867y yVar, ComponentName componentName) {
        C15098l.m31266b();
        if (yVar.f47584c != null) {
            yVar.f47584c = null;
            yVar.mo32490a("Disconnected from device AnalyticsService", componentName);
            yVar.mo32510k().mo32475c();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m40974b(C16867y yVar) {
        C15098l.m31266b();
        if (yVar.mo32527b()) {
            yVar.mo32493b("Inactivity, disconnecting from device AnalyticsService");
            yVar.mo32529d();
        }
    }
}
