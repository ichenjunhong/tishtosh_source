package com.p683ss.android.ugc.aweme.forward.p1776d;

import android.app.Activity;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.TextureView.SurfaceTextureListener;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.feed.C30158b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31757d;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31762b;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31764d;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p683ss.android.ugc.aweme.forward.p1774b.C32384f;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32410c;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32411d;
import com.p683ss.android.ugc.aweme.main.C36546c;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.newfollow.util.C37938f;
import com.p683ss.android.ugc.aweme.newfollow.util.C37942h;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.forward.d.i */
public class C32398i extends C32390c implements C38871j {

    /* renamed from: k */
    public C37937e f84309k;

    /* renamed from: l */
    public C48021h f84310l;

    /* renamed from: m */
    public C31757d f84311m;

    /* renamed from: n */
    protected int f84312n;

    /* renamed from: o */
    public boolean f84313o;

    /* renamed from: p */
    private C30178a f84314p = new C30178a();

    /* renamed from: q */
    private KeepSurfaceTextureView f84315q;

    /* renamed from: r */
    private boolean f84316r;

    /* renamed from: s */
    private Aweme f84317s;

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: c */
    public final void mo65542c() {
        super.mo65542c();
    }

    /* renamed from: e */
    public final void mo56771e() {
        super.mo56771e();
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        if (m74861f(str)) {
            ((C32384f) this.f84296a).mo65559a(false);
            ((C32384f) this.f84296a).mo65557a(0);
            this.f84296a.mo65551h();
            this.f84314p.f78757a = 2;
            C32384f fVar = (C32384f) this.f84296a;
            C43893g gVar = new C43893g(11, this.f84309k.mo77406c(), this.f84309k.mo77407d());
            fVar.mo65558a(gVar);
            m74862q();
        }
    }

    /* renamed from: b */
    public final void mo65541b() {
        super.mo65541b();
        mo65578c(false);
    }

    /* renamed from: q */
    private void m74862q() {
        C31842e i = mo65570i();
        if (i != null) {
            i.mo64943a();
        }
    }

    /* renamed from: r */
    private boolean m74863r() {
        this.f84309k.f96594a = mo65580n();
        this.f84309k.mo77405b();
        return true;
    }

    /* renamed from: l */
    public final void mo65575l() {
        ((C32384f) this.f84296a).mo65559a(true);
        C47718bf.m103291d(this);
    }

    /* renamed from: k */
    public final void mo65572k() {
        super.mo65572k();
        mo65579m();
        if (this.f84297b != null) {
            C31842e i = mo65570i();
            if (i != null) {
                i.f83201b = 0;
            }
        }
    }

    /* renamed from: m */
    public final void mo65579m() {
        if (this.f84317s != null) {
            this.f84303h.removeMessages(16);
            this.f84309k.mo77408e();
        }
    }

    /* renamed from: n */
    public final C48021h mo65580n() {
        if (this.f84310l == null) {
            C31842e i = mo65570i();
            if (i == null || i.f83207h == null) {
                this.f84310l = C37938f.m84829a().mo77414b();
            } else {
                this.f84310l = i.f83207h;
            }
        }
        return this.f84310l;
    }

    /* renamed from: a */
    public final void mo65539a() {
        boolean z = false;
        if (this.f84313o) {
            this.f84313o = false;
            return;
        }
        if (this.f84296a.mo65546b() instanceof FragmentActivity) {
            z = FollowEnterDetailViewModel.m74256a(this.f84299d, (FragmentActivity) this.f84296a.mo65546b()).f83230a;
        }
        if (!z) {
            super.mo65539a();
        }
        if (mo65568g() || mo65569h()) {
            this.f84296a.mo65553m();
            return;
        }
        mo65579m();
        C48107j.m104193f().mo95348b();
    }

