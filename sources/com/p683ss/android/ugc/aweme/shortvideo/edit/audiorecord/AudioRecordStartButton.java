package com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton */
public final class AudioRecordStartButton extends FrameLayout {

    /* renamed from: a */
    public ImageView f109700a;

    /* renamed from: b */
    C43396a f109701b;

    /* renamed from: c */
    ValueAnimator f109702c = ValueAnimator.ofFloat(new float[]{1.0f, 0.72f});

    /* renamed from: d */
    ValueAnimator f109703d = ValueAnimator.ofFloat(new float[]{0.72f, 1.0f});

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$a */
    public static final class C43396a extends View {

        /* renamed from: a */
        public float f109704a = this.f109709f;

        /* renamed from: b */
        ValueAnimator f109705b = ValueAnimator.ofFloat(new float[]{this.f109708e, this.f109709f});

        /* renamed from: c */
        ValueAnimator f109706c = ValueAnimator.ofFloat(new float[]{this.f109709f, this.f109708e});

        /* renamed from: d */
        private final Paint f109707d = new Paint();

        /* renamed from: e */
        private final float f109708e = C9432q.m18687b(getContext(), 3.5f);

        /* renamed from: f */
        private final float f109709f = C9432q.m18687b(getContext(), 13.0f);

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ValueAnimator valueAnimator = this.f109705b;
            C52711k.m112236a((Object) valueAnimator, "rToC");
            if (valueAnimator.isRunning()) {
                this.f109705b.end();
            }
            ValueAnimator valueAnimator2 = this.f109706c;
            C52711k.m112236a((Object) valueAnimator2, "cToR");
            if (valueAnimator2.isRunning()) {
                this.f109706c.end();
            }
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (canvas != null) {
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f109704a, this.f109704a, this.f109707d);
            }
        }

        public C43396a(Context context) {
            C52711k.m112240b(context, "context");
            super(context);
            this.f109707d.setAntiAlias(true);
            this.f109707d.setColor(Color.parseColor("#fe2c55"));
            this.f109705b.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C43396a f109710a;

                {
                    this.f109710a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C43396a aVar = this.f109710a;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        aVar.f109704a = ((Float) animatedValue).floatValue();
                        this.f109710a.invalidate();
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ValueAnimator valueAnimator = this.f109705b;
            C52711k.m112236a((Object) valueAnimator, "rToC");
            valueAnimator.setDuration(250);
            this.f109706c.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C43396a f109711a;

                {
                    this.f109711a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C43396a aVar = this.f109711a;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        aVar.f109704a = ((Float) animatedValue).floatValue();
                        this.f109711a.invalidate();
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ValueAnimator valueAnimator2 = this.f109706c;
            C52711k.m112236a((Object) valueAnimator2, "cToR");
            valueAnimator2.setDuration(250);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$b */
    static final class C43399b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f109712a;

        C43399b(AudioRecordStartButton audioRecordStartButton) {
            this.f109712a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AudioRecordStartButton.m95159a(this.f109712a).setScaleX(floatValue);
                AudioRecordStartButton.m95159a(this.f109712a).setScaleY(floatValue);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.AudioRecordStartButton$c */
    static final class C43400c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AudioRecordStartButton f109713a;

        C43400c(AudioRecordStartButton audioRecordStartButton) {
            this.f109713a = audioRecordStartButton;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                AudioRecordStartButton.m95159a(this.f109713a).setScaleX(floatValue);
                AudioRecordStartButton.m95159a(this.f109713a).setScaleY(floatValue);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    public final void mo88318a() {
        this.f109702c.end();
        this.f109703d.start();
    }

    /* renamed from: b */
    public final void mo88319b() {
        C43396a aVar = this.f109701b;
        if (aVar == null) {
            C52711k.m112237a("centerView");
        }
        aVar.f109706c.end();
        aVar.f109705b.start();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f109702c;
        C52711k.m112236a((Object) valueAnimator, "bToS");
        if (valueAnimator.isRunning()) {
            this.f109702c.end();
        }
        ValueAnimator valueAnimator2 = this.f109703d;
        C52711k.m112236a((Object) valueAnimator2, "sToB");
        if (valueAnimator2.isRunning()) {
            this.f109703d.end();
        }
    }

    /* renamed from: c */
    private final void m95160c() {
        this.f109700a = new ImageView(getContext());
        ImageView imageView = this.f109700a;
        if (imageView == null) {
            C52711k.m112237a("bgView");
        }
        imageView.setBackground(C42430at.m93195a(-16776961, -1, 0));
        ImageView imageView2 = this.f109700a;
        if (imageView2 == null) {
            C52711k.m112237a("bgView");
        }
        addView(imageView2, new LayoutParams(-1, -1));
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        this.f109701b = new C43396a(context);
        LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(getContext(), 20.0f), (int) C9432q.m18687b(getContext(), 20.0f));
        layoutParams.topMargin = (int) C9432q.m18687b(getContext(), 26.0f);
        layoutParams.leftMargin = (int) C9432q.m18687b(getContext(), 26.0f);
        layoutParams.setMarginStart((int) C9432q.m18687b(getContext(), 26.0f));
        C43396a aVar = this.f109701b;
        if (aVar == null) {
            C52711k.m112237a("centerView");
        }
        addView(aVar, layoutParams);
        this.f109702c.addUpdateListener(new C43399b(this));
        this.f109703d.addUpdateListener(new C43400c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m95159a(AudioRecordStartButton audioRecordStartButton) {
        ImageView imageView = audioRecordStartButton.f109700a;
        if (imageView == null) {
            C52711k.m112237a("bgView");
        }
        return imageView;
    }

    public AudioRecordStartButton(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m95160c();
    }

    public AudioRecordStartButton(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        m95160c();
    }

    public AudioRecordStartButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        m95160c();
    }
}
