package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p118b.p119a.p120a.p121a.C2581b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.poi.map.C39078j;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.model.C39142z;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.nearby.p2065c.C39150a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.PoiDetailWithoutMapFragment;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteFragment */
public class PoiRouteFragment extends C23526a implements C2581b, C39078j {

    /* renamed from: a */
    PoiStruct f100358a;

    /* renamed from: b */
    String f100359b;

    /* renamed from: c */
    int f100360c;

    /* renamed from: d */
    ViewGroup f100361d;

    /* renamed from: e */
    boolean f100362e;

    /* renamed from: j */
    C39150a f100363j;

    /* renamed from: k */
    private MapLayout f100364k;

    /* renamed from: l */
    private C39142z f100365l;

    /* renamed from: m */
    private View f100366m;

    /* renamed from: n */
    private boolean f100367n;

    /* renamed from: o */
    private DmtTextView f100368o;

    /* renamed from: p */
    private boolean f100369p = true;

    /* renamed from: q */
    private String f100370q;

    /* renamed from: r */
    private String f100371r;

    /* renamed from: s */
    private String f100372s;

    /* renamed from: t */
    private long f100373t = -1;

    /* renamed from: u */
    private PoiRoutePresenter f100374u;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo80073a() throws Exception {
        C26890h.m65011a("nearby_poi_icon_click", m87294g());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo80075f() throws Exception {
        C26890h.m65011a("nearby_poi_icon_show", m87294g());
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        PoiRoutePresenter poiRoutePresenter = this.f100374u;
        if (poiRoutePresenter.f100390l != null) {
            poiRoutePresenter.f100390l.unbind();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f100364k.mo79274e();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f100364k.mo79275f();
    }

    public void onStart() {
        super.onStart();
        this.f100364k.mo79270b();
        this.f100364k.setOnCameraChangeListener(this);
    }

    public void onStop() {
        super.onStop();
        this.f100364k.mo79272d();
    }

    public void onPause() {
        super.onPause();
        this.f100364k.mo79271c();
        if (getUserVisibleHint()) {
            if (this.f100373t != -1) {
                long currentTimeMillis = System.currentTimeMillis() - this.f100373t;
                if (currentTimeMillis > 0 && !TextUtils.isEmpty(this.f100370q)) {
                    C18842a.m45932a(new C39293aa(this, currentTimeMillis));
                }
                this.f100373t = -1;
            }
            PoiDetailWithoutMapFragment.m87383N();
        }
    }

    public void onResume() {
        super.onResume();
        this.f100364k.mo79264a();
        if (getUserVisibleHint()) {
            if (this.f100373t == -1) {
                this.f100373t = System.currentTimeMillis();
            }
            PoiDetailWithoutMapFragment.m87382M();
        }
        this.f100361d.postDelayed(new C39439z(this), 500);
    }

    /* renamed from: g */
    private Map<String, String> m87294g() {
        String str;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("page_type", "poi_map");
        PoiStruct poiStruct = this.f100358a;
        HashMap hashMap = new HashMap();
        if (poiStruct != null) {
            hashMap.put("poi_id", poiStruct.poiId);
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                hashMap.put("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                hashMap.put("poi_city", poiStruct.getCityCode());
                String str2 = "poi_device_samecity";
                if (poiStruct.getCityCode().equalsIgnoreCase(C30228f.m70982f())) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str2, str);
            }
        }
        return a.mo47830a(hashMap).f61491a;
    }

    public final void bG_() {
        if (this.f100358a != null) {
            this.f100374u.mo80063a(this.f100358a);
            this.f100371r = this.f100358a.poiId;
            this.f100372s = this.f100358a.typeCode;
        } else if (this.f100365l != null) {
            PoiRoutePresenter poiRoutePresenter = this.f100374u;
            C39142z zVar = this.f100365l;
            if (zVar != null) {
                poiRoutePresenter.f100384f = zVar.name;
                poiRoutePresenter.f100385g = zVar.address;
                if (poiRoutePresenter.mTitle != null) {
                    poiRoutePresenter.mTitle.setText(poiRoutePresenter.f100384f);
                }
                poiRoutePresenter.mo80081a((PoiStruct) null, String.valueOf(zVar.latitude), String.valueOf(zVar.longitude));
            }
        }
        if (this.f100374u instanceof PoiOptimizedRoutePresenter) {
            ((PoiOptimizedRoutePresenter) this.f100374u).mo80067e();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f100364k.mo79268a(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.c22) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80074a(long j) {
        C26890h.m65004a(getContext(), "stay_time", this.f100370q, j, 0);
        new C23213as().mo48005a(String.valueOf(j)).mo48006b(this.f100370q).mo48010e(this.f100371r).mo48011f(this.f100372s).mo48008d("map").mo48012g(this.f100359b).mo48004a(this.f100358a).mo48076e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        PoiRoutePresenter poiRoutePresenter;
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.f100366m.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
        }
        if (this.f100367n) {
            poiRoutePresenter = new PoiOptimizedRoutePresenter();
        } else {
            poiRoutePresenter = new PoiRoutePresenter();
        }
        this.f100374u = poiRoutePresenter;
        this.f100374u.mo80079a(this, view, this.f100364k, true);
        this.f100364k.mo79269a(bundle, this);
        this.f100364k.setOnMapZoomGestureListener(new C39437x(this));
        this.f100361d.setOnClickListener(new C39438y(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f100358a = (PoiStruct) arguments.getSerializable("poi_detail");
            this.f100365l = (C39142z) arguments.getSerializable("poi_latlng");
            this.f100367n = arguments.getBoolean("poi_route_from_poi");
            this.f100370q = arguments.getString("enter_from");
            this.f100359b = arguments.getString("aweme_id");
            this.f100360c = arguments.getInt("poi_nearby_hot_poi_cunt", 0);
        }
        View inflate = layoutInflater.inflate(R.layout.bmx, viewGroup, false);
        this.f100366m = inflate.findViewById(R.id.c2a);
        this.f100364k = (MapLayout) inflate.findViewById(R.id.c29);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.c22);
        this.f100361d = (ViewGroup) inflate.findViewById(R.id.emp);
        this.f100368o = (DmtTextView) inflate.findViewById(R.id.eb0);
        if (this.f100360c == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f100361d.setVisibility(8);
        } else {
            this.f100361d.setVisibility(0);
            this.f100361d.setTranslationY(C9432q.m18687b(getContext(), 68.0f));
            C0013i.m18a((Callable<TResult>) new C39294ab<TResult>(this), (Executor) C26890h.m65003a());
        }
        this.f100368o.setText(getResources().getString(R.string.h2k));
        int b = (int) C9432q.m18687b(getContext(), 32.0f);
        int b2 = (int) C9432q.m18687b(getContext(), 12.0f);
        imageView.setBackgroundResource(R.drawable.dk0);
        imageView.setImageResource(R.drawable.dl_);
        LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        layoutParams.leftMargin = b2;
        int b3 = (int) C9432q.m18687b(getContext(), 6.0f);
        imageView.setPadding(b3, b3, b3, b3);
        return inflate;
    }
}
