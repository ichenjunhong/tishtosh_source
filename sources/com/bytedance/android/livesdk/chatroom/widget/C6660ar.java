package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.uikit.rtl.AutoRTLTextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ar */
public final class C6660ar extends RelativeLayout {

    /* renamed from: a */
    public View f18166a;

    /* renamed from: b */
    public View f18167b;

    /* renamed from: c */
    public C6664a f18168c;

    /* renamed from: d */
    final int f18169d = 294;

    /* renamed from: e */
    final int f18170e = 80;

    /* renamed from: f */
    final int f18171f = 160;

    /* renamed from: g */
    final int f18172g = 320;

    /* renamed from: h */
    private LottieAnimationView f18173h;

    /* renamed from: i */
    private AutoRTLTextView f18174i;

    /* renamed from: j */
    private String f18175j;

    /* renamed from: k */
    private Boolean f18176k = Boolean.valueOf(true);

    /* renamed from: l */
    private Animation f18177l;

    /* renamed from: m */
    private Animation f18178m;

    /* renamed from: n */
    private Animation f18179n;

    /* renamed from: o */
    private Animation f18180o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.ar$a */
    public interface C6664a {
        /* renamed from: a */
        void mo12794a();
    }

    /* renamed from: c */
    public final void mo12785c() {
        if (!(this.f18177l == null && this.f18179n == null)) {
            this.f18167b.clearAnimation();
        }
        if (this.f18178m != null || this.f18180o != null) {
            this.f18166a.clearAnimation();
        }
    }

    /* renamed from: a */
    public final void mo12782a() {
        if (this.f18177l == null) {
            this.f18177l = new AlphaAnimation(0.0f, 1.0f);
            this.f18177l.setDuration(160);
        }
        if (this.f18178m == null) {
            this.f18178m = new AlphaAnimation(0.0f, 1.0f);
            this.f18178m.setDuration(320);
            this.f18178m.setStartOffset(160);
        }
        this.f18167b.clearAnimation();
        this.f18166a.clearAnimation();
        this.f18167b.startAnimation(this.f18177l);
        this.f18166a.startAnimation(this.f18178m);
    }

    /* renamed from: b */
    public final void mo12784b() {
        if (this.f18179n == null) {
            this.f18179n = new AlphaAnimation(1.0f, 0.0f);
            this.f18179n.setDuration(160);
            this.f18179n.setStartOffset(160);
            this.f18179n.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C6660ar.this.f18167b.setVisibility(8);
                    C6660ar.this.f18166a.setVisibility(8);
                }
            });
        }
        if (this.f18180o == null) {
            this.f18180o = new AlphaAnimation(1.0f, 0.0f);
            this.f18180o.setDuration(320);
        }
        this.f18167b.clearAnimation();
        this.f18166a.clearAnimation();
        this.f18167b.startAnimation(this.f18179n);
        this.f18166a.startAnimation(this.f18180o);
    }

    public final void setDestText(String str) {
        if (this.f18174i != null) {
            this.f18174i.setText(str);
        }
    }

    public final void setClickListener(C6664a aVar) {
        this.f18167b.setClickable(true);
        this.f18168c = aVar;
        this.f18167b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C6660ar.this.f18168c.mo12794a();
            }
        });
    }

    public final void setAnimResource(String str) {
        if (this.f18173h != null && !TextUtils.isEmpty(str) && !str.equals(this.f18175j)) {
            this.f18175j = str;
            this.f18173h.setAnimation(str);
            this.f18173h.mo6658c(true);
            this.f18173h.mo6654b();
        }
    }

    public C6660ar(Context context) {
        super(context);
        inflate(getContext(), R.layout.anq, this);
        this.f18167b = findViewById(R.id.yz);
        this.f18166a = findViewById(R.id.zb);
        this.f18173h = (LottieAnimationView) findViewById(R.id.cp8);
        this.f18174i = (AutoRTLTextView) findViewById(R.id.d98);
        if (C4206c.m10426a(context)) {
            this.f18174i.setText(R.string.f1h);
        } else {
            this.f18174i.setText(R.string.f1i);
        }
        LayoutParams layoutParams = (LayoutParams) this.f18166a.getLayoutParams();
        layoutParams.topMargin = (int) (((float) (((int) (((float) C9432q.m18688b(getContext())) - C9432q.m18687b(getContext(), 294.0f))) / 2)) - C9432q.m18687b(getContext(), 80.0f));
        this.f18166a.setLayoutParams(layoutParams);
        if (this.f18168c == null) {
            this.f18167b.setClickable(false);
        } else {
            this.f18167b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C6660ar.this.f18168c.mo12794a();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo12783a(String str, String str2) {
        if (this.f18173h != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(this.f18175j)) {
            this.f18175j = str;
            this.f18173h.setAnimation(str);
            this.f18173h.setImageAssetsFolder(str2);
            this.f18173h.mo6658c(true);
            this.f18173h.mo6654b();
        }
    }
}
