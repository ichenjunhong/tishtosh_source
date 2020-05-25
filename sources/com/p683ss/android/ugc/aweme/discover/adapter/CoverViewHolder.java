package com.p683ss.android.ugc.aweme.discover.adapter;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26833a;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CoverViewHolder */
public class CoverViewHolder extends C26833a {

    /* renamed from: a */
    private View f72837a;

    /* renamed from: b */
    private View f72838b;
    int mHeight;
    int mWidth;

    /* renamed from: b */
    public final int[] mo50307b() {
        return C47788ct.m103417a(200);
    }

    /* renamed from: c */
    public final void mo50308c() {
        if (this.f70665k != null) {
            Video video = ((Aweme) this.f70665k).getVideo();
            if (video != null) {
                if (mo54753a(video, "CoverViewHolder")) {
                    this.f70667m = true;
                    return;
                }
                mo54752a(video.getCover(), "CoverViewHolder");
            }
        }
    }

    public CoverViewHolder(View view, C24579d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72837a = view.findViewById(R.id.cfl);
        this.f70666l = (SmartImageView) view.findViewById(R.id.ev);
        this.f70666l.setOnClickListener(new C27908l(this, dVar));
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            this.f70666l.setAnimationListener(this.f70660j);
        }
        if (VERSION.SDK_INT >= 23) {
            this.f70666l.setForeground(this.f70666l.getContext().getDrawable(R.drawable.cuu));
        } else {
            C38446k.m85764a(this.f70666l);
        }
        this.f72838b = view.findViewById(R.id.f6n);
        this.f72838b.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54774a(Aweme aweme, int i) {
        if (aweme != null) {
            super.mo54774a(aweme, i);
            this.f70665k = aweme;
            if (!C47915gg.m103651b() && NewDiscoverV4Experiment.m69617a()) {
                this.mWidth = (int) C9432q.m18687b(this.f72837a.getContext(), 114.0f);
                this.mHeight = (int) C9432q.m18687b(this.f72837a.getContext(), 152.0f);
            }
            View view = this.f72837a;
            int i2 = this.mWidth;
            int i3 = this.mHeight;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (!(marginLayoutParams.width == i2 && marginLayoutParams.height == i3)) {
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i3;
                view.setLayoutParams(marginLayoutParams);
            }
            mo50308c();
            if (C47935p.m103712e((Aweme) this.f70665k)) {
                this.f72838b.setVisibility(0);
            } else {
                this.f72838b.setVisibility(8);
            }
        }
    }
}
