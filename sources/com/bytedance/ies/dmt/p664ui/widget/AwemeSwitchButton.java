package com.bytedance.ies.dmt.p664ui.widget;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.Checkable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton */
public final class AwemeSwitchButton extends View implements Checkable {

    /* renamed from: A */
    private float f28567A;

    /* renamed from: B */
    private float f28568B;

    /* renamed from: C */
    private float f28569C;

    /* renamed from: D */
    private float f28570D;

    /* renamed from: E */
    private float f28571E;

    /* renamed from: F */
    private float f28572F;

    /* renamed from: G */
    private float f28573G;

    /* renamed from: H */
    private float f28574H;

    /* renamed from: I */
    private float f28575I;

    /* renamed from: J */
    private float f28576J;

    /* renamed from: K */
    private C10717a f28577K;

    /* renamed from: a */
    protected float f28578a;

    /* renamed from: b */
    protected float f28579b;

    /* renamed from: c */
    protected int f28580c;

    /* renamed from: d */
    protected int f28581d;

    /* renamed from: e */
    protected int f28582e;

    /* renamed from: f */
    protected int f28583f;

    /* renamed from: g */
    protected int f28584g;

    /* renamed from: h */
    protected boolean f28585h;

    /* renamed from: i */
    public boolean f28586i;

    /* renamed from: j */
    private final AccelerateInterpolator f28587j;

    /* renamed from: k */
    private final Paint f28588k;

    /* renamed from: l */
    private final Path f28589l;

    /* renamed from: m */
    private final Path f28590m;

    /* renamed from: n */
    private final RectF f28591n;

    /* renamed from: o */
    private float f28592o;

    /* renamed from: p */
    private float f28593p;

    /* renamed from: q */
    private RadialGradient f28594q;

    /* renamed from: r */
    private int f28595r;

    /* renamed from: s */
    private int f28596s;

    /* renamed from: t */
    private boolean f28597t;

    /* renamed from: u */
    private OnClickListener f28598u;

    /* renamed from: v */
    private float f28599v;

    /* renamed from: w */
    private float f28600w;

    /* renamed from: x */
    private float f28601x;

    /* renamed from: y */
    private float f28602y;

    /* renamed from: z */
    private float f28603z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$1 */
    class C107151 implements C10717a {

        /* renamed from: a */
        final /* synthetic */ AwemeSwitchButton f28604a;

        /* renamed from: a */
        public final void mo19183a(AwemeSwitchButton awemeSwitchButton) {
            this.f28604a.mo19169a(true);
        }

