package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0777a;
import com.google.android.gms.internal.p1043d.C16482d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cz */
public final class C15327cz extends Fragment implements C15335g {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<C15327cz>> f39563a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f39564b = new C0777a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f39565c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f39566d;

    /* renamed from: a */
    public static C15327cz m31831a(FragmentActivity fragmentActivity) {
        WeakReference weakReference = (WeakReference) f39563a.get(fragmentActivity);
        if (weakReference != null) {
            C15327cz czVar = (C15327cz) weakReference.get();
            if (czVar != null) {
                return czVar;
            }
        }
        try {
            C15327cz czVar2 = (C15327cz) fragmentActivity.getSupportFragmentManager().mo2224a("SupportLifecycleFragmentImpl");
            if (czVar2 == null || czVar2.isRemoving()) {
                czVar2 = new C15327cz();
                fragmentActivity.getSupportFragmentManager().mo2225a().mo2178a((Fragment) czVar2, "SupportLifecycleFragmentImpl").mo2195c();
            }
            f39563a.put(fragmentActivity, new WeakReference(czVar2));
            return czVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo28247a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f39564b.get(str));
    }

    /* renamed from: a */
    public final void mo28248a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f39564b.containsKey(str)) {
            this.f39564b.put(str, lifecycleCallback);
            if (this.f39565c > 0) {
                new C16482d(Looper.getMainLooper()).post(new C15332da(this, lifecycleCallback, str));
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

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39565c = 1;
        this.f39566d = bundle;
        for (Entry entry : this.f39564b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo28141a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f39565c = 2;
        for (LifecycleCallback b : this.f39564b.values()) {
            b.mo28143b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f39565c = 3;
        for (LifecycleCallback c : this.f39564b.values()) {
            c.mo28145c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f39564b.values()) {
            a.mo28140a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f39564b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo28144b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f39565c = 4;
        for (LifecycleCallback d : this.f39564b.values()) {
            d.mo28146d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f39565c = 5;
        Iterator it = this.f39564b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f39564b.values()) {
            a.mo28142a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Activity mo28246a() {
        return getActivity();
    }
}
