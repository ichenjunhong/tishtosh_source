package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.a */
public final class C45331a {

    /* renamed from: a */
    private final WeakReference<Activity> f114615a;

    /* renamed from: b */
    private final WeakReference<Fragment> f114616b;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Fragment mo91623b() {
        if (this.f114616b != null) {
            return (Fragment) this.f114616b.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Activity mo91621a() {
        return (Activity) this.f114615a.get();
    }

    private C45331a(Activity activity) {
        this(activity, null);
    }

    /* renamed from: a */
    public static C45331a m98815a(Activity activity) {
        return new C45331a(activity);
    }

    /* renamed from: b */
    public static List<String> m98819b(Intent intent) {
        return intent.getStringArrayListExtra("extra_result_selection_path");
    }

    private C45331a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    /* renamed from: a */
    public static C45331a m98816a(Fragment fragment) {
        return new C45331a(fragment);
    }

    /* renamed from: a */
    public static List<Uri> m98818a(Intent intent) {
        return intent.getParcelableArrayListExtra("extra_result_selection");
    }

    /* renamed from: a */
    public final C45337c mo91622a(Set<C45333b> set) {
        return m98817a(set, true);
    }

    private C45331a(Activity activity, Fragment fragment) {
        this.f114615a = new WeakReference<>(activity);
        this.f114616b = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    private C45337c m98817a(Set<C45333b> set, boolean z) {
        return new C45337c(this, set, true);
    }
}
