package p2699pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.MediaController.MediaPlayerControl;
import com.C2240a;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2699pl.droidsonroids.gif.p2702a.C53877a;

/* renamed from: pl.droidsonroids.gif.a */
public final class C53874a extends Drawable implements Animatable, MediaPlayerControl {

    /* renamed from: a */
    final ScheduledThreadPoolExecutor f133492a;

    /* renamed from: b */
    volatile boolean f133493b;

    /* renamed from: c */
    long f133494c;

    /* renamed from: d */
    public final Paint f133495d;

    /* renamed from: e */
    final Bitmap f133496e;

    /* renamed from: f */
    final GifInfoHandle f133497f;

    /* renamed from: g */
    final ConcurrentLinkedQueue<Object> f133498g;

    /* renamed from: h */
    final boolean f133499h;

    /* renamed from: i */
    final C53882d f133500i;

    /* renamed from: j */
    ScheduledFuture<?> f133501j;

    /* renamed from: k */
    public C53877a f133502k;

    /* renamed from: l */
    private final Rect f133503l;

    /* renamed from: m */
    private ColorStateList f133504m;

    /* renamed from: n */
    private PorterDuffColorFilter f133505n;

    /* renamed from: o */
    private Mode f133506o;

    /* renamed from: p */
    private final C53885g f133507p;

    /* renamed from: q */
    private final Rect f133508q;

    /* renamed from: r */
    private int f133509r;

    /* renamed from: s */
    private int f133510s;

    public final boolean canPause() {
        return true;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        return 100;
    }

    public final int getIntrinsicHeight() {
        return this.f133510s;
    }

    public final int getIntrinsicWidth() {
        return this.f133509r;
    }

    public final boolean isPlaying() {
        return this.f133493b;
    }

    public final boolean isRunning() {
        return this.f133493b;
    }

    public final void pause() {
        stop();
    }

    /* renamed from: c */
    public final int mo113908c() {
        return this.f133497f.mo113901p();
    }

    /* renamed from: d */
    public final int mo113912d() {
        return this.f133497f.mo113894i();
    }

    public final int getAlpha() {
        return this.f133495d.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f133495d.getColorFilter();
    }

    public final int getCurrentPosition() {
        return this.f133497f.mo113893h();
    }

    public final int getDuration() {
        return this.f133497f.mo113892g();
    }

    /* renamed from: f */
    private void m114538f() {
        this.f133493b = false;
        this.f133500i.removeMessages(-1);
        this.f133497f.mo113884a();
    }

    /* renamed from: a */
    public final void mo113906a() {
        m114538f();
        this.f133496e.recycle();
    }

    /* renamed from: b */
    public final void mo113907b() {
        this.f133492a.execute(new C53886h(this) {
            /* renamed from: a */
            public final void mo113942a() {
                if (C53874a.this.f133497f.mo113887c()) {
                    C53874a.this.start();
                }
            }
        });
    }

    public final boolean canSeekBackward() {
        if (mo113908c() > 1) {
            return true;
        }
        return false;
    }

