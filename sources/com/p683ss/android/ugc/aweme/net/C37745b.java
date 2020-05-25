package com.p683ss.android.ugc.aweme.net;

import android.content.Context;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.api.Api.C22959b;
import com.p683ss.android.ugc.aweme.app.api.Api.C22961d;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.b */
public class C37745b<T> {

    /* renamed from: h */
    public static final String f96175h = "b";

    /* renamed from: i */
    static final CommonApi f96176i = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    /* renamed from: a */
    public C37757d<T> f96177a;

    /* renamed from: b */
    public String f96178b;

    /* renamed from: c */
    C37790j f96179c;

    /* renamed from: d */
    List<C19180e> f96180d;

    /* renamed from: e */
    Class<T> f96181e;

    /* renamed from: f */
    String f96182f;

    /* renamed from: g */
    public boolean f96183g;

    /* renamed from: a */
    public final void mo77238a() {
        m84258a(C11010c.m22280a());
    }

    /* renamed from: a */
    public final void mo77239a(C37757d dVar) {
        this.f96177a = dVar;
    }

    /* renamed from: a */
    private void m84258a(final Context context) {
        C18842a.m45932a(new Runnable() {
            public final void run() {
                Object obj;
                try {
                    C37790j jVar = C37745b.this.f96179c;
                    String str = C37745b.this.f96178b;
                    List<C19180e> list = C37745b.this.f96180d;
                    String str2 = C37745b.this.f96182f;
                    Class<T> cls = C37745b.this.f96181e;
                    HashMap hashMap = new HashMap();
                    if (!C9376b.m18558a((Collection<T>) list)) {
                        for (C19180e eVar : list) {
                            hashMap.put(eVar.mo39131a(), eVar.mo39132b());
                        }
                    }
                    if (jVar == C37790j.POST) {
                        NetUtil.putCommonParams(hashMap, true);
                        String str3 = (String) C37745b.f96176i.doPost(str, hashMap).execute().f33552b;
                        if (String.class.equals(cls)) {
                            obj = Api.m56467a(str3, C22961d.m56475a(), str2, str);
                        } else {
                            obj = Api.m56467a(str3, new C22959b(cls), str2, str);
                        }
                    } else if (jVar == C37790j.GET) {
                        String str4 = (String) C37745b.f96176i.doGet(str, (Map<String, String>) hashMap).execute().f33552b;
                        if (String.class.equals(cls)) {
                            obj = Api.m56467a(str4, C22961d.m56475a(), str2, str);
                        } else {
                            obj = Api.m56467a(str4, new C22959b(cls), str2, str);
                        }
                    } else {
                        throw new IllegalStateException("Unsupport http type !");
                    }
                    if (C37745b.this.f96177a != null) {
                        C18842a.m45934b(new C37749c(this, obj));
                    }
                } catch (Exception e) {
                    if (C37745b.this.f96177a != null) {
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (C37745b.this.f96183g) {
                                    C22971a.m56493a(context, (Throwable) e);
                                }
                                C37745b.this.f96177a.mo46329a(e);
                            }
                        });
                    } else {
                        C22971a.m56493a(context, (Throwable) e);
                    }
                }
            }
        });
    }

    public C37745b(String str, C37790j jVar, Class<T> cls) {
        this(str, jVar, "", cls);
    }

    private C37745b(String str, C37790j jVar, String str2, Class<T> cls) {
        this(str, jVar, null, str2, cls);
    }

    public C37745b(String str, C37790j jVar, List<C19180e> list, Class<T> cls) {
        this(str, jVar, list, null, cls);
    }

    private C37745b(String str, C37790j jVar, List<C19180e> list, String str2, Class<T> cls) {
        this.f96183g = true;
        this.f96178b = str;
        this.f96179c = jVar;
        this.f96180d = list;
        this.f96181e = cls;
        this.f96182f = str2;
    }
}
