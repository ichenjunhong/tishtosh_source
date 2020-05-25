package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.C8720t;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.be */
public final class C5817be extends C10176b<C5818a> {

    /* renamed from: a */
    public final C1689b f15270a = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.be$a */
    public interface C5818a extends C10175a {
        /* renamed from: a */
        void mo11697a(C8720t tVar);

        /* renamed from: a */
        void mo11698a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.be$b */
    public static final class C5819b<T> implements C1710e<C8720t> {

        /* renamed from: a */
        final /* synthetic */ C5817be f15271a;

        public C5819b(C5817be beVar) {
            this.f15271a = beVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C8720t tVar = (C8720t) obj;
            if (tVar == null) {
                C5818a aVar = (C5818a) this.f15271a.mo8518c();
                if (aVar != null) {
                    aVar.mo11698a((Throwable) new IllegalArgumentException("data is null"));
                }
            } else {
                C5818a aVar2 = (C5818a) this.f15271a.mo8518c();
                if (aVar2 != null) {
                    aVar2.mo11697a(tVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.be$c */
    public static final class C5820c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C5817be f15272a;

        public C5820c(C5817be beVar) {
            this.f15272a = beVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C5818a aVar = (C5818a) this.f15272a.mo8518c();
            if (aVar != null) {
                aVar.mo11698a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        this.f15270a.dispose();
        this.f15270a.mo6180a();
    }
}
