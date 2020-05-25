package com.p683ss.android.ugc.aweme.base.activity;

import android.support.p030v4.app.Fragment;
import android.view.View;
import android.widget.TabHost.OnTabChangeListener;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11156b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeAbsTabActivity */
public abstract class AmeAbsTabActivity extends AmeSSActivity implements OnTabChangeListener {

    /* renamed from: a */
    protected Map<String, WeakReference<View>> f62452a = new HashMap();

    /* renamed from: b */
    protected final C11156b f62453b = new C11156b() {
        /* renamed from: a */
        public final void mo20095a(String str, Fragment fragment, Fragment fragment2) {
            if (fragment != null) {
                fragment.setUserVisibleHint(true);
            }
            if (fragment2 != null) {
                fragment2.setUserVisibleHint(false);
            }
        }
    };
}
