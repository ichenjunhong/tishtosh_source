package com.p683ss.android.ugc.aweme.followrequest.p1772b;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39974j;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.followrequest.b.a */
public final class C32371a extends C26851b<C39974j, C32372b> {
    /* renamed from: g */
    private final boolean m74706g() {
        if (this.f70700f == null || this.f70701g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m74707h() {
        C39974j jVar = (C39974j) this.f70700f;
        if (jVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) jVar.getData();
            if (followRequestResponse != null) {
                return followRequestResponse.hasMore;
            }
        }
        return false;
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (m74706g()) {
            if (((C39974j) this.f70700f).f101917c) {
                ((C32372b) this.f70701g).mo65488a(true);
            } else {
                ((C32372b) this.f70701g).mo65488a(false);
            }
        }
    }

    /* renamed from: e */
    public final void mo65500e() {
        C39974j jVar = (C39974j) this.f70700f;
        if (jVar != null) {
            jVar.f101915a = System.currentTimeMillis() / 1000;
            jVar.f101916b = 1;
            jVar.f101918d = false;
            jVar.f101917c = false;
            jVar.mo81881a(jVar.f101915a, jVar.f101916b, 20);
        }
        mo44834R_();
    }

    /* renamed from: f */
    public final void mo65501f() {
        long j;
        C39974j jVar = (C39974j) this.f70700f;
        if (jVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) jVar.getData();
            if (followRequestResponse != null) {
                j = followRequestResponse.minTime;
            } else {
                j = System.currentTimeMillis() / 1000;
            }
            jVar.f101915a = j;
            jVar.f101916b = 1;
            jVar.f101918d = false;
            jVar.f101917c = true;
            jVar.mo81881a(jVar.f101915a, jVar.f101916b, 20);
        }
        mo44834R_();
    }

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        if (m74706g()) {
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            List<User> list = ((FollowRequestResponse) ((C39974j) aVar).getData()).userRequestList;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((C39974j) this.f70700f).f101917c) {
                C32372b bVar = (C32372b) this.f70701g;
                C52711k.m112236a((Object) list, "list");
                if (m74707h() && !z) {
                    z2 = true;
                }
                bVar.mo65487a(list, true, z2);
            } else if (z) {
                ((C32372b) this.f70701g).mo65490c();
            } else if (((C39974j) this.f70700f).f101918d) {
                C52711k.m112236a((Object) list, "list");
                C26832a aVar2 = this.f70700f;
                C52711k.m112236a((Object) aVar2, "mModel");
                ((C39974j) aVar2).getData();
            } else {
                C32372b bVar2 = (C32372b) this.f70701g;
                C52711k.m112236a((Object) list, "list");
                bVar2.mo65487a(list, false, m74707h());
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (m74706g()) {
            if (((C39974j) this.f70700f).f101917c) {
                ((C32372b) this.f70701g).mo65486a(exc, true);
            } else {
                ((C32372b) this.f70701g).mo65486a(exc, false);
            }
        }
    }
}
