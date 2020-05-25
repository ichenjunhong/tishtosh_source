package com.bytedance.scene;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.bytedance.scene.p841c.C12880l;

/* renamed from: com.bytedance.scene.f */
public final class C12890f extends Fragment {

    /* renamed from: a */
    public C12891a f33731a;

    /* renamed from: b */
    public C12934l f33732b;

    /* renamed from: com.bytedance.scene.f$a */
    public interface C12891a {
        /* renamed from: a */
        void mo24361a();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.f33732b != null) {
            this.f33732b.mo24497e();
        }
    }

    public final void onDetach() {
        super.onDetach();
        if (this.f33731a != null) {
            this.f33731a.mo24361a();
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f33732b != null) {
            this.f33732b.mo24495c();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f33732b != null) {
            this.f33732b.mo24494b();
        }
    }

    public final void onStart() {
        super.onStart();
        if (this.f33732b != null) {
            this.f33732b.mo24491a();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f33732b != null) {
            this.f33732b.mo24496d();
        }
    }

    /* renamed from: a */
    public static C12890f m25812a(boolean z) {
        return new C12890f();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f33732b != null) {
            this.f33732b.mo24493a(bundle);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f33732b != null) {
            this.f33732b.mo24492a(getActivity(), bundle);
            return;
        }
        FragmentManager fragmentManager = getActivity().getFragmentManager();
        C12880l.m25804a(fragmentManager, fragmentManager.beginTransaction().remove(this), false);
    }
}
