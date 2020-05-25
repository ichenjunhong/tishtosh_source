package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoControl;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30491n;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30493o;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionModule;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionSettingItem;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.setting.experiment.EnablePublishPrivacySettingExperiment;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41694c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C42558cp;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43888b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity */
public class PrivacySettingActivity extends AmeActivity implements C41692a, C41693b {

    /* renamed from: j */
    static final String f105735j;

    /* renamed from: m */
    private static final int f105736m = 2131034266;

    /* renamed from: n */
    private static final int f105737n = 2131034275;

    /* renamed from: a */
    CommonItemView f105738a;

    /* renamed from: b */
    CommonItemView f105739b;

    /* renamed from: c */
    CommonItemView f105740c;

    /* renamed from: d */
    public IPermissionSettingItem f105741d;

    /* renamed from: e */
    public Aweme f105742e;

    /* renamed from: f */
    C41694c f105743f;

    /* renamed from: g */
    boolean f105744g = true;

    /* renamed from: h */
    C41686c f105745h;

    /* renamed from: i */
    boolean f105746i = true;

    /* renamed from: k */
    private View f105747k;

    /* renamed from: l */
    private DmtTextView f105748l;

    /* renamed from: o */
    private IPermissionModule f105749o;

    /* renamed from: p */
    private C41700e f105750p = new C41700e();

    /* renamed from: q */
    private ImmersionBar f105751q;

    /* renamed from: r */
    private String f105752r = "";

    /* renamed from: s */
    private String f105753s = "";

    /* renamed from: t */
    private String f105754t = "";

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    /* renamed from: g */
    public final void mo55287g() {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo85673a() {
        if (this.f105745h == null || this.f105745h.f105502r != 0) {
            return false;
        }
        return true;
    }

    public void finish() {
        super.finish();
        super.overridePendingTransition(17432576, f105737n);
    }

    /* renamed from: l */
    public final void mo55288l() {
        this.f105744g = !this.f105744g;
        this.f105738a.setChecked(this.f105744g);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI());
        sb.append("/aweme/v1/aweme/react_duet/set/limit/");
        f105735j = sb.toString();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f105743f.mo46991S_();
        if (this.f105751q != null) {
            this.f105751q.destroy();
        }
    }

    public void setStatusBarColor() {
        if (this.f105751q == null) {
            this.f105751q = ImmersionBar.with((Activity) this);
        }
        this.f105751q.statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        this.f105745h = cVar;
        if (this.f105738a != null) {
            if (this.f105745h != null && this.f105745h.f105499o == C41626j.f105361d) {
                this.f105738a.setChecked(false);
                this.f105738a.setAlpha(0.66f);
            }
            if (this.f105740c != null && !mo85673a()) {
                this.f105740c.setChecked(false);
            }
        }
    }

