package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39647x;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bg */
public final class C45421bg {

    /* renamed from: a */
    public static final C45422a f114810a = new C45422a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bg$a */
    public static final class C45422a {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bg$a$a */
        static final class C45423a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C52670a f114811a;

            C45423a(C52670a aVar) {
                this.f114811a = aVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                this.f114811a.invoke();
                return C52860x.f131107a;
            }
        }

        private C45422a() {
        }

        /* renamed from: a */
        public static Bundle m98992a(String str) {
            C52711k.m112240b(str, "loginTitle");
            return null;
        }

        public /* synthetic */ C45422a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m98993a(Activity activity) {
            C52711k.m112240b(activity, "act");
            ImmersionBar.with(activity).statusBarColor((int) R.color.a0_).statusBarDarkFont(true).init();
        }

        /* renamed from: a */
        public static void m98995a(PermissionSettingItem permissionSettingItem) {
            C52711k.m112240b(permissionSettingItem, "permissionSettingItem");
            if (C39618d.f101183x.mo74285e() != null) {
                C22055c e = C39618d.f101183x.mo74285e();
                if (e == null) {
                    C52711k.m112234a();
                }
                if (e.mo46160d()) {
                    permissionSettingItem.setSubtitle((int) R.string.d0m);
                    return;
                }
            }
            permissionSettingItem.setSubtitle((int) R.string.d0l);
        }

        /* renamed from: a */
        public static void m98994a(FragmentActivity fragmentActivity, C52670a<C52860x> aVar) {
            C52711k.m112240b(fragmentActivity, "activity");
            C52711k.m112240b(aVar, "checkServer");
            C39647x xVar = C39618d.f101142F;
            Activity activity = fragmentActivity;
            if (xVar.mo49453a(activity)) {
                xVar.mo49452a(activity, new C45423a(aVar));
            } else {
                aVar.invoke();
            }
        }
    }
}
