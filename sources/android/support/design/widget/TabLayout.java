package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.design.internal.C0456f;
import android.support.design.internal.C0457g;
import android.support.design.p022a.C0389a;
import android.support.design.p026d.C0423a;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p038f.C0795l.C0796a;
import android.support.p030v4.p038f.C0795l.C0797b;
import android.support.p030v4.p038f.C0795l.C0798c;
import android.support.p030v4.view.C1043h;
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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0993a
public class TabLayout extends HorizontalScrollView {
    private static final C0796a<C0526f> tabPool = new C0798c(16);
    private C0519a adapterChangeListener;
    private int contentInsetStart;
    private C0520b currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private C0527g pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private C0520b selectedListener;
    private final ArrayList<C0520b> selectedListeners;
    private C0526f selectedTab;
    private boolean setupViewPagerImplicitly;
    private final C0523e slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    public final RectF tabViewContentBounds;
    private final C0796a<TabView> tabViewPool;
    private final ArrayList<C0526f> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    class TabView extends LinearLayout {
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines = 2;
        private ImageView iconView;
        private C0526f tab;
        private TextView textView;

        public C0526f getTab() {
            return this.tab;
        }

        /* access modifiers changed from: 0000 */
        public void reset() {
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.tab.mo1595a();
            return true;
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            boolean z = false;
            if (this.baseBackgroundDrawable != null && this.baseBackgroundDrawable.isStateful()) {
                z = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void updateOrientation() {
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            if (this.customTextView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                updateTextAndIcon(this.customTextView, this.customIconView);
            }
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0121, code lost:
            if (r0 != false) goto L_0x012d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void update() {
            /*
                r5 = this;
                android.support.design.widget.TabLayout$f r0 = r5.tab
                r1 = 0
                if (r0 == 0) goto L_0x0008
                android.view.View r2 = r0.f1805f
                goto L_0x0009
            L_0x0008:
                r2 = r1
            L_0x0009:
                if (r2 == 0) goto L_0x0059
                android.view.ViewParent r3 = r2.getParent()
                if (r3 == r5) goto L_0x001b
                if (r3 == 0) goto L_0x0018
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r3.removeView(r2)
            L_0x0018:
                r5.addView(r2)
            L_0x001b:
                r5.customView = r2
                android.widget.TextView r3 = r5.textView
                r4 = 8
                if (r3 == 0) goto L_0x0028
                android.widget.TextView r3 = r5.textView
                r3.setVisibility(r4)
            L_0x0028:
                android.widget.ImageView r3 = r5.iconView
                if (r3 == 0) goto L_0x0036
                android.widget.ImageView r3 = r5.iconView
                r3.setVisibility(r4)
                android.widget.ImageView r3 = r5.iconView
                r3.setImageDrawable(r1)
            L_0x0036:
                r3 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r3 = r2.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r5.customTextView = r3
                android.widget.TextView r3 = r5.customTextView
                if (r3 == 0) goto L_0x004d
                android.widget.TextView r3 = r5.customTextView
                int r3 = android.support.p030v4.widget.C1115o.m3252a(r3)
                r5.defaultMaxLines = r3
            L_0x004d:
                r3 = 16908294(0x1020006, float:2.3877246E-38)
                android.view.View r2 = r2.findViewById(r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r5.customIconView = r2
                goto L_0x0068
            L_0x0059:
                android.view.View r2 = r5.customView
                if (r2 == 0) goto L_0x0064
                android.view.View r2 = r5.customView
                r5.removeView(r2)
                r5.customView = r1
            L_0x0064:
                r5.customTextView = r1
                r5.customIconView = r1
            L_0x0068:
                android.view.View r2 = r5.customView
                r3 = 0
                if (r2 != 0) goto L_0x00ef
                android.widget.ImageView r2 = r5.iconView
                if (r2 != 0) goto L_0x0087
                android.content.Context r2 = r5.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                r4 = 2132214407(0x7f170287, float:2.0072655E38)
                android.view.View r2 = r2.inflate(r4, r5, r3)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                r5.addView(r2, r3)
                r5.iconView = r2
            L_0x0087:
                if (r0 == 0) goto L_0x0097
                android.graphics.drawable.Drawable r2 = r0.f1801b
                if (r2 == 0) goto L_0x0097
                android.graphics.drawable.Drawable r1 = r0.f1801b
                android.graphics.drawable.Drawable r1 = android.support.p030v4.graphics.drawable.C0809a.m2337f(r1)
                android.graphics.drawable.Drawable r1 = r1.mutate()
            L_0x0097:
                if (r1 == 0) goto L_0x00ad
                android.support.design.widget.TabLayout r2 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r2 = r2.tabIconTint
                android.support.p030v4.graphics.drawable.C0809a.m2327a(r1, r2)
                android.support.design.widget.TabLayout r2 = android.support.design.widget.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                if (r2 == 0) goto L_0x00ad
                android.support.design.widget.TabLayout r2 = android.support.design.widget.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.tabIconTintMode
                android.support.p030v4.graphics.drawable.C0809a.m2330a(r1, r2)
            L_0x00ad:
                android.widget.TextView r1 = r5.textView
                if (r1 != 0) goto L_0x00cf
                android.content.Context r1 = r5.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2132214408(0x7f170288, float:2.0072657E38)
                android.view.View r1 = r1.inflate(r2, r5, r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r5.addView(r1)
                r5.textView = r1
                android.widget.TextView r1 = r5.textView
                int r1 = android.support.p030v4.widget.C1115o.m3252a(r1)
                r5.defaultMaxLines = r1
            L_0x00cf:
                android.widget.TextView r1 = r5.textView
                android.support.design.widget.TabLayout r2 = android.support.design.widget.TabLayout.this
                int r2 = r2.tabTextAppearance
                android.support.p030v4.widget.C1115o.m3256a(r1, r2)
                android.support.design.widget.TabLayout r1 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r1 = r1.tabTextColors
                if (r1 == 0) goto L_0x00e7
                android.widget.TextView r1 = r5.textView
                android.support.design.widget.TabLayout r2 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r2 = r2.tabTextColors
                r1.setTextColor(r2)
            L_0x00e7:
                android.widget.TextView r1 = r5.textView
                android.widget.ImageView r2 = r5.iconView
                r5.updateTextAndIcon(r1, r2)
                goto L_0x00fe
            L_0x00ef:
                android.widget.TextView r1 = r5.customTextView
                if (r1 != 0) goto L_0x00f7
                android.widget.ImageView r1 = r5.customIconView
                if (r1 == 0) goto L_0x00fe
            L_0x00f7:
                android.widget.TextView r1 = r5.customTextView
                android.widget.ImageView r2 = r5.customIconView
                r5.updateTextAndIcon(r1, r2)
            L_0x00fe:
                if (r0 == 0) goto L_0x010d
                java.lang.CharSequence r1 = r0.f1803d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x010d
                java.lang.CharSequence r1 = r0.f1803d
                r5.setContentDescription(r1)
            L_0x010d:
                r1 = 1
                if (r0 == 0) goto L_0x012c
                android.support.design.widget.TabLayout r2 = r0.f1806g
                if (r2 == 0) goto L_0x0124
                android.support.design.widget.TabLayout r2 = r0.f1806g
                int r2 = r2.getSelectedTabPosition()
                int r0 = r0.f1804e
                if (r2 != r0) goto L_0x0120
                r0 = 1
                goto L_0x0121
            L_0x0120:
                r0 = 0
            L_0x0121:
                if (r0 == 0) goto L_0x012c
                goto L_0x012d
            L_0x0124:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r1 = 0
            L_0x012d:
                r5.setSelected(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.TabView.update():void");
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1126a.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1126a.class.getName());
        }

        /* access modifiers changed from: 0000 */
        public void setTab(C0526f fVar) {
            if (fVar != this.tab) {
                this.tab = fVar;
                update();
            }
        }

        public void drawBackground(Canvas canvas) {
            if (this.baseBackgroundDrawable != null) {
                this.baseBackgroundDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        public void setSelected(boolean z) {
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
            if (this.textView != null) {
                this.textView.setSelected(z);
            }
            if (this.iconView != null) {
                this.iconView.setSelected(z);
            }
            if (this.customView != null) {
                this.customView.setSelected(z);
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r7v5 */
        /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void updateBackgroundDrawable(android.content.Context r7) {
            /*
                r6 = this;
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L_0x0027
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                int r0 = r0.tabBackgroundResId
                android.graphics.drawable.Drawable r7 = android.support.p043v7.p044a.p045a.C1124a.m3315b(r7, r0)
                r6.baseBackgroundDrawable = r7
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                if (r7 == 0) goto L_0x0029
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0029
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0029
            L_0x0027:
                r6.baseBackgroundDrawable = r1
            L_0x0029:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = r7
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                r2 = 0
                r0.setColor(r2)
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L_0x0082
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r3)
                r3 = -1
                r0.setColor(r3)
                android.support.design.widget.TabLayout r3 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r3 = r3.tabRippleColorStateList
                android.content.res.ColorStateList r3 = android.support.design.p027e.C0424a.m1036a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x006d
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                android.support.design.widget.TabLayout r4 = android.support.design.widget.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0061
                r7 = r1
            L_0x0061:
                android.support.design.widget.TabLayout r4 = android.support.design.widget.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0068
                r0 = r1
            L_0x0068:
                r2.<init>(r3, r7, r0)
                r7 = r2
                goto L_0x0082
            L_0x006d:
                android.graphics.drawable.Drawable r0 = android.support.p030v4.graphics.drawable.C0809a.m2337f(r0)
                android.support.p030v4.graphics.drawable.C0809a.m2327a(r0, r3)
                android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r2] = r7
                r7 = 1
                r3[r7] = r0
                r1.<init>(r3)
                r7 = r1
            L_0x0082:
                android.support.p030v4.view.C1056u.m3030a(r6, r7)
                android.support.design.widget.TabLayout r7 = android.support.design.widget.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.TabView.updateBackgroundDrawable(android.content.Context):void");
        }

        public TabView(Context context) {
            super(context);
            updateBackgroundDrawable(context);
            C1056u.m3044b(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            setClickable(true);
            C1056u.m3033a((View) this, C1052q.m3014a(getContext(), BaseNotice.CHECK_PROFILE));
        }

        private void updateTextAndIcon(TextView textView2, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i;
            if (this.tab == null || this.tab.f1801b == null) {
                drawable = null;
            } else {
                drawable = C0809a.m2337f(this.tab.f1801b).mutate();
            }
            if (this.tab != null) {
                charSequence = this.tab.f1802c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView2 != null) {
                if (z) {
                    textView2.setText(charSequence);
                    textView2.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                    textView2.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = TabLayout.this.dpToPx(8);
                }
                if (TabLayout.this.inlineLabel) {
                    if (i != C1043h.m2980b(marginLayoutParams)) {
                        C1043h.m2979a(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C1043h.m2979a(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            if (this.tab != null) {
                charSequence2 = this.tab.f1803d;
            } else {
                charSequence2 = null;
            }
            if (z) {
                charSequence2 = null;
            }
            C1455bd.m5087a(this, charSequence2);
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, DynamicTabYellowPointVersion.DEFAULT);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                boolean z = true;
                if (this.iconView != null && this.iconView.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.textView != null && this.textView.getLineCount() > 1) {
                    f = TabLayout.this.tabTextMultiLineSize;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int a = C1115o.m3252a(this.textView);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.mode == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.textView.getLayout();
                        if (layout == null || approximateLineWidth(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$a */
    class C0519a implements C0996d {

        /* renamed from: a */
        public boolean f1780a;

        C0519a() {
        }

        /* renamed from: a */
        public final void mo1576a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.viewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.f1780a);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    public interface C0520b<T extends C0526f> {
        /* renamed from: a */
        void mo1577a(T t);

        /* renamed from: b */
        void mo1578b(T t);
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    public interface C0521c extends C0520b {
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    class C0522d extends DataSetObserver {
        public final void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public final void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }

        C0522d() {
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    class C0523e extends LinearLayout {

        /* renamed from: a */
        int f1783a = -1;

        /* renamed from: b */
        float f1784b;

        /* renamed from: c */
        ValueAnimator f1785c;

        /* renamed from: e */
        private int f1787e;

        /* renamed from: f */
        private final Paint f1788f;

        /* renamed from: g */
        private final GradientDrawable f1789g;

        /* renamed from: h */
        private int f1790h = -1;

        /* renamed from: i */
        private int f1791i = -1;

        /* renamed from: j */
        private int f1792j = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1581a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f1783a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                    m1398a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                    i2 = (int) TabLayout.this.tabViewContentBounds.left;
                    i = (int) TabLayout.this.tabViewContentBounds.right;
                }
                if (this.f1784b > 0.0f && this.f1783a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f1783a + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.tabIndicatorFullWidth && (childAt2 instanceof TabView)) {
                        m1398a((TabView) childAt2, TabLayout.this.tabViewContentBounds);
                        left = (int) TabLayout.this.tabViewContentBounds.left;
                        right = (int) TabLayout.this.tabViewContentBounds.right;
                    }
                    i2 = (int) ((this.f1784b * ((float) left)) + ((1.0f - this.f1784b) * ((float) i2)));
                    i = (int) ((this.f1784b * ((float) right)) + ((1.0f - this.f1784b) * ((float) i)));
                }
            }
            mo1583a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1584b(int i) {
            if (this.f1787e != i) {
                this.f1787e = i;
                C1056u.m3052d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1582a(int i) {
            if (this.f1788f.getColor() != i) {
                this.f1788f.setColor(i);
                C1056u.m3052d(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f1790h != i) {
                requestLayout();
                this.f1790h = i;
            }
        }

        public final void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            int i2 = 0;
            if (TabLayout.this.tabSelectedIndicator != null) {
                i = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            } else {
                i = 0;
            }
            if (this.f1787e >= 0) {
                i = this.f1787e;
            }
            switch (TabLayout.this.tabIndicatorGravity) {
                case 0:
                    i2 = getHeight() - i;
                    i = getHeight();
                    break;
                case 1:
                    i2 = (getHeight() - i) / 2;
                    i = (getHeight() + i) / 2;
                    break;
                case 2:
                    break;
                case 3:
                    i = getHeight();
                    break;
                default:
                    i = 0;
                    break;
            }
            if (this.f1791i >= 0 && this.f1792j > this.f1791i) {
                if (TabLayout.this.tabSelectedIndicator != null) {
                    drawable = TabLayout.this.tabSelectedIndicator;
                } else {
                    drawable = this.f1789g;
                }
                Drawable f = C0809a.m2337f(drawable);
                f.setBounds(this.f1791i, i2, this.f1792j, i);
                if (this.f1788f != null) {
                    if (VERSION.SDK_INT == 21) {
                        f.setColorFilter(this.f1788f.getColor(), Mode.SRC_IN);
                    } else {
                        C0809a.m2325a(f, this.f1788f.getColor());
                    }
                }
                f.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1583a(int i, int i2) {
            if (i != this.f1791i || i2 != this.f1792j) {
                this.f1791i = i;
                this.f1792j = i2;
                C1056u.m3052d(this);
            }
        }

        C0523e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f1788f = new Paint();
            this.f1789g = new GradientDrawable();
        }

        /* renamed from: a */
        private void m1398a(TabView tabView, RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            if (contentWidth < TabLayout.this.dpToPx(24)) {
                contentWidth = TabLayout.this.dpToPx(24);
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i = contentWidth / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.mode == 1 && TabLayout.this.tabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.dpToPx(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout.this.tabGravity = 0;
                            TabLayout.this.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1585b(final int i, int i2) {
            if (this.f1785c != null && this.f1785c.isRunning()) {
                this.f1785c.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                mo1581a();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                m1398a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                left = (int) TabLayout.this.tabViewContentBounds.left;
                right = (int) TabLayout.this.tabViewContentBounds.right;
            }
            final int i3 = left;
            final int i4 = right;
            final int i5 = this.f1791i;
            final int i6 = this.f1792j;
            if (!(i5 == i3 && i6 == i4)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f1785c = valueAnimator;
                valueAnimator.setInterpolator(C0389a.f1268b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C05241 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C0523e.this.mo1583a(C0389a.m964a(i5, i3, animatedFraction), C0389a.m964a(i6, i4, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C0523e.this.f1783a = i;
                        C0523e.this.f1784b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1785c == null || !this.f1785c.isRunning()) {
                mo1581a();
                return;
            }
            this.f1785c.cancel();
            mo1585b(this.f1783a, Math.round((1.0f - this.f1785c.getAnimatedFraction()) * ((float) this.f1785c.getDuration())));
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    public static class C0526f {

        /* renamed from: a */
        public Object f1800a;

        /* renamed from: b */
        public Drawable f1801b;

        /* renamed from: c */
        public CharSequence f1802c;

        /* renamed from: d */
        public CharSequence f1803d;

        /* renamed from: e */
        public int f1804e = -1;

        /* renamed from: f */
        public View f1805f;

        /* renamed from: g */
        public TabLayout f1806g;

        /* renamed from: h */
        public TabView f1807h;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1596b() {
            if (this.f1807h != null) {
                this.f1807h.update();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo1597c() {
            this.f1806g = null;
            this.f1807h = null;
            this.f1800a = null;
            this.f1801b = null;
            this.f1802c = null;
            this.f1803d = null;
            this.f1804e = -1;
            this.f1805f = null;
        }

        /* renamed from: a */
        public final void mo1595a() {
            if (this.f1806g != null) {
                this.f1806g.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        public final C0526f mo1593a(View view) {
            this.f1805f = view;
            mo1596b();
            return this;
        }

        /* renamed from: a */
        public final C0526f mo1592a(int i) {
            return mo1593a(LayoutInflater.from(this.f1807h.getContext()).inflate(i, this.f1807h, false));
        }

        /* renamed from: a */
        public final C0526f mo1594a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f1803d) && !TextUtils.isEmpty(charSequence)) {
                this.f1807h.setContentDescription(charSequence);
            }
            this.f1802c = charSequence;
            mo1596b();
            return this;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    public static class C0527g implements C0997e {

        /* renamed from: a */
        int f1808a;

        /* renamed from: b */
        int f1809b;

        /* renamed from: c */
        private final WeakReference<TabLayout> f1810c;

        public final void onPageScrollStateChanged(int i) {
            this.f1808a = this.f1809b;
            this.f1809b = i;
        }

        public C0527g(TabLayout tabLayout) {
            this.f1810c = new WeakReference<>(tabLayout);
        }

        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f1810c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f1809b == 0 || (this.f1809b == 2 && this.f1808a == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f1810c.get();
            if (tabLayout != null) {
                boolean z2 = false;
                if (this.f1809b != 2 || this.f1808a == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(this.f1809b == 2 && this.f1808a == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$h */
    public static class C0528h implements C0521c {

        /* renamed from: a */
        private final ViewPager f1811a;

        /* renamed from: b */
        public final void mo1578b(C0526f fVar) {
        }

        public C0528h(ViewPager viewPager) {
            this.f1811a = viewPager;
        }

        /* renamed from: a */
        public final void mo1577a(C0526f fVar) {
            this.f1811a.setCurrentItem(fVar.f1804e);
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    private LayoutParams createLayoutParamsForTabs() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public C0526f createTabFromPool() {
        C0526f fVar = (C0526f) tabPool.acquire();
        if (fVar == null) {
            return new C0526f();
        }
        return fVar;
    }

    public int getSelectedTabPosition() {
        if (this.selectedTab != null) {
            return this.selectedTab.f1804e;
        }
        return -1;
    }

    public C0526f newTab() {
        C0526f createTabFromPool = createTabFromPool();
        createTabFromPool.f1806g = this;
        createTabFromPool.f1807h = createTabView(createTabFromPool);
        return createTabFromPool;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabMinWidth() {
        if (this.requestedTabMinWidth != -1) {
            return this.requestedTabMinWidth;
        }
        if (this.mode == 0) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            ((C0526f) this.tabs.get(i)).mo1596b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    private void applyModeAndGravity() {
        int i;
        if (this.mode == 0) {
            i = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            i = 0;
        }
        C1056u.m3044b(this.slidingTabIndicator, i, 0, 0, 0);
        switch (this.mode) {
            case 0:
                this.slidingTabIndicator.setGravity(8388611);
                break;
            case 1:
                this.slidingTabIndicator.setGravity(1);
                break;
        }
        updateTabViews(true);
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            this.scrollAnimator = new ValueAnimator();
            this.scrollAnimator.setInterpolator(C0389a.f1268b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C0526f fVar = (C0526f) this.tabs.get(i);
            if (fVar != null && fVar.f1801b != null && !TextUtils.isEmpty(fVar.f1802c)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z || this.inlineLabel) {
            return 48;
        }
        return 72;
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator it = this.tabs.iterator();
        while (it.hasNext()) {
            C0526f fVar = (C0526f) it.next();
            it.remove();
            fVar.mo1597c();
            releaseFromTabPool(fVar);
        }
        this.selectedTab = null;
    }

    /* access modifiers changed from: 0000 */
    public void populateFromPagerAdapter() {
        removeAllTabs();
        if (this.pagerAdapter != null) {
            int count = this.pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().mo1594a(this.pagerAdapter.getPageTitle(i)), false);
            }
            if (this.viewPager != null && count > 0) {
                int currentItem = this.viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    selectTab(getTabAt(currentItem));
                }
            }
        }
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean releaseFromTabPool(C0526f fVar) {
        return tabPool.release(fVar);
    }

    public void removeOnTabSelectedListener(C0520b bVar) {
        this.selectedListeners.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0526f fVar) {
        selectTab(fVar, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.slidingTabIndicator.mo1582a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.mo1584b(i);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        C1056u.m3052d(this.slidingTabIndicator);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter2) {
        setPagerAdapter(pagerAdapter2, false);
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    private void addTabView(C0526f fVar) {
        this.slidingTabIndicator.addView(fVar.f1807h, fVar.f1804e, createLayoutParamsForTabs());
    }

    public void addOnTabSelectedListener(C0520b bVar) {
        if (!this.selectedListeners.contains(bVar)) {
            this.selectedListeners.add(bVar);
        }
    }

    public void addTab(C0526f fVar) {
        addTab(fVar, this.tabs.isEmpty());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            this.tabSelectedIndicator = drawable;
            C1056u.m3052d(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            C1056u.m3052d(this.slidingTabIndicator);
        }
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C1124a.m3313a(getContext(), i));
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C1124a.m3313a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    private void addViewInternal(View view) {
        if (view instanceof C0570q) {
            addTabFromItemView((C0570q) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void dispatchTabReselected(C0526f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size);
        }
    }

    private void dispatchTabSelected(C0526f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((C0520b) this.selectedListeners.get(size)).mo1577a(fVar);
        }
    }

    private void dispatchTabUnselected(C0526f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((C0520b) this.selectedListeners.get(size)).mo1578b(fVar);
        }
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void updateTabViewLayoutParams(LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public C0526f getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C0526f) this.tabs.get(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void removeTab(C0526f fVar) {
        if (fVar.f1806g == this) {
            removeTabAt(fVar.f1804e);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void setOnTabSelectedListener(C0520b bVar) {
        if (this.selectedListener != null) {
            removeOnTabSelectedListener(this.selectedListener);
        }
        this.selectedListener = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C1124a.m3315b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    private void addTabFromItemView(C0570q qVar) {
        C0526f newTab = newTab();
        if (qVar.f2061a != null) {
            newTab.mo1594a(qVar.f2061a);
        }
        if (qVar.f2062b != null) {
            newTab.f1801b = qVar.f2062b;
            newTab.mo1596b();
        }
        if (qVar.f2063c != 0) {
            newTab.mo1592a(qVar.f2063c);
        }
        if (!TextUtils.isEmpty(qVar.getContentDescription())) {
            newTab.f1803d = qVar.getContentDescription();
            newTab.mo1596b();
        }
        addTab(newTab);
    }

    private TabView createTabView(C0526f fVar) {
        TabView tabView;
        if (this.tabViewPool != null) {
            tabView = (TabView) this.tabViewPool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(fVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f1803d)) {
            tabView.setContentDescription(fVar.f1802c);
        } else {
            tabView.setContentDescription(fVar.f1803d);
        }
        return tabView;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private void animateToTab(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null && C1056u.m3079y(this)) {
                C0523e eVar = this.slidingTabIndicator;
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
                    int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
                    if (scrollX != calculateScrollXForTab) {
                        ensureScrollAnimator();
                        this.scrollAnimator.setIntValues(new int[]{scrollX, calculateScrollXForTab});
                        this.scrollAnimator.start();
                    }
                    this.slidingTabIndicator.mo1585b(i, this.tabIndicatorAnimationDuration);
                    return;
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    public void removeTabAt(int i) {
        int i2;
        C0526f fVar;
        if (this.selectedTab != null) {
            i2 = this.selectedTab.f1804e;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C0526f fVar2 = (C0526f) this.tabs.remove(i);
        if (fVar2 != null) {
            fVar2.mo1597c();
            releaseFromTabPool(fVar2);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C0526f) this.tabs.get(i3)).f1804e = i3;
        }
        if (i2 == i) {
            if (this.tabs.isEmpty()) {
                fVar = null;
            } else {
                fVar = (C0526f) this.tabs.get(Math.max(0, i - 1));
            }
            selectTab(fVar);
        }
    }

    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a4u);
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        setupWithViewPager(viewPager2, z, false);
    }

    private void configureTab(C0526f fVar, int i) {
        fVar.f1804e = i;
        this.tabs.add(i, fVar);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C0526f) this.tabs.get(i)).f1804e = i;
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addTab(C0526f fVar, int i) {
        addTab(fVar, i, this.tabs.isEmpty());
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0526f fVar, boolean z) {
        int i;
        C0526f fVar2 = this.selectedTab;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f1804e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f1804e == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    animateToTab(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.selectedTab = fVar;
            if (fVar2 != null) {
                dispatchTabUnselected(fVar2);
            }
            if (fVar != null) {
                dispatchTabSelected(fVar);
            }
        } else if (fVar2 != null) {
            dispatchTabReselected(fVar);
            animateToTab(fVar.f1804e);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setPagerAdapter(PagerAdapter pagerAdapter2, boolean z) {
        if (!(this.pagerAdapter == null || this.pagerAdapterObserver == null)) {
            this.pagerAdapter.unregisterDataSetObserver(this.pagerAdapterObserver);
        }
        this.pagerAdapter = pagerAdapter2;
        if (z && pagerAdapter2 != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C0522d();
            }
            pagerAdapter2.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.mode != 0) {
            return 0;
        }
        View childAt = this.slidingTabIndicator.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3)) * 0.5f * f);
        if (C1056u.m3055f(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public void addTab(C0526f fVar, boolean z) {
        addTab(fVar, this.tabs.size(), z);
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
            int r0 = r5.dpToPx(r0)
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
            int r1 = r5.requestedTabMaxWidth
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.requestedTabMaxWidth
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.dpToPx(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.tabMaxWidth = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.mode
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addTab(C0526f fVar, int i, boolean z) {
        if (fVar.f1806g == this) {
            configureTab(fVar, i);
            addTabView(fVar);
            if (z) {
                fVar.mo1595a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void setupWithViewPager(ViewPager viewPager2, boolean z, boolean z2) {
        if (this.viewPager != null) {
            if (this.pageChangeListener != null) {
                this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
            }
            if (this.adapterChangeListener != null) {
                this.viewPager.removeOnAdapterChangeListener(this.adapterChangeListener);
            }
        }
        if (this.currentVpSelectedListener != null) {
            removeOnTabSelectedListener(this.currentVpSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C0527g(this);
            }
            C0527g gVar = this.pageChangeListener;
            gVar.f1809b = 0;
            gVar.f1808a = 0;
            viewPager2.addOnPageChangeListener(this.pageChangeListener);
            this.currentVpSelectedListener = new C0528h(viewPager2);
            addOnTabSelectedListener(this.currentVpSelectedListener);
            PagerAdapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C0519a();
            }
            this.adapterChangeListener.f1780a = z;
            viewPager2.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tabs = new ArrayList<>();
        this.tabViewContentBounds = new RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new C0797b(12);
        setHorizontalScrollBarEnabled(false);
        this.slidingTabIndicator = new C0523e(context);
        super.addView(this.slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = C0456f.m1107a(context, attributeSet, new int[]{R.attr.a48, R.attr.a49, R.attr.a4_, R.attr.a4a, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4j, R.attr.a4k, R.attr.a4l, R.attr.a4m, R.attr.a4n, R.attr.a4o, R.attr.a4p, R.attr.a4q, R.attr.a4r, R.attr.a4s, R.attr.a4t, R.attr.a4v, R.attr.a4w, R.attr.a4x}, i, R.style.r4, 22);
        this.slidingTabIndicator.mo1584b(a.getDimensionPixelSize(10, -1));
        this.slidingTabIndicator.mo1582a(a.getColor(7, 0));
        setSelectedTabIndicator(C0423a.m1033b(context, a, 5));
        setSelectedTabIndicatorGravity(a.getInt(9, 0));
        setTabIndicatorFullWidth(a.getBoolean(8, true));
        int dimensionPixelSize = a.getDimensionPixelSize(15, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = a.getDimensionPixelSize(18, this.tabPaddingStart);
        this.tabPaddingTop = a.getDimensionPixelSize(19, this.tabPaddingTop);
        this.tabPaddingEnd = a.getDimensionPixelSize(17, this.tabPaddingEnd);
        this.tabPaddingBottom = a.getDimensionPixelSize(16, this.tabPaddingBottom);
        this.tabTextAppearance = a.getResourceId(22, R.style.lm);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.tabTextAppearance, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
        try {
            this.tabTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.tabTextColors = C0423a.m1032a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(23)) {
                this.tabTextColors = C0423a.m1032a(context, a, 23);
            }
            if (a.hasValue(21)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), a.getColor(21, 0));
            }
            this.tabIconTint = C0423a.m1032a(context, a, 3);
            this.tabIconTintMode = C0457g.m1116a(a.getInt(4, -1), null);
            this.tabRippleColorStateList = C0423a.m1032a(context, a, 20);
            this.tabIndicatorAnimationDuration = a.getInt(6, 300);
            this.requestedTabMinWidth = a.getDimensionPixelSize(13, -1);
            this.requestedTabMaxWidth = a.getDimensionPixelSize(12, -1);
            this.tabBackgroundResId = a.getResourceId(0, 0);
            this.contentInsetStart = a.getDimensionPixelSize(1, 0);
            this.mode = a.getInt(14, 1);
            this.tabGravity = a.getInt(2, 0);
            this.inlineLabel = a.getBoolean(11, false);
            this.unboundedRipple = a.getBoolean(24, false);
            a.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = (float) resources.getDimensionPixelSize(R.dimen.gr);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.gp);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                C0523e eVar = this.slidingTabIndicator;
                if (eVar.f1785c != null && eVar.f1785c.isRunning()) {
                    eVar.f1785c.cancel();
                }
                eVar.f1783a = i;
                eVar.f1784b = f;
                eVar.mo1581a();
            }
            if (this.scrollAnimator != null && this.scrollAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }
}
