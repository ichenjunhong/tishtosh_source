package leakcanary.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import leakcanary.internal.InternalLeakCanary.C53388e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class AndroidHeapDumper implements C53418i {
    public static final C53377a Companion = new C53377a(null);
    private final Context context;
    private final C53428l leakDirectoryProvider;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    public Activity resumedActivity;

    /* renamed from: leakcanary.internal.AndroidHeapDumper$a */
    public static final class C53377a {
        private C53377a() {
        }

        public /* synthetic */ C53377a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.AndroidHeapDumper$b */
    static final class C53378b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Toast f132023a;

        C53378b(Toast toast) {
            this.f132023a = toast;
        }

        public final void run() {
            this.f132023a.cancel();
        }
    }

    /* renamed from: leakcanary.internal.AndroidHeapDumper$c */
    public static final class C53379c implements C53419j {

        /* renamed from: a */
        final /* synthetic */ AndroidHeapDumper f132024a;

        /* renamed from: b */
        final /* synthetic */ File f132025b;

        /* renamed from: c */
        final /* synthetic */ Toast f132026c;

        /* renamed from: d */
        final /* synthetic */ NotificationManager f132027d;

        /* renamed from: a */
        public final File mo110977a() {
            return this.f132025b;
        }

        /* renamed from: b */
        public final void mo110978b() {
            this.f132024a.cancelToast(this.f132026c);
            this.f132027d.cancel(-1000000);
        }

        C53379c(AndroidHeapDumper androidHeapDumper, File file, Toast toast, NotificationManager notificationManager) {
            this.f132024a = androidHeapDumper;
            this.f132025b = file;
            this.f132026c = toast;
            this.f132027d = notificationManager;
        }
    }

    /* renamed from: leakcanary.internal.AndroidHeapDumper$d */
    static final class C53380d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AndroidHeapDumper f132028a;

        /* renamed from: b */
        final /* synthetic */ C53405f f132029b;

        C53380d(AndroidHeapDumper androidHeapDumper, C53405f fVar) {
            this.f132028a = androidHeapDumper;
            this.f132029b = fVar;
        }

        public final void run() {
            Activity activity = this.f132028a.resumedActivity;
            if (activity == null) {
                this.f132029b.mo111031a(null);
                return;
            }
            final Toast makeText = Toast.makeText(activity.getApplicationContext(), "LeakDetector is dumping the heap", 1);
            makeText.setGravity(16, 0, -128);
            C53398b.m113464a(makeText);
            C52711k.m112236a((Object) makeText, "toast");
            View view = makeText.getView();
            C52711k.m112236a((Object) view, "taostView");
            view.setTranslationY(-128.0f);
            view.animate().translationY(0.0f).setListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C53380d f132030a;

                public final void onAnimationEnd(Animator animator) {
                    C52711k.m112240b(animator, "animation");
                    this.f132030a.f132029b.mo111031a(makeText);
                }

                {
                    this.f132030a = r1;
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0187 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final leakcanary.internal.C53419j dumpHeap() {
        /*
            r8 = this;
            leakcanary.internal.l r0 = r8.leakDirectoryProvider
            leakcanary.internal.l$c r1 = leakcanary.internal.C53428l.C53431c.f132136a
            java.io.FilenameFilter r1 = (java.io.FilenameFilter) r1
            java.lang.String r2 = "filter"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            boolean r2 = r0.mo111051a()
            if (r2 != 0) goto L_0x001c
            d.f.a.a<java.lang.Boolean> r2 = r0.f132132b
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.booleanValue()
        L_0x001c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.io.File r3 = r0.mo111052b()
            java.io.File[] r3 = r3.listFiles(r1)
            if (r3 == 0) goto L_0x0031
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            p2628d.p2629a.C52575l.m112109a(r4, (T[]) r3)
        L_0x0031:
            java.io.File r3 = r0.mo111053c()
            java.io.File[] r1 = r3.listFiles(r1)
            if (r1 == 0) goto L_0x0041
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            p2628d.p2629a.C52575l.m112109a(r3, (T[]) r1)
        L_0x0041:
            java.util.List r2 = (java.util.List) r2
            d.f.a.a<java.lang.Integer> r1 = r0.f132131a
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x01e1
            int r3 = r2.size()
            int r3 = r3 - r1
            if (r3 <= 0) goto L_0x00c2
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x005f
            goto L_0x0075
        L_0x005f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Removing "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r5 = " heap dumps"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.mo110681a(r4)
        L_0x0075:
            leakcanary.internal.l$b r1 = leakcanary.internal.C53428l.C53430b.f132135a
            java.util.Comparator r1 = (java.util.Comparator) r1
            p2628d.p2629a.C52575l.m112105a(r2, r1)
            r1 = 0
        L_0x007d:
            if (r1 >= r3) goto L_0x00c2
            java.lang.Object r4 = r2.get(r1)
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.Object r5 = r2.get(r1)
            java.io.File r5 = (java.io.File) r5
            boolean r5 = r5.delete()
            if (r5 == 0) goto L_0x009d
            java.util.List<java.lang.String> r5 = leakcanary.internal.C53428l.f132127c
            java.util.Collection r5 = (java.util.Collection) r5
            r5.add(r4)
            goto L_0x00bf
        L_0x009d:
            h.a$a r4 = p2673h.C53173a.m112969a()
            if (r4 != 0) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not delete old hprof file "
            r5.<init>(r6)
            java.lang.Object r6 = r2.get(r1)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getPath()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.mo110681a(r5)
        L_0x00bf:
            int r1 = r1 + 1
            goto L_0x007d
        L_0x00c2:
            java.io.File r1 = r0.mo111052b()
            boolean r2 = leakcanary.internal.C53428l.m113484a(r1)
            r3 = 0
            if (r2 != 0) goto L_0x016e
            boolean r2 = r0.mo111051a()
            r4 = 93
            if (r2 != 0) goto L_0x00fd
            d.f.a.a<java.lang.Boolean> r1 = r0.f132132b
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00f0
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x00ea
            goto L_0x0143
        L_0x00ea:
            java.lang.String r2 = "WRITE_EXTERNAL_STORAGE permission not granted, requesting"
            r1.mo110681a(r2)
            goto L_0x0143
        L_0x00f0:
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x00f7
            goto L_0x0143
        L_0x00f7:
            java.lang.String r2 = "WRITE_EXTERNAL_STORAGE permission not granted, ignoring"
            r1.mo110681a(r2)
            goto L_0x0143
        L_0x00fd:
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            java.lang.String r5 = "mounted"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0124
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x0112
            goto L_0x0143
        L_0x0112:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "External storage not mounted, state: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.mo110681a(r2)
            goto L_0x0143
        L_0x0124:
            h.a$a r2 = p2673h.C53173a.m112969a()
            if (r2 != 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not create heap dump directory in external storage: ["
            r5.<init>(r6)
            java.lang.String r1 = r1.getAbsolutePath()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r2.mo110681a(r1)
        L_0x0143:
            java.io.File r1 = r0.mo111053c()
            boolean r0 = leakcanary.internal.C53428l.m113484a(r1)
            if (r0 != 0) goto L_0x016e
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x0154
            goto L_0x016c
        L_0x0154:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Could not create heap dump directory in app storage: ["
            r2.<init>(r5)
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.mo110681a(r1)
        L_0x016c:
            r2 = r3
            goto L_0x0185
        L_0x016e:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd_HH-mm-ss_SSS'.hprof'"
            java.util.Locale r4 = java.util.Locale.US
            r0.<init>(r2, r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r0 = r0.format(r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r0)
        L_0x0185:
            if (r2 != 0) goto L_0x0188
            return r3
        L_0x0188:
            leakcanary.internal.f r0 = new leakcanary.internal.f
            r0.<init>()
            r8.showToast(r0)
            r4 = 5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            boolean r1 = r0.mo111032a(r4, r1)
            if (r1 != 0) goto L_0x01a7
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x01a1
            goto L_0x01a6
        L_0x01a1:
            java.lang.String r1 = "Did not dump heap, too much time waiting for Toast."
            r0.mo110681a(r1)
        L_0x01a6:
            return r3
        L_0x01a7:
            android.content.Context r1 = r8.context
            java.lang.String r3 = "notification"
            java.lang.Object r1 = r1.getSystemService(r3)
            if (r1 == 0) goto L_0x01d9
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.util.concurrent.CountDownLatch r3 = r0.f132078b
            long r3 = r3.getCount()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x01cf
            java.util.concurrent.atomic.AtomicReference<T> r0 = r0.f132077a
            java.lang.Object r0 = r0.get()
            android.widget.Toast r0 = (android.widget.Toast) r0
            leakcanary.internal.AndroidHeapDumper$c r3 = new leakcanary.internal.AndroidHeapDumper$c
            r3.<init>(r8, r2, r0, r1)
            leakcanary.internal.j r3 = (leakcanary.internal.C53419j) r3
            return r3
        L_0x01cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Call wait() and check its result"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x01d9:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
            r0.<init>(r1)
            throw r0
        L_0x01e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxStoredHeapDumps must be at least 1"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.AndroidHeapDumper.dumpHeap():leakcanary.internal.j");
    }

    private final void showToast(C53405f<Toast> fVar) {
        this.mainHandler.post(new C53380d(this, fVar));
    }

    public final void cancelToast(Toast toast) {
        if (toast != null) {
            this.mainHandler.post(new C53378b(toast));
        }
    }

    public AndroidHeapDumper(Context context2, C53428l lVar) {
        C52711k.m112240b(context2, "context");
        C52711k.m112240b(lVar, "leakDirectoryProvider");
        this.leakDirectoryProvider = lVar;
        Context applicationContext = context2.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        this.context = applicationContext;
        Context applicationContext2 = context2.getApplicationContext();
        if (applicationContext2 != null) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks(this) {

                /* renamed from: a */
                final /* synthetic */ AndroidHeapDumper f132021a;

                /* renamed from: b */
                private final /* synthetic */ ActivityLifecycleCallbacks f132022b;

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    this.f132022b.onActivityCreated(activity, bundle);
                }

                public final void onActivityDestroyed(Activity activity) {
                    this.f132022b.onActivityDestroyed(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    this.f132022b.onActivitySaveInstanceState(activity, bundle);
                }

                public final void onActivityStarted(Activity activity) {
                    this.f132022b.onActivityStarted(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    this.f132022b.onActivityStopped(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    C52711k.m112240b(activity, "activity");
                    this.f132021a.resumedActivity = activity;
                }

                public final void onActivityPaused(Activity activity) {
                    C52711k.m112240b(activity, "activity");
                    if (this.f132021a.resumedActivity == activity) {
                        this.f132021a.resumedActivity = null;
                    }
                }

                {
                    this.f132021a = r5;
                    Class<ActivityLifecycleCallbacks> cls = ActivityLifecycleCallbacks.class;
                    InvocationHandler invocationHandler = C53388e.f132040a;
                    Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
                    if (newProxyInstance != null) {
                        this.f132022b = (ActivityLifecycleCallbacks) newProxyInstance;
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                }
            });
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Application");
    }
}
