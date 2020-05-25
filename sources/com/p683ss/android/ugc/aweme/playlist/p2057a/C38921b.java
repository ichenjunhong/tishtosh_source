package com.p683ss.android.ugc.aweme.playlist.p2057a;

import android.support.p043v7.p051e.C1208c.C1212c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.playlist.a.b */
public final class C38921b extends C1212c<Object> {
    /* renamed from: b */
    public final boolean mo3933b(Object obj, Object obj2) {
        C52711k.m112240b(obj, "p0");
        C52711k.m112240b(obj2, "p1");
        return C52711k.m112239a(obj, obj2);
    }

    /* renamed from: a */
    public final boolean mo3932a(Object obj, Object obj2) {
        C52711k.m112240b(obj, "p0");
        C52711k.m112240b(obj2, "p1");
        if (!(obj instanceof Aweme) || !(obj2 instanceof Aweme)) {
            return C52711k.m112239a(obj, obj2);
        }
        return C52711k.m112239a((Object) ((Aweme) obj).getAid(), (Object) ((Aweme) obj2).getAid());
    }
}
