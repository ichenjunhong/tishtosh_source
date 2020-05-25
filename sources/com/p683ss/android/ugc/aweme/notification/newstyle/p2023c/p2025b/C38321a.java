package com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2025b;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2024a.C38318a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.c.b.a */
public final class C38321a extends C26851b<C38318a, C38322b> {
    /* renamed from: h */
    private final boolean m85606h() {
        if (this.f70700f == null || this.f70701g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo78274e() {
        C38318a aVar = (C38318a) this.f70700f;
        if (aVar != null) {
            aVar.mo78271a();
        }
    }

    /* renamed from: i */
    private boolean m85607i() {
        C38318a aVar = (C38318a) this.f70700f;
        if (aVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) aVar.getData();
            if (followRequestResponse != null) {
                return followRequestResponse.hasMore;
            }
        }
        return false;
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (m85606h()) {
            if (((C38318a) this.f70700f).f97537c) {
                ((C38322b) this.f70701g).mo78221a(true);
            } else {
                ((C38322b) this.f70701g).mo78221a(false);
            }
        }
    }

    /* renamed from: f */
    public final void mo78275f() {
        C38318a aVar = (C38318a) this.f70700f;
        if (aVar != null) {
            aVar.f97535a = System.currentTimeMillis() / 1000;
            aVar.f97536b = 1;
            aVar.f97538d = false;
            aVar.f97537c = false;
            aVar.mo78272a(aVar.f97535a, aVar.f97536b, 20);
        }
        mo44834R_();
    }

    /* renamed from: g */
    public final void mo78276g() {
        long j;
        C38318a aVar = (C38318a) this.f70700f;
        if (aVar != null) {
            FollowRequestResponse followRequestResponse = (FollowRequestResponse) aVar.getData();
            if (followRequestResponse != null) {
                j = followRequestResponse.minTime;
            } else {
                j = System.currentTimeMillis() / 1000;
            }
            aVar.f97535a = j;
            aVar.f97536b = 1;
            aVar.f97538d = false;
            aVar.f97537c = true;
            aVar.mo78272a(aVar.f97535a, aVar.f97536b, 20);
        }
        mo44834R_();
    }

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        if (m85606h()) {
            C26832a aVar = this.f70700f;
            C52711k.m112236a((Object) aVar, "mModel");
            List<User> list = ((FollowRequestResponse) ((C38318a) aVar).getData()).userRequestList;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((C38318a) this.f70700f).f97537c) {
                C38322b bVar = (C38322b) this.f70701g;
                C52711k.m112236a((Object) list, "list");
                if (m85607i() && !z) {
                    z2 = true;
                }
                bVar.mo78220a(list, true, z2);
            } else if (z) {
                ((C38322b) this.f70701g).mo78222b();
            } else if (((C38318a) this.f70700f).f97538d) {
                C38322b bVar2 = (C38322b) this.f70701g;
                C52711k.m112236a((Object) list, "list");
                C26832a aVar2 = this.f70700f;
                C52711k.m112236a((Object) aVar2, "mModel");
                bVar2.mo78219a(list, ((FollowRequestResponse) ((C38318a) aVar2).getData()).total);
            } else {
                C38322b bVar3 = (C38322b) this.f70701g;
                C52711k.m112236a((Object) list, "list");
                bVar3.mo78220a(list, false, m85607i());
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (m85606h()) {
            if (((C38318a) this.f70700f).f97537c) {
                ((C38322b) this.f70701g).mo78218a(exc, true);
            } else {
                ((C38322b) this.f70701g).mo78218a(exc, false);
            }
        }
    }
}
