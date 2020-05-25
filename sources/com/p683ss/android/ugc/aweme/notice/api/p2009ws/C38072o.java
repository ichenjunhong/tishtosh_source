package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import android.text.TextUtils;
import com.bytedance.common.wschannel.C9439a.C9440a;
import com.bytedance.common.wschannel.C9454c;
import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg.C9528a;
import com.bytedance.common.wschannel.p529c.C9458b;
import com.bytedance.common.wschannel.p529c.C9459c;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47925go;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50813a;
import com.p683ss.android.websocket.p2539b.p2540a.C50814b;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import com.p683ss.android.websocket.p2539b.p2541b.C50821a;
import com.p683ss.android.websocket.p2539b.p2541b.C50822b;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.p683ss.android.websocket.p2539b.p2541b.C50824d;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.o */
public final class C38072o {

    /* renamed from: f */
    public static final boolean f96859f = C10181b.m20511a().mo18172a(WSopenAB.class, true, "async_ws_open", 31744, true);

    /* renamed from: g */
    public static final boolean f96860g = C10181b.m20511a().mo18172a(WsPostEventAsyncAB.class, true, "async_ws_post_event", 31744, false);

    /* renamed from: h */
    public static C38072o f96861h;

    /* renamed from: i */
    public static final C38073a f96862i = new C38073a(null);

    /* renamed from: a */
    public final boolean f96863a;

    /* renamed from: b */
    public final C38062f f96864b;

    /* renamed from: c */
    public String f96865c;

    /* renamed from: d */
    public final C9446a f96866d;

    /* renamed from: e */
    public final List<C9446a> f96867e;

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.o$a */
    public static final class C38073a {
        private C38073a() {
        }

        /* renamed from: a */
        public final synchronized C38072o mo77629a() {
            C38072o oVar;
            if (C38072o.f96861h == null) {
                C38072o.f96861h = new C38072o(null);
            }
            oVar = C38072o.f96861h;
            if (oVar == null) {
                C52711k.m112234a();
            }
            return oVar;
        }

        public /* synthetic */ C38073a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.o$b */
    public static final class C38074b implements C9446a {

        /* renamed from: a */
        final /* synthetic */ C38072o f96868a;

        C38074b(C38072o oVar) {
            this.f96868a = oVar;
        }

        /* renamed from: a */
        public final void mo17112a(WsChannelMsg wsChannelMsg) {
            if (wsChannelMsg != null) {
                C50823c cVar = new C50823c(this.f96868a.f96865c, wsChannelMsg.mo17289a(), this.f96868a.f96864b.mo72405a(new C38078q(wsChannelMsg)));
                cVar.f127699d = wsChannelMsg.f25952e;
                cVar.mo99523a(Integer.valueOf(wsChannelMsg.f25951d));
                C38072o.m85149a(cVar);
            }
            for (C9446a a : this.f96868a.f96867e) {
                a.mo17112a(wsChannelMsg);
            }
        }

