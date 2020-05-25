package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.StateDmtTextView;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity_ViewBinding */
public class HeaderDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private HeaderDetailActivity f102128a;

    /* renamed from: b */
    private View f102129b;

    /* renamed from: c */
    private View f102130c;

    /* renamed from: d */
    private View f102131d;

    /* renamed from: e */
    private View f102132e;

    /* renamed from: f */
    private View f102133f;

    public void unbind() {
        HeaderDetailActivity headerDetailActivity = this.f102128a;
        if (headerDetailActivity != null) {
            this.f102128a = null;
            headerDetailActivity.mTitleBar = null;
            headerDetailActivity.mMore = null;
            headerDetailActivity.mBack = null;
            headerDetailActivity.userAvatar = null;
            headerDetailActivity.fixedRatioFrame = null;
            headerDetailActivity.rootView = null;
            headerDetailActivity.mDownloadView = null;
            headerDetailActivity.progressBar = null;
            headerDetailActivity.progressBarBg = null;
            headerDetailActivity.bgView = null;
            headerDetailActivity.editText = null;
            headerDetailActivity.avatarDecoPanel = null;
            headerDetailActivity.mDecoTextView = null;
            headerDetailActivity.mDecoHintView = null;
            headerDetailActivity.mDecoActivityText = null;
            headerDetailActivity.mDecoActivityContainer = null;
            headerDetailActivity.avatorImage = null;
            this.f102129b.setOnClickListener(null);
            this.f102129b = null;
            this.f102130c.setOnClickListener(null);
            this.f102130c = null;
            this.f102131d.setOnClickListener(null);
            this.f102131d = null;
            this.f102132e.setOnClickListener(null);
            this.f102132e = null;
            this.f102133f.setOnClickListener(null);
            this.f102133f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public HeaderDetailActivity_ViewBinding(final HeaderDetailActivity headerDetailActivity, View view) {
        this.f102128a = headerDetailActivity;
        headerDetailActivity.mTitleBar = Utils.findRequiredView(view, R.id.d10, "field 'mTitleBar'");
        View findRequiredView = Utils.findRequiredView(view, R.id.b2h, "field 'mMore' and method 'onMoreClick'");
        headerDetailActivity.mMore = findRequiredView;
        this.f102129b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onMoreClick();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ay9, "field 'mBack' and method 'onBackClick'");
        headerDetailActivity.mBack = (AutoRTLImageView) Utils.castView(findRequiredView2, R.id.ay9, "field 'mBack'", AutoRTLImageView.class);
        this.f102130c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onBackClick();
            }
        });
        headerDetailActivity.userAvatar = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.dm7, "field 'userAvatar'", RemoteImageView.class);
        headerDetailActivity.fixedRatioFrame = (FixedRatioFrameLayout) Utils.findRequiredViewAsType(view, R.id.ajo, "field 'fixedRatioFrame'", FixedRatioFrameLayout.class);
        headerDetailActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cfl, "field 'rootView'", ViewGroup.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b05, "field 'mDownloadView' and method 'saveBitmap'");
        headerDetailActivity.mDownloadView = (ImageView) Utils.castView(findRequiredView3, R.id.b05, "field 'mDownloadView'", ImageView.class);
        this.f102131d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.saveBitmap();
            }
        });
        headerDetailActivity.progressBar = (ImageView) Utils.findRequiredViewAsType(view, R.id.b3b, "field 'progressBar'", ImageView.class);
        headerDetailActivity.progressBarBg = Utils.findRequiredView(view, R.id.b3c, "field 'progressBarBg'");
        headerDetailActivity.bgView = Utils.findRequiredView(view, R.id.jv, "field 'bgView'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.d9o, "field 'editText' and method 'editProfile'");
        headerDetailActivity.editText = (TextView) Utils.castView(findRequiredView4, R.id.d9o, "field 'editText'", TextView.class);
        this.f102132e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.editProfile();
            }
        });
        headerDetailActivity.avatarDecoPanel = Utils.findRequiredView(view, R.id.ht, "field 'avatarDecoPanel'");
        View findRequiredView5 = Utils.findRequiredView(view, R.id.hu, "field 'mDecoTextView' and method 'onSetSameClicked'");
        headerDetailActivity.mDecoTextView = (StateDmtTextView) Utils.castView(findRequiredView5, R.id.hu, "field 'mDecoTextView'", StateDmtTextView.class);
        this.f102133f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                headerDetailActivity.onSetSameClicked();
            }
        });
        headerDetailActivity.mDecoHintView = (TextView) Utils.findRequiredViewAsType(view, R.id.hv, "field 'mDecoHintView'", TextView.class);
        headerDetailActivity.mDecoActivityText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dyc, "field 'mDecoActivityText'", DmtTextView.class);
        headerDetailActivity.mDecoActivityContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.dya, "field 'mDecoActivityContainer'", RelativeLayout.class);
        headerDetailActivity.avatorImage = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.dyb, "field 'avatorImage'", RemoteImageView.class);
    }
}
