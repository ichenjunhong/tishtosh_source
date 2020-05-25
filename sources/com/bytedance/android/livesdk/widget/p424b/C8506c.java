package com.bytedance.android.livesdk.widget.p424b;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8645d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.b.c */
public final class C8506c implements C8645d {

    /* renamed from: a */
    public C8522f f23336a;

    /* renamed from: b */
    private IMessageManager f23337b;

    /* renamed from: c */
    private final String f23338c;

    /* renamed from: d */
    private C1690c f23339d;

    /* renamed from: e */
    private final Context f23340e;

    /* renamed from: f */
    private final ViewGroup f23341f;

    /* renamed from: g */
    private final long f23342g;

    /* renamed from: com.bytedance.android.livesdk.widget.b.c$a */
    static final class C8507a<T> implements C1710e<C4177d<Room>> {

        /* renamed from: a */
        final /* synthetic */ C8506c f23343a;

        /* renamed from: b */
        final /* synthetic */ int f23344b;

        C8507a(C8506c cVar, int i) {
            this.f23343a = cVar;
            this.f23344b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C8522f fVar = this.f23343a.f23336a;
            if (fVar != null) {
                Object obj2 = dVar.data;
                C52711k.m112236a(obj2, "roomResponse.data");
                fVar.setRoom((Room) obj2);
            }
            C8522f fVar2 = this.f23343a.f23336a;
            if (fVar2 != null) {
                fVar2.mo14957a(this.f23344b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.c$b */
    static final class C8508b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C8508b f23345a = new C8508b();

        C8508b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.c$c */
    static final class C8509c<T> implements C1710e<C4177d<Room>> {

        /* renamed from: a */
        final /* synthetic */ C8506c f23346a;

        /* renamed from: b */
        final /* synthetic */ int f23347b;

        C8509c(C8506c cVar, int i) {
            this.f23346a = cVar;
            this.f23347b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C8522f fVar = this.f23346a.f23336a;
            if (fVar != null) {
                Object obj2 = dVar.data;
                C52711k.m112236a(obj2, "roomResponse.data");
                fVar.setRoom((Room) obj2);
            }
            C8522f fVar2 = this.f23346a.f23336a;
            if (fVar2 != null) {
                fVar2.mo14957a(this.f23347b);
            }
            this.f23346a.mo14950b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.c$d */
    static final class C8510d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C8506c f23348a;

        /* renamed from: b */
        final /* synthetic */ int f23349b;

        C8510d(C8506c cVar, int i) {
            this.f23348a = cVar;
            this.f23349b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8522f fVar = this.f23348a.f23336a;
            if (fVar != null) {
                fVar.mo14957a(this.f23349b);
            }
            this.f23348a.mo14950b();
        }
    }

    /* renamed from: b */
    public final void mo14950b() {
        try {
            IMessageManager iMessageManager = this.f23337b;
            if (iMessageManager != null) {
                iMessageManager.startMessage();
            }
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C3833a.m9731a(jSONObject, "exception_message", e.toString());
            C3837e.m9744a("feed_follow_live_message_exception", 0, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo14948a() {
        IMessageManager iMessageManager = this.f23337b;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(true);
        }
        IMessageManager iMessageManager2 = this.f23337b;
        if (iMessageManager2 != null) {
            iMessageManager2.release();
        }
        C8522f fVar = this.f23336a;
        if (fVar != null) {
            C1690c cVar = fVar.f23384b;
            if (cVar != null) {
                cVar.dispose();
            }
            C1690c cVar2 = fVar.f23385c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            C1690c cVar3 = fVar.f23386d;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            C1690c cVar4 = fVar.f23387e;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            ValueAnimator valueAnimator = fVar.f23389g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ViewGroup viewGroup = this.f23341f;
        if (viewGroup != null) {
            viewGroup.removeView(this.f23336a);
        }
        C1690c cVar5 = this.f23339d;
        if (cVar5 != null) {
            cVar5.dispose();
        }
    }

    /* renamed from: a */
    public final void mo14949a(int i) {
        if (i == 1) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f23342g));
            this.f23339d = ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).fetchRoom(hashMap).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8507a<Object>(this, i), (C1710e<? super Throwable>) C8508b.f23345a);
        } else if (i == 2) {
            C8522f fVar = this.f23336a;
            if (fVar != null) {
                fVar.mo14957a(i);
            }
            mo14950b();
        } else {
            if (i == 3 || i == 4) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("room_id", String.valueOf(this.f23342g));
                this.f23339d = ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).fetchRoom(hashMap2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8509c<Object>(this, i), (C1710e<? super Throwable>) new C8510d<Object>(this, i));
            }
        }
    }

    public C8506c(Context context, ViewGroup viewGroup, long j) {
        IMessageManager iMessageManager;
        this.f23340e = context;
        this.f23341f = viewGroup;
        this.f23342g = j;
        StringBuilder sb = new StringBuilder();
        sb.append(C8629a.CHAT.getWsMethod());
        sb.append(",");
        sb.append(C8629a.SCREEN.getWsMethod());
        sb.append(",");
        sb.append(C8629a.MEMBER.getWsMethod());
        this.f23338c = sb.toString();
        if (this.f23340e != null && this.f23341f != null) {
            C8862e d = C8830k.m17330d();
            if (d != null) {
                iMessageManager = d.mo15032a(this.f23342g, this.f23340e, this.f23338c);
            } else {
                iMessageManager = null;
            }
            this.f23337b = iMessageManager;
            C8522f fVar = new C8522f(this.f23340e, this.f23337b);
            fVar.setLayoutParams(new LayoutParams(-1, -1));
            this.f23336a = fVar;
            this.f23341f.addView(this.f23336a);
        }
    }
}
