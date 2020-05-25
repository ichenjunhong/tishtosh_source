package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.facebook.internal.C14338p;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout */
public final class TextAppendViewLayout extends ViewGroup {

    /* renamed from: a */
    public static final C39476a f100957a = new C39476a(null);

    /* renamed from: b */
    private int f100958b;

    /* renamed from: c */
    private int f100959c;

    /* renamed from: d */
    private float f100960d;

    /* renamed from: e */
    private TextView f100961e;

    /* renamed from: f */
    private View f100962f;

    /* renamed from: g */
    private int f100963g;

    /* renamed from: h */
    private int f100964h;

    /* renamed from: i */
    private int f100965i;

    /* renamed from: j */
    private int f100966j;

    /* renamed from: k */
    private LayoutParams f100967k;

    /* renamed from: l */
    private LayoutParams f100968l;

    /* renamed from: m */
    private int f100969m;

    /* renamed from: n */
    private int f100970n;

    /* renamed from: o */
    private int f100971o;

    /* renamed from: p */
    private int f100972p;

    /* renamed from: q */
    private int f100973q;

    /* renamed from: r */
    private int f100974r;

    /* renamed from: s */
    private int f100975s;

    /* renamed from: t */
    private HashMap f100976t;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout$LayoutParams */
    public static final class LayoutParams extends MarginLayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(-1, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            C52711k.m112240b(context, "context");
            super(context, attributeSet);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout$a */
    public static final class C39476a {
        private C39476a() {
        }

        public /* synthetic */ C39476a(C52707g gVar) {
            this();
        }
    }

    public TextAppendViewLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TextAppendViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo80466a(int i) {
        if (this.f100976t == null) {
            this.f100976t = new HashMap();
        }
        View view = (View) this.f100976t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100976t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getNewLineMarginStart() {
        return this.f100975s;
    }

    public final int getNewLineMarginTop() {
        return this.f100974r;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public final void setNewLineMarginStart(int i) {
        this.f100975s = i;
    }

    public final void setNewLineMarginTop(int i) {
        this.f100974r = i;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        C52711k.m112240b(layoutParams, C14338p.f37308a);
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: b */
    private final void m87803b(int i, int i2) {
        if (this.f100970n == Integer.MIN_VALUE && this.f100972p == Integer.MIN_VALUE) {
            setMeasuredDimension(i, i2);
        } else if (this.f100970n == Integer.MIN_VALUE) {
            setMeasuredDimension(i, this.f100973q);
        } else {
            setMeasuredDimension(this.f100971o, i2);
        }
    }

    /* renamed from: a */
    private final void m87801a(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 2) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                this.f100961e = (TextView) childAt;
                TextView textView = this.f100961e;
                if (textView == null) {
                    C52711k.m112237a("textView");
                }
                this.f100969m = textView.getMaxLines();
                View childAt2 = getChildAt(1);
                C52711k.m112236a((Object) childAt2, "getChildAt(1)");
                this.f100962f = childAt2;
                m87801a(i, i2);
                TextView textView2 = this.f100961e;
                if (textView2 == null) {
                    C52711k.m112237a("textView");
                }
                android.view.ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (layoutParams != null) {
                    this.f100967k = (LayoutParams) layoutParams;
                    View view = this.f100962f;
                    if (view == null) {
                        C52711k.m112237a("view");
                    }
                    android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        this.f100968l = (LayoutParams) layoutParams2;
                        TextView textView3 = this.f100961e;
                        if (textView3 == null) {
                            C52711k.m112237a("textView");
                        }
                        int measuredWidth = textView3.getMeasuredWidth();
                        LayoutParams layoutParams3 = this.f100967k;
                        if (layoutParams3 == null) {
                            C52711k.m112237a("tvParams");
                        }
                        int marginStart = measuredWidth + layoutParams3.getMarginStart();
                        LayoutParams layoutParams4 = this.f100967k;
                        if (layoutParams4 == null) {
                            C52711k.m112237a("tvParams");
                        }
                        this.f100963g = marginStart + layoutParams4.getMarginEnd();
                        TextView textView4 = this.f100961e;
                        if (textView4 == null) {
                            C52711k.m112237a("textView");
                        }
                        int measuredHeight = textView4.getMeasuredHeight();
                        LayoutParams layoutParams5 = this.f100967k;
                        if (layoutParams5 == null) {
                            C52711k.m112237a("tvParams");
                        }
                        int i3 = measuredHeight + layoutParams5.topMargin;
                        LayoutParams layoutParams6 = this.f100967k;
                        if (layoutParams6 == null) {
                            C52711k.m112237a("tvParams");
                        }
                        this.f100964h = i3 + layoutParams6.bottomMargin;
                        View view2 = this.f100962f;
                        if (view2 == null) {
                            C52711k.m112237a("view");
                        }
                        int measuredWidth2 = view2.getMeasuredWidth();
                        LayoutParams layoutParams7 = this.f100968l;
                        if (layoutParams7 == null) {
                            C52711k.m112237a("ivParams");
                        }
                        int marginStart2 = measuredWidth2 + layoutParams7.getMarginStart();
                        LayoutParams layoutParams8 = this.f100968l;
                        if (layoutParams8 == null) {
                            C52711k.m112237a("ivParams");
                        }
                        this.f100965i = marginStart2 + layoutParams8.getMarginEnd();
                        View view3 = this.f100962f;
                        if (view3 == null) {
                            C52711k.m112237a("view");
                        }
                        int measuredHeight2 = view3.getMeasuredHeight();
                        LayoutParams layoutParams9 = this.f100968l;
                        if (layoutParams9 == null) {
                            C52711k.m112237a("ivParams");
                        }
                        int i4 = measuredHeight2 + layoutParams9.topMargin;
                        LayoutParams layoutParams10 = this.f100968l;
                        if (layoutParams10 == null) {
                            C52711k.m112237a("ivParams");
                        }
                        this.f100966j = i4 + layoutParams10.bottomMargin;
                        this.f100970n = MeasureSpec.getMode(i);
                        this.f100971o = MeasureSpec.getSize(i);
                        this.f100972p = MeasureSpec.getMode(i2);
                        this.f100973q = MeasureSpec.getSize(i2);
                        View view4 = this.f100962f;
                        if (view4 == null) {
                            C52711k.m112237a("view");
                        }
                        if (view4.getVisibility() == 8) {
                            m87803b(this.f100963g, this.f100964h);
                            this.f100958b = 1;
                            return;
                        }
                        int paddingStart = (this.f100971o - getPaddingStart()) - getPaddingEnd();
                        TextView textView5 = this.f100961e;
                        if (textView5 == null) {
                            C52711k.m112237a("textView");
                        }
                        CharSequence text = textView5.getText();
                        C52711k.m112236a((Object) text, "textView.text");
                        TextView textView6 = this.f100961e;
                        if (textView6 == null) {
                            C52711k.m112237a("textView");
                        }
                        int measuredWidth3 = textView6.getMeasuredWidth();
                        TextView textView7 = this.f100961e;
                        if (textView7 == null) {
                            C52711k.m112237a("textView");
                        }
                        TextPaint paint = textView7.getPaint();
                        C52711k.m112236a((Object) paint, "textView.paint");
                        StaticLayout staticLayout = new StaticLayout(text, paint, measuredWidth3, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        int lineCount = staticLayout.getLineCount();
                        if (lineCount > this.f100969m) {
                            lineCount = this.f100969m;
                        }
                        int i5 = lineCount - 1;
                        this.f100959c = staticLayout.getLineTop(i5);
                        this.f100960d = staticLayout.getLineRight(i5);
                        if (this.f100963g + this.f100965i <= paddingStart) {
                            m87803b(this.f100963g + this.f100965i, Math.max(this.f100964h, this.f100966j));
                            this.f100958b = 1;
                        } else if (this.f100960d + ((float) this.f100965i) > ((float) paddingStart)) {
                            m87803b(this.f100963g, this.f100964h + this.f100966j + this.f100974r);
                            this.f100958b = 3;
                        } else {
                            int i6 = this.f100959c;
                            LayoutParams layoutParams11 = this.f100967k;
                            if (layoutParams11 == null) {
                                C52711k.m112237a("tvParams");
                            }
                            m87803b(this.f100963g, Math.max(this.f100964h, i6 + layoutParams11.topMargin + this.f100966j));
                            this.f100958b = 2;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout.LayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.widget.TextAppendViewLayout.LayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            throw new RuntimeException("TextAppendViewLayout child count must be 2");
        }
    }

    public TextAppendViewLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setWillNotDraw(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ad7, R.attr.ad8});
        if (obtainStyledAttributes != null) {
            this.f100974r = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f100975s = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private static void m87802a(View view, int i, int i2, int i3, int i4) {
        if (view.getVisibility() != 8) {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public /* synthetic */ TextAppendViewLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.f100958b) {
            case 1:
            case 2:
                TextView textView = this.f100961e;
                if (textView == null) {
                    C52711k.m112237a("textView");
                }
                View view = textView;
                int paddingLeft = getPaddingLeft();
                LayoutParams layoutParams = this.f100967k;
                if (layoutParams == null) {
                    C52711k.m112237a("tvParams");
                }
                int marginStart = paddingLeft + layoutParams.getMarginStart();
                int paddingTop = getPaddingTop();
                LayoutParams layoutParams2 = this.f100967k;
                if (layoutParams2 == null) {
                    C52711k.m112237a("tvParams");
                }
                int i5 = paddingTop + layoutParams2.topMargin;
                TextView textView2 = this.f100961e;
                if (textView2 == null) {
                    C52711k.m112237a("textView");
                }
                int measuredWidth = textView2.getMeasuredWidth();
                TextView textView3 = this.f100961e;
                if (textView3 == null) {
                    C52711k.m112237a("textView");
                }
                m87802a(view, marginStart, i5, measuredWidth, textView3.getMeasuredHeight());
                int paddingLeft2 = getPaddingLeft() + ((int) this.f100960d);
                LayoutParams layoutParams3 = this.f100967k;
                if (layoutParams3 == null) {
                    C52711k.m112237a("tvParams");
                }
                int marginStart2 = paddingLeft2 + layoutParams3.getMarginStart();
                LayoutParams layoutParams4 = this.f100968l;
                if (layoutParams4 == null) {
                    C52711k.m112237a("ivParams");
                }
                int marginStart3 = marginStart2 + layoutParams4.getMarginStart();
                int i6 = this.f100959c;
                LayoutParams layoutParams5 = this.f100967k;
                if (layoutParams5 == null) {
                    C52711k.m112237a("tvParams");
                }
                int i7 = i6 + layoutParams5.topMargin;
                LayoutParams layoutParams6 = this.f100968l;
                if (layoutParams6 == null) {
                    C52711k.m112237a("ivParams");
                }
                int i8 = i7 + layoutParams6.topMargin;
                TextView textView4 = this.f100961e;
                if (textView4 == null) {
                    C52711k.m112237a("textView");
                }
                int bottom = textView4.getBottom();
                TextView textView5 = this.f100961e;
                if (textView5 == null) {
                    C52711k.m112237a("textView");
                }
                int paddingBottom = (bottom - textView5.getPaddingBottom()) - this.f100959c;
                if (this.f100966j < paddingBottom) {
                    i8 += (paddingBottom - this.f100966j) / 2;
                }
                View view2 = this.f100962f;
                if (view2 == null) {
                    C52711k.m112237a("view");
                }
                View view3 = this.f100962f;
                if (view3 == null) {
                    C52711k.m112237a("view");
                }
                int measuredWidth2 = view3.getMeasuredWidth();
                View view4 = this.f100962f;
                if (view4 == null) {
                    C52711k.m112237a("view");
                }
                m87802a(view2, marginStart3, i8, measuredWidth2, view4.getMeasuredHeight());
                return;
            case 3:
                int paddingLeft3 = getPaddingLeft();
                LayoutParams layoutParams7 = this.f100967k;
                if (layoutParams7 == null) {
                    C52711k.m112237a("tvParams");
                }
                int marginStart4 = paddingLeft3 + layoutParams7.getMarginStart();
                TextView textView6 = this.f100961e;
                if (textView6 == null) {
                    C52711k.m112237a("textView");
                }
                View view5 = textView6;
                int paddingTop2 = getPaddingTop();
                LayoutParams layoutParams8 = this.f100967k;
                if (layoutParams8 == null) {
                    C52711k.m112237a("tvParams");
                }
                int i9 = paddingTop2 + layoutParams8.topMargin;
                TextView textView7 = this.f100961e;
                if (textView7 == null) {
                    C52711k.m112237a("textView");
                }
                int measuredWidth3 = textView7.getMeasuredWidth();
                TextView textView8 = this.f100961e;
                if (textView8 == null) {
                    C52711k.m112237a("textView");
                }
                m87802a(view5, marginStart4, i9, measuredWidth3, textView8.getMeasuredHeight());
                View view6 = this.f100962f;
                if (view6 == null) {
                    C52711k.m112237a("view");
                }
                int i10 = marginStart4 + this.f100975s;
                int paddingTop3 = this.f100964h + getPaddingTop() + this.f100974r;
                View view7 = this.f100962f;
                if (view7 == null) {
                    C52711k.m112237a("view");
                }
                int measuredWidth4 = view7.getMeasuredWidth();
                View view8 = this.f100962f;
                if (view8 == null) {
                    C52711k.m112237a("view");
                }
                m87802a(view6, i10, paddingTop3, measuredWidth4, view8.getMeasuredHeight());
                break;
        }
    }
}
