package com.p683ss.android.ugc.aweme.common.widget.tablayout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.C1052q;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0993a;
import android.support.p030v4.view.ViewPager.C0996d;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.app.ActionBar.C1126a;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.widget.C1455bd;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0993a
/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout */
public class CommonTabLayout extends HorizontalScrollView {

    /* renamed from: t */
    private static final C0796a<C27002f> f71222t = new C0798c(16);

    /* renamed from: A */
    private int f71223A;

    /* renamed from: B */
    private C26997c f71224B;

    /* renamed from: C */
    private final ArrayList<C26997c> f71225C;

    /* renamed from: D */
    private C26997c f71226D;

    /* renamed from: E */
    private ValueAnimator f71227E;

    /* renamed from: F */
    private PagerAdapter f71228F;

    /* renamed from: G */
    private DataSetObserver f71229G;

    /* renamed from: H */
    private C26995a f71230H;

    /* renamed from: I */
    private boolean f71231I;

    /* renamed from: J */
    private float f71232J;

    /* renamed from: K */
    private float f71233K;

    /* renamed from: L */
    private final C0796a<C27004h> f71234L;

    /* renamed from: a */
    public final C26999e f71235a;

    /* renamed from: b */
    int f71236b;

    /* renamed from: c */
    int f71237c;

    /* renamed from: d */
    int f71238d;

    /* renamed from: e */
    int f71239e;

    /* renamed from: f */
    int f71240f;

    /* renamed from: g */
    ColorStateList f71241g;

    /* renamed from: h */
    float f71242h;

    /* renamed from: i */
    float f71243i;

    /* renamed from: j */
    final int f71244j;

    /* renamed from: k */
    int f71245k;

    /* renamed from: l */
    int f71246l;

    /* renamed from: m */
    int f71247m;

    /* renamed from: n */
    int f71248n;

    /* renamed from: o */
    boolean f71249o;

    /* renamed from: p */
    ViewPager f71250p;

    /* renamed from: q */
    C27003g f71251q;

    /* renamed from: r */
    public C26996b f71252r;

    /* renamed from: s */
    public int f71253s;

    /* renamed from: u */
    private final ArrayList<C27002f> f71254u;

    /* renamed from: v */
    private C27002f f71255v;

    /* renamed from: w */
    private int f71256w;

    /* renamed from: x */
    private final int f71257x;

    /* renamed from: y */
    private final int f71258y;

    /* renamed from: z */
    private final int f71259z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$a */
    class C26995a implements C0996d {

        /* renamed from: a */
        public boolean f71261a;

        C26995a() {
        }

