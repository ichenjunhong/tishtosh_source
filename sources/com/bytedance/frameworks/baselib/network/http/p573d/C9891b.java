package com.bytedance.frameworks.baselib.network.http.p573d;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.b */
public final class C9891b {

    /* renamed from: a */
    Hashtable f26953a = new Hashtable();

    public C9891b() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f26953a.size() * 16);
        Enumeration keys = this.f26953a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(m19801b((String) this.f26953a.get(str)));
        }
        return stringBuffer.toString();
    }

    public C9891b(String str) throws C9892c {
        m19799a(str);
    }

    /* renamed from: a */
    private static boolean m19800a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static String m19802c(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!z && charAt != '\\') {
                stringBuffer.append(charAt);
            } else if (z) {
                stringBuffer.append(charAt);
                z = false;
            } else {
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    private static String m19801b(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            z = !m19800a(str.charAt(i));
        }
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d = (double) length;
        Double.isNaN(d);
        stringBuffer.ensureCapacity((int) (d * 1.5d));
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m19799a(String str) throws C9892c {
        int i;
        String str2;
        if (str != null) {
            int length = str.length();
            if (length > 0) {
                int a = m19798a(str, 0);
                while (a < length && str.charAt(a) == ';') {
                    int a2 = m19798a(str, a + 1);
                    if (a2 < length) {
                        int i2 = a2;
                        while (i2 < length && m19800a(str.charAt(i2))) {
                            i2++;
                        }
                        String lowerCase = str.substring(a2, i2).toLowerCase(Locale.ENGLISH);
                        int a3 = m19798a(str, i2);
                        if (a3 >= length || str.charAt(a3) != '=') {
                            throw new C9892c("Couldn't find the '=' that separates a parameter name from its value.");
                        }
                        int a4 = m19798a(str, a3 + 1);
                        if (a4 < length) {
                            char charAt = str.charAt(a4);
                            if (charAt == '\"') {
                                int i3 = a4 + 1;
                                if (i3 < length) {
                                    char c = charAt;
                                    int i4 = i3;
                                    while (i4 < length) {
                                        c = str.charAt(i4);
                                        if (c == '\"') {
                                            break;
                                        }
                                        if (c == '\\') {
                                            i4++;
                                        }
                                        i4++;
                                    }
                                    if (c == '\"') {
                                        str2 = m19802c(str.substring(i3, i4));
                                        i = i4 + 1;
                                    } else {
                                        throw new C9892c("Encountered unterminated quoted parameter value.");
                                    }
                                } else {
                                    throw new C9892c("Encountered unterminated quoted parameter value.");
                                }
                            } else if (m19800a(charAt)) {
                                i = a4;
                                while (i < length && m19800a(str.charAt(i))) {
                                    i++;
                                }
                                str2 = str.substring(a4, i);
                            } else {
                                StringBuilder sb = new StringBuilder("Unexpected character encountered at index ");
                                sb.append(a4);
                                throw new C9892c(sb.toString());
                            }
                            this.f26953a.put(lowerCase, str2);
                            a = m19798a(str, i);
                        } else {
                            StringBuilder sb2 = new StringBuilder("Couldn't find a value for parameter named ");
                            sb2.append(lowerCase);
                            throw new C9892c(sb2.toString());
                        }
                    } else {
                        return;
                    }
                }
                if (a < length) {
                    throw new C9892c("More characters encountered in input than expected.");
                }
            }
        }
    }

    /* renamed from: a */
    private static int m19798a(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
