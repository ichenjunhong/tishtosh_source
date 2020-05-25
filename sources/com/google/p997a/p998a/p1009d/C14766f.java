package com.google.p997a.p998a.p1009d;

import com.google.p997a.p998a.p1020g.C14814o;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.a.a.d.f */
public final class C14766f {

    /* renamed from: c */
    private static final Pattern f38270c = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");

    /* renamed from: d */
    private static final Pattern f38271d = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");

    /* renamed from: e */
    private static final Pattern f38272e;

    /* renamed from: f */
    private static final Pattern f38273f;

    /* renamed from: a */
    public String f38274a = "application";

    /* renamed from: b */
    public String f38275b = "octet-stream";

    /* renamed from: g */
    private final SortedMap<String, String> f38276g = new TreeMap();

    /* renamed from: h */
    private String f38277h;

    public final String toString() {
        return mo27059a();
    }

    public final int hashCode() {
        return mo27059a().hashCode();
    }

    static {
        String str = "[^\\s/=;\"]+";
        String valueOf = String.valueOf(String.valueOf(str));
        String valueOf2 = String.valueOf(String.valueOf(str));
        String valueOf3 = String.valueOf(String.valueOf(";.*"));
        StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length() + valueOf3.length());
        sb.append("\\s*(");
        sb.append(valueOf);
        sb.append(")/(");
        sb.append(valueOf2);
        sb.append(")\\s*(");
        sb.append(valueOf3);
        sb.append(")?");
        f38272e = Pattern.compile(sb.toString(), 32);
        String valueOf4 = String.valueOf(String.valueOf("\"([^\"]*)\""));
        String valueOf5 = String.valueOf(String.valueOf("[^\\s;\"]*"));
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + 1 + valueOf5.length());
        sb2.append(valueOf4);
        sb2.append("|");
        sb2.append(valueOf5);
        String sb3 = sb2.toString();
        String valueOf6 = String.valueOf(String.valueOf(str));
        String valueOf7 = String.valueOf(String.valueOf(sb3));
        StringBuilder sb4 = new StringBuilder(valueOf6.length() + 12 + valueOf7.length());
        sb4.append("\\s*;\\s*(");
        sb4.append(valueOf6);
        sb4.append(")=(");
        sb4.append(valueOf7);
        sb4.append(")");
        f38273f = Pattern.compile(sb4.toString());
    }

    /* renamed from: a */
    public final String mo27059a() {
        if (this.f38277h != null) {
            return this.f38277h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38274a);
        sb.append('/');
        sb.append(this.f38275b);
        if (this.f38276g != null) {
            for (Entry entry : this.f38276g.entrySet()) {
                String str = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!f38271d.matcher(str).matches()) {
                    String valueOf = String.valueOf(String.valueOf(str.replace("\\", "\\\\").replace("\"", "\\\"")));
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 2);
                    sb2.append("\"");
                    sb2.append(valueOf);
                    sb2.append("\"");
                    str = sb2.toString();
                }
                sb.append(str);
            }
        }
        this.f38277h = sb.toString();
        return this.f38277h;
    }

    /* renamed from: b */
    private C14766f m30179b(String str) {
        this.f38277h = null;
        this.f38276g.remove(str.toLowerCase());
        return this;
    }

    public C14766f(String str) {
        m30178a(str);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof C14766f)) {
            return false;
        }
        C14766f fVar = (C14766f) obj;
        if (fVar == null || !this.f38274a.equalsIgnoreCase(fVar.f38274a) || !this.f38275b.equalsIgnoreCase(fVar.f38275b)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !this.f38276g.equals(fVar.f38276g)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private C14766f m30178a(String str) {
        Matcher matcher = f38272e.matcher(str);
        C14814o.m30290a(matcher.matches(), (Object) "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        C14814o.m30290a(f38270c.matcher(group).matches(), (Object) "Type contains reserved characters");
        this.f38274a = group;
        this.f38277h = null;
        String group2 = matcher.group(2);
        C14814o.m30290a(f38270c.matcher(group2).matches(), (Object) "Subtype contains reserved characters");
        this.f38275b = group2;
        this.f38277h = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = f38273f.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                mo27058a(group4, group5);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C14766f mo27058a(String str, String str2) {
        if (str2 == null) {
            m30179b(str);
            return this;
        }
        C14814o.m30290a(f38271d.matcher(str).matches(), (Object) "Name contains reserved characters");
        this.f38277h = null;
        this.f38276g.put(str.toLowerCase(), str2);
        return this;
    }
}
