package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.a */
public final class C35178a {
    /* renamed from: a */
    public static void m79421a(View view, final String str) {
        if (view != null && str != null) {
            C1056u.m3031a(view, (C1002a) new C1002a() {
                /* renamed from: a */
                public final void mo1119a(View view, C1008c cVar) {
                    super.mo1119a(view, cVar);
                    if (!TextUtils.isEmpty(str)) {
                        view.setContentDescription(str);
                    }
                    cVar.mo3139b((CharSequence) DmtTextView.class.getName());
                }
            });
        }
    }

    /* renamed from: a */
    public static void m79422a(ImageView imageView, final IMUser iMUser) {
        if (imageView != null && iMUser != null) {
            C1056u.m3031a((View) imageView, (C1002a) new C1002a() {
                /* renamed from: a */
                public final void mo1119a(View view, C1008c cVar) {
                    super.mo1119a(view, cVar);
                    view.setContentDescription(iMUser.getDisplayName());
                    cVar.mo3139b((CharSequence) DmtTextView.class.getName());
                }
            });
        }
    }
}
