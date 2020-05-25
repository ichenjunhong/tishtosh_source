package com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l;

import android.text.TextUtils;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.bytedance.p702im.core.internal.p720c.p721a.C11435a;
import com.bytedance.p702im.core.internal.p720c.p721a.C11436b;
import com.bytedance.p702im.core.internal.p720c.p721a.C11439c.C11441a;
import com.bytedance.p702im.core.p703a.C11160a;
import com.bytedance.p702im.core.p703a.C11164b;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.proto.MessageBody;
import com.bytedance.p702im.core.proto.Response;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.SdkRequestHeaderSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h.C34026h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34018h.C34027i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.l.f */
public final class C34403f implements C11160a {

    /* renamed from: a */
    private static volatile boolean f88780a;

    /* renamed from: b */
    private C11164b f88781b = new C11164b() {
        /* renamed from: a */
        public final int mo20510a(C11207p pVar) {
            return (pVar.getMsgType() != 15 || DefaultIMService.provideIMService_Monster().getAbInterface() == null) ? 0 : 0;
        }

        /* renamed from: a */
        public final MessageBody mo20511a(MessageBody messageBody, int i) {
            if (messageBody == null || messageBody.message_type.intValue() == 50010 || messageBody.message_type.intValue() == 60001) {
                return null;
            }
            if (messageBody.message_type.intValue() > 50000) {
                return messageBody;
            }
            if (messageBody.message_type.intValue() < 0 || messageBody.message_type.intValue() > 1999) {
                return null;
            }
            if (messageBody.message_type.intValue() == 1002) {
                try {
                    if (TextUtils.isEmpty(messageBody.content) || ((SayHelloContent) C35277o.m79760a(messageBody.content, SayHelloContent.class)).getType() != 100200) {
                        return messageBody;
                    }
                    return null;
                } catch (Exception unused) {
                    return messageBody;
                }
            }
            return messageBody;
        }
    };

    /* renamed from: e */
    public final C11164b mo20502e() {
        return this.f88781b;
    }

    /* renamed from: a */
    public final long mo20490a() {
        return C35265e.m79733d();
    }

    /* renamed from: f */
    public final Map<String, String> mo20503f() {
        return SdkRequestHeaderSettings.getRequestHeader();
    }

    /* renamed from: b */
    public final String mo20497b() {
        return C35284t.m79782a().mo73432k();
    }

    /* renamed from: d */
    public final boolean mo20501d() {
        return C34401d.m78329a().mo72406b();
    }

    /* renamed from: g */
    public final void mo20504g() {
        if (!f88780a) {
            C11511a.m23578a("wcdb");
            f88780a = true;
        }
    }

    /* renamed from: h */
    public final String mo20505h() {
        return C34030j.m77789b(String.valueOf(C35265e.m79733d()));
    }

    /* renamed from: c */
    public final String mo20499c() {
        String c = C11049a.m22367c();
        if (TextUtils.isEmpty(c)) {
            c = "-1";
        }
        return c.toString();
    }

