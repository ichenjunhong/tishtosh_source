package com.bytedance.android.live.broadcast.widget;

import android.animation.ValueAnimator;
import android.view.Surface;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g;
import com.bytedance.android.live.broadcast.p213h.p214a.C3425g.C3427a;

public class AudioWidget extends CaptureWidget implements C3427a {

    /* renamed from: c */
    Surface f10384c;

    /* renamed from: f */
    private C3425g f10385f;

    /* renamed from: g */
    private ValueAnimator f10386g;

    public void onDestroy() {
        super.onDestroy();
        this.f10386g.removeAllUpdateListeners();
    }

    public void onPause() {
        super.onPause();
        this.f10385f.f9736a.onPause();
        this.f10386g.end();
    }

    public void onResume() {
        super.onResume();
        this.f10385f.f9736a.onResume();
        this.f10386g.start();
    }

    public void onCreate() {
        super.onCreate();
        this.f10385f = new C3425g(this.f10396e);
        this.f10385f.mo8800a(3553);
        this.f10385f.f9737b = this;
        this.f10385f.mo8801a(this.f10395d);
        this.f10386g = ValueAnimator.ofInt(new int[]{0, 4}).setDuration(1000);
        this.f10386g.setRepeatMode(2);
        this.f10386g.setRepeatCount(-1);
        this.f10386g.addUpdateListener(new C3742a(this));
        this.f10386g.start();
    }

    /* renamed from: a */
    public final void mo8809a(Surface surface) {
        this.f10384c = surface;
    }

    public AudioWidget(C3424f fVar, C3048a aVar) {
        super(fVar, aVar);
    }
}
