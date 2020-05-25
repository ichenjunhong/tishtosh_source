package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30035aw;
import com.p683ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30476ae;
import com.p683ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.m.ae */
public final class C30476ae extends C37717b<C30035aw, EmptyGuideV2> implements C26874f {
    /* renamed from: a */
    public final void mo60893a() {
        ((C30035aw) this.f96123b).mo60305a();
    }

    /* renamed from: b */
    public final void mo44838b() {
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.f96124c;
        SuperAccountList superAccountList = (SuperAccountList) ((C30035aw) this.f96123b).mData;
        if (emptyGuideV2.f79061b != null) {
            emptyGuideV2.f79061b.mo19209d();
        }
        if (superAccountList == null || superAccountList.getUserList() == null || superAccountList.getUserList().size() <= 0) {
            emptyGuideV2.mo60639c();
            return;
        }
        emptyGuideV2.f79065f = superAccountList.logPb.getImprId();
        ArrayList arrayList = new ArrayList();
        for (UserWithAweme userWithAweme : superAccountList.getUserList()) {
            if (!(userWithAweme == null || userWithAweme.getUser() == null || userWithAweme.getAweme() == null)) {
                arrayList.add(userWithAweme);
            }
        }
        emptyGuideV2.f79063d.setData(arrayList);
        emptyGuideV2.f79063d.f79106c.f79080b = 0;
        emptyGuideV2.f79063d.setOnItemOperationListener(new C40443b() {
            /* renamed from: b */
            public final void mo60646b(User user, int i) {
            }

            /* renamed from: d */
            public final void mo60648d(User user, int i) {
                C37879b.m84577a(user, "enter_profile", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                C37879b.m84579a(EmptyGuideV2.this.f79065f, user);
            }

            /* renamed from: a */
            public final void mo60645a(User user, int i) {
                C37879b.m84577a(user, "delete", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                if (EmptyGuideV2.this.f79066g != null) {
                    ((C30476ae) EmptyGuideV2.this.f79066g).mo60894a(user);
                }
            }

            /* renamed from: c */
            public final void mo60647c(User user, int i) {
                if (user.getFollowStatus() == 0) {
                    C37879b.m84577a(user, "follow", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                    C37879b.m84575a(user);
                    return;
                }
                C37879b.m84577a(user, "follow_cancel", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                C37879b.m84586b(user);
            }
        });
        emptyGuideV2.mo60637b();
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        ((EmptyGuideV2) this.f96124c).mo60635a(exc);
    }

    /* renamed from: a */
    public final int mo60892a(String str) {
        if (this.f96123b == null) {
            return 0;
        }
        C30035aw awVar = (C30035aw) this.f96123b;
        if (awVar.f78402a != null) {
            return awVar.f78402a.indexOf(str);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo60894a(User user) {
        if (this.f96123b != null) {
            C30035aw awVar = (C30035aw) this.f96123b;
            if (awVar.mData != null && !((SuperAccountList) awVar.mData).getUserList().isEmpty()) {
                List<UserWithAweme> userList = ((SuperAccountList) awVar.mData).getUserList();
                userList.remove(user);
                ((SuperAccountList) awVar.mData).userList = userList;
            }
        }
    }

    public C30476ae(C30035aw awVar, EmptyGuideV2 emptyGuideV2) {
        super(awVar, emptyGuideV2);
        ((C30035aw) this.f96123b).addNotifyListener(this);
    }
}
