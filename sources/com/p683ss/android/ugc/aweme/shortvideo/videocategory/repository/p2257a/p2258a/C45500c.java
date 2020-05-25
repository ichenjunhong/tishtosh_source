package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2258a;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a.c */
public final class C45500c<T> extends C45498a<T> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114957a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45500c.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    private final C52668f f114958b = C52732g.m112306a(Keva.getRepoFromSp(C11010c.m22280a(), this.f114959c, 0));

    /* renamed from: c */
    private final String f114959c;

    /* renamed from: d */
    private final int f114960d;

    /* renamed from: e */
    private final Class<T> f114961e;

    /* renamed from: e */
    private final Keva m99135e() {
        return (Keva) this.f114958b.getValue();
    }

    /* renamed from: a */
    public final int mo91775a() {
        return this.f114960d;
    }

    /* renamed from: d */
    public final void mo91778d() {
        m99135e().clear();
    }

    /* renamed from: b */
    public final int mo91776b() {
        return m99135e().count();
    }

    /* renamed from: c */
    public final List<T> mo91777c() {
        String string = m99135e().getString(this.f114959c, "");
        C17956a a = C17956a.m44008a(List.class, this.f114961e);
        C52711k.m112236a((Object) a, "TypeToken.getParameteriz…::class.java, actualType)");
        List<T> list = (List) C39629l.m88232a().mo58566D().mo34885a(string, a.f49843c);
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo91774b(T t) {
        Iterable c = mo91777c();
        Collection arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                if (next != null && !C52711k.m112239a(next, (Object) t)) {
                    z = false;
                }
                if (!z) {
                    arrayList.add(next);
                }
            } else {
                List e = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                e.add(0, t);
                C17956a a = C17956a.m44008a(List.class, this.f114961e);
                C52711k.m112236a((Object) a, "TypeToken.getParameteriz…::class.java, actualType)");
                m99135e().storeString(this.f114959c, C39629l.m88232a().mo58566D().mo34890b(C52575l.m112129b((Iterable<? extends T>) e, this.f114960d), a.f49843c));
                return true;
            }
        }
    }

    public C45500c(String str, int i, Class<T> cls) {
        C52711k.m112240b(str, "repoName");
        C52711k.m112240b(cls, "actualType");
        this.f114959c = str;
        this.f114960d = i;
        this.f114961e = cls;
    }
}
