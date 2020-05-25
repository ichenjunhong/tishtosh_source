package com.p683ss.android.ugc.aweme.live;

import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.story.live.C46641d;

/* renamed from: com.ss.android.ugc.aweme.live.p */
final /* synthetic */ class C36145p implements Runnable {

    /* renamed from: a */
    private final LiveFeedActivity f92556a;

    C36145p(LiveFeedActivity liveFeedActivity) {
        this.f92556a = liveFeedActivity;
    }

    public final void run() {
        Intent intent = this.f92556a.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gd_label");
            if (!TextUtils.isEmpty(stringExtra)) {
                C46641d.m101216a("inner_ad", stringExtra);
            }
        }
    }
}
