package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Dialog;
import android.arch.lifecycle.C0214z;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.tools.C46810ad;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.tools.C47063h;
import com.p683ss.android.ugc.aweme.tools.C47064i;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s */
public final class C44457s {

    /* renamed from: a */
    public final C43225dr f112457a;

    /* renamed from: a */
    public final void mo90339a() {
        if (this.f112457a.f33840g_ != null) {
            ((VideoRecordNewActivity) this.f112457a.f33840g_).f113766E.mo91328a(new C47064i());
        }
    }

    /* renamed from: b */
    public final void mo90340b() {
        if (this.f112457a.f33840g_ != null) {
            ((VideoRecordNewActivity) this.f112457a.f33840g_).f113766E.mo91385a(new C47063h());
        }
    }

    public C44457s(C43225dr drVar) {
        this.f112457a = drVar;
    }

    /* renamed from: a */
    public final <T> C46810ad<T> mo90338a(C47059f fVar) {
        if (this.f112457a.f33840g_ == null || this.f112457a.f33840g_.isFinishing()) {
            return null;
        }
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0214z.m440a(this.f112457a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a;
        if (shortVideoContext == null) {
            return null;
        }
        if (shortVideoContext.f107101b != 1 || shortVideoContext.f107122o) {
            C39666o oVar = (C39666o) C26888e.m65000a(this.f112457a.mo87887i(), C39666o.class);
            String e = C39618d.f101151O.mo83121e(C40796a.RecordTutorialLink);
            if (C39618d.f101152P.mo83103a(C40790a.EnableRecordTutorial) && !TextUtils.isEmpty(e) && oVar != null && oVar.mo48462d(true)) {
                oVar.mo48464e(false);
                Dialog b = new C10643a(this.f112457a.mo87887i()).mo18899b((int) R.string.d5t).mo18900b((int) R.string.d5r, (OnClickListener) new C44877t(this)).mo18886a((int) R.string.d5s, (OnClickListener) new C44895u(this, e)).mo18897a().mo18882b();
                if (!C23059a.m56592a(this.f112457a.mo87887i())) {
                    C23729p.m58256a(b);
                }
                b.show();
                C26890h.m65011a("tutorial_popup_show", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").f61491a);
            } else if (shortVideoContext.mo86362d()) {
                if (shortVideoContext.mo86372m() == 0) {
                    try {
                        new C1161a(this.f112457a.mo87887i(), R.style.ts).mo3768b((int) R.string.g1l).mo3769b((int) R.string.gc4, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C44457s.this.f112457a.mo87886M();
                            }
                        }).mo3759a((int) R.string.g1i, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (!C44457s.this.f112457a.mo87886M() && C44457s.this.f112457a.f33840g_ != null) {
                                    C44457s.this.mo90339a();
                                }
                            }
                        }).mo3773c((int) R.string.g1k, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (C44457s.this.f112457a.f33840g_ != null) {
                                    C39618d.f101175p.mo80686a();
                                    FragmentActivity I = C44457s.this.f112457a.mo87882I();
                                    if (I instanceof VideoRecordNewActivity) {
                                        C47064i iVar = new C47064i();
                                        iVar.f118845a = true;
                                        ((VideoRecordNewActivity) I).f113766E.mo91328a(iVar);
                                    }
                                }
                            }
                        }).mo3775c();
                    } catch (Exception e2) {
                        C47625i.m103103a(e2.toString());
                    }
                } else {
                    try {
                        new C1161a(this.f112457a.mo87887i(), R.style.ts).mo3768b((int) R.string.g1m).mo3769b((int) R.string.gc4, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C44457s.this.f112457a.mo87886M();
                            }
                        }).mo3759a((int) R.string.g1j, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (C44457s.this.f112457a.f33840g_ != null) {
                                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0214z.m440a(C44457s.this.f112457a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a;
                                    C26890h.m65011a("reshoot", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47826a("draft_id", shortVideoContext.f107022A).f61491a);
                                    C44457s.this.mo90340b();
                                }
                            }
                        }).mo3773c((int) R.string.g1k, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (!C44457s.this.f112457a.mo87886M()) {
                                    C39618d.f101175p.mo80686a();
                                    C44457s.this.mo90339a();
                                }
                            }
                        }).mo3775c();
                    } catch (Exception e3) {
                        C47625i.m103103a(e3.toString());
                    }
                }
            } else if (shortVideoContext.mo86372m() == 0) {
                mo90339a();
            } else {
                try {
                    new C1161a(this.f112457a.mo87887i(), R.style.ts).mo3768b((int) R.string.b8t).mo3769b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C44457s.this.f112457a.mo87886M();
                        }
                    }).mo3759a((int) R.string.nt, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (!C44457s.this.f112457a.mo87886M()) {
                                C39618d.f101175p.mo80686a();
                                C44457s.this.mo90339a();
                            }
                        }
                    }).mo3773c((int) R.string.nm, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (C44457s.this.f112457a.f33840g_ != null) {
                                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0214z.m440a(C44457s.this.f112457a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a;
                                C26890h.m65011a("reshoot", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47826a("draft_id", shortVideoContext.f107022A).f61491a);
                                C44457s.this.mo90340b();
                            }
                        }
                    }).mo3775c();
                } catch (Exception e4) {
                    C47625i.m103103a(e4.toString());
                }
            }
        } else {
            Dialog b2 = new C10643a(this.f112457a.mo87887i()).mo18899b((int) R.string.d39).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.b8q, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C44457s.this.mo90339a();
                }
            }).mo18897a().mo18882b();
            if (!C23059a.m56592a(this.f112457a.mo87887i())) {
                C23729p.m58256a(b2);
            }
            b2.show();
        }
        return null;
    }
}
