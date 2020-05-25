package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.trill.R;

public class LevelSelectView extends View {

    /* renamed from: a */
    final float f18002a;

    /* renamed from: b */
    private C6628a f18003b;

    /* renamed from: c */
    private int f18004c;

    /* renamed from: d */
    private int f18005d;

    /* renamed from: e */
    private int f18006e;

    /* renamed from: f */
    private float f18007f;

    /* renamed from: g */
    private int f18008g;

    /* renamed from: h */
    private boolean f18009h;

    /* renamed from: i */
    private Paint f18010i;

    /* renamed from: j */
    private Paint f18011j;

    /* renamed from: k */
    private Rect f18012k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LevelSelectView$a */
    public interface C6628a {
    }

    public int getCurrentLevel() {
        return this.f18004c;
    }

    public int getMaxLevel() {
        return this.f18005d;
    }

    public int getOrientation() {
        return this.f18006e;
    }

    public float getRadius() {
        return this.f18007f;
    }

    public void setLevelChangedListener(C6628a aVar) {
        this.f18003b = aVar;
    }

    public void setOrientation(int i) {
        this.f18006e = i;
    }

    public LevelSelectView(Context context) {
        this(context, null);
    }

    public void setCurrentLevel(int i) {
        this.f18004c = i;
        invalidate();
    }

    public void setMaxLevel(int i) {
        this.f18005d = i;
        invalidate();
    }

    public void setRadius(float f) {
        if (this.f18007f != f) {
            this.f18007f = f;
            invalidate();
        }
    }

    public void setItemBgColor(int i) {
        if (i != this.f18010i.getColor()) {
            this.f18010i.setColor(i);
            invalidate();
        }
    }

    public void setTextColor(int i) {
        if (i != this.f18011j.getColor()) {
            this.f18011j.setColor(i);
            invalidate();
        }
    }

    public void setTextSize(float f) {
        float applyDimension = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
        if (applyDimension != this.f18011j.getTextSize()) {
            this.f18011j.setTextSize(applyDimension);
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18008g = 0;
            this.f18009h = false;
            int a = m14005a(x, y);
            if (a == -1) {
                return false;
            }
            this.f18008g = a;
            return true;
        }
        if (2 == action) {
            if (this.f18009h) {
                return true;
            }
            int a2 = m14005a(x, y);
            if (a2 == -1 || this.f18008g != a2) {
                this.f18009h = true;
                this.f18008g = 0;
            }
        } else if (1 == action) {
            if (this.f18009h || this.f18008g < 0) {
                return true;
            }
            invalidate();
            this.f18004c = this.f18008g;
            this.f18008g = 0;
            this.f18009h = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18006e == 0) {
            float width = (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 1.0f) / ((float) (this.f18005d + 1));
            float f = (float) ((int) ((((float) (this.f18004c + 1)) - 0.5f) * width));
            float height = ((float) getHeight()) / 2.0f;
            this.f18007f = Math.min(this.f18007f, Math.min(width, (float) getHeight()) * 0.5f);
            canvas.drawCircle(f, height, this.f18007f, this.f18010i);
            int i = 0;
            while (i <= this.f18005d) {
                int i2 = i + 1;
                float f2 = (((float) i2) - 0.5f) * width;
                String valueOf = String.valueOf(i);
                float measureText = this.f18011j.measureText(valueOf);
                this.f18011j.getTextBounds(valueOf, 0, 1, this.f18012k);
                canvas.drawText(valueOf, f2 - (measureText / 2.0f), (((float) this.f18012k.height()) / 2.0f) + height, this.f18011j);
                i = i2;
            }
            return;
        }
        float height2 = (((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())) * 1.0f) / ((float) (this.f18005d + 1));
        float f3 = (float) ((int) ((((float) (this.f18004c + 1)) - 0.5f) * height2));
        float width2 = ((float) getWidth()) / 2.0f;
        this.f18007f = Math.min(this.f18007f, Math.min(height2, (float) getWidth()) * 0.5f);
        canvas.drawCircle(width2, f3, this.f18007f, this.f18010i);
        int i3 = 0;
        while (i3 <= this.f18005d) {
            int i4 = i3 + 1;
            float f4 = (((float) i4) - 0.5f) * height2;
            String valueOf2 = String.valueOf(i3);
            float measureText2 = this.f18011j.measureText(valueOf2);
            this.f18011j.getTextBounds(valueOf2, 0, 1, this.f18012k);
            canvas.drawText(valueOf2, width2 - (measureText2 / 2.0f), f4 + (((float) this.f18012k.height()) / 2.0f), this.f18011j);
            i3 = i4;
        }
    }

    public LevelSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18006e == 0) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + (this.f18007f * 2.0f));
            if (getMeasuredHeight() < paddingTop) {
                setMeasuredDimension(getMeasuredWidth(), paddingTop);
            }
            return;
        }
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (this.f18007f * 2.0f));
        if (getMeasuredHeight() < paddingLeft) {
            setMeasuredDimension(getMeasuredWidth(), paddingLeft);
        }
    }

    /* renamed from: a */
    private int m14005a(float f, float f2) {
        int width = getWidth();
        int height = getHeight();
        if (this.f18006e == 0) {
            float f3 = ((float) height) / 2.0f;
            if (f2 < f3 - this.f18007f || f2 > f3 + this.f18007f) {
                return -1;
            }
            float width2 = (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 1.0f) / ((float) (this.f18005d + 1));
            int ceil = (int) Math.ceil((double) ((f - ((float) getPaddingLeft())) / width2));
            float f4 = (((float) ceil) - 0.5f) * width2;
            if (f < f4 - this.f18007f || f > f4 + this.f18007f) {
                return -1;
            }
            return ceil - 1;
        }
        float f5 = ((float) width) / 2.0f;
        if (f < f5 - this.f18007f || f > f5 + this.f18007f) {
            return -1;
        }
        float height2 = (((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())) * 1.0f) / ((float) (this.f18005d + 1));
        int ceil2 = (int) Math.ceil((double) ((f2 - ((float) getPaddingTop())) / height2));
        float f6 = (((float) ceil2) - 0.5f) * height2;
        if (f2 < f6 - this.f18007f || f2 > f6 + this.f18007f) {
            return -1;
        }
        return ceil2 - 1;
    }

    public LevelSelectView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f18002a = 0.5f;
        this.f18004c = 1;
        this.f18005d = 2;
        this.f18012k = new Rect();
        int i3 = 15;
        int i4 = 13421772;
        int i5 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.j4, R.attr.pv, R.attr.px, R.attr.py, R.attr.pz, R.attr.tx, R.attr.a1e});
            if (obtainStyledAttributes.hasValue(5)) {
                this.f18005d = obtainStyledAttributes.getInt(5, 2);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.f18004c = obtainStyledAttributes.getInt(0, this.f18005d >> 1);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                i4 = obtainStyledAttributes.getColor(1, 13421772);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                i2 = obtainStyledAttributes.getColor(3, 0);
            } else {
                i2 = 0;
            }
            if (obtainStyledAttributes.hasValue(4)) {
                i3 = obtainStyledAttributes.getDimensionPixelSize(4, 15);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                this.f18006e = obtainStyledAttributes.getInt(6, 0);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.f18007f = (float) obtainStyledAttributes.getDimensionPixelSize(2, 0);
            }
            obtainStyledAttributes.recycle();
            i5 = i2;
        }
        this.f18010i = new Paint(1);
        this.f18010i.setColor(i4);
        this.f18011j = new Paint(1);
        this.f18011j.setTextSize((float) i3);
        this.f18011j.setColor(i5);
    }
}
