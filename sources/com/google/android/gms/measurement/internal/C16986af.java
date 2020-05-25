package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.C2240a;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.af */
final class C16986af extends C17029bv {

    /* renamed from: a */
    static final Pair<String, Long> f47872a = new Pair<>("", Long.valueOf(0));

    /* renamed from: b */
    SharedPreferences f47873b;

    /* renamed from: c */
    public C16990aj f47874c;

    /* renamed from: d */
    public final C16989ai f47875d = new C16989ai(this, "last_upload", 0);

    /* renamed from: e */
    public final C16989ai f47876e = new C16989ai(this, "last_upload_attempt", 0);

    /* renamed from: f */
    public final C16989ai f47877f = new C16989ai(this, "backoff", 0);

    /* renamed from: g */
    public final C16989ai f47878g = new C16989ai(this, "last_delete_stale", 0);

    /* renamed from: h */
    public final C16989ai f47879h = new C16989ai(this, "midnight_offset", 0);

    /* renamed from: i */
    public final C16989ai f47880i = new C16989ai(this, "first_open_time", 0);

    /* renamed from: j */
    public final C16989ai f47881j = new C16989ai(this, "app_install_time", 0);

    /* renamed from: k */
    public final C16991ak f47882k = new C16991ak(this, "app_instance_id", null);

    /* renamed from: l */
    public final C16989ai f47883l = new C16989ai(this, "time_before_start", 10000);

    /* renamed from: m */
    public final C16989ai f47884m = new C16989ai(this, "session_timeout", 1800000);

    /* renamed from: n */
    public final C16988ah f47885n = new C16988ah(this, "start_new_session", true);

    /* renamed from: o */
    public final C16989ai f47886o = new C16989ai(this, "last_pause_time", 0);

    /* renamed from: p */
    public final C16989ai f47887p = new C16989ai(this, "time_active", 0);

    /* renamed from: q */
    public boolean f47888q;

    /* renamed from: s */
    private String f47889s;

    /* renamed from: t */
    private boolean f47890t;

    /* renamed from: u */
    private long f47891u;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo32863a(String str) {
        mo32840c();
        long b = mo32849l().mo28524b();
        if (this.f47889s != null && b < this.f47891u) {
            return new Pair<>(this.f47889s, Boolean.valueOf(this.f47890t));
        }
        this.f47891u = b + mo32856s().mo33273a(str, C17122h.f48400k);
        try {
            C14903a a = C14902a.m30575a(mo32850m());
            if (a != null) {
                this.f47889s = a.f38442a;
                this.f47890t = a.f38443b;
            }
            if (this.f47889s == null) {
                this.f47889s = "";
            }
        } catch (Exception e) {
            mo32854q().f48452i.mo33377a("Unable to get advertising id", e);
            this.f47889s = "";
        }
        return new Pair<>(this.f47889s, Boolean.valueOf(this.f47890t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32871d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo32866b(String str) {
        mo32840c();
        String str2 = (String) mo32863a(str).first;
        MessageDigest h = C17102em.m41676h();
        if (h == null) {
            return null;
        }
        return C2240a.m6773a(Locale.US, "%032X", new Object[]{new BigInteger(1, h.digest(str2.getBytes()))});
    }

    C16986af(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo32872e() {
        this.f47873b = C35807d.m80935a(mo32850m(), "com.google.android.gms.measurement.prefs", 0);
        this.f47888q = this.f47873b.getBoolean("has_been_opened", false);
        if (!this.f47888q) {
            Editor edit = this.f47873b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C16990aj ajVar = new C16990aj(this, "health_monitor", Math.max(0, ((Long) C17122h.f48401l.mo33351b()).longValue()));
        this.f47874c = ajVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final SharedPreferences mo32873f() {
        mo32840c();
        mo32980w();
        return this.f47873b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo32868c(String str) {
        mo32840c();
        Editor edit = mo32873f().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo32874g() {
        mo32840c();
        return mo32873f().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo32870d(String str) {
        mo32840c();
        Editor edit = mo32873f().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo32875h() {
        mo32840c();
        return mo32873f().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Boolean mo32876i() {
        mo32840c();
        if (!mo32873f().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(mo32873f().getBoolean("use_service", false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32864a(boolean z) {
        mo32840c();
        mo32854q().f48453j.mo33377a("Setting useService", Boolean.valueOf(z));
        Editor edit = mo32873f().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo32877j() {
        mo32840c();
        mo32854q().f48453j.mo33376a("Clearing collection preferences.");
        if (mo32856s().mo33274a(C17122h.f48382ar)) {
            Boolean t = mo32878t();
            Editor edit = mo32873f().edit();
            edit.clear();
            edit.apply();
            if (t != null) {
                m41164d(t.booleanValue());
            }
            return;
        }
        boolean contains = mo32873f().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo32867b(true);
        }
        Editor edit2 = mo32873f().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            m41164d(z);
        }
    }

    /* renamed from: d */
    private void m41164d(boolean z) {
        mo32840c();
        mo32854q().f48453j.mo33377a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = mo32873f().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32867b(boolean z) {
        mo32840c();
        return mo32873f().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final Boolean mo32878t() {
        mo32840c();
        if (mo32873f().contains("measurement_enabled")) {
            return Boolean.valueOf(mo32873f().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo32879u() {
        mo32840c();
        String string = mo32873f().getString("previous_os_version", null);
        mo32848k().mo32980w();
        String str = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            Editor edit = mo32873f().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo32869c(boolean z) {
        mo32840c();
        mo32854q().f48453j.mo33377a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = mo32873f().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32865a(long j) {
        return j - this.f47884m.mo32882a() > this.f47886o.mo32882a();
    }
}
