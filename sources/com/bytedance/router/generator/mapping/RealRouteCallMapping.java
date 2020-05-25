package com.bytedance.router.generator.mapping;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.IRouteCallMappingInitializer;
import com.bytedance.router.IRouteCallWrapper;
import com.p683ss.android.ugc.aweme.router.C41299t;
import java.util.Map;

public final class RealRouteCallMapping implements IRouteCallMappingInitializer {
    public final void init(Map<String, IRouteCallWrapper> map) {
        map.put("//user/homepage", new IRouteCallWrapper() {
            public boolean call(Context context, Uri uri, Intent intent, boolean z) {
                return C41299t.m91034b(context, uri, intent, z);
            }
        });
        map.put("//modern_feed", new IRouteCallWrapper() {
            public boolean call(Context context, Uri uri, Intent intent, boolean z) {
                return C41299t.m91033a(context, uri, intent, z);
            }
        });
        map.put("//search/trending", new IRouteCallWrapper() {
            public boolean call(Context context, Uri uri, Intent intent, boolean z) {
                return false;
            }
        });
        map.put("//mine", new IRouteCallWrapper() {
            public boolean call(Context context, Uri uri, Intent intent, boolean z) {
                return C41299t.m91034b(context, uri, intent, z);
            }
        });
        map.put("//discovery", new IRouteCallWrapper() {
            public boolean call(Context context, Uri uri, Intent intent, boolean z) {
                return C41299t.m91033a(context, uri, intent, z);
            }
        });
    }
}
