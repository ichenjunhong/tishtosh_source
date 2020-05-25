package com.p683ss.android.ugc.aweme.poi.preview.view.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;
import android.widget.Scroller;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView */
public class PhotoView extends AppCompatImageView {

    /* renamed from: A */
    public RectF f100020A;

    /* renamed from: B */
    public Runnable f100021B;

    /* renamed from: C */
    public OnLongClickListener f100022C;

    /* renamed from: D */
    public Runnable f100023D = new Runnable() {
        public final void run() {
            if (PhotoView.this.f100048f != null) {
                PhotoView.this.f100048f.onClick(PhotoView.this);
            }
        }
    };

    /* renamed from: E */
    private int f100024E;

    /* renamed from: F */
    private int f100025F;

    /* renamed from: G */
    private int f100026G;

    /* renamed from: H */
    private int f100027H = 500;

    /* renamed from: I */
    private Matrix f100028I = new Matrix();

    /* renamed from: J */
    private Matrix f100029J = new Matrix();

    /* renamed from: K */
    private GestureDetector f100030K;

    /* renamed from: L */
    private ScaleGestureDetector f100031L;

    /* renamed from: M */
    private ScaleType f100032M;

    /* renamed from: N */
    private boolean f100033N;

    /* renamed from: O */
    private boolean f100034O;

    /* renamed from: P */
    private boolean f100035P = false;

    /* renamed from: Q */
    private boolean f100036Q;

    /* renamed from: R */
    private boolean f100037R;

    /* renamed from: S */
    private PointF f100038S = new PointF();

    /* renamed from: T */
    private C39214a f100039T;

    /* renamed from: U */
    private long f100040U;

