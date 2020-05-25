package com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.detailvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout */
public final class DispatchTouchEventLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C31126a f81481a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout$a */
    public interface C31126a {
        /* renamed from: a */
        boolean mo63949a(KeyEvent keyEvent);

        /* renamed from: a */
        boolean mo63950a(MotionEvent motionEvent);
    }

    public final void setDispatchTouchEventCallBack(C31126a aVar) {
        this.f81481a = aVar;
    }

    public DispatchTouchEventLinearLayout(Context context) {
        this(context, null);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C31126a aVar = this.f81481a;
        if (aVar != null) {
            return aVar.mo63950a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DispatchTouchEventLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DispatchTouchEventLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
