package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.recommend;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.f */
public final class C34659f extends C26851b<C34655e, C34652b> {
    /* renamed from: g */
    private final boolean m78633g() {
        if (this.f70700f == null || this.f70701g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (m78633g()) {
            if (((C34655e) this.f70700f).f89278d) {
                ((C34652b) this.f70701g).mo72706b();
            } else {
                ((C34652b) this.f70701g).mo72701a();
            }
        }
    }

    /* renamed from: e */
    public final void mo72723e() {
        C34655e eVar = (C34655e) this.f70700f;
        if (eVar != null) {
            eVar.f89276b = 0;
            eVar.f89278d = false;
            eVar.mo72720a(20);
        }
        mo44834R_();
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (m78633g()) {
            if (((C34655e) this.f70700f).f89278d) {
                C34652b bVar = (C34652b) this.f70701g;
                C26832a aVar = this.f70700f;
                C52711k.m112236a((Object) aVar, "mModel");
                bVar.mo72707b((C34654d) ((C34655e) aVar).getData());
                return;
            }
            C34652b bVar2 = (C34652b) this.f70701g;
            C26832a aVar2 = this.f70700f;
            C52711k.m112236a((Object) aVar2, "mModel");
            bVar2.mo72703a((C34654d) ((C34655e) aVar2).getData());
        }
    }

    /* renamed from: f */
    public final void mo72724f() {
        C34655e eVar = (C34655e) this.f70700f;
        if (eVar != null) {
            boolean z = true;
            eVar.f89278d = true;
            Collection collection = eVar.f89277c;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                C23566n.m57766a().mo48750a(eVar.mHandler, new C34657b(eVar), 0);
            } else {
                eVar.mo72720a(20);
            }
        }
        mo44834R_();
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (m78633g()) {
            if (((C34655e) this.f70700f).f89278d) {
                ((C34652b) this.f70701g).mo72708b(exc);
            } else {
                ((C34652b) this.f70701g).mo72704a(exc);
            }
        }
    }

    /* renamed from: a */
    public final void mo72722a(User user) {
        C52711k.m112240b(user, "user");
        C34655e eVar = (C34655e) this.f70700f;
        if (eVar != null) {
            C52711k.m112240b(user, "user");
            eVar.mo72719a().dislikeRecommend(user.getUid(), user.getSecUid());
        }
    }
}
