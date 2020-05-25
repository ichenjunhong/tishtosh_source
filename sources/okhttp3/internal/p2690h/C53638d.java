package okhttp3.internal.p2690h;

import com.taobao.android.dexposed.ClassUtils;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.internal.h.d */
public final class C53638d implements HostnameVerifier {

    /* renamed from: a */
    public static final C53638d f133008a = new C53638d();

    private C53638d() {
    }

    /* renamed from: a */
    public static List<String> m114066a(X509Certificate x509Certificate) {
        List a = m114067a(x509Certificate, 7);
        List a2 = m114067a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo111529a(String str, X509Certificate x509Certificate) {
        if (C53559c.m113816c(str)) {
            return m114069b(str, x509Certificate);
        }
        return m114070c(str, x509Certificate);
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo111529a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m114069b(String str, X509Certificate x509Certificate) {
        List a = m114067a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m114070c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String a : m114067a(x509Certificate, 2)) {
            if (m114068a(lowerCase, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m114067a(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private static boolean m114068a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(ClassUtils.PACKAGE_SEPARATOR) || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(ClassUtils.PACKAGE_SEPARATOR) || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            str = sb.toString();
        }
        if (!str2.endsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append('.');
            str2 = sb2.toString();
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
            return true;
        }
        return false;
    }
}
