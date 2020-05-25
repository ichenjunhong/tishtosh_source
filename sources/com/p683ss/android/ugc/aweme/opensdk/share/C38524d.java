package com.p683ss.android.ugc.aweme.opensdk.share;

import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.opensdk.share.share.C38526a;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.d */
public final class C38524d implements C44370d {

    /* renamed from: a */
    private final String f98004a = "SharePublishServiceExtension";

    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26916m a = C38526a.m85863a((Object) photoContext);
        if (a != null) {
            Map map = linkedHashMap;
            String str5 = "open_platform_key";
            if (a.mClientKey == null) {
                str = "";
            } else {
                str = a.mClientKey;
            }
            C52711k.m112236a((Object) str, "if (shareContext.mClient…e shareContext.mClientKey");
            map.put(str5, str);
            String str6 = "open_platform_share_id";
            if (a.mState == null) {
                str2 = "";
            } else {
                str2 = a.mState;
            }
            C52711k.m112236a((Object) str2, "if (shareContext.mState … else shareContext.mState");
            map.put(str6, str2);
            String str7 = "open_platform_extra";
            if (a.mExtras == null) {
                str3 = "";
            } else {
                str3 = a.mExtras;
            }
            C52711k.m112236a((Object) str3, "if (shareContext.mExtras…else shareContext.mExtras");
            map.put(str7, str3);
            String str8 = "open_platform_content";
            if (a.mOpenPlatformContent == null) {
                str4 = "";
            } else {
                str4 = a.mOpenPlatformContent;
            }
            C52711k.m112236a((Object) str4, "if (shareContext.mOpenPl…text.mOpenPlatformContent");
            map.put(str8, str4);
        }
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        String str;
        String str2;
        String str3;
        String str4;
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C26916m a = C38526a.m85863a((Object) baseShortVideoContext);
        if (a != null) {
            Map map = linkedHashMap;
            String str5 = "open_platform_key";
            if (a.mClientKey == null) {
                str = "";
            } else {
                str = a.mClientKey;
            }
            C52711k.m112236a((Object) str, "if (shareContext.mClient…e shareContext.mClientKey");
            map.put(str5, str);
            String str6 = "open_platform_share_id";
            if (a.mState == null) {
                str2 = "";
            } else {
                str2 = a.mState;
            }
            C52711k.m112236a((Object) str2, "if (shareContext.mState … else shareContext.mState");
            map.put(str6, str2);
            String str7 = "open_platform_extra";
            if (a.mExtras == null) {
                str3 = "";
            } else {
                str3 = a.mExtras;
            }
            C52711k.m112236a((Object) str3, "if (shareContext.mExtras…else shareContext.mExtras");
            map.put(str7, str3);
            String str8 = "open_platform_content";
            if (a.mOpenPlatformContent == null) {
                str4 = "";
            } else {
                str4 = a.mOpenPlatformContent;
            }
            C52711k.m112236a((Object) str4, "if (shareContext.mOpenPl…text.mOpenPlatformContent");
            map.put(str8, str4);
        }
    }
}
