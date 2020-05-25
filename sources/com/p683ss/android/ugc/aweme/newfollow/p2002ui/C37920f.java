package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.f */
public final class C37920f {

    /* renamed from: a */
    public static int f96566a = 3;

    /* renamed from: b */
    public static int f96567b = 15;

    /* renamed from: c */
    public NoticeView f96568c;

    /* renamed from: d */
    public Context f96569d;

    /* renamed from: e */
    public C37923b f96570e;

    /* renamed from: f */
    public C37922a f96571f = C37922a.Message;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.f$a */
    public enum C37922a {
        Message,
        Follow
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.f$b */
    public interface C37923b {
        /* renamed from: a */
        void mo65249a(Context context);

        /* renamed from: b */
        boolean mo65250b(Context context);
    }

    /* renamed from: b */
    public final long mo77383b() {
        return C23859b.m58575b().mo49473c(this.f96569d, "key_cross_push_notification_guide");
    }

    /* renamed from: c */
    public final long mo77384c() {
        return C23859b.m58575b().mo49473c(this.f96569d, "key_times_push_notification_guide");
    }

    /* renamed from: a */
    public final void mo77382a() {
        if (this.f96569d != null && this.f96568c != null && this.f96570e != null) {
            if (!this.f96570e.mo65250b(this.f96569d)) {
                if (System.currentTimeMillis() - mo77383b() <= ((long) f96567b) * FbUploadTokenTime.group0 || mo77384c() >= ((long) f96566a)) {
                    this.f96568c.setVisibility(8);
                    return;
                }
                this.f96568c.setVisibility(0);
                if (this.f96571f == C37922a.Follow) {
                    C26890h.m65011a("notification_setting_alert_show", C23089d.m56640a().mo47829a("enter_from", "follow").f61491a);
                } else {
                    C26890h.m65011a("notification_setting_alert_show", C23089d.m56640a().mo47829a("enter_from", "message").f61491a);
                }
            } else {
                this.f96568c.setVisibility(8);
            }
        }
    }

    public C37920f(NoticeView noticeView, C37923b bVar) {
        this.f96568c = noticeView;
        this.f96568c.setVisibility(8);
        this.f96570e = bVar;
        if (!(this.f96568c == null || this.f96570e == null)) {
            this.f96569d = this.f96568c.getContext();
            if (!(this.f96568c == null || this.f96569d == null)) {
                this.f96568c.setOnInternalClickListener(new C28448a() {
                    /* renamed from: a */
                    public final void mo51945a() {
                        C37920f.this.f96568c.setVisibility(8);
                        C37920f fVar = C37920f.this;
                        Context context = C37920f.this.f96569d;
                        if (fVar.f96570e != null) {
                            try {
                                fVar.f96570e.mo65249a(fVar.f96569d);
                            } catch (Exception unused) {
                                fVar.f96569d.startActivity(new Intent("android.settings.SETTINGS"));
                            }
                        }
                        if (C37920f.this.f96571f == C37922a.Follow) {
                            C26890h.m65011a("notification_setting_alert_click", C23089d.m56640a().mo47829a("enter_from", "follow").f61491a);
                        } else {
                            C26890h.m65011a("notification_setting_alert_click", C23089d.m56640a().mo47829a("enter_from", "message").f61491a);
                        }
                    }

                    /* renamed from: b */
                    public final void mo51946b() {
                        C37920f.this.f96568c.setVisibility(8);
                        C23859b.m58575b().mo49463a(C37920f.this.f96569d, "key_cross_push_notification_guide", Long.valueOf(System.currentTimeMillis()).longValue());
                        C23859b.m58575b().mo49463a(C37920f.this.f96569d, "key_times_push_notification_guide", Long.valueOf(C37920f.this.mo77384c() + 1).longValue());
                        if (C37920f.this.f96571f == C37922a.Follow) {
                            C26890h.m65011a("notification_setting_alert_close", C23089d.m56640a().mo47829a("enter_from", "follow").f61491a);
                        } else {
                            C26890h.m65011a("notification_setting_alert_close", C23089d.m56640a().mo47829a("enter_from", "message").f61491a);
                        }
                    }
                });
            }
        }
        try {
            f96566a = C32816h.m75716b().getPushGuideInfo().getCloseCountLimit().intValue();
            f96567b = C32816h.m75716b().getPushGuideInfo().getShowupInterval().intValue();
        } catch (Exception unused) {
            f96566a = 3;
            f96567b = 15;
        }
    }
}
