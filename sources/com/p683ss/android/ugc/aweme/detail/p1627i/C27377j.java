package com.p683ss.android.ugc.aweme.detail.p1627i;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.model.C39104aj;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.i.j */
public final class C27377j extends C27370d<C39104aj, Aweme> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final List<Aweme> mo55858e() {
        C39104aj ajVar = (C39104aj) this.f70700f;
        if (ajVar != null) {
            List<Aweme> items = ajVar.getItems();
            if (items != null) {
                return items;
            }
        }
        return new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List<Aweme> mo55859f() {
        C39104aj ajVar = (C39104aj) this.f70700f;
        if (ajVar != null) {
            List<Aweme> items = ajVar.getItems();
            if (items != null) {
                return items;
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: b */
    public final /* synthetic */ String mo55857b(Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme == null) {
            return "";
        }
        String m = C23198ae.m56877m(aweme);
        C52711k.m112236a((Object) m, "MobUtils.getAid(data ?: return \"\")");
        return m;
    }
}
