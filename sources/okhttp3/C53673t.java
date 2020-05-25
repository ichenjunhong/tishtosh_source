package okhttp3;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.C53559c;
import okio.Buffer;

/* renamed from: okhttp3.t */
public final class C53673t {

    /* renamed from: i */
    private static final char[] f133139i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f133140a;

    /* renamed from: b */
    public final String f133141b;

    /* renamed from: c */
    public final String f133142c;

    /* renamed from: d */
    public final String f133143d;

    /* renamed from: e */
    public final int f133144e;

    /* renamed from: f */
    public final List<String> f133145f;

    /* renamed from: g */
    public final List<String> f133146g;

    /* renamed from: h */
    public final String f133147h;

    /* renamed from: j */
    private final String f133148j;

    /* renamed from: okhttp3.t$a */
    public static final class C53674a {

        /* renamed from: a */
        String f133149a;

        /* renamed from: b */
        String f133150b = "";

        /* renamed from: c */
        String f133151c = "";

        /* renamed from: d */
        String f133152d;

        /* renamed from: e */
        int f133153e = -1;

        /* renamed from: f */
        final List<String> f133154f = new ArrayList();

        /* renamed from: g */
        public List<String> f133155g;

        /* renamed from: h */
        String f133156h;

        /* renamed from: okhttp3.t$a$a */
        enum C53675a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo111626a() {
            if (this.f133153e != -1) {
                return this.f133153e;
            }
            return C53673t.m114168a(this.f133149a);
        }

        public C53674a() {
            this.f133154f.add("");
        }