    public final boolean canSeekForward() {
        if (mo113908c() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m114539g() {
        if (this.f133501j != null) {
            this.f133501j.cancel(false);
        }
        this.f133500i.removeMessages(-1);
    }

    /* renamed from: e */
    public final int mo113914e() {
        int j = this.f133497f.mo113895j();
        if (j == 0 || j < this.f133497f.mo113889e()) {
            return j;
        }
        return j - 1;
    }

    public final int getOpacity() {
        if (!this.f133497f.mo113902q() || this.f133495d.getAlpha() < 255) {
            return -2;
        }
        return -1;
    }

    public final boolean isStateful() {
        if (super.isStateful() || (this.f133504m != null && this.f133504m.isStateful())) {
            return true;
        }
        return false;
    }

    public final void stop() {
        synchronized (this) {
            if (this.f133493b) {
                this.f133493b = false;
                m114539g();
                this.f133497f.mo113888d();
            }
        }
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f133499h && this.f133493b && this.f133494c != Long.MIN_VALUE) {
            long max = Math.max(0, this.f133494c - SystemClock.uptimeMillis());
            this.f133494c = Long.MIN_VALUE;
            this.f133492a.remove(this.f133507p);
            this.f133501j = this.f133492a.schedule(this.f133507p, max, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r6.f133494c = 0;
        r6.f133500i.sendEmptyMessageAtTime(-1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        m114539g();
        r6.f133501j = r6.f133492a.schedule(r6.f133507p, java.lang.Math.max(r0, 0), java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r6.f133497f.mo113886b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r6.f133499h == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void start() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f133493b     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return
        L_0x0007:
            r0 = 1
            r6.f133493b = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            pl.droidsonroids.gif.GifInfoHandle r0 = r6.f133497f
            long r0 = r0.mo113886b()
            boolean r2 = r6.f133499h
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r6.f133494c = r3
            pl.droidsonroids.gif.d r0 = r6.f133500i
            r1 = -1
            r0.sendEmptyMessageAtTime(r1, r3)
            return
        L_0x0020:
            r6.m114539g()
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r6.f133492a
            pl.droidsonroids.gif.g r5 = r6.f133507p
            long r0 = java.lang.Math.max(r0, r3)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r5, r0, r3)
            r6.f133501j = r0
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2699pl.droidsonroids.gif.C53874a.start():void");
    }

    public final String toString() {
        return C2240a.m6773a(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", new Object[]{Integer.valueOf(this.f133497f.mo113899n()), Integer.valueOf(this.f133497f.mo113900o()), Integer.valueOf(this.f133497f.mo113901p()), Integer.valueOf(this.f133497f.mo113890f())});
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f133503l.set(rect);
    }

    public final void setAlpha(int i) {
        this.f133495d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f133495d.setColorFilter(colorFilter);
    }

    public C53874a(String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    public final void setDither(boolean z) {
        this.f133495d.setDither(z);
        invalidateSelf();
    }

    public final void setFilterBitmap(boolean z) {
        this.f133495d.setFilterBitmap(z);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f133504m = colorStateList;
        this.f133505n = m114537a(colorStateList, this.f133506o);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f133506o = mode;
        this.f133505n = m114537a(this.f133504m, mode);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f133504m == null || this.f133506o == null) {
            return false;
        }
        this.f133505n = m114537a(this.f133504m, this.f133506o);
        return true;
    }

    public final void seekTo(final int i) {
        if (i >= 0) {
            this.f133492a.execute(new C53886h(this) {
                /* renamed from: a */
                public final void mo113942a() {
                    C53874a.this.f133497f.mo113885a(i, C53874a.this.f133496e);
                    this.f133519c.f133500i.sendEmptyMessageAtTime(-1, 0);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f133505n == null || this.f133495d.getColorFilter() != null) {
            z = false;
        } else {
            this.f133495d.setColorFilter(this.f133505n);
            z = true;
        }
        if (this.f133502k == null) {
            canvas.drawBitmap(this.f133496e, this.f133508q, this.f133503l, this.f133495d);
        }
        if (z) {
            this.f133495d.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m114537a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f133499h) {
            if (z) {
                if (z2) {
                    mo113907b();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    private C53874a(GifInfoHandle gifInfoHandle, C53874a aVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f133493b = true;
        this.f133494c = Long.MIN_VALUE;
        this.f133503l = new Rect();
        this.f133495d = new Paint(6);
        this.f133498g = new ConcurrentLinkedQueue<>();
        this.f133507p = new C53885g(this);
        this.f133499h = true;
        this.f133492a = C53881a.f133516a;
        this.f133497f = gifInfoHandle;
        this.f133496e = Bitmap.createBitmap(this.f133497f.mo113899n(), this.f133497f.mo113900o(), Config.ARGB_8888);
        this.f133496e.setHasAlpha(!gifInfoHandle.mo113902q());
        this.f133508q = new Rect(0, 0, this.f133497f.mo113899n(), this.f133497f.mo113900o());
        this.f133500i = new C53882d(this);
        this.f133507p.mo113942a();
        this.f133509r = this.f133497f.mo113899n();
        this.f133510s = this.f133497f.mo113900o();
    }
}
