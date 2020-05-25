package android.arch.lifecycle;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.ac */
public final class C0161ac {
    /* renamed from: a */
    public static C0159aa m372a(Fragment fragment) {
        if (fragment instanceof C0160ab) {
            return fragment.getViewModelStore();
        }
        return C0168e.m376a(fragment).getViewModelStore();
    }

    /* renamed from: a */
    public static C0159aa m373a(FragmentActivity fragmentActivity) {
        if (fragmentActivity instanceof C0160ab) {
            return fragmentActivity.getViewModelStore();
        }
        return C0168e.m377a(fragmentActivity).getViewModelStore();
    }
}
