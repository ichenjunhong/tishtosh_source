package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVBubbleLayout */
public final class AVBubbleLayout extends LinearLayout {

    /* renamed from: g */
    public static int f125858g;

    /* renamed from: h */
    public static int f125859h;

    /* renamed from: i */
    public static float f125860i;

    /* renamed from: j */
    public static float f125861j;

    /* renamed from: k */
    public static float f125862k;

    /* renamed from: l */
    public static int f125863l;

    /* renamed from: m */
    public static int f125864m;

    /* renamed from: n */
    public static final C50241a f125865n = new C50241a(null);

    /* renamed from: A */
    private int f125866A;

    /* renamed from: B */
    private boolean f125867B;

    /* renamed from: C */
    private boolean f125868C;

    /* renamed from: D */
    private boolean f125869D;

    /* renamed from: E */
    private boolean f125870E;

    /* renamed from: F */
    private boolean f125871F;

    /* renamed from: a */
    public Paint f125872a;

    /* renamed from: b */
    public Path f125873b;

    /* renamed from: c */
    public Path f125874c;

    /* renamed from: d */
    public Path f125875d;

    /* renamed from: e */
    public RectF f125876e;

    /* renamed from: f */
    public Matrix f125877f;

    /* renamed from: o */
    private float f125878o;

    /* renamed from: p */
    private RectF f125879p;

    /* renamed from: q */
    private float f125880q;

    /* renamed from: r */
    private float f125881r;

    /* renamed from: s */
    private int f125882s;

    /* renamed from: t */
    private Bitmap f125883t;

    /* renamed from: u */
    private Canvas f125884u;

    /* renamed from: v */
    private int f125885v;

    /* renamed from: w */
    private int f125886w;

    /* renamed from: x */
    private int f125887x;

    /* renamed from: y */
    private boolean f125888y;

    /* renamed from: z */
    private float f125889z;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AVBubbleLayout$a */
    public static final class C50241a {
        private C50241a() {
        }

        public /* synthetic */ C50241a(C52707g gVar) {
            this();
        }
    }

    public final int getMBgColor() {
        return this.f125885v;
    }

    public final int getMBorderColor() {
        return this.f125886w;
    }

    public final int getMBorderWidth() {
        return this.f125882s;
    }

    public final float getMHeight() {
        return this.f125881r;
    }

    public final boolean getMNeedAddColor() {
        return this.f125870E;
    }

    public final boolean getMNeedArrow() {
        return this.f125869D;
    }

    public final boolean getMNeedPath() {
        return this.f125867B;
    }

    public final boolean getMNeedPressFade() {
        return this.f125868C;
    }

    public final boolean getMNeedShadow() {
        return this.f125888y;
    }

    public final float getMPadding() {
        return this.f125878o;
    }

    public final int getMShadowColor() {
        return this.f125887x;
    }

    public final float getMWidth() {
        return this.f125880q;
    }

    public final boolean getUseDefaultView() {
        return this.f125871F;
    }

    public final int getPADDING() {
        return f125858g / 2;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.f125875d;
        if (path == null) {
            C52711k.m112237a("mBorderBubbleArrowPath");
        }
        return path;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.f125877f;
        if (matrix == null) {
            C52711k.m112237a("mBorderMatrix");
        }
        return matrix;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.f125876e;
        if (rectF == null) {
            C52711k.m112237a("mBorderRoundRect");
        }
        return rectF;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.f125874c;
        if (path == null) {
            C52711k.m112237a("mBubbleArrowPath");
        }
        return path;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.f125872a;
        if (paint == null) {
            C52711k.m112237a("mFillPaint");
        }
        return paint;
    }

    public final Path getMPath() {
        Path path = this.f125873b;
        if (path == null) {
            C52711k.m112237a("mPath");
        }
        return path;
    }

    public final float getBubbleOffset() {
        float max = Math.max(this.f125889z, f125862k);
        switch (this.f125866A) {
            case 0:
                return Math.min(max, this.f125880q - f125862k);
            case 1:
                return Math.min(max, this.f125881r - f125862k);
            case 2:
                return Math.min(max, this.f125881r - f125862k);
            case 3:
                return Math.min(max, this.f125880q - f125862k);
            default:
                return 0.0f;
        }
    }

