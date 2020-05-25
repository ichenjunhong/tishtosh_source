package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.am */
final class C23385am implements IPublishPermissionCache {

    /* renamed from: a */
    private Context f62408a;

    /* renamed from: b */
    private SharedPreferences f62409b = C35807d.m80935a(this.f62408a, "PublishPermissionManager", 0);

    public final int getPublishPermission(int i) {
        return this.f62409b.getInt("publish_permission", i);
    }

    public final void setPublishPermission(int i) {
        Editor edit = this.f62409b.edit();
        edit.putInt("publish_permission", i);
        edit.apply();
    }

    public C23385am(Context context) {
        this.f62408a = context;
    }
}