    /* renamed from: V */
    private OnScaleGestureListener f100041V = new OnScaleGestureListener() {
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            PhotoView.this.f100056n *= scaleFactor;
            if (PhotoView.this.f100056n > 1.0f) {
                PhotoView.this.f100051i = true;
            } else {
                PhotoView.this.f100051i = false;
            }
            PhotoView.this.f100046d.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            PhotoView.this.mo79887c();
            return true;
        }
    };

    /* renamed from: W */
    private OnGestureListener f100042W = new SimpleOnGestureListener() {
        public final void onLongPress(MotionEvent motionEvent) {
            if (PhotoView.this.f100022C != null) {
                PhotoView.this.f100022C.onLongClick(PhotoView.this);
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            PhotoView.this.postDelayed(PhotoView.this.f100023D, 250);
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            PhotoView.this.f100050h = false;
            PhotoView.this.f100049g = false;
            PhotoView.this.f100052j = false;
            PhotoView.this.removeCallbacks(PhotoView.this.f100023D);
            return false;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            float f2;
            PhotoView.this.f100068z.mo79924b();
            float width = PhotoView.this.f100063u.left + (PhotoView.this.f100063u.width() / 2.0f);
            float height = PhotoView.this.f100063u.top + (PhotoView.this.f100063u.height() / 2.0f);
            PhotoView.this.f100066x.set(width, height);
            PhotoView.this.f100067y.set(width, height);
            PhotoView.this.f100057o = 0;
            PhotoView.this.f100058p = 0;
            if (PhotoView.this.f100051i) {
                f = PhotoView.this.f100056n;
                f2 = 1.0f;
            } else {
                float f3 = PhotoView.this.f100056n;
                float f4 = PhotoView.this.f100044b;
                PhotoView.this.f100066x.set(motionEvent.getX(), motionEvent.getY());
                f = f3;
                f2 = f4;
            }
            PhotoView.this.f100047e.reset();
            PhotoView.this.f100047e.postTranslate(-PhotoView.this.f100062t.left, -PhotoView.this.f100062t.top);
            PhotoView.this.f100047e.postTranslate(PhotoView.this.f100067y.x, PhotoView.this.f100067y.y);
            PhotoView.this.f100047e.postTranslate(-PhotoView.this.f100059q, -PhotoView.this.f100060r);
            PhotoView.this.f100047e.postRotate(PhotoView.this.f100055m, PhotoView.this.f100067y.x, PhotoView.this.f100067y.y);
            PhotoView.this.f100047e.postScale(f2, f2, PhotoView.this.f100066x.x, PhotoView.this.f100066x.y);
            PhotoView.this.f100047e.postTranslate((float) PhotoView.this.f100057o, (float) PhotoView.this.f100058p);
            PhotoView.this.f100047e.mapRect(PhotoView.this.f100064v, PhotoView.this.f100062t);
            PhotoView.this.mo79882a(PhotoView.this.f100064v);
            PhotoView.this.f100051i = !PhotoView.this.f100051i;
            PhotoView.this.f100068z.mo79920a(f, f2);
            PhotoView.this.f100068z.mo79919a();
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3;
            float f4;
            int i;
            float f5;
            int i2;
            int i3;
            int i4;
            float f6;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            if (PhotoView.this.f100049g) {
                return false;
            }
            if ((!PhotoView.this.f100053k && !PhotoView.this.f100054l) || PhotoView.this.f100068z.f100078a) {
                return false;
            }
            if (((float) Math.round(PhotoView.this.f100063u.left)) >= PhotoView.this.f100061s.left || ((float) Math.round(PhotoView.this.f100063u.right)) <= PhotoView.this.f100061s.right) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if (((float) Math.round(PhotoView.this.f100063u.top)) >= PhotoView.this.f100061s.top || ((float) Math.round(PhotoView.this.f100063u.bottom)) <= PhotoView.this.f100061s.bottom) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            if (PhotoView.this.f100052j || PhotoView.this.f100055m % 90.0f != 0.0f) {
                float f7 = (float) (((int) (PhotoView.this.f100055m / 90.0f)) * 90);
                float f8 = PhotoView.this.f100055m % 90.0f;
                if (f8 > 45.0f) {
                    f7 += 90.0f;
                } else if (f8 < -45.0f) {
                    f7 -= 90.0f;
                }
                PhotoView.this.f100068z.mo79922a((int) PhotoView.this.f100055m, (int) f7);
                PhotoView.this.f100055m = f7;
            }
            PhotoView.this.mo79882a(PhotoView.this.f100063u);
            C39205f fVar = PhotoView.this.f100068z;
            if (f3 < 0.0f) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            fVar.f100085h = i;
            if (f3 > 0.0f) {
                f5 = Math.abs(PhotoView.this.f100063u.left);
            } else {
                f5 = PhotoView.this.f100063u.right - PhotoView.this.f100061s.right;
            }
            int i13 = (int) f5;
            if (f3 < 0.0f) {
                i13 = Integer.MAX_VALUE - i13;
            }
            if (f3 < 0.0f) {
                i2 = i13;
            } else {
                i2 = 0;
            }
            if (f3 < 0.0f) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = i13;
            }
            if (f3 < 0.0f) {
                i13 = Integer.MAX_VALUE - i2;
            }
            if (f4 < 0.0f) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = 0;
            }
            fVar.f100086i = i4;
            if (f4 > 0.0f) {
                f6 = Math.abs(PhotoView.this.f100063u.top);
            } else {
                f6 = PhotoView.this.f100063u.bottom - PhotoView.this.f100061s.bottom;
            }
            int i14 = (int) f6;
            if (f4 < 0.0f) {
                i14 = Integer.MAX_VALUE - i14;
            }
            if (f4 < 0.0f) {
                i5 = i14;
            } else {
                i5 = 0;
            }
            if (f4 < 0.0f) {
                i6 = Integer.MAX_VALUE;
            } else {
                i6 = i14;
            }
            if (f4 < 0.0f) {
                i14 = Integer.MAX_VALUE - i5;
            }
            if (f3 == 0.0f) {
                i8 = 0;
                i7 = 0;
            } else {
                i8 = i2;
                i7 = i3;
            }
            if (f4 == 0.0f) {
                i10 = 0;
                i9 = 0;
            } else {
                i10 = i5;
                i9 = i6;
            }
            OverScroller overScroller = fVar.f100080c;
            int i15 = fVar.f100085h;
            int i16 = fVar.f100086i;
            int i17 = (int) f3;
            int i18 = (int) f4;
            if (Math.abs(i13) < PhotoView.this.f100045c * 2) {
                i11 = 0;
            } else {
                i11 = PhotoView.this.f100045c;
            }
            if (Math.abs(i14) < PhotoView.this.f100045c * 2) {
                i12 = 0;
            } else {
                i12 = PhotoView.this.f100045c;
            }
            overScroller.fling(i15, i16, i17, i18, i8, i7, i10, i9, i11, i12);
            PhotoView.this.f100068z.mo79919a();
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PhotoView.this.f100068z.f100078a) {
                PhotoView.this.f100068z.mo79924b();
            }
            if (PhotoView.this.mo79883a(f)) {
                if (f < 0.0f && PhotoView.this.f100063u.left - f > PhotoView.this.f100061s.left) {
                    f = PhotoView.this.f100063u.left;
                }
                if (f > 0.0f && PhotoView.this.f100063u.right - f < PhotoView.this.f100061s.right) {
                    f = PhotoView.this.f100063u.right - PhotoView.this.f100061s.right;
                }
                PhotoView.this.f100046d.postTranslate(-f, 0.0f);
                PhotoView.this.f100057o = (int) (((float) PhotoView.this.f100057o) - f);
            } else if (PhotoView.this.f100053k || PhotoView.this.f100049g || PhotoView.this.f100050h) {
                PhotoView.this.mo79890d();
                if (!PhotoView.this.f100049g) {
                    if (f < 0.0f && PhotoView.this.f100063u.left - f > PhotoView.this.f100065w.left) {
                        f = PhotoView.this.mo79880a(PhotoView.this.f100063u.left - PhotoView.this.f100065w.left, f);
                    }
                    if (f > 0.0f && PhotoView.this.f100063u.right - f < PhotoView.this.f100065w.right) {
                        f = PhotoView.this.mo79880a(PhotoView.this.f100063u.right - PhotoView.this.f100065w.right, f);
                    }
                }
                PhotoView.this.f100057o = (int) (((float) PhotoView.this.f100057o) - f);
                PhotoView.this.f100046d.postTranslate(-f, 0.0f);
                PhotoView.this.f100050h = true;
            }
            if (PhotoView.this.mo79886b(f2)) {
                if (f2 < 0.0f && PhotoView.this.f100063u.top - f2 > PhotoView.this.f100061s.top) {
                    f2 = PhotoView.this.f100063u.top;
                }
                if (f2 > 0.0f && PhotoView.this.f100063u.bottom - f2 < PhotoView.this.f100061s.bottom) {
                    f2 = PhotoView.this.f100063u.bottom - PhotoView.this.f100061s.bottom;
                }
                PhotoView.this.f100046d.postTranslate(0.0f, -f2);
                PhotoView.this.f100058p = (int) (((float) PhotoView.this.f100058p) - f2);
            } else if (PhotoView.this.f100054l || PhotoView.this.f100050h || PhotoView.this.f100049g) {
                PhotoView.this.mo79890d();
                if (!PhotoView.this.f100049g) {
                    if (f2 < 0.0f && PhotoView.this.f100063u.top - f2 > PhotoView.this.f100065w.top) {
                        f2 = PhotoView.this.mo79884b(PhotoView.this.f100063u.top - PhotoView.this.f100065w.top, f2);
                    }
                    if (f2 > 0.0f && PhotoView.this.f100063u.bottom - f2 < PhotoView.this.f100065w.bottom) {
                        f2 = PhotoView.this.mo79884b(PhotoView.this.f100063u.bottom - PhotoView.this.f100065w.bottom, f2);
                    }
                }
                PhotoView.this.f100046d.postTranslate(0.0f, -f2);
                PhotoView.this.f100058p = (int) (((float) PhotoView.this.f100058p) - f2);
                PhotoView.this.f100050h = true;
            }
            PhotoView.this.mo79887c();
            return true;
        }
    };

    /* renamed from: a */
    public int f100043a;

    /* renamed from: b */
    public float f100044b;

    /* renamed from: c */
    public int f100045c;

    /* renamed from: d */
    public Matrix f100046d = new Matrix();

    /* renamed from: e */
    public Matrix f100047e = new Matrix();

    /* renamed from: f */
    public OnClickListener f100048f;

    /* renamed from: g */
    public boolean f100049g;

    /* renamed from: h */
    public boolean f100050h;

    /* renamed from: i */
    public boolean f100051i;

    /* renamed from: j */
    public boolean f100052j;

    /* renamed from: k */
    public boolean f100053k;

    /* renamed from: l */
    public boolean f100054l;

    /* renamed from: m */
    public float f100055m;

    /* renamed from: n */
    public float f100056n = 1.0f;

    /* renamed from: o */
    public int f100057o;

    /* renamed from: p */
    public int f100058p;

    /* renamed from: q */
    public float f100059q;

    /* renamed from: r */
    public float f100060r;

    /* renamed from: s */
    public RectF f100061s = new RectF();

    /* renamed from: t */
    public RectF f100062t = new RectF();

    /* renamed from: u */
    public RectF f100063u = new RectF();

    /* renamed from: v */
    public RectF f100064v = new RectF();

    /* renamed from: w */
    public RectF f100065w = new RectF();

    /* renamed from: x */
    public PointF f100066x = new PointF();

    /* renamed from: y */
    public PointF f100067y = new PointF();

    /* renamed from: z */
    public C39205f f100068z = new C39205f();

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$4 */
    static /* synthetic */ class C391994 {

        /* renamed from: a */
        static final /* synthetic */ int[] f100072a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f100072a = r0
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f100072a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.view.image.PhotoView.C391994.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$a */
    public interface C39200a {
        /* renamed from: a */
        float mo79917a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$b */
    public class C39201b implements C39200a {
        /* renamed from: a */
        public final float mo79917a() {
            return PhotoView.this.f100063u.bottom;
        }

        public C39201b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$c */
    class C39202c implements Interpolator {

        /* renamed from: a */
        public Interpolator f100074a;

        private C39202c() {
            this.f100074a = new DecelerateInterpolator();
        }

        public final float getInterpolation(float f) {
            if (this.f100074a != null) {
                return this.f100074a.getInterpolation(f);
            }
            return f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$d */
    public class C39203d implements C39200a {
        /* renamed from: a */
        public final float mo79917a() {
            return (PhotoView.this.f100063u.top + PhotoView.this.f100063u.bottom) / 2.0f;
        }

        public C39203d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$e */
    public class C39204e implements C39200a {
        /* renamed from: a */
        public final float mo79917a() {
            return PhotoView.this.f100063u.top;
        }

        public C39204e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f */
    class C39205f implements Runnable {

        /* renamed from: a */
        boolean f100078a;

        /* renamed from: b */
        OverScroller f100079b;

        /* renamed from: c */
        OverScroller f100080c;

        /* renamed from: d */
        Scroller f100081d;

        /* renamed from: e */
        Scroller f100082e;

        /* renamed from: f */
        Scroller f100083f;

        /* renamed from: g */
        C39200a f100084g;

        /* renamed from: h */
        int f100085h;

        /* renamed from: i */
        int f100086i;

        /* renamed from: j */
        int f100087j;

        /* renamed from: k */
        int f100088k;

        /* renamed from: l */
        RectF f100089l = new RectF();

        /* renamed from: m */
        C39202c f100090m = new C39202c();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo79919a() {
            this.f100078a = true;
            m87145d();
        }

        /* renamed from: d */
        private void m87145d() {
            if (this.f100078a) {
                PhotoView.this.post(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo79924b() {
            PhotoView.this.removeCallbacks(this);
            this.f100079b.abortAnimation();
            this.f100081d.abortAnimation();
            this.f100080c.abortAnimation();
            this.f100083f.abortAnimation();
            this.f100078a = false;
        }

        /* renamed from: c */
        private void m87144c() {
            PhotoView.this.f100046d.reset();
            PhotoView.this.f100046d.postTranslate(-PhotoView.this.f100062t.left, -PhotoView.this.f100062t.top);
            PhotoView.this.f100046d.postTranslate(PhotoView.this.f100067y.x, PhotoView.this.f100067y.y);
            PhotoView.this.f100046d.postTranslate(-PhotoView.this.f100059q, -PhotoView.this.f100060r);
            PhotoView.this.f100046d.postRotate(PhotoView.this.f100055m, PhotoView.this.f100067y.x, PhotoView.this.f100067y.y);
            PhotoView.this.f100046d.postScale(PhotoView.this.f100056n, PhotoView.this.f100056n, PhotoView.this.f100066x.x, PhotoView.this.f100066x.y);
            PhotoView.this.f100046d.postTranslate((float) PhotoView.this.f100057o, (float) PhotoView.this.f100058p);
            PhotoView.this.mo79887c();
        }

        public final void run() {
            boolean z;
            boolean z2 = true;
            boolean z3 = false;
            if (this.f100081d.computeScrollOffset()) {
                PhotoView.this.f100056n = ((float) this.f100081d.getCurrX()) / 10000.0f;
                z = false;
            } else {
                z = true;
            }
            if (this.f100079b.computeScrollOffset()) {
                int currX = this.f100079b.getCurrX() - this.f100087j;
                int currY = this.f100079b.getCurrY() - this.f100088k;
                PhotoView.this.f100057o += currX;
                PhotoView.this.f100058p += currY;
                this.f100087j = this.f100079b.getCurrX();
                this.f100088k = this.f100079b.getCurrY();
                z = false;
            }
            if (this.f100080c.computeScrollOffset()) {
                int currX2 = this.f100080c.getCurrX() - this.f100085h;
                int currY2 = this.f100080c.getCurrY() - this.f100086i;
                this.f100085h = this.f100080c.getCurrX();
                this.f100086i = this.f100080c.getCurrY();
                PhotoView.this.f100057o += currX2;
                PhotoView.this.f100058p += currY2;
                z = false;
            }
            if (this.f100083f.computeScrollOffset()) {
                PhotoView.this.f100055m = (float) this.f100083f.getCurrX();
                z = false;
            }
            if (this.f100082e.computeScrollOffset() || PhotoView.this.f100020A != null) {
                float currX3 = ((float) this.f100082e.getCurrX()) / 10000.0f;
                float currY3 = ((float) this.f100082e.getCurrY()) / 10000.0f;
                PhotoView.this.f100047e.setScale(currX3, currY3, (PhotoView.this.f100063u.left + PhotoView.this.f100063u.right) / 2.0f, this.f100084g.mo79917a());
                PhotoView.this.f100047e.mapRect(this.f100089l, PhotoView.this.f100063u);
                if (currX3 == 1.0f) {
                    this.f100089l.left = PhotoView.this.f100061s.left;
                    this.f100089l.right = PhotoView.this.f100061s.right;
                }
                if (currY3 == 1.0f) {
                    this.f100089l.top = PhotoView.this.f100061s.top;
                    this.f100089l.bottom = PhotoView.this.f100061s.bottom;
                }
                PhotoView.this.f100020A = this.f100089l;
            }
            if (!z) {
                m87144c();
                m87145d();
                return;
            }
            this.f100078a = false;
            if (PhotoView.this.f100053k) {
                if (PhotoView.this.f100063u.left > 0.0f) {
                    PhotoView.this.f100057o = (int) (((float) PhotoView.this.f100057o) - PhotoView.this.f100063u.left);
                } else if (PhotoView.this.f100063u.right < PhotoView.this.f100061s.width()) {
                    PhotoView.this.f100057o -= (int) (PhotoView.this.f100061s.width() - PhotoView.this.f100063u.right);
                }
                z3 = true;
            }
            if (!PhotoView.this.f100054l) {
                z2 = z3;
            } else if (PhotoView.this.f100063u.top > 0.0f) {
                PhotoView.this.f100058p = (int) (((float) PhotoView.this.f100058p) - PhotoView.this.f100063u.top);
            } else if (PhotoView.this.f100063u.bottom < PhotoView.this.f100061s.height()) {
                PhotoView.this.f100058p -= (int) (PhotoView.this.f100061s.height() - PhotoView.this.f100063u.bottom);
            }
            if (z2) {
                m87144c();
            }
            PhotoView.this.invalidate();
            if (PhotoView.this.f100021B != null) {
                PhotoView.this.f100021B.run();
                PhotoView.this.f100021B = null;
            }
        }

        C39205f() {
            Context context = PhotoView.this.getContext();
            this.f100079b = new OverScroller(context, this.f100090m);
            this.f100081d = new Scroller(context, this.f100090m);
            this.f100080c = new OverScroller(context, this.f100090m);
            this.f100082e = new Scroller(context, this.f100090m);
            this.f100083f = new Scroller(context, this.f100090m);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo79922a(int i, int i2) {
            this.f100083f.startScroll(i, 0, i2 - i, 0, PhotoView.this.f100043a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo79920a(float f, float f2) {
            this.f100081d.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, PhotoView.this.f100043a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo79923a(int i, int i2, int i3, int i4) {
            this.f100087j = 0;
            this.f100088k = 0;
            this.f100079b.startScroll(0, 0, i3, i4, PhotoView.this.f100043a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo79921a(float f, float f2, float f3, float f4, int i, C39200a aVar) {
            this.f100082e.startScroll((int) (f * 10000.0f), (int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), i);
            this.f100084g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo79881a() {
        this.f100035P = true;
    }

    /* renamed from: b */
    public final void mo79885b() {
        this.f100035P = false;
    }

    public int getAnimaDuring() {
        return this.f100043a;
    }

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public float getMaxScale() {
        return this.f100044b;
    }

    /* renamed from: j */
    private void m87126j() {
        m87125i();
        float f = -this.f100063u.top;
        this.f100058p = (int) (((float) this.f100058p) + f);
        this.f100046d.postTranslate(0.0f, f);
        mo79887c();
        m87129m();
    }

    /* renamed from: k */
    private void m87127k() {
        m87125i();
        float f = this.f100061s.bottom - this.f100063u.bottom;
        this.f100058p = (int) (((float) this.f100058p) + f);
        this.f100046d.postTranslate(0.0f, f);
        mo79887c();
        m87129m();
    }

    /* renamed from: n */
    private void m87130n() {
        this.f100046d.reset();
        mo79887c();
        this.f100056n = 1.0f;
        this.f100057o = 0;
        this.f100058p = 0;
    }

    /* renamed from: i */
    private void m87125i() {
        if (this.f100063u.width() < this.f100061s.width()) {
            this.f100056n = this.f100061s.width() / this.f100063u.width();
            this.f100046d.postScale(this.f100056n, this.f100056n, this.f100038S.x, this.f100038S.y);
            mo79887c();
            m87129m();
        }
    }

    /* renamed from: l */
    private void m87128l() {
        this.f100046d.postScale(this.f100061s.width() / this.f100063u.width(), this.f100061s.height() / this.f100063u.height(), this.f100038S.x, this.f100038S.y);
        mo79887c();
        m87129m();
    }

    /* renamed from: f */
    private void mo79930f() {
        if (this.f100033N && this.f100034O) {
            Drawable drawable = getDrawable();
            int a = m87115a(drawable);
            int b = m87118b(drawable);
            float f = (float) a;
            if (f > this.f100061s.width() || ((float) b) > this.f100061s.height()) {
                float width = f / this.f100063u.width();
                float height = ((float) b) / this.f100063u.height();
                if (width > height) {
                    height = width;
                }
                this.f100056n = height;
                this.f100046d.postScale(this.f100056n, this.f100056n, this.f100038S.x, this.f100038S.y);
                mo79887c();
                m87129m();
            }
        }
    }

    /* renamed from: g */
    private void mo79931g() {
        if (this.f100063u.width() < this.f100061s.width() || this.f100063u.height() < this.f100061s.height()) {
            float width = this.f100061s.width() / this.f100063u.width();
            float height = this.f100061s.height() / this.f100063u.height();
            if (width <= height) {
                width = height;
            }
            this.f100056n = width;
            this.f100046d.postScale(this.f100056n, this.f100056n, this.f100038S.x, this.f100038S.y);
            mo79887c();
            m87129m();
        }
    }

    /* renamed from: h */
    private void m87124h() {
        if (this.f100063u.width() > this.f100061s.width() || this.f100063u.height() > this.f100061s.height()) {
            float width = this.f100061s.width() / this.f100063u.width();
            float height = this.f100061s.height() / this.f100063u.height();
            if (width >= height) {
                width = height;
            }
            this.f100056n = width;
            this.f100046d.postScale(this.f100056n, this.f100056n, this.f100038S.x, this.f100038S.y);
            mo79887c();
            m87129m();
        }
    }

    /* renamed from: m */
    private void m87129m() {
        Drawable drawable = getDrawable();
        this.f100062t.set(0.0f, 0.0f, (float) m87115a(drawable), (float) m87118b(drawable));
        this.f100028I.set(this.f100029J);
        this.f100028I.mapRect(this.f100062t);
        this.f100059q = this.f100062t.width() / 2.0f;
        this.f100060r = this.f100062t.height() / 2.0f;
        this.f100056n = 1.0f;
        this.f100057o = 0;
        this.f100058p = 0;
        this.f100046d.reset();
    }

    /* renamed from: c */
    public final void mo79887c() {
        boolean z;
        this.f100029J.set(this.f100028I);
        this.f100029J.postConcat(this.f100046d);
        setImageMatrix(this.f100029J);
        this.f100046d.mapRect(this.f100063u, this.f100062t);
        boolean z2 = false;
        if (this.f100063u.width() > this.f100061s.width()) {
            z = true;
        } else {
            z = false;
        }
        this.f100053k = z;
        if (this.f100063u.height() > this.f100061s.height()) {
            z2 = true;
        }
        this.f100054l = z2;
    }

    /* renamed from: d */
    public final void mo79890d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!this.f100050h) {
            RectF rectF = this.f100061s;
            RectF rectF2 = this.f100063u;
            RectF rectF3 = this.f100065w;
            if (rectF.left > rectF2.left) {
                f = rectF.left;
            } else {
                f = rectF2.left;
            }
            if (rectF.right < rectF2.right) {
                f2 = rectF.right;
            } else {
                f2 = rectF2.right;
            }
            if (f > f2) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            if (rectF.top > rectF2.top) {
                f3 = rectF.top;
            } else {
                f3 = rectF2.top;
            }
            if (rectF.bottom < rectF2.bottom) {
                f4 = rectF.bottom;
            } else {
                f4 = rectF2.bottom;
            }
            if (f3 > f4) {
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            rectF3.set(f, f3, f2, f4);
        }
    }

    public C39214a getInfo() {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        m87116a((View) this, iArr);
        rectF.set(((float) iArr[0]) + this.f100063u.left, ((float) iArr[1]) + this.f100063u.top, ((float) iArr[0]) + this.f100063u.right, ((float) iArr[1]) + this.f100063u.bottom);
        C39214a aVar = new C39214a(rectF, this.f100063u, this.f100061s, this.f100062t, this.f100038S, this.f100056n, this.f100055m, this.f100032M);
        return aVar;
    }

    /* renamed from: e */
    private void mo79929e() {
        float f;
        if (this.f100033N && this.f100034O) {
            this.f100028I.reset();
            this.f100046d.reset();
            this.f100051i = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int a = m87115a(drawable);
            int b = m87118b(drawable);
            float f2 = (float) a;
            float f3 = (float) b;
            this.f100062t.set(0.0f, 0.0f, f2, f3);
            int i = (width - a) / 2;
            int i2 = (height - b) / 2;
            float f4 = 1.0f;
            if (a > width) {
                f = ((float) width) / f2;
            } else {
                f = 1.0f;
            }
            if (b > height) {
                f4 = ((float) height) / f3;
            }
            if (f >= f4) {
                f = f4;
            }
            this.f100028I.reset();
            this.f100028I.postTranslate((float) i, (float) i2);
            this.f100028I.postScale(f, f, this.f100038S.x, this.f100038S.y);
            this.f100028I.mapRect(this.f100062t);
            this.f100059q = this.f100062t.width() / 2.0f;
            this.f100060r = this.f100062t.height() / 2.0f;
            this.f100066x.set(this.f100038S);
            this.f100067y.set(this.f100066x);
            mo79887c();
            switch (C391994.f100072a[this.f100032M.ordinal()]) {
                case 1:
                    mo79930f();
                    break;
                case 2:
                    mo79931g();
                    break;
                case 3:
                    m87124h();
                    break;
                case 4:
                    m87125i();
                    break;
                case 5:
                    m87126j();
                    break;
                case 6:
                    m87127k();
                    break;
                case 7:
                    m87128l();
                    break;
            }
            this.f100036Q = true;
            if (this.f100039T != null && System.currentTimeMillis() - this.f100040U < ((long) this.f100027H)) {
                m87117a(this.f100039T);
            }
            this.f100039T = null;
            if (b > a * 3) {
                this.f100046d.postTranslate(0.0f, -this.f100063u.top);
                this.f100058p = (int) (((float) this.f100058p) - this.f100063u.top);
                mo79887c();
            }
        }
    }

    public void setAnimaDuring(int i) {
        this.f100043a = i;
    }

    public void setMaxAnimFromWaiteTime(int i) {
        this.f100027H = i;
    }

    public void setMaxScale(float f) {
        this.f100044b = f;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f100022C = onLongClickListener;
    }

    public void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
        this.f100037R = z;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f100068z.f100090m.f100074a = interpolator;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f100048f = onClickListener;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f100049g) {
            return true;
        }
        return mo79883a((float) i);
    }

    public boolean canScrollVertically(int i) {
        if (this.f100049g) {
            return true;
        }
        return mo79886b((float) i);
    }

    public void draw(Canvas canvas) {
        if (this.f100020A != null) {
            canvas.clipRect(this.f100020A);
            this.f100020A = null;
        }
        super.draw(canvas);
    }

    public void setImageResource(int i) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setScaleType(ScaleType scaleType) {
        ScaleType scaleType2 = this.f100032M;
        this.f100032M = scaleType;
        if (scaleType2 != scaleType) {
            mo79929e();
        }
    }

    /* renamed from: a */
    private static int m87115a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        if (intrinsicWidth <= 0) {
            return drawable.getBounds().width();
        }
        return intrinsicWidth;
    }

    /* renamed from: b */
    private static int m87118b(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        if (intrinsicHeight <= 0) {
            return drawable.getBounds().height();
        }
        return intrinsicHeight;
    }

    /* renamed from: b */
    private boolean m87119b(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.top)) - ((this.f100061s.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m87120c(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.left)) - ((this.f100061s.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        boolean z = false;
        if (drawable == null) {
            this.f100033N = false;
            return;
        }
        if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            z = true;
        }
        if (z) {
            if (!this.f100033N) {
                this.f100033N = true;
            }
            mo79929e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79882a(android.graphics.RectF r6) {
        /*
            r5 = this;
            float r0 = r6.width()
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.width()
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            boolean r0 = r5.m87120c(r6)
            if (r0 != 0) goto L_0x004f
            android.graphics.RectF r0 = r5.f100061s
            float r0 = r0.width()
            float r1 = r6.width()
            float r0 = r0 - r1
            float r0 = r0 / r2
            float r1 = r6.left
            float r0 = r0 - r1
            int r0 = (int) r0
            int r0 = -r0
            goto L_0x0050
        L_0x0029:
            float r0 = r6.left
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r0 = r6.left
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.left
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0050
        L_0x003c:
            float r0 = r6.right
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            float r0 = r6.right
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.right
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            float r1 = r6.height()
            android.graphics.RectF r4 = r5.f100061s
            float r4 = r4.height()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0076
            boolean r1 = r5.m87119b(r6)
            if (r1 != 0) goto L_0x009b
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.height()
            float r3 = r6.height()
            float r1 = r1 - r3
            float r1 = r1 / r2
            float r6 = r6.top
            float r1 = r1 - r6
            int r6 = (int) r1
            int r3 = -r6
            goto L_0x009b
        L_0x0076:
            float r1 = r6.top
            android.graphics.RectF r2 = r5.f100061s
            float r2 = r2.top
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0089
            float r6 = r6.top
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.top
            float r6 = r6 - r1
            int r3 = (int) r6
            goto L_0x009b
        L_0x0089:
            float r1 = r6.bottom
            android.graphics.RectF r2 = r5.f100061s
            float r2 = r2.bottom
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x009b
            float r6 = r6.bottom
            android.graphics.RectF r1 = r5.f100061s
            float r1 = r1.bottom
            float r6 = r6 - r1
            int r3 = (int) r6
        L_0x009b:
            if (r0 != 0) goto L_0x009f
            if (r3 == 0) goto L_0x00bb
        L_0x009f:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f100068z
            android.widget.OverScroller r6 = r6.f100080c
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L_0x00b0
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f100068z
            android.widget.OverScroller r6 = r6.f100080c
            r6.abortAnimation()
        L_0x00b0:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f100068z
            int r1 = r5.f100057o
            int r2 = r5.f100058p
            int r0 = -r0
            int r3 = -r3
            r6.mo79923a(r1, r2, r0, r3)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.view.image.PhotoView.mo79882a(android.graphics.RectF):void");
    }

    /* renamed from: b */
    public final boolean mo79886b(float f) {
        if (this.f100063u.height() <= this.f100061s.height()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f100063u.top)) - f >= this.f100061s.top) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f100063u.bottom)) - f > this.f100061s.bottom) {
            return true;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f100035P) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (motionEvent.getPointerCount() >= 2) {
            this.f100049g = true;
        }
        this.f100030K.onTouchEvent(motionEvent);
        this.f100031L.onTouchEvent(motionEvent);
        if ((actionMasked == 1 || actionMasked == 3) && !this.f100068z.f100078a) {
            if (this.f100052j || this.f100055m % 90.0f != 0.0f) {
                float f = (float) (((int) (this.f100055m / 90.0f)) * 90);
                float f2 = this.f100055m % 90.0f;
                if (f2 > 45.0f) {
                    f += 90.0f;
                } else if (f2 < -45.0f) {
                    f -= 90.0f;
                }
                this.f100068z.mo79922a((int) this.f100055m, (int) f);
                this.f100055m = f;
            }
            float f3 = this.f100056n;
            if (this.f100056n < 1.0f) {
                this.f100068z.mo79920a(this.f100056n, 1.0f);
                f3 = 1.0f;
            } else if (this.f100056n > this.f100044b) {
                f3 = this.f100044b;
                this.f100068z.mo79920a(this.f100056n, this.f100044b);
            }
            float width = this.f100063u.left + (this.f100063u.width() / 2.0f);
            float height = this.f100063u.top + (this.f100063u.height() / 2.0f);
            this.f100066x.set(width, height);
            this.f100067y.set(width, height);
            this.f100057o = 0;
            this.f100058p = 0;
            this.f100047e.reset();
            this.f100047e.postTranslate(-this.f100062t.left, -this.f100062t.top);
            this.f100047e.postTranslate(width - this.f100059q, height - this.f100060r);
            this.f100047e.postScale(f3, f3, width, height);
            this.f100047e.postRotate(this.f100055m, width, height);
            this.f100047e.mapRect(this.f100064v, this.f100062t);
            mo79882a(this.f100064v);
            this.f100068z.mo79919a();
        }
        return true;
    }

    /* renamed from: a */
    private void m87117a(C39214a aVar) {
        C39200a aVar2;
        if (this.f100036Q) {
            m87130n();
            C39214a info = getInfo();
            float width = aVar.f100125b.width() / info.f100125b.width();
            float height = aVar.f100125b.height() / info.f100125b.height();
            if (width < height) {
                height = width;
            }
            float width2 = aVar.f100124a.left + (aVar.f100124a.width() / 2.0f);
            float height2 = aVar.f100124a.top + (aVar.f100124a.height() / 2.0f);
            this.f100046d.reset();
            this.f100046d.postTranslate(-this.f100062t.left, -this.f100062t.top);
            this.f100046d.postTranslate(width2 - (this.f100062t.width() / 2.0f), height2 - (this.f100062t.height() / 2.0f));
            this.f100046d.postScale(height, height, width2, height2);
            this.f100046d.postRotate(aVar.f100130g, width2, height2);
            mo79887c();
            this.f100066x.set(width2, height2);
            this.f100067y.set(width2, height2);
            this.f100068z.mo79923a(0, 0, (int) (this.f100038S.x - width2), (int) (this.f100038S.y - height2));
            this.f100068z.mo79920a(height, 1.0f);
            this.f100068z.mo79922a((int) aVar.f100130g, 0);
            if (aVar.f100126c.width() < aVar.f100125b.width() || aVar.f100126c.height() < aVar.f100125b.height()) {
                float width3 = aVar.f100126c.width() / aVar.f100125b.width();
                float height3 = aVar.f100126c.height() / aVar.f100125b.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                if (aVar.f100131h == ScaleType.FIT_START) {
                    aVar2 = new C39204e();
                } else if (aVar.f100131h == ScaleType.FIT_END) {
                    aVar2 = new C39201b();
                } else {
                    aVar2 = new C39203d();
                }
                this.f100068z.mo79921a(width3, height3, 1.0f - width3, 1.0f - height3, this.f100043a / 3, aVar2);
                this.f100047e.setScale(width3, height3, (this.f100063u.left + this.f100063u.right) / 2.0f, aVar2.mo79917a());
                this.f100047e.mapRect(this.f100068z.f100089l, this.f100063u);
                this.f100020A = this.f100068z.f100089l;
            }
            this.f100068z.mo79919a();
            return;
        }
        this.f100039T = aVar;
        this.f100040U = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final boolean mo79883a(float f) {
        if (this.f100063u.width() <= this.f100061s.width()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f100063u.left)) - f >= this.f100061s.left) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f100063u.right)) - f > this.f100061s.right) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo79880a(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f100026G)) / ((float) this.f100026G));
    }

    /* renamed from: a */
    private static void m87116a(View view, int[] iArr) {
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (((float) iArr[0]) + 0.5f);
        iArr[1] = (int) (((float) iArr[1]) + 0.5f);
    }

    /* renamed from: b */
    public final float mo79884b(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f100026G)) / ((float) this.f100026G));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f100033N) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        int a = m87115a(drawable);
        int b = m87118b(drawable);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -2);
        }
        if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || a <= size) : mode == 0) {
            size = a;
        }
        if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || b <= size2) : mode2 == 0) {
            size2 = b;
        }
        if (this.f100037R) {
            float f = (float) a;
            float f2 = (float) b;
            float f3 = (float) size;
            float f4 = (float) size2;
            if (f / f2 != f3 / f4) {
                float f5 = f4 / f2;
                float f6 = f3 / f;
                if (f5 < f6) {
                    f6 = f5;
                }
                if (layoutParams.width != -1) {
                    size = (int) (f * f6);
                }
                if (layoutParams.height != -1) {
                    size2 = (int) (f2 * f6);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ScaleType.MATRIX);
        if (this.f100032M == null) {
            this.f100032M = ScaleType.CENTER_INSIDE;
        }
        this.f100030K = new GestureDetector(getContext(), this.f100042W);
        this.f100031L = new ScaleGestureDetector(getContext(), this.f100041V);
        float f = getResources().getDisplayMetrics().density;
        int i2 = (int) (30.0f * f);
        this.f100025F = i2;
        this.f100045c = i2;
        this.f100026G = (int) (f * 140.0f);
        this.f100024E = 35;
        this.f100043a = 340;
        this.f100044b = 2.5f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f100061s.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f100038S.set((float) (i / 2), (float) (i2 / 2));
        if (!this.f100034O) {
            this.f100034O = true;
            mo79929e();
        }
    }
}