        /* renamed from: a */
        public final void mo17111a(C9458b bVar, JSONObject jSONObject) {
            if (bVar != null && jSONObject != null) {
                SocketState a = SocketState.m18895a(jSONObject);
                String jSONObject2 = jSONObject.toString();
                C52711k.m112236a((Object) jSONObject2, "connectJson.toString()");
                C50820a aVar = null;
                C9459c cVar = bVar.f25742b;
                if (cVar != null) {
                    switch (C38077p.f96871a[cVar.ordinal()]) {
                        case 1:
                            C38072o oVar = this.f96868a;
                            String str = a.f25921c;
                            C52711k.m112236a((Object) str, "socketState.connectionUrl");
                            oVar.f96865c = str;
                            aVar = C50820a.CONNECTED;
                            C38072o.m85149a(new C50822b(a.f25921c, jSONObject2, a.f25923e));
                            break;
                        case 2:
                            aVar = C50820a.CLOSED;
                            C38072o.m85149a(new C50821a(-1, a.f25921c, jSONObject2));
                            break;
                        case 3:
                            C38072o.m85149a(new C50824d(a.f25921c, a.f25924f, a.f25923e));
                            break;
                        case 4:
                            aVar = C50820a.OPENING;
                            break;
                    }
                }
                if (aVar != null) {
                    C38072o.m85149a(new C50827g(a.f25921c, aVar));
                }
                for (C9446a a2 : this.f96868a.f96867e) {
                    a2.mo17111a(bVar, jSONObject);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.o$c */
    static final class C38075c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C38072o f96869a;

        C38075c(C38072o oVar) {
            this.f96869a = oVar;
        }

        public final /* synthetic */ Object call() {
            this.f96869a.mo77625a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.ws.o$d */
    static final class C38076d<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object f96870a;

        C38076d(Object obj) {
            this.f96870a = obj;
        }

        public final /* synthetic */ Object call() {
            C47718bf.m103288a(this.f96870a);
            return C52860x.f131107a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r1.intValue() == 1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C38072o() {
        /*
            r3 = this;
            r3.<init>()
            r0 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x001c }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x001c }
            java.lang.Integer r1 = r1.getWsUseNewSdk()     // Catch:{ Exception -> 0x001c }
            if (r1 != 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x001c }
            if (r1 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r3.f96863a = r0
            com.ss.android.ugc.aweme.notice.api.ws.f r0 = new com.ss.android.ugc.aweme.notice.api.ws.f
            r0.<init>()
            r3.f96864b = r0
            java.lang.String r0 = ""
            r3.f96865c = r0
            com.ss.android.ugc.aweme.notice.api.ws.o$b r0 = new com.ss.android.ugc.aweme.notice.api.ws.o$b
            r0.<init>(r3)
            com.bytedance.common.wschannel.app.a r0 = (com.bytedance.common.wschannel.app.C9446a) r0
            r3.f96866d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            r3.f96867e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38072o.<init>():void");
    }

    /* renamed from: a */
    public final void mo77625a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(new ArrayList());
        if (arrayList.isEmpty()) {
            arrayList.add(C38064h.f96840a);
        }
        Map hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        hashMap.put("ne", String.valueOf(C38064h.m85132a(NetworkUtils.getNetworkType(C11010c.m22280a()))));
        hashMap.put("is_background", String.valueOf(C38064h.m85137g()));
        C35834e currentI18nItem = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(C11010c.m22280a());
        C52711k.m112236a((Object) currentI18nItem, "ServiceManager.get().get….getApplicationContext())");
        String b = currentI18nItem.mo70122b();
        C52711k.m112236a((Object) b, "ServiceManager.get().get…cationContext()).language");
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("language", b);
        }
        C9454c.m18760a(C9440a.m18711a(1239108).mo17082a("e1bd35ec9db7b8d846de66ed140b1ad9").mo17086b(9).mo17088c(AppLog.getAppId()).mo17090d(C47925go.m103695a().getAppVersionCode()).mo17087b(AppLog.getServerDeviceId()).mo17089c(AppLog.getInstallId()).mo17083a((List<String>) arrayList).mo17084a(hashMap).mo17085a(), AppLog.getSessionKey());
    }

    public /* synthetic */ C38072o(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public static void m85149a(Object obj) {
        Executor executor;
        if (f96860g) {
            executor = C24076h.m58903d();
        } else {
            executor = C0013i.f25b;
        }
        C0013i.m18a((Callable<TResult>) new C38076d<TResult>(obj), executor);
    }

    @C53771m
    public final void onCloseWs(C50813a aVar) {
        C52711k.m112240b(aVar, "event");
        m85149a(new C50827g(this.f96865c, C50820a.CLOSING));
        C9454c.m18756a(1239108);
    }

    @C53771m
    public final void onOpenWs(C50814b bVar) {
        C52711k.m112240b(bVar, "event");
        if (f96859f) {
            C0013i.m18a((Callable<TResult>) new C38075c<TResult>(this), (Executor) C24076h.m58902c());
        } else {
            mo77625a();
        }
    }

    @C53771m
    public final void onSendWs(C50816d dVar) {
        C52711k.m112240b(dVar, "event");
        if (dVar.f127677b != null) {
            C9528a a = C9528a.m18907a(1239108);
            C50817e eVar = dVar.f127677b;
            C52711k.m112236a((Object) eVar, "event.wsMsgHolder");
            C9528a a2 = a.mo17300a(eVar.f127681d);
            C50817e eVar2 = dVar.f127677b;
            C52711k.m112236a((Object) eVar2, "event.wsMsgHolder");
            C9528a b = a2.mo17306b(eVar2.f127680c);
            C50817e eVar3 = dVar.f127677b;
            C52711k.m112236a((Object) eVar3, "event.wsMsgHolder");
            C9528a c = b.mo17308c(eVar3.f127683f);
            C50817e eVar4 = dVar.f127677b;
            C52711k.m112236a((Object) eVar4, "event.wsMsgHolder");
            C9528a b2 = c.mo17305b(eVar4.f127682e);
            C50817e eVar5 = dVar.f127677b;
            C52711k.m112236a((Object) eVar5, "event.wsMsgHolder");
            C9528a a3 = b2.mo17303a(eVar5.f127679b);
            C50817e eVar6 = dVar.f127677b;
            C52711k.m112236a((Object) eVar6, "event.wsMsgHolder");
            C9528a a4 = a3.mo17301a(eVar6.f127684g);
            C50817e eVar7 = dVar.f127677b;
            C52711k.m112236a((Object) eVar7, "event.wsMsgHolder");
            C9528a b3 = a4.mo17307b(eVar7.f127685h);
            C50817e eVar8 = dVar.f127677b;
            C52711k.m112236a((Object) eVar8, "event.wsMsgHolder");
            Map a5 = eVar8.mo99521a();
            if (a5 != null) {
                for (Entry entry : a5.entrySet()) {
                    b3.mo17302a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C9454c.m18761a(b3.mo17304a());
        }
    }
}
