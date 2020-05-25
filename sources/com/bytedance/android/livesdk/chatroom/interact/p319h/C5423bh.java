package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5199r;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdk.chatroom.interact.C5646k;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5692b;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7825ba;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.message.model.C7864ce;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8704j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1681ae;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bh */
public final class C5423bh extends C5868cl<C5424a> implements C8619a, OnMessageListener {

    /* renamed from: a */
    LinkCrossRoomDataHolder f14400a = LinkCrossRoomDataHolder.m11103a();

    /* renamed from: b */
    int f14401b = -1;

    /* renamed from: c */
    Room f14402c;

    /* renamed from: d */
    boolean f14403d;

    /* renamed from: e */
    C1690c f14404e;

    /* renamed from: f */
    private C8618a f14405f;

    /* renamed from: g */
    private boolean f14406g;

    /* renamed from: h */
    private C17971f f14407h;

    /* renamed from: i */
    private C8710m f14408i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bh$a */
    public interface C5424a extends C6463ay {
        /* renamed from: a */
        void mo11329a();

        /* renamed from: a */
        void mo11330a(int i);

        /* renamed from: a */
        void mo11331a(long j, C4177d<Room> dVar, String str, int i, C5382c cVar);

        /* renamed from: a */
        void mo11332a(C5379a aVar, C2949a aVar2);

        /* renamed from: a */
        void mo11333a(boolean z);

        /* renamed from: b */
        void mo11334b(Throwable th);

        /* renamed from: c */
        void mo11335c();

        /* renamed from: c */
        void mo11336c(Throwable th);

        /* renamed from: d */
        void mo11337d();

        /* renamed from: e */
        void mo11338e();

        /* renamed from: f */
        void mo11339f();

        /* renamed from: g */
        void mo11340g();

