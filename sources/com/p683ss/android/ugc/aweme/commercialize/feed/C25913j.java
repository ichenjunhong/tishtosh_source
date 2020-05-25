package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p879t.p881b.C13235c;
import com.bytedance.p879t.p881b.C13239g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.j */
final /* synthetic */ class C25913j implements OnClickListener {

    /* renamed from: a */
    private final CommerceVideoDelegate f68450a;

    C25913j(CommerceVideoDelegate commerceVideoDelegate) {
        this.f68450a = commerceVideoDelegate;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CommerceVideoDelegate commerceVideoDelegate = this.f68450a;
        C13235c c = C26469cc.m64002c(commerceVideoDelegate.f68301c);
        if (c != null && !C9376b.m18558a((Collection<T>) c.clickList)) {
            C26471cd.m64008a(c);
            for (C13239g gVar : c.clickList) {
                if (!TextUtils.isEmpty(gVar.clickThrough)) {
                    C26540w.m64214a(commerceVideoDelegate.f68308j, commerceVideoDelegate.f68301c, gVar.clickThrough, (String) null);
                    return;
                }
            }
        }
    }
}
