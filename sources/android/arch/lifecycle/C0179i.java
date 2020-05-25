package android.arch.lifecycle;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.i */
final class C0179i {

    /* renamed from: a */
    static AtomicBoolean f436a = new AtomicBoolean(false);

    /* renamed from: android.arch.lifecycle.i$a */
    public static class C0180a extends Fragment {
        public final void onDestroy() {
            super.onDestroy();
            m392a(C0177a.ON_DESTROY);
        }

        public final void onPause() {
            super.onPause();
            m392a(C0177a.ON_PAUSE);
        }

        public final void onStop() {
            super.onStop();
            m392a(C0177a.ON_STOP);
        }

        /* renamed from: a */
        private void m392a(C0177a aVar) {
            C0179i.m388a(getParentFragment(), aVar);
        }
    }

    /* renamed from: android.arch.lifecycle.i$b */
    static class C0181b extends C0166c {

        /* renamed from: a */
        private final C0182c f437a = new C0182c();

        C0181b() {
        }

        public final void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                C0179i.m389a((FragmentActivity) activity, C0178b.CREATED);
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                C0179i.m389a((FragmentActivity) activity, C0178b.CREATED);
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().mo2229a((C0655a) this.f437a, true);
            }
            C0205v.m426a(activity);
        }
    }

    /* renamed from: android.arch.lifecycle.i$c */
    static class C0182c extends C0655a {
        C0182c() {
        }

        public final void onFragmentResumed(C0654k kVar, Fragment fragment) {
            C0179i.m388a(fragment, C0177a.ON_RESUME);
        }

        public final void onFragmentStarted(C0654k kVar, Fragment fragment) {
            C0179i.m388a(fragment, C0177a.ON_START);
        }

        public final void onFragmentCreated(C0654k kVar, Fragment fragment, Bundle bundle) {
            C0179i.m388a(fragment, C0177a.ON_CREATE);
            if ((fragment instanceof C0188m) && fragment.getChildFragmentManager().mo2224a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.getChildFragmentManager().mo2225a().mo2178a((Fragment) new C0180a(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo2189b();
            }
        }
    }

    /* renamed from: a */
    public static void m388a(Fragment fragment, C0177a aVar) {
        if (fragment instanceof C0188m) {
            ((C0188m) fragment).mo335a().mo332a(aVar);
        }
    }

    /* renamed from: a */
    public static void m389a(FragmentActivity fragmentActivity, C0178b bVar) {
        m391a((Object) fragmentActivity, bVar);
        m390a(fragmentActivity.getSupportFragmentManager(), bVar);
    }

    /* renamed from: a */
    private static void m390a(C0654k kVar, C0178b bVar) {
        List<Fragment> f = kVar.mo2238f();
        if (f != null) {
            for (Fragment fragment : f) {
                if (fragment != null) {
                    m391a((Object) fragment, bVar);
                    if (fragment.isAdded()) {
                        m390a(fragment.getChildFragmentManager(), bVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m391a(Object obj, C0178b bVar) {
        if (obj instanceof C0188m) {
            ((C0188m) obj).mo335a().mo333a(bVar);
        }
    }
}
