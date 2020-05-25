package com.p683ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.p */
public final class C44400p {

    /* renamed from: a */
    public static final C44400p f112338a = new C44400p();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.p$a */
    public static final class C44401a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ boolean f112339a;

        public C44401a(boolean z) {
            this.f112339a = z;
        }

        public final /* synthetic */ Object call() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                String str2 = "zipUrlIsNull";
                if (this.f112339a) {
                    str = "0";
                } else {
                    str = "1";
                }
                jSONObject.put(str2, str);
                C9951d.m19996a("hash_tag_zip_url", 0, C23088c.m56632a(jSONObject).mo47825b());
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    private C44400p() {
    }
}
