package com.p683ss.android.ugc.aweme.awemeservice.p1392a;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.c */
public final class C23310c implements C23309b<String> {

    /* renamed from: a */
    private Map<String, Aweme> f62306a = new HashMap();

    /* renamed from: a */
    public final Collection<Aweme> mo48351a() {
        return this.f62306a.values();
    }

    /* renamed from: b */
    public final void mo48353b() {
        this.f62306a.clear();
    }

    /* renamed from: a */
    public final /* synthetic */ Aweme mo48350a(Object obj) {
        return (Aweme) this.f62306a.get((String) obj);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo48354b(Object obj) {
        return this.f62306a.containsKey((String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48352a(Object obj, Aweme aweme) {
        this.f62306a.put((String) obj, aweme);
    }
}
