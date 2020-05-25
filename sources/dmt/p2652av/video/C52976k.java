package dmt.p2652av.video;

import android.arch.lifecycle.C0198r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.k */
public final class C52976k<T> extends C0198r<T> {

    /* renamed from: a */
    private boolean f131383a = true;

    /* renamed from: b */
    private T f131384b;

    public final void setValue(T t) {
        if (this.f131383a) {
            super.setValue(t);
            this.f131383a = false;
            return;
        }
        if (!C52711k.m112239a((Object) this.f131384b, (Object) t)) {
            super.setValue(t);
        }
    }
}
