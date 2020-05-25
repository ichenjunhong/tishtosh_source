package android.support.p030v4.view.p041a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

/* renamed from: android.support.v4.view.a.b */
public final class C1005b {

    /* renamed from: android.support.v4.view.a.b$a */
    public interface C1006a {
        /* renamed from: a */
        void mo1262a(boolean z);
    }

    /* renamed from: android.support.v4.view.a.b$b */
    public static class C1007b implements TouchExplorationStateChangeListener {

        /* renamed from: a */
        final C1006a f3229a;

        public final int hashCode() {
            return this.f3229a.hashCode();
        }

        public C1007b(C1006a aVar) {
            this.f3229a = aVar;
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            this.f3229a.mo1262a(z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f3229a.equals(((C1007b) obj).f3229a);
        }
    }

    /* renamed from: a */
    public static boolean m2883a(AccessibilityManager accessibilityManager, C1006a aVar) {
        if (VERSION.SDK_INT < 19 || aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C1007b(aVar));
    }
}
