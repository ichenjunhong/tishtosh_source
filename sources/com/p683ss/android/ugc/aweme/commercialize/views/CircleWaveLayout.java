package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout */
public class CircleWaveLayout extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    public static final String f70082a = "CircleWaveLayout";

    /* renamed from: b */
    ScaleFadeCircleView f70083b;

    /* renamed from: c */
    public ScaleFadeCircleView f70084c;

    /* renamed from: d */
    public Aweme f70085d;

    /* renamed from: e */
    public boolean f70086e;

    /* renamed from: f */
    public boolean f70087f;

    /* renamed from: g */
    protected C13791d<C14045f> f70088g;

    /* renamed from: h */
    private CircleImageView f70089h;

    public CircleWaveLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.tf) {
            C25945k.m62914e().mo53188a(getContext(), this.f70085d);
            C25945k.m62911b().mo53144h(getContext(), this.f70085d);
            C25945k.m62911b().mo53132b(getContext(), this.f70085d);
        }
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70088g = new C13790c<C14045f>() {
            public final void onRelease(String str) {
                super.onRelease(str);
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                super.onIntermediateImageSet(str, (C14045f) obj);
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                CircleWaveLayout.this.f70087f = false;
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                if (CircleWaveLayout.this.f70086e) {
                    CircleWaveLayout.this.setVisibility(0);
                    CircleWaveLayout circleWaveLayout = CircleWaveLayout.this;
                    circleWaveLayout.f70083b.mo54455a();
                    circleWaveLayout.postDelayed(new Runnable() {
                        public final void run() {
                            CircleWaveLayout.this.f70084c.mo54455a();
                        }
                    }, 750);
                    CircleWaveLayout.this.f70087f = true;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.b_3, this);
        this.f70083b = (ScaleFadeCircleView) findViewById(R.id.ag9);
        this.f70084c = (ScaleFadeCircleView) findViewById(R.id.ck4);
        this.f70089h = (CircleImageView) findViewById(R.id.tf);
        this.f70089h.setOnClickListener(this);
        setOnClickListener(this);
    }
}
