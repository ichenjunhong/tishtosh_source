package com.p683ss.android.ugc.aweme.browserecord.p1464a;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.a.d */
public final class C23995d extends C1352v {

    /* renamed from: a */
    public final String f63702a;

    /* renamed from: b */
    private final View f63703b;

    public C23995d(final View view, String str) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(str, "enterFrom");
        super(view);
        this.f63702a = str;
        View findViewById = view.findViewById(R.id.atp);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.info)");
        this.f63703b = findViewById;
        this.f63703b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C23995d f63704a;

            {
                this.f63704a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26890h.m65011a("click_privacy_tips", (Map<String, String>) C52550ab.m112057c(C52856t.m112465a("enter_from", this.f63704a.f63702a)));
                SharePrefCache inst = SharePrefCache.inst();
                C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
                C23051bf privacyReminderH5Url = inst.getPrivacyReminderH5Url();
                C52711k.m112236a((Object) privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
                String str = (String) privacyReminderH5Url.mo47782d();
                if (!TextUtils.isEmpty(str)) {
                    C32616c cVar = C32616c.f84865a;
                    Context context = view.getContext();
                    C52711k.m112236a((Object) context, "view.context");
                    C52711k.m112236a((Object) str, "url");
                    cVar.openPrivacyReminder(context, str);
                }
            }
        });
    }
}
