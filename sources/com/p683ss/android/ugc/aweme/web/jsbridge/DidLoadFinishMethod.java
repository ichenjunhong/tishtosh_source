package com.p683ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod */
public final class DidLoadFinishMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C48290a f121509a = new C48290a(null);

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$a */
    public static final class C48290a {
        private C48290a() {
        }

        public /* synthetic */ C48290a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$b */
    public static final class C48291b {

        /* renamed from: b */
        public static final C48292a f121510b = new C48292a(null);

        /* renamed from: a */
        public final int f121511a;

        /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod$b$a */
        public static final class C48292a {
            private C48292a() {
            }

            public /* synthetic */ C48292a(C52707g gVar) {
                this();
            }
        }

        public C48291b() {
            this(0, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48291b) {
                    if (this.f121511a == ((C48291b) obj).f121511a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f121511a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Event(status=");
            sb.append(this.f121511a);
            sb.append(")");
            return sb.toString();
        }

        public C48291b(int i) {
            this.f121511a = i;
        }

        private /* synthetic */ C48291b(int i, int i2, C52707g gVar) {
            this(0);
        }
    }

    public DidLoadFinishMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            C47718bf.m103288a(new C48291b(jSONObject.optInt("status", 0)));
            aVar.mo60039a((Object) null);
        }
    }
}
