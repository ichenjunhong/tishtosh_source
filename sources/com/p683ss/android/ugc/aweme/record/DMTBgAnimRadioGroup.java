package com.p683ss.android.ugc.aweme.record;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup */
public final class DMTBgAnimRadioGroup extends FrameLayout {

    /* renamed from: a */
    public int f104552a;

    /* renamed from: b */
    public float f104553b;

    /* renamed from: c */
    public float f104554c;

    /* renamed from: d */
    public C41150b f104555d;

    /* renamed from: e */
    public final View f104556e;

    /* renamed from: f */
    public final ValueAnimator f104557f;

    /* renamed from: g */
    private int f104558g;

    /* renamed from: h */
    private float f104559h;

    /* renamed from: i */
    private int f104560i;

    /* renamed from: j */
    private int f104561j;

    /* renamed from: k */
    private final LinearLayout f104562k;

    /* renamed from: l */
    private final OnClickListener f104563l;

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$a */
    static final class C41149a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DMTBgAnimRadioGroup f104564a;

        C41149a(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f104564a = dMTBgAnimRadioGroup;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f104564a.f104556e.setX(this.f104564a.f104553b + ((this.f104564a.f104554c - this.f104564a.f104553b) * floatValue));
                if (floatValue == 1.0f) {
                    this.f104564a.mo83677a(this.f104564a.getContainer().getChildAt(this.f104564a.f104552a), this.f104564a.getItemTextSelectColor());
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$b */
    public interface C41150b {
        /* renamed from: a */
        void mo83691a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.record.DMTBgAnimRadioGroup$c */
    static final class C41151c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DMTBgAnimRadioGroup f104565a;

        C41151c(DMTBgAnimRadioGroup dMTBgAnimRadioGroup) {
            this.f104565a = dMTBgAnimRadioGroup;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f104565a.f104553b = this.f104565a.f104556e.getX();
            DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f104565a;
            C52711k.m112236a((Object) view, "view");
            dMTBgAnimRadioGroup.f104554c = view.getX();
            int indexOfChild = this.f104565a.getContainer().indexOfChild(view);
            if (indexOfChild != this.f104565a.f104552a) {
                this.f104565a.mo83677a(this.f104565a.getContainer().getChildAt(this.f104565a.f104552a), this.f104565a.getItemTextNormalColor());
                this.f104565a.f104552a = indexOfChild;
                C41150b bVar = this.f104565a.f104555d;
                if (bVar != null) {
                    bVar.mo83691a(indexOfChild);
                }
                this.f104565a.f104557f.start();
            }
        }
    }

    public DMTBgAnimRadioGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final LinearLayout getContainer() {
        return this.f104562k;
    }

    public final int getItemTextNormalColor() {
        return this.f104560i;
    }

    public final int getItemTextSelectColor() {
        return this.f104561j;
    }

    public final float getItemTextSize() {
        return this.f104559h;
    }

    public final void setItemTextNormalColor(int i) {
        this.f104560i = i;
    }

    public final void setItemTextSelectColor(int i) {
        this.f104561j = i;
    }

    public final void setItemTextSize(float f) {
        this.f104559h = f;
    }

    public final void setOnItemChangeListener(C41150b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f104555d = bVar;
    }

    public final void setCurrentItem(int i) {
        this.f104552a = i;
        mo83677a(this.f104562k.getChildAt(i), this.f104561j);
    }

    /* renamed from: a */
    public final void mo83678a(String str) {
        C52711k.m112240b(str, C42311c.f106865i);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bqn, this.f104562k, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(str);
            textView.setTextSize(0, this.f104559h);
            textView.setTextColor(this.f104560i);
            textView.setOnClickListener(this.f104563l);
            this.f104562k.addView(textView);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: a */
    public final void mo83677a(View view, int i) {
        if (view != null && (view instanceof TextView) && this.f104561j != -1) {
            ((TextView) view).setTextColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f104558g = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        measureChild(this.f104556e, MeasureSpec.makeMeasureSpec(this.f104558g / this.f104562k.getChildCount(), DynamicTabYellowPointVersion.DEFAULT), i2);
    }

    public DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f104552a = -1;
        View view = new View(context);
        view.setLayoutParams(new LayoutParams(-1, -1));
        this.f104556e = view;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.f104562k = linearLayout;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(250);
        ofFloat.addUpdateListener(new C41149a(this));
        this.f104557f = ofFloat;
        this.f104563l = new C41151c(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acr, R.attr.acs, R.attr.act, R.attr.acu}, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f104559h = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f104560i = obtainStyledAttributes.getColor(1, 0);
        this.f104561j = obtainStyledAttributes.getColor(2, -1);
        obtainStyledAttributes.recycle();
        this.f104556e.setBackground(drawable);
        addView(this.f104556e);
        addView(this.f104562k);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = this.f104562k.getChildAt(this.f104552a);
        if (childAt != null) {
            this.f104556e.setX(childAt.getX());
        }
    }

    public /* synthetic */ DMTBgAnimRadioGroup(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
