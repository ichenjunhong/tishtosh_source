package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1608a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.a.a */
public final class C27061a {

    /* renamed from: a */
    public static final C27061a f71408a = new C27061a();

    private C27061a() {
    }

    /* renamed from: a */
    public static final void m65278a(int i, ViewGroup viewGroup) {
        if (viewGroup != null) {
            String[] stringArray = C11010c.m22280a().getResources().getStringArray(R.array.b2);
            C52711k.m112236a((Object) stringArray, "AppContextManager.getApp…tStringArray(whiteListId)");
            List e = C52568f.m112084e(stringArray);
            if (!C9376b.m18558a((Collection<T>) e)) {
                List g = C23794bh.m58381G().mo47246g();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if ((tag instanceof String) && !TextUtils.isEmpty((CharSequence) tag) && (!e.contains(tag) || g.contains(tag))) {
                            childAt.setVisibility(8);
                        }
                    }
                }
            }
        }
    }
}
