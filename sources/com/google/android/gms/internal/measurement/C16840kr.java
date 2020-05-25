package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.google.android.gms.internal.measurement.kr */
public final class C16840kr extends C15096j<C16840kr> {

    /* renamed from: a */
    public String f47275a;

    /* renamed from: b */
    public String f47276b;

    /* renamed from: c */
    public String f47277c;

    /* renamed from: d */
    public String f47278d;

    /* renamed from: e */
    public String f47279e;

    /* renamed from: f */
    public String f47280f;

    /* renamed from: g */
    public String f47281g;

    /* renamed from: h */
    public String f47282h;

    /* renamed from: i */
    public String f47283i;

    /* renamed from: j */
    public String f47284j;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(LeakCanaryFileProvider.f132049i, this.f47275a);
        hashMap.put("source", this.f47276b);
        hashMap.put("medium", this.f47277c);
        hashMap.put("keyword", this.f47278d);
        hashMap.put(C42311c.f106865i, this.f47279e);
        hashMap.put("id", this.f47280f);
        hashMap.put("adNetworkId", this.f47281g);
        hashMap.put("gclid", this.f47282h);
        hashMap.put("dclid", this.f47283i);
        hashMap.put("aclid", this.f47284j);
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16840kr krVar = (C16840kr) jVar;
        if (!TextUtils.isEmpty(this.f47275a)) {
            krVar.f47275a = this.f47275a;
        }
        if (!TextUtils.isEmpty(this.f47276b)) {
            krVar.f47276b = this.f47276b;
        }
        if (!TextUtils.isEmpty(this.f47277c)) {
            krVar.f47277c = this.f47277c;
        }
        if (!TextUtils.isEmpty(this.f47278d)) {
            krVar.f47278d = this.f47278d;
        }
        if (!TextUtils.isEmpty(this.f47279e)) {
            krVar.f47279e = this.f47279e;
        }
        if (!TextUtils.isEmpty(this.f47280f)) {
            krVar.f47280f = this.f47280f;
        }
        if (!TextUtils.isEmpty(this.f47281g)) {
            krVar.f47281g = this.f47281g;
        }
        if (!TextUtils.isEmpty(this.f47282h)) {
            krVar.f47282h = this.f47282h;
        }
        if (!TextUtils.isEmpty(this.f47283i)) {
            krVar.f47283i = this.f47283i;
        }
        if (!TextUtils.isEmpty(this.f47284j)) {
            krVar.f47284j = this.f47284j;
        }
    }
}
