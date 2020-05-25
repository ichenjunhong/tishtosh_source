package com.p683ss.android.ugc.aweme.shortvideo.publish;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.setting.C41538an;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity */
public final class PublishPrivacySettingActivity extends AmeSSActivity {

    /* renamed from: a */
    public String f112265a = "";

    /* renamed from: b */
    private boolean f112266b;

    /* renamed from: c */
    private boolean f112267c;

    /* renamed from: d */
    private boolean f112268d;

    /* renamed from: e */
    private HashMap<String, String> f112269e;

    /* renamed from: f */
    private boolean f112270f = true;

    /* renamed from: g */
    private HashMap f112271g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$a */
    static final class C44361a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f112272a;

        C44361a(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f112272a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (!C44387k.f112321a) {
                CommonItemView commonItemView = (CommonItemView) this.f112272a.mo90226a(R.id.ep);
                C52711k.m112236a((Object) commonItemView, "allow_download_setting_item");
                if (!commonItemView.mo19040c()) {
                    C10691a.m21542b((Context) this.f112272a, (int) R.string.ath).mo19066a();
                    return;
                }
            }
            CommonItemView commonItemView2 = (CommonItemView) this.f112272a.mo90226a(R.id.ep);
            C52711k.m112236a((Object) commonItemView2, "allow_download_setting_item");
            CommonItemView commonItemView3 = (CommonItemView) this.f112272a.mo90226a(R.id.ep);
            C52711k.m112236a((Object) commonItemView3, "allow_download_setting_item");
            commonItemView2.setChecked(!commonItemView3.mo19040c());
            String str2 = "click_download_control";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f112272a.f112265a).mo47829a("enter_from", "video_post_page");
            String str3 = "to_status";
            CommonItemView commonItemView4 = (CommonItemView) this.f112272a.mo90226a(R.id.ep);
            C52711k.m112236a((Object) commonItemView4, "allow_download_setting_item");
            if (commonItemView4.mo19040c()) {
                str = "on";
            } else {
                str = "off";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$b */
    static final class C44362b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f112273a;

        C44362b(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f112273a = publishPrivacySettingActivity;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            C39618d.f101151O.mo83116a(C40796a.ReactDuetSettingChanged, true);
            C40795l lVar = C39618d.f101151O;
            C40796a aVar = C40796a.ReactDuetSettingCurrent;
            CommonItemView commonItemView = (CommonItemView) this.f112273a.mo90226a(R.id.c9a);
            C52711k.m112236a((Object) commonItemView, "react_duet_setting_item");
            if (commonItemView.mo19040c()) {
                i = C41538an.f105227e;
            } else {
                i = C41538an.f105228f;
            }
            lVar.mo83113a(aVar, i);
            CommonItemView commonItemView2 = (CommonItemView) this.f112273a.mo90226a(R.id.c9a);
            C52711k.m112236a((Object) commonItemView2, "react_duet_setting_item");
            CommonItemView commonItemView3 = (CommonItemView) this.f112273a.mo90226a(R.id.c9a);
            C52711k.m112236a((Object) commonItemView3, "react_duet_setting_item");
            commonItemView2.setChecked(!commonItemView3.mo19040c());
            String str2 = "click_react_duet_control";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f112273a.f112265a).mo47829a("enter_from", "video_post_page");
            String str3 = "to_status";
            CommonItemView commonItemView4 = (CommonItemView) this.f112273a.mo90226a(R.id.c9a);
            C52711k.m112236a((Object) commonItemView4, "react_duet_setting_item");
            if (commonItemView4.mo19040c()) {
                str = "on";
            } else {
                str = "off";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity$c */
    public static final class C44363c implements C10713a {

        /* renamed from: a */
        final /* synthetic */ PublishPrivacySettingActivity f112274a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C44363c(PublishPrivacySettingActivity publishPrivacySettingActivity) {
            this.f112274a = publishPrivacySettingActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f112274a.onBackPressed();
        }
    }

    /* renamed from: a */
    public final View mo90226a(int i) {
        if (this.f112271g == null) {
            this.f112271g = new HashMap();
        }
        View view = (View) this.f112271g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f112271g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        Activity activity = this;
        C52711k.m112240b(activity, "activity");
        ImmersionBar.with(activity).statusBarColor((int) R.color.wo).statusBarDarkFont(true).init();
    }

    public final void onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        CommonItemView commonItemView = (CommonItemView) mo90226a(R.id.xj);
        C52711k.m112236a((Object) commonItemView, "comment_setting_item");
        bundle.putBoolean("comment_item_checked", commonItemView.mo19040c());
        CommonItemView commonItemView2 = (CommonItemView) mo90226a(R.id.c9a);
        C52711k.m112236a((Object) commonItemView2, "react_duet_setting_item");
        bundle.putBoolean("react_duet_item_checked", commonItemView2.mo19040c());
        CommonItemView commonItemView3 = (CommonItemView) mo90226a(R.id.ep);
        C52711k.m112236a((Object) commonItemView3, "allow_download_setting_item");
        bundle.putBoolean("download_item_checked", commonItemView3.mo19040c());
        intent.putExtras(bundle);
        setResult(-1, intent);
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dn);
        this.f112266b = getIntent().getBooleanExtra("comment_item_checked", false);
        this.f112267c = getIntent().getBooleanExtra("react_duet_item_checked", false);
        this.f112268d = getIntent().getBooleanExtra("download_item_checked", true);
        this.f112270f = getIntent().getBooleanExtra("can_react_duet", true);
        String stringExtra = getIntent().getStringExtra("creation_id");
        C52711k.m112236a((Object) stringExtra, "intent.getStringExtra(\"creation_id\")");
        this.f112265a = stringExtra;
        Serializable serializableExtra = getIntent().getSerializableExtra("mob_data");
        if (serializableExtra != null) {
            this.f112269e = (HashMap) serializableExtra;
            C39618d.f101179t.mo74307a((CommonItemView) mo90226a(R.id.xj), this.f112266b, this.f112269e);
            if (this.f112270f) {
                CommonItemView commonItemView = (CommonItemView) mo90226a(R.id.c9a);
                C52711k.m112236a((Object) commonItemView, "react_duet_setting_item");
                commonItemView.setVisibility(0);
                CommonItemView commonItemView2 = (CommonItemView) mo90226a(R.id.c9a);
                C52711k.m112236a((Object) commonItemView2, "react_duet_setting_item");
                commonItemView2.setChecked(this.f112267c);
                ((CommonItemView) mo90226a(R.id.c9a)).setOnClickListener(new C44362b(this));
            } else {
                CommonItemView commonItemView3 = (CommonItemView) mo90226a(R.id.c9a);
                C52711k.m112236a((Object) commonItemView3, "react_duet_setting_item");
                commonItemView3.setVisibility(8);
            }
            if (C44387k.f112322b.mo90252b()) {
                CommonItemView commonItemView4 = (CommonItemView) mo90226a(R.id.ep);
                C52711k.m112236a((Object) commonItemView4, "allow_download_setting_item");
                commonItemView4.setVisibility(0);
                CommonItemView commonItemView5 = (CommonItemView) mo90226a(R.id.ep);
                C52711k.m112236a((Object) commonItemView5, "allow_download_setting_item");
                commonItemView5.setChecked(this.f112268d);
                ((CommonItemView) mo90226a(R.id.ep)).setOnClickListener(new C44361a(this));
            } else {
                CommonItemView commonItemView6 = (CommonItemView) mo90226a(R.id.ep);
                C52711k.m112236a((Object) commonItemView6, "allow_download_setting_item");
                commonItemView6.setVisibility(8);
            }
            ((ButtonTitleBar) mo90226a(R.id.d10)).setTitle((int) R.string.cx4);
            ((ButtonTitleBar) mo90226a(R.id.d10)).setOnTitleBarClickListener(new C44363c(this));
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.publish.PublishPrivacySettingActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
    }
}
