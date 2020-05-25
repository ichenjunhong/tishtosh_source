package com.p683ss.android.ugc.aweme.sensitiveserver;

import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sensitiveserver.a */
public final class C41485a {

    /* renamed from: com.ss.android.ugc.aweme.sensitiveserver.a$a */
    public interface C41486a {
        /* renamed from: a */
        void mo60098a();

        /* renamed from: a */
        void mo60099a(String str, String str2);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m91308a(C41486a aVar, C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            aVar.mo60098a();
        } else {
            try {
                JSONObject jSONObject = new JSONObject((String) iVar.mo34e());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (jSONObject.optInt("code") == 0) {
                    aVar.mo60099a(optJSONObject.optString("file_id"), optJSONObject.optString("ticket_url"));
                } else {
                    aVar.mo60098a();
                }
            } catch (JSONException unused) {
                aVar.mo60098a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m91309a(File file, String str, String str2, String str3, C41486a aVar) {
        if (!file.exists() || file.length() == 0) {
            aVar.mo60098a();
            return;
        }
        SensitiveFileUploadApi.m91307a(new TypedFile("image/*", file), Integer.valueOf(str), new TypedString(str2), Integer.valueOf(str3)).mo19a((C0011g<TResult, TContinuationResult>) new C41487b<TResult,TContinuationResult>(aVar));
    }
}
