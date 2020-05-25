package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.rank.model.C8219f;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.android.livesdk.rank.f.s */
final /* synthetic */ class C8199s implements OnClickListener {

    /* renamed from: a */
    private final C8197a f22385a;

    /* renamed from: b */
    private final C8219f f22386b;

    C8199s(C8197a aVar, C8219f fVar) {
        this.f22385a = aVar;
        this.f22386b = fVar;
    }

    public final void onClick(View view) {
        C8197a aVar = this.f22385a;
        C8219f fVar = this.f22386b;
        if (C8196r.this.f22365b) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "live_take_detail");
            hashMap.put(LeakCanaryFileProvider.f132050j, "rank_pic");
            C8049c.m15979a().mo14202a("pm_live_take_anchor_c_audience", hashMap, new C8060k());
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(fVar.f22442a.getId());
        if (C8196r.this.f22366c == 17) {
            userProfileEvent.setClickUserPosition("single_room_rank");
        } else if (C8196r.this.f22366c == 7) {
            userProfileEvent.setClickUserPosition("weekly_rank");
        } else if (C8196r.this.f22366c == 9) {
            userProfileEvent.setClickUserPosition("totally_rank");
        }
        C4495a.m10823a().mo10301a((Object) userProfileEvent);
    }
}
