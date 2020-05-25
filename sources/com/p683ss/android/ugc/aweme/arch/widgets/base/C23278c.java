package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.app.Application;
import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0211a;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.c */
public final class C23278c {
    /* renamed from: a */
    public static C0210y m57253a(Fragment fragment) {
        return C0214z.m438a(fragment);
    }

    /* renamed from: a */
    public static C0210y m57255a(FragmentActivity fragmentActivity) {
        return C0214z.m440a(fragmentActivity);
    }

    /* renamed from: a */
    public static C0210y m57254a(Fragment fragment, C0160ab abVar) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            if (application != null) {
                return new C0210y(abVar.getViewModelStore(), C0211a.m433a(application));
            }
            throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
