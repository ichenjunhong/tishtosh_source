package com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1511d;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d.C23090a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.d.a */
public final class C24885a {

    /* renamed from: a */
    public Map<String, String> f65839a = new HashMap();

    /* renamed from: a */
    public static C24885a m60440a() {
        return new C24885a();
    }

    private C24885a() {
    }

    /* renamed from: a */
    public final C24885a mo50807a(Map<? extends String, ? extends String> map) {
        if (map != null) {
            this.f65839a.putAll(map);
        }
        return this;
    }

    /* renamed from: a */
    public final C24885a mo50805a(String str, int i) {
        return m60441a(str, String.valueOf(i), C23090a.f61492a);
    }

    /* renamed from: a */
    public final C24885a mo50806a(String str, String str2) {
        return m60441a(str, str2, C23090a.f61492a);
    }

    /* renamed from: a */
    private C24885a m60441a(String str, String str2, C23090a aVar) {
        this.f65839a.put(str, aVar.mo47832a(str2));
        return this;
    }
}
