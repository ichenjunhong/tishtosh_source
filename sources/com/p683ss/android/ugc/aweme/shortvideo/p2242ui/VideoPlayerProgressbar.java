package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar */
public class VideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    public int f113704a;

    /* renamed from: b */
    public boolean f113705b;

    /* renamed from: c */
    public Runnable f113706c;

    /* renamed from: d */
    private Paint f113707d;

    /* renamed from: e */
    private float f113708e;

    /* renamed from: f */
    private int f113709f;

    /* renamed from: g */
    private int f113710g;

    /* renamed from: h */
    private boolean f113711h;

    /* renamed from: i */
    private boolean f113712i;

    /* renamed from: j */
    private int f113713j;

    /* renamed from: k */
    private long f113714k;

    /* renamed from: c */
    private void m98166c() {
        m98161a();
    }

    private long getProgressbarThreshold() {
        return this.f113714k;
    }

    /* renamed from: a */
    private void m98161a() {
        postDelayed(this.f113706c, 50);
    }

    /* renamed from: b */
    private void m98164b() {
        removeCallbacks(this.f113706c);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f113706c);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setProgressbarThreshold(long j) {
        this.f113714k = j;
    }

    public void setReachedBarColor(int i) {
        this.f113710g = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f113708e = f;
    }

    public VideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m98162a(int i) {
        this.f113705b = false;
        removeCallbacks(this.f113706c);
        setMax(i);
        setProgress(0);
        m98161a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f113709f) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f113707d.setColor(this.f113710g);
            this.f113707d.setStrokeWidth(this.f113708e);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f113707d);
        }
        canvas.restore();
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m98165b(int i, int i2) {
        removeCallbacks(this.f113706c);
        setMax(i);
        setProgress(i2);
        m98164b();
    }

    /* renamed from: a */
    private void m98163a(int i, int i2) {
        this.f113705b = false;
        removeCallbacks(this.f113706c);
        setMax(i);
        setProgress(i2);
        m98161a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f113708e, Math.abs(this.f113707d.descent() - this.f113707d.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f113709f = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* renamed from: a */
    public final void mo91146a(C43893g gVar, int i) {
        if (i != 0) {
            this.f113713j = i;
        }
        switch (gVar.f111162c) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98166c();
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 4:
                m98164b();
                return;
            case 5:
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98163a(this.f113713j, (int) gVar.f111161b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 6:
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98162a(this.f113713j);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 7:
                this.f113711h = false;
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98162a(this.f113713j);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 8:
                if (this.f113711h && gVar.f111163d) {
                    setVisibility(4);
                    m98164b();
                } else if (this.f113711h && ((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98166c();
                }
                this.f113712i = !this.f113712i;
                return;
            case 9:
                return;
            case 10:
                this.f113711h = true;
                setProgress(0);
                break;
            case 11:
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98163a(this.f113713j, (int) gVar.f111161b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 12:
                if (((long) this.f113713j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m98165b(this.f113713j, (int) gVar.f111161b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
        }
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113707d = new Paint();
        this.f113708e = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        this.f113711h = true;
        this.f113712i = true;
        this.f113713j = 0;
        this.f113714k = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().progressBarThreshold();
        this.f113706c = new Runnable() {
            public final void run() {
                if (!VideoPlayerProgressbar.this.f113705b) {
                    VideoPlayerProgressbar.this.incrementProgressBy(50);
                    VideoPlayerProgressbar.this.f113704a = VideoPlayerProgressbar.this.getProgress();
                    if (VideoPlayerProgressbar.this.getMax() < VideoPlayerProgressbar.this.f113704a) {
                        VideoPlayerProgressbar.this.removeCallbacks(VideoPlayerProgressbar.this.f113706c);
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long j = uptimeMillis + (50 - (uptimeMillis % 50));
                    VideoPlayerProgressbar videoPlayerProgressbar = VideoPlayerProgressbar.this;
                    if (videoPlayerProgressbar.getHandler() != null) {
                        videoPlayerProgressbar.getHandler().postAtTime(videoPlayerProgressbar.f113706c, j);
                    }
                }
            }
        };
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.yc, R.attr.yd});
        this.f113710g = obtainStyledAttributes.getColor(0, -261935);
        this.f113708e = obtainStyledAttributes.getDimension(1, this.f113708e);
        obtainStyledAttributes.recycle();
    }
}
