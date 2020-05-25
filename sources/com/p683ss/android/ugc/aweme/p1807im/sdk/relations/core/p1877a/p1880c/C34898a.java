package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1880c;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.UserActiveStatusConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.UserActiveStatusConfigSettings;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a.c.a */
public final class C34898a {

    /* renamed from: a */
    public boolean f89875a;

    /* renamed from: b */
    public int f89876b;

    /* renamed from: c */
    public UserActiveStatusConfig f89877c = UserActiveStatusConfigSettings.INSTANCE.getDEFAULT();

    /* renamed from: a */
    public final boolean mo73011a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo73012b() {
        return false;
    }

    /* renamed from: c */
    public final C34898a mo73013c() {
        C34898a aVar = new C34898a();
        aVar.f89875a = this.f89875a;
        aVar.f89876b = this.f89876b;
        aVar.f89877c = UserActiveStatusConfig.copy$default(this.f89877c, 0, 0, 0, 7, null);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserActiveStatusGlobalConfig{enabledByPrivacy=");
        sb.append(this.f89875a);
        sb.append(", enabledLevelByExp=");
        sb.append(this.f89876b);
        sb.append(", reportEnabled=");
        sb.append(mo73011a());
        sb.append(", fetchEnabled=");
        sb.append(mo73012b());
        sb.append(", parameters=");
        sb.append(this.f89877c);
        sb.append('}');
        return sb.toString();
    }
}
