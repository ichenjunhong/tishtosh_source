package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;

public class MaxWidthSupportLayout extends FrameLayout {

    /* renamed from: a */
    private static int f16736a = 49;

    /* renamed from: b */
    private int f16737b;

    public void setMaxWidth(int i) {
        this.f16737b = i;
    }

    public MaxWidthSupportLayout(Context context) {
        super(context);
        this.f16737b = C9432q.m18670a(getContext()) - ((int) C9432q.m18687b(context, (float) f16736a));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f16737b > 0) {
            int mode = MeasureSpec.getMode(i);
            if (MeasureSpec.getSize(i) > this.f16737b) {
                i = MeasureSpec.makeMeasureSpec(this.f16737b, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16737b = C9432q.m18670a(getContext()) - ((int) C9432q.m18687b(context, (float) f16736a));
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16737b = C9432q.m18670a(getContext()) - ((int) C9432q.m18687b(context, (float) f16736a));
    }

    public MaxWidthSupportLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16737b = C9432q.m18670a(getContext()) - ((int) C9432q.m18687b(context, (float) f16736a));
    }
}
