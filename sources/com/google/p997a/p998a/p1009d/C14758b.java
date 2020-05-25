package com.google.p997a.p998a.p1009d;

import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14814o;
import com.google.p997a.p998a.p1020g.C14815p;
import com.google.p997a.p998a.p1020g.p1021a.C14786a;
import com.google.p997a.p998a.p1020g.p1021a.C14787b;
import com.google.p997a.p998a.p1020g.p1021a.C14788c;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.a.a.d.b */
public final class C14758b extends C14806j {

    /* renamed from: g */
    private static final C14787b f38255g = new C14788c("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: a */
    public String f38256a;

    /* renamed from: b */
    public String f38257b;

    /* renamed from: c */
    public String f38258c;

    /* renamed from: d */
    public int f38259d;

    /* renamed from: e */
    public List<String> f38260e;

    /* renamed from: f */
    public String f38261f;

    public C14758b() {
        this.f38259d = -1;
    }

    public final String toString() {
        return mo27050a();
    }

    public final int hashCode() {
        return mo27050a().hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C14758b clone() {
        C14758b bVar = (C14758b) super.clone();
        if (this.f38260e != null) {
            bVar.f38260e = new ArrayList(this.f38260e);
        }
        return bVar;
    }

    /* renamed from: e */
    private String m30168e() {
        StringBuilder sb = new StringBuilder();
        if (this.f38260e != null) {
            m30163a(sb);
        }
        m30164a(entrySet(), sb);
        String str = this.f38261f;
        if (str != null) {
            sb.append('#');
            sb.append(f38255g.mo27108a(str));
        }
        return sb.toString();
    }

    /* renamed from: d */
    private String m30167d() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) C14814o.m30287a(this.f38256a));
        sb.append("://");
        if (this.f38258c != null) {
            sb.append(C14786a.m30243b(this.f38258c));
            sb.append('@');
        }
        sb.append((String) C14814o.m30287a(this.f38257b));
        int i = this.f38259d;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo27050a() {
        String valueOf = String.valueOf(m30167d());
        String valueOf2 = String.valueOf(m30168e());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public C14758b(String str) {
        this(m30162a(str));
    }

    /* renamed from: a */
    private static URL m30162a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof C14758b)) {
            return false;
        }
        return mo27050a().equals(((C14758b) obj).toString());
    }

    private C14758b(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    /* renamed from: a */
    private void m30163a(StringBuilder sb) {
        int size = this.f38260e.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f38260e.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                sb.append(C14786a.f38298a.mo27108a(str));
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14806j mo27048b(String str, Object obj) {
        return (C14758b) super.mo27048b(str, obj);
    }

    /* renamed from: a */
    private static void m30164a(Set<Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Entry entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String c = C14786a.m30244c((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object a : (Collection) value) {
                        z = m30165a(z, sb, c, a);
                    }
                } else {
                    z = m30165a(z, sb, c, value);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m30165a(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            z = false;
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String c = C14786a.m30244c(obj.toString());
        if (c.length() != 0) {
            sb.append('=');
            sb.append(c);
        }
        return z;
    }

    private C14758b(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        List<String> list;
        String str7;
        boolean z;
        String str8;
        this.f38259d = -1;
        this.f38256a = str.toLowerCase();
        this.f38257b = str2;
        this.f38259d = i;
        String str9 = null;
        if (str3 == null || str3.length() == 0) {
            list = null;
        } else {
            list = new ArrayList<>();
            boolean z2 = true;
            int i2 = 0;
            while (z2) {
                int indexOf = str3.indexOf(47, i2);
                if (indexOf != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str8 = str3.substring(i2, indexOf);
                } else {
                    str8 = str3.substring(i2);
                }
                list.add(C14786a.m30242a(str8));
                i2 = indexOf + 1;
                z2 = z;
            }
        }
        this.f38260e = list;
        if (str4 != null) {
            str7 = C14786a.m30242a(str4);
        } else {
            str7 = null;
        }
        this.f38261f = str7;
        if (!(str5 == null || str5 == null)) {
            try {
                C14770j.m30184a(new StringReader(str5), this);
            } catch (IOException e) {
                throw C14815p.m30292a(e);
            }
        }
        if (str6 != null) {
            str9 = C14786a.m30242a(str6);
        }
        this.f38258c = str9;
    }
}
