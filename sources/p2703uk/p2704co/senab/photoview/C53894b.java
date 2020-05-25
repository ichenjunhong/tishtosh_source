package p2703uk.p2704co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.FloatMath;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.C2240a;
import java.lang.ref.WeakReference;
import p2703uk.p2704co.senab.photoview.p2705a.C53888a;
import p2703uk.p2704co.senab.photoview.p2705a.C53889b;
import p2703uk.p2704co.senab.photoview.p2705a.C53890c;
import p2703uk.p2704co.senab.photoview.p2705a.C53892d;
import p2703uk.p2704co.senab.photoview.p2705a.C53893e;
import p2703uk.p2704co.senab.photoview.p2706b.C53901a;
import p2703uk.p2704co.senab.photoview.p2706b.C53902b;
import p2703uk.p2704co.senab.photoview.p2706b.C53903c;
import p2703uk.p2704co.senab.photoview.p2706b.C53904d;

/* renamed from: uk.co.senab.photoview.b */
public final class C53894b implements OnDoubleTapListener, OnTouchListener, OnGlobalLayoutListener, C53893e {

    /* renamed from: B */
    private static /* synthetic */ int[] f133533B;

    /* renamed from: a */
    public static final boolean f133534a = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: b */
    static final Interpolator f133535b = new AccelerateDecelerateInterpolator();

    /* renamed from: A */
    private boolean f133536A;

    /* renamed from: c */
    float f133537c = 1.0f;

    /* renamed from: d */
    float f133538d = 1.75f;

    /* renamed from: e */
    float f133539e = 3.0f;

    /* renamed from: f */
    boolean f133540f = true;

    /* renamed from: g */
    public final Matrix f133541g = new Matrix();

    /* renamed from: h */
    C53898c f133542h;

    /* renamed from: i */
    C53899d f133543i;

    /* renamed from: j */
    C53900e f133544j;

    /* renamed from: k */
    public OnLongClickListener f133545k;

    /* renamed from: l */
    ScaleType f133546l = ScaleType.FIT_CENTER;

    /* renamed from: m */
    float f133547m = 0.0f;

    /* renamed from: n */
    private WeakReference<ImageView> f133548n;

    /* renamed from: o */
    private GestureDetector f133549o;

    /* renamed from: p */
    private C53892d f133550p;

    /* renamed from: q */
    private final Matrix f133551q = new Matrix();

    /* renamed from: r */
    private final Matrix f133552r = new Matrix();

    /* renamed from: s */
    private final RectF f133553s = new RectF();

    /* renamed from: t */
    private final float[] f133554t = new float[9];

    /* renamed from: u */
    private int f133555u;

    /* renamed from: v */
    private int f133556v;

    /* renamed from: w */
    private int f133557w;

    /* renamed from: x */
    private int f133558x;

    /* renamed from: y */
    private C53897b f133559y;

    /* renamed from: z */
    private int f133560z = 2;

    /* renamed from: uk.co.senab.photoview.b$a */
    class C53896a implements Runnable {

        /* renamed from: b */
        private final float f133563b;

        /* renamed from: c */
        private final float f133564c;

        /* renamed from: d */
        private final long f133565d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f133566e;

        /* renamed from: f */
        private final float f133567f;

