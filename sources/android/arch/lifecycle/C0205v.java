package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0176h.C0177a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.v */
public final class C0205v extends Fragment {

    /* renamed from: a */
    public C0206a f480a;

    /* renamed from: android.arch.lifecycle.v$a */
    interface C0206a {
        /* renamed from: a */
        void mo348a();

        /* renamed from: b */
        void mo349b();
    }

    public final void onDestroy() {
        super.onDestroy();
        m427a(C0177a.ON_DESTROY);
        this.f480a = null;
    }

    public final void onPause() {
        super.onPause();
        m427a(C0177a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        C0206a aVar = this.f480a;
        if (aVar != null) {
            aVar.mo349b();
        }
        m427a(C0177a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        C0206a aVar = this.f480a;
        if (aVar != null) {
            aVar.mo348a();
        }
        m427a(C0177a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m427a(C0177a.ON_STOP);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m427a(C0177a.ON_CREATE);
    }

    /* renamed from: a */
    public static void m426a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0205v(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m427a(C0177a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0188m) {
            ((C0188m) activity).mo335a().mo332a(aVar);
            return;
        }
        if (activity instanceof C0184k) {
            C0176h lifecycle = ((C0184k) activity).getLifecycle();
            if (lifecycle instanceof C0185l) {
                ((C0185l) lifecycle).mo332a(aVar);
            }
        }
    }
}
