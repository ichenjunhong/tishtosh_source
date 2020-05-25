package com.google.android.gms.internal.ads;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.mz */
public final class C16092mz implements C16046lg, C16091my {

    /* renamed from: a */
    private final C16090mx f45239a;

    /* renamed from: b */
    private final HashSet<SimpleEntry<String, C15948hq<? super C16090mx>>> f45240b = new HashSet<>();

    public C16092mz(C16090mx mxVar) {
        this.f45239a = mxVar;
    }

    /* renamed from: a */
    public final void mo29386a(String str, String str2) {
        C16047lh.m38005a((C16046lg) this, str, str2);
    }

    /* renamed from: a */
    public final void mo29242a(String str, Map map) {
        C16047lh.m38006a((C16046lg) this, str, map);
    }

    /* renamed from: a */
    public final void mo29243a(String str, JSONObject jSONObject) {
        C16047lh.m38008b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo29247b(String str, JSONObject jSONObject) {
        C16047lh.m38007a((C16046lg) this, str, jSONObject);
    }

    /* renamed from: d */
    public final void mo29248d(String str) {
        this.f45239a.mo29248d(str);
    }

    /* renamed from: a */
    public final void mo31166a(String str, C15948hq<? super C16090mx> hqVar) {
        this.f45239a.mo31166a(str, hqVar);
        this.f45240b.add(new SimpleEntry(str, hqVar));
    }

    /* renamed from: b */
    public final void mo31167b(String str, C15948hq<? super C16090mx> hqVar) {
        this.f45239a.mo31167b(str, hqVar);
        this.f45240b.remove(new SimpleEntry(str, hqVar));
    }

    /* renamed from: a */
    public final void mo31187a() {
        Iterator it = this.f45240b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((C15948hq) simpleEntry.getValue()).toString());
            abv.m32494a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f45239a.mo31167b((String) simpleEntry.getKey(), (C15948hq) simpleEntry.getValue());
        }
        this.f45240b.clear();
    }
}
