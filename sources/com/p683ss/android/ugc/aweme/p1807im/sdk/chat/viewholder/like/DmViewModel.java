package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.C35177b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmViewModel */
public final class DmViewModel extends C0209x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f87824a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DmViewModel.class), "delMessage", "getDelMessage()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DmViewModel.class), "sessionUpdateConversationId", "getSessionUpdateConversationId()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public static final C33854a f87825b = new C33854a(null);

    /* renamed from: c */
    private final C52668f f87826c = C52732g.m112285a(C33855b.f87828a);

    /* renamed from: d */
    private final C52668f f87827d = C52732g.m112285a(C33856c.f87829a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmViewModel$a */
    public static final class C33854a {
        private C33854a() {
        }

        public /* synthetic */ C33854a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static DmViewModel m77621a(Context context) {
            return (DmViewModel) C35177b.m79420a(context, DmViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmViewModel$b */
    static final class C33855b extends C52712l implements C52670a<C0198r<C11207p>> {

        /* renamed from: a */
        public static final C33855b f87828a = new C33855b();

        C33855b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmViewModel$c */
    static final class C33856c extends C52712l implements C52670a<C0198r<String>> {

        /* renamed from: a */
        public static final C33856c f87829a = new C33856c();

        C33856c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: a */
    public final C0198r<C11207p> mo71884a() {
        return (C0198r) this.f87826c.getValue();
    }

    /* renamed from: b */
    public final C0198r<String> mo71885b() {
        return (C0198r) this.f87827d.getValue();
    }
}
