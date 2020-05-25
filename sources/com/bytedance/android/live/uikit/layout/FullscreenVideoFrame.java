package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a */
    private C4223a f11527a;

    /* renamed from: com.bytedance.android.live.uikit.layout.FullscreenVideoFrame$a */
    public interface C4223a {
        /* renamed from: a */
        void mo9701a();
    }

    /* renamed from: a */
    private void m10447a() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(C4223a aVar) {
        this.f11527a = aVar;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        m10447a();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10447a();
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
        if (this.f11527a != null) {
            this.f11527a.mo9701a();
        }
        return true;
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10447a();
    }
}
