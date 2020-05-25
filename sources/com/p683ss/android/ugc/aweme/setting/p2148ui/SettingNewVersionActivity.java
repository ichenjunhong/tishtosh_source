package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.app.C23107j;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.p1695a.C29499a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.live.C36065d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.C27960d;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1445bp.C23891e;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p2377ug.settings.UgcPermission;
import com.p683ss.android.ugc.aweme.p2377ug.settings.UgcPermissionSetting;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40572w;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.setting.C41631k;
import com.p683ss.android.ugc.aweme.setting.p2138g.C41608a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41685b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.services.C41712a;
import com.p683ss.android.ugc.aweme.utils.C47666ag;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingNewVersionActivity */
public abstract class SettingNewVersionActivity extends AmeBaseActivity implements OnClickListener, C20834a {

    /* renamed from: A */
    CommonItemView f105767A;

    /* renamed from: B */
    CommonItemView f105768B;

    /* renamed from: C */
    CommonItemView f105769C;

    /* renamed from: D */
    CommonItemView f105770D;

    /* renamed from: E */
    CommonItemView f105771E;

    /* renamed from: F */
    TextView f105772F;

    /* renamed from: G */
    TextView f105773G;

    /* renamed from: H */
    CommonItemView f105774H;

    /* renamed from: I */
    CommonItemView f105775I;

    /* renamed from: J */
    CommonItemView f105776J;

    /* renamed from: K */
    CommonItemView f105777K;

    /* renamed from: L */
    CommonItemView f105778L;

    /* renamed from: M */
    CommonItemView f105779M;

    /* renamed from: N */
    CommonItemView f105780N;

    /* renamed from: O */
    CommonItemView f105781O;

    /* renamed from: P */
    CommonItemView f105782P;

    /* renamed from: Q */
    CommonItemView f105783Q;

    /* renamed from: R */
    CommonItemView f105784R;

    /* renamed from: S */
    CommonItemView f105785S;

    /* renamed from: T */
    CommonItemView f105786T;

    /* renamed from: U */
    CommonItemView f105787U;

    /* renamed from: V */
    CommonItemView f105788V;

    /* renamed from: W */
    CommonItemView f105789W;

    /* renamed from: X */
    CommonItemView f105790X;

    /* renamed from: Y */
    CommonItemView f105791Y;

    /* renamed from: Z */
    CommonItemView f105792Z;

    /* renamed from: a */
    private int f105793a;

    /* renamed from: aa */
    protected List<CommonItemView> f105794aa = new ArrayList();

    /* renamed from: ab */
    C27960d f105795ab;

    /* renamed from: ac */
    protected HashSet<View> f105796ac;

    /* renamed from: b */
    private long f105797b;

    /* renamed from: c */
    private List<Aweme> f105798c;

    /* renamed from: d */
    View f105799d;

    /* renamed from: e */
    ViewGroup f105800e;

    /* renamed from: f */
    TextTitleBar f105801f;

    /* renamed from: r */
    CommonItemView f105802r;

    /* renamed from: s */
    CommonItemView f105803s;

    /* renamed from: t */
    CommonItemView f105804t;

    /* renamed from: u */
    CommonItemView f105805u;

    /* renamed from: v */
    CommonItemView f105806v;

    /* renamed from: w */
    CommonItemView f105807w;

    /* renamed from: x */
    CommonItemView f105808x;

    /* renamed from: y */
    CommonItemView f105809y;

    /* renamed from: z */
    CommonItemView f105810z;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo85624A();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo85626C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo85627D();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo85628E();

    /* renamed from: a */
    public int mo46324a() {
        return -1;
    }

    /* renamed from: d */
    public abstract View[] mo85632d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo85634f();

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo85636l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo85639o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo85645p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo85646q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo85647r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo85648s();

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo85649t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo85650u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo85651v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo85652w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract void mo85653x();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo85654y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo85655z() {
    }

    /* renamed from: J */
    private static boolean m91766J() {
        if (C23794bh.m58381G().mo47247h()) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private void m91767K() {
        BusinessComponentServiceUtils.getParentalPlatformService().syncParentalData(new C22692c() {
            /* renamed from: a */
            public final void mo47081a(Exception exc) {
                SettingNewVersionActivity.this.mo85689a(true);
            }

            /* renamed from: a */
            public final void mo47080a(C41686c cVar, boolean z) {
                SettingNewVersionActivity.this.mo85689a(true);
            }
        });
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.bk, R.anim.by);
    }

