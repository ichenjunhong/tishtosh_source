package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30877cq;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidgetV1 */
public class VideoCommentWidgetV1 extends AbsFeedWidget {
    public void onCreate() {
        super.onCreate();
        this.f62238e.mo48226a("awesome_update_data", (C0199s<C23274a>) this).mo48226a("awesome_update_backup_data", (C0199s<C23274a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C31009h mo49728b(View view) {
        return new C30877cq(view);
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
}
