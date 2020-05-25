package com.facebook.net;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9899e;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.frameworks.baselib.network.p566a.C9809b;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12757k;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p885c.C13297b;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13333g;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14123ai.C14124a;
import com.facebook.imagepipeline.p974n.C14140an;
import com.facebook.imagepipeline.p974n.C14155aw.C14159a;
import com.facebook.imagepipeline.p974n.C14176c;
import com.facebook.imagepipeline.p974n.C14178e;
import com.facebook.imagepipeline.p974n.C14188k;
import com.facebook.imagepipeline.p974n.C14207t;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.facebook.net.c */
public final class C14543c extends C14176c<C14550c> {

    /* renamed from: b */
    public static C14551d f37778b;

    /* renamed from: c */
    public static C14549b f37779c;

    /* renamed from: a */
    public Executor f37780a;

    /* renamed from: com.facebook.net.c$a */
    public interface C14548a {
        /* renamed from: a */
        Pair<InputStream, Long> mo26787a(InputStream inputStream, String str, long j) throws Exception;

        /* renamed from: a */
        String mo26788a(String str);
    }

    /* renamed from: com.facebook.net.c$b */
    public interface C14549b {
        /* renamed from: a */
        C14548a mo26789a();
    }

    /* renamed from: com.facebook.net.c$c */
    public static class C14550c extends C14207t {

        /* renamed from: a */
        public long f37797a;

        /* renamed from: b */
        public long f37798b;

        /* renamed from: c */
        public long f37799c;

        /* renamed from: i */
        public long f37800i;

        /* renamed from: j */
        public boolean f37801j;

        /* renamed from: k */
        public Runnable f37802k;

        public C14550c(C14188k<C14044e> kVar, C14140an anVar) {
            super(kVar, anVar);
            if (kVar instanceof C14159a) {
                C14159a aVar = (C14159a) kVar;
                if (aVar.f36966a != null) {
                    this.f37800i = (long) aVar.f36966a.mo26272i();
                }
            }
        }
    }

