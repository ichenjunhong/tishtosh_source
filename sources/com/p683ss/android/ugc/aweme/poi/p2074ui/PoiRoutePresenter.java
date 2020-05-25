package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.keva.Keva;
import com.p118b.p119a.p120a.p121a.C2583d;
import com.p118b.p119a.p120a.p121a.p122a.C2580a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.poi.map.C39073e;
import com.p683ss.android.ugc.aweme.poi.map.C39075g;
import com.p683ss.android.ugc.aweme.poi.map.C39080l;
import com.p683ss.android.ugc.aweme.poi.map.C39084p;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.model.C39142z;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.utils.C39469y.C394701;
import com.p683ss.android.ugc.aweme.poi.utils.C39469y.C39471a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter */
public class PoiRoutePresenter implements C39080l {

    /* renamed from: a */
    C23526a f100379a;

    /* renamed from: b */
    protected MapLayout f100380b;

    /* renamed from: c */
    protected C39075g f100381c;

    /* renamed from: d */
    public Context f100382d;

    /* renamed from: e */
    protected PoiStruct f100383e;

    /* renamed from: f */
    String f100384f;

    /* renamed from: g */
    String f100385g;

    /* renamed from: h */
    protected double[] f100386h;

    /* renamed from: i */
    protected double f100387i;

    /* renamed from: j */
    protected double f100388j;

    /* renamed from: k */
    protected boolean f100389k;

    /* renamed from: l */
    public Unbinder f100390l;

    /* renamed from: m */
    private Keva f100391m;
    TextView mRouteBus;
    TextView mRouteDrive;
    View mRouteTab;
    TextView mRouteWalking;
    public TextView mTitle;

    /* renamed from: n */
    private boolean f100392n;

    /* renamed from: o */
    private C36282r f100393o;

    /* renamed from: p */
    private boolean f100394p = true;

    /* renamed from: f */
    public boolean mo80068f() {
        return true;
    }

    /* renamed from: g */
    public C39084p mo80069g() {
        return null;
    }

