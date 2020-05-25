package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.notification.a.y */
final /* synthetic */ class C38146y implements OnClickListener {

    /* renamed from: a */
    private final C38144x f97150a;

    /* renamed from: b */
    private final int f97151b;

    C38146y(C38144x xVar, int i) {
        this.f97150a = xVar;
        this.f97151b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C38144x xVar = this.f97150a;
        int i2 = this.f97151b;
        int size = xVar.f70670n.size();
        if (size > 0 && i2 >= 0 && i2 < size) {
            BaseNotice baseNotice = (BaseNotice) xVar.f70670n.get(i2);
            if (baseNotice != null) {
                NoticeApiManager.m85271a(baseNotice.getNid());
            }
            if (!C9376b.m18558a((Collection<T>) xVar.f97145d)) {
                xVar.f97145d.remove(baseNotice);
            }
            xVar.f70670n.remove(i2);
            xVar.notifyItemRemoved(i2);
            xVar.f97144c.mo78119a(xVar.f97145d.size());
        }
        dialogInterface.dismiss();
    }
}