    /* renamed from: a */
    private void m91746a(int i) {
        String str;
        String str2 = "";
        switch (i) {
            case 0:
                str2 = "public";
                break;
            case 1:
                str2 = "private";
                break;
            case 2:
                str2 = "friend";
                break;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("to_status", str2);
            }
            if (this.f105742e.getAwemeType() == 2) {
                jSONObject.put("is_photo", 1);
            }
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName("scope_control").setLabelName("share_option");
        if (this.f105742e == null) {
            str = "0";
        } else {
            str = this.f105742e.getAid();
        }
        C26890h.onEvent(labelName.setValue(str).setJsonObject(jSONObject));
        C23089d a = C23089d.m56640a().mo47829a("group_id", this.f105742e.getAid()).mo47829a("enter_from", this.f105753s).mo47829a("impr_id", this.f105754t);
        if (TextUtils.equals(str2, "friend")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("s");
            str2 = sb.toString();
        }
        a.mo47829a("to_status", str2);
        if (TextUtils.equals(this.f105753s, "personal_homepage")) {
            a.mo47829a("tab_name", this.f105752r);
        }
        C26890h.m65011a("select_privacy_setting_video", a.f61491a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo85672a(C0013i iVar) throws Exception {
        String str;
        int i = 1;
        if (iVar.mo33d()) {
            C10691a.m21548c((Context) this, (int) R.string.cg0).mo19066a();
            this.f105746i = !this.f105746i;
            this.f105739b.setChecked(this.f105746i);
        } else {
            if (!(this.f105742e.getDuetSetting() == 0 || this.f105742e.getReactSetting() == 0)) {
                i = 0;
            }
            this.f105742e.setDuetSetting(i);
            this.f105742e.setReactSetting(i);
            C47718bf.m103288a(new C43888b(this.f105742e));
            String str2 = "click_react_duet_control";
            C23089d a = C23089d.m56640a().mo47829a("group_id", this.f105742e.getAid()).mo47829a("enter_from", "personal_homepage");
            String str3 = "to_status";
            if (this.f105742e.getDuetSetting() == 0 || this.f105742e.getReactSetting() == 0) {
                str = "on";
            } else {
                str = "off";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        super.overridePendingTransition(f105736m, 17432577);
        setContentView((int) R.layout.di);
        this.f105742e = C31187c.m72818a();
        C31187c.m72823b(this.f105742e);
        if (this.f105742e == null) {
            finish();
        }
        this.f105752r = getIntent().getStringExtra("tab_name");
        this.f105753s = getIntent().getStringExtra("enter_from");
        this.f105754t = getIntent().getStringExtra("impr_id");
        this.f105747k = findViewById(R.id.ij);
        this.f105748l = (DmtTextView) findViewById(R.id.c4z);
        this.f105748l.setTextSize(0, C9432q.m18687b((Context) this, 17.0f));
        this.f105738a = (CommonItemView) findViewById(R.id.xo);
        if (this.f105742e == null || this.f105742e.getAuthor() == null || (this.f105742e.getAuthor().getCommentSetting() != C41626j.f105361d && this.f105742e.getCommentSetting() == C41626j.f105358a)) {
            this.f105744g = true;
        } else {
            this.f105744g = false;
        }
        this.f105738a.setChecked(this.f105744g);
        this.f105750p = new C41700e();
        this.f105750p.mo54800a(this);
        this.f105750p.mo44934a_(new Object[0]);
        this.f105739b = (CommonItemView) findViewById(R.id.a8z);
        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
        if (avsettingsConfig.duetSupportChangeLayout()) {
            if (avsettingsConfig.enableStitch()) {
                m91747a(R.string.fkm, R.string.hin);
            } else {
                m91747a(R.string.fkj, R.string.fkk);
            }
        } else if (avsettingsConfig.enableStitch()) {
            m91747a(R.string.h3b, R.string.hio);
        }
        if (this.f105742e != null) {
            if (this.f105742e.getDuetSetting() == 0 || this.f105742e.getReactSetting() == 0) {
                this.f105746i = true;
            } else {
                this.f105746i = false;
            }
            this.f105739b.setChecked(this.f105746i);
        }
        if (C32816h.m75716b().getPostDownloadSetting().booleanValue() && C10181b.m20511a().mo18168a(EnablePublishPrivacySettingExperiment.class, true, "enable_publish_privacy_setting", 31744, 0) == 2) {
            this.f105740c = (CommonItemView) findViewById(R.id.a83);
            CommonItemView commonItemView = this.f105740c;
            Aweme aweme = this.f105742e;
            if (aweme != null) {
                VideoControl videoControl = aweme.getVideoControl();
                if (!(videoControl == null || videoControl.preventDownloadType == 3)) {
                    z = true;
                    commonItemView.setChecked(z);
                    this.f105740c.setOnClickListener(new C41847ab(this));
                    this.f105740c.setVisibility(0);
                }
            }
            z = false;
            commonItemView.setChecked(z);
            this.f105740c.setOnClickListener(new C41847ab(this));
            this.f105740c.setVisibility(0);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bpm);
        this.f105741d = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().privacyConfig().createPermissionSettingItem(this);
        this.f105741d.asView().setId(R.id.bpl);
        this.f105741d.asView().setLayoutParams(new LayoutParams(-1, -1));
        frameLayout.addView(this.f105741d.asView());
        this.f105741d.getPrivateIcon().setVisibility(8);
        DmtTextView privateHint = this.f105741d.getPrivateHint();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        privateHint.setLayoutParams(layoutParams);
        if (C47950q.m103753b(this.f105742e)) {
            this.f105741d.setPermission(0);
        } else if (C47950q.m103754c(this.f105742e)) {
            this.f105741d.setPermission(2);
        } else if (C47950q.m103755d(this.f105742e)) {
            this.f105741d.setPermission(1);
        }
        this.f105747k.setOnClickListener(new C41894w(this));
        this.f105749o = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().privacyConfig().createPermissionModule(this, this.f105741d, 0);
        this.f105749o.setupByActivity(new C42558cp() {
        });
        this.f105738a.setOnClickListener(new C41896x(this));
        this.f105739b.setOnClickListener(new C41897y(this));
        if (bundle != null) {
            this.f105749o.restoreSavedInstanceState(bundle);
        }
        this.f105743f = new C41694c();
        this.f105743f.mo54800a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacySettingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private void m91747a(int i, int i2) {
        this.f105739b.setLeftText(getString(i));
        this.f105739b.setDesc(getString(i2));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2) {
            if (!C41848ac.m91832a(this)) {
                C10691a.m21548c((Context) this, (int) R.string.cg0).mo19066a();
            } else if (this.f105742e != null) {
                final int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
                final int privateStatus = this.f105742e.getStatus().getPrivateStatus();
                if (intExtra != 1 || !this.f105742e.isTop()) {
                    this.f105749o.receivePermissionResult(intent);
                    if (!(intExtra == privateStatus || this.f105742e == null)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("is_photo", C31190f.m72836d(this.f105742e) ? 1 : 0);
                        } catch (JSONException unused) {
                        }
                        MobClick labelName = MobClick.obtain().setEventName("scope_click").setLabelName("share_option");
                        if (this.f105742e == null) {
                            str = "0";
                        } else {
                            str = this.f105742e.getAid();
                        }
                        C26890h.onEvent(labelName.setValue(str).setJsonObject(jSONObject));
                        C417722 r8 = new C30493o(this) {
                            /* renamed from: c_ */
                            public final void mo44840c_(Exception exc) {
                                boolean z;
                                super.mo44840c_(exc);
                                Throwable a = C22971a.m56490a((Throwable) exc);
                                if ((a instanceof C23459a) && ((C23459a) a).getErrorCode() == 2752) {
                                    PrivacySettingActivity.this.f105742e.getStatus().setPrivateStatus(privateStatus);
                                    PrivacySettingActivity.this.f105741d.setPermission(privateStatus);
                                    PrivacySettingActivity privacySettingActivity = PrivacySettingActivity.this;
                                    if (privacySettingActivity.f105742e == null || privacySettingActivity.f105742e.getCommerceVideoAuthInfo() == null || privacySettingActivity.f105742e.getCommerceVideoAuthInfo().getAuthStatus() != 2) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (!z) {
                                        C22971a.m56492a(PrivacySettingActivity.this, (Exception) a, R.string.c4h, R.string.c4i);
                                    }
                                    if (intExtra == 2) {
                                        C23196ad.m56841a("promote_layer_show").mo47957b(C42311c.f106865i, "friend_only_fail").mo47957b("group_id", PrivacySettingActivity.this.f105742e.getAid()).mo48076e();
                                    } else if (intExtra == 1) {
                                        C23196ad.m56841a("promote_layer_show").mo47957b(C42311c.f106865i, "private_fail").mo47957b("group_id", PrivacySettingActivity.this.f105742e.getAid()).mo48076e();
                                    }
                                }
                            }
                        };
                        this.f105742e.getStatus().setPrivateStatus(intExtra);
                        r8.mo54799a(new C30491n());
                        if (intExtra == 2) {
                            m91746a(2);
                            r8.mo60917a(this.f105742e, 2);
                            r8.mo44934a_(this.f105742e.getAid(), Integer.valueOf(3));
                        } else if (intExtra == 1) {
                            m91746a(1);
                            r8.mo60917a(this.f105742e, 1);
                            r8.mo44934a_(this.f105742e.getAid(), Integer.valueOf(2));
                            C26890h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(this.f105742e.getAid()));
                        } else if (intExtra == 0) {
                            m91746a(0);
                            C30493o oVar = new C30493o(this);
                            oVar.mo54799a(new C30491n());
                            oVar.mo60917a(this.f105742e, 0);
                            oVar.mo44934a_(this.f105742e.getAid(), Integer.valueOf(1));
                            C26890h.onEvent(new MobClick().setEventName("public_permission").setLabelName("confirm").setValue(this.f105742e.getAid()));
                        }
                    }
                } else {
                    C10691a.m21533a((Context) this, (int) R.string.gxk).mo19066a();
                }
            }
        }
    }
}
