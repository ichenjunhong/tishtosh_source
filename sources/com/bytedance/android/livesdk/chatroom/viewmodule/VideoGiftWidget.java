package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p231a.C3848a;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.chatroom.p310f.C5212b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.gift.effect.video.VideoGiftView;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdk.message.C7789c;
import com.bytedance.android.livesdk.message.C7791e;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4566ag;
import com.bytedance.android.livesdk.p279af.C4566ag.C4567a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8069h;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8641c;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8642d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b.C36024b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoGiftWidget extends LiveRecyclableWidget implements C7789c {

    /* renamed from: i */
    private static final int f17634i = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.mo9431a()).intValue();

    /* renamed from: a */
    final C7211h f17635a = C7209f.m14962a("effects");

    /* renamed from: b */
    public Room f17636b;

    /* renamed from: c */
    public VideoGiftView f17637c;

    /* renamed from: d */
    public List<C7328a> f17638d;

    /* renamed from: e */
    public boolean f17639e;

    /* renamed from: f */
    public C6418a f17640f = new C6418a();

    /* renamed from: g */
    public C7328a f17641g;

    /* renamed from: h */
    public boolean f17642h = ((Boolean) LiveSettingKeys.LIVE_SDK_NEW_EFFECT_PLAYER.mo9431a()).booleanValue();

    /* renamed from: j */
    private C4566ag<C7328a> f17643j;

    /* renamed from: k */
    private long f17644k;

    /* renamed from: l */
    private long f17645l;

    /* renamed from: m */
    private C4567a f17646m = new C4567a<C7328a>() {
        /* renamed from: a */
        public final /* synthetic */ boolean mo10383a(Object obj, Object obj2) {
            C7328a aVar = (C7328a) obj;
            C7328a aVar2 = (C7328a) obj2;
            boolean z = false;
            if (aVar.f19958c == aVar2.f19958c) {
                if (VideoGiftWidget.this.f17638d.indexOf(aVar) <= VideoGiftWidget.this.f17638d.indexOf(aVar2)) {
                    return false;
                }
                z = true;
            } else if (aVar.f19958c < aVar2.f19958c) {
                return true;
            }
            return z;
        }
    };

    /* renamed from: n */
    private C8641c f17647n = new C8641c() {
        /* renamed from: b */
        public final void mo12557b() {
            if (VideoGiftWidget.this.f17637c != null) {
                VideoGiftWidget.this.f17637c.f20385a.mo14714c();
            }
            VideoGiftWidget.this.f17639e = false;
            m13851a(false, true);
            if (VideoGiftWidget.this.f17642h) {
                C7791e.m15852a().mo14134b();
            } else {
                VideoGiftWidget.this.mo12548a();
            }
            C3974b.m10061a().mo9379a(C3983a.ShowVideoGift.name(), C3982g.m10083a("isAnchor", String.valueOf(((Boolean) VideoGiftWidget.this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue())));
        }

        /* renamed from: a */
        public final void mo12555a() {
            if (VideoGiftWidget.this.f17637c != null) {
                VideoGiftWidget.this.f17637c.setVisibility(0);
                VideoGiftView videoGiftView = VideoGiftWidget.this.f17637c;
                if (videoGiftView.f20390f != null && videoGiftView.f20390f.f19968m) {
                    videoGiftView.f20385a.mo14713b();
                    videoGiftView.f20385a.mo14712a(0);
                }
                VideoGiftView videoGiftView2 = VideoGiftWidget.this.f17637c;
                if (videoGiftView2.f20391g != null) {
                    videoGiftView2.f20387c.setVisibility(0);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(videoGiftView2.f20387c, "alpha", new float[]{0.0f, 0.0f}).setDuration(videoGiftView2.f20391g.f21804d);
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(videoGiftView2.f20387c, "alpha", new float[]{0.0f, 1.0f}).setDuration(500);
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(videoGiftView2.f20387c, "alpha", new float[]{1.0f, 1.0f}).setDuration(videoGiftView2.f20391g.f21805e - 500);
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(videoGiftView2.f20387c, "alpha", new float[]{1.0f, 0.0f}).setDuration(500);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(new Animator[]{duration, duration2, duration3, duration4});
                    animatorSet.start();
                }
                m13851a(true, false);
                C3974b a = C3974b.m10061a();
                String name = C3983a.ShowVideoGift.name();
                C0176h lifecycle = VideoGiftWidget.this.getLifecycle();
                Context context = VideoGiftWidget.this.getContext();
                a.mo9382b(name, lifecycle, context);
                a.mo9375a(name, lifecycle, context);
            }
        }

        /* renamed from: a */
        private void m13851a(boolean z, boolean z2) {
            if (VideoGiftWidget.this.f17641g != null && VideoGiftWidget.this.f17641g.f19962g != null && VideoGiftWidget.this.f17641g.f19962g.getId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
                C5007d.INSTANCE.setBigGiftPlayStateEvent(z, z2, VideoGiftWidget.this.f17641g);
            }
        }

        /* renamed from: a */
        public final void mo12556a(float f, float f2, float f3, float f4) {
            if (VideoGiftWidget.this.f17637c != null) {
                VideoGiftView videoGiftView = VideoGiftWidget.this.f17637c;
                if (videoGiftView.f20391g != null) {
                    LayoutParams layoutParams = (LayoutParams) videoGiftView.f20387c.getLayoutParams();
                    layoutParams.width = (int) ((((float) videoGiftView.f20391g.f21808h) / 10000.0f) * f);
                    layoutParams.height = (int) ((((float) videoGiftView.f20391g.f21809i) / 10000.0f) * f2);
                    videoGiftView.f20387c.setLayoutParams(layoutParams);
                    videoGiftView.f20387c.setX(((((float) videoGiftView.f20391g.f21806f) / 10000.0f) * f) + f3);
                    videoGiftView.f20387c.setY(((((float) videoGiftView.f20391g.f21807g) / 10000.0f) * f2) + f4);
                    videoGiftView.f20388d.setTextSize(0, C9432q.m18687b(videoGiftView.getContext(), (float) (videoGiftView.f20391g.f21802b / 100)));
                    if (!C9431p.m18664a(videoGiftView.f20391g.f21813m)) {
                        try {
                            videoGiftView.f20388d.setShadowLayer((float) C3922z.m9899a((float) (videoGiftView.f20391g.f21812l / 100)), (float) C3922z.m9899a((float) (videoGiftView.f20391g.f21810j / 100)), (float) C3922z.m9899a((float) (videoGiftView.f20391g.f21811k / 100)), Color.parseColor(videoGiftView.f20391g.f21813m));
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    C8851g gVar = videoGiftView.f20391g.f21801a;
                    if (gVar != null) {
                        videoGiftView.f20388d.setText(((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(gVar.f24156b, gVar));
                    }
                    if (videoGiftView.f20391g.f21803c == null) {
                        videoGiftView.f20389e.setVisibility(8);
                    } else {
                        C3848a.m9760a(videoGiftView.getContext()).mo9223a(videoGiftView.f20391g.f21803c).mo9222a(ScaleType.FIT_XY).mo9227a(videoGiftView.f20389e);
                        videoGiftView.f20389e.setVisibility(0);
                    }
                }
            }
        }
    };

    /* renamed from: o */
    private C8642d f17648o = new C8642d() {
        /* renamed from: a */
        public final void mo12558a(boolean z, String str, int i, int i2, String str2) {
            if (!z && C36024b.class.getSimpleName().equals(str)) {
                C4525b.f12391bG.mo10346a(Boolean.valueOf(true));
            }
            C6418a aVar = VideoGiftWidget.this.f17640f;
            long j = -1;
            String str3 = "";
            if (aVar.f17655a != null) {
                j = aVar.f17655a.getId();
                if (aVar.f17655a.getResourceModel() != null && !C3914u.m9892a(aVar.f17655a.getResourceModel().f19591b)) {
                    str3 = (String) aVar.f17655a.getResourceModel().f19591b.get(0);
                }
            }
            new C8069h().mo14225a("gift_id", (Object) Long.valueOf(j)).mo14225a("gift_resource", (Object) str3).mo14225a("extra", (Object) Integer.valueOf(i2)).mo14225a("code", (Object) Integer.valueOf(i)).mo14225a("error_info", (Object) str2).mo14228a("hotsoon_live_video_gift_play_success_rate", z ^ true ? 1 : 0);
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "VIDEO_GIFT_PLAY_SUCCESS_RATE");
            hashMap.put("gift_id", Long.valueOf(j));
            hashMap.put("gift_resource", str3);
            hashMap.put("extra", Integer.valueOf(i2));
            hashMap.put("code", Integer.valueOf(i));
            hashMap.put("error_info", str2);
            C8064d.m16005b().mo9197a("ttlive_gift", (Map<String, ?>) hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("asset_id", Long.valueOf(j));
            hashMap2.put("url", str3);
            hashMap2.put("error_code", Integer.valueOf(i));
            hashMap2.put("error_msg", str2);
            hashMap2.put("asset_show_extra", Integer.valueOf(i2));
            hashMap2.put("gift_player_type", str);
            if (z) {
                C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_show_status"), 0, (Map<String, Object>) hashMap2);
                return;
            }
            C3837e.m9743a(C7647s.m15643a("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap2);
            C3837e.m9743a(C7647s.m15652b("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap2);
            C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_asset_show_status", 1, (Map) hashMap2);
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.VideoGiftWidget$a */
    class C6418a {

        /* renamed from: a */
        AssetsModel f17655a;

        private C6418a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo12559a(long j) {
            this.f17655a = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssets("effects", j);
        }
    }

    public int getLayoutId() {
        return R.layout.arb;
    }

    public void onInit(Object[] objArr) {
    }

    /* renamed from: b */
    public final void mo12553b() {
        this.f17638d.clear();
        this.f17643j.mo10381b();
    }

    public void onUnload() {
        this.f17635a.mo13425a();
        this.f17639e = false;
        this.f17644k = 0;
        this.f17645l = 0;
        if (this.f17642h) {
            C7791e.m15852a().mo14135b(this);
        }
    }

    /* renamed from: a */
    public final void mo12548a() {
        if (!this.f17638d.isEmpty() && !this.f17639e) {
            C7328a aVar = (C7328a) this.f17638d.remove(0);
            this.f17641g = aVar;
            this.f17643j.mo10382b(aVar);
            AssetsModel c = this.f17635a.mo13434c(aVar.f19957b);
            if (c == null) {
                m13838a("特效列表找不到该Id", String.valueOf(aVar.f19965j), String.valueOf(aVar.f19956a), null);
                if (this.f17642h) {
                    C7791e.m15852a().mo14134b();
                }
                return;
            }
            if (c.getResourceType() != 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("desc", "特效资源类型有误");
                hashMap.put("asset_type", Integer.valueOf(c.getResourceType()));
                hashMap.put("asset_id", Long.valueOf(aVar.f19957b));
                hashMap.put("gift_id", Long.valueOf(aVar.f19965j));
                hashMap.put("msg_id", Long.valueOf(aVar.f19956a));
                C8064d.m16005b().mo9201c("ttlive_gift", (Map<String, ?>) hashMap);
                if (this.f17642h) {
                    C7791e.m15852a().mo14134b();
                }
            } else if (!TextUtils.isEmpty(aVar.f19959d)) {
                this.f17639e = true;
                this.f17640f.mo12559a(aVar.f19957b);
                this.f17637c.mo13755a(aVar, this.f17636b.getOwner());
                m13838a("播放视频礼物", String.valueOf(aVar.f19965j), String.valueOf(aVar.f19956a), null);
            } else {
                m13838a("临时下载该特效失败", String.valueOf(aVar.f19965j), String.valueOf(aVar.f19956a), null);
                m13837a((int) R.string.euw);
                if (this.f17642h) {
                    C7791e.m15852a().mo14134b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m13837a(int i) {
        if (System.currentTimeMillis() - this.f17644k > 30000) {
            this.f17644k = System.currentTimeMillis();
            C4575an.m10981a((int) R.string.euw);
        }
    }

    /* renamed from: b */
    public final void mo12554b(C7328a aVar) {
        if (isViewValid() && aVar != null) {
            if (aVar.f19960e) {
                this.f17638d.add(0, aVar);
            } else {
                this.f17638d.add(aVar);
                this.f17643j.mo10380a(aVar);
            }
            if (!this.f17642h && this.f17638d.size() > f17634i) {
                C7328a aVar2 = (C7328a) this.f17643j.mo10379a();
                if (aVar2 != null) {
                    this.f17638d.remove(aVar2);
                }
            }
            mo12548a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12549a(C4632d dVar) {
        if (dVar == C4632d.PK || dVar == C4632d.PENAL) {
            this.f17637c.mo13756a(true);
        } else {
            this.f17637c.mo13756a(false);
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17636b = (Room) this.dataCenter.get("data_room");
        this.f17638d = new ArrayList();
        this.f17643j = new C4566ag<>(f17634i + 1, this.f17646m);
        this.f17637c = (VideoGiftView) this.contentView;
        this.f17637c.setPortrait(((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue());
        VideoGiftView videoGiftView = this.f17637c;
        Context context = this.context;
        C8641c cVar = this.f17647n;
        C8642d dVar = this.f17648o;
        videoGiftView.f20392h = ((IGiftService) C4116c.m10249a(IGiftService.class)).giftPlayControllerManager().mo13793a(context.hashCode());
        if (videoGiftView.f20392h != null) {
            videoGiftView.f20392h.mo13781a(cVar);
            videoGiftView.f20392h.mo13782a(dVar);
            View a = videoGiftView.f20392h.mo13778a();
            if (a != null) {
                ViewGroup viewGroup = (ViewGroup) a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(a);
                }
            }
            videoGiftView.f20392h.mo13780a((ViewGroup) videoGiftView.f20386b);
        }
        this.f17637c.setUserEventListener(new C4129g() {
            /* renamed from: a */
            public final void mo9499a(long j) {
                if (j != 0 && VideoGiftWidget.this.dataCenter != null && (VideoGiftWidget.this.f17636b == null || !VideoGiftWidget.this.f17636b.isKoiRoom())) {
                    if (VideoGiftWidget.this.f17636b == null || !VideoGiftWidget.this.f17636b.isStar()) {
                        VideoGiftWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
                    }
                }
            }
        });
        mo12549a(((C4133a) C4116c.m10249a(C4133a.class)).getCurrentPkState());
        if (this.f17642h) {
            C7791e.m15852a().mo14133a((C7789c) this);
        }
    }

    /* renamed from: a */
    public final void mo12550a(C7810ao aoVar) {
        if (isViewValid()) {
            C7505d findGiftById = GiftManager.inst().findGiftById(aoVar.f21494c);
            if (findGiftById != null) {
                if ((findGiftById.f20544e != 2 && findGiftById.f20544e != 8) || aoVar.f21498g == 1) {
                    return;
                }
                if (this.f17642h) {
                    C7791e.m15852a().mo14132a((C7776b) aoVar);
                    return;
                }
                mo12551a(C7519o.m15510a(aoVar, this.f17636b.getOwner()));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12551a(final C7328a aVar) {
        if (aVar == null) {
            return false;
        }
        C64153 r1 = new C7214j() {
            /* renamed from: a */
            public final void mo8667a(long j) {
                VideoGiftWidget.m13838a("特效资源下载任务被取消", String.valueOf(aVar.f19965j), String.valueOf(aVar.f19956a), String.valueOf(aVar.f19957b));
                if (VideoGiftWidget.this.f17642h) {
                    C7791e.m15852a().mo14134b();
                }
            }

            /* renamed from: a */
            public final void mo8669a(Throwable th) {
                VideoGiftWidget.m13838a("获取特效资源本地路径失败", String.valueOf(aVar.f19965j), String.valueOf(aVar.f19956a), String.valueOf(aVar.f19957b));
                aVar.mo13582a("");
                VideoGiftWidget.this.mo12554b(aVar);
            }

            /* renamed from: a */
            public final void mo8668a(long j, String str) {
                aVar.mo13582a(str);
                VideoGiftWidget.this.mo12554b(aVar);
            }
        };
        if (this.f17642h && C5212b.m11810a(this.f17635a.mo13434c(aVar.f19957b), 4) == null) {
            return false;
        }
        this.f17635a.mo13428a(aVar.f19957b, r1, 4);
        return true;
    }

    /* renamed from: a */
    public final boolean mo12552a(C7776b bVar) {
        if (bVar instanceof C7810ao) {
            return mo12551a(C7519o.m15510a((C7810ao) bVar, this.f17636b.getOwner()));
        }
        if (bVar instanceof C7793a) {
            return mo12551a(C7519o.m15509a((C7793a) bVar));
        }
        return false;
    }

    /* renamed from: a */
    public static void m13838a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("asset_id", str4);
        }
        C8064d.m16005b().mo9201c("ttlive_gift", (Map<String, ?>) hashMap);
    }
}