    /* renamed from: d */
    public final void mo65543d() {
        super.mo65543d();
        this.f84303h.removeMessages(16);
        ((C32384f) this.f84296a).mo65559a(true);
        mo65579m();
        this.f84296a.mo65553m();
        ((C32384f) this.f84296a).mo65560b(false);
        if (this.f84310l != null) {
            if (this.f84297b != null) {
                if (this.f84297b.getAwemeType() == 13) {
                    C48107j.m104193f().mo95407b(this.f84297b.getForwardItem());
                } else if (this.f84297b.getAwemeType() == 0) {
                    C48107j.m104193f().mo95407b(this.f84297b);
                }
            }
            C37938f.m84829a().mo77413a(this.f84310l);
            this.f84309k.mo77401a();
            this.f84309k.f96594a = null;
            this.f84310l = null;
        }
        mo65571j();
    }

    /* renamed from: f */
    public final void mo65544f() {
        if (this.f84297b != null && this.f84297b.getForwardItem() != null) {
            C31842e i = mo65570i();
            if (i != null) {
                i.f83202c.mo95017a(UnReadVideoExperiment.BROWSE_RECORD_LIST);
            }
            String d = this.f84296a.mo65545a().mo64657d();
            String aid = this.f84297b.getAid();
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append("_");
            sb.append(aid);
            String sb2 = sb.toString();
            C32411d.m74938a().f84344a.put(sb2, new C32410c(sb2, this.f84297b, mo65580n()));
            C31781d.m73922a().mo64687a(this.f84296a.mo65546b(), this.f84297b, this.f84299d, sb2, this.f84300e);
        }
    }

