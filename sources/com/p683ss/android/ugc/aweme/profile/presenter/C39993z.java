package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.z */
public final class C39993z extends C37717b<RecommendCommonUserModel, C39981o> implements C26874f {
    /* renamed from: a */
    public final void mo81920a(int i, String str, int i2, int i3, String str2, int i4, String str3) {
        mo81918a(i, str, i2, 0, i3, null, i4, str3, null);
    }

    /* renamed from: a */
    public final void mo81919a(int i, String str, int i2, int i3, String str2, int i4) {
        m88832a(30, str, i2, 0, i3, (String) null, i4);
    }

    /* renamed from: a */
    public final void mo81921a(User user) {
        if (this.f96123b != null) {
            ((RecommendCommonUserModel) this.f96123b).removeData(user);
        }
    }

    /* renamed from: a */
    public final void mo81922a(List<User> list) {
        if (this.f96123b != null) {
            ((RecommendCommonUserModel) this.f96123b).setData(list);
        }
    }

    /* renamed from: d */
    public final RecommendList mo81924d() {
        if (this.f96123b == null) {
            return null;
        }
        return (RecommendList) ((RecommendCommonUserModel) this.f96123b).mData;
    }

    /* renamed from: e */
    public final void mo81925e() {
        if (this.f96123b != null) {
            ((RecommendCommonUserModel) this.f96123b).resetShownUserIds();
        }
    }

    /* renamed from: f */
    public final int mo81926f() {
        if (this.f96123b != null) {
            return ((RecommendCommonUserModel) this.f96123b).newUserCount;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo44838b() {
        C37940g.m84832a().mo77417c();
        if (((RecommendCommonUserModel) this.f96123b).mQueryType == 1) {
            ((C39981o) this.f96124c).mo60634a((RecommendList) ((RecommendCommonUserModel) this.f96123b).mData);
            return;
        }
        if (((RecommendCommonUserModel) this.f96123b).mQueryType == 4) {
            ((C39981o) this.f96124c).mo60638b((RecommendList) ((RecommendCommonUserModel) this.f96123b).mData);
        }
    }

    /* renamed from: a */
    public final void mo81914a() {
        if (this.f96123b != null) {
            ((RecommendCommonUserModel) this.f96123b).removeFollowedUser();
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        ((C39981o) this.f96124c).mo60635a(exc);
    }

    /* renamed from: a */
    public final int mo81913a(String str) {
        if (this.f96123b != null) {
            return ((RecommendCommonUserModel) this.f96123b).getUserImprOrder(str);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo81915a(int i) {
        ((RecommendCommonUserModel) this.f96123b).recommendUserDialogLoadMore(30);
    }

    public C39993z(RecommendCommonUserModel recommendCommonUserModel, C39981o oVar) {
        super(recommendCommonUserModel, oVar);
        ((RecommendCommonUserModel) this.f96123b).addNotifyListener(this);
    }

    /* renamed from: b */
    public final void mo81923b(int i, String str, int i2, int i3, int i4, int i5) {
        m88831a(i, str, i2, i3, i4, i5, (String) null);
    }

    /* renamed from: a */
    public final void mo81916a(int i, String str, int i2, int i3, int i4, int i5) {
        ((RecommendCommonUserModel) this.f96123b).fetchData(30, str, 2, 0, i3, i4, null, i5);
    }

    /* renamed from: a */
    public final void mo81917a(int i, String str, int i2, int i3, int i4, String str2) {
        m88831a(i, str, i2, 0, i3, i4, str2);
    }

    /* renamed from: a */
    private void m88832a(int i, String str, int i2, int i3, int i4, String str2, int i5) {
        mo81918a(i, str, i2, 0, i4, str2, i5, null, null);
    }

    /* renamed from: a */
    private void m88831a(int i, String str, int i2, int i3, int i4, int i5, String str2) {
        ((RecommendCommonUserModel) this.f96123b).loadMore(i, str, i2, i3, i4, i5, str2, null);
    }

    /* renamed from: a */
    public final void mo81918a(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4) {
        ((RecommendCommonUserModel) this.f96123b).refreshRecommendUser(i, str, i2, i3, i4, str2, i5, str3, str4, null);
    }
}
