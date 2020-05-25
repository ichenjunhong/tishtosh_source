package com.p683ss.android.ugc.aweme.net.p1990c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9905k;
import com.bytedance.ttnet.p885c.C13297b;
import com.bytedance.ttnet.p885c.C13302e;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.c.a */
public abstract class C37750a implements C9905k<C13297b> {

    /* renamed from: a */
    protected Context f96194a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo77243a(long j, long j2, String str, String str2, String str3, C13297b bVar, Throwable th, JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo77244a(long j, long j2, String str, String str2, String str3, C13297b bVar, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo77245a(C13297b bVar, JSONObject jSONObject);

    public C37750a(Context context) {
        C13297b.m26782b();
        this.f96194a = context;
    }

    /* renamed from: a */
    private static void m84261a(Throwable th, JSONObject jSONObject) {
        if (th != null && jSONObject != null) {
            try {
                String message = th.getMessage();
                if (!C9431p.m18664a(message)) {
                    int length = message.length();
                    int indexOf = message.indexOf("ErrorCode=");
                    if (indexOf != -1) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = indexOf + 10; i < length; i++) {
                            char charAt = message.charAt(i);
                            if (!Character.isSpaceChar(charAt)) {
                                if (charAt != '-' && !Character.isDigit(charAt)) {
                                    break;
                                }
                                sb.append(charAt);
                            }
                        }
                        if (sb.length() > 0) {
                            jSONObject.put("cronet_error_code", sb.toString());
                        }
                    }
                    int indexOf2 = message.indexOf("InternalErrorCode=");
                    if (indexOf2 != -1) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = indexOf2 + 18; i2 < length; i2++) {
                            char charAt2 = message.charAt(i2);
                            if (!Character.isSpaceChar(charAt2)) {
                                if (charAt2 != '-' && !Character.isDigit(charAt2)) {
                                    break;
                                }
                                sb2.append(charAt2);
                            }
                        }
                        if (sb2.length() > 0) {
                            jSONObject.put("cronet_internal_error_code", sb2.toString());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17837a(long j, long j2, String str, String str2, C9831a aVar) {
        C13297b bVar = (C13297b) aVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (str.contains("&config_retry=b")) {
                jSONObject.put("log_config_retry", 1);
            }
            if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f26751a;
                if (bVar.f26752b != null) {
                    if (((C13302e) bVar.f26752b).f34693n > 0) {
                        jSONObject.put("index", ((C13302e) bVar.f26752b).f34693n);
                    }
                    if (((C13302e) bVar.f26752b).f34692m > 0) {
                        jSONObject.put("httpIndex", ((C13302e) bVar.f26752b).f34692m);
                    }
                }
            }
            try {
                mo77245a(bVar, jSONObject);
                mo77244a(j, j2, str, str2, strArr[0], bVar, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17838a(long j, long j2, String str, String str2, C9831a aVar, Throwable th) {
        C13297b bVar = (C13297b) aVar;
        try {
            String[] strArr = new String[1];
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f26751a;
                if (bVar.f26752b != null) {
                    if (((C13302e) bVar.f26752b).f34693n > 0) {
                        jSONObject.put("index", ((C13302e) bVar.f26752b).f34693n);
                    }
                    if (((C13302e) bVar.f26752b).f34692m > 0) {
                        jSONObject.put("httpIndex", ((C13302e) bVar.f26752b).f34692m);
                    }
                }
            }
            m84261a(th, jSONObject);
            try {
                mo77245a(bVar, jSONObject);
                mo77243a(j, j2, str, str2, strArr[0], bVar, th, jSONObject);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
    }
}
