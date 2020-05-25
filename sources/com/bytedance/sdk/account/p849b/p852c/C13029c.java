package com.bytedance.sdk.account.p849b.p852c;

import android.os.Bundle;

/* renamed from: com.bytedance.sdk.account.b.c.c */
public final class C13029c {

    /* renamed from: com.bytedance.sdk.account.b.c.c$a */
    public static class C13030a extends C13027a {

        /* renamed from: a */
        public String f34044a;

        /* renamed from: b */
        public String f34045b;

        /* renamed from: c */
        public String f34046c;

        /* renamed from: d */
        public String f34047d = "opensdk";

        /* renamed from: e */
        public int f34048e = -1;

        /* renamed from: f */
        public String f34049f;

        /* renamed from: g */
        public String f34050g;

        /* renamed from: h */
        public String f34051h;

        public final int getType() {
            return 1;
        }

        public C13030a() {
        }

        public C13030a(Bundle bundle) {
            fromBundle(bundle);
        }

        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.f34044a);
            bundle.putString("_bytedance_params_client_key", this.f34046c);
            bundle.putString("_bytedance_params_redirect_uri", this.f34045b);
            bundle.putString("_bytedance_params_scope", this.f34049f);
            bundle.putString("_bytedance_params_optional_scope0", this.f34050g);
            bundle.putString("_bytedance_params_optional_scope1", this.f34051h);
            bundle.putInt("wap_requested_orientation", this.f34048e);
            bundle.putString("wap_to_native_from_tag", this.f34047d);
        }

        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f34044a = bundle.getString("_bytedance_params_state");
            this.f34046c = bundle.getString("_bytedance_params_client_key");
            this.f34045b = bundle.getString("_bytedance_params_redirect_uri");
            this.f34049f = bundle.getString("_bytedance_params_scope");
            this.f34050g = bundle.getString("_bytedance_params_optional_scope0");
            this.f34051h = bundle.getString("_bytedance_params_optional_scope1");
            this.f34048e = bundle.getInt("wap_requested_orientation", -1);
            this.f34047d = bundle.getString("wap_to_native_from_tag", "opensdk");
        }
    }

    /* renamed from: com.bytedance.sdk.account.b.c.c$b */
    public static class C13031b extends C13028b {

        /* renamed from: a */
        public String f34052a;

        /* renamed from: b */
        public String f34053b;

        /* renamed from: c */
        public String f34054c;

        public C13031b() {
        }

        public final int getType() {
            return 2;
        }

        public C13031b(Bundle bundle) {
            fromBundle(bundle);
        }

        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f34052a = bundle.getString("_bytedance_params_authcode");
            this.f34053b = bundle.getString("_bytedance_params_state");
            this.f34054c = bundle.getString("_bytedance_params_granted_permission");
        }

        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.f34052a);
            bundle.putString("_bytedance_params_state", this.f34053b);
            bundle.putString("_bytedance_params_granted_permission", this.f34054c);
        }
    }
}
