package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p683ss.android.ugc.aweme.common.p1589a.C26833a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.a */
public abstract class C30009a extends C26833a {

    /* renamed from: h */
    public Context f78369h;

    /* renamed from: a */
    public abstract void mo50301a();

    /* renamed from: a */
    public abstract void mo58496a(float f);

    /* renamed from: d */
    public abstract void mo58500d(boolean z);

    /* renamed from: l */
    public abstract String mo58501l();

    /* renamed from: m */
    public abstract boolean mo58502m();

    /* renamed from: n */
    public abstract void mo58503n();

    /* renamed from: b */
    public int[] mo50307b() {
        return C47788ct.m103417a(201);
    }

    /* renamed from: k */
    public void mo60174k() {
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (mo54753a(video, "AbsCellViewHolder")) {
                    this.f70667m = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) video.getCover().getUrlList().get(0))) {
                    this.f70666l.setImageResource(R.color.a1x);
                } else {
                    mo54752a(video.getCover(), "AbsCellViewHolder");
                }
            }
        }
    }

    public C30009a(View view) {
        super(view);
        this.f78369h = view.getContext();
    }

    /* renamed from: a */
    protected static void m70342a(SmartImageView smartImageView) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(0.625f);
        }
        ((C13833a) smartImageView.getHierarchy()).mo25893a(new PointF(0.5f, 0.0f));
    }

    /* renamed from: a */
    protected static void m70343a(SmartImageView smartImageView, float f) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(f);
        }
        ((C13833a) smartImageView.getHierarchy()).mo25893a(new PointF(0.5f, 0.0f));
    }
}