    public final void setBubbleOrientation(int i) {
        this.f125866A = i;
    }

    public final void setMBgColor(int i) {
        this.f125885v = i;
    }

    public final void setMBorderColor(int i) {
        this.f125886w = i;
    }

    public final void setMBorderWidth(int i) {
        this.f125882s = i;
    }

    public final void setMHeight(float f) {
        this.f125881r = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.f125870E = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.f125869D = z;
    }

    public final void setMNeedPath(boolean z) {
        this.f125867B = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.f125868C = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.f125888y = z;
    }

    public final void setMPadding(float f) {
        this.f125878o = f;
    }

    public final void setMShadowColor(int i) {
        this.f125887x = i;
    }

    public final void setMWidth(float f) {
        this.f125880q = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.f125870E = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.f125871F = z;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        C52711k.m112240b(path, "<set-?>");
        this.f125875d = path;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        C52711k.m112240b(matrix, "<set-?>");
        this.f125877f = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        C52711k.m112240b(rectF, "<set-?>");
        this.f125876e = rectF;
    }

    public final void setMBubbleArrowPath(Path path) {
        C52711k.m112240b(path, "<set-?>");
        this.f125874c = path;
    }

    public final void setMFillPaint(Paint paint) {
        C52711k.m112240b(paint, "<set-?>");
        this.f125872a = paint;
    }

    public final void setMPath(Path path) {
        C52711k.m112240b(path, "<set-?>");
        this.f125873b = path;
    }

