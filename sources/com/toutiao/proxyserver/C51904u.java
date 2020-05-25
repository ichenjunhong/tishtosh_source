package com.toutiao.proxyserver;

import com.toutiao.proxyserver.net.C51877e;
import com.toutiao.proxyserver.p2610b.C51807a;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2611c.C51814a;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* renamed from: com.toutiao.proxyserver.u */
final class C51904u extends C51790a {

    /* renamed from: m */
    private final Socket f129519m;

    /* renamed from: n */
    private final C51911c f129520n;

    /* renamed from: o */
    private final ExecutorService f129521o;

    /* renamed from: p */
    private volatile C51855i f129522p;

    /* renamed from: q */
    private boolean f129523q;

    /* renamed from: r */
    private volatile boolean f129524r = true;

    /* renamed from: com.toutiao.proxyserver.u$a */
    static final class C51909a {

        /* renamed from: a */
        C51813c f129536a;

        /* renamed from: b */
        C51809c f129537b;

        /* renamed from: c */
        ExecutorService f129538c;

        /* renamed from: d */
        Socket f129539d;

        /* renamed from: e */
        C51911c f129540e;

        C51909a() {
        }
    }

    /* renamed from: com.toutiao.proxyserver.u$b */
    static class C51910b {

        /* renamed from: a */
        final OutputStream f129541a;

        /* renamed from: b */
        final String f129542b;

        /* renamed from: c */
        public int f129543c;

        /* renamed from: d */
        public boolean f129544d;

