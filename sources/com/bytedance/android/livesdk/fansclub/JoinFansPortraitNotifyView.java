package com.bytedance.android.livesdk.fansclub;

import android.content.Context;
import android.support.p030v4.view.p042b.C1027f;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

public class JoinFansPortraitNotifyView extends RelativeLayout {

    /* renamed from: k */
    private static final Interpolator f18557k = C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: a */
    public View f18558a;

    /* renamed from: b */
    public C6783f f18559b;

    /* renamed from: c */
    public C6782e f18560c;

    /* renamed from: d */
    private View f18561d;

    /* renamed from: e */
    private VHeadView f18562e;

    /* renamed from: f */
    private TextView f18563f;

    /* renamed from: g */
    private View f18564g;

    /* renamed from: h */
    private View f18565h;

    /* renamed from: i */
    private float f18566i;

    /* renamed from: j */
    private int f18567j;

    public void setAnchorView(C6782e eVar) {
        this.f18560c = eVar;
    }

    public void setJoinMessagePresenter(C6783f fVar) {
        this.f18559b = fVar;
    }

    /* renamed from: a */
    private void m14204a(Context context) {
        this.f18566i = C9432q.m18687b(getContext(), 20.0f);
        this.f18567j = (int) C9432q.m18687b(getContext(), 40.0f);
        View.inflate(context, R.layout.ajs, this);
        this.f18561d = findViewById(R.id.b5v);
        this.f18558a = findViewById(R.id.b5u);
        this.f18562e = (VHeadView) findViewById(R.id.ay2);
        this.f18563f = (TextView) findViewById(R.id.dif);
        this.f18564g = findViewById(R.id.b5t);
        this.f18565h = findViewById(R.id.b5x);
        C9432q.m18691b((View) this, 4);
    }

    public JoinFansPortraitNotifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14204a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z) {
        super(context);
        m14204a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z, C6783f fVar) {
        super(context);
        m14204a(context);
        this.f18559b = fVar;
    }
}
