package com.p683ss.android.ugc.aweme.friends.p1792ui;

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

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    List<String> f84953a = new ArrayList();

    /* renamed from: b */
    List<Integer> f84954b = new ArrayList();

    /* renamed from: c */
    private int f84955c = -1;

    /* renamed from: d */
    private C32643a f84956d;

    /* renamed from: e */
    private Context f84957e;

    /* renamed from: f */
    private Resources f84958f;

    /* renamed from: g */
    private int f84959g;

    /* renamed from: h */
    private int f84960h;

    /* renamed from: i */
    private int f84961i;

    /* renamed from: j */
    private int f84962j;

    /* renamed from: k */
    private int f84963k;

    /* renamed from: l */
    private TextView f84964l;

    /* renamed from: m */
    private Paint f84965m;

    /* renamed from: n */
    private Paint f84966n;

    /* renamed from: o */
    private float f84967o;

    /* renamed from: p */
    private int f84968p;

    /* renamed from: q */
    private int f84969q;

    /* renamed from: r */
    private float f84970r;

    /* renamed from: s */
    private Bitmap f84971s;

    /* renamed from: t */
    private Bitmap f84972t;

    /* renamed from: u */
    private Bitmap f84973u;

    /* renamed from: v */
    private Bitmap f84974v;

    /* renamed from: w */
    private Rect f84975w;

    /* renamed from: x */
    private Rect f84976x;

    /* renamed from: y */
    private int f84977y = 0;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView$a */
    public interface C32643a {
        /* renamed from: a */
        void mo66195a(String str, int i);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f84953a) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f84966n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    /* renamed from: a */
    private void m75470a() {
        this.f84958f = this.f84957e.getResources();
        this.f84966n = new Paint(1);
        this.f84966n.setTextSize(C9432q.m18687b(this.f84957e, 11.0f));
        this.f84966n.setTextAlign(Align.CENTER);
        this.f84966n.setColor(this.f84958f.getColor(R.color.a15));
        this.f84965m = new Paint(1);
        this.f84965m.setTextSize(C9432q.m18687b(this.f84957e, 11.0f));
        this.f84965m.setTextAlign(Align.CENTER);
        this.f84965m.setColor(this.f84958f.getColor(R.color.a81));
        this.f84971s = ((BitmapDrawable) this.f84958f.getDrawable(R.drawable.a2s)).getBitmap();
        this.f84972t = ((BitmapDrawable) this.f84958f.getDrawable(R.drawable.a2u)).getBitmap();
        this.f84974v = ((BitmapDrawable) this.f84958f.getDrawable(R.drawable.a6m)).getBitmap();
        this.f84973u = ((BitmapDrawable) this.f84958f.getDrawable(R.drawable.a6l)).getBitmap();
        this.f84970r = C9432q.m18687b(this.f84957e, 2.0f);
        this.f84968p = (int) C9432q.m18687b(this.f84957e, 16.0f);
        this.f84969q = (int) (C9432q.m18687b(this.f84957e, 16.0f) + this.f84970r);
        this.f84975w = new Rect(0, 0, this.f84968p, this.f84969q);
        this.f84976x = new Rect();
    }

    public void setIndexLetterTv(TextView textView) {
        this.f84964l = textView;
    }

    public void setOnLetterTouchListener(C32643a aVar) {
        this.f84956d = aVar;
    }

    public IndexView(Context context) {
        super(context);
        this.f84957e = context;
        m75470a();
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f84953a.size()) {
                break;
            } else if (TextUtils.equals(str, (CharSequence) this.f84953a.get(i))) {
                this.f84955c = i;
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
            if (i2 >= this.f84954b.size()) {
                break;
            }
            i3 += ((Integer) this.f84954b.get(i2)).intValue();
            if (i >= i3) {
                i2++;
            } else if (this.f84955c != i2) {
                this.f84955c = i2;
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
                if (y <= ((float) (this.f84961i + this.f84963k))) {
                    this.f84955c = (int) (y / ((float) this.f84969q));
                    if (this.f84955c >= this.f84977y) {
                        this.f84955c = ((int) ((y - ((float) (this.f84969q * this.f84977y))) / ((float) this.f84963k))) + this.f84977y;
                    }
                    if (this.f84955c != this.f84959g && this.f84956d != null && this.f84955c >= 0 && this.f84955c < this.f84953a.size()) {
                        String str = (String) this.f84953a.get(this.f84955c);
                        this.f84956d.mo66195a(str, this.f84955c);
                        if (str.equals("Recent") || str.equals("Friend")) {
                            this.f84964l.setVisibility(8);
                        } else {
                            this.f84964l.setText(str);
                            this.f84964l.setVisibility(0);
                        }
                    }
                    this.f84964l.setTranslationY((float) ((int) (((((y + ((float) this.f84964l.getTop())) + (((float) this.f84964l.getHeight()) / 2.0f)) - ((float) getTop())) - ((float) this.f84961i)) + (((float) this.f84963k) / 2.0f))));
                    this.f84959g = this.f84955c;
                    break;
                } else {
                    this.f84964l.setVisibility(8);
                    this.f84959g = -1;
                    return true;
                }
            case 1:
                this.f84964l.setVisibility(8);
                this.f84959g = -1;
                break;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f84953a != null && this.f84953a.size() != 0) {
            this.f84962j = this.f84960h;
            this.f84977y = 0;
            for (int i = 0; i < this.f84953a.size(); i++) {
                if (((String) this.f84953a.get(i)).equals("Recent")) {
                    this.f84977y++;
                    this.f84975w.set(0, 0, this.f84968p, this.f84968p);
                    if (this.f84955c == i) {
                        canvas.drawBitmap(this.f84972t, null, this.f84975w, this.f84966n);
                    } else {
                        canvas.drawBitmap(this.f84971s, null, this.f84975w, this.f84966n);
                    }
                } else if (((String) this.f84953a.get(i)).equals("Friend")) {
                    this.f84977y++;
                    this.f84975w.set(0, this.f84969q * i, this.f84968p, (this.f84969q * i) + this.f84968p);
                    if (this.f84955c == i) {
                        canvas.drawBitmap(this.f84974v, null, this.f84975w, this.f84966n);
                    } else {
                        canvas.drawBitmap(this.f84973u, null, this.f84975w, this.f84966n);
                    }
                } else {
                    this.f84963k = (this.f84961i - (this.f84969q * this.f84977y)) / (this.f84953a.size() - this.f84977y);
                    this.f84966n.getTextBounds((String) this.f84953a.get(i), 0, ((String) this.f84953a.get(i)).length(), this.f84976x);
                    float f = ((float) this.f84962j) / 2.0f;
                    float height = ((float) ((this.f84969q * this.f84977y) + (this.f84963k * ((i + 1) - this.f84977y)))) - (((float) this.f84976x.height()) / 2.0f);
                    if (this.f84955c == i) {
                        canvas.drawText((String) this.f84953a.get(i), f, height, this.f84966n);
                    } else {
                        canvas.drawText((String) this.f84953a.get(i), f, height, this.f84965m);
                    }
                }
            }
        }
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84957e = context;
        m75470a();
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
        this.f84960h = size;
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            FontMetrics fontMetrics = this.f84966n.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            this.f84967o = fontMetrics.bottom * 1.2f;
            int size3 = (int) (((float) this.f84953a.size()) * f * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.f84961i = size2;
        setMeasuredDimension(size, size2);
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f84957e = context;
        m75470a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
