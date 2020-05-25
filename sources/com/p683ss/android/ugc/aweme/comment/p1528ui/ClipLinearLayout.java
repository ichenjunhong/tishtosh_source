package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ClipLinearLayout */
public class ClipLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f66881a;

    /* renamed from: b */
    private Path f66882b;

    public void setClipHeight(int i) {
        this.f66881a = i;
    }

    public ClipLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f66881a >= 0) {
            this.f66882b.reset();
            this.f66882b.addRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) (getMeasuredHeight() - this.f66881a), Direction.CW);
            canvas.clipPath(this.f66882b);
        }
        super.onDraw(canvas);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66881a = -1;
        if (getBackground() == null) {
            setBackgroundResource(R.drawable.dhm);
        }
        this.f66882b = new Path();
    }
}
