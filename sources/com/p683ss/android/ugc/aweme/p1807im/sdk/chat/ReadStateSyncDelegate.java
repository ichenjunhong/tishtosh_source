package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.os.Message;
import android.util.Pair;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate */
public final class ReadStateSyncDelegate extends AbsReadStateDelegate {

    /* renamed from: b */
    public static final C33336a f86449b = new C33336a(null);

    /* renamed from: d */
    private static final Integer[] f86450d = {Integer.valueOf(1), Integer.valueOf(1001), Integer.valueOf(BaseNotice.CHECK_PROFILE), Integer.valueOf(1005)};

    /* renamed from: c */
    private boolean f86451c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate$a */
    public static final class C33336a {
        private C33336a() {
        }

        public /* synthetic */ C33336a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate$b */
    public final class C33337b implements C11162b<Pair<List<? extends Long>, List<? extends Long>>> {

        /* renamed from: a */
        public final C11207p f86452a;

        /* renamed from: b */
        final /* synthetic */ ReadStateSyncDelegate f86453b;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            Object obj;
            StringBuilder sb = new StringBuilder("onFailure: error={");
            String str = null;
            if (kVar != null) {
                obj = Integer.valueOf(kVar.f30203a);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (kVar != null) {
                str = kVar.f30205c;
            }
            sb.append(str);
            sb.append('}');
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Object obj2;
            boolean z5;
            Pair pair = (Pair) obj;
            this.f86453b.mo70681c();
            if (pair != null) {
                Collection collection = (Collection) pair.second;
                int i = 0;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C33449f fVar = this.f86453b.f86381a;
                    C11207p pVar = this.f86452a;
                    C33355ad adVar = (C33355ad) fVar.mo70863c().getValue();
                    if (adVar == null || !C52711k.m112239a((Object) pVar, (Object) adVar.f86500c)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        Collection collection2 = (Collection) pair.first;
                        if (collection2 == null || collection2.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            C33449f fVar2 = this.f86453b.f86381a;
                            if (!ReadStateSyncDelegate.m76468a(this.f86452a)) {
                                i = -1;
                            }
                            fVar2.mo70860a(i, null);
                            return;
                        }
                        List list = (List) pair.first;
                        if (list != null) {
                            int size = list.size();
                            Object obj3 = pair.second;
                            if (obj3 == null) {
                                C52711k.m112234a();
                            }
                            if (size == ((List) obj3).size()) {
                                this.f86453b.f86381a.mo70860a(2, null);
                                return;
                            }
                        }
                        if (this.f86453b.f86381a.mo70865e().isGroupChat()) {
                            List b = C34238a.m78110a().mo72231b(this.f86453b.f86381a.mo70865e().getConversationId());
                            Collection collection3 = b;
                            if (collection3 == null || collection3.isEmpty()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                List arrayList = new ArrayList();
                                Object obj4 = pair.first;
                                if (obj4 == null) {
                                    C52711k.m112234a();
                                }
                                for (Number longValue : (Iterable) obj4) {
                                    long longValue2 = longValue.longValue();
                                    Iterator it = b.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it.next();
                                        C11206o member = ((C33367a) obj2).getMember();
                                        if (member == null || member.getUid() != longValue2) {
                                            z5 = false;
                                            continue;
                                        } else {
                                            z5 = true;
                                            continue;
                                        }
                                        if (z5) {
                                            break;
                                        }
                                    }
                                    C33367a aVar = (C33367a) obj2;
                                    if (aVar != null) {
                                        String memberDisplayName = aVar.getMemberDisplayName();
                                        if (memberDisplayName != null) {
                                            arrayList.add(memberDisplayName);
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    this.f86453b.f86381a.mo70860a(1, arrayList);
                                }
                            }
                        }
                    }
                }
            }
        }

        public C33337b(ReadStateSyncDelegate readStateSyncDelegate, C11207p pVar) {
            C52711k.m112240b(pVar, "message");
            this.f86453b = readStateSyncDelegate;
            this.f86452a = pVar;
        }
    }

    public final void onStop() {
        this.f86451c = false;
    }

    public final void onResume() {
        this.f86451c = true;
        m76467a(true);
    }

