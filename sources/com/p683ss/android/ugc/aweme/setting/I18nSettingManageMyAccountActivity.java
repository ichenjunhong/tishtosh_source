package com.p683ss.android.ugc.aweme.setting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.facebook.Profile;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C22551ak;
import com.p683ss.android.ugc.aweme.C23860bm;
import com.p683ss.android.ugc.aweme.C24046bs;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.login.C22042y;
import com.p683ss.android.ugc.aweme.account.p1267b.C20903a;
import com.p683ss.android.ugc.aweme.account.util.C22267i;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.proaccount.ProWelcomeActivity;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.DmtStatusViewDialog;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.QRCodeActivityV2;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41596b;
import com.p683ss.android.ugc.aweme.setting.util.LoginDeviceManagerUrlExperiment;
import com.p683ss.android.ugc.aweme.setting.verification.C41904b;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c.C41906a;
import com.p683ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p683ss.android.ugc.aweme.settings.SecurityCenterSettings;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47897fr;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity */
public class I18nSettingManageMyAccountActivity extends AmeBaseActivity implements OnClickListener, C9382a {

    /* renamed from: e */
    private static final boolean f105163e = false;

    /* renamed from: a */
    protected DmtStatusViewDialog f105164a;

    /* renamed from: b */
    protected User f105165b;

    /* renamed from: c */
    protected boolean f105166c;

    /* renamed from: d */
    protected boolean f105167d;

    /* renamed from: f */
    private int f105168f = -1;
    CommonItemView mBindPhoneItem;
    protected DmtTextView mDeleteAccount;
    CommonItemView mEmailItem;
    CommonItemView mLoginDeviceManagerItem;
    CommonItemView mMyQrCodeItem;
    CommonItemView mRequestVerificationItem;
    CommonItemView mSaveLoginInfoItem;
    CommonItemView mSecurityCenter;
    CommonItemView mSetOrChangePwd;
    CommonItemView mSwitchAccount;
    TextView mTitle;

    /* renamed from: r */
    private C41905c f105169r;

    /* renamed from: s */
    private C9381g f105170s;
    View statusBar;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.ei;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private void m91314c() {
        this.f105165b = C20902b.m53242a().getCurUser();
    }

    /* renamed from: d */
    private void m91315d() {
        if (this.f105164a != null) {
            C47700ay.m103236b(this.f105164a);
        }
    }

    /* renamed from: e */
    private void m91316e() {
        C10691a.m21542b((Context) this, (int) R.string.cg2).mo19066a();
    }

