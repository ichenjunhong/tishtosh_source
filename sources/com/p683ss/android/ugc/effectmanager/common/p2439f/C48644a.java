package com.p683ss.android.ugc.effectmanager.common.p2439f;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import java.io.InputStream;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.f.a */
public final class C48644a {

    /* renamed from: a */
    public C48640a f122274a;

    /* renamed from: b */
    private Context f122275b;

    /* renamed from: a */
    public final InputStream mo96221a(C48605b bVar) throws Exception {
        InputStream a = this.f122274a.mo59200a(bVar);
        if (a != null) {
            return a;
        }
        if (!C48676l.m105347a(this.f122275b)) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(bVar.f122203g)) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(bVar.f122203g);
        }
    }

    public C48644a(C48640a aVar, Context context) {
        this.f122274a = aVar;
        this.f122275b = context;
    }

    /* renamed from: a */
    public final <T extends BaseNetResponse> T mo96220a(C48605b bVar, C48641b bVar2, Class<T> cls) throws Exception {
        InputStream a = this.f122274a.mo59200a(bVar);
        if (a != null) {
            T t = (BaseNetResponse) bVar2.mo59189a(a, cls);
            C48660a.m105288a(a);
            if (t != null) {
                int i = t.status_code;
                if (i == 0) {
                    return t;
                }
                throw new C48636c(i, t.message);
            }
            throw new JSONException("Json convert fail");
        } else if (!C48676l.m105347a(this.f122275b)) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(bVar.f122203g)) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(bVar.f122203g);
        }
    }

    /* renamed from: a */
    public static <T extends BaseNetResponse> T m105250a(C48605b bVar, InputStream inputStream, C48641b bVar2, Class<T> cls) throws Exception {
        T t = (BaseNetResponse) bVar2.mo59189a(inputStream, cls);
        if (t != null) {
            int i = t.status_code;
            if (i == 0) {
                return t;
            }
            throw new C48636c(i, t.message);
        }
        throw new JSONException("Json convert fail");
    }
}
