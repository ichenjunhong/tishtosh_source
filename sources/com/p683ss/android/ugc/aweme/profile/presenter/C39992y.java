package com.p683ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47933n;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.y */
public abstract class C39992y extends C26851b<C26832a<UserResponse>, C39980n> {
    /* renamed from: a */
    public final void mo81911a(User user) {
        mo81912a(user, true);
    }

    /* renamed from: b */
    private static int m88827b(User user) {
        if (C40211ae.m89448a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C39980n) this.f70701g).mo81895b(exc);
        }
    }

    /* renamed from: a */
    public final void mo81912a(User user, boolean z) {
        String str;
        if (this.f70701g != null && ((C39980n) this.f70701g).mo81905e()) {
            ((C39980n) this.f70701g).mo81900c(user);
            if (z) {
                ((C39980n) this.f70701g).mo81893b(user.getFollowingCount());
                ((C39980n) this.f70701g).mo81885a(m88827b(user));
                ((C39980n) this.f70701g).mo81888a(user.getTotalFavorited());
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                ((C39980n) this.f70701g).mo81891a(user.getRemarkName(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            } else {
                ((C39980n) this.f70701g).mo81891a(user.getNickname(), user.getStarBillboardRank(), user.getBrandInfo(), user);
            }
            ((C39980n) this.f70701g).mo81887a(user.getFollowStatus(), user.getSignature());
            ((C39980n) this.f70701g).mo81892a(user.isLive(), C47915gg.m103668q(user), StoryUnreadUtils.hasUnreadStory(user));
            ((C39980n) this.f70701g).mo81889a(C47933n.m103706a(user));
            ((C39980n) this.f70701g).mo81899c(user.getAwemeCount());
            user.isWithFusionShopEntry();
            user.isWithNewGoods();
            user.isWithCommerceEntry();
            ((C39980n) this.f70701g).mo81902d(user.getFavoritingCount());
            user.getDongtaiCount();
            user.getStoryCount();
            if (user.getOriginalMusician() != null) {
                user.getOriginalMusician().getMusicCount();
            }
            if (user.getEffectArtistDetail() != null) {
                user.getEffectArtistDetail().getTotal();
            }
            ((C39980n) this.f70701g).mo81894b(user);
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                user.getWeiboVerify();
            } else {
                user.getCustomVerify();
            }
            user.getEnterpriseVerifyReason();
            C39980n nVar = (C39980n) this.f70701g;
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            nVar.mo81896b(str);
            user.isBindedWeibo();
            ((C39980n) this.f70701g).mo81903d(user);
            if (C47915gg.m103664m(user)) {
                ((C39980n) this.f70701g).mo81886a(3, user.getFollowerStatus());
                ((C39980n) this.f70701g).mo81897b(false);
            } else {
                ((C39980n) this.f70701g).mo81886a(user.getFollowStatus(), user.getFollowerStatus());
                ((C39980n) this.f70701g).mo81897b(true);
            }
            user.hasMedal();
            ((C39980n) this.f70701g).mo81904e(user);
            user.getCustomVerify();
            ((C39980n) this.f70701g).mo81898c();
        }
    }
}
