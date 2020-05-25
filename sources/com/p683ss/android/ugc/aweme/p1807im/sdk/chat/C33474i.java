package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11203l;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11241u;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseExtra;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel.C33854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.commercialize.C33987a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34604d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34622g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.notification.legacy.C34755a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1847k.C34395a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1847k.C34397b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35191ag;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35192ah;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35205as;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35426d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C1680ad;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.i */
public class C33474i implements C11203l {
    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
    }

    /* renamed from: c */
    public void mo20730c(List<C11207p> list) {
    }

    /* renamed from: d */
    public void mo20731d(List<C11207p> list) {
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
    }

    /* renamed from: a */
    public final void mo20726a(List<C11207p> list, int i) {
        StringBuilder sb = new StringBuilder("onGetMessage list=");
        sb.append(list);
        sb.append(" msgSource=");
        sb.append(i);
        C35459a.m80148a("GlobalMsgObserver", sb.toString());
        C33987a.m77688a(list);
        C34755a.f89518g.mo72824a(list, i);
    }

    /* renamed from: a */
    public final void mo20721a(int i, C11207p pVar) {
        BaseExtra baseExtra;
        boolean z;
        int i2;
        if (pVar != null) {
            Map localExt = pVar.getLocalExt();
            if (localExt != null && !localExt.isEmpty()) {
                int msgStatus = pVar.getMsgStatus();
                if (localExt.containsKey("s:send_response_check_msg")) {
                    try {
                        baseExtra = (BaseExtra) C35277o.m79760a((String) localExt.get("s:send_response_check_msg"), BaseExtra.class);
                    } catch (Exception unused) {
                        baseExtra = null;
                    }
                    if (msgStatus == 3) {
                        if (baseExtra == null || !(baseExtra.getStatusCode() == 7188 || baseExtra.getStatusCode() == 7187)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            C34395a a = C34395a.m78323a();
                            int statusCode = baseExtra.getStatusCode();
                            if (!a.f88765b.contains(pVar)) {
                                a.f88765b.add(pVar);
                            }
                            if (!C34397b.m78326a(C11010c.m22280a())) {
                                C9432q.m18672a(C11010c.m22280a(), (int) R.string.cg1);
                            } else if (!a.f88764a) {
                                Activity g = C11016e.m22312g();
                                if (g != null) {
                                    a.f88764a = true;
                                    C35460j f = C34004b.m77717a().mo71949f();
                                    if (f != null) {
                                        if (statusCode == 7188) {
                                            i2 = 3059;
                                        } else {
                                            i2 = 3058;
                                        }
                                        f.popCaptcha(g, i2, new C35426d() {
                                            /* renamed from: a */
                                            public final void mo72396a(int i) {
                                                C34395a.this.f88764a = false;
                                            }

                                            /* renamed from: a */
                                            public final void mo72397a(boolean z, String str) {
                                                if (z) {
                                                    for (C11207p c : C34395a.this.f88765b) {
                                                        C35197am.m79563c(c);
                                                    }
                                                }
                                                C34395a.this.f88765b.clear();
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (pVar.getMsgStatus() == 1) {
            C33353ab abVar = C35190af.f90474a;
            String str = "click";
            if (abVar != null && abVar.getEnterFrom() == 11) {
                str = "click_push";
            }
            C35190af.m79442a();
            C35190af.m79448a(pVar, str);
        } else if (pVar.getMsgStatus() == 2 || pVar.getMsgStatus() == 3) {
            C35190af.m79442a();
            C1680ad.m5961a(pVar).mo6148a(C2168a.m6521b()).mo6152a((C1710e<? super T>) new C35191ag<Object>(SystemClock.uptimeMillis()), C35192ah.f90478a);
        }
        C35116j.m79347a(pVar);
        C35205as a2 = C35205as.m79585a();
        if (pVar != null && !TextUtils.isEmpty(pVar.getLocalExtValue("process_id"))) {
            String localExtValue = pVar.getLocalExtValue("process_id");
            Iterator it = a2.f90495a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (entry.getValue() != null && TextUtils.equals(localExtValue, ((Bundle) entry.getValue()).getString("process_id"))) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
        C11205n nVar;
        Long l;
        Long l2;
        String str;
        String str2;
        Map<String, List<C11205n>> map3 = map2;
        C34604d dVar = C34604d.f89152b;
        if (map3 != null && pVar != null) {
            String obj = C35265e.m79730b().toString();
            if (TextUtils.equals(obj, String.valueOf(pVar.getSender()))) {
                List<C11205n> list = (List) map3.get("e:love");
                C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
                if (a != null) {
                    Map localExt = a.getLocalExt();
                    if (localExt == null) {
                        localExt = new LinkedHashMap();
                    }
                    if (list != null) {
                        nVar = null;
                        for (C11205n nVar2 : list) {
                            if (nVar2 != null && !C52711k.m112239a((Object) String.valueOf(nVar2.uid.longValue()), (Object) obj)) {
                                nVar = nVar2;
                            }
                        }
                    } else {
                        nVar = null;
                    }
                    C34622g c = C34604d.m78559c(a);
                    if (c != null) {
                        l = c.getCreate_at();
                    } else {
                        l = null;
                    }
                    if (nVar != null) {
                        l2 = nVar.create_time;
                    } else {
                        l2 = null;
                    }
                    if (C52711k.m112239a((Object) l, (Object) l2)) {
                        C32458a.m75141a(3, "DmHelper", "saveLastProperty return cause last is already saved");
                        return;
                    }
                    if (nVar == null || nVar == null) {
                        str = null;
                    } else {
                        C17971f fVar = C34604d.f89151a;
                        String str3 = nVar.key;
                        String str4 = nVar.idempotent_id;
                        Long l3 = nVar.create_time;
                        String str5 = nVar.value;
                        Long l4 = nVar.uid;
                        if (l4 != null) {
                            str2 = String.valueOf(l4.longValue());
                        } else {
                            str2 = null;
                        }
                        C34622g gVar = r7;
                        C34622g gVar2 = new C34622g(str3, str4, l3, str5, str2, nVar.sec_uid, nVar.msgUuid, 0);
                        str = fVar.mo34889b(gVar);
                    }
                    if (str == null) {
                        StringBuilder sb = new StringBuilder("saveLastProperty called ,remove ");
                        sb.append(pVar.getUuid());
                        C32458a.m75141a(3, "DmHelper", sb.toString());
                        localExt.remove("a:s_latest_message_property");
                    } else {
                        StringBuilder sb2 = new StringBuilder("saveLastProperty called ,add ");
                        sb2.append(pVar.getUuid());
                        C32458a.m75141a(3, "DmHelper", sb2.toString());
                        localExt.put("a:s_latest_message_property", str);
                    }
                    a.setLocalExt(localExt);
                    String conversationId = a.getConversationId();
                    C11190e.m22688a(conversationId, localExt, (Runnable) null);
                    DmViewModel a2 = C33854a.m77621a(C11016e.m22312g());
                    if (a2 != null) {
                        C0198r b = a2.mo71885b();
                        if (b != null) {
                            b.setValue(conversationId);
                        }
                    }
                }
            }
        }
    }
}