        C51910b(OutputStream outputStream, int i, String str) {
            this.f129541a = outputStream;
            this.f129543c = i;
            this.f129542b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo107422a(byte[] bArr, int i, int i2) throws C51920z {
            if (!this.f129544d) {
                try {
                    this.f129541a.write(bArr, 0, i2);
                    this.f129544d = true;
                } catch (IOException e) {
                    if (C51895s.f129473h != null) {
                        C51895s.f129473h.mo95378a(-1, "Write header to player error.", this.f129542b);
                    }
                    throw new C51920z(e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo107423b(byte[] bArr, int i, int i2) throws C51920z {
            try {
                this.f129541a.write(bArr, 0, i2);
                this.f129543c += i2;
            } catch (IOException e) {
                if (C51895s.f129473h != null) {
                    C51895s.f129473h.mo95378a(-1, "Write data to player error.", this.f129542b);
                }
                StringBuilder sb = new StringBuilder("writeData error");
                sb.append(e.toString());
                C51820c.m111145d("TAG_PROXY_ProxyTask", sb.toString());
                throw new C51920z(e);
            }
        }
    }

    /* renamed from: com.toutiao.proxyserver.u$c */
    public interface C51911c {
        /* renamed from: a */
        void mo107412a(C51904u uVar);

        /* renamed from: b */
        void mo107413b(C51904u uVar);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r12v2, types: [com.toutiao.proxyserver.j] */
    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.toutiao.proxyserver.j] */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r3v17, types: [com.toutiao.proxyserver.j] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r20v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r20v7 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r12v9, types: [com.toutiao.proxyserver.j] */
    /* JADX WARNING: type inference failed for: r12v10, types: [int] */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r20v8 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r12v13, types: [com.toutiao.proxyserver.j] */
    /* JADX WARNING: type inference failed for: r5v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r20v9 */
    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r20v10 */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r16v3 */
    /* JADX WARNING: type inference failed for: r20v11 */
    /* JADX WARNING: type inference failed for: r20v12 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r16v5 */
    /* JADX WARNING: type inference failed for: r20v13 */
    /* JADX WARNING: type inference failed for: r16v6 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r16v7 */
    /* JADX WARNING: type inference failed for: r20v14 */
    /* JADX WARNING: type inference failed for: r16v8 */
    /* JADX WARNING: type inference failed for: r20v15 */
    /* JADX WARNING: type inference failed for: r16v9 */
    /* JADX WARNING: type inference failed for: r20v16 */
    /* JADX WARNING: type inference failed for: r16v10 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r20v17 */
    /* JADX WARNING: type inference failed for: r16v11 */
    /* JADX WARNING: type inference failed for: r20v18 */
    /* JADX WARNING: type inference failed for: r16v12 */
    /* JADX WARNING: type inference failed for: r12v15, types: [int] */
    /* JADX WARNING: type inference failed for: r20v19 */
    /* JADX WARNING: type inference failed for: r16v13 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r16v14 */
    /* JADX WARNING: type inference failed for: r20v20 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r3v48, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r16v15 */
    /* JADX WARNING: type inference failed for: r18v0 */
    /* JADX WARNING: type inference failed for: r16v16 */
    /* JADX WARNING: type inference failed for: r20v21 */
    /* JADX WARNING: type inference failed for: r16v17 */
    /* JADX WARNING: type inference failed for: r20v22 */
    /* JADX WARNING: type inference failed for: r16v18 */
    /* JADX WARNING: type inference failed for: r16v19 */
    /* JADX WARNING: type inference failed for: r20v23 */
    /* JADX WARNING: type inference failed for: r20v24 */
    /* JADX WARNING: type inference failed for: r16v20 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r13v12, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r16v21 */
    /* JADX WARNING: type inference failed for: r20v25 */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r16v22 */
    /* JADX WARNING: type inference failed for: r16v23 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r20v26 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /* JADX WARNING: type inference failed for: r16v24 */
    /* JADX WARNING: type inference failed for: r20v27 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r20v28 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r20v29 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r20v30 */
    /* JADX WARNING: type inference failed for: r20v31 */
    /* JADX WARNING: type inference failed for: r20v32 */
    /* JADX WARNING: type inference failed for: r20v33 */
    /* JADX WARNING: type inference failed for: r20v34 */
    /* JADX WARNING: type inference failed for: r20v35 */
    /* JADX WARNING: type inference failed for: r20v36 */
    /* JADX WARNING: type inference failed for: r20v37 */
    /* JADX WARNING: type inference failed for: r20v38 */
    /* JADX WARNING: type inference failed for: r20v39 */
    /* JADX WARNING: type inference failed for: r20v40 */
    /* JADX WARNING: type inference failed for: r20v41 */
    /* JADX WARNING: type inference failed for: r20v42 */
    /* JADX WARNING: type inference failed for: r20v43 */
    /* JADX WARNING: type inference failed for: r20v44 */
    /* JADX WARNING: type inference failed for: r20v45 */
    /* JADX WARNING: type inference failed for: r20v46 */
    /* JADX WARNING: type inference failed for: r20v47 */
    /* JADX WARNING: type inference failed for: r20v48 */
    /* JADX WARNING: type inference failed for: r20v49 */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r20v50 */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r20v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: type inference failed for: r12v31 */
    /* JADX WARNING: type inference failed for: r20v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r20v53 */
    /* JADX WARNING: type inference failed for: r20v54 */
    /* JADX WARNING: type inference failed for: r20v55 */
    /* JADX WARNING: type inference failed for: r20v56 */
    /* JADX WARNING: type inference failed for: r20v57 */
    /* JADX WARNING: type inference failed for: r16v25 */
    /* JADX WARNING: type inference failed for: r20v58 */
    /* JADX WARNING: type inference failed for: r16v26 */
    /* JADX WARNING: type inference failed for: r20v59 */
    /* JADX WARNING: type inference failed for: r16v27 */
    /* JADX WARNING: type inference failed for: r12v33 */
    /* JADX WARNING: type inference failed for: r20v60 */
    /* JADX WARNING: type inference failed for: r16v28 */
    /* JADX WARNING: type inference failed for: r20v61 */
    /* JADX WARNING: type inference failed for: r20v62 */
    /* JADX WARNING: type inference failed for: r20v63 */
    /* JADX WARNING: type inference failed for: r20v64 */
    /* JADX WARNING: type inference failed for: r20v65 */
    /* JADX WARNING: type inference failed for: r20v66 */
    /* JADX WARNING: type inference failed for: r20v67 */
    /* JADX WARNING: type inference failed for: r20v68 */
    /* JADX WARNING: type inference failed for: r20v69 */
    /* JADX WARNING: type inference failed for: r20v70 */
    /* JADX WARNING: type inference failed for: r16v29 */
    /* JADX WARNING: type inference failed for: r16v30 */
    /* JADX WARNING: type inference failed for: r16v31 */
    /* JADX WARNING: type inference failed for: r16v32 */
    /* JADX WARNING: type inference failed for: r16v33 */
    /* JADX WARNING: type inference failed for: r16v34 */
    /* JADX WARNING: type inference failed for: r16v35 */
    /* JADX WARNING: type inference failed for: r16v36 */
    /* JADX WARNING: type inference failed for: r16v37 */
    /* JADX WARNING: type inference failed for: r16v38 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r20v71 */
    /* JADX WARNING: type inference failed for: r16v39 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r16v40 */
    /* JADX WARNING: type inference failed for: r16v41 */
    /* JADX WARNING: type inference failed for: r16v42 */
    /* JADX WARNING: type inference failed for: r16v43 */
    /* JADX WARNING: type inference failed for: r16v44 */
    /* JADX WARNING: type inference failed for: r16v45 */
    /* JADX WARNING: type inference failed for: r16v46 */
    /* JADX WARNING: type inference failed for: r16v47 */
    /* JADX WARNING: type inference failed for: r20v72 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r16v48 */
    /* JADX WARNING: type inference failed for: r16v49 */
    /* JADX WARNING: type inference failed for: r16v50 */
    /* JADX WARNING: type inference failed for: r16v51 */
    /* JADX WARNING: type inference failed for: r16v52 */
    /* JADX WARNING: type inference failed for: r20v73 */
    /* JADX WARNING: type inference failed for: r20v74 */
    /* JADX WARNING: type inference failed for: r20v75 */
    /* JADX WARNING: type inference failed for: r20v76 */
    /* JADX WARNING: type inference failed for: r20v77 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023d, code lost:
        r1 = r0;
        r2 = r16;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0241, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0242, code lost:
        r16 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0246, code lost:
        r1 = r0;
        r2 = r16;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024c, code lost:
        r16 = r5;
        r20 = r12;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0257, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0258, code lost:
        r16 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025c, code lost:
        r1 = r0;
        r2 = r16;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0261, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0262, code lost:
        r19 = r13;
        r1 = r0;
        r2 = r2;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0265, code lost:
        r4 = new java.lang.StringBuilder("OtherException: ");
        r4.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r4.toString(), r7.f129203g);
        r12 = new com.toutiao.proxyserver.C51860j
        r7.f129207k++;
        r20 = r20;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028f, code lost:
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0290, code lost:
        r1 = r0;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0291, code lost:
        r2 = new java.lang.StringBuilder("CancelException: ");
        r2.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r2.toString(), r7.f129203g);
        com.toutiao.proxyserver.C51895s.m111278a(r12, "Task was cancel.", r7.f129203g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b3, code lost:
        r1 = r0;
        r3 = new java.lang.StringBuilder("ContentLengthNotMatchException: ");
        r3.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r3.toString(), r7.f129203g);
        r7.f129523q = true;
        r3 = new java.lang.StringBuilder(" ContentLengthNotMatchException: ");
        r3.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.C51895s.m111278a(5, r3.toString(), r7.f129203g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e9, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02eb, code lost:
        r19 = r13;
        r1 = r0;
        r2 = r2;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ee, code lost:
        r4 = new java.lang.StringBuilder("RandomAccessFileWrapper");
        r4.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r4.toString(), r7.f129203g);
        r7.f129524r = false;
        r12 = new com.toutiao.proxyserver.C51860j
        r3 = new java.lang.StringBuilder(" RandomAccessFileWrapper.FileException：");
        r3.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.C51895s.m111278a(4, r3.toString(), r7.f129203g);
        r7.f129207k++;
        r20 = r20;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0335, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0336, code lost:
        r1 = r0;
        r3 = new java.lang.StringBuilder("SocketWriteException: ");
        r3.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r3.toString(), r7.f129203g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0351, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0352, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0353, code lost:
        r20 = r12;
        r19 = r13;
        r1 = r0;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0364, code lost:
        r4 = new java.lang.StringBuilder("IOException: ");
        r4.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r4.toString(), r7.f129203g);
        r12 = new com.toutiao.proxyserver.C51860j
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0387, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0390, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0391, code lost:
        r19 = r13;
        r1 = r0;
        r2 = r2;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0396, code lost:
        if (com.toutiao.proxyserver.C51895s.f129481p == false) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0398, code lost:
        r15.mo107295a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x039b, code lost:
        r4 = new java.lang.StringBuilder("RequestException: ");
        r4.append(com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1));
        com.toutiao.proxyserver.p2612d.C51820c.m111146d("TAG_PROXY_ProxyTask", r4.toString(), r7.f129203g);
        r12 = new com.toutiao.proxyserver.C51860j
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03c1, code lost:
        if (r1.errorCode != 416) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03c3, code lost:
        r7.f129523q = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03d1, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03d3, code lost:
        r13 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03d5, code lost:
        r7.f129207k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0331, code lost:
        r20 = r20;
        r2 = r2;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        r1 = r0;
        r2 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r1 = r0;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        r1 = r0;
        r2 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r1 = r0;
        r2 = r5;
        r20 = r12;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        r1 = r0;
        r2 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b6, code lost:
        r20 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bc, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01be, code lost:
        r16 = r18;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c5, code lost:
        r16 = r18;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        r20 = r12;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ce, code lost:
        r16 = r18;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d3, code lost:
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d5, code lost:
        r16 = r18;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022d, code lost:
        r0 = e;
        r20 = r20;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022f, code lost:
        r0 = e;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0232, code lost:
        r0 = e;
        r20 = r20;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0236, code lost:
        r0 = e;
        r20 = r20;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0238, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0239, code lost:
        r16 = r5;
        r19 = r13;
        r20 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r20v2
      assigns: []
      uses: []
      mth insns count: 550
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x028e A[ExcHandler: e (e com.toutiao.proxyserver.e), Splitter:B:19:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b2 A[ExcHandler: f (r0v4 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:19:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0335 A[ExcHandler: z (r0v2 'e' com.toutiao.proxyserver.z A[CUSTOM_DECLARE]), Splitter:B:19:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022d A[ExcHandler: Exception (e java.lang.Exception), PHI: r16 r19 r20 
      PHI: (r16v11 ?) = (r16v31 ?), (r16v35 ?), (r16v38 ?), (r16v43 ?), (r16v47 ?), (r16v51 ?) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:48:0x0121, B:51:0x0127, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v22 boolean) = (r19v23 boolean), (r19v23 boolean), (r19v23 boolean), (r19v34 boolean), (r19v34 boolean), (r19v5 boolean) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:51:0x0127, B:56:0x0185, B:48:0x0121] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v17 ?) = (r20v39 ?), (r20v46 ?), (r20v63 ?), (r20v67 ?), (r20v70 ?), (r20v76 ?) binds: [B:48:0x0121, B:51:0x0127, B:81:0x01fa, B:87:0x0203, B:82:?, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE], Splitter:B:56:0x0185] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x022f A[ExcHandler: e (e com.toutiao.proxyserver.e), PHI: r12 
      PHI: (r12v14 ?) = (r12v23 ?), (r12v24 ?), (r12v34 ?), (r12v35 ?), (r12v36 ?), (r12v40 ?) binds: [B:48:0x0121, B:51:0x0127, B:81:0x01fa, B:87:0x0203, B:82:?, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE], Splitter:B:56:0x0185] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0232 A[ExcHandler: a (e com.toutiao.proxyserver.v$a), PHI: r16 r19 r20 
      PHI: (r16v10 ?) = (r16v30 ?), (r16v34 ?), (r16v37 ?), (r16v42 ?), (r16v46 ?), (r16v50 ?) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:48:0x0121, B:51:0x0127, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v21 boolean) = (r19v23 boolean), (r19v23 boolean), (r19v23 boolean), (r19v34 boolean), (r19v34 boolean), (r19v5 boolean) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:51:0x0127, B:56:0x0185, B:48:0x0121] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v16 ?) = (r20v38 ?), (r20v45 ?), (r20v62 ?), (r20v66 ?), (r20v69 ?), (r20v75 ?) binds: [B:48:0x0121, B:51:0x0127, B:81:0x01fa, B:87:0x0203, B:82:?, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE], Splitter:B:56:0x0185] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0236 A[ExcHandler: x (e com.toutiao.proxyserver.x), PHI: r16 r19 r20 
      PHI: (r16v8 ?) = (r16v29 ?), (r16v32 ?), (r16v36 ?), (r16v40 ?), (r16v44 ?), (r16v48 ?) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:48:0x0121, B:51:0x0127, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v19 boolean) = (r19v23 boolean), (r19v23 boolean), (r19v23 boolean), (r19v34 boolean), (r19v34 boolean), (r19v5 boolean) binds: [B:81:0x01fa, B:87:0x0203, B:82:?, B:51:0x0127, B:56:0x0185, B:48:0x0121] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r20v14 ?) = (r20v36 ?), (r20v43 ?), (r20v61 ?), (r20v64 ?), (r20v68 ?), (r20v73 ?) binds: [B:48:0x0121, B:51:0x0127, B:81:0x01fa, B:87:0x0203, B:82:?, B:56:0x0185] A[DONT_GENERATE, DONT_INLINE], Splitter:B:56:0x0185] */
    /* JADX WARNING: Unknown variable types count: 68 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m111296a(com.toutiao.proxyserver.C51904u.C51910b r22) throws com.toutiao.proxyserver.C51821e {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            r10 = 0
            r1 = 1
            r2 = 0
            r12 = 0
            r13 = 0
        L_0x0009:
            com.toutiao.proxyserver.ab r3 = r7.f129206j
            boolean r3 = r3.mo107293a()
            if (r3 == 0) goto L_0x03dd
            r21.mo107282f()
            r14 = 2
            if (r1 == 0) goto L_0x0030
            boolean r1 = com.toutiao.proxyserver.C51895s.f129482q
            if (r1 == 0) goto L_0x0030
            com.toutiao.proxyserver.ab r1 = r7.f129206j
            java.util.List<java.lang.String> r1 = r1.f129260a
            if (r1 == 0) goto L_0x0030
            com.toutiao.proxyserver.ab r1 = r7.f129206j
            java.util.List<java.lang.String> r1 = r1.f129260a
            int r1 = r1.size()
            if (r1 < r14) goto L_0x0030
            com.toutiao.proxyserver.ab r1 = r7.f129206j
            r1.mo107294b()
        L_0x0030:
            if (r13 == 0) goto L_0x0044
            r1 = 0
        L_0x0033:
            com.toutiao.proxyserver.ab r3 = r7.f129206j
            boolean r3 = r3.mo107293a()
            if (r3 == 0) goto L_0x0042
            com.toutiao.proxyserver.ab r1 = r7.f129206j
            com.toutiao.proxyserver.ab$a r1 = r1.mo107294b()
            goto L_0x0033
        L_0x0042:
            r15 = r1
            goto L_0x004b
        L_0x0044:
            com.toutiao.proxyserver.ab r1 = r7.f129206j
            com.toutiao.proxyserver.ab$a r1 = r1.mo107294b()
            goto L_0x0042
        L_0x004b:
            java.lang.String r5 = r15.f129263a     // Catch:{ x -> 0x0390, IOException -> 0x0352, z -> 0x0335, a -> 0x02ea, f -> 0x02b2, e -> 0x028e, Exception -> 0x0261 }
            r21.mo107286j()     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r4 = r15.f129263a     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r1 = "HEAD"
            com.toutiao.proxyserver.w r2 = r7.f129205i     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.w$b r2 = r2.f129546a     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r2 = r2.f129556a     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            java.lang.String r3 = "procHead() called with: mediaPlayerWriter = ["
            r2.<init>(r3)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            r2.append(r8)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            java.lang.String r3 = "], url = ["
            r2.append(r3)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            r2.append(r4)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            com.toutiao.proxyserver.p2612d.C51820c.m111139a(r1, r2)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            com.toutiao.proxyserver.b.c r1 = r7.f129198b     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            java.lang.String r2 = r7.f129204h     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            com.toutiao.proxyserver.w r3 = r7.f129205i     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            com.toutiao.proxyserver.w$a r3 = r3.f129548c     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            int r3 = r3.f129549a     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            com.toutiao.proxyserver.b.a r1 = r1.mo107300a(r2, r3)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            byte[] r1 = r7.m111297a(r1, r8, r4)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            int r2 = r1.length     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            r8.mo107422a(r1, r10, r2)     // Catch:{ x -> 0x00bb, IOException -> 0x00b2, z -> 0x0335, a -> 0x00ab, f -> 0x02b2, e -> 0x00a6, Exception -> 0x009f }
            r16 = r5
            r20 = r12
            r19 = r13
            r12 = -1
            goto L_0x01fa
        L_0x009f:
            r0 = move-exception
            r1 = r0
            r2 = r5
            r19 = r13
            goto L_0x0265
        L_0x00a6:
            r0 = move-exception
            r1 = r0
            r12 = -1
            goto L_0x0291
        L_0x00ab:
            r0 = move-exception
            r1 = r0
            r2 = r5
            r19 = r13
            goto L_0x02ee
        L_0x00b2:
            r0 = move-exception
            r1 = r0
            r2 = r5
            r20 = r12
            r19 = r13
            goto L_0x0358
        L_0x00bb:
            r0 = move-exception
            r1 = r0
            r2 = r5
            r19 = r13
            goto L_0x0394
        L_0x00c2:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = "procGet() called with, url = ["
            r2.<init>(r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            r2.append(r4)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = "]，rawKey："
            r2.append(r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = r7.f129203g     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            r2.append(r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = "， key:"
            r2.append(r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = r7.f129204h     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            r2.append(r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r2 = r2.toString()     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r3 = r7.f129203g     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.p2612d.C51820c.m111140a(r1, r2, r3)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            boolean r1 = r7.f129524r     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            if (r1 == 0) goto L_0x01d9
            com.toutiao.proxyserver.c r1 = r7.f129197a     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r2 = r7.f129204h     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.io.File r3 = r1.mo107309d(r2)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            long r1 = r3.length()     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.b.c r6 = r7.f129198b     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            java.lang.String r9 = r7.f129204h     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.w r14 = r7.f129205i     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.w$a r14 = r14.f129548c     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            int r14 = r14.f129549a     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            com.toutiao.proxyserver.b.a r9 = r6.mo107300a(r9, r14)     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            int r6 = r8.f129543c     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            long r10 = (long) r6     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            long r10 = r1 - r10
            int r14 = (int) r10     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            if (r9 != 0) goto L_0x0117
            r16 = r3
            r17 = r4
            r3 = -1
            goto L_0x011d
        L_0x0117:
            r16 = r3
            int r3 = r9.f129274c     // Catch:{ x -> 0x0257, IOException -> 0x024b, z -> 0x0335, a -> 0x0241, f -> 0x02b2, e -> 0x028e, Exception -> 0x0238 }
            r17 = r4
        L_0x011d:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            r18 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ x -> 0x01d2, IOException -> 0x01c9, z -> 0x0335, a -> 0x01c2, f -> 0x02b2, e -> 0x028e, Exception -> 0x01bb }
            r19 = r13
            java.lang.String r13 = "procGet() totalLength:"
            r5.<init>(r13)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r3)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r13 = ", cacheLength:"
            r5.append(r13)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r1)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r13 = ", mpOffset:"
            r5.append(r13)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r6)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            com.toutiao.proxyserver.p2612d.C51820c.m111139a(r4, r5)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            int r4 = r8.f129543c     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            long r4 = (long) r4     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0196
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r13 = "cache hit, remainSize: "
            r5.<init>(r13)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r10 = "，rawKey："
            r5.append(r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r10 = r7.f129203g     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r10 = "， key:"
            r5.append(r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r10 = r7.f129204h     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r5.append(r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            java.lang.String r10 = r7.f129203g     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r4, r5, r10)     // Catch:{ x -> 0x01b9, IOException -> 0x01b5, z -> 0x0335, a -> 0x01b3, f -> 0x02b2, e -> 0x028e, Exception -> 0x01b1 }
            r4 = 1
            int r5 = (int) r1
            r10 = r1
            r1 = r21
            r2 = r4
            r4 = r3
            r13 = r16
            r3 = r14
            r14 = r17
            r16 = r18
            r20 = r12
            r12 = -1
            r1.m111295a(r2, r3, r4, r5, r6)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r2 = r7.f129203g     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1.mo107297a(r2, r10)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r7.m111293a(r9, r13, r8, r14)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            goto L_0x01fa
        L_0x0196:
            r10 = r1
            r4 = r3
            r20 = r12
            r9 = r17
            r16 = r18
            r12 = -1
            r2 = 0
            int r5 = (int) r10     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1 = r21
            r3 = r14
            r1.m111295a(r2, r3, r4, r5, r6)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r2 = r7.f129203g     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1.mo107297a(r2, r10)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            goto L_0x01f7
        L_0x01b1:
            r0 = move-exception
            goto L_0x01be
        L_0x01b3:
            r0 = move-exception
            goto L_0x01c5
        L_0x01b5:
            r0 = move-exception
            r20 = r12
            goto L_0x01ce
        L_0x01b9:
            r0 = move-exception
            goto L_0x01d5
        L_0x01bb:
            r0 = move-exception
            r19 = r13
        L_0x01be:
            r16 = r18
            goto L_0x023d
        L_0x01c2:
            r0 = move-exception
            r19 = r13
        L_0x01c5:
            r16 = r18
            goto L_0x0246
        L_0x01c9:
            r0 = move-exception
            r20 = r12
            r19 = r13
        L_0x01ce:
            r16 = r18
            goto L_0x0252
        L_0x01d2:
            r0 = move-exception
            r19 = r13
        L_0x01d5:
            r16 = r18
            goto L_0x025c
        L_0x01d9:
            r9 = r4
            r16 = r5
            r20 = r12
            r19 = r13
            r12 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = r8.f129543c     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1 = r21
            r1.m111295a(r2, r3, r4, r5, r6)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r2 = r7.f129203g     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r3 = 0
            r1.mo107297a(r2, r3)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
        L_0x01f7:
            r7.m111294a(r8, r9)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
        L_0x01fa:
            java.io.OutputStream r1 = r8.f129541a     // Catch:{ IOException -> 0x0201, x -> 0x0236, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1.flush()     // Catch:{ IOException -> 0x0201, x -> 0x0236, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r1 = 1
            return r1
        L_0x0201:
            r0 = move-exception
            r1 = r0
            com.toutiao.proxyserver.m r2 = com.toutiao.proxyserver.C51895s.f129473h     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            if (r2 == 0) goto L_0x0210
            com.toutiao.proxyserver.m r2 = com.toutiao.proxyserver.C51895s.f129473h     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r3 = "flush error."
            java.lang.String r4 = r8.f129542b     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r2.mo95378a(r12, r3, r4)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
        L_0x0210:
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r4 = "flush error"
            r3.<init>(r4)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r4 = r1.toString()     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r3.append(r4)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            java.lang.String r3 = r3.toString()     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            com.toutiao.proxyserver.p2612d.C51820c.m111145d(r2, r3)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            com.toutiao.proxyserver.z r2 = new com.toutiao.proxyserver.z     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            r2.<init>(r1)     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
            throw r2     // Catch:{ x -> 0x0236, IOException -> 0x0234, z -> 0x0335, a -> 0x0232, f -> 0x02b2, e -> 0x022f, Exception -> 0x022d }
        L_0x022d:
            r0 = move-exception
            goto L_0x023d
        L_0x022f:
            r0 = move-exception
            goto L_0x0290
        L_0x0232:
            r0 = move-exception
            goto L_0x0246
        L_0x0234:
            r0 = move-exception
            goto L_0x0252
        L_0x0236:
            r0 = move-exception
            goto L_0x025c
        L_0x0238:
            r0 = move-exception
            r16 = r5
            r19 = r13
        L_0x023d:
            r1 = r0
            r2 = r16
            goto L_0x0265
        L_0x0241:
            r0 = move-exception
            r16 = r5
            r19 = r13
        L_0x0246:
            r1 = r0
            r2 = r16
            goto L_0x02ee
        L_0x024b:
            r0 = move-exception
            r16 = r5
            r20 = r12
            r19 = r13
        L_0x0252:
            r1 = r0
            r2 = r16
            goto L_0x0358
        L_0x0257:
            r0 = move-exception
            r16 = r5
            r19 = r13
        L_0x025c:
            r1 = r0
            r2 = r16
            goto L_0x0394
        L_0x0261:
            r0 = move-exception
            r19 = r13
            r1 = r0
        L_0x0265:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "OtherException: "
            r4.<init>(r5)
            java.lang.String r5 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r4, r5)
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            java.lang.String r3 = "OtherException"
            r4 = 0
            r12.<init>(r4, r3, r1)
            int r1 = r7.f129207k
            r3 = 1
            int r1 = r1 + r3
            r7.f129207k = r1
            goto L_0x032f
        L_0x028e:
            r0 = move-exception
            r12 = -1
        L_0x0290:
            r1 = r0
        L_0x0291:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CancelException: "
            r2.<init>(r3)
            java.lang.String r3 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r7.f129203g
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r4, r2, r3)
            java.lang.String r2 = r7.f129203g
            java.lang.String r3 = "Task was cancel."
            com.toutiao.proxyserver.C51895s.m111278a(r12, r3, r2)
            throw r1
        L_0x02b2:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r4 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r2, r3, r4)
            r2 = 1
            r7.f129523q = r2
            r2 = 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " ContentLengthNotMatchException: "
            r3.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r7.f129203g
            com.toutiao.proxyserver.C51895s.m111278a(r2, r1, r3)
            r1 = 0
            return r1
        L_0x02ea:
            r0 = move-exception
            r19 = r13
            r1 = r0
        L_0x02ee:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RandomAccessFileWrapper"
            r4.<init>(r5)
            java.lang.String r5 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r4, r5)
            r3 = 0
            r7.f129524r = r3
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            java.lang.String r3 = "RandomAccessFileWrapper.FileException"
            r4 = 4
            r12.<init>(r4, r3, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = " RandomAccessFileWrapper.FileException："
            r3.<init>(r5)
            java.lang.String r1 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r7.f129203g
            com.toutiao.proxyserver.C51895s.m111278a(r4, r1, r3)
            int r1 = r7.f129207k
            r3 = 1
            int r1 = r1 + r3
            r7.f129207k = r1
        L_0x032f:
            r13 = r19
        L_0x0331:
            r1 = 0
            r10 = 0
            goto L_0x0009
        L_0x0335:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "SocketWriteException: "
            r3.<init>(r4)
            java.lang.String r1 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r2, r1, r3)
            r1 = 1
            return r1
        L_0x0352:
            r0 = move-exception
            r20 = r12
            r19 = r13
            r1 = r0
        L_0x0358:
            java.lang.String r3 = "Canceled"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x0387
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "IOException: "
            r4.<init>(r5)
            java.lang.String r5 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r4, r5)
            com.toutiao.proxyserver.j r3 = new com.toutiao.proxyserver.j
            java.lang.String r4 = "IOException"
            r5 = 2
            r3.<init>(r5, r4, r1)
            r12 = r3
            goto L_0x0389
        L_0x0387:
            r12 = r20
        L_0x0389:
            int r1 = r7.f129207k
            r3 = 1
            int r1 = r1 + r3
            r7.f129207k = r1
            goto L_0x032f
        L_0x0390:
            r0 = move-exception
            r19 = r13
            r1 = r0
        L_0x0394:
            boolean r3 = com.toutiao.proxyserver.C51895s.f129481p
            if (r3 != 0) goto L_0x039b
            r15.mo107295a()
        L_0x039b:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RequestException: "
            r4.<init>(r5)
            java.lang.String r5 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r4, r5)
            com.toutiao.proxyserver.j r12 = new com.toutiao.proxyserver.j
            int r3 = r1.errorCode
            java.lang.String r4 = "RequestException"
            r12.<init>(r3, r4, r1)
            int r3 = r1.errorCode
            r4 = 416(0x1a0, float:5.83E-43)
            if (r3 != r4) goto L_0x03c7
            r3 = 1
            r7.f129523q = r3
            goto L_0x03d3
        L_0x03c7:
            int r1 = r1.errorCode
            r3 = 403(0x193, float:5.65E-43)
            if (r1 != r3) goto L_0x03d3
            boolean r1 = com.toutiao.proxyserver.C51895s.f129481p
            if (r1 == 0) goto L_0x03d3
            r13 = 1
            goto L_0x03d5
        L_0x03d3:
            r13 = r19
        L_0x03d5:
            int r1 = r7.f129207k
            r3 = 1
            int r1 = r1 + r3
            r7.f129207k = r1
            goto L_0x0331
        L_0x03dd:
            r20 = r12
            if (r20 == 0) goto L_0x040a
            r12 = r20
            int r1 = r12.f129387a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r12.f129388b
            r3.append(r4)
            java.lang.Exception r4 = r12.f129389c
            java.lang.String r4 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r4)
            r3.append(r4)
            java.lang.String r4 = ", url:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r7.f129203g
            com.toutiao.proxyserver.C51895s.m111278a(r1, r3, r4)
            goto L_0x0412
        L_0x040a:
            r1 = 6
            java.lang.String r3 = "After retry all url, no exception..."
            java.lang.String r4 = r7.f129203g
            com.toutiao.proxyserver.C51895s.m111278a(r1, r3, r4)
        L_0x0412:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.String r3 = "execute() called and return false"
            java.lang.String r4 = r7.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r1, r3, r4)
            r1 = 1
            com.toutiao.proxyserver.C51895s.m111277a(r1, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51904u.m111296a(com.toutiao.proxyserver.u$b):boolean");
    }

    /* renamed from: a */
    public final void mo107271a() {
        super.mo107271a();
        m111300m();
    }

    /* renamed from: l */
    private void m111299l() {
        if (C51895s.f129491z) {
            if (C51883r.m111262f() == 1) {
                C51883r.m111260a().mo107393c();
                return;
            }
            C51883r.m111260a().mo107388a(mo107283g(), this.f129204h);
        }
    }

    /* renamed from: m */
    private void m111300m() {
        C51855i iVar = this.f129522p;
        this.f129522p = null;
        if (iVar != null) {
            iVar.mo107271a();
            StringBuilder sb = new StringBuilder("cancel fetch task, ");
            sb.append(C51820c.m111138a(new RuntimeException()));
            C51820c.m111144c("TAG_PROXY_ProxyTask", sb.toString(), this.f129203g);
        }
    }

    public final void run() {
        C51910b k = m111298k();
        if (k != null) {
            if (this.f129520n != null) {
                this.f129520n.mo107412a(this);
            }
            try {
                this.f129197a.mo107306a(this.f129204h);
                try {
                    m111296a(k);
                } catch (C51821e e) {
                    C51820c.m111146d("TAG_PROXY_ProxyTask", C51820c.m111138a(e), this.f129203g);
                }
                if (this.f129523q) {
                    this.f129197a.mo107308c(this.f129203g);
                }
                this.f129197a.mo107307b(this.f129204h);
                mo107271a();
                C51838d.m111178a(this.f129519m);
                StringBuilder sb = new StringBuilder("close socket vid: ");
                sb.append(this.f129203g);
                sb.append(", ");
                sb.append(k.f129543c);
                C51820c.m111145d("TAG_PROXY_ProxyTask", sb.toString());
                if (this.f129520n != null) {
                    this.f129520n.mo107413b(this);
                }
            } catch (C51814a unused) {
                C51838d.m111178a(this.f129519m);
                if (this.f129520n != null) {
                    this.f129520n.mo107413b(this);
                }
            }
        }
    }

    /* renamed from: k */
    private C51910b m111298k() {
        C51813c cVar;
        try {
            this.f129205i = C51914w.m111312a(this.f129519m.getInputStream());
            OutputStream outputStream = this.f129519m.getOutputStream();
            if (this.f129205i.f129548c.f129549a == 1) {
                cVar = C51895s.f129466a;
            } else {
                cVar = C51895s.f129467b;
            }
            if (cVar == null) {
                C51820c.m111146d("TAG_PROXY_ProxyTask", "cache is null", this.f129203g);
                return null;
            }
            this.f129197a = cVar;
            this.f129203g = this.f129205i.f129548c.f129550b;
            this.f129204h = this.f129205i.f129548c.f129551c;
            this.f129206j = new C51800ab(this.f129205i.f129548c.f129555g);
            this.f129201e = this.f129205i.f129547b;
            StringBuilder sb = new StringBuilder("request from MediaPlayer:    ");
            sb.append(this.f129205i.toString());
            C51820c.m111142b("TAG_PROXY_ProxyTask", sb.toString(), this.f129203g);
            return new C51910b(outputStream, this.f129205i.f129548c.f129552d, this.f129203g);
        } catch (IOException e) {
            C51838d.m111178a(this.f129519m);
            C51820c.m111146d("TAG_PROXY_ProxyTask", C51820c.m111138a(e), this.f129203g);
            return null;
        } catch (C51917c e2) {
            C51838d.m111178a(this.f129519m);
            C51820c.m111146d("TAG_PROXY_ProxyTask", C51820c.m111138a(e2), this.f129203g);
            return null;
        }
    }

    C51904u(C51909a aVar) {
        super(aVar.f129536a, aVar.f129537b);
        this.f129521o = aVar.f129538c;
        this.f129519m = aVar.f129539d;
        this.f129520n = aVar.f129540e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03b4, code lost:
        r16 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03a4 A[SYNTHETIC, Splitter:B:123:0x03a4] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03b3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d6 A[Catch:{ all -> 0x03de }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x042b A[SYNTHETIC, Splitter:B:159:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0312 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0266 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0268 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0277 A[Catch:{ IOException -> 0x03ab, all -> 0x03a9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111294a(com.toutiao.proxyserver.C51904u.C51910b r23, java.lang.String r24) throws com.toutiao.proxyserver.C51920z, java.io.IOException, com.toutiao.proxyserver.C51821e, com.toutiao.proxyserver.C51834f {
        /*
            r22 = this;
            r8 = r22
            r7 = r23
            r9 = r24
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "processNetworkOnly() called with, url = ["
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = "]，rawKey："
            r1.append(r2)
            java.lang.String r2 = r8.f129203g
            r1.append(r2)
            java.lang.String r2 = "， key:"
            r1.append(r2)
            java.lang.String r2 = r8.f129204h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r8.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111140a(r0, r1, r2)
            r22.m111299l()
            r22.m111300m()
            r22.mo107278b()
            long r10 = android.os.SystemClock.elapsedRealtime()
            int r0 = r7.f129543c
            com.toutiao.proxyserver.e.d r12 = new com.toutiao.proxyserver.e.d
            r12.<init>()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r1.f129312a = r12
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r1.mo107321b()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r22.mo107285i()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.C51895s.f129487v     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            if (r1 == 0) goto L_0x0064
            com.toutiao.proxyserver.d.b r1 = com.toutiao.proxyserver.C51895s.f129487v     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = "videocache_start_request"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r5 = r8.f129203g     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r1.mo95377a(r2, r3, r5)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
        L_0x0064:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r3 = "processNetworkOnly() before request from:"
            r2.<init>(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r2.append(r0)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r3 = ", to:"
            r2.append(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.w r3 = r8.f129205i     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.w$a r3 = r3.f129548c     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            int r3 = r3.f129553e     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r2.append(r3)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.p2612d.C51820c.m111139a(r1, r2)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.w r1 = r8.f129205i     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            com.toutiao.proxyserver.w$a r1 = r1.f129548c     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            int r1 = r1.f129553e     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            java.lang.String r2 = "GET"
            com.toutiao.proxyserver.net.e r14 = r8.mo107270a(r9, r0, r1, r2)     // Catch:{ IOException -> 0x03c6, all -> 0x03c0 }
            r22.mo107284h()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            r1 = 1
            r15 = 0
            com.toutiao.proxyserver.p2614f.C51838d.m111174a(r14, r15, r1)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.b.c r1 = r8.f129198b     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r3 = r22.mo107283g()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.b.a r6 = r1.mo107300a(r2, r3)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r5 = com.toutiao.proxyserver.p2614f.C51838d.m111166a(r14)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r6 == 0) goto L_0x013e
            int r1 = r6.f129274c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r1 == r5) goto L_0x013e
            com.toutiao.proxyserver.o r0 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r0 == 0) goto L_0x00cb
            int r0 = r22.mo107283g()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            boolean r2 = com.toutiao.proxyserver.p2610b.C51808b.m111117a(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r4 = r6.f129274c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r7 = r6.f129276e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r1 = r22
            r0 = r5
            r15 = r6
            r6 = r24
            r1.mo107276a(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            goto L_0x00cd
        L_0x00cb:
            r0 = r5
            r15 = r6
        L_0x00cd:
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "Content-Length not match, old: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r3 = r15.f129274c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", key: "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f129204h     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "，rawKey："
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r1, r2, r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.f r1 = new com.toutiao.proxyserver.f     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = "Content-Length not match, old length: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r3 = r15.f129274c     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r3 = ", new length: "
            r2.append(r3)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", rawKey: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r8.f129203g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", currentUrl: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r9)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = ", previousInfo: "
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r15.f129276e     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r2.append(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            throw r1     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
        L_0x013a:
            r0 = move-exception
            r13 = r14
            goto L_0x03be
        L_0x013e:
            boolean r1 = r7.f129544d     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r1 != 0) goto L_0x0164
            java.lang.String r0 = com.toutiao.proxyserver.p2614f.C51838d.m111170a(r14, r0)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r22.mo107282f()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.nio.charset.Charset r1 = com.toutiao.proxyserver.p2614f.C51838d.f129327a     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            int r1 = r0.length     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r7.mo107422a(r0, r15, r1)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            com.toutiao.proxyserver.d.b r0 = com.toutiao.proxyserver.C51895s.f129487v     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            if (r0 == 0) goto L_0x0164
            com.toutiao.proxyserver.d.b r0 = com.toutiao.proxyserver.C51895s.f129487v     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r1 = "videocache_write_header"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            java.lang.String r4 = r8.f129203g     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
            r0.mo95377a(r1, r2, r4)     // Catch:{ IOException -> 0x013a, all -> 0x03b3 }
        L_0x0164:
            r22.mo107282f()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.c r0 = r8.f129197a     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r1 = r8.f129204h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.io.File r1 = r0.mo107310e(r1)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            boolean r0 = r8.f129524r     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            if (r0 == 0) goto L_0x021c
            if (r1 == 0) goto L_0x021c
            long r2 = r1.length()     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r0 = r7.f129543c     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            long r4 = (long) r0     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x021c
            com.toutiao.proxyserver.b.c r0 = r8.f129198b     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.w r3 = r8.f129205i     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.w$a r3 = r3.f129548c     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            int r3 = r3.f129549a     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.p2614f.C51838d.m111168a(r14, r0, r2, r3)     // Catch:{ IOException -> 0x03b9, all -> 0x03b3 }
            com.toutiao.proxyserver.v r0 = new com.toutiao.proxyserver.v     // Catch:{ a -> 0x01b0 }
            java.lang.String r2 = "rwd"
            r0.<init>(r1, r2)     // Catch:{ a -> 0x01b0 }
            int r2 = r7.f129543c     // Catch:{ a -> 0x01b0 }
            long r2 = (long) r2     // Catch:{ a -> 0x01b0 }
            r0.mo107426a(r2)     // Catch:{ a -> 0x01b0 }
            com.toutiao.proxyserver.d r2 = new com.toutiao.proxyserver.d     // Catch:{ a -> 0x01b0 }
            r2.<init>(r0)     // Catch:{ a -> 0x01b0 }
            java.util.concurrent.Future r3 = r2.mo107313b()     // Catch:{ a -> 0x01ae, IOException -> 0x01aa, all -> 0x01a4 }
            goto L_0x01c0
        L_0x01a4:
            r0 = move-exception
            r13 = r2
            r16 = r14
            goto L_0x03b7
        L_0x01aa:
            r0 = move-exception
            r13 = r14
            goto L_0x03c9
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b2
        L_0x01b0:
            r0 = move-exception
            r2 = 0
        L_0x01b2:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.String r0 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0)     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            java.lang.String r4 = r8.f129203g     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r0, r4)     // Catch:{ IOException -> 0x0215, all -> 0x020f }
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x01c0:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0207, all -> 0x0200 }
            java.lang.String r6 = "can write to cache file in network task, cache file size: "
            r5.<init>(r6)     // Catch:{ IOException -> 0x0207, all -> 0x0200 }
            r16 = r14
            long r13 = r1.length()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r13)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = ", from: "
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            int r1 = r7.f129543c     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = "，rawKey："
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r8.f129203g     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = "， key:"
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r8.f129204h     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r5.append(r1)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            java.lang.String r5 = r8.f129203g     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r4, r1, r5)     // Catch:{ IOException -> 0x01fe, all -> 0x01fc }
            r13 = r2
            r14 = r3
            goto L_0x0258
        L_0x01fc:
            r0 = move-exception
            goto L_0x0203
        L_0x01fe:
            r0 = move-exception
            goto L_0x020a
        L_0x0200:
            r0 = move-exception
            r16 = r14
        L_0x0203:
            r13 = r2
            r14 = r3
            goto L_0x03e2
        L_0x0207:
            r0 = move-exception
            r16 = r14
        L_0x020a:
            r14 = r3
        L_0x020b:
            r13 = r16
            goto L_0x03ca
        L_0x020f:
            r0 = move-exception
            r16 = r14
            r13 = r2
            goto L_0x03b7
        L_0x0215:
            r0 = move-exception
            r16 = r14
            r13 = r16
            goto L_0x03c9
        L_0x021c:
            r16 = r14
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r3 = "can't write to cache file in network task, cache file size: "
            r2.<init>(r3)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            long r3 = r1.length()     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r3)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = ", from: "
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            int r1 = r7.f129543c     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = "，rawKey："
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r8.f129203g     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = "， key:"
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r8.f129204h     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r2.append(r1)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            com.toutiao.proxyserver.p2612d.C51820c.m111144c(r0, r1, r2)     // Catch:{ IOException -> 0x03b1, all -> 0x03af }
            r0 = 0
            r13 = 0
            r14 = 0
        L_0x0258:
            com.toutiao.proxyserver.b.c r1 = r8.f129198b     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r8.f129204h     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            int r3 = r22.mo107283g()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.b.a r1 = r1.mo107300a(r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r1 != 0) goto L_0x0268
            r5 = 0
            goto L_0x026b
        L_0x0268:
            int r1 = r1.f129274c     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r5 = r1
        L_0x026b:
            int r1 = com.toutiao.proxyserver.C51895s.f129477l     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            byte[] r6 = new byte[r1]     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.io.InputStream r4 = r16.mo107386d()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r17 = r0
        L_0x0275:
            if (r4 == 0) goto L_0x0312
            r22.mo107282f()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r22.mo107285i()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            int r3 = r4.read(r6)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.o r2 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r2 == 0) goto L_0x02a4
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r20 = 0
            long r18 = r18 - r0
            r1 = r22
            r0 = r3
            r3 = r24
            r20 = r4
            r4 = r0
            r21 = r5
            r15 = r6
            r5 = r18
            r1.mo107274a(r2, r3, r4, r5)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            goto L_0x02aa
        L_0x02a4:
            r0 = r3
            r20 = r4
            r21 = r5
            r15 = r6
        L_0x02aa:
            r22.mo107284h()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 < 0) goto L_0x030f
            if (r0 <= 0) goto L_0x0303
            r1 = 0
            r7.mo107423b(r15, r1, r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r1 = (long) r0     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r12.mo107328a(r1)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            long r3 = r12.mo107327a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r1.mo107297a(r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r13 == 0) goto L_0x02fb
            r1 = 0
            r13.mo107312a(r15, r1, r0)     // Catch:{ Throwable -> 0x02cd }
            goto L_0x02fb
        L_0x02cd:
            r0 = move-exception
            r1 = r0
            if (r17 == 0) goto L_0x02d6
            r17.mo107425a()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r17 = 0
        L_0x02d6:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r3 = "append to cache file error in network task!!! "
            r2.<init>(r3)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r1 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            r2.append(r1)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            java.lang.String r2 = r8.f129203g     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r0, r1, r2)     // Catch:{ IOException -> 0x02f5, all -> 0x02f1 }
            r13 = 0
            goto L_0x02fb
        L_0x02f1:
            r0 = move-exception
            r13 = 0
            goto L_0x03e2
        L_0x02f5:
            r0 = move-exception
            r13 = r16
            r2 = 0
            goto L_0x03ca
        L_0x02fb:
            int r0 = r7.f129543c     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r1 = r21
            r8.mo107272a(r1, r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            goto L_0x0305
        L_0x0303:
            r1 = r21
        L_0x0305:
            r22.mo107282f()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r5 = r1
            r6 = r15
            r4 = r20
            r15 = 0
            goto L_0x0275
        L_0x030f:
            r1 = r21
            goto L_0x0313
        L_0x0312:
            r1 = r5
        L_0x0313:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = "read from net complete!，rawKey："
            r2.<init>(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = "， key:"
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f129204h     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = ", url:"
            r2.append(r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r2.append(r9)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r3 = r8.f129203g     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r0, r2, r3)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            java.lang.String r0 = "complete"
            int r2 = r8.f129207k     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r3 = 0
            r8.mo107275a(r3, r0, r2)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r22.mo107280d()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.o r0 = com.toutiao.proxyserver.C51895s.f129471f     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 == 0) goto L_0x0357
            int r0 = r7.f129543c     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            if (r0 < r1) goto L_0x0357
            com.toutiao.proxyserver.u$4 r0 = new com.toutiao.proxyserver.u$4     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            r0.<init>()     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.p2614f.C51838d.m111186b(r0)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
        L_0x0357:
            r1 = 0
            com.toutiao.proxyserver.C51895s.m111277a(r1, r9)     // Catch:{ IOException -> 0x03ab, all -> 0x03a9 }
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107322c()
            com.toutiao.proxyserver.e.c r0 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r0.mo107324e()
            com.toutiao.proxyserver.p2614f.C51838d.m111175a(r16)
            if (r13 == 0) goto L_0x0371
            r13.mo107311a()
        L_0x0371:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.f129199c
            long r1 = r12.mo107327a()
            int r1 = (int) r1
            r0.addAndGet(r1)
            java.util.concurrent.atomic.AtomicLong r0 = r8.f129200d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r10
            r0.addAndGet(r1)
            java.lang.String r0 = "proxy"
            r8.mo107273a(r0)
            java.lang.String r0 = "finally"
            int r1 = r8.f129207k
            r2 = 0
            r8.mo107275a(r2, r0, r1)
            com.toutiao.proxyserver.ac r0 = com.toutiao.proxyserver.C51802ac.m111110a()
            java.lang.String r1 = r8.f129203g
            java.util.concurrent.atomic.AtomicInteger r2 = r8.f129199c
            int r2 = r2.get()
            long r2 = (long) r2
            r0.mo107297a(r1, r2)
            if (r14 == 0) goto L_0x03a8
            r14.get()     // Catch:{ InterruptedException | ExecutionException -> 0x03a7 }
        L_0x03a7:
            return
        L_0x03a8:
            return
        L_0x03a9:
            r0 = move-exception
            goto L_0x03e2
        L_0x03ab:
            r0 = move-exception
            r2 = r13
            goto L_0x020b
        L_0x03af:
            r0 = move-exception
            goto L_0x03b6
        L_0x03b1:
            r0 = move-exception
            goto L_0x03bc
        L_0x03b3:
            r0 = move-exception
            r16 = r14
        L_0x03b6:
            r13 = 0
        L_0x03b7:
            r14 = 0
            goto L_0x03e2
        L_0x03b9:
            r0 = move-exception
            r16 = r14
        L_0x03bc:
            r13 = r16
        L_0x03be:
            r2 = 0
            goto L_0x03c9
        L_0x03c0:
            r0 = move-exception
            r13 = 0
            r14 = 0
            r16 = 0
            goto L_0x03e2
        L_0x03c6:
            r0 = move-exception
            r2 = 0
            r13 = 0
        L_0x03c9:
            r14 = 0
        L_0x03ca:
            java.lang.String r1 = "Canceled"
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x03de }
            boolean r1 = r1.equalsIgnoreCase(r3)     // Catch:{ all -> 0x03de }
            if (r1 != 0) goto L_0x03dd
            java.lang.String r1 = "exception"
            int r3 = r8.f129207k     // Catch:{ all -> 0x03de }
            r8.mo107275a(r0, r1, r3)     // Catch:{ all -> 0x03de }
        L_0x03dd:
            throw r0     // Catch:{ all -> 0x03de }
        L_0x03de:
            r0 = move-exception
            r16 = r13
            r13 = r2
        L_0x03e2:
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r1.mo107322c()
            com.toutiao.proxyserver.e.c r1 = com.toutiao.proxyserver.p2613e.C51826c.m111151a()
            r1.mo107324e()
            com.toutiao.proxyserver.p2614f.C51838d.m111175a(r16)
            if (r13 == 0) goto L_0x03f8
            r13.mo107311a()
        L_0x03f8:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f129199c
            long r2 = r12.mo107327a()
            int r2 = (int) r2
            r1.addAndGet(r2)
            java.util.concurrent.atomic.AtomicLong r1 = r8.f129200d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r10
            r1.addAndGet(r2)
            java.lang.String r1 = "proxy"
            r8.mo107273a(r1)
            java.lang.String r1 = "finally"
            int r2 = r8.f129207k
            r3 = 0
            r8.mo107275a(r3, r1, r2)
            com.toutiao.proxyserver.ac r1 = com.toutiao.proxyserver.C51802ac.m111110a()
            java.lang.String r2 = r8.f129203g
            java.util.concurrent.atomic.AtomicInteger r3 = r8.f129199c
            int r3 = r3.get()
            long r3 = (long) r3
            r1.mo107297a(r2, r3)
            if (r14 == 0) goto L_0x042e
            r14.get()     // Catch:{ InterruptedException | ExecutionException -> 0x042e }
        L_0x042e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51904u.m111294a(com.toutiao.proxyserver.u$b, java.lang.String):void");
    }

    /* renamed from: a */
    private byte[] m111297a(C51807a aVar, C51910b bVar, String str) throws IOException {
        if (aVar != null) {
            C51820c.m111142b("TAG_PROXY_ProxyTask", "get header from db", this.f129203g);
            return C51838d.m111169a(aVar, bVar.f129543c).getBytes(C51838d.f129327a);
        }
        C51877e a = mo107270a(str, 0, -1, "HEAD");
        C51838d.m111174a(a, false, false);
        C51807a a2 = C51838d.m111168a(a, this.f129198b, this.f129204h, this.f129205i.f129548c.f129549a);
        C51820c.m111144c("TAG_PROXY_ProxyTask", "get header from network", this.f129203g);
        return C51838d.m111169a(a2, bVar.f129543c).getBytes(C51838d.f129327a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0312 A[SYNTHETIC, Splitter:B:110:0x0312] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m111293a(com.toutiao.proxyserver.p2610b.C51807a r25, java.io.File r26, com.toutiao.proxyserver.C51904u.C51910b r27, java.lang.String r28) throws java.lang.Exception {
        /*
            r24 = this;
            r9 = r24
            r0 = r25
            r1 = r27
            r8 = r28
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "processCacheNetWorkConcurrent() called with: headerInfo = ["
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "], url = ["
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111140a(r2, r3, r4)
            boolean r2 = r1.f129544d
            r3 = 0
            if (r2 != 0) goto L_0x005c
            com.toutiao.proxyserver.d.b r2 = com.toutiao.proxyserver.C51895s.f129487v
            if (r2 == 0) goto L_0x0040
            com.toutiao.proxyserver.d.b r2 = com.toutiao.proxyserver.C51895s.f129487v
            java.lang.String r4 = "videocache_start_request"
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r7 = r9.f129203g
            r2.mo95377a(r4, r5, r7)
        L_0x0040:
            byte[] r2 = r9.m111297a(r0, r1, r8)
            r24.mo107282f()
            int r4 = r2.length
            r1.mo107422a(r2, r3, r4)
            com.toutiao.proxyserver.d.b r2 = com.toutiao.proxyserver.C51895s.f129487v
            if (r2 == 0) goto L_0x005c
            com.toutiao.proxyserver.d.b r2 = com.toutiao.proxyserver.C51895s.f129487v
            java.lang.String r4 = "videocache_write_header"
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r7 = r9.f129203g
            r2.mo95377a(r4, r5, r7)
        L_0x005c:
            if (r0 != 0) goto L_0x008e
            com.toutiao.proxyserver.b.c r0 = r9.f129198b
            java.lang.String r2 = r9.f129204h
            com.toutiao.proxyserver.w r4 = r9.f129205i
            com.toutiao.proxyserver.w$a r4 = r4.f129548c
            int r4 = r4.f129549a
            com.toutiao.proxyserver.b.a r0 = r0.mo107300a(r2, r4)
            if (r0 == 0) goto L_0x006f
            goto L_0x008e
        L_0x006f:
            java.lang.String r0 = r9.f129203g
            java.lang.String r1 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info"
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r1, r2, r0)
            com.toutiao.proxyserver.x r0 = new com.toutiao.proxyserver.x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to get video header info. key = "
            r1.<init>(r2)
            java.lang.String r2 = r9.f129203g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            int r0 = r0.f129274c
            long r4 = r26.length()
            long r6 = (long) r0
            r2 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0125
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[processCacheNetWorkConcurrent] need to download. ，rawKey："
            r5.<init>(r6)
            java.lang.String r6 = r9.f129203g
            r5.append(r6)
            java.lang.String r6 = "， key:"
            r5.append(r6)
            java.lang.String r6 = r9.f129204h
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r4, r5, r6)
            com.toutiao.proxyserver.i r4 = r9.f129522p
            if (r4 == 0) goto L_0x00ce
            boolean r5 = r4.mo107279c()
            if (r5 != 0) goto L_0x00ce
            boolean r4 = r4.mo107281e()
            if (r4 == 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r4 = r2
            goto L_0x0123
        L_0x00ce:
            r24.m111299l()
            com.toutiao.proxyserver.i$a r4 = new com.toutiao.proxyserver.i$a
            r4.<init>()
            com.toutiao.proxyserver.c r5 = r9.f129197a
            com.toutiao.proxyserver.i$a r4 = r4.mo107357a(r5)
            com.toutiao.proxyserver.b.c r5 = r9.f129198b
            com.toutiao.proxyserver.i$a r4 = r4.mo107356a(r5)
            java.lang.String r5 = r9.f129203g
            com.toutiao.proxyserver.i$a r4 = r4.mo107360a(r5)
            java.lang.String r5 = r9.f129204h
            com.toutiao.proxyserver.i$a r4 = r4.mo107364b(r5)
            com.toutiao.proxyserver.ab r5 = new com.toutiao.proxyserver.ab
            com.toutiao.proxyserver.ab r6 = r9.f129206j
            java.util.List<java.lang.String> r6 = r6.f129260a
            r5.<init>(r6)
            com.toutiao.proxyserver.i$a r4 = r4.mo107355a(r5)
            java.util.List r5 = r9.f129201e
            com.toutiao.proxyserver.i$a r4 = r4.mo107361a(r5)
            com.toutiao.proxyserver.w r5 = r9.f129205i
            r4.f129384i = r5
            com.toutiao.proxyserver.u$2 r5 = new com.toutiao.proxyserver.u$2
            r5.<init>()
            com.toutiao.proxyserver.i$a r4 = r4.mo107358a(r5)
            com.toutiao.proxyserver.i r4 = r4.mo107363a()
            r9.f129522p = r4
            java.util.concurrent.ExecutorService r5 = r9.f129521o
            java.util.concurrent.Future r4 = r5.submit(r4)
            java.lang.String r5 = "TAG_PROXY_ProxyTask"
            java.lang.String r6 = "fire download in process cache task"
            java.lang.String r7 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r5, r6, r7)
        L_0x0123:
            r10 = r4
            goto L_0x0153
        L_0x0125:
            java.lang.String r4 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[processCacheNetWorkConcurrent] This video has been totally downloaded ，rawKey："
            r5.<init>(r6)
            java.lang.String r6 = r9.f129203g
            r5.append(r6)
            java.lang.String r6 = "， key:"
            r5.append(r6)
            java.lang.String r6 = r9.f129204h
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r9.f129203g
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r4, r5, r6)
            com.toutiao.proxyserver.o r4 = com.toutiao.proxyserver.C51895s.f129471f
            if (r4 == 0) goto L_0x0152
            com.toutiao.proxyserver.u$3 r4 = new com.toutiao.proxyserver.u$3
            r4.<init>(r0)
            com.toutiao.proxyserver.p2614f.C51838d.m111186b(r4)
        L_0x0152:
            r10 = r2
        L_0x0153:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]
            com.toutiao.proxyserver.v r11 = new com.toutiao.proxyserver.v     // Catch:{ all -> 0x0306 }
            java.lang.String r5 = "r"
            r6 = r26
            r11.<init>(r6, r5)     // Catch:{ all -> 0x0306 }
            int r2 = r1.f129543c     // Catch:{ all -> 0x0304 }
            long r5 = (long) r2     // Catch:{ all -> 0x0304 }
            r11.mo107426a(r5)     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.w r2 = r9.f129205i     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.w$a r2 = r2.f129548c     // Catch:{ all -> 0x0304 }
            int r2 = r2.f129553e     // Catch:{ all -> 0x0304 }
            if (r2 <= 0) goto L_0x0178
            com.toutiao.proxyserver.w r2 = r9.f129205i     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.w$a r2 = r2.f129548c     // Catch:{ all -> 0x0304 }
            int r2 = r2.f129553e     // Catch:{ all -> 0x0304 }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0304 }
        L_0x0178:
            r2 = r0
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = "read cache file start getCurrentOffset:"
            r5.<init>(r6)     // Catch:{ all -> 0x0304 }
            int r6 = r1.f129543c     // Catch:{ all -> 0x0304 }
            r5.append(r6)     // Catch:{ all -> 0x0304 }
            java.lang.String r6 = ", maxLen:"
            r5.append(r6)     // Catch:{ all -> 0x0304 }
            r5.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.p2612d.C51820c.m111141b(r0, r5)     // Catch:{ all -> 0x0304 }
            r0 = 0
            r12 = 0
            r14 = 0
            r16 = 0
        L_0x019d:
            int r7 = r1.f129543c     // Catch:{ all -> 0x0304 }
            if (r7 >= r2) goto L_0x02ac
            r24.mo107282f()     // Catch:{ all -> 0x0304 }
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0304 }
            int r7 = r11.mo107424a(r4)     // Catch:{ all -> 0x0304 }
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0304 }
            r22 = 0
            long r20 = r20 - r18
            long r12 = r12 + r20
            long r5 = (long) r7     // Catch:{ all -> 0x0304 }
            long r14 = r14 + r5
            if (r7 > 0) goto L_0x029d
            com.toutiao.proxyserver.i r5 = r9.f129522p     // Catch:{ all -> 0x0304 }
            if (r5 == 0) goto L_0x01c4
            java.lang.Exception r6 = r5.f129363n     // Catch:{ all -> 0x0304 }
            if (r6 != 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            throw r6     // Catch:{ all -> 0x0304 }
        L_0x01c4:
            if (r5 == 0) goto L_0x0266
            boolean r6 = r5.mo107279c()     // Catch:{ all -> 0x0304 }
            if (r6 != 0) goto L_0x0266
            boolean r6 = r5.mo107281e()     // Catch:{ all -> 0x0304 }
            if (r6 != 0) goto L_0x0266
            int r6 = r0 + 1
            r0 = 15
            if (r6 <= r0) goto L_0x0216
            r18 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x01df
            goto L_0x0216
        L_0x01df:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "wait data too long!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129204h     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r0, r1, r2)     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.x r0 = new com.toutiao.proxyserver.x     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "wait data too long!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0304 }
            r0.<init>(r1)     // Catch:{ all -> 0x0304 }
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x0216:
            r24.mo107282f()     // Catch:{ all -> 0x0304 }
            java.lang.Object r7 = r5.f129362m     // Catch:{ all -> 0x0304 }
            monitor-enter(r7)     // Catch:{ all -> 0x0304 }
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            java.lang.Object r0 = r5.f129362m     // Catch:{ InterruptedException -> 0x0237 }
            r23 = r4
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x0233 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            r0 = 0
        L_0x022e:
            long r3 = r3 - r18
            long r16 = r16 + r3
            goto L_0x0259
        L_0x0233:
            r0 = move-exception
            goto L_0x023a
        L_0x0235:
            r0 = move-exception
            goto L_0x025f
        L_0x0237:
            r0 = move-exception
            r23 = r4
        L_0x023a:
            java.lang.String r3 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0235 }
            java.lang.String r5 = "InterruptedException: "
            r4.<init>(r5)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r0)     // Catch:{ all -> 0x0235 }
            r4.append(r0)     // Catch:{ all -> 0x0235 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0235 }
            java.lang.String r4 = r9.f129203g     // Catch:{ all -> 0x0235 }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r3, r0, r4)     // Catch:{ all -> 0x0235 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            r0 = 0
            goto L_0x022e
        L_0x0259:
            monitor-exit(r7)     // Catch:{ all -> 0x0263 }
            r0 = r6
            r3 = r23
            r4 = 0
            goto L_0x02a5
        L_0x025f:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x0263 }
        L_0x0263:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x0266:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "download task has finished!!!，rawKey："
            r1.<init>(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "， key:"
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129204h     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.p2612d.C51820c.m111146d(r0, r1, r2)     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.x r0 = new com.toutiao.proxyserver.x     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "download task has finished!!! key = "
            r1.<init>(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0304 }
            r0.<init>(r1)     // Catch:{ all -> 0x0304 }
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x029d:
            r3 = r4
            r4 = 0
            r1.mo107423b(r3, r4, r7)     // Catch:{ all -> 0x0304 }
            r0 = 0
            r16 = 0
        L_0x02a5:
            r24.mo107282f()     // Catch:{ all -> 0x0304 }
            r4 = r3
            r3 = 0
            goto L_0x019d
        L_0x02ac:
            java.lang.String r0 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            java.lang.String r4 = "read cache file complete: "
            r3.<init>(r4)     // Catch:{ all -> 0x0304 }
            int r1 = r1.f129543c     // Catch:{ all -> 0x0304 }
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            r3.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = "，rawKey："
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r9.f129203g     // Catch:{ all -> 0x0304 }
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = "， key:"
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r9.f129204h     // Catch:{ all -> 0x0304 }
            r3.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = r9.f129203g     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.p2612d.C51820c.m111142b(r0, r1, r2)     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.n r0 = com.toutiao.proxyserver.C51895s.f129472g     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x02f4
            java.lang.String r7 = r9.f129203g     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.a$5 r0 = new com.toutiao.proxyserver.a$5     // Catch:{ all -> 0x0304 }
            r1 = r0
            r2 = r24
            r3 = r14
            r5 = r12
            r8 = r28
            r1.<init>(r3, r5, r7, r8)     // Catch:{ all -> 0x0304 }
            com.toutiao.proxyserver.p2614f.C51838d.m111186b(r0)     // Catch:{ all -> 0x0304 }
        L_0x02f4:
            r24.mo107280d()     // Catch:{ all -> 0x0304 }
            r11.mo107425a()
            r24.m111300m()
            if (r10 == 0) goto L_0x0303
            r10.get()     // Catch:{ Throwable -> 0x0302 }
        L_0x0302:
            return
        L_0x0303:
            return
        L_0x0304:
            r0 = move-exception
            goto L_0x0308
        L_0x0306:
            r0 = move-exception
            r11 = r2
        L_0x0308:
            if (r11 == 0) goto L_0x030d
            r11.mo107425a()
        L_0x030d:
            r24.m111300m()
            if (r10 == 0) goto L_0x0315
            r10.get()     // Catch:{ Throwable -> 0x0315 }
        L_0x0315:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51904u.m111293a(com.toutiao.proxyserver.b.a, java.io.File, com.toutiao.proxyserver.u$b, java.lang.String):void");
    }

    /* renamed from: a */
    private void m111295a(boolean z, int i, int i2, int i3, int i4) {
        final C51880o oVar = C51895s.f129471f;
        if (oVar != null) {
            final boolean z2 = z;
            final int i5 = i;
            final int i6 = i2;
            final int i7 = i3;
            final int i8 = i4;
            C519051 r0 = new Runnable() {
                public final void run() {
                    C51914w wVar = C51904u.this.f129205i;
                    C51914w wVar2 = C51904u.this.f129205i;
                }
            };
            C51838d.m111186b((Runnable) r0);
        }
    }
}
