package com.p683ss.android.ugc.aweme.poi.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39019h;
import com.p683ss.android.ugc.aweme.poi.model.C39095aa;
import com.p683ss.android.ugc.aweme.poi.model.C39111aq;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39405q;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.f */
public final class C39489f {

    /* renamed from: a */
    public static final C39489f f101021a = new C39489f();

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.f$a */
    static final class C39490a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39095aa f101022a;

        /* renamed from: b */
        final /* synthetic */ C39067g f101023b;

        /* renamed from: c */
        final /* synthetic */ Context f101024c;

        C39490a(C39095aa aaVar, C39067g gVar, Context context) {
            this.f101022a = aaVar;
            this.f101023b = gVar;
            this.f101024c = context;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            C39405q.f100788a = "poi_page";
            C39095aa aaVar = this.f101022a;
            C39067g gVar = this.f101023b;
            Context context = this.f101024c;
            List suppliers = aaVar.getSuppliers();
            if (suppliers != null) {
                boolean z2 = true;
                if (!(!suppliers.isEmpty())) {
                    suppliers = null;
                }
                if (suppliers != null) {
                    Integer serviceType = aaVar.getServiceType();
                    if (serviceType != null && serviceType.intValue() == 20) {
                        IAwemeService a = C23324d.m57378a();
                        if (gVar != null) {
                            str2 = gVar.getAwemeId();
                        } else {
                            str2 = null;
                        }
                        Aweme rawAdAwemeById = a.getRawAdAwemeById(str2);
                        String str4 = "reserve";
                        if (gVar != null) {
                            str3 = gVar.getPoiId();
                        } else {
                            str3 = null;
                        }
                        C39443d.m87702a(context, rawAdAwemeById, str4, str3);
                    }
                    if (suppliers.size() > 1) {
                        List suppliers2 = aaVar.getSuppliers();
                        if (suppliers2 != null) {
                            if (!(!suppliers2.isEmpty())) {
                                suppliers2 = null;
                            }
                            if (suppliers2 != null) {
                                Iterable<C39111aq> iterable = suppliers2;
                                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                                for (C39111aq supplierName : iterable) {
                                    String supplierName2 = supplierName.getSupplierName();
                                    if (supplierName2 == null) {
                                        supplierName2 = "";
                                    }
                                    arrayList.add(supplierName2);
                                }
                                Object[] array = ((List) arrayList).toArray(new String[0]);
                                if (array != null) {
                                    String[] strArr = (String[]) array;
                                    if (strArr != null) {
                                        if (strArr.length == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            z2 = false;
                                        }
                                    }
                                    if (!z2) {
                                        C26891a aVar = new C26891a(context);
                                        aVar.mo54844a((CharSequence[]) strArr, (DialogInterface.OnClickListener) new C39492c(suppliers2, context, aaVar));
                                        aVar.mo54845b();
                                    }
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        Iterable<C39111aq> iterable2 = suppliers;
                        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                        for (C39111aq supplier : iterable2) {
                            arrayList2.add(supplier.getSupplier());
                        }
                        str = ((List) arrayList2).toString();
                    } else {
                        C39489f.m87836a((C39111aq) suppliers.get(0), context, aaVar);
                        str = String.valueOf(((C39111aq) suppliers.get(0)).getSupplier());
                    }
                    C39053b.m86889a("click", aaVar.getServiceName(), "poi_page", "poi_page", gVar, str);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.f$b */
    static final class C39491b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C39111aq f101025a;

        /* renamed from: b */
        final /* synthetic */ Context f101026b;

        /* renamed from: c */
        final /* synthetic */ C39095aa f101027c;

        C39491b(C39111aq aqVar, Context context, C39095aa aaVar) {
            this.f101025a = aqVar;
            this.f101026b = context;
            this.f101027c = aaVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            C39489f.m87836a(this.f101025a, this.f101026b, this.f101027c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.f$c */
    static final class C39492c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ List f101028a;

        /* renamed from: b */
        final /* synthetic */ Context f101029b;

        /* renamed from: c */
        final /* synthetic */ C39095aa f101030c;

        C39492c(List list, Context context, C39095aa aaVar) {
            this.f101028a = list;
            this.f101029b = context;
            this.f101030c = aaVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39489f.m87836a((C39111aq) this.f101028a.get(i), this.f101029b, this.f101030c);
        }
    }

    private C39489f() {
    }

    /* renamed from: a */
    public static C39488e m87835a(Context context, C39095aa aaVar, C39067g gVar) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aaVar, "service");
        CharSequence serviceName = aaVar.getServiceName();
        boolean z2 = false;
        if (serviceName == null || serviceName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection suppliers = aaVar.getSuppliers();
            if (suppliers == null || suppliers.isEmpty()) {
                z2 = true;
            }
            if (!z2 && aaVar.getUrlModel() != null) {
                String serviceName2 = aaVar.getServiceName();
                if (serviceName2 == null) {
                    serviceName2 = "";
                }
                UrlModel urlModel = aaVar.getUrlModel();
                if (urlModel == null) {
                    urlModel = new UrlModel();
                }
                return new C39488e(serviceName2, urlModel, true, new C39490a(aaVar, gVar, context));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m87836a(C39111aq aqVar, Context context, C39095aa aaVar) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            Integer schemaType = aqVar.getSchemaType();
            if (schemaType != null && schemaType.intValue() == 1) {
                String url = aqVar.getUrl();
                if (url == null) {
                    url = "";
                }
                String serviceName = aaVar.getServiceName();
                if (serviceName == null) {
                    serviceName = "";
                }
                C39019h.m86857a(context, url, serviceName);
                return;
            }
            SmartRouter.buildRoute(context, aqVar.getUrl()).open();
        } else if (context != null) {
            C27965f.m66722a((Activity) context, "poi_page", "click_poi_puscene_reserve", (C23505g) new C39491b(aqVar, context, aaVar));
        } else {
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
