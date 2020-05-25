package com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton */
public class CircularAnimateButton extends AppCompatButton {

    /* renamed from: b */
    public int f119437b;

    /* renamed from: c */
    public int f119438c;

    /* renamed from: d */
    public int f119439d;

    /* renamed from: e */
    public int f119440e;

    /* renamed from: f */
    private C47322c f119441f;

    public CircularAnimateButton(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        this.f119438c = i;
        this.f119441f = m102692a(i);
        setBackgroundCompat(this.f119441f.f119460c);
    }

    public void setBackgroundCompat(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    private C47322c m102692a(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) C42430at.m93196a(i, i, 0, this.f119437b);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) this.f119437b);
        C47322c cVar = new C47322c(gradientDrawable);
        cVar.mo94607b(i);
        cVar.mo94606a(0);
        return cVar;
    }

    /* renamed from: a */
    public final void mo94599a(C47321b bVar) {
        C47318a a = mo94598a((float) this.f119440e, (float) this.f119437b, this.f119440e, this.f119439d);
        a.f119446e = this.f119438c;
        a.f119447f = this.f119438c;
        a.f119448g = 0;
        a.f119449h = 0;
        a.mo94603a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f119439d, this.f119440e);
    }

    public CircularAnimateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119438c = context.getResources().getColor(R.color.zl);
        this.f119437b = (int) C9432q.m18687b(context, 22.0f);
        this.f119439d = (int) C9432q.m18687b(context, 230.0f);
        this.f119440e = (int) C9432q.m18687b(context, 44.0f);
        if (this.f119441f == null) {
            this.f119441f = m102692a(this.f119438c);
        }
        setBackgroundCompat(this.f119441f.f119460c);
    }

    /* renamed from: a */
    public C47318a mo94598a(float f, float f2, int i, int i2) {
        C47318a aVar = new C47318a(this, this.f119441f);
        aVar.f119450i = f;
        aVar.f119451j = f2;
        aVar.f119444c = i;
        aVar.f119445d = i2;
        aVar.f119443b = 300;
        return aVar;
    }
}
