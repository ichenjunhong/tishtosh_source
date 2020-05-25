package com.toutiao.proxyserver;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.toutiao.proxyserver.net.C51873c;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.w */
public final class C51914w {

    /* renamed from: a */
    public final C51916b f129546a;

    /* renamed from: b */
    public final List<C51873c> f129547b;

    /* renamed from: c */
    public final C51915a f129548c;

    /* renamed from: com.toutiao.proxyserver.w$a */
    static final class C51915a {

        /* renamed from: a */
        final int f129549a;

        /* renamed from: b */
        final String f129550b;

        /* renamed from: c */
        final String f129551c;

        /* renamed from: d */
        final int f129552d;

        /* renamed from: e */
        final int f129553e;

        /* renamed from: f */
        final String f129554f;

        /* renamed from: g */
        final List<String> f129555g;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Extra{flag=");
            sb.append(this.f129549a);
            sb.append(", rawKey='");
            sb.append(this.f129550b);
            sb.append('\'');
            sb.append(", key='");
            sb.append(this.f129551c);
            sb.append('\'');
            sb.append(", from=");
            sb.append(this.f129552d);
            sb.append(", to=");
            sb.append(this.f129553e);
            sb.append(", urls=");
            sb.append(this.f129555g);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        static C51915a m111314a(C51916b bVar, List<C51873c> list) throws C51917c {
            int indexOf = bVar.f129557b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str = null;
                String str2 = null;
                int i = 0;
                for (String split : bVar.f129557b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str = Uri.decode(split2[1]);
                        } else if (C43882k.f111137a.equals(split2[0])) {
                            str2 = split2[1];
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0]) && C51838d.m111183b(split2[1]) == 1) {
                            i = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    throw new C51917c();
                }
                String str3 = null;
                int i2 = 0;
                int i3 = 0;
                for (C51873c cVar : list) {
                    if (cVar != null && "Range".equalsIgnoreCase(cVar.f129405a)) {
                        int indexOf2 = cVar.f129406b.indexOf("=");
                        if (indexOf2 != -1) {
                            if ("bytes".equalsIgnoreCase(cVar.f129406b.substring(0, indexOf2).trim())) {
                                String substring = cVar.f129406b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i3 = Integer.parseInt(trim2);
                                                if (i2 > i3) {
                                                    throw new C51917c();
                                                }
                                            }
                                            str3 = cVar.f129406b;
                                        } catch (NumberFormatException unused) {
                                            throw new C51917c();
                                        }
                                    } else {
                                        throw new C51917c();
                                    }
                                } else {
                                    throw new C51917c();
                                }
                            } else {
                                throw new C51917c();
                            }
                        } else {
                            throw new C51917c();
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    C51915a aVar = new C51915a(i, str, str2, i2, i3, str3, arrayList);
                    return aVar;
                }
                throw new C51917c();
            }
            throw new C51917c();
        }

        private C51915a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f129549a = i;
            this.f129550b = str;
            this.f129551c = str2;
            this.f129552d = i2;
            this.f129553e = i3;
            this.f129554f = str3;
            this.f129555g = list;
        }
    }

    /* renamed from: com.toutiao.proxyserver.w$b */
    static final class C51916b {

        /* renamed from: a */
        final String f129556a;

        /* renamed from: b */
        final String f129557b;

        /* renamed from: c */
        final String f129558c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestLine{method='");
            sb.append(this.f129556a);
            sb.append('\'');
            sb.append(", path='");
            sb.append(this.f129557b);
            sb.append('\'');
            sb.append(", version='");
            sb.append(this.f129558c);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        C51916b(String str, String str2, String str3) {
            this.f129556a = str;
            this.f129557b = str2;
            this.f129558c = str3;
        }
    }

    /* renamed from: com.toutiao.proxyserver.w$c */
    static final class C51917c extends Exception {
        C51917c() {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{requestLine=");
        sb.append(this.f129546a);
        sb.append(", headers=");
        sb.append(this.f129547b);
        sb.append(", extra=");
        sb.append(this.f129548c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C51914w m111312a(InputStream inputStream) throws IOException, C51917c {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C51838d.f129327a));
        ArrayList arrayList = new ArrayList();
        C51916b bVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!TextUtils.isEmpty(readLine)) {
                String trim = readLine.trim();
                if (bVar == null) {
                    int indexOf = trim.indexOf(32);
                    if (indexOf != -1) {
                        int lastIndexOf = trim.lastIndexOf(32);
                        if (lastIndexOf > indexOf) {
                            String trim2 = trim.substring(0, indexOf).trim();
                            String trim3 = trim.substring(indexOf + 1, lastIndexOf).trim();
                            String trim4 = trim.substring(lastIndexOf + 1).trim();
                            if (trim2.length() != 0 && trim3.length() != 0 && trim4.length() != 0) {
                                bVar = new C51916b(trim2, trim3, trim4);
                            }
                        } else {
                            throw new C51917c();
                        }
                    } else {
                        throw new C51917c();
                    }
                } else {
                    try {
                        int indexOf2 = trim.indexOf(":");
                        if (indexOf2 != -1) {
                            arrayList.add(new C51873c(trim.substring(0, indexOf2), trim.substring(indexOf2 + 1)));
                        } else {
                            StringBuilder sb = new StringBuilder("request header format error, header: ");
                            sb.append(trim);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } catch (IllegalArgumentException unused) {
                        throw new C51917c();
                    }
                }
            } else if (bVar != null) {
                return new C51914w(bVar, arrayList, C51915a.m111314a(bVar, arrayList));
            } else {
                throw new C51917c();
            }
        }
        throw new C51917c();
    }

    private C51914w(C51916b bVar, List<C51873c> list, C51915a aVar) {
        this.f129546a = bVar;
        this.f129547b = list;
        this.f129548c = aVar;
    }

    /* renamed from: a */
    public static String m111313a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk=");
        sb.append(Uri.encode(str));
        sb.append("&k");
        sb.append("=");
        sb.append(str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode((String) list.get(i)));
        }
        return sb.toString();
    }
}
