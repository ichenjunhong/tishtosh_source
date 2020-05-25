package com.bytedance.polaris.browser;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.polaris.browser.d */
final class C12622d {

    /* renamed from: i */
    private static Set<String> f33147i;

    /* renamed from: a */
    WeakReference<Context> f33148a;

    /* renamed from: b */
    boolean f33149b = true;

    /* renamed from: c */
    boolean f33150c = true;

    /* renamed from: d */
    boolean f33151d = true;

    /* renamed from: e */
    boolean f33152e = true;

    /* renamed from: f */
    boolean f33153f = true;

    /* renamed from: g */
    boolean f33154g = true;

    /* renamed from: h */
    boolean f33155h = true;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f33147i = linkedHashSet;
        linkedHashSet.add("device_id");
        f33147i.add("ac");
        f33147i.add("channel");
        f33147i.add("aid");
        f33147i.add("device_platform");
        f33147i.add("device_type");
        f33147i.add("os_api");
        f33147i.add("update_version_code");
    }

    C12622d(Context context) {
        this.f33148a = new WeakReference<>(context);
    }
}