        /* renamed from: b */
        public final C53673t mo111632b() {
            if (this.f133149a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f133152d != null) {
                return new C53673t(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* renamed from: c */
        private void m114199c() {
            if (!((String) this.f133154f.remove(this.f133154f.size() - 1)).isEmpty() || this.f133154f.isEmpty()) {
                this.f133154f.add("");
            } else {
                this.f133154f.set(this.f133154f.size() - 1, "");
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f133149a);
            sb.append("://");
            if (!this.f133150b.isEmpty() || !this.f133151c.isEmpty()) {
                sb.append(this.f133150b);
                if (!this.f133151c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f133151c);
                }
                sb.append('@');
            }
            if (this.f133152d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f133152d);
                sb.append(']');
            } else {
                sb.append(this.f133152d);
            }
            int a = mo111626a();
            if (a != C53673t.m114168a(this.f133149a)) {
                sb.append(':');
                sb.append(a);
            }
            C53673t.m114175a(sb, this.f133154f);
            if (this.f133155g != null) {
                sb.append('?');
                C53673t.m114179b(sb, this.f133155g);
            }
            if (this.f133156h != null) {
                sb.append('#');
                sb.append(this.f133156h);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final C53674a mo111630b(String str) {
            this.f133150b = C53673t.m114171a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: c */
        public final C53674a mo111633c(String str) {
            this.f133151c = C53673t.m114171a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: i */
        private static boolean m114204i(String str) {
            if (str.equals(ClassUtils.PACKAGE_SEPARATOR) || str.equalsIgnoreCase("%2e")) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final C53674a mo111636e(String str) {
            if (str != null) {
                m114196a(str, 0, str.length(), false, false);
                return this;
            }
            throw new NullPointerException("pathSegment == null");
        }

        /* renamed from: g */
        public final C53674a mo111638g(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (this.f133155g == null) {
                return this;
            } else {
                m114203h(C53673t.m114171a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                return this;
            }
        }

        /* renamed from: h */
        private void m114203h(String str) {
            for (int size = this.f133155g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.f133155g.get(size))) {
                    this.f133155g.remove(size + 1);
                    this.f133155g.remove(size);
                    if (this.f133155g.isEmpty()) {
                        this.f133155g = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: j */
        private static boolean m114205j(String str) {
            if (str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e")) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final C53674a mo111628a(String str) {
            if (str.equalsIgnoreCase(WebKitApi.SCHEME_HTTP)) {
                this.f133149a = WebKitApi.SCHEME_HTTP;
            } else if (str.equalsIgnoreCase(WebKitApi.SCHEME_HTTPS)) {
                this.f133149a = WebKitApi.SCHEME_HTTPS;
            } else {
                StringBuilder sb = new StringBuilder("unexpected scheme: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            return this;
        }

        /* renamed from: d */
        public final C53674a mo111635d(String str) {
            if (str != null) {
                String e = m114201e(str, 0, str.length());
                if (e != null) {
                    this.f133152d = e;
                    return this;
                }
                StringBuilder sb = new StringBuilder("unexpected host: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("host == null");
        }

        /* renamed from: f */
        public final C53674a mo111637f(String str) {
            List<String> list;
            if (str != null) {
                list = C53673t.m114178b(C53673t.m114171a(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f133155g = list;
            return this;
        }

        /* renamed from: c */
        public final C53674a mo111634c(String str, String str2) {
            mo111638g(str);
            mo111629a(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C53674a mo111631b(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f133155g == null) {
                    this.f133155g = new ArrayList();
                }
                this.f133155g.add(C53673t.m114171a(str, " \"'<>#&=", true, false, true, true));
                List<String> list = this.f133155g;
                if (str2 != null) {
                    str3 = C53673t.m114171a(str2, " \"'<>#&=", true, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C53675a mo111627a(C53673t tVar, String str) {
            int i;
            int a;
            char c;
            int i2;
            C53673t tVar2 = tVar;
            String str2 = str;
            int a2 = C53559c.m113792a(str2, 0, str.length());
            int b = C53559c.m113812b(str2, a2, str.length());
            if (m114197b(str2, a2, b) != -1) {
                if (str.regionMatches(true, a2, "https:", 0, 6)) {
                    this.f133149a = WebKitApi.SCHEME_HTTPS;
                    a2 += 6;
                } else {
                    if (!str.regionMatches(true, a2, "http:", 0, 5)) {
                        return C53675a.UNSUPPORTED_SCHEME;
                    }
                    this.f133149a = WebKitApi.SCHEME_HTTP;
                    a2 += 5;
                }
            } else if (tVar2 == null) {
                return C53675a.MISSING_SCHEME;
            } else {
                this.f133149a = tVar2.f133140a;
            }
            int c2 = m114198c(str2, a2, b);
            char c3 = '#';
            if (c2 >= 2 || tVar2 == null || !tVar2.f133140a.equals(this.f133149a)) {
                int i3 = a2 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a = C53559c.m113794a(str2, i3, b, "@/\\?#");
                    if (a != b) {
                        c = str2.charAt(a);
                    } else {
                        c = 65535;
                    }
                    if (!(c == 65535 || c == c3 || c == '/' || c == '\\')) {
                        switch (c) {
                            case '?':
                                break;
                            case UnReadVideoExperiment.RELATION_LIST /*64*/:
                                if (!z) {
                                    int a3 = C53559c.m113793a(str2, i3, a, ':');
                                    int i4 = a3;
                                    i2 = a;
                                    String a4 = C53673t.m114169a(str, i3, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    if (z2) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(this.f133150b);
                                        sb.append("%40");
                                        sb.append(a4);
                                        a4 = sb.toString();
                                    }
                                    this.f133150b = a4;
                                    if (i4 != i2) {
                                        this.f133151c = C53673t.m114169a(str, i4 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                        z = true;
                                    }
                                    z2 = true;
                                } else {
                                    i2 = a;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f133151c);
                                    sb2.append("%40");
                                    sb2.append(C53673t.m114169a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                    this.f133151c = sb2.toString();
                                }
                                i3 = i2 + 1;
                                c3 = '#';
                                continue;
                        }
                    }
                }
                i = a;
                int d = m114200d(str2, i3, i);
                int i5 = d + 1;
                if (i5 < i) {
                    this.f133152d = m114201e(str2, i3, d);
                    this.f133153e = m114202f(str2, i5, i);
                    if (this.f133153e == -1) {
                        return C53675a.INVALID_PORT;
                    }
                } else {
                    this.f133152d = m114201e(str2, i3, d);
                    this.f133153e = C53673t.m114168a(this.f133149a);
                }
                if (this.f133152d == null) {
                    return C53675a.INVALID_HOST;
                }
            } else {
                this.f133150b = tVar.mo111614d();
                this.f133151c = tVar.mo111616e();
                this.f133152d = tVar2.f133143d;
                this.f133153e = tVar2.f133144e;
                this.f133154f.clear();
                this.f133154f.addAll(tVar.mo111620g());
                if (a2 == b || str2.charAt(a2) == '#') {
                    mo111637f(tVar.mo111621h());
                }
                i = a2;
            }
            int a5 = C53559c.m113794a(str2, i, b, "?#");
            m114195a(str2, i, a5);
            if (a5 < b && str2.charAt(a5) == '?') {
                int a6 = C53559c.m113793a(str2, a5, b, '#');
                this.f133155g = C53673t.m114178b(C53673t.m114169a(str, a5 + 1, a6, " \"'<>#", true, false, true, true, null));
                a5 = a6;
            }
            if (a5 < b && str2.charAt(a5) == '#') {
                this.f133156h = C53673t.m114169a(str, 1 + a5, b, "", true, false, false, false, null);
            }
            return C53675a.SUCCESS;
        }

        /* renamed from: a */
        public final C53674a mo111629a(String str, String str2) {
            String str3;
            if (str != null) {
                if (this.f133155g == null) {
                    this.f133155g = new ArrayList();
                }
                this.f133155g.add(C53673t.m114171a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                List<String> list = this.f133155g;
                if (str2 != null) {
                    str3 = C53673t.m114171a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                } else {
                    str3 = null;
                }
                list.add(str3);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: e */
        private static String m114201e(String str, int i, int i2) {
            return C53559c.m113797a(C53673t.m114170a(str, i, i2, false));
        }

        /* renamed from: c */
        private static int m114198c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: d */
        private static int m114200d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: f */
        private static int m114202f(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C53673t.m114169a(str, i, i2, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: a */
        private void m114195a(String str, int i, int i2) {
            boolean z;
            if (i != i2) {
                char charAt = str.charAt(i);
                if (charAt == '/' || charAt == '\\') {
                    this.f133154f.clear();
                    this.f133154f.add("");
                    i++;
                } else {
                    this.f133154f.set(this.f133154f.size() - 1, "");
                }
                while (true) {
                    int i3 = r11;
                    if (i3 < i2) {
                        r11 = C53559c.m113794a(str, i3, i2, "/\\");
                        if (r11 < i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m114196a(str, i3, r11, z, true);
                        if (z) {
                            r11++;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        private static int m114197b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    return -1;
                }
                char charAt2 = str.charAt(i);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                    if (charAt2 == ':') {
                        return i;
                    }
                    return -1;
                }
            }
        }

        /* renamed from: a */
        private void m114196a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C53673t.m114169a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!m114204i(a)) {
                if (m114205j(a)) {
                    m114199c();
                    return;
                }
                if (((String) this.f133154f.get(this.f133154f.size() - 1)).isEmpty()) {
                    this.f133154f.set(this.f133154f.size() - 1, a);
                } else {
                    this.f133154f.add(a);
                }
                if (z) {
                    this.f133154f.add("");
                }
            }
        }
    }

    public final String toString() {
        return this.f133148j;
    }

    /* renamed from: a */
    public final URL mo111610a() {
        try {
            return new URL(this.f133148j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m114176a(Buffer buffer, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C53559c.m113791a(str.charAt(i + 1));
                    int a2 = C53559c.m113791a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        buffer.writeByte((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    buffer.writeUtf8CodePoint(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                buffer.writeByte(32);
                i += Character.charCount(codePointAt);
            }
            buffer.writeUtf8CodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    private static boolean m114177a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C53559c.m113791a(str.charAt(i + 1)) == -1 || C53559c.m113791a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f133148j.hashCode();
    }

    /* renamed from: c */
    public final boolean mo111613c() {
        return this.f133140a.equals(WebKitApi.SCHEME_HTTPS);
    }

    /* renamed from: k */
    private String m114181k() {
        if (this.f133147h == null) {
            return null;
        }
        return this.f133148j.substring(this.f133148j.indexOf(35) + 1);
    }

    /* renamed from: i */
    public final String mo111623i() {
        return mo111617e("/...").mo111630b("").mo111633c("").mo111632b().toString();
    }

    /* renamed from: d */
    public final String mo111614d() {
        if (this.f133141b.isEmpty()) {
            return "";
        }
        int length = this.f133140a.length() + 3;
        String str = this.f133148j;
        return this.f133148j.substring(length, C53559c.m113794a(str, length, str.length(), ":@"));
    }

    /* renamed from: e */
    public final String mo111616e() {
        if (this.f133142c.isEmpty()) {
            return "";
        }
        return this.f133148j.substring(this.f133148j.indexOf(58, this.f133140a.length() + 3) + 1, this.f133148j.indexOf(64));
    }

    /* renamed from: f */
    public final String mo111619f() {
        int indexOf = this.f133148j.indexOf(47, this.f133140a.length() + 3);
        String str = this.f133148j;
        return this.f133148j.substring(indexOf, C53559c.m113794a(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: g */
    public final List<String> mo111620g() {
        int indexOf = this.f133148j.indexOf(47, this.f133140a.length() + 3);
        String str = this.f133148j;
        int a = C53559c.m113794a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            int a2 = C53559c.m113793a(this.f133148j, i, a, '/');
            arrayList.add(this.f133148j.substring(i, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String mo111621h() {
        if (this.f133146g == null) {
            return null;
        }
        int indexOf = this.f133148j.indexOf(63) + 1;
        String str = this.f133148j;
        return this.f133148j.substring(indexOf, C53559c.m113793a(str, indexOf, str.length(), '#'));
    }

    /* renamed from: j */
    public final C53674a mo111624j() {
        int i;
        C53674a aVar = new C53674a();
        aVar.f133149a = this.f133140a;
        aVar.f133150b = mo111614d();
        aVar.f133151c = mo111616e();
        aVar.f133152d = this.f133143d;
        if (this.f133144e != m114168a(this.f133140a)) {
            i = this.f133144e;
        } else {
            i = -1;
        }
        aVar.f133153e = i;
        aVar.f133154f.clear();
        aVar.f133154f.addAll(mo111620g());
        aVar.mo111637f(mo111621h());
        aVar.f133156h = m114181k();
        return aVar;
    }

    /* renamed from: b */
    public final URI mo111611b() {
        C53674a j = mo111624j();
        int size = j.f133154f.size();
        for (int i = 0; i < size; i++) {
            j.f133154f.set(i, m114171a((String) j.f133154f.get(i), "[]", true, true, false, true));
        }
        if (j.f133155g != null) {
            int size2 = j.f133155g.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) j.f133155g.get(i2);
                if (str != null) {
                    j.f133155g.set(i2, m114171a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (j.f133156h != null) {
            j.f133156h = m114171a(j.f133156h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar = j.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    public final C53673t mo111615d(String str) {
        C53674a e = mo111617e(str);
        if (e != null) {
            return e.mo111632b();
        }
        return null;
    }

    /* renamed from: e */
    public final C53674a mo111617e(String str) {
        C53674a aVar = new C53674a();
        if (aVar.mo111627a(this, str) == C53675a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    /* renamed from: a */
    public static int m114168a(String str) {
        if (str.equals(WebKitApi.SCHEME_HTTP)) {
            return 80;
        }
        if (str.equals(WebKitApi.SCHEME_HTTPS)) {
            return 443;
        }
        return -1;
    }

    /* renamed from: f */
    public static C53673t m114180f(String str) {
        C53674a aVar = new C53674a();
        if (aVar.mo111627a((C53673t) null, str) == C53675a.SUCCESS) {
            return aVar.mo111632b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53673t) || !((C53673t) obj).f133148j.equals(this.f133148j)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo111612c(String str) {
        if (this.f133146g == null) {
            return null;
        }
        int size = this.f133146g.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f133146g.get(i))) {
                return (String) this.f133146g.get(i + 1);
            }
        }
        return null;
    }

    C53673t(C53674a aVar) {
        List<String> list;
        this.f133140a = aVar.f133149a;
        this.f133141b = m114173a(aVar.f133150b, false);
        this.f133142c = m114173a(aVar.f133151c, false);
        this.f133143d = aVar.f133152d;
        this.f133144e = aVar.mo111626a();
        this.f133145f = m114174a(aVar.f133154f, false);
        String str = null;
        if (aVar.f133155g != null) {
            list = m114174a(aVar.f133155g, true);
        } else {
            list = null;
        }
        this.f133146g = list;
        if (aVar.f133156h != null) {
            str = m114173a(aVar.f133156h, false);
        }
        this.f133147h = str;
        this.f133148j = aVar.toString();
    }

    /* renamed from: b */
    static List<String> m114178b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m114173a(String str, boolean z) {
        return m114170a(str, 0, str.length(), z);
    }

    /* renamed from: b */
    public static void m114179b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: a */
    private static List<String> m114174a(List<String> list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = (String) list.get(i);
            if (str2 != null) {
                str = m114173a(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m114175a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) list.get(i));
        }
    }

    /* renamed from: a */
    static String m114170a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                m114176a(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static String m114171a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m114169a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* renamed from: a */
    static String m114172a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m114169a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    /* renamed from: a */
    static String m114169a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3;
        String str4 = str;
        int i3 = i2;
        String str5 = str2;
        Charset charset2 = charset;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            int i5 = 43;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str5.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !m114177a(str, i4, i3)))) || (codePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                int i6 = i;
                buffer.writeUtf8(str, i, i4);
                Buffer buffer2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 != i5 || !z3) {
                            if (codePointAt2 >= 32 && codePointAt2 != 127 && (codePointAt2 < 128 || !z4)) {
                                if (str5.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z && (!z2 || m114177a(str, i4, i3))))) {
                                    buffer.writeUtf8CodePoint(codePointAt2);
                                    i4 += Character.charCount(codePointAt2);
                                    i5 = 43;
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            if (charset2 == null || charset2.equals(C53559c.f132737e)) {
                                buffer2.writeUtf8CodePoint(codePointAt2);
                            } else {
                                buffer2.writeString(str, i4, Character.charCount(codePointAt2) + i4, charset2);
                            }
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) f133139i[(readByte >> 4) & 15]);
                                buffer.writeByte((int) f133139i[readByte & 15]);
                            }
                            i4 += Character.charCount(codePointAt2);
                            i5 = 43;
                        } else {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            buffer.writeUtf8(str3);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                    i5 = 43;
                }
                return buffer.readUtf8();
            }
            i4 += Character.charCount(codePointAt);
        }
        int i7 = i;
        return str.substring(i, i2);
    }
}
