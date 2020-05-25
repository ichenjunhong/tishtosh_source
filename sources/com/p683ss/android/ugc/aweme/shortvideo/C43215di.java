package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.di */
final /* synthetic */ class C43215di implements OnClickListener {

    /* renamed from: a */
    private final PublishPermissionActivity f109298a;

    /* renamed from: b */
    private final int f109299b;

    C43215di(PublishPermissionActivity publishPermissionActivity, int i) {
        this.f109298a = publishPermissionActivity;
        this.f109299b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PublishPermissionActivity publishPermissionActivity = this.f109298a;
        int i = this.f109299b;
        Intent intent = new Intent();
        intent.putExtra("extra.PERMISSION", i);
        publishPermissionActivity.setResult(-1, intent);
        publishPermissionActivity.finish();
    }
}
