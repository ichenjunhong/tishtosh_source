package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20887a;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20892f;
import com.p683ss.android.ugc.aweme.account.agegate.model.C20893g;
import com.p683ss.android.ugc.aweme.account.api.C20897b;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.p683ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker.C20941a;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.AgeGateBlockExperiment;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.TermsConsentActivity;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21014a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21015b;
import com.p683ss.android.ugc.aweme.account.util.C22260b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity */
public class AgeGateActivity extends MusAbsActivity implements OnClickListener, C20893g, C20941a {

    /* renamed from: a */
    String f56832a;

    /* renamed from: b */
    private View f56833b;

    /* renamed from: c */
    private LoginButton f56834c;

    /* renamed from: d */
    private DatePicker f56835d;

    /* renamed from: e */
    private C20892f f56836e;

    /* renamed from: f */
    private int f56837f;

    /* renamed from: g */
    private AuthResult f56838g;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        setResult(this.f56837f);
        super.finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        C22260b.m55106a("");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f56836e.mo44839c();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity", "onResume", false);
    }

    public final void ak_() {
        this.f56837f = -1;
        new C21014a().mo44986b(this.f56832a).mo44984a("1").mo44990b();
        if (C21472c.m54111a()) {
            Intent intent = new Intent(this, TermsConsentActivity.class);
            intent.putExtra("key_auth_result", this.f56838g);
            startActivityForResult(intent, 10086);
            return;
        }
        finish();
    }

    /* renamed from: a */
    public final void mo44802a(boolean z) {
        if (z) {
            this.f56834c.mo45161c();
        } else {
            this.f56834c.mo45160a();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == this.f56833b) {
            C22260b.m55106a("");
            finish();
            return;
        }
        if (view == this.f56834c) {
            this.f56837f = 0;
            this.f56836e.mo44837a(false, true);
        }
    }

    /* renamed from: a */
    public final void mo44801a(Exception exc) {
        if (((C20887a) this.f56836e.mo54803n()).getData() == null) {
            C20897b.m53229a(this, exc);
        } else if (((AgeGateResponse) ((C20887a) this.f56836e.mo54803n()).getData()).getStatus_code() != 56004 || !C10181b.m20511a().mo18172a(AgeGateBlockExperiment.class, true, "enhace_age_gate_block", 31744, false)) {
            C20897b.m53229a(this, exc);
            C26890h.m65011a("age_gate_eligible_toast", new C20856a().mo44776a("platform", this.f56832a).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
        } else {
            C26890h.m65011a("age_gate_eligible_popup", new C20856a().mo44776a("platform", this.f56832a).mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).f56798a);
            C10643a aVar = new C10643a(this);
            aVar.mo18902b(exc.getMessage());
            aVar.mo18886a((int) R.string.ahm, (DialogInterface.OnClickListener) new C20882a(this));
            aVar.mo18897a().mo18883c().setCancelable(false);
        }
        this.f56837f = -99;
        new C21014a().mo44986b(this.f56832a).mo44984a("0").mo44990b();
        if (exc instanceof C23459a) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.azt);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        if (getIntent() != null) {
            this.f56838g = (AuthResult) getIntent().getParcelableExtra("key_auth_result");
            if (this.f56838g != null) {
                this.f56832a = this.f56838g.f32456d;
            }
        }
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        new C21015b().mo44988a(this.f56832a).mo44990b();
        this.f56836e = new C20892f();
        this.f56836e.mo44836a(this);
        this.f56833b = findViewById(R.id.ay9);
        this.f56834c = (LoginButton) findViewById(R.id.ol);
        this.f56835d = (DatePicker) findViewById(R.id.a8f);
        C20884b.m53200a(this.f56835d);
        this.f56833b.setOnClickListener(this);
        this.f56834c.setOnClickListener(this);
        this.f56835d.mo44936a((C20941a) this);
        this.f56834c.setLoginBackgroundRes(R.drawable.cgr);
        this.f56834c.setLoadingBackground(R.drawable.ch1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.AgeGateActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10086) {
            if (i2 == -1) {
                this.f56837f = -1;
                finish();
            } else if (i2 == 0) {
                this.f56837f = 0;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo44800a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar) {
        this.f56836e.mo44835a(i, i2, i3);
        this.f56834c.setEnabled(true);
    }
}
