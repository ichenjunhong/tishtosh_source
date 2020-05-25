package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30919dt;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1 */
public class VideoDiggWidgetV1 extends AbsFeedWidget {

    /* renamed from: a */
    private final String f78996a;

    /* renamed from: h */
    private final String f78997h;

    /* renamed from: i */
    private final C30237a f78998i;

    /* renamed from: j */
    private final String f78999j;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1$a */
    public interface C30237a {
        /* renamed from: a */
        long mo60580a();
    }

    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("awesome_update_data", (C0199s<C23274a>) this).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        C30919dt dtVar = new C30919dt(view, this.f78996a, this.f78997h, this.f78999j, this.f78998i);
        return dtVar;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        super.onChanged(aVar);
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 651229933) {
                if (hashCode == 1759823748 && str.equals("awesome_update_data")) {
                    c = 0;
                }
            } else if (str.equals("awesome_update_backup_data")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    mo60576b(aVar);
                    break;
            }
        }
    }

    public VideoDiggWidgetV1(String str, String str2, String str3, String str4, String str5, C30237a aVar) {
        this.f78996a = str;
        this.f78997h = str2;
        this.f78998i = aVar;
        this.f78999j = str5;
    }
}
