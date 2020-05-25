package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28595bs;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28598bu.C28600a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.b */
public final class C28352b extends C27849b {

    /* renamed from: c */
    public C28595bs f74441c;

    /* renamed from: d */
    public List<SearchChallenge> f74442d;

    /* renamed from: d */
    public final View mo56209d() {
        if (this.f74441c != null) {
            return this.f74441c.mo58292b();
        }
        return null;
    }

    public C28352b(View view, Context context, boolean z) {
        super(view);
        this.f74441c = new C28595bs(view, context, z, new C28600a() {
            /* renamed from: a */
            public final void mo56761a() {
                C26890h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C23088c.m56631a().mo47824a("search_type", "challenge").mo47825b()));
                HashMap hashMap = new HashMap();
                hashMap.put("token_type", "hot_challenge");
                hashMap.put("aladdin_button_type", "click_more_button");
                if (C28352b.this.f74442d != null && C28352b.this.f74442d.size() > 0) {
                    SearchChallenge searchChallenge = (SearchChallenge) C28352b.this.f74442d.get(0);
                    hashMap.put("search_result_id", searchChallenge.getChallenge().getCid());
                    hashMap.put("hashtags_name", searchChallenge.getChallenge().getChallengeName());
                }
                C28352b.this.mo56272b(hashMap);
                C47718bf.m103288a(new C28107o(C28608ca.f75139g));
            }
        });
        if (z) {
            C9432q.m18691b(view.findViewById(R.id.ax6), 8);
        }
        if (this.f74441c.f75119d != null) {
            this.f74441c.f75119d.setFontType(C10751d.f28908g);
        }
    }
}
