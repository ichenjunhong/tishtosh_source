package com.p683ss.android.ugc.aweme.p2377ug.guide;

import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.guide.C30286i;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.panel.C30597ae;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.g */
public final class C47461g implements C42247b {

    /* renamed from: a */
    private final C30597ae f119722a;

    /* renamed from: b */
    private final C42245a f119723b;

    /* renamed from: a */
    public final void mo75532a() {
    }

    /* renamed from: b */
    public final void mo75533b() {
        this.f119722a.mo60517ai();
    }

    public C47461g(C30597ae aeVar, C42245a aVar) {
        C52711k.m112240b(aeVar, "panel");
        C52711k.m112240b(aVar, "dialogShowingManager");
        this.f119722a = aeVar;
        this.f119723b = aVar;
    }

    /* renamed from: a */
    public final boolean mo94737a(boolean z, Aweme aweme) {
        String str;
        if (!m102814b(z, aweme)) {
            return false;
        }
        C30286i a = C30286i.m71202a();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        a.mo60689b(str);
        C47462h.f119724a.mo94740b();
        C42247b bVar = this;
        this.f119723b.mo86221f(bVar);
        this.f119723b.mo86223g(bVar);
        this.f119722a.mo60516ah();
        return true;
    }

    /* renamed from: b */
    private final boolean m102814b(boolean z, Aweme aweme) {
        if ((!z || !C47462h.f119724a.mo94741c()) && aweme != null && !C26503d.m64061d(aweme) && !this.f119723b.mo86218d() && !this.f119723b.mo86220e() && !this.f119723b.mo86222f() && C47462h.f119724a.mo94742d() && C47462h.f119724a.mo94738a() && !C47462h.f119724a.mo94743f()) {
            return true;
        }
        return false;
    }
}
