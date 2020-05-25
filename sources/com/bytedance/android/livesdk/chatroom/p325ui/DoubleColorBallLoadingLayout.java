package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.DoubleColorBallLoadingLayout */
public class DoubleColorBallLoadingLayout extends FrameLayout {

    /* renamed from: a */
    private View f15460a;

    public DoubleColorBallLoadingLayout(Context context) {
        super(context);
        m12861a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f15460a != null) {
            this.f15460a.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m12861a(Context context) {
        if (context != null) {
            this.f15460a = LayoutInflater.from(context).inflate(R.layout.bx3, this, true).findViewById(R.id.a7h);
        }
    }

    public DoubleColorBallLoadingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12861a(context);
    }
}
