package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SugCompletionView */
public class SugCompletionView extends AppCompatImageView {

    /* renamed from: a */
    private int f75861a;

    /* renamed from: b */
    private C28975a f75862b;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.SugCompletionView$a */
    public interface C28975a {
        /* renamed from: a */
        void mo56293a();

        /* renamed from: a */
        void mo56294a(boolean z);
    }

    public void setKeyboardDismissHandler(C28975a aVar) {
        this.f75862b = aVar;
    }

    public SugCompletionView(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f75862b != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f75862b.mo56294a(false);
            } else if (action != 2) {
                this.f75862b.mo56294a(true);
            } else {
                float f = (float) this.f75861a;
                float f2 = -f;
                if (x >= f2 && y >= f2 && x < ((float) (getRight() - getLeft())) + f && y < ((float) (getBottom() - getTop())) + f) {
                    z = true;
                }
                if (!z) {
                    this.f75862b.mo56293a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75861a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
