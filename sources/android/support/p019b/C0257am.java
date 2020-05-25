package android.support.p019b;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.b.am */
final class C0257am implements C0258an {

    /* renamed from: a */
    private final WindowId f631a;

    public final int hashCode() {
        return this.f631a.hashCode();
    }

    C0257am(View view) {
        this.f631a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0257am) || !((C0257am) obj).f631a.equals(this.f631a)) {
            return false;
        }
        return true;
    }
}
