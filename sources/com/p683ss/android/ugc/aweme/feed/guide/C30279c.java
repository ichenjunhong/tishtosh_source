package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.c */
final /* synthetic */ class C30279c implements OnClickListener {

    /* renamed from: a */
    private final EmptyGuideV2 f79116a;

    C30279c(EmptyGuideV2 emptyGuideV2) {
        this.f79116a = emptyGuideV2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        EmptyGuideV2 emptyGuideV2 = this.f79116a;
        if (emptyGuideV2.f79064e != null) {
            C26890h.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
            Fragment d = emptyGuideV2.f79067h.mo60685d();
            if (C47673an.m103185b(emptyGuideV2.f79064e)) {
                Intent intent = new Intent(emptyGuideV2.f79064e, ContactsActivity.class);
                if (d != null) {
                    d.startActivityForResult(intent, 1);
                } else {
                    emptyGuideV2.f79064e.startActivity(intent);
                }
            } else {
                C10691a.m21548c((Context) emptyGuideV2.f79064e, (int) R.string.hd).mo19066a();
                C47673an.m103184a(emptyGuideV2.f79064e, new C32753b() {
                    /* renamed from: b */
                    public final void mo60073b() {
                    }

                    /* renamed from: a */
                    public final void mo60072a() {
                        Intent a = ContactsActivity.m75414a(EmptyGuideV2.this.f79064e, "", true);
                        Fragment d = EmptyGuideV2.this.f79067h.mo60685d();
                        if (d != null) {
                            d.startActivityForResult(a, 1);
                        } else {
                            EmptyGuideV2.this.f79064e.startActivity(a);
                        }
                    }
                });
            }
        }
    }
}
