package com.p683ss.android.websocket.p2537a;

import com.p683ss.android.websocket.p2537a.p2538a.C50795a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53682y;
import okhttp3.C53685z;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53557g;
import okio.ByteString;

/* renamed from: com.ss.android.websocket.a.b */
public final class C50807b {

    /* renamed from: a */
    final C53524e f127657a;

    /* renamed from: b */
    final Random f127658b;

    /* renamed from: c */
    final String f127659c;

    /* renamed from: com.ss.android.websocket.a.b$a */
    static class C50809a extends C50795a {

        /* renamed from: e */
        private final C53557g f127662e;

        /* renamed from: f */
        private final ExecutorService f127663f;

        /* renamed from: a */
        public final void mo99495a() {
            mo99496a(null);
        }

        /* renamed from: a */
        public final void mo99496a(IOException iOException) {
            this.f127663f.shutdown();
            this.f127662e.mo111402d();
            this.f127662e.mo111399a(true, this.f127662e.mo111395a(), -1, iOException);
        }

        C50809a(C53557g gVar, Random random, ExecutorService executorService, C50810c cVar, String str) {
            super(true, gVar.mo111400b().mo111374a(gVar).f133045d, gVar.mo111400b().mo111374a(gVar).f133046e, random, executorService, cVar, str);
            this.f127662e = gVar;
            this.f127663f = executorService;
        }
    }

    /* renamed from: a */
    public final void mo99511a(final C50810c cVar) {
        this.f127657a.mo111246a(new C53526f() {
            public final void onFailure(C53524e eVar, IOException iOException) {
                cVar.mo99514a(iOException, (C53504ad) null);
            }

            public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                C53504ad adVar2 = adVar;
                try {
                    C50807b bVar = C50807b.this;
                    C50810c cVar = cVar;
                    if (adVar2.f132400c == 101) {
                        String b = adVar2.mo111276b("Connection");
                        if ("Upgrade".equalsIgnoreCase(b)) {
                            String b2 = adVar2.mo111276b("Upgrade");
                            if ("websocket".equalsIgnoreCase(b2)) {
                                String b3 = adVar2.mo111276b("Sec-WebSocket-Accept");
                                StringBuilder sb = new StringBuilder();
                                sb.append(bVar.f127659c);
                                sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                                String a = C50807b.m109951a(sb.toString());
                                if (a.equals(b3)) {
                                    C53557g a2 = C53533a.f132616a.mo111343a(bVar.f127657a);
                                    Random random = bVar.f127658b;
                                    String tVar = adVar2.f132398a.f132378a.toString();
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(), C53559c.m113803a(C53559c.m113798a("OkHttp %s WebSocket", tVar), true));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    C50809a aVar = new C50809a(a2, random, threadPoolExecutor, cVar, tVar);
                                    cVar.mo99513a((C50794a) aVar, adVar2);
                                    do {
                                    } while (aVar.mo99498b());
                                    return;
                                }
                                StringBuilder sb2 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                                sb2.append(a);
                                sb2.append("' but was '");
                                sb2.append(b3);
                                sb2.append("'");
                                throw new ProtocolException(sb2.toString());
                            }
                            StringBuilder sb3 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
                            sb3.append(b2);
                            sb3.append("'");
                            throw new ProtocolException(sb3.toString());
                        }
                        StringBuilder sb4 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
                        sb4.append(b);
                        sb4.append("'");
                        throw new ProtocolException(sb4.toString());
                    }
                    StringBuilder sb5 = new StringBuilder("Expected HTTP 101 response but was '");
                    sb5.append(adVar2.f132400c);
                    sb5.append(" ");
                    sb5.append(adVar2.f132401d);
                    sb5.append("'");
                    throw new ProtocolException(sb5.toString());
                } catch (IOException e) {
                    cVar.mo99514a(e, adVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public static String m109951a(String str) {
        try {
            return ByteString.m114277of(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8"))).base64();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static C50807b m109950a(C53682y yVar, C53498ab abVar) {
        return new C50807b(yVar, abVar);
    }

    private C50807b(C53682y yVar, C53498ab abVar) {
        this(yVar, abVar, new SecureRandom());
    }

    private C50807b(C53682y yVar, C53498ab abVar, Random random) {
        if ("GET".equals(abVar.f132379b)) {
            this.f127658b = random;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f127659c = ByteString.m114277of(bArr).base64();
            this.f127657a = C53533a.f132616a.mo111340a(yVar.mo111653b().mo111655a(Collections.singletonList(C53685z.HTTP_1_1)).mo111667a(), abVar.mo111256a().mo111263a("Upgrade", "websocket").mo111263a("Connection", "Upgrade").mo111263a("Sec-WebSocket-Key", this.f127659c).mo111263a("Sec-WebSocket-Version", "13").mo111272c());
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(abVar.f132379b);
        throw new IllegalArgumentException(sb.toString());
    }
}
