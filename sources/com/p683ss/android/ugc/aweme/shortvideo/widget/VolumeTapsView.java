package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43187b;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView */
public class VolumeTapsView extends View implements OnGestureListener {

    /* renamed from: a */
    private int f115305a;

    /* renamed from: b */
    private int f115306b;

    /* renamed from: c */
    private final RectF f115307c;

    /* renamed from: d */
    private final RectF f115308d;

    /* renamed from: e */
    private final Paint f115309e;

    /* renamed from: f */
    private Bitmap f115310f;

    /* renamed from: g */
    private Bitmap f115311g;

    /* renamed from: h */
    private Bitmap f115312h;

    /* renamed from: i */
    private C43187b f115313i;

    /* renamed from: j */
    private C43187b f115314j;

    /* renamed from: k */
    private C43187b f115315k;

    /* renamed from: l */
    private Bitmap f115316l;

    /* renamed from: m */
    private GestureDetector f115317m;

    /* renamed from: n */
    private int f115318n;

    /* renamed from: o */
    private int f115319o;

    /* renamed from: p */
    private int f115320p;

    /* renamed from: q */
    private int f115321q;

    /* renamed from: r */
    private C45591a f115322r;

    /* renamed from: s */
    private long f115323s;

    /* renamed from: t */
    private int f115324t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView$a */
    public interface C45591a {
        /* renamed from: a */
        void mo86746a(int i);

        /* renamed from: a */
        void mo86747a(int i, int i2);
    }

