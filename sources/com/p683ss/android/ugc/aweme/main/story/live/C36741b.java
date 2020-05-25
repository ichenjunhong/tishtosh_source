package com.p683ss.android.ugc.aweme.main.story.live;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36733a;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36734b;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36737c;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p683ss.android.ugc.aweme.main.story.live.view.C36747b;
import com.p683ss.android.ugc.aweme.main.story.live.view.C36748c;
import com.p683ss.android.ugc.aweme.setting.C41589c;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.b */
public final class C36741b {
    /* renamed from: a */
    public static C36732a m82691a(Context context, boolean z) {
        C36733a aVar;
        C41589c.m91432a();
        int h = C41589c.m91436h();
        AbsLiveStoryItemView absLiveStoryItemView = null;
        if (h == 1) {
            absLiveStoryItemView = new C36747b(context, z);
            absLiveStoryItemView.setPadding((int) C9432q.m18687b(context, 16.0f), 0, 0, 0);
            aVar = new C36734b();
        } else if (h == 0) {
            absLiveStoryItemView = new C36748c(context, z);
            absLiveStoryItemView.setPadding((int) C9432q.m18687b(context, 16.0f), (int) C9432q.m18687b(context, 2.0f), 0, 0);
            aVar = new C36737c();
        } else {
            aVar = null;
        }
        aVar.mo53033a(absLiveStoryItemView);
        return new C36742c(absLiveStoryItemView, aVar);
    }
}