    /* renamed from: a */
    private static String m29788a(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            String[] split = th.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static int m29787a(C14550c cVar) {
        if (cVar == null || cVar.f37087e == null || cVar.f37087e.mo26388d() == null) {
            return -1;
        }
        Object d = cVar.f37087e.mo26388d();
        if (d instanceof C14559i) {
            Uri c = cVar.mo26420c();
            if (c != null) {
                return ((C14559i) d).mo26795a(c.toString());
            }
        }
        return -1;
    }

    public final /* synthetic */ C14207t createFetchState(C14188k kVar, C14140an anVar) {
        return new C14550c(kVar, anVar);
    }

    public final /* synthetic */ void onFetchCompletion(C14207t tVar, int i) {
        ((C14550c) tVar).f37802k.run();
    }

    public final /* synthetic */ Map getExtraMap(C14207t tVar, int i) {
        String str;
        C14550c cVar = (C14550c) tVar;
        HashMap hashMap = new HashMap(1);
        hashMap.put("image_size", Integer.toString(i));
        String str2 = "hit_cdn_cache";
        if (cVar.f37801j) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        return hashMap;
    }

    public final /* synthetic */ void fetch(C14207t tVar, C14124a aVar) {
        final C14548a aVar2;
        INetworkApi iNetworkApi;
        final boolean z;
        final C14550c cVar = (C14550c) tVar;
        if (cVar != null) {
            cVar.f37797a = System.currentTimeMillis();
            Uri c = cVar.mo26420c();
            if (c != null) {
                LinkedList linkedList = null;
                if (f37779c != null) {
                    aVar2 = f37779c.mo26789a();
                } else {
                    aVar2 = null;
                }
                String uri = c.toString();
                if (aVar2 != null) {
                    uri = aVar2.mo26788a(uri);
                }
                if (!C9431p.m18664a(uri)) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Pair a = C9917l.m19876a(uri, (Map<String, String>) linkedHashMap);
                        String str = (String) a.first;
                        String str2 = (String) a.second;
                        if (C14557h.m29810a().mo26794b()) {
                            iNetworkApi = (INetworkApi) C14557h.m29810a().mo26793a(str, INetworkApi.class);
                        } else {
                            iNetworkApi = (INetworkApi) C13333g.m26861a(str, INetworkApi.class);
                        }
                        INetworkApi iNetworkApi2 = iNetworkApi;
                        C14542b bVar = new C14542b(cVar.mo26421d());
                        if (cVar.f37800i > 0) {
                            linkedList = new LinkedList();
                            StringBuilder sb = new StringBuilder("bytes=");
                            sb.append(cVar.f37800i);
                            sb.append("-");
                            linkedList.add(new C12685b("Range", sb.toString()));
                        }
                        LinkedList linkedList2 = linkedList;
                        if (iNetworkApi2 != null) {
                            final C12690b downloadFile = iNetworkApi2.downloadFile(false, -1, str2, linkedHashMap, linkedList2, bVar);
                            cVar.f37087e.mo26385a(new C14178e() {
                                /* renamed from: a */
                                public final void mo23173a() {
                                    if (Looper.myLooper() != Looper.getMainLooper()) {
                                        downloadFile.cancel();
                                    } else {
                                        C14543c.this.f37780a.execute(new Runnable() {
                                            public final void run() {
                                                downloadFile.cancel();
                                            }
                                        });
                                    }
                                }
                            });
                            C9899e c2 = C9894e.m19829c();
                            if (c2 == null || !c2.mo17826b(uri)) {
                                z = false;
                            } else {
                                C9809b.m19637a().mo17654c();
                                z = true;
                            }
                            final C14542b bVar2 = bVar;
                            final C14124a aVar3 = aVar;
                            final C12690b bVar3 = downloadFile;
                            C145462 r0 = new C12757k<TypedInput>() {

                                /* renamed from: a */
                                C13297b f37784a;

                                /* renamed from: b */
                                long f37785b = -1;

                                /* renamed from: a */
                                public final void mo19942a(C12690b<TypedInput> bVar, C12799u<TypedInput> uVar) {
                                }

                                /* renamed from: a */
                                public final void mo19943a(C12690b<TypedInput> bVar, Throwable th) {
                                    Exception exc;
                                    this.f37785b = System.currentTimeMillis();
                                    if (z) {
                                        C9809b.m19637a().mo17655d();
                                    }
                                    if (th instanceof Exception) {
                                        exc = (Exception) th;
                                    } else {
                                        exc = new Exception(th.getMessage(), th.getCause());
                                    }
                                    m29793a((C12799u) null, exc);
                                }

                                /* JADX WARNING: Can't wrap try/catch for region: R(11:20|21|(2:25|(1:27))|28|(1:33)|34|(1:36)(1:37)|38|(4:40|(1:42)|43|(2:45|46))|47|48) */
                                /* JADX WARNING: Failed to process nested try/catch */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c2 */
                                /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00cd */
                                /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1 A[Catch:{ Throwable -> 0x00e9 }] */
                                /* renamed from: a */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                private void m29793a(com.bytedance.retrofit2.C12799u r8, java.lang.Exception r9) {
                                    /*
                                        r7 = this;
                                        if (r9 != 0) goto L_0x0003
                                        return
                                    L_0x0003:
                                        r0 = -1
                                        boolean r1 = r9 instanceof com.facebook.net.C14557h.C14558a
                                        if (r1 == 0) goto L_0x0011
                                        com.facebook.net.h$a r9 = (com.facebook.net.C14557h.C14558a) r9
                                        java.lang.Exception r0 = r9.f37831e
                                        int r9 = r9.retryCount
                                        r6 = r9
                                        r9 = r0
                                        goto L_0x0012
                                    L_0x0011:
                                        r6 = -1
                                    L_0x0012:
                                        r0 = 1
                                        boolean r1 = r9 instanceof com.bytedance.frameworks.baselib.network.http.p568a.C9836c
                                        r2 = 0
                                        if (r1 == 0) goto L_0x0026
                                        r1 = r9
                                        com.bytedance.frameworks.baselib.network.http.a.c r1 = (com.bytedance.frameworks.baselib.network.http.p568a.C9836c) r1
                                        if (r1 == 0) goto L_0x0026
                                        int r1 = r1.getStatusCode()
                                        r3 = 304(0x130, float:4.26E-43)
                                        if (r1 != r3) goto L_0x0026
                                        r0 = 0
                                    L_0x0026:
                                        boolean r1 = r9 instanceof com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a
                                        if (r1 == 0) goto L_0x004d
                                        r1 = r9
                                        com.bytedance.frameworks.baselib.network.http.cronet.a.a r1 = (com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a) r1
                                        com.bytedance.frameworks.baselib.network.http.a r3 = r1.getRequestInfo()
                                        boolean r4 = r3 instanceof com.bytedance.ttnet.p885c.C13297b
                                        if (r4 == 0) goto L_0x003a
                                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p885c.C13297b) r3
                                        r7.f37784a = r3
                                        goto L_0x004d
                                    L_0x003a:
                                        com.bytedance.ttnet.c.b r3 = new com.bytedance.ttnet.c.b
                                        r3.<init>()
                                        r7.f37784a = r3
                                        com.bytedance.ttnet.c.b r3 = r7.f37784a
                                        r3.f26772v = r2
                                        com.bytedance.ttnet.c.b r2 = r7.f37784a
                                        java.lang.String r1 = r1.getRequestLog()
                                        r2.f26774x = r1
                                    L_0x004d:
                                        if (r0 == 0) goto L_0x00cd
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 != 0) goto L_0x0069
                                        com.bytedance.retrofit2.b r0 = r7     // Catch:{ Throwable -> 0x00cd }
                                        boolean r0 = r0 instanceof com.bytedance.retrofit2.C12759m     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 == 0) goto L_0x0069
                                        com.bytedance.retrofit2.b r0 = r7     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.retrofit2.m r0 = (com.bytedance.retrofit2.C12759m) r0     // Catch:{ Throwable -> 0x00cd }
                                        java.lang.Object r0 = r0.getRequestInfo()     // Catch:{ Throwable -> 0x00cd }
                                        boolean r1 = r0 instanceof com.bytedance.ttnet.p885c.C13297b     // Catch:{ Throwable -> 0x00cd }
                                        if (r1 == 0) goto L_0x0069
                                        com.bytedance.ttnet.c.b r0 = (com.bytedance.ttnet.p885c.C13297b) r0     // Catch:{ Throwable -> 0x00cd }
                                        r7.f37784a = r0     // Catch:{ Throwable -> 0x00cd }
                                    L_0x0069:
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 != 0) goto L_0x0084
                                        com.bytedance.retrofit2.b r0 = r7     // Catch:{ Throwable -> 0x00cd }
                                        boolean r0 = r0 instanceof com.bytedance.retrofit2.C12758l     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 == 0) goto L_0x0084
                                        if (r8 == 0) goto L_0x0084
                                        com.bytedance.retrofit2.b r0 = r7     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.retrofit2.l r0 = (com.bytedance.retrofit2.C12758l) r0     // Catch:{ Throwable -> 0x00cd }
                                        r0.doCollect()     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.retrofit2.a.d r0 = r8.f33551a     // Catch:{ Throwable -> 0x00cd }
                                        java.lang.Object r0 = r0.f33351f     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.ttnet.c.b r0 = (com.bytedance.ttnet.p885c.C13297b) r0     // Catch:{ Throwable -> 0x00cd }
                                        r7.f37784a = r0     // Catch:{ Throwable -> 0x00cd }
                                    L_0x0084:
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        if (r8 == 0) goto L_0x008d
                                        java.util.List r1 = r8.mo23959b()     // Catch:{ Throwable -> 0x00cd }
                                        goto L_0x008e
                                    L_0x008d:
                                        r1 = 0
                                    L_0x008e:
                                        com.bytedance.ttnet.c.e r2 = r4     // Catch:{ Throwable -> 0x00cd }
                                        com.facebook.net.C14543c.m29789a(r0, r1, r2, r9)     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 == 0) goto L_0x00c2
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00cd }
                                        r0.f26758h = r1     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        long r0 = r0.f26757g     // Catch:{ Throwable -> 0x00cd }
                                        r2 = 0
                                        int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                                        if (r4 > 0) goto L_0x00af
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        long r1 = r7.f37785b     // Catch:{ Throwable -> 0x00cd }
                                        r0.f26757g = r1     // Catch:{ Throwable -> 0x00cd }
                                    L_0x00af:
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        org.json.JSONObject r0 = r0.f26775y     // Catch:{ Throwable -> 0x00cd }
                                        if (r0 == 0) goto L_0x00c2
                                        com.bytedance.ttnet.c.b r0 = r7.f37784a     // Catch:{ Throwable -> 0x00c2 }
                                        org.json.JSONObject r0 = r0.f26775y     // Catch:{ Throwable -> 0x00c2 }
                                        java.lang.String r1 = "ex"
                                        java.lang.String r2 = r9.getMessage()     // Catch:{ Throwable -> 0x00c2 }
                                        r0.put(r1, r2)     // Catch:{ Throwable -> 0x00c2 }
                                    L_0x00c2:
                                        com.facebook.net.c r1 = com.facebook.net.C14543c.this     // Catch:{ Throwable -> 0x00cd }
                                        com.facebook.net.c$c r3 = r3     // Catch:{ Throwable -> 0x00cd }
                                        com.bytedance.ttnet.c.b r5 = r7.f37784a     // Catch:{ Throwable -> 0x00cd }
                                        r2 = r8
                                        r4 = r9
                                        r1.mo26783a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x00cd }
                                    L_0x00cd:
                                        com.facebook.imagepipeline.n.ai$a r8 = r5     // Catch:{ Throwable -> 0x00e9 }
                                        if (r8 == 0) goto L_0x00e8
                                        com.bytedance.retrofit2.b r8 = r7     // Catch:{ Throwable -> 0x00e9 }
                                        if (r8 == 0) goto L_0x00e3
                                        com.bytedance.retrofit2.b r8 = r7     // Catch:{ Throwable -> 0x00e9 }
                                        boolean r8 = r8.isCanceled()     // Catch:{ Throwable -> 0x00e9 }
                                        if (r8 == 0) goto L_0x00e3
                                        com.facebook.imagepipeline.n.ai$a r8 = r5     // Catch:{ Throwable -> 0x00e9 }
                                        r8.mo26371a()     // Catch:{ Throwable -> 0x00e9 }
                                        goto L_0x00e9
                                    L_0x00e3:
                                        com.facebook.imagepipeline.n.ai$a r8 = r5     // Catch:{ Throwable -> 0x00e9 }
                                        r8.mo26373a(r9)     // Catch:{ Throwable -> 0x00e9 }
                                    L_0x00e8:
                                        return
                                    L_0x00e9:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14543c.C145462.m29793a(com.bytedance.retrofit2.u, java.lang.Exception):void");
                                }

                                /* JADX WARNING: Removed duplicated region for block: B:73:0x00ff  */
                                /* JADX WARNING: Removed duplicated region for block: B:81:0x010f  */
                                /* renamed from: b */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void mo23905b(com.bytedance.retrofit2.C12690b<com.bytedance.retrofit2.mime.TypedInput> r12, com.bytedance.retrofit2.C12799u<com.bytedance.retrofit2.mime.TypedInput> r13) {
                                    /*
                                        r11 = this;
                                        r0 = 0
                                        long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f7 }
                                        r11.f37785b = r1     // Catch:{ Exception -> 0x00f7 }
                                        if (r13 != 0) goto L_0x0019
                                        boolean r12 = r6
                                        if (r12 == 0) goto L_0x0014
                                        com.bytedance.frameworks.baselib.network.a.b r12 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
                                        r12.mo17655d()
                                    L_0x0014:
                                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r0)     // Catch:{ Throwable -> 0x0018 }
                                        return
                                    L_0x0018:
                                        return
                                    L_0x0019:
                                        T r1 = r13.f33552b     // Catch:{ Exception -> 0x00f7 }
                                        com.bytedance.retrofit2.mime.TypedInput r1 = (com.bytedance.retrofit2.mime.TypedInput) r1     // Catch:{ Exception -> 0x00f7 }
                                        boolean r2 = r13.mo23960c()     // Catch:{ Exception -> 0x00f7 }
                                        if (r2 == 0) goto L_0x00dc
                                        com.facebook.net.c$a r2 = r2     // Catch:{ Exception -> 0x00f7 }
                                        if (r2 == 0) goto L_0x0046
                                        com.facebook.net.c$a r2 = r2     // Catch:{ Exception -> 0x00f7 }
                                        java.io.InputStream r3 = r1.mo9554in()     // Catch:{ Exception -> 0x00f7 }
                                        com.bytedance.retrofit2.a.d r4 = r13.f33551a     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.String r4 = r4.f33346a     // Catch:{ Exception -> 0x00f7 }
                                        long r5 = r1.length()     // Catch:{ Exception -> 0x00f7 }
                                        android.util.Pair r1 = r2.mo26787a(r3, r4, r5)     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.Object r2 = r1.first     // Catch:{ Exception -> 0x00f7 }
                                        java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.Object r0 = r1.second     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        long r0 = r0.longValue()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        goto L_0x004e
                                    L_0x0046:
                                        java.io.InputStream r2 = r1.mo9554in()     // Catch:{ Exception -> 0x00f7 }
                                        long r0 = r1.length()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    L_0x004e:
                                        r3 = 0
                                        int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                                        if (r5 < 0) goto L_0x0064
                                        com.facebook.net.c$c r5 = r3     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        long r5 = r5.f37800i     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                                        if (r7 <= 0) goto L_0x0065
                                        int r5 = r13.mo23958a()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r6 = 206(0xce, float:2.89E-43)
                                        if (r5 == r6) goto L_0x0065
                                    L_0x0064:
                                        r0 = r3
                                    L_0x0065:
                                        com.bytedance.retrofit2.a.d r3 = r13.f33551a     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        java.lang.String r4 = "X-Cache"
                                        java.util.List r3 = r3.mo23867b(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r3 == 0) goto L_0x0075
                                        int r4 = r3.size()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r4 > 0) goto L_0x007d
                                    L_0x0075:
                                        com.bytedance.retrofit2.a.d r3 = r13.f33551a     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        java.lang.String r4 = "X-Cache-new"
                                        java.util.List r3 = r3.mo23867b(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    L_0x007d:
                                        boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r4 != 0) goto L_0x00b3
                                        java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    L_0x0087:
                                        boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r4 == 0) goto L_0x00b3
                                        java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        com.bytedance.retrofit2.a.b r4 = (com.bytedance.retrofit2.p830a.C12685b) r4     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r4 == 0) goto L_0x0087
                                        java.lang.String r4 = r4.f33319b     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r6 = 1
                                        if (r5 != 0) goto L_0x00ac
                                        java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        java.lang.String r5 = "hit"
                                        boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        if (r4 == 0) goto L_0x00ac
                                        r4 = 1
                                        goto L_0x00ad
                                    L_0x00ac:
                                        r4 = 0
                                    L_0x00ad:
                                        if (r4 == 0) goto L_0x0087
                                        com.facebook.net.c$c r3 = r3     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r3.f37801j = r6     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                    L_0x00b3:
                                        com.facebook.net.c$c r9 = r3     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        com.facebook.net.c$2$1 r10 = new com.facebook.net.c$2$1     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r3 = r10
                                        r4 = r11
                                        r5 = r0
                                        r7 = r12
                                        r8 = r13
                                        r3.<init>(r5, r7, r8)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r9.f37802k = r10     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        com.facebook.imagepipeline.n.ai$a r12 = r5     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        int r0 = (int) r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        r12.mo26372a(r2, r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d7 }
                                        boolean r12 = r6
                                        if (r12 == 0) goto L_0x00d2
                                        com.bytedance.frameworks.baselib.network.a.b r12 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
                                        r12.mo17655d()
                                    L_0x00d2:
                                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r2)     // Catch:{ Throwable -> 0x00d6 }
                                        return
                                    L_0x00d6:
                                        return
                                    L_0x00d7:
                                        r12 = move-exception
                                        goto L_0x010b
                                    L_0x00d9:
                                        r12 = move-exception
                                        r0 = r2
                                        goto L_0x00f8
                                    L_0x00dc:
                                        java.io.IOException r12 = new java.io.IOException     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.String r2 = "Unexpected HTTP code "
                                        r1.<init>(r2)     // Catch:{ Exception -> 0x00f7 }
                                        int r2 = r13.mo23958a()     // Catch:{ Exception -> 0x00f7 }
                                        r1.append(r2)     // Catch:{ Exception -> 0x00f7 }
                                        java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f7 }
                                        r12.<init>(r1)     // Catch:{ Exception -> 0x00f7 }
                                        throw r12     // Catch:{ Exception -> 0x00f7 }
                                    L_0x00f4:
                                        r12 = move-exception
                                        r2 = r0
                                        goto L_0x010b
                                    L_0x00f7:
                                        r12 = move-exception
                                    L_0x00f8:
                                        r11.m29793a(r13, r12)     // Catch:{ all -> 0x00f4 }
                                        boolean r12 = r6
                                        if (r12 == 0) goto L_0x0106
                                        com.bytedance.frameworks.baselib.network.a.b r12 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
                                        r12.mo17655d()
                                    L_0x0106:
                                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r0)     // Catch:{ Throwable -> 0x010a }
                                        return
                                    L_0x010a:
                                        return
                                    L_0x010b:
                                        boolean r13 = r6
                                        if (r13 == 0) goto L_0x0116
                                        com.bytedance.frameworks.baselib.network.a.b r13 = com.bytedance.frameworks.baselib.network.p566a.C9809b.m19637a()
                                        r13.mo17655d()
                                    L_0x0116:
                                        com.bytedance.frameworks.baselib.network.http.p573d.C9893d.m19804a(r2)     // Catch:{ Throwable -> 0x0119 }
                                    L_0x0119:
                                        throw r12
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14543c.C145462.mo23905b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                                }
                            };
                            downloadFile.enqueue(r0);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26784a(C14550c cVar, boolean z, long j) {
        if (m29787a(cVar) == 1) {
            C14552e.m29802a().mo26792a(cVar.mo26420c().toString(), z, j, true);
            return;
        }
        if (m29787a(cVar) == 0) {
            C14552e.m29802a().mo26792a(cVar.mo26420c().toString(), z, j, false);
        }
    }

    /* renamed from: a */
    public static void m29789a(C9831a aVar, List<C12685b> list, C13302e eVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C9431p.m18664a(aVar.f26751a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C12685b bVar : list) {
                            if ("x-snssdk.remoteaddr".equalsIgnoreCase(bVar.f33318a)) {
                                str = bVar.f33319b;
                            }
                        }
                    }
                    if (C9431p.m18664a(str) && eVar != null) {
                        str = eVar.f26778a;
                    }
                    if (C9431p.m18664a(str)) {
                        str = m29788a((Throwable) exc);
                    }
                    if (!C9431p.m18664a(str) && aVar != null) {
                        aVar.f26751a = str;
                        if (aVar.f26752b != null) {
                            aVar.f26752b.f26778a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo26783a(C12799u uVar, C14550c cVar, Throwable th, C13297b bVar, int i) {
        if (cVar != null) {
            try {
                long j = cVar.f37797a;
                long j2 = cVar.f37799c - cVar.f37797a;
                if (j2 <= 0) {
                    j2 = System.currentTimeMillis() - cVar.f37797a;
                }
                long j3 = j2;
                String str = null;
                if (C9431p.m18664a((String) null)) {
                    if (uVar != null) {
                        str = uVar.f33551a.f33346a;
                    } else {
                        str = cVar.mo26420c().toString();
                    }
                }
                mo26784a(cVar, false, j3);
                C14556g gVar = new C14556g();
                gVar.f37819a = uVar;
                gVar.f37821c = str;
                if (f37778b != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", cVar.mo26418a());
                    jSONObject.put("retryCount", i);
                    f37778b.mo26790a(j3, j, gVar, bVar, th, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
