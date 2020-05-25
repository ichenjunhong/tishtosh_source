package com.p683ss.android.ugc.aweme.location;

import android.app.Application;
import android.content.Context;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationClient;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.netwok.C9231a;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.location.C36275n.C36276a;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53256be;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.location.a */
public final class C36251a implements Callback, C36275n {

    /* renamed from: a */
    public C36282r f92809a;

    /* renamed from: b */
    public final C36283s f92810b;

    /* renamed from: c */
    private BDLocationClient f92811c;

    /* renamed from: d */
    private long f92812d = 600;

    /* renamed from: e */
    private C36288v f92813e;

    /* renamed from: f */
    private final Application f92814f;

    /* renamed from: g */
    private final C36284t f92815g;

    /* renamed from: com.ss.android.ugc.aweme.location.a$a */
    static final class C36252a implements C9231a {

        /* renamed from: a */
        final /* synthetic */ C36261f f92816a;

        C36252a(C36261f fVar) {
            this.f92816a = fVar;
        }

        /* renamed from: a */
        public final String mo16744a(String str, String str2, Map<String, String> map, Map<String, String> map2, List<C12685b> list, boolean z) {
            return this.f92816a.mo75082a(str, str2, map, map2, null, true);
        }
    }

    @C52618f(mo110254b = "BDLocationImpl.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.location.BDLocationImpl$init$2")
    /* renamed from: com.ss.android.ugc.aweme.location.a$b */
    static final class C36253b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        int f92817a;

        /* renamed from: b */
        final /* synthetic */ C36251a f92818b;

        /* renamed from: c */
        private C53199ae f92819c;

