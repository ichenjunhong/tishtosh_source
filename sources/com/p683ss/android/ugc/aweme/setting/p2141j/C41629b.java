package com.p683ss.android.ugc.aweme.setting.p2141j;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui.PushSettingManagerFragmentSecondVersion.C41707a;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.j.b */
public final class C41629b {

    /* renamed from: a */
    public static final C41629b f105363a = new C41629b();

    private C41629b() {
    }

    /* renamed from: a */
    public static final void m91504a(ViewGroup viewGroup, List<String> list) {
        C52711k.m112240b(viewGroup, "parentView");
        C52711k.m112240b(list, "showedList");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && (childAt instanceof CommonItemView)) {
                Object tag = childAt.getTag();
                if (tag == null) {
                    childAt.setVisibility(8);
                } else if (tag instanceof String) {
                    String str = (String) tag;
                    if (!TextUtils.isEmpty(str) && !list.contains(str)) {
                        childAt.setVisibility(8);
                    }
                } else if (tag instanceof C41707a) {
                    String str2 = ((C41707a) tag).f105554a;
                    if (!TextUtils.isEmpty(str2) && !list.contains(str2)) {
                        childAt.setVisibility(8);
                    }
                }
            }
        }
    }
}
