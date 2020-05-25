package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
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
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.setting.C41631k;
import com.p683ss.android.ugc.aweme.setting.api.DataSaverApi.C41545a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity */
public final class DataSaverSettingActivity extends AmeBaseActivity {

    /* renamed from: a */
    private HashMap f105651a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$a */
    static final class C41733a<TTaskResult, TContinuationResult> implements C0011g<BaseResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f105652a;

        C41733a(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f105652a = dataSaverSettingActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo33d() || iVar.mo31c()) {
                CommonItemView commonItemView = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                C52711k.m112236a((Object) commonItemView, "data_saver_item");
                CommonItemView commonItemView2 = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                C52711k.m112236a((Object) commonItemView2, "data_saver_item");
                commonItemView.setChecked(!commonItemView2.mo19040c());
                C10691a.m21542b((Context) this.f105652a, (int) R.string.azh).mo19066a();
            } else if (iVar.mo26b()) {
                CommonItemView commonItemView3 = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                C52711k.m112236a((Object) commonItemView3, "data_saver_item");
                if (commonItemView3.mo19040c()) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (C41631k.m91507a(i)) {
                    CommonItemView commonItemView4 = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                    C52711k.m112236a((Object) commonItemView4, "data_saver_item");
                    if (commonItemView4.mo19040c()) {
                        C26890h.onEventV3("data_saver_on");
                    } else {
                        C26890h.onEventV3("data_saver_off");
                    }
                } else {
                    CommonItemView commonItemView5 = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                    C52711k.m112236a((Object) commonItemView5, "data_saver_item");
                    CommonItemView commonItemView6 = (CommonItemView) this.f105652a.mo85603a(R.id.a3g);
                    C52711k.m112236a((Object) commonItemView6, "data_saver_item");
                    commonItemView5.setChecked(!commonItemView6.mo19040c());
                    C10691a.m21542b((Context) this.f105652a, (int) R.string.azh).mo19066a();
                }
                return null;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$b */
    static final class C41734b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f105653a;

        C41734b(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f105653a = dataSaverSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105653a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity$c */
    static final class C41735c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DataSaverSettingActivity f105654a;

        C41735c(DataSaverSettingActivity dataSaverSettingActivity) {
            this.f105654a = dataSaverSettingActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DataSaverSettingActivity dataSaverSettingActivity = this.f105654a;
            CommonItemView commonItemView = (CommonItemView) dataSaverSettingActivity.mo85603a(R.id.a3g);
            C52711k.m112236a((Object) commonItemView, "data_saver_item");
            CommonItemView commonItemView2 = (CommonItemView) dataSaverSettingActivity.mo85603a(R.id.a3g);
            C52711k.m112236a((Object) commonItemView2, "data_saver_item");
            int i = 1;
            commonItemView.setChecked(!commonItemView2.mo19040c());
            CommonItemView commonItemView3 = (CommonItemView) dataSaverSettingActivity.mo85603a(R.id.a3g);
            C52711k.m112236a((Object) commonItemView3, "data_saver_item");
            if (!commonItemView3.mo19040c()) {
                i = 2;
            }
            C0011g aVar = new C41733a(dataSaverSettingActivity);
            C52711k.m112240b(aVar, "continuation");
            C41545a.f105240a.setDataSaverSetting(i).mo20a(aVar, C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.av;
    }

    /* renamed from: a */
    public final View mo85603a(int i) {
        if (this.f105651a == null) {
            this.f105651a = new HashMap();
        }
        View view = (View) this.f105651a.get(Integer.valueOf(R.id.a3g));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.a3g);
        this.f105651a.put(Integer.valueOf(R.id.a3g), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        Activity activity = this;
        C52711k.m112240b(activity, "activity");
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.title);
        C52711k.m112236a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.anr));
        findViewById(R.id.ik).setOnClickListener(new C41734b(this));
        ((CommonItemView) mo85603a(R.id.a3g)).setOnClickListener(new C41735c(this));
        CommonItemView commonItemView = (CommonItemView) mo85603a(R.id.a3g);
        C52711k.m112236a((Object) commonItemView, "data_saver_item");
        commonItemView.setChecked(C41631k.m91506a());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DataSaverSettingActivity", "onCreate", false);
    }
}
