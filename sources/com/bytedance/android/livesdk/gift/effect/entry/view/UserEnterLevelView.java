package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.p030v4.graphics.C0803a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7429b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.gift.effect.p358a.C7327a;
import com.ss.android.ugc.trill.R;

public class UserEnterLevelView extends View implements C7327a {

    /* renamed from: a */
    public boolean f20241a;

    /* renamed from: b */
    private C7406c f20242b;

    /* renamed from: c */
    private Bitmap f20243c;

    /* renamed from: d */
    private float f20244d;

    /* renamed from: e */
    private Matrix f20245e;

    /* renamed from: f */
    private Shader f20246f;

    /* renamed from: g */
    private RectF f20247g;

    /* renamed from: h */
    private Shader f20248h;

    /* renamed from: i */
    private Shader f20249i;

    /* renamed from: j */
    private ComposeShader f20250j;

    /* renamed from: k */
    private Bitmap f20251k;

    /* renamed from: l */
    private Canvas f20252l;

    /* renamed from: m */
    private Matrix f20253m;

    /* renamed from: n */
    private float f20254n;

    /* renamed from: o */
    private Matrix f20255o;

    /* renamed from: p */
    private Paint f20256p;

    /* renamed from: q */
    private Paint f20257q;

    /* renamed from: r */
    private Paint f20258r;

    /* renamed from: s */
    private float f20259s;

    /* renamed from: t */
    private float f20260t;

    /* renamed from: u */
    private boolean f20261u;

    /* renamed from: v */
    private boolean f20262v;

    /* renamed from: w */
    private boolean f20263w;

    /* renamed from: x */
    private int f20264x;

    /* renamed from: a */
    public final void mo13675a() {
        if (this.f20264x == 2) {
            m15281a(this.f20259s, this.f20260t);
        } else {
            m15282b();
        }
        invalidate();
    }