    /* renamed from: h */
    public int mo80070h() {
        return R.layout.bne;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Resources mo80084i() {
        return this.f100382d.getResources();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80064b() {
        Object tag = this.mRouteDrive.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteDrive);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80065c() {
        Object tag = this.mRouteBus.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteTransit);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo80066d() {
        Object tag = this.mRouteWalking.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteWalking);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo80085j() {
        if (this.f100387i > ProfileUiInitOptimizeEnterThreshold.DEFAULT && this.f100388j > ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            this.f100380b.mo79266a(BitmapFactory.decodeResource(mo80084i(), R.drawable.dkp), this.f100387i, this.f100388j);
        }
    }

    /* renamed from: k */
    public final void mo80086k() {
        Context context = this.f100382d;
        double[] dArr = this.f100386h;
        if (dArr != null && dArr.length == 2) {
            ArrayList arrayList = new ArrayList();
            List installedPackages = context.getPackageManager().getInstalledPackages(0);
            if (installedPackages != null) {
                for (int i = 0; i < installedPackages.size(); i++) {
                    if ("com.google.android.apps.maps".equalsIgnoreCase(((PackageInfo) installedPackages.get(i)).packageName)) {
                        arrayList.add(C39471a.TYPE_GOOGLE);
                    }
                }
            }
            if (arrayList.size() == 0) {
                C10691a.m21542b(context, (int) R.string.crk).mo19066a();
                return;
            }
            C39471a aVar = (C39471a) arrayList.get(0);
            double d = dArr[0];
            double d2 = dArr[1];
            switch (C394701.f100902a[aVar.ordinal()]) {
                case 1:
                    StringBuilder sb = new StringBuilder("androidamap://route?sourceApplication=appName&slat=&slon=&sname=我的位置&dlat=");
                    sb.append(d);
                    sb.append("&dlon=");
                    sb.append(d2);
                    sb.append("&dname=目的地&dev=0&t=2");
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
                    return;
                case 2:
                    double sqrt = Math.sqrt((d2 * d2) + (d * d)) + (Math.sin(C39440a.f100859a * d) * 2.0E-5d);
                    double atan2 = Math.atan2(d, d2) + (Math.cos(d2 * C39440a.f100859a) * 3.0E-6d);
                    double[] dArr2 = {(Math.cos(atan2) * sqrt) + 0.0065d, (sqrt * Math.sin(atan2)) + 0.006d};
                    double d3 = dArr2[1];
                    double d4 = dArr2[0];
                    StringBuilder sb2 = new StringBuilder("baidumap://map/geocoder?location=");
                    sb2.append(d3);
                    sb2.append(",");
                    sb2.append(d4);
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
                    return;
                case 3:
                    StringBuilder sb3 = new StringBuilder("qqmap://map/routeplan?type=drive&from=&fromcoord=&to=目的地&tocoord=");
                    sb3.append(d);
                    sb3.append(",");
                    sb3.append(d2);
                    sb3.append("&policy=0&referer=appName");
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString())));
                    return;
                case 4:
                    double[] b = C39440a.m87684b(d2, d);
                    double d5 = b[1];
                    double d6 = b[0];
                    StringBuilder sb4 = new StringBuilder("google.navigation:q=");
                    sb4.append(d5);
                    sb4.append(",");
                    sb4.append(d6);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb4.toString()));
                    intent.setPackage("com.google.android.apps.maps");
                    context.startActivity(intent);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo80078a(int i) {
        if (this.mTitle != null) {
            this.mTitle.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo80082b(C39075g gVar) {
        mo80083c(gVar);
        if (gVar != C39075g.RouteWalking) {
            mo80080a(gVar);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c26) {
            mo80064b();
        } else if (id == R.id.c23) {
            mo80065c();
        } else {
            if (id == R.id.c2g) {
                mo80066d();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo80083c(C39075g gVar) {
        if (gVar == this.f100381c) {
            mo80062a(gVar, true);
        } else if (this.f100381c == null) {
            mo80062a(gVar, true);
            this.f100381c = gVar;
        } else {
            mo80062a(this.f100381c, false);
            this.f100381c = gVar;
            mo80062a(gVar, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80080a(C39075g gVar) {
        int i;
        if (this.f100391m != null && this.f100392n) {
            if (gVar == C39075g.RouteDrive) {
                i = 1;
            } else {
                i = 0;
            }
            this.f100391m.storeInt("poi_route_type", i);
        }
    }

    /* renamed from: a */
    public boolean mo80063a(PoiStruct poiStruct) {
        if (poiStruct == null) {
            C23131p.m57779a("poi_crash_log", C23088c.m56631a().mo47824a("poi_service", "poi_map").mo47824a("errorDesc", "poidetail is null").mo47824a("poitype", "map").mo47825b());
            return false;
        }
        this.f100383e = poiStruct;
        this.f100384f = poiStruct.poiName;
        this.f100385g = poiStruct.getAddressStr();
        if (this.mTitle != null) {
            this.mTitle.setText(this.f100384f);
        }
        return mo80081a(poiStruct, poiStruct.getPoiLatitude(), poiStruct.getPoiLongitude());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80077a(double d, double d2) {
        if (!TextUtils.isEmpty(this.f100384f)) {
            View inflate = LayoutInflater.from(this.f100382d).inflate(mo80070h(), null);
            TextView textView = (TextView) inflate.findViewById(R.id.c14);
            ((TextView) inflate.findViewById(R.id.c15)).setText(this.f100384f);
            if (TextUtils.isEmpty(this.f100385g)) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.f100385g);
            }
            MapLayout mapLayout = this.f100380b;
            C39142z zVar = new C39142z(d, d2);
            mapLayout.f99667b.mo7089a(inflate, new C2580a(zVar.latitude, zVar.longitude), C39462r.m87764a(this.f100382d), (C2583d) new C39073e(new C39296ad(this)));
            inflate.setOnClickListener(new C39297ae(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80062a(C39075g gVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (gVar != null) {
            switch (gVar) {
                case RouteDrive:
                    TextView textView = this.mRouteDrive;
                    if (z) {
                        i = R.drawable.dko;
                    } else {
                        i = R.drawable.dkn;
                    }
                    m87298a(textView, i, z);
                    return;
                case RouteTransit:
                    TextView textView2 = this.mRouteBus;
                    if (z) {
                        i2 = R.drawable.dkm;
                    } else {
                        i2 = R.drawable.dkl;
                    }
                    m87298a(textView2, i2, z);
                    return;
                case RouteWalking:
                    TextView textView3 = this.mRouteWalking;
                    if (z) {
                        i3 = R.drawable.dlb;
                    } else {
                        i3 = R.drawable.dla;
                    }
                    m87298a(textView3, i3, z);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m87298a(TextView textView, int i, boolean z) {
        int i2;
        Drawable drawable = mo80084i().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        textView.setCompoundDrawables(null, drawable, null, null);
        Resources i3 = mo80084i();
        if (z) {
            i2 = R.color.a36;
        } else {
            i2 = R.color.a1k;
        }
        textView.setTextColor(i3.getColor(i2));
        textView.setSelected(z);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0128  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo80081a(com.p683ss.android.ugc.aweme.poi.model.PoiStruct r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = 0
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0012 }
            java.lang.String r4 = "PoiPreferences"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepoFromSp(r0, r4, r3)     // Catch:{ Throwable -> 0x0012 }
            r1.f100391m = r0     // Catch:{ Throwable -> 0x0012 }
            goto L_0x0028
        L_0x0012:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "SharedPreferencesAnnotatedManager getSP failed "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r0)
        L_0x0028:
            double[] r0 = com.p683ss.android.ugc.aweme.poi.utils.C39442c.m87697a(r24, r25)
            r1.f100386h = r0
            com.ss.android.ugc.aweme.location.u r0 = com.p683ss.android.ugc.aweme.location.C36285u.C36286a.m81925a()
            com.ss.android.ugc.aweme.location.r r0 = r0.mo75118a()
            r1.f100393o = r0
            boolean r0 = r1.f100394p
            r4 = 1
            if (r0 == 0) goto L_0x0123
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x004a }
            java.lang.String r5 = "PoiPreferences"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepoFromSp(r0, r5, r3)     // Catch:{ Throwable -> 0x004a }
            r1.f100391m = r0     // Catch:{ Throwable -> 0x004a }
            goto L_0x0060
        L_0x004a:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SharedPreferencesAnnotatedManager getSP failed "
            r5.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r0)
        L_0x0060:
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            if (r0 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            double r5 = r0.getLatitude()
            r1.f100387i = r5
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            double r5 = r0.getLongitude()
            r1.f100388j = r5
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            boolean r0 = r0.isGaode()
            if (r0 != 0) goto L_0x008c
            double r5 = r1.f100388j
            double r7 = r1.f100387i
            double[] r0 = com.p683ss.android.ugc.aweme.poi.utils.C39440a.m87681a(r5, r7)
            r5 = r0[r3]
            r1.f100388j = r5
            r5 = r0[r4]
            r1.f100387i = r5
        L_0x008c:
            if (r2 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            boolean r0 = com.p683ss.android.ugc.aweme.poi.utils.C39468x.m87786a(r2, r0)
            r1.f100389k = r0
            goto L_0x00a5
        L_0x0097:
            com.ss.android.ugc.aweme.location.r r0 = r1.f100393o
            java.lang.String r2 = ""
            r5 = r24
            r6 = r25
            boolean r0 = com.p683ss.android.ugc.aweme.poi.utils.C39468x.m87784a(r0, r5, r6, r2)
            r1.f100389k = r0
        L_0x00a5:
            boolean r0 = r1.f100389k
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r22.mo80068f()
            if (r0 == 0) goto L_0x00b2
            r22.mo80085j()
        L_0x00b2:
            double[] r0 = r1.f100386h
            if (r0 == 0) goto L_0x0123
            double[] r0 = r1.f100386h
            r5 = r0[r3]
            double[] r0 = r1.f100386h
            r7 = r0[r4]
            double r9 = r1.f100387i
            double r11 = r1.f100388j
            double r5 = com.p683ss.android.ugc.aweme.poi.utils.C39442c.m87691a(r5, r7, r9, r11)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00d2
            com.ss.android.ugc.aweme.poi.map.g r0 = com.p683ss.android.ugc.aweme.poi.map.C39075g.RouteWalking
            r1.f100381c = r0
        L_0x00d0:
            r0 = 1
            goto L_0x00e9
        L_0x00d2:
            boolean r0 = r1.f100389k
            if (r0 == 0) goto L_0x00e8
            r1.f100392n = r4
            com.bytedance.keva.Keva r0 = r1.f100391m
            if (r0 == 0) goto L_0x00e3
            com.bytedance.keva.Keva r0 = r1.f100391m
            java.lang.String r2 = "poi_route_type"
            r0.getInt(r2, r3)
        L_0x00e3:
            com.ss.android.ugc.aweme.poi.map.g r0 = com.p683ss.android.ugc.aweme.poi.map.C39075g.RouteDrive
            r1.f100381c = r0
            goto L_0x00d0
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            if (r0 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.poi.map.MapLayout r0 = r1.f100380b
            com.ss.android.ugc.aweme.poi.model.z r2 = new com.ss.android.ugc.aweme.poi.model.z
            double r5 = r1.f100387i
            double r7 = r1.f100388j
            r2.<init>(r5, r7)
            com.ss.android.ugc.aweme.poi.model.z r5 = new com.ss.android.ugc.aweme.poi.model.z
            double[] r6 = r1.f100386h
            r7 = r6[r3]
            double[] r6 = r1.f100386h
            r9 = r6[r4]
            r5.<init>(r7, r9)
            com.ss.android.ugc.aweme.poi.map.g r6 = r1.f100381c
            com.ss.android.ugc.aweme.location.r r6 = r1.f100393o
            r6.getCity()
            com.b.a.a.a.a.a r6 = new com.b.a.a.a.a.a
            double r7 = r2.latitude
            double r9 = r2.longitude
            r6.<init>(r7, r9)
            com.b.a.a.a.a.a r2 = new com.b.a.a.a.a.a
            double r6 = r5.latitude
            double r8 = r5.longitude
            r2.<init>(r6, r8)
            com.ss.android.ugc.aweme.poi.map.d r2 = new com.ss.android.ugc.aweme.poi.map.d
            r2.<init>(r0, r1)
            r0 = 1
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            double[] r2 = r1.f100386h
            if (r2 == 0) goto L_0x018e
            boolean r2 = r22.mo80068f()
            if (r2 == 0) goto L_0x0139
            double[] r2 = r1.f100386h
            r5 = r2[r3]
            double[] r2 = r1.f100386h
            r7 = r2[r4]
            r1.mo80077a(r5, r7)
        L_0x0139:
            boolean r2 = r1.f100389k
            if (r2 == 0) goto L_0x015f
            double r5 = r1.f100387i
            double r7 = r1.f100388j
            boolean r2 = com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87773a(r5, r7)
            if (r2 == 0) goto L_0x015f
            boolean r2 = r22.mo80068f()
            if (r2 == 0) goto L_0x015f
            com.ss.android.ugc.aweme.poi.map.MapLayout r5 = r1.f100380b
            double[] r2 = r1.f100386h
            r6 = r2[r3]
            double[] r2 = r1.f100386h
            r8 = r2[r4]
            double r10 = r1.f100387i
            double r12 = r1.f100388j
            r5.mo79265a(r6, r8, r10, r12)
            goto L_0x018e
        L_0x015f:
            com.ss.android.ugc.aweme.poi.map.MapLayout r14 = r1.f100380b
            android.content.Context r2 = r1.f100382d
            android.graphics.Bitmap r15 = com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87764a(r2)
            double[] r2 = r1.f100386h
            r16 = r2[r3]
            double[] r2 = r1.f100386h
            r18 = r2[r4]
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r1.f100383e
            com.ss.android.ugc.aweme.location.r r3 = r1.f100393o
            boolean r2 = com.p683ss.android.ugc.aweme.poi.utils.C39468x.m87786a(r2, r3)
            if (r2 == 0) goto L_0x0182
            com.ss.android.ugc.aweme.poi.map.MapLayout r2 = r1.f100380b
            float r2 = r2.getZoomBig()
        L_0x017f:
            r20 = r2
            goto L_0x0189
        L_0x0182:
            com.ss.android.ugc.aweme.poi.map.MapLayout r2 = r1.f100380b
            float r2 = r2.getZoomSmall()
            goto L_0x017f
        L_0x0189:
            r21 = 0
            r14.mo79267a(r15, r16, r18, r20, r21)
        L_0x018e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.PoiRoutePresenter.mo80081a(com.ss.android.ugc.aweme.poi.model.PoiStruct, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo80079a(C23526a aVar, View view, MapLayout mapLayout, boolean z) {
        this.f100390l = ButterKnife.bind((Object) this, view);
        this.f100379a = aVar;
        this.f100380b = mapLayout;
        this.f100382d = mapLayout.getContext();
        this.f100394p = z;
    }
}
