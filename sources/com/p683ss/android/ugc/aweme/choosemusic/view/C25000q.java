package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.support.p043v7.widget.AppCompatImageView;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.q */
public final class C25000q extends AppCompatImageView {

    /* renamed from: a */
    private int f66182a;

    /* renamed from: b */
    private C25001a f66183b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.q$a */
    public interface C25001a {
        /* renamed from: a */
        void mo50795a();

        /* renamed from: a */
        void mo50796a(boolean z);
    }

    public final void setKeyboardDismissHandler(C25001a aVar) {
        this.f66183b = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f66183b != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = true;
            switch (motionEvent.getAction()) {
                case 0:
                    this.f66183b.mo50796a(false);
                    break;
                case 1:
                case 3:
                    this.f66183b.mo50796a(true);
                    break;
                case 2:
                    float f = (float) this.f66182a;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= ((float) (getRight() - getLeft())) + f || y >= ((float) (getBottom() - getTop())) + f) {
                        z = false;
                    }
                    if (!z) {
                        this.f66183b.mo50795a();
                        break;
                    }
                    break;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
