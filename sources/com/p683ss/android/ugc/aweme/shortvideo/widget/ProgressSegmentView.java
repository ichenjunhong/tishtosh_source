package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ProgressSegmentView */
public class ProgressSegmentView extends View {

    /* renamed from: A */
    private ValueAnimator f115181A;

    /* renamed from: B */
    private ValueAnimator f115182B;

    /* renamed from: C */
    private long f115183C;

    /* renamed from: D */
    private List<TimeSpeedModelExtension> f115184D;

    /* renamed from: a */
    float f115185a;

    /* renamed from: b */
    float f115186b;

    /* renamed from: c */
    private List<TimeSpeedModelExtension> f115187c;

    /* renamed from: d */
    private TimeSpeedModelExtension f115188d;

    /* renamed from: e */
    private long f115189e;

    /* renamed from: f */
    private Paint f115190f;

    /* renamed from: g */
    private Paint f115191g;

    /* renamed from: h */
    private Paint f115192h;

    /* renamed from: i */
    private Paint f115193i;

    /* renamed from: j */
    private Paint f115194j;

    /* renamed from: k */
    private Paint f115195k;

    /* renamed from: l */
    private Paint f115196l;

    /* renamed from: m */
    private Paint f115197m;

    /* renamed from: n */
    private Paint f115198n;

    /* renamed from: o */
    private long f115199o;

    /* renamed from: p */
    private long f115200p;

    /* renamed from: q */
    private long f115201q;

    /* renamed from: r */
    private long f115202r;

    /* renamed from: s */
    private long f115203s;

    /* renamed from: t */
    private long f115204t;

    /* renamed from: u */
    private boolean f115205u;

    /* renamed from: v */
    private String f115206v;

    /* renamed from: w */
    private boolean f115207w;

    /* renamed from: x */
    private int f115208x;

    /* renamed from: y */
    private List<VERecordSegmentData> f115209y;

    /* renamed from: z */
    private int f115210z;

    private long getLongVideoAnchorPosition() {
        return m99238a(this.f115202r);
    }

    /* renamed from: a */
    public final void mo91886a() {
        this.f115207w = true;
        this.f115182B.start();
        mo91890a(false);
    }

    /* renamed from: b */
    private boolean m99241b() {
        if (this.f115203s <= 30000 || this.f115189e >= this.f115202r) {
            return false;
        }
        return true;
    }

    public void setAnchorDuration(long j) {
        this.f115202r = j;
    }

    public void setNeedDrawAnchor(boolean z) {
        this.f115205u = z;
    }

    public void setMaxDuration(long j) {
        this.f115203s = j;
        requestLayout();
    }

    public void setAnchorString(String str) {
        this.f115206v = str;
        this.f115204t = (long) this.f115198n.measureText(this.f115206v);
    }

