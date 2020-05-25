package com.p683ss.android.ugc.aweme.antiaddic.lock.p1355a;

import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22717b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1356b.C22712a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a */
public final class C22704a {

    /* renamed from: a */
    public final TeenageModeApi f60904a;

    /* renamed from: b */
    public C22712a f60905b;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$a */
    public static final class C22705a implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C22704a f60906a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C22705a(C22704a aVar) {
            this.f60906a = aVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((BaseResponse) obj, "t");
            C22712a aVar = this.f60906a.f60905b;
            if (aVar != null) {
                aVar.mo47117h();
            }
        }

        public final void onError(Throwable th) {
            String str;
            C52711k.m112240b(th, "e");
            if (th instanceof C23459a) {
                C23459a aVar = (C23459a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    str = C11010c.m22280a().getString(R.string.cg0);
                } else {
                    str = aVar.getErrorMsg();
                }
                C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
            } else {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg0).mo19066a();
            }
            C22712a aVar2 = this.f60906a.f60905b;
            if (aVar2 != null) {
                aVar2.mo47116g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$b */
    public static final class C22706b implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C22704a f60907a;

        /* renamed from: b */
        final /* synthetic */ String f60908b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((BaseResponse) obj, "t");
            C22712a aVar = this.f60907a.f60905b;
            if (aVar != null) {
                aVar.mo47117h();
            }
            C23131p.m56692a("compliance_api_status", "", C23088c.m56631a().mo47824a("type", "/aweme/v1/minor/user/set/settings/").mo47824a("param", this.f60908b).mo47822a("status", Integer.valueOf(0)).mo47825b());
        }

        public final void onError(Throwable th) {
            int i;
            String str;
            C52711k.m112240b(th, "e");
            boolean z = th instanceof C23459a;
            if (z) {
                C23459a aVar = (C23459a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    str = C11010c.m22280a().getString(R.string.cg0);
                } else {
                    str = aVar.getErrorMsg();
                }
                C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
            } else {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.cg0).mo19066a();
            }
            String str2 = "compliance_api_status";
            String str3 = "";
            C23088c a = C23088c.m56631a().mo47824a("type", "/aweme/v1/minor/user/set/settings/");
            String str4 = "error_message";
            if (z) {
                i = ((C23459a) th).getErrorCode();
            } else {
                i = -1;
            }
            C23131p.m56692a(str2, str3, a.mo47822a(str4, Integer.valueOf(i)).mo47824a("param", this.f60908b).mo47822a("status", Integer.valueOf(1)).mo47825b());
            C22712a aVar2 = this.f60907a.f60905b;
            if (aVar2 != null) {
                aVar2.mo47116g();
            }
        }

        C22706b(C22704a aVar, String str) {
            this.f60907a = aVar;
            this.f60908b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$c */
    public static final class C22707c implements C1674ab<C22717b> {
        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z;
            C22717b bVar = (C22717b) obj;
            C52711k.m112240b(bVar, "t");
            C52711k.m112240b(bVar, "setting");
            TeenageModeSetting teenageModeSetting = C22721g.f60927a;
            if (teenageModeSetting != null) {
                if (bVar.f60919a == 1) {
                    z = true;
                } else {
                    z = false;
                }
                teenageModeSetting.setTeenageModeSelf(z);
            }
            TeenageModeSetting teenageModeSetting2 = C22721g.f60927a;
            if (teenageModeSetting2 != null) {
                teenageModeSetting2.setTimeLockSelfInMin(bVar.f60920b);
            }
            TeenageModeSetting teenageModeSetting3 = C22721g.f60927a;
            if (teenageModeSetting3 != null) {
                teenageModeSetting3.setMinorControlType(1);
            }
            C22721g.f60930d.mo47170g();
            TimeLockRuler.removeUserSettingWithoutNotify();
            C22721g.m55964a(C22721g.m55962a());
        }
    }

    /* renamed from: a */
    public final void mo47091a() {
        this.f60905b = null;
    }

    public C22704a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(TeenageModeApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…enageModeApi::class.java)");
        this.f60904a = (TeenageModeApi) create;
    }

    /* renamed from: a */
    public final void mo47092a(C22712a aVar) {
        C52711k.m112240b(aVar, "view");
        this.f60905b = aVar;
    }

    /* renamed from: a */
    public final void mo47093a(String str) {
        C52711k.m112240b(str, "password");
        this.f60904a.checkTeenagePassword(C22721g.m55963a(str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C22705a<Object>(this));
    }

    /* renamed from: b */
    public final void mo47094b(String str) {
        C52711k.m112240b(str, "minorSettings");
        this.f60904a.setMinorSettings(str).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C22706b<Object>(this, str));
    }
}
