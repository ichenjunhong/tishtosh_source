package com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1611ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1610a.C27075a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39984r;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity */
public class PrivacyAccountTipActivity extends AmeSSActivity implements OnClickListener, C39985s {

    /* renamed from: a */
    boolean f71430a;

    /* renamed from: b */
    C39984r f71431b;

    /* renamed from: c */
    private boolean f71432c;

    /* renamed from: d */
    private TextView f71433d;

    /* renamed from: e */
    private TextView f71434e;

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public void onBackPressed() {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private static String m65305b() {
        if (C27075a.m65302b() == 3) {
            return "go_private";
        }
        return "turn_on_private_account";
    }

    /* renamed from: c */
    private static String m65306c() {
        if (C27075a.m65302b() == 2) {
            return "remind_me_later";
        }
        return "skip";
    }

    /* renamed from: d */
    private static String m65307d() {
        if (C27075a.m65302b() == 3) {
            return "left_right";
        }
        return "up_down";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo55311a() {
        this.f71431b = C40733z.f103767a.newUserPresenter();
        this.f71431b.mo81850a((C39985s) this);
    }

    /* renamed from: a */
    private void m65304a(String str) {
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("confirm_content", m65305b()).mo47829a("cancel_content", m65306c()).mo47829a("button_design", m65307d()).f61491a);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C32800a.m75679a(view)) {
            int id = view.getId();
            if (id == R.id.e0p) {
                C23794bh.m58381G().mo47254o();
                SettingServiceImpl.createISettingServicebyMonsterPlugin().providePushSettingChangePresenter().mo44934a_("notify_private_account", Integer.valueOf(1));
                finish();
                m65304a("tns_privacy_notify_skip");
                return;
            }
            if (id == R.id.e0o) {
                if (!this.f71432c) {
                    if (isViewValid()) {
                        new C10643a(this).mo18899b((int) R.string.ayb).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.b98, (DialogInterface.OnClickListener) new C27076a(this)).mo18897a().mo18882b();
                    }
                    m65304a("tns_privacy_notify_enable");
                    return;
                }
                SettingServiceImpl.createISettingServicebyMonsterPlugin().providePushSettingChangePresenter().mo44934a_("notify_private_account", Integer.valueOf(1));
                C27075a.m65303b("privacy_account_setting_confirm", this.f71430a);
                C23794bh.m58381G().mo47255p();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C27075a.m65302b() == 3) {
            i = R.layout.b7r;
        } else {
            i = R.layout.b7q;
        }
        setContentView(i);
        this.f71433d = (TextView) findViewById(R.id.e0p);
        this.f71434e = (TextView) findViewById(R.id.e0o);
        switch (C27075a.m65302b()) {
            case 2:
                this.f71433d.setText(getString(R.string.h43));
                this.f71434e.setText(getString(R.string.aya));
                break;
            case 3:
                this.f71433d.setText(getString(R.string.dkg));
                this.f71434e.setText(getString(R.string.h42));
                break;
            default:
                this.f71433d.setText(getString(R.string.dkg));
                this.f71434e.setText(getString(R.string.aya));
                break;
        }
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.ze);
        TextView textView3 = (TextView) findViewById(R.id.sf);
        this.f71432c = C23794bh.m58381G().mo47251l();
        if (this.f71432c) {
            this.f71433d.setVisibility(8);
            textView.setText(R.string.cm);
            this.f71434e.setText(R.string.b_b);
            textView2.setText(R.string.ayf);
            textView3.setVisibility(8);
        }
        this.f71433d.setOnClickListener(this);
        this.f71434e.setOnClickListener(this);
        if (getIntent() != null) {
            this.f71430a = getIntent().getBooleanExtra("isFirstLaunch", false);
        }
        if (C23794bh.m58381G().mo47251l()) {
            C27075a.m65303b("privacy_account_setting_show", this.f71430a);
        } else {
            C27075a.m65300a("privacy_account_setting_show", this.f71430a);
        }
        m65304a("tns_privacy_notify");
        mo55311a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.PrivacyAccountTipActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (i == 122) {
            C10691a.m21548c((Context) this, (int) R.string.f4j).mo19066a();
        }
    }
}
