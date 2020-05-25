package android.support.design.button;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.p027e.C0424a;
import android.support.p030v4.graphics.drawable.C0809a;

/* renamed from: android.support.design.button.b */
final class C0419b {

    /* renamed from: a */
    static final boolean f1347a;

    /* renamed from: b */
    final MaterialButton f1348b;

    /* renamed from: c */
    int f1349c;

    /* renamed from: d */
    int f1350d;

    /* renamed from: e */
    int f1351e;

    /* renamed from: f */
    int f1352f;

    /* renamed from: g */
    public int f1353g;

    /* renamed from: h */
    public int f1354h;

    /* renamed from: i */
    public Mode f1355i;

    /* renamed from: j */
    public ColorStateList f1356j;

    /* renamed from: k */
    public ColorStateList f1357k;

    /* renamed from: l */
    public ColorStateList f1358l;

    /* renamed from: m */
    final Paint f1359m = new Paint(1);

    /* renamed from: n */
    final Rect f1360n = new Rect();

    /* renamed from: o */
    final RectF f1361o = new RectF();

    /* renamed from: p */
    GradientDrawable f1362p;

    /* renamed from: q */
    Drawable f1363q;

    /* renamed from: r */
    GradientDrawable f1364r;

    /* renamed from: s */
    Drawable f1365s;

    /* renamed from: t */
    GradientDrawable f1366t;

    /* renamed from: u */
    GradientDrawable f1367u;

    /* renamed from: v */
    GradientDrawable f1368v;

    /* renamed from: w */
    public boolean f1369w = false;

    static {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f1347a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1017a() {
        if (this.f1366t != null) {
            C0809a.m2327a((Drawable) this.f1366t, this.f1356j);
            if (this.f1355i != null) {
                C0809a.m2330a((Drawable) this.f1366t, this.f1355i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1019c() {
        if (!f1347a || this.f1367u == null) {
            if (!f1347a) {
                this.f1348b.invalidate();
            }
            return;
        }
        this.f1348b.setInternalBackground(mo1018b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Drawable mo1018b() {
        this.f1366t = new GradientDrawable();
        this.f1366t.setCornerRadius(((float) this.f1353g) + 1.0E-5f);
        this.f1366t.setColor(-1);
        mo1017a();
        this.f1367u = new GradientDrawable();
        this.f1367u.setCornerRadius(((float) this.f1353g) + 1.0E-5f);
        this.f1367u.setColor(0);
        this.f1367u.setStroke(this.f1354h, this.f1357k);
        InsetDrawable a = mo1016a(new LayerDrawable(new Drawable[]{this.f1366t, this.f1367u}));
        this.f1368v = new GradientDrawable();
        this.f1368v.setCornerRadius(((float) this.f1353g) + 1.0E-5f);
        this.f1368v.setColor(-1);
        return new C0418a(C0424a.m1036a(this.f1358l), a, this.f1368v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public InsetDrawable mo1016a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f1349c, this.f1351e, this.f1350d, this.f1352f);
        return insetDrawable;
    }

    public C0419b(MaterialButton materialButton) {
        this.f1348b = materialButton;
    }
}
