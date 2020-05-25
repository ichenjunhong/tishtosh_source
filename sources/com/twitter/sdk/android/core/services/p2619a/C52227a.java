package com.twitter.sdk.android.core.services.p2619a;

/* renamed from: com.twitter.sdk.android.core.services.a.a */
public final class C52227a {

    /* renamed from: a */
    public final double f130058a;

    /* renamed from: b */
    public final double f130059b;

    /* renamed from: c */
    public final int f130060c;

    /* renamed from: d */
    public final C52228a f130061d;

    /* renamed from: com.twitter.sdk.android.core.services.a.a$a */
    public enum C52228a {
        MILES("mi"),
        KILOMETERS("km");
        
        public final String identifier;

        private C52228a(String str) {
            this.identifier = str;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f130058a);
        sb.append(",");
        sb.append(this.f130059b);
        sb.append(",");
        sb.append(this.f130060c);
        sb.append(this.f130061d.identifier);
        return sb.toString();
    }
}