    /* renamed from: o */
    public final void mo65581o() {
        if (this.f84309k.f96594a == null) {
            this.f84309k.f96594a = mo65580n();
        }
        if (!C32400j.m74895a(C11010c.m22280a())) {
            C10691a.m21542b(this.f84296a.mo65546b(), (int) R.string.cg1).mo19066a();
        } else if (!this.f84301f && this.f84297b != null && this.f84317s.getVideo() != null) {
            if (this.f84314p.f78757a == 2 || this.f84314p.f78757a == 1) {
                C23794bh.m58392f().mo64997a(this.f84297b, this.f84299d, this.f84316r);
                mo65579m();
                if (mo65570i() != null) {
                    mo65570i().f83201b = 3;
                }
            } else if ((this.f84314p.f78757a == 3 || this.f84314p.f78757a == 0) && this.f84317s.getVideo().getProperPlayAddr() != null) {
                C23794bh.m58392f().mo65000b(this.f84297b);
                ((C32384f) this.f84296a).mo65557a(0);
                this.f84317s.getVideo().setRationAndSourceId(this.f84297b.getAid());
                this.f84309k.f96594a = mo65580n();
                this.f84309k.mo77410g();
                if (this.f84311m != null) {
                    this.f84311m.mo64623a(this.f84297b);
                }
                if (mo65570i() != null) {
                    mo65570i().f83201b = 4;
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo65583p() {
        float f;
        if (this.f84297b != null) {
            this.f84316r = true;
            C31842e i = mo65570i();
            if (i != null) {
                i.f83202c.mo95017a(16777216);
                i.f83201b = this.f84314p.f78757a;
                i.f83204e = ((C32384f) this.f84296a).mo65562j()[0];
                i.f83203d = ((C32384f) this.f84296a).mo65562j()[1];
                i.f83207h = mo65580n();
                if (this.f84309k.f96594a == null) {
                    this.f84309k.f96594a = mo65580n();
                }
                int[] iArr = new int[2];
                this.f84315q.getLocationOnScreen(iArr);
                if (this.f84317s == null || this.f84317s.getVideo() == null) {
                    f = ((float) this.f84315q.getHeight()) / ((float) this.f84315q.getWidth());
                } else {
                    f = ((float) this.f84317s.getVideo().getHeight()) / ((float) this.f84317s.getVideo().getWidth());
                }
                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f84315q.getHeight(), this.f84315q.getWidth(), (float) this.f84296a.mo65546b().getResources().getDimensionPixelOffset(R.dimen.zu), f);
                int i2 = this.f84314p.f78757a;
                if (i2 != 0) {
                    switch (i2) {
                        case 2:
                            C31781d.m73922a().mo64684a(this.f84296a.mo65546b(), iViewInfo, this.f84297b, 4, this.f84299d, i.f83208i, false, true);
                            return;
                        case 3:
                            break;
                        default:
                            C31781d.m73922a().mo64684a(this.f84296a.mo65546b(), iViewInfo, this.f84297b, 2, this.f84299d, i.f83208i, false, true);
                            return;
                    }
                }
                C31781d.m73922a().mo64684a(this.f84296a.mo65546b(), iViewInfo, this.f84297b, 3, this.f84299d, i.f83208i, false, true);
            }
        }
    }

    /* renamed from: f */
    private boolean m74861f(String str) {
        if (this.f84297b == null) {
            return false;
        }
        return TextUtils.equals(str, this.f84297b.getAid());
    }

    /* renamed from: b */
    public final void mo65567b(int i) {
        this.f84303h.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f84297b;
        this.f84303h.sendMessage(message);
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        if (m74861f(str)) {
            ((C32384f) this.f84296a).mo65558a(new C43893g(7));
        }
    }

    /* renamed from: a */
    public final void mo65565a(int i) {
        super.mo65565a(i);
        switch (i) {
            case 0:
            case 1:
                this.f84303h.removeMessages(16);
                Message message = new Message();
                message.what = 16;
                message.obj = this.f84297b;
                this.f84303h.sendMessageDelayed(message, 150);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final void mo65578c(boolean z) {
        if (this.f84296a.mo65546b() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m74256a(this.f84299d, (FragmentActivity) this.f84296a.mo65546b()).f83230a = z;
        }
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        if (m74861f(str)) {
            ((C32384f) this.f84296a).mo65558a(new C43893g(6));
            mo65566a(0);
            C23794bh.m58392f().mo64994a(this.f84297b, this.f84300e, "", this.f84299d);
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        if (m74861f(str)) {
            ((C32384f) this.f84296a).mo65557a(2);
            this.f84314p.f78757a = 1;
            ((C32384f) this.f84296a).mo65558a(new C43893g(2));
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        if (m74861f(str)) {
            if (this.f84314p.f78757a != 3) {
                this.f84296a.mo65552i();
                ((C32384f) this.f84296a).mo65557a(1);
                this.f84314p.f78757a = 3;
                ((C32384f) this.f84296a).mo65558a(new C43893g(4));
            }
            if (!mo65568g()) {
                C31842e i = mo65570i();
                if (!(i == null || this.f84310l == null)) {
                    i.mo64946a(this.f84316r, this.f84299d, this.f84300e, "");
                }
            }
        }
    }

    @C53771m
    public void onFollowFeedDetailEvent(C31762b bVar) {
        if (this.f84296a != null && this.f84296a.mo65547c() && bVar.f82958b != null && bVar.f82958b.getAid().equals(this.f84297b.getAid())) {
            switch (bVar.f82957a) {
                case 1:
                    ((C32384f) this.f84296a).mo65557a(bVar.f82959c);
                    return;
                case 2:
                    mo65566a(0);
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        int i;
        ((C32384f) this.f84296a).mo65558a(new C43893g(8, z, 0));
        C32384f fVar = (C32384f) this.f84296a;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        fVar.mo65557a(i);
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message.what == 16) {
            Aweme aweme = (Aweme) message.obj;
            if (!C32400j.m74895a(C11010c.m22280a())) {
                ((C32384f) this.f84296a).mo65557a(3);
                C10691a.m21542b(this.f84296a.mo65546b(), (int) R.string.cg1).mo19066a();
            } else if (!this.f84301f && this.f84296a.mo65547c() && this.f84296a.mo65548d() && aweme != null && this.f84297b != null && TextUtils.equals(this.f84297b.getAid(), aweme.getAid())) {
                C31842e i = mo65570i();
                if (i == null) {
                    this.f84314p.f78757a = 4;
                } else if (!i.f83202c.mo95019c(16777216) && !i.f83202c.mo95019c(UnReadVideoExperiment.BROWSE_RECORD_LIST)) {
                    if (i.f83201b == 3) {
                        if (C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false)) {
                            m74863r();
                            mo65579m();
                        }
                        ((C32384f) this.f84296a).mo65557a(1);
                        this.f84314p.f78757a = 3;
                        C32384f fVar = (C32384f) this.f84296a;
                        C43893g gVar = new C43893g(12, this.f84309k.mo77406c(), this.f84309k.mo77407d());
                        fVar.mo65558a(gVar);
                        return;
                    }
                } else {
                    return;
                }
                m74863r();
                if (this.f84311m != null) {
                    this.f84311m.mo64623a(this.f84297b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        if (m74861f(dVar.f125523a)) {
            this.f84296a.mo65552i();
            ((C32384f) this.f84296a).mo65558a(new C43893g(1));
            ((C32384f) this.f84296a).mo65557a(1);
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        int i;
        if (!this.f84301f && m74861f(fVar.f125563a)) {
            ((C32384f) this.f84296a).mo65557a(0);
            this.f84296a.mo65551h();
            this.f84314p.f78757a = 2;
            int i2 = this.f84312n;
            String str = fVar.f125563a;
            if (this.f84297b != null) {
                i = this.f84297b.getAwemeType();
            } else {
                i = 0;
            }
            C30158b.m70764a(i2, str, i, this.f84297b);
            C30158b.m70765a(this.f84297b);
            C47718bf.m103288a(new C31764d(this.f84297b));
            ((C32384f) this.f84296a).mo65558a(new C43893g(0, fVar.f125565c));
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        if (m74861f(gVar.f125566a)) {
            ((C32384f) this.f84296a).mo65559a(false);
            ((C32384f) this.f84296a).mo65558a(new C43893g(5));
            C31842e i = mo65570i();
            if (i != null) {
                String str = this.f84299d;
                String str2 = this.f84300e;
                boolean z = this.f84316r;
                if (!i.f83206g) {
                    i.f83206g = true;
                    C23794bh.m58392f().mo64996a(i.f83200a, str, str2, "", z, "");
                }
                if (this.f84296a.mo65546b() instanceof Activity) {
                    Intent intent = ((Activity) this.f84296a.mo65546b()).getIntent();
                    if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                        String stringExtra = intent.getStringExtra("rule_id");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            new C23217av("video_play_from_push").mo48036s(stringExtra).mo48076e();
                        }
                    }
                }
            }
            m74862q();
            C36546c.m82442a("video_play");
        }
    }

    /* renamed from: b */
    public final void mo65577b(int i, int i2) {
        if (this.f84296a.mo65547c()) {
            this.f84298c.mo64960a(this.f84305j);
            this.f84298c.mo64964d();
        }
        mo65576a(i, i2);
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public final void mo65576a(int i, int i2) {
        Aweme aweme = this.f84297b;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                aweme = aweme.getForwardItem();
            }
            if (!(aweme == null || aweme.getVideo() == null)) {
                C37942h.m84841a(i, i2, this.f84315q, ((float) aweme.getVideo().getHeight()) / ((float) aweme.getVideo().getWidth()));
                ((C32384f) this.f84296a).mo65563l();
            }
        }
    }

    /* renamed from: a */
    public final void mo65540a(Aweme aweme, String str, String str2) {
        super.mo65540a(aweme, str, str2);
        this.f84317s = aweme.getForwardItem();
        this.f84309k.mo77404a(aweme);
        this.f84309k.f96595b = str;
    }

    public C32398i(C32384f fVar, C31848j jVar, int i) {
        super(fVar, jVar);
        this.f84315q = fVar.mo65561g();
        this.f84309k = new C37937e(this.f84315q, this, null);
        this.f84309k.f96596c = true;
        this.f84312n = i;
        this.f84315q.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C32398i.this.mo65575l();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C32398i.this.mo65577b(i, i2);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C32398i.this.mo65576a(i, i2);
            }
        });
    }
}
