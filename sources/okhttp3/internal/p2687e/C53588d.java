package okhttp3.internal.p2687e;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.C53559c;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* renamed from: okhttp3.internal.e.d */
final class C53588d {

    /* renamed from: a */
    static final C53587c[] f132818a = {new C53587c(C53587c.f132814f, ""), new C53587c(C53587c.f132811c, "GET"), new C53587c(C53587c.f132811c, "POST"), new C53587c(C53587c.f132812d, "/"), new C53587c(C53587c.f132812d, "/index.html"), new C53587c(C53587c.f132813e, WebKitApi.SCHEME_HTTP), new C53587c(C53587c.f132813e, WebKitApi.SCHEME_HTTPS), new C53587c(C53587c.f132810b, "200"), new C53587c(C53587c.f132810b, "204"), new C53587c(C53587c.f132810b, "206"), new C53587c(C53587c.f132810b, "304"), new C53587c(C53587c.f132810b, "400"), new C53587c(C53587c.f132810b, "404"), new C53587c(C53587c.f132810b, "500"), new C53587c("accept-charset", ""), new C53587c("accept-encoding", "gzip, deflate"), new C53587c("accept-language", ""), new C53587c("accept-ranges", ""), new C53587c("accept", ""), new C53587c("access-control-allow-origin", ""), new C53587c("age", ""), new C53587c("allow", ""), new C53587c("authorization", ""), new C53587c("cache-control", ""), new C53587c("content-disposition", ""), new C53587c("content-encoding", ""), new C53587c("content-language", ""), new C53587c("content-length", ""), new C53587c("content-location", ""), new C53587c("content-range", ""), new C53587c("content-type", ""), new C53587c("cookie", ""), new C53587c("date", ""), new C53587c("etag", ""), new C53587c("expect", ""), new C53587c("expires", ""), new C53587c("from", ""), new C53587c("host", ""), new C53587c("if-match", ""), new C53587c("if-modified-since", ""), new C53587c("if-none-match", ""), new C53587c("if-range", ""), new C53587c("if-unmodified-since", ""), new C53587c("last-modified", ""), new C53587c("link", ""), new C53587c("location", ""), new C53587c("max-forwards", ""), new C53587c("proxy-authenticate", ""), new C53587c("proxy-authorization", ""), new C53587c("range", ""), new C53587c("referer", ""), new C53587c("refresh", ""), new C53587c("retry-after", ""), new C53587c("server", ""), new C53587c("set-cookie", ""), new C53587c("strict-transport-security", ""), new C53587c("transfer-encoding", ""), new C53587c("user-agent", ""), new C53587c("vary", ""), new C53587c("via", ""), new C53587c("www-authenticate", "")};

    /* renamed from: b */
    static final Map<ByteString, Integer> f132819b;

    /* renamed from: okhttp3.internal.e.d$a */
    static final class C53589a {

        /* renamed from: a */
        public int f132820a;

        /* renamed from: b */
        C53587c[] f132821b;

        /* renamed from: c */
        int f132822c;

        /* renamed from: d */
        int f132823d;

        /* renamed from: e */
        int f132824e;

        /* renamed from: f */
        private final List<C53587c> f132825f;

        /* renamed from: g */
        private final BufferedSource f132826g;

        /* renamed from: h */
        private final int f132827h;

        /* renamed from: e */
        private int m113879e() throws IOException {
            return this.f132826g.readByte() & 255;
        }

        /* renamed from: b */
        public final List<C53587c> mo111434b() {
            ArrayList arrayList = new ArrayList(this.f132825f);
            this.f132825f.clear();
            return arrayList;
        }

        /* renamed from: c */
        private void m113876c() {
            if (this.f132820a < this.f132824e) {
                if (this.f132820a == 0) {
                    m113877d();
                    return;
                }
                m113871a(this.f132824e - this.f132820a);
            }
        }

