package com.bytedance.ies.dmt.p664ui.widget.tablayout;

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
import android.support.p030v4.view.p042b.C1023b;
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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p665a.C10636b.C10637a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0993a
/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout */
public class DmtTabLayout extends HorizontalScrollView {

    /* renamed from: N */
    private static final int[] f28790N = {R.attr.fx};

    /* renamed from: a */
    public static final Interpolator f28791a = new C1023b();

    /* renamed from: v */
    private static final C0796a<C10742f> f28792v = new C0798c(16);

    /* renamed from: A */
    private int f28793A;

    /* renamed from: B */
    private final int f28794B;

    /* renamed from: C */
    private int f28795C;

    /* renamed from: D */
    private C10737c f28796D;

    /* renamed from: E */
    private C10737c f28797E;

    /* renamed from: F */
    private ValueAnimator f28798F;

    /* renamed from: G */
    private PagerAdapter f28799G;

    /* renamed from: H */
    private DataSetObserver f28800H;

    /* renamed from: I */
    private C10735a f28801I;

    /* renamed from: J */
    private boolean f28802J;

    /* renamed from: K */
    private float f28803K;

    /* renamed from: L */
    private float f28804L;

    /* renamed from: M */
    private final C0796a<C10744h> f28805M;

    /* renamed from: b */
    public final C10739e f28806b;

    /* renamed from: c */
    int f28807c;

    /* renamed from: d */
    int f28808d;

    /* renamed from: e */
    int f28809e;

    /* renamed from: f */
    int f28810f;

    /* renamed from: g */
    int f28811g;

    /* renamed from: h */
    ColorStateList f28812h;

    /* renamed from: i */
    float f28813i;

    /* renamed from: j */
    float f28814j;

    /* renamed from: k */
    int f28815k;

    /* renamed from: l */
    int f28816l;

    /* renamed from: m */
    int f28817m;

    /* renamed from: n */
    int f28818n;

    /* renamed from: o */
    int f28819o;

    /* renamed from: p */
    boolean f28820p;

    /* renamed from: q */
    public final ArrayList<C10737c> f28821q;

    /* renamed from: r */
    ViewPager f28822r;

    /* renamed from: s */
    C10743g f28823s;

    /* renamed from: t */
    public C10736b f28824t;

    /* renamed from: u */
    public int f28825u;

    /* renamed from: w */
    private final ArrayList<C10742f> f28826w;

    /* renamed from: x */
    private C10742f f28827x;

    /* renamed from: y */
    private int f28828y;

    /* renamed from: z */
    private int f28829z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$a */
    class C10735a implements C0996d {

        /* renamed from: a */
        public boolean f28831a;

        C10735a() {
        }

