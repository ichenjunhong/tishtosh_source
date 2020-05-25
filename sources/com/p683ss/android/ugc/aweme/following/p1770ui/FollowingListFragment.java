package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.following.p1768a.C31996d;
import com.p683ss.android.ugc.aweme.following.p1769b.C32007b;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37922a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37920f.C37923b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowingListFragment */
public class FollowingListFragment extends C32352x {

    /* renamed from: a */
    public C32007b f83652a;
    ImageView imgAddFriends;
    NoticeView mEnablePushNoticeView;
    View mVSpit;

    /* renamed from: o */
    private boolean f83653o = true;

    /* renamed from: p */
    private C37920f f83654p;

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final int mo65234i() {
        return R.layout.nq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo65236k() {
        return "following_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26876b mo65243q() {
        return this.f83652a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo65237l() {
        return mo65240o() ? R.drawable.aqy : R.drawable.aqy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo65238m() {
        return mo65240o() ? R.string.b5j : R.string.b5j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo65239n() {
        if (mo65240o()) {
            return R.string.b5k;
        }
        return R.string.b5l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo65242p() {
        if (mo65240o()) {
            return R.string.b4s;
        }
        return R.string.b4t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo65240o() {
        return C20902b.m53242a().getCurUserId().equals(this.f84222l.getUid());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo65233h() {
        this.f83652a = new C32007b();
        this.f83652a.mo54800a(this);
        this.f83652a.mo54799a(new C31996d(this.f84222l.getUid(), this.f84222l.getSecUid(), mo65240o()));
    }

    public void onViewClicked() {
        int i;
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f83644b;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = I18nBridgeService.getBridgeService_Monster().getAddFriendsActivityIntent(getActivity(), i, 5, "", "following");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).mo65244a();
            }
        }
        C26890h.m65011a("click_add_friends", C23089d.m56640a().mo47829a("enter_from", "following").f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo65235j() {
        super.mo65235j();
        if (this.mVSpit != null) {
            this.mVSpit.setVisibility(8);
        }
        if (!mo65240o() || C47915gg.m103651b()) {
            this.imgAddFriends.setVisibility(8);
        }
        this.mEnablePushNoticeView.setIconImage((int) R.drawable.d20);
        SpannableString spannableString = new SpannableString(C23723j.m58219b(R.string.gft));
        String b = C23723j.m58219b(R.string.gfu);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(" ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        if (getContext() != null) {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.c)), 0, spannableString.length(), 34);
            spannableStringBuilder.append(spannableString);
        }
        this.mEnablePushNoticeView.setTitleText((CharSequence) spannableStringBuilder);
        this.f83654p = new C37920f(this.mEnablePushNoticeView, new C37923b() {
            /* renamed from: a */
            public final void mo65249a(Context context) {
                C47818dm.m103459b(context);
            }

            /* renamed from: b */
            public final boolean mo65250b(Context context) {
                return C47819dn.m103457a(context);
            }
        });
        this.f83654p.f96571f = C37922a.Follow;
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        super.mo47018a(list, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f84221k = (SwipeRefreshLayout) onCreateView.findViewById(R.id.caw);
        return onCreateView;
    }
}
