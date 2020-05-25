package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.setting.C41537am;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.aq */
final /* synthetic */ class C41862aq implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106003a;

    C41862aq(TestSettingFragment testSettingFragment) {
        this.f106003a = testSettingFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TestSettingFragment testSettingFragment = this.f106003a;
        switch (i) {
            case 0:
                C41537am.m91367a(C50116c.Ijk);
                testSettingFragment.mExoPlayerSwitch.setStartText("IJK");
                return;
            case 1:
                if (VERSION.SDK_INT >= 17) {
                    C41537am.m91367a(C50116c.IjkHardware);
                    testSettingFragment.mExoPlayerSwitch.setStartText("IJK_HARDWARE");
                    return;
                }
                C10691a.m21552c((Context) testSettingFragment.getActivity(), "4.3以下版本默认不开启硬解", 0).mo19066a();
                return;
            case 2:
                C41537am.m91367a(C50116c.EXO);
                testSettingFragment.mExoPlayerSwitch.setStartText("EXO");
                break;
        }
    }
}
