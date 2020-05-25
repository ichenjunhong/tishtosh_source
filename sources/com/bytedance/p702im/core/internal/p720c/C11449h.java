package com.bytedance.p702im.core.internal.p720c;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.p702im.core.internal.p720c.p721a.C11435a;
import com.bytedance.p702im.core.internal.p720c.p721a.C11436b;
import com.bytedance.p702im.core.internal.p720c.p721a.C11436b.C11438a;
import com.bytedance.p702im.core.internal.p720c.p721a.C11439c;
import com.bytedance.p702im.core.internal.utils.C11466d;
import com.bytedance.p702im.core.internal.utils.C11467e;
import com.bytedance.p702im.core.internal.utils.C11497j;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p703a.C11160a;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p705b.C11175c;
import com.bytedance.p702im.core.p705b.C11176d;
import com.bytedance.p702im.core.proto.IMCMD;
import com.bytedance.p702im.core.proto.Request;
import com.bytedance.p702im.core.proto.Response;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.c.h */
final class C11449h implements C11443c, C11502a {

    /* renamed from: a */
    private C11501n f30739a;

    /* renamed from: b */
    private C11501n f30740b;

    /* renamed from: c */
    private C11501n f30741c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C11447f> f30742d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private C11447f f30743e;

    /* renamed from: f */
    private Map<Long, C11447f> f30744f = new ConcurrentHashMap();

    /* renamed from: b */
    private synchronized void m23407b() {
        if (this.f30742d != null) {
            this.f30742d.clear();
        }
        if (this.f30744f != null) {
            this.f30744f.clear();
        }
    }