        /* renamed from: d */
        private void m113877d() {
            Arrays.fill(this.f132821b, null);
            this.f132822c = this.f132821b.length - 1;
            this.f132823d = 0;
            this.f132824e = 0;
        }

        /* renamed from: f */
        private ByteString m113880f() throws IOException {
            boolean z;
            int e = m113879e();
            if ((e & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int a = m113872a(e, 127);
            if (z) {
                return ByteString.m114277of(C53617k.m113981a().mo111485a(this.f132826g.readByteArray((long) a)));
            }
            return this.f132826g.readByteString((long) a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111433a() throws IOException {
            while (!this.f132826g.exhausted()) {
                byte readByte = this.f132826g.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    int a = m113872a((int) readByte, 127) - 1;
                    if (m113878d(a)) {
                        this.f132825f.add(C53588d.f132818a[a]);
                    } else {
                        int b = m113874b(a - C53588d.f132818a.length);
                        if (b < 0 || b >= this.f132821b.length) {
                            StringBuilder sb = new StringBuilder("Header index too large ");
                            sb.append(a + 1);
                            throw new IOException(sb.toString());
                        }
                        this.f132825f.add(this.f132821b[b]);
                    }
                } else if (readByte == 64) {
                    m113873a(-1, new C53587c(C53588d.m113870a(m113880f()), m113880f()));
                } else if ((readByte & 64) == 64) {
                    m113873a(-1, new C53587c(m113875c(m113872a((int) readByte, 63) - 1), m113880f()));
                } else if ((readByte & 32) == 32) {
                    this.f132820a = m113872a((int) readByte, 31);
                    if (this.f132820a < 0 || this.f132820a > this.f132827h) {
                        StringBuilder sb2 = new StringBuilder("Invalid dynamic table size update ");
                        sb2.append(this.f132820a);
                        throw new IOException(sb2.toString());
                    }
                    m113876c();
                } else if (readByte == 16 || readByte == 0) {
                    this.f132825f.add(new C53587c(C53588d.m113870a(m113880f()), m113880f()));
                } else {
                    this.f132825f.add(new C53587c(m113875c(m113872a((int) readByte, 15) - 1), m113880f()));
                }
            }
        }

        /* renamed from: b */
        private int m113874b(int i) {
            return this.f132822c + 1 + i;
        }

        /* renamed from: d */
        private static boolean m113878d(int i) {
            if (i < 0 || i > C53588d.f132818a.length - 1) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private ByteString m113875c(int i) throws IOException {
            if (m113878d(i)) {
                return C53588d.f132818a[i].f132815g;
            }
            int b = m113874b(i - C53588d.f132818a.length);
            if (b >= 0 && b < this.f132821b.length) {
                return this.f132821b[b].f132815g;
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        private int m113871a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f132821b.length;
                while (true) {
                    length--;
                    if (length < this.f132822c || i <= 0) {
                        System.arraycopy(this.f132821b, this.f132822c + 1, this.f132821b, this.f132822c + 1 + i2, this.f132823d);
                        this.f132822c += i2;
                    } else {
                        i -= this.f132821b[length].f132817i;
                        this.f132824e -= this.f132821b[length].f132817i;
                        this.f132823d--;
                        i2++;
                    }
                }
                System.arraycopy(this.f132821b, this.f132822c + 1, this.f132821b, this.f132822c + 1 + i2, this.f132823d);
                this.f132822c += i2;
            }
            return i2;
        }

        C53589a(int i, Source source) {
            this(4096, 4096, source);
        }

        /* renamed from: a */
        private int m113872a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int e = m113879e();
                if ((e & 128) == 0) {
                    return i2 + (e << i4);
                }
                i2 += (e & 127) << i4;
                i4 += 7;
            }
        }

        /* renamed from: a */
        private void m113873a(int i, C53587c cVar) {
            this.f132825f.add(cVar);
            int i2 = cVar.f132817i;
            if (i2 > this.f132820a) {
                m113877d();
                return;
            }
            m113871a((this.f132824e + i2) - this.f132820a);
            if (this.f132823d + 1 > this.f132821b.length) {
                C53587c[] cVarArr = new C53587c[(this.f132821b.length * 2)];
                System.arraycopy(this.f132821b, 0, cVarArr, this.f132821b.length, this.f132821b.length);
                this.f132822c = this.f132821b.length - 1;
                this.f132821b = cVarArr;
            }
            int i3 = this.f132822c;
            this.f132822c = i3 - 1;
            this.f132821b[i3] = cVar;
            this.f132823d++;
            this.f132824e += i2;
        }

        private C53589a(int i, int i2, Source source) {
            this.f132825f = new ArrayList();
            this.f132821b = new C53587c[8];
            this.f132822c = this.f132821b.length - 1;
            this.f132823d = 0;
            this.f132824e = 0;
            this.f132827h = i;
            this.f132820a = i2;
            this.f132826g = Okio.buffer(source);
        }
    }

    /* renamed from: okhttp3.internal.e.d$b */
    static final class C53590b {

        /* renamed from: a */
        int f132828a;

        /* renamed from: b */
        int f132829b;

        /* renamed from: c */
        C53587c[] f132830c;

        /* renamed from: d */
        int f132831d;

        /* renamed from: e */
        int f132832e;

        /* renamed from: f */
        int f132833f;

        /* renamed from: g */
        private final Buffer f132834g;

        /* renamed from: h */
        private final boolean f132835h;

        /* renamed from: i */
        private int f132836i;

        /* renamed from: j */
        private boolean f132837j;

        /* renamed from: a */
        private void m113883a() {
            Arrays.fill(this.f132830c, null);
            this.f132831d = this.f132830c.length - 1;
            this.f132832e = 0;
            this.f132833f = 0;
        }

        C53590b(Buffer buffer) {
            this(4096, true, buffer);
        }

        /* renamed from: a */
        private void m113885a(C53587c cVar) {
            int i = cVar.f132817i;
            if (i > this.f132829b) {
                m113883a();
                return;
            }
            m113887b((this.f132833f + i) - this.f132829b);
            if (this.f132832e + 1 > this.f132830c.length) {
                C53587c[] cVarArr = new C53587c[(this.f132830c.length * 2)];
                System.arraycopy(this.f132830c, 0, cVarArr, this.f132830c.length, this.f132830c.length);
                this.f132831d = this.f132830c.length - 1;
                this.f132830c = cVarArr;
            }
            int i2 = this.f132831d;
            this.f132831d = i2 - 1;
            this.f132830c[i2] = cVar;
            this.f132832e++;
            this.f132833f += i;
        }

        /* renamed from: b */
        private int m113887b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f132830c.length;
                while (true) {
                    length--;
                    if (length < this.f132831d || i <= 0) {
                        System.arraycopy(this.f132830c, this.f132831d + 1, this.f132830c, this.f132831d + 1 + i2, this.f132832e);
                        Arrays.fill(this.f132830c, this.f132831d + 1, this.f132831d + 1 + i2, null);
                        this.f132831d += i2;
                    } else {
                        i -= this.f132830c[length].f132817i;
                        this.f132833f -= this.f132830c[length].f132817i;
                        this.f132832e--;
                        i2++;
                    }
                }
                System.arraycopy(this.f132830c, this.f132831d + 1, this.f132830c, this.f132831d + 1 + i2, this.f132832e);
                Arrays.fill(this.f132830c, this.f132831d + 1, this.f132831d + 1 + i2, null);
                this.f132831d += i2;
            }
            return i2;
        }

