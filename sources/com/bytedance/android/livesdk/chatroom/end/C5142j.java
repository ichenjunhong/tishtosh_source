package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import java.util.HashMap;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.j */
public final class C5142j {

    /* renamed from: a */
    public final C1689b f13793a = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.j$a */
    public interface C5144a {
        /* renamed from: a */
        void mo11007a(C8686a aVar);

        /* renamed from: a */
        void mo11008a(Throwable th);
    }

    /* renamed from: a */
    public final void mo11031a(long j, Room room, String str, final C5144a aVar) {
        boolean z;
        String str2;
        if (room != null) {
            TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(j)).mo14504a(room.getRequestId())).mo14507b("live_detail")).mo14508c("live_over")).mo14506b(0)).mo14509d(room.getLabels())).mo14510c()).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                    C5142j.this.f13793a.mo6181a(cVar);
                }

                public final void onError(Throwable th) {
                    if (aVar != null) {
                        aVar.mo11008a(th);
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C8686a aVar = (C8686a) obj;
                    if (aVar != null) {
                        aVar.mo11007a(aVar);
                    }
                }
            });
            if (room.getOwner() == null || room.getOwner().getId() != j) {
                z = false;
            } else {
                z = true;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("growth_deepevent", "1");
                C8049c a = C8049c.m15979a();
                String str3 = "follow";
                Object[] objArr = new Object[3];
                if (z) {
                    str2 = "live_over";
                } else {
                    str2 = "live_anchor_c_audience";
                }
                objArr[0] = new C8052c(str2, j);
                objArr[1] = new C8059j().mo14214b("live_interact").mo14218f("core").mo14213a("live_detail");
                objArr[2] = Room.class;
                a.mo14202a(str3, hashMap, objArr);
            } catch (Exception unused) {
            }
        }
    }
}
