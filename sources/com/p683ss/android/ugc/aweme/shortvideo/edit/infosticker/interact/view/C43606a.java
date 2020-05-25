package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43456a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.a */
public final class C43606a extends FrameLayout {

    /* renamed from: a */
    private View f110441a;

    /* renamed from: b */
    private View f110442b;

    /* renamed from: c */
    private AvatarWithBorderView f110443c;

    /* renamed from: d */
    private CircleImageView f110444d;

    /* renamed from: e */
    private CircleImageView f110445e;

    /* renamed from: f */
    private DmtTextView f110446f;

    /* renamed from: g */
    private DmtTextView f110447g;

    public final View getGroupBottomLine() {
        return this.f110442b;
    }

    public final View getGroupRightLine() {
        return this.f110441a;
    }

    public final CircleImageView getIvOriginMusicCover() {
        return this.f110445e;
    }

    public final AvatarWithBorderView getMAvatarView() {
        return this.f110443c;
    }

    public final CircleImageView getMMusicCoverView() {
        return this.f110444d;
    }

    public final DmtTextView getTvMusic() {
        return this.f110447g;
    }

    public final DmtTextView getTvName() {
        return this.f110446f;
    }

    public final void setGroupBottomLine(View view) {
        this.f110442b = view;
    }

    public final void setGroupRightLine(View view) {
        this.f110441a = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        this.f110445e = circleImageView;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        this.f110443c = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        this.f110444d = circleImageView;
    }

    public final void setTvMusic(DmtTextView dmtTextView) {
        this.f110447g = dmtTextView;
    }

    public final void setTvName(DmtTextView dmtTextView) {
        this.f110446f = dmtTextView;
    }

    /* renamed from: a */
    public final void mo88919a(boolean z) {
        int i;
        View view = this.f110441a;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo88920b(boolean z) {
        int i;
        View view = this.f110442b;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
        }
    }

    public C43606a(Context context) {
        UrlModel urlModel;
        C52711k.m112240b(context, "context");
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aur, this, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…w_fake_feed, this, false)");
        this.f110441a = inflate.findViewById(R.id.amr);
        this.f110442b = inflate.findViewById(R.id.amh);
        this.f110443c = (AvatarWithBorderView) inflate.findViewById(R.id.dm3);
        this.f110444d = (CircleImageView) inflate.findViewById(R.id.bo2);
        this.f110445e = (CircleImageView) inflate.findViewById(R.id.bvb);
        this.f110446f = (DmtTextView) inflate.findViewById(R.id.dcn);
        this.f110447g = (DmtTextView) inflate.findViewById(R.id.dcb);
        AvatarWithBorderView avatarWithBorderView = this.f110443c;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setBorderColor(R.color.bs);
        }
        View view = this.f110441a;
        if (view != null) {
            view.setVisibility(4);
        }
        addView(inflate);
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "service");
        User currentUser = baseUserService_Monster.getCurrentUser();
        UrlModel urlModel2 = null;
        if (currentUser != null) {
            urlModel = currentUser.getAvatarThumb();
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            C50181a.m108288a((SimpleDraweeView) this.f110443c, currentUser.getAvatarThumb(), (int) C9432q.m18687b(getContext(), 49.0f), (int) C9432q.m18687b(getContext(), 49.0f));
        } else {
            C50181a.m108286a((SimpleDraweeView) this.f110443c, 2131953301);
        }
        DmtTextView dmtTextView = this.f110446f;
        if (dmtTextView != null) {
            StringBuilder sb = new StringBuilder("@");
            Resources resources = getResources();
            C52711k.m112236a((Object) resources, "resources");
            sb.append(C43456a.m95261a(currentUser, resources));
            dmtTextView.setText(sb.toString());
        }
        SimpleDraweeView simpleDraweeView = this.f110445e;
        if (currentUser != null) {
            urlModel2 = currentUser.getAvatarThumb();
        }
        C50181a.m108288a(simpleDraweeView, urlModel2, 27, 27);
        C50181a.m108286a((SimpleDraweeView) this.f110444d, (int) R.drawable.a7c);
        DmtTextView dmtTextView2 = this.f110447g;
        if (dmtTextView2 != null) {
            C43456a aVar = C43456a.f109843a;
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "context");
            C52711k.m112240b(context2, "context");
            StringBuilder sb2 = new StringBuilder("@");
            Resources resources2 = context2.getResources();
            C52711k.m112236a((Object) resources2, "context.resources");
            sb2.append(C43456a.m95261a(currentUser, resources2));
            sb2.append(" ");
            sb2.append(context2.getResources().getString(R.string.cm_));
            dmtTextView2.setText(sb2.toString());
        }
    }
}
