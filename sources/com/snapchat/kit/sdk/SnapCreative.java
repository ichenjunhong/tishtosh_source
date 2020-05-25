package com.snapchat.kit.sdk;

import android.content.Context;
import com.snapchat.kit.sdk.creative.C18302a;
import com.snapchat.kit.sdk.creative.C18302a.C18304a;
import com.snapchat.kit.sdk.creative.CreativeComponent;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;
import dagger.p2651a.C52869f;

public class SnapCreative {

    /* renamed from: a */
    static CreativeComponent f50370a;

    public static SnapCreativeKitApi getApi(Context context) {
        return m44459a(context).getApi();
    }

    public static SnapMediaFactory getMediaFactory(Context context) {
        return m44459a(context).getMediaFactory();
    }

    /* renamed from: a */
    private static synchronized CreativeComponent m44459a(Context context) {
        CreativeComponent creativeComponent;
        synchronized (SnapCreative.class) {
            if (f50370a == null) {
                C18304a aVar = new C18304a();
                aVar.f50519a = (SnapKitComponent) C52869f.m112470a(SnapKit.getComponent(context));
                if (aVar.f50519a != null) {
                    f50370a = new C18302a(aVar);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(SnapKitComponent.class.getCanonicalName());
                    sb.append(" must be set");
                    throw new IllegalStateException(sb.toString());
                }
            }
            creativeComponent = f50370a;
        }
        return creativeComponent;
    }
}
