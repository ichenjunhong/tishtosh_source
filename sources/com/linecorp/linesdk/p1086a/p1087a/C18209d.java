package com.linecorp.linesdk.p1086a.p1087a;

import android.content.Context;
import android.net.Uri;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18197a;
import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18200d;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.d */
public final class C18209d {

    /* renamed from: a */
    public static final C18200d<LineProfile> f50262a = new C18210a();

    /* renamed from: b */
    public final Uri f50263b;

    /* renamed from: c */
    public final C18197a f50264c;

    /* renamed from: com.linecorp.linesdk.a.a.d$a */
    static class C18210a extends C18196a<LineProfile> {
        C18210a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo36280a(JSONObject jSONObject) {
            Uri uri;
            String optString = jSONObject.optString("pictureUrl", null);
            String string = jSONObject.getString("userId");
            String string2 = jSONObject.getString("displayName");
            if (optString == null) {
                uri = null;
            } else {
                uri = Uri.parse(optString);
            }
            return new LineProfile(string, string2, uri, jSONObject.optString("statusMessage", null));
        }
    }

    private C18209d(Uri uri, C18197a aVar) {
        this.f50263b = uri;
        this.f50264c = aVar;
    }

    public C18209d(Context context, Uri uri) {
        this(uri, new C18197a(context, "4.0.8"));
    }
}
