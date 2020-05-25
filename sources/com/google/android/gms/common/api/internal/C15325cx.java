package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.internal.p1043d.C16482d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cx */
public final class C15325cx extends Fragment implements C15335g {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<C15325cx>> f39556a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f39557b = new C0777a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f39558c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f39559d;

    /* renamed from: a */
    public static C15325cx m31825a(Activity activity) {
        WeakReference weakReference = (WeakReference) f39556a.get(activity);
        if (weakReference != null) {
            C15325cx cxVar = (C15325cx) weakReference.get();
            if (cxVar != null) {
                return cxVar;
            }
        }
        try {
            C15325cx cxVar2 = (C15325cx) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (cxVar2 == null || cxVar2.isRemoving()) {
                cxVar2 = new C15325cx();
                activity.getFragmentManager().beginTransaction().add(cxVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f39556a.put(activity, new WeakReference(cxVar2));
            return cxVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo28247a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f39557b.get(str));
    }

    /* renamed from: a */
    public final void mo28248a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f39557b.containsKey(str)) {
            this.f39557b.put(str, lifecycleCallback);
            if (this.f39558c > 0) {
                new C16482d(Looper.getMainLooper()).post(new C15326cy(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final Activity mo28246a() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39558c = 1;
        this.f39559d = bundle;
        for (Entry entry : this.f39557b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo28141a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f39558c = 2;
        for (LifecycleCallback b : this.f39557b.values()) {
            b.mo28143b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f39558c = 3;
        for (LifecycleCallback c : this.f39557b.values()) {
            c.mo28145c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f39557b.values()) {
            a.mo28140a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f39557b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo28144b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f39558c = 4;
        for (LifecycleCallback d : this.f39557b.values()) {
            d.mo28146d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f39558c = 5;
        Iterator it = this.f39557b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f39557b.values()) {
            a.mo28142a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
