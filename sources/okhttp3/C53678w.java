package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: okhttp3.w */
public final class C53678w {

    /* renamed from: c */
    private static final Pattern f133163c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d */
    private static final Pattern f133164d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f133165a;

    /* renamed from: b */
    public final String f133166b;

    /* renamed from: e */
    private final String f133167e;

    /* renamed from: f */
    private final String f133168f;

    public final String toString() {
        return this.f133167e;
    }

    /* renamed from: a */
    public final Charset mo111640a() {
        return mo111641a((Charset) null);
    }

    public final int hashCode() {
        return this.f133167e.hashCode();
    }

    /* renamed from: a */
    public final Charset mo111641a(Charset charset) {
        try {
            if (this.f133168f != null) {
                return Charset.forName(this.f133168f);
            }
            return charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53678w) || !((C53678w) obj).f133167e.equals(this.f133167e)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C53678w m114225a(String str) {
        Matcher matcher = f133163c.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f133164d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 == null) {
                    group2 = matcher2.group(3);
                } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                    group2 = group2.substring(1, group2.length() - 1);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group2;
            }
        }
        return new C53678w(str, lowerCase, lowerCase2, str2);
    }

    private C53678w(String str, String str2, String str3, String str4) {
        this.f133167e = str;
        this.f133165a = str2;
        this.f133166b = str3;
        this.f133168f = str4;
    }
}
