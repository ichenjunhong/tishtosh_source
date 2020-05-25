package com.p683ss.android.ugc.aweme.common.p1590b;

import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.lang.reflect.Type;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.b.a */
public final class C26852a<T> implements C26854c<String, T> {
    /* renamed from: a */
    public final /* synthetic */ Object mo54805a(Object obj, Type type) {
        String str = (String) obj;
        C52711k.m112240b(str, "source");
        C52711k.m112240b(type, "type");
        C17971f D = C39629l.m88232a().mo58566D();
        C17956a a = C17956a.m44007a(type);
        C52711k.m112236a((Object) a, "TypeToken.get(type)");
        return D.mo34885a(str, a.f49843c);
    }
}
