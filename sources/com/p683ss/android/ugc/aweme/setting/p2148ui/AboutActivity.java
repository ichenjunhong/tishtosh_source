package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.component.C23497a;
import com.p683ss.android.ugc.aweme.base.component.C23497a.C23499a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AboutActivity */
public class AboutActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    Dialog f105591a;

    /* renamed from: b */
    private AwemeAppData f105592b;
    CommonItemView mCopyEmail;
    TextView mVersionView;
    CommonItemView mVisitWebsite;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.a4;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void exit(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f105592b = AwemeAppData.m47851a();
        this.mVersionView.setText(this.f105592b.mo40804b());
        this.mVisitWebsite.setOnClickListener(this);
        this.mCopyEmail.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.dsd) {
            if (this.f105591a == null) {
                C23499a aVar = new C23499a();
                aVar.f62588a = "https://www.tiktokv.com/i18n/home/";
                C23497a aVar2 = new C23497a(this);
                aVar2.f62585a = aVar;
                this.f105591a = aVar2;
            }
            this.f105591a.show();
            return;
        }
        if (id == R.id.a0k) {
            ((ClipboardManager) getSystemService("clipboard")).setText("tik_tok@amemv.com");
            C10691a.m21533a((Context) this, (int) R.string.aiv).mo19066a();
        }
    }
}
