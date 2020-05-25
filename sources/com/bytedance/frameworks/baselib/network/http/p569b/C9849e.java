package com.bytedance.frameworks.baselib.network.http.p569b;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.taobao.android.dexposed.ClassUtils;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.frameworks.baselib.network.http.b.e */
public final class C9849e implements Cloneable {

    /* renamed from: m */
    private static final Set<String> f26796m;

    /* renamed from: n */
    private static Pattern f26797n;

    /* renamed from: o */
    private static Pattern f26798o;

    /* renamed from: p */
    private static final ThreadLocal<DateFormat> f26799p = new ThreadLocal<DateFormat>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    /* renamed from: q */
    private static final String[] f26800q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a */
    public String f26801a;

    /* renamed from: b */
    public String f26802b;

    /* renamed from: c */
    public boolean f26803c;

    /* renamed from: d */
    public String f26804d;

    /* renamed from: e */
    public long f26805e = -1;

    /* renamed from: f */
    public final String f26806f;

    /* renamed from: g */
    public String f26807g;

    /* renamed from: h */
    public String f26808h;

    /* renamed from: i */
    public boolean f26809i;

    /* renamed from: j */
    public boolean f26810j;

    /* renamed from: k */
    public String f26811k;

    /* renamed from: l */
    public int f26812l = 1;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.b.e$a */
    static class C9851a {

        /* renamed from: a */
        boolean f26813a;

        /* renamed from: b */
        boolean f26814b;

        /* renamed from: c */
        boolean f26815c;

        /* renamed from: d */
        private final String f26816d;

        /* renamed from: e */
        private final String f26817e;

        /* renamed from: f */
        private int f26818f;

        /* renamed from: c */
        private void m19704c() {
            while (this.f26818f < this.f26816d.length() && " \t".indexOf(this.f26816d.charAt(this.f26818f)) != -1) {
                this.f26818f++;
            }
        }

        /* renamed from: b */
        private boolean m19703b() {
            m19704c();
            if (this.f26818f >= this.f26816d.length() || this.f26816d.charAt(this.f26818f) != '=') {
                return false;
            }
            this.f26818f++;
            return true;
        }

