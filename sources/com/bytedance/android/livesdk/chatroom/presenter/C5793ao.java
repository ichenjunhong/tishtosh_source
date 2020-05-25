package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.C2970d;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao */
public final class C5793ao extends C10176b<C5795b> implements C8619a {

    /* renamed from: a */
    public C5794a f15237a;

    /* renamed from: b */
    Handler f15238b = new C8618a(this);

    /* renamed from: c */
    boolean f15239c;

    /* renamed from: d */
    List<C2970d> f15240d = new ArrayList();

    /* renamed from: e */
    int f15241e = 0;

    /* renamed from: f */
    int f15242f = 20;

    /* renamed from: g */
    public boolean f15243g;

    /* renamed from: h */
    private C1690c f15244h;

    /* renamed from: i */
    private boolean f15245i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao$a */
    public interface C5794a {
        /* renamed from: a */
        void mo11680a(C8686a aVar);

        /* renamed from: a */
        void mo11681a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao$b */
    public interface C5795b extends C10175a {
        /* renamed from: a */
        void mo11682a();

        /* renamed from: a */
        void mo11683a(C3009i iVar);

        /* renamed from: a */
        void mo11684a(Throwable th);

        /* renamed from: a */
        void mo11685a(List<C2970d> list);

        /* renamed from: b */
        void mo11686b(Throwable th);
    }

    /* renamed from: d */
    public final void mo11679d() {
        if (mo8518c() != null) {
            ((C5795b) mo8518c()).mo11682a();
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        if (this.f15244h != null && !this.f15244h.isDisposed()) {
            this.f15244h.dispose();
        }
    }

    /* renamed from: b */
    public final void mo11678b() {
        if (!this.f15239c) {
            this.f15239c = true;
            this.f15244h = ((C4585b) ((FansClubApi) C4514j.m10883j().mo10321b().mo9550a(FansClubApi.class)).get(this.f15241e, this.f15242f).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10390a(3).mo6514a(C1667a.m5940a()).mo6529b(C2168a.m6521b()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C5802av<Object>(this), (C1710e<? super Throwable>) new C5803aw<Object>(this), (C1706a) new C5804ax(this));
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5795b bVar) {
        super.mo8520a(bVar);
        this.f15240d.clear();
    }

    /* renamed from: a */
    public final void mo11677a(HashMap<String, String> hashMap) {
        if (!this.f15245i) {
            TTLiveSDKContext.getHostService().mo10315h().mo14515a(hashMap).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5796ap<Object>(this), (C1710e<? super Throwable>) new C5797aq<Object>(this));
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 100) {
                mo11678b();
            }
            return;
        }
        this.f15245i = false;
        if (mo8518c() != null) {
            if (message.obj instanceof Exception) {
                ((C5795b) mo8518c()).mo11684a((Throwable) (Exception) message.obj);
            } else if (message.obj instanceof User) {
                ((C5795b) mo8518c()).mo11683a((C3009i) (User) message.obj);
            } else {
                ((C5795b) mo8518c()).mo11684a((Throwable) new Exception("unknown msg.what"));
            }
        }
    }
}
