package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.aj */
final /* synthetic */ class C41855aj implements OnClickListener {

    /* renamed from: a */
    private final TestDependenciesActivity f105999a;

    C41855aj(TestDependenciesActivity testDependenciesActivity) {
        this.f105999a = testDependenciesActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TestDependenciesActivity testDependenciesActivity = this.f105999a;
        String obj = testDependenciesActivity.f105816a.getText().toString();
        if (testDependenciesActivity.f105817b.size() > 0) {
            if (TextUtils.isEmpty(obj)) {
                testDependenciesActivity.f105818c.mo85695a(testDependenciesActivity.f105817b);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = testDependenciesActivity.f105817b.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.contains(obj)) {
                    arrayList.add(str);
                }
            }
            testDependenciesActivity.f105818c.mo85695a(arrayList);
        }
    }
}
