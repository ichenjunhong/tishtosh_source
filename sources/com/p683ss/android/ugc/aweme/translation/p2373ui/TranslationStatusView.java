package com.p683ss.android.ugc.aweme.translation.p2373ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView */
public class TranslationStatusView extends FrameLayout {

    /* renamed from: a */
    public DmtTextView f119519a;

    /* renamed from: b */
    public LinearLayout f119520b;

    /* renamed from: c */
    public DmtTextView f119521c;

    /* renamed from: d */
    public C47363b f119522d;

    /* renamed from: e */
    public DmtTextView f119523e;

    /* renamed from: f */
    public ObjectAnimator f119524f;

    /* renamed from: g */
    private C47362a f119525g;

    /* renamed from: h */
    private ImageView f119526h;

    /* renamed from: i */
    private int f119527i;

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$a */
    public interface C47362a {
        /* renamed from: a */
        void mo63621a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b */
    public interface C47363b {
        /* renamed from: a */
        void mo63630a(View view);

        /* renamed from: a */
        void mo63631a(View view, boolean z);
    }

    public int getStatus() {
        return this.f119527i;
    }

    public C47362a getmUploadMobListener() {
        return this.f119525g;
    }

    /* renamed from: d */
    private static LayoutParams m102719d() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f119524f.cancel();
    }

    /* renamed from: b */
    public final void mo94642b() {
        this.f119527i = 0;
        this.f119519a.setAlpha(1.0f);
        this.f119519a.setVisibility(0);
        this.f119520b.setVisibility(8);
        this.f119521c.setVisibility(8);
    }

    /* renamed from: c */
    private DmtTextView m102718c() {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(13.0f);
        dmtTextView.getPaint().setFakeBoldText(true);
        dmtTextView.setTextColor(getContext().getResources().getColor(R.color.jf));
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo94641a() {
        if (this.f119519a != null) {
            this.f119519a.setFontType(C10751d.f28903b);
        }
        if (this.f119521c != null) {
            this.f119521c.setFontType(C10751d.f28903b);
        }
        if (this.f119523e != null) {
            this.f119523e.setFontType(C10751d.f28903b);
        }
    }

    public void setOnTranslationViewClickListener(C47363b bVar) {
        this.f119522d = bVar;
    }

    public void setmUploadMobListener(C47362a aVar) {
        this.f119525g = aVar;
    }

    public TranslationStatusView(Context context) {
        this(context, null);
    }

    public void setLoadingDrawable(int i) {
        this.f119526h.setImageResource(i);
    }

    /* renamed from: a */
    private View m102717a(int i) {
        DmtTextView dmtTextView = this.f119519a;
        switch (i) {
            case 0:
                return this.f119519a;
            case 1:
                return this.f119520b;
            case 2:
                return this.f119521c;
            default:
                return dmtTextView;
        }
    }

    public void setStatusWithoutAnim(int i) {
        if (this.f119527i != i) {
            View a = m102717a(this.f119527i);
            View a2 = m102717a(i);
            a.setVisibility(8);
            a2.setVisibility(0);
            a2.setAlpha(1.0f);
            this.f119527i = i;
            if (this.f119525g != null) {
                this.f119525g.mo63621a(this.f119527i);
            }
        }
    }

    public void setTextColor(int i) {
        this.f119523e.setTextColor(getContext().getResources().getColor(i));
        this.f119519a.setTextColor(getContext().getResources().getColor(i));
        this.f119521c.setTextColor(getContext().getResources().getColor(i));
    }

    public void setStatus(int i) {
        if (this.f119525g != null) {
            this.f119525g.mo63621a(i);
        }
        if (this.f119527i != i) {
            final View a = m102717a(this.f119527i);
            final View a2 = m102717a(i);
            ObjectAnimator duration = ObjectAnimator.ofFloat(a, "alpha", new float[]{0.0f}).setDuration(150);
            duration.setInterpolator(new LinearInterpolator());
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(a2, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
            duration2.setInterpolator(new LinearInterpolator());
            duration.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    a.setVisibility(8);
                    a2.setVisibility(0);
                    if (a == TranslationStatusView.this.f119520b) {
                        TranslationStatusView.this.f119524f.cancel();
                    }
                    if (a2 == TranslationStatusView.this.f119520b) {
                        TranslationStatusView.this.f119524f.start();
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{duration, duration2});
            animatorSet.start();
            this.f119527i = i;
        }
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TranslationStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f119519a = m102718c();
        this.f119519a.setText(R.string.dcd);
        this.f119519a.setLayoutParams(m102719d());
        this.f119519a.setGravity(16);
        C10705c.m21579a(this.f119519a);
        this.f119519a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TranslationStatusView.this.setStatus(1);
                if (TranslationStatusView.this.f119522d != null) {
                    TranslationStatusView.this.f119522d.mo63631a(view, false);
                }
            }
        });
        this.f119520b = new LinearLayout(getContext());
        this.f119520b.setLayoutParams(new LayoutParams(-2, -1));
        this.f119520b.setOrientation(0);
        this.f119526h = new ImageView(getContext());
        this.f119526h.setImageResource(R.drawable.cq2);
        this.f119524f = ObjectAnimator.ofFloat(this.f119526h, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
        this.f119524f.setInterpolator(new LinearInterpolator());
        this.f119524f.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.f119526h.setLayoutParams(layoutParams);
        this.f119520b.addView(this.f119526h);
        this.f119523e = m102718c();
        this.f119523e.setText(R.string.ne);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9432q.m18687b(getContext(), 6.0f);
        layoutParams2.gravity = 16;
        this.f119523e.setLayoutParams(layoutParams2);
        this.f119520b.addView(this.f119523e);
        this.f119521c = m102718c();
        this.f119521c.setText(R.string.dcb);
        this.f119521c.setLayoutParams(m102719d());
        this.f119521c.setGravity(16);
        C10705c.m21579a(this.f119521c);
        this.f119521c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TranslationStatusView.this.setStatus(0);
                if (TranslationStatusView.this.f119522d != null) {
                    TranslationStatusView.this.f119522d.mo63630a(view);
                }
            }
        });
        mo94642b();
        addView(this.f119521c);
        addView(this.f119520b);
        addView(this.f119519a);
    }
}
