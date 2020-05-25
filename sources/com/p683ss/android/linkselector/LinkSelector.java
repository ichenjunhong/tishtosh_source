package com.p683ss.android.linkselector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.linkselector.p1176b.C19201a;
import com.p683ss.android.linkselector.p1176b.C19202b;
import com.p683ss.android.linkselector.p1177c.C19203a;
import com.p683ss.android.linkselector.p1177c.C19204b;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.linkselector.LinkSelector */
public final class LinkSelector {

    /* renamed from: f */
    public static Context f52898f;

    /* renamed from: i */
    private static LinkSelector f52899i = new LinkSelector();

    /* renamed from: a */
    public boolean f52900a = false;

    /* renamed from: b */
    public NetworkChangeReceiver f52901b;

    /* renamed from: c */
    public long f52902c = 300000;

    /* renamed from: d */
    public int f52903d = 10000;

    /* renamed from: e */
    public C19203a f52904e;

    /* renamed from: g */
    private Map<String, C19198a> f52905g = new ConcurrentHashMap();

    /* renamed from: h */
    private Map<Pattern, String> f52906h = new LinkedHashMap();

    /* renamed from: com.ss.android.linkselector.LinkSelector$NetworkChangeReceiver */
    public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (LinkSelector.this.mo39181b()) {
                LinkSelector.this.mo39175a((C19198a) null);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo39181b() {
        return C19200b.m46810a(this);
    }

    /* renamed from: d */
    private static void m46795d() {
        if (f52898f == null) {
            throw new IllegalStateException("LinkSelector may not been initialize! call init() in Application.onCreate() or make sure init() has been called before getInstance().");
        }
    }

    private LinkSelector() {
    }

    /* renamed from: a */
    public static LinkSelector m46790a() {
        m46795d();
        if (f52899i == null) {
            f52899i = new LinkSelector();
        }
        return f52899i;
    }

    /* renamed from: c */
    public static boolean m46793c() {
        if (f52898f == null) {
            return true;
        }
        try {
            NetworkInfo a = C19200b.m46809a((ConnectivityManager) f52898f.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            new StringBuilder("isNetworkAvailable:").append(e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo39176a(C19204b bVar) {
        if (this.f52904e != null) {
            this.f52904e.mo39197a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo39179b(String str) {
        if (mo39181b()) {
            new StringBuilder("on link api success:").append(str);
        }
    }

    /* renamed from: a */
    public static LinkSelector m46791a(Context context) {
        if (context != null) {
            f52898f = context.getApplicationContext();
            return m46790a();
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* renamed from: b */
    public final synchronized void mo39180b(Map<Pattern, String> map) {
        if (map != null) {
            this.f52906h.clear();
            this.f52906h.putAll(map);
        }
    }

    /* renamed from: c */
    private void m46792c(String str) {
        boolean z;
        if (mo39181b()) {
            for (Entry entry : this.f52905g.entrySet()) {
                if (entry.getValue() != null) {
                    C19198a aVar = (C19198a) entry.getValue();
                    URI create = URI.create(str);
                    C19202b bVar = new C19202b(create.getHost(), create.getScheme());
                    int i = 0;
                    while (true) {
                        if (i >= aVar.f52908a.size()) {
                            break;
                        }
                        C19202b bVar2 = (C19202b) aVar.f52908a.get(i);
                        if (bVar2 == null || !bVar2.f52918d.equals(bVar.f52918d) || !bVar2.f52919e.equals(bVar.f52919e)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            aVar.f52909b.mo39187a((C19201a) aVar.f52908a.get(i));
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo39174a(String str) {
        if (!mo39181b()) {
            return str;
        }
        C19198a d = m46794d(str);
        if (d != null) {
            return d.mo39183a(str);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.p683ss.android.linkselector.C19198a m46794d(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00a7 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r5)
            return r1
        L_0x000a:
            java.net.URI r0 = java.net.URI.create(r6)     // Catch:{ Exception -> 0x0026 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r2.<init>()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = r0.getHost()     // Catch:{ Exception -> 0x0026 }
            r2.append(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0026 }
            r2.append(r0)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0026 }
            goto L_0x0050
        L_0x0026:
            java.lang.String r0 = "?"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "#"
            int r2 = r6.indexOf(r2)     // Catch:{ all -> 0x00a7 }
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x00a7 }
            r4 = -1
            if (r3 != r4) goto L_0x003d
            int r3 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x003d:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            int r0 = r0 + 3
            if (r3 == r4) goto L_0x004c
            java.lang.String r0 = r6.substring(r0, r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x0050
        L_0x004c:
            java.lang.String r0 = r6.substring(r0)     // Catch:{ all -> 0x00a7 }
        L_0x0050:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0058
            monitor-exit(r5)
            return r1
        L_0x0058:
            java.util.Map<java.util.regex.Pattern, java.lang.String> r2 = r5.f52906h     // Catch:{ all -> 0x00a7 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a7 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a7 }
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4     // Catch:{ all -> 0x00a7 }
            java.util.regex.Matcher r4 = r4.matcher(r0)     // Catch:{ all -> 0x00a7 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "path group key = "
            r1.<init>(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = " for "
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r6)     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, com.ss.android.linkselector.a> r1 = r5.f52905g     // Catch:{ all -> 0x00a7 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00a7 }
            com.ss.android.linkselector.a r1 = (com.p683ss.android.linkselector.C19198a) r1     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x00a5
            goto L_0x0062
        L_0x00a5:
            monitor-exit(r5)
            return r1
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.linkselector.LinkSelector.m46794d(java.lang.String):com.ss.android.linkselector.a");
    }

    /* renamed from: a */
    public final void mo39175a(C19198a aVar) {
        if (mo39181b()) {
            for (Entry entry : this.f52905g.entrySet()) {
                if (entry.getValue() != null) {
                    new StringBuilder("need opt = ").append((String) entry.getKey());
                    ((C19198a) entry.getValue()).mo39184a();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39178a(Map<String, List<C19202b>> map) {
        if (map != null) {
            this.f52905g.clear();
            for (Entry entry : map.entrySet()) {
                this.f52905g.put(entry.getKey(), new C19198a((List) entry.getValue()));
            }
        }
    }

    /* renamed from: a */
    public final void mo39177a(String str, Exception exc) {
        if (mo39181b() && m46793c()) {
            new StringBuilder("on link api error:").append(str);
            m46792c(str);
        }
    }
}
