package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.analytics.C15098l;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.google.android.gms.internal.measurement.br */
public final class C16574br extends C16860r {

    /* renamed from: a */
    public final C16576bt f46575a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SharedPreferences f46576c;

    /* renamed from: d */
    private long f46577d;

    /* renamed from: e */
    private long f46578e = -1;

    protected C16574br(C16862t tVar) {
        super(tVar);
        C16576bt btVar = new C16576bt(this, "monitoring", ((Long) C16559bc.f46506D.f46547a).longValue());
        this.f46575a = btVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        this.f46576c = C35807d.m80935a(mo32506g(), "com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: b */
    public final long mo31840b() {
        C15098l.m31266b();
        mo32516r();
        if (this.f46577d == 0) {
            long j = this.f46576c.getLong("first_run", 0);
            if (j != 0) {
                this.f46577d = j;
            } else {
                long a = mo32504f().mo28523a();
                Editor edit = this.f46576c.edit();
                edit.putLong("first_run", a);
                if (!edit.commit()) {
                    mo32503e("Failed to commit first run time");
                }
                this.f46577d = a;
            }
        }
        return this.f46577d;
    }

    /* renamed from: c */
    public final C16584ca mo31841c() {
        return new C16584ca(mo32504f(), mo31840b());
    }

    /* renamed from: d */
    public final long mo31842d() {
        C15098l.m31266b();
        mo32516r();
        if (this.f46578e == -1) {
            this.f46578e = this.f46576c.getLong("last_dispatch", 0);
        }
        return this.f46578e;
    }

    /* renamed from: e */
    public final void mo31843e() {
        C15098l.m31266b();
        mo32516r();
        long a = mo32504f().mo28523a();
        Editor edit = this.f46576c.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f46578e = a;
    }

    /* renamed from: t */
    public final String mo31844t() {
        C15098l.m31266b();
        mo32516r();
        String string = this.f46576c.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: a */
    public final void mo31839a(String str) {
        C15098l.m31266b();
        mo32516r();
        Editor edit = this.f46576c.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            mo32503e("Failed to commit campaign data");
        }
    }
}
