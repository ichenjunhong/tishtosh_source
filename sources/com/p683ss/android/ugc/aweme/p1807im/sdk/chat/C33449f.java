package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f */
public final class C33449f {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f86692a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33449f.class), "reporter", "getReporter()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateReporter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33449f.class), "messageList", "getMessageList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33449f.class), "spotReadState", "getSpotReadState()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};

    /* renamed from: b */
    public C11213r f86693b;

    /* renamed from: c */
    public C33353ab f86694c;

    /* renamed from: d */
    private final C52668f f86695d = C52732g.m112285a(new C33451b(this));

    /* renamed from: e */
    private final C52668f f86696e = C52732g.m112285a(C33450a.f86698a);

    /* renamed from: f */
    private final C52668f f86697f = C52732g.m112285a(C33452c.f86700a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f$a */
    static final class C33450a extends C52712l implements C52670a<List<C11207p>> {

        /* renamed from: a */
        public static final C33450a f86698a = new C33450a();

        C33450a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f$b */
    static final class C33451b extends C52712l implements C52670a<C33985z> {

        /* renamed from: a */
        final /* synthetic */ C33449f f86699a;

        C33451b(C33449f fVar) {
            this.f86699a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C11180b f = this.f86699a.mo70866f();
            if (f != null) {
                return new C33985z(f);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.f$c */
    static final class C33452c extends C52712l implements C52670a<C23275b<C33355ad>> {

        /* renamed from: a */
        public static final C33452c f86700a = new C33452c();

        C33452c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23275b();
        }
    }

    /* renamed from: g */
    public static boolean m76666g() {
        return ReadStateViewModel.f86455c;
    }

    /* renamed from: a */
    public final C33985z mo70859a() {
        return (C33985z) this.f86695d.getValue();
    }

    /* renamed from: b */
    public final List<C11207p> mo70862b() {
        return (List) this.f86696e.getValue();
    }

    /* renamed from: c */
    public final C23275b<C33355ad> mo70863c() {
        return (C23275b) this.f86697f.getValue();
    }

    /* renamed from: d */
    public final C11213r mo70864d() {
        C11213r rVar = this.f86693b;
        if (rVar == null) {
            C52711k.m112237a("messageModel");
        }
        return rVar;
    }

    /* renamed from: e */
    public final C33353ab mo70865e() {
        C33353ab abVar = this.f86694c;
        if (abVar == null) {
            C52711k.m112237a("sessionInfo");
        }
        return abVar;
    }

    /* renamed from: f */
    public final C11180b mo70866f() {
        C11182d a = C11182d.m22641a();
        C33353ab abVar = this.f86694c;
        if (abVar == null) {
            C52711k.m112237a("sessionInfo");
        }
        return a.mo20658a(abVar.getConversationId());
    }

    /* renamed from: a */
    public final boolean mo70861a(C11207p pVar) {
        if (pVar == null) {
            mo70863c().setValue(null);
            return true;
        }
        if (mo70863c().getValue() != null) {
            Object value = mo70863c().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            if (C52711k.m112239a((Object) pVar, (Object) ((C33355ad) value).f86500c)) {
                Object value2 = mo70863c().getValue();
                if (value2 == null) {
                    C52711k.m112234a();
                }
                C33355ad adVar = (C33355ad) value2;
                C52711k.m112240b(pVar, "<set-?>");
                adVar.f86500c = pVar;
                return false;
            }
        }
        C23275b c = mo70863c();
        C33353ab abVar = this.f86694c;
        if (abVar == null) {
            C52711k.m112237a("sessionInfo");
        }
        c.setValue(new C33355ad(pVar, abVar));
        return true;
    }

    /* renamed from: a */
    public final void mo70860a(int i, List<String> list) {
        boolean z;
        String str;
        C33355ad adVar = (C33355ad) mo70863c().getValue();
        if (adVar != null) {
            adVar.f86499b = i;
            adVar.mo70725a().clear();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                adVar.mo70725a().addAll(collection);
            }
            mo70863c().setValue(mo70863c().getValue());
            C33985z a = mo70859a();
            if (a != null) {
                C11207p pVar = adVar.f86500c;
                C52711k.m112240b(pVar, "message");
                if (i != -1) {
                    if (a.f87896d.isGroupChat() && i == 1) {
                        i = 2;
                    }
                    if (!C52711k.m112239a((Object) a.f87893a, (Object) pVar) || a.f87894b != i) {
                        a.f87893a = pVar;
                        a.f87894b = i;
                        if (i == 0) {
                            str = "send";
                        } else if (i != 2) {
                            str = "";
                        } else {
                            str = "read";
                        }
                        a.mo71917a(str);
                    }
                }
            }
        }
    }
}
