package com.p683ss.android.ugc.aweme.miniapp.anchor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.p038f.C0777a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1953d.p1954a.C36830a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b */
public final class C36811b {

    /* renamed from: a */
    public static final C36811b f94082a = new C36811b();

    private C36811b() {
    }

    /* renamed from: a */
    public static boolean m82845a(Integer num) {
        return (num != null && num.intValue() == 0) || (num != null && num.intValue() == 3) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 999)));
    }

    /* renamed from: a */
    public static String m82838a() {
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fgame_detail%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_game_detail%26bundle%3Dindex.js%26module_name%3Dpage_game_detail%26hide_nav_bar%3D1%26loading_bgcolor%3D%2523161823";
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = b.getFeConfigCollection();
            C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig gameDetail = feConfigCollection.getGameDetail();
            C52711k.m112236a((Object) gameDetail, "SettingsReader.get().feConfigCollection.gameDetail");
            String schema = gameDetail.getSchema();
            if (schema == null) {
                return str;
            }
            return schema;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m82843a(String str) {
        if (str != null) {
            C41302w.m91042a().mo83861a(str);
        }
    }

    /* renamed from: c */
    private static String m82847c(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            for (String str2 : queryParameterNames) {
                if (str2 != null && str2.hashCode() == 1066014959 && str2.equals("anchor_content")) {
                    C36830a aVar = (C36830a) new C17971f().mo34884a(parse.getQueryParameter(str2), C36830a.class);
                    if (aVar != null) {
                        return aVar.getId();
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo75997b(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            for (String str2 : queryParameterNames) {
                if (str2 != null && str2.hashCode() == 344713476 && str2.equals("rn_schema")) {
                    return m82847c(parse.getQueryParameter(str2));
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82844a(com.p683ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = r1.getBusinessType()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            com.ss.android.ugc.aweme.commercialize.anchor.a r2 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.GAME
            int r2 = r2.getTYPE()
            if (r1 != 0) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r1.getKeyword()
            goto L_0x0030
        L_0x002f:
            r1 = r0
        L_0x0030:
            java.lang.String r2 = ""
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = r3.getUrl()
        L_0x004a:
            java.lang.String r3 = ""
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0054
            return r2
        L_0x0054:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82844a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static final void m82841a(Context context, C25600a aVar) {
        m82842a(context, aVar, (String) null, (String) null);
    }

    /* renamed from: b */
    private static String m82846b(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r1 == null) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m82837a(android.content.Intent r4, com.bytedance.router.RouteIntent r5) {
        /*
            java.lang.String r0 = "intent"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = r5.getOriginUrl()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r0 = "routeUri"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            java.util.Set r0 = r5.getQueryParameterNames()
            java.lang.String r1 = "shoot_way"
            java.lang.String r2 = "detail_page"
            r4.putExtra(r1, r2)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r1 = 0
            goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            if (r1 != 0) goto L_0x0078
            java.util.Iterator r0 = r0.iterator()
        L_0x0034:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0043
            goto L_0x0034
        L_0x0043:
            int r2 = r1.hashCode()
            r3 = 1046359873(0x3e5e2f41, float:0.21697713)
            if (r2 == r3) goto L_0x004d
            goto L_0x0034
        L_0x004d:
            java.lang.String r2 = "commerce_data_in_tools_line"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "commerce_data_in_tools_line"
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            if (r1 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.commercialize.model.ad r1 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63393a(r1)
            if (r1 == 0) goto L_0x006b
            r3 = 3
            r1.f68930l = r3
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.model.C26109ad.m63394a(r1)
            if (r1 != 0) goto L_0x0074
        L_0x0072:
            java.lang.String r1 = ""
        L_0x0074:
            r4.putExtra(r2, r1)
            goto L_0x0034
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b.m82837a(android.content.Intent, com.bytedance.router.RouteIntent):android.content.Intent");
    }

    /* renamed from: a */
    public static String m82840a(String str, Map<String, String> map) {
        boolean z;
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C0777a aVar = new C0777a();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str2 : queryParameterNames) {
                String queryParameter = parse.getQueryParameter(str2);
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 116079) {
                        if (hashCode == 344713476 && str2.equals("rn_schema")) {
                            String b = m82846b(queryParameter, map);
                            if (b != null) {
                                aVar.put("rn_schema", b);
                            }
                        }
                    } else if (str2.equals("url")) {
                        String b2 = m82846b(queryParameter, map);
                        if (b2 != null) {
                            aVar.put("url", b2);
                        }
                    }
                }
                aVar.put(str2, queryParameter);
            }
        }
        return m82846b("aweme://webview/?", aVar);
    }

    /* renamed from: a */
    public static String m82839a(Integer num, String str, String str2, Integer num2) {
        int i;
        int i2;
        JSONObject jSONObject = new JSONObject();
        String str3 = "type";
        if (num != null) {
            try {
                i = num.intValue();
            } catch (Exception unused) {
            }
        } else {
            i = C25600a.NO_TYPE.getTYPE();
        }
        jSONObject.put(str3, i);
        String str4 = "id";
        if (str == null) {
            str = "";
        }
        jSONObject.put(str4, str);
        String str5 = C42311c.f106865i;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str5, str2);
        String str6 = "source";
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        jSONObject.put(str6, i2);
        if (num2 != null) {
            if (num2.intValue() == 999) {
                jSONObject.put("source", 5);
                String jSONObject2 = jSONObject.toString();
                C52711k.m112236a((Object) jSONObject2, "anchor.toString()");
                return jSONObject2;
            }
        }
        if (num2 == null) {
            jSONObject.put("source", 0);
        } else {
            jSONObject.put("source", num2.intValue());
        }
        String jSONObject22 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject22, "anchor.toString()");
        return jSONObject22;
    }

    /* renamed from: a */
    public static final void m82842a(Context context, C25600a aVar, String str, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, AnchorBaseActivity.class);
            String str3 = "anchor_type";
            if (aVar == null) {
                aVar = C25600a.NO_TYPE;
            }
            intent.putExtra(str3, aVar);
            String str4 = "shoot_way";
            if (str == null) {
                str = "";
            }
            intent.putExtra(str4, str);
            String str5 = "creation_id";
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra(str5, str2);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.f2, R.anim.f3);
            }
        }
    }
}
