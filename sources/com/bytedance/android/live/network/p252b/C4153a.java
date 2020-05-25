package com.bytedance.android.live.network.p252b;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.p226e.p227a.C3840b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.p251a.C4150b;
import com.bytedance.android.live.network.response.RequestError;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.network.b.a */
public final class C4153a {
    /* renamed from: a */
    public static void m10315a(int i, C3840b bVar, String str) throws Exception {
        throw new C4150b(i, bVar.f10817c, str).setPrompt(bVar.f10816b);
    }

    /* renamed from: a */
    public static void m10316a(int i, RequestError requestError, Extra extra, String str) throws Exception {
        m10317a(i, requestError, C2942b.m8369a().mo34889b(extra), str);
    }

    /* renamed from: a */
    public static void m10317a(int i, RequestError requestError, String str, String str2) throws Exception {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = C3922z.m9903a((int) R.string.ewv);
        }
        throw new C4150b(i, requestError.url, str2).setErrorMsg(requestError.message).setPrompt(requestError.prompts).setAlert(requestError.alert).setExtra(str);
    }
}
