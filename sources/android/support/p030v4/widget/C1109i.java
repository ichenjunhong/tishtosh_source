package android.support.p030v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.i */
public final class C1109i {

    /* renamed from: a */
    private EdgeEffect f3541a;

    /* renamed from: b */
    public final void mo3561b() {
        this.f3541a.finish();
    }

    /* renamed from: c */
    public final boolean mo3562c() {
        this.f3541a.onRelease();
        return this.f3541a.isFinished();
    }

    /* renamed from: a */
    public final boolean mo3558a() {
        return this.f3541a.isFinished();
    }

    public C1109i(Context context) {
        this.f3541a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public final boolean mo3559a(float f) {
        this.f3541a.onPull(f);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3560a(Canvas canvas) {
        return this.f3541a.draw(canvas);
    }

    /* renamed from: a */
    public final void mo3557a(int i, int i2) {
        this.f3541a.setSize(i, i2);
    }

    /* renamed from: a */
    public static void m3233a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
