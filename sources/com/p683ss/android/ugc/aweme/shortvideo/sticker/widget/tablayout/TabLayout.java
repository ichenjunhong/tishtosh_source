package com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

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
/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: u */
    private static final C0796a<C44709f> f113090u = new C0798c(16);

    /* renamed from: A */
    private final int f113091A;

    /* renamed from: B */
    private int f113092B;

    /* renamed from: C */
    private C44704c f113093C;

    /* renamed from: D */
    private final ArrayList<C44704c> f113094D;

    /* renamed from: E */
    private C44704c f113095E;

    /* renamed from: F */
    private ValueAnimator f113096F;

    /* renamed from: G */
    private PagerAdapter f113097G;

    /* renamed from: H */
    private DataSetObserver f113098H;

    /* renamed from: I */
    private C44702a f113099I;

    /* renamed from: J */
    private boolean f113100J;

    /* renamed from: K */
    private float f113101K;

    /* renamed from: L */
    private float f113102L;

    /* renamed from: M */
    private boolean f113103M;

    /* renamed from: N */
    private int f113104N;

    /* renamed from: O */
    private boolean f113105O;

    /* renamed from: P */
    private final C0796a<C44713i> f113106P;

    /* renamed from: a */
    public C44706e f113107a;

    /* renamed from: b */
    int f113108b;

    /* renamed from: c */
    int f113109c;

    /* renamed from: d */
    int f113110d;

    /* renamed from: e */
    int f113111e;

    /* renamed from: f */
    int f113112f;

    /* renamed from: g */
    ColorStateList f113113g;

    /* renamed from: h */
    float f113114h;

    /* renamed from: i */
    float f113115i;

    /* renamed from: j */
    final int f113116j;

    /* renamed from: k */
    int f113117k;

    /* renamed from: l */
    int f113118l;

    /* renamed from: m */
    int f113119m;

    /* renamed from: n */
    boolean f113120n;

    /* renamed from: o */
    ViewPager f113121o;

    /* renamed from: p */
    C44710g f113122p;

    /* renamed from: q */
    public boolean f113123q;

    /* renamed from: r */
    public boolean f113124r;

    /* renamed from: s */
    public C44703b f113125s;

    /* renamed from: t */
    public int f113126t;

    /* renamed from: v */
    private final ArrayList<C44709f> f113127v;

    /* renamed from: w */
    private C44709f f113128w;

    /* renamed from: x */
    private int f113129x;

    /* renamed from: y */
    private final int f113130y;

    /* renamed from: z */
    private final int f113131z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$a */
    class C44702a implements C0996d {

        /* renamed from: a */
        public boolean f113133a;

        C44702a() {
        }

        /* renamed from: a */
        public final void mo1576a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.f113121o == viewPager) {
                TabLayout.this.mo90682a(pagerAdapter2, this.f113133a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$b */
    public interface C44703b {
        /* renamed from: a */
        void mo64479a(C44709f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c */
    public interface C44704c {
        /* renamed from: a */
        void mo64263a(C44709f fVar);

        /* renamed from: b */
        void mo64264b(C44709f fVar);

        /* renamed from: c */
        void mo64265c(C44709f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$d */
    class C44705d extends DataSetObserver {
        public final void onChanged() {
            TabLayout.this.mo90696c();
        }

        public final void onInvalidated() {
            TabLayout.this.mo90696c();
        }

        C44705d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e */
    class C44706e extends LinearLayout {

        /* renamed from: a */
        int f113136a = -1;

        /* renamed from: b */
        float f113137b;

        /* renamed from: c */
        public float f113138c;

        /* renamed from: d */
        public float f113139d;

        /* renamed from: e */
        public boolean f113140e;

        /* renamed from: g */
        private int f113142g;

        /* renamed from: h */
        private final Paint f113143h;

        /* renamed from: i */
        private int f113144i = -1;

        /* renamed from: j */
        private int f113145j = -1;

        /* renamed from: k */
        private int f113146k = -1;

        /* renamed from: l */
        private ValueAnimator f113147l;

        /* renamed from: m */
        private int f113148m = TabLayout.this.mo90691b(27);

        /* renamed from: n */
        private int f113149n = Integer.MAX_VALUE;

        /* renamed from: a */
        private void m97813a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f113136a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f113137b > 0.0f && this.f113136a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f113136a + 1);
                    i = (int) ((this.f113137b * ((float) childAt2.getLeft())) + ((1.0f - this.f113137b) * ((float) i)));
                    i2 = (int) ((this.f113137b * ((float) childAt2.getRight())) + ((1.0f - this.f113137b) * ((float) i2)));
                }
            }
            mo90733a(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo90734b(int i) {
            if (this.f113142g != i) {
                this.f113142g = i;
                C1056u.m3052d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90731a(int i) {
            if (this.f113143h.getColor() != i) {
                this.f113143h.setColor(i);
                C1056u.m3052d(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f113144i != i) {
                requestLayout();
                this.f113144i = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f113145j >= 0 && this.f113146k > this.f113145j && !TabLayout.this.f113123q) {
                if (TabLayout.this.f113124r) {
                    View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
                    if (childAt != null) {
                        View findViewById = childAt.findViewById(R.id.b__);
                        if (findViewById != null) {
                            if (TabLayout.this.f113121o == null || !this.f113140e) {
                                this.f113138c = (float) (this.f113145j + (((this.f113146k - this.f113145j) - findViewById.getWidth()) / 2));
                                this.f113139d = this.f113138c + ((float) findViewById.getWidth());
                            }
                            canvas.drawRect(this.f113138c, (float) (getHeight() - this.f113142g), this.f113139d, (float) getHeight(), this.f113143h);
                            return;
                        }
                    }
                }
                canvas.drawRect((float) this.f113145j, (float) (getHeight() - this.f113142g), (float) this.f113146k, (float) getHeight(), this.f113143h);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90733a(int i, int i2) {
            if (i != this.f113145j || i2 != this.f113146k) {
                this.f113145j = i;
                this.f113146k = i2;
                C1056u.m3052d(this);
            }
        }

        C44706e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f113143h = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90732a(int i, float f) {
            if (this.f113147l != null && this.f113147l.isRunning()) {
                this.f113147l.cancel();
            }
            this.f113136a = i;
            this.f113137b = f;
            m97813a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo90735b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f113147l != null && this.f113147l.isRunning()) {
                this.f113147l.cancel();
            }
            if (C1056u.m3055f(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m97813a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f113136a) <= 1) {
                i4 = this.f113145j;
                i3 = this.f113146k;
            } else {
                int b = TabLayout.this.mo90691b(24);
                if (i < this.f113136a) {
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
                this.f113147l = valueAnimator;
                valueAnimator.setInterpolator(C44715a.f113193b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C447071 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C44706e.this.mo90733a(C44715a.m97832a(i4, left, animatedFraction), C44715a.m97832a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C44706e.this.f113136a = i;
                        C44706e.this.f113137b = 0.0f;
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
                        this.f113149n = Math.min(this.f113149n, childAt.getMeasuredWidth());
                    }
                }
                if (TabLayout.this.f113119m == 1 && TabLayout.this.f113118l == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.mo90691b(16) * 2)) {
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
                            TabLayout.this.f113118l = 0;
                            TabLayout.this.mo90686a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (TabLayout.this.f113119m == 0 && TabLayout.this.f113120n && TabLayout.this.f113126t == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0 && i6 < TabLayout.this.getMeasuredWidth()) {
                        int i8 = i4 * childCount;
                        if (i8 < TabLayout.this.getMeasuredWidth()) {
                            int measuredWidth = (TabLayout.this.getMeasuredWidth() - i8) / (childCount * 2);
                            z = false;
                            while (i3 < childCount) {
                                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams2.width != i4 || layoutParams2.weight != 0.0f || layoutParams2.leftMargin != measuredWidth || layoutParams2.rightMargin != measuredWidth) {
                                    layoutParams2.width = i4;
                                    layoutParams2.weight = 0.0f;
                                    layoutParams2.leftMargin = measuredWidth;
                                    layoutParams2.rightMargin = measuredWidth;
                                    z = true;
                                }
                                i3++;
                            }
                        } else {
                            int measuredWidth2 = (TabLayout.this.getMeasuredWidth() - i6) / (childCount * 2);
                            boolean z3 = false;
                            while (i3 < childCount) {
                                if (getChildAt(i3).getVisibility() != 8) {
                                    LayoutParams layoutParams3 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                    layoutParams3.leftMargin = measuredWidth2;
                                    layoutParams3.rightMargin = measuredWidth2;
                                    z3 = true;
                                }
                                i3++;
                            }
                            z = z3;
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f113147l == null || !this.f113147l.isRunning()) {
                m97813a();
                return;
            }
            this.f113147l.cancel();
            mo90735b(this.f113136a, Math.round((1.0f - this.f113147l.getAnimatedFraction()) * ((float) this.f113147l.getDuration())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f */
    public static final class C44709f {

        /* renamed from: a */
        public Object f113157a;

        /* renamed from: b */
        public Drawable f113158b;

        /* renamed from: c */
        public CharSequence f113159c;

        /* renamed from: d */
        public CharSequence f113160d;

        /* renamed from: e */
        public int f113161e = -1;

        /* renamed from: f */
        public View f113162f;

        /* renamed from: g */
        TabLayout f113163g;

        /* renamed from: h */
        public C44713i f113164h;

        C44709f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo90746c() {
            if (this.f113164h != null) {
                this.f113164h.mo90754b();
            }
        }

        /* renamed from: a */
        public final void mo90744a() {
            if (this.f113163g != null) {
                this.f113163g.mo90693b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: b */
        public final boolean mo90745b() {
            if (this.f113163g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f113163g.getSelectedTabPosition() == this.f113161e) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo90747d() {
            this.f113163g = null;
            this.f113164h = null;
            this.f113157a = null;
            this.f113158b = null;
            this.f113159c = null;
            this.f113160d = null;
            this.f113161e = -1;
            this.f113162f = null;
        }

        /* renamed from: a */
        public final C44709f mo90742a(View view) {
            this.f113162f = view;
            mo90746c();
            return this;
        }

        /* renamed from: a */
        public final C44709f mo90743a(CharSequence charSequence) {
            this.f113159c = charSequence;
            mo90746c();
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$g */
    public static class C44710g implements C0997e {

        /* renamed from: a */
        private final WeakReference<TabLayout> f113165a;

        /* renamed from: b */
        private int f113166b;

        /* renamed from: c */
        private int f113167c;

        /* renamed from: d */
        private int f113168d;

        /* renamed from: e */
        private int f113169e;

        /* renamed from: f */
        private ArgbEvaluator f113170f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f113171g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f113172h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90748a() {
            this.f113167c = 0;
            this.f113166b = 0;
        }

        public final void onPageScrollStateChanged(int i) {
            this.f113166b = this.f113167c;
            this.f113167c = i;
        }

        public C44710g(TabLayout tabLayout) {
            this.f113165a = new WeakReference<>(tabLayout);
            this.f113169e = tabLayout.getTabTextColors().getColorForState(TabLayout.SELECTED_STATE_SET, 0);
            this.f113168d = tabLayout.getTabTextColors().getDefaultColor();
        }

        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f113165a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f113167c == 0 || (this.f113167c == 2 && this.f113166b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo90694b(tabLayout.mo90679a(i), z);
            }
        }

        /* renamed from: a */
        private static void m97825a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f113165a.get();
            if (tabLayout != null) {
                if (this.f113167c != 2 || this.f113166b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f113167c == 2 && this.f113166b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                tabLayout.mo90680a(i, f, z, z2);
                if (this.f113167c == 2 && this.f113166b == 0) {
                    tabLayout.f113107a.f113140e = false;
                } else {
                    tabLayout.f113107a.f113140e = true;
                    View childAt = tabLayout.f113107a.getChildAt(tabLayout.f113107a.f113136a);
                    View childAt2 = tabLayout.f113107a.getChildAt(tabLayout.f113107a.f113136a + 1);
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
                            m97825a((ImageView) findViewById.findViewById(R.id.cww), (TextView) findViewById.findViewById(R.id.cwx), ((Integer) this.f113170f.evaluate(f, Integer.valueOf(this.f113169e), Integer.valueOf(this.f113168d))).intValue());
                            m97825a(imageView, textView, ((Integer) this.f113170f.evaluate(f, Integer.valueOf(this.f113168d), Integer.valueOf(this.f113169e))).intValue());
                            tabLayout.f113107a.f113138c = left + ((left2 - left) * this.f113171g.getInterpolation(f));
                            tabLayout.f113107a.f113139d = width + ((width2 - width) * this.f113171g.getInterpolation(f));
                        }
                    }
                }
                C1056u.m3052d(tabLayout.f113107a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h */
    public static class C44711h implements C0997e {

        /* renamed from: a */
        final boolean f113173a;

        /* renamed from: b */
        private final WeakReference<TabLayout> f113174b;

        /* renamed from: c */
        private int f113175c;

        /* renamed from: d */
        private int f113176d;

        /* renamed from: e */
        private int f113177e;

        public final void onPageScrollStateChanged(int i) {
            this.f113175c = this.f113176d;
            this.f113176d = i;
        }

        public C44711h(TabLayout tabLayout) {
            this.f113174b = new WeakReference<>(tabLayout);
            boolean z = true;
            if (C1056u.m3055f(tabLayout) != 1) {
                z = false;
            }
            this.f113173a = z;
        }

        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f113174b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f113176d == 0 || (this.f113176d == 2 && this.f113175c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo90694b(tabLayout.mo90679a(i), z);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f113174b.get();
            if (!(this.f113177e == i || tabLayout == null)) {
                if (this.f113176d != 2 || this.f113175c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f113176d == 2 && this.f113175c == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i3 = i;
                C44717c cVar = new C44717c(this, this.f113177e, i3, tabLayout, z, z2);
                duration.addUpdateListener(cVar);
                this.f113177e = i;
                final TabLayout tabLayout2 = tabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                C447121 r0 = new AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        tabLayout2.mo90680a(i3, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        tabLayout2.mo90680a(i3, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$i */
    public class C44713i extends LinearLayout {

        /* renamed from: b */
        private C44709f f113184b;

        /* renamed from: c */
        private TextView f113185c;

        /* renamed from: d */
        private ImageView f113186d;

        /* renamed from: e */
        private View f113187e;

        /* renamed from: f */
        private TextView f113188f;

        /* renamed from: g */
        private ImageView f113189g;

        /* renamed from: h */
        private int f113190h = 2;

        public final C44709f getTab() {
            return this.f113184b;
        }

        public final TextView getTextView() {
            return this.f113185c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90753a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f113184b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (TabLayout.this.f113125s != null) {
                TabLayout.this.f113125s.mo64479a(this.f113184b);
            } else {
                this.f113184b.mo90744a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo90754b() {
            View view;
            boolean z;
            C44709f fVar = this.f113184b;
            if (fVar != null) {
                view = fVar.f113162f;
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
                this.f113187e = view;
                if (this.f113185c != null) {
                    this.f113185c.setVisibility(8);
                }
                if (this.f113186d != null) {
                    this.f113186d.setVisibility(8);
                    this.f113186d.setImageDrawable(null);
                }
                this.f113188f = (TextView) view.findViewById(16908308);
                if (this.f113188f != null) {
                    this.f113190h = C1115o.m3252a(this.f113188f);
                }
                this.f113189g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f113187e != null) {
                    removeView(this.f113187e);
                    this.f113187e = null;
                }
                this.f113188f = null;
                this.f113189g = null;
            }
            if (fVar == null || !fVar.mo90745b()) {
                z = false;
            } else {
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
        public final void setTab(C44709f fVar) {
            if (fVar != this.f113184b) {
                this.f113184b = fVar;
                mo90754b();
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
            if (this.f113185c != null) {
                this.f113185c.setSelected(z);
            }
            if (this.f113186d != null) {
                this.f113186d.setSelected(z);
            }
            if (this.f113187e != null) {
                this.f113187e.setSelected(z);
            }
        }

        public C44713i(Context context) {
            super(context);
            if (TabLayout.this.f113116j != 0) {
                C1056u.m3030a((View) this, C1124a.m3315b(context, TabLayout.this.f113116j));
            }
            C1056u.m3044b(this, TabLayout.this.f113108b, TabLayout.this.f113109c, TabLayout.this.f113110d, TabLayout.this.f113111e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C1056u.m3033a((View) this, C1052q.m3014a(getContext(), BaseNotice.CHECK_PROFILE));
        }

        public final void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f113117k, DynamicTabYellowPointVersion.DEFAULT);
            }
            super.onMeasure(i, i2);
            if (this.f113185c != null) {
                getResources();
                float f = TabLayout.this.f113114h;
                int i3 = this.f113190h;
                boolean z = true;
                if (this.f113186d != null && this.f113186d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f113185c != null && this.f113185c.getLineCount() > 1) {
                    f = TabLayout.this.f113115i;
                }
                float textSize = this.f113185c.getTextSize();
                int lineCount = this.f113185c.getLineCount();
                int a = C1115o.m3252a(this.f113185c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.f113119m == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f113185c.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f113185c.setTextSize(0, f);
                        this.f113185c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$j */
    public static class C44714j implements C44704c {

        /* renamed from: a */
        private final ViewPager f113191a;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        public C44714j(ViewPager viewPager) {
            this.f113191a = viewPager;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            this.f113191a.setCurrentItem(fVar.f113161e);
        }
    }

    public C44709f getCurSelectedTab() {
        return this.f113128w;
    }

    public int getTabGravity() {
        return this.f113118l;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f113117k;
    }

    public int getTabMode() {
        return this.f113119m;
    }

    public ColorStateList getTabTextColors() {
        return this.f113113g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90680a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f113107a.getChildCount()) {
            if (z2) {
                this.f113107a.mo90732a(i, f);
            }
            if (this.f113096F != null && this.f113096F.isRunning()) {
                this.f113096F.cancel();
            }
            scrollTo(m97769a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo90684a(C44709f fVar) {
        mo90685a(fVar, this.f113127v.isEmpty());
    }

    /* renamed from: a */
    public final void mo90685a(C44709f fVar, boolean z) {
        m97775a(fVar, this.f113127v.size(), z);
    }

    /* renamed from: a */
    public void mo90683a(C44704c cVar) {
        if (!this.f113094D.contains(cVar)) {
            this.f113094D.add(cVar);
        }
    }

    /* renamed from: a */
    public final C44709f mo90679a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C44709f) this.f113127v.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90682a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f113097G == null || this.f113098H == null)) {
            this.f113097G.unregisterDataSetObserver(this.f113098H);
        }
        this.f113097G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f113098H == null) {
                this.f113098H = new C44705d();
            }
            pagerAdapter.registerDataSetObserver(this.f113098H);
        }
        mo90696c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo90686a(boolean z) {
        for (int i = 0; i < this.f113107a.getChildCount(); i++) {
            View childAt = this.f113107a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m97773a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public int getTabCount() {
        return this.f113127v.size();
    }

    /* renamed from: f */
    private LayoutParams m97785f() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m97773a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        C44706e eVar = this.f113107a;
        return ((float) eVar.f113136a) + eVar.f113137b;
    }

    public int getSelectedTabPosition() {
        if (this.f113128w != null) {
            return this.f113128w.f113161e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f113100J) {
            setupWithViewPager(null);
            this.f113100J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabMinWidth() {
        if (this.f113130y != -1) {
            return this.f113130y;
        }
        if (this.f113119m == 0) {
            return this.f113091A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f113107a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f113121o == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m97771a((ViewPager) parent, true, true);
            }
        }
    }

    /* renamed from: g */
    private void m97788g() {
        if (this.f113096F == null) {
            this.f113096F = new ValueAnimator();
            this.f113096F.setInterpolator(C44715a.f113193b);
            this.f113096F.setDuration(300);
            this.f113096F.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.f113127v.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C44709f fVar = (C44709f) this.f113127v.get(i);
            if (fVar != null && fVar.f113158b != null && !TextUtils.isEmpty(fVar.f113159c)) {
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

    /* renamed from: h */
    private void m97790h() {
        int i;
        if (this.f113119m == 0) {
            i = Math.max(0, this.f113092B - this.f113108b);
        } else {
            i = 0;
        }
        C1056u.m3044b(this.f113107a, i, 0, 0, 0);
        switch (this.f113119m) {
            case 0:
                this.f113107a.setGravity(8388611);
                break;
            case 1:
                this.f113107a.setGravity(1);
                break;
        }
        mo90686a(true);
    }

    /* renamed from: d */
    public final void mo90698d() {
        if (this.f113128w != null) {
            this.f113107a.mo90732a(-1, 0.0f);
            m97787f(this.f113128w);
            this.f113128w = null;
        }
    }

    /* renamed from: b */
    public final void mo90692b() {
        for (int childCount = this.f113107a.getChildCount() - 1; childCount >= 0; childCount--) {
            m97782e(childCount);
        }
        Iterator it = this.f113127v.iterator();
        while (it.hasNext()) {
            C44709f fVar = (C44709f) it.next();
            it.remove();
            fVar.mo90747d();
            f113090u.release(fVar);
        }
        this.f113128w = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo90696c() {
        if (this.f113105O) {
            mo90692b();
            if (this.f113097G != null) {
                int count = this.f113097G.getCount();
                m97780d(count);
                for (int i = 0; i < count; i++) {
                    mo90685a(mo90678a().mo90743a(this.f113097G.getPageTitle(i)), false);
                }
                if (this.f113121o != null && count > 0) {
                    int currentItem = this.f113121o.getCurrentItem();
                    if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                        mo90693b(mo90679a(currentItem));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C44709f mo90678a() {
        C44709f fVar = (C44709f) f113090u.acquire();
        if (fVar == null) {
            fVar = new C44709f();
        }
        fVar.f113163g = this;
        fVar.f113164h = m97779c(fVar);
        return fVar;
    }

    public void addView(View view) {
        m97772a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f113120n = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.f113105O = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.f113123q = z;
    }

    public void setOnTabClickListener(C44703b bVar) {
        this.f113125s = bVar;
    }

    public void setSupportCustomIndicator(boolean z) {
        this.f113124r = z;
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m97778b(C44704c cVar) {
        this.f113094D.remove(cVar);
    }

    /* renamed from: c */
    public final View mo90695c(int i) {
        return this.f113107a.getChildAt(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f113107a.mo90731a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f113107a.mo90734b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo90682a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m97771a(viewPager, true, false);
    }

    /* renamed from: d */
    private void m97781d(C44709f fVar) {
        this.f113107a.addView(fVar.f113164h, fVar.f113161e, m97785f());
    }

    /* renamed from: b */
    public final void mo90693b(C44709f fVar) {
        mo90694b(fVar, true);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m97788g();
        this.f113096F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f113118l != i) {
            this.f113118l = i;
            m97790h();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f113119m) {
            this.f113119m = i;
            m97790h();
        }
    }

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f113107a.getLayoutParams();
        layoutParams.leftMargin = i;
        this.f113107a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m97772a(View view) {
        if (view instanceof C44716b) {
            m97776a((C44716b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private void m97780d(int i) {
        if (this.f113103M) {
            if (i > this.f113104N) {
                setTabMode(0);
                return;
            }
            setTabMode(1);
        }
    }

    /* renamed from: e */
    private void m97782e(int i) {
        C44713i iVar = (C44713i) this.f113107a.getChildAt(i);
        this.f113107a.removeViewAt(i);
        if (iVar != null) {
            iVar.mo90753a();
            this.f113106P.release(iVar);
        }
        requestLayout();
    }

    /* renamed from: f */
    private void m97787f(C44709f fVar) {
        for (int size = this.f113094D.size() - 1; size >= 0; size--) {
            ((C44704c) this.f113094D.get(size)).mo64264b(fVar);
        }
    }

    /* renamed from: g */
    private void m97789g(C44709f fVar) {
        for (int size = this.f113094D.size() - 1; size >= 0; size--) {
            ((C44704c) this.f113094D.get(size)).mo64265c(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f113107a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f113107a.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setOnTabSelectedListener(C44704c cVar) {
        if (this.f113093C != null) {
            m97778b(this.f113093C);
        }
        this.f113093C = cVar;
        if (cVar != null) {
            mo90683a(cVar);
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f113113g != colorStateList) {
            this.f113113g = colorStateList;
            int size = this.f113127v.size();
            for (int i = 0; i < size; i++) {
                ((C44709f) this.f113127v.get(i)).mo90746c();
            }
        }
    }

    /* renamed from: a */
    private void m97773a(LayoutParams layoutParams) {
        if (this.f113119m == 1 && this.f113118l == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f113129x != 0) {
            layoutParams.leftMargin = this.f113129x;
            layoutParams.rightMargin = this.f113129x;
        }
    }

    /* renamed from: c */
    private C44713i m97779c(C44709f fVar) {
        C44713i iVar;
        if (this.f113106P != null) {
            iVar = (C44713i) this.f113106P.acquire();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new C44713i(getContext());
        }
        iVar.setTab(fVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        return iVar;
    }

    /* renamed from: e */
    private void m97783e(C44709f fVar) {
        for (int size = this.f113094D.size() - 1; size >= 0; size--) {
            ((C44704c) this.f113094D.get(size)).mo64263a(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo90691b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setTabMargin(int i) {
        this.f113129x = mo90691b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f113107a.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo90691b(i);
            marginLayoutParams.rightMargin = mo90691b(i);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    /* renamed from: f */
    private void m97786f(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && C1056u.m3079y(this)) {
                C44706e eVar = this.f113107a;
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
                    int a = m97769a(i, 0.0f);
                    if (scrollX != a) {
                        m97788g();
                        this.f113096F.setIntValues(new int[]{scrollX, a});
                        this.f113096F.start();
                    }
                    this.f113107a.mo90735b(i, 300);
                    return;
                }
            }
            m97770a(i, 0.0f, true);
        }
    }

    /* renamed from: a */
    private void m97776a(C44716b bVar) {
        C44709f a = mo90678a();
        if (bVar.f113197a != null) {
            a.mo90743a(bVar.f113197a);
        }
        if (bVar.f113198b != null) {
            a.f113158b = bVar.f113198b;
            a.mo90746c();
        }
        if (bVar.f113199c != 0) {
            a.mo90742a(LayoutInflater.from(a.f113164h.getContext()).inflate(bVar.f113199c, a.f113164h, false));
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            a.f113160d = bVar.getContentDescription();
            a.mo90746c();
        }
        mo90684a(a);
    }

    public void addView(View view, int i) {
        m97772a(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo90681a(int i, int i2) {
        setTabTextColors(m97777b(i, i2));
    }

    /* renamed from: b */
    private static ColorStateList m97777b(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m97772a(view);
    }

    /* renamed from: a */
    private int m97769a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f113119m != 0) {
            return 0;
        }
        View childAt = this.f113107a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f113107a.getChildCount()) {
            view = this.f113107a.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f113129x * 4))) * 0.5f * f);
        if (C1056u.m3055f(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo90694b(C44709f fVar, boolean z) {
        int i;
        C44709f fVar2 = this.f113128w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f113161e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f113161e == -1) && i != -1) {
                    m97770a(i, 0.0f, true);
                } else {
                    m97786f(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m97787f(fVar2);
            }
            this.f113128w = fVar;
            if (fVar != null) {
                m97783e(fVar);
            }
        } else if (fVar2 != null) {
            m97789g(fVar);
            m97786f(fVar.f113161e);
        }
    }

    /* renamed from: c */
    public final void mo90697c(C44709f fVar, boolean z) {
        int i;
        C44709f fVar2 = this.f113128w;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f113161e;
            } else {
                i = -1;
            }
            if ((fVar2 == null || fVar2.f113161e == -1) && i != -1) {
                m97770a(i, 0.0f, true);
            } else {
                m97786f(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
            if (fVar2 != null) {
                m97787f(fVar2);
            }
            this.f113128w = fVar;
            if (fVar != null) {
                m97783e(fVar);
            }
        } else if (fVar2 != null) {
            m97789g(fVar);
            smoothScrollTo(m97769a(fVar.f113161e, 0.0f), 0);
        }
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
            int r0 = r5.mo90691b(r0)
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
            int r1 = r5.f113131z
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f113131z
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo90691b(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f113117k = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f113119m
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m97774a(C44709f fVar, int i) {
        fVar.f113161e = i;
        this.f113127v.add(i, fVar);
        int size = this.f113127v.size();
        while (true) {
            i++;
            if (i < size) {
                ((C44709f) this.f113127v.get(i)).f113161e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m97770a(int i, float f, boolean z) {
        mo90680a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m97772a(view);
    }

    /* renamed from: a */
    private void m97771a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f113121o != null) {
            if (this.f113122p != null) {
                this.f113121o.removeOnPageChangeListener(this.f113122p);
            }
            if (this.f113099I != null) {
                this.f113121o.removeOnAdapterChangeListener(this.f113099I);
            }
        }
        if (this.f113095E != null) {
            m97778b(this.f113095E);
            this.f113095E = null;
        }
        if (viewPager != null) {
            this.f113121o = viewPager;
            if (this.f113122p == null) {
                this.f113122p = new C44710g(this);
            }
            this.f113122p.mo90748a();
            viewPager.addOnPageChangeListener(this.f113122p);
            this.f113095E = new C44714j(viewPager);
            mo90683a(this.f113095E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo90682a(adapter, z);
            }
            if (this.f113099I == null) {
                this.f113099I = new C44702a();
            }
            this.f113099I.f113133a = z;
            viewPager.addOnAdapterChangeListener(this.f113099I);
            m97770a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f113121o = null;
            mo90682a((PagerAdapter) null, false);
        }
        this.f113100J = z2;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113127v = new ArrayList<>();
        this.f113117k = Integer.MAX_VALUE;
        this.f113094D = new ArrayList<>();
        this.f113105O = true;
        this.f113124r = true;
        this.f113106P = new C0797b(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C44718d.f113206a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            this.f113107a = new C44706e(context);
            super.addView(this.f113107a, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a48, R.attr.a49, R.attr.a4_, R.attr.a4a, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4j, R.attr.a4k, R.attr.a4l, R.attr.a4m, R.attr.a4n, R.attr.a4o, R.attr.a4p, R.attr.a4q, R.attr.a4r, R.attr.a4s, R.attr.a4t, R.attr.a4v, R.attr.a4w, R.attr.a4x}, i, R.style.r4);
            this.f113107a.mo90734b(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
            this.f113107a.mo90731a(obtainStyledAttributes2.getColor(7, 0));
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
            this.f113111e = dimensionPixelSize;
            this.f113110d = dimensionPixelSize;
            this.f113109c = dimensionPixelSize;
            this.f113108b = dimensionPixelSize;
            this.f113108b = obtainStyledAttributes2.getDimensionPixelSize(18, this.f113108b);
            this.f113109c = obtainStyledAttributes2.getDimensionPixelSize(19, this.f113109c);
            this.f113110d = obtainStyledAttributes2.getDimensionPixelSize(17, this.f113110d);
            this.f113111e = obtainStyledAttributes2.getDimensionPixelSize(16, this.f113111e);
            this.f113112f = obtainStyledAttributes2.getResourceId(22, R.style.lm);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(this.f113112f, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
            try {
                this.f113114h = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                this.f113113g = obtainStyledAttributes3.getColorStateList(3);
                obtainStyledAttributes3.recycle();
                if (obtainStyledAttributes2.hasValue(23)) {
                    this.f113113g = obtainStyledAttributes2.getColorStateList(23);
                }
                if (obtainStyledAttributes2.hasValue(21)) {
                    this.f113113g = m97777b(this.f113113g.getDefaultColor(), obtainStyledAttributes2.getColor(21, 0));
                }
                this.f113130y = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
                this.f113131z = obtainStyledAttributes2.getDimensionPixelSize(12, -1);
                this.f113116j = obtainStyledAttributes2.getResourceId(0, 0);
                this.f113092B = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
                this.f113119m = obtainStyledAttributes2.getInt(14, 1);
                this.f113118l = obtainStyledAttributes2.getInt(2, 0);
                obtainStyledAttributes2.recycle();
                Resources resources = getResources();
                this.f113115i = (float) resources.getDimensionPixelSize(R.dimen.gr);
                this.f113091A = resources.getDimensionPixelSize(R.dimen.gp);
                this.f113101K = C9432q.m18687b(getContext(), 1.5f);
                this.f113102L = C9432q.m18687b(getContext(), 1.5f);
                this.f113126t = getResources().getConfiguration().orientation;
                m97790h();
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }

    /* renamed from: a */
    private void m97775a(C44709f fVar, int i, boolean z) {
        if (fVar.f113163g == this) {
            m97774a(fVar, i);
            m97781d(fVar);
            if (z) {
                fVar.mo90744a();
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
