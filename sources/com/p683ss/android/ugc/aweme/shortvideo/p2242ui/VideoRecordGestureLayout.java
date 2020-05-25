package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p030v4.view.C1034d;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b.C20384b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20385c.C20387b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47848eg;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout */
public class VideoRecordGestureLayout extends FrameLayout implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener, OnTouchListener {

    /* renamed from: a */
    C44926a f113747a;

    /* renamed from: b */
    C1034d f113748b;

    /* renamed from: c */
    ScaleGestureDetector f113749c;

    /* renamed from: d */
    C20385c f113750d;

    /* renamed from: e */
    C20382b f113751e;

    /* renamed from: f */
    float f113752f;

    /* renamed from: g */
    float f113753g;

    /* renamed from: h */
    float f113754h;

    /* renamed from: i */
    float f113755i;

    /* renamed from: j */
    boolean f113756j;

    /* renamed from: k */
    private float f113757k;

    /* renamed from: l */
    private C20387b f113758l;

    /* renamed from: m */
    private C20384b f113759m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout$a */
    public interface C44926a {
        /* renamed from: a */
        void mo87816a(MotionEvent motionEvent, int[] iArr);

        /* renamed from: a */
        boolean mo87818a();

        /* renamed from: a */
        boolean mo87819a(float f);

        /* renamed from: a */
        boolean mo87820a(MotionEvent motionEvent);

