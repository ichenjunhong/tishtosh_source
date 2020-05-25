package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.GroupMemberSelectActivity.C34178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.d */
public final class C34141d {
    /* renamed from: a */
    public static final void m77965a(int i, String str, int i2) {
        Activity g = C11016e.m22312g();
        if (g != null) {
            if (i2 == 220) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_member_list_type", i);
                bundle.putString("session_id", str);
                RelationSelectActivity.m78821a(g, bundle, i2);
                return;
            }
            if (i2 == 221) {
                C34178a.m78000a(g, i, str, i2);
            }
        }
    }
}
