package com.p683ss.android.websocket.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.websocket.internal.proto.Frame;
import com.p683ss.android.websocket.internal.proto.Frame.Builder;
import com.p683ss.android.websocket.internal.proto.Frame.ExtendedEntry;
import com.p683ss.android.websocket.p2537a.C50794a;
import com.p683ss.android.websocket.p2537a.C50807b;
import com.p683ss.android.websocket.p2537a.C50810c;
import com.p683ss.android.websocket.p2539b.C50811a;
import com.p683ss.android.websocket.p2539b.C50811a.C50812a;
import com.p683ss.android.websocket.p2539b.C50819b;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2540a.C50813a;
import com.p683ss.android.websocket.p2539b.p2540a.C50814b;
import com.p683ss.android.websocket.p2539b.p2540a.C50815c;
import com.p683ss.android.websocket.p2539b.p2540a.C50816d;
import com.p683ss.android.websocket.p2539b.p2540a.C50817e;
import com.p683ss.android.websocket.p2539b.p2540a.C50818f;
import com.p683ss.android.websocket.p2539b.p2541b.C50821a;
import com.p683ss.android.websocket.p2539b.p2541b.C50822b;
import com.p683ss.android.websocket.p2539b.p2541b.C50824d;
import com.p683ss.android.websocket.p2539b.p2541b.C50825e;
import com.p683ss.android.websocket.p2539b.p2541b.C50826f;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;
import com.p683ss.android.websocket.p2539b.p2543d.C50832c;
import com.p683ss.android.websocket.p2539b.p2543d.C50835f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53671s;
import okhttp3.C53682y.C53684a;
import okio.Buffer;
import okio.ByteString;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.websocket.internal.WebSocketService */
public class WebSocketService extends Service {

    /* renamed from: a */
    public final Map<String, C50819b> f127716a = new HashMap();

    /* renamed from: b */
    public final Map<String, C50794a> f127717b = new HashMap();

    /* renamed from: c */
    public final Set<String> f127718c = new HashSet();

    /* renamed from: d */
    public final Map<String, Long> f127719d = new HashMap();

    /* renamed from: e */
    public Handler f127720e;

    /* renamed from: f */
    public Handler f127721f;

    /* renamed from: g */
    public Looper f127722g;

    /* renamed from: h */
    public C50811a f127723h;

