package com.bytedance.polaris.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a */
    private C12652a f33229a;

    /* renamed from: com.bytedance.polaris.widget.FullscreenVideoFrame$a */
    public interface C12652a {
        /* renamed from: a */
        void mo23715a();
    }

    /* renamed from: a */
    private void m25431a() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(C12652a aVar) {
        this.f33229a = aVar;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        m25431a();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25431a();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f33229a != null) {
            this.f33229a.mo23715a();
        }
        return true;
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25431a();
    }
}