        C36253b(C36251a aVar, C52625c cVar) {
            this.f92818b = aVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C36253b bVar = new C36253b(this.f92818b, cVar);
            bVar.f92819c = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C36253b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            C36282r rVar;
            if (this.f92817a == 0) {
                C36251a aVar = this.f92818b;
                C36258c cVar = this.f92818b.f92810b.f92878l;
                if (cVar != null) {
                    rVar = cVar.mo75077a();
                } else {
                    rVar = null;
                }
                aVar.f92809a = rVar;
                return C52860x.f131107a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public final C36282r mo75064b() {
        return this.f92809a;
    }

    public final void onError(BDLocationException bDLocationException) {
    }

    /* renamed from: c */
    public final void mo75065c() {
        BDLocationClient bDLocationClient = this.f92811c;
        if (bDLocationClient != null) {
            bDLocationClient.stopLocation();
        }
    }

    /* renamed from: a */
    public final void mo75062a() {
        if (!C47946e.m103735a() || !m81851a((Context) this.f92814f)) {
            BDLocationClient bDLocationClient = this.f92811c;
            if (bDLocationClient != null) {
                C36288v vVar = this.f92813e;
                if (vVar == null) {
                    C52711k.m112237a("mTraceCallback");
                }
                bDLocationClient.setTraceCallback(vVar);
            }
            BDLocationClient bDLocationClient2 = this.f92811c;
            if (bDLocationClient2 != null) {
                bDLocationClient2.setMaxCacheTime(this.f92812d * 1000);
                bDLocationClient2.getLocation(this);
            }
        }
    }

    /* renamed from: a */
    private boolean m81851a(Context context) {
        C52711k.m112240b(context, "context");
        return C36276a.m81910a(this, context);
    }

    /* renamed from: a */
    public final void mo75063a(int i) {
        if (!C47946e.m103735a() || !m81851a((Context) this.f92814f)) {
            BDLocationClient bDLocationClient = this.f92811c;
            if (bDLocationClient != null) {
                bDLocationClient.setLocationInterval(((long) i) * 1000);
                bDLocationClient.startLocation(this);
            }
        }
    }

    public final void onLocationChanged(BDLocation bDLocation) {
        if (bDLocation != null) {
            if (bDLocation.isEmpty()) {
                bDLocation = null;
            }
            if (bDLocation != null) {
                C36284t tVar = this.f92815g;
                if (tVar != null) {
                    tVar.mo75089d();
                }
                C36282r rVar = new C36282r();
                rVar.setGaode(false);
                rVar.setLatitude(bDLocation.getLatitude());
                rVar.setLongitude(bDLocation.getLongitude());
                rVar.setCountry(bDLocation.getCountry());
                rVar.setProvince(bDLocation.getAdministrativeArea());
                rVar.setCity(bDLocation.getCity());
                rVar.setDistrict(bDLocation.getDistrict());
                rVar.setAddress(bDLocation.getAddress());
                rVar.setTime(bDLocation.getLocationMs());
                rVar.setAccuracy(bDLocation.getAccuracy());
                this.f92809a = rVar;
                if (bDLocation != null) {
                    if (bDLocation.isCache()) {
                        bDLocation = null;
                    }
                    if (bDLocation != null) {
                        C36282r rVar2 = this.f92809a;
                        if (rVar2 != null) {
                            C36258c cVar = this.f92810b.f92878l;
                            if (cVar != null) {
                                cVar.mo75078a(rVar2);
                            }
                        }
                    }
                }
            }
        }
    }

    public C36251a(Application application, C36283s sVar, C36284t tVar) {
        long j;
        C52711k.m112240b(application, "mApplication");
        C52711k.m112240b(sVar, "mSettings");
        this.f92814f = application;
        this.f92810b = sVar;
        this.f92815g = tVar;
        long j2 = 600;
        if (this.f92810b.f92875i > 0) {
            j2 = this.f92810b.f92875i;
        }
        this.f92812d = j2;
        BDLocationConfig.init(this.f92814f);
        String str = this.f92810b.f92867a;
        if (str == null) {
            str = TutorialVideoApiManager.f96873a;
        }
        BDLocationConfig.setBaseUrl(str);
        C36261f fVar = this.f92810b.f92877k;
        if (fVar != null) {
            BDLocationConfig.setNetworkApi(new C36252a(fVar));
        }
        boolean z = this.f92810b.f92870d;
        BDLocationConfig.setIsUploadGPS(z);
        int i = this.f92810b.f92869c;
        boolean z2 = true;
        if (i > 0) {
            BDLocationConfig.setUploadBaseSite(true);
            BDLocationConfig.setBssNum(i);
        } else {
            BDLocationConfig.setUploadBaseSite(false);
        }
        int i2 = this.f92810b.f92868b;
        if (i2 > 0) {
            BDLocationConfig.setUploadWIFI(true);
            BDLocationConfig.setWifiNum(i2);
        } else {
            BDLocationConfig.setUploadWIFI(false);
        }
        BDLocationConfig.setReportAtStart(this.f92810b.f92871e);
        if (!z && i <= 0 && i2 <= 0) {
            z2 = false;
        }
        BDLocationConfig.setUpload(z2);
        BDLocationConfig.setChineseChannel(this.f92810b.f92872f);
        BDLocationConfig.setLocale(this.f92810b.f92873g);
        BDLocationConfig.setUploadMccAndSystemRegionInfo(false);
        if (this.f92810b.f92874h > 0) {
            j = this.f92810b.f92874h;
        } else {
            j = this.f92812d;
        }
        BDLocationConfig.setUploadInterval(j * 1000);
        BDLocationConfig.setDebug(this.f92810b.f92876j);
        BDLocationConfig.setEnableBackgroundLocate(false);
        this.f92813e = new C36288v(this.f92810b.f92879m);
        C53301g.m113291a(C53256be.f131885a, null, null, new C36253b(this, null), 3, null);
        this.f92811c = new BDLocationClient("BDLocationImpl");
        BDLocationClient bDLocationClient = this.f92811c;
        if (bDLocationClient == null) {
            C52711k.m112234a();
        }
        bDLocationClient.setLocationMode(2).setLocationTimeOut(30000).setMaxCacheTime(this.f92812d * 1000);
    }
}
