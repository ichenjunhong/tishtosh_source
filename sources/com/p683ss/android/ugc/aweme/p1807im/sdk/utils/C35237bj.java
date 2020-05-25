package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p702im.core.internal.p720c.C11446e;
import com.bytedance.p702im.core.internal.p720c.C11447f;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11198g;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11207p.C11209a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bj */
public final class C35237bj extends C11198g {

    /* renamed from: c */
    private static C35208au<C35237bj> f90548c = new C35208au<C35237bj>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C35237bj();
        }
    };

    /* renamed from: a */
    public Map<String, List<Pair<List<BaseContent>, Pair<Boolean, C35241a>>>> f90549a;

    /* renamed from: b */
    public Map<String, List<Pair<Boolean, C11207p>>> f90550b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bj$a */
    public interface C35241a {
        void onSend(C11180b bVar, List<C11207p> list);

        void onSendFailure(C11202k kVar);

        void onSendSuccess(C11207p pVar);
    }

    /* renamed from: a */
    public final void mo20662a(C11180b bVar) {
    }

    /* renamed from: a */
    public final void mo20664a(String str, List<C11206o> list) {
    }

    /* renamed from: a */
    public final void mo20665a(List<C11206o> list) {
    }

    /* renamed from: a */
    public final void mo20718a(Map<String, C11180b> map) {
    }

    /* renamed from: b */
    public final void mo20668b(C11180b bVar) {
    }

    /* renamed from: b */
    public final void mo20670b(List<C11206o> list) {
    }

    /* renamed from: d */
    public final void mo20676d(C11180b bVar) {
    }

    /* renamed from: e */
    public final void mo20679e(C11180b bVar) {
    }

    /* renamed from: a */
    public final void mo73340a(String str, BaseContent baseContent) {
        mo73341a(str, baseContent, (C35241a) null);
    }

    /* renamed from: a */
    public final void mo73341a(String str, BaseContent baseContent, C35241a aVar) {
        m79653a(str, Collections.singletonList(baseContent), aVar);
    }

    /* renamed from: a */
    private void m79658a(List<String> list, List<BaseContent> list2, C35241a aVar) {
        m79659a(list, list2, aVar, true, null);
    }

    /* renamed from: a */
    public final void mo73342a(List<String> list, List<BaseContent> list2) {
        m79658a(list, list2, (C35241a) null);
    }

    /* renamed from: a */
    public final void mo73343a(List<String> list, List<BaseContent> list2, C35241a aVar, List<C11178a> list3) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a : list) {
                m79655a(a, list2, aVar, false, list3);
            }
        }
    }

    /* renamed from: a */
    private void m79659a(List<String> list, List<BaseContent> list2, C35241a aVar, boolean z, List<C11178a> list3) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        m79655a(C11190e.m22687a(Long.valueOf(str).longValue()), list2, aVar, true, null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo73344a(List<String> list, List<BaseContent> list2, C35241a aVar, boolean z) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a : list) {
                m79655a(a, list2, aVar, z, null);
            }
        }
    }

    /* renamed from: a */
    public static C35237bj m79649a() {
        return (C35237bj) f90548c.mo73326b();
    }

    private C35237bj() {
        this.f90549a = new HashMap();
        this.f90550b = new HashMap();
        C11182d.m22641a().mo20663a((C11198g) this);
    }

    /* renamed from: c */
    private static void m79662c(List<Pair<Boolean, C11207p>> list) {
        if (list != null && !list.isEmpty()) {
            for (Pair pair : list) {
                if (((Boolean) pair.first).booleanValue()) {
                    C35197am.m79563c((C11207p) pair.second);
                } else {
                    C35197am.m79561b((C11207p) pair.second);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20673c(C11180b bVar) {
        String conversationId = bVar.getConversationId();
        if (this.f90549a.containsKey(conversationId)) {
            boolean isTemp = bVar.isTemp();
            for (Pair pair : (List) this.f90549a.get(conversationId)) {
                m79652a((C35241a) ((Pair) pair.second).second, bVar, m79650a(bVar, (List) pair.first, ((Boolean) ((Pair) pair.second).first).booleanValue(), isTemp, (C35241a) ((Pair) pair.second).second, null));
            }
            this.f90549a.remove(conversationId);
            return;
        }
        if (this.f90550b.containsKey(conversationId)) {
            m79662c((List) this.f90550b.get(conversationId));
            this.f90550b.remove(conversationId);
        }
    }

    /* renamed from: c */
    public final void mo73349c(String str, List<BaseContent> list) {
        m79660b(str, list, (C35241a) null);
    }

    /* renamed from: a */
    private void m79651a(C11207p pVar, final C35241a aVar) {
        if (aVar != null) {
            C35197am.m79557a(pVar, (C11162b<C11207p>) new C11162b<C11207p>() {
                /* renamed from: a */
                public final void mo20508a(C11202k kVar) {
                    aVar.onSendFailure(kVar);
                }

                /* renamed from: a */
                public final /* synthetic */ void mo20506a(Object obj) {
                    aVar.onSendSuccess((C11207p) obj);
                }
            });
        } else {
            C35197am.m79563c(pVar);
        }
    }

    /* renamed from: b */
    public final void mo73345b(String str, BaseContent baseContent) {
        mo73346b(str, baseContent, (C35241a) null);
    }

    /* renamed from: b */
    public final void mo73347b(String str, List<BaseContent> list) {
        m79653a(str, list, (C35241a) null);
    }

    /* renamed from: b */
    public final void mo73348b(List<String> list, List<BaseContent> list2) {
        mo73344a(list, list2, (C35241a) null, true);
    }

    /* renamed from: a */
    private static void m79657a(List<C11178a> list, String str) {
        if (list != null && !list.isEmpty()) {
            for (C11178a aVar : list) {
                if (aVar == null) {
                    aVar = new C11178a();
                }
                aVar.setMsgUuid(str);
            }
        }
    }

    /* renamed from: a */
    private static void m79652a(C35241a aVar, C11180b bVar, List<C11207p> list) {
        if (aVar != null) {
            try {
                aVar.onSend(bVar, list);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m79661b(List<String> list, List<BaseContent> list2, C35241a aVar) {
        mo73344a(list, list2, aVar, true);
    }

    /* renamed from: b */
    private void m79660b(String str, List<BaseContent> list, C35241a aVar) {
        m79661b(Collections.singletonList(str), list, (C35241a) null);
    }

    /* renamed from: a */
    private void m79653a(String str, List<BaseContent> list, C35241a aVar) {
        m79658a(Collections.singletonList(str), list, aVar);
    }

    /* renamed from: b */
    public final void mo73346b(String str, BaseContent baseContent, C35241a aVar) {
        m79656a(Collections.singletonList(str), baseContent, aVar);
    }

    /* renamed from: a */
    private void m79656a(List<String> list, BaseContent baseContent, C35241a aVar) {
        m79661b(list, Collections.singletonList(baseContent), aVar);
    }

    /* renamed from: a */
    private void m79654a(String str, List<BaseContent> list, C35241a aVar, boolean z) {
        Pair pair = new Pair(list, new Pair(Boolean.valueOf(z), aVar));
        if (!this.f90549a.containsKey(str) || ((List) this.f90549a.get(str)).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            this.f90549a.put(str, arrayList);
            return;
        }
        ((List) this.f90549a.get(str)).add(pair);
    }

    /* renamed from: a */
    private void m79655a(final String str, List<BaseContent> list, C35241a aVar, boolean z, List<C11178a> list2) {
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a != null) {
            m79652a(aVar, a, m79650a(a, list, z, false, aVar, list2));
            return;
        }
        String[] split = str.split(":");
        if (split.length > 1 && TextUtils.equals(split[1], String.valueOf(C11170a.f30115a))) {
            m79654a(str, list, aVar, z);
            C11182d.m22641a().mo20657a(C11190e.m22685a(str), (C11446e) new C11446e() {
                /* renamed from: a */
                public final void mo21081a(C11447f fVar) {
                    C11182d.m22641a();
                    C11182d.m22646c(str);
                }

                /* renamed from: b */
                public final void mo21082b(C11447f fVar) {
                    C35237bj bjVar = C35237bj.this;
                    String str = str;
                    bjVar.f90549a.remove(str);
                    if (bjVar.f90550b.containsKey(str)) {
                        for (Pair pair : (List) bjVar.f90550b.get(str)) {
                            ((C11207p) pair.second).setMsgStatus(3);
                            C35197am.m79561b((C11207p) pair.second);
                        }
                    }
                    bjVar.f90550b.remove(str);
                }
            });
        }
    }

    /* renamed from: a */
    private List<C11207p> m79650a(C11180b bVar, List<BaseContent> list, boolean z, boolean z2, C35241a aVar, List<C11178a> list2) {
        long j;
        List<C11178a> list3 = list2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C11207p lastMessage = bVar.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getOrderIndex() + 1;
        } else {
            j = 1;
        }
        for (BaseContent baseContent : list) {
            C11207p a = new C11209a().mo20825a(bVar).mo20824a(C35197am.m79553a(baseContent)).mo20826a(C35277o.m79761a(baseContent)).mo20827a();
            a.setOrderIndex(j);
            m79657a(list3, a.getUuid());
            a.setAttachments(list3);
            StringBuilder sb = new StringBuilder();
            sb.append(baseContent.getSendStartTime());
            a.addLocalExt("send_time", sb.toString());
            C35205as a2 = C35205as.m79585a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(baseContent.hashCode());
            String a3 = a2.mo73324a(sb2.toString(), "process_id", false);
            if (!TextUtils.isEmpty(a3)) {
                a.addLocalExt("process_id", a3);
            }
            j++;
            if (z2) {
                a.setMsgStatus(0);
                arrayList2.add(new Pair(Boolean.valueOf(z), a));
            } else if (z) {
                m79651a(a, aVar);
                arrayList.add(a);
            }
            C35241a aVar2 = aVar;
            C35197am.m79561b(a);
            arrayList.add(a);
        }
        C11180b bVar2 = bVar;
        if (z2 && !arrayList2.isEmpty()) {
            this.f90550b.put(bVar.getConversationId(), arrayList2);
        }
        return arrayList;
    }
}
