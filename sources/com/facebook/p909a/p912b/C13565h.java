package com.facebook.p909a.p912b;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C14533n;
import java.util.UUID;

/* renamed from: com.facebook.a.b.h */
final class C13565h {

    /* renamed from: a */
    public Long f35397a;

    /* renamed from: b */
    public Long f35398b;

    /* renamed from: c */
    public int f35399c;

    /* renamed from: d */
    Long f35400d;

    /* renamed from: e */
    public C13567j f35401e;

    /* renamed from: f */
    public UUID f35402f;

    /* renamed from: a */
    public final long mo25386a() {
        if (this.f35400d == null) {
            return 0;
        }
        return this.f35400d.longValue();
    }

    /* renamed from: b */
    public final long mo25387b() {
        if (this.f35397a == null || this.f35398b == null) {
            return 0;
        }
        return this.f35398b.longValue() - this.f35397a.longValue();
    }

    /* renamed from: c */
    public final void mo25388c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f35397a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f35398b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f35399c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f35402f.toString());
        edit.apply();
        if (this.f35401e != null) {
            this.f35401e.mo25389a();
        }
    }

    public C13565h(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private C13565h(Long l, Long l2, UUID uuid) {
        this.f35397a = l;
        this.f35398b = l2;
        this.f35402f = uuid;
    }
}
