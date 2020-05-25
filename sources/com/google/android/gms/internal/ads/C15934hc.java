package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.internal.C14338p;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hc */
final /* synthetic */ class C15934hc implements C15948hq {

    /* renamed from: a */
    static final C15948hq f45027a = new C15934hc();

    private C15934hc() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map map) {
        amy amy = (amy) obj;
        PackageManager packageManager = amy.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString(C14338p.f37308a);
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String str = "Error parsing the url: ";
                                String valueOf = String.valueOf(optString7);
                                abv.m32793b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            abv.m32793b("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        abv.m32793b("Error parsing the intent data.", e3);
                    }
                }
                ((C16037ky) amy).mo29243a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((C16037ky) amy).mo29243a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((C16037ky) amy).mo29243a("openableIntents", new JSONObject());
        }
    }
}
