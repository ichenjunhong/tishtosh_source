package p2703uk.p2704co.senab.photoview.p2706b;

import android.content.Context;
import android.widget.Scroller;

/* renamed from: uk.co.senab.photoview.b.c */
public final class C53903c extends C53904d {

    /* renamed from: a */
    private Scroller f133574a;

    /* renamed from: b */
    public final boolean mo114008b() {
        return this.f133574a.isFinished();
    }

    /* renamed from: c */
    public final int mo114009c() {
        return this.f133574a.getCurrX();
    }

    /* renamed from: d */
    public final int mo114010d() {
        return this.f133574a.getCurrY();
    }

    /* renamed from: a */
    public final boolean mo114007a() {
        return this.f133574a.computeScrollOffset();
    }

    /* renamed from: a */
    public final void mo114006a(boolean z) {
        this.f133574a.forceFinished(true);
    }

    public C53903c(Context context) {
        this.f133574a = new Scroller(context);
    }

    /* renamed from: a */
    public final void mo114005a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f133574a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }
}