        /* renamed from: a */
        boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: a */
        boolean mo87822a(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: a */
        boolean mo88484a(C20382b bVar);

        /* renamed from: a */
        boolean mo88485a(C20382b bVar, float f, float f2);

        /* renamed from: a */
        boolean mo87823a(C20385c cVar);

        /* renamed from: b */
        void mo87824b(MotionEvent motionEvent, int[] iArr);

        /* renamed from: b */
        void mo88486b(C20382b bVar);

        /* renamed from: b */
        boolean mo87825b();

        /* renamed from: b */
        boolean mo87826b(float f);

        /* renamed from: b */
        boolean mo87827b(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: b */
        boolean mo87829b(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: c */
        void mo87830c(MotionEvent motionEvent, int[] iArr);

        /* renamed from: c */
        boolean mo87831c(float f);

        /* renamed from: c */
        boolean mo87832c(MotionEvent motionEvent);

        /* renamed from: d */
        void mo87833d(MotionEvent motionEvent, int[] iArr);

        /* renamed from: d */
        boolean mo87834d(MotionEvent motionEvent);

        /* renamed from: e */
        void mo87835e(MotionEvent motionEvent, int[] iArr);

        /* renamed from: e */
        boolean mo88487e(MotionEvent motionEvent);

        /* renamed from: f */
        void mo89418f(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout$b */
    public static abstract class C44927b implements C44926a {
        /* renamed from: a */
        public void mo87816a(MotionEvent motionEvent, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo87818a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo87819a(float f) {
            return false;
        }

        /* renamed from: a */
        public boolean mo87820a(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo87821a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo87822a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        /* renamed from: a */
        public boolean mo88484a(C20382b bVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo88485a(C20382b bVar, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo87823a(C20385c cVar) {
            return false;
        }

        /* renamed from: b */
        public void mo87824b(MotionEvent motionEvent, int[] iArr) {
        }

        /* renamed from: b */
        public void mo88486b(C20382b bVar) {
        }

        /* renamed from: b */
        public boolean mo87825b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo87826b(float f) {
            return false;
        }

        /* renamed from: b */
        public boolean mo87827b(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo87828b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* renamed from: b */
        public boolean mo87829b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        /* renamed from: c */
        public void mo87830c(MotionEvent motionEvent, int[] iArr) {
        }

        /* renamed from: c */
        public boolean mo87831c(float f) {
            return false;
        }

        /* renamed from: c */
        public boolean mo87832c(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: d */
        public void mo87833d(MotionEvent motionEvent, int[] iArr) {
        }

        /* renamed from: d */
        public boolean mo87834d(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public void mo87835e(MotionEvent motionEvent, int[] iArr) {
        }

        /* renamed from: e */
        public boolean mo88487e(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo89418f(MotionEvent motionEvent) {
        }
    }

    public C44926a getOnGestureListener() {
        return this.f113747a;
    }

    public float getProtectY() {
        return this.f113757k;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.f113749c;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public void setOnGestureListener(C44926a aVar) {
        this.f113747a = aVar;
    }

    public VideoRecordGestureLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setSloppyExtra(int i) {
        this.f113750d.f55913o = i;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.f113747a == null || !this.f113747a.mo87822a(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.f113747a != null) {
            this.f113747a.mo87819a(this.f113752f);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f113747a == null || !this.f113747a.mo88487e(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setProtectY(float f) {
        this.f113757k = (f * 17.0f) / 20.0f;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        long currentTimeMillis = System.currentTimeMillis() - C47848eg.f120415a;
        StringBuilder sb = new StringBuilder("open camera to view visible cost = ");
        sb.append(currentTimeMillis);
        C45407ay.m98973d(sb.toString());
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f113747a == null) {
            return false;
        }
        boolean b = this.f113747a.mo87829b(scaleGestureDetector);
        if (b) {
            this.f113752f = scaleGestureDetector.getScaleFactor();
        }
        return b;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f113754h = motionEvent.getX();
        this.f113755i = motionEvent.getY();
        if (this.f113747a == null || !this.f113747a.mo87820a(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f113749c.onTouchEvent(motionEvent);
        this.f113750d.mo43209a(motionEvent);
        this.f113751e.mo43209a(motionEvent);
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) == 0) {
            this.f113756j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f113756j = true;
        }
        if (!this.f113756j) {
            this.f113748b.mo3213a(motionEvent);
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.f113747a == null) {
            return false;
        }
        float x = motionEvent.getX() - this.f113754h;
        float y = motionEvent.getY() - this.f113755i;
        if ((x * x) + (y * y) < this.f113753g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        float f = (float) i;
        if (motionEvent.getX() >= f && ((float) measuredWidth) - motionEvent.getX() >= f) {
            float f2 = (float) i2;
            if (motionEvent.getY() >= f2 && ((float) measuredHeight) - motionEvent.getY() >= f2) {
                z2 = false;
            }
        }
        if (z2) {
            return false;
        }
        return this.f113747a.mo87827b(motionEvent);
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f113747a == null) {
            return false;
        }
        this.f113747a.mo89418f(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.f113747a.mo87832c(motionEvent);
                break;
            case 1:
                this.f113747a.mo87834d(motionEvent);
                break;
            case 3:
                this.f113747a.mo87834d(motionEvent);
                break;
            case 5:
                this.f113747a.mo87818a();
                break;
            case 6:
                this.f113747a.mo87825b();
                break;
        }
        return false;
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113752f = 1.0f;
        this.f113757k = 1000.0f;
        this.f113758l = new C20387b() {
            /* renamed from: b */
            public final boolean mo43217b(C20385c cVar) {
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo87823a(cVar);
                }
                return true;
            }

            /* renamed from: a */
            public final boolean mo43216a(C20385c cVar) {
                float b = cVar.mo43215b();
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo87826b(b);
                }
                return true;
            }

            /* renamed from: c */
            public final void mo43218c(C20385c cVar) {
                float b = cVar.mo43215b();
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo87831c(b);
                }
            }
        };
        this.f113759m = new C20384b() {
            /* renamed from: a */
            public final boolean mo43212a(C20382b bVar) {
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo88484a(bVar);
                }
                return true;
            }

            /* renamed from: b */
            public final void mo43214b(C20382b bVar) {
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo88486b(bVar);
                }
            }

            /* renamed from: a */
            public final boolean mo43213a(C20382b bVar, float f, float f2) {
                if (VideoRecordGestureLayout.this.f113747a != null) {
                    VideoRecordGestureLayout.this.f113747a.mo88485a(bVar, f, f2);
                }
                return true;
            }
        };
        this.f113750d = new C20385c(context, this.f113758l);
        this.f113751e = new C20382b(context, this.f113759m);
        this.f113748b = new C1034d(context, this);
        this.f113748b.mo3212a(false);
        this.f113748b.mo3211a((OnDoubleTapListener) this);
        this.f113749c = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f113753g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f113749c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f113749c)).intValue();
            Field declaredField2 = this.f113749c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f113749c, Integer.valueOf(intValue * 6));
        } catch (Throwable unused) {
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f113747a == null || !this.f113747a.mo87828b(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.f113747a == null) {
            return false;
        }
        this.f113747a.mo87821a(motionEvent, motionEvent2, f, f2);
        return true;
    }
}
