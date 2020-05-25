package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.common.util.C18914a;
import com.p683ss.android.common.util.NetworkUtils.C18909f;
import com.p683ss.android.common.util.NetworkUtils.C18910g;
import com.p683ss.android.http.p1169a.p1170a.C19171a;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.p */
public class C23131p extends C23569o {

    /* renamed from: a */
    public static final C18910g f61550a = new C18910g() {

        /* renamed from: a */
        public boolean f61553a;

        /* renamed from: a */
        public final void mo38766a(long j, long j2, String str, String str2, C18909f fVar) {
            try {
                ExecutorService executorService = C23131p.f62692b;
                final C18909f fVar2 = fVar;
                final String str3 = str;
                final long j3 = j;
                final long j4 = j2;
                final String str4 = str2;
                C231351 r1 = new Runnable() {
                    public final void run() {
                        String[] strArr = new String[1];
                        if (C9431p.m18664a(strArr[0]) && fVar2 != null) {
                            strArr[0] = fVar2.f52120a;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                        }
                        if (!C231343.this.f61553a && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            C231343.this.f61553a = true;
                        }
                        C23131p.m57773a(j3, j4, str3, strArr[0], str4, 200, C23088c.m56631a().mo47824a("retry_type", str).mo47824a("First_Request", String.valueOf(C231343.this.f61553a)).mo47825b());
                    }
                };
                executorService.submit(r1);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final void mo38767a(long j, long j2, String str, String str2, C18909f fVar, Throwable th) {
            try {
                ExecutorService executorService = C23131p.f62692b;
                final String str3 = str;
                final Throwable th2 = th;
                final C18909f fVar2 = fVar;
                final String str4 = str2;
                final long j3 = j;
                final long j4 = j2;
                C231362 r1 = new Runnable() {
                    public final void run() {
                        String str;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                            if (TextUtils.equals("no_retry", str)) {
                                return;
                            }
                        } else {
                            str = null;
                        }
                        String[] strArr = new String[1];
                        int a = C23131p.m56690a(th2, strArr);
                        if (C9431p.m18664a(strArr[0]) && fVar2 != null) {
                            strArr[0] = fVar2.f52120a;
                        }
                        if (!C231343.this.f61553a && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            C231343.this.f61553a = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((int) C14460b.m29586a().mo26626c());
                        int i = a;
                        JSONObject b = C23088c.m56631a().mo47824a("First_Request", String.valueOf(C231343.this.f61553a)).mo47824a("traceCode", sb.toString()).mo47824a("errorDesc", C23131p.m56691a(th2)).mo47824a("netWorkQuality", C14460b.m29586a().mo26625b().toString()).mo47824a("netWorkSpeeds", sb2.toString()).mo47824a("responseCode", String.valueOf(str4)).mo47824a("retryType", str).mo47825b();
                        C23131p.m57781b(j3, j4, str3, strArr[0], str4, i, b);
                        C23131p.m57773a(j3, j4, str3, strArr[0], str4, i, b);
                    }
                };
                executorService.submit(r1);
            } catch (Exception unused) {
            }
        }
    };

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m56691a(java.lang.Throwable r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
        L_0x0023:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            r2.close()
            goto L_0x003c
        L_0x002b:
            r3 = move-exception
            goto L_0x002f
        L_0x002d:
            r3 = move-exception
            r2 = r0
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()
        L_0x0034:
            throw r3
        L_0x0035:
            r2 = r0
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            r3 = r0
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C23131p.m56691a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: a */
    public static int m56690a(Throwable th, String[] strArr) {
        int i = 1;
        if (th == null) {
            return 1;
        }
        if (th instanceof C19174b) {
            i = ((C19174b) th).getStatusCode();
        } else if (th instanceof C18914a) {
            i = 20;
        } else {
            if (!(th instanceof ConnectTimeoutException)) {
                if (th instanceof SocketTimeoutException) {
                    if (C9431p.m18664a(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i = 3;
                    }
                } else if (th instanceof BindException) {
                    i = 7;
                } else if (th instanceof ConnectException) {
                    i = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i = 9;
                } else if (th instanceof PortUnreachableException) {
                    i = 10;
                } else if (th instanceof SocketException) {
                    i = 5;
                    String message = th.getMessage();
                    if (message != null && message.indexOf("reset by peer") >= 0) {
                        i = 6;
                    }
                } else if (th instanceof UnknownHostException) {
                    i = 11;
                } else if (th instanceof C19171a) {
                    i = 19;
                } else if (th instanceof IOException) {
                    i = 4;
                }
            }
            i = 2;
        }
        if (i == 2) {
            try {
                Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(th.getMessage());
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        strArr[0] = matcher.group(3);
                    } else if (matcher.group(4) != null) {
                        strArr[0] = matcher.group(4);
                    }
                }
            } catch (Exception unused) {
            }
        } else if (i == 8) {
            Throwable cause = th.getCause();
            if (cause != null && (cause instanceof ConnectException)) {
                Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(cause.getMessage());
                if (matcher2.matches()) {
                    if (matcher2.group(3) != null) {
                        strArr[0] = matcher2.group(3);
                    } else if (matcher2.group(4) != null) {
                        strArr[0] = matcher2.group(4);
                    }
                    String group = matcher2.group(7);
                    if (group != null) {
                        if ("ECONNRESET".equals(group)) {
                            i = 12;
                        } else if ("ECONNREFUSED".equals(group)) {
                            i = 13;
                        } else if ("EHOSTUNREACH".equals(group)) {
                            i = 14;
                        } else if ("ENETUNREACH".equals(group)) {
                            i = 15;
                        } else if ("EADDRNOTAVAIL".equals(group)) {
                            i = 16;
                        } else if ("EADDRINUSE".equals(group)) {
                            i = 17;
                        }
                    }
                }
            }
        } else if (i == 4) {
            String message2 = th.getMessage();
            if (message2.indexOf(" EIO (I/O error)") > 0) {
                i = 37;
            } else {
                if (!(th instanceof FileNotFoundException) && message2.indexOf(" ENOENT ") <= 0) {
                    if (message2.indexOf("No such file or directory") <= 0) {
                        if (message2.indexOf(" ENOSPC ") <= 0) {
                            if (message2.indexOf("No space left on device") <= 0) {
                                if (message2.indexOf(" EDQUOT ") > 0) {
                                    i = 34;
                                } else if (message2.indexOf(" EROFS ") > 0) {
                                    i = 35;
                                } else if (message2.indexOf(" EACCES ") > 0) {
                                    i = 36;
                                }
                            }
                        }
                        i = 32;
                    }
                }
                i = 33;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m56692a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C9951d.m19997a(str, jSONObject);
    }
}