    /* renamed from: f */
    private void m91317f() {
        if (this.f105165b != null && !TextUtils.isEmpty(this.f105165b.getBindPhone())) {
            this.mBindPhoneItem.setRightText(this.f105165b.getBindPhone());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f105169r.mo85818a();
        ImmersionBar.with((Activity) this).destroy();
        C47718bf.m103291d(this);
        this.f105170s = null;
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", true);
        super.onResume();
        C20854a.m53167g().getSetPasswordStatus(new C23860bm() {
            /* renamed from: a */
            public final void mo45351a(String str) {
            }

            /* renamed from: a */
            public final void mo45352a(boolean z) {
                I18nSettingManageMyAccountActivity.this.f105166c = z;
                SharePrefCache.inst().getUserHasPassword().mo47776a(Boolean.valueOf(I18nSettingManageMyAccountActivity.this.f105166c));
            }
        });
        if (this.f105167d) {
            this.f105167d = false;
            m91314c();
            m91313b(this.f105165b);
            m91317f();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onResume", false);
    }

    public void exit(View view) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo85271a(User user) throws Exception {
        if (TextUtils.isEmpty(user.getEmail()) || !user.isEmailVerified()) {
            return Boolean.valueOf(false);
        }
        C20902b.m53242a().updateCurUser(user);
        m91314c();
        return Boolean.valueOf(true);
    }

    public void handleMsg(Message message) {
        if (message.what != 112 || !(message.obj instanceof User)) {
            m91315d();
            return;
        }
        User user = (User) message.obj;
        if (this.f105168f == -1) {
            C20902b.m53242a().updateCurUser(user);
            m91314c();
            m91313b(user);
            return;
        }
        C0013i.m16a((Callable<TResult>) new C41640o<TResult>(this, user)).mo20a((C0011g<TResult, TContinuationResult>) new C41641p<TResult,TContinuationResult>(this, user), C0013i.f25b);
    }

    /* renamed from: a */
    private void m91312a(boolean z) {
        int i;
        m91314c();
        if (this.f105165b != null) {
            try {
                i = C32816h.m75716b().getProAccountEnableDetailInfo().getIsProaccountDisplay().intValue();
            } catch (C10174a unused) {
                i = 0;
            }
            if (this.f105165b.isForcePrivateAccount() || i == 0) {
                this.mSwitchAccount.setVisibility(8);
            } else {
                this.mSwitchAccount.setVisibility(0);
            }
            if (z || !this.f105165b.isProAccount()) {
                this.mSwitchAccount.setLeftText(getResources().getString(R.string.duz));
            } else {
                this.mSwitchAccount.setLeftText(getResources().getString(R.string.duy));
            }
        }
    }

    /* renamed from: b */
    private void m91313b(User user) {
        String str;
        int intValue = C32816h.m75716b().getEnableEmailVerification().intValue();
        if (f105163e) {
            StringBuilder sb = new StringBuilder("Email verification feature ");
            if (intValue == 1) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        if (intValue != 1) {
            this.mEmailItem.setVisibility(8);
            return;
        }
        this.mEmailItem.setVisibility(0);
        if (TextUtils.isEmpty(user.getEmail())) {
            this.mEmailItem.setRightText("");
        } else if (user.isEmailVerified()) {
            this.mEmailItem.setRightText(user.getEmail());
            this.mEmailItem.getTvwRight().setTextColor(C0726c.m2098c(this, R.color.aok));
        } else {
            this.mEmailItem.setRightText(getString(R.string.fao));
            this.mEmailItem.getTvwRight().setTextColor(C0726c.m2098c(this, R.color.a0y));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f105170s = new C9381g(getMainLooper(), this);
        C20854a.m53167g().queryUser(this.f105170s);
        m91314c();
        this.mTitle.setText(R.string.df3);
        if (VERSION.SDK_INT >= 19) {
            this.statusBar.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        m91317f();
        m91313b(this.f105165b);
        m91312a(false);
        if (((C22042y) C24046bs.m58875a(this, C22042y.class)).mo46103b(true)) {
            this.mSaveLoginInfoItem.setChecked(true);
        }
        int i2 = 8;
        if (!TextUtils.isEmpty(C10193n.m20607a().mo18203a(SecurityCenterSettings.class, "security_center", C10181b.m20511a().mo18175c().getSecurityCenter(), ""))) {
            this.mSecurityCenter.setVisibility(0);
            this.mLoginDeviceManagerItem.setVisibility(8);
        } else {
            CommonItemView commonItemView = this.mLoginDeviceManagerItem;
            if (!TextUtils.isEmpty(C10181b.m20511a().mo18171a(LoginDeviceManagerUrlExperiment.class, true, "login_device_manager_url", 31744, ""))) {
                i = 0;
            } else {
                i = 8;
            }
            commonItemView.setVisibility(i);
            this.mSecurityCenter.setVisibility(8);
        }
        CommonItemView commonItemView2 = this.mRequestVerificationItem;
        if (C41906a.m91850a()) {
            i2 = 0;
        }
        commonItemView2.setVisibility(i2);
        this.f105169r = new C41905c();
        this.mBindPhoneItem.setOnClickListener(this);
        this.mSetOrChangePwd.setOnClickListener(this);
        this.mMyQrCodeItem.setOnClickListener(this);
        this.mSaveLoginInfoItem.setOnClickListener(this);
        this.mSwitchAccount.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mDeleteAccount.setOnClickListener(this);
        this.mLoginDeviceManagerItem.setOnClickListener(this);
        this.mEmailItem.setOnClickListener(this);
        this.mRequestVerificationItem.setOnClickListener(this);
        this.mSecurityCenter.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity", "onCreate", false);
    }

    @C53771m
    public void onEmailEvent(C29906l lVar) {
        if (lVar == null || !TextUtils.equals("link_email_event", lVar.f78044a) || lVar.f78045b == null) {
            C10691a.m21545b((Context) this, getString(R.string.c0a)).mo19066a();
            return;
        }
        try {
            this.f105168f = lVar.f78045b.getInt("action_type");
        } catch (JSONException unused) {
            this.f105168f = -1;
        }
        if (!Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)}).contains(Integer.valueOf(this.f105168f))) {
            C10691a.m21545b((Context) this, getString(R.string.c0a)).mo19066a();
            return;
        }
        if (this.f105164a == null) {
            this.f105164a = new DmtStatusViewDialog(this);
        }
        C47700ay.m103235a(this.f105164a);
        C20902b.m53242a().queryUser(new C9381g(Looper.getMainLooper(), this));
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        C23089d dVar;
        int i;
        String str4;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.bpd) {
            User curUser = C20902b.m53242a().getCurUser();
            String o = C47915gg.m103666o(curUser);
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle(Profile.f35248a)) {
                o = C47915gg.m103656e(curUser);
            }
            QRCodeActivityV2.m90640a(this, new C40954a().mo83446a(4, C47915gg.m103665n(curUser), "personal_homepage").mo83449a(o, C47915gg.m103667p(curUser), C47915gg.m103661j(curUser)).f104177a);
            return;
        }
        if (id == R.id.avc) {
            boolean isPhoneBinded = C20902b.m53242a().getCurUser().isPhoneBinded();
            C26890h.m65011a("manage_account_phone_click", C23089d.m56640a().mo47826a("phone_binding_status", isPhoneBinded ? 1 : 0).f61491a);
            final boolean enableNewPhoneBindFlow = C20854a.m53165e().enableNewPhoneBindFlow();
            if (isPhoneBinded) {
                final User curUser2 = C20902b.m53242a().getCurUser();
                final DmtStatusViewDialog dmtStatusViewDialog = new DmtStatusViewDialog(this);
                dmtStatusViewDialog.show();
                C41905c cVar = this.f105169r;
                C415111 r3 = new C41904b() {

                    /* renamed from: a */
                    String f105171a = "";

                    /* renamed from: b */
                    String f105172b = "";

                    /* renamed from: c */
                    String f105173c = "";

                    /* renamed from: a */
                    public final void mo85279a() {
                        dmtStatusViewDialog.dismiss();
                    }

                    /* renamed from: a */
                    public final void mo82330a(VerificationResponse verificationResponse) {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity;
                        int i;
                        int i2;
                        int i3;
                        if (verificationResponse.shouldShowChangeMobileDialog()) {
                            this.f105171a = I18nSettingManageMyAccountActivity.this.getString(R.string.faa);
                            this.f105172b = I18nSettingManageMyAccountActivity.this.getString(R.string.d7p, new Object[]{curUser2.getBindPhone()});
                            i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                            i = R.string.d7r;
                        } else {
                            String bindPhone = C20902b.m53242a().getCurUser().getBindPhone();
                            if (!TextUtils.isEmpty(bindPhone)) {
                                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = I18nSettingManageMyAccountActivity.this;
                                if (enableNewPhoneBindFlow) {
                                    i2 = R.string.hfv;
                                } else {
                                    i2 = R.string.zt;
                                }
                                this.f105171a = i18nSettingManageMyAccountActivity2.getString(i2);
                                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity3 = I18nSettingManageMyAccountActivity.this;
                                if (enableNewPhoneBindFlow) {
                                    i3 = R.string.hfu;
                                } else {
                                    i3 = R.string.c9m;
                                }
                                this.f105172b = i18nSettingManageMyAccountActivity3.getString(i3, new Object[]{bindPhone});
                                i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                                if (enableNewPhoneBindFlow) {
                                    i = R.string.aeb;
                                } else {
                                    i = R.string.c_;
                                }
                            } else {
                                return;
                            }
                        }
                        this.f105173c = i18nSettingManageMyAccountActivity.getString(i);
                        new C10643a(I18nSettingManageMyAccountActivity.this).mo18902b(this.f105172b).mo18892a(this.f105171a).mo18893a(this.f105173c, (DialogInterface.OnClickListener) new C41679r(this, enableNewPhoneBindFlow)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo85280a(boolean z, DialogInterface dialogInterface, int i) {
                        String str;
                        I18nSettingManageMyAccountActivity.this.f105167d = true;
                        C22551ak e = C20854a.m53165e();
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = I18nSettingManageMyAccountActivity.this;
                        if (z) {
                            str = "manage_my_account";
                        } else {
                            str = "";
                        }
                        e.modifyMobile(i18nSettingManageMyAccountActivity, str, null, null);
                    }
                };
                C52711k.m112240b(curUser2, "user");
                C52711k.m112240b(r3, "callback");
                cVar.mo85820a(C41906a.m91852c(), curUser2, r3);
            } else {
                this.f105167d = true;
                C22551ak e = C20854a.m53165e();
                if (enableNewPhoneBindFlow) {
                    str4 = "manage_my_account";
                } else {
                    str4 = "";
                }
                e.bindMobile(this, str4, null, null);
            }
        } else if (id == R.id.clw) {
            C26890h.onEventV3("manage_account_password_click");
            this.f105167d = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("have_set_password", this.f105166c);
            C20854a.m53166f().changePassword(this, "manage_my_account", "password_click", bundle, null);
        } else if (id == R.id.cgv) {
            C22042y yVar = (C22042y) C24046bs.m58875a(this, C22042y.class);
            yVar.mo46101a(!yVar.mo46103b(true));
            C26890h.m65011a("switch_login_save", C23089d.m56640a().mo47826a("state", yVar.mo46103b(true) ? 1 : 0).f61491a);
            this.mSaveLoginInfoItem.setChecked(yVar.mo46103b(true));
        } else if (id == R.id.cbp) {
            C41906a.m91849a(this);
        } else if (id == R.id.cvy) {
            m91314c();
            if (this.f105165b == null || !this.f105165b.isProAccount()) {
                C52711k.m112240b(this, "context");
                startActivity(new Intent(this, ProWelcomeActivity.class));
                C26890h.m65011a("pro_account_switch", C23089d.m56640a().mo47826a("status", 1).f61491a);
                return;
            }
            C10643a aVar = new C10643a(this);
            if (C47897fr.m103602a()) {
                i = R.string.hmm;
            } else {
                i = R.string.ape;
            }
            aVar.mo18885a((int) R.string.apk).mo18899b(i).mo18900b((int) R.string.ap_, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.apg, (DialogInterface.OnClickListener) new C41633m(this)).mo18897a().mo18882b();
            C26890h.m65011a("pro_account_switch", C23089d.m56640a().mo47826a("status", 0).f61491a);
        } else if (id == R.id.bj3) {
            if (!C41680s.m91537a(this)) {
                C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
            } else {
                C18922i iVar = new C18922i(C10181b.m20511a().mo18171a(LoginDeviceManagerUrlExperiment.class, true, "login_device_manager_url", 31744, ""));
                iVar.mo38778a("lang", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
                iVar.mo38778a("locale", C33106b.m76108b());
                iVar.mo38776a("aid", (int) C23018b.f61359a);
                Intent intent = new Intent(this, CrossPlatformActivity.class);
                intent.setData(Uri.parse(iVar.mo38774a()));
                intent.putExtra("hide_nav_bar", true);
                startActivity(intent);
            }
        } else if (id == R.id.dwb) {
            User user = this.f105165b;
            if (C32816h.m75716b().getEnableEmailVerification().intValue() == 1) {
                String email = user.getEmail();
                boolean z = !TextUtils.isEmpty(email);
                if (!z || !user.isEmailVerified()) {
                    this.f105167d = true;
                    if (z) {
                        C20854a.m53165e().verifyEmail(this, "manage_my_account", new Bundle(), null);
                    } else {
                        C20854a.m53165e().bindEmail(this, "manage_my_account", new Bundle(), null);
                    }
                    str = "enter_email_setting";
                    dVar = new C23089d();
                    str3 = "status";
                    if (z) {
                        str2 = "not_verified";
                    } else {
                        str2 = "empty";
                    }
                } else {
                    new C10643a(this).mo18885a((int) R.string.ah7).mo18902b(C2240a.m6773a(Locale.US, getString(R.string.ah6), new Object[]{email})).mo18886a((int) R.string.cgm, (DialogInterface.OnClickListener) new C41639n(this)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
                    str = "enter_email_setting";
                    dVar = new C23089d();
                    str3 = "status";
                    str2 = "verified";
                }
                C26890h.m65011a(str, dVar.mo47829a(str3, str2).f61491a);
                C47718bf.m103290c(this);
            }
        } else if (id == R.id.a43) {
            C23196ad.m56841a("enter_delete_account").mo47957b("previous_page", "account_security_settings").mo47957b("enter_method", "click_button").mo48076e();
            C22267i.m55116a((Context) this);
        } else if (id == R.id.euk) {
            if (!C41680s.m91537a(this)) {
                C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
                return;
            }
            String a = C10193n.m20607a().mo18203a(SecurityCenterSettings.class, "security_center", C10181b.m20511a().mo18175c().getSecurityCenter(), "");
            if (!TextUtils.isEmpty(a)) {
                C18922i iVar2 = new C18922i(a);
                iVar2.mo38778a("lang", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
                iVar2.mo38776a("aid", (int) C23018b.f61359a);
                iVar2.mo38778a("locale", C33106b.m76108b());
                Intent intent2 = new Intent(this, CrossPlatformActivity.class);
                intent2.setData(Uri.parse(iVar2.mo38774a()));
                intent2.putExtra("hide_nav_bar", true);
                startActivity(intent2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85273a(DialogInterface dialogInterface, int i) {
        this.f105167d = true;
        C20854a.m53165e().changeEmail(this, "manage_my_account", new Bundle(), null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo85272a(User user, C0013i iVar) throws Exception {
        m91315d();
        if (!C47957v.m103770a(iVar) || !((Boolean) iVar.mo34e()).booleanValue()) {
            if (f105163e && iVar != null) {
                iVar.mo35f();
            }
            C10691a.m21542b((Context) this, (int) R.string.c0a).mo19066a();
        } else {
            boolean z = true;
            switch (this.f105168f) {
                case 1:
                    C10691a.m21548c((Context) this, (int) R.string.awy).mo19066a();
                    C26890h.m65011a("email_verify_success", (Map<String, String>) new HashMap<String,String>());
                    break;
                case 2:
                    C10691a.m21548c((Context) this, (int) R.string.awv).mo19066a();
                    C26890h.m65011a(C20903a.f56883d, new C23089d().mo47826a("type", 1).f61491a);
                    break;
                case 3:
                    C10691a.m21548c((Context) this, (int) R.string.awx).mo19066a();
                    C26890h.m65011a(C20903a.f56883d, new C23089d().mo47826a("type", 2).f61491a);
                    break;
                default:
                    z = false;
                    C10691a.m21545b((Context) this, getString(R.string.c0a)).mo19066a();
                    break;
            }
            if (z) {
                m91313b(user);
            }
        }
        this.f105168f = -1;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85274a(DialogInterface dialogInterface, int i, int i2, Object obj) {
        if (i == 14 && i2 == 1) {
            C20902b.m53242a().queryUser();
            m91312a(true);
            C47718bf.m103288a(new C41596b());
            C26890h.m65011a("switch_to_personal_account_success", (Map<String, String>) new HashMap<String,String>());
        } else {
            m91316e();
        }
        dialogInterface.dismiss();
    }
}
