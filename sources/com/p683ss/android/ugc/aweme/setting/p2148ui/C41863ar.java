package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ar */
final /* synthetic */ class C41863ar implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106004a;

    C41863ar(TestSettingFragment testSettingFragment) {
        this.f106004a = testSettingFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment testSettingFragment = this.f106004a;
        switch (i) {
            case 0:
                C10691a.m21545b((Context) testSettingFragment.getActivity(), TestSettingFragment.m91814c("shadow_landing") ? "存在" : "不存在").mo19066a();
                return;
            case 1:
                TestSettingFragment.m91815d("shadow_landing");
                return;
            case 2:
                List<String> f = TestSettingFragment.m91816f();
                if (f != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str : f) {
                        sb.append(str);
                        sb.append(" : ");
                        sb.append(TestSettingFragment.m91814c(str) ? "存在" : "不存在");
                        sb.append("\n");
                    }
                    C10691a.m21545b((Context) testSettingFragment.getActivity(), sb.toString()).mo19066a();
                    return;
                }
                break;
            case 3:
                List<String> f2 = TestSettingFragment.m91816f();
                if (f2 != null) {
                    for (String d : f2) {
                        TestSettingFragment.m91815d(d);
                    }
                    return;
                }
                break;
            case 4:
                testSettingFragment.mo85718a(C22858c.f61207c);
                return;
            case 5:
                testSettingFragment.mo85719b(C22858c.f61207c);
                return;
            case 6:
                testSettingFragment.mo85718a("splash");
                return;
            case 7:
                testSettingFragment.mo85719b("splash");
                break;
        }
    }
}