        /* renamed from: a */
        public final void mo1576a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (DmtTabLayout.this.f28822r == viewPager) {
                DmtTabLayout.this.mo19348a(pagerAdapter2, this.f28831a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b */
    public interface C10736b {
        /* renamed from: a */
        void mo19399a(C10742f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$c */
    public interface C10737c {
        /* renamed from: a */
        void mo19400a(C10742f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$d */
    class C10738d extends DataSetObserver {
        public final void onChanged() {
            DmtTabLayout.this.mo19345a();
        }

        public final void onInvalidated() {
            DmtTabLayout.this.mo19345a();
        }

        C10738d() {
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$e */
    class C10739e extends LinearLayout {

        /* renamed from: a */
        int f28834a = -1;

        /* renamed from: b */
        float f28835b;

        /* renamed from: c */
        public float f28836c;

        /* renamed from: d */
        public float f28837d;

        /* renamed from: e */
        public boolean f28838e;

        /* renamed from: f */
        int f28839f;

        /* renamed from: h */
        private int f28841h;

        /* renamed from: i */
        private final Paint f28842i;

        /* renamed from: j */
        private int f28843j = -1;

        /* renamed from: k */
        private int f28844k = -1;

        /* renamed from: l */
        private int f28845l = -1;

        /* renamed from: m */
        private ValueAnimator f28846m;

        /* renamed from: n */
        private int f28847n = DmtTabLayout.this.mo19359c(27);

        /* renamed from: o */
        private int f28848o = Integer.MAX_VALUE;

        /* renamed from: a */
        private void m21761a() {
            int i;
            View childAt = getChildAt(this.f28834a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f28835b > 0.0f && this.f28834a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f28834a + 1);
                    i2 = (int) ((this.f28835b * ((float) childAt2.getLeft())) + ((1.0f - this.f28835b) * ((float) i2)));
                    i = (int) ((this.f28835b * ((float) childAt2.getRight())) + ((1.0f - this.f28835b) * ((float) i)));
                }
            }
            mo19405a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo19406b(int i) {
            if (this.f28841h != i) {
                this.f28841h = i;
                C1056u.m3052d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19403a(int i) {
            if (this.f28842i.getColor() != i) {
                this.f28842i.setColor(i);
                C1056u.m3052d(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f28843j != i) {
                requestLayout();
                this.f28843j = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f28844k >= 0 && this.f28845l > this.f28844k) {
                View childAt = getChildAt(DmtTabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.b__);
                    if (findViewById != null) {
                        if (DmtTabLayout.this.f28822r == null || !this.f28838e) {
                            this.f28836c = (float) (this.f28844k + (((this.f28845l - this.f28844k) - findViewById.getWidth()) / 2));
                            this.f28837d = this.f28836c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f28836c + ((float) this.f28839f), (float) (getHeight() - this.f28841h), this.f28837d - ((float) this.f28839f), (float) getHeight(), this.f28842i);
                        return;
                    }
                }
                canvas.drawRect((float) (this.f28844k + this.f28839f), (float) (getHeight() - this.f28841h), (float) (this.f28845l - this.f28839f), (float) getHeight(), this.f28842i);
            }
        }

        C10739e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f28842i = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19404a(int i, float f) {
            if (this.f28846m != null && this.f28846m.isRunning()) {
                this.f28846m.cancel();
            }
            this.f28834a = i;
            this.f28835b = f;
            m21761a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19405a(int i, int i2) {
            if (i != this.f28844k || i2 != this.f28845l) {
                this.f28844k = i;
                this.f28845l = i2;
                C1056u.m3052d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo19407b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f28846m != null && this.f28846m.isRunning()) {
                this.f28846m.cancel();
            }
            if (C1056u.m3055f(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m21761a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f28834a) <= 1) {
                i4 = this.f28844k;
                i3 = this.f28845l;
            } else {
                int c = DmtTabLayout.this.mo19359c(24);
                if (i < this.f28834a) {
                    if (!z) {
                        i5 = c + right;
                    }
                    i4 = left - c;
                    i3 = i4;
                } else {
                    if (z) {
                        i5 = c + right;
                    }
                    i4 = left - c;
                    i3 = i4;
                }
                i4 = i5;
                i3 = i4;
            }
            if (!(i4 == left && i3 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f28846m = valueAnimator;
                valueAnimator.setInterpolator(DmtTabLayout.f28791a);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C107401 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C10739e.this.mo19405a(C10739e.m21760a(i4, left, animatedFraction), C10739e.m21760a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C10739e.this.f28834a = i;
                        C10739e.this.f28835b = 0.0f;
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
                        this.f28848o = Math.min(this.f28848o, childAt.getMeasuredWidth());
                    }
                }
                if (DmtTabLayout.this.f28818n == 1 && DmtTabLayout.this.f28817m == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (DmtTabLayout.this.mo19359c(16) * 2)) {
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
                            DmtTabLayout.this.f28817m = 0;
                            DmtTabLayout.this.mo19352a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (DmtTabLayout.this.f28818n == 0 && DmtTabLayout.this.f28820p && DmtTabLayout.this.f28825u == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0) {
                        int measuredWidth = (DmtTabLayout.this.getMeasuredWidth() - DmtTabLayout.this.f28806b.getPaddingLeft()) - DmtTabLayout.this.f28806b.getPaddingRight();
                        if (i6 >= measuredWidth) {
                            z = false;
                        } else if (i4 * childCount < measuredWidth) {
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

        /* renamed from: a */
        static int m21760a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f28846m == null || !this.f28846m.isRunning()) {
                m21761a();
                return;
            }
            this.f28846m.cancel();
            mo19407b(this.f28834a, Math.round((1.0f - this.f28846m.getAnimatedFraction()) * ((float) this.f28846m.getDuration())));
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f */
    public static final class C10742f {

        /* renamed from: a */
        public Object f28856a;

        /* renamed from: b */
        public Drawable f28857b;

        /* renamed from: c */
        public CharSequence f28858c;

        /* renamed from: d */
        public CharSequence f28859d;

        /* renamed from: e */
        public int f28860e = -1;

        /* renamed from: f */
        public View f28861f;

        /* renamed from: g */
        DmtTabLayout f28862g;

        /* renamed from: h */
        public C10744h f28863h;

        C10742f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo19420c() {
            if (this.f28863h != null) {
                this.f28863h.mo19422a();
            }
        }

        /* renamed from: a */
        public final void mo19417a() {
            if (this.f28862g != null) {
                this.f28862g.mo19358b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: b */
        public final boolean mo19419b() {
            if (this.f28862g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f28862g.getSelectedTabPosition() == this.f28860e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final C10742f mo19416a(Object obj) {
            this.f28856a = obj;
            return this;
        }

        /* renamed from: a */
        private C10742f m21767a(View view) {
            this.f28861f = view;
            mo19420c();
            return this;
        }

        /* renamed from: a */
        public final C10742f mo19415a(CharSequence charSequence) {
            this.f28858c = charSequence;
            mo19420c();
            return this;
        }

        /* renamed from: a */
        public final C10742f mo19414a(int i) {
            return m21767a(C10637a.m21423a(this.f28863h.getContext(), i, this.f28863h, false));
        }

        /* renamed from: b */
        public final C10742f mo19418b(int i) {
            if (this.f28862g != null) {
                return mo19415a(this.f28862g.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$g */
    public static class C10743g implements C0997e {

        /* renamed from: a */
        private final WeakReference<DmtTabLayout> f28864a;

        /* renamed from: b */
        private int f28865b;

        /* renamed from: c */
        private int f28866c;

        /* renamed from: d */
        private int f28867d;

        /* renamed from: e */
        private int f28868e;

        /* renamed from: f */
        private ArgbEvaluator f28869f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f28870g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f28871h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19421a() {
            this.f28865b = 0;
            this.f28866c = 0;
        }

        public final void onPageScrollStateChanged(int i) {
            this.f28865b = this.f28866c;
            this.f28866c = i;
        }

        public C10743g(DmtTabLayout dmtTabLayout) {
            this.f28864a = new WeakReference<>(dmtTabLayout);
            this.f28868e = dmtTabLayout.getTabTextColors().getColorForState(DmtTabLayout.SELECTED_STATE_SET, 0);
            this.f28867d = dmtTabLayout.getTabTextColors().getDefaultColor();
        }

        public final void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f28864a.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                if (this.f28866c == 0 || (this.f28866c == 2 && this.f28865b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.mo19351a(dmtTabLayout.mo19357b(i), z);
            }
        }

        /* renamed from: a */
        private static void m21775a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f28864a.get();
            if (dmtTabLayout != null) {
                if (this.f28866c != 2 || this.f28865b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f28866c == 2 && this.f28865b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dmtTabLayout.mo19346a(i, f, z, z2);
                if (this.f28866c == 2 && this.f28865b == 0) {
                    dmtTabLayout.f28806b.f28838e = false;
                } else {
                    dmtTabLayout.f28806b.f28838e = true;
                    View childAt = dmtTabLayout.f28806b.getChildAt(dmtTabLayout.f28806b.f28834a);
                    View childAt2 = dmtTabLayout.f28806b.getChildAt(dmtTabLayout.f28806b.f28834a + 1);
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
                            m21775a((ImageView) findViewById.findViewById(R.id.cww), (TextView) findViewById.findViewById(R.id.cwx), ((Integer) this.f28869f.evaluate(f, Integer.valueOf(this.f28868e), Integer.valueOf(this.f28867d))).intValue());
                            m21775a(imageView, textView, ((Integer) this.f28869f.evaluate(f, Integer.valueOf(this.f28867d), Integer.valueOf(this.f28868e))).intValue());
                            dmtTabLayout.f28806b.f28836c = left + ((left2 - left) * this.f28870g.getInterpolation(f));
                            dmtTabLayout.f28806b.f28837d = width + ((width2 - width) * this.f28870g.getInterpolation(f));
                        }
                    }
                }
                C1056u.m3052d(dmtTabLayout.f28806b);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h */
    public class C10744h extends LinearLayout {

        /* renamed from: b */
        private C10742f f28873b;

        /* renamed from: c */
        private TextView f28874c;

        /* renamed from: d */
        private ImageView f28875d;

        /* renamed from: e */
        private View f28876e;

        /* renamed from: f */
        private TextView f28877f;

        /* renamed from: g */
        private ImageView f28878g;

        /* renamed from: h */
        private int f28879h = 2;

        public final C10742f getTab() {
            return this.f28873b;
        }

        public final TextView getTextView() {
            return this.f28874c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f28873b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (DmtTabLayout.this.f28824t != null) {
                DmtTabLayout.this.f28824t.mo19399a(this.f28873b);
            } else {
                this.f28873b.mo19417a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19422a() {
            View view;
            C10742f fVar = this.f28873b;
            if (fVar != null) {
                view = fVar.f28861f;
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
                this.f28876e = view;
                if (this.f28874c != null) {
                    this.f28874c.setVisibility(8);
                }
                if (this.f28875d != null) {
                    this.f28875d.setVisibility(8);
                    this.f28875d.setImageDrawable(null);
                }
                this.f28877f = (TextView) view.findViewById(16908308);
                if (this.f28877f != null) {
                    this.f28879h = C1115o.m3252a(this.f28877f);
                }
                this.f28878g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f28876e != null) {
                    removeView(this.f28876e);
                    this.f28876e = null;
                }
                this.f28877f = null;
                this.f28878g = null;
            }
            boolean z = false;
            if (this.f28876e == null) {
                if (this.f28875d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.j4, this, false);
                    addView(imageView, 0);
                    this.f28875d = imageView;
                }
                if (this.f28874c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.j5, this, false);
                    addView(textView);
                    this.f28874c = textView;
                    this.f28879h = C1115o.m3252a(this.f28874c);
                }
                C1115o.m3256a(this.f28874c, DmtTabLayout.this.f28811g);
                if (DmtTabLayout.this.f28812h != null) {
                    this.f28874c.setTextColor(DmtTabLayout.this.f28812h);
                }
                m21777a(this.f28874c, this.f28875d);
            } else if (!(this.f28877f == null && this.f28878g == null)) {
                m21777a(this.f28877f, this.f28878g);
            }
            if (fVar != null && fVar.mo19419b()) {
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
        public final void setTab(C10742f fVar) {
            if (fVar != this.f28873b) {
                this.f28873b = fVar;
                mo19422a();
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
            if (this.f28874c != null) {
                this.f28874c.setSelected(z);
            }
            if (this.f28875d != null) {
                this.f28875d.setSelected(z);
            }
            if (this.f28876e != null) {
                this.f28876e.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19423a(C10742f fVar, boolean z) {
            if (fVar != this.f28873b) {
                this.f28873b = fVar;
            }
        }

        public C10744h(Context context) {
            super(context);
            if (DmtTabLayout.this.f28815k != 0) {
                C1056u.m3030a((View) this, C1124a.m3315b(context, DmtTabLayout.this.f28815k));
            }
            C1056u.m3044b(this, DmtTabLayout.this.f28807c, DmtTabLayout.this.f28808d, DmtTabLayout.this.f28809e, DmtTabLayout.this.f28810f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C1056u.m3033a((View) this, C1052q.m3014a(getContext(), BaseNotice.CHECK_PROFILE));
        }

        /* renamed from: a */
        private void m21777a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3 = null;
            if (this.f28873b != null) {
                drawable = this.f28873b.f28857b;
            } else {
                drawable = null;
            }
            if (this.f28873b != null) {
                charSequence = this.f28873b.f28858c;
            } else {
                charSequence = null;
            }
            if (this.f28873b != null) {
                charSequence2 = this.f28873b.f28859d;
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
                    i = DmtTabLayout.this.mo19359c(8);
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
            int tabMaxWidth = DmtTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(DmtTabLayout.this.f28816l, DynamicTabYellowPointVersion.DEFAULT);
            }
            super.onMeasure(i, i2);
            if (this.f28874c != null) {
                getResources();
                float f = DmtTabLayout.this.f28813i;
                int i3 = this.f28879h;
                boolean z = true;
                if (this.f28875d != null && this.f28875d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f28874c != null && this.f28874c.getLineCount() > 1) {
                    f = DmtTabLayout.this.f28814j;
                }
                float textSize = this.f28874c.getTextSize();
                int lineCount = this.f28874c.getLineCount();
                int a = C1115o.m3252a(this.f28874c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (DmtTabLayout.this.f28818n == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f28874c.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f28874c.setTextSize(0, f);
                        this.f28874c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$i */
    public static class C10745i implements C10737c {

        /* renamed from: a */
        private final ViewPager f28880a;

        public C10745i(ViewPager viewPager) {
            this.f28880a = viewPager;
        }

        /* renamed from: a */
        public final void mo19400a(C10742f fVar) {
            this.f28880a.setCurrentItem(fVar.f28860e);
        }
    }

    public int getTabGravity() {
        return this.f28817m;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f28816l;
    }

    public int getTabMode() {
        return this.f28818n;
    }

    public ColorStateList getTabTextColors() {
        return this.f28812h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19346a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f28806b.getChildCount()) {
            if (z2) {
                this.f28806b.mo19404a(i, f);
            }
            if (this.f28798F != null && this.f28798F.isRunning()) {
                this.f28798F.cancel();
            }
            scrollTo(m21724a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo19350a(C10742f fVar) {
        m21733b(fVar, this.f28826w.isEmpty());
    }

    /* renamed from: a */
    public final void mo19349a(C10737c cVar) {
        if (!this.f28821q.contains(cVar)) {
            this.f28821q.add(cVar);
        }
    }

    /* renamed from: a */
    public final C10742f mo19344a(int i) {
        C10742f fVar = (C10742f) f28792v.acquire();
        if (fVar == null) {
            fVar = new C10742f();
        }
        fVar.f28862g = this;
        fVar.f28863h = m21737d();
        if (i > 0) {
            fVar.f28863h.mo19423a(fVar, false);
            fVar.mo19414a(i);
        } else {
            fVar.f28863h.setTab(fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19348a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f28799G == null || this.f28800H == null)) {
            this.f28799G.unregisterDataSetObserver(this.f28800H);
        }
        this.f28799G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f28800H == null) {
                this.f28800H = new C10738d();
            }
            pagerAdapter.registerDataSetObserver(this.f28800H);
        }
        mo19345a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19345a() {
        m21735c();
        if (this.f28799G != null) {
            int count = this.f28799G.getCount();
            for (int i = 0; i < count; i++) {
                m21733b(mo19344a(this.f28819o).mo19415a(this.f28799G.getPageTitle(i)), false);
            }
            if (this.f28822r != null && count > 0) {
                int currentItem = this.f28822r.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo19358b(mo19357b(currentItem));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19351a(C10742f fVar, boolean z) {
        C10742f fVar2 = this.f28827x;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f28860e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f28860e == -1) && i != -1) {
                    m21725a(i, 0.0f, true);
                } else {
                    m21738d(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m21741e(fVar2);
            }
            this.f28827x = fVar;
            if (fVar != null) {
                m21739d(fVar);
            }
        } else if (fVar2 != null) {
            m21743f(fVar);
            m21738d(fVar.f28860e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19352a(boolean z) {
        for (int i = 0; i < this.f28806b.getChildCount(); i++) {
            View childAt = this.f28806b.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m21728a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public int getTabCount() {
        return this.f28826w.size();
    }

    public int getTabStripLeftPadding() {
        return this.f28806b.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f28806b.getPaddingRight();
    }

    /* renamed from: e */
    private LayoutParams m21740e() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m21728a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        C10739e eVar = this.f28806b;
        return ((float) eVar.f28834a) + eVar.f28835b;
    }

    public int getSelectedTabPosition() {
        if (this.f28827x != null) {
            return this.f28827x.f28860e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28802J) {
            setupWithViewPager(null);
            this.f28802J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabMinWidth() {
        if (this.f28829z != -1) {
            return this.f28829z;
        }
        if (this.f28818n == 0) {
            return this.f28794B;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f28806b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28822r == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m21726a((ViewPager) parent, true, true);
            }
        }
    }

    /* renamed from: d */
    private C10744h m21737d() {
        C10744h hVar;
        if (this.f28805M != null) {
            hVar = (C10744h) this.f28805M.acquire();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new C10744h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* renamed from: f */
    private void m21742f() {
        if (this.f28798F == null) {
            this.f28798F = new ValueAnimator();
            this.f28798F.setInterpolator(f28791a);
            this.f28798F.setDuration(200);
            this.f28798F.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DmtTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: g */
    private void m21744g() {
        int i;
        if (this.f28818n == 0) {
            i = Math.max(0, this.f28795C - this.f28807c);
        } else {
            i = 0;
        }
        C1056u.m3044b(this.f28806b, i, 0, 0, 0);
        switch (this.f28818n) {
            case 0:
                this.f28806b.setGravity(8388611);
                break;
            case 1:
                this.f28806b.setGravity(1);
                break;
        }
        mo19352a(true);
    }

    private int getDefaultHeight() {
        int size = this.f28826w.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C10742f fVar = (C10742f) this.f28826w.get(i);
            if (fVar != null && fVar.f28857b != null && !TextUtils.isEmpty(fVar.f28858c)) {
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
    private void m21735c() {
        int childCount = this.f28806b.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C10744h hVar = (C10744h) this.f28806b.getChildAt(childCount);
            this.f28806b.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.f28805M.release(hVar);
            }
            requestLayout();
        }
        Iterator it = this.f28826w.iterator();
        while (it.hasNext()) {
            C10742f fVar = (C10742f) it.next();
            it.remove();
            fVar.f28862g = null;
            fVar.f28863h = null;
            fVar.f28856a = null;
            fVar.f28857b = null;
            fVar.f28858c = null;
            fVar.f28859d = null;
            fVar.f28860e = -1;
            fVar.f28861f = null;
            f28792v.release(fVar);
        }
        this.f28827x = null;
    }

    public void addView(View view) {
        m21727a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f28820p = z;
    }

    public void setContentInsetStart(int i) {
        this.f28795C = i;
    }

    public void setCustomTabViewResId(int i) {
        this.f28819o = i;
    }

    public void setOnTabClickListener(C10736b bVar) {
        this.f28824t = bVar;
    }

    public void setTabBackgroundResId(int i) {
        this.f28815k = i;
    }

    public void setTabMaxWidth(int i) {
        this.f28793A = i;
    }

    public void setTabMinWidth(int i) {
        this.f28829z = i;
    }

    public void setTabPaddingBottom(int i) {
        this.f28810f = i;
    }

    public void setTabPaddingEnd(int i) {
        this.f28809e = i;
    }

    public void setTabPaddingStart(int i) {
        this.f28807c = i;
    }

    public void setTabPaddingTop(int i) {
        this.f28808d = i;
    }

    public void setTabTextAppearance(int i) {
        this.f28811g = i;
    }

    public DmtTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m21732b(C10737c cVar) {
        this.f28821q.remove(cVar);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.f28806b.f28839f = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f28806b.mo19403a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f28806b.mo19406b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo19348a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m21726a(viewPager, true, false);
    }

    /* renamed from: c */
    private void m21736c(C10742f fVar) {
        this.f28806b.addView(fVar.f28863h, fVar.f28860e, m21740e());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m21742f();
        this.f28798F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f28817m != i) {
            this.f28817m = i;
            m21744g();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f28818n) {
            this.f28818n = i;
            m21744g();
        }
    }

    /* renamed from: a */
    private void m21727a(View view) {
        if (view instanceof C10746a) {
            m21731a((C10746a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private void m21739d(C10742f fVar) {
        for (int size = this.f28821q.size() - 1; size >= 0; size--) {
            ((C10737c) this.f28821q.get(size)).mo19400a(fVar);
        }
    }

    /* renamed from: e */
    private void m21741e(C10742f fVar) {
        for (int size = this.f28821q.size() - 1; size >= 0; size--) {
            this.f28821q.get(size);
        }
    }

    /* renamed from: f */
    private void m21743f(C10742f fVar) {
        for (int size = this.f28821q.size() - 1; size >= 0; size--) {
            this.f28821q.get(size);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f28806b.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f28806b.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: b */
    public final C10742f mo19357b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C10742f) this.f28826w.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo19359c(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setOnTabSelectedListener(C10737c cVar) {
        if (this.f28796D != null) {
            m21732b(this.f28796D);
        }
        this.f28796D = cVar;
        if (cVar != null) {
            mo19349a(cVar);
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f28812h != colorStateList) {
            this.f28812h = colorStateList;
            int size = this.f28826w.size();
            for (int i = 0; i < size; i++) {
                ((C10742f) this.f28826w.get(i)).mo19420c();
            }
        }
    }

    /* renamed from: a */
    private void m21728a(LayoutParams layoutParams) {
        if (this.f28818n == 1 && this.f28817m == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f28828y != 0) {
            layoutParams.leftMargin = this.f28828y;
            layoutParams.rightMargin = this.f28828y;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo19358b(C10742f fVar) {
        mo19351a(fVar, true);
    }

    public void setTabMargin(int i) {
        this.f28828y = mo19359c(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f28806b.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo19359c(i);
            marginLayoutParams.rightMargin = mo19359c(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    private void m21738d(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && C1056u.m3079y(this)) {
                C10739e eVar = this.f28806b;
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
                    int a = m21724a(i, 0.0f);
                    if (scrollX != a) {
                        m21742f();
                        this.f28798F.setIntValues(new int[]{scrollX, a});
                        this.f28798F.start();
                    }
                    this.f28806b.mo19407b(i, 200);
                    return;
                }
            }
            m21725a(i, 0.0f, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTabMode(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 66669991(0x3f94da7, float:1.4652733E-36)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 97445748(0x5cee774, float:1.945717E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "fixed"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "scrollable"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = -1
        L_0x0026:
            switch(r5) {
                case 0: goto L_0x0034;
                case 1: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x003e
        L_0x002a:
            int r5 = r4.f28818n
            if (r5 == 0) goto L_0x003e
            r4.f28818n = r2
            r4.m21744g()
            goto L_0x003e
        L_0x0034:
            int r5 = r4.f28818n
            if (r5 == r3) goto L_0x003e
            r4.f28818n = r3
            r4.m21744g()
            return
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.setTabMode(java.lang.String):void");
    }

    /* renamed from: a */
    private void m21731a(C10746a aVar) {
        C10742f a = mo19344a(0);
        if (aVar.f28881a != null) {
            a.mo19415a(aVar.f28881a);
        }
        if (aVar.f28882b != null) {
            a.f28857b = aVar.f28882b;
            a.mo19420c();
        }
        if (aVar.f28883c != 0) {
            a.mo19414a(aVar.f28883c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            a.f28859d = aVar.getContentDescription();
            a.mo19420c();
        }
        mo19350a(a);
    }

    public void addView(View view, int i) {
        m21727a(view);
    }

    public DmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m21733b(C10742f fVar, boolean z) {
        m21730a(fVar, this.f28826w.size(), z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m21727a(view);
    }

    /* renamed from: a */
    private int m21724a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f28818n != 0) {
            return 0;
        }
        View childAt = this.f28806b.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f28806b.getChildCount()) {
            view = this.f28806b.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f28828y * 4))) * 0.5f * f);
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
            int r0 = r5.mo19359c(r0)
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
            int r1 = r5.f28793A
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f28793A
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo19359c(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f28816l = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f28818n
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m21729a(C10742f fVar, int i) {
        fVar.f28860e = i;
        this.f28826w.add(i, fVar);
        int size = this.f28826w.size();
        while (true) {
            i++;
            if (i < size) {
                ((C10742f) this.f28826w.get(i)).f28860e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m21725a(int i, float f, boolean z) {
        mo19346a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m21727a(view);
    }

    /* renamed from: a */
    private void m21726a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f28822r != null) {
            if (this.f28823s != null) {
                this.f28822r.removeOnPageChangeListener(this.f28823s);
            }
            if (this.f28801I != null) {
                this.f28822r.removeOnAdapterChangeListener(this.f28801I);
            }
        }
        if (this.f28797E != null) {
            m21732b(this.f28797E);
            this.f28797E = null;
        }
        if (viewPager != null) {
            this.f28822r = viewPager;
            if (this.f28823s == null) {
                this.f28823s = new C10743g(this);
            }
            this.f28823s.mo19421a();
            viewPager.addOnPageChangeListener(this.f28823s);
            this.f28797E = new C10745i(viewPager);
            mo19349a(this.f28797E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo19348a(adapter, z);
            }
            if (this.f28801I == null) {
                this.f28801I = new C10735a();
            }
            this.f28801I.f28831a = z;
            viewPager.addOnAdapterChangeListener(this.f28801I);
            m21725a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f28822r = null;
            mo19348a((PagerAdapter) null, false);
        }
        this.f28802J = z2;
    }

    /* JADX INFO: finally extract failed */
    public DmtTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28826w = new ArrayList<>();
        this.f28816l = Integer.MAX_VALUE;
        this.f28821q = new ArrayList<>();
        this.f28805M = new C0797b(12);
        setHorizontalScrollBarEnabled(false);
        this.f28806b = new C10739e(context);
        super.addView(this.f28806b, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a48, R.attr.a49, R.attr.a4_, R.attr.a4a, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4j, R.attr.a4k, R.attr.a4l, R.attr.a4m, R.attr.a4n, R.attr.a4o, R.attr.a4p, R.attr.a4q, R.attr.a4r, R.attr.a4s, R.attr.a4t, R.attr.a4v, R.attr.a4w, R.attr.a4x}, i, R.style.r4);
        this.f28806b.mo19406b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        this.f28806b.mo19403a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f28807c = dimensionPixelSize;
        this.f28808d = dimensionPixelSize;
        this.f28809e = dimensionPixelSize;
        this.f28810f = dimensionPixelSize;
        this.f28807c = obtainStyledAttributes.getDimensionPixelSize(18, this.f28807c);
        this.f28808d = obtainStyledAttributes.getDimensionPixelSize(19, this.f28808d);
        this.f28809e = obtainStyledAttributes.getDimensionPixelSize(17, this.f28809e);
        this.f28810f = obtainStyledAttributes.getDimensionPixelSize(16, this.f28810f);
        this.f28811g = obtainStyledAttributes.getResourceId(22, R.style.lm);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f28811g, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
        try {
            this.f28813i = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f28812h = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f28812h = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                this.f28812h = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{obtainStyledAttributes.getColor(21, 0), this.f28812h.getDefaultColor()});
            }
            this.f28829z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f28793A = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f28815k = obtainStyledAttributes.getResourceId(0, 0);
            this.f28795C = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f28818n = obtainStyledAttributes.getInt(14, 1);
            this.f28817m = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f28814j = (float) resources.getDimensionPixelSize(R.dimen.gr);
            this.f28794B = resources.getDimensionPixelSize(R.dimen.gp);
            this.f28803K = C9432q.m18687b(getContext(), 1.5f);
            this.f28804L = C9432q.m18687b(getContext(), 1.5f);
            this.f28825u = getResources().getConfiguration().orientation;
            m21744g();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m21730a(C10742f fVar, int i, boolean z) {
        if (fVar.f28862g == this) {
            m21729a(fVar, i);
            m21736c(fVar);
            if (z) {
                fVar.mo19417a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    public final void mo19347a(int i, int i2, int i3, int i4) {
        this.f28806b.setPadding(i, 0, i3, 0);
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
