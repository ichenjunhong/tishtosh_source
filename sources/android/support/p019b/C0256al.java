package android.support.p019b;

import android.os.IBinder;

/* renamed from: android.support.b.al */
final class C0256al implements C0258an {

    /* renamed from: a */
    private final IBinder f630a;

    public final int hashCode() {
        return this.f630a.hashCode();
    }

    C0256al(IBinder iBinder) {
        this.f630a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0256al) || !((C0256al) obj).f630a.equals(this.f630a)) {
            return false;
        }
        return true;
    }
}
