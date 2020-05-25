package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.b */
public final class C35419b implements OnDoubleTapListener {

    /* renamed from: a */
    public C35415a f91088a;

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public C35419b(C35415a aVar) {
        this.f91088a = aVar;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f91088a == null) {
            return false;
        }
        try {
            float f = this.f91088a.mo73722f();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (f < this.f91088a.mo73720d()) {
                this.f91088a.mo73717a(this.f91088a.mo73720d(), x, y, true);
            } else if (f < this.f91088a.mo73720d() || f >= this.f91088a.mo73721e()) {
                this.f91088a.mo73717a(this.f91088a.mo73719c(), x, y, true);
            } else {
                this.f91088a.mo73717a(this.f91088a.mo73721e(), x, y, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f91088a == null) {
            return false;
        }
        DraweeView b = this.f91088a.mo73718b();
        if (b == null) {
            return false;
        }
        if (this.f91088a.mo73723g() != null) {
            RectF i = this.f91088a.mo73725i();
            if (i != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (i.contains(x, y)) {
                    this.f91088a.mo73723g().mo38789a(b, (x - i.left) / i.width(), (y - i.top) / i.height());
                    return true;
                }
            }
        }
        if (this.f91088a.mo73724h() == null) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }
}