    public AVBubbleLayout(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        C52711k.m112240b(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f125883t == null) {
            this.f125883t = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Config.ARGB_8888);
            this.f125884u = new Canvas(this.f125883t);
        }
        float f = this.f125880q;
        float f2 = this.f125881r;
        float max = Math.max(this.f125889z, f125862k);
        Matrix matrix = new Matrix();
        this.f125877f = new Matrix();
        switch (this.f125866A) {
            case 0:
                float min = Math.min(max, f - f125862k);
                matrix.postRotate(90.0f);
                Matrix matrix2 = this.f125877f;
                if (matrix2 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix2.postRotate(90.0f);
                Matrix matrix3 = this.f125877f;
                if (matrix3 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix3.postTranslate((((float) ((this.f125882s * 3) / 2)) + min) - ((float) ((f125858g * 3) / 2)), ((float) this.f125882s) + 0.0f);
                setPadding(0, f125858g, 0, 0);
                setGravity(17);
                this.f125879p = new RectF(0.0f, (float) f125858g, this.f125880q, this.f125881r);
                matrix.postTranslate((min + ((float) ((this.f125882s * 3) / 2))) - ((float) ((f125858g * 3) / 2)), ((float) ((this.f125882s * 3) / 2)) + 0.0f);
                break;
            case 1:
                float min2 = Math.min(max, f2 - f125862k);
                setPadding(f125858g, 0, 0, 0);
                setGravity(17);
                Matrix matrix4 = this.f125877f;
                if (matrix4 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix4.postTranslate(((float) this.f125882s) + 0.0f, (((float) (this.f125882s * 2)) + min2) - ((float) ((f125858g * 3) / 2)));
                this.f125879p = new RectF((float) f125858g, 0.0f, this.f125880q, this.f125881r);
                matrix.postTranslate(((float) ((this.f125882s * 3) / 2)) + 0.0f, (min2 + ((float) (this.f125882s * 2))) - ((float) ((f125858g * 3) / 2)));
                break;
            case 2:
                float min3 = Math.min(max, f2 - f125862k);
                matrix.postRotate(180.0f);
                Matrix matrix5 = this.f125877f;
                if (matrix5 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix5.postRotate(180.0f);
                Matrix matrix6 = this.f125877f;
                if (matrix6 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix6.postTranslate(((float) (this.f125882s * 2)) + f, (((float) (this.f125882s * 2)) + min3) - ((float) ((f125858g * 3) / 2)));
                setPadding(0, 0, f125858g, 0);
                setGravity(17);
                this.f125879p = new RectF(0.0f, 0.0f, this.f125880q - ((float) f125858g), this.f125881r);
                matrix.postTranslate(f + ((float) ((this.f125882s * 3) / 2)), (min3 + ((float) (this.f125882s * 2))) - ((float) ((f125858g * 3) / 2)));
                break;
            case 3:
                float min4 = Math.min(max, f - f125862k);
                matrix.postRotate(270.0f);
                Matrix matrix7 = this.f125877f;
                if (matrix7 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix7.postRotate(270.0f);
                Matrix matrix8 = this.f125877f;
                if (matrix8 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                matrix8.postTranslate((((float) ((this.f125882s * 3) / 2)) + min4) - ((float) ((f125858g * 3) / 2)), ((float) (this.f125882s * 2)) + f2);
                setPadding(0, 0, 0, f125858g);
                setGravity(17);
                this.f125879p = new RectF(0.0f, 0.0f, this.f125880q, this.f125881r - ((float) f125858g));
                matrix.postTranslate((min4 + ((float) ((this.f125882s * 3) / 2))) - ((float) ((f125858g * 3) / 2)), f2 + ((float) ((this.f125882s * 3) / 2)));
                break;
        }
        RectF rectF = this.f125879p;
        if (rectF == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF.left += (float) ((this.f125882s * 3) / 2);
        RectF rectF2 = this.f125879p;
        if (rectF2 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF2.top += (float) ((this.f125882s * 3) / 2);
        RectF rectF3 = this.f125879p;
        if (rectF3 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF3.right += (float) ((this.f125882s * 3) / 2);
        RectF rectF4 = this.f125879p;
        if (rectF4 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF4.bottom += (float) ((this.f125882s * 3) / 2);
        this.f125876e = new RectF();
        RectF rectF5 = this.f125876e;
        if (rectF5 == null) {
            C52711k.m112237a("mBorderRoundRect");
        }
        RectF rectF6 = this.f125879p;
        if (rectF6 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF5.left = rectF6.left - ((float) (this.f125882s / 2));
        RectF rectF7 = this.f125876e;
        if (rectF7 == null) {
            C52711k.m112237a("mBorderRoundRect");
        }
        RectF rectF8 = this.f125879p;
        if (rectF8 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF7.top = rectF8.top - ((float) (this.f125882s / 2));
        RectF rectF9 = this.f125876e;
        if (rectF9 == null) {
            C52711k.m112237a("mBorderRoundRect");
        }
        RectF rectF10 = this.f125879p;
        if (rectF10 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF9.right = rectF10.right + ((float) (this.f125882s / 2));
        RectF rectF11 = this.f125876e;
        if (rectF11 == null) {
            C52711k.m112237a("mBorderRoundRect");
        }
        RectF rectF12 = this.f125879p;
        if (rectF12 == null) {
            C52711k.m112237a("mRoundRect");
        }
        rectF11.bottom = rectF12.bottom + ((float) (this.f125882s / 2));
        if (this.f125888y) {
            Paint paint = this.f125872a;
            if (paint == null) {
                C52711k.m112237a("mFillPaint");
            }
            paint.setShadowLayer(2.0f, 2.0f, 5.0f, this.f125887x);
        }
        if (this.f125867B) {
            Paint paint2 = this.f125872a;
            if (paint2 == null) {
                C52711k.m112237a("mFillPaint");
            }
            paint2.setColor(this.f125886w);
            Paint paint3 = this.f125872a;
            if (paint3 == null) {
                C52711k.m112237a("mFillPaint");
            }
            paint3.setStyle(Style.STROKE);
            Paint paint4 = this.f125872a;
            if (paint4 == null) {
                C52711k.m112237a("mFillPaint");
            }
            paint4.setStrokeWidth((float) this.f125882s);
            Path path = this.f125873b;
            if (path == null) {
                C52711k.m112237a("mPath");
            }
            path.reset();
            Path path2 = this.f125873b;
            if (path2 == null) {
                C52711k.m112237a("mPath");
            }
            RectF rectF13 = this.f125876e;
            if (rectF13 == null) {
                C52711k.m112237a("mBorderRoundRect");
            }
            path2.addRoundRect(rectF13, f125861j + ((float) (this.f125882s / 2)), f125861j + ((float) (this.f125882s / 2)), Direction.CW);
            if (this.f125869D) {
                Path path3 = this.f125873b;
                if (path3 == null) {
                    C52711k.m112237a("mPath");
                }
                Path path4 = this.f125875d;
                if (path4 == null) {
                    C52711k.m112237a("mBorderBubbleArrowPath");
                }
                Matrix matrix9 = this.f125877f;
                if (matrix9 == null) {
                    C52711k.m112237a("mBorderMatrix");
                }
                path3.addPath(path4, matrix9);
            }
            Canvas canvas2 = this.f125884u;
            if (canvas2 == null) {
                C52711k.m112237a("mCanvas");
            }
            Path path5 = this.f125873b;
            if (path5 == null) {
                C52711k.m112237a("mPath");
            }
            Paint paint5 = this.f125872a;
            if (paint5 == null) {
                C52711k.m112237a("mFillPaint");
            }
            canvas2.drawPath(path5, paint5);
            if (this.f125870E) {
                Paint paint6 = this.f125872a;
                if (paint6 == null) {
                    C52711k.m112237a("mFillPaint");
                }
                paint6.setColor(getResources().getColor(R.color.b1d));
                Paint paint7 = this.f125872a;
                if (paint7 == null) {
                    C52711k.m112237a("mFillPaint");
                }
                paint7.setStyle(Style.STROKE);
                Path path6 = this.f125873b;
                if (path6 == null) {
                    C52711k.m112237a("mPath");
                }
                path6.reset();
                if (this.f125869D) {
                    Path path7 = this.f125873b;
                    if (path7 == null) {
                        C52711k.m112237a("mPath");
                    }
                    Path path8 = this.f125875d;
                    if (path8 == null) {
                        C52711k.m112237a("mBorderBubbleArrowPath");
                    }
                    Matrix matrix10 = this.f125877f;
                    if (matrix10 == null) {
                        C52711k.m112237a("mBorderMatrix");
                    }
                    path7.addPath(path8, matrix10);
                }
                Path path9 = this.f125873b;
                if (path9 == null) {
                    C52711k.m112237a("mPath");
                }
                RectF rectF14 = this.f125876e;
                if (rectF14 == null) {
                    C52711k.m112237a("mBorderRoundRect");
                }
                path9.addRoundRect(rectF14, f125861j + ((float) (this.f125882s / 2)), f125861j + ((float) (this.f125882s / 2)), Direction.CW);
                Canvas canvas3 = this.f125884u;
                if (canvas3 == null) {
                    C52711k.m112237a("mCanvas");
                }
                Path path10 = this.f125873b;
                if (path10 == null) {
                    C52711k.m112237a("mPath");
                }
                Paint paint8 = this.f125872a;
                if (paint8 == null) {
                    C52711k.m112237a("mFillPaint");
                }
                canvas3.drawPath(path10, paint8);
            }
        }
        Paint paint9 = this.f125872a;
        if (paint9 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint9.setXfermode(new PorterDuffXfermode(Mode.SRC));
        Paint paint10 = this.f125872a;
        if (paint10 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint10.setColor(this.f125885v);
        Paint paint11 = this.f125872a;
        if (paint11 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint11.setStyle(Style.FILL);
        Path path11 = this.f125873b;
        if (path11 == null) {
            C52711k.m112237a("mPath");
        }
        path11.reset();
        Path path12 = this.f125873b;
        if (path12 == null) {
            C52711k.m112237a("mPath");
        }
        RectF rectF15 = this.f125879p;
        if (rectF15 == null) {
            C52711k.m112237a("mRoundRect");
        }
        float f3 = f125861j;
        path12.addRoundRect(rectF15, f3, f3, Direction.CW);
        if (this.f125869D) {
            Path path13 = this.f125873b;
            if (path13 == null) {
                C52711k.m112237a("mPath");
            }
            Path path14 = this.f125874c;
            if (path14 == null) {
                C52711k.m112237a("mBubbleArrowPath");
            }
            path13.addPath(path14, matrix);
        }
        Canvas canvas4 = this.f125884u;
        if (canvas4 == null) {
            C52711k.m112237a("mCanvas");
        }
        Path path15 = this.f125873b;
        if (path15 == null) {
            C52711k.m112237a("mPath");
        }
        Paint paint12 = this.f125872a;
        if (paint12 == null) {
            C52711k.m112237a("mFillPaint");
        }
        canvas4.drawPath(path15, paint12);
        Paint paint13 = this.f125872a;
        if (paint13 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint13.setXfermode(null);
        canvas.drawBitmap(this.f125883t, ((float) f125858g) - C9432q.m18687b(getContext(), 1.4f), ((float) f125858g) - C9432q.m18687b(getContext(), 1.3f), null);
    }

    /* renamed from: a */
    public final void mo98031a(int i, float f) {
        this.f125889z = f;
        this.f125866A = i;
    }

    public AVBubbleLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        super.onMeasure(i, i2);
        f125859h = (int) C9432q.m18687b(getContext(), this.f125878o + 5.0f);
        if (getChildAt(0) instanceof TextView) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                textView = (TextView) childAt;
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
            }
        } else {
            textView = null;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (textView != null) {
            if (((float) ((int) textView.getPaint().measureText(textView.getText().toString()))) > C9432q.m18687b(getContext(), 197.0f)) {
                i7 = (int) C9432q.m18687b(getContext(), 197.0f);
                c = 2;
            } else {
                i7 = (int) textView.getPaint().measureText(textView.getText().toString());
                c = 1;
            }
            i3 = i7 + textView.getPaddingLeft() + textView.getPaddingRight();
        } else {
            i3 = getMeasuredWidth();
            c = 0;
        }
        if (this.f125871F) {
            if (this.f125866A == 2 || this.f125866A == 1) {
                if (i3 > f125863l) {
                    i6 = i3 + (f125859h * 2);
                } else {
                    i6 = f125863l;
                }
                i4 = i6 + f125858g;
            } else if (i3 > f125863l) {
                i4 = i3 + (f125859h * 2);
            } else {
                i4 = f125863l;
            }
            if (c == 1) {
                i5 = f125864m;
            } else {
                i5 = f125864m + 19;
            }
        } else {
            PopupWindow popupWindow = new PopupWindow(getChildAt(0), -2, -2, true);
            popupWindow.getContentView().measure(0, 0);
            View contentView = popupWindow.getContentView();
            C52711k.m112236a((Object) contentView, "pop.contentView");
            int measuredWidth = contentView.getMeasuredWidth() + (f125858g * 3) + f125859h;
            View contentView2 = popupWindow.getContentView();
            C52711k.m112236a((Object) contentView2, "pop.contentView");
            i4 = measuredWidth;
            i5 = contentView2.getMeasuredHeight() + (f125858g * 3) + f125859h;
        }
        int i8 = i4 + (this.f125882s * 3);
        int i9 = i5 + (this.f125882s * 3);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, i9);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(i8, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, i9);
        }
        this.f125880q = (float) (getMeasuredWidth() - (f125858g * 2));
        this.f125881r = (float) (getMeasuredHeight() - (f125858g * 2));
    }

    public AVBubbleLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f125878o = 12.0f;
        this.f125887x = -16777216;
        this.f125889z = 0.75f;
        this.f125866A = 1;
        this.f125867B = true;
        this.f125869D = true;
        this.f125870E = true;
        this.f125871F = true;
        C52711k.m112240b(context, "context");
        this.f125882s = (int) C9432q.m18687b(context, 0.7f);
        f125858g = (int) C9432q.m18687b(context, 7.0f);
        f125860i = 2.0f;
        f125861j = C9432q.m18687b(context, 8.0f);
        f125862k = C9432q.m18687b(context, 3.0f);
        f125863l = (int) C9432q.m18687b(context, 50.0f);
        f125864m = (int) C9432q.m18687b(context, 56.0f);
        this.f125872a = new Paint();
        this.f125873b = new Path();
        this.f125875d = new Path();
        this.f125874c = new Path();
        Paint paint = this.f125872a;
        if (paint == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint.setStyle(Style.FILL);
        Paint paint2 = this.f125872a;
        if (paint2 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint2.setStrokeCap(Cap.BUTT);
        Paint paint3 = this.f125872a;
        if (paint3 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint3.setAntiAlias(true);
        Paint paint4 = this.f125872a;
        if (paint4 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint4.setStrokeWidth(f125860i);
        Paint paint5 = this.f125872a;
        if (paint5 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint5.setStrokeJoin(Join.MITER);
        this.f125885v = getResources().getColor(R.color.b1_);
        this.f125886w = getResources().getColor(R.color.a0t);
        Paint paint6 = this.f125872a;
        if (paint6 == null) {
            C52711k.m112237a("mFillPaint");
        }
        paint6.setColor(this.f125885v);
        Paint paint7 = this.f125872a;
        if (paint7 == null) {
            C52711k.m112237a("mFillPaint");
        }
        setLayerType(1, paint7);
        if (this.f125888y) {
            Paint paint8 = this.f125872a;
            if (paint8 == null) {
                C52711k.m112237a("mFillPaint");
            }
            paint8.setShadowLayer(2.0f, 2.0f, 5.0f, this.f125887x);
        }
        Path path = this.f125874c;
        if (path == null) {
            C52711k.m112237a("mBubbleArrowPath");
        }
        path.moveTo(0.0f, 0.0f);
        Path path2 = this.f125874c;
        if (path2 == null) {
            C52711k.m112237a("mBubbleArrowPath");
        }
        path2.lineTo((float) f125858g, (float) (-f125858g));
        Path path3 = this.f125874c;
        if (path3 == null) {
            C52711k.m112237a("mBubbleArrowPath");
        }
        path3.lineTo((float) f125858g, (float) f125858g);
        Path path4 = this.f125874c;
        if (path4 == null) {
            C52711k.m112237a("mBubbleArrowPath");
        }
        path4.close();
        Path path5 = this.f125875d;
        if (path5 == null) {
            C52711k.m112237a("mBorderBubbleArrowPath");
        }
        path5.moveTo(0.0f, 0.0f);
        Path path6 = this.f125875d;
        if (path6 == null) {
            C52711k.m112237a("mBorderBubbleArrowPath");
        }
        double d = (double) f125858g;
        double d2 = (double) this.f125882s;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d2);
        double d3 = d2 * sqrt;
        Double.isNaN(d);
        float f = (float) (d + d3);
        double d4 = (double) (-f125858g);
        double d5 = (double) this.f125882s;
        double sqrt2 = Math.sqrt(2.0d);
        Double.isNaN(d5);
        double d6 = d5 * sqrt2;
        Double.isNaN(d4);
        path6.lineTo(f, (float) (d4 - d6));
        Path path7 = this.f125875d;
        if (path7 == null) {
            C52711k.m112237a("mBorderBubbleArrowPath");
        }
        double d7 = (double) f125858g;
        double d8 = (double) this.f125882s;
        double sqrt3 = Math.sqrt(2.0d);
        Double.isNaN(d8);
        double d9 = d8 * sqrt3;
        Double.isNaN(d7);
        float f2 = (float) (d7 + d9);
        double d10 = (double) f125858g;
        double d11 = (double) this.f125882s;
        double sqrt4 = Math.sqrt(2.0d);
        Double.isNaN(d11);
        double d12 = d11 * sqrt4;
        Double.isNaN(d10);
        path7.lineTo(f2, (float) (d10 + d12));
        Path path8 = this.f125875d;
        if (path8 == null) {
            C52711k.m112237a("mBorderBubbleArrowPath");
        }
        path8.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }
}
