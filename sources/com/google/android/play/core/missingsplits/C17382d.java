package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.play.core.splitcompat.C17384b;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.missingsplits.d */
final class C17382d implements C17379a {

    /* renamed from: a */
    private static final C17384b f48903a = new C17384b("MissingSplitsManagerImpl");

    /* renamed from: b */
    private final Context f48904b;

    /* renamed from: c */
    private final Runtime f48905c;

    /* renamed from: d */
    private final C17381c f48906d;

    /* renamed from: e */
    private final AtomicReference<Boolean> f48907e;

    C17382d(Context context, Runtime runtime, C17381c cVar, AtomicReference<Boolean> atomicReference) {
        this.f48904b = context;
        this.f48905c = runtime;
        this.f48906d = cVar;
        this.f48907e = atomicReference;
    }

    /* renamed from: a */
    private final boolean m42562a(ComponentName componentName) {
        String className = componentName.getClassName();
        try {
            Class cls = Class.forName(className);
            while (cls != null) {
                if (cls.equals(Activity.class)) {
                    return true;
                }
                Class superclass = cls.getSuperclass();
                if (superclass == cls) {
                    superclass = null;
                }
                cls = superclass;
            }
            return false;
        } catch (ClassNotFoundException unused) {
            f48903a.mo33688c("ClassNotFoundException when scanning class hierarchy of '%s'", className);
            try {
                return this.f48904b.getPackageManager().getActivityInfo(componentName, 0) != null;
            } catch (NameNotFoundException unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m42563b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r6.f48907e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f48907e     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f48907e     // Catch:{ all -> 0x005a }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005a }
            r3 = 0
            r4 = 21
            r5 = 1
            if (r2 < r4) goto L_0x0045
            boolean r2 = r6.m42564c()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0045
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005a }
            if (r2 >= r4) goto L_0x0026
            java.util.Set r2 = java.util.Collections.emptySet()     // Catch:{ all -> 0x005a }
            goto L_0x002a
        L_0x0026:
            java.util.Set r2 = r6.m42565d()     // Catch:{ all -> 0x005a }
        L_0x002a:
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x005a }
            if (r4 != 0) goto L_0x0041
            int r4 = r2.size()     // Catch:{ all -> 0x005a }
            if (r4 != r5) goto L_0x003f
            java.lang.String r4 = ""
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            if (r2 == 0) goto L_0x0045
            r3 = 1
        L_0x0045:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x005a }
            r1.set(r2)     // Catch:{ all -> 0x005a }
        L_0x004c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r6.f48907e     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r1
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.C17382d.m42563b():boolean");
    }

    /* renamed from: d */
    private final Set<String> m42565d() {
        try {
            PackageInfo packageInfo = this.f48904b.getPackageManager().getPackageInfo(this.f48904b.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (!(packageInfo == null || packageInfo.splitNames == null)) {
                Collections.addAll(hashSet, packageInfo.splitNames);
            }
            return hashSet;
        } catch (NameNotFoundException unused) {
            f48903a.mo33688c("App '%s' is not found in PackageManager", this.f48904b.getPackageName());
            return Collections.emptySet();
        }
    }

    /* renamed from: e */
    private final List<AppTask> m42566e() {
        List<AppTask> appTasks = ((ActivityManager) this.f48904b.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }

    /* renamed from: a */
    public final boolean mo33678a() {
        boolean z;
        boolean z2;
        boolean z3;
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        if (m42563b()) {
            Iterator it = m42566e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AppTask appTask = (AppTask) it.next();
                if (!(appTask.getTaskInfo() == null || appTask.getTaskInfo().baseIntent == null || appTask.getTaskInfo().baseIntent.getComponent() == null)) {
                    if (PlayCoreMissingSplitsActivity.class.getName().equals(appTask.getTaskInfo().baseIntent.getComponent().getClassName())) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                Iterator it2 = m42566e().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    RecentTaskInfo taskInfo = ((AppTask) it2.next()).getTaskInfo();
                    if (taskInfo == null || taskInfo.baseIntent == null || taskInfo.baseIntent.getComponent() == null || !m42562a(taskInfo.baseIntent.getComponent())) {
                        z3 = false;
                        continue;
                    } else {
                        z3 = true;
                        continue;
                    }
                    if (z3) {
                        z2 = true;
                        break;
                    }
                }
                C17381c cVar = this.f48906d;
                C17381c.f48900a.mo33685a("Disabling all non-activity components", new Object[0]);
                cVar.mo33679a(cVar.mo33682c(), 2);
                for (AppTask finishAndRemoveTask : m42566e()) {
                    finishAndRemoveTask.finishAndRemoveTask();
                }
                if (z2) {
                    this.f48904b.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f48904b, PlayCoreMissingSplitsActivity.class), 1, 1);
                    this.f48904b.startActivity(new Intent(this.f48904b, PlayCoreMissingSplitsActivity.class).addFlags(884998144));
                }
                this.f48905c.exit(0);
            }
            return true;
        }
        if (this.f48906d.mo33680a()) {
            this.f48906d.mo33681b();
            this.f48905c.exit(0);
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m42564c() {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = this.f48904b.getPackageManager();
        try {
            String packageName = this.f48904b.getPackageName();
            if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            return (applicationInfo == null || applicationInfo.metaData == null || !Boolean.TRUE.equals(applicationInfo.metaData.get("com.android.vending.splits.required"))) ? false : true;
        } catch (NameNotFoundException unused) {
            f48903a.mo33688c("App '%s' is not found in the PackageManager", this.f48904b.getPackageName());
            return false;
        }
    }
}
