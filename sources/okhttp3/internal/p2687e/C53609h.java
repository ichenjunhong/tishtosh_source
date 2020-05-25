package okhttp3.internal.p2687e;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* renamed from: okhttp3.internal.e.h */
final class C53609h implements Closeable {

    /* renamed from: a */
    static final Logger f132923a = Logger.getLogger(C53591e.class.getName());

    /* renamed from: b */
    final BufferedSource f132924b;

    /* renamed from: c */
    final boolean f132925c;

    /* renamed from: d */
    final C53589a f132926d = new C53589a(4096, this.f132927e);

    /* renamed from: e */
    private final C53610a f132927e = new C53610a(this.f132924b);

    /* renamed from: okhttp3.internal.e.h$a */
    static final class C53610a implements Source {

        /* renamed from: a */
        int f132928a;

        /* renamed from: b */
        byte f132929b;

        /* renamed from: c */
        int f132930c;

        /* renamed from: d */
        int f132931d;

        /* renamed from: e */
        short f132932e;

        /* renamed from: f */
        private final BufferedSource f132933f;

        public final void close() throws IOException {
        }

        public final Timeout timeout() {
            return this.f132933f.timeout();
        }

        C53610a(BufferedSource bufferedSource) {
            this.f132933f = bufferedSource;
        }

