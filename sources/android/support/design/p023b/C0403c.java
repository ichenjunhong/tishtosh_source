package android.support.design.p023b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.p023b.C0405d.C0410d;
import android.support.design.widget.C0560l;
import android.view.View;

/* renamed from: android.support.design.b.c */
public final class C0403c {

    /* renamed from: a */
    public static final int f1292a;

    /* renamed from: b */
    public Drawable f1293b;

    /* renamed from: c */
    private final C0404a f1294c;

    /* renamed from: d */
    private final View f1295d;

    /* renamed from: e */
    private final Path f1296e;

    /* renamed from: f */
    private final Paint f1297f;

    /* renamed from: g */
    private final Paint f1298g;

    /* renamed from: h */
    private C0410d f1299h;

    /* renamed from: i */
    private boolean f1300i;

    /* renamed from: j */
    private boolean f1301j;

    /* renamed from: android.support.design.b.c$a */
    public interface C0404a {
        /* renamed from: a */
        void mo901a(Canvas canvas);

        /* renamed from: c */
        boolean mo903c();
    }

    /* renamed from: d */
    public final int mo922d() {
        return this.f1298g.getColor();
    }

    /* renamed from: i */
    private boolean m991i() {
        if (this.f1300i || this.f1293b == null || this.f1299h == null) {
            return false;
        }
        return true;
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1292a = 2;
        } else if (VERSION.SDK_INT >= 18) {
            f1292a = 1;
        } else {
            f1292a = 0;
        }
    }

    /* renamed from: h */
    private boolean m990h() {
        if (this.f1300i || Color.alpha(this.f1298g.getColor()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C0410d mo921c() {
        if (this.f1299h == null) {
            return null;
        }
        C0410d dVar = new C0410d(this.f1299h);
        if (dVar.mo931a()) {
            dVar.f1308c = m986b(dVar);
        }
        return dVar;
    }

    /* renamed from: e */
    public final boolean mo923e() {
        if (!this.f1294c.mo903c() || m989g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m988f() {
        if (f1292a == 1) {
            this.f1296e.rewind();
            if (this.f1299h != null) {
                this.f1296e.addCircle(this.f1299h.f1306a, this.f1299h.f1307b, this.f1299h.f1308c, Direction.CW);
            }
        }
        this.f1295d.invalidate();
    }

    /* renamed from: g */
    private boolean m989g() {
        boolean z;
        if (this.f1299h == null || this.f1299h.mo931a()) {
            z = true;
        } else {
            z = false;
        }
        if (f1292a == 0) {
            if (z || !this.f1301j) {
                return false;
            }
            return true;
        } else if (!z) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo915a() {
        if (f1292a == 0) {
            this.f1300i = true;
            this.f1301j = false;
            this.f1295d.buildDrawingCache();
            Bitmap drawingCache = this.f1295d.getDrawingCache();
            if (!(drawingCache != null || this.f1295d.getWidth() == 0 || this.f1295d.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f1295d.getWidth(), this.f1295d.getHeight(), Config.ARGB_8888);
                this.f1295d.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f1297f;
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f1300i = false;
            this.f1301j = true;
        }
    }

    /* renamed from: b */
    public final void mo920b() {
        if (f1292a == 0) {
            this.f1301j = false;
            this.f1295d.destroyDrawingCache();
            this.f1297f.setShader(null);
            this.f1295d.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo918a(Drawable drawable) {
        this.f1293b = drawable;
        this.f1295d.invalidate();
    }

    /* renamed from: a */
    public final void mo916a(int i) {
        this.f1298g.setColor(i);
        this.f1295d.invalidate();
    }

    /* renamed from: b */
    private float m986b(C0410d dVar) {
        return C0560l.m1542a(dVar.f1306a, dVar.f1307b, 0.0f, 0.0f, (float) this.f1295d.getWidth(), (float) this.f1295d.getHeight());
    }

    /* renamed from: b */
    private void m987b(Canvas canvas) {
        if (m991i()) {
            Rect bounds = this.f1293b.getBounds();
            float width = this.f1299h.f1306a - (((float) bounds.width()) / 2.0f);
            float height = this.f1299h.f1307b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f1293b.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: a */
    public final void mo919a(C0410d dVar) {
        if (dVar == null) {
            this.f1299h = null;
        } else {
            if (this.f1299h == null) {
                this.f1299h = new C0410d(dVar);
            } else {
                this.f1299h.mo930a(dVar);
            }
            if (C0560l.m1544b(dVar.f1308c, m986b(dVar), 1.0E-4f)) {
                this.f1299h.f1308c = Float.MAX_VALUE;
            }
        }
        m988f();
    }

    /* renamed from: a */
    public final void mo917a(Canvas canvas) {
        if (m989g()) {
            switch (f1292a) {
                case 0:
                    canvas.drawCircle(this.f1299h.f1306a, this.f1299h.f1307b, this.f1299h.f1308c, this.f1297f);
                    if (m990h()) {
                        canvas.drawCircle(this.f1299h.f1306a, this.f1299h.f1307b, this.f1299h.f1308c, this.f1298g);
                        break;
                    }
                    break;
                case 1:
                    int save = canvas.save();
                    canvas.clipPath(this.f1296e);
                    this.f1294c.mo901a(canvas);
                    if (m990h()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f1295d.getWidth(), (float) this.f1295d.getHeight(), this.f1298g);
                    }
                    canvas.restoreToCount(save);
                    break;
                case 2:
                    this.f1294c.mo901a(canvas);
                    if (m990h()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.f1295d.getWidth(), (float) this.f1295d.getHeight(), this.f1298g);
                        break;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unsupported strategy ");
                    sb.append(f1292a);
                    throw new IllegalStateException(sb.toString());
            }
        } else {
            this.f1294c.mo901a(canvas);
            if (m990h()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f1295d.getWidth(), (float) this.f1295d.getHeight(), this.f1298g);
            }
        }
        m987b(canvas);
    }
}
