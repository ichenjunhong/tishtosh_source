package com.bytedance.android.livesdk.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p030v4.view.p042b.C1027f;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.message.model.C7819ax;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.honor.b */
public final class C7661b extends RelativeLayout {

    /* renamed from: n */
    static final Interpolator f21095n = C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: a */
    View f21096a;

    /* renamed from: b */
    public View f21097b;

    /* renamed from: c */
    View f21098c;

    /* renamed from: d */
    View f21099d;

    /* renamed from: e */
    public C7659a f21100e;

    /* renamed from: f */
    public C7819ax f21101f;

    /* renamed from: g */
    float f21102g = C9432q.m18687b(getContext(), 20.0f);

    /* renamed from: h */
    ValueAnimator f21103h;

    /* renamed from: i */
    ValueAnimator f21104i;

    /* renamed from: j */
    ValueAnimator f21105j;

    /* renamed from: k */
    public int f21106k;

    /* renamed from: l */
    public int f21107l;

    /* renamed from: m */
    boolean f21108m;

    /* renamed from: o */
    private VHeadView f21109o;

    /* renamed from: p */
    private TextView f21110p;

    /* renamed from: q */
    private TextView f21111q;

    /* renamed from: r */
    private int f21112r = ((int) C9432q.m18687b(getContext(), 40.0f));

    /* renamed from: s */
    private boolean f21113s;

    /* renamed from: a */
    private static int m15689a(int i) {
        return i < 31 ? R.drawable.brf : i < 41 ? R.drawable.brg : R.drawable.brh;
    }

    /* renamed from: a */
    public final void mo14024a(C7819ax axVar) {
        float f;
        if (axVar != null) {
            this.f21101f = axVar;
            User user = axVar.f21525a;
            if (user != null) {
                C5213c.m11826b(this.f21109o, user.getAvatarThumb(), this.f21112r, this.f21112r, R.drawable.bt6);
                this.f21110p.setText(user.getNickName());
                int i = axVar.f21527c;
                this.f21096a.setBackgroundResource(m15689a(i));
                this.f21111q.setText(getContext().getResources().getString(R.string.ed0, new Object[]{Integer.valueOf(i)}));
                LayoutParams layoutParams = (LayoutParams) this.f21097b.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                Context context = getContext();
                if (this.f21113s) {
                    f = 24.0f;
                } else {
                    f = 56.0f;
                }
                layoutParams.setMargins(layoutParams.leftMargin, (int) C9432q.m18687b(context, f), layoutParams.rightMargin, layoutParams.bottomMargin);
                this.f21097b.setLayoutParams(layoutParams);
                post(new Runnable() {
                    public final void run() {
                        C9432q.m18691b((View) C7661b.this, 0);
                        C7661b.this.f21106k = C7661b.this.f21097b.getWidth();
                        C7661b.this.f21107l = C7661b.this.f21097b.getHeight();
                        C7661b bVar = C7661b.this;
                        bVar.f21099d.setAlpha(1.0f);
                        bVar.f21098c.setAlpha(1.0f);
                        bVar.f21096a.setAlpha(1.0f);
                        bVar.f21097b.setScaleX(1.0f);
                        bVar.f21097b.setScaleY(1.0f);
                        bVar.f21097b.setTranslationX(0.0f);
                        bVar.f21097b.setTranslationY(0.0f);
                        C9432q.m18679a(bVar.f21098c, bVar.f21106k, bVar.f21107l);
                        C9432q.m18679a(bVar.f21097b, bVar.f21106k, bVar.f21107l);
                        C7661b bVar2 = C7661b.this;
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, bVar2.f21102g, 0.0f);
                        translateAnimation.setDuration(270);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(270);
                        AnimationSet animationSet = new AnimationSet(false);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setDuration(270);
                        animationSet.setStartOffset(30);
                        bVar2.f21097b.startAnimation(animationSet);
                        bVar2.f21103h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        bVar2.f21103h.setInterpolator(C7661b.f21095n);
                        bVar2.f21103h.setDuration(300);
                        bVar2.f21103h.addUpdateListener(new C7664c(bVar2));
                        bVar2.f21103h.start();
                        bVar2.f21104i = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 1.0f});
                        bVar2.f21104i.addUpdateListener(new C7665d(bVar2));
                        bVar2.f21104i.setDuration(2100);
                        bVar2.f21104i.setStartDelay(300);
                        bVar2.f21104i.start();
                        bVar2.f21105j = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        bVar2.f21105j.addUpdateListener(new C7666e(bVar2));
                        bVar2.f21105j.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                C7661b.this.f21101f.f21528d = false;
                                C7661b.this.setVisibility(4);
                                if (C7661b.this.f21100e != null) {
                                    C7661b.this.f21100e.mo14023b();
                                }
                            }
                        });
                        bVar2.f21105j.setStartDelay(2400);
                        bVar2.f21105j.setDuration(150);
                        bVar2.f21105j.start();
                    }
                });
            }
        }
    }

    public C7661b(Context context, boolean z, C7659a aVar) {
        super(context);
        View.inflate(context, R.layout.al4, this);
        this.f21096a = findViewById(R.id.b5v);
        this.f21097b = findViewById(R.id.b5u);
        this.f21109o = (VHeadView) findViewById(R.id.ay2);
        this.f21110p = (TextView) findViewById(R.id.dif);
        this.f21098c = findViewById(R.id.b5t);
        this.f21099d = findViewById(R.id.b5x);
        this.f21111q = (TextView) findViewById(R.id.da_);
        C9432q.m18691b((View) this, 4);
        this.f21100e = aVar;
        this.f21113s = z;
    }
}