    public int getStopPosition() {
        return this.f115321q;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public void setOnProgressChangeListener(C45591a aVar) {
        this.f115322r = aVar;
    }

    public VolumeTapsView(Context context) {
        this(context, null);
    }

    public void setPastPosition(int i) {
        this.f115318n = i;
        invalidate();
    }

    public void setProgress(int i) {
        this.f115320p = i;
        invalidate();
    }

    public void setStopPosition(int i) {
        this.f115321q = i;
        invalidate();
    }

    public void setTotalTime(long j) {
        this.f115323s = j;
        setWavForm(this.f115310f);
    }

    /* renamed from: a */
    private float m99305a(int i) {
        return ((((float) (i - this.f115305a)) * 1.0f) * ((float) getMeasuredWidth())) / ((float) (this.f115306b - this.f115305a));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (C43193b.m94756a(this.f115315k.f109208f)) {
            m99308a(canvas, false);
        } else {
            m99308a(canvas, true);
        }
    }

    /* renamed from: a */
    private int m99306a(float f) {
        return ((int) (((f * 1.0f) * ((float) (this.f115306b - this.f115305a))) / ((float) getMeasuredWidth()))) + this.f115305a;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f115321q = m99306a(Math.min(Math.max(m99305a(this.f115318n), motionEvent.getX()), (float) getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        if (this.f115322r != null) {
            this.f115322r.mo86746a(this.f115321q);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f115317m.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        this.f115321q = m99306a(Math.min(Math.max(m99305a(this.f115318n), motionEvent.getX()), (float) getMeasuredWidth()));
        this.f115319o = Math.max(this.f115318n, this.f115321q - ((int) TimeUnit.SECONDS.toMillis(3)));
        this.f115320p = this.f115319o;
        invalidate();
        if (this.f115322r != null) {
            this.f115322r.mo86747a(this.f115319o, this.f115321q);
        }
        return onTouchEvent | true;
    }

    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        C52711k.m112240b(context, "context");
        this.f115310f = m99307a(bitmap, context.getResources().getColor(R.color.fo));
        C52711k.m112240b(context, "context");
        this.f115311g = m99307a(bitmap, C0726c.m2098c(context, R.color.mf));
        C52711k.m112240b(context, "context");
        this.f115312h = m99307a(bitmap, context.getResources().getColor(R.color.fp));
        invalidate();
    }

    /* renamed from: a */
    private void m99309a(C43203d dVar) {
        if (dVar != null && C43191e.m94744a(dVar.getMusicWavePointArray())) {
            int b = (int) C9432q.m18687b(getContext(), 4.0f);
            C43191e.m94745b(dVar);
            this.f115313i.f109206d = b;
            this.f115314j.f109206d = b;
            this.f115315k.f109206d = b;
            this.f115313i.f109203a = C43191e.m94739a().f109221d;
            this.f115314j.f109203a = C43191e.m94739a().f109221d;
            this.f115315k.f109203a = C43191e.m94739a().f109221d;
            this.f115313i.mo87793a(dVar.getMusicWavePointArray());
            this.f115314j.mo87793a(dVar.getMusicWavePointArray());
            this.f115315k.mo87793a(dVar.getMusicWavePointArray());
        }
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        this.f115313i.mo87790a(size, size2);
        this.f115314j.mo87790a(size, size2);
        this.f115315k.mo87790a(size, size2);
    }

    /* renamed from: a */
    private static Bitmap m99307a(Bitmap bitmap, int i) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private void m99308a(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.f115307c;
        float a = m99305a(this.f115318n);
        m99305a(this.f115319o);
        float a2 = m99305a(this.f115320p);
        float a3 = m99305a(this.f115321q);
        rectF.left = 0.0f;
        rectF.right = a;
        rectF.top = 0.0f;
        float f = (float) measuredHeight;
        rectF.bottom = f;
        canvas.drawRect(rectF, this.f115309e);
        float f2 = (float) measuredWidth;
        float f3 = ((((float) this.f115305a) * -1.0f) / ((float) (this.f115306b - this.f115305a))) * f2;
        float f4 = (((float) this.f115323s) * 1.0f) / ((float) (this.f115306b - this.f115305a));
        this.f115308d.top = 0.1f * f;
        this.f115308d.right = f4 * f2;
        this.f115308d.bottom = 0.9f * f;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = a2;
        }
        rectF.right = f2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f115312h, null, this.f115308d, null);
        } else {
            this.f115315k.mo87792a(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = a;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f115310f, null, this.f115308d, null);
        } else {
            this.f115313i.mo87792a(canvas);
        }
        canvas.restore();
        rectF.left = a;
        rectF.right = a2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f115311g, null, this.f115308d, null);
        } else {
            this.f115314j.mo87792a(canvas);
        }
        canvas.restore();
        canvas.drawBitmap(this.f115316l, a3 - ((float) (this.f115316l.getWidth() / 2)), (float) ((measuredHeight / 2) - (this.f115316l.getHeight() / 2)), null);
    }

    /* renamed from: a */
    public final void mo91964a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("start: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= i) {
            int i3 = i - this.f115305a;
            this.f115318n += i3;
            this.f115321q += i3;
            this.f115319o += i3;
            this.f115320p += i3;
            this.f115305a = i;
            this.f115306b = i2;
            invalidate();
        } else {
            StringBuilder sb2 = new StringBuilder("start: ");
            sb2.append(i);
            sb2.append("; end: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo91965a(C43203d dVar, int i) {
        if (dVar == null || !C43191e.m94744a(dVar.getMusicWavePointArray())) {
            Context context = getContext();
            C43203d dVar2 = new C43203d();
            int b = C43191e.m94739a().mo87801b(context);
            float[] fArr = new float[b];
            if (i > 0) {
                for (int i2 = 0; i2 < b; i2++) {
                    fArr[i2] = (float) Math.random();
                }
            }
            dVar2.setMusicWavePointArray(fArr);
            m99309a(dVar2);
            return;
        }
        int i3 = this.f115305a;
        int i4 = this.f115306b - this.f115305a;
        if (dVar != null) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C52711k.m112234a();
            }
            float f = (float) i;
            int length = (int) (((((float) musicWavePointArray.length) * 1.0f) * ((float) i3)) / f);
            float[] musicWavePointArray2 = dVar.getMusicWavePointArray();
            if (musicWavePointArray2 == null) {
                C52711k.m112234a();
            }
            int length2 = (int) (((((float) musicWavePointArray2.length) * 1.0f) * ((float) i4)) / f);
            if (length2 > 0) {
                float[] fArr2 = new float[length2];
                float[] musicWavePointArray3 = dVar.getMusicWavePointArray();
                if (musicWavePointArray3 == null) {
                    C52711k.m112234a();
                }
                int length3 = musicWavePointArray3.length;
                int i5 = length2 + length;
                int i6 = length;
                boolean z = false;
                while (i6 < i5 && i6 < length3) {
                    fArr2[i6 - length] = dVar.getMusicWavePointArray()[i6];
                    i6++;
                    z = true;
                }
                if (C43193b.m94756a(fArr2) && z) {
                    dVar.setMusicWavePointArray(fArr2);
                }
            }
        }
        int b2 = C43191e.m94739a().mo87801b(getContext());
        if (b2 < dVar.getMusicWavePointArray().length) {
            m99309a(C43191e.m94740a(VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, b2)));
        }
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115307c = new RectF();
        this.f115308d = new RectF();
        this.f115309e = new Paint();
        this.f115317m = new GestureDetector(context, this);
        this.f115316l = BitmapFactory.decodeResource(getResources(), R.drawable.abz);
        setWavForm(BitmapFactory.decodeResource(getResources(), R.drawable.jc));
        this.f115314j = new C43187b(context);
        this.f115313i = new C43187b(context);
        this.f115315k = new C43187b(context);
        this.f115314j.mo87789a(Color.parseColor("#FF20E5DC"));
        this.f115315k.mo87789a(-1);
        this.f115313i.mo87789a(C46788b.m101634b());
        this.f115324t = C46788b.m101628a();
        this.f115309e.setColor(this.f115324t);
        setBackground(C42430at.m93196a(0, Color.parseColor("#22FFFFFF"), 0, (int) C9432q.m18687b(context, 2.0f)));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f115321q = m99306a(Math.min(Math.max(m99305a(this.f115318n), motionEvent2.getX()), (float) getMeasuredWidth()));
        invalidate();
        if (this.f115322r != null) {
            this.f115322r.mo86746a(this.f115321q);
        }
        return true;
    }
}
