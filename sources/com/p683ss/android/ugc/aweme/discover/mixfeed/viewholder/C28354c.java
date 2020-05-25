package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28598bu.C28600a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28602bw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.c */
public final class C28354c extends C27849b {

    /* renamed from: c */
    public C28602bw f74444c;

    /* renamed from: d */
    public Music f74445d;

    /* renamed from: d */
    public final View mo56209d() {
        if (this.f74444c != null) {
            return this.f74444c.mo58292b();
        }
        return null;
    }

    public C28354c(View view, Context context, boolean z) {
        super(view);
        this.f74444c = new C28602bw(view, context, z, new C28600a() {
            /* renamed from: a */
            public final void mo56761a() {
                String a = C28381ab.m67359d().mo56813a(3);
                C23089d a2 = C23089d.m56640a().mo47829a("token_type", "music").mo47829a("enter_from", "general_search").mo47829a("button_type", "click_more_button").mo47829a("impr_id", a).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a)).mo47829a("search_id", a).mo47829a("search_keyword", C28354c.this.mo56269a().mo56235b()).mo47826a("rank", C28354c.this.getAdapterPosition()).mo47829a("is_aladdin", "0");
                if (C28354c.this.f74445d != null) {
                    a2.mo47829a("search_result_id", C28354c.this.f74445d.getMid());
                }
                C26890h.m65011a("search_result_click", a2.f61491a);
                C26890h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C23088c.m56631a().mo47824a("search_type", "music").mo47825b()));
                C47718bf.m103288a(new C28107o(C28608ca.f75138f));
            }
        });
        if (z) {
            C9432q.m18691b(view.findViewById(R.id.ax6), 8);
        }
        if (this.f74444c.f75119d != null) {
            this.f74444c.f75119d.setFontType(C10751d.f28908g);
        }
    }
}
