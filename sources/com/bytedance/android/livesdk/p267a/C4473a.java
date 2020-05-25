package com.bytedance.android.livesdk.p267a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p267a.C4489d.C4490a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.a.a */
public final class C4473a {

    /* renamed from: a */
    public List<C4492f> f12234a = new ArrayList();

    /* renamed from: b */
    private Map<String, C4492f> f12235b = new ConcurrentHashMap();

    /* renamed from: c */
    private boolean f12236c = false;

    /* renamed from: com.bytedance.android.livesdk.a.a$a */
    class C4475a implements C4490a<Object> {

        /* renamed from: b */
        private String f12240b;

        /* renamed from: a */
        public final void mo10284a(Object obj) {
            if (TextUtils.isEmpty(this.f12240b)) {
                try {
                    C4473a.this.mo10283a(this.f12240b, null);
                } catch (Exception unused) {
                }
            }
        }

        public C4475a(String str) {
            this.f12240b = str;
        }
    }

    /* renamed from: a */
    public final void mo10282a(C4489d dVar) {
        if (dVar != null) {
            C4492f fVar = new C4492f(dVar);
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.f12262c);
            sb.append(" register ");
            sb.append(dVar.toString());
            this.f12235b.put(fVar.f12262c, new C4492f(dVar));
        }
    }

    /* renamed from: a */
    public final void mo10283a(String str, C4490a aVar) throws Exception {
        if (str == null) {
            if (this.f12236c) {
                throw new Exception("action can not be null");
            }
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                final C4492f fVar = (C4492f) this.f12235b.get(parse.getHost());
                if (fVar != null) {
                    String queryParameter = parse.getQueryParameter("action_callback");
                    if (aVar == null && !TextUtils.isEmpty(str)) {
                        aVar = new C4475a(queryParameter);
                    }
                    this.f12234a.add(fVar);
                    C4489d dVar = fVar.f12260a;
                    if (aVar == null) {
                        dVar.mo10292a(str, null);
                        this.f12234a.remove(fVar);
                        return;
                    }
                    dVar.mo10292a(str, new C4491e(aVar) {
                    });
                } else if (this.f12236c) {
                    throw new Exception("can't find action");
                }
            }
        } else if (this.f12236c) {
            throw new Exception("action name can not be null");
        }
    }
}
