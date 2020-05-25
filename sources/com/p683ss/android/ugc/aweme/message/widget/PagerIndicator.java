package com.p683ss.android.ugc.aweme.message.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator */
public class PagerIndicator extends LinearLayout {

    /* renamed from: a */
    public int f94015a;

    /* renamed from: b */
    public int f94016b;

    /* renamed from: c */
    public boolean f94017c;

    /* renamed from: d */
    int f94018d;

    /* renamed from: e */
    public int f94019e;

    /* renamed from: f */
    public ViewPager f94020f;

    /* renamed from: g */
    public C36791b f94021g;

    /* renamed from: h */
    public C36790a f94022h;

    /* renamed from: i */
    boolean f94023i;

    /* renamed from: j */
    private int f94024j;

    /* renamed from: k */
    private int f94025k;

    /* renamed from: l */
    private int f94026l;

    /* renamed from: m */
    private long f94027m;

    /* renamed from: n */
    private long f94028n;

    /* renamed from: o */
    private boolean f94029o;

    /* renamed from: p */
    private Paint f94030p;

    /* renamed from: q */
    private int f94031q;

    /* renamed from: r */
    private int f94032r;

    /* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator$a */
    public abstract class C36790a implements C0997e {
        /* renamed from: a */
        public abstract void mo75970a(int i);

        /* renamed from: a */
        public abstract void mo75971a(int i, float f);

        public C36790a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (PagerIndicator.this.f94021g != null) {
                PagerIndicator.this.f94021g.mo75922a(i);
            }
        }

        public void onPageSelected(int i) {
            mo75970a(i);
            if (PagerIndicator.this.f94021g != null) {
                PagerIndicator.this.f94021g.mo75923a(i, PagerIndicator.this.f94023i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            mo75971a(i, f);
            if (f > 0.0f) {
                PagerIndicator.this.f94023i = true;
            } else {
                PagerIndicator.this.f94023i = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator$b */
    public interface C36791b {
        /* renamed from: a */
        void mo75922a(int i);

        /* renamed from: a */
        void mo75923a(int i, boolean z);
    }

    /* renamed from: b */
    private void m82794b() {
        this.f94017c = true;
    }

    /* renamed from: c */
    private void m82795c() {
        for (final int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                childAt.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        PagerIndicator.this.f94020f.setCurrentItem(i);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m82793a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f94027m);
        ofFloat.setStartDelay(this.f94028n);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int width = PagerIndicator.this.getWidth() / PagerIndicator.this.f94016b;
                PagerIndicator.this.f94019e = (int) ((((float) width) * (((Float) valueAnimator.getAnimatedValue()).floatValue() + 0.0f)) + ((float) (PagerIndicator.this.f94015a / 2)));
                PagerIndicator.this.invalidate();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                    PagerIndicator.this.f94017c = false;
                }
            }
        });
        ofFloat.start();
    }

    public void setSelectCallBack(C36791b bVar) {
        this.f94021g = bVar;
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }

    public void setHighLightText(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TextView) {
                if (i2 == i) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(this.f94031q);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else {
                    TextView textView2 = (TextView) childAt;
                    textView2.setTextColor(this.f94032r);
                    textView2.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75964a(int i) {
        if (this.f94020f != null) {
            try {
                int currentItem = this.f94020f.getCurrentItem();
                int i2 = i - 1;
                if (currentItem != i2) {
                    m82794b();
                }
                this.f94020f.setCurrentItem(i2, false);
                if (currentItem != i2) {
                    m82793a();
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f94029o) {
            canvas.save();
            boolean z = false;
            if (VERSION.SDK_INT >= 17 && 1 == getLayoutDirection()) {
                z = true;
            }
            if (z) {
                int width = getWidth();
                canvas.drawLine((float) (width - this.f94019e), (float) getHeight(), (float) (width - (this.f94019e + ((getWidth() / this.f94016b) - this.f94015a))), (float) getHeight(), this.f94030p);
            } else {
                canvas.drawLine((float) this.f94019e, (float) getHeight(), (float) (this.f94019e + ((getWidth() / this.f94016b) - this.f94015a)), (float) getHeight(), this.f94030p);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public void setTabItems(List<String> list) {
        if (list != null) {
            removeAllViews();
            if (list.size() == 1) {
                this.f94029o = false;
            } else {
                this.f94029o = true;
            }
            for (String str : list) {
                DmtTextView dmtTextView = new DmtTextView(getContext());
                LayoutParams layoutParams = new LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                dmtTextView.setGravity(17);
                dmtTextView.setText(str);
                dmtTextView.setTextColor(this.f94032r);
                dmtTextView.setLayoutParams(layoutParams);
                dmtTextView.setTextSize(1, (float) this.f94026l);
                dmtTextView.setMaxLines(1);
                dmtTextView.setEllipsize(TruncateAt.END);
                dmtTextView.setFontType(C10751d.f28903b);
                addView(dmtTextView);
            }
            this.f94016b = list.size();
            this.f94018d = getWidth() / this.f94016b;
            setHighLightText(list.size() - 1);
            m82795c();
        }
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94024j = 12;
        this.f94015a = (int) C9432q.m18687b(getContext(), 30.0f);
        this.f94025k = (int) C9432q.m18687b(getContext(), 110.0f);
        this.f94026l = 17;
        this.f94016b = 1;
        this.f94027m = 380;
        this.f94028n = 250;
        this.f94017c = false;
        this.f94029o = false;
        this.f94022h = new C36790a() {
            /* renamed from: a */
            public final void mo75970a(int i) {
                PagerIndicator.this.setHighLightText(i);
            }

            /* renamed from: a */
            public final void mo75971a(int i, float f) {
                PagerIndicator pagerIndicator = PagerIndicator.this;
                if (!pagerIndicator.f94017c) {
                    pagerIndicator.f94019e = ((int) (((float) (pagerIndicator.getWidth() / pagerIndicator.f94016b)) * (((float) i) + f))) + (pagerIndicator.f94015a / 2);
                }
                if (i >= pagerIndicator.f94016b - 2 && f > 0.0f && pagerIndicator.getChildCount() > pagerIndicator.f94016b && i != pagerIndicator.getChildCount() - 2) {
                    if (pagerIndicator.f94016b != 1) {
                        pagerIndicator.scrollTo(((i - (pagerIndicator.f94016b - 2)) * pagerIndicator.f94018d) + ((int) (((float) pagerIndicator.f94018d) * f)), 0);
                    } else {
                        pagerIndicator.scrollTo((i * pagerIndicator.f94018d) + ((int) (((float) pagerIndicator.f94018d) * f)), 0);
                    }
                }
                pagerIndicator.invalidate();
            }
        };
        this.f94023i = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ok, R.attr.ol, R.attr.om, R.attr.oq});
        this.f94031q = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.a1k));
        this.f94032r = obtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.ap3));
        this.f94026l = (int) obtainStyledAttributes.getDimension(3, (float) this.f94026l);
        this.f94024j = (int) obtainStyledAttributes.getDimension(0, (float) this.f94024j);
        obtainStyledAttributes.recycle();
        this.f94030p = new Paint();
        this.f94030p.setAntiAlias(true);
        this.f94030p.setColor(getContext().getResources().getColor(R.color.aqx));
        this.f94030p.setStyle(Style.FILL);
        this.f94030p.setStrokeWidth((float) this.f94024j);
    }
}
