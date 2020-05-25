package net.openid.appauth;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C53459d.C53461b;
import net.openid.appauth.C53459d.C53462c;
import net.openid.appauth.C53492s.C53493a;
import net.openid.appauth.p2680a.C53444b;
import net.openid.appauth.p2680a.C53446d;
import net.openid.appauth.p2680a.C53447e;
import net.openid.appauth.p2681b.C53452a;
import net.openid.appauth.p2682c.C53455a;
import net.openid.appauth.p2682c.C53458b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.g */
public final class C53469g {

    /* renamed from: a */
    public Context f132264a;

    /* renamed from: b */
    public final C53447e f132265b;

    /* renamed from: c */
    public final C53444b f132266c;

    /* renamed from: d */
    private final C53449b f132267d;

    /* renamed from: e */
    private boolean f132268e;

    /* renamed from: net.openid.appauth.g$a */
    static class C53470a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private C53489r f132269a;

        /* renamed from: b */
        private C53476k f132270b;

        /* renamed from: c */
        private final C53452a f132271c;

        /* renamed from: d */
        private C53471b f132272d;

        /* renamed from: e */
        private C53459d f132273e;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            InputStream inputStream;
            InputStream inputStream2;
            InputStream inputStream3;
            InputStream inputStream4 = null;
            try {
                HttpURLConnection a = this.f132271c.mo111205a(this.f132269a.f132324b.f132275b);
                a.setRequestMethod("POST");
                C53472h.m113555a(a, "Content-Type", "application/x-www-form-urlencoded");
                if (TextUtils.isEmpty(a.getRequestProperty("Accept"))) {
                    a.setRequestProperty("Accept", "application/json");
                }
                a.setDoOutput(true);
                C53489r rVar = this.f132269a;
                HashMap hashMap = new HashMap();
                hashMap.put("grant_type", rVar.f132326d);
                C53489r.m113590a(hashMap, "redirect_uri", rVar.f132327e);
                C53489r.m113590a(hashMap, "code", rVar.f132328f);
                C53489r.m113590a(hashMap, "refresh_token", rVar.f132330h);
                C53489r.m113590a(hashMap, "code_verifier", rVar.f132331i);
                C53489r.m113590a(hashMap, "scope", rVar.f132329g);
                for (Entry entry : rVar.f132332j.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
                Map a2 = this.f132270b.mo111236a(this.f132269a.f132325c);
                if (a2 != null) {
                    hashMap.putAll(a2);
                }
                String a3 = C53458b.m113523a((Map<String, String>) hashMap);
                C53472h.m113555a(a, "Content-Length", String.valueOf(a3.length()));
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a.getOutputStream());
                outputStreamWriter.write(a3);
                outputStreamWriter.flush();
                if (a.getResponseCode() < 200 || a.getResponseCode() >= 300) {
                    inputStream3 = a.getErrorStream();
                } else {
                    URLConnection uRLConnection = a;
                    if (C18982g.m46160a(uRLConnection)) {
                        C18976b.m46151a(uRLConnection.getURL(), null, null, uRLConnection.getContentType());
                    }
                    inputStream3 = a.getInputStream();
                }
                try {
                    JSONObject jSONObject = new JSONObject(C53494t.m113594a(inputStream3));
                    C53494t.m113595b(inputStream3);
                    return jSONObject;
                } catch (IOException e) {
                    Throwable th = e;
                    inputStream2 = inputStream3;
                    e = th;
                    C53455a.m113513a(e, "Failed to complete exchange request", new Object[0]);
                    this.f132273e = C53459d.fromTemplate(C53461b.f132202d, e);
                    C53494t.m113595b(inputStream);
                    return null;
                } catch (JSONException e2) {
                    Throwable th2 = e2;
                    inputStream = inputStream3;
                    e = th2;
                    C53455a.m113513a(e, "Failed to complete exchange request", new Object[0]);
                    this.f132273e = C53459d.fromTemplate(C53461b.f132204f, e);
                    C53494t.m113595b(inputStream);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream4 = inputStream3;
                    C53494t.m113595b(inputStream4);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream2 = null;
                C53455a.m113513a(e, "Failed to complete exchange request", new Object[0]);
                this.f132273e = C53459d.fromTemplate(C53461b.f132202d, e);
                C53494t.m113595b(inputStream);
                return null;
            } catch (JSONException e4) {
                e = e4;
                inputStream = null;
                C53455a.m113513a(e, "Failed to complete exchange request", new Object[0]);
                this.f132273e = C53459d.fromTemplate(C53461b.f132204f, e);
                C53494t.m113595b(inputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                inputStream4 = inputStream;
                C53494t.m113595b(inputStream4);
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C53459d dVar;
            Uri uri;
            JSONObject jSONObject = (JSONObject) obj;
            if (this.f132273e != null) {
                this.f132272d.mo74654a(null, this.f132273e);
            } else if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    C53459d dVar2 = (C53459d) C53462c.f132215i.get(string);
                    if (dVar2 == null) {
                        dVar2 = C53462c.f132214h;
                    }
                    String optString = jSONObject.optString("error_description", null);
                    String optString2 = jSONObject.optString("error_uri");
                    if (optString2 == null) {
                        uri = null;
                    } else {
                        uri = Uri.parse(optString2);
                    }
                    dVar = C53459d.fromOAuthTemplate(dVar2, string, optString, uri);
                } catch (JSONException e) {
                    dVar = C53459d.fromTemplate(C53461b.f132204f, e);
                }
                this.f132272d.mo74654a(null, dVar);
            } else {
                try {
                    C53493a aVar = new C53493a(this.f132269a);
                    aVar.f132352b = C53487p.m113588b(C53479n.m113568a(jSONObject, "token_type"), "token type must not be empty if defined");
                    aVar.f132353c = C53487p.m113588b(C53479n.m113573b(jSONObject, "access_token"), "access token cannot be empty if specified");
                    aVar.f132354d = C53479n.m113577e(jSONObject, "expires_at");
                    if (jSONObject.has("expires_in")) {
                        Long valueOf = Long.valueOf(jSONObject.getLong("expires_in"));
                        C53488q qVar = C53488q.f132322a;
                        if (valueOf == null) {
                            aVar.f132354d = null;
                        } else {
                            aVar.f132354d = Long.valueOf(qVar.mo111237a() + TimeUnit.SECONDS.toMillis(valueOf.longValue()));
                        }
                    }
                    aVar.f132356f = C53487p.m113588b(C53479n.m113573b(jSONObject, "refresh_token"), "refresh token must not be empty if defined");
                    aVar.f132355e = C53487p.m113588b(C53479n.m113573b(jSONObject, "id_token"), "id token must not be empty if defined");
                    String b = C53479n.m113573b(jSONObject, "scope");
                    if (TextUtils.isEmpty(b)) {
                        aVar.f132357g = null;
                    } else {
                        String[] split = b.split(" +");
                        if (split == null) {
                            split = new String[0];
                        }
                        aVar.f132357g = C53454c.m113509a(Arrays.asList(split));
                    }
                    Set<String> set = C53492s.f132342a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (!set.contains(str)) {
                            linkedHashMap.put(str, jSONObject.get(str).toString());
                        }
                    }
                    aVar.f132358h = C53442a.m113497a((Map<String, String>) linkedHashMap, C53492s.f132342a);
                    C53492s sVar = new C53492s(aVar.f132351a, aVar.f132352b, aVar.f132353c, aVar.f132354d, aVar.f132355e, aVar.f132356f, aVar.f132357g, aVar.f132358h);
                    C53455a.m113512a("Token exchange with %s completed", this.f132269a.f132324b.f132275b);
                    this.f132272d.mo74654a(sVar, null);
                } catch (JSONException e2) {
                    this.f132272d.mo74654a(null, C53459d.fromTemplate(C53461b.f132204f, e2));
                }
            }
        }

        C53470a(C53489r rVar, C53476k kVar, C53452a aVar, C53471b bVar) {
            this.f132269a = rVar;
            this.f132270b = kVar;
            this.f132271c = aVar;
            this.f132272d = bVar;
        }
    }

    /* renamed from: net.openid.appauth.g$b */
    public interface C53471b {
        /* renamed from: a */
        void mo74654a(C53492s sVar, C53459d dVar);
    }

    /* renamed from: a */
    public void mo111230a() {
        if (this.f132268e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    public C53469g(Context context) {
        this(context, C53449b.f132176a);
    }

    private C53469g(Context context, C53449b bVar) {
        this(context, bVar, C53446d.m113501a(context, bVar.f132177b), new C53447e(context));
    }

    /* renamed from: a */
    public final void mo111231a(C53489r rVar, C53476k kVar, C53471b bVar) {
        mo111230a();
        C53455a.m113512a("Initiating code exchange request to %s", rVar.f132324b.f132275b);
        new C53470a(rVar, kVar, this.f132267d.f132178c, bVar).execute(new Void[0]);
    }

    private C53469g(Context context, C53449b bVar, C53444b bVar2, C53447e eVar) {
        this.f132264a = (Context) C53487p.m113584a(context);
        this.f132267d = bVar;
        this.f132265b = eVar;
        this.f132266c = bVar2;
        if (bVar2 != null && bVar2.f132169d.booleanValue()) {
            this.f132265b.mo111203a(bVar2.f132166a);
        }
    }
}