        /* renamed from: a */
        public final void mo1576a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (CommonTabLayout.this.f71250p == viewPager) {
                CommonTabLayout.this.mo55143a(pagerAdapter2, this.f71261a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$b */
    public interface C26996b {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$c */
    public interface C26997c {
        /* renamed from: a */
        void mo55178a(C27002f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$d */
    class C26998d extends DataSetObserver {
        public final void onChanged() {
            CommonTabLayout.this.mo55141a();
        }

        public final void onInvalidated() {
            CommonTabLayout.this.mo55141a();
        }

        C26998d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$e */
    class C26999e extends LinearLayout {

        /* renamed from: a */
        int f71264a = -1;

        /* renamed from: b */
        float f71265b;

        /* renamed from: c */
        public float f71266c;

        /* renamed from: d */
        public float f71267d;

        /* renamed from: e */
        public boolean f71268e;

        /* renamed from: g */
        private int f71270g;

        /* renamed from: h */
        private final Paint f71271h;

        /* renamed from: i */
        private int f71272i = -1;

        /* renamed from: j */
        private int f71273j = -1;

        /* renamed from: k */
        private int f71274k = -1;

        /* renamed from: l */
        private ValueAnimator f71275l;

        /* renamed from: m */
        private int f71276m = CommonTabLayout.this.mo55151b(27);

        /* renamed from: n */
        private int f71277n = Integer.MAX_VALUE;

        /* renamed from: a */
        private void m65204a() {
            int i;
            View childAt = getChildAt(this.f71264a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f71265b > 0.0f && this.f71264a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f71264a + 1);
                    i2 = (int) ((this.f71265b * ((float) childAt2.getLeft())) + ((1.0f - this.f71265b) * ((float) i2)));
                    i = (int) ((this.f71265b * ((float) childAt2.getRight())) + ((1.0f - this.f71265b) * ((float) i)));
                }
            }
            mo55183a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo55184b(int i) {
            if (this.f71270g != i) {
                this.f71270g = i;
                C1056u.m3052d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55181a(int i) {
            if (this.f71271h.getColor() != i) {
                this.f71271h.setColor(i);
                C1056u.m3052d(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f71272i != i) {
                requestLayout();
                this.f71272i = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f71273j >= 0 && this.f71274k > this.f71273j) {
                View childAt = getChildAt(CommonTabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.b__);
                    if (findViewById != null) {
                        if (CommonTabLayout.this.f71250p == null || !this.f71268e) {
                            this.f71266c = (float) (this.f71273j + (((this.f71274k - this.f71273j) - findViewById.getWidth()) / 2));
                            this.f71267d = this.f71266c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f71266c, (float) (getHeight() - this.f71270g), this.f71267d, (float) getHeight(), this.f71271h);
                        return;
                    }
                }
                canvas.drawRect((float) this.f71273j, (float) (getHeight() - this.f71270g), (float) this.f71274k, (float) getHeight(), this.f71271h);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55183a(int i, int i2) {
            if (i != this.f71273j || i2 != this.f71274k) {
                this.f71273j = i;
                this.f71274k = i2;
                C1056u.m3052d(this);
            }
        }

        C26999e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f71271h = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55182a(int i, float f) {
            if (this.f71275l != null && this.f71275l.isRunning()) {
                this.f71275l.cancel();
            }
            this.f71264a = i;
            this.f71265b = f;
            m65204a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo55185b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f71275l != null && this.f71275l.isRunning()) {
                this.f71275l.cancel();
            }
            if (C1056u.m3055f(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m65204a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f71264a) <= 1) {
                i4 = this.f71273j;
                i3 = this.f71274k;
            } else {
                int b = CommonTabLayout.this.mo55151b(24);
                if (i < this.f71264a) {
                    if (!z) {
                        i5 = b + right;
                    }
                    i4 = left - b;
                    i3 = i4;
                } else {
                    if (z) {
                        i5 = b + right;
                    }
                    i4 = left - b;
                    i3 = i4;
                }
                i4 = i5;
                i3 = i4;
            }
            if (!(i4 == left && i3 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f71275l = valueAnimator;
                valueAnimator.setInterpolator(C27006a.f71311b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C270001 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C26999e.this.mo55183a(C27006a.m65222a(i4, left, animatedFraction), C27006a.m65222a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C26999e.this.f71264a = i;
                        C26999e.this.f71265b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            boolean z;
            boolean z2;
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                        this.f71277n = Math.min(this.f71277n, childAt.getMeasuredWidth());
                    }
                }
                if (CommonTabLayout.this.f71247m == 1 && CommonTabLayout.this.f71246l == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (CommonTabLayout.this.mo55151b(16) * 2)) {
                            z2 = false;
                            while (i3 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                                i3++;
                            }
                        } else {
                            CommonTabLayout.this.f71246l = 0;
                            CommonTabLayout.this.mo55146a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (CommonTabLayout.this.f71247m == 0 && CommonTabLayout.this.f71249o && CommonTabLayout.this.f71253s == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0) {
                        int measuredWidth = (CommonTabLayout.this.getMeasuredWidth() - CommonTabLayout.this.f71235a.getPaddingLeft()) - CommonTabLayout.this.f71235a.getPaddingRight();
                        if (i6 < measuredWidth) {
                            if (i4 * childCount < measuredWidth) {
                                z = false;
                                for (int i8 = 0; i8 < childCount; i8++) {
                                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i8).getLayoutParams();
                                    if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                                        layoutParams2.width = 0;
                                        layoutParams2.weight = 1.0f;
                                        z = true;
                                    }
                                }
                            } else {
                                int i9 = (measuredWidth - i6) / (childCount * 2);
                                z = false;
                                while (i3 < childCount) {
                                    if (getChildAt(i3).getVisibility() != 8) {
                                        LayoutParams layoutParams3 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                        layoutParams3.leftMargin = i9;
                                        layoutParams3.rightMargin = i9;
                                        z = true;
                                    }
                                    i3++;
                                }
                            }
                            if (z) {
                                super.onMeasure(i, i2);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f71275l == null || !this.f71275l.isRunning()) {
                m65204a();
                return;
            }
            this.f71275l.cancel();
            mo55185b(this.f71264a, Math.round((1.0f - this.f71275l.getAnimatedFraction()) * ((float) this.f71275l.getDuration())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$f */
    public static final class C27002f {

        /* renamed from: a */
        public Object f71285a;

        /* renamed from: b */
        public Drawable f71286b;

        /* renamed from: c */
        public CharSequence f71287c;

        /* renamed from: d */
        public CharSequence f71288d;

        /* renamed from: e */
        public int f71289e = -1;

        /* renamed from: f */
        public View f71290f;

        /* renamed from: g */
        CommonTabLayout f71291g;

        /* renamed from: h */
        public C27004h f71292h;

        C27002f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo55196c() {
            if (this.f71292h != null) {
                this.f71292h.mo55198a();
            }
        }

        /* renamed from: b */
        public final boolean mo55195b() {
            if (this.f71291g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f71291g.getSelectedTabPosition() == this.f71289e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final void mo55194a() {
            if (this.f71291g != null) {
                this.f71291g.mo55144a(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        private C27002f m65210a(View view) {
            this.f71290f = view;
            mo55196c();
            return this;
        }

        /* renamed from: a */
        public final C27002f mo55193a(CharSequence charSequence) {
            this.f71287c = charSequence;
            mo55196c();
            return this;
        }

        /* renamed from: a */
        public final C27002f mo55192a(int i) {
            return m65210a(LayoutInflater.from(this.f71292h.getContext()).inflate(i, this.f71292h, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$g */
    public static class C27003g implements C0997e {

        /* renamed from: a */
        private final WeakReference<CommonTabLayout> f71293a;

        /* renamed from: b */
        private int f71294b;

        /* renamed from: c */
        private int f71295c;

        /* renamed from: d */
        private int f71296d;

        /* renamed from: e */
        private int f71297e;

        /* renamed from: f */
        private ArgbEvaluator f71298f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f71299g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f71300h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55197a() {
            this.f71294b = 0;
            this.f71295c = 0;
        }

        public final void onPageScrollStateChanged(int i) {
            this.f71294b = this.f71295c;
            this.f71295c = i;
        }

        public C27003g(CommonTabLayout commonTabLayout) {
            this.f71293a = new WeakReference<>(commonTabLayout);
            this.f71297e = commonTabLayout.getTabTextColors().getColorForState(CommonTabLayout.SELECTED_STATE_SET, 0);
            this.f71296d = commonTabLayout.getTabTextColors().getDefaultColor();
        }

        public final void onPageSelected(int i) {
            boolean z;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f71293a.get();
            if (commonTabLayout != null && commonTabLayout.getSelectedTabPosition() != i && i < commonTabLayout.getTabCount()) {
                if (this.f71295c == 0 || (this.f71295c == 2 && this.f71294b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                commonTabLayout.mo55145a(commonTabLayout.mo55140a(i), z);
            }
        }

        /* renamed from: a */
        private static void m65216a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f71293a.get();
            if (commonTabLayout != null) {
                if (this.f71295c != 2 || this.f71294b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f71295c == 2 && this.f71294b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                commonTabLayout.mo55142a(i, f, z, z2);
                if (this.f71295c == 2 && this.f71294b == 0) {
                    commonTabLayout.f71235a.f71268e = false;
                } else {
                    commonTabLayout.f71235a.f71268e = true;
                    View childAt = commonTabLayout.f71235a.getChildAt(commonTabLayout.f71235a.f71264a);
                    View childAt2 = commonTabLayout.f71235a.getChildAt(commonTabLayout.f71235a.f71264a + 1);
                    if (!(childAt == null || childAt2 == null)) {
                        View findViewById = childAt.findViewById(R.id.b__);
                        View findViewById2 = childAt2.findViewById(R.id.b__);
                        if (!(findViewById == null || findViewById2 == null)) {
                            float left = (float) (childAt.getLeft() + ((childAt.getWidth() - findViewById.getWidth()) / 2));
                            float width = ((float) findViewById.getWidth()) + left;
                            float left2 = (float) (childAt2.getLeft() + ((childAt2.getWidth() - findViewById2.getWidth()) / 2));
                            float width2 = ((float) findViewById2.getWidth()) + left2;
                            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.cww);
                            TextView textView = (TextView) findViewById2.findViewById(R.id.cwx);
                            m65216a((ImageView) findViewById.findViewById(R.id.cww), (TextView) findViewById.findViewById(R.id.cwx), ((Integer) this.f71298f.evaluate(f, Integer.valueOf(this.f71297e), Integer.valueOf(this.f71296d))).intValue());
                            m65216a(imageView, textView, ((Integer) this.f71298f.evaluate(f, Integer.valueOf(this.f71296d), Integer.valueOf(this.f71297e))).intValue());
                            commonTabLayout.f71235a.f71266c = left + ((left2 - left) * this.f71299g.getInterpolation(f));
                            commonTabLayout.f71235a.f71267d = width + ((width2 - width) * this.f71299g.getInterpolation(f));
                        }
                    }
                }
                C1056u.m3052d(commonTabLayout.f71235a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$h */
    public class C27004h extends LinearLayout {

        /* renamed from: b */
        private C27002f f71302b;

        /* renamed from: c */
        private TextView f71303c;

        /* renamed from: d */
        private ImageView f71304d;

        /* renamed from: e */
        private View f71305e;

        /* renamed from: f */
        private TextView f71306f;

        /* renamed from: g */
        private ImageView f71307g;

        /* renamed from: h */
        private int f71308h = 2;

        public final C27002f getTab() {
            return this.f71302b;
        }

        public final TextView getTextView() {
            return this.f71303c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f71302b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (CommonTabLayout.this.f71252r == null) {
                this.f71302b.mo55194a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55198a() {
            View view;
            C27002f fVar = this.f71302b;
            if (fVar != null) {
                view = fVar.f71290f;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f71305e = view;
                if (this.f71303c != null) {
                    this.f71303c.setVisibility(8);
                }
                if (this.f71304d != null) {
                    this.f71304d.setVisibility(8);
                    this.f71304d.setImageDrawable(null);
                }
                this.f71306f = (TextView) view.findViewById(16908308);
                if (this.f71306f != null) {
                    this.f71308h = C1115o.m3252a(this.f71306f);
                }
                this.f71307g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f71305e != null) {
                    removeView(this.f71305e);
                    this.f71305e = null;
                }
                this.f71306f = null;
                this.f71307g = null;
            }
            boolean z = false;
            if (this.f71305e == null) {
                if (this.f71304d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.j4, this, false);
                    addView(imageView, 0);
                    this.f71304d = imageView;
                }
                if (this.f71303c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.j5, this, false);
                    addView(textView);
                    this.f71303c = textView;
                    this.f71308h = C1115o.m3252a(this.f71303c);
                }
                C1115o.m3256a(this.f71303c, CommonTabLayout.this.f71240f);
                if (CommonTabLayout.this.f71241g != null) {
                    this.f71303c.setTextColor(CommonTabLayout.this.f71241g);
                }
                m65218a(this.f71303c, this.f71304d);
            } else if (!(this.f71306f == null && this.f71307g == null)) {
                m65218a(this.f71306f, this.f71307g);
            }
            if (fVar != null && fVar.mo55195b()) {
                z = true;
            }
            setSelected(z);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1126a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1126a.class.getName());
        }

        /* access modifiers changed from: 0000 */
        public final void setTab(C27002f fVar) {
            if (fVar != this.f71302b) {
                this.f71302b = fVar;
                mo55198a();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f71303c != null) {
                this.f71303c.setSelected(z);
            }
            if (this.f71304d != null) {
                this.f71304d.setSelected(z);
            }
            if (this.f71305e != null) {
                this.f71305e.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo55199a(C27002f fVar, boolean z) {
            if (fVar != this.f71302b) {
                this.f71302b = fVar;
            }
        }

        public C27004h(Context context) {
            super(context);
            if (CommonTabLayout.this.f71244j != 0) {
                C1056u.m3030a((View) this, C1124a.m3315b(context, CommonTabLayout.this.f71244j));
            }
            C1056u.m3044b(this, CommonTabLayout.this.f71236b, CommonTabLayout.this.f71237c, CommonTabLayout.this.f71238d, CommonTabLayout.this.f71239e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C1056u.m3033a((View) this, C1052q.m3014a(getContext(), BaseNotice.CHECK_PROFILE));
        }

        /* renamed from: a */
        private void m65218a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3 = null;
            if (this.f71302b != null) {
                drawable = this.f71302b.f71286b;
            } else {
                drawable = null;
            }
            if (this.f71302b != null) {
                charSequence = this.f71302b.f71287c;
            } else {
                charSequence = null;
            }
            if (this.f71302b != null) {
                charSequence2 = this.f71302b.f71288d;
            } else {
                charSequence2 = null;
            }
            int i = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = CommonTabLayout.this.mo55151b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            C1455bd.m5087a(this, charSequence3);
        }

        public final void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = CommonTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(CommonTabLayout.this.f71245k, DynamicTabYellowPointVersion.DEFAULT);
            }
            super.onMeasure(i, i2);
            if (this.f71303c != null) {
                getResources();
                float f = CommonTabLayout.this.f71242h;
                int i3 = this.f71308h;
                boolean z = true;
                if (this.f71304d != null && this.f71304d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f71303c != null && this.f71303c.getLineCount() > 1) {
                    f = CommonTabLayout.this.f71243i;
                }
                float textSize = this.f71303c.getTextSize();
                int lineCount = this.f71303c.getLineCount();
                int a = C1115o.m3252a(this.f71303c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (CommonTabLayout.this.f71247m == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f71303c.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f71303c.setTextSize(0, f);
                        this.f71303c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$i */
    public static class C27005i implements C26997c {

        /* renamed from: a */
        private final ViewPager f71309a;

        public C27005i(ViewPager viewPager) {
            this.f71309a = viewPager;
        }

        /* renamed from: a */
        public final void mo55178a(C27002f fVar) {
            this.f71309a.setCurrentItem(fVar.f71289e);
        }
    }

    public int getTabGravity() {
        return this.f71246l;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f71245k;
    }

    public int getTabMode() {
        return this.f71247m;
    }

    public ColorStateList getTabTextColors() {
        return this.f71241g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55142a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f71235a.getChildCount()) {
            if (z2) {
                this.f71235a.mo55182a(i, f);
            }
            if (this.f71227E != null && this.f71227E.isRunning()) {
                this.f71227E.cancel();
            }
            scrollTo(m65171a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final C27002f mo55140a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C27002f) this.f71254u.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55143a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f71228F == null || this.f71229G == null)) {
            this.f71228F.unregisterDataSetObserver(this.f71229G);
        }
        this.f71228F = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f71229G == null) {
                this.f71229G = new C26998d();
            }
            pagerAdapter.registerDataSetObserver(this.f71229G);
        }
        mo55141a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55141a() {
        m65185c();
        if (this.f71228F != null) {
            int count = this.f71228F.getCount();
            for (int i = 0; i < count; i++) {
                m65182b(m65184c(this.f71248n).mo55193a(this.f71228F.getPageTitle(i)), false);
            }
            if (this.f71250p != null && count > 0) {
                int currentItem = this.f71250p.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo55144a(mo55140a(currentItem));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55144a(C27002f fVar) {
        mo55145a(fVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55145a(C27002f fVar, boolean z) {
        C27002f fVar2 = this.f71255v;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f71289e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f71289e == -1) && i != -1) {
                    m65172a(i, 0.0f, true);
                } else {
                    m65188d(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m65189d(fVar2);
            }
            this.f71255v = fVar;
            if (fVar != null) {
                m65186c(fVar);
            }
        } else if (fVar2 != null) {
            m65191e(fVar);
            m65188d(fVar.f71289e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55146a(boolean z) {
        for (int i = 0; i < this.f71235a.getChildCount(); i++) {
            View childAt = this.f71235a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m65175a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public int getTabCount() {
        return this.f71254u.size();
    }

    /* renamed from: e */
    private LayoutParams m65190e() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m65175a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        C26999e eVar = this.f71235a;
        return ((float) eVar.f71264a) + eVar.f71265b;
    }

    public int getSelectedTabPosition() {
        if (this.f71255v != null) {
            return this.f71255v.f71289e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f71231I) {
            setupWithViewPager(null);
            this.f71231I = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabMinWidth() {
        if (this.f71257x != -1) {
            return this.f71257x;
        }
        if (this.f71247m == 0) {
            return this.f71259z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f71235a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f71250p == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m65173a((ViewPager) parent, true, true);
            }
        }
    }

    /* renamed from: d */
    private C27004h m65187d() {
        C27004h hVar;
        if (this.f71234L != null) {
            hVar = (C27004h) this.f71234L.acquire();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new C27004h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* renamed from: f */
    private void m65192f() {
        if (this.f71227E == null) {
            this.f71227E = new ValueAnimator();
            this.f71227E.setInterpolator(C27006a.f71311b);
            this.f71227E.setDuration(300);
            this.f71227E.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CommonTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: g */
    private void m65193g() {
        int i;
        if (this.f71247m == 0) {
            i = Math.max(0, this.f71223A - this.f71236b);
        } else {
            i = 0;
        }
        C1056u.m3044b(this.f71235a, i, 0, 0, 0);
        switch (this.f71247m) {
            case 0:
                this.f71235a.setGravity(8388611);
                break;
            case 1:
                this.f71235a.setGravity(1);
                break;
        }
        mo55146a(true);
    }

    private int getDefaultHeight() {
        int size = this.f71254u.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C27002f fVar = (C27002f) this.f71254u.get(i);
            if (fVar != null && fVar.f71286b != null && !TextUtils.isEmpty(fVar.f71287c)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return 72;
        }
        return 48;
    }

    /* renamed from: c */
    private void m65185c() {
        int childCount = this.f71235a.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C27004h hVar = (C27004h) this.f71235a.getChildAt(childCount);
            this.f71235a.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f71234L.release(hVar);
            }
            requestLayout();
        }
        Iterator it = this.f71254u.iterator();
        while (it.hasNext()) {
            C27002f fVar = (C27002f) it.next();
            it.remove();
            fVar.f71291g = null;
            fVar.f71292h = null;
            fVar.f71285a = null;
            fVar.f71286b = null;
            fVar.f71287c = null;
            fVar.f71288d = null;
            fVar.f71289e = -1;
            fVar.f71290f = null;
            f71222t.release(fVar);
        }
        this.f71255v = null;
    }

    public void addView(View view) {
        m65174a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f71249o = z;
    }

    public void setCustomTabViewResId(int i) {
        this.f71248n = i;
    }

    public void setOnTabClickListener(C26996b bVar) {
        this.f71252r = bVar;
    }

    public CommonTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m65180b(C26997c cVar) {
        this.f71225C.remove(cVar);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f71235a.mo55181a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f71235a.mo55184b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo55143a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m65173a(viewPager, true, false);
    }

    /* renamed from: a */
    private void m65176a(C26997c cVar) {
        if (!this.f71225C.contains(cVar)) {
            this.f71225C.add(cVar);
        }
    }

    /* renamed from: b */
    private void m65181b(C27002f fVar) {
        this.f71235a.addView(fVar.f71292h, fVar.f71289e, m65190e());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m65192f();
        this.f71227E.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f71246l != i) {
            this.f71246l = i;
            m65193g();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f71247m) {
            this.f71247m = i;
            m65193g();
        }
    }

    /* renamed from: a */
    private void m65174a(View view) {
        if (view instanceof C27007b) {
            m65179a((C27007b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: c */
    private void m65186c(C27002f fVar) {
        for (int size = this.f71225C.size() - 1; size >= 0; size--) {
            ((C26997c) this.f71225C.get(size)).mo55178a(fVar);
        }
    }

    /* renamed from: d */
    private void m65189d(C27002f fVar) {
        for (int size = this.f71225C.size() - 1; size >= 0; size--) {
            this.f71225C.get(size);
        }
    }

    /* renamed from: e */
    private void m65191e(C27002f fVar) {
        for (int size = this.f71225C.size() - 1; size >= 0; size--) {
            this.f71225C.get(size);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f71235a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f71235a.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setOnTabSelectedListener(C26997c cVar) {
        if (this.f71224B != null) {
            m65180b(this.f71224B);
        }
        this.f71224B = cVar;
        if (cVar != null) {
            m65176a(cVar);
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f71241g != colorStateList) {
            this.f71241g = colorStateList;
            int size = this.f71254u.size();
            for (int i = 0; i < size; i++) {
                ((C27002f) this.f71254u.get(i)).mo55196c();
            }
        }
    }

    /* renamed from: a */
    private void m65175a(LayoutParams layoutParams) {
        if (this.f71247m == 1 && this.f71246l == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f71256w != 0) {
            layoutParams.leftMargin = this.f71256w;
            layoutParams.rightMargin = this.f71256w;
        }
    }

    /* renamed from: c */
    private C27002f m65184c(int i) {
        C27002f fVar = (C27002f) f71222t.acquire();
        if (fVar == null) {
            fVar = new C27002f();
        }
        fVar.f71291g = this;
        fVar.f71292h = m65187d();
        if (i > 0) {
            fVar.f71292h.mo55199a(fVar, false);
            fVar.mo55192a(i);
        } else {
            fVar.f71292h.setTab(fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo55151b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setTabMargin(int i) {
        this.f71256w = mo55151b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f71235a.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo55151b(i);
            marginLayoutParams.rightMargin = mo55151b(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    private void m65188d(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && C1056u.m3079y(this)) {
                C26999e eVar = this.f71235a;
                int childCount = eVar.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else if (eVar.getChildAt(i2).getWidth() <= 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int a = m65171a(i, 0.0f);
                    if (scrollX != a) {
                        m65192f();
                        this.f71227E.setIntValues(new int[]{scrollX, a});
                        this.f71227E.start();
                    }
                    this.f71235a.mo55185b(i, 300);
                    return;
                }
            }
            m65172a(i, 0.0f, true);
        }
    }

    /* renamed from: a */
    private void m65179a(C27007b bVar) {
        C27002f c = m65184c(0);
        if (bVar.f71315a != null) {
            c.mo55193a(bVar.f71315a);
        }
        if (bVar.f71316b != null) {
            c.f71286b = bVar.f71316b;
            c.mo55196c();
        }
        if (bVar.f71317c != 0) {
            c.mo55192a(bVar.f71317c);
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            c.f71288d = bVar.getContentDescription();
            c.mo55196c();
        }
        m65182b(c, this.f71254u.isEmpty());
    }

    public void addView(View view, int i) {
        m65174a(view);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m65182b(C27002f fVar, boolean z) {
        m65178a(fVar, this.f71254u.size(), z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m65174a(view);
    }

    /* renamed from: a */
    private int m65171a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f71247m != 0) {
            return 0;
        }
        View childAt = this.f71235a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f71235a.getChildCount()) {
            view = this.f71235a.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (i2 + i3 + (this.f71256w * 4))) * 0.5f * f);
        if (C1056u.m3055f(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.mo55151b(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x004a
            int r1 = r5.f71258y
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f71258y
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo55151b(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f71245k = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f71247m
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0076
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0076
        L_0x0069:
            r6 = 1
            goto L_0x0076
        L_0x006b:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0076
            goto L_0x0069
        L_0x0076:
            if (r6 == 0) goto L_0x0096
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m65177a(C27002f fVar, int i) {
        fVar.f71289e = i;
        this.f71254u.add(i, fVar);
        int size = this.f71254u.size();
        while (true) {
            i++;
            if (i < size) {
                ((C27002f) this.f71254u.get(i)).f71289e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m65172a(int i, float f, boolean z) {
        mo55142a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m65174a(view);
    }

    /* renamed from: a */
    private void m65173a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f71250p != null) {
            if (this.f71251q != null) {
                this.f71250p.removeOnPageChangeListener(this.f71251q);
            }
            if (this.f71230H != null) {
                this.f71250p.removeOnAdapterChangeListener(this.f71230H);
            }
        }
        if (this.f71226D != null) {
            m65180b(this.f71226D);
            this.f71226D = null;
        }
        if (viewPager != null) {
            this.f71250p = viewPager;
            if (this.f71251q == null) {
                this.f71251q = new C27003g(this);
            }
            this.f71251q.mo55197a();
            viewPager.addOnPageChangeListener(this.f71251q);
            this.f71226D = new C27005i(viewPager);
            m65176a(this.f71226D);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo55143a(adapter, z);
            }
            if (this.f71230H == null) {
                this.f71230H = new C26995a();
            }
            this.f71230H.f71261a = z;
            viewPager.addOnAdapterChangeListener(this.f71230H);
            m65172a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f71250p = null;
            mo55143a((PagerAdapter) null, false);
        }
        this.f71231I = z2;
    }

    /* JADX INFO: finally extract failed */
    public CommonTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71254u = new ArrayList<>();
        this.f71245k = Integer.MAX_VALUE;
        this.f71225C = new ArrayList<>();
        this.f71234L = new C0797b(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C27008c.f71318a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            this.f71235a = new C26999e(context);
            super.addView(this.f71235a, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a48, R.attr.a49, R.attr.a4_, R.attr.a4a, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4j, R.attr.a4k, R.attr.a4l, R.attr.a4m, R.attr.a4n, R.attr.a4o, R.attr.a4p, R.attr.a4q, R.attr.a4r, R.attr.a4s, R.attr.a4t, R.attr.a4v, R.attr.a4w, R.attr.a4x}, i, R.style.r4);
            this.f71235a.mo55184b(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
            this.f71235a.mo55181a(obtainStyledAttributes2.getColor(7, 0));
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
            this.f71236b = dimensionPixelSize;
            this.f71237c = dimensionPixelSize;
            this.f71238d = dimensionPixelSize;
            this.f71239e = dimensionPixelSize;
            this.f71236b = obtainStyledAttributes2.getDimensionPixelSize(18, this.f71236b);
            this.f71237c = obtainStyledAttributes2.getDimensionPixelSize(19, this.f71237c);
            this.f71238d = obtainStyledAttributes2.getDimensionPixelSize(17, this.f71238d);
            this.f71239e = obtainStyledAttributes2.getDimensionPixelSize(16, this.f71239e);
            this.f71240f = obtainStyledAttributes2.getResourceId(22, R.style.lm);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(this.f71240f, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
            try {
                this.f71242h = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                this.f71241g = obtainStyledAttributes3.getColorStateList(3);
                obtainStyledAttributes3.recycle();
                if (obtainStyledAttributes2.hasValue(23)) {
                    this.f71241g = obtainStyledAttributes2.getColorStateList(23);
                }
                if (obtainStyledAttributes2.hasValue(21)) {
                    this.f71241g = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{obtainStyledAttributes2.getColor(21, 0), this.f71241g.getDefaultColor()});
                }
                this.f71257x = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
                this.f71258y = obtainStyledAttributes2.getDimensionPixelSize(12, -1);
                this.f71244j = obtainStyledAttributes2.getResourceId(0, 0);
                this.f71223A = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
                this.f71247m = obtainStyledAttributes2.getInt(14, 1);
                this.f71246l = obtainStyledAttributes2.getInt(2, 0);
                obtainStyledAttributes2.recycle();
                Resources resources = getResources();
                this.f71243i = (float) resources.getDimensionPixelSize(R.dimen.gr);
                this.f71259z = resources.getDimensionPixelSize(R.dimen.gp);
                this.f71232J = C9432q.m18687b(getContext(), 1.5f);
                this.f71233K = C9432q.m18687b(getContext(), 1.5f);
                this.f71253s = getResources().getConfiguration().orientation;
                m65193g();
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }

    /* renamed from: a */
    private void m65178a(C27002f fVar, int i, boolean z) {
        if (fVar.f71291g == this) {
            m65177a(fVar, i);
            m65181b(fVar);
            if (z) {
                fVar.mo55194a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
