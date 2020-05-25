package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.v7.widget.af */
public class C1415af extends C1346r {

    /* renamed from: a */
    protected final LinearInterpolator f5104a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f5105b = new DecelerateInterpolator();

    /* renamed from: c */
    protected PointF f5106c;

    /* renamed from: d */
    protected int f5107d = 0;

    /* renamed from: e */
    protected int f5108e = 0;

    /* renamed from: f */
    private final float f5109f;

    /* renamed from: b */
    private static int m4866b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5106a() {
        this.f5108e = 0;
        this.f5107d = 0;
        this.f5106c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5494b() {
        if (this.f5106c == null || this.f5106c.x == 0.0f) {
            return 0;
        }
        if (this.f5106c.x > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo5496c() {
        if (this.f5106c == null || this.f5106c.y == 0.0f) {
            return 0;
        }
        if (this.f5106c.y > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo5490a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5491a(int i) {
        double b = (double) mo5495b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    public C1415af(Context context) {
        this.f5109f = mo5490a(context.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5495b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f5109f));
    }

    /* renamed from: a */
    public final int mo5493a(View view, int i) {
        C1332i iVar = this.f4780i;
        if (iVar == null || !iVar.mo4742e()) {
            return 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return mo5492a(iVar.mo5049g(view) - layoutParams.leftMargin, iVar.mo5053i(view) + layoutParams.rightMargin, iVar.mo5063t(), iVar.f4745I - iVar.mo5065v(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5110a(View view, C1349s sVar, C1347a aVar) {
        int i;
        int a = mo5493a(view, mo5494b());
        int c = mo5496c();
        C1332i iVar = this.f4780i;
        if (iVar == null || !iVar.mo4745f()) {
            i = 0;
        } else {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            i = mo5492a(iVar.mo5051h(view) - layoutParams.topMargin, iVar.mo5055j(view) + layoutParams.bottomMargin, iVar.mo5064u(), iVar.f4746J - iVar.mo5066w(), c);
        }
        int a2 = mo5491a((int) Math.sqrt((double) ((a * a) + (i * i))));
        if (a2 > 0) {
            aVar.mo5113a(-a, -i, a2, this.f5105b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5108a(int i, int i2, C1349s sVar, C1347a aVar) {
        if (this.f4779h.f4703n.mo5062s() == 0) {
            mo5112d();
            return;
        }
        this.f5107d = m4866b(this.f5107d, i);
        this.f5108e = m4866b(this.f5108e, i2);
        if (this.f5107d == 0 && this.f5108e == 0) {
            PointF c = mo5111c(this.f4778g);
            if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
                aVar.f4788d = this.f4778g;
                mo5112d();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((c.x * c.x) + (c.y * c.y)));
            c.x /= sqrt;
            c.y /= sqrt;
            this.f5106c = c;
            this.f5107d = (int) (c.x * 10000.0f);
            this.f5108e = (int) (c.y * 10000.0f);
            aVar.mo5113a((int) (((float) this.f5107d) * 1.2f), (int) (((float) this.f5108e) * 1.2f), (int) (((float) mo5495b(10000)) * 1.2f), this.f5104a);
        }
    }

    /* renamed from: a */
    public int mo5492a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
