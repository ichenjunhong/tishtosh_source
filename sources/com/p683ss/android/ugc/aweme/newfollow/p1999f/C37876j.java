package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import android.app.Activity;
import android.content.Context;
import android.view.TextureView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31762b;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.newfollow.C37847b.C37848a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.newfollow.util.C37938f;
import com.p683ss.android.ugc.aweme.newfollow.util.C37942h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39042b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.ss.android.ugc.trill.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.j */
public final class C37876j implements C30447d, C38871j, C50161j {

    /* renamed from: a */
    public C37937e f96419a;

    /* renamed from: b */
    public C30303h f96420b;

    /* renamed from: c */
    public boolean f96421c;

    /* renamed from: d */
    public String f96422d;

    /* renamed from: e */
    public C30178a f96423e = new C30178a();

    /* renamed from: f */
    public int f96424f = 2;

    /* renamed from: g */
    public boolean f96425g;

    /* renamed from: h */
    private C37848a f96426h;

    /* renamed from: i */
    private Aweme f96427i;

    /* renamed from: j */
    private String f96428j;

    /* renamed from: k */
    private boolean f96429k;

    /* renamed from: l */
    private String f96430l;

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    public final void aD_() {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: i */
    private void m84534i() {
        C31842e c = C31843f.m74206a().mo64954c(this.f96430l);
        if (c != null) {
            c.mo64943a();
        }
    }

    /* renamed from: b */
    public C31842e mo77318b() {
        return C31843f.m74206a().mo64954c(this.f96430l);
    }

    /* renamed from: e */
    public final C48021h mo77321e() {
        if (this.f96419a != null) {
            return this.f96419a.f96594a;
        }
        return null;
    }

    /* renamed from: h */
    private Aweme m84533h() {
        if (this.f96427i.getAwemeType() == 13) {
            return this.f96427i.getForwardItem();
        }
        return this.f96427i;
    }

    /* renamed from: k */
    private void m84536k() {
        this.f96419a.mo77409f();
        this.f96423e.f78757a = 2;
        if (mo77318b() != null) {
            mo77318b().f83201b = 2;
        }
    }

    /* renamed from: l */
    private void m84537l() {
        this.f96419a.mo77410g();
        this.f96423e.f78757a = 4;
        if (mo77318b() != null) {
            mo77318b().f83201b = 4;
        }
    }

    /* renamed from: d */
    public final void mo77320d() {
        if ((!this.f96426h.mo77294e() || this.f96421c) && this.f96419a != null) {
            this.f96419a.mo77408e();
        }
        this.f96429k = true;
    }

    /* renamed from: j */
    private void m84535j() {
        switch (this.f96424f) {
            case 0:
            case 4:
                if (C37877k.m84560a(C11010c.m22280a())) {
                    m84537l();
                    break;
                } else {
                    C10691a.m21542b((Context) this.f96426h.mo77293d(), (int) R.string.cg1).mo19066a();
                    return;
                }
            case 1:
                break;
            case 2:
                this.f96426h.mo77290a(true);
                if (!C37877k.m84560a(C11010c.m22280a())) {
                    C10691a.m21542b((Context) this.f96426h.mo77293d(), (int) R.string.cg1).mo19066a();
                    return;
                } else {
                    m84536k();
                    return;
                }
            case 3:
                this.f96426h.mo77290a(true);
                break;
        }
        this.f96419a.mo77408e();
        this.f96423e.f78757a = 3;
        this.f96426h.mo77286a(1);
        if (mo77318b() != null) {
            mo77318b().f83201b = 3;
        }
    }

    /* renamed from: c */
    public final void mo77319c() {
        if (this.f96419a != null) {
            if (this.f96429k || mo77318b() == null || !(mo77318b().f83201b == 3 || mo77318b().f83201b == 0)) {
                this.f96419a.mo77410g();
            } else {
                this.f96426h.mo77286a(1);
                this.f96423e.f78757a = 3;
                C37848a aVar = this.f96426h;
                C43893g gVar = new C43893g(12, this.f96419a.mo77406c(), this.f96419a.mo77407d());
                aVar.mo77289a(gVar);
                return;
            }
        }
        this.f96429k = false;
    }

    /* renamed from: g */
    public final void mo77323g() {
        int i;
        if (this.f96423e.f78757a == 3) {
            i = 0;
        } else {
            i = 1;
        }
        this.f96424f = i;
        if (this.f96424f == 0) {
            C37879b.m84569a(this.f96427i);
        } else {
            C37879b.m84574a(this.f96427i, mo60874g(true), true);
        }
        if (this.f96424f != 0) {
            m84535j();
        } else if (!C37877k.m84560a(C11010c.m22280a())) {
            C10691a.m21542b((Context) this.f96426h.mo77293d(), (int) R.string.cg1).mo19066a();
        } else {
            this.f96419a.mo77410g();
            this.f96423e.f78757a = 4;
            if (mo77318b() != null) {
                mo77318b().f83201b = 4;
            }
        }
    }

    /* renamed from: f */
    public final void mo77322f() {
        Aweme h = m84533h();
        if (h != null && h.getMusic() != null) {
            if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(h.getMusic().convertToMusicModel(), this.f96426h.mo77293d(), true)) {
                C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", C23198ae.m56877m(this.f96427i)).mo47829a("author_id", C23198ae.m56846a(this.f96427i)).mo47829a("music_id", C23198ae.m56873k(this.f96427i)).mo47829a("enter_from", this.f96428j).f61491a);
                return;
            }
            String uuid = UUID.randomUUID().toString();
            C41302w a = C41302w.m91042a();
            Activity d = this.f96426h.mo77293d();
            StringBuilder sb = new StringBuilder("aweme://music/detail/");
            sb.append(h.getMusic().getMid());
            a.mo83858a(d, C41311y.m91065a(sb.toString()).mo83870a("process_id", uuid).mo83870a("aweme_id", h.getAid()).mo83871a());
            C37879b.m84592c(this.f96427i, this.f96428j, this.f96422d, uuid);
        }
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f96428j;
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        this.f96426h.mo77289a(new C43893g(7));
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        this.f96426h.mo77289a(new C43893g(1));
        this.f96426h.mo77292c();
        this.f96426h.mo77286a(1);
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        int i;
        this.f96426h.mo77289a(new C43893g(8, z, 0));
        C37848a aVar = this.f96426h;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        aVar.mo77286a(i);
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        this.f96423e.f78757a = 1;
        this.f96426h.mo77289a(new C43893g(2));
        this.f96426h.mo77286a(2);
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        this.f96426h.mo77289a(new C43893g(6));
        C47718bf.m103288a(new C31762b(2, this.f96427i));
        C37879b.m84572a(this.f96427i, "", "", this.f96428j);
        C47718bf.m103288a(new C39042b(C23198ae.m56861e(this.f96427i)));
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        this.f96423e.f78757a = 2;
        this.f96426h.mo77289a(new C43893g(0, fVar.f125565c));
        this.f96426h.mo77291b();
        this.f96426h.mo77286a(0);
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f96426h.mo77290a(false);
        this.f96423e.f78757a = 2;
        this.f96426h.mo77289a(new C43893g(5));
        m84534i();
        if (mo77318b() != null) {
            C31842e b = mo77318b();
            String str = this.f96428j;
            if (!b.f83206g) {
                b.f83206g = true;
                C23794bh.m58392f().mo64996a(b.f83200a, str, "", "", true, "");
            }
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        this.f96423e.f78757a = 3;
        this.f96426h.mo77286a(1);
        this.f96426h.mo77292c();
        if (this.f96424f == 3) {
            C37848a aVar = this.f96426h;
            C43893g gVar = new C43893g(12, this.f96419a.mo77406c(), this.f96419a.mo77407d());
            aVar.mo77289a(gVar);
        } else {
            this.f96426h.mo77289a(new C43893g(4));
        }
        C31842e c = C31843f.m74206a().mo64954c(this.f96430l);
        if (c != null) {
            String str2 = this.f96428j;
            if (c.f83205f != -1) {
                C23794bh.m58392f().mo64987a(c.f83200a, System.currentTimeMillis() - c.f83205f, true, str2);
                c.f83205f = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        this.f96426h.mo77290a(false);
        this.f96423e.f78757a = 2;
        this.f96426h.mo77291b();
        this.f96426h.mo77286a(0);
        if (this.f96424f == 4) {
            C37848a aVar = this.f96426h;
            C43893g gVar = new C43893g(11, this.f96419a.mo77406c(), this.f96419a.mo77407d());
            aVar.mo77289a(gVar);
        } else {
            this.f96426h.mo77289a(new C43893g(3));
        }
        m84534i();
    }

    /* renamed from: a */
    public final void mo54503a(int i, int i2) {
        if (this.f96426h.isActive()) {
            m84535j();
        }
        Aweme h = m84533h();
        if (h != null && h.getVideo() != null) {
            C37942h.m84841a(i, i2, (TextureView) this.f96426h.mo77285a().mo97949a(), ((float) h.getVideo().getHeight()) / ((float) h.getVideo().getWidth()));
            this.f96426h.mo77287a(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo54505b(int i, int i2) {
        Aweme h = m84533h();
        if (h != null && h.getVideo() != null) {
            C37942h.m84841a(i, i2, (TextureView) this.f96426h.mo77285a().mo97949a(), ((float) h.getVideo().getHeight()) / ((float) h.getVideo().getWidth()));
            this.f96426h.mo77288a(i, i2, ((float) h.getVideo().getHeight()) / ((float) h.getVideo().getWidth()));
        }
    }

    public C37876j(Aweme aweme, C37848a aVar, String str, String str2) {
        this.f96426h = aVar;
        this.f96427i = aweme;
        this.f96430l = str2;
        if (this.f96427i != null) {
            this.f96428j = str;
            this.f96420b = new C30303h(this.f96428j, 0, null, this);
            this.f96420b.mo52903a(aVar.mo77293d(), null);
            this.f96426h.mo77285a().mo97950a((C50161j) this);
            this.f96419a = new C37937e(this.f96426h.mo77285a(), (C38871j) this, (C30181a) this.f96420b, C36385k.f93160a);
            C31842e b = mo77318b();
            if (b == null || b.f83207h == null) {
                this.f96419a.f96594a = C37938f.m84829a().mo77414b();
                this.f96426h.mo77290a(true);
            } else {
                this.f96419a.f96594a = b.f83207h;
            }
            this.f96419a.mo77404a(this.f96427i);
            this.f96419a.f96596c = this.f96425g;
        }
    }
}
