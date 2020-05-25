package com.facebook.p909a;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.C14696t;
import com.facebook.C14699w;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.internal.C14349t;
import com.facebook.p909a.C13581g.C13582a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e */
public class C13573e {

    /* renamed from: a */
    static final String f35421a = "com.facebook.a.e";

    /* renamed from: b */
    public static volatile C13572d f35422b = new C13572d();

    /* renamed from: c */
    public static final ScheduledExecutorService f35423c = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: d */
    public static ScheduledFuture f35424d;

    /* renamed from: e */
    public static final Runnable f35425e = new Runnable() {
        public final void run() {
            C13573e.f35424d = null;
            if (C13583h.m27417a() != C13582a.EXPLICIT_ONLY) {
                C13573e.m27409b(C13586i.TIMER);
            }
        }
    };

    C13573e() {
    }

    /* renamed from: a */
    public static void m27408a(final C13586i iVar) {
        f35423c.execute(new Runnable() {
            public final void run() {
                C13573e.m27409b(iVar);
            }
        });
    }

    /* renamed from: b */
    static void m27409b(C13586i iVar) {
        f35422b.mo25398a(C13579f.m27411a());
        try {
            C13572d dVar = f35422b;
            final C13588k kVar = new C13588k();
            boolean b = C14533n.m29768b(C14533n.m29773g());
            ArrayList<GraphRequest> arrayList = new ArrayList<>();
            Iterator it = dVar.mo25397a().iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                final C13509a aVar = (C13509a) it.next();
                final C13593n a = dVar.mo25396a(aVar);
                String a2 = aVar.mo25337a();
                C14336o a3 = C14338p.m29399a(a2, false);
                final GraphRequest a4 = GraphRequest.m27266a((AccessToken) null, C2240a.m6772a("%s/activities", new Object[]{a2}), (JSONObject) null, (C13501b) null);
                Bundle bundle = a4.f35228j;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("access_token", aVar.f35258a);
                String c = C13583h.m27421c();
                if (c != null) {
                    bundle.putString("device_token", c);
                }
                String string = C35807d.m80935a(C14533n.m29773g(), "com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
                if (string != null) {
                    bundle.putString("install_referrer", string);
                }
                a4.f35228j = bundle;
                if (a3 != null) {
                    z = a3.f37289a;
                }
                int a5 = a.mo25414a(a4, C14533n.m29773g(), z, b);
                if (a5 == 0) {
                    a4 = null;
                } else {
                    kVar.f35449a += a5;
                    a4.mo25313a((C13501b) new C13501b() {
                        /* renamed from: a */
                        public final void mo25316a(C14696t tVar) {
                            String str;
                            C13509a aVar = aVar;
                            GraphRequest graphRequest = a4;
                            C13593n nVar = a;
                            C13588k kVar = kVar;
                            FacebookRequestError facebookRequestError = tVar.f38086d;
                            String str2 = "Success";
                            C13587j jVar = C13587j.SUCCESS;
                            boolean z = true;
                            if (facebookRequestError != null) {
                                if (facebookRequestError.f35201d == -1) {
                                    str2 = "Failed: No Connectivity";
                                    jVar = C13587j.NO_CONNECTIVITY;
                                } else {
                                    str2 = C2240a.m6772a("Failed:\n  Response: %s\n  Error %s", new Object[]{tVar.toString(), facebookRequestError.toString()});
                                    jVar = C13587j.SERVER_ERROR;
                                }
                            }
                            if (C14533n.m29765a(C14699w.APP_EVENTS)) {
                                try {
                                    str = new JSONArray((String) graphRequest.f35230l).toString(2);
                                } catch (JSONException unused) {
                                    str = "<Can't encode events for debug logging>";
                                }
                                C14349t.m29409a(C14699w.APP_EVENTS, C13573e.f35421a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f35224f.toString(), str2, str);
                            }
                            if (facebookRequestError == null) {
                                z = false;
                            }
                            nVar.mo25417a(z);
                            if (jVar == C13587j.NO_CONNECTIVITY) {
                                C14533n.m29771e().execute(new Runnable(aVar, nVar) {

                                    /* renamed from: a */
                                    final /* synthetic */ C13509a f35431a;

                                    /* renamed from: b */
                                    final /* synthetic */ C13593n f35432b;

                                    public final void run() {
                                        C13579f.m27412a(this.f35431a, this.f35432b);
                                    }

                                    {
                                        this.f35431a = r1;
                                        this.f35432b = r2;
                                    }
                                });
                            }
                            if (jVar != C13587j.SUCCESS && kVar.f35450b != C13587j.NO_CONNECTIVITY) {
                                kVar.f35450b = jVar;
                            }
                        }
                    });
                }
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            if (arrayList.size() > 0) {
                C14349t.m29409a(C14699w.APP_EVENTS, f35421a, "Flushing %d events due to %s.", Integer.valueOf(kVar.f35449a), iVar.toString());
                for (GraphRequest a6 : arrayList) {
                    a6.mo25312a();
                }
            } else {
                kVar = null;
            }
            if (kVar != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", kVar.f35449a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", kVar.f35450b);
                C0732g.m2130a(C14533n.m29773g()).mo2404a(intent);
            }
        } catch (Exception unused) {
        }
    }
}
