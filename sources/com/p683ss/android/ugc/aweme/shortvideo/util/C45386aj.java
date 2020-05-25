package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39606a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aj */
public final class C45386aj {

    /* renamed from: a */
    public static final C45387a f114772a = new C45387a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aj$a */
    public static final class C45387a {
        private C45387a() {
        }

        /* renamed from: a */
        public static int m98944a(boolean z) {
            return z ? 0 : 3;
        }

        /* renamed from: a */
        public static boolean m98948a() {
            return C39618d.f101151O.mo83117a(C40796a.PostDownloadSetting);
        }

        public /* synthetic */ C45387a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static int m98943a(CommonItemView commonItemView) {
            C52711k.m112240b(commonItemView, "commentSettingItem");
            if (commonItemView.mo19040c()) {
                return 0;
            }
            return 3;
        }

        /* renamed from: a */
        public static void m98946a(PermissionSettingItem permissionSettingItem) {
            if (!C39618d.f101151O.mo83117a(C40796a.PrivateAvailable) && permissionSettingItem != null) {
                permissionSettingItem.setVisibility(8);
            }
        }

        /* renamed from: a */
        public static void m98945a(C39606a aVar, int i) {
            if (aVar != null) {
                aVar.mo74253a(i);
            }
        }

        /* renamed from: a */
        public static void m98947a(PermissionSettingItem permissionSettingItem, Bundle bundle) {
            if (bundle != null) {
                bundle.putInt("permission", C39618d.f101151O.mo83117a(C40796a.PrivateAvailable) ? 1 : 0);
            }
        }
    }
}
