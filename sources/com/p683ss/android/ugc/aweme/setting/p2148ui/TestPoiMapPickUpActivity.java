package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.poi.map.C39077i;
import com.p683ss.android.ugc.aweme.poi.map.C39078j;
import com.p683ss.android.ugc.aweme.poi.map.C39082n;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39394p;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity */
public final class TestPoiMapPickUpActivity extends AmeBaseActivity implements C39078j, C39082n {

    /* renamed from: s */
    public static final C41786a f105833s = new C41786a(null);

    /* renamed from: w */
    private static final String f105834w = f105834w;

    /* renamed from: a */
    public MapLayout f105835a;

    /* renamed from: b */
    public DmtEditText f105836b;

    /* renamed from: c */
    public DmtEditText f105837c;

    /* renamed from: d */
    public double f105838d;

    /* renamed from: e */
    public double f105839e;

    /* renamed from: f */
    public double f105840f;

    /* renamed from: r */
    public double f105841r;

    /* renamed from: t */
    private ButtonTitleBar f105842t;

    /* renamed from: u */
    private DmtTextView f105843u;

    /* renamed from: v */
    private TextView f105844v;

    /* renamed from: x */
    private HashMap f105845x;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$a */
    public static final class C41786a {
        private C41786a() {
        }

        public /* synthetic */ C41786a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$b */
    static final class C41787b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f105846a;

