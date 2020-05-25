package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cs */
public final /* synthetic */ class C42561cs implements OnClickListener {

    /* renamed from: a */
    private final C42559cq f107642a;

    /* renamed from: b */
    private final C42558cp f107643b;

    public C42561cs(C42559cq cqVar, C42558cp cpVar) {
        this.f107642a = cqVar;
        this.f107643b = cpVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C42559cq cqVar = this.f107642a;
        C42558cp cpVar = this.f107643b;
        Activity activity = cqVar.f107637b;
        int i = cqVar.f107639d;
        int permission = cqVar.f107638c.getPermission();
        Intent intent = new Intent(activity, PublishPermissionActivity.class);
        intent.putExtra("extra.TYPE", i);
        intent.putExtra("extra.PERMISSION", permission);
        intent.putExtra("extra.Private.DESCRIPTION", R.string.b3o);
        intent.putExtra("extra.Friend.DESCRIPTION", R.string.b3n);
        activity.startActivityForResult(intent, 2);
        activity.overridePendingTransition(R.anim.dc, R.anim.db);
    }
}