    /* renamed from: a */
    private long m99238a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        double d2 = d * 1.0d;
        double d3 = (double) this.f115199o;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) this.f115203s;
        Double.isNaN(d5);
        return (long) (d4 / d5);
    }

    /* renamed from: a */
    private void m99239a(Canvas canvas) {
        if (m99241b()) {
            long longVideoAnchorPosition = getLongVideoAnchorPosition();
            long j = longVideoAnchorPosition - 2;
            canvas.drawRect((float) j, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.f115200p, this.f115193i);
            canvas.drawText(this.f115206v, (float) (j - (this.f115204t / 2)), (getY() + ((float) (this.f115200p * 2))) - ((float) C43303dy.m94972c(getContext())), this.f115198n);
        }
    }

    /* renamed from: a */
    public final void mo91887a(RetakeVideoContext retakeVideoContext) {
        if (retakeVideoContext.f107015d != null) {
            this.f115209y = retakeVideoContext.f107015d.f126770b;
            this.f115210z = retakeVideoContext.f107014c;
            this.f115208x = 2;
            if (this.f115184D != null) {
                this.f115184D = null;
            }
            this.f115183C = 0;
        }
    }

    /* renamed from: a */
    public final void mo91890a(boolean z) {
        if (this.f115181A != null) {
            if (z) {
                this.f115181A.start();
                return;
            }
            this.f115181A.end();
            this.f115185a = 1.0f;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        long j;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        long j2 = 0;
        float f5 = 0.0f;
        if (this.f115208x == 2) {
            List<VERecordSegmentData> list = this.f115209y;
            long j3 = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                j3 += ((VERecordSegmentData) list.get(i2)).f126776c;
            }
            float f6 = ((float) this.f115199o) / ((float) j3);
            int i3 = 0;
            float f7 = 0.0f;
            while (i3 < this.f115209y.size()) {
                int i4 = (int) (((float) ((VERecordSegmentData) this.f115209y.get(i3)).f126776c) * f6);
                if (i3 == this.f115210z) {
                    this.f115190f.setStrokeCap(Cap.BUTT);
                    float f8 = f7 + ((float) i4);
                    Canvas canvas3 = canvas;
                    float f9 = f7;
                    canvas3.drawLine(f9, (float) this.f115201q, f8, (float) this.f115201q, this.f115190f);
                    if (this.f115184D != null && this.f115183C >= j2) {
                        float f10 = f6 * 1000.0f;
                        long j4 = this.f115183C;
                        if (j4 > j2) {
                            float f11 = (((float) j4) * f10) + f7;
                            float min = Math.min(f11, f8);
                            if (this.f115210z == 0) {
                                canvas.save();
                                canvas2.clipRect(f5, f5, (float) this.f115201q, (float) this.f115200p);
                                canvas2.drawCircle((float) this.f115201q, (float) this.f115201q, (float) this.f115201q, this.f115191g);
                                canvas.restore();
                                f3 = min;
                                f4 = ((float) this.f115201q) + f7;
                            } else {
                                if (f11 < f8 || this.f115210z != this.f115209y.size() - 1) {
                                    f3 = min;
                                } else {
                                    canvas.save();
                                    canvas2.clipRect(f8 - ((float) this.f115201q), f5, f8, (float) this.f115200p);
                                    canvas2.drawCircle(f8 - ((float) this.f115201q), (float) this.f115201q, (float) this.f115201q, this.f115191g);
                                    canvas.restore();
                                    f3 = f8 - ((float) this.f115201q);
                                }
                                f4 = f7;
                            }
                            canvas.drawRect(f4, 0.0f, f3, (float) this.f115200p, this.f115191g);
                        }
                        if (this.f115184D != null) {
                            float f12 = f7;
                            int i5 = 0;
                            while (i5 < this.f115184D.size()) {
                                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) this.f115184D.get(i5);
                                float calculateRealTime = f12 + (((float) ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))) * f10);
                                if (this.f115210z != this.f115209y.size() - 1 || calculateRealTime < f8) {
                                    float min2 = Math.min(calculateRealTime, f8);
                                    f2 = calculateRealTime;
                                    float f13 = (float) this.f115200p;
                                    i = i5;
                                    canvas.drawRect(min2 - 4.0f, 0.0f, min2, f13, this.f115193i);
                                } else {
                                    f2 = calculateRealTime;
                                    i = i5;
                                }
                                i5 = i + 1;
                                f12 = f2;
                            }
                        }
                    }
                    if (this.f115207w) {
                        this.f115197m.setAlpha((int) (this.f115186b * 255.0f));
                        canvas.drawRect(f7, 0.0f, f8, (float) this.f115200p, this.f115197m);
                    }
                    f = f6;
                    f7 = f8;
                } else {
                    if (i3 == 0) {
                        canvas.save();
                        canvas2.clipRect(f5, f5, (float) this.f115201q, (float) this.f115200p);
                        canvas2.drawCircle((float) this.f115201q, (float) this.f115201q, (float) this.f115201q, this.f115192h);
                        canvas.restore();
                        f = f6;
                        canvas.drawRect((float) this.f115201q, 0.0f, (float) Math.min((long) i4, this.f115199o - this.f115201q), (float) this.f115200p, this.f115192h);
                    } else {
                        f = f6;
                        if (i3 == this.f115209y.size() - 1) {
                            canvas.save();
                            canvas2.clipRect((float) (this.f115199o - this.f115201q), 0.0f, (float) this.f115199o, (float) this.f115200p);
                            canvas2.drawCircle((float) (this.f115199o - this.f115201q), (float) this.f115201q, (float) this.f115201q, this.f115192h);
                            canvas.restore();
                            canvas.drawRect(f7, 0.0f, (float) (this.f115199o - this.f115201q), (float) this.f115200p, this.f115192h);
                        } else {
                            canvas.drawRect(f7, 0.0f, f7 + ((float) i4), (float) this.f115200p, this.f115192h);
                        }
                    }
                    float f14 = f7 + ((float) i4);
                    if (i3 == this.f115210z - 1) {
                        this.f115196l.setAlpha((int) (this.f115185a * 255.0f));
                        canvas.drawRect(f14 - 4.0f, 0.0f, f14, (float) this.f115200p, this.f115196l);
                    } else if (i3 != this.f115209y.size() - 1) {
                        canvas.drawRect(f14 - 4.0f, 0.0f, f14, (float) this.f115200p, this.f115193i);
                    }
                    f7 = f14;
                }
                i3++;
                f6 = f;
                j2 = 0;
                f5 = 0.0f;
            }
            return;
        }
        long a = m99238a(this.f115189e);
        if (this.f115189e <= this.f115203s) {
            canvas.drawLine((float) a, (float) this.f115201q, (float) this.f115199o, (float) this.f115201q, this.f115190f);
        }
        if (this.f115188d == null) {
            if (a > 0) {
                canvas.save();
                canvas2.clipRect(0.0f, 0.0f, (float) this.f115201q, (float) this.f115200p);
                canvas2.drawCircle((float) this.f115201q, (float) this.f115201q, (float) this.f115201q, this.f115191g);
                canvas.restore();
                canvas.drawRect((float) this.f115201q, 0.0f, (float) Math.min(a, this.f115199o - this.f115201q), (float) this.f115200p, this.f115191g);
            }
            if (this.f115189e > this.f115203s) {
                canvas.save();
                canvas2.clipRect((float) (this.f115199o - this.f115201q), 0.0f, (float) this.f115199o, (float) this.f115200p);
                canvas2.drawCircle((float) (this.f115199o - this.f115201q), (float) this.f115201q, (float) this.f115201q, this.f115191g);
                canvas.restore();
            }
        } else {
            long a2 = m99238a((long) this.f115188d.getDuration());
            canvas.save();
            canvas2.clipRect(0.0f, 0.0f, (float) this.f115201q, (float) this.f115200p);
            canvas2.drawCircle((float) this.f115201q, (float) this.f115201q, (float) this.f115201q, this.f115194j);
            canvas.restore();
            float f15 = (float) a2;
            canvas.drawRect((float) this.f115201q, 0.0f, f15, (float) this.f115200p, this.f115194j);
            if (a > a2) {
                canvas.drawRect(f15, 0.0f, (float) Math.min(a, this.f115199o - this.f115201q), (float) this.f115200p, this.f115195k);
            }
            if (this.f115189e > this.f115203s) {
                canvas.save();
                canvas2.clipRect((float) (this.f115199o - this.f115201q), 0.0f, (float) this.f115199o, (float) this.f115200p);
                canvas2.drawCircle((float) (this.f115199o - this.f115201q), (float) this.f115201q, (float) this.f115201q, this.f115195k);
                canvas.restore();
            }
        }
        if (this.f115188d != null) {
            long duration = ((long) this.f115188d.getDuration()) + 0;
            int a3 = (int) m99238a(duration);
            if (((long) a3) < this.f115199o) {
                canvas.drawRect((float) (a3 - 4), 0.0f, (float) a3, (float) this.f115200p, this.f115193i);
            }
            j = duration;
        } else {
            j = 0;
        }
        if (this.f115187c != null) {
            int i6 = 0;
            while (i6 < this.f115187c.size()) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) this.f115187c.get(i6);
                long calculateRealTime2 = j + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed()));
                int a4 = (int) m99238a(calculateRealTime2);
                if (((long) a4) < this.f115199o) {
                    canvas.drawRect((float) (a4 - 4), 0.0f, (float) a4, (float) this.f115200p, this.f115193i);
                }
                i6++;
                j = calculateRealTime2;
            }
            m99239a(canvas);
            return;
        }
        if (this.f115205u) {
            m99239a(canvas);
        }
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo91891b(List<TimeSpeedModelExtension> list, long j) {
        this.f115184D = list;
        this.f115183C = j;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f115199o = (long) getMeasuredWidth();
        this.f115200p = (long) (getMeasuredHeight() / 3);
        this.f115201q = this.f115200p >> 1;
    }

    /* renamed from: a */
    public final void mo91888a(List<TimeSpeedModelExtension> list, long j) {
        this.f115187c = list;
        if (this.f115188d != null) {
            this.f115189e = j + ((long) this.f115188d.getDuration());
        } else {
            this.f115189e = j;
        }
        this.f115208x = 1;
        postInvalidate();
    }

    /* renamed from: b */
    public static void m99240b(List<TimeSpeedModelExtension> list, long j, TimeSpeedModelExtension timeSpeedModelExtension) throws IllegalAccessException {
        throw new IllegalAccessException("NOT Implement, please tell to CHENWEI");
    }

    /* renamed from: a */
    public final void mo91889a(List<TimeSpeedModelExtension> list, long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.f115188d = timeSpeedModelExtension;
        mo91888a(list, j);
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115202r = 15000;
        this.f115203s = 15000;
        this.f115206v = "15s";
        this.f115208x = 1;
        this.f115190f = new Paint(1);
        this.f115190f.setStyle(Style.STROKE);
        this.f115190f.setStrokeCap(Cap.ROUND);
        this.f115190f.setStrokeWidth(C9432q.m18687b(context, 6.0f));
        this.f115190f.setColor(getResources().getColor(R.color.zr));
        this.f115192h = new Paint(1);
        this.f115192h.setColor(getResources().getColor(R.color.a13));
        this.f115192h.setAlpha(86);
        this.f115191g = new Paint(1);
        this.f115191g.setColor(getResources().getColor(R.color.a13));
        this.f115194j = new Paint(1);
        this.f115194j.setColor(getResources().getColor(R.color.a3c));
        this.f115195k = new Paint(1);
        this.f115195k.setColor(getResources().getColor(R.color.a4w));
        this.f115193i = new Paint(1);
        this.f115193i.setStyle(Style.FILL);
        this.f115193i.setColor(getResources().getColor(R.color.w2));
        this.f115196l = new Paint(1);
        this.f115196l.setStyle(Style.FILL);
        this.f115196l.setColor(getResources().getColor(R.color.w2));
        this.f115197m = new Paint(1);
        this.f115197m.setStyle(Style.FILL);
        this.f115197m.setColor(getResources().getColor(R.color.w2));
        this.f115198n = new Paint(1);
        this.f115198n.setStyle(Style.FILL);
        this.f115198n.setColor(getResources().getColor(R.color.w2));
        this.f115198n.setTextSize(C9432q.m18669a(getContext(), 12.0f));
        this.f115198n.setShadowLayer(4.0f, 0.0f, 2.0f, getResources().getColor(R.color.a42));
        this.f115204t = (long) this.f115198n.measureText(this.f115206v);
        this.f115181A = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(350);
        this.f115181A.setRepeatCount(-1);
        this.f115181A.setRepeatMode(2);
        this.f115181A.addUpdateListener(new C45607g(this));
        this.f115182B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f, 0.0f}).setDuration(700);
        this.f115182B.addUpdateListener(new C45608h(this));
    }
}