        /* renamed from: a */
        private void m113886a(ByteString byteString) throws IOException {
            if (!this.f132835h || C53617k.m113980a(byteString) >= byteString.size()) {
                m113884a(byteString.size(), 127, 0);
                this.f132834g.write(byteString);
                return;
            }
            Buffer buffer = new Buffer();
            C53617k.m113982a(byteString, buffer);
            ByteString readByteString = buffer.readByteString();
            m113884a(readByteString.size(), 127, 128);
            this.f132834g.write(readByteString);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111435a(int i) {
            this.f132828a = i;
            int min = Math.min(i, 16384);
            if (this.f132829b != min) {
                if (min < this.f132829b) {
                    this.f132836i = Math.min(this.f132836i, min);
                }
                this.f132837j = true;
                this.f132829b = min;
                if (this.f132829b < this.f132833f) {
                    if (this.f132829b == 0) {
                        m113883a();
                        return;
                    }
                    m113887b(this.f132833f - this.f132829b);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111436a(List<C53587c> list) throws IOException {
            int i;
            int i2;
            if (this.f132837j) {
                if (this.f132836i < this.f132829b) {
                    m113884a(this.f132836i, 31, 32);
                }
                this.f132837j = false;
                this.f132836i = Integer.MAX_VALUE;
                m113884a(this.f132829b, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C53587c cVar = (C53587c) list.get(i3);
                ByteString asciiLowercase = cVar.f132815g.toAsciiLowercase();
                ByteString byteString = cVar.f132816h;
                Integer num = (Integer) C53588d.f132819b.get(asciiLowercase);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (C53559c.m113808a((Object) C53588d.f132818a[i2 - 1].f132816h, (Object) byteString)) {
                            i = i2;
                        } else if (C53559c.m113808a((Object) C53588d.f132818a[i2].f132816h, (Object) byteString)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i4 = this.f132831d + 1;
                    int length = this.f132830c.length;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (C53559c.m113808a((Object) this.f132830c[i4].f132815g, (Object) asciiLowercase)) {
                            if (C53559c.m113808a((Object) this.f132830c[i4].f132816h, (Object) byteString)) {
                                i2 = C53588d.f132818a.length + (i4 - this.f132831d);
                                break;
                            } else if (i == -1) {
                                i = (i4 - this.f132831d) + C53588d.f132818a.length;
                            }
                        }
                        i4++;
                    }
                }
                if (i2 != -1) {
                    m113884a(i2, 127, 128);
                } else if (i == -1) {
                    this.f132834g.writeByte(64);
                    m113886a(asciiLowercase);
                    m113886a(byteString);
                    m113885a(cVar);
                } else if (!asciiLowercase.startsWith(C53587c.f132809a) || C53587c.f132814f.equals(asciiLowercase)) {
                    m113884a(i, 63, 64);
                    m113886a(byteString);
                    m113885a(cVar);
                } else {
                    m113884a(i, 15, 0);
                    m113886a(byteString);
                }
            }
        }

        private C53590b(int i, boolean z, Buffer buffer) {
            this.f132836i = Integer.MAX_VALUE;
            this.f132830c = new C53587c[8];
            this.f132831d = this.f132830c.length - 1;
            this.f132828a = 4096;
            this.f132829b = 4096;
            this.f132835h = true;
            this.f132834g = buffer;
        }

        /* renamed from: a */
        private void m113884a(int i, int i2, int i3) {
            if (i < i2) {
                this.f132834g.writeByte(i | i3);
                return;
            }
            this.f132834g.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f132834g.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f132834g.writeByte(i4);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f132818a.length);
        for (int i = 0; i < f132818a.length; i++) {
            if (!linkedHashMap.containsKey(f132818a[i].f132815g)) {
                linkedHashMap.put(f132818a[i].f132815g, Integer.valueOf(i));
            }
        }
        f132819b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    static ByteString m113870a(ByteString byteString) throws IOException {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            byte b = byteString.getByte(i);
            if (b < 65 || b > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(byteString.utf8());
                throw new IOException(sb.toString());
            }
        }
        return byteString;
    }
}
