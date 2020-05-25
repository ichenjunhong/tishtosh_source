package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1975c.C37355h;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a.C39052a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.l */
public final class C39389l implements C29689c {

    /* renamed from: a */
    C11079a f100757a;

    /* renamed from: b */
    public boolean f100758b;

    /* renamed from: c */
    public PoiStruct f100759c;

    /* renamed from: d */
    C39481c f100760d;

    /* renamed from: e */
    View f100761e;

    /* renamed from: f */
    boolean f100762f;

    /* renamed from: g */
    public C39128l f100763g;

    /* renamed from: h */
    private CheckableImageView[] f100764h;

    /* renamed from: i */
    private C29686a f100765i = new C29686a();

    /* renamed from: e */
    private void m87608e() {
        this.f100758b = !this.f100758b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Activity mo80355a() {
        return this.f100757a.getActivity();
    }

    public C39389l() {
        this.f100765i.mo54800a(this);
    }

    /* renamed from: d */
    public final void mo80360d() {
        if (this.f100760d != null && this.f100760d.isShowing()) {
            this.f100760d.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo80358b() {
        CheckableImageView[] checkableImageViewArr;
        if (this.f100759c != null) {
            this.f100765i.mo44934a_(Integer.valueOf(4), this.f100759c.getPoiId(), Integer.valueOf(true ^ this.f100758b ? 1 : 0));
            m87608e();
            if (this.f100764h != null) {
                for (CheckableImageView checkableImageView : this.f100764h) {
                    if (checkableImageView != null) {
                        checkableImageView.mo76958a(checkableImageView.getAlpha());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo80359c() {
        CheckableImageView[] checkableImageViewArr;
        if (this.f100764h != null) {
            for (CheckableImageView checkableImageView : this.f100764h) {
                if (checkableImageView != null) {
                    Object tag = checkableImageView.getTag(R.id.aqy);
                    int i = R.drawable.dfz;
                    if (tag == null || !(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
                        if (!this.f100758b) {
                            i = R.drawable.df0;
                        }
                        checkableImageView.setImageResource(i);
                    } else {
                        if (!this.f100758b) {
                            i = R.drawable.dgh;
                        }
                        checkableImageView.setImageResource(i);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m87609f() {
        String str;
        String str2;
        if (this.f100759c != null) {
            C39052a c = new C39052a().mo79208a("poi_page").mo79210b(this.f100759c.getPoiId()).mo79211c(this.f100759c.getTypeCode());
            if (this.f100763g != null) {
                str = this.f100763g.awemeid;
            } else {
                str = "";
            }
            C39052a d = c.mo79212d(str);
            if (this.f100763g != null) {
                str2 = this.f100763g.from;
            } else {
                str2 = "";
            }
            C39051a a = d.mo79213e(str2).mo79207a(this.f100759c).mo79214f("click_button").mo79209a();
            if (this.f100758b) {
                C39053b.m86891b(a);
                C39443d.m87706b((Context) mo80355a(), C23324d.m57378a().getRawAdAwemeById(this.f100763g.awemeid), this.f100759c.getPoiId());
            } else {
                C39053b.m86888a(a);
                C39443d.m87701a((Context) mo80355a(), C23324d.m57378a().getRawAdAwemeById(this.f100763g.awemeid), this.f100759c.getPoiId());
            }
            if (this.f100763g != null && ((TextUtils.equals(this.f100763g.from, "search_result") || TextUtils.equals(this.f100763g.from, "general_search")) && !this.f100758b)) {
                C39454n.f100872a.mo80412a("search_favourite", "poi_page", this.f100759c.getPoiId(), TextUtils.equals(this.f100763g.from, "search_result"));
            }
        }
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        C32458a.m75148a((Throwable) exc);
        m87608e();
        mo80359c();
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        if (this.f100758b) {
            this.f100759c.setCollectStatus(1);
            C47718bf.m103288a(new C37355h(1, this.f100759c));
            if (this.f100761e != null) {
                this.f100761e.post(new C39392n(this));
            }
            Keva repo = Keva.getRepo("poi_repo");
            if (repo != null) {
                repo.storeLong("collect_action_latest_time", System.currentTimeMillis());
            }
            return;
        }
        this.f100759c.setCollectStatus(0);
        C47718bf.m103288a(new C37355h(0, this.f100759c));
        mo80360d();
    }

    /* renamed from: a */
    public final void mo80357a(C11079a aVar, CheckableImageView... checkableImageViewArr) {
        CheckableImageView[] checkableImageViewArr2;
        this.f100757a = aVar;
        this.f100764h = checkableImageViewArr;
        if (this.f100764h != null) {
            for (CheckableImageView checkableImageView : this.f100764h) {
                if (checkableImageView != null) {
                    checkableImageView.setOnStateChangeListener(new C37446a() {
                        /* renamed from: a */
                        public final void mo50574a() {
                        }

                        /* renamed from: a */
                        public final void mo50575a(int i) {
                            if (i == 1) {
                                C39389l.this.mo80359c();
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80356a(View view, boolean z) {
        m87609f();
        this.f100761e = view;
        if (!C20854a.m53167g().isLogin()) {
            C27965f.m66722a(mo80355a(), "poi_page", "click_favorite_poi", (C23505g) new C39391m(this));
            return;
        }
        this.f100762f = z;
        mo80358b();
    }
}
