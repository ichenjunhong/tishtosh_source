package com.p683ss.android.ugc.aweme.detail.p1627i;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1442bo.p1443a.C23867a;
import com.p683ss.android.ugc.aweme.p1442bo.p1444b.C23868a;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.i.g */
public final class C27373g extends C27370d<C23868a, C23867a> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<C23867a> mo55858e() {
        C23868a aVar = (C23868a) this.f70700f;
        if (aVar != null) {
            return aVar.getItems();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo55859f() {
        C23868a aVar = (C23868a) this.f70700f;
        if (aVar != null) {
            aVar.getItems();
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo55857b(Object obj) {
        C23867a aVar = (C23867a) obj;
        if (aVar != null) {
            Aweme aweme = aVar.getAweme();
            if (aweme != null) {
                String m = C23198ae.m56877m(aweme);
                C52711k.m112236a((Object) m, "MobUtils.getAid(data?.aweme ?: return \"\")");
                return m;
            }
        }
        return "";
    }
}
