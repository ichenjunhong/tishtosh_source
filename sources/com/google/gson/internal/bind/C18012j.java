package com.google.gson.internal.bind;

import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18083m;
import com.google.gson.C18084n;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C18060f;
import com.google.gson.p1076a.C17952c;
import com.google.gson.p1077b.C17956a;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.bind.j */
public final class C18012j {

    /* renamed from: A */
    public static final C18095w<String> f50026A = new C18095w<String>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            C17960b f = aVar.mo34843f();
            if (f == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            } else if (f == C17960b.BOOLEAN) {
                return Boolean.toString(aVar.mo34846j());
            } else {
                return aVar.mo34845i();
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34864b((String) obj);
        }
    };

    /* renamed from: B */
    public static final C18095w<BigDecimal> f50027B = new C18095w<BigDecimal>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44228a(aVar);
        }

        /* renamed from: a */
        private static BigDecimal m44228a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo34845i());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) (BigDecimal) obj);
        }
    };

    /* renamed from: C */
    public static final C18095w<BigInteger> f50028C = new C18095w<BigInteger>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44217a(aVar);
        }

        /* renamed from: a */
        private static BigInteger m44217a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return new BigInteger(aVar.mo34845i());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) (BigInteger) obj);
        }
    };

    /* renamed from: D */
    public static final C18097x f50029D = m44214a(String.class, f50026A);

    /* renamed from: E */
    public static final C18095w<StringBuilder> f50030E = new C18095w<StringBuilder>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return new StringBuilder(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            StringBuilder sb = (StringBuilder) obj;
            if (sb == null) {
                str = null;
            } else {
                str = sb.toString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: F */
    public static final C18097x f50031F = m44214a(StringBuilder.class, f50030E);

    /* renamed from: G */
    public static final C18095w<StringBuffer> f50032G = new C18095w<StringBuffer>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return new StringBuffer(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            StringBuffer stringBuffer = (StringBuffer) obj;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: H */
    public static final C18097x f50033H = m44214a(StringBuffer.class, f50032G);

    /* renamed from: I */
    public static final C18095w<URL> f50034I = new C18095w<URL>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            String i = aVar.mo34845i();
            if (TEVideoRecorder.FACE_BEAUTY_NULL.equals(i)) {
                return null;
            }
            return new URL(i);
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            URL url = (URL) obj;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: J */
    public static final C18097x f50035J = m44214a(URL.class, f50034I);

    /* renamed from: K */
    public static final C18095w<URI> f50036K = new C18095w<URI>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44219a(aVar);
        }

        /* renamed from: a */
        private static URI m44219a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                String i = aVar.mo34845i();
                if (TEVideoRecorder.FACE_BEAUTY_NULL.equals(i)) {
                    return null;
                }
                return new URI(i);
            } catch (URISyntaxException e) {
                throw new C18083m((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            URI uri = (URI) obj;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: L */
    public static final C18097x f50037L = m44214a(URI.class, f50036K);

    /* renamed from: M */
    public static final C18095w<InetAddress> f50038M = new C18095w<InetAddress>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return InetAddress.getByName(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            InetAddress inetAddress = (InetAddress) obj;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: N */
    public static final C18097x f50039N = m44216b(InetAddress.class, f50038M);

    /* renamed from: O */
    public static final C18095w<UUID> f50040O = new C18095w<UUID>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return UUID.fromString(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: P */
    public static final C18097x f50041P = m44214a(UUID.class, f50040O);

    /* renamed from: Q */
    public static final C18095w<Currency> f50042Q = new C18095w<Currency>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return Currency.getInstance(aVar.mo34845i());
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34864b(((Currency) obj).getCurrencyCode());
        }
    }.nullSafe();

    /* renamed from: R */
    public static final C18097x f50043R = m44214a(Currency.class, f50042Q);

    /* renamed from: S */
    public static final C18097x f50044S = new TypeAdapters$26();

    /* renamed from: T */
    public static final C18095w<Calendar> f50045T = new C18095w<Calendar>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            aVar.mo34839c();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.mo34843f() != C17960b.END_OBJECT) {
                String h = aVar.mo34844h();
                int n = aVar.mo34850n();
                if ("year".equals(h)) {
                    i = n;
                } else if ("month".equals(h)) {
                    i2 = n;
                } else if ("dayOfMonth".equals(h)) {
                    i3 = n;
                } else if ("hourOfDay".equals(h)) {
                    i4 = n;
                } else if ("minute".equals(h)) {
                    i5 = n;
                } else if ("second".equals(h)) {
                    i6 = n;
                }
            }
            aVar.mo34841d();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                cVar.mo34870f();
                return;
            }
            cVar.mo34868d();
            cVar.mo34861a("year");
            cVar.mo34858a((long) calendar.get(1));
            cVar.mo34861a("month");
            cVar.mo34858a((long) calendar.get(2));
            cVar.mo34861a("dayOfMonth");
            cVar.mo34858a((long) calendar.get(5));
            cVar.mo34861a("hourOfDay");
            cVar.mo34858a((long) calendar.get(11));
            cVar.mo34861a("minute");
            cVar.mo34858a((long) calendar.get(12));
            cVar.mo34861a("second");
            cVar.mo34858a((long) calendar.get(13));
            cVar.mo34869e();
        }
    };

    /* renamed from: U */
    public static final C18097x f50046U = new TypeAdapters$34(Calendar.class, GregorianCalendar.class, f50045T);

    /* renamed from: V */
    public static final C18095w<Locale> f50047V = new C18095w<Locale>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo34845i(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            Locale locale = (Locale) obj;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: W */
    public static final C18097x f50048W = m44214a(Locale.class, f50047V);

    /* renamed from: X */
    public static final C18095w<C18082l> f50049X = new C18095w<C18082l>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C18082l read(C17958a aVar) throws IOException {
            switch (C1802823.f50078a[aVar.mo34843f().ordinal()]) {
                case 1:
                    return new C18088r((Number) new C18060f(aVar.mo34845i()));
                case 2:
                    return new C18088r(Boolean.valueOf(aVar.mo34846j()));
                case 3:
                    return new C18088r(aVar.mo34845i());
                case 4:
                    aVar.mo34847k();
                    return C18084n.f50144a;
                case 5:
                    C17980i iVar = new C17980i();
                    aVar.mo34837a();
                    while (aVar.mo34842e()) {
                        iVar.mo34903a(read(aVar));
                    }
                    aVar.mo34838b();
                    return iVar;
                case 6:
                    C18085o oVar = new C18085o();
                    aVar.mo34839c();
                    while (aVar.mo34842e()) {
                        oVar.mo35017a(aVar.mo34844h(), read(aVar));
                    }
                    aVar.mo34841d();
                    return oVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void write(C17961c cVar, C18082l lVar) throws IOException {
            if (lVar == null || lVar.mo35008l()) {
                cVar.mo34870f();
            } else if (lVar.mo35007k()) {
                C18088r o = lVar.mo35011o();
                if (o.mo35033q()) {
                    cVar.mo34860a(o.mo34904b());
                } else if (o.mo35030a()) {
                    cVar.mo34862a(o.mo34911h());
                } else {
                    cVar.mo34864b(o.mo34905c());
                }
            } else if (lVar.mo35005i()) {
                cVar.mo34863b();
                Iterator it = lVar.mo35010n().iterator();
                while (it.hasNext()) {
                    write(cVar, (C18082l) it.next());
                }
                cVar.mo34865c();
            } else if (lVar.mo35006j()) {
                cVar.mo34868d();
                for (Entry entry : lVar.mo35009m().mo35016a()) {
                    cVar.mo34861a((String) entry.getKey());
                    write(cVar, (C18082l) entry.getValue());
                }
                cVar.mo34869e();
            } else {
                StringBuilder sb = new StringBuilder("Couldn't write ");
                sb.append(lVar.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    };

    /* renamed from: Y */
    public static final C18097x f50050Y = m44216b(C18082l.class, f50049X);

    /* renamed from: Z */
    public static final C18097x f50051Z = new TypeAdapters$30();

    /* renamed from: a */
    public static final C18095w<Class> f50052a = new C18095w<Class>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            Class cls = (Class) obj;
            StringBuilder sb = new StringBuilder("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }
    }.nullSafe();

    /* renamed from: b */
    public static final C18097x f50053b = m44214a(Class.class, f50052a);

    /* renamed from: c */
    public static final C18095w<BitSet> f50054c = new C18095w<BitSet>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44218a(aVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            if (r6.mo34850n() != 0) goto L_0x005e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.BitSet m44218a(com.google.gson.p1078c.C17958a r6) throws java.io.IOException {
            /*
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.mo34837a()
                com.google.gson.c.b r1 = r6.mo34843f()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.c.b r4 = com.google.gson.p1078c.C17960b.END_ARRAY
                if (r1 == r4) goto L_0x006a
                int[] r4 = com.google.gson.internal.bind.C18012j.C1802823.f50078a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                switch(r4) {
                    case 1: goto L_0x0058;
                    case 2: goto L_0x0053;
                    case 3: goto L_0x0032;
                    default: goto L_0x001e;
                }
            L_0x001e:
                com.google.gson.u r6 = new com.google.gson.u
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0032:
                java.lang.String r1 = r6.mo34845i()
                int r4 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x003f }
                if (r4 == 0) goto L_0x003d
                goto L_0x005e
            L_0x003d:
                r5 = 0
                goto L_0x005e
            L_0x003f:
                com.google.gson.u r6 = new com.google.gson.u
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L_0x0053:
                boolean r5 = r6.mo34846j()
                goto L_0x005e
            L_0x0058:
                int r1 = r6.mo34850n()
                if (r1 == 0) goto L_0x003d
            L_0x005e:
                if (r5 == 0) goto L_0x0063
                r0.set(r3)
            L_0x0063:
                int r3 = r3 + 1
                com.google.gson.c.b r1 = r6.mo34843f()
                goto L_0x000e
            L_0x006a:
                r6.mo34838b()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C18012j.C1801612.m44218a(com.google.gson.c.a):java.util.BitSet");
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            cVar.mo34863b();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo34858a(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo34865c();
        }
    }.nullSafe();

    /* renamed from: d */
    public static final C18097x f50055d = m44214a(BitSet.class, f50054c);

    /* renamed from: e */
    public static final C18095w<Boolean> f50056e = new C18095w<Boolean>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            C17960b f = aVar.mo34843f();
            if (f == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            } else if (f == C17960b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo34845i()));
            } else {
                return Boolean.valueOf(aVar.mo34846j());
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34859a((Boolean) obj);
        }
    };

    /* renamed from: f */
    public static final C18095w<Boolean> f50057f = new C18095w<Boolean>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return Boolean.valueOf(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = bool.toString();
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: g */
    public static final C18097x f50058g = m44215a(Boolean.TYPE, Boolean.class, f50056e);

    /* renamed from: h */
    public static final C18095w<Number> f50059h = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44223a(aVar);
        }

        /* renamed from: a */
        private static Number m44223a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo34850n());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: i */
    public static final C18097x f50060i = m44215a(Byte.TYPE, Byte.class, f50059h);

    /* renamed from: j */
    public static final C18095w<Number> f50061j = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44224a(aVar);
        }

        /* renamed from: a */
        private static Number m44224a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo34850n());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: k */
    public static final C18097x f50062k = m44215a(Short.TYPE, Short.class, f50061j);

    /* renamed from: l */
    public static final C18095w<Number> f50063l = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44225a(aVar);
        }

        /* renamed from: a */
        private static Number m44225a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo34850n());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: m */
    public static final C18097x f50064m = m44215a(Integer.TYPE, Integer.class, f50063l);

    /* renamed from: n */
    public static final C18095w<AtomicInteger> f50065n = new C18095w<AtomicInteger>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44226a(aVar);
        }

        /* renamed from: a */
        private static AtomicInteger m44226a(C17958a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo34850n());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34858a((long) ((AtomicInteger) obj).get());
        }
    }.nullSafe();

    /* renamed from: o */
    public static final C18097x f50066o = m44214a(AtomicInteger.class, f50065n);

    /* renamed from: p */
    public static final C18095w<AtomicBoolean> f50067p = new C18095w<AtomicBoolean>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo34846j());
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34862a(((AtomicBoolean) obj).get());
        }
    }.nullSafe();

    /* renamed from: q */
    public static final C18097x f50068q = m44214a(AtomicBoolean.class, f50067p);

    /* renamed from: r */
    public static final C18095w<AtomicIntegerArray> f50069r = new C18095w<AtomicIntegerArray>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44220a(aVar);
        }

        /* renamed from: a */
        private static AtomicIntegerArray m44220a(C17958a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo34837a();
            while (aVar.mo34842e()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo34850n()));
                } catch (NumberFormatException e) {
                    throw new C18091u((Throwable) e);
                }
            }
            aVar.mo34838b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            cVar.mo34863b();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo34858a((long) atomicIntegerArray.get(i));
            }
            cVar.mo34865c();
        }
    }.nullSafe();

    /* renamed from: s */
    public static final C18097x f50070s = m44214a(AtomicIntegerArray.class, f50069r);

    /* renamed from: t */
    public static final C18095w<Number> f50071t = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            return m44227a(aVar);
        }

        /* renamed from: a */
        private static Number m44227a(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo34849m());
            } catch (NumberFormatException e) {
                throw new C18091u((Throwable) e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: u */
    public static final C18095w<Number> f50072u = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return Float.valueOf((float) aVar.mo34848l());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: v */
    public static final C18095w<Number> f50073v = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return Double.valueOf(aVar.mo34848l());
            }
            aVar.mo34847k();
            return null;
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: w */
    public static final C18095w<Number> f50074w = new C18095w<Number>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            C17960b f = aVar.mo34843f();
            int i = C1802823.f50078a[f.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        aVar.mo34847k();
                        return null;
                    default:
                        StringBuilder sb = new StringBuilder("Expecting number, got: ");
                        sb.append(f);
                        throw new C18091u(sb.toString());
                }
            }
            return new C18060f(aVar.mo34845i());
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            cVar.mo34860a((Number) obj);
        }
    };

    /* renamed from: x */
    public static final C18097x f50075x = m44214a(Number.class, f50074w);

    /* renamed from: y */
    public static final C18095w<Character> f50076y = new C18095w<Character>() {
        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() == C17960b.NULL) {
                aVar.mo34847k();
                return null;
            }
            String i = aVar.mo34845i();
            if (i.length() == 1) {
                return Character.valueOf(i.charAt(0));
            }
            StringBuilder sb = new StringBuilder("Expecting character, got: ");
            sb.append(i);
            throw new C18091u(sb.toString());
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            Character ch = (Character) obj;
            if (ch == null) {
                str = null;
            } else {
                str = String.valueOf(ch);
            }
            cVar.mo34864b(str);
        }
    };

    /* renamed from: z */
    public static final C18097x f50077z = m44215a(Character.TYPE, Character.class, f50076y);

    /* renamed from: com.google.gson.internal.bind.j$23 */
    static /* synthetic */ class C1802823 {

        /* renamed from: a */
        static final /* synthetic */ int[] f50078a = new int[C17960b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.c.b[] r0 = com.google.gson.p1078c.C17960b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50078a = r0
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f50078a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.gson.c.b r1 = com.google.gson.p1078c.C17960b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C18012j.C1802823.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.internal.bind.j$a */
    static final class C18042a<T extends Enum<T>> extends C18095w<T> {

        /* renamed from: a */
        private final Map<String, T> f50079a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f50080b = new HashMap();

        public final /* synthetic */ Object read(C17958a aVar) throws IOException {
            if (aVar.mo34843f() != C17960b.NULL) {
                return (Enum) this.f50079a.get(aVar.mo34845i());
            }
            aVar.mo34847k();
            return null;
        }

        public C18042a(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C17952c cVar = (C17952c) cls.getField(name).getAnnotation(C17952c.class);
                    if (cVar != null) {
                        name = cVar.mo34828a();
                        for (String put : cVar.mo34829b()) {
                            this.f50079a.put(put, enumR);
                        }
                    }
                    this.f50079a.put(name, enumR);
                    this.f50080b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public final /* synthetic */ void write(C17961c cVar, Object obj) throws IOException {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = (String) this.f50080b.get(enumR);
            }
            cVar.mo34864b(str);
        }
    }

    /* renamed from: a */
    public static <TT> C18097x m44213a(C17956a<TT> aVar, C18095w<TT> wVar) {
        return new TypeAdapters$31(aVar, wVar);
    }

    /* renamed from: b */
    public static <T1> C18097x m44216b(Class<T1> cls, C18095w<T1> wVar) {
        return new TypeAdapters$35(cls, wVar);
    }

    /* renamed from: a */
    public static <TT> C18097x m44214a(Class<TT> cls, C18095w<TT> wVar) {
        return new TypeAdapters$32(cls, wVar);
    }

    /* renamed from: a */
    public static <TT> C18097x m44215a(Class<TT> cls, Class<TT> cls2, C18095w<? super TT> wVar) {
        return new TypeAdapters$33(cls, cls2, wVar);
    }
}