    /* renamed from: b */
    private void m15282b() {
        float f;
        if (!this.f20263w) {
            this.f20263w = true;
            int color = getResources().getColor(R.color.alg);
            int color2 = getResources().getColor(R.color.ali);
            int color3 = getResources().getColor(R.color.alh);
            this.f20253m = new Matrix();
            if (this.f20261u) {
                f = this.f20259s;
            } else {
                f = 0.0f;
            }
            this.f20254n = f;
            this.f20247g = new RectF(0.0f, 0.0f, this.f20259s, this.f20260t);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f20259s, this.f20260t, color, color, TileMode.CLAMP);
            this.f20248h = linearGradient;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 30.0f, 7.0f, new int[]{color3, color2, color3}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            this.f20249i = linearGradient2;
            this.f20250j = new ComposeShader(this.f20248h, this.f20249i, Mode.DST_ATOP);
            this.f20251k = Bitmap.createBitmap((int) this.f20259s, (int) this.f20260t, Config.ARGB_8888);
            this.f20252l = new Canvas(this.f20251k);
            this.f20248h.setLocalMatrix(this.f20255o);
            this.f20249i.setLocalMatrix(this.f20255o);
            this.f20250j.setLocalMatrix(this.f20255o);
        }
    }

    public UserEnterLevelView(Context context) {
        this(context, null);
    }

    public void updateDrawingCache(View view) {
        this.f20243c = C7429b.m15317a(view);
        invalidate();
    }

    public void setUI(C7394a aVar) {
        this.f20264x = aVar.f20193k;
        this.f20242b.setUI(aVar);
        this.f20243c = C7429b.m15317a((View) this.f20242b);
        this.f20259s = (float) this.f20242b.getWidth();
        this.f20260t = (float) this.f20242b.getHeight();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f20241a) {
            this.f20256p.reset();
            canvas.drawBitmap(this.f20243c, 0.0f, 0.0f, this.f20256p);
            try {
                if (this.f20262v) {
                    if (this.f20261u) {
                        this.f20244d -= 60.0f;
                    } else {
                        this.f20244d += 60.0f;
                    }
                    this.f20245e.setTranslate(this.f20244d, 0.0f);
                    this.f20246f.setLocalMatrix(this.f20245e);
                    this.f20256p.setAlpha(240);
                    this.f20256p.setShader(this.f20246f);
                    canvas.drawRoundRect(this.f20247g, 10.0f, 10.0f, this.f20256p);
                    if (this.f20244d >= this.f20259s * 4.0f) {
                        this.f20262v = false;
                        this.f20244d = -this.f20259s;
                    }
                    if (this.f20262v && this.f20244d <= this.f20259s * 4.0f) {
                        postInvalidateDelayed(20);
                    }
                    return;
                }
                if (this.f20263w) {
                    this.f20252l.drawPaint(this.f20258r);
                    if (this.f20261u) {
                        this.f20254n -= 30.0f;
                    } else {
                        this.f20254n += 30.0f;
                    }
                    this.f20253m.setTranslate(this.f20254n, 0.0f);
                    this.f20249i.setLocalMatrix(this.f20253m);
                    this.f20250j = new ComposeShader(this.f20248h, this.f20249i, Mode.DST_ATOP);
                    this.f20250j.setLocalMatrix(this.f20255o);
                    this.f20256p.setShader(this.f20250j);
                    this.f20252l.drawRoundRect(this.f20247g, 10.0f, 10.0f, this.f20256p);
                    this.f20256p.setAlpha(128);
                    canvas.drawBitmap(this.f20251k, 0.0f, 0.0f, this.f20256p);
                    if (this.f20254n >= this.f20259s * 1.5f) {
                        this.f20263w = false;
                        this.f20254n = (-this.f20259s) / 2.0f;
                    }
                    if (this.f20263w && this.f20254n <= this.f20259s * 1.5f) {
                        postInvalidateDelayed(20);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f20259s = (float) this.f20242b.getWidth();
        this.f20260t = (float) this.f20242b.getHeight();
        setMeasuredDimension((int) this.f20259s, (int) this.f20260t);
    }

    /* renamed from: a */
    private void m15281a(float f, float f2) {
        float f3;
        float f4 = f;
        float f5 = f2;
        if (!this.f20262v) {
            this.f20262v = true;
            this.f20245e = new Matrix();
            if (this.f20261u) {
                f3 = f4;
            } else {
                f3 = -f4;
            }
            this.f20244d = f3 * 3.0f;
            int color = getResources().getColor(R.color.alj);
            this.f20247g = new RectF(0.0f, 0.0f, f4, f5);
            float f6 = f4 * 4.0f;
            float f7 = f6;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f6, 0.0f, C0803a.m2298b(color, NormalGiftView.ALPHA_180), C0803a.m2298b(color, NormalGiftView.ALPHA_180), TileMode.CLAMP);
            Bitmap createBitmap = Bitmap.createBitmap((int) f7, (int) f5, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TileMode tileMode = TileMode.CLAMP;
            this.f20246f = new BitmapShader(createBitmap, tileMode, tileMode);
            float f8 = f4 / 4.0f;
            float f9 = f5 / 4.0f;
            float dimension = getResources().getDimension(R.dimen.sm);
            float dimension2 = getResources().getDimension(R.dimen.sl);
            float f10 = f8 * 2.0f;
            float f11 = f9 * 2.0f;
            float f12 = f10 + dimension;
            float f13 = f8 * 1.0f;
            float f14 = f9 * 3.0f;
            float f15 = 0.0f * f8;
            float f16 = f15 + dimension;
            float f17 = f8 * 3.0f;
            float f18 = f9 * 1.0f;
            float f19 = dimension + f17;
            float f20 = f4 * 2.0f;
            float f21 = f4 * 3.0f;
            float[] fArr = {f10, f11, f12, f11, f13, f14, f13 + dimension, f14, f15 + f4, f11, f16 + f4, f11, f10 + f4, f14, f12 + f4, f14, f17 + f4, f18, f19 + f4, f18, f15 + f20, f14, f16 + f20, f14, f17 + f20, f18, f20 + f19, f18, f15 + f21, f14, f16 + f21, f14, f17 + f21, f18, f19 + f21, f18};
            canvas.drawPaint(this.f20258r);
            this.f20257q.setShader(linearGradient);
            this.f20257q.setStrokeWidth(dimension2);
            canvas.drawLines(fArr, this.f20257q);
            this.f20246f.setLocalMatrix(this.f20255o);
        }
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20242b = new C7406c(context);
        this.f20242b.setDrawingCacheListener(this);
        this.f20243c = C7429b.m15317a((View) this.f20242b);
        this.f20256p = new Paint();
        this.f20256p.setAntiAlias(true);
        this.f20257q = new Paint();
        this.f20257q.setAntiAlias(true);
        this.f20258r = new Paint();
        this.f20258r.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f20255o = new Matrix();
        this.f20255o.setTranslate(1.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo13677a(CharSequence charSequence, ImageModel imageModel, ImageModel imageModel2) {
        if (this.f20242b != null && !TextUtils.isEmpty(charSequence) && imageModel2 != null) {
            this.f20242b.mo13696a(charSequence, imageModel, imageModel2);
            this.f20243c = C7429b.m15317a((View) this.f20242b);
            this.f20259s = (float) this.f20242b.getWidth();
            this.f20260t = (float) this.f20242b.getHeight();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo13676a(C7394a aVar, int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (aVar != null && this.f20242b != null) {
            this.f20264x = aVar.f20193k;
            this.f20242b.mo13695a(aVar, i, R.drawable.bgm, charSequence, R.color.b3j, R.color.b3j);
            this.f20243c = C7429b.m15317a((View) this.f20242b);
            this.f20259s = (float) this.f20242b.getWidth();
            this.f20260t = (float) this.f20242b.getHeight();
            invalidate();
        }
    }
}
