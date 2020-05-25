package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.g */
public final /* synthetic */ class C30258g implements C1710e {

    /* renamed from: a */
    private final CityBean f79045a;

    public C30258g(CityBean cityBean) {
        this.f79045a = cityBean;
    }

    public final void accept(Object obj) {
        CityBean cityBean = this.f79045a;
        String str = (String) obj;
        String str2 = "";
        if (cityBean != null) {
            try {
                str2 = C47760cd.m103385a(cityBean);
            } catch (Exception e) {
                C23088c a = C23088c.m56631a();
                a.mo47824a("poi_class_code", C23198ae.f61671a);
                StringBuilder sb = new StringBuilder("saveCurrentCity:");
                sb.append(e.getMessage());
                a.mo47824a("err_msg", sb.toString());
                C30228f.m70976a(a.mo47825b());
            }
        }
        C30228f.m70985i().storeString("current_city", str2);
    }
}
