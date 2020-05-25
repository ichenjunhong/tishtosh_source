package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24865u;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37539bh;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.p2425e.p2426a.C48547b;
import com.p683ss.android.ugc.p2425e.p2426a.C48548c;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.a */
public final class C24955a extends C37518aw {

    /* renamed from: a */
    public Handler f66057a;

    /* renamed from: b */
    public Thread f66058b;

    /* renamed from: c */
    public C24803a f66059c;

    /* renamed from: d */
    public C24961a f66060d;

    /* renamed from: s */
    private C24865u f66061s;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.h.a$a */
    public interface C24961a {
        /* renamed from: a */
        void mo50851a();

        /* renamed from: a */
        void mo50852a(int i, int i2);
    }

    /* renamed from: a */
    public final void mo50911a() {
        super.mo50911a();
        if (this.f95727o != null && this.f66059c != null) {
            C24963c.m60720a(this.f95727o.getMusicId());
            C24963c.m60721a(this.f95727o.getMusicId(), this.f66059c);
        }
    }

    /* renamed from: c */
    public final void mo50915c() {
        this.f95720h.mo96053a((C48549d) new C24962b(this));
        this.f95720h.mo96051a((C48547b) new C48547b() {
            /* renamed from: a */
            public final void mo50919a() {
                if (C24955a.this.f66060d != null) {
                    C24955a.this.f66060d.mo50851a();
                }
                if (C24955a.this.f66059c.f65648h) {
                    C24963c.m60720a(C24955a.this.f95727o.getMusicId());
                    C24963c.m60721a(C24955a.this.f95727o.getMusicId(), C24955a.this.f66059c);
                }
            }
        });
        this.f95720h.mo96052a((C48548c) new C48548c() {
            /* renamed from: a */
            public final void mo50920a(int i, int i2) {
                if (C24955a.this.f66060d != null) {
                    C24955a.this.f66060d.mo50852a(i, i2);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo50914b() {
        if (this.f95729q != null) {
            this.f95729q.cancel();
        }
        if (this.f66057a == null) {
            if (this.f95720h != null) {
                this.f95720h.mo96057b();
            }
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        this.f66057a.sendMessage(obtain);
    }

    /* renamed from: d */
    public final void mo50916d() {
        super.mo50916d();
        if (this.f66057a != null) {
            this.f66057a.removeCallbacksAndMessages(null);
            this.f66057a.sendEmptyMessage(0);
        }
        this.f95720h.mo96051a((C48547b) null);
        this.f95720h.mo96052a((C48548c) null);
        this.f95720h.mo96053a((C48549d) null);
        this.f66060d = null;
    }

    public C24955a(C37625m mVar) {
        this(mVar, null);
    }

    public C24955a(C37625m mVar, C24961a aVar) {
        super(mVar);
        this.f66060d = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50912a(int i, int i2) {
        if (this.f95727o != null) {
            MusicModel musicModel = this.f95727o;
            if (this.f95729q != null) {
                this.f95729q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                C249604 r0 = new CountDownTimer((long) musicModel.getRealAuditionDuration(), 1000) {
                    public final void onTick(long j) {
                    }

                    public final void onFinish() {
                        C24955a.this.f95720h.mo96057b();
                        if (C24955a.this.f66060d != null) {
                            C24955a.this.f66060d.mo50851a();
                        }
                    }
                };
                this.f95729q = r0;
                this.f95729q.start();
            }
        }
        C24803a aVar = this.f66059c;
        MusicModel musicModel2 = this.f95727o;
        if (!(aVar == null || musicModel2 == null || musicModel2.getMusicType() == MusicType.LOCAL || C24963c.m60729c() == -1)) {
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", aVar.f65641a).mo47829a("music_id", musicModel2.getMusicId()).mo47829a("category_name", aVar.f65642b).mo47829a("enter_method", aVar.f65643c).mo47829a("previous_page", aVar.f65644d).mo47826a("order", C24963c.m60729c()).mo47829a("creation_id", C24963c.m60714a());
            if (!TextUtils.isEmpty(aVar.f65647g)) {
                a.mo47829a("tag_id", aVar.f65647g);
            }
            if (!TextUtils.isEmpty(aVar.f65646f)) {
                a.mo47829a("prop_id", aVar.f65646f);
            }
            if (!TextUtils.isEmpty(aVar.f65645e)) {
                a.mo47829a("category_id", aVar.f65645e);
            }
            if (aVar.f65649i != null) {
                a.mo47828a("log_pb", (Object) aVar.f65649i);
                String str = "";
                if (!TextUtils.isEmpty(aVar.f65649i.getImprId())) {
                    str = aVar.f65649i.getImprId();
                }
                a.mo47829a("impr_id", str);
            }
            if (TextUtils.equals(aVar.f65641a, "search_music")) {
                a.mo47829a("search_keyword", C24963c.f66069a);
                a.mo47829a("log_pb", new C17971f().mo34889b(musicModel2.getLogPb()));
                if (C24963c.m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65012a("play_music", C37539bh.m83960a(a.f61491a));
            } else {
                if (C24963c.m60732d()) {
                    a.mo47829a("is_commercial", "1");
                }
                C26890h.m65011a("play_music", a.f61491a);
            }
        }
        String musicId = this.f95727o.getMusicId();
        if (C24963c.f66072d == null) {
            C24963c.f66072d = new C24966f();
        }
        C24966f fVar = C24963c.f66072d;
        fVar.f66075a = musicId;
        fVar.f66077c = 0;
        fVar.f66076b = System.currentTimeMillis();
        fVar.f66078d = i2;
        String musicId2 = this.f95727o.getMusicId();
        if (this.f66061s != null && TextUtils.equals(musicId2, this.f66061s.f65796a)) {
            C9951d.m19997a("time_from_click_music_to_start_play", C23088c.m56631a().mo47823a("duration", Long.valueOf(System.currentTimeMillis() - this.f66061s.f65797b)).mo47825b());
        }
        if (this.f95726n && this.f95720h != null) {
            mo50914b();
        }
        if (this.f95717e != null && this.f95717e.mo50819g() != null && i2 != 0) {
            this.f95717e.mo50819g().setDuration(i2);
        }
    }

    /* renamed from: a */
    public final void mo50913a(MusicModel musicModel, int i, boolean z) {
        final C24967g gVar = new C24967g(musicModel, i, z);
        if (musicModel != null) {
            this.f66061s = new C24865u(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.f66058b == null) {
            this.f66058b = new Thread() {
                public final void run() {
                    Looper.prepare();
                    C24955a.this.f66057a = new Handler(Looper.myLooper()) {
                        public final void handleMessage(Message message) {
                            if (message.what == 0) {
                                Looper.myLooper().quit();
                                if (C24955a.this.f95720h != null) {
                                    C24955a.this.f95720h.mo96050a();
                                }
                                C24955a.this.f66058b = null;
                                return;
                            }
                            if (message.what == 2) {
                                if (C24955a.this.f95720h != null) {
                                    C24955a.this.f95720h.mo96057b();
                                }
                            } else if (message.what == 1) {
                                C24967g gVar = (C24967g) message.obj;
                                C249561.super.mo50913a(gVar.f66079a, gVar.f66080b, gVar.f66081c);
                            }
                        }
                    };
                    C24955a.super.mo50913a(gVar.f66079a, gVar.f66080b, gVar.f66081c);
                    Looper.loop();
                }
            };
            this.f66058b.start();
            return;
        }
        if (this.f66057a != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = gVar;
            this.f66057a.sendMessage(obtain);
        }
    }
}
