package com.p683ss.android.ugc.aweme.main;

import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.ee */
public final class C36637ee extends Fragment {
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }
}
