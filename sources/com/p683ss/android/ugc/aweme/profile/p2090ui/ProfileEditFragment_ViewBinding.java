package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment_ViewBinding */
public class ProfileEditFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileEditFragment f102442a;

    /* renamed from: b */
    private View f102443b;

    /* renamed from: c */
    private View f102444c;

    /* renamed from: d */
    private View f102445d;

    /* renamed from: e */
    private View f102446e;

    /* renamed from: f */
    private View f102447f;

    /* renamed from: g */
    private View f102448g;

    /* renamed from: h */
    private View f102449h;

    /* renamed from: i */
    private View f102450i;

    /* renamed from: j */
    private View f102451j;

    /* renamed from: k */
    private View f102452k;

    /* renamed from: l */
    private View f102453l;

    public void unbind() {
        ProfileEditFragment profileEditFragment = this.f102442a;
        if (profileEditFragment != null) {
            this.f102442a = null;
            profileEditFragment.mHeaderImage = null;
            profileEditFragment.mDmtStatusView = null;
            profileEditFragment.mHintArea = null;
            profileEditFragment.personalLinkArea = null;
            profileEditFragment.personalLink = null;
            profileEditFragment.mNickNameLayout = null;
            profileEditFragment.mUsernameLayout = null;
            profileEditFragment.mBioLayout = null;
            profileEditFragment.mWebsiteLayout = null;
            profileEditFragment.mMailLayout = null;
            profileEditFragment.authInstagramName = null;
            profileEditFragment.authYoutubeName = null;
            profileEditFragment.authTwitterName = null;
            this.f102443b.setOnClickListener(null);
            this.f102443b = null;
            this.f102444c.setOnClickListener(null);
            this.f102444c = null;
            this.f102445d.setOnClickListener(null);
            this.f102445d = null;
            this.f102446e.setOnClickListener(null);
            this.f102446e = null;
            this.f102447f.setOnClickListener(null);
            this.f102447f = null;
            this.f102448g.setOnClickListener(null);
            this.f102448g = null;
            this.f102449h.setOnClickListener(null);
            this.f102449h = null;
            this.f102450i.setOnClickListener(null);
            this.f102450i = null;
            this.f102451j.setOnClickListener(null);
            this.f102451j = null;
            this.f102452k.setOnClickListener(null);
            this.f102452k = null;
            this.f102453l.setOnClickListener(null);
            this.f102453l = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileEditFragment_ViewBinding(final ProfileEditFragment profileEditFragment, View view) {
        this.f102442a = profileEditFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.ao6, "field 'mHeaderImage' and method 'editHeaderImage'");
        profileEditFragment.mHeaderImage = (AnimatedImageView) Utils.castView(findRequiredView, R.id.ao6, "field 'mHeaderImage'", AnimatedImageView.class);
        this.f102443b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editHeaderImage(view);
            }
        });
        profileEditFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
        profileEditFragment.mHintArea = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ed_, "field 'mHintArea'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ek_, "field 'personalLinkArea' and method 'edit'");
        profileEditFragment.personalLinkArea = (LinearLayout) Utils.castView(findRequiredView2, R.id.ek_, "field 'personalLinkArea'", LinearLayout.class);
        this.f102444c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.edit(view);
            }
        });
        profileEditFragment.personalLink = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.eo8, "field 'personalLink'", DmtTextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bqt, "field 'mNickNameLayout' and method 'editNickName'");
        profileEditFragment.mNickNameLayout = (CommonItemView) Utils.castView(findRequiredView3, R.id.bqt, "field 'mNickNameLayout'", CommonItemView.class);
        this.f102445d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editNickName(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.do2, "field 'mUsernameLayout' and method 'editUserName'");
        profileEditFragment.mUsernameLayout = (CommonItemView) Utils.castView(findRequiredView4, R.id.do2, "field 'mUsernameLayout'", CommonItemView.class);
        this.f102446e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editUserName(view);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, R.id.kz, "field 'mBioLayout' and method 'editBio'");
        profileEditFragment.mBioLayout = (CommonItemView) Utils.castView(findRequiredView5, R.id.kz, "field 'mBioLayout'", CommonItemView.class);
        this.f102447f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editBio(view);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, R.id.dui, "field 'mWebsiteLayout' and method 'editWebsite'");
        profileEditFragment.mWebsiteLayout = (CommonItemView) Utils.castView(findRequiredView6, R.id.dui, "field 'mWebsiteLayout'", CommonItemView.class);
        this.f102448g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editWebsite(view);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, R.id.bjq, "field 'mMailLayout' and method 'editMail'");
        profileEditFragment.mMailLayout = (CommonItemView) Utils.castView(findRequiredView7, R.id.bjq, "field 'mMailLayout'", CommonItemView.class);
        this.f102449h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editMail(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.au9, "field 'authInstagramName' and method 'onBindInstagram'");
        profileEditFragment.authInstagramName = (CommonItemView) Utils.castView(findRequiredView8, R.id.au9, "field 'authInstagramName'", CommonItemView.class);
        this.f102450i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindInstagram(view);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.dw5, "field 'authYoutubeName' and method 'onBindYouTube'");
        profileEditFragment.authYoutubeName = (CommonItemView) Utils.castView(findRequiredView9, R.id.dw5, "field 'authYoutubeName'", CommonItemView.class);
        this.f102451j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindYouTube(view);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, R.id.dk0, "field 'authTwitterName' and method 'onBindTwitter'");
        profileEditFragment.authTwitterName = (CommonItemView) Utils.castView(findRequiredView10, R.id.dk0, "field 'authTwitterName'", CommonItemView.class);
        this.f102452k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.onBindTwitter(view);
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, R.id.f5t, "method 'editUserName'");
        this.f102453l = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileEditFragment.editUserName(view);
            }
        });
    }
}