    /* renamed from: d */
    private final void m76470d() {
        C33355ad adVar = (C33355ad) this.f86381a.mo70863c().getValue();
        if (adVar != null && adVar.mo70726b()) {
            sendEmptyMessageDelayed(1, 200);
        }
    }

    /* renamed from: c */
    public final void mo70681c() {
        C33355ad adVar = (C33355ad) this.f86381a.mo70863c().getValue();
        if (adVar != null && adVar.mo70726b()) {
            sendEmptyMessageDelayed(0, 2000);
        }
    }

    /* renamed from: b */
    public final void mo70639b() {
        if (this.f86381a.mo70865e().isGroupChat()) {
            m76470d();
            return;
        }
        this.f86381a.mo70861a(null);
        C33985z a = this.f86381a.mo70859a();
        if (a != null) {
            a.mo71916a();
        }
    }

    /* renamed from: a */
    public final void mo70638a() {
        Object obj;
        boolean z;
        boolean z2;
        if (!this.f86381a.mo70862b().isEmpty()) {
            if (!this.f86381a.mo70865e().isGroupChat()) {
                C33985z a = this.f86381a.mo70859a();
                if (a != null) {
                    boolean z3 = !((C11207p) this.f86381a.mo70862b().get(0)).isSelf();
                    if (!a.f87895c && z3) {
                        a.mo71917a("replied");
                    }
                    a.f87895c = true;
                }
            }
            Iterable b = this.f86381a.mo70862b();
            Collection arrayList = new ArrayList();
            for (Object next : b) {
                C11207p pVar = (C11207p) next;
                if (pVar == null || C52568f.m112077a((Object[]) f86450d, (Object) Integer.valueOf(pVar.getMsgType()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C11207p pVar2 = (C11207p) obj;
                if (!pVar2.isSelf() || pVar2.isDeleted()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C11207p pVar3 = (C11207p) obj;
            if (pVar3 != null) {
                C33449f fVar = this.f86381a;
                if (fVar.mo70865e().isGroupChat() || list.indexOf(pVar3) == 0) {
                    if (m76468a(pVar3) && this.f86381a.mo70861a(pVar3)) {
                        m76470d();
                        mo70681c();
                    }
                    return;
                }
                if (fVar.mo70863c().getValue() != null) {
                    fVar.mo70861a(null);
                    C33985z a2 = this.f86381a.mo70859a();
                    if (a2 != null) {
                        a2.mo71916a();
                    }
                }
            }
        }
    }

    public ReadStateSyncDelegate(C33449f fVar) {
        C52711k.m112240b(fVar, "dataCenter");
        super(fVar);
    }

    /* renamed from: a */
    public static boolean m76468a(C11207p pVar) {
        if ((pVar.getMsgId() <= 0 || pVar.getMsgStatus() != 2) && pVar.getMsgStatus() != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m76469b(C11207p pVar) {
        return C52711k.m112239a((Object) "1", (Object) (String) pVar.getExt().get("visible_code"));
    }

    public final void handleMessage(Message message) {
        if (message != null) {
            switch (message.what) {
                case 0:
                    removeMessages(0);
                    m76467a(true);
                    return;
                case 1:
                    removeMessages(1);
                    m76467a(false);
                    break;
            }
        }
    }

    /* renamed from: a */
    private final void m76467a(boolean z) {
        if (C33449f.m76666g()) {
            boolean z2 = true;
            if (!(this.f86381a.mo70865e().getSelectMsgType() == 1 || this.f86381a.mo70866f() == null)) {
                C11180b f = this.f86381a.mo70866f();
                if (f == null) {
                    C52711k.m112234a();
                }
                if (f.isMember()) {
                    C33355ad adVar = (C33355ad) this.f86381a.mo70863c().getValue();
                    if (adVar != null) {
                        if (!this.f86451c || !adVar.mo70726b()) {
                            z2 = false;
                        }
                        if (!z2) {
                            adVar = null;
                        }
                        if (adVar != null) {
                            if (m76469b(adVar.f86500c)) {
                                this.f86381a.mo70860a(3, null);
                            } else {
                                this.f86381a.mo70864d().mo20834a(adVar.f86500c, z, (C11162b<Pair<List<Long>, List<Long>>>) new C33337b<Pair<List<Long>, List<Long>>>(this, adVar.f86500c));
                            }
                        }
                    }
                }
            }
        }
    }
}
