package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;

public class PKProgressBar extends View {

    /* renamed from: a */
    public float f23156a;

    /* renamed from: b */
    float f23157b;

    /* renamed from: c */
    float f23158c;

    /* renamed from: d */
    public int f23159d;

    /* renamed from: e */
    public int f23160e;

    /* renamed from: f */
    private boolean f23161f;

    /* renamed from: g */
    private int f23162g;

    /* renamed from: h */
    private int f23163h;

    /* renamed from: i */
    private float f23164i;

    /* renamed from: j */
    private final Paint f23165j;

    /* renamed from: k */
    private int f23166k;

    /* renamed from: l */
    private int f23167l;

    /* renamed from: m */
    private float f23168m;

    /* renamed from: n */
    private float f23169n;

    /* renamed from: o */
    private RectF f23170o;

    /* renamed from: p */
    private RectF f23171p;

    /* renamed from: q */
    private ValueAnimator f23172q;

    /* renamed from: r */
    private ValueAnimator f23173r;

    /* renamed from: s */
    private ValueAnimator f23174s;

    public int getLeftValue() {
        return this.f23159d;
    }

    public int getRightValue() {
        return this.f23160e;
    }

    private Path getClipPath() {
        float leftPaddingOffset = (float) getLeftPaddingOffset();
        float topPaddingOffset = (float) getTopPaddingOffset();
        float width = (((float) getWidth()) - leftPaddingOffset) - ((float) getRightPaddingOffset());
        float height = (((float) getHeight()) - topPaddingOffset) - ((float) getBottomPaddingOffset());
        Path path = new Path();
        float f = height / 2.0f;
        float f2 = f + leftPaddingOffset;
        path.moveTo(f2, topPaddingOffset);
        float f3 = width + leftPaddingOffset;
        path.lineTo(f3 - f, topPaddingOffset);
        float f4 = height + topPaddingOffset;
        path.arcTo(new RectF(f3 - height, topPaddingOffset, f3, f4), -90.0f, 180.0f);
        path.lineTo(f2, f4);
        path.arcTo(new RectF(leftPaddingOffset, topPaddingOffset, height + leftPaddingOffset, f4), 90.0f, 180.0f);
        path.close();
        return path;
    }

    public void setIsVigo(boolean z) {
        this.f23161f = z;
    }

    public PKProgressBar(Context context) {
        this(context, null);
    }

    private void setProgress(float f) {
        float f2 = this.f23156a;
        if (this.f23172q != null && this.f23172q.isRunning()) {
            this.f23172q.cancel();
        }
        this.f23172q = ValueAnimator.ofFloat(new float[]{f2, f});
        this.f23172q.setDuration(300);
        this.f23172q.addUpdateListener(new C8560m(this));
        this.f23172q.start();
    }

    public void setLeftValue(int i) {
        this.f23159d = i;
        if (this.f23160e + this.f23159d == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f23159d) / ((float) (this.f23159d + this.f23160e)));
        }
        if (this.f23173r == null || !this.f23173r.isRunning()) {
            this.f23173r = ValueAnimator.ofFloat(new float[]{this.f23157b, this.f23164i});
            this.f23173r.setDuration(300);
            this.f23173r.setRepeatCount(1);
            this.f23173r.setRepeatMode(2);
            this.f23173r.addUpdateListener(new C8558k(this));
            this.f23173r.start();
        }
    }

    public void setRightValue(int i) {
        this.f23160e = i;
        if (this.f23160e + this.f23159d == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f23159d) / ((float) (this.f23159d + this.f23160e)));
        }
        if (this.f23174s == null || !this.f23174s.isRunning()) {
            this.f23174s = ValueAnimator.ofFloat(new float[]{this.f23158c, this.f23164i});
            this.f23174s.setDuration(300);
            this.f23174s.setRepeatCount(1);
            this.f23174s.setRepeatMode(2);
            this.f23174s.addUpdateListener(new C8559l(this));
            this.f23174s.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        String str2;
        super.onDraw(canvas);
        this.f23170o.right = this.f23156a * ((float) getWidth());
        this.f23170o.bottom = (float) getHeight();
        this.f23171p.left = this.f23156a * ((float) getWidth());
        this.f23171p.bottom = (float) getHeight();
        this.f23171p.right = (float) getWidth();
        if (this.f23161f) {
            str2 = String.valueOf(this.f23159d);
            str = String.valueOf(this.f23160e);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.eyp));
            sb.append(this.f23159d);
            str2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23160e);
            sb2.append(getContext().getString(R.string.eyq));
            str = sb2.toString();
        }
        canvas.clipPath(getClipPath());
        LinearGradient linearGradient = new LinearGradient(this.f23170o.left, this.f23170o.top, this.f23170o.right, (float) getHeight(), Color.parseColor("#fe155d"), Color.parseColor("#fe499b"), TileMode.MIRROR);
        this.f23165j.setShader(linearGradient);
        canvas.drawRect(this.f23170o, this.f23165j);
        LinearGradient linearGradient2 = new LinearGradient(this.f23171p.left, this.f23171p.top, this.f23171p.right, (float) getHeight(), Color.parseColor("#2bffff"), Color.parseColor("#274ae8"), TileMode.MIRROR);
        this.f23165j.setShader(linearGradient2);
        canvas.drawRect(this.f23171p, this.f23165j);
        this.f23165j.setShader(null);
        this.f23165j.setShader(null);
        this.f23165j.setTextSize(this.f23157b);
        this.f23165j.setColor(this.f23166k);
        canvas.drawText(str2, this.f23168m, (float) ((int) (((float) (getHeight() / 2)) - ((this.f23165j.ascent() + this.f23165j.descent()) / 2.0f))), this.f23165j);
        this.f23165j.setTextSize(this.f23158c);
        this.f23165j.setColor(this.f23167l);
        canvas.drawText(str, (((float) getWidth()) - this.f23169n) - this.f23165j.measureText(str), (float) ((int) (((float) (getHeight() / 2)) - ((this.f23165j.ascent() + this.f23165j.descent()) / 2.0f))), this.f23165j);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23162g = Color.parseColor("#ff3333");
        this.f23168m = (float) C3922z.m9899a(14.0f);
        this.f23157b = (float) C3922z.m9899a(10.0f);
        this.f23163h = Color.parseColor("#ffa033");
        this.f23169n = (float) C3922z.m9899a(14.0f);
        this.f23158c = (float) C3922z.m9899a(10.0f);
        this.f23167l = -1;
        this.f23166k = -1;
        this.f23164i = (float) C3922z.m9899a(14.0f);
        this.f23160e = 0;
        this.f23159d = 0;
        this.f23156a = 0.5f;
        this.f23165j = new Paint();
        this.f23165j.setTypeface(Typeface.DEFAULT_BOLD);
        this.f23165j.setStyle(Style.FILL);
        this.f23165j.setDither(true);
        this.f23165j.setAntiAlias(true);
        this.f23170o = new RectF(0.0f, 0.0f, this.f23156a * ((float) getWidth()), (float) getHeight());
        this.f23171p = new RectF(this.f23156a * ((float) getWidth()), 0.0f, (float) getWidth(), (float) getHeight());
    }
}
