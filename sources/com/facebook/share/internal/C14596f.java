package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.share.internal.C14587b.C14591a;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.C14643a;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
public final class C14596f {
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, java.util.List]
      uses: [java.util.Collection, java.lang.String]
      mth insns count: 180
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m29875a(java.util.UUID r5, com.facebook.share.model.ShareContent r6, boolean r7) {
        /*
            java.lang.String r0 = "shareContent"
            com.facebook.internal.C14283ab.m29306a(r6, r0)
            java.lang.String r0 = "callId"
            com.facebook.internal.C14283ab.m29306a(r5, r0)
            boolean r0 = r6 instanceof com.facebook.share.model.ShareLinkContent
            r1 = 0
            if (r0 == 0) goto L_0x0041
            com.facebook.share.model.ShareLinkContent r6 = (com.facebook.share.model.ShareLinkContent) r6
            android.os.Bundle r1 = m29871a(r6, r7)
            java.lang.String r5 = "TITLE"
            java.lang.String r7 = r6.f37961b
            com.facebook.internal.C14277aa.m29265a(r1, r5, r7)
            java.lang.String r5 = "DESCRIPTION"
            java.lang.String r7 = r6.f37960a
            com.facebook.internal.C14277aa.m29265a(r1, r5, r7)
            java.lang.String r5 = "IMAGE"
            android.net.Uri r7 = r6.f37962c
            com.facebook.internal.C14277aa.m29264a(r1, r5, r7)
            java.lang.String r5 = "QUOTE"
            java.lang.String r7 = r6.f37963d
            com.facebook.internal.C14277aa.m29265a(r1, r5, r7)
            java.lang.String r5 = "MESSENGER_LINK"
            android.net.Uri r7 = r6.f37946h
            com.facebook.internal.C14277aa.m29264a(r1, r5, r7)
            java.lang.String r5 = "TARGET_DISPLAY"
            android.net.Uri r6 = r6.f37946h
            com.facebook.internal.C14277aa.m29264a(r1, r5, r6)
            goto L_0x01e0
        L_0x0041:
            boolean r0 = r6 instanceof com.facebook.share.model.SharePhotoContent
            if (r0 == 0) goto L_0x005b
            com.facebook.share.model.SharePhotoContent r6 = (com.facebook.share.model.SharePhotoContent) r6
            java.util.List r5 = com.facebook.share.internal.C14607l.m29927a(r6, r5)
            android.os.Bundle r1 = m29871a(r6, r7)
            java.lang.String r6 = "PHOTOS"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            r1.putStringArrayList(r6, r7)
            goto L_0x01e0
        L_0x005b:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareVideoContent
            if (r0 == 0) goto L_0x0098
            com.facebook.share.model.ShareVideoContent r6 = (com.facebook.share.model.ShareVideoContent) r6
            if (r6 == 0) goto L_0x007e
            com.facebook.share.model.ShareVideo r0 = r6.f38019d
            if (r0 != 0) goto L_0x0068
            goto L_0x007e
        L_0x0068:
            com.facebook.share.model.ShareVideo r0 = r6.f38019d
            android.net.Uri r0 = r0.f38014b
            com.facebook.internal.u$a r5 = com.facebook.internal.C14350u.m29420a(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r0.add(r5)
            com.facebook.internal.C14350u.m29425a(r0)
            java.lang.String r1 = r5.f37339b
        L_0x007e:
            android.os.Bundle r5 = m29871a(r6, r7)
            java.lang.String r7 = "TITLE"
            java.lang.String r0 = r6.f38017b
            com.facebook.internal.C14277aa.m29265a(r5, r7, r0)
            java.lang.String r7 = "DESCRIPTION"
            java.lang.String r6 = r6.f38016a
            com.facebook.internal.C14277aa.m29265a(r5, r7, r6)
            java.lang.String r6 = "VIDEO"
            com.facebook.internal.C14277aa.m29265a(r5, r6, r1)
            r1 = r5
            goto L_0x01e0
        L_0x0098:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareOpenGraphContent
            r2 = 0
            if (r0 == 0) goto L_0x00e9
            com.facebook.share.model.ShareOpenGraphContent r6 = (com.facebook.share.model.ShareOpenGraphContent) r6
            org.json.JSONObject r5 = com.facebook.share.internal.C14607l.m29930a(r5, r6)     // Catch:{ JSONException -> 0x00d0 }
            org.json.JSONObject r5 = com.facebook.share.internal.C14607l.m29931a(r5, r2)     // Catch:{ JSONException -> 0x00d0 }
            android.os.Bundle r1 = m29871a(r6, r7)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r7 = r6.f37997b     // Catch:{ JSONException -> 0x00d0 }
            android.util.Pair r7 = com.facebook.share.internal.C14607l.m29923a(r7)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.Object r7 = r7.second     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r0 = "PREVIEW_PROPERTY_NAME"
            com.facebook.internal.C14277aa.m29265a(r1, r0, r7)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r7 = "ACTION_TYPE"
            com.facebook.share.model.ShareOpenGraphAction r6 = r6.f37996a     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r6 = r6.mo26900a()     // Catch:{ JSONException -> 0x00d0 }
            com.facebook.internal.C14277aa.m29265a(r1, r7, r6)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r6 = "ACTION"
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x00d0 }
            com.facebook.internal.C14277aa.m29265a(r1, r6, r5)     // Catch:{ JSONException -> 0x00d0 }
            goto L_0x01e0
        L_0x00d0:
            r5 = move-exception
            com.facebook.k r6 = new com.facebook.k
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create a JSON Object from the provided ShareOpenGraphContent: "
            r7.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x00e9:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMediaContent
            if (r0 == 0) goto L_0x0119
            com.facebook.share.model.ShareMediaContent r6 = (com.facebook.share.model.ShareMediaContent) r6
            if (r6 == 0) goto L_0x0108
            java.util.List<com.facebook.share.model.ShareMedia> r0 = r6.f37972a
            if (r0 != 0) goto L_0x00f6
            goto L_0x0108
        L_0x00f6:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.facebook.share.internal.l$7 r2 = new com.facebook.share.internal.l$7
            r2.<init>(r5, r1)
            java.util.List r5 = com.facebook.internal.C14277aa.m29259a(r0, r2)
            com.facebook.internal.C14350u.m29425a(r1)
            goto L_0x0109
        L_0x0108:
            r5 = r1
        L_0x0109:
            android.os.Bundle r1 = m29871a(r6, r7)
            java.lang.String r6 = "MEDIA"
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            r1.putParcelableArrayList(r6, r7)
            goto L_0x01e0
        L_0x0119:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareCameraEffectContent
            if (r0 == 0) goto L_0x0129
            com.facebook.share.model.ShareCameraEffectContent r6 = (com.facebook.share.model.ShareCameraEffectContent) r6
            android.os.Bundle r5 = com.facebook.share.internal.C14607l.m29922a(r6, r5)
            android.os.Bundle r1 = m29870a(r6, r5, r7)
            goto L_0x01e0
        L_0x0129:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMessengerGenericTemplateContent
            if (r0 == 0) goto L_0x0135
            com.facebook.share.model.ShareMessengerGenericTemplateContent r6 = (com.facebook.share.model.ShareMessengerGenericTemplateContent) r6
            android.os.Bundle r1 = m29872a(r6, r7)
            goto L_0x01e0
        L_0x0135:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent
            if (r0 == 0) goto L_0x0141
            com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent r6 = (com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent) r6
            android.os.Bundle r1 = m29874a(r6, r7)
            goto L_0x01e0
        L_0x0141:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMessengerMediaTemplateContent
            if (r0 == 0) goto L_0x014d
            com.facebook.share.model.ShareMessengerMediaTemplateContent r6 = (com.facebook.share.model.ShareMessengerMediaTemplateContent) r6
            android.os.Bundle r1 = m29873a(r6, r7)
            goto L_0x01e0
        L_0x014d:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareStoryContent
            if (r0 == 0) goto L_0x01e0
            com.facebook.share.model.ShareStoryContent r6 = (com.facebook.share.model.ShareStoryContent) r6
            if (r6 == 0) goto L_0x017c
            com.facebook.share.model.ShareMedia r0 = r6.f38010a
            if (r0 != 0) goto L_0x015a
            goto L_0x017c
        L_0x015a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.facebook.share.model.ShareMedia r3 = r6.f38010a
            r0.add(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.facebook.share.internal.l$3 r4 = new com.facebook.share.internal.l$3
            r4.<init>(r5, r3)
            java.util.List r0 = com.facebook.internal.C14277aa.m29259a(r0, r4)
            com.facebook.internal.C14350u.m29425a(r3)
            java.lang.Object r0 = r0.get(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L_0x017d
        L_0x017c:
            r0 = r1
        L_0x017d:
            if (r6 == 0) goto L_0x01aa
            com.facebook.share.model.SharePhoto r3 = r6.f38011b
            if (r3 != 0) goto L_0x0184
            goto L_0x01aa
        L_0x0184:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.facebook.share.model.SharePhoto r4 = r6.f38011b
            r3.add(r4)
            com.facebook.share.internal.l$10 r4 = new com.facebook.share.internal.l$10
            r4.<init>(r5)
            java.util.List r5 = com.facebook.internal.C14277aa.m29259a(r3, r4)
            com.facebook.share.internal.l$2 r3 = new com.facebook.share.internal.l$2
            r3.<init>()
            java.util.List r3 = com.facebook.internal.C14277aa.m29259a(r5, r3)
            com.facebook.internal.C14350u.m29425a(r5)
            java.lang.Object r5 = r3.get(r2)
            android.os.Bundle r5 = (android.os.Bundle) r5
            goto L_0x01ab
        L_0x01aa:
            r5 = r1
        L_0x01ab:
            android.os.Bundle r7 = m29871a(r6, r7)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r2 = "bg_asset"
            r7.putParcelable(r2, r0)
        L_0x01b6:
            if (r5 == 0) goto L_0x01bd
            java.lang.String r0 = "interactive_asset_uri"
            r7.putParcelable(r0, r5)
        L_0x01bd:
            java.util.List<java.lang.String> r5 = r6.f38012c
            if (r5 != 0) goto L_0x01c2
            goto L_0x01c8
        L_0x01c2:
            java.util.List<java.lang.String> r5 = r6.f38012c
            java.util.List r1 = java.util.Collections.unmodifiableList(r5)
        L_0x01c8:
            boolean r5 = com.facebook.internal.C14277aa.m29277a(r1)
            if (r5 != 0) goto L_0x01d8
            java.lang.String r5 = "top_background_color_list"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.putStringArrayList(r5, r0)
        L_0x01d8:
            java.lang.String r5 = "content_url"
            java.lang.String r6 = r6.f38013d
            com.facebook.internal.C14277aa.m29265a(r7, r5, r6)
            r1 = r7
        L_0x01e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14596f.m29875a(java.util.UUID, com.facebook.share.model.ShareContent, boolean):android.os.Bundle");
    }

    /* renamed from: a */
    private static Bundle m29871a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C14277aa.m29264a(bundle, "LINK", shareContent.f37946h);
        C14277aa.m29265a(bundle, "PLACE", shareContent.f37948j);
        C14277aa.m29265a(bundle, "PAGE", shareContent.f37949k);
        C14277aa.m29265a(bundle, "REF", shareContent.f37950l);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f37947i;
        if (!C14277aa.m29277a((Collection<T>) list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(list));
        }
        ShareHashtag shareHashtag = shareContent.f37951m;
        if (shareHashtag != null) {
            C14277aa.m29265a(bundle, "HASHTAG", shareHashtag.f37958a);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m29872a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        String str;
        Bundle a = m29871a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement = shareMessengerGenericTemplateContent.f37976c;
            if (shareMessengerGenericTemplateElement.f37982e != null) {
                C14594e.m29868a(a, shareMessengerGenericTemplateElement.f37982e, false);
            } else if (shareMessengerGenericTemplateElement.f37981d != null) {
                C14594e.m29868a(a, shareMessengerGenericTemplateElement.f37981d, true);
            }
            C14277aa.m29264a(a, "IMAGE", shareMessengerGenericTemplateElement.f37980c);
            C14277aa.m29265a(a, "PREVIEW_TYPE", "DEFAULT");
            C14277aa.m29265a(a, "TITLE", shareMessengerGenericTemplateElement.f37978a);
            C14277aa.m29265a(a, "SUBTITLE", shareMessengerGenericTemplateElement.f37979b);
            String str2 = "MESSENGER_PLATFORM_CONTENT";
            JSONArray jSONArray = new JSONArray();
            ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement2 = shareMessengerGenericTemplateContent.f37976c;
            JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement2.f37978a).put("subtitle", shareMessengerGenericTemplateElement2.f37979b).put("image_url", C14277aa.m29251a(shareMessengerGenericTemplateElement2.f37980c));
            if (shareMessengerGenericTemplateElement2.f37982e != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(C14594e.m29865a(shareMessengerGenericTemplateElement2.f37982e));
                put.put("buttons", jSONArray2);
            }
            if (shareMessengerGenericTemplateElement2.f37981d != null) {
                put.put("default_action", C14594e.m29866a(shareMessengerGenericTemplateElement2.f37981d, true));
            }
            JSONArray put2 = jSONArray.put(put);
            JSONObject put3 = new JSONObject().put(MovieDetailAPi.f94893c, "generic").put("sharable", shareMessengerGenericTemplateContent.f37974a);
            String str3 = "image_aspect_ratio";
            C14643a aVar = shareMessengerGenericTemplateContent.f37975b;
            if (aVar != null) {
                if (C145951.f37895b[aVar.ordinal()] == 1) {
                    str = "square";
                    C14277aa.m29274a(a, str2, (Object) new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", put3.put(str3, str).put("elements", put2))));
                    return a;
                }
            }
            str = "horizontal";
            C14277aa.m29274a(a, str2, (Object) new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", put3.put(str3, str).put("elements", put2))));
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
            sb.append(e.getMessage());
            throw new C14457k(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m29873a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        String str;
        Bundle a = m29871a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            C14594e.m29868a(a, shareMessengerMediaTemplateContent.f37986d, false);
            C14277aa.m29265a(a, "PREVIEW_TYPE", "DEFAULT");
            C14277aa.m29265a(a, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.f37984b);
            if (shareMessengerMediaTemplateContent.f37985c != null) {
                String host = shareMessengerMediaTemplateContent.f37985c.getHost();
                if (C14277aa.m29276a(host) || !C14594e.f37893a.matcher(host).matches()) {
                    str = "IMAGE";
                } else {
                    str = "uri";
                }
                C14277aa.m29264a(a, str, shareMessengerMediaTemplateContent.f37985c);
            }
            C14277aa.m29265a(a, "type", C14594e.m29862a(shareMessengerMediaTemplateContent.f37983a));
            String str2 = "MESSENGER_PLATFORM_CONTENT";
            JSONArray jSONArray = new JSONArray();
            JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.f37984b).put("url", C14277aa.m29251a(shareMessengerMediaTemplateContent.f37985c)).put("media_type", C14594e.m29862a(shareMessengerMediaTemplateContent.f37983a));
            if (shareMessengerMediaTemplateContent.f37986d != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(C14594e.m29865a(shareMessengerMediaTemplateContent.f37986d));
                put.put("buttons", jSONArray2);
            }
            C14277aa.m29274a(a, str2, (Object) new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put(MovieDetailAPi.f94893c, "media").put("elements", jSONArray.put(put)))));
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
            sb.append(e.getMessage());
            throw new C14457k(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m29874a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a = m29871a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            C14594e.m29868a(a, shareMessengerOpenGraphMusicTemplateContent.f37989b, false);
            C14277aa.m29265a(a, "PREVIEW_TYPE", "OPEN_GRAPH");
            C14277aa.m29264a(a, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.f37988a);
            String str = "MESSENGER_PLATFORM_CONTENT";
            JSONArray jSONArray = new JSONArray();
            JSONObject put = new JSONObject().put("url", C14277aa.m29251a(shareMessengerOpenGraphMusicTemplateContent.f37988a));
            if (shareMessengerOpenGraphMusicTemplateContent.f37989b != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(C14594e.m29865a(shareMessengerOpenGraphMusicTemplateContent.f37989b));
                put.put("buttons", jSONArray2);
            }
            C14277aa.m29274a(a, str, (Object) new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put(MovieDetailAPi.f94893c, "open_graph").put("elements", jSONArray.put(put)))));
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
            sb.append(e.getMessage());
            throw new C14457k(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m29870a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        JSONObject jSONObject;
        Bundle a = m29871a((ShareContent) shareCameraEffectContent, z);
        C14277aa.m29265a(a, "effect_id", shareCameraEffectContent.f37943a);
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            CameraEffectArguments cameraEffectArguments = shareCameraEffectContent.f37944b;
            if (cameraEffectArguments == null) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : cameraEffectArguments.f37929a.keySet()) {
                    Object obj = cameraEffectArguments.f37929a.get(str);
                    if (obj != null) {
                        C14591a aVar = (C14591a) C14587b.f37892a.get(obj.getClass());
                        if (aVar != null) {
                            aVar.mo26829a(jSONObject2, str, obj);
                        } else {
                            StringBuilder sb = new StringBuilder("Unsupported type: ");
                            sb.append(obj.getClass());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            if (jSONObject != null) {
                C14277aa.m29265a(a, "effect_arguments", jSONObject.toString());
            }
            return a;
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("Unable to create a JSON Object from the provided CameraEffectArguments: ");
            sb2.append(e.getMessage());
            throw new C14457k(sb2.toString());
        }
    }
}
