package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.lifecycle.e */
public final class C0168e extends Fragment implements C0160ab {

    /* renamed from: a */
    private static final C0169a f420a = new C0169a();

    /* renamed from: b */
    private C0159aa f421b = new C0159aa();

    /* renamed from: android.arch.lifecycle.e$a */
    static class C0169a {

        /* renamed from: a */
        public Map<Activity, C0168e> f422a = new HashMap();

        /* renamed from: b */
        public Map<Fragment, C0168e> f423b = new HashMap();

        /* renamed from: c */
        ActivityLifecycleCallbacks f424c = new C0166c() {
            public final void onActivityDestroyed(Activity activity) {
                C0169a.this.f422a.remove(activity);
            }
        };

        /* renamed from: d */
        boolean f425d = false;

        /* renamed from: e */
        C0655a f426e = new C0655a() {
            public final void onFragmentDestroyed(C0654k kVar, Fragment fragment) {
                super.onFragmentDestroyed(kVar, fragment);
                C0169a.this.f423b.remove(fragment);
            }
        };

        C0169a() {
        }

        /* renamed from: b */
        static C0168e m379b(C0654k kVar) {
            C0168e eVar = new C0168e();
            kVar.mo2225a().mo2178a((Fragment) eVar, "android.arch.lifecycle.state.StateProviderHolderFragment").mo2195c();
            return eVar;
        }

        /* renamed from: a */
        static C0168e m378a(C0654k kVar) {
            if (!kVar.mo2239g()) {
                Fragment a = kVar.mo2224a("android.arch.lifecycle.state.StateProviderHolderFragment");
                if (a == null || (a instanceof C0168e)) {
                    return (C0168e) a;
                }
                throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
            }
            throw new IllegalStateException("Can't access ViewModels from onDestroy");
        }
    }

    public final C0159aa getViewModelStore() {
        return this.f421b;
    }

    public C0168e() {
        setRetainInstance(true);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f421b.mo301a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static C0168e m376a(Fragment fragment) {
        C0169a aVar = f420a;
        C0654k childFragmentManager = fragment.getChildFragmentManager();
        C0168e a = C0169a.m378a(childFragmentManager);
        if (a != null) {
            return a;
        }
        C0168e eVar = (C0168e) aVar.f423b.get(fragment);
        if (eVar != null) {
            return eVar;
        }
        fragment.getFragmentManager().mo2229a(aVar.f426e, false);
        C0168e b = C0169a.m379b(childFragmentManager);
        aVar.f423b.put(fragment, b);
        return b;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0169a aVar = f420a;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            aVar.f423b.remove(parentFragment);
            parentFragment.getFragmentManager().mo2228a(aVar.f426e);
            return;
        }
        aVar.f422a.remove(getActivity());
    }

    /* renamed from: a */
    public static C0168e m377a(FragmentActivity fragmentActivity) {
        C0169a aVar = f420a;
        C0654k supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C0168e a = C0169a.m378a(supportFragmentManager);
        if (a != null) {
            return a;
        }
        C0168e eVar = (C0168e) aVar.f422a.get(fragmentActivity);
        if (eVar != null) {
            return eVar;
        }
        if (!aVar.f425d) {
            aVar.f425d = true;
            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(aVar.f424c);
        }
        C0168e b = C0169a.m379b(supportFragmentManager);
        aVar.f422a.put(fragmentActivity, b);
        return b;
    }
}
