package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.following.p1768a.C31993b;
import com.p683ss.android.ugc.aweme.following.p1769b.C32006a;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowingAdapter;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerListFragment */
public class FollowerListFragment extends C32352x {

    /* renamed from: a */
    public C32006a f83639a;
    ImageView imgAddFriends;
    View viewFansDivider;

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final int mo65234i() {
        return R.layout.no;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo65235j() {
        super.mo65235j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo65236k() {
        return "fans_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26876b mo65243q() {
        return this.f83639a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo65237l() {
        return mo65240o() ? R.drawable.aqy : R.drawable.aqy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo65238m() {
        return mo65240o() ? R.string.b5a : R.string.b5a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo65239n() {
        if (mo65240o()) {
            return R.string.b5b;
        }
        return R.string.b5c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo65242p() {
        if (mo65240o()) {
            return R.string.b58;
        }
        return R.string.b59;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo65240o() {
        return C20902b.m53242a().getCurUserId().equals(this.f84222l.getUid());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo65233h() {
        this.f83639a = new C32006a();
        this.f83639a.mo54800a(this);
        this.f83639a.mo54799a(new C31993b(this.f84222l.getUid(), this.f84222l.getSecUid()));
    }

    public void onViewClicked() {
        int i;
        if (getActivity() instanceof FollowingFollowerActivity) {
            i = ((FollowingFollowerActivity) getActivity()).f83644b;
        } else {
            i = 0;
        }
        Intent addFriendsActivityIntent = I18nBridgeService.getBridgeService_Monster().getAddFriendsActivityIntent(getActivity(), i, 6, "", "fans");
        if (addFriendsActivityIntent != null) {
            startActivity(addFriendsActivityIntent);
            if (getActivity() instanceof FollowingFollowerActivity) {
                ((FollowingFollowerActivity) getActivity()).mo65244a();
            }
        }
        C26890h.m65011a("click_add_friends", C23089d.m56640a().mo47829a("enter_from", "fans").f61491a);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        super.mo47025b(exc);
        if (C22971a.m56490a((Throwable) exc) instanceof C23459a) {
            FollowingAdapter followingAdapter = this.f84216b;
            if (followingAdapter.f63324c != null) {
                C23751c.f63322a++;
                followingAdapter.f63324c = null;
                followingAdapter.notifyItemRemoved(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo19167b(View view) {
        String str = (String) SharePrefCache.inst().getSyncToTTUrl().mo47782d();
        Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", true);
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtras(bundle);
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        User user = this.f84222l.getUser();
        if (user != null) {
            if (C40211ae.m89448a(user)) {
                this.f84218d.setBackgroundColor(C0726c.m2098c(getContext(), R.color.a3i));
                this.f84218d.getEndText().setVisibility(0);
            } else {
                this.f84218d.getEndText().setVisibility(8);
                this.viewFansDivider.setVisibility(8);
            }
            if (mo65240o()) {
                this.imgAddFriends.setVisibility(0);
                this.f84218d.getEndText().setVisibility(8);
            } else {
                this.imgAddFriends.setVisibility(8);
            }
        } else {
            this.f84218d.getEndText().setVisibility(8);
            C23729p.m58261a(!C47915gg.m103651b(), this.imgAddFriends);
        }
        C47849eh.m103498b(this.f84219e);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f84221k = (SwipeRefreshLayout) onCreateView.findViewById(R.id.caw);
        return onCreateView;
    }
}
