package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.poi.model.C39142z;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.utils.C39441b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity */
public class PoiRouteActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.by);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a3m));
        PoiStruct poiStruct = (PoiStruct) getIntent().getSerializableExtra("poi_detail");
        C39142z zVar = (C39142z) getIntent().getSerializableExtra("poi_latlng");
        String stringExtra = getIntent().getStringExtra("enter_from");
        boolean booleanExtra = getIntent().getBooleanExtra("poi_route_from_poi", false);
        String stringExtra2 = getIntent().getStringExtra("aweme_id");
        int intExtra = getIntent().getIntExtra("poi_nearby_hot_poi_cunt", 0);
        if (poiStruct == null && zVar == null) {
            String stringExtra3 = getIntent().getStringExtra("poi_name");
            String stringExtra4 = getIntent().getStringExtra("poi_address");
            String stringExtra5 = getIntent().getStringExtra("zoom");
            String stringExtra6 = getIntent().getStringExtra("longitude");
            String stringExtra7 = getIntent().getStringExtra("latitude");
            z = getIntent().getBooleanExtra("show_navi", false);
            str = getIntent().getStringExtra("refer");
            if (!TextUtils.isEmpty(stringExtra6) && !TextUtils.isEmpty(stringExtra7)) {
                zVar = new C39142z();
                zVar.name = stringExtra3;
                zVar.address = stringExtra4;
                if (!TextUtils.isEmpty(stringExtra5)) {
                    zVar.zoom = Float.valueOf(stringExtra5).floatValue();
                }
                zVar.longitude = Double.valueOf(stringExtra6).doubleValue();
                zVar.latitude = Double.valueOf(stringExtra7).doubleValue();
            }
        } else {
            str = stringExtra;
            z = booleanExtra;
        }
        C0654k supportFragmentManager = getSupportFragmentManager();
        C0679r a = supportFragmentManager.mo2225a();
        Fragment a2 = supportFragmentManager.mo2224a("poi_detail_fragment_tag");
        if (a2 == 0) {
            if (poiStruct != null) {
                Bundle bundle2 = new Bundle(1);
                bundle2.putSerializable("poi_detail", poiStruct);
                bundle2.putBoolean("poi_route_from_poi", z);
                bundle2.putString("enter_from", str);
                bundle2.putInt("poi_nearby_hot_poi_cunt", intExtra);
                bundle2.putString("aweme_id", stringExtra2);
                PoiRouteFragment poiRouteFragment = new PoiRouteFragment();
                poiRouteFragment.setArguments(bundle2);
                a2 = poiRouteFragment;
            } else if (zVar != null) {
                Bundle bundle3 = new Bundle(1);
                bundle3.putSerializable("poi_latlng", zVar);
                bundle3.putBoolean("poi_route_from_poi", z);
                bundle3.putString("enter_from", str);
                bundle3.putInt("poi_nearby_hot_poi_cunt", intExtra);
                PoiRouteFragment poiRouteFragment2 = new PoiRouteFragment();
                poiRouteFragment2.setArguments(bundle3);
                a2 = poiRouteFragment2;
            } else {
                finish();
                C39441b.m87689b(ImmersionBar.with((Activity) this).fitsSystemWindows(true));
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", false);
            }
        }
        a2.setUserVisibleHint(true);
        a.mo2192b(R.id.yw, a2, "poi_detail_fragment_tag");
        a.mo2195c();
        C39441b.m87689b(ImmersionBar.with((Activity) this).fitsSystemWindows(true));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m87293a(Context context, C39142z zVar) {
        boolean z = zVar.showNavi;
        Intent intent = new Intent(context, PoiRouteActivity.class);
        intent.putExtra("poi_latlng", zVar);
        intent.putExtra("poi_route_from_poi", z);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m87292a(Context context, PoiStruct poiStruct, String str, String str2, boolean z, int i) {
        Intent intent = new Intent(context, PoiRouteActivity.class);
        intent.putExtra("poi_detail", poiStruct);
        intent.putExtra("poi_route_from_poi", z);
        intent.putExtra("enter_from", str);
        intent.putExtra("aweme_id", str2);
        intent.putExtra("poi_nearby_hot_poi_cunt", i);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.bm, 0);
        }
    }
}
