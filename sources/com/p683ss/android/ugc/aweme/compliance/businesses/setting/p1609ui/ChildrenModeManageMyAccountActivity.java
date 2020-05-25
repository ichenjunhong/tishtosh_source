package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23860bm;
import com.p683ss.android.ugc.aweme.C24046bs;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.login.C22042y;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.ComplianceBusinessDependServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity */
public class ChildrenModeManageMyAccountActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    protected User f71409a;

    /* renamed from: b */
    public boolean f71410b;
    CommonItemView mChangePwdItem;
    protected DmtTextView mDeleteAccount;
    CommonItemView mLoginDeviceManagerItem;
    CommonItemView mSaveLoginInfoItem;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b7m;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m65279c() {
        this.f71409a = C20854a.m53167g().getCurUser();
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo).init();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", true);
        super.onResume();
        C20854a.m53167g().getSetPasswordStatus(new C23860bm() {
            /* renamed from: a */
            public final void mo45351a(String str) {
            }

            /* renamed from: a */
            public final void mo45352a(boolean z) {
                ChildrenModeManageMyAccountActivity.this.f71410b = z;
                SharePrefCache.inst().getUserHasPassword().mo47776a(Boolean.valueOf(ChildrenModeManageMyAccountActivity.this.f71410b));
            }
        });
        m65279c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity", "onResume", false);
    }

    public void exit(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        m65279c();
        this.mTitleBar.setTitle((int) R.string.df3);
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ChildrenModeManageMyAccountActivity.this.exit(view);
            }
        });
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a2j));
        if (((C22042y) C24046bs.m58875a(this, C22042y.class)).mo46103b(true)) {
            this.mSaveLoginInfoItem.setChecked(true);
        }
        CommonItemView commonItemView = this.mLoginDeviceManagerItem;
        if (!TextUtils.isEmpty(ComplianceBusinessDependServiceImpl.createIComplianceBusinessDependServicebyMonsterPlugin().getLoginDeviceManagerUrl())) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView.setVisibility(i);
        this.mChangePwdItem.setOnClickListener(this);
        this.mSaveLoginInfoItem.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mDeleteAccount.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeManageMyAccountActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.e1j) {
            C23196ad.m56841a("enter_password_settings").mo47957b("previous_page", "account_security_settings").mo47957b("enter_method", "click_button").mo48076e();
            Bundle bundle = new Bundle();
            bundle.putBoolean("have_set_password", this.f71410b);
            C26890h.onEventV3("manage_account_password_click");
            C20854a.m53166f().changePassword(this, "manage_my_account", "password_click", bundle, null);
        } else if (id == R.id.cgv) {
            C22042y yVar = (C22042y) C24046bs.m58875a(this, C22042y.class);
            yVar.mo46101a(!yVar.mo46103b(true));
            C26890h.m65011a("switch_login_save", C23089d.m56640a().mo47826a("state", yVar.mo46103b(true) ? 1 : 0).f61491a);
            this.mSaveLoginInfoItem.setChecked(yVar.mo46103b(true));
        } else {
            if (id == R.id.bj3) {
                if (!C27068a.m65298a(this)) {
                    C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
                } else {
                    C18922i iVar = new C18922i(ComplianceBusinessDependServiceImpl.createIComplianceBusinessDependServicebyMonsterPlugin().getLoginDeviceManagerUrl());
                    iVar.mo38778a("lang", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
                    iVar.mo38778a("locale", C33106b.m76108b());
                    iVar.mo38776a("aid", C11010c.m22289j());
                    SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", iVar.mo38774a()).withParam("hide_nav_bar", true).open();
                }
            } else if (id == R.id.a43) {
                C23196ad.m56841a("enter_delete_account").mo47957b("previous_page", "account_security_settings").mo47957b("enter_method", "click_button").mo48076e();
                ComplianceBusinessDependServiceImpl.createIComplianceBusinessDependServicebyMonsterPlugin().toDeleteAccount(this);
            }
        }
    }
}
