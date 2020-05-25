package android.support.p030v4.view.p041a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
public final class C1004a {
    /* renamed from: a */
    public static void m2882a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
