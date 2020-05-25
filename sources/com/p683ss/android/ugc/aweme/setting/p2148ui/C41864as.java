package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.as */
final /* synthetic */ class C41864as implements OnClickListener {

    /* renamed from: a */
    private final TestSettingFragment f106005a;

    C41864as(TestSettingFragment testSettingFragment) {
        this.f106005a = testSettingFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        TestSettingFragment testSettingFragment = this.f106005a;
        String obj = testSettingFragment.mWebusedefaultEditText.getEditableText().toString();
        if (!TextUtils.isEmpty(obj)) {
            String trim = obj.trim();
            Intent intent = new Intent(testSettingFragment.getActivity(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(trim));
            intent.putExtra("title", "Web测试页");
            testSettingFragment.startActivity(intent);
        }
    }
}