        public final void run() {
            ImageView c = C53894b.this.mo113991c();
            if (c != null) {
                float interpolation = C53894b.f133535b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f133565d)) * 1.0f) / 200.0f));
                float d = (this.f133566e + ((this.f133567f - this.f133566e) * interpolation)) / C53894b.this.mo113992d();
                C53894b.this.f133541g.postScale(d, d, this.f133563b, this.f133564c);
                C53894b.this.mo113995g();
                if (interpolation < 1.0f) {
                    C53887a.m114553a(c, this);
                }
            }
        }

        public C53896a(float f, float f2, float f3, float f4) {
            this.f133563b = f3;
            this.f133564c = f4;
            this.f133566e = f;
            this.f133567f = f2;
        }
    }

    /* renamed from: uk.co.senab.photoview.b$b */
    class C53897b implements Runnable {

        /* renamed from: a */
        final C53904d f133568a;

        /* renamed from: b */
        int f133569b;

        /* renamed from: c */
        int f133570c;

        /* renamed from: a */
        public final void mo114003a() {
            this.f133568a.mo114006a(true);
        }

        public final void run() {
            if (!this.f133568a.mo114008b()) {
                ImageView c = C53894b.this.mo113991c();
                if (c != null && this.f133568a.mo114007a()) {
                    int c2 = this.f133568a.mo114009c();
                    int d = this.f133568a.mo114010d();
                    if (C53894b.f133534a) {
                        StringBuilder sb = new StringBuilder("fling run(). CurrentX:");
                        sb.append(this.f133569b);
                        sb.append(" CurrentY:");
                        sb.append(this.f133570c);
                        sb.append(" NewX:");
                        sb.append(c2);
                        sb.append(" NewY:");
                        sb.append(d);
                    }
                    C53894b.this.f133541g.postTranslate((float) (this.f133569b - c2), (float) (this.f133570c - d));
                    C53894b.this.mo113988a(C53894b.this.mo113994f());
                    this.f133569b = c2;
                    this.f133570c = d;
                    C53887a.m114553a(c, this);
                }
            }
        }

        public C53897b(Context context) {
            C53904d dVar;
            if (VERSION.SDK_INT < 9) {
                dVar = new C53903c(context);
            } else if (VERSION.SDK_INT < 14) {
                dVar = new C53901a(context);
            } else {
                dVar = new C53902b(context);
            }
            this.f133568a = dVar;
        }
    }

    /* renamed from: uk.co.senab.photoview.b$c */
    public interface C53898c {
    }

    /* renamed from: uk.co.senab.photoview.b$d */
    public interface C53899d {
        /* renamed from: a */
        void mo71117a(View view, float f, float f2);
    }

    /* renamed from: uk.co.senab.photoview.b$e */
    public interface C53900e {
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: a */
    public final void mo113988a(Matrix matrix) {
        ImageView c = mo113991c();
        if (c != null) {
            m114579j();
            c.setImageMatrix(matrix);
            if (this.f133542h != null) {
                m114575b(matrix);
            }
        }
    }

    /* renamed from: i */
    private void m114578i() {
        if (this.f133559y != null) {
            this.f133559y.mo114003a();
            this.f133559y = null;
        }
    }

    /* renamed from: l */
    private void m114581l() {
        this.f133541g.reset();
        mo113988a(mo113994f());
        m114580k();
    }

    /* renamed from: b */
    public final RectF mo113990b() {
        m114580k();
        return m114575b(mo113994f());
    }

    /* renamed from: g */
    public final void mo113995g() {
        if (m114580k()) {
            mo113988a(mo113994f());
        }
    }

    /* renamed from: j */
    private void m114579j() {
        ImageView c = mo113991c();
        if (c != null && !(c instanceof PhotoView) && !ScaleType.MATRIX.equals(c.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    /* renamed from: e */
    public final void mo113993e() {
        ImageView c = mo113991c();
        if (c != null) {
            if (this.f133536A) {
                m114573a(c);
                m114572a(c.getDrawable());
                return;
            }
            m114581l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Matrix mo113994f() {
        this.f133552r.set(this.f133551q);
        this.f133552r.postConcat(this.f133541g);
        return this.f133552r;
    }

    /* renamed from: c */
    public final ImageView mo113991c() {
        ImageView imageView;
        if (this.f133548n != null) {
            imageView = (ImageView) this.f133548n.get();
        } else {
            imageView = null;
        }
        if (imageView == null) {
            mo113986a();
        }
        return imageView;
    }

    /* renamed from: d */
    public final float mo113992d() {
        return FloatMath.sqrt(((float) Math.pow((double) m114570a(this.f133541g, 0), 2.0d)) + ((float) Math.pow((double) m114570a(this.f133541g, 3), 2.0d)));
    }

    public final void onGlobalLayout() {
        ImageView c = mo113991c();
        if (c != null && this.f133536A) {
            int top = c.getTop();
            int right = c.getRight();
            int bottom = c.getBottom();
            int left = c.getLeft();
            if (top != this.f133555u || bottom != this.f133557w || left != this.f133558x || right != this.f133556v) {
                m114572a(c.getDrawable());
                this.f133555u = top;
                this.f133556v = right;
                this.f133557w = bottom;
                this.f133558x = left;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|(2:18|19)|20|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] m114577h() {
        /*
            int[] r0 = f133533B
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0030 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
        L_0x0030:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0039 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x004b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            f133533B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2703uk.p2704co.senab.photoview.C53894b.m114577h():int[]");
    }

    /* renamed from: a */
    public final void mo113986a() {
        if (this.f133548n != null) {
            ImageView imageView = (ImageView) this.f133548n.get();
            if (imageView != null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                imageView.setOnTouchListener(null);
                m114578i();
            }
            if (this.f133549o != null) {
                this.f133549o.setOnDoubleTapListener(null);
            }
            this.f133542h = null;
            this.f133543i = null;
            this.f133544j = null;
            this.f133548n = null;
        }
    }

    /* renamed from: k */
    private boolean m114580k() {
        float f;
        float f2;
        ImageView c = mo113991c();
        if (c == null) {
            return false;
        }
        RectF b = m114575b(mo113994f());
        if (b == null) {
            return false;
        }
        float height = b.height();
        float width = b.width();
        float c2 = (float) m114576c(c);
        float f3 = 0.0f;
        if (height <= c2) {
            switch (m114577h()[this.f133546l.ordinal()]) {
                case 5:
                    f = (c2 - height) - b.top;
                    break;
                case 6:
                    f = -b.top;
                    break;
                default:
                    f = ((c2 - height) / 2.0f) - b.top;
                    break;
            }
        } else if (b.top > 0.0f) {
            f = -b.top;
        } else if (b.bottom < c2) {
            f = c2 - b.bottom;
        } else {
            f = 0.0f;
        }
        float b2 = (float) m114574b(c);
        if (width <= b2) {
            switch (m114577h()[this.f133546l.ordinal()]) {
                case 5:
                    f2 = (b2 - width) - b.left;
                    break;
                case 6:
                    f2 = -b.left;
                    break;
                default:
                    f2 = ((b2 - width) / 2.0f) - b.left;
                    break;
            }
            f3 = f2;
            this.f133560z = 2;
        } else if (b.left > 0.0f) {
            this.f133560z = 0;
            f3 = -b.left;
        } else if (b.right < b2) {
            f3 = b2 - b.right;
            this.f133560z = 1;
        } else {
            this.f133560z = -1;
        }
        this.f133541g.postTranslate(f3, f);
        return true;
    }

    /* renamed from: a */
    public final void mo113989a(boolean z) {
        this.f133536A = z;
        mo113993e();
    }

    /* renamed from: b */
    private static int m114574b(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: c */
    private static int m114576c(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: a */
    private static void m114573a(ImageView imageView) {
        if (imageView != null && !(imageView instanceof PhotoView) && !ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ScaleType.MATRIX);
        }
    }

    /* renamed from: b */
    private RectF m114575b(Matrix matrix) {
        ImageView c = mo113991c();
        if (c != null) {
            Drawable drawable = c.getDrawable();
            if (drawable != null) {
                this.f133553s.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                matrix.mapRect(this.f133553s);
                return this.f133553s;
            }
        }
        return null;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float d = mo113992d();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (d < this.f133538d) {
                mo113987a(this.f133538d, x, y, true);
            } else if (d < this.f133538d || d >= this.f133539e) {
                mo113987a(this.f133537c, x, y, true);
            } else {
                mo113987a(this.f133539e, x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ImageView c = mo113991c();
        if (this.f133543i != null) {
            RectF b = mo113990b();
            if (b != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (b.contains(x, y)) {
                    this.f133543i.mo71117a(c, (x - b.left) / b.width(), (y - b.top) / b.height());
                    return true;
                }
            }
        }
        if (this.f133544j != null) {
            motionEvent.getX();
            motionEvent.getY();
        }
        return false;
    }

    public C53894b(ImageView imageView) {
        C53892d dVar;
        this.f133548n = new WeakReference<>(imageView);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m114573a(imageView);
        if (!imageView.isInEditMode()) {
            Context context = imageView.getContext();
            int i = VERSION.SDK_INT;
            if (i < 5) {
                dVar = new C53888a(context);
            } else if (i < 8) {
                dVar = new C53889b(context);
            } else {
                dVar = new C53890c(context);
            }
            dVar.mo113976a(this);
            this.f133550p = dVar;
            this.f133549o = new GestureDetector(imageView.getContext(), new SimpleOnGestureListener() {
                public final void onLongPress(MotionEvent motionEvent) {
                    if (C53894b.this.f133545k != null) {
                        C53894b.this.f133545k.onLongClick(C53894b.this.mo113991c());
                    }
                }
            });
            this.f133549o.setOnDoubleTapListener(this);
            mo113989a(true);
        }
    }

    /* renamed from: a */
    private void m114572a(Drawable drawable) {
        ImageView c = mo113991c();
        if (c != null && drawable != null) {
            float b = (float) m114574b(c);
            float c2 = (float) m114576c(c);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f133551q.reset();
            float f = (float) intrinsicWidth;
            float f2 = b / f;
            float f3 = (float) intrinsicHeight;
            float f4 = c2 / f3;
            if (this.f133546l != ScaleType.CENTER) {
                if (this.f133546l != ScaleType.CENTER_CROP) {
                    if (this.f133546l != ScaleType.CENTER_INSIDE) {
                        RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                        RectF rectF2 = new RectF(0.0f, 0.0f, b, c2);
                        switch (m114577h()[this.f133546l.ordinal()]) {
                            case 4:
                                this.f133551q.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
                                break;
                            case 5:
                                this.f133551q.setRectToRect(rectF, rectF2, ScaleToFit.END);
                                break;
                            case 6:
                                this.f133551q.setRectToRect(rectF, rectF2, ScaleToFit.START);
                                break;
                            case 7:
                                this.f133551q.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
                                break;
                        }
                    } else {
                        float min = Math.min(1.0f, Math.min(f2, f4));
                        this.f133551q.postScale(min, min);
                        this.f133551q.postTranslate((b - (f * min)) / 2.0f, (c2 - (f3 * min)) / 2.0f);
                    }
                } else {
                    float max = Math.max(f2, f4);
                    this.f133551q.postScale(max, max);
                    this.f133551q.postTranslate((b - (f * max)) / 2.0f, (c2 - (f3 * max)) / 2.0f);
                }
            } else {
                this.f133551q.postTranslate((b - f) / 2.0f, (c2 - f3) / 2.0f);
            }
            m114581l();
        }
    }

    /* renamed from: a */
    private float m114570a(Matrix matrix, int i) {
        matrix.getValues(this.f133554t);
        return this.f133554t[i];
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r0 = r11.f133536A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007b
            r0 = r12
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x007b
            android.view.ViewParent r0 = r12.getParent()
            int r3 = r13.getAction()
            r4 = 3
            if (r3 == r4) goto L_0x002e
            switch(r3) {
                case 0: goto L_0x0025;
                case 1: goto L_0x002e;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0058
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x002a:
            r11.m114578i()
            goto L_0x0058
        L_0x002e:
            float r3 = r11.mo113992d()
            float r4 = r11.f133537c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0058
            android.graphics.RectF r3 = r11.mo113990b()
            if (r3 == 0) goto L_0x0058
            uk.co.senab.photoview.b$a r10 = new uk.co.senab.photoview.b$a
            float r6 = r11.mo113992d()
            float r7 = r11.f133537c
            float r8 = r3.centerX()
            float r9 = r3.centerY()
            r4 = r10
            r5 = r11
            r4.<init>(r6, r7, r8, r9)
            r12.post(r10)
            r12 = 1
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            android.view.GestureDetector r3 = r11.f133549o
            if (r3 == 0) goto L_0x0066
            android.view.GestureDetector r3 = r11.f133549o
            boolean r3 = r3.onTouchEvent(r13)
            if (r3 == 0) goto L_0x0066
            r12 = 1
        L_0x0066:
            if (r12 != 0) goto L_0x006d
            if (r0 == 0) goto L_0x006d
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x006d:
            uk.co.senab.photoview.a.d r0 = r11.f133550p
            if (r0 == 0) goto L_0x007c
            uk.co.senab.photoview.a.d r0 = r11.f133550p
            boolean r13 = r0.mo113979c(r13)
            if (r13 == 0) goto L_0x007c
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = 0
        L_0x007c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p2703uk.p2704co.senab.photoview.C53894b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo113983a(float f, float f2) {
        if (f133534a) {
            C2240a.m6772a("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
        }
        ImageView c = mo113991c();
        this.f133541g.postTranslate(f, f2);
        mo113995g();
        if (this.f133540f && !this.f133550p.mo113977a()) {
            if (this.f133560z == 2 || ((this.f133560z == 0 && f >= 1.0f) || (this.f133560z == 1 && f <= -1.0f))) {
                ViewParent parent = c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* renamed from: a */
    static void m114571a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    /* renamed from: b */
    public final void mo113985b(float f, float f2, float f3) {
        if (f133534a) {
            C2240a.m6772a("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)});
        }
        if (mo113992d() < this.f133539e || f < 1.0f) {
            this.f133541g.postScale(f, f, f2, f3);
            mo113995g();
        }
    }

    /* renamed from: a */
    public final void mo113984a(float f, float f2, float f3, float f4) {
        int i;
        int i2;
        int i3;
        int i4;
        float f5 = f3;
        float f6 = f4;
        if (f133534a) {
            StringBuilder sb = new StringBuilder("onFling. sX: ");
            sb.append(f);
            sb.append(" sY: ");
            sb.append(f2);
            sb.append(" Vx: ");
            sb.append(f5);
            sb.append(" Vy: ");
            sb.append(f6);
        }
        ImageView c = mo113991c();
        this.f133559y = new C53897b(c.getContext());
        C53897b bVar = this.f133559y;
        int b = m114574b(c);
        int c2 = m114576c(c);
        int i5 = (int) f5;
        int i6 = (int) f6;
        RectF b2 = C53894b.this.mo113990b();
        if (b2 != null) {
            int round = Math.round(-b2.left);
            float f7 = (float) b;
            if (f7 < b2.width()) {
                i = Math.round(b2.width() - f7);
                i2 = 0;
            } else {
                i2 = round;
                i = i2;
            }
            int round2 = Math.round(-b2.top);
            float f8 = (float) c2;
            if (f8 < b2.height()) {
                i3 = Math.round(b2.height() - f8);
                i4 = 0;
            } else {
                i4 = round2;
                i3 = i4;
            }
            bVar.f133569b = round;
            bVar.f133570c = round2;
            if (f133534a) {
                StringBuilder sb2 = new StringBuilder("fling. StartX:");
                sb2.append(round);
                sb2.append(" StartY:");
                sb2.append(round2);
                sb2.append(" MaxX:");
                sb2.append(i);
                sb2.append(" MaxY:");
                sb2.append(i3);
            }
            if (!(round == i && round2 == i3)) {
                bVar.f133568a.mo114005a(round, round2, i5, i6, i2, i, i4, i3, 0, 0);
            }
        }
        c.post(this.f133559y);
    }

    /* renamed from: a */
    public final void mo113987a(float f, float f2, float f3, boolean z) {
        ImageView c = mo113991c();
        if (c != null && f >= this.f133537c && f <= this.f133539e) {
            if (z) {
                C53896a aVar = new C53896a(mo113992d(), f, f2, f3);
                c.post(aVar);
                return;
            }
            this.f133541g.setScale(f, f, f2, f3);
            mo113995g();
        }
    }
}
