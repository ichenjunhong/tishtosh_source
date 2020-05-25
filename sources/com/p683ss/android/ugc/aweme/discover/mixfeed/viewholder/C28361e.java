package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28107o;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28590bp.C28592a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.discover.p1659ui.SearchMixUserCell;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.e */
public final class C28361e extends C27849b {

    /* renamed from: c */
    public SearchMixUserCell f74459c;

    /* renamed from: d */
    public List<SearchUser> f74460d;

    /* renamed from: d */
    public final View mo56209d() {
        if (this.f74459c != null) {
            return this.f74459c.mo58282a();
        }
        return null;
    }

    public C28361e(View view, Context context, boolean z) {
        super(view);
        this.f74459c = new SearchMixUserCell(view, context, new C28592a() {
            /* renamed from: a */
            public final void mo56765a() {
                C26890h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C23088c.m56631a().mo47824a("search_type", "user").mo47825b()));
                HashMap hashMap = new HashMap();
                if (C28361e.this.f74460d != null && C28361e.this.f74460d.size() > 0) {
                    SearchUser searchUser = (SearchUser) C28361e.this.f74460d.get(0);
                    hashMap.put("search_result_id", searchUser.user.getUid());
                    hashMap.put("user_name", searchUser.user.getUniqueId());
                    if (searchUser.cardType() == 1) {
                        hashMap.put("token_type", "hot_user");
                        hashMap.put("aladdin_button_type", "click_more_button");
                    } else {
                        hashMap.put("token_type", "person");
                        hashMap.put("button_type", "click_more_button");
                    }
                }
                C28361e.this.mo56272b(hashMap);
                C47718bf.m103288a(new C28107o(C28608ca.f75136d));
            }
        }, this);
        this.f74459c.mo58116b(z);
        if (z) {
            C9432q.m18691b(view.findViewById(R.id.ax6), 8);
        }
        if (this.f74459c.f75105c != null) {
            this.f74459c.f75105c.setFontType(C10751d.f28908g);
        }
    }
}
