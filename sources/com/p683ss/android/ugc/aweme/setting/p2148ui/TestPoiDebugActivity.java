package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItem;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.poi.utils.C39444e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity */
public final class TestPoiDebugActivity extends AmeBaseActivity {

    /* renamed from: a */
    public static final C41781a f105825a = new C41781a(null);

    /* renamed from: b */
    private ButtonTitleBar f105826b;

    /* renamed from: c */
    private DmtTextView f105827c;

    /* renamed from: d */
    private HashMap f105828d;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity$a */
    public static final class C41781a {
        private C41781a() {
        }

        public /* synthetic */ C41781a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity$b */
    static final class C41782b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiDebugActivity f105829a;

        C41782b(TestPoiDebugActivity testPoiDebugActivity) {
            this.f105829a = testPoiDebugActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SmartRouter.buildRoute((Context) this.f105829a, "//test/poi/overseas").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity$c */
    static final class C41783c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiDebugActivity f105830a;

        C41783c(TestPoiDebugActivity testPoiDebugActivity) {
            this.f105830a = testPoiDebugActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            TestPoiDebugActivity testPoiDebugActivity = this.f105830a;
            new C11105a(testPoiDebugActivity).mo20146b((CharSequence) "Clear POI SP Cache ?").mo20145b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo20136a((int) R.string.ah2, (DialogInterface.OnClickListener) new C41785e(testPoiDebugActivity)).mo20148b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity$d */
    static final class C41784d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiDebugActivity f105831a;

        C41784d(TestPoiDebugActivity testPoiDebugActivity) {
            this.f105831a = testPoiDebugActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105831a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity$e */
    static final class C41785e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiDebugActivity f105832a;

        C41785e(TestPoiDebugActivity testPoiDebugActivity) {
            this.f105832a = testPoiDebugActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            TestPoiDebugActivity testPoiDebugActivity = this.f105832a;
            C30433j.m71353a(false);
            C30433j.m71355b(false);
            C30433j.m71356c(false);
            Keva repo = Keva.getRepo("poi_repo");
            if (repo != null) {
                repo.storeLong("collect_action_latest_time", 0);
                repo.storeLong("collect_display_latest_time", 0);
            }
            C39444e.m87712a(false);
            C10691a.m21551c((Context) testPoiDebugActivity, "clear success").mo19066a();
        }
    }

    /* renamed from: a */
    private View m91807a(int i) {
        if (this.f105828d == null) {
            this.f105828d = new HashMap();
        }
        View view = (View) this.f105828d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105828d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bmd;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity", "onCreate", true);
        super.onCreate(bundle);
        View a = m91807a(R.id.d1b);
        if (a != null) {
            this.f105826b = (ButtonTitleBar) a;
            ButtonTitleBar buttonTitleBar = this.f105826b;
            if (buttonTitleBar == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C52711k.m112236a((Object) titleView, "mButtonTitleBar.titleView");
            this.f105827c = titleView;
            DmtTextView dmtTextView = this.f105827c;
            if (dmtTextView == null) {
                C52711k.m112237a("mTitle");
            }
            dmtTextView.setText("POI Debug Tools");
            ((SettingItem) m91807a(R.id.c1a)).setOnClickListener(new C41782b(this));
            ((SettingItem) m91807a(R.id.e27)).setOnClickListener(new C41783c(this));
            ButtonTitleBar buttonTitleBar2 = this.f105826b;
            if (buttonTitleBar2 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            buttonTitleBar2.getStartBtn().setOnClickListener(new C41784d(this));
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiDebugActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
    }
}
