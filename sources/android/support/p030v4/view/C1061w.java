package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v4.view.w */
public final class C1061w {
    /* renamed from: a */
    public static int m3091a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        return ((C1048m) viewGroup).getNestedScrollAxes();
    }

    /* renamed from: a */
    public static void m3092a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(false);
        } else {
            viewGroup.setTag(R.id.cxj, Boolean.valueOf(false));
        }
    }
}
