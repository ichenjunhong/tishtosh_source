package com.p683ss.android.ugc.aweme.sticker.panel.guide;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.effectplatform.C29240a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.p2307a.C46173a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.c */
public final class C46177c implements C46185e {

    /* renamed from: a */
    public View f116529a;

    /* renamed from: b */
    public View f116530b;

    /* renamed from: c */
    public TextView f116531c;

    /* renamed from: d */
    public boolean f116532d;

    /* renamed from: e */
    public Runnable f116533e = new Runnable() {
        public final void run() {
            Animation a = C46173a.m100312a(0.0f, 1.0f, 200);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C46177c.this.f116532d = true;
                    C46177c.this.f116530b.postDelayed(C46177c.this.f116533e, 3000);
                }
            });
            C46177c.this.f116531c.startAnimation(a);
        }
    };

    /* renamed from: f */
    public Runnable f116534f = new Runnable() {
        public final void run() {
            Animation a = C46173a.m100312a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    C46177c.this.f116532d = false;
                }

                public final void onAnimationEnd(Animation animation) {
                    C46177c.this.mo88287a(true);
                }
            });
            C46177c.this.f116530b.startAnimation(a);
        }
    };

    /* renamed from: g */
    private Effect f116535g;

    /* renamed from: h */
    private FrameLayout f116536h;

    /* renamed from: i */
    private SimpleDraweeView f116537i;

    public C46177c(Effect effect) {
        this.f116535g = effect;
    }

    /* renamed from: a */
    public final void mo88287a(boolean z) {
        if (this.f116535g != null && !TextUtils.isEmpty(this.f116535g.getExtra())) {
            this.f116530b.removeCallbacks(this.f116534f);
            this.f116530b.removeCallbacks(this.f116533e);
            this.f116536h.removeView(this.f116529a);
        }
    }

    /* renamed from: a */
    public final void mo88286a(FrameLayout frameLayout) {
        Context context;
        if (this.f116535g != null && !TextUtils.isEmpty(this.f116535g.getExtra())) {
            ExtraParams extraParams = (ExtraParams) C39629l.m88232a().mo58566D().mo34884a(this.f116535g.getExtra(), ExtraParams.class);
            if (extraParams != null && extraParams.isGifValid()) {
                this.f116536h = frameLayout;
                this.f116529a = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a80, frameLayout, false);
                this.f116536h.addView(this.f116529a, 0);
                this.f116530b = this.f116529a.findViewById(R.id.agn);
                this.f116531c = (TextView) this.f116529a.findViewById(R.id.ct6);
                this.f116531c.setText(R.string.a3x);
                this.f116537i = (SimpleDraweeView) this.f116529a.findViewById(R.id.ct7);
                LayoutParams layoutParams = (LayoutParams) this.f116537i.getLayoutParams();
                if (2 == extraParams.gifType) {
                    layoutParams.width = (int) C9432q.m18687b(frameLayout.getContext(), 192.0f);
                    layoutParams.height = (int) C9432q.m18687b(frameLayout.getContext(), 252.0f);
                    this.f116537i.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout2 = (FrameLayout) this.f116536h.findViewById(R.id.csz);
                if (frameLayout2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f116530b.getLayoutParams();
                    layoutParams2.height = C43303dy.m94974e(frameLayout.getContext()) - frameLayout2.getHeight();
                    this.f116530b.setLayoutParams(layoutParams2);
                }
                this.f116530b.post(this.f116533e);
                this.f116529a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C46177c.this.f116532d) {
                            C46177c.this.f116530b.post(C46177c.this.f116534f);
                        }
                    }
                });
                SimpleDraweeView simpleDraweeView = this.f116537i;
                UrlModel a = C29240a.m68865a(this.f116535g.getHintIcon());
                C461834 r1 = new C13790c<C14045f>() {
                    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        long j;
                        C14045f fVar = (C14045f) obj;
                        if (animatable instanceof C13877a) {
                            C13877a aVar = (C13877a) animatable;
                            aVar.f36200a = 2;
                            aVar.f36201b = true;
                            animatable.start();
                            j = aVar.mo26026b();
                        } else {
                            j = 0;
                        }
                        if (j > 0 && C46177c.this.f116529a != null) {
                            C46177c.this.f116529a.postDelayed(new C46184d(this, animatable), j);
                        }
                    }
                };
                if (simpleDraweeView != null && a != null && a.getUrlList() != null && a.getUrlList().size() != 0) {
                    if (simpleDraweeView.getContext() != null) {
                        context = simpleDraweeView.getContext().getApplicationContext();
                    } else {
                        context = null;
                    }
                    C14229b[] a2 = C50181a.m108301a(a, (C13952d) null, (C14234d) null);
                    if (a2 != null && a2.length != 0) {
                        C13773e eVar = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25755a((REQUEST[]) a2)).mo25762c(false);
                        eVar.mo25751a(C50181a.m108285a((C13791d<C14045f>) r1, a2[0].mSourceUri, context, a));
                        simpleDraweeView.setController(eVar.mo25763d());
                    }
                }
            }
        }
    }
}
