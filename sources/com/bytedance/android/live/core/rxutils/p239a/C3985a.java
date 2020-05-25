package com.bytedance.android.live.core.rxutils.p239a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p064c.p065a.p094l.C2178a;

/* renamed from: com.bytedance.android.live.core.rxutils.a.a */
public final class C3985a extends Fragment {

    /* renamed from: a */
    public final C2178a<C3988b> f11118a = C2178a.m6527l();

    public final void onDestroy() {
        super.onDestroy();
        this.f11118a.onNext(C3988b.DESTROY);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f11118a.onNext(C3988b.DESTROY_VIEW);
    }

    public final void onDetach() {
        super.onDetach();
        this.f11118a.onNext(C3988b.DETACH);
    }

    public final void onPause() {
        super.onPause();
        this.f11118a.onNext(C3988b.PAUSE);
    }

    public final void onResume() {
        super.onResume();
        this.f11118a.onNext(C3988b.RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.f11118a.onNext(C3988b.START);
    }

    public final void onStop() {
        super.onStop();
        this.f11118a.onNext(C3988b.STOP);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f11118a.onNext(C3988b.ATTACH);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11118a.onNext(C3988b.CREATE);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f11118a.onNext(C3988b.ATTACH);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f11118a.onNext(C3988b.CREATE_VIEW);
        return null;
    }
}