        /* renamed from: b */
        public final void mo19184b(AwemeSwitchButton awemeSwitchButton) {
            this.f28604a.mo19169a(false);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$SavedState */
    static final class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* renamed from: a */
        public boolean f28605a;

        public final int describeContents() {
            return 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            if (1 != parcel.readInt()) {
                z = false;
            }
            this.f28605a = z;
        }

        /* synthetic */ SavedState(Parcel parcel, C107151 r2) {
            this(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f28605a ? 1 : 0);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.AwemeSwitchButton$a */
    public interface C10717a {
        /* renamed from: a */
        void mo19183a(AwemeSwitchButton awemeSwitchButton);

        /* renamed from: b */
        void mo19184b(AwemeSwitchButton awemeSwitchButton);
    }

    public final boolean isChecked() {
        return this.f28586i;
    }

    public final void toggle() {
        setOpened(!this.f28586i);
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28605a = this.f28586i;
        return savedState;
    }

    public final void setChecked(boolean z) {
        mo19169a(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f28598u = onClickListener;
    }

    public final void setShadow(boolean z) {
        this.f28585h = z;
        invalidate();
    }

    public final void setOnStateChangedListener(C10717a aVar) {
        if (aVar != null) {
            this.f28577K = aVar;
            return;
        }
        throw new IllegalArgumentException("empty listener");
    }

    public final void setOpened(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        if (i != this.f28595r) {
            m21626a(i);
        }
    }

    /* renamed from: a */
    private void m21626a(int i) {
        if (!this.f28586i && i == 4) {
            this.f28586i = true;
        } else if (this.f28586i && i == 1) {
            this.f28586i = false;
        }
        this.f28596s = this.f28595r;
        this.f28595r = i;
        postInvalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f28586i = savedState.f28605a;
        if (this.f28586i) {
            i = 4;
        } else {
            i = 1;
        }
        this.f28595r = i;
        invalidate();
    }

    /* renamed from: a */
    public final void mo19169a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        if (i != this.f28595r) {
            if ((i == 4 && (this.f28595r == 1 || this.f28595r == 2)) || (i == 1 && (this.f28595r == 4 || this.f28595r == 3))) {
                this.f28592o = 1.0f;
            }
            this.f28593p = 1.0f;
            m21626a(i);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.f28595r == 4 || this.f28595r == 1) && this.f28592o * this.f28593p == 0.0f) {
            switch (motionEvent.getAction()) {
                case 0:
                    return true;
                case 1:
                    this.f28596s = this.f28595r;
                    this.f28593p = 1.0f;
                    if (this.f28595r == 1) {
                        m21626a(2);
                        this.f28577K.mo19183a(this);
                    } else if (this.f28595r == 4) {
                        m21626a(3);
                        this.f28577K.mo19184b(this);
                    }
                    if (this.f28598u != null) {
                        this.f28598u.onClick(this);
                        break;
                    }
                    break;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            super.onDraw(r13)
            boolean r0 = r12.f28597t
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            android.graphics.Paint r0 = r12.f28588k
            r1 = 1
            r0.setAntiAlias(r1)
            int r0 = r12.f28595r
            r2 = 0
            r3 = 3
            r4 = 4
            if (r0 == r4) goto L_0x001c
            int r0 = r12.f28595r
            if (r0 != r3) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            android.graphics.Paint r5 = r12.f28588k
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r5.setStyle(r6)
            android.graphics.Paint r5 = r12.f28588k
            if (r0 == 0) goto L_0x002b
            int r6 = r12.f28580c
            goto L_0x002d
        L_0x002b:
            int r6 = r12.f28582e
        L_0x002d:
            r5.setColor(r6)
            android.graphics.Path r5 = r12.f28589l
            android.graphics.Paint r6 = r12.f28588k
            r13.drawPath(r5, r6)
            float r5 = r12.f28592o
            float r6 = r12.f28579b
            float r5 = r5 - r6
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0047
            float r5 = r12.f28592o
            float r7 = r12.f28579b
            float r5 = r5 - r7
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r12.f28592o = r5
            float r5 = r12.f28593p
            float r7 = r12.f28579b
            float r5 = r5 - r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0059
            float r5 = r12.f28593p
            float r7 = r12.f28579b
            float r5 = r5 - r7
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            r12.f28593p = r5
            android.view.animation.AccelerateInterpolator r5 = r12.f28587j
            float r7 = r12.f28592o
            float r5 = r5.getInterpolation(r7)
            android.view.animation.AccelerateInterpolator r7 = r12.f28587j
            float r8 = r12.f28593p
            float r7 = r7.getInterpolation(r8)
            float r8 = r12.f28602y
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0074
            r10 = r5
            goto L_0x0076
        L_0x0074:
            float r10 = r9 - r5
        L_0x0076:
            float r8 = r8 * r10
            float r10 = r12.f28599v
            float r11 = r12.f28600w
            float r10 = r10 - r11
            float r11 = r12.f28567A
            float r10 = r10 - r11
            if (r0 == 0) goto L_0x0084
            float r5 = r9 - r5
        L_0x0084:
            float r10 = r10 * r5
            r13.save()
            float r5 = r12.f28600w
            float r5 = r5 + r10
            float r10 = r12.f28601x
            r13.scale(r8, r8, r5, r10)
            android.graphics.Paint r5 = r12.f28588k
            r8 = -1
            r5.setColor(r8)
            android.graphics.Path r5 = r12.f28589l
            android.graphics.Paint r10 = r12.f28588k
            r13.drawPath(r5, r10)
            r13.restore()
            r13.save()
            int r5 = r12.f28595r
            int r10 = r12.f28596s
            int r5 = r5 - r10
            r10 = 2
            switch(r5) {
                case -3: goto L_0x012a;
                case -2: goto L_0x010c;
                case -1: goto L_0x00f6;
                case 0: goto L_0x00ad;
                case 1: goto L_0x00e0;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b5;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            int r5 = r12.f28595r
            if (r5 != r1) goto L_0x0135
            float r4 = r12.f28575I
            goto L_0x013d
        L_0x00b5:
            float r4 = r12.f28572F
            float r5 = r12.f28572F
            float r11 = r12.f28575I
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 - r5
            goto L_0x013d
        L_0x00c1:
            int r5 = r12.f28595r
            if (r5 != r4) goto L_0x00d1
            float r4 = r12.f28572F
            float r5 = r12.f28572F
            float r11 = r12.f28575I
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 - r5
            goto L_0x013d
        L_0x00d1:
            int r4 = r12.f28595r
            if (r4 != r3) goto L_0x013c
            float r4 = r12.f28573G
            float r5 = r12.f28573G
            float r11 = r12.f28575I
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 - r5
            goto L_0x013d
        L_0x00e0:
            int r5 = r12.f28595r
            if (r5 != r10) goto L_0x00e7
            float r4 = r12.f28575I
            goto L_0x013d
        L_0x00e7:
            int r5 = r12.f28595r
            if (r5 != r4) goto L_0x013c
            float r4 = r12.f28572F
            float r5 = r12.f28572F
            float r11 = r12.f28573G
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 - r5
            goto L_0x013d
        L_0x00f6:
            int r4 = r12.f28595r
            if (r4 != r3) goto L_0x0105
            float r4 = r12.f28573G
            float r5 = r12.f28572F
            float r11 = r12.f28573G
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 + r5
            goto L_0x013d
        L_0x0105:
            int r4 = r12.f28595r
            if (r4 != r1) goto L_0x013c
            float r4 = r12.f28575I
            goto L_0x013d
        L_0x010c:
            int r4 = r12.f28595r
            if (r4 != r1) goto L_0x011b
            float r4 = r12.f28575I
            float r5 = r12.f28573G
            float r11 = r12.f28575I
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 + r5
            goto L_0x013d
        L_0x011b:
            int r4 = r12.f28595r
            if (r4 != r10) goto L_0x013c
            float r4 = r12.f28574H
            float r5 = r12.f28572F
            float r11 = r12.f28574H
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 + r5
            goto L_0x013d
        L_0x012a:
            float r4 = r12.f28575I
            float r5 = r12.f28572F
            float r11 = r12.f28575I
            float r5 = r5 - r11
            float r5 = r5 * r7
            float r4 = r4 + r5
            goto L_0x013d
        L_0x0135:
            int r5 = r12.f28595r
            if (r5 != r4) goto L_0x013c
            float r4 = r12.f28572F
            goto L_0x013d
        L_0x013c:
            r4 = 0
        L_0x013d:
            float r5 = r12.f28575I
            float r4 = r4 - r5
            float r5 = r12.f28576J
            r13.translate(r4, r5)
            int r4 = r12.f28595r
            if (r4 == r3) goto L_0x014f
            int r3 = r12.f28595r
            if (r3 != r10) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r1 == 0) goto L_0x0153
            float r7 = r9 - r7
        L_0x0153:
            android.graphics.Path r1 = r12.f28590m
            r1.reset()
            android.graphics.RectF r1 = r12.f28591n
            float r2 = r12.f28570D
            float r3 = r12.f28568B
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 + r3
            r1.left = r2
            android.graphics.RectF r1 = r12.f28591n
            float r2 = r12.f28571E
            float r3 = r12.f28568B
            float r3 = r3 / r4
            float r2 = r2 - r3
            r1.right = r2
            android.graphics.Path r1 = r12.f28590m
            android.graphics.RectF r2 = r12.f28591n
            r3 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r1.arcTo(r2, r3, r5)
            android.graphics.RectF r1 = r12.f28591n
            float r2 = r12.f28570D
            float r3 = r12.f28603z
            float r3 = r3 * r7
            float r2 = r2 + r3
            float r3 = r12.f28568B
            float r3 = r3 / r4
            float r2 = r2 + r3
            r1.left = r2
            android.graphics.RectF r1 = r12.f28591n
            float r2 = r12.f28571E
            float r3 = r12.f28603z
            float r7 = r7 * r3
            float r2 = r2 + r7
            float r3 = r12.f28568B
            float r3 = r3 / r4
            float r2 = r2 - r3
            r1.right = r2
            android.graphics.Path r1 = r12.f28590m
            android.graphics.RectF r2 = r12.f28591n
            r3 = 1132920832(0x43870000, float:270.0)
            r1.arcTo(r2, r3, r5)
            android.graphics.Path r1 = r12.f28590m
            r1.close()
            boolean r1 = r12.f28585h
            if (r1 == 0) goto L_0x01c4
            android.graphics.Paint r1 = r12.f28588k
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r12.f28588k
            android.graphics.RadialGradient r2 = r12.f28594q
            r1.setShader(r2)
            android.graphics.Path r1 = r12.f28590m
            android.graphics.Paint r2 = r12.f28588k
            r13.drawPath(r1, r2)
            android.graphics.Paint r1 = r12.f28588k
            r2 = 0
            r1.setShader(r2)
        L_0x01c4:
            float r1 = r12.f28576J
            float r1 = -r1
            r13.translate(r6, r1)
            float r1 = r12.f28569C
            float r1 = r1 / r4
            float r2 = r12.f28569C
            float r2 = r2 / r4
            r3 = 1065017672(0x3f7ae148, float:0.98)
            r13.scale(r3, r3, r1, r2)
            android.graphics.Paint r1 = r12.f28588k
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r12.f28588k
            r1.setColor(r8)
            android.graphics.Path r1 = r12.f28590m
            android.graphics.Paint r2 = r12.f28588k
            r13.drawPath(r1, r2)
            android.graphics.Paint r1 = r12.f28588k
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r12.f28588k
            float r2 = r12.f28568B
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.f28588k
            if (r0 == 0) goto L_0x0202
            int r0 = r12.f28581d
            goto L_0x0204
        L_0x0202:
            int r0 = r12.f28583f
        L_0x0204:
            r1.setColor(r0)
            android.graphics.Path r0 = r12.f28590m
            android.graphics.Paint r1 = r12.f28588k
            r13.drawPath(r0, r1)
            r13.restore()
            android.graphics.Paint r13 = r12.f28588k
            r13.reset()
            float r13 = r12.f28592o
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x0222
            float r13 = r12.f28593p
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x0225
        L_0x0222:
            r12.invalidate()
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.AwemeSwitchButton.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        if (mode != 1073741824) {
            int paddingLeft = ((int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f)) + getPaddingLeft() + getPaddingRight();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingLeft, size);
            } else {
                size = paddingLeft;
            }
        }
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 != 1073741824) {
            int paddingTop = ((int) (((float) size) * this.f28578a)) + getPaddingTop() + getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= getPaddingLeft() + getPaddingRight() || i2 <= getPaddingTop() + getPaddingBottom()) {
            z = false;
        } else {
            z = true;
        }
        this.f28597t = z;
        if (this.f28597t) {
            float paddingLeft = (float) ((i - getPaddingLeft()) - getPaddingRight());
            float paddingTop = (float) ((i2 - getPaddingTop()) - getPaddingBottom());
            if (this.f28578a * paddingLeft < paddingTop) {
                i5 = getPaddingLeft();
                i7 = i - getPaddingRight();
                int i9 = ((int) (paddingTop - (paddingLeft * this.f28578a))) / 2;
                i6 = getPaddingTop() + i9;
                i8 = (getHeight() - getPaddingBottom()) - i9;
            } else {
                int i10 = ((int) (paddingLeft - (paddingTop / this.f28578a))) / 2;
                i5 = getPaddingLeft() + i10;
                i7 = (getWidth() - getPaddingRight()) - i10;
                i6 = getPaddingTop();
                i8 = getHeight() - getPaddingBottom();
            }
            this.f28576J = (float) ((int) (((float) (i8 - i6)) * 0.07f));
            float f = (float) i5;
            float f2 = ((float) i6) + this.f28576J;
            this.f28599v = (float) i7;
            float f3 = ((float) i8) - this.f28576J;
            float f4 = f3 - f2;
            this.f28600w = (this.f28599v + f) / 2.0f;
            float f5 = (f3 + f2) / 2.0f;
            this.f28601x = f5;
            this.f28570D = f;
            this.f28569C = f4;
            this.f28571E = this.f28569C + f;
            float f6 = this.f28569C / 2.0f;
            this.f28567A = 0.95f * f6;
            this.f28603z = this.f28567A * 0.2f;
            this.f28568B = (f6 - this.f28567A) * 2.0f;
            this.f28572F = this.f28599v - this.f28569C;
            this.f28573G = this.f28572F - this.f28603z;
            this.f28575I = f;
            this.f28574H = this.f28575I + this.f28603z;
            this.f28602y = 1.0f - (this.f28568B / f4);
            this.f28589l.reset();
            RectF rectF = new RectF();
            rectF.top = f2;
            rectF.bottom = f3;
            rectF.left = f;
            rectF.right = f + f4;
            this.f28589l.arcTo(rectF, 90.0f, 180.0f);
            rectF.left = this.f28599v - f4;
            rectF.right = this.f28599v;
            this.f28589l.arcTo(rectF, 270.0f, 180.0f);
            this.f28589l.close();
            this.f28591n.left = this.f28570D;
            this.f28591n.right = this.f28571E;
            this.f28591n.top = f2 + (this.f28568B / 2.0f);
            this.f28591n.bottom = f3 - (this.f28568B / 2.0f);
            int i11 = (this.f28584g >> 16) & NormalGiftView.ALPHA_255;
            int i12 = (this.f28584g >> 8) & NormalGiftView.ALPHA_255;
            int i13 = this.f28584g & NormalGiftView.ALPHA_255;
            RadialGradient radialGradient = new RadialGradient((this.f28571E + this.f28570D) / 2.0f, f5, this.f28567A, Color.argb(200, i11, i12, i13), Color.argb(25, i11, i12, i13), TileMode.CLAMP);
            this.f28594q = radialGradient;
        }
    }
}