        C41787b(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f105846a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105846a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$c */
    static final class C41788c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f105847a;

        C41788c(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f105847a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39394p a = C39394p.m87622a();
            C52711k.m112236a((Object) a, "PoiCollectStateInstance.getInstance()");
            if (!a.mo80364b()) {
                C41856ak.m91834a(Toast.makeText(this.f105847a, "enable toggle first", 0));
                return;
            }
            double[] dArr = {this.f105847a.f105838d, this.f105847a.f105839e};
            this.f105847a.f105840f = this.f105847a.f105838d;
            this.f105847a.f105841r = this.f105847a.f105839e;
            C39394p.m87622a().mo80363a(dArr);
            C41856ak.m91834a(Toast.makeText(this.f105847a, "lat & lng saved successfully!", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$d */
    static final class C41789d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f105848a;

        C41789d(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f105848a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = this.f105848a.f105837c;
            if (dmtEditText == null) {
                C52711k.m112237a("mLat");
            }
            double parseDouble = Double.parseDouble(String.valueOf(dmtEditText.getText()));
            DmtEditText dmtEditText2 = this.f105848a.f105836b;
            if (dmtEditText2 == null) {
                C52711k.m112237a("mLng");
            }
            double parseDouble2 = Double.parseDouble(String.valueOf(dmtEditText2.getText()));
            if (parseDouble <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || parseDouble2 <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f105848a.f105838d = parseDouble;
                this.f105848a.f105839e = parseDouble2;
                MapLayout mapLayout = this.f105848a.f105835a;
                if (mapLayout == null) {
                    C52711k.m112237a("mPoiMap");
                }
                mapLayout.mo79266a(BitmapFactory.decodeResource(this.f105848a.getResources(), R.drawable.dkp), this.f105848a.f105838d, this.f105848a.f105839e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$e */
    static final class C41790e implements C39077i {

        /* renamed from: a */
        public static final C41790e f105849a = new C41790e();

        C41790e() {
        }
    }

    /* renamed from: a */
    private View m91809a(int i) {
        if (this.f105845x == null) {
            this.f105845x = new HashMap();
        }
        View view = (View) this.f105845x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105845x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bmg;
    }

    public final void onPointerCaptureChanged(boolean z) {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79274e();
    }

    public final void onPause() {
        super.onPause();
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79271c();
    }

    public final void onStart() {
        super.onStart();
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79270b();
    }

    public final void onStop() {
        super.onStop();
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79272d();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", true);
        super.onResume();
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79264a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", false);
    }

    public final void bG_() {
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79267a(BitmapFactory.decodeResource(getResources(), R.drawable.dkp), this.f105838d, this.f105839e, 3.0f, C41790e.f105849a);
    }

    public final void onBackPressed() {
        Intent intent = getIntent();
        if (this.f105840f <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f105841r <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            setResult(0, intent);
        } else {
            intent.putExtra("latitude", this.f105840f);
            intent.putExtra("longitude", this.f105841r);
            setResult(-1, intent);
        }
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putDouble("latitude", this.f105838d);
        bundle.putDouble("longitude", this.f105839e);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", true);
        super.onCreate(bundle);
        MapLayout mapLayout = (MapLayout) m91809a(R.id.c13);
        C52711k.m112236a((Object) mapLayout, "poi_map");
        this.f105835a = mapLayout;
        View a = m91809a(R.id.d1b);
        if (a != null) {
            this.f105842t = (ButtonTitleBar) a;
            DmtEditText dmtEditText = (DmtEditText) m91809a(R.id.b6n);
            C52711k.m112236a((Object) dmtEditText, "lat_value");
            this.f105837c = dmtEditText;
            DmtEditText dmtEditText2 = (DmtEditText) m91809a(R.id.bh3);
            C52711k.m112236a((Object) dmtEditText2, "lng_value");
            this.f105836b = dmtEditText2;
            ButtonTitleBar buttonTitleBar = this.f105842t;
            if (buttonTitleBar == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C52711k.m112236a((Object) titleView, "mButtonTitleBar.titleView");
            this.f105843u = titleView;
            TextView textView = (TextView) m91809a(R.id.g7);
            C52711k.m112236a((Object) textView, "apply_latlng");
            this.f105844v = textView;
            ButtonTitleBar buttonTitleBar2 = this.f105842t;
            if (buttonTitleBar2 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            buttonTitleBar2.getStartBtn().setOnClickListener(new C41787b(this));
            ButtonTitleBar buttonTitleBar3 = this.f105842t;
            if (buttonTitleBar3 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            buttonTitleBar3.getEndBtn().setOnClickListener(new C41788c(this));
            TextView textView2 = this.f105844v;
            if (textView2 == null) {
                C52711k.m112237a("mApply");
            }
            textView2.setOnClickListener(new C41789d(this));
            DmtTextView dmtTextView = this.f105843u;
            if (dmtTextView == null) {
                C52711k.m112237a("mTitle");
            }
            dmtTextView.setText(f105834w);
            ButtonTitleBar buttonTitleBar4 = this.f105842t;
            if (buttonTitleBar4 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            DmtTextView endBtn = buttonTitleBar4.getEndBtn();
            C52711k.m112236a((Object) endBtn, "mButtonTitleBar.endBtn");
            endBtn.setVisibility(0);
            ButtonTitleBar buttonTitleBar5 = this.f105842t;
            if (buttonTitleBar5 == null) {
                C52711k.m112237a("mButtonTitleBar");
            }
            buttonTitleBar5.getEndBtn().setText(R.string.d_1);
            MapLayout mapLayout2 = this.f105835a;
            if (mapLayout2 == null) {
                C52711k.m112237a("mPoiMap");
            }
            mapLayout2.mo79269a(bundle, this);
            MapLayout mapLayout3 = this.f105835a;
            if (mapLayout3 == null) {
                C52711k.m112237a("mPoiMap");
            }
            mapLayout3.setOnMapClickListener(this);
            if (bundle == null) {
                this.f105839e = 116.4074d;
                this.f105838d = 39.9042d;
                DmtEditText dmtEditText3 = this.f105837c;
                if (dmtEditText3 == null) {
                    C52711k.m112237a("mLat");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(this.f105838d));
                dmtEditText3.setText(sb.toString());
                DmtEditText dmtEditText4 = this.f105836b;
                if (dmtEditText4 == null) {
                    C52711k.m112237a("mLng");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(this.f105839e));
                dmtEditText4.setText(sb2.toString());
            } else {
                this.f105838d = bundle.getDouble("latitude");
                this.f105839e = bundle.getDouble("longitude");
                DmtEditText dmtEditText5 = this.f105837c;
                if (dmtEditText5 == null) {
                    C52711k.m112237a("mLat");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.valueOf(this.f105838d));
                dmtEditText5.setText(sb3.toString());
                DmtEditText dmtEditText6 = this.f105836b;
                if (dmtEditText6 == null) {
                    C52711k.m112237a("mLng");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(String.valueOf(this.f105839e));
                dmtEditText6.setText(sb4.toString());
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
    }

    /* renamed from: a */
    public final void mo79283a(double d, double d2) {
        DmtEditText dmtEditText = this.f105837c;
        if (dmtEditText == null) {
            C52711k.m112237a("mLat");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(d));
        dmtEditText.setText(sb.toString());
        DmtEditText dmtEditText2 = this.f105836b;
        if (dmtEditText2 == null) {
            C52711k.m112237a("mLng");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(d2));
        dmtEditText2.setText(sb2.toString());
        this.f105838d = d;
        this.f105839e = d2;
        MapLayout mapLayout = this.f105835a;
        if (mapLayout == null) {
            C52711k.m112237a("mPoiMap");
        }
        mapLayout.mo79266a(BitmapFactory.decodeResource(getResources(), R.drawable.dkp), this.f105838d, this.f105839e);
    }
}