    /* renamed from: a */
    public final void mo20491a(int i) {
        C34018h b = C34018h.m77779b();
        C34018h.m77777a("start refreshToken");
        if (!C35265e.m79727a()) {
            C34018h.m77777a("start refreshToken but user not login");
        } else {
            b.f87956a.mo6181a(C35286u.m79865a().fetchMixInit(0, 0, 1).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C34026h<Object>(b), (C1710e<? super Throwable>) new C34027i<Object>(b)));
        }
    }

    /* renamed from: a */
    public final void mo20496a(List<C11207p> list) {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null && baseUserService_Monster.isLogin() && list != null && !list.isEmpty()) {
            C11207p pVar = (C11207p) list.get(list.size() - 1);
            if (pVar != null) {
                String valueOf = String.valueOf(pVar.getSender());
                IMUser a = C34010e.m77748a().mo71952a(valueOf);
                if (a == null) {
                    C34010e.m77748a().mo71961a(valueOf, pVar.getSecSender(), (C34015a) new C34405g(this, pVar));
                } else {
                    m78335a(a, pVar);
                }
            }
        }
    }

    /* renamed from: a */
    static void m78335a(IMUser iMUser, C11207p pVar) {
        if (iMUser != null && pVar != null) {
            C34004b.m77717a().mo71949f().showNotification(iMUser.getNickName(), C33888y.content(pVar).getMsgHint());
        }
    }

    /* renamed from: b */
    public final void mo20498b(int i, int i2) {
        StringBuilder sb = new StringBuilder("onPullMsg inbox=");
        sb.append(i);
        sb.append(" reason=");
        sb.append(i2);
        C35459a.m80148a("WsDependImpl", sb.toString());
    }

    /* renamed from: a */
    public final void mo20492a(int i, int i2) {
        StringBuilder sb = new StringBuilder("onIMInitResult inbox=");
        sb.append(i);
        sb.append(" result=");
        sb.append(i2);
        C35459a.m80148a("WsDependImpl", sb.toString());
    }

    /* renamed from: c */
    public final void mo20500c(int i, int i2) {
        StringBuilder sb = new StringBuilder("onGlobalPulling i=");
        sb.append(i);
        sb.append(" i1=");
        sb.append(i2);
        C35459a.m80148a("WsDependImpl", sb.toString());
    }

    /* renamed from: a */
    public final void mo20495a(C11436b bVar, C11435a aVar) {
        StringBuilder sb = new StringBuilder("sendHttp request=");
        sb.append(bVar);
        sb.append(" callback=");
        sb.append(aVar);
        C35459a.m80148a("WsDependImpl", sb.toString());
        C1680ad.m5960a((C2206z<? extends T>) C35286u.f90624a.postIMSDK(bVar.f30704a, bVar.f30707d, bVar.f30705b)).mo6155b(C2168a.m6521b()).mo6159b((C1683ag<? super T>) new C1683ag<Response>(aVar) {

            /* renamed from: a */
            final /* synthetic */ C11435a f90635a;

            public final void onSubscribe(C1690c cVar) {
            }

            {
                this.f90635a = r1;
            }

            public final void onError(Throwable th) {
                Exception exc;
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = new Exception(th);
                }
                this.f90635a.mo21068a(exc, "", "", -1000);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                Response response = (Response) obj;
                C11435a aVar = this.f90635a;
                C11441a aVar2 = new C11441a();
                aVar2.f30713a.f30709a = 200;
                aVar2.f30713a.f30710b = "";
                aVar2.f30713a.f30712d = response;
                aVar.mo21067a(aVar2.f30713a, "", "", 200);
            }
        });
    }

    /* renamed from: a */
    public final void mo20493a(int i, long j, long j2) {
        StringBuilder sb = new StringBuilder("onIMInitPageResult i=");
        sb.append(i);
        sb.append(" l=");
        sb.append(j);
        sb.append(" l1=");
        sb.append(j2);
        C35459a.m80148a("WsDependImpl", sb.toString());
    }

    /* renamed from: a */
    public final void mo20494a(int i, long j, String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder("send cmd=");
        sb.append(i);
        sb.append(" seqId=");
        sb.append(j);
        sb.append(" encodeType=");
        sb.append(str);
        sb.append(" payload=");
        sb.append(bArr);
        C35459a.m80148a("WsDependImpl", sb.toString());
        if (C34401d.m78329a().f88779c != C50820a.CONNECTED) {
            C35459a.m80150b("ImWebSocketManager", "send msg return : connection is not connected yet");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cmd", String.valueOf(i));
        hashMap.put("seq_id", String.valueOf(j));
        C50817e eVar = new C50817e(C34401d.m78332c(), 5, j, 0, 1, bArr, "pb", str, hashMap);
        C53755c.m114319a().mo112960d(new C50816d(C34401d.m78332c(), eVar));
    }
}
