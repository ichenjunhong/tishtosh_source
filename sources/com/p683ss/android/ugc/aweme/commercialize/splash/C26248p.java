package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.p */
public final class C26248p {

    /* renamed from: a */
    public static final C26248p f69300a = new C26248p();

    private C26248p() {
    }

    /* renamed from: e */
    private static boolean m63597e(Activity activity) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.mx, new int[]{16843277});
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.getValue(0, typedValue);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53902a(android.app.Activity r4) {
        /*
            r3 = this;
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "com.oppo.feature.screen.heteromorphism"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x002e
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x002d }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = com.p683ss.android.ugc.aweme.commercialize.splash.C26249q.m63602a(r1, r4, r2)     // Catch:{ NameNotFoundException -> 0x002d }
            if (r4 == 0) goto L_0x0028
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x002d }
            if (r4 == 0) goto L_0x0028
            java.lang.String r1 = "android.max_aspect"
            java.lang.Object r4 = r4.get(r1)     // Catch:{ NameNotFoundException -> 0x002d }
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x002d
            r4 = 1
            r0 = 1
        L_0x002d:
            return r0
        L_0x002e:
            boolean r4 = r3.mo53905d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.mo53902a(android.app.Activity):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53903b(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = "hasNotchInScreen"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0033 }
            r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x0033 }
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0032 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0032 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = com.p683ss.android.ugc.aweme.commercialize.splash.C26249q.m63602a(r0, r5, r1)     // Catch:{ NameNotFoundException -> 0x0032 }
            if (r5 == 0) goto L_0x002d
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0032 }
            if (r5 == 0) goto L_0x002d
            java.lang.String r0 = "android.notch_support"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ NameNotFoundException -> 0x0032 }
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r5 == 0) goto L_0x0032
            r5 = 1
            r2 = 1
        L_0x0032:
            return r2
        L_0x0033:
            boolean r5 = r4.mo53905d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.mo53903b(android.app.Activity):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53904c(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ro.miui.notch"
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            int r0 = com.p683ss.android.ugc.aweme.app.p1372c.C23059a.m56590a(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0039
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x0019
            return r2
        L_0x0019:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0038 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0038 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = com.p683ss.android.ugc.aweme.commercialize.splash.C26249q.m63602a(r0, r5, r3)     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r5 == 0) goto L_0x0034
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r5 == 0) goto L_0x0034
            java.lang.String r0 = "notch.config"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ NameNotFoundException -> 0x0038 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            return r1
        L_0x0039:
            boolean r5 = r4.mo53905d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26248p.mo53904c(android.app.Activity):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo53905d(Activity activity) {
        if (VERSION.SDK_INT < 28) {
            return true;
        }
        Window window = activity.getWindow();
        C52711k.m112236a((Object) window, "activity.window");
        LayoutParams attributes = window.getAttributes();
        if (attributes.layoutInDisplayCutoutMode == 1) {
            return true;
        }
        if (attributes.layoutInDisplayCutoutMode != 0 || m63597e(activity)) {
            return false;
        }
        return true;
    }
}
