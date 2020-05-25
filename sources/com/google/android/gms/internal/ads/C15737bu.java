package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bu */
public final class C15737bu implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    final Object f43893a = new Object();

    /* renamed from: b */
    final ConditionVariable f43894b = new ConditionVariable();

    /* renamed from: c */
    volatile boolean f43895c = false;

    /* renamed from: d */
    volatile boolean f43896d = false;

    /* renamed from: e */
    SharedPreferences f43897e = null;

    /* renamed from: f */
    Bundle f43898f = new Bundle();

    /* renamed from: g */
    Context f43899g;

    /* renamed from: h */
    private JSONObject f43900h = new JSONObject();

    /* renamed from: a */
    public final <T> T mo30717a(C15726bl<T> blVar) {
        if (!this.f43894b.block(5000)) {
            synchronized (this.f43893a) {
                if (!this.f43896d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f43895c || this.f43897e == null) {
            synchronized (this.f43893a) {
                if (this.f43895c) {
                    if (this.f43897e == null) {
                    }
                }
                T t = blVar.f42834c;
                return t;
            }
        }
        if (blVar.f42832a == 2) {
            if (this.f43898f == null) {
                return blVar.f42834c;
            }
            return blVar.mo30319a(this.f43898f);
        } else if (blVar.f42832a != 1 || !this.f43900h.has(blVar.f42833b)) {
            return aek.m32731a(this.f43899g, new C15739bw(this, blVar));
        } else {
            return blVar.mo30320a(this.f43900h);
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            mo30718a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30718a() {
        if (this.f43897e != null) {
            try {
                this.f43900h = new JSONObject((String) aek.m32731a(this.f43899g, new C15738bv(this)));
            } catch (JSONException unused) {
            }
        }
    }
}
