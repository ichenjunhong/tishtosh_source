package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14277aa.C14281b;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.n */
public final class C14619n {
    /* renamed from: a */
    private static Bundle m29947a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.f37951m;
        if (shareHashtag != null) {
            C14277aa.m29265a(bundle, "hashtag", shareHashtag.f37958a);
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m29948a(ShareLinkContent shareLinkContent) {
        Bundle a = m29947a((ShareContent) shareLinkContent);
        C14277aa.m29264a(a, "href", shareLinkContent.f37946h);
        C14277aa.m29265a(a, "quote", shareLinkContent.f37963d);
        return a;
    }

    /* renamed from: a */
    public static Bundle m29949a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m29947a((ShareContent) shareOpenGraphContent);
        C14277aa.m29265a(a, "action_type", shareOpenGraphContent.f37996a.mo26900a());
        try {
            JSONObject a2 = C14607l.m29931a(C14607l.m29929a(shareOpenGraphContent), false);
            if (a2 != null) {
                C14277aa.m29265a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new C14457k("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static Bundle m29950a(SharePhotoContent sharePhotoContent) {
        Bundle a = m29947a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.f38008a.size()];
        C14277aa.m29259a(sharePhotoContent.f38008a, (C14281b<T, K>) new C14281b<SharePhoto, String>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo26483a(Object obj) {
                return ((SharePhoto) obj).f38001c.toString();
            }
        }).toArray(strArr);
        a.putStringArray("media", strArr);
        return a;
    }
}
