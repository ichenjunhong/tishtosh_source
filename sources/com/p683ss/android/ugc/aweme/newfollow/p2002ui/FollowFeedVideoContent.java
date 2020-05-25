package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.widget.DragView.C26940b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPlayerProgressbar;
import com.p683ss.android.ugc.playerkit.videoview.C50156f;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedVideoContent */
public class FollowFeedVideoContent extends FrameLayout implements C26940b {

    /* renamed from: a */
    private C50160i f96508a;

    /* renamed from: b */
    private C26940b f96509b;
    public ViewGroup mContainer;
    public RemoteImageView mCover;
    public VideoPlayerProgressbar mProgressbar;

    public C26940b getListener() {
        return this.f96509b;
    }

    public C50160i getVideoSurfaceHolder() {
        return this.f96508a;
    }

    public void setListener(C26940b bVar) {
        this.f96509b = bVar;
    }

    public FollowFeedVideoContent(Context context) {
        super(context);
        ButterKnife.bind((Object) this, LayoutInflater.from(context).inflate(R.layout.ue, this, true));
        ViewGroup viewGroup = this.mContainer;
        C50160i iVar = new C50160i();
        iVar.f125678a = new C50156f(viewGroup);
        iVar.mo97949a().setTag(iVar);
        this.f96508a = iVar;
    }

    /* renamed from: a */
    public final void mo54930a(float f, float f2, float f3, float f4) {
        if (this.f96509b != null) {
            this.f96509b.mo54930a(f, f2, f3, f4);
        }
    }
}
