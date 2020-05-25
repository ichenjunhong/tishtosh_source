package p2703uk.p2704co.senab.photoview.p2706b;

import android.content.Context;
import android.widget.OverScroller;

/* renamed from: uk.co.senab.photoview.b.a */
public class C53901a extends C53904d {

    /* renamed from: a */
    protected OverScroller f133572a;

    /* renamed from: b */
    private boolean f133573b;

    /* renamed from: b */
    public final boolean mo114008b() {
        return this.f133572a.isFinished();
    }

    /* renamed from: c */
    public final int mo114009c() {
        return this.f133572a.getCurrX();
    }

    /* renamed from: d */
    public final int mo114010d() {
        return this.f133572a.getCurrY();
    }

    /* renamed from: a */
    public boolean mo114007a() {
        if (this.f133573b) {
            this.f133572a.computeScrollOffset();
            this.f133573b = false;
        }
        return this.f133572a.computeScrollOffset();
    }

    /* renamed from: a */
    public final void mo114006a(boolean z) {
        this.f133572a.forceFinished(true);
    }

    public C53901a(Context context) {
        this.f133572a = new OverScroller(context);
    }

    /* renamed from: a */
    public final void mo114005a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f133572a.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }
}
