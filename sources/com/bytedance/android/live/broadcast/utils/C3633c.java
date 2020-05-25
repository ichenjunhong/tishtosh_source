package com.bytedance.android.live.broadcast.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* renamed from: com.bytedance.android.live.broadcast.utils.c */
public class C3633c extends HandlerThread implements Callback {

    /* renamed from: a */
    private Surface f10359a;

    /* renamed from: b */
    private Rect f10360b;

    /* renamed from: c */
    private Handler f10361c;

    public boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        this.f10361c.sendEmptyMessage(235);
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.f10361c = new Handler(getLooper(), this);
        this.f10361c.sendEmptyMessage(233);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 233) {
            Canvas lockCanvas = this.f10359a.lockCanvas(this.f10360b);
            lockCanvas.drawColor(-7829368);
            this.f10359a.unlockCanvasAndPost(lockCanvas);
            this.f10361c.sendEmptyMessageDelayed(233, 66);
        } else if (i == 235) {
            this.f10359a = null;
        }
        return true;
    }

    public C3633c(Surface surface, int i, int i2) {
        super(C3633c.class.getSimpleName());
        this.f10359a = surface;
        this.f10360b = new Rect(0, 0, i, i2);
    }
}
