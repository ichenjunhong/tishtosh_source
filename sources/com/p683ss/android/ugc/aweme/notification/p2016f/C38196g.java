package com.p683ss.android.ugc.aweme.notification.p2016f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.f.g */
public final class C38196g extends C38188d {
    /* renamed from: b */
    public final int mo72634b() {
        return 25;
    }

    public final String bm_() {
        return "tcm_session";
    }

    public final int bn_() {
        return 1;
    }

    /* renamed from: g */
    public final int mo78184g() {
        return 62;
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C35457c() {
            /* renamed from: a */
            public final void mo72636a(Context context, C35456b bVar, int i) {
                if (i == 1 || i == 2) {
                    C38196g.this.mo78183f();
                    C38196g.this.f91121l = 0;
                    C41049a.m90714a().updateNoticeSession(bVar);
                    NotificationDetailActivity.m85162a(context, 62, C38196g.this.f91119j);
                    C26890h.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("official"));
                    return;
                }
                if (i == 0) {
                    C26891a aVar = new C26891a(context);
                    aVar.mo54844a((CharSequence[]) new String[]{context.getResources().getString(R.string.bge)}, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (i == 0) {
                                C38196g.this.mo78183f();
                                C38196g.this.mo78186i();
                            }
                        }
                    });
                    aVar.mo54845b();
                }
            }
        };
    }

    /* renamed from: d */
    public final void mo72643d() {
        this.f91116g = C11010c.m22280a().getString(R.string.gjb);
        this.f91115f = C23556a.m57755a(R.drawable.clx);
    }

    /* renamed from: f */
    public final void mo78183f() {
        super.mo78183f();
        C47718bf.m103288a(new C38041h(mo78184g(), -1));
    }
}
