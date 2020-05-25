package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.C13904i;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14277aa.C14281b;
import com.facebook.internal.C14350u;
import com.facebook.internal.C14350u.C14352a;
import com.facebook.p909a.C13589l;
import com.facebook.share.C14567a.C14568a;
import com.facebook.share.internal.C14598h.C14599a;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.l */
public final class C14607l {
    /* renamed from: a */
    public static JSONObject m29930a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        Set set;
        ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.f37996a;
        final ArrayList arrayList = new ArrayList();
        JSONObject a = C14598h.m29878a(shareOpenGraphAction, (C14599a) new C14599a() {
            /* renamed from: a */
            public final JSONObject mo26830a(SharePhoto sharePhoto) {
                C14352a a = C14607l.m29925a(uuid, (ShareMedia) sharePhoto);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.f37339b);
                    if (sharePhoto.f38002d) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new C14457k("Unable to attach images", (Throwable) e);
                }
            }
        });
        C14350u.m29425a(arrayList);
        if (shareOpenGraphContent.f37948j != null && C14277aa.m29276a(a.optString("place"))) {
            a.put("place", shareOpenGraphContent.f37948j);
        }
        if (shareOpenGraphContent.f37947i != null) {
            JSONArray optJSONArray = a.optJSONArray(C42311c.f106869m);
            if (optJSONArray == null) {
                set = new HashSet();
            } else {
                set = C14277aa.m29282b(optJSONArray);
            }
            for (String add : shareOpenGraphContent.f37947i) {
                set.add(add);
            }
            a.put(C42311c.f106869m, new JSONArray(set));
        }
        return a;
    }

    /* renamed from: a */
    public static JSONObject m29931a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m29931a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m29928a((JSONArray) obj, true);
                }
                Pair a = m29923a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new C14457k("Failed to create json object from share content");
        }
    }

    /* renamed from: a */
    static void m29932a(C13904i<C14568a> iVar) {
        m29934a("cancelled", (String) null);
        if (iVar != null) {
            iVar.mo23330n_();
        }
    }

    /* renamed from: a */
    static void m29933a(C13904i<C14568a> iVar, C14457k kVar) {
        m29934a("error", kVar.getMessage());
        if (iVar != null) {
            iVar.mo23328a(kVar);
        }
    }

    /* renamed from: a */
    static void m29934a(String str, String str2) {
        C13589l lVar = new C13589l(C14533n.m29773g());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        lVar.mo25411b("fb_share_dialog_result", bundle);
    }

    /* renamed from: a */
    public static Pair<String, String> m29923a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static String m29926a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        int lastIndexOf = uri2.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return null;
        }
        return uri2.substring(lastIndexOf);
    }

    /* renamed from: a */
    public static JSONObject m29929a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return C14598h.m29878a(shareOpenGraphContent.f37996a, (C14599a) new C14599a() {
            /* renamed from: a */
            public final JSONObject mo26830a(SharePhoto sharePhoto) {
                Uri uri = sharePhoto.f38001c;
                if (C14277aa.m29284b(uri)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", uri.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new C14457k("Unable to attach images", (Throwable) e);
                    }
                } else {
                    throw new C14457k("Only web images may be used in OG objects shared via the web dialog");
                }
            }
        });
    }

    /* renamed from: a */
    public static C14352a m29925a(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap = null;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.f38000b;
            uri = sharePhoto.f38001c;
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).f38014b;
        } else {
            uri = null;
        }
        return m29924a(uuid, uri, bitmap);
    }

    /* renamed from: a */
    public static Bundle m29922a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        Uri uri;
        Bitmap bitmap;
        if (shareCameraEffectContent != null) {
            CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.f37945c;
            if (cameraEffectTextures != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                for (String str : cameraEffectTextures.f37931a.keySet()) {
                    Object obj = cameraEffectTextures.f37931a.get(str);
                    if (obj instanceof Uri) {
                        uri = (Uri) obj;
                    } else {
                        uri = null;
                    }
                    Object obj2 = cameraEffectTextures.f37931a.get(str);
                    if (obj2 instanceof Bitmap) {
                        bitmap = (Bitmap) obj2;
                    } else {
                        bitmap = null;
                    }
                    C14352a a = m29924a(uuid, uri, bitmap);
                    arrayList.add(a);
                    bundle.putString(str, a.f37339b);
                }
                C14350u.m29425a(arrayList);
                return bundle;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m29927a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (sharePhotoContent != null) {
            List<SharePhoto> list = sharePhotoContent.f38008a;
            if (list != null) {
                List a = C14277aa.m29259a(list, (C14281b<T, K>) new C14281b<SharePhoto, C14352a>() {
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Object mo26483a(Object obj) {
                        return C14607l.m29925a(uuid, (ShareMedia) (SharePhoto) obj);
                    }
                });
                List<String> a2 = C14277aa.m29259a(a, (C14281b<T, K>) new C14281b<C14352a, String>() {
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Object mo26483a(Object obj) {
                        return ((C14352a) obj).f37339b;
                    }
                });
                C14350u.m29425a(a);
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static JSONArray m29928a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m29928a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m29931a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    private static C14352a m29924a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return C14350u.m29419a(uuid, bitmap);
        }
        if (uri != null) {
            return C14350u.m29420a(uuid, uri);
        }
        return null;
    }
}