    C11449h() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f30739a = new C11501n(handlerThread.getLooper(), this);
        this.f30740b = new C11501n(handlerThread.getLooper(), this);
    }

    /* renamed from: d */
    private void m23410d() {
        if (!this.f30739a.hasMessages(103) && !this.f30742d.isEmpty()) {
            this.f30739a.sendEmptyMessageDelayed(103, (long) C11165c.m22588a().mo20513b().f30150n);
        }
    }

    /* renamed from: a */
    public final void mo21075a() {
        this.f30739a.removeMessages(BaseNotice.HASHTAG);
        this.f30739a.removeMessages(102);
        this.f30739a.removeMessages(103);
        this.f30739a.removeMessages(105);
        this.f30740b.removeMessages(102);
        this.f30739a.sendEmptyMessage(104);
    }

    /* renamed from: c */
    private void m23408c() {
        C11447f fVar;
        if (!this.f30742d.isEmpty()) {
            if (this.f30743e != null) {
                if (this.f30743e.mo21092f()) {
                    StringBuilder sb = new StringBuilder("request sendNextRequest timeout: ");
                    sb.append(this.f30743e.f30726a);
                    C11467e.m23472d(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f30743e.mo21090d());
                    C11176d.m22633a("im_ws_timeout", sb2.toString(), 1.0f);
                }
                fVar = this.f30743e;
            } else {
                fVar = (C11447f) this.f30742d.peek();
                this.f30743e = fVar;
                if (fVar != null) {
                    fVar.f30736k = SystemClock.uptimeMillis();
                    StringBuilder sb3 = new StringBuilder("request sendNextRequest ");
                    sb3.append(fVar.f30726a);
                    C11467e.m23462a(sb3.toString());
                }
            }
            if (fVar != null) {
                fVar.mo21087b();
                fVar.mo21088c();
                if (fVar.mo21091e()) {
                    m23411d(fVar);
                    return;
                }
                m23409c(fVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo21077a(C11501n nVar) {
        this.f30741c = nVar;
    }

    /* renamed from: f */
    private void m23413f(C11447f fVar) {
        if (this.f30741c != null) {
            Message obtain = Message.obtain(this.f30741c, fVar.mo21090d());
            obtain.obj = fVar;
            this.f30741c.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo21078a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f30740b.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private C11447f m23406b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator it = this.f30742d.iterator();
        while (it.hasNext()) {
            C11447f fVar = (C11447f) it.next();
            if (fVar.f30731f != null && fVar.f30727b == response.sequence_id.longValue()) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m23412e(C11447f fVar) {
        if (!this.f30742d.isEmpty()) {
            this.f30742d.remove(fVar);
            this.f30743e = null;
            m23413f(fVar);
            this.f30739a.removeMessages(103);
            if (!this.f30742d.isEmpty()) {
                m23408c();
            }
        }
    }

    /* renamed from: a */
    public final void mo21076a(C11447f fVar) {
        if (fVar != null && fVar.f30731f != null && fVar.f30731f.cmd.intValue() > IMCMD.IMCMD_NOT_USED.getValue()) {
            Message obtain = Message.obtain();
            obtain.what = BaseNotice.HASHTAG;
            obtain.obj = fVar;
            this.f30739a.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    public final void mo21101b(C11447f fVar) {
        if (fVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = fVar;
            obtain.arg1 = 2;
            this.f30739a.sendMessage(obtain);
        }
    }

    /* renamed from: d */
    private void m23411d(C11447f fVar) {
        Request request = fVar.f30731f;
        StringBuilder sb = new StringBuilder("Start Send Request By HTTP: cmd:");
        sb.append(request.cmd);
        sb.append("sequenceId=");
        sb.append(request.sequence_id);
        sb.append(",path=");
        sb.append(C11451i.m23423a(request.cmd.intValue()));
        C11497j.m23542a(sb.toString(), request);
        C11438a a = new C11438a().mo21070a(C11451i.m23423a(request.cmd.intValue()));
        if (C11165c.m22588a().mo20513b().f30148l == 0) {
            a.mo21072b("application/x-protobuf");
            if (C11165c.m22588a().mo20513b().f30155s == 0) {
                a.mo21071a(request.encode());
            } else {
                a.mo21069a(request);
            }
        } else {
            a.mo21072b("application/json");
            if (C11165c.m22588a().mo20513b().f30155s == 0) {
                a.mo21071a(C11466d.f30773a.mo34889b(request).getBytes());
            } else {
                a.mo21069a(request);
            }
        }
        C11436b bVar = a.f30708a;
        final long currentTimeMillis = System.currentTimeMillis();
        C11160a aVar = C11165c.m22588a().f30108c;
        final C11447f fVar2 = fVar;
        final C11436b bVar2 = bVar;
        C114501 r2 = new C11435a() {
            /* renamed from: a */
            public final void mo21067a(C11439c cVar, String str, String str2, int i) {
                String str3;
                C11439c cVar2 = cVar;
                fVar2.mo21085a(cVar);
                C11449h.this.mo21101b(fVar2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11176d.m22631a(uptimeMillis - fVar2.f30736k, currentTimeMillis, bVar2.f30704a, str, str2, 200, null);
                C11175c a = C11175c.m22624a().mo20526a("network").mo20528b(WebKitApi.SCHEME_HTTP).mo20527a("message_uuid", fVar2.mo21100n()).mo20527a("duration", Long.valueOf(uptimeMillis - fVar2.f30736k)).mo20527a("cmd", Integer.valueOf(fVar2.mo21090d())).mo20527a("url", bVar2.f30704a).mo20527a("success", Integer.valueOf(1));
                String str4 = "response_log_id";
                if (fVar2.f30732g != null) {
                    str3 = fVar2.f30732g.log_id;
                } else {
                    str3 = "-1";
                }
                a.mo20527a(str4, str3).mo20530b();
            }

            /* renamed from: a */
            public final void mo21068a(Exception exc, String str, String str2, int i) {
                String str3;
                Exception exc2 = exc;
                C11447f fVar = fVar2;
                if (exc2 == null) {
                    str3 = "";
                } else {
                    str3 = exc.getMessage();
                }
                fVar.mo21084a(-1000, str3);
                C11165c.m22588a();
                C11449h.this.mo21101b(fVar2);
                StringBuilder sb = new StringBuilder("sendByHttp cmd:");
                sb.append(fVar2.mo21090d());
                sb.append(" url:");
                sb.append(bVar2.f30704a);
                C11467e.m23465a(sb.toString(), (Throwable) exc2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11176d.m22639b(uptimeMillis - fVar2.f30736k, currentTimeMillis, bVar2.f30704a, str, str2, -1000, null);
                C11175c.m22624a().mo20526a("network").mo20528b(WebKitApi.SCHEME_HTTP).mo20527a("message_uuid", fVar2.mo21100n()).mo20527a("duration", Long.valueOf(uptimeMillis - fVar2.f30736k)).mo20527a("error", exc2).mo20527a("error_stack", C11176d.m22638b(exc)).mo20527a("cmd", Integer.valueOf(fVar2.mo21090d())).mo20527a("url", bVar2.f30704a).mo20527a("success", Integer.valueOf(0)).mo20530b();
            }
        };
        aVar.mo20495a(bVar, (C11435a) r2);
    }

    /* renamed from: a */
    public final void mo21079a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f30742d.isEmpty()) {
            for (Long l : list) {
                Iterator it = this.f30742d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11447f fVar = (C11447f) it.next();
                    if (l.longValue() == fVar.f30726a) {
                        fVar.f30729d = null;
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m23409c(C11447f fVar) {
        try {
            Request request = fVar.f30731f;
            StringBuilder sb = new StringBuilder("Start Send Request By WS: cmd:");
            sb.append(request.cmd);
            sb.append("sequenceId=");
            sb.append(request.sequence_id);
            sb.append(",path=");
            sb.append(C11451i.m23423a(request.cmd.intValue()));
            C11497j.m23542a(sb.toString(), request);
            Pair a = C11448g.m23404a(request);
            C11165c.m22588a().f30108c.mo20494a(request.cmd.intValue(), request.sequence_id.longValue(), (String) a.first, (byte[]) a.second);
            fVar.mo21083a();
            m23410d();
        } catch (C11434a e) {
            if (e.getErrorCode() == -2004) {
                fVar.f30728c = true;
                m23411d(fVar);
            } else {
                fVar.f30734i = e.getErrorCode();
                m23412e(fVar);
                StringBuilder sb2 = new StringBuilder("sendByWs cmd:");
                sb2.append(fVar.mo21090d());
                C11467e.m23465a(sb2.toString(), (Throwable) e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.mo21090d());
                C11176d.m22633a("im_pb_encode_error", sb3.toString(), 1.0f);
            }
            C11175c.m22624a().mo20526a("network").mo20528b("ws").mo20527a("message_uuid", fVar.mo21100n()).mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30736k)).mo20527a("error", e).mo20527a("error_stack", C11176d.m22638b(e)).mo20527a("cmd", Integer.valueOf(fVar.mo21090d())).mo20527a("success", Integer.valueOf(0)).mo20530b();
        }
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        C11447f fVar;
        Response response;
        String str;
        String str2;
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                if (message.obj instanceof C11447f) {
                    C11447f fVar2 = (C11447f) message.obj;
                    this.f30742d.add(fVar2);
                    if (!this.f30739a.hasMessages(103) && (((C11447f) this.f30742d.peek()).f30726a == fVar2.f30726a || (this.f30743e != null && this.f30743e.mo21092f()))) {
                        this.f30739a.sendEmptyMessage(103);
                    }
                }
                return;
            case 102:
                if (message.obj instanceof Response) {
                    response = (Response) message.obj;
                    fVar = null;
                } else if (message.obj instanceof C11447f) {
                    C11447f fVar3 = (C11447f) message.obj;
                    fVar = fVar3;
                    response = fVar3.f30732g;
                } else {
                    response = null;
                    fVar = null;
                }
                boolean z = false;
                if (response != null) {
                    int[] iArr = C11165c.m22588a().mo20513b().f30152p;
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            int i2 = iArr[i];
                            if (!(response.inbox_type == null || i2 == response.inbox_type.intValue())) {
                                i++;
                            }
                        } else {
                            int[] iArr2 = C11165c.m22588a().mo20513b().f30153q;
                            if (iArr2 != null) {
                                int length2 = iArr2.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length2) {
                                        int i4 = iArr2[i3];
                                        if (!(response.inbox_type == null || i4 == response.inbox_type.intValue())) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    C11447f b = C11447f.m23385b(response);
                    if (b != null) {
                        StringBuilder sb = new StringBuilder("On Get Notify By WS: ");
                        sb.append(response.cmd);
                        C11497j.m23542a(sb.toString(), response);
                        m23413f(b);
                        break;
                    } else {
                        StringBuilder sb2 = new StringBuilder("On Get Response By NetType (");
                        if (message.arg1 == 2) {
                            str = "HTTP";
                        } else {
                            str = "WS";
                        }
                        sb2.append(str);
                        sb2.append("): cmd:");
                        sb2.append(response.cmd);
                        sb2.append("sequence_id=");
                        sb2.append(response.sequence_id);
                        sb2.append(",path=");
                        sb2.append(C11451i.m23423a(response.cmd.intValue()));
                        C11497j.m23542a(sb2.toString(), response);
                        if (fVar == null) {
                            fVar = m23406b(response);
                            if (fVar != null) {
                                StringBuilder sb3 = new StringBuilder("find local waiting request item sequence_id: ");
                                sb3.append(fVar.f30727b);
                                C11467e.m23462a(sb3.toString());
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("duration", SystemClock.uptimeMillis() - fVar.f30736k);
                                    jSONObject.put("retry", fVar.f30737l - 1);
                                } catch (JSONException unused) {
                                }
                                C11176d.m22637a("im_ws_duration", jSONObject, (JSONObject) null);
                                C11175c a = C11175c.m22624a().mo20526a("network").mo20528b("ws").mo20527a("message_uuid", fVar.mo21100n()).mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30736k)).mo20527a("cmd", Integer.valueOf(fVar.mo21090d())).mo20527a("retry", Integer.valueOf(fVar.f30737l - 1)).mo20527a("success", Integer.valueOf(1));
                                String str3 = "response_log_id";
                                if (fVar.f30732g != null) {
                                    str2 = fVar.f30732g.log_id;
                                } else {
                                    str2 = "-1";
                                }
                                a.mo20527a(str3, str2).mo20530b();
                            }
                        }
                        if (fVar != null) {
                            fVar.mo21086a(response);
                            m23412e(fVar);
                        }
                    }
                }
                return;
            case 103:
                m23408c();
                return;
            case 104:
                m23407b();
                return;
            case 105:
                long longValue = ((Long) message.obj).longValue();
                if (!this.f30744f.isEmpty() && this.f30744f.containsKey(Long.valueOf(longValue))) {
                    mo21076a((C11447f) this.f30744f.get(Long.valueOf(longValue)));
                    this.f30744f.remove(Long.valueOf(longValue));
                    break;
                } else {
                    return;
                }
        }
    }
}