    public void onDestroy() {
        super.onDestroy();
        C31187c.m72821a(this.f105798c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo85686F() {
        if (!C20854a.m53167g().isLogin()) {
            if (this.f105796ac == null) {
                this.f105796ac = new HashSet<>();
            }
            C41712a.f105567a.handleUnloginForSetting(this, this.f105796ac);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo85635g() {
        C26890h.m65011a("enter_account_safety", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo85638n() {
        C26890h.m65011a("display_settings", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
    }

    /* renamed from: I */
    private static boolean m91765I() {
        C41685b b = C41608a.m91466b();
        if (C47915gg.m103651b() || b == null || ((!b.f105456a || TextUtils.isEmpty(b.f105457b)) && !TextUtils.equals(C11010c.m22295p(), "beta"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo85625B() {
        if (C29499a.m69636a()) {
            C2201v.m6601a(C41850ae.f105995a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<Boolean>() {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        SettingNewVersionActivity.this.f105771E.mo19038a();
                    }
                }
            });
        }
    }

    /* renamed from: G */
    public final void mo85687G() {
        if (C20854a.m53167g().allUidList().size() < 3) {
            C23794bh.m58410x().addAccount(this, "", "add_account_setting");
        } else {
            C10691a.m21548c((Context) this, (int) R.string.e1).mo19066a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo85637m() {
        C18894a.m46006a("click_insight", (JSONObject) null);
        C26890h.m65011a("click_insight", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
        C26890h.m65011a("enter_insight_detail", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo85688H() {
        List g = C23794bh.m58381G().mo47246g();
        if (!C9376b.m18558a((Collection<T>) g)) {
            ViewGroup viewGroup = (ViewGroup) this.f105800e.findViewById(R.id.bga);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if (tag instanceof String) {
                            String str = (String) tag;
                            if (!TextUtils.isEmpty(str) && g.contains(str)) {
                                childAt.setVisibility(8);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo85633e() {
        this.f105774H.setLeftText("Debug Test");
        this.f105774H.setVisibility(8);
        if (C20854a.m53167g().getCurUser() != null && C20854a.m53167g().getCurUser().getIsCreater() && ((Boolean) SharePrefCache.inst().getCanCreateInsights().mo47782d()).booleanValue()) {
            this.f105783Q.setVisibility(0);
        }
        this.f105798c = C31187c.m72822b();
        mo85625B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo85631c() {
        this.f105794aa.add(this.f105802r);
        this.f105794aa.add(this.f105804t);
        this.f105794aa.add(this.f105803s);
        this.f105794aa.add(this.f105805u);
        this.f105794aa.add(this.f105806v);
        this.f105794aa.add(this.f105807w);
        this.f105794aa.add(this.f105808x);
        this.f105794aa.add(this.f105809y);
        this.f105794aa.add(this.f105810z);
        this.f105794aa.add(this.f105767A);
        this.f105794aa.add(this.f105768B);
        this.f105794aa.add(this.f105769C);
        this.f105794aa.add(this.f105770D);
        this.f105794aa.add(this.f105771E);
        this.f105794aa.add(this.f105774H);
        this.f105794aa.add(this.f105775I);
        this.f105794aa.add(this.f105776J);
        this.f105794aa.add(this.f105777K);
        this.f105794aa.add(this.f105778L);
        this.f105794aa.add(this.f105779M);
        this.f105794aa.add(this.f105780N);
        this.f105794aa.add(this.f105781O);
        this.f105794aa.add(this.f105782P);
        this.f105794aa.add(this.f105783Q);
        this.f105794aa.add(this.f105784R);
        this.f105794aa.add(this.f105785S);
        this.f105794aa.add(this.f105786T);
        this.f105794aa.add(this.f105787U);
        this.f105794aa.add(this.f105788V);
        this.f105794aa.add(this.f105789W);
        this.f105794aa.add(this.f105791Y);
        for (CommonItemView commonItemView : this.f105794aa) {
            if (commonItemView != null) {
                commonItemView.setRightIconRes(0);
            }
        }
        this.f105801f.setTitle((int) R.string.fvl);
        this.f105801f.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                SettingNewVersionActivity.this.exit(view);
            }
        });
        this.f105775I.setVisibility(8);
        if (VERSION.SDK_INT >= 19) {
            this.f105799d.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        if (C20966a.m53329a() && C20854a.m53167g().isLogin()) {
            this.f105776J.setVisibility(0);
        }
        if (C47915gg.m103651b()) {
            this.f105787U.setVisibility(8);
        }
        if (C41631k.m91508c()) {
            this.f105788V.setVisibility(0);
        }
        if (VERSION.SDK_INT >= 21 && "googleplay".equals(C11010c.m22295p()) && (C32816h.m75716b().getInappUpdateSwitchStrategy().intValue() == 3 || C32816h.m75716b().getInappUpdateSwitchStrategy().intValue() == 2)) {
            this.f105789W.setVisibility(0);
        }
        if (m91765I()) {
            this.f105791Y.setVisibility(0);
        }
        if (m91766J()) {
            this.f105790X.setVisibility(0);
        }
        UgcPermission ugcPermission = UgcPermissionSetting.INSTANCE.getUgcPermission();
        if (ugcPermission != null && !TextUtils.isEmpty(ugcPermission.getDesc())) {
            this.f105792Z.setVisibility(0);
            this.f105792Z.setLeftText(ugcPermission.getDesc());
            this.f105792Z.setOnClickListener(this);
        }
    }

    public void exit(View view) {
        finish();
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("user", hVar.itemType)) {
            C47881fd.m103578a(this, this.f105800e, hVar);
        }
    }

    public void onUserInfoClick(View view) {
        C47666ag.m103177a("user_info", this, this.f105772F.getText().toString());
        C10691a.m21533a((Context) this, (int) R.string.a40).mo19066a();
    }

    /* renamed from: a */
    public final void mo85689a(boolean z) {
        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
            C10691a.m21542b((Context) this, (int) R.string.d0x).mo19066a();
        } else if (!C41854ai.m91833a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
        } else if (isActive() && !m91768b(z)) {
            mo85624A();
        }
    }

    /* renamed from: b */
    private boolean m91768b(boolean z) {
        int i;
        if (!C23794bh.m58390d().mo47112i()) {
            return false;
        }
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() != C22687a.CHILD && BusinessComponentServiceUtils.getParentalPlatformService().getRole() != C22687a.UNLINK_LOCKED) {
            C26890h.m65011a("time_lock_block_show", C23089d.m56640a().mo47829a("enter_from", "logout").f61491a);
            BusinessComponentServiceUtils.getTimeLockHelperService().mo47090a(new C23706b<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo47089a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    SettingNewVersionActivity.this.mo85624A();
                }
            }, "logout");
            return true;
        } else if (!z) {
            m91767K();
            return true;
        } else {
            boolean h = C23794bh.m58390d().mo47111h();
            boolean b = C23794bh.m58390d().mo47105b();
            if (!h && !b) {
                return false;
            }
            if (b) {
                i = R.string.x0;
            } else {
                i = R.string.x1;
            }
            C10691a.m21533a((Context) this, i).mo19066a();
            return true;
        }
    }

    public void onVersionClick(View view) {
        C36065d dVar;
        String str;
        if (System.currentTimeMillis() - this.f105797b < 500) {
            this.f105793a++;
        } else {
            this.f105793a = 0;
        }
        if (this.f105793a >= 4) {
            this.f105772F.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
            if (C36173w.m81665a() != null) {
                dVar = C36173w.m81665a().getLive();
            } else {
                dVar = null;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("UserId: ");
            sb2.append(C20854a.m53167g().getCurUserId());
            sb.append(sb2.toString());
            sb.append("\n");
            StringBuilder sb3 = new StringBuilder("DeviceId: ");
            sb3.append(serverDeviceId);
            sb.append(sb3.toString());
            sb.append("\n");
            StringBuilder sb4 = new StringBuilder("UpdateVerionCode: ");
            sb4.append(C11010c.m22286g());
            sb.append(sb4.toString());
            sb.append("\n");
            StringBuilder sb5 = new StringBuilder("Channel: ");
            sb5.append(C11010c.m22295p());
            sb.append(sb5.toString());
            sb.append("\n");
            StringBuilder sb6 = new StringBuilder("GitSHA: ");
            sb6.append(C11010c.m22291l());
            sb.append(sb6.toString());
            sb.append("\n");
            StringBuilder sb7 = new StringBuilder("VESDK: ");
            sb7.append(avsettingsConfig.getVESDKVersion());
            sb.append(sb7.toString());
            sb.append("\n");
            StringBuilder sb8 = new StringBuilder("EffectSdk: ");
            sb8.append(avsettingsConfig.getEffectVersion());
            sb.append(sb8.toString());
            sb.append("\n");
            StringBuilder sb9 = new StringBuilder("LiveCore: ");
            if (dVar != null) {
                str = dVar.mo15059l();
            } else {
                str = "";
            }
            sb9.append(str);
            sb.append(sb9.toString());
            sb.append("\n");
            sb.append(C23107j.m56674a());
            this.f105772F.setText(sb.toString());
            this.f105793a = 0;
        }
        this.f105797b = System.currentTimeMillis();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.a9w) {
            if (!C32800a.m75679a(view)) {
                C26890h.m65011a("edit_profile", C23089d.m56640a().mo47829a("enter_method", "click_setting_profile").f61491a);
                SmartRouter.buildRoute((Context) this, "aweme://profile_edit").open();
            }
        } else if (id == R.id.x) {
            if (!C32800a.m75679a(view)) {
                mo85635g();
            }
        } else if (id == R.id.btn) {
            if (!C32800a.m75679a(view)) {
                mo85627D();
            }
        } else if (id == R.id.c4o) {
            if (!C32800a.m75679a(view)) {
                mo85653x();
            }
        } else if (id == R.id.dl8) {
            if (!C32800a.m75679a(view)) {
                C26890h.m65011a("enter_teen_protection", C23089d.m56640a().mo47829a("enter_method", "click_button").mo47829a("enter_from", "settings_page").f61491a);
                BusinessComponentServiceUtils.getParentalPlatformService().enterDigitalWellbeing(this);
            }
        } else if (id == R.id.yh) {
            if (!C32800a.m75679a(view)) {
                mo85638n();
            }
        } else if (id == R.id.aer) {
            if (!C32800a.m75679a(view)) {
                mo85639o();
            }
        } else if (id == R.id.aoo) {
            if (!C32800a.m75679a(view)) {
                mo85646q();
            }
        } else if (id != R.id.cy5) {
            if (id == R.id.v) {
                if (!C32800a.m75679a(view)) {
                    if (!C41854ai.m91833a(this)) {
                        C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        C41302w.m91042a().mo83858a((Activity) this, "aweme://about_activity");
                    }
                }
            } else if (id == R.id.c4x) {
                if (!C32800a.m75679a(view)) {
                    mo85651v();
                }
            } else if (id == R.id.a0n) {
                if (!C32800a.m75679a(view)) {
                    mo85652w();
                }
            } else if (id != R.id.ec3) {
                boolean z = true;
                if (id == R.id.ts) {
                    if (!C32800a.m75679a(view)) {
                        if (this.f105771E.f28450d) {
                            this.f105771E.mo19039b();
                            C23891e eVar = C23891e.f63559a;
                            C23891e.m58604a().storeLong("last_show_disk_manager_dot_time", System.currentTimeMillis());
                            if (!C23891e.f63559a.mo49497a(false)) {
                                C23891e eVar2 = C23891e.f63559a;
                                C23891e.m58604a().storeBoolean("has_show_disk_manager_dot", true);
                            }
                        }
                        mo85626C();
                    }
                } else if (id == R.id.bux) {
                    if (!C32800a.m75679a(view)) {
                    }
                } else if (id == R.id.bi2) {
                    if (!C32800a.m75679a(view)) {
                        C26890h.m65011a("live_photo_manage", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
                        SmartRouter.buildRoute((Context) this, "aweme://livewallpaper").open();
                    }
                } else if (id == R.id.da) {
                    if (!C32800a.m75679a(view)) {
                        if (C23794bh.m58390d().mo47114k()) {
                            BusinessComponentServiceUtils.getTimeLockHelperService().mo47090a(new C23706b<Boolean>() {
                                /* renamed from: a */
                                public final /* synthetic */ void mo47089a(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    SettingNewVersionActivity.this.mo85687G();
                                }
                            }, "add_account");
                        } else if (C23794bh.m58390d().mo47110g()) {
                            C10691a.m21548c((Context) this, (int) R.string.b0b).mo19066a();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            mo85687G();
                        }
                    }
                } else if (id == R.id.bjf) {
                    if (!C32800a.m75679a(view)) {
                        C26890h.m65011a("uc_user_logout_click", C23089d.m56640a().mo47829a("params_for_special", "uc_login").mo47829a("uid", C20854a.m53167g().getCurUserId()).f61491a);
                        mo85689a(false);
                    }
                } else if (id == R.id.bpn) {
                    if (!C32800a.m75679a(view)) {
                        mo85634f();
                    }
                } else if (id == R.id.cns) {
                    if (!C32800a.m75679a(view)) {
                        C26890h.m65011a("click_share_person", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
                        User curUser = C20854a.m53167g().getCurUser();
                        if (curUser != null) {
                            C40572w.m90011a(this, curUser, this.f105798c);
                        }
                    }
                } else if (id == R.id.bpd) {
                    if (!C32800a.m75679a(view)) {
                        mo85655z();
                    }
                } else if (id == R.id.e3g) {
                    if (!C32800a.m75679a(view)) {
                        mo85650u();
                    }
                } else if (id == R.id.an2) {
                    if (!C32800a.m75679a(view)) {
                        mo85628E();
                    }
                } else if (id == R.id.au7) {
                    if (!C32800a.m75679a(view)) {
                        C23542f.m57724i().mo48710b("show_insights_red", false);
                        mo85637m();
                    }
                } else if (id == R.id.cgi) {
                    if (!C32800a.m75679a(view)) {
                        mo85647r();
                    }
                } else if (id == R.id.auw) {
                    if (!C32800a.m75679a(view)) {
                        mo85645p();
                    }
                } else if (id == R.id.w) {
                    if (!C32800a.m75679a(view)) {
                        SmartRouter.buildRoute((Context) this, "aweme://setting/accessibility").open();
                    }
                } else if (id == R.id.a3f) {
                    if (!C32800a.m75679a(view)) {
                        SmartRouter.buildRoute((Context) this, "aweme://setting/datasaver").open();
                        C26890h.onEventV3("enter_data_saver");
                    }
                } else if (id == R.id.su) {
                    if (!C32800a.m75679a(view)) {
                        mo85654y();
                    }
                } else if (id == R.id.b5y) {
                    if (!C32800a.m75679a(view)) {
                        C41685b b = C41608a.m91466b();
                        if (b != null && !TextUtils.isEmpty(b.f105457b)) {
                            SmartRouter.buildRoute((Context) this, "aweme://webview").withParam(Uri.parse(b.f105457b)).withParam("title", getString(R.string.bu2)).open();
                        }
                    }
                } else if (id == R.id.e3o) {
                    if (!C32800a.m75679a(view)) {
                        mo85636l();
                    }
                } else if (id == R.id.ehn && !C32800a.m75679a(view)) {
                    UgcPermission ugcPermission = UgcPermissionSetting.INSTANCE.getUgcPermission();
                    if (ugcPermission != null) {
                        SmartRouter.buildRoute((Context) this, "//webview").withParam(Uri.parse(ugcPermission.getUrl())).open();
                    }
                }
            } else if (!C32800a.m75679a(view)) {
                mo85649t();
            }
        } else if (!C32800a.m75679a(view)) {
            mo85648s();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f105799d = findViewById(R.id.csm);
        this.f105800e = (ViewGroup) findViewById(R.id.cfc);
        this.f105801f = (TextTitleBar) findViewById(R.id.d10);
        this.f105802r = (CommonItemView) findViewById(R.id.a9w);
        this.f105803s = (CommonItemView) findViewById(R.id.e3o);
        this.f105804t = (CommonItemView) findViewById(R.id.x);
        this.f105805u = (CommonItemView) findViewById(R.id.btn);
        this.f105806v = (CommonItemView) findViewById(R.id.c4o);
        this.f105807w = (CommonItemView) findViewById(R.id.dl8);
        this.f105808x = (CommonItemView) findViewById(R.id.yh);
        this.f105809y = (CommonItemView) findViewById(R.id.aoo);
        this.f105810z = (CommonItemView) findViewById(R.id.aer);
        this.f105767A = (CommonItemView) findViewById(R.id.cy5);
        this.f105768B = (CommonItemView) findViewById(R.id.v);
        this.f105769C = (CommonItemView) findViewById(R.id.c4x);
        this.f105770D = (CommonItemView) findViewById(R.id.a0n);
        this.f105771E = (CommonItemView) findViewById(R.id.ts);
        this.f105772F = (TextView) findViewById(R.id.f133597dmt);
        this.f105773G = (TextView) findViewById(R.id.dog);
        this.f105774H = (CommonItemView) findViewById(R.id.bux);
        this.f105775I = (CommonItemView) findViewById(R.id.bi2);
        this.f105776J = (CommonItemView) findViewById(R.id.da);
        this.f105777K = (CommonItemView) findViewById(R.id.bjf);
        this.f105778L = (CommonItemView) findViewById(R.id.bpn);
        this.f105779M = (CommonItemView) findViewById(R.id.cns);
        this.f105780N = (CommonItemView) findViewById(R.id.bpd);
        this.f105781O = (CommonItemView) findViewById(R.id.e3g);
        this.f105782P = (CommonItemView) findViewById(R.id.an2);
        this.f105783Q = (CommonItemView) findViewById(R.id.au7);
        this.f105784R = (CommonItemView) findViewById(R.id.blm);
        this.f105785S = (CommonItemView) findViewById(R.id.cgi);
        this.f105786T = (CommonItemView) findViewById(R.id.auw);
        this.f105787U = (CommonItemView) findViewById(R.id.w);
        this.f105788V = (CommonItemView) findViewById(R.id.a3f);
        this.f105789W = (CommonItemView) findViewById(R.id.su);
        this.f105790X = (CommonItemView) findViewById(R.id.ec3);
        this.f105791Y = (CommonItemView) findViewById(R.id.b5y);
        this.f105792Z = (CommonItemView) findViewById(R.id.ehn);
        mo85631c();
        mo85633e();
        this.f105802r.setOnClickListener(this);
        this.f105804t.setOnClickListener(this);
        this.f105805u.setOnClickListener(this);
        this.f105806v.setOnClickListener(this);
        this.f105807w.setOnClickListener(this);
        this.f105808x.setOnClickListener(this);
        this.f105810z.setOnClickListener(this);
        this.f105809y.setOnClickListener(this);
        this.f105767A.setOnClickListener(this);
        this.f105768B.setOnClickListener(this);
        this.f105769C.setOnClickListener(this);
        this.f105770D.setOnClickListener(this);
        this.f105771E.setOnClickListener(this);
        this.f105774H.setOnClickListener(this);
        this.f105775I.setOnClickListener(this);
        this.f105776J.setOnClickListener(this);
        this.f105777K.setOnClickListener(this);
        this.f105778L.setOnClickListener(this);
        this.f105779M.setOnClickListener(this);
        this.f105780N.setOnClickListener(this);
        this.f105781O.setOnClickListener(this);
        this.f105782P.setOnClickListener(this);
        this.f105783Q.setOnClickListener(this);
        this.f105785S.setOnClickListener(this);
        this.f105786T.setOnClickListener(this);
        this.f105787U.setOnClickListener(this);
        this.f105773G.setOnClickListener(new C41851af(this));
        this.f105772F.setOnClickListener(new C41852ag(this));
        if (C41631k.m91508c()) {
            this.f105788V.setOnClickListener(this);
        }
        this.f105789W.setOnClickListener(this);
        if (m91766J()) {
            this.f105790X.setOnClickListener(this);
        }
        if (m91765I()) {
            this.f105791Y.setOnClickListener(this);
        }
        this.f105803s.setOnClickListener(this);
        C23794bh.m58380F().mo7199a(1);
    }

    /* renamed from: a */
    public final void mo44376a(int i, boolean z, int i2, User user) {
        if (!isFinishing() && this.f105795ab != null && this.f105795ab.isShowing()) {
            this.f105795ab.dismiss();
        }
    }
}
