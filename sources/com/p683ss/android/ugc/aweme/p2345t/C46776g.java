package com.p683ss.android.ugc.aweme.p2345t;

import android.view.View;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46194l;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.t.g */
public final class C46776g {

    /* renamed from: a */
    public static final String f118133a = "ProximaNova-Semibold";

    /* renamed from: com.ss.android.ugc.aweme.t.g$a */
    static final class C46777a extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45004a f118134a;

        C46777a(C45004a aVar) {
            this.f118134a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f118134a.mo91312R();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.t.g$b */
    public static final class C46778b implements C45805a {
        C46778b() {
        }
    }

    /* renamed from: a */
    public static final C45805a m101581a() {
        return new C46778b();
    }

    /* renamed from: a */
    public static final C46255p m101582a(C45004a aVar) {
        C52711k.m112240b(aVar, "cameraApiComponent");
        C46255p pVar = new C46255p(0, 0, new C46194l(0, new C46777a(aVar), 1, null), 0, 0, 0, C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioEffectNewTabUi), false, true, 187, null);
        return pVar;
    }
}
