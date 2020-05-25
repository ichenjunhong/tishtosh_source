package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.view.p041a.C1008c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.a */
public class C1002a {

    /* renamed from: b */
    static final AccessibilityDelegate f3226b = new AccessibilityDelegate();

    /* renamed from: c */
    public final AccessibilityDelegate f3227c = new C1003a(this);

    /* renamed from: android.support.v4.view.a$a */
    static final class C1003a extends AccessibilityDelegate {

        /* renamed from: a */
        private final C1002a f3228a;

        C1003a(C1002a aVar) {
            this.f3228a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r4) {
            /*
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 16
                if (r0 < r2) goto L_0x0015
                android.view.View$AccessibilityDelegate r0 = android.support.p030v4.view.C1002a.f3226b
                android.view.accessibility.AccessibilityNodeProvider r4 = r0.getAccessibilityNodeProvider(r4)
                if (r4 == 0) goto L_0x0015
                android.support.v4.view.a.d r0 = new android.support.v4.view.a.d
                r0.<init>(r4)
                goto L_0x0016
            L_0x0015:
                r0 = r1
            L_0x0016:
                if (r0 == 0) goto L_0x001d
                java.lang.Object r4 = r0.f3268a
                android.view.accessibility.AccessibilityNodeProvider r4 = (android.view.accessibility.AccessibilityNodeProvider) r4
                return r4
            L_0x001d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.C1002a.C1003a.getAccessibilityNodeProvider(android.view.View):android.view.accessibility.AccessibilityNodeProvider");
        }

        public final void sendAccessibilityEvent(View view, int i) {
            C1002a.m2875a(view, i);
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3228a.mo3116c(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3228a.mo1322a(view, accessibilityEvent);
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3228a.mo1675b(view, accessibilityEvent);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1002a.f3226b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f3228a.mo1119a(view, C1008c.m2886a(accessibilityNodeInfo));
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3228a.mo3115a(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3228a.mo1246a(view, i, bundle);
        }
    }

    /* renamed from: a */
    public static void m2875a(View view, int i) {
        f3226b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: b */
    public void mo1675b(View view, AccessibilityEvent accessibilityEvent) {
        f3226b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public boolean mo3116c(View view, AccessibilityEvent accessibilityEvent) {
        return f3226b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1119a(View view, C1008c cVar) {
        f3226b.onInitializeAccessibilityNodeInfo(view, cVar.f3230a);
    }

    /* renamed from: a */
    public void mo1322a(View view, AccessibilityEvent accessibilityEvent) {
        f3226b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1246a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return f3226b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3115a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f3226b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