    /* renamed from: com.ss.android.websocket.internal.WebSocketService$a */
    class C50852a extends Handler {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    WebSocketService webSocketService = WebSocketService.this;
                    C50814b bVar = (C50814b) message.obj;
                    String str = bVar.f127673a;
                    C50829b bVar2 = bVar.f127674b;
                    C50815c cVar = bVar.f127675c;
                    if (webSocketService.f127718c.contains(str) && (webSocketService.f127716a.get(str) == null || ((C50819b) webSocketService.f127716a.get(str)).f127687a == C50820a.CONNECTED)) {
                        C50794a aVar = (C50794a) webSocketService.f127717b.get(str);
                        if (aVar != null) {
                            try {
                                aVar.mo99494a(new Buffer().writeUtf8("ping"));
                            } catch (Exception unused) {
                                webSocketService.f127720e.post(new Runnable(str, bVar2, cVar) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f127756a;

                                    /* renamed from: b */
                                    final /* synthetic */ C50829b f127757b;

                                    /* renamed from: c */
                                    final /* synthetic */ C50815c f127758c;

                                    public final void run() {
                                        C53755c.m114319a().mo112960d(new C50824d(this.f127756a, C50825e.INTERNAL_ERROR));
                                        if (WebSocketService.this.mo99528a(this.f127756a, this.f127757b, this.f127758c, C50825e.INTERNAL_ERROR)) {
                                            C50819b bVar = (C50819b) WebSocketService.this.f127716a.get(this.f127756a);
                                            if (bVar != null) {
                                                WebSocketService.this.f127716a.put(this.f127756a, bVar.mo99522a(C50820a.RETRY_WAITING));
                                            }
                                            C53755c.m114319a().mo112960d(new C50827g(this.f127756a, C50820a.RETRY_WAITING));
                                            return;
                                        }
                                        WebSocketService.this.f127716a.remove(this.f127756a);
                                        C53755c.m114319a().mo112960d(new C50827g(this.f127756a, null));
                                        WebSocketService.this.f127717b.remove(this.f127756a);
                                    }

                                    {
                                        this.f127756a = r2;
                                        this.f127757b = r3;
                                        this.f127758c = r4;
                                    }
                                });
                            }
                        }
                        webSocketService.f127718c.remove(str);
                        return;
                    }
                case 1:
                    WebSocketService webSocketService2 = WebSocketService.this;
                    String str2 = ((C50813a) message.obj).f127672a;
                    if (!WebSocketService.m109981a((Context) webSocketService2)) {
                        webSocketService2.f127720e.post(new Runnable(str2) {

                            /* renamed from: a */
                            final /* synthetic */ String f127760a;

                            public final void run() {
                                WebSocketService.this.f127718c.remove(this.f127760a);
                                WebSocketService.this.f127720e.post(new Runnable() {
                                    public final void run() {
                                        C53755c.m114319a().mo112960d(new C50821a(1000, C508487.this.f127760a, "no network"));
                                        WebSocketService.this.f127716a.remove(C508487.this.f127760a);
                                        C53755c.m114319a().mo112960d(new C50827g(C508487.this.f127760a, null));
                                        WebSocketService.this.f127717b.remove(C508487.this.f127760a);
                                        WebSocketService.this.f127719d.remove(C508487.this.f127760a);
                                    }
                                });
                            }

                            {
                                this.f127760a = r2;
                            }
                        });
                        break;
                    } else {
                        C50794a aVar2 = (C50794a) webSocketService2.f127717b.get(str2);
                        if (aVar2 != null) {
                            try {
                                aVar2.mo99492a(1000, "Bye!");
                                break;
                            } catch (Exception e) {
                                webSocketService2.f127720e.post(new Runnable(str2, e) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f127763a;

                                    /* renamed from: b */
                                    final /* synthetic */ Exception f127764b;

                                    public final void run() {
                                        WebSocketService.this.f127718c.remove(this.f127763a);
                                        WebSocketService.this.f127720e.post(new Runnable() {
                                            public final void run() {
                                                C53755c.m114319a().mo112960d(new C50821a(1000, C508508.this.f127763a, C508508.this.f127764b.getMessage()));
                                                WebSocketService.this.f127716a.remove(C508508.this.f127763a);
                                                C53755c.m114319a().mo112960d(new C50827g(C508508.this.f127763a, null));
                                                WebSocketService.this.f127717b.remove(C508508.this.f127763a);
                                                WebSocketService.this.f127719d.remove(C508508.this.f127763a);
                                            }
                                        });
                                    }

                                    {
                                        this.f127763a = r2;
                                        this.f127764b = r3;
                                    }
                                });
                            }
                        }
                        return;
                    }
                case 2:
                    WebSocketService.this.f127722g.quit();
                    break;
                case 3:
                    WebSocketService webSocketService3 = WebSocketService.this;
                    C50817e eVar = (C50817e) message.obj;
                    String str3 = eVar.f127678a;
                    if (webSocketService3.f127716a.get(str3) == null || ((C50819b) webSocketService3.f127716a.get(str3)).f127687a != C50820a.CONNECTED) {
                        C53755c.m114319a().mo112960d(new C50826f(str3, eVar, 0));
                        break;
                    } else {
                        C50794a aVar3 = (C50794a) webSocketService3.f127717b.get(str3);
                        if (aVar3 != null) {
                            try {
                                byte[] bArr = eVar.f127679b;
                                Map a = eVar.mo99521a();
                                ArrayList arrayList = new ArrayList();
                                for (String str4 : a.keySet()) {
                                    arrayList.add(new ExtendedEntry(str4, (String) a.get(str4)));
                                }
                                aVar3.mo99493a(C53500ac.create(C50794a.f127607b, Frame.ADAPTER.encode(new Builder().service(Integer.valueOf(eVar.f127682e)).seqid(Long.valueOf(eVar.f127680c)).logid(Long.valueOf(eVar.f127681d)).method(Integer.valueOf(eVar.f127683f)).payload(ByteString.m114277of(bArr)).headers(arrayList).payload_type(eVar.f127684g).payload_encoding(eVar.f127685h).build())));
                                break;
                            } catch (Exception unused2) {
                                webSocketService3.f127720e.post(new Runnable(eVar, str3) {

                                    /* renamed from: a */
                                    final /* synthetic */ C50817e f127746a;

                                    /* renamed from: b */
                                    final /* synthetic */ String f127747b;

                                    public final void run() {
                                        boolean z;
                                        WebSocketService webSocketService = WebSocketService.this;
                                        C50817e eVar = this.f127746a;
                                        long a = webSocketService.f127723h.f127665a.f127670c.mo99524a(C50825e.INTERNAL_ERROR);
                                        if (a != -1) {
                                            webSocketService.f127720e.sendMessageDelayed(webSocketService.f127720e.obtainMessage(3, eVar), a);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            C53755c.m114319a().mo112960d(new C50826f(this.f127747b, this.f127746a, 1));
                                        }
                                    }

                                    {
                                        this.f127746a = r2;
                                        this.f127747b = r3;
                                    }
                                });
                                break;
                            }
                        } else {
                            webSocketService3.f127720e.post(new Runnable(str3, eVar) {

                                /* renamed from: a */
                                final /* synthetic */ String f127749a;

                                /* renamed from: b */
                                final /* synthetic */ C50817e f127750b;

                                public final void run() {
                                    C53755c.m114319a().mo112960d(new C50826f(this.f127749a, this.f127750b, 2));
                                }

                                {
                                    this.f127749a = r2;
                                    this.f127750b = r3;
                                }
                            });
                            return;
                        }
                    }
                    break;
            }
        }

        public C50852a(Looper looper) {
            super(looper);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        if (C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112959c((Object) this);
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f127720e = new Handler(getMainLooper());
        HandlerThread handlerThread = new HandlerThread("web_socket_service");
        handlerThread.start();
        this.f127722g = handlerThread.getLooper();
        this.f127721f = new C50852a(this.f127722g);
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        this.f127723h = C50811a.m109960a(this);
    }

    /* renamed from: a */
    static boolean m109981a(Context context) {
        try {
            NetworkInfo a = C50854b.m109990a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m109982b(C53504ad adVar) {
        if (adVar != null) {
            try {
                if (adVar.f132404g != null) {
                    return adVar.f132404g.string();
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }

    @C53771m
    public void onEvent(C50814b bVar) {
        if (!m109981a((Context) this)) {
            C53755c.m114319a().mo112960d(new C50824d(bVar.f127673a, C50825e.INTERNAL_ERROR));
            return;
        }
        String str = bVar.f127673a;
        C50819b bVar2 = (C50819b) this.f127716a.get(str);
        if (bVar2 == null || bVar2.f127687a == C50820a.CLOSED) {
            mo99527a(str, bVar.f127674b, bVar.f127675c);
        }
    }

    /* renamed from: a */
    public static long m109980a(C53504ad adVar) {
        String str;
        StringBuilder sb = new StringBuilder("open websocket headers: ");
        if (adVar == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = adVar.f132403f.toString();
        }
        sb.append(str);
        if (adVar == null || adVar.f132403f == null) {
            return -1;
        }
        String a = adVar.f132403f.mo111593a("Handshake-Options");
        if (C9431p.m18664a(a)) {
            return -1;
        }
        String str2 = "";
        String trim = a.trim();
        String[] split = trim.split(";");
        if (split.length == 0) {
            str2 = trim.replace("ping-interval=", "");
        } else {
            int length = split.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str3 = split[i];
                    if (str3.contains("ping-interval=")) {
                        str2 = str3.replace("ping-interval=", "");
                        break;
                    }
                    i++;
                }
            }
        }
        try {
            return 1000 * Long.valueOf(str2).longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @C53771m
    public void onEvent(C50813a aVar) {
        String str = aVar.f127672a;
        C50819b bVar = (C50819b) this.f127716a.get(str);
        if (bVar != null) {
            if (bVar.f127687a == C50820a.CONNECTED) {
                this.f127721f.obtainMessage(1, aVar).sendToTarget();
                this.f127716a.put(str, bVar.mo99522a(C50820a.CLOSING));
                C53755c.m114319a().mo112960d(new C50827g(str, C50820a.CLOSING));
                return;
            }
            if (bVar.f127687a == C50820a.RETRY_WAITING) {
                this.f127716a.remove(str);
                C53755c.m114319a().mo112960d(new C50827g(str, null));
            }
        }
    }

    @C53771m
    public void onEvent(C50816d dVar) {
        if (!m109981a((Context) this)) {
            C53755c.m114319a().mo112960d(new C50826f(dVar.f127676a, dVar.f127677b, 3));
            return;
        }
        String str = dVar.f127676a;
        if (!TextUtils.isEmpty(str) && dVar.f127677b != null) {
            C50819b bVar = (C50819b) this.f127716a.get(str);
            if (bVar == null || bVar.f127687a != C50820a.CONNECTED) {
                C53755c.m114319a().mo112960d(new C50826f(str, dVar.f127677b, 0));
            } else {
                this.f127721f.obtainMessage(3, dVar.f127677b).sendToTarget();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f127720e.postDelayed(new Runnable() {
            public final void run() {
                C53755c.m114319a().mo112960d(new C50818f());
            }
        }, 300);
        return super.onStartCommand(intent, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo99527a(final String str, final C50829b bVar, final C50815c cVar) {
        this.f127716a.put(str, new C50819b(C50820a.OPENING, 0));
        C53755c.m114319a().mo112960d(new C50827g(str, C50820a.OPENING));
        this.f127717b.remove(str);
        this.f127719d.remove(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(cVar.mo77619a());
        C50807b.m109950a(new C53684a().mo111654a(60, TimeUnit.SECONDS).mo111668b(60, TimeUnit.SECONDS).mo111667a(), new C53499a().mo111271b("Sec-Websocket-Protocol", "pbbp2").mo111262a(sb.toString()).mo111272c()).mo99511a((C50810c) new C50810c() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo99515a(okhttp3.C53506ae r10) throws java.io.IOException {
                /*
                    r9 = this;
                    byte[] r10 = r10.bytes()
                    java.lang.String r0 = java.lang.String.valueOf(r10)
                    boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
                    if (r0 == 0) goto L_0x000f
                    return
                L_0x000f:
                    com.squareup.wire.ProtoAdapter<com.ss.android.websocket.internal.proto.Frame> r0 = com.p683ss.android.websocket.internal.proto.Frame.ADAPTER
                    java.lang.Object r10 = r0.decode(r10)
                    com.ss.android.websocket.internal.proto.Frame r10 = (com.p683ss.android.websocket.internal.proto.Frame) r10
                    com.ss.android.websocket.internal.WebSocketService r0 = com.p683ss.android.websocket.internal.WebSocketService.this
                    java.lang.String r1 = r6
                    r2 = 1
                    r3 = 0
                    if (r10 != 0) goto L_0x0021
                L_0x001f:
                    r2 = 0
                    goto L_0x0051
                L_0x0021:
                    long r4 = r10.getSeqId()
                    java.util.Map<java.lang.String, java.lang.Long> r6 = r0.f127719d
                    java.lang.Object r6 = r6.get(r1)
                    if (r6 != 0) goto L_0x0037
                    java.util.Map<java.lang.String, java.lang.Long> r0 = r0.f127719d
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r0.put(r1, r3)
                    goto L_0x0051
                L_0x0037:
                    java.util.Map<java.lang.String, java.lang.Long> r6 = r0.f127719d
                    java.lang.Object r6 = r6.get(r1)
                    java.lang.Long r6 = (java.lang.Long) r6
                    long r6 = r6.longValue()
                    int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r8 > 0) goto L_0x0048
                    goto L_0x001f
                L_0x0048:
                    java.util.Map<java.lang.String, java.lang.Long> r0 = r0.f127719d
                    java.lang.Long r3 = java.lang.Long.valueOf(r6)
                    r0.put(r1, r3)
                L_0x0051:
                    if (r2 != 0) goto L_0x0054
                    return
                L_0x0054:
                    byte[] r0 = r10.getPayload()
                    com.ss.android.websocket.b.c.b r1 = r7
                    if (r1 == 0) goto L_0x0063
                    com.ss.android.websocket.b.c.b r1 = r7
                    java.lang.Object r1 = r1.mo72405a(r10)
                    goto L_0x0064
                L_0x0063:
                    r1 = 0
                L_0x0064:
                    com.ss.android.websocket.internal.WebSocketService r2 = com.p683ss.android.websocket.internal.WebSocketService.this
                    android.os.Handler r2 = r2.f127720e
                    com.ss.android.websocket.internal.WebSocketService$2$4 r3 = new com.ss.android.websocket.internal.WebSocketService$2$4
                    r3.<init>(r0, r1, r10)
                    r2.post(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.websocket.internal.WebSocketService.C508372.mo99515a(okhttp3.ae):void");
            }

            /* renamed from: a */
            public final void mo99516a(Buffer buffer) {
                String str;
                C50835f fVar;
                long j;
                StringBuilder sb = new StringBuilder("websocket pong: ");
                if (buffer == null) {
                    str = "";
                } else {
                    str = buffer.readUtf8();
                }
                sb.append(str);
                WebSocketService.this.f127718c.remove(str);
                C50812a aVar = WebSocketService.this.f127723h.f127665a;
                if (aVar.f127669b == null) {
                    fVar = new C50832c();
                } else {
                    fVar = aVar.f127669b;
                }
                C50819b bVar = (C50819b) WebSocketService.this.f127716a.get(str);
                if (bVar != null) {
                    j = fVar.mo99526a(bVar.f127688b);
                } else {
                    j = 0;
                }
                if (j > 0) {
                    WebSocketService.this.f127721f.postDelayed(new Runnable() {
                        public final void run() {
                            if (WebSocketService.this.f127717b.get(str) != null) {
                                WebSocketService.this.f127721f.obtainMessage(0, new C50814b(str, bVar, cVar)).sendToTarget();
                            }
                        }
                    }, j);
                    WebSocketService.this.f127718c.add(str);
                }
            }

            /* renamed from: a */
            public final void mo99512a(final int i, final String str) {
                WebSocketService.this.f127718c.remove(str);
                WebSocketService.this.f127720e.post(new Runnable() {
                    public final void run() {
                        C53755c.m114319a().mo112960d(new C50821a(i, str, str));
                        WebSocketService.this.f127716a.remove(str);
                        C53755c.m114319a().mo112960d(new C50827g(str, null));
                        WebSocketService.this.f127717b.remove(str);
                    }
                });
            }

            /* renamed from: a */
            public final void mo99513a(C50794a aVar, C53504ad adVar) {
                WebSocketService.this.f127718c.add(str);
                final String b = WebSocketService.m109982b(adVar);
                final long a = WebSocketService.m109980a(adVar);
                Handler handler = WebSocketService.this.f127720e;
                final C50794a aVar2 = aVar;
                C508381 r2 = new Runnable() {
                    public final void run() {
                        C50811a.m109960a(WebSocketService.this).mo99518b().mo99525a();
                        C53755c.m114319a().mo112960d(new C50822b(str, b));
                        WebSocketService.this.f127717b.put(str, aVar2);
                        WebSocketService.this.f127716a.put(str, new C50819b(C50820a.CONNECTED, a));
                        C53755c.m114319a().mo112960d(new C50827g(str, C50820a.CONNECTED));
                        WebSocketService.this.f127721f.obtainMessage(0, new C50814b(str, bVar, cVar)).sendToTarget();
                    }
                };
                handler.post(r2);
            }

            /* renamed from: a */
            public final void mo99514a(final IOException iOException, C53504ad adVar) {
                final C50825e eVar;
                if (!(adVar == null || adVar.f132403f == null)) {
                    C53671s sVar = adVar.f132403f;
                    String a = sVar.mo111593a("Handshake-Msg");
                    String a2 = sVar.mo111593a("Handshake-Status");
                    C9431p.m18664a(a);
                    C9431p.m18664a(a2);
                }
                WebSocketService.this.f127718c.remove(str);
                final C50819b bVar = (C50819b) WebSocketService.this.f127716a.get(str);
                if (bVar == null || bVar.f127687a != C50820a.CLOSING) {
                    if (adVar == null || adVar.f132403f == null) {
                        eVar = C50825e.INTERNAL_ERROR;
                    } else {
                        C53671s sVar2 = adVar.f132403f;
                        String a3 = adVar.f132403f.mo111593a("Handshake-Msg");
                        if (C9431p.m18664a(a3)) {
                            eVar = C50825e.INTERNAL_ERROR;
                        } else {
                            try {
                                eVar = C50825e.valueOf(a3);
                            } catch (Exception unused) {
                                eVar = C50825e.INTERNAL_ERROR;
                            }
                        }
                    }
                    WebSocketService.this.f127720e.post(new Runnable() {
                        public final void run() {
                            C53755c.m114319a().mo112960d(new C50824d(str, eVar));
                            if (WebSocketService.this.mo99528a(str, bVar, cVar, eVar)) {
                                if (bVar != null) {
                                    WebSocketService.this.f127716a.put(str, bVar.mo99522a(C50820a.RETRY_WAITING));
                                } else {
                                    WebSocketService.this.f127716a.put(str, new C50819b(C50820a.RETRY_WAITING, 0));
                                }
                                C53755c.m114319a().mo112960d(new C50827g(str, C50820a.RETRY_WAITING));
                                return;
                            }
                            WebSocketService.this.f127716a.remove(str);
                            C53755c.m114319a().mo112960d(new C50827g(str, null));
                            WebSocketService.this.f127717b.remove(str);
                        }
                    });
                    return;
                }
                WebSocketService.this.f127720e.post(new Runnable() {
                    public final void run() {
                        C53755c.m114319a().mo112960d(new C50821a(-1, str, iOException.toString()));
                        WebSocketService.this.f127716a.remove(str);
                        C53755c.m114319a().mo112960d(new C50827g(str, null));
                        WebSocketService.this.f127717b.remove(str);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final boolean mo99528a(final String str, final C50829b bVar, final C50815c cVar, C50825e eVar) {
        long a = this.f127723h.mo99518b().mo99524a(eVar);
        if (a == -1) {
            return false;
        }
        this.f127720e.postDelayed(new Runnable() {
            public final void run() {
                WebSocketService webSocketService = WebSocketService.this;
                String str = str;
                C50829b bVar = bVar;
                C50815c cVar = cVar;
                C50819b bVar2 = (C50819b) webSocketService.f127716a.get(str);
                if (bVar2 != null && bVar2.f127687a == C50820a.RETRY_WAITING) {
                    webSocketService.mo99527a(str, bVar, cVar);
                }
            }
        }, a);
        return true;
    }
}
