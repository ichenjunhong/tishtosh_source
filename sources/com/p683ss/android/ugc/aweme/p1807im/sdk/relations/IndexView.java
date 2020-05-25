package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    private int f89570a = -1;

    /* renamed from: b */
    private C34783a f89571b;

    /* renamed from: c */
    private List<String> f89572c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f89573d = new ArrayList();

    /* renamed from: e */
    private Context f89574e;

    /* renamed from: f */
    private Resources f89575f;

    /* renamed from: g */
    private int f89576g;

    /* renamed from: h */
    private int f89577h;

    /* renamed from: i */
    private int f89578i;

    /* renamed from: j */
    private int f89579j;

    /* renamed from: k */
    private int f89580k;

    /* renamed from: l */
    private TextView f89581l;

    /* renamed from: m */
    private Paint f89582m;

    /* renamed from: n */
    private Paint f89583n;

    /* renamed from: o */
    private int f89584o;

    /* renamed from: p */
    private int f89585p;

    /* renamed from: q */
    private float f89586q;

    /* renamed from: r */
    private Bitmap f89587r;

    /* renamed from: s */
    private Bitmap f89588s;

    /* renamed from: t */
    private Bitmap f89589t;

    /* renamed from: u */
    private Bitmap f89590u;

    /* renamed from: v */
    private Bitmap f89591v;

    /* renamed from: w */
    private Rect f89592w;

    /* renamed from: x */
    private Rect f89593x;

    /* renamed from: y */
    private int f89594y = 0;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.IndexView$a */
    public interface C34783a {
        /* renamed from: a */
        void mo72895a(String str, int i);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f89572c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f89583n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    /* renamed from: a */
    private void m78817a() {
        this.f89575f = this.f89574e.getResources();
        this.f89583n = new Paint(1);
        this.f89583n.setTextSize(C9432q.m18687b(this.f89574e, 11.0f));
        this.f89583n.setTextAlign(Align.CENTER);
        this.f89583n.setColor(this.f89575f.getColor(R.color.ayo));
        this.f89582m = new Paint(1);
        this.f89582m.setTextSize(C9432q.m18687b(this.f89574e, 11.0f));
        this.f89582m.setTextAlign(Align.CENTER);
        this.f89582m.setColor(this.f89575f.getColor(R.color.ayp));
        this.f89591v = ((BitmapDrawable) this.f89575f.getDrawable(R.drawable.azn)).getBitmap();
        this.f89587r = ((BitmapDrawable) this.f89575f.getDrawable(R.drawable.azm)).getBitmap();
        this.f89588s = ((BitmapDrawable) this.f89575f.getDrawable(R.drawable.azl)).getBitmap();
        this.f89589t = ((BitmapDrawable) this.f89575f.getDrawable(R.drawable.azu)).getBitmap();
        this.f89590u = ((BitmapDrawable) this.f89575f.getDrawable(R.drawable.azt)).getBitmap();
        this.f89586q = C9432q.m18687b(this.f89574e, 2.0f);
        this.f89584o = (int) C9432q.m18687b(this.f89574e, 16.0f);
        this.f89585p = (int) (C9432q.m18687b(this.f89574e, 16.0f) + this.f89586q);
        this.f89592w = new Rect(0, 0, this.f89584o, this.f89584o);
        this.f89593x = new Rect();
    }

    public void setIndexLetterTv(TextView textView) {
        this.f89581l = textView;
    }

    public void setOnLetterTouchListener(C34783a aVar) {
        this.f89571b = aVar;
    }

    public void setCurrentIndex(int i) {
        this.f89570a = i;
        invalidate();
    }

    public void setIndexLetters(List<String> list) {
        this.f89572c.clear();
        this.f89572c.addAll(list);
        requestLayout();
    }

    public IndexView(Context context) {
        super(context);
        this.f89574e = context;
        m78817a();
    }

    /* renamed from: a */
    public final int mo72883a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f89573d.size() && i2 < i) {
            i3 += ((Integer) this.f89573d.get(i2)).intValue();
            i2++;
        }
        return i3;
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f89572c.size()) {
                break;
            } else if (TextUtils.equals(str, (CharSequence) this.f89572c.get(i))) {
                this.f89570a = i;
                break;
            } else {
                i++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f89573d.size()) {
                break;
            }
            i3 += ((Integer) this.f89573d.get(i2)).intValue();
            if (i >= i3) {
                i2++;
            } else if (this.f89570a != i2) {
                this.f89570a = i2;
                invalidate();
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                float y = motionEvent.getY();
                if (y <= ((float) (this.f89578i + this.f89580k))) {
                    this.f89570a = (int) (y / ((float) this.f89585p));
                    if (this.f89570a >= this.f89594y) {
                        this.f89570a = ((int) ((y - ((float) (this.f89585p * this.f89594y))) / ((float) this.f89580k))) + this.f89594y;
                    }
                    if (this.f89570a != this.f89576g && this.f89571b != null && this.f89570a >= 0 && this.f89570a < this.f89572c.size()) {
                        String str = (String) this.f89572c.get(this.f89570a);
                        if (str.equals("recent") || str.equals("Friend")) {
                            this.f89581l.setVisibility(8);
                        } else {
                            this.f89581l.setText(str);
                            this.f89581l.setVisibility(0);
                        }
                        this.f89571b.mo72895a(str, this.f89570a);
                    }
                    this.f89581l.setTranslationY((float) ((int) (((((y + ((float) this.f89581l.getTop())) + (((float) this.f89581l.getHeight()) / 2.0f)) - ((float) getTop())) - ((float) this.f89578i)) + (((float) this.f89580k) / 2.0f))));
                    this.f89576g = this.f89570a;
                    break;
                } else {
                    this.f89581l.setVisibility(8);
                    this.f89576g = -1;
                    return true;
                }
                break;
            case 1:
                this.f89581l.setVisibility(8);
                this.f89576g = -1;
                break;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f89572c != null && this.f89572c.size() != 0) {
            this.f89579j = this.f89577h;
            this.f89594y = 0;
            for (int i = 0; i < this.f89572c.size(); i++) {
                if (((String) this.f89572c.get(i)).equals("recent")) {
                    this.f89594y++;
                    this.f89592w.set(0, 0, this.f89584o, this.f89584o);
                    if (this.f89570a == i) {
                        canvas.drawBitmap(this.f89588s, null, this.f89592w, this.f89583n);
                    } else {
                        canvas.drawBitmap(this.f89587r, null, this.f89592w, this.f89583n);
                    }
                } else if (((String) this.f89572c.get(i)).equals("Friend")) {
                    this.f89594y++;
                    this.f89592w.set(0, this.f89585p * i, this.f89584o, (this.f89585p * i) + this.f89584o);
                    if (this.f89570a == i) {
                        canvas.drawBitmap(this.f89590u, null, this.f89592w, this.f89583n);
                    } else {
                        canvas.drawBitmap(this.f89589t, null, this.f89592w, this.f89583n);
                    }
                } else {
                    this.f89580k = (this.f89578i - (this.f89585p * this.f89594y)) / (this.f89572c.size() - this.f89594y);
                    this.f89583n.getTextBounds((String) this.f89572c.get(i), 0, ((String) this.f89572c.get(i)).length(), this.f89593x);
                    float f = ((float) this.f89579j) / 2.0f;
                    float height = ((float) ((this.f89585p * this.f89594y) + (this.f89580k * ((i + 1) - this.f89594y)))) - (((float) this.f89593x.height()) / 2.0f);
                    if (this.f89570a == i) {
                        canvas.drawText((String) this.f89572c.get(i), f, height, this.f89583n);
                    } else {
                        canvas.drawText((String) this.f89572c.get(i), f, height, this.f89582m);
                    }
                }
            }
        }
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f89574e = context;
        m78817a();
    }

    /* renamed from: a */
    public final void mo72884a(List<String> list, List<Integer> list2) {
        this.f89572c.clear();
        this.f89572c.addAll(list);
        this.f89573d.clear();
        this.f89573d.addAll(list2);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.f89577h = size;
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            FontMetrics fontMetrics = this.f89583n.getFontMetrics();
            int size3 = (int) (((float) this.f89572c.size()) * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f89578i = size2;
        setMeasuredDimension(size, size2);
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f89574e = context;
        m78817a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
