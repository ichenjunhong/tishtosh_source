package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39394p;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity */
public class TestPoiOverseasActivity extends AmeBaseActivity implements C10731a {

    /* renamed from: a */
    private double[][] f105850a = {new double[]{35.6876148d, 139.7567735d}, new double[]{35.7078225d, 139.7660301d}, new double[]{39.4972306d, -116.5261509d}, new double[]{35.4634218d, -97.5173063d}, new double[]{12.8966982d, 100.8938733d}, new double[]{12.9723444d, 100.973703d}, new double[]{50.8812038d, 10.1427705d}, new double[]{39.9252825d, -8.7372812d}, new double[]{38.5318013d, 35.4382321d}, new double[]{37.2761492d, 34.7951663d}, new double[]{24.4419429d, 54.6478849d}, new double[]{24.4382834d, 54.5702582d}, new double[]{55.797254d, 37.5471293d}, new double[]{51.7548197d, -1.2565555d}};
    SettingItemSwitch fakeGps;
    DmtEditText latValue;
    DmtEditText lngValue;
    RecyclerView mLocationList;
    TextView mMapGetPoint;
    TextView mMccMnc;
    DmtEditText mSchemaEditText;
    TextView mTitle;
    TextView mTxtApply;
    TextView mTxtLat;
    TextView mTxtLng;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$a */
    static class C41792a extends C1322a<C41794c> {

        /* renamed from: a */
        private Context f105851a;

        /* renamed from: b */
        private List<C41793b> f105852b;

        public final int getItemCount() {
            if (this.f105852b == null) {
                return 0;
            }
            return this.f105852b.size();
        }

