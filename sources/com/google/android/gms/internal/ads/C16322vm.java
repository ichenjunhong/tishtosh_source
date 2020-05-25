package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.vm */
public final class C16322vm extends C16317vh implements C15429a, C15430b {

    /* renamed from: a */
    private Context f45726a;

    /* renamed from: b */
    private zzbgz f45727b;

    /* renamed from: c */
    private agn<zzaxe> f45728c;

    /* renamed from: d */
    private acz f45729d;

    /* renamed from: e */
    private final C16315vf f45730e;

    /* renamed from: f */
    private final Object f45731f = new Object();

    /* renamed from: g */
    private C16323vn f45732g;

    public C16322vm(Context context, zzbgz zzbgz, agn<zzaxe> agn, C16315vf vfVar) {
        super(agn, vfVar);
        this.f45726a = context;
        this.f45727b = zzbgz;
        this.f45728c = agn;
        this.f45730e = vfVar;
        this.f45732g = new C16323vn(context, C14963ax.m30844n().mo28747a(), this, this);
        this.f45732g.mo28409l();
    }

    /* renamed from: d */
    public final C16329vt mo31435d() {
        C16329vt s;
        synchronized (this.f45731f) {
            try {
                s = this.f45732g.mo29433s();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s;
    }

    /* renamed from: a */
    public final void mo31433a() {
        synchronized (this.f45731f) {
            if (this.f45732g.mo28404g() || this.f45732g.mo28405h()) {
                this.f45732g.mo28403f();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        abv.m32792b("Cannot connect to remote service, fallback to local instance.");
        this.f45729d = new C16321vl(this.f45726a, this.f45728c, this.f45730e);
        this.f45729d.mo28618c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        C14963ax.m30831a().mo28671b(this.f45726a, this.f45727b.f46237a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        mo28618c();
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        abv.m32792b("Disconnected from remote ad request service.");
    }
}
