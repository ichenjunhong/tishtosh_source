package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0210y.C0211a;
import android.arch.lifecycle.C0210y.C0212b;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: android.arch.lifecycle.z */
public final class C0214z {
    /* renamed from: a */
    public static C0210y m438a(Fragment fragment) {
        return m439a(fragment, (C0212b) null);
    }

    /* renamed from: a */
    private static Application m437a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: b */
    private static Activity m442b(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    public static C0210y m440a(FragmentActivity fragmentActivity) {
        return m441a(fragmentActivity, (C0212b) null);
    }

    /* renamed from: a */
    public static C0210y m439a(Fragment fragment, C0212b bVar) {
        Application a = m437a(m442b(fragment));
        if (bVar == null) {
            bVar = C0211a.m433a(a);
        }
        return new C0210y(C0161ac.m372a(fragment), bVar);
    }

    /* renamed from: a */
    public static C0210y m441a(FragmentActivity fragmentActivity, C0212b bVar) {
        Application a = m437a((Activity) fragmentActivity);
        if (bVar == null) {
            bVar = C0211a.m433a(a);
        }
        return new C0210y(C0161ac.m373a(fragmentActivity), bVar);
    }
}
