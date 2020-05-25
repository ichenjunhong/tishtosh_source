package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.bt */
public final class C16576bt {

    /* renamed from: a */
    final /* synthetic */ C16574br f46579a;

    /* renamed from: b */
    private final String f46580b;

    /* renamed from: c */
    private final long f46581c;

    private C16576bt(C16574br brVar, String str, long j) {
        this.f46579a = brVar;
        C15464q.m32125a(str);
        C15464q.m32133b(j > 0);
        this.f46580b = str;
        this.f46581c = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31845a() {
        long a = this.f46579a.mo32504f().mo28523a();
        Editor edit = this.f46579a.f46576c.edit();
        edit.remove(mo31848d());
        edit.remove(mo31849e());
        edit.putLong(m39567f(), a);
        edit.commit();
    }

    /* renamed from: b */
    public final Pair<String, Long> mo31846b() {
        long j;
        long c = mo31847c();
        if (c == 0) {
            j = 0;
        } else {
            j = Math.abs(c - this.f46579a.mo32504f().mo28523a());
        }
        if (j < this.f46581c) {
            return null;
        }
        if (j > (this.f46581c << 1)) {
            mo31845a();
            return null;
        }
        String string = this.f46579a.f46576c.getString(mo31849e(), null);
        long j2 = this.f46579a.f46576c.getLong(mo31848d(), 0);
        mo31845a();
        if (string == null || j2 <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final long mo31847c() {
        return this.f46579a.f46576c.getLong(m39567f(), 0);
    }

    /* renamed from: f */
    private final String m39567f() {
        return String.valueOf(this.f46580b).concat(":start");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo31848d() {
        return String.valueOf(this.f46580b).concat(":count");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final String mo31849e() {
        return String.valueOf(this.f46580b).concat(":value");
    }
}
