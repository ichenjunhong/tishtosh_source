package com.linecorp.linesdk.auth.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.auth.internal.a */
final class C18221a {

    /* renamed from: a */
    static final C18225b f50302a = new C18225b(6, 9, 0);

    /* renamed from: b */
    final C18230d f50303b;

    /* renamed from: com.linecorp.linesdk.auth.internal.a$a */
    static class C18222a {

        /* renamed from: a */
        final Intent f50304a;

        /* renamed from: b */
        final Bundle f50305b;

        /* renamed from: c */
        final boolean f50306c;

        C18222a(Intent intent, Bundle bundle, boolean z) {
            this.f50304a = intent;
            this.f50305b = bundle;
            this.f50306c = z;
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$b */
    static class C18223b {

        /* renamed from: a */
        final Intent f50307a;

        /* renamed from: b */
        final Bundle f50308b;

        /* renamed from: c */
        final String f50309c;

        /* renamed from: d */
        final boolean f50310d;

        C18223b(Intent intent, Bundle bundle, String str, boolean z) {
            this.f50307a = intent;
            this.f50308b = bundle;
            this.f50309c = str;
            this.f50310d = z;
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.a$c */
    static class C18224c {

        /* renamed from: a */
        final String f50311a;

        /* renamed from: b */
        private final String f50312b;

        /* renamed from: c */
        private final String f50313c;

        /* renamed from: d */
        private final String f50314d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo36322a() {
            if (!TextUtils.isEmpty(this.f50311a)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo36323b() {
            if (!TextUtils.isEmpty(this.f50314d) || mo36322a()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final LineApiError mo36324c() {
            if (!mo36323b()) {
                return new LineApiError(this.f50314d);
            }
            try {
                return new LineApiError(new JSONObject().putOpt("error", this.f50312b).putOpt("error_description", this.f50313c).toString());
            } catch (JSONException e) {
                return new LineApiError((Exception) e);
            }
        }

        /* renamed from: a */
        static C18224c m44418a(String str) {
            return new C18224c(null, null, null, str);
        }

        C18224c(String str, String str2, String str3, String str4) {
            this.f50311a = str;
            this.f50312b = str2;
            this.f50313c = str3;
            this.f50314d = str4;
        }
    }

    C18221a(C18230d dVar) {
        this.f50303b = dVar;
    }

    /* renamed from: a */
    static List<Intent> m44417a(Uri uri, Collection<ResolveInfo> collection, Bundle bundle) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ResolveInfo resolveInfo : collection) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            arrayList.add(intent);
        }
        return arrayList;
    }
}
