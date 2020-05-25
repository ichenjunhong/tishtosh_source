package okhttp3;

import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2685c.C53566d;

/* renamed from: okhttp3.l */
public final class C53657l {

    /* renamed from: j */
    private static final Pattern f133095j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f133096k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f133097l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f133098m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f133099a;

    /* renamed from: b */
    public final String f133100b;

    /* renamed from: c */
    public final long f133101c;

    /* renamed from: d */
    public final String f133102d;

    /* renamed from: e */
    public final String f133103e;

    /* renamed from: f */
    public final boolean f133104f;

    /* renamed from: g */
    public final boolean f133105g;

    /* renamed from: h */
    public final boolean f133106h;

    /* renamed from: i */
    public final boolean f133107i;

    /* renamed from: okhttp3.l$a */
    public static final class C53658a {

        /* renamed from: a */
        String f133108a;

        /* renamed from: b */
        String f133109b;

        /* renamed from: c */
        public long f133110c = 253402300799999L;

        /* renamed from: d */
        String f133111d;

        /* renamed from: e */
        public String f133112e = "/";

        /* renamed from: f */
        public boolean f133113f;

        /* renamed from: g */
        public boolean f133114g;

        /* renamed from: h */
        public boolean f133115h;

        /* renamed from: i */
        boolean f133116i;

        /* renamed from: a */
        public final C53657l mo111570a() {
            return new C53657l(this);
        }

        /* renamed from: c */
        public final C53658a mo111572c(String str) {
            return mo111569a(str, false);
        }

        /* renamed from: a */
        public final C53658a mo111568a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f133108a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        /* renamed from: b */
        public final C53658a mo111571b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.f133109b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }

