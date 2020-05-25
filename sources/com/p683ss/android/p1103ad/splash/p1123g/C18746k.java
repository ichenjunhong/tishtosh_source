package com.p683ss.android.p1103ad.splash.p1123g;

import android.os.AsyncTask;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18674v;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.ss.android.ad.splash.g.k */
public final class C18746k extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private String f51835a;

    /* renamed from: b */
    private boolean f51836b;

    /* renamed from: c */
    private long f51837c;

    /* renamed from: d */
    private MessageDigest f51838d;

    /* renamed from: e */
    private long f51839e = -1;

    /* renamed from: f */
    private int f51840f;

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d6, code lost:
        if (r12 != null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r12.disconnect();
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01df, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e7, code lost:
        r21 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01eb, code lost:
        r12.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ee, code lost:
        r12.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d5 A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:33:0x0197] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e3 A[SYNTHETIC, Splitter:B:51:0x01e3] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01eb A[Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5, Throwable -> 0x01f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x021e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Void m45740a() {
        /*
            r22 = this;
            r1 = r22
            long r2 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = r1.f51835a
            boolean r6 = r1.f51836b
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            r8 = 0
            if (r7 == 0) goto L_0x001c
            return r8
        L_0x001c:
            java.lang.String r7 = ":"
            java.lang.String[] r7 = r5.split(r7)
            r9 = 2
            r10 = 1
            r11 = 0
            int r12 = r7.length     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            if (r12 != r9) goto L_0x018d
            r12 = r7[r11]     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            r7 = r7[r10]     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            java.lang.String r13 = "server_addr"
            r0.putOpt(r13, r5)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            java.lang.String r13 = "client_addr"
            java.lang.String r14 = com.p683ss.android.p1103ad.splash.p1123g.C18742h.m45695a()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            r0.putOpt(r13, r14)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            java.lang.String r13 = "from_bg"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            r4.putOpt(r13, r6)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r12)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            java.net.DatagramSocket r12 = new java.net.DatagramSocket     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            r12.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018f }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r14 = 4
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r10 = 3
            java.nio.ByteBuffer r15 = r15.putInt(r10)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            byte[] r15 = r15.array()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            byte[] r10 = new byte[r14]     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.util.Random r8 = new java.util.Random     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r8.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r8.nextBytes(r10)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            int r14 = r1.f51840f     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.nio.ByteBuffer r8 = r8.putInt(r14)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            byte[] r8 = r8.array()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r16 = 8
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r16)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r18 = r10
            long r9 = r14.longValue()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.nio.ByteBuffer r9 = r11.putLong(r9)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            byte[] r9 = r9.array()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            java.security.SecureRandom r10 = new java.security.SecureRandom     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r10.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x018a }
            r19 = r2
            r2 = 8999999999(0x2187119ff, double:4.446590812E-314)
            long r2 = com.p683ss.android.p1103ad.splash.p1123g.C18748m.m45744a(r10, r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r2 = r2 + r10
            r10 = -1
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x00b8
            r8 = 0
            r9 = 0
            goto L_0x0165
        L_0x00b8:
            r1.f51837c = r2     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r11 = "random number :"
            r10.<init>(r11)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10.append(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.util.Random r10 = new java.util.Random     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11 = 2
            int r10 = r10.nextInt(r11)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            if (r10 != 0) goto L_0x00db
            java.lang.String r10 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r10)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r1.f51838d = r10     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10 = 2
            r14 = 0
            goto L_0x00e5
        L_0x00db:
            java.lang.String r10 = "SHA-512"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r10)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r1.f51838d = r10     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10 = 3
            r14 = 1
        L_0x00e5:
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r15)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r15 = 0
            r11.write(r15)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r15 = r18
            r11.write(r15)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r10)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r9)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            byte[] r2 = com.p683ss.android.p1103ad.splash.p1123g.C18748m.m45746a(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            byte[] r2 = r11.toByteArray()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r8 = "packetToDigest: "
            r3.<init>(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r8 = com.p683ss.android.p1103ad.splash.p1123g.C18748m.m45745a(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3.append(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r8 = " length: "
            r3.append(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            int r8 = r2.length     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3.append(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3.<init>()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.security.MessageDigest r10 = r1.f51838d     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            byte[] r2 = r10.digest(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10 = 0
            long r16 = r16 - r8
            java.lang.String r8 = "digest_duration"
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3.putOpt(r8, r9)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r11.write(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r2 = "generate_duration"
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            long r16 = r13.longValue()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r10 = 0
            long r8 = r8 - r16
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3.putOpt(r2, r8)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            com.ss.android.ad.splash.b.a r2 = com.p683ss.android.p1103ad.splash.p1110b.C18550a.m44899a()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r8 = "service_udp_send_packet_duration"
            r9 = 0
            r2.mo37846b(r8, r14, r3, r9)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            byte[] r8 = r11.toByteArray()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
        L_0x0165:
            if (r8 != 0) goto L_0x0168
            return r9
        L_0x0168:
            java.net.DatagramPacket r2 = new java.net.DatagramPacket     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            int r3 = r8.length     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r2.<init>(r8, r3, r6, r7)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r12.setSoTimeout(r3)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r12.send(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r3 = "发送 UDP 请求: "
            r2.<init>(r3)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            r2.append(r5)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45663a(r2)     // Catch:{ IOException | Throwable | SocketException | UnknownHostException -> 0x0188 }
            goto L_0x0192
        L_0x0188:
            goto L_0x0192
        L_0x018a:
            r19 = r2
            goto L_0x0192
        L_0x018d:
            r2 = r8
            return r2
        L_0x018f:
            r19 = r2
            r12 = 0
        L_0x0192:
            r2 = -1
            if (r12 == 0) goto L_0x01f5
            r3 = 255(0xff, float:3.57E-43)
            byte[] r5 = new byte[r3]     // Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5 }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5 }
            r6.<init>(r5, r3)     // Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5 }
            r12.receive(r6)     // Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5 }
            boolean r3 = r1.m45741a(r5)     // Catch:{ IOException -> 0x01e7, Throwable -> 0x01df, all -> 0x01d5 }
            if (r3 == 0) goto L_0x01aa
            r21 = 2
            goto L_0x01ac
        L_0x01aa:
            r21 = 1
        L_0x01ac:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            r7 = 0
            long r5 = r5 - r19
            r1.f51839e = r5     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            java.lang.String r5 = "result"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            r0.putOpt(r5, r3)     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            java.lang.String r3 = "duration"
            long r5 = r1.f51839e     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            r4.putOpt(r3, r5)     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            com.ss.android.ad.splash.b.a r3 = com.p683ss.android.p1103ad.splash.p1110b.C18550a.m44899a()     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            java.lang.String r5 = "service_ad_udp_control"
            r6 = 1
            r3.mo37846b(r5, r6, r4, r0)     // Catch:{ IOException -> 0x01e9, Throwable -> 0x01e1, all -> 0x01d5 }
            r11 = 1
            goto L_0x01f8
        L_0x01d5:
            r0 = move-exception
            if (r12 == 0) goto L_0x01de
            r12.disconnect()     // Catch:{ Throwable -> 0x01de }
            r12.close()     // Catch:{ Throwable -> 0x01de }
        L_0x01de:
            throw r0
        L_0x01df:
            r21 = -1
        L_0x01e1:
            if (r12 == 0) goto L_0x01f1
            r12.disconnect()     // Catch:{ Throwable -> 0x01f1 }
            goto L_0x01ee
        L_0x01e7:
            r21 = -1
        L_0x01e9:
            if (r12 == 0) goto L_0x01f1
            r12.disconnect()     // Catch:{ Throwable -> 0x01f1 }
        L_0x01ee:
            r12.close()     // Catch:{ Throwable -> 0x01f1 }
        L_0x01f1:
            r3 = r21
            r11 = 0
            goto L_0x0202
        L_0x01f5:
            r11 = 0
            r21 = -1
        L_0x01f8:
            if (r12 == 0) goto L_0x0200
            r12.disconnect()     // Catch:{ Throwable -> 0x0200 }
            r12.close()     // Catch:{ Throwable -> 0x0200 }
        L_0x0200:
            r3 = r21
        L_0x0202:
            com.ss.android.ad.splash.core.v r5 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f51616c
            com.ss.android.ad.splash.core.v r6 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f51617d
            r6.getAndIncrement()
            if (r11 != 0) goto L_0x021e
            com.ss.android.ad.splash.b.a r5 = com.p683ss.android.p1103ad.splash.p1110b.C18550a.m44899a()
            java.lang.String r7 = "service_ad_udp_control"
            r8 = 0
            r5.mo37846b(r7, r8, r4, r0)
            goto L_0x024e
        L_0x021e:
            r5.getAndIncrement()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r4 = "ip_addr"
            java.lang.String r7 = r1.f51835a
            r0.put(r4, r7)
            java.lang.String r4 = "duration"
            long r7 = r1.f51839e
            java.lang.String r7 = java.lang.Long.toString(r7)
            r0.put(r4, r7)
            java.lang.String r4 = "rank"
            int r5 = r5.get()
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.put(r4, r5)
            com.ss.android.ad.splash.core.v r4 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r4.f51619f
            r4.add(r0)
        L_0x024e:
            com.ss.android.ad.splash.core.v r0 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            r0.mo38180a(r6)
            if (r11 == 0) goto L_0x0276
            com.ss.android.ad.splash.core.v r0 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            int r0 = r0.f51615b
            if (r0 != r2) goto L_0x0276
            com.ss.android.ad.splash.core.v r0 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            r0.mo38178a(r3)
            com.ss.android.ad.splash.core.v r0 = com.p683ss.android.p1103ad.splash.core.C18674v.m45443a()
            long r2 = r1.f51839e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r2 = r2.longValue()
            r0.f51620g = r2
        L_0x0276:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.p1123g.C18746k.m45740a():java.lang.Void");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return m45740a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        super.onProgressUpdate((Void[]) objArr);
    }

    /* renamed from: a */
    private final boolean m45741a(byte[] bArr) throws Exception {
        int i;
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[10];
        byte[] bArr4 = new byte[8];
        byte[] bArr5 = new byte[232];
        byte[] bArr6 = new byte[23];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 255; i6++) {
            if (i6 < 4) {
                bArr2[i6] = bArr[i6];
                i = i2 + 1;
                bArr6[i2] = bArr[i6];
            } else if (i6 == 4) {
                i = i2 + 1;
                bArr6[i2] = bArr[i6];
            } else {
                if (i6 < 15) {
                    int i7 = i3 + 1;
                    bArr3[i3] = bArr[i6];
                    int i8 = i2 + 1;
                    bArr6[i2] = bArr[i6];
                    i2 = i8;
                    i3 = i7;
                } else if (i6 < 23) {
                    int i9 = i4 + 1;
                    bArr4[i4] = bArr[i6];
                    int i10 = i2 + 1;
                    bArr6[i2] = bArr[i6];
                    i2 = i10;
                    i4 = i9;
                } else {
                    int i11 = i5 + 1;
                    bArr5[i5] = bArr[i6];
                    i5 = i11;
                }
            }
            i2 = i;
        }
        byte[] digest = this.f51838d.digest(bArr6);
        if (!Arrays.equals(digest, Arrays.copyOfRange(bArr5, 0, digest.length))) {
            return true;
        }
        String valueOf = String.valueOf(this.f51837c);
        int i12 = 0;
        for (int i13 = 0; i13 < valueOf.length(); i13++) {
            int numericValue = Character.getNumericValue(valueOf.charAt(i13));
            if (numericValue > 10) {
                return true;
            }
            i12 += bArr3[numericValue] & 255;
        }
        C18674v.m45443a().mo38179a(ByteBuffer.wrap(bArr4).getLong());
        new StringBuilder("sum: ").append(i12);
        if (i12 % 10 > 4) {
            return true;
        }
        return false;
    }

    public C18746k(String str, boolean z, int i) {
        if (i > 0) {
            this.f51840f = i;
        } else if (C18642g.m45227e() != null) {
            this.f51840f = Integer.parseInt(C18642g.m45227e().mo38025a());
        }
        this.f51835a = str;
        this.f51836b = z;
    }
}
