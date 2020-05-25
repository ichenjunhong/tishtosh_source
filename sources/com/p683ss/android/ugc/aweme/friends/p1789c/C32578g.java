package com.p683ss.android.ugc.aweme.friends.p1789c;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p683ss.android.ugc.aweme.friends.model.SummonFriendSearchModel;

/* renamed from: com.ss.android.ugc.aweme.friends.c.g */
public final class C32578g extends C26851b<SummonFriendSearchModel, C32569b> {

    /* renamed from: a */
    public String f84807a = "";

    public C32578g() {
        mo54799a(new SummonFriendSearchModel());
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        if (this.f70701g != null && ((SummonFriendSearchModel) this.f70700f).mIsRefresh) {
            ((C32569b) this.f70701g).mo65890b();
        }
    }

    /* renamed from: e */
    public final boolean mo65906e() {
        SummonFriendList data = ((SummonFriendSearchModel) mo54803n()).getData();
        if (data == null) {
            return false;
        }
        return data.hasMore;
    }

    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        SummonFriendList data = ((SummonFriendSearchModel) mo54803n()).getData();
        if (data != null) {
            if (data.requestId == null) {
                this.f84807a = "";
            } else {
                this.f84807a = data.requestId;
            }
            C29981aa.m70153a().mo60162a(this.f84807a, data.logPbBean);
            if (this.f70701g != null) {
                ((C32569b) this.f70701g).mo65889a(data.items, data.keyword);
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70701g != null) {
            ((C32569b) this.f70701g).mo65891d(exc);
        }
    }
}
