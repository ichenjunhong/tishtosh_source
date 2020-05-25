package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

final class buj implements Callback, FrameCallback {

    /* renamed from: b */
    static final buj f43957b = new buj();

    /* renamed from: a */
    public volatile long f43958a;

    /* renamed from: c */
    final Handler f43959c;

    /* renamed from: d */
    private final HandlerThread f43960d = new HandlerThread("ChoreographerOwner:Handler");

    /* renamed from: e */
    private Choreographer f43961e;

    /* renamed from: f */
    private int f43962f;

    private buj() {
        this.f43960d.start();
        this.f43959c = new Handler(this.f43960d.getLooper(), this);
        this.f43959c.sendEmptyMessage(0);
    }

    public final void doFrame(long j) {
        this.f43958a = j;
        this.f43961e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f43961e = Choreographer.getInstance();
                return true;
            case 1:
                this.f43962f++;
                if (this.f43962f == 1) {
                    this.f43961e.postFrameCallback(this);
                }
                return true;
            case 2:
                this.f43962f--;
                if (this.f43962f == 0) {
                    this.f43961e.removeFrameCallback(this);
                    this.f43958a = 0;
                }
                return true;
            default:
                return false;
        }
    }
}
