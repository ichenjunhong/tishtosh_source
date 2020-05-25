package com.p683ss.android.ugc.aweme.commercialize.p1566f;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse.C46654a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.f.d */
public final class C25833d extends AbsLiveStoryItemView {
    public C25833d(Context context) {
        super(context, false);
    }

    public final void onClick(View view) {
        C46654a aVar = C25831b.f68281a;
        if (aVar != null) {
            Context context = getContext();
            if ((TextUtils.isEmpty(aVar.f117670c) || !C26540w.m64226a(context, aVar.f117670c, false)) && !TextUtils.isEmpty(aVar.f117671d)) {
                C26540w.m64222a(context, aVar.f117671d, aVar.f117672e);
            }
            C26890h.m65011a("click_skylight_entrance", (Map<String, String>) new HashMap<String,String>());
        }
    }

    /* renamed from: a */
    public final View mo53039a(Context context, boolean z) {
        return LayoutInflater.from(context).inflate(R.layout.sq, this, true);
    }
}
