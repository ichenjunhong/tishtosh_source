package com.google.android.gms.internal.ads;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class ane {

    /* renamed from: a */
    private static final Pattern f41058a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b */
    private static final Pattern f41059b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* renamed from: a */
    public static String m33646a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f41058a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            for (int i = 0; i <= 0; i++) {
                String str2 = strArr[0];
                if (str2 != null) {
                    sb.append(str2);
                }
            }
            sb.append(str.substring(end));
        } else {
            if (!f41059b.matcher(str).find()) {
                for (int i2 = 0; i2 <= 0; i2++) {
                    String str3 = strArr[0];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m33645a() {
        String str = (String) caf.m37099d().mo30717a(C15740bx.f44198L);
        String str2 = "12.4.51-000";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C42311c.f106863g, str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", str2);
            StringBuilder sb = new StringBuilder();
            sb.append("<script>");
            sb.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
            sb.append(jSONObject.toString());
            sb.append("}});");
            sb.append("</script>");
            return sb.toString();
        } catch (JSONException e) {
            abv.m32795c("Unable to build MRAID_ENV", e);
            return null;
        }
    }
}
