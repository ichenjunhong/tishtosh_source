package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout */
public class TouchSensitiveRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C45590a f115304a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout$a */
    public interface C45590a {
        /* renamed from: a */
        void mo91963a();
    }

    public TouchSensitiveRelativeLayout(Context context) {
        super(context);
    }

    public void setNoBlockTouchListener(C45590a aVar) {
        this.f115304a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f115304a != null) {
            this.f115304a.mo91963a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
