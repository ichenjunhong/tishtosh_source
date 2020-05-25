package com.p683ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.view.b */
public final class C36747b extends AbsLiveStoryItemView {

    /* renamed from: j */
    private String f93916j;

    /* renamed from: k */
    private boolean f93917k;

    public final void onClick(View view) {
        String str;
        if (this.f93917k) {
            str = "toplist_homepage_follow";
        } else {
            str = this.f93914i;
        }
        C46641d.m101210a(str);
        Bundle bundle = new Bundle();
        bundle.putString("request_id", this.f93913h);
        bundle.putString("style", "head");
        bundle.putString("position", "live_merge");
        bundle.putString("toplist_page", str);
        bundle.putInt("tab_type", 0);
        C36173w.m81665a().getLiveWatcherUtils().mo70089a(getContext(), bundle);
    }

    public C36747b(Context context, boolean z) {
        String str;
        super(context, z);
        if (z) {
            str = "homepage_follow";
        } else {
            str = "homepage_hot";
        }
        this.f93916j = str;
        this.f93917k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo53039a(Context context, boolean z) {
        int i;
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            i = R.layout.vg;
        } else {
            i = R.layout.vf;
        }
        return from.inflate(i, this, true);
    }
}