        public final long read(Buffer buffer, long j) throws IOException {
            while (this.f132931d == 0) {
                this.f132933f.skip((long) this.f132932e);
                this.f132932e = 0;
                if ((this.f132929b & 4) != 0) {
                    return -1;
                }
                int i = this.f132930c;
                int a = C53609h.m113938a(this.f132933f);
                this.f132931d = a;
                this.f132928a = a;
                byte readByte = (byte) (this.f132933f.readByte() & 255);
                this.f132929b = (byte) (this.f132933f.readByte() & 255);
                if (C53609h.f132923a.isLoggable(Level.FINE)) {
                    C53609h.f132923a.fine(C53591e.m113891a(true, this.f132930c, this.f132928a, readByte, this.f132929b));
                }
                this.f132930c = this.f132933f.readInt() & Integer.MAX_VALUE;
                if (readByte != 9) {
                    throw C53591e.m113892b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                } else if (this.f132930c != i) {
                    throw C53591e.m113892b("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            long read = this.f132933f.read(buffer, Math.min(j, (long) this.f132931d));
            if (read == -1) {
                return -1;
            }
            this.f132931d = (int) (((long) this.f132931d) - read);
            return read;
        }
    }

    /* renamed from: okhttp3.internal.e.h$b */
    interface C53611b {
        /* renamed from: a */
        void mo111450a(int i, int i2, List<C53587c> list) throws IOException;

        /* renamed from: a */
        void mo111451a(int i, long j);

        /* renamed from: a */
        void mo111452a(int i, C53586b bVar);

        /* renamed from: a */
        void mo111453a(int i, C53586b bVar, ByteString byteString);

        /* renamed from: a */
        void mo111454a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo111455a(boolean z, int i, int i2, List<C53587c> list);

        /* renamed from: a */
        void mo111456a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* renamed from: a */
        void mo111457a(boolean z, C53621m mVar);
    }

    public final void close() throws IOException {
        this.f132924b.close();
    }

    /* renamed from: a */
    static int m113938a(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: a */
    private void m113940a(C53611b bVar, int i) throws IOException {
        this.f132924b.readInt();
        this.f132924b.readByte();
    }

    C53609h(BufferedSource bufferedSource, boolean z) {
        this.f132924b = bufferedSource;
        this.f132925c = z;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [int, short] */
    /* JADX WARNING: type inference failed for: r0v6, types: [short] */
    /* JADX WARNING: type inference failed for: r0v7, types: [short] */
    /* JADX WARNING: type inference failed for: r0v12, types: [short] */
    /* JADX WARNING: type inference failed for: r0v13, types: [short] */
    /* JADX WARNING: type inference failed for: r0v17, types: [short] */
    /* JADX WARNING: type inference failed for: r0v18, types: [boolean] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v25
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], short, ?[boolean, int, float, short, byte, char]]
      uses: [short, int, boolean]
      mth insns count: 279
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo111458a(boolean r11, okhttp3.internal.p2687e.C53609h.C53611b r12) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            okio.BufferedSource r1 = r10.f132924b     // Catch:{ IOException -> 0x02b6 }
            r2 = 9
            r1.require(r2)     // Catch:{ IOException -> 0x02b6 }
            okio.BufferedSource r1 = r10.f132924b
            int r1 = m113938a(r1)
            r2 = 1
            if (r1 < 0) goto L_0x02a7
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r3) goto L_0x02a7
            okio.BufferedSource r4 = r10.f132924b
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 4
            if (r11 == 0) goto L_0x0033
            if (r4 != r5) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Byte r12 = java.lang.Byte.valueOf(r4)
            r11[r0] = r12
            java.lang.String r12 = "Expected a SETTINGS frame but was %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0033:
            okio.BufferedSource r11 = r10.f132924b
            byte r11 = r11.readByte()
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            okio.BufferedSource r6 = r10.f132924b
            int r6 = r6.readInt()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.util.logging.Logger r8 = f132923a
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r8 = r8.isLoggable(r9)
            if (r8 == 0) goto L_0x0059
            java.util.logging.Logger r8 = f132923a
            java.lang.String r9 = okhttp3.internal.p2687e.C53591e.m113891a(r2, r6, r1, r4, r11)
            r8.fine(r9)
        L_0x0059:
            r8 = 8
            switch(r4) {
                case 0: goto L_0x0265;
                case 1: goto L_0x0230;
                case 2: goto L_0x020e;
                case 3: goto L_0x01d2;
                case 4: goto L_0x0149;
                case 5: goto L_0x011b;
                case 6: goto L_0x00ea;
                case 7: goto L_0x009c;
                case 8: goto L_0x0066;
                default: goto L_0x005e;
            }
        L_0x005e:
            okio.BufferedSource r11 = r10.f132924b
            long r0 = (long) r1
            r11.skip(r0)
            goto L_0x02a6
        L_0x0066:
            if (r1 != r5) goto L_0x008d
            okio.BufferedSource r11 = r10.f132924b
            int r11 = r11.readInt()
            long r3 = (long) r11
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r3 = r3 & r7
            r7 = 0
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007e
            r12.mo111451a(r6, r3)
            goto L_0x02a6
        L_0x007e:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "windowSizeIncrement was 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_WINDOW_UPDATE length !=4: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x009c:
            if (r1 < r8) goto L_0x00db
            if (r6 != 0) goto L_0x00d2
            okio.BufferedSource r11 = r10.f132924b
            int r11 = r11.readInt()
            okio.BufferedSource r3 = r10.f132924b
            int r3 = r3.readInt()
            int r1 = r1 - r8
            okhttp3.internal.e.b r4 = okhttp3.internal.p2687e.C53586b.fromHttp2(r3)
            if (r4 == 0) goto L_0x00c3
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r1 <= 0) goto L_0x00be
            okio.BufferedSource r0 = r10.f132924b
            long r5 = (long) r1
            okio.ByteString r0 = r0.readByteString(r5)
        L_0x00be:
            r12.mo111453a(r11, r4, r0)
            goto L_0x02a6
        L_0x00c3:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY unexpected error code: %d"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x00d2:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_GOAWAY streamId != 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x00db:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_GOAWAY length < 8: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x00ea:
            if (r1 != r8) goto L_0x010c
            if (r6 != 0) goto L_0x0103
            okio.BufferedSource r1 = r10.f132924b
            int r1 = r1.readInt()
            okio.BufferedSource r3 = r10.f132924b
            int r3 = r3.readInt()
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00fe
            r0 = 1
        L_0x00fe:
            r12.mo111454a(r0, r1, r3)
            goto L_0x02a6
        L_0x0103:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PING streamId != 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x010c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PING length != 8: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x011b:
            if (r6 == 0) goto L_0x0140
            r3 = r11 & 8
            if (r3 == 0) goto L_0x012a
            okio.BufferedSource r0 = r10.f132924b
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x012a:
            okio.BufferedSource r3 = r10.f132924b
            int r3 = r3.readInt()
            r3 = r3 & r7
            int r1 = r1 + -4
            int r1 = m113937a(r1, r11, r0)
            java.util.List r11 = r10.m113939a(r1, r0, r11, r6)
            r12.mo111450a(r6, r3, r11)
            goto L_0x02a6
        L_0x0140:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0149:
            if (r6 != 0) goto L_0x01c9
            r11 = r11 & r2
            if (r11 == 0) goto L_0x015b
            if (r1 != 0) goto L_0x0152
            goto L_0x02a6
        L_0x0152:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x015b:
            int r11 = r1 % 6
            if (r11 != 0) goto L_0x01ba
            okhttp3.internal.e.m r11 = new okhttp3.internal.e.m
            r11.<init>()
            r4 = 0
        L_0x0165:
            if (r4 >= r1) goto L_0x01b5
            okio.BufferedSource r6 = r10.f132924b
            short r6 = r6.readShort()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            okio.BufferedSource r7 = r10.f132924b
            int r7 = r7.readInt()
            switch(r6) {
                case 1: goto L_0x01af;
                case 2: goto L_0x01a1;
                case 3: goto L_0x019f;
                case 4: goto L_0x0192;
                case 5: goto L_0x017b;
                default: goto L_0x017a;
            }
        L_0x017a:
            goto L_0x01af
        L_0x017b:
            if (r7 < r3) goto L_0x0183
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r7 > r8) goto L_0x0183
            goto L_0x01af
        L_0x0183:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r0] = r12
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0192:
            r6 = 7
            if (r7 < 0) goto L_0x0196
            goto L_0x01af
        L_0x0196:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x019f:
            r6 = 4
            goto L_0x01af
        L_0x01a1:
            if (r7 == 0) goto L_0x01af
            if (r7 != r2) goto L_0x01a6
            goto L_0x01af
        L_0x01a6:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x01af:
            r11.mo111488a(r6, r7)
            int r4 = r4 + 6
            goto L_0x0165
        L_0x01b5:
            r12.mo111457a(r0, r11)
            goto L_0x02a6
        L_0x01ba:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x01c9:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_SETTINGS streamId != 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x01d2:
            if (r1 != r5) goto L_0x01ff
            if (r6 == 0) goto L_0x01f6
            okio.BufferedSource r11 = r10.f132924b
            int r11 = r11.readInt()
            okhttp3.internal.e.b r1 = okhttp3.internal.p2687e.C53586b.fromHttp2(r11)
            if (r1 == 0) goto L_0x01e7
            r12.mo111452a(r6, r1)
            goto L_0x02a6
        L_0x01e7:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r0] = r11
            java.lang.String r11 = "TYPE_RST_STREAM unexpected error code: %d"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r11, r12)
            throw r11
        L_0x01f6:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_RST_STREAM streamId == 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x01ff:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_RST_STREAM length: %d != 4"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x020e:
            r11 = 5
            if (r1 != r11) goto L_0x0221
            if (r6 == 0) goto L_0x0218
            r10.m113940a(r12, r6)
            goto L_0x02a6
        L_0x0218:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "TYPE_PRIORITY streamId == 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0221:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "TYPE_PRIORITY length: %d != 5"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0230:
            if (r6 == 0) goto L_0x025c
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0238
            r3 = 1
            goto L_0x0239
        L_0x0238:
            r3 = 0
        L_0x0239:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0246
            okio.BufferedSource r0 = r10.f132924b
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0246:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x024f
            r10.m113940a(r12, r6)
            int r1 = r1 + -5
        L_0x024f:
            int r1 = m113937a(r1, r11, r0)
            java.util.List r11 = r10.m113939a(r1, r0, r11, r6)
            r0 = -1
            r12.mo111455a(r3, r6, r0, r11)
            goto L_0x02a6
        L_0x025c:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x0265:
            if (r6 == 0) goto L_0x029d
            r3 = r11 & 1
            if (r3 == 0) goto L_0x026d
            r3 = 1
            goto L_0x026e
        L_0x026d:
            r3 = 0
        L_0x026e:
            r4 = r11 & 32
            if (r4 == 0) goto L_0x0274
            r4 = 1
            goto L_0x0275
        L_0x0274:
            r4 = 0
        L_0x0275:
            if (r4 != 0) goto L_0x0294
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0284
            okio.BufferedSource r0 = r10.f132924b
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
        L_0x0284:
            int r11 = m113937a(r1, r11, r0)
            okio.BufferedSource r1 = r10.f132924b
            r12.mo111456a(r3, r6, r1, r11)
            okio.BufferedSource r11 = r10.f132924b
            long r0 = (long) r0
            r11.skip(r0)
            goto L_0x02a6
        L_0x0294:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x029d:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x02a6:
            return r2
        L_0x02a7:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11[r0] = r12
            java.lang.String r12 = "FRAME_SIZE_ERROR: %s"
            java.io.IOException r11 = okhttp3.internal.p2687e.C53591e.m113892b(r12, r11)
            throw r11
        L_0x02b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53609h.mo111458a(boolean, okhttp3.internal.e.h$b):boolean");
    }

    /* renamed from: a */
    private static int m113937a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C53591e.m113892b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: a */
    private List<C53587c> m113939a(int i, short s, byte b, int i2) throws IOException {
        C53610a aVar = this.f132927e;
        this.f132927e.f132931d = i;
        aVar.f132928a = i;
        this.f132927e.f132932e = s;
        this.f132927e.f132929b = b;
        this.f132927e.f132930c = i2;
        this.f132926d.mo111433a();
        return this.f132926d.mo111434b();
    }
}
