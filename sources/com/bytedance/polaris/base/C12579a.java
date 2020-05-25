package com.bytedance.polaris.base;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.polaris.p821a.C12563i;

/* renamed from: com.bytedance.polaris.base.a */
public abstract class C12579a extends Fragment implements C12580b {

    /* renamed from: a */
    protected boolean f33021a;

    /* renamed from: b */
    protected boolean f33022b;

    /* renamed from: c */
    protected boolean f33023c;

    /* renamed from: p_ */
    public final boolean mo23639p_() {
        return this.f33021a;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f33022b = false;
    }

    public void onPause() {
        super.onPause();
        this.f33021a = false;
    }

    public void onResume() {
        super.onResume();
        this.f33021a = true;
    }

    public void onStop() {
        super.onStop();
        this.f33021a = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f33022b = false;
        this.f33023c = true;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33021a = false;
        this.f33022b = false;
        this.f33023c = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f33022b = true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C12563i.m25225g();
        getActivity();
    }
}
