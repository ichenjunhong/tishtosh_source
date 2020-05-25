package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: com.ss.c.a.a.b.f */
public final class C51202f extends C51209l {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C51208k call() throws Exception {
        boolean z;
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f127898b);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress hostAddress : allByName) {
                    String hostAddress2 = hostAddress.getHostAddress();
                    if (C51209l.f127897a == null) {
                        C51209l.f127897a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
                    }
                    if (TextUtils.isEmpty(hostAddress2) || hostAddress2.length() < 7 || hostAddress2.length() > 15 || !C51209l.f127897a.matcher(hostAddress2).matches()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(hostAddress2);
                    }
                }
            }
            if (C51203g.f127877a) {
                StringBuilder sb = new StringBuilder("succeed, host= ");
                sb.append(this.f127898b);
                sb.append(", ips= ");
                sb.append(arrayList);
            }
            return new C51208k(this.f127898b, arrayList, 0);
        } catch (UnknownHostException unused) {
            if (C51203g.f127877a) {
                new StringBuilder("failed, host= ").append(this.f127898b);
            }
            return new C51208k(this.f127898b, null, 0);
        }
    }

    C51202f(String str) {
        super(str);
    }
}
