package com.bytedance.apm.agent.p470v2.instrumentation;

import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.helper.PageShowCallback;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.FragmentShowAgent */
public class FragmentShowAgent {
    private static final String TAG = "FragmentShowAgent";

    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, false);
        }
    }

    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, true);
        }
    }

    public static void onHiddenChanged(Fragment fragment, boolean z) {
        PageShowCallback.onPageShowHideAction(fragment, !z);
    }

    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            PageShowCallback.onPageShowHideAction(fragment, z);
        }
    }
}