        /* renamed from: h */
        void mo11341h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11323a(Throwable th) {
        mo11751c(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11321a(C7829bd bdVar, Throwable th) throws Exception {
        mo11751c(th);
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).reply(bdVar.f21572j, this.f14402c.getId(), 6, bdVar.f21577o).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5444ca(bdVar), new C5445cb(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11322a(Long l) throws Exception {
        m12235a(this.f14400a.f12612c);
        this.f14400a.mo10412c();
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (this.f14406g && this.f14400a.f12614e > 0) {
            C4632d dVar = (C4632d) this.f14400a.get("data_pk_state");
            if (!this.f14406g || dVar != C4632d.PK) {
                m12235a(this.f14400a.f12612c);
            } else {
                long j = this.f14400a.f12612c;
                C4002ac acVar = (C4002ac) ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).finish(j, this.f14400a.f12627r, 1, this.f14400a.f12628s).mo6525a((C2203w<T, ? extends R>) mo11753r());
                C5426bj bjVar = new C5426bj(this, j, SystemClock.uptimeMillis());
                acVar.mo9406a(bjVar, new C5437bu(this, j));
            }
        }
        this.f14400a.mo10412c();
        this.f14405f.removeCallbacksAndMessages(null);
        super.mo8247a();
    }

    /* renamed from: b */
    public final void mo11324b() {
        ((C4002ac) ((LinkApi) C4157e.m10322a().mo9550a(LinkApi.class)).joinChannelV3(this.f14400a.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5450cg(this), new C5451ch(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11318a(C4177d dVar) throws Exception {
        this.f15366s.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(2));
    }

    /* renamed from: a */
    private void m12235a(long j) {
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).finishV3(j).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5430bn(this), new C5431bo(this));
    }

    /* renamed from: b */
    private void m12237b(long j) {
        C4002ac acVar = (C4002ac) ((LinkPKApi) C4157e.m10322a().mo9550a(LinkPKApi.class)).battleStats(j, this.f14402c.getOwner().getId()).mo6525a((C2203w<T, ? extends R>) mo11753r());
        C5434br brVar = new C5434br(this, SystemClock.uptimeMillis(), j);
        acVar.mo9406a(brVar, C5435bs.f14424a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo11327c(C4177d dVar) throws Exception {
        this.f15366s.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(0));
        this.f14404e = ((C4002ac) C2201v.m6592a(20, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9406a(new C5441by(this), C5442bz.f14432a);
    }

    public final void onEvent(C5199r rVar) {
        if (mo8518c() != null) {
            switch (rVar.f13913a) {
                case 1:
                    ((C5424a) mo8518c()).mo11335c();
                    return;
                case 2:
                    ((C5424a) mo8518c()).mo11338e();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m12236a(Room room) {
        this.f14402c = room;
        if (this.f14402c.isWithLinkMic()) {
            if (this.f14402c.getLinkMicInfo() != null) {
                LinkCrossRoomDataHolder a = LinkCrossRoomDataHolder.m11103a();
                C8722v linkMicInfo = this.f14402c.getLinkMicInfo();
                a.mo10410a(linkMicInfo, this.f14402c);
                if (!this.f14406g && linkMicInfo != null && linkMicInfo.f23957c.f23834f == 2) {
                    m12237b(linkMicInfo.f23955a);
                    return;
                }
            }
            ((C5424a) mo8518c()).mo11329a();
            return;
        }
        if (this.f14402c.getLinkMicInfo() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", this.f14402c.getIdStr());
            hashMap.put("event", "LinkControlPresenter syncRoomStats");
            hashMap.put("anchor_id", String.valueOf(this.f14402c.getOwnerUserId()));
            hashMap.put("link_mic", C2942b.m8369a().mo34889b(this.f14402c.getLinkMicInfo()));
            C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
            LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.m11103a();
            C8722v linkMicInfo2 = this.f14402c.getLinkMicInfo();
            a2.mo10410a(linkMicInfo2, this.f14402c);
            if (linkMicInfo2 != null) {
                C8704j jVar = linkMicInfo2.f23956b;
                if (linkMicInfo2.f23957c.f23834f == 2) {
                    if (!this.f14406g) {
                        m12237b(linkMicInfo2.f23955a);
                    }
                    return;
                } else if (a2.f12612c > 0 && jVar != null) {
                    if (jVar.f23846c == 1 && jVar.f23844a == 4) {
                        ((C5424a) mo8518c()).mo11337d();
                    }
                } else {
                    return;
                }
            }
        }
        if (this.f14406g) {
            C4525b.f12444r.mo10346a(Integer.valueOf(this.f14402c.getOwner().getLinkMicStats()));
        }
    }

    /* renamed from: b */
    public final void mo11325b(int i) {
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).checkPermissionV3(this.f14402c.getId(), i).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5432bp(this, System.currentTimeMillis()), new C5433bq(this));
    }

    /* renamed from: a */
    public final void mo11315a(int i) {
        if (!this.f14403d) {
            int i2 = 1;
            this.f14403d = true;
            this.f14401b = 0;
            if (this.f14402c.isLiveTypeAudio()) {
                i2 = 8;
            }
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).init(this.f14402c.getId(), 6, i2).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5428bl(this), new C5429bm(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11326b(C4177d dVar) throws Exception {
        C5692b bVar = (C5692b) dVar.data;
        C4638d a = C4638d.m11114a();
        if (TextUtils.isEmpty(bVar.f14931c) || bVar.f14932d <= 0) {
            this.f14401b = -1;
            ((C5424a) mo8518c()).mo11334b(new Exception());
            return;
        }
        a.mo10418a(bVar.f14933e, bVar.f14932d);
        a.mo10417a(bVar.f14930b);
        a.f12662e = bVar.f14929a;
        a.mo10420b(bVar.f14933e, bVar.f14932d);
        a.f12664g = bVar.f14931c;
        a.f12666i = bVar.f14934f;
        int i = 1;
        if (this.f14402c.isLiveTypeAudio()) {
            i = 8;
        }
        ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).turnOnV1(this.f14402c.getId(), i).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5439bw(this), new C5440bx(this));
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (mo8518c() != null && message.what == 2) {
            if (!(message.obj instanceof Room) || !Room.isValid((Room) message.obj)) {
                m12236a(this.f14402c);
            } else {
                m12236a((Room) message.obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5424a aVar) {
        super.mo8520a(aVar);
        this.f14405f = new C8618a(this);
        ((C4002ac) C4495a.m10823a().mo10300a(C5199r.class).mo6525a((C2203w<T, ? extends R>) mo11752q())).mo9405a((C1710e<? super T>) new C5425bi<Object>(this));
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.CHIJI_NOTICE_MESSAGE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.BEGINNER_GUIDE_MESSAGE.getIntType(), this);
        }
        C5014i.m11508a().mo10889a((Handler) this.f14405f, this.f14406g, this.f14402c.getId(), 3, 2);
        if (this.f14406g && this.f14408i == C8710m.VIDEO) {
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).checkPermissionV1(this.f14402c.getId(), this.f14402c.getOwnerUserId(), 1).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5436bt(this), new C5438bv(this));
        }
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (mo8518c() != null) {
            int i = 3;
            if (iMessage2 instanceof C7829bd) {
                C7829bd bdVar = (C7829bd) iMessage2;
                int i2 = bdVar.f21563a;
                if (i2 != 1) {
                    if (i2 != 4) {
                        if (i2 == 104) {
                            if (this.f14406g) {
                                if (this.f14400a.f12612c == 0) {
                                    this.f14400a.f12612c = bdVar.f21572j;
                                    ((C5424a) mo8518c()).mo11341h();
                                    this.f14400a.f12612c = 0;
                                } else {
                                    ((C5424a) mo8518c()).mo11341h();
                                }
                            }
                            if (this.f14406g && this.f14400a.f12612c != 0) {
                                ((C5424a) mo8518c()).mo11340g();
                                this.f14400a.mo10412c();
                            }
                        } else if (i2 != 106) {
                            if (i2 != 205) {
                                switch (i2) {
                                    case 100:
                                        if (bdVar.f21582t != 2 && !this.f14406g) {
                                            ((C5424a) mo8518c()).mo11337d();
                                            break;
                                        }
                                    case BaseNotice.HASHTAG /*101*/:
                                        if (this.f14406g) {
                                            if (this.f15366s == null || this.f15366s.get("data_room") == null || ((Room) this.f15366s.get("data_room")).getMosaicStatus() != 1) {
                                                if (bdVar.f21582t == 2) {
                                                    if (this.f14400a.f12614e <= 0) {
                                                        if (bdVar.f21557A != this.f14400a.f12628s) {
                                                            i = 8;
                                                        }
                                                        i = 0;
                                                    }
                                                } else if (!this.f14400a.f12611b && this.f14400a.f12617h <= 0 && this.f14400a.f12614e <= 0) {
                                                    if (bdVar.f21575m == 1 && bdVar.f21573k == 4 && (bdVar.f21574l & 6) > 0) {
                                                        if (VERSION.SDK_INT < 21) {
                                                            i = 7;
                                                        }
                                                        i = 0;
                                                    }
                                                }
                                                i = 4;
                                            } else {
                                                i = 6;
                                            }
                                            if (i <= 0) {
                                                this.f14400a.f12622m = bdVar.f21574l;
                                                this.f14400a.f12612c = bdVar.f21572j;
                                                this.f14400a.f12614e = bdVar.f21577o;
                                                this.f14400a.f12619j = bdVar.f21580r;
                                                this.f14400a.f12627r = bdVar.f21582t;
                                                this.f14400a.f12620k = bdVar.f21576n;
                                                this.f14400a.f12615f = bdVar.f21586x;
                                                this.f14400a.f12616g = (long) bdVar.f21588z;
                                                this.f14400a.f12628s = bdVar.f21557A;
                                                this.f15366s.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, ""));
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("room_id", String.valueOf(bdVar.f21586x));
                                                ((C4002ac) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).fetchRoom(hashMap).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5448ce(this, bdVar), new C5449cf(this, bdVar));
                                                break;
                                            } else {
                                                ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).reply(bdVar.f21572j, this.f14402c.getId(), i, bdVar.f21577o).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5446cc(i, bdVar), new C5447cd(this));
                                                return;
                                            }
                                        }
                                        break;
                                    case 102:
                                        if (this.f14406g && this.f14400a.f12614e != 0) {
                                            this.f14400a.f12623n = bdVar.f21566d;
                                            this.f14400a.f12624o = bdVar.f21567e;
                                            this.f14400a.f12618i = true;
                                            if (bdVar.f21578p == 1 && LinkCrossRoomDataHolder.m11103a().f12614e != 0) {
                                                this.f14400a.f12625p = bdVar.f21558B;
                                            }
                                            ((C5424a) mo8518c()).mo11330a(bdVar.f21578p);
                                            break;
                                        }
                                }
                            } else {
                                if (!this.f14406g) {
                                    HashMap hashMap2 = new HashMap();
                                    C8056g gVar = new C8056g();
                                    if (this.f14400a.f12619j > 0 && this.f14400a.f12627r == 0) {
                                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                                    }
                                    hashMap2.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12633x) / 1000));
                                    C8049c.m15979a().mo14202a("connection_watch_duration", hashMap2, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), gVar, this.f14400a.mo10411b(), Room.class);
                                }
                                C7864ce a = C5006c.m11494a(this.f14402c.getId(), bdVar.f21584v);
                                a.baseMessage = bdVar.baseMessage;
                                if (this.f15367t != null) {
                                    this.f15367t.insertMessage(a, true);
                                }
                                if (bdVar.f21583u) {
                                    C4575an.m10981a((int) R.string.elg);
                                } else {
                                    C4575an.m10981a((int) R.string.ekt);
                                }
                            }
                        } else if (!this.f14400a.f12618i && this.f14400a.f12612c == bdVar.f21572j && this.f14406g && this.f14400a.f12627r == 2 && mo8518c() != null) {
                            ((C4002ac) ((LinkPKApi) C4157e.m10322a().mo9550a(LinkPKApi.class)).openBattle(this.f14400a.f12612c, this.f14400a.f12619j, this.f14400a.f12627r, this.f14400a.f12620k).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5452ci(this, SystemClock.uptimeMillis()), new C5427bk(this));
                        }
                    } else if (bdVar.f21582t != 2) {
                        ((C5424a) mo8518c()).mo11339f();
                    }
                    return;
                }
                C4638d.m11114a().mo10418a(bdVar.f21568f, bdVar.f21567e);
                ((C5424a) mo8518c()).mo11329a();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("room_id", this.f14402c.getIdStr());
                hashMap3.put("event", "LinkControlPresenter LinkMicMessageExtra.TYPE_TURN_ON");
                hashMap3.put("anchor_id", String.valueOf(this.f14402c.getOwnerUserId()));
                C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap3);
            } else if (iMessage2 instanceof C7825ba) {
                C7825ba baVar = (C7825ba) iMessage2;
                this.f14400a.f12613d = baVar.f21539a.f23833e;
                this.f14400a.f12621l = baVar.f21539a.f23832d;
                this.f14400a.f12619j = baVar.f21539a.f23830b;
                this.f14400a.f12620k = baVar.f21539a.f23831c;
                this.f14400a.f12612c = baVar.f21539a.f23829a;
                if (baVar.f21539a.f23832d == 0) {
                    C3831a.m9715c("ttlive_pk", C2942b.m8369a().mo34889b(baVar));
                }
                this.f15366s.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, ""));
                if (baVar.f21539a.f23834f == 2) {
                    this.f14400a.f12607B = baVar.f21539a.f23837i;
                    this.f14400a.f12627r = 2;
                    m12237b(this.f14400a.f12612c);
                    this.f15366s.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(3));
                    this.f14400a.f12633x = System.currentTimeMillis();
                    if (!this.f14406g) {
                        C8049c.m15979a().mo14203a("pk_transform", new C8059j().mo14214b("live_function").mo14213a("live_detail"), this.f14400a.mo10411b(), Room.class);
                    } else {
                        C8056g gVar2 = new C8056g();
                        if (this.f14402c.getId() == this.f14400a.f12612c) {
                            gVar2.mo14209b(this.f14402c.getOwner().getId()).mo14211c(this.f14400a.f12614e);
                        } else {
                            gVar2.mo14209b(this.f14400a.f12614e).mo14211c(this.f14402c.getOwner().getId());
                        }
                        gVar2.mo14207a(Boolean.valueOf(this.f14400a.f12634y));
                        this.f14400a.f12633x = System.currentTimeMillis();
                        C8049c.m15979a().mo14203a("connection_success", gVar2, LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                    }
                }
                if (!this.f14406g && this.f14400a.f12619j == 0) {
                    LinkCrossRoomDataHolder.m11103a().f12627r = (int) baVar.f21539a.f23834f;
                    C8049c.m15979a().mo14203a("connection_transform", new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), new C8056g(), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11317a(long j, Throwable th) throws Exception {
        m12235a(j);
        C5278al.m11940b(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11316a(long j, long j2, C4177d dVar) throws Exception {
        m12235a(j);
        C5278al.m11939b(SystemClock.uptimeMillis() - j2);
    }

    public C5423bh(Room room, boolean z, C8710m mVar) {
        this.f14402c = room;
        this.f14406g = z;
        this.f14408i = mVar;
        this.f14407h = C2942b.m8369a();
    }
}