        /* renamed from: a */
        public final List<C9849e> mo17692a() {
            int i;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f26817e.startsWith("set-cookie2:")) {
                this.f26818f += 12;
                this.f26815c = true;
                i = 0;
            } else {
                if (this.f26817e.startsWith("set-cookie:")) {
                    this.f26818f += 11;
                }
                i = 1;
            }
            while (true) {
                String a = m19700a(false);
                if (a == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    StringBuilder sb = new StringBuilder("No cookies in ");
                    sb.append(this.f26816d);
                    throw new IllegalArgumentException(sb.toString());
                } else if (m19703b()) {
                    if (i != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    C9849e eVar = new C9849e(a, m19699a(str));
                    eVar.f26812l = i ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        m19704c();
                        if (this.f26818f == this.f26816d.length()) {
                            break;
                        } else if (this.f26816d.charAt(this.f26818f) == ',') {
                            this.f26818f++;
                            break;
                        } else {
                            if (this.f26816d.charAt(this.f26818f) == ';') {
                                this.f26818f++;
                            }
                            String a2 = m19700a(true);
                            if (a2 != null) {
                                if (i != 0 || "expires".equals(a2) || "port".equals(a2)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (m19703b()) {
                                    str3 = m19699a(str2);
                                }
                                m19701a(eVar, a2, str3);
                            }
                        }
                    }
                    if (this.f26813a) {
                        eVar.f26812l = 0;
                    } else if (this.f26814b) {
                        eVar.f26812l = 1;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected '=' after ");
                    sb2.append(a);
                    sb2.append(" in ");
                    sb2.append(this.f26816d);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }

        C9851a(String str) {
            this.f26816d = str;
            this.f26817e = str.toLowerCase(Locale.US);
        }

        /* renamed from: a */
        private String m19699a(String str) {
            m19704c();
            int b = m19702b(str);
            String substring = this.f26816d.substring(this.f26818f, b);
            this.f26818f = b;
            return substring;
        }

        /* renamed from: a */
        private String m19700a(boolean z) {
            String str;
            String str2;
            m19704c();
            int b = m19702b(",;= \t");
            if (z) {
                str = this.f26817e;
            } else {
                str = this.f26816d;
            }
            if (this.f26818f < b) {
                str2 = str.substring(this.f26818f, b);
            } else {
                str2 = null;
            }
            this.f26818f = b;
            return str2;
        }

        /* renamed from: b */
        private int m19702b(String str) {
            for (int i = this.f26818f; i < this.f26816d.length(); i++) {
                if (str.indexOf(this.f26816d.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.f26816d.length();
        }

        /* renamed from: a */
        private void m19701a(C9849e eVar, String str, String str2) {
            if (str.equals("comment") && eVar.f26801a == null) {
                eVar.f26801a = str2;
            } else if (str.equals("commenturl") && eVar.f26802b == null) {
                eVar.f26802b = str2;
            } else if (str.equals("discard")) {
                eVar.f26803c = true;
            } else if (!str.equals("domain") || eVar.f26804d != null) {
                if (str.equals("expires")) {
                    this.f26813a = true;
                    if (eVar.f26805e == -1) {
                        Date b = C9849e.m19691b(str2);
                        if (b != null) {
                            eVar.mo17685a(b);
                        } else {
                            eVar.f26805e = 0;
                        }
                    }
                } else if (str.equals("max-age") && eVar.f26805e == -1) {
                    try {
                        long parseLong = Long.parseLong(str2);
                        this.f26814b = true;
                        eVar.f26805e = parseLong;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb = new StringBuilder("Invalid max-age: ");
                        sb.append(str2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (str.equals(LeakCanaryFileProvider.f132050j) && eVar.f26807g == null) {
                    eVar.f26807g = str2;
                } else if (str.equals("port") && eVar.f26808h == null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.f26808h = str2;
                } else if (str.equals("secure")) {
                    eVar.f26809i = true;
                } else if (str.equals("httponly")) {
                    eVar.f26810j = true;
                } else if (str.equals(C42311c.f106863g) && !this.f26815c) {
                    eVar.f26812l = Integer.parseInt(str2);
                }
            } else {
                eVar.f26804d = str2;
            }
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f26806f.toLowerCase(Locale.US).hashCode();
        int i2 = 0;
        if (this.f26804d == null) {
            i = 0;
        } else {
            i = this.f26804d.toLowerCase(Locale.US).hashCode();
        }
        int i3 = hashCode + i;
        if (this.f26807g != null) {
            i2 = this.f26807g.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        if (this.f26812l == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26806f);
            sb.append("=");
            sb.append(this.f26811k);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26806f);
        sb2.append("=\"");
        sb2.append(this.f26811k);
        sb2.append("\"");
        m19687a(sb2, "Path", this.f26807g);
        m19687a(sb2, "Domain", this.f26804d);
        m19687a(sb2, "Port", this.f26808h);
        return sb2.toString();
    }

    static {
        HashSet hashSet = new HashSet();
        f26796m = hashSet;
        hashSet.add("comment");
        f26796m.add("commenturl");
        f26796m.add("discard");
        f26796m.add("domain");
        f26796m.add("expires");
        f26796m.add("httponly");
        f26796m.add("max-age");
        f26796m.add(LeakCanaryFileProvider.f132050j);
        f26796m.add("port");
        f26796m.add("secure");
        f26796m.add(C42311c.f106863g);
        f26797n = null;
        f26798o = null;
        try {
            f26797n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            f26798o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo17686a() {
        boolean z = false;
        if (this.f26805e == -1) {
            return false;
        }
        if (this.f26805e <= 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo17684a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase(Locale.US);
        }
        this.f26804d = str2;
    }

    /* renamed from: c */
    private static String m19693c(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m19695e(String str) {
        try {
            if (f26797n.matcher(str).matches() || f26798o.matcher(str).matches()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static Date m19691b(String str) {
        try {
            return ((DateFormat) f26799p.get()).parse(str);
        } catch (ParseException unused) {
            String[] strArr = f26800q;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return new SimpleDateFormat(strArr[i], Locale.US).parse(str);
                } catch (ParseException unused2) {
                    i++;
                }
            }
            return null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9849e)) {
            return false;
        }
        C9849e eVar = (C9849e) obj;
        if (this.f26806f.equalsIgnoreCase(eVar.f26806f) && (this.f26804d == null ? eVar.f26804d == null : this.f26804d.equalsIgnoreCase(eVar.f26804d))) {
            String str = this.f26807g;
            String str2 = eVar.f26807g;
            if (str != null) {
                z = str.equals(str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m19694d(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith(ClassUtils.INNER_CLASS_SEPARATOR) || f26796m.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return z;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',' || (Character.isWhitespace(charAt) && charAt != ' ')) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo17685a(Date date) {
        this.f26805e = (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    public C9849e(String str, String str2) {
        String trim = str.trim();
        if (m19694d(trim)) {
            this.f26806f = trim;
            this.f26811k = str2;
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid name: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m19688a(C9849e eVar, URI uri) {
        return m19693c(uri.getPath()).startsWith(m19693c(eVar.f26807g));
    }

    /* renamed from: a */
    private static boolean m19689a(String str, int i) {
        int indexOf = str.indexOf(46, i + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m19692b(C9849e eVar, URI uri) {
        if (eVar.f26808h == null) {
            return true;
        }
        return Arrays.asList(eVar.f26808h.split(",")).contains(Integer.toString(C9857h.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    /* renamed from: a */
    public static boolean m19690a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        String lowerCase2 = str.toLowerCase(Locale.US);
        if (lowerCase.equals(lowerCase2) && (m19689a(lowerCase, 0) || m19695e(lowerCase))) {
            return true;
        }
        if (!m19689a(lowerCase, 0)) {
            return lowerCase2.equals(".local");
        }
        if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) && lowerCase2.endsWith(lowerCase) && m19689a(lowerCase2, 1)) {
            return true;
        }
        if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2) || ((!lowerCase2.startsWith(ClassUtils.PACKAGE_SEPARATOR) || !m19689a(lowerCase2, 1)) && !lowerCase2.equals(".local"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m19687a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