        private C41792a(Context context, List<C41793b> list) {
            this.f105851a = context;
            this.f105852b = list;
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C41794c cVar = (C41794c) vVar;
            C41793b bVar = (C41793b) this.f105852b.get(i);
            cVar.f105856a.setText(bVar.f105853a);
            cVar.itemView.setOnClickListener(new OnClickListener(bVar) {

                /* renamed from: a */
                final /* synthetic */ C41793b f105858a;

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!C39394p.m87622a().mo80364b()) {
                        C41857al.m91835a(Toast.makeText(C41794c.this.f105857b, "enable toggle first", 0));
                        return;
                    }
                    C39394p.m87622a().mo80363a(new double[]{this.f105858a.f105854b, this.f105858a.f105855c});
                    C41857al.m91835a(Toast.makeText(C41794c.this.f105857b, "lat & lng saved successfully!", 0));
                }

                {
                    this.f105858a = r2;
                }
            });
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C41794c(LayoutInflater.from(this.f105851a).inflate(R.layout.bmh, viewGroup, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$b */
    static class C41793b {

        /* renamed from: a */
        public String f105853a;

        /* renamed from: b */
        public double f105854b;

        /* renamed from: c */
        public double f105855c;

        C41793b(String str, double[] dArr) {
            this.f105853a = str;
            this.f105854b = dArr[0];
            this.f105855c = dArr[1];
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$c */
    static class C41794c extends C1352v {

        /* renamed from: a */
        TextView f105856a;

        /* renamed from: b */
        public Context f105857b;

        C41794c(View view) {
            super(view);
            this.f105857b = view.getContext();
            this.f105856a = (TextView) view.findViewById(R.id.bip);
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bmi;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void mapGetPoint() {
        if (!C39394p.m87622a().mo80364b()) {
            C41858am.m91836a(Toast.makeText(this, "enable toggle first", 0));
        } else {
            startActivityForResult(new Intent(this, TestPoiMapPickUpActivity.class), 666);
        }
    }

    public void schemaJump() {
        String str = "";
        if (this.mSchemaEditText.getText() != null) {
            str = this.mSchemaEditText.getText().toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            C41858am.m91836a(Toast.makeText(this, "please input schema!", 0));
        } else {
            C41302w.m91042a().mo83861a(str);
        }
    }

    public void onConfigPoiOverseas() {
        if (!C39394p.m87622a().mo80364b()) {
            C41858am.m91836a(Toast.makeText(this, "enable toggle first", 0));
            return;
        }
        String obj = this.latValue.getEditableText().toString();
        String obj2 = this.lngValue.getEditableText().toString();
        if (C9431p.m18664a(obj) || C9431p.m18664a(obj2)) {
            C41858am.m91836a(Toast.makeText(this, "must set both lat & lng", 0));
            return;
        }
        double parseDouble = Double.parseDouble(obj);
        double parseDouble2 = Double.parseDouble(obj2);
        if (Math.abs(parseDouble) > 90.0d) {
            C41858am.m91836a(Toast.makeText(this, "lat should be set from -90 to 90", 0));
        } else if (Math.abs(parseDouble2) > 180.0d) {
            C41858am.m91836a(Toast.makeText(this, "lng should be set from -180 to 180", 0));
        } else {
            C39394p a = C39394p.m87622a();
            if (a.f100771a != null) {
                a.f100771a.storeString("fake_lat", obj);
                a.f100771a.storeString("fake_lng", obj2);
            }
        }
    }

    public void exit(View view) {
        finish();
    }

    public void OnSettingItemClick(View view) {
        if (view.getId() == R.id.aad) {
            boolean z = !this.fakeGps.mo19319a();
            C39394p a = C39394p.m87622a();
            if (a.f100771a != null) {
                a.f100771a.storeBoolean("enable_fake_gps", z);
            }
            this.fakeGps.setChecked(z);
            this.fakeGps.setBackground(getResources().getDrawable(R.color.a1v));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", true);
        super.onCreate(bundle);
        this.fakeGps.setChecked(C39394p.m87622a().mo80364b());
        this.fakeGps.setOnSettingItemClickListener(this);
        this.mTitle.setText("POI FAKE GPS");
        this.mTxtLat.setText("latitude");
        this.mTxtLng.setText("longitude");
        this.mTxtApply.setText("Apply");
        TextView textView = this.mMccMnc;
        StringBuilder sb = new StringBuilder();
        sb.append("getNetworkOperator:");
        sb.append(C23726m.m58235a());
        sb.append("\ngetSimOperator:");
        sb.append(C23726m.m58236a(this, ""));
        textView.setText(sb.toString());
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo4731b(1);
        this.mLocationList.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView = this.mLocationList;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C41793b("日本——二の丸庭園", this.f105850a[0]));
        arrayList.add(new C41793b("日本——Yushima Tenmangu", this.f105850a[1]));
        arrayList.add(new C41793b("美国——Sonic Drive-In", this.f105850a[2]));
        arrayList.add(new C41793b("美国——Chesapeake Energy Arena", this.f105850a[3]));
        arrayList.add(new C41793b("泰国——Underwater World Pattaya", this.f105850a[4]));
        arrayList.add(new C41793b("泰国——Pattaya Sheep farms", this.f105850a[5]));
        arrayList.add(new C41793b("德国——schönen Feriendorf Frauensee", this.f105850a[6]));
        arrayList.add(new C41793b("葡萄牙——Vista Alegre", this.f105850a[7]));
        arrayList.add(new C41793b("土耳其——埃尔吉耶斯山Erciyes Dağı", this.f105850a[8]));
        arrayList.add(new C41793b("土耳其——Topaşır Milli Parkı", this.f105850a[9]));
        arrayList.add(new C41793b("阿拉伯——阿布扎比国际机场", this.f105850a[10]));
        arrayList.add(new C41793b("阿拉伯——Al Raha Beach Hotel", this.f105850a[11]));
        arrayList.add(new C41793b("莫斯科——Центральный дом авиации и космонавтики ДОСААФ РФ", this.f105850a[12]));
        arrayList.add(new C41793b("英国——牛津大学University of Oxford", this.f105850a[13]));
        recyclerView.setAdapter(new C41792a(this, arrayList));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 666) {
                DmtEditText dmtEditText = this.latValue;
                StringBuilder sb = new StringBuilder();
                sb.append(intent.getDoubleExtra("latitude", ProfileUiInitOptimizeEnterThreshold.DEFAULT));
                dmtEditText.setText(sb.toString());
                DmtEditText dmtEditText2 = this.lngValue;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intent.getDoubleExtra("longitude", ProfileUiInitOptimizeEnterThreshold.DEFAULT));
                dmtEditText2.setText(sb2.toString());
            }
            super.onActivityResult(i, i2, intent);
        }
    }
}
