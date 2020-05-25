package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.views.HotSearchClipLinearLayout */
public class HotSearchClipLinearLayout extends LinearLayout {

    /* renamed from: a */
    Path f121127a = new Path();

    /* renamed from: b */
    private int f121128b;

    /* renamed from: a */
    private void m104380a() {
        this.f121128b = (int) C9432q.m18687b(getContext(), 12.0f);
    }

    public HotSearchClipLinearLayout(Context context) {
        super(context);
        m104380a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f121127a.reset();
        this.f121127a.addRoundRect(new RectF(0.0f, (float) ((getMeasuredHeight() / 2) - this.f121128b), (float) getMeasuredWidth(), (float) ((getMeasuredHeight() / 2) + this.f121128b)), (float) this.f121128b, (float) this.f121128b, Direction.CW);
        canvas.clipPath(this.f121127a);
    }

    public HotSearchClipLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m104380a();
    }

    public HotSearchClipLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m104380a();
    }
}
