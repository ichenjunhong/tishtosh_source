package com.p683ss.android.ugc.aweme.base.p1420ui;

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
import android.os.Message;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView */
public class AudioControlView extends View {

    /* renamed from: a */
    int f62876a;

    /* renamed from: b */
    int f62877b;

    /* renamed from: c */
    public C23615b f62878c;

    /* renamed from: d */
    public ValueAnimator f62879d;

    /* renamed from: e */
    volatile boolean f62880e;

    /* renamed from: f */
    private Paint f62881f;

    /* renamed from: g */
    private int f62882g;

    /* renamed from: h */
    private float f62883h;

    /* renamed from: i */
    private boolean f62884i;

    /* renamed from: j */
    private HandlerThread f62885j;

    /* renamed from: k */
    private C23614a f62886k;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$a */
    static class C23614a extends Handler {

        /* renamed from: a */
        public boolean f62889a;

        /* renamed from: b */
        private final WeakReference<AudioControlView> f62890b;

        /* renamed from: c */
        private AudioManager f62891c;

        /* renamed from: d */
        private int f62892d;

        /* renamed from: e */
        private int f62893e;

        /* renamed from: f */
        private int f62894f;

        /* renamed from: c */
        private void m57890c() {
            m57892e();
            m57891d();
        }

        /* renamed from: d */
        private void m57891d() {
            C0013i.m18a((Callable<TResult>) new C23688c<TResult>(this), C0013i.f25b);
        }

        /* renamed from: e */
        private void m57892e() {
            try {
                this.f62891c.setStreamVolume(3, this.f62894f, 8);
            } catch (SecurityException e) {
                C32458a.m75148a((Throwable) e);
            }
        }

        /* renamed from: b */
        private void m57889b() {
            try {
                this.f62894f = this.f62891c.getStreamVolume(3);
            } catch (NullPointerException e) {
                C32458a.m75148a((Throwable) e);
                this.f62889a = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo48959a() throws Exception {
            AudioControlView audioControlView = (AudioControlView) this.f62890b.get();
            if (audioControlView != null) {
                audioControlView.setProgress(((float) this.f62894f) / ((float) this.f62892d));
                if (!audioControlView.f62880e) {
                    audioControlView.invalidate();
                    audioControlView.mo48944d();
                    if (audioControlView.f62878c != null) {
                        audioControlView.f62878c.mo48962b();
                    }
                    audioControlView.f62879d = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    audioControlView.f62879d.setDuration(1400);
                    audioControlView.f62879d.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (AudioControlView.this.f62878c != null) {
                                AudioControlView.this.f62878c.mo48961a();
                                AudioControlView.this.f62879d = null;
                            }
                        }
                    });
                    audioControlView.f62879d.start();
                }
            }
            return null;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f62892d = this.f62891c.getStreamMaxVolume(3);
                    this.f62893e = this.f62892d / 15;
                    if (this.f62893e == 0) {
                        this.f62893e = 1;
                    }
                    m57889b();
                    return;
                case 2:
                    m57889b();
                    this.f62894f += this.f62893e;
                    if (this.f62894f > this.f62892d) {
                        this.f62894f = this.f62892d;
                    }
                    m57890c();
                    return;
                case 3:
                    m57889b();
                    this.f62894f -= this.f62893e;
                    if (this.f62894f < 0) {
                        this.f62894f = 0;
                    }
                    m57890c();
                    break;
            }
        }

        private C23614a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f62890b = new WeakReference<>(audioControlView);
            this.f62891c = (AudioManager) audioControlView.getContext().getSystemService("audio");
            sendEmptyMessage(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$b */
    public interface C23615b {
        /* renamed from: a */
        void mo48961a();

        /* renamed from: b */
        void mo48962b();
    }

    /* renamed from: e */
    public final void mo48946e() {
        this.f62878c = null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f62880e = false;
    }

    /* renamed from: b */
    public final void mo48942b() {
        mo48941a();
        this.f62886k.sendEmptyMessage(3);
    }

    /* renamed from: c */
    public final void mo48943c() {
        mo48941a();
        this.f62886k.sendEmptyMessage(2);
    }

    /* renamed from: f */
    public final boolean mo48947f() {
        if (this.f62886k != null) {
            return this.f62886k.f62889a;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo48944d() {
        if (this.f62879d != null) {
            this.f62879d.removeAllListeners();
            this.f62879d.cancel();
            this.f62879d = null;
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo48944d();
        this.f62878c = null;
        if (this.f62885j != null) {
            this.f62885j.quit();
            this.f62885j = null;
            this.f62886k = null;
        }
        this.f62880e = true;
    }

    /* renamed from: a */
    public final void mo48941a() {
        if (this.f62885j == null) {
            this.f62885j = new HandlerThread("Audio-Api-Thread");
            this.f62885j.start();
            this.f62886k = new C23614a(this.f62885j.getLooper(), this);
        }
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.mo48941a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(C23615b bVar) {
        this.f62878c = bVar;
    }

    public void setProgress(float f) {
        this.f62883h = f;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f62882g = i;
        this.f62881f.setColor(this.f62882g);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f62884i) {
            canvas.drawLine((float) this.f62876a, (float) (this.f62877b / 2), ((float) this.f62876a) - (((float) this.f62876a) * this.f62883h), (float) (this.f62877b / 2), this.f62881f);
            return;
        }
        canvas.drawLine(0.0f, (float) (this.f62877b / 2), ((float) this.f62876a) * this.f62883h, (float) (this.f62877b / 2), this.f62881f);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f62876a = getMeasuredWidth();
        this.f62877b = getMeasuredHeight();
        boolean z = true;
        if (C1056u.m3055f(this) != 1) {
            z = false;
        }
        this.f62884i = z;
    }

    public AudioControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bu, R.attr.mf});
        this.f62882g = obtainStyledAttributes.getColor(1, C0726c.m2098c(context, R.color.a1l));
        obtainStyledAttributes.recycle();
        this.f62881f = new Paint();
        this.f62881f.setAntiAlias(true);
        this.f62881f.setColor(this.f62882g);
        this.f62881f.setStyle(Style.FILL);
        this.f62881f.setStrokeWidth(2.0f);
    }
}
