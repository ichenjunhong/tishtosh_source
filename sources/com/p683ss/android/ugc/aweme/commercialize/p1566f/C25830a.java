package com.p683ss.android.ugc.aweme.commercialize.p1566f;

import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36737c;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.a */
public final class C25830a extends C36737c {

    /* renamed from: a */
    TextView f68279a;

    /* renamed from: b */
    TextView f68280b;

    /* renamed from: a */
    public final void mo53031a() {
    }

    /* renamed from: b */
    public final void mo53034b() {
    }

    /* renamed from: c */
    public final void mo53035c() {
    }

    /* renamed from: a */
    public final void mo53033a(AbsLiveStoryItemView absLiveStoryItemView) {
        super.mo53033a(absLiveStoryItemView);
        if (absLiveStoryItemView instanceof C25833d) {
            View rootView = absLiveStoryItemView.getRootView();
            this.f68279a = (TextView) rootView.findViewById(R.id.avx);
            this.f68280b = (TextView) rootView.findViewById(R.id.avy);
        }
    }

    /* renamed from: a */
    public final void mo53032a(int i, int i2) {
        LiveCircleView liveCircleView = this.f93895c;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, TileMode.MIRROR);
        liveCircleView.f80429a.setShader(linearGradient);
        liveCircleView.f80430b.setShader(linearGradient);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke((int) C9432q.m18687b(this.f68279a.getContext(), 1.0f), -16777216);
        gradientDrawable.setCornerRadius(C9432q.m18687b(this.f68279a.getContext(), 3.0f));
        this.f68279a.setBackground(gradientDrawable);
    }
}
