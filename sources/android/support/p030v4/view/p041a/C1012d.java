package android.support.p030v4.view.p041a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.d */
public final class C1012d {

    /* renamed from: a */
    public final Object f3268a;

    /* renamed from: android.support.v4.view.a.d$a */
    static class C1013a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1012d f3269a;

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            return null;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return false;
        }

        C1013a(C1012d dVar) {
            this.f3269a = dVar;
        }
    }

    /* renamed from: android.support.v4.view.a.d$b */
    static class C1014b extends C1013a {
        public final AccessibilityNodeInfo findFocus(int i) {
            return null;
        }

        C1014b(C1012d dVar) {
            super(dVar);
        }
    }

    public C1012d() {
        if (VERSION.SDK_INT >= 19) {
            this.f3268a = new C1014b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f3268a = new C1013a(this);
        } else {
            this.f3268a = null;
        }
    }

    public C1012d(Object obj) {
        this.f3268a = obj;
    }
}
