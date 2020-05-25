package com.bytedance.android.livesdk.chatroom.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.trill.R;

public class VolumeControlView extends View {

    /* renamed from: a */
    Context f16740a;

    /* renamed from: b */
    int f16741b;

    /* renamed from: c */
    int f16742c;

    /* renamed from: d */
    AudioManager f16743d;

    /* renamed from: e */
    public int f16744e;

    /* renamed from: f */
    public int f16745f;

    /* renamed from: g */
    public int f16746g;

    /* renamed from: h */
    public C6234a f16747h;

    /* renamed from: i */
    public ValueAnimator f16748i;

    /* renamed from: j */
    HandlerThread f16749j;

    /* renamed from: k */
    public volatile Handler f16750k;

    /* renamed from: l */
    private Paint f16751l;

    /* renamed from: m */
    private int f16752m;

    /* renamed from: n */
    private int f16753n;

    /* renamed from: o */
    private float f16754o;

    /* renamed from: p */
    private boolean f16755p;

    /* renamed from: q */
    private Handler f16756q;

    /* renamed from: com.bytedance.android.livesdk.chatroom.view.VolumeControlView$a */
    public interface C6234a {
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                VolumeControlView volumeControlView = VolumeControlView.this;
                if (volumeControlView.f16749j == null) {
                    volumeControlView.f16749j = new HandlerThread("Audio-Api-Thread");
                    volumeControlView.f16749j.start();
                    volumeControlView.f16750k = new Handler(volumeControlView.f16749j.getLooper());
                }
                if (volumeControlView.f16743d == null) {
                    volumeControlView.f16750k.post(new Runnable() {
                        public final void run() {
                            VolumeControlView volumeControlView = VolumeControlView.this;
                            volumeControlView.f16743d = (AudioManager) volumeControlView.f16740a.getSystemService("audio");
                            volumeControlView.f16744e = volumeControlView.f16743d.getStreamMaxVolume(3);
                            volumeControlView.f16745f = volumeControlView.f16744e / 15;
                            if (volumeControlView.f16745f == 0) {
                                volumeControlView.f16745f = 1;
                            }
                            volumeControlView.f16746g = volumeControlView.f16743d.getStreamVolume(3);
                        }
                    });
                }
            }
        });
        return duration;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16748i != null) {
            this.f16748i.removeAllListeners();
            this.f16748i.cancel();
            this.f16748i = null;
        }
        this.f16747h = null;
        if (this.f16749j != null) {
            this.f16749j.quit();
            this.f16749j = null;
            this.f16750k = null;
        }
    }

    public void setOnAudioControlViewHideListener(C6234a aVar) {
        this.f16747h = aVar;
    }

    public VolumeControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f16753n = i;
        this.f16751l.setColor(this.f16753n);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16755p) {
            canvas.drawLine((float) this.f16741b, (float) (this.f16742c / 2), ((float) this.f16741b) - (((float) this.f16741b) * this.f16754o), (float) (this.f16742c / 2), this.f16751l);
            return;
        }
        canvas.drawLine(0.0f, (float) (this.f16742c / 2), ((float) this.f16741b) * this.f16754o, (float) (this.f16742c / 2), this.f16751l);
    }

    public VolumeControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16741b = getMeasuredWidth();
        this.f16742c = getMeasuredHeight();
        boolean z = true;
        if (C1056u.m3055f(this) != 1) {
            z = false;
        }
        this.f16755p = z;
    }

    public VolumeControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16756q = new Handler(Looper.getMainLooper());
        this.f16740a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bu, R.attr.mf});
        this.f16752m = obtainStyledAttributes.getColor(0, C0726c.m2098c(context, R.color.akm));
        this.f16753n = obtainStyledAttributes.getColor(1, C0726c.m2098c(context, R.color.akl));
        obtainStyledAttributes.recycle();
        this.f16751l = new Paint();
        this.f16751l.setAntiAlias(true);
        this.f16751l.setColor(this.f16753n);
        this.f16751l.setStyle(Style.FILL);
        this.f16751l.setStrokeWidth(2.0f);
    }
}
