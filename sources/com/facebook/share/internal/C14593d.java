package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.d */
public final class C14593d {
    /* renamed from: a */
    private static Bundle m29860a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C14277aa.m29264a(bundle, "com.facebook.platform.extra.LINK", shareContent.f37946h);
        C14277aa.m29265a(bundle, "com.facebook.platform.extra.PLACE", shareContent.f37948j);
        C14277aa.m29265a(bundle, "com.facebook.platform.extra.REF", shareContent.f37950l);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f37947i;
        if (!C14277aa.m29277a((Collection<T>) list)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(list));
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m29861a(UUID uuid, ShareContent shareContent, boolean z) {
        C14283ab.m29306a((Object) shareContent, "shareContent");
        C14283ab.m29306a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle a = m29860a(shareLinkContent, z);
            C14277aa.m29265a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.f37961b);
            C14277aa.m29265a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.f37960a);
            C14277aa.m29264a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.f37962c);
            return a;
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List a2 = C14607l.m29927a(sharePhotoContent, uuid);
            Bundle a3 = m29860a(sharePhotoContent, z);
            a3.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(a2));
            return a3;
        } else if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        } else {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                JSONObject a4 = C14607l.m29930a(uuid, shareOpenGraphContent);
                Bundle a5 = m29860a(shareOpenGraphContent, z);
                C14277aa.m29265a(a5, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.f37997b);
                C14277aa.m29265a(a5, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.f37996a.mo26900a());
                C14277aa.m29265a(a5, "com.facebook.platform.extra.ACTION", a4.toString());
                return a5;
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new C14457k(sb.toString());
            }
        }
    }
}
