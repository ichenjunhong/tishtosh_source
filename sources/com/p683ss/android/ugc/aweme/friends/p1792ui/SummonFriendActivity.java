package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity */
public class SummonFriendActivity extends AbsSummonFriendActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", true);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.yw);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = C26894c.m65020a((Context) this);
        findViewById.setLayoutParams(layoutParams);
        C23729p.m58269c((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity", "onCreate", false);
    }
}
