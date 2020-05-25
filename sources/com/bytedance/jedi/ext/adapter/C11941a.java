package com.bytedance.jedi.ext.adapter;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.a */
public final class C11941a {
    /* renamed from: a */
    public static final Object m24314a(Object obj) {
        C52711k.m112240b(obj, "host");
        if ((obj instanceof Fragment) || (obj instanceof FragmentActivity)) {
            return obj;
        }
        if (obj instanceof Widget) {
            return ((Widget) obj).mo25062n();
        }
        if (obj instanceof JediViewHolder) {
            return m24314a(((JediViewHolder) obj).mo22678n());
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final FragmentActivity m24315b(Object obj) {
        C52711k.m112240b(obj, "host");
        if (obj instanceof Fragment) {
            FragmentActivity requireActivity = ((Fragment) obj).requireActivity();
            C52711k.m112236a((Object) requireActivity, "host.requireActivity()");
            return requireActivity;
        } else if (obj instanceof FragmentActivity) {
            return (FragmentActivity) obj;
        } else {
            if (obj instanceof Widget) {
                return m24315b(((Widget) obj).mo25062n());
            }
            if (obj instanceof JediViewHolder) {
                return m24315b(((JediViewHolder) obj).mo22678n());
            }
            throw new IllegalStateException();
        }
    }
}
