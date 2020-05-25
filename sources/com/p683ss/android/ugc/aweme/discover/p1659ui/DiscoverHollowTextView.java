package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.util.C10748a;
import com.p683ss.android.ugc.aweme.base.p1420ui.HollowTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverHollowTextView */
public final class DiscoverHollowTextView extends HollowTextView {

    /* renamed from: b */
    private int f74750b;

    public DiscoverHollowTextView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        if (this.f74750b != 0) {
            Paint paint = this.f62943a;
            C52711k.m112236a((Object) paint, "mTextPaint");
            paint.setTypeface(C10748a.m21784a().mo19434a(this.f74750b));
        }
        super.onDraw(canvas);
    }

    public DiscoverHollowTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m_, R.attr.md, R.attr.me});
        this.f74750b = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }

    public DiscoverHollowTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
