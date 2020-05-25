package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Application;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jirafast.p749b.C12000d;
import com.bytedance.jirafast.p749b.C12001e;
import com.p683ss.android.ugc.aweme.util.C47626j;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.activity.l */
final /* synthetic */ class C23433l implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62498a;

    /* renamed from: b */
    private final String f62499b;

    C23433l(CustomErrorActivity customErrorActivity, String str) {
        this.f62498a = customErrorActivity;
        this.f62499b = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62498a;
        String str = this.f62499b;
        Application application = customErrorActivity.getApplication();
        if (C47626j.m103108b()) {
            C47626j.m103107a(application);
            ArrayList arrayList = new ArrayList();
            arrayList.add(C12001e.obtainTxt(str, "crash"));
            StringBuilder sb = new StringBuilder("[Android]");
            sb.append(C47626j.m103109c());
            sb.append(" 16.0.41");
            sb.append(" Crash");
            C12000d dVar = new C12000d(arrayList, "", "", sb.toString(), "", null, "");
            C47626j.m103105a().mo22738a(dVar);
        }
    }
}
