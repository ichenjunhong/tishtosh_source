package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18603c.C18604a;

/* renamed from: com.ss.android.ad.splash.core.BDASplashImageView */
public class BDASplashImageView extends ImageView {

    /* renamed from: a */
    public C18602b f51153a;

    /* renamed from: b */
    private C18659o f51154b;

    /* renamed from: c */
    private float f51155c;

    /* renamed from: d */
    private float f51156d;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean performClick() {
        return super.performClick();
    }

    public BDASplashImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    public void setInteraction(C18659o oVar) {
        this.f51154b = oVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f51153a.mo37865x() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f51155c = motionEvent.getX();
            this.f51156d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            C18604a aVar = new C18604a();
            float f = this.f51155c;
            float f2 = this.f51156d;
            int width = getWidth();
            int height = getHeight();
            float f3 = (float) width;
            if (f3 > 0.0f) {
                float f4 = (float) height;
                if (f4 > 0.0f) {
                    float f5 = f / f3;
                    float f6 = f2 / f4;
                    int i3 = 2;
                    if (f5 < 0.33f) {
                        i2 = 0;
                    } else if (0.33f > f5 || f5 > 0.67f) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    if (f6 < 0.33f) {
                        i3 = 0;
                    } else if (0.33f <= f6 && f6 <= 0.67f) {
                        i3 = 1;
                    }
                    i = (i3 * 3) + i2;
                    this.f51154b.mo38080a(this.f51153a, aVar.mo38002a(i).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38006a());
                }
            }
            i = -1;
            this.f51154b.mo38080a(this.f51153a, aVar.mo38002a(i).mo38003a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo38006a());
        }
        return true;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
