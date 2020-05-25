package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bl */
public abstract class C15726bl<T> {

    /* renamed from: a */
    public final int f42832a;

    /* renamed from: b */
    public final String f42833b;

    /* renamed from: c */
    public final T f42834c;

    private C15726bl(int i, String str, T t) {
        this.f42832a = i;
        this.f42833b = str;
        this.f42834c = t;
        caf.m37098c().f43751a.add(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30318a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public abstract T mo30319a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30320a(JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo30321a(Editor editor, T t);

    /* renamed from: a */
    public static C15726bl<Boolean> m35987a(int i, String str, Boolean bool) {
        return new C15727bm(i, str, bool);
    }

    /* renamed from: a */
    public static C15726bl<Integer> m35985a(int i, String str, int i2) {
        return new C15728bn(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C15726bl<Long> m35986a(int i, String str, long j) {
        return new C15729bo(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C15726bl<Float> m35984a(int i, String str, float f) {
        return new C15732bq(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static C15726bl<String> m35988a(int i, String str, String str2) {
        return new C15734br(i, str, str2);
    }

    /* renamed from: a */
    public static C15726bl<String> m35983a(int i, String str) {
        C15726bl<String> a = m35988a(i, str, (String) null);
        caf.m37098c().f43752b.add(a);
        return a;
    }

    /* renamed from: b */
    public static C15726bl<String> m35989b(int i, String str) {
        C15726bl<String> a = m35988a(i, str, (String) null);
        caf.m37098c().f43753c.add(a);
        return a;
    }

    /* synthetic */ C15726bl(int i, String str, Object obj, C15727bm bmVar) {
        this(i, str, obj);
    }
}
