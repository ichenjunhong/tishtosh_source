package com.toutiao.proxyserver.net;

/* renamed from: com.toutiao.proxyserver.net.c */
public final class C51873c {

    /* renamed from: a */
    public final String f129405a;

    /* renamed from: b */
    public final String f129406b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader{name='");
        sb.append(this.f129405a);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.f129406b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C51873c(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() == 0 || trim2.length() == 0) {
            throw new IllegalArgumentException("name and value can't be empty");
        }
        this.f129405a = trim;
        this.f129406b = trim2;
    }
}
