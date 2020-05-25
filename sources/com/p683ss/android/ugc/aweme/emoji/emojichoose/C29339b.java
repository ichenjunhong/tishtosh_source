package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.b */
final /* synthetic */ class C29339b implements OnClickListener {

    /* renamed from: a */
    private final Context f76817a;

    C29339b(Context context) {
        this.f76817a = context;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Context context = this.f76817a;
        context.startActivity(SmartRouter.buildRoute(context, "emoji_manager").buildIntent());
    }
}
