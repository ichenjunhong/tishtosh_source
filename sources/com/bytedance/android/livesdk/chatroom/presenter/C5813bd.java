package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd */
public final class C5813bd extends C10176b<C5814a> {

    /* renamed from: a */
    public C1690c f15267a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$a */
    public interface C5814a extends C10175a {
        /* renamed from: a */
        void mo11695a(C3009i iVar);

        /* renamed from: a */
        void mo11696a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$b */
    public static final class C5815b<T> implements C1710e<User> {

        /* renamed from: a */
        final /* synthetic */ C5813bd f15268a;

        public C5815b(C5813bd bdVar) {
            this.f15268a = bdVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C3009i iVar = (C3009i) obj;
            C5814a aVar = (C5814a) this.f15268a.mo8518c();
            if (aVar != null) {
                aVar.mo11695a(iVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.bd$c */
    public static final class C5816c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C5813bd f15269a;

        public C5816c(C5813bd bdVar) {
            this.f15269a = bdVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C5814a aVar = (C5814a) this.f15269a.mo8518c();
            if (aVar != null) {
                aVar.mo11696a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        C1690c cVar = this.f15267a;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
