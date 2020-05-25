package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1063y;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1262o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C1383a {

    /* renamed from: g */
    public boolean f4333g;

    /* renamed from: h */
    private CharSequence f4334h;

    /* renamed from: i */
    private CharSequence f4335i;

    /* renamed from: j */
    private View f4336j;

    /* renamed from: k */
    private View f4337k;

    /* renamed from: l */
    private LinearLayout f4338l;

    /* renamed from: m */
    private TextView f4339m;

    /* renamed from: n */
    private TextView f4340n;

    /* renamed from: o */
    private int f4341o;

    /* renamed from: p */
    private int f4342p;

    /* renamed from: q */
    private int f4343q;

    public CharSequence getSubtitle() {
        return this.f4335i;
    }

    public CharSequence getTitle() {
        return this.f4334h;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    /* renamed from: a */
    public final boolean mo4348a() {
        if (this.f4965d != null) {
            return this.f4965d.mo4415d();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo4349b() {
        if (this.f4336j == null) {
            mo4350c();
        }
    }

    /* renamed from: c */
    public final void mo4350c() {
        removeAllViews();
        this.f4337k = null;
        this.f4964c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4965d != null) {
            this.f4965d.mo4416e();
            this.f4965d.mo4418g();
        }
    }

    /* renamed from: d */
    private void m3979d() {
        int i;
        if (this.f4338l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.a, this);
            this.f4338l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4339m = (TextView) this.f4338l.findViewById(R.id.a_);
            this.f4340n = (TextView) this.f4338l.findViewById(R.id.a9);
            if (this.f4341o != 0) {
                this.f4339m.setTextAppearance(getContext(), this.f4341o);
            }
            if (this.f4342p != 0) {
                this.f4340n.setTextAppearance(getContext(), this.f4342p);
            }
        }
        this.f4339m.setText(this.f4334h);
        this.f4340n.setText(this.f4335i);
        boolean z = !TextUtils.isEmpty(this.f4334h);
        boolean z2 = !TextUtils.isEmpty(this.f4335i);
        TextView textView = this.f4340n;
        int i2 = 8;
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.f4338l;
        if (z || z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (this.f4338l.getParent() == null) {
            addView(this.f4338l);
        }
    }

    public void setContentHeight(int i) {
        this.f4966e = i;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4335i = charSequence;
        m3979d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4334h = charSequence;
        m3979d();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f4333g) {
            requestLayout();
        }
        this.f4333g = z;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f4334h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setCustomView(View view) {
        if (this.f4337k != null) {
            removeView(this.f4337k);
        }
        this.f4337k = view;
        if (!(view == null || this.f4338l == null)) {
            removeView(this.f4338l);
            this.f4338l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void mo4347a(final C1218b bVar) {
        if (this.f4336j == null) {
            this.f4336j = LayoutInflater.from(getContext()).inflate(this.f4343q, this, false);
            addView(this.f4336j);
        } else if (this.f4336j.getParent() == null) {
            addView(this.f4336j);
        }
        this.f4336j.findViewById(R.id.am).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                bVar.mo3804c();
            }
        });
        C1246h hVar = (C1246h) bVar.mo3801b();
        if (this.f4965d != null) {
            this.f4965d.mo4417f();
        }
        this.f4965d = new ActionMenuPresenter(getContext());
        this.f4965d.mo4414c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        hVar.mo4111a((C1262o) this.f4965d, this.f4963b);
        this.f4964c = (ActionMenuView) this.f4965d.mo4060a((ViewGroup) this);
        C1056u.m3030a((View) this.f4964c, (Drawable) null);
        addView(this.f4964c, layoutParams);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C1063y mo4346a(int i, long j) {
        return super.mo4346a(i, j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            if (this.f4966e > 0) {
                i3 = this.f4966e;
            } else {
                i3 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = i3 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, DynamicTabYellowPointVersion.DEFAULT);
            if (this.f4336j != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f4336j.getLayoutParams();
                paddingLeft = m4788a(this.f4336j, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f4964c != null && this.f4964c.getParent() == this) {
                paddingLeft = m4788a(this.f4964c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f4338l != null && this.f4337k == null) {
                if (this.f4333g) {
                    this.f4338l.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f4338l.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout = this.f4338l;
                    if (z) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    linearLayout.setVisibility(i5);
                } else {
                    paddingLeft = m4788a(this.f4338l, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f4337k != null) {
                LayoutParams layoutParams = this.f4337k.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = DynamicTabYellowPointVersion.DEFAULT;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = DynamicTabYellowPointVersion.DEFAULT;
                }
                if (layoutParams.height >= 0) {
                    i7 = Math.min(layoutParams.height, i7);
                }
                this.f4337k.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i4), MeasureSpec.makeMeasureSpec(i7, i6));
            }
            if (this.f4966e <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i8) {
                        i8 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i8);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1451bb a = C1451bb.m5032a(context, attributeSet, new int[]{R.attr.bt, R.attr.bw, R.attr.fg, R.attr.n0, R.attr.a3y, R.attr.a76}, i, 0);
        C1056u.m3030a((View) this, a.mo5652a(0));
        this.f4341o = a.mo5665g(5, 0);
        this.f4342p = a.mo5665g(4, 0);
        this.f4966e = a.mo5663f(3, 0);
        this.f4343q = a.mo5665g(2, R.layout.f);
        a.mo5653a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = C1467bj.m5138a(this);
        if (a) {
            i5 = (i3 - i) - getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f4336j == null || this.f4336j.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f4336j.getLayoutParams();
            if (a) {
                i7 = marginLayoutParams.rightMargin;
            } else {
                i7 = marginLayoutParams.leftMargin;
            }
            if (a) {
                i8 = marginLayoutParams.leftMargin;
            } else {
                i8 = marginLayoutParams.rightMargin;
            }
            int a2 = m4787a(i5, i7, a);
            i5 = m4787a(a2 + m4789a(this.f4336j, a2, paddingTop, paddingTop2, a), i8, a);
        }
        if (!(this.f4338l == null || this.f4337k != null || this.f4338l.getVisibility() == 8)) {
            i5 += m4789a(this.f4338l, i5, paddingTop, paddingTop2, a);
        }
        if (this.f4337k != null) {
            m4789a(this.f4337k, i5, paddingTop, paddingTop2, a);
        }
        if (a) {
            i6 = getPaddingLeft();
        } else {
            i6 = (i3 - i) - getPaddingRight();
        }
        if (this.f4964c != null) {
            m4789a(this.f4964c, i6, paddingTop, paddingTop2, !a);
        }
    }
}
