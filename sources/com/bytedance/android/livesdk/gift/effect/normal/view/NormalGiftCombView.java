package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.entry.p366d.C7393a;
import com.bytedance.android.livesdk.gift.effect.normal.p371c.C7418a;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7423a;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7423a.C7426a;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7423a.C7427b;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7423a.C7428c;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.ss.android.ugc.trill.R;

public class NormalGiftCombView extends LinearLayout implements OnClickListener, C8619a {

    /* renamed from: a */
    public View f20354a;

    /* renamed from: b */
    public AnimatorSet f20355b;

    /* renamed from: c */
    public C7418a f20356c;

    /* renamed from: d */
    public C8618a f20357d;

    /* renamed from: e */
    public boolean f20358e;

    /* renamed from: f */
    public boolean f20359f;

    /* renamed from: g */
    public C7428c f20360g;

    /* renamed from: h */
    private NormalGiftView f20361h;

    /* renamed from: i */
    private TextView f20362i;

    /* renamed from: j */
    private TextView f20363j;

    /* renamed from: k */
    private TextView f20364k;

    /* renamed from: l */
    private String f20365l;

    /* renamed from: m */
    private C7421b f20366m;

    /* renamed from: n */
    private C7393a f20367n;

    /* renamed from: o */
    private boolean f20368o;

    /* renamed from: p */
    private boolean f20369p;

    private int getLayoutResource() {
        return R.layout.apn;
    }

    /* renamed from: a */
    public final void mo13728a() {
        this.f20368o = false;
        m15328a("1");
        this.f20354a.setVisibility(4);
        setAlpha(1.0f);
        this.f20361h.resetUI();
    }

    /* renamed from: d */
    private void m15329d() {
        if (!this.f20369p) {
            if (this.f20355b != null && this.f20355b.isRunning()) {
                this.f20355b.removeAllListeners();
                this.f20355b.cancel();
                this.f20355b = null;
            }
            this.f20356c = null;
        }
    }

    /* renamed from: b */
    public final void mo13732b() {
        if (!this.f20369p) {
            if (this.f20357d.hasMessages(100)) {
                this.f20357d.removeMessages(100);
            }
            m15328a(String.valueOf(this.f20366m.f20326c));
            this.f20355b = C7423a.m15310a(this.f20354a, this.f20360g);
            this.f20358e = true;
            this.f20355b.start();
        }
    }

    /* renamed from: c */
    public final void mo13733c() {
        this.f20369p = true;
        m15329d();
        if (this.f20356c != null) {
            this.f20356c = null;
        }
        if (this.f20367n != null) {
            this.f20367n = null;
        }
        if (this.f20357d.hasMessages(100)) {
            this.f20357d.removeMessages(100);
        }
        if (this.f20361h != null) {
            this.f20361h.stopDraw();
        }
    }

    public void setClickListener(C7393a aVar) {
        this.f20367n = aVar;
    }

    public void setShowCombo(boolean z) {
        this.f20359f = z;
    }

    public NormalGiftCombView(Context context) {
        this(context, null);
    }

    public void setOrientation(int i) {
        if (this.f20361h != null) {
            this.f20361h.setOrientation(i);
        }
    }

    public void onClick(View view) {
        if (this.f20366m != null && this.f20366m.f20320l != null && this.f20367n != null) {
            this.f20367n.mo12489a(this.f20366m.f20320l.getId());
        }
    }

    /* renamed from: a */
    private void m15328a(String str) {
        if (this.f20364k != null) {
            String string = getResources().getString(R.string.ehx, new Object[]{str});
            this.f20364k.setText(string);
            this.f20362i.setText(string);
            this.f20363j.setText(string);
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message.what == 100 && !this.f20368o) {
            this.f20368o = true;
            this.f20360g.mo13720c();
        }
    }

    public NormalGiftCombView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo13729a(int i, int i2) {
        setX((float) i);
        setY((float) i2);
    }

    /* renamed from: a */
    public final void mo13730a(C7418a aVar, boolean z) {
        if (!this.f20369p) {
            this.f20356c = aVar;
            this.f20361h.playAnimation();
            this.f20355b = C7423a.m15311a(this, z, this.f20360g);
            this.f20355b.start();
        }
    }

    /* renamed from: a */
    public final void mo13731a(C7421b bVar, boolean z) {
        this.f20366m = bVar;
        this.f20361h.settingUi(this.f20366m, z);
        this.f20365l = String.valueOf(this.f20366m.f20326c);
        m15328a(this.f20365l);
    }

    public NormalGiftCombView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20365l = "1";
        this.f20357d = new C8618a(this);
        this.f20360g = new C7428c() {
            /* renamed from: d */
            public final void mo13721d() {
                if (NormalGiftCombView.this.f20356c != null) {
                    NormalGiftCombView.this.f20356c.mo13708c();
                }
            }

            /* renamed from: b */
            public final void mo13719b() {
                NormalGiftCombView.this.f20357d.sendEmptyMessageDelayed(100, 1000);
                NormalGiftCombView.this.f20358e = false;
                if (NormalGiftCombView.this.f20356c != null) {
                    NormalGiftCombView.this.f20356c.mo13706a();
                }
            }

            /* renamed from: a */
            public final void mo13718a() {
                if (NormalGiftCombView.this.f20354a == null || !NormalGiftCombView.this.f20359f) {
                    if (!NormalGiftCombView.this.f20359f) {
                        mo13719b();
                    }
                    return;
                }
                NormalGiftCombView.this.f20354a.setVisibility(0);
                NormalGiftCombView.this.f20355b = C7423a.m15310a(NormalGiftCombView.this.f20354a, NormalGiftCombView.this.f20360g);
                NormalGiftCombView.this.f20358e = true;
                NormalGiftCombView.this.f20355b.start();
            }

            /* renamed from: c */
            public final void mo13720c() {
                if (NormalGiftCombView.this.f20356c != null) {
                    NormalGiftCombView.this.f20356c.mo13707b();
                }
                NormalGiftCombView normalGiftCombView = NormalGiftCombView.this;
                NormalGiftCombView normalGiftCombView2 = NormalGiftCombView.this;
                C7428c cVar = NormalGiftCombView.this.f20360g;
                normalGiftCombView2.getX();
                float y = normalGiftCombView2.getY();
                ObjectAnimator duration = ObjectAnimator.ofFloat(normalGiftCombView2, "translationY", new float[]{y, y - 100.0f}).setDuration(500);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(normalGiftCombView2, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{duration, duration2});
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.addListener(new C7426a(C7427b.exit, cVar));
                normalGiftCombView.f20355b = animatorSet;
                NormalGiftCombView.this.f20355b.start();
            }
        };
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f20361h = (NormalGiftView) findViewById(R.id.jj);
        this.f20354a = findViewById(R.id.wj);
        this.f20362i = (TextView) findViewById(R.id.wn);
        this.f20363j = (TextView) findViewById(R.id.wo);
        this.f20364k = (TextView) findViewById(R.id.wp);
        m15328a("1");
        this.f20354a.setVisibility(4);
        this.f20361h.setOnClickListener(this);
        if (VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
        }
    }
}
