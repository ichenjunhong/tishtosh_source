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

/* renamed from: com.bytedance.im.core.internal.c.d */
final class C11444d implements C11443c, C11502a {

    /* renamed from: a */
    private C11501n f30717a;

    /* renamed from: b */
    private C11501n f30718b;

    /* renamed from: c */
    private C11501n f30719c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<C11447f> f30720d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private Map<Long, C11447f> f30721e = new ConcurrentHashMap();

    /* renamed from: b */
    private synchronized void m23363b() {
        if (this.f30720d != null) {
            this.f30720d.clear();
        }
        if (this.f30721e != null) {
            this.f30721e.clear();
        }
    }

    C11444d() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f30717a = new C11501n(handlerThread.getLooper(), this);
        this.f30718b = new C11501n(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo21075a() {
        this.f30717a.removeMessages(BaseNotice.HASHTAG);
        this.f30718b.removeMessages(102);
        this.f30717a.removeMessages(103);
        this.f30717a.removeMessages(105);
        this.f30717a.sendEmptyMessage(104);
    }

    /* renamed from: a */
    public final void mo21077a(C11501n nVar) {
        this.f30719c = nVar;
    }

    /* renamed from: e */
    private void m23367e(C11447f fVar) {
        this.f30720d.add(fVar);
        Message obtain = Message.obtain();
        obtain.what = 103;
        obtain.obj = fVar;
        this.f30717a.sendMessageDelayed(obtain, (long) C11165c.m22588a().mo20513b().f30150n);
    }

    /* renamed from: f */
    private void m23368f(C11447f fVar) {
        if (!this.f30720d.isEmpty()) {
            this.f30720d.remove(fVar);
            m23369g(fVar);
        }
    }

    /* renamed from: g */
    private void m23369g(C11447f fVar) {
        if (this.f30719c != null) {
            Message obtain = Message.obtain(this.f30719c, fVar.mo21090d());
            obtain.obj = fVar;
            this.f30719c.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    public final void mo21078a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f30718b.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private C11447f m23362b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator it = this.f30720d.iterator();
        while (it.hasNext()) {
            C11447f fVar = (C11447f) it.next();
            if (fVar.f30731f != null && fVar.f30727b == response.sequence_id.longValue()) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m23365c(Response response) {
        int[] iArr;
        if (response == null) {
            return false;
        }
        for (int i : C11165c.m22588a().mo20513b().f30152p) {
            if (response.inbox_type == null || i == response.inbox_type.intValue()) {
                return true;
            }
        }
        int[] iArr2 = C11165c.m22588a().mo20513b().f30153q;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (response.inbox_type == null || i2 == response.inbox_type.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo21076a(C11447f fVar) {
        if (fVar != null && fVar.f30731f != null && fVar.f30731f.cmd.intValue() > IMCMD.IMCMD_NOT_USED.getValue()) {
            Message obtain = Message.obtain();
            obtain.what = BaseNotice.HASHTAG;
            obtain.obj = fVar;
            this.f30717a.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    public final void mo21080b(C11447f fVar) {
        if (fVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = fVar;
            obtain.arg1 = 2;
            this.f30718b.sendMessage(obtain);
        }
    }

    /* renamed from: c */
    private void m23364c(C11447f fVar) {
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
            m23367e(fVar);
        } catch (C11434a e) {
            if (e.getErrorCode() == -2004) {
                fVar.f30728c = true;
                m23366d(fVar);
            } else {
                fVar.f30734i = e.getErrorCode();
                m23368f(fVar);
                StringBuilder sb2 = new StringBuilder("sendByWs cmd:");
                sb2.append(fVar.mo21090d());
                C11467e.m23465a(sb2.toString(), (Throwable) e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.mo21090d());
                C11176d.m22633a("im_pb_encode_error", sb3.toString(), 1.0f);
            }
            C11175c.m22624a().mo20526a("network").mo20528b("ws").mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30736k)).mo20527a("error", e).mo20527a("error_stack", C11176d.m22638b(e)).mo20527a("cmd", Integer.valueOf(fVar.mo21090d())).mo20527a("success", Integer.valueOf(0)).mo20530b();
        }
    }

    /* renamed from: d */
    private void m23366d(C11447f fVar) {
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
        this.f30720d.add(fVar);
        C11436b bVar = a.f30708a;
        final long currentTimeMillis = System.currentTimeMillis();
        C11160a aVar = C11165c.m22588a().f30108c;
        final C11447f fVar2 = fVar;
        final C11436b bVar2 = bVar;
        C114451 r2 = new C11435a() {
            /* renamed from: a */
            public final void mo21067a(C11439c cVar, String str, String str2, int i) {
                C11439c cVar2 = cVar;
                fVar2.mo21085a(cVar);
                C11444d.this.mo21080b(fVar2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11176d.m22631a(uptimeMillis - fVar2.f30736k, currentTimeMillis, bVar2.f30704a, str, str2, 200, null);
                C11175c.m22624a().mo20526a("network").mo20528b(WebKitApi.SCHEME_HTTP).mo20527a("duration", Long.valueOf(uptimeMillis - fVar2.f30736k)).mo20527a("cmd", Integer.valueOf(fVar2.mo21090d())).mo20527a("url", bVar2.f30704a).mo20527a("success", Integer.valueOf(1)).mo20530b();
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
                C11444d.this.mo21080b(fVar2);
                StringBuilder sb = new StringBuilder("sendByHttp cmd:");
                sb.append(fVar2.mo21090d());
                sb.append(" url:");
                sb.append(bVar2.f30704a);
                C11467e.m23465a(sb.toString(), (Throwable) exc2);
                long uptimeMillis = SystemClock.uptimeMillis();
                C11176d.m22639b(uptimeMillis - fVar2.f30736k, currentTimeMillis, bVar2.f30704a, str, str2, -1000, null);
                C11175c.m22624a().mo20526a("network").mo20528b(WebKitApi.SCHEME_HTTP).mo20527a("duration", Long.valueOf(uptimeMillis - fVar2.f30736k)).mo20527a("error", exc2).mo20527a("error_stack", C11176d.m22638b(exc)).mo20527a("cmd", Integer.valueOf(fVar2.mo21090d())).mo20527a("url", bVar2.f30704a).mo20527a("success", Integer.valueOf(0)).mo20530b();
            }
        };
        aVar.mo20495a(bVar, (C11435a) r2);
    }

    /* renamed from: a */
    public final void mo21079a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f30720d.isEmpty()) {
            for (Long l : list) {
                Iterator it = this.f30720d.iterator();
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

    /* renamed from: a */
    public final void mo20961a(Message message) {
        C11447f fVar;
        Response response;
        String str;
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                if (message.obj instanceof C11447f) {
                    C11447f fVar2 = (C11447f) message.obj;
                    fVar2.f30736k = SystemClock.uptimeMillis();
                    fVar2.mo21087b();
                    StringBuilder sb = new StringBuilder("request sendNextRequest ");
                    sb.append(fVar2.f30726a);
                    C11467e.m23462a(sb.toString());
                    if (fVar2.mo21091e()) {
                        m23366d(fVar2);
                        break;
                    } else {
                        m23364c(fVar2);
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
                if (m23365c(response)) {
                    C11447f b = C11447f.m23385b(response);
                    if (b != null) {
                        StringBuilder sb2 = new StringBuilder("On Get Notify By WS: ");
                        sb2.append(response.cmd);
                        C11497j.m23542a(sb2.toString(), response);
                        m23369g(b);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder("On Get Response By NetType (");
                        if (message.arg1 == 2) {
                            str = "HTTP";
                        } else {
                            str = "WS";
                        }
                        sb3.append(str);
                        sb3.append("): cmd:");
                        sb3.append(response.cmd);
                        sb3.append("sequence_id=");
                        sb3.append(response.sequence_id);
                        sb3.append(",path=");
                        sb3.append(C11451i.m23423a(response.cmd.intValue()));
                        C11497j.m23542a(sb3.toString(), response);
                        if (fVar == null) {
                            fVar = m23362b(response);
                            if (fVar != null) {
                                StringBuilder sb4 = new StringBuilder("find local waiting request item sequence_id: ");
                                sb4.append(fVar.f30727b);
                                C11467e.m23462a(sb4.toString());
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("duration", SystemClock.uptimeMillis() - fVar.f30736k);
                                    jSONObject.put("retry", fVar.f30737l - 1);
                                } catch (JSONException unused) {
                                }
                                C11176d.m22637a("im_ws_duration", jSONObject, (JSONObject) null);
                                C11175c.m22624a().mo20526a("network").mo20528b("ws").mo20527a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.f30736k)).mo20527a("cmd", Integer.valueOf(fVar.mo21090d())).mo20527a("retry", Integer.valueOf(fVar.f30737l - 1)).mo20527a("success", Integer.valueOf(1)).mo20530b();
                            }
                        }
                        if (fVar != null) {
                            fVar.mo21086a(response);
                            m23368f(fVar);
                        }
                    }
                }
                return;
            case 103:
                C11447f fVar4 = (C11447f) message.obj;
                if (!this.f30720d.isEmpty() && this.f30720d.contains(fVar4)) {
                    mo21076a(fVar4);
                    return;
                }
            case 104:
                m23363b();
                return;
            case 105:
                long longValue = ((Long) message.obj).longValue();
                if (!this.f30721e.isEmpty() && this.f30721e.containsKey(Long.valueOf(longValue))) {
                    mo21076a((C11447f) this.f30721e.get(Long.valueOf(longValue)));
                    this.f30721e.remove(Long.valueOf(longValue));
                    break;
                } else {
                    return;
                }
        }
    }
}
