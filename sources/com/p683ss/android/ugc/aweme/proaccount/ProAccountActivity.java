package com.p683ss.android.ugc.aweme.proaccount;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41628a;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41630c;
import com.p683ss.android.ugc.aweme.utils.C47897fr;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountActivity */
public final class ProAccountActivity extends AmeBaseActivity {

    /* renamed from: a */
    public static final C39668a f101241a = new C39668a(null);

    /* renamed from: b */
    private ButtonTitleBar f101242b;

    /* renamed from: c */
    private DmtTextView f101243c;

    /* renamed from: d */
    private HashMap f101244d;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountActivity$a */
    public static final class C39668a {
        private C39668a() {
        }

        public /* synthetic */ C39668a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountActivity$b */
    static final class C39669b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProAccountActivity f101245a;

        C39669b(ProAccountActivity proAccountActivity) {
            this.f101245a = proAccountActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f101245a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountActivity$c */
    static final class C39670c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProAccountActivity f101246a;

        C39670c(ProAccountActivity proAccountActivity) {
            this.f101246a = proAccountActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f101246a;
            StringBuilder sb = new StringBuilder("https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=");
            sb.append(C41630c.m91505a(44));
            C41628a.m91503a(context, sb.toString(), new HashMap());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProAccountActivity$d */
    static final class C39671d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProAccountActivity f101247a;

        C39671d(ProAccountActivity proAccountActivity) {
            this.f101247a = proAccountActivity;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            String str = null;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = b.getFeConfigCollection();
                if (feConfigCollection != null) {
                    FEConfig tcmEntrance = feConfigCollection.getTcmEntrance();
                    if (tcmEntrance != null) {
                        str = tcmEntrance.getSchema();
                    }
                }
            } catch (Exception unused) {
            }
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    SmartRouter.buildRoute((Context) this.f101247a, str).open();
                }
            }
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
            Editor edit = C35807d.m80935a(C32463a.m75161a(), "tcm_pro_account", 0).edit();
            StringBuilder sb = new StringBuilder("tcm_first_dot");
            sb.append(curUser.getUid());
            edit.putBoolean(sb.toString(), false);
            edit.apply();
        }
    }

    /* renamed from: a */
    private View m88378a(int i) {
        if (this.f101244d == null) {
            this.f101244d = new HashMap();
        }
        View view = (View) this.f101244d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101244d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.axe;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProAccountActivity", "onResume", true);
        super.onResume();
        if (C47897fr.f120492a.mo95102f()) {
            ((CommonItemView) m88378a(R.id.e4c)).mo19038a();
        } else {
            ((CommonItemView) m88378a(R.id.e4c)).mo19039b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProAccountActivity", "onResume", false);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        View a = m88378a(R.id.d1b);
        if (a != null) {
            this.f101242b = (ButtonTitleBar) a;
            ButtonTitleBar buttonTitleBar = this.f101242b;
            if (buttonTitleBar == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C52711k.m112236a((Object) titleView, "mButtonTitleBar.titleView");
            this.f101243c = titleView;
            ButtonTitleBar buttonTitleBar2 = this.f101242b;
            if (buttonTitleBar2 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            buttonTitleBar2.getStartBtn().setOnClickListener(new C39669b(this));
            DmtTextView dmtTextView = this.f101243c;
            if (dmtTextView == null) {
                C52711k.m112237a("mTitle");
            }
            dmtTextView.setText(getString(R.string.hml));
            ((CommonItemView) m88378a(R.id.dxt)).setOnClickListener(new C39670c(this));
            ((CommonItemView) m88378a(R.id.e4c)).setOnClickListener(new C39671d(this));
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.proaccount.ProAccountActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
    }
}
