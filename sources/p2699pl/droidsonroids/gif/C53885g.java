package p2699pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: pl.droidsonroids.gif.g */
final class C53885g extends C53886h {
    /* renamed from: a */
    public final void mo113942a() {
        long a = this.f133519c.f133497f.mo113883a(this.f133519c.f133496e);
        if (a >= 0) {
            this.f133519c.f133494c = SystemClock.uptimeMillis() + a;
            if (this.f133519c.isVisible() && this.f133519c.f133493b && !this.f133519c.f133499h) {
                this.f133519c.f133492a.remove(this);
                this.f133519c.f133501j = this.f133519c.f133492a.schedule(this, a, TimeUnit.MILLISECONDS);
            }
            if (!this.f133519c.f133498g.isEmpty() && this.f133519c.mo113912d() == this.f133519c.f133497f.mo113901p() - 1) {
                this.f133519c.f133500i.sendEmptyMessageAtTime(this.f133519c.mo113914e(), this.f133519c.f133494c);
            }
        } else {
            this.f133519c.f133494c = Long.MIN_VALUE;
            this.f133519c.f133493b = false;
        }
        if (this.f133519c.isVisible() && !this.f133519c.f133500i.hasMessages(-1)) {
            this.f133519c.f133500i.sendEmptyMessageAtTime(-1, 0);
        }
    }

    C53885g(C53874a aVar) {
        super(aVar);
    }
}