        /* renamed from: a */
        public C53658a mo111569a(String str, boolean z) {
            if (str != null) {
                String a = C53559c.m113797a(str);
                if (a != null) {
                    this.f133111d = a;
                    this.f133116i = z;
                    return this;
                }
                StringBuilder sb = new StringBuilder("unexpected domain: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("domain == null");
        }
    }

    public final String toString() {
        return mo111564a(false);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f133099a.hashCode() + 527) * 31) + this.f133100b.hashCode()) * 31) + this.f133102d.hashCode()) * 31) + this.f133103e.hashCode()) * 31) + ((int) (this.f133101c ^ (this.f133101c >>> 32)))) * 31) + (this.f133104f ^ true ? 1 : 0)) * 31) + (this.f133105g ^ true ? 1 : 0)) * 31) + (this.f133106h ^ true ? 1 : 0)) * 31) + (this.f133107i ^ true ? 1 : 0);
    }

    C53657l(C53658a aVar) {
        if (aVar.f133108a == null) {
            throw new NullPointerException("builder.name == null");
        } else if (aVar.f133109b == null) {
            throw new NullPointerException("builder.value == null");
        } else if (aVar.f133111d != null) {
            this.f133099a = aVar.f133108a;
            this.f133100b = aVar.f133109b;
            this.f133101c = aVar.f133110c;
            this.f133102d = aVar.f133111d;
            this.f133103e = aVar.f133112e;
            this.f133104f = aVar.f133113f;
            this.f133105g = aVar.f133114g;
            this.f133106h = aVar.f133115h;
            this.f133107i = aVar.f133116i;
        } else {
            throw new NullPointerException("builder.domain == null");
        }
    }

    /* renamed from: a */
    private static long m114115a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53657l)) {
            return false;
        }
        C53657l lVar = (C53657l) obj;
        if (lVar.f133099a.equals(this.f133099a) && lVar.f133100b.equals(this.f133100b) && lVar.f133102d.equals(this.f133102d) && lVar.f133103e.equals(this.f133103e) && lVar.f133101c == this.f133101c && lVar.f133104f == this.f133104f && lVar.f133105g == this.f133105g && lVar.f133106h == this.f133106h && lVar.f133107i == this.f133107i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo111564a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f133099a);
        sb.append('=');
        sb.append(this.f133100b);
        if (this.f133106h) {
            if (this.f133101c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C53566d.m113826a(new Date(this.f133101c)));
            }
        }
        if (!this.f133107i) {
            sb.append("; domain=");
            if (z) {
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
            }
            sb.append(this.f133102d);
        }
        sb.append("; path=");
        sb.append(this.f133103e);
        if (this.f133104f) {
            sb.append("; secure");
        }
        if (this.f133105g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C53657l m114118a(C53673t tVar, String str) {
        return m114117a(System.currentTimeMillis(), tVar, str);
    }

    /* renamed from: a */
    public static List<C53657l> m114116a(C53673t tVar, C53671s sVar) {
        List b = sVar.mo111595b("Set-Cookie");
        int size = b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C53657l a = m114118a(tVar, (String) b.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public static boolean m114119a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C53559c.m113816c(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0278, code lost:
        if (r2 > 253402300799999L) goto L_0x0280;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static okhttp3.C53657l m114117a(long r30, okhttp3.C53673t r32, java.lang.String r33) {
        /*
            r2 = r33
            int r3 = r33.length()
            r4 = 59
            r5 = 0
            int r6 = okhttp3.internal.C53559c.m113793a(r2, r5, r3, r4)
            r7 = 61
            int r8 = okhttp3.internal.C53559c.m113793a(r2, r5, r6, r7)
            r9 = 0
            if (r8 != r6) goto L_0x0017
            return r9
        L_0x0017:
            java.lang.String r11 = okhttp3.internal.C53559c.m113815c(r2, r5, r8)
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x02e4
            int r10 = okhttp3.internal.C53559c.m113811b(r11)
            r12 = -1
            if (r10 == r12) goto L_0x002a
            goto L_0x02e4
        L_0x002a:
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r8 = okhttp3.internal.C53559c.m113815c(r2, r8, r6)
            int r13 = okhttp3.internal.C53559c.m113811b(r8)
            if (r13 == r12) goto L_0x0037
            return r9
        L_0x0037:
            int r6 = r6 + r10
            r21 = r9
            r17 = -1
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0049:
            if (r6 >= r3) goto L_0x0247
            int r15 = okhttp3.internal.C53559c.m113793a(r2, r6, r3, r4)
            int r13 = okhttp3.internal.C53559c.m113793a(r2, r6, r15, r7)
            java.lang.String r6 = okhttp3.internal.C53559c.m113815c(r2, r6, r13)
            if (r13 >= r15) goto L_0x0060
            int r13 = r13 + 1
            java.lang.String r13 = okhttp3.internal.C53559c.m113815c(r2, r13, r15)
            goto L_0x0062
        L_0x0060:
            java.lang.String r13 = ""
        L_0x0062:
            java.lang.String r14 = "expires"
            boolean r14 = r6.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x01cd
            int r6 = r13.length()     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r14 = m114114a(r13, r5, r6, r5)     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Pattern r7 = f133098m     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Matcher r7 = r7.matcher(r13)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r4 = -1
            r5 = -1
            r26 = -1
            r27 = -1
            r28 = -1
            r29 = -1
        L_0x0082:
            if (r14 >= r6) goto L_0x0130
            int r12 = r14 + 1
            int r12 = m114114a(r13, r12, r6, r10)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r7.region(r14, r12)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r14 = -1
            if (r5 != r14) goto L_0x00c0
            java.util.regex.Pattern r14 = f133098m     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Matcher r14 = r7.usePattern(r14)     // Catch:{ IllegalArgumentException -> 0x01ca }
            boolean r14 = r14.matches()     // Catch:{ IllegalArgumentException -> 0x01ca }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r5 = r7.group(r10)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r14 = 2
            java.lang.String r14 = r7.group(r14)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r10 = 3
            java.lang.String r10 = r7.group(r10)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r29 = r10
            r28 = r14
            goto L_0x0124
        L_0x00bc:
            r10 = r27
            r14 = -1
            goto L_0x00c2
        L_0x00c0:
            r10 = r27
        L_0x00c2:
            if (r10 != r14) goto L_0x00dc
            java.util.regex.Pattern r14 = f133097l     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Matcher r14 = r7.usePattern(r14)     // Catch:{ IllegalArgumentException -> 0x01ca }
            boolean r14 = r14.matches()     // Catch:{ IllegalArgumentException -> 0x01ca }
            if (r14 == 0) goto L_0x00dc
            r14 = 1
            java.lang.String r10 = r7.group(r14)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ IllegalArgumentException -> 0x01ca }
        L_0x00d9:
            r27 = r10
            goto L_0x0124
        L_0x00dc:
            r14 = r26
            r2 = -1
            if (r14 != r2) goto L_0x0108
            java.util.regex.Pattern r2 = f133096k     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Matcher r2 = r7.usePattern(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            boolean r2 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x01ca }
            if (r2 == 0) goto L_0x0107
            r2 = 1
            java.lang.String r14 = r7.group(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.lang.String r2 = r14.toLowerCase(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Pattern r14 = f133096k     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.lang.String r14 = r14.pattern()     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r2 = r14.indexOf(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r2 = r2 / 4
            r26 = r2
            goto L_0x00d9
        L_0x0107:
            r2 = -1
        L_0x0108:
            if (r4 != r2) goto L_0x0120
            java.util.regex.Pattern r2 = f133095j     // Catch:{ IllegalArgumentException -> 0x01ca }
            java.util.regex.Matcher r2 = r7.usePattern(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            boolean r2 = r2.matches()     // Catch:{ IllegalArgumentException -> 0x01ca }
            if (r2 == 0) goto L_0x0120
            r2 = 1
            java.lang.String r4 = r7.group(r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            int r2 = java.lang.Integer.parseInt(r4)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r4 = r2
        L_0x0120:
            r27 = r10
            r26 = r14
        L_0x0124:
            int r12 = r12 + 1
            r2 = 0
            int r14 = m114114a(r13, r12, r6, r2)     // Catch:{ IllegalArgumentException -> 0x01ca }
            r2 = r33
            r10 = 1
            goto L_0x0082
        L_0x0130:
            r14 = r26
            r10 = r27
            r2 = 70
            if (r4 < r2) goto L_0x013e
            r2 = 99
            if (r4 > r2) goto L_0x013e
            int r4 = r4 + 1900
        L_0x013e:
            if (r4 < 0) goto L_0x0146
            r2 = 69
            if (r4 > r2) goto L_0x0146
            int r4 = r4 + 2000
        L_0x0146:
            r2 = 1601(0x641, float:2.243E-42)
            if (r4 < r2) goto L_0x01c2
            r2 = -1
            if (r14 == r2) goto L_0x01ba
            if (r10 <= 0) goto L_0x01b2
            r6 = 31
            if (r10 > r6) goto L_0x01b2
            if (r5 < 0) goto L_0x01aa
            r6 = 23
            if (r5 > r6) goto L_0x01aa
            r12 = r28
            if (r12 < 0) goto L_0x01a2
            r7 = 59
            if (r12 > r7) goto L_0x01a4
            r6 = r29
            if (r6 < 0) goto L_0x019c
            if (r6 > r7) goto L_0x019c
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x0217 }
            java.util.TimeZone r2 = okhttp3.internal.C53559c.f132739g     // Catch:{ IllegalArgumentException -> 0x0217 }
            r13.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 0
            r13.setLenient(r2)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 1
            r13.set(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            int r2 = r14 + -1
            r4 = 2
            r13.set(r4, r2)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 5
            r13.set(r2, r10)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 11
            r13.set(r2, r5)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 12
            r13.set(r2, r12)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 13
            r13.set(r2, r6)     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2 = 14
            r4 = 0
            r13.set(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0217 }
            long r4 = r13.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x0217 }
            r19 = r4
            goto L_0x01dd
        L_0x019c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01a2:
            r7 = 59
        L_0x01a4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01aa:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01b2:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01ba:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01c2:
            r7 = 59
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0217 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0217 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0217 }
        L_0x01ca:
            r7 = 59
            goto L_0x0217
        L_0x01cd:
            r7 = 59
            java.lang.String r2 = "max-age"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01e1
            long r4 = m114115a(r13)     // Catch:{  }
            r17 = r4
        L_0x01dd:
            r2 = 1
            r25 = 1
            goto L_0x023a
        L_0x01e1:
            java.lang.String r2 = "domain"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0219
            java.lang.String r2 = "."
            boolean r2 = r13.endsWith(r2)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 != 0) goto L_0x0210
            java.lang.String r2 = "."
            boolean r2 = r13.startsWith(r2)     // Catch:{ IllegalArgumentException -> 0x0217 }
            if (r2 == 0) goto L_0x01ff
            r2 = 1
            java.lang.String r13 = r13.substring(r2)     // Catch:{ IllegalArgumentException -> 0x023a }
            goto L_0x0200
        L_0x01ff:
            r2 = 1
        L_0x0200:
            java.lang.String r4 = okhttp3.internal.C53559c.m113797a(r13)     // Catch:{ IllegalArgumentException -> 0x023a }
            if (r4 == 0) goto L_0x020a
            r9 = r4
            r24 = 0
            goto L_0x023a
        L_0x020a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x023a }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x023a }
            throw r4     // Catch:{ IllegalArgumentException -> 0x023a }
        L_0x0210:
            r2 = 1
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x023a }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x023a }
            throw r4     // Catch:{ IllegalArgumentException -> 0x023a }
        L_0x0217:
            r2 = 1
            goto L_0x023a
        L_0x0219:
            r2 = 1
            java.lang.String r4 = "path"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0225
            r21 = r13
            goto L_0x023a
        L_0x0225:
            java.lang.String r4 = "secure"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0230
            r22 = 1
            goto L_0x023a
        L_0x0230:
            java.lang.String r4 = "httponly"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x023a
            r23 = 1
        L_0x023a:
            int r6 = r15 + 1
            r2 = r33
            r4 = 59
            r5 = 0
            r7 = 61
            r10 = 1
            r12 = -1
            goto L_0x0049
        L_0x0247:
            r2 = -9223372036854775808
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0251
        L_0x024d:
            r0 = r32
            r13 = r2
            goto L_0x0288
        L_0x0251:
            r2 = -1
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0284
            r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0265
            r2 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r2
            goto L_0x026a
        L_0x0265:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x026a:
            r2 = 0
            long r2 = r30 + r17
            int r4 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1))
            if (r4 < 0) goto L_0x027b
            r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x024d
            goto L_0x0280
        L_0x027b:
            r0 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0280:
            r13 = r0
            r0 = r32
            goto L_0x0288
        L_0x0284:
            r0 = r32
            r13 = r19
        L_0x0288:
            java.lang.String r1 = r0.f133143d
            if (r9 != 0) goto L_0x028f
            r15 = r1
            r2 = 0
            goto L_0x0299
        L_0x028f:
            boolean r2 = m114119a(r1, r9)
            if (r2 != 0) goto L_0x0297
            r2 = 0
            return r2
        L_0x0297:
            r2 = 0
            r15 = r9
        L_0x0299:
            int r1 = r1.length()
            int r3 = r15.length()
            if (r1 == r3) goto L_0x02ae
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.get()
            java.lang.String r1 = r1.getEffectiveTldPlusOne(r15)
            if (r1 != 0) goto L_0x02ae
            return r2
        L_0x02ae:
            r9 = r21
            if (r9 == 0) goto L_0x02be
            java.lang.String r1 = "/"
            boolean r1 = r9.startsWith(r1)
            if (r1 != 0) goto L_0x02bb
            goto L_0x02be
        L_0x02bb:
            r16 = r9
            goto L_0x02d4
        L_0x02be:
            java.lang.String r0 = r32.mo111619f()
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            if (r1 == 0) goto L_0x02d0
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            goto L_0x02d2
        L_0x02d0:
            java.lang.String r0 = "/"
        L_0x02d2:
            r16 = r0
        L_0x02d4:
            okhttp3.l r0 = new okhttp3.l
            r10 = r0
            r12 = r8
            r17 = r22
            r18 = r23
            r19 = r24
            r20 = r25
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x02e4:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53657l.m114117a(long, okhttp3.t, java.lang.String):okhttp3.l");
    }

    /* renamed from: a */
    private static int m114114a(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private C53657l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f133099a = str;
        this.f133100b = str2;
        this.f133101c = j;
        this.f133102d = str3;
        this.f133103e = str4;
        this.f133104f = z;
        this.f133105g = z2;
        this.f133107i = z3;
        this.f133106h = z4;
    }
}
