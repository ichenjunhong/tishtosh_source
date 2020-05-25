package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask */
public final class ReleaseWindowBackgroundTask implements LegoTask {
    public static final C35959a Companion = new C35959a(null);
    public final WeakReference<Activity> activityWeakReference;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$a */
    public static final class C35959a {
        private C35959a() {
        }

        public /* synthetic */ C35959a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b */
    static final class C35960b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReleaseWindowBackgroundTask f92186a;

        /* renamed from: b */
        final /* synthetic */ C52727e f92187b;

        C35960b(ReleaseWindowBackgroundTask releaseWindowBackgroundTask, C52727e eVar) {
            this.f92186a = releaseWindowBackgroundTask;
            this.f92187b = eVar;
        }

        public final void run() {
            WeakReference<Activity> weakReference = this.f92186a.activityWeakReference;
            if (weakReference != null) {
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable((Drawable) this.f92187b.element);
                    }
                }
            }
        }
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public ReleaseWindowBackgroundTask(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.activityWeakReference = new WeakReference<>(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[Catch:{ Exception -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058 A[Catch:{ Exception -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            d.f.b.v$e r0 = new d.f.b.v$e
            r0.<init>()
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment> r2 = com.p683ss.android.ugc.aweme.main.experiment.ReleaseWindowBackgroundExperiment.class
            java.lang.String r4 = "is_release_window_background"
            r3 = 1
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 1
            boolean r1 = r1.mo18172a(r2, r3, r4, r5, r6)
            r2 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001d:
            r1 = r2
            goto L_0x003b
        L_0x001f:
            java.lang.ref.WeakReference<android.app.Activity> r1 = r7.activityWeakReference
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x001d
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x001d
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L_0x001d
            android.graphics.drawable.Drawable r1 = r1.getBackground()
        L_0x003b:
            r0.element = r1
            com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b r1 = new com.ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask$b
            r1.<init>(r7, r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r3 = 3000(0xbb8, float:4.204E-42)
            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45933a(r1, r3)
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "input_method"
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ Exception -> 0x0060 }
            if (r8 == 0) goto L_0x0058
            android.view.inputmethod.InputMethodManager r8 = (android.view.inputmethod.InputMethodManager) r8     // Catch:{ Exception -> 0x0060 }
            goto L_0x0061
        L_0x0058:
            d.u r8 = new d.u     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r8.<init>(r1)     // Catch:{ Exception -> 0x0060 }
            throw r8     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            r8 = r2
        L_0x0061:
            if (r8 != 0) goto L_0x0064
            return
        L_0x0064:
            java.lang.Class r1 = r8.getClass()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = "mCurRootView"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0094 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r8 = r1.get(r8)     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0094
            boolean r1 = r8 instanceof android.view.View     // Catch:{ Exception -> 0x0094 }
            if (r1 == 0) goto L_0x0094
            r1 = r8
            android.view.View r1 = (android.view.View) r1     // Catch:{ Exception -> 0x0094 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r3 = "mResizingBackgroundDrawable"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ Exception -> 0x0094 }
            r1.setAccessible(r2)     // Catch:{ Exception -> 0x0094 }
            T r0 = r0.element     // Catch:{ Exception -> 0x0094 }
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch:{ Exception -> 0x0094 }
            r1.set(r8, r0)     // Catch:{ Exception -> 0x0094 }
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.ReleaseWindowBackgroundTask.run(android.content.Context):void");
    }
}
