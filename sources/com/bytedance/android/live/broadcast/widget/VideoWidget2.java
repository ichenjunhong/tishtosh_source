package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.broadcast.api.C3031a.C3032a;
import com.bytedance.android.live.broadcast.api.C3031a.C3033b;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.model.C3057c;
import com.bytedance.android.live.broadcast.api.model.C3059e;
import com.bytedance.android.live.broadcast.api.p195b.C3039b;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3040c.C3041a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c.C3042b;
import com.bytedance.android.live.broadcast.api.p195b.C3046e.C3047a;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.dutygift.C3184m;
import com.bytedance.android.live.broadcast.dutygift.C3185n;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.C3253g;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.C3381w;
import com.bytedance.android.live.broadcast.effect.LiveBroadcastGameControlWidget.C3196a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C3283b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.C3288g;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3300a;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3306e;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3344m;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2.C3310a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.C3402a;
import com.bytedance.android.live.broadcast.p213h.C3402a.C3409f;
import com.bytedance.android.live.broadcast.p213h.C3402a.C3410g;
import com.bytedance.android.live.broadcast.p213h.p214a.C3413a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3419b;
import com.bytedance.android.live.broadcast.p213h.p214a.C3420c.C3421a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3417d;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3627b;
import com.bytedance.android.live.broadcast.utils.StickerImageUploader.C3628c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3868af;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p232b.C3882b;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.gift.C4121b;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4194m;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4630b;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.event.C5154aa;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6433c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8053d;
import com.bytedance.android.livesdk.p399o.p402c.C8054e;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8806j;
import com.bytedance.android.livesdkapi.p458l.C8841c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import com.p683ss.avframework.opengl.GlUtil;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

public class VideoWidget2 extends CaptureWidget2 implements C0199s<KVData>, C3185n, C3196a, C3252a, C3283b, C3443a, C3772g, C5281ao, C9382a {

    /* renamed from: e */
    public static final String f10550e = "VideoWidget2";

    /* renamed from: A */
    public boolean f10551A;

    /* renamed from: B */
    public boolean f10552B = false;

    /* renamed from: C */
    C3381w f10553C;

    /* renamed from: D */
    public long f10554D;

    /* renamed from: E */
    public long f10555E;

    /* renamed from: F */
    C3039b f10556F = new C3039b() {
        /* renamed from: a */
        public final int mo8253a() {
            VideoWidget2.this.f10570i.mo8787a();
            return 1;
        }

        /* renamed from: a */
        public final int mo8256a(boolean z) {
            VideoWidget2.this.f10570i.mo8791a(z);
            return 1;
        }

        /* renamed from: a */
        public final int mo8257a(String[] strArr) {
            VideoWidget2.this.f10570i.mo8792a(strArr);
            return 1;
        }

        /* renamed from: a */
        public final int mo8255a(String str, boolean z) {
            try {
                VideoWidget2.this.f10570i.mo8790a(str, z);
                return 1;
            } catch (FileNotFoundException e) {
                C3831a.m9714b(VideoWidget2.f10550e, (Throwable) e);
                return -1;
            }
        }

        /* renamed from: a */
        public final int mo8258a(String[] strArr, String[] strArr2) {
            VideoWidget2.this.f10570i.mo8793a(strArr, strArr2);
            return 1;
        }

        /* renamed from: a */
        public final int mo8254a(String str, String str2, float f) {
            try {
                VideoWidget2.this.f10570i.mo8788a(str, str2, f);
                return 1;
            } catch (FileNotFoundException e) {
                C3831a.m9714b(VideoWidget2.f10550e, (Throwable) e);
                return -1;
            }
        }
    };

    /* renamed from: G */
    C3042b f10557G = new C3042b() {
        /* renamed from: a */
        public final void mo8278a(boolean z, String str, C8688c cVar) {
            if (C3037b.f8913a.equals(str) && z && cVar != null) {
                C8049c.m15979a().mo14203a("live_take_gesture_select", new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"), new C8060k(), new C8053d().mo14204a(cVar.f23744e), Room.class);
            }
            if (C9431p.m18664a(str) || "beauty".equals(str) || C3037b.f8916d.equals(str) || C3037b.f8914b.equals(str)) {
                C3395f.m9156f().mo8744e().mo8218a(VideoWidget2.this.f10575n.getId());
            }
            Map a = C3395f.m9156f().mo8740a().mo8261a();
            if (!a.containsKey(C3037b.f8914b) || ((Map) a.get(C3037b.f8914b)).size() <= 0) {
                VideoWidget2.this.f10577p = false;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new C3059e(C3037b.f8914b, new C8688c()));
                VideoWidget2.this.f10576o.removeMessages(BaseNotice.HASHTAG);
                if (VideoWidget2.this.f10571j != null) {
                    VideoWidget2.this.f10571j.mo8245a(false);
                }
            } else {
                VideoWidget2.this.f10577p = true;
                VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_is_selected", new C3059e(C3037b.f8914b, (C8688c) ((Map) a.get(C3037b.f8914b)).values().iterator().next()));
            }
            if (!C3037b.f8913a.equals(str)) {
                return;
            }
            if (VideoWidget2.this.f10573l == null || !VideoWidget2.this.f10573l.isShowing()) {
                VideoWidget2.this.mo9108i();
            }
        }
    };

    /* renamed from: H */
    C3041a f10558H = new C3041a() {
        /* renamed from: a */
        public final void mo8277a(String str, C8688c cVar, String str2, float f) {
            if (C9431p.m18664a(str) || "beauty".equals(str) || C3037b.f8916d.equals(str) || C3037b.f8914b.equals(str)) {
                C3395f.m9156f().mo8744e().mo8218a(VideoWidget2.this.f10575n.getId());
            }
            if (!VideoWidget2.this.f10581t.contains(str2)) {
                if (VideoWidget2.this.f10580s.containsKey(str2)) {
                    if (f == 0.0f) {
                        VideoWidget2.this.f10576o.removeCallbacks((Runnable) VideoWidget2.this.f10580s.remove(str2));
                    }
                } else if (f != 0.0f) {
                    C3759aq aqVar = new C3759aq(this, str2);
                    VideoWidget2.this.f10580s.put(str2, aqVar);
                    VideoWidget2.this.f10576o.postDelayed(aqVar, 30000);
                }
            }
        }
    };

    /* renamed from: I */
    private C3288g f10559I;

    /* renamed from: J */
    private C3033b f10560J;

    /* renamed from: K */
    private C8725y f10561K;

    /* renamed from: L */
    private OnRefreshFaceDataListener f10562L;

    /* renamed from: M */
    private LinkCrossRoomDataHolder f10563M;

    /* renamed from: N */
    private String f10564N = null;

    /* renamed from: O */
    private C3402a f10565O;

    /* renamed from: P */
    private C3421a f10566P;

    /* renamed from: f */
    public C3413a f10567f;

    /* renamed from: g */
    C3261l f10568g;

    /* renamed from: h */
    C3197a f10569h;

    /* renamed from: i */
    public C3417d f10570i;

    /* renamed from: j */
    public C3032a f10571j;

    /* renamed from: k */
    public Dialog f10572k;

    /* renamed from: l */
    public C3300a f10573l;

    /* renamed from: m */
    public boolean f10574m;

    /* renamed from: n */
    public Room f10575n;

    /* renamed from: o */
    public C9381g f10576o = new C9381g(this);

    /* renamed from: p */
    public volatile boolean f10577p;

    /* renamed from: q */
    public long f10578q;

    /* renamed from: r */
    public List<Long> f10579r = new ArrayList();

    /* renamed from: s */
    public Map<String, Runnable> f10580s = new HashMap();

    /* renamed from: t */
    public List<String> f10581t = new ArrayList();

    /* renamed from: u */
    public C1690c f10582u;

    /* renamed from: v */
    public C3739c f10583v = new C3739c();

    /* renamed from: w */
    public boolean f10584w = false;

    /* renamed from: x */
    public boolean f10585x = false;

    /* renamed from: y */
    public FrameLayout f10586y;

    /* renamed from: z */
    public C0654k f10587z;

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$a */
    class C3736a implements C6601a {

        /* renamed from: b */
        private View f10598b;

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3736a() {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
            int i;
            if ((aVar instanceof C6433c) && this.f10598b != null) {
                View view = this.f10598b;
                if (((C6433c) aVar).f17714a) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            if (VideoWidget2.this.f10573l == null) {
                if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo9431a()).booleanValue()) {
                    VideoWidget2.this.f10573l = C3310a.m9044a(VideoWidget2.this.dataCenter);
                } else {
                    VideoWidget2.this.f10573l = new C3306e(VideoWidget2.this.context, C3395f.m9156f().mo8741b().mo8551a(), VideoWidget2.this.dataCenter);
                }
                VideoWidget2.this.f10573l.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str;
                        C8049c a = C8049c.m15979a();
                        String str2 = "gesture_switch";
                        Object[] objArr = new Object[4];
                        objArr[0] = new C8059j().mo14213a("live_take_detail").mo14214b("live_take");
                        if (((Boolean) C4525b.f12373ap.mo10345a()).booleanValue()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        objArr[1] = new C8054e(str);
                        objArr[2] = new C8060k();
                        objArr[3] = Room.class;
                        a.mo14203a(str2, objArr);
                        VideoWidget2.this.mo9108i();
                    }
                });
            }
            if (!VideoWidget2.this.f10573l.isShowing()) {
                VideoWidget2.this.f10573l.show(VideoWidget2.this.f10587z, C3306e.class.getSimpleName());
                if (VideoWidget2.this.f10582u != null && !VideoWidget2.this.f10582u.isDisposed()) {
                    VideoWidget2.this.f10582u.dispose();
                }
                C8049c.m15979a().mo14203a("anchor_more_function_click_gesture", new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), new C8060k(), Room.class);
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f10598b = view.findViewById(R.id.cam);
            if (((Boolean) C4525b.f12370am.mo10345a()).booleanValue() && !((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo9431a()).booleanValue()) {
                this.f10598b.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$b */
    class C3738b implements C6601a {

        /* renamed from: b */
        private boolean f10601b;

        /* renamed from: c */
        private long f10602c;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3738b() {
        }

        public final void onClick(View view) {
            if (C3882b.m9818b()) {
                C4204a.m10421a(C3922z.m9915e(), (int) R.string.eb_);
            }
            if (this.f10602c == 0) {
                this.f10602c = SystemClock.elapsedRealtime();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime >= this.f10602c + 1500) {
                    this.f10602c = elapsedRealtime;
                } else {
                    return;
                }
            }
            this.f10601b = !this.f10601b;
            if (VideoWidget2.this.f10574m) {
                VideoWidget2.this.f10567f.mo8764c();
            }
            VideoWidget2.this.f10567f.mo8762b();
            C3739c cVar = VideoWidget2.this.f10583v;
            boolean z = this.f10601b;
            if (cVar.f10603a != null) {
                cVar.f10604b = z;
                if (!cVar.f10604b) {
                    VideoWidget2.this.f10574m = false;
                }
                cVar.mo9119a(true);
            }
            C4525b.f12433g.mo10348b(Integer.valueOf(this.f10601b ? 1 : 0));
            C8068g.m16014a(VideoWidget2.this.getContext());
            C8049c.m15979a().mo14203a("pm_live_switch_camera_click", new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"), new C8060k());
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            boolean z = true;
            if (((Integer) C4525b.f12433g.mo10347b()).intValue() != 1) {
                z = false;
            }
            this.f10601b = z;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$c */
    class C3739c implements C6601a {

        /* renamed from: a */
        View f10603a;

        /* renamed from: b */
        boolean f10604b;

        /* renamed from: d */
        private View f10606d;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        private C3739c() {
        }

        /* renamed from: a */
        private void m9584a(View... viewArr) {
            float f;
            for (int i = 0; i <= 0; i++) {
                View view = viewArr[0];
                String str = "alpha";
                float[] fArr = new float[2];
                float f2 = 1.0f;
                if (this.f10604b) {
                    f = 0.4f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (!this.f10604b) {
                    f2 = 0.4f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                ofFloat.setDuration(100);
                ofFloat.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9119a(boolean z) {
            if (this.f10603a != null) {
                boolean z2 = VideoWidget2.this.f10551A;
                int i = R.drawable.c4v;
                if (z2 && !this.f10604b) {
                    this.f10606d.setBackgroundResource(R.drawable.c4v);
                }
                View view = this.f10606d;
                if (!VideoWidget2.this.f10574m) {
                    i = R.drawable.c4w;
                }
                view.setBackgroundResource(i);
                if (z) {
                    m9584a(this.f10606d);
                }
            }
        }

        public final void onClick(View view) {
            String str;
            if (this.f10604b) {
                VideoWidget2.this.f10574m = !VideoWidget2.this.f10574m;
                VideoWidget2.this.f10567f.mo8764c();
                Context context = VideoWidget2.this.context;
                if (VideoWidget2.this.f10574m) {
                    str = VideoWidget2.this.context.getResources().getString(R.string.es3);
                } else {
                    str = VideoWidget2.this.context.getResources().getString(R.string.es4);
                }
                C4204a.m10423a(context, str);
                C8068g.m16014a(VideoWidget2.this.context);
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                VideoWidget2.this.f10575n.getId();
                C8049c.m15979a().mo14203a("pm_live_mirror_click", new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"), new C8060k());
                mo9119a(false);
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            this.f10603a = null;
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            boolean z;
            this.f10603a = view;
            this.f10606d = this.f10603a.findViewById(R.id.aqa);
            if (((Integer) C4525b.f12433g.mo10347b()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f10604b = z;
            if (!this.f10604b) {
                VideoWidget2.this.f10574m = false;
                mo9119a(true);
            } else {
                mo9119a(false);
            }
            if (VideoWidget2.this.f10551A && !z && this.f10606d != null) {
                this.f10606d.setBackgroundResource(R.drawable.c4v);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.VideoWidget2$d */
    class C3740d implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3740d() {
        }

        public final void onClick(View view) {
            C4194m hostStickerViewService = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).hostStickerViewService();
            if (hostStickerViewService != null) {
                hostStickerViewService.mo9643a((AppCompatActivity) VideoWidget2.this.getContext(), VideoWidget2.this.f10587z, "livestreaming", VideoWidget2.this.f10586y, new C8806j() {
                    /* renamed from: b */
                    public final void mo9124b(C8688c cVar) {
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", "");
                        C3395f.m9156f().mo8740a().mo8273b(C3037b.f8914b);
                        if (VideoWidget2.this.f10554D > 0) {
                            VideoWidget2.this.mo9109j();
                        }
                        VideoWidget2.this.f10554D = 0;
                    }

                    /* renamed from: a */
                    public final void mo9123a(C8688c cVar) {
                        VideoWidget2.this.dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", cVar.f23762w);
                        C3395f.m9156f().mo8740a().mo8273b(C3037b.f8914b);
                        C3395f.m9156f().mo8740a().mo8268a(C3037b.f8914b, cVar);
                        if (VideoWidget2.this.f10554D > 0) {
                            VideoWidget2.this.mo9109j();
                        }
                        VideoWidget2.this.f10554D = cVar.f23744e;
                        VideoWidget2.this.f10555E = SystemClock.elapsedRealtime();
                    }

                    /* renamed from: a */
                    public final int mo9122a(String str, String str2) {
                        long j;
                        int customEffect = VideoWidget2.this.f10383b.mo8308g().setCustomEffect(str, str2);
                        if (VideoWidget2.this.f10575n != null) {
                            j = VideoWidget2.this.f10575n.getId();
                        } else {
                            j = 0;
                        }
                        long j2 = j;
                        long b = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                        StickerImageUploader a = StickerImageUploader.m9458a();
                        C3628c cVar = new C3628c(str, str2, j2, b);
                        C3627b<C3628c> bVar = a.f10331d;
                        if (bVar.f10333a.indexOf(cVar) != -1) {
                            bVar.f10333a.remove(cVar);
                        }
                        if (bVar.f10334b <= bVar.f10333a.size()) {
                            bVar.f10333a.remove(bVar.f10334b - 1);
                        }
                        boolean z = false;
                        bVar.f10333a.add(0, cVar);
                        if (a.f10331d.f10333a.size() == 0) {
                            z = true;
                        }
                        if (!z) {
                            a.mo9004b();
                        }
                        return customEffect;
                    }
                });
            } else {
                if (VideoWidget2.this.f10572k == null) {
                    VideoWidget2.this.f10572k = new C3344m(VideoWidget2.this.context, VideoWidget2.this.dataCenter, C3395f.m9156f().mo8741b().mo8551a());
                    VideoWidget2.this.f10572k.setOnDismissListener(C3760ar.f10629a);
                }
                if (!VideoWidget2.this.f10572k.isShowing()) {
                    VideoWidget2.this.f10572k.show();
                } else {
                    return;
                }
            }
            C8049c.m15979a().mo14202a("pm_live_sticker_click", VideoWidget2.this.mo9100a(new HashMap<>()), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"), new C8060k());
        }
    }

    /* renamed from: g */
    public final C3261l mo9106g() {
        return this.f10568g;
    }

    /* renamed from: h */
    public final C3197a mo9107h() {
        return this.f10569h;
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final void mo9103a(boolean z) {
        String d = this.f10568g.mo8596d();
        if (this.f10560J != null) {
            this.f10560J.mo8246a(d, z);
        }
    }

    /* renamed from: a */
    public final void mo8527a(String str, String str2, boolean z) {
        this.f10570i.mo8789a(str, str2, false);
    }

    /* renamed from: a */
    public final C3277a mo8524a() {
        return C3395f.m9156f().mo8741b().mo8551a();
    }

    /* renamed from: b */
    public final void mo8536b() {
        if (this.f10567f != null) {
            this.f10567f.mo8766e();
        }
    }

    /* renamed from: f */
    public final void mo9105f() {
        if (this.f10559I != null) {
            this.f10559I.mo8662c();
        }
    }

    public void onResume() {
        super.onResume();
        this.f10559I.mo8662c();
    }

    /* renamed from: c */
    public final void mo8537c() {
        if (this.f10567f != null) {
            this.f10567f.mo8765d();
        }
    }

    /* renamed from: d */
    public final void mo8652d() {
        if (this.f10563M.f12609D == C4630b.SHOW) {
            this.f10563M.f12609D = C4630b.HIDE;
        }
        C3395f.m9156f().mo8740a().mo8273b("effect_gift");
    }

    /* renamed from: i */
    public final void mo9108i() {
        if (this.f10582u != null && !this.f10582u.isDisposed()) {
            this.f10582u.dispose();
        }
        this.f10582u = C2201v.m6592a(30, TimeUnit.SECONDS).mo6529b(C2168a.m6521b()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C1710e<Long>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Long l = (Long) obj;
                VideoWidget2.this.f10584w = true;
                for (C8688c cVar : C3395f.m9156f().mo8740a().mo8260a(C3037b.f8913a)) {
                    if (!VideoWidget2.this.f10579r.contains(Long.valueOf(cVar.f23744e))) {
                        VideoWidget2.this.f10579r.add(Long.valueOf(cVar.f23744e));
                        C8049c.m15979a().mo14203a("live_take_gesture_effective_use", new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_detail"), new C8060k(), new C8053d().mo14204a(cVar.f23744e), Room.class);
                    }
                }
            }
        }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
            public final /* bridge */ /* synthetic */ void accept(Object obj) throws Exception {
            }
        });
    }

    /* renamed from: j */
    public final void mo9109j() {
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_id", String.valueOf(this.f10554D));
        hashMap.put("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.f10555E) / 1000));
        C8049c.m15979a().mo14202a("live_sticker_use_time", mo9100a(hashMap), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"), Room.class);
    }

    /* renamed from: e */
    public final void mo9029e() {
        String str;
        String str2;
        super.mo9029e();
        if (this.f10582u != null && !this.f10582u.isDisposed()) {
            this.f10582u.dispose();
        }
        for (Runnable removeCallbacks : this.f10580s.values()) {
            this.f10576o.removeCallbacks(removeCallbacks);
        }
        HashMap hashMap = new HashMap();
        String str3 = "use_status";
        if (this.f10584w) {
            str = "use";
        } else {
            str = "unused";
        }
        hashMap.put(str3, str);
        C8049c.m15979a().mo14202a("pm_live_gesture_use", hashMap, new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_detail"), new C8060k(), Room.class);
        HashMap hashMap2 = new HashMap();
        String str4 = "use_status";
        if (this.f10585x) {
            str2 = "use";
        } else {
            str2 = "unused";
        }
        hashMap2.put(str4, str2);
        C8049c.m15979a().mo14202a("livesdk_live_beauty_use", hashMap2, new C8059j().mo14213a("anchor_live_ending"), Room.class);
        C3395f.m9156f().mo8741b().mo8555d();
        C3395f.m9156f().mo8744e().mo8220b();
        C3395f.m9156f().mo8740a().mo8272b(this.f10557G);
        C3395f.m9156f().mo8740a().mo8271b(this.f10558H);
        this.f10576o.post(C3756an.f10624a);
        if (this.f10572k != null) {
            C3761as.m9597a(this.f10572k);
            this.f10572k = null;
        }
        if (this.f10573l != null) {
            this.f10573l.dismiss();
            this.f10573l = null;
        }
        mo9109j();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f10563M.removeObserver(this);
        C4525b.f12377at.mo10346a(Integer.valueOf(0));
        this.f10567f.mo8757a();
        this.f10567f.mo8763b(this.f10562L);
        this.f10567f.f9725b = null;
        if (this.f10568g != null) {
            this.f10568g.mo8597e();
        }
        this.f10559I.f9476b.removeCallbacksAndMessages(null);
        ((IGiftService) C4116c.m10249a(IGiftService.class)).removeAnimationEngine(C4121b.STICKER_GIFT);
        GlUtil.nativeDetachThreadToOpenGl();
        this.f10576o.removeCallbacksAndMessages(null);
        if (this.f10565O != null) {
            C3402a aVar = this.f10565O;
            C3831a.m9707a("CaptureVideoUploadController", "stop");
            if (!aVar.mo8755c().isDisposed()) {
                aVar.mo8755c().dispose();
            }
            try {
                new File(aVar.mo8752a()).delete();
                new File(aVar.mo8754b()).delete();
            } catch (Throwable th) {
                C3831a.m9714b("CaptureVideoUploadController", th);
            }
            this.f10565O = null;
        }
        StickerImageUploader a = StickerImageUploader.m9458a();
        if (a.f10329b != null && !a.f10329b.isDisposed()) {
            a.f10329b.dispose();
        }
        if (a.f10328a != null && !a.f10328a.isDisposed()) {
            a.f10328a.dispose();
        }
        a.f10331d.f10333a.clear();
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        m9538a(C3057c.class);
        m9538a(C5204w.class);
        m9538a(C5154aa.class);
        this.f10575n = (Room) this.dataCenter.get("data_room");
        this.f10551A = false;
        this.f10567f = new C3419b(this.f10398d, this.f10383b);
        this.f10567f.mo8760a(this.f10397c);
        this.f10562L = new OnRefreshFaceDataListener() {
            public final void onRefreshFaceData(int i) {
                if (VideoWidget2.this.f10577p && System.currentTimeMillis() - VideoWidget2.this.f10578q > 100) {
                    VideoWidget2.this.f10578q = System.currentTimeMillis();
                    VideoWidget2.this.f10576o.removeMessages(BaseNotice.HASHTAG);
                    Message obtain = Message.obtain();
                    obtain.what = BaseNotice.HASHTAG;
                    obtain.obj = Integer.valueOf(i);
                    VideoWidget2.this.f10576o.sendMessage(obtain);
                }
            }
        };
        this.f10567f.mo8761a(this.f10562L);
        this.f10566P = new C3421a() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo9114a() {
                VideoWidget2 videoWidget2 = VideoWidget2.this;
                videoWidget2.f10552B = true;
                if (videoWidget2.f10570i == null) {
                    videoWidget2.f10570i = new C3417d();
                    videoWidget2.f10567f.mo8758a((C3414a) videoWidget2.f10570i);
                }
                C3417d dVar = videoWidget2.f10570i;
                int intValue = ((Integer) LiveConfigSettingKeys.LIVE_USER_NEW_COMPOSER_MODEL.mo9431a()).intValue();
                if (intValue < 0) {
                    StringBuilder sb = new StringBuilder("mode is ");
                    sb.append(intValue);
                    sb.append("order type is 0");
                    throw new IllegalStateException(sb.toString());
                } else if (dVar.f9727a != null) {
                    dVar.f9727a.mo8770a(intValue, 0);
                    C3395f.m9156f().mo8740a().mo8263a(videoWidget2.f10557G);
                    C3395f.m9156f().mo8740a().mo8262a(videoWidget2.f10558H);
                    C3395f.m9156f().mo8740a().mo8264a(new C3047a().mo8289a(Arrays.asList(new String[]{C3037b.f8913a, C3037b.f8916d, "beauty"})).mo8291b(Collections.singletonList("effect_gift")).mo8288a(videoWidget2.f10556F).mo8290a());
                    C3395f.m9156f().mo8741b().mo8551a().mo8647a(C3037b.f8913a);
                    C3395f.m9156f().mo8741b().mo8551a().mo8647a(C3037b.f8914b);
                    if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                        C3395f.m9156f().mo8741b().mo8553b().mo8734a((FragmentActivity) videoWidget2.context);
                        C3395f.m9156f().mo8741b().mo8551a().mo8647a(C3037b.f8916d);
                    } else if (videoWidget2.f10569h == null) {
                        videoWidget2.f10569h = new C3253g();
                    }
                    if (videoWidget2.f10568g == null) {
                        videoWidget2.f10568g = C3395f.m9156f().mo8741b().mo8554c();
                        videoWidget2.f10568g.mo8589a(videoWidget2.f10567f);
                        if (videoWidget2.f10568g.mo8593b() > 0) {
                            if (videoWidget2.f10568g.mo8593b() != 0) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("filter_id", String.valueOf(videoWidget2.f10568g.mo8593b()));
                                C8049c.m15979a().mo14202a("live_take_filter_select", videoWidget2.mo9100a(hashMap), new C8059j().mo14214b("live_take").mo14213a("live_take_detail").mo14219g("click").mo14218f("click"));
                            }
                            videoWidget2.mo9104b(false);
                        }
                    }
                    videoWidget2.f10553C = new C3381w(videoWidget2.f10567f);
                } else {
                    throw new IllegalStateException("Effect is not bind");
                }
            }

            /* renamed from: b */
            public final void mo8799b(int i, int i2, String str) {
                if (!VideoWidget2.this.f10552B) {
                    VideoWidget2.this.f10576o.post(new C3758ap(this));
                }
            }

            /* renamed from: a */
            public final void mo8798a(int i, int i2, String str) {
                String str2 = VideoWidget2.f10550e;
                StringBuilder sb = new StringBuilder("CameraState onError status: ");
                sb.append(i);
                sb.append(", ret: ");
                sb.append(i2);
                sb.append(", msg: ");
                sb.append(null);
                C3831a.m9716d(str2, sb.toString());
            }
        };
        this.f10567f.mo8759a((C3421a) C8841c.m17358a(this.f10566P));
        if (C3882b.m9818b() && C3882b.m9816a() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.contentView.getLayoutParams();
            layoutParams.width = (int) (((float) C3922z.m9908b()) * 0.5625f);
            layoutParams.gravity = 17;
        }
        int intValue = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo9431a()).intValue();
        if (intValue <= 0) {
            z = this.f10561K.f23979i;
        } else if (intValue == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f10565O = new C3402a(this.f10383b, this.f10561K.mo15391b(), this.f10561K.mo15390a(), z);
        C3402a aVar = this.f10565O;
        C4097p<Float> pVar = LiveConfigSettingKeys.LIVE_CAPTURE_VIDEO_RECORD_DURATION;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LI…URE_VIDEO_RECORD_DURATION");
        if (((Number) pVar.mo9431a()).floatValue() <= 0.0f) {
            C4526c<Long> cVar = C4525b.f12452z;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.LIV…M_VIDEO_CAPTURE_LAST_TIME");
            cVar.mo10346a(Long.valueOf(0));
        } else {
            C4526c<Long> cVar2 = C4525b.f12452z;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.LIV…M_VIDEO_CAPTURE_LAST_TIME");
            Object a = cVar2.mo10345a();
            C52711k.m112236a(a, "LivePluginProperties.LIV…O_CAPTURE_LAST_TIME.value");
            if (!C3868af.f10888a.format(new Date(((Number) a).longValue())).equals(C3868af.f10888a.format(new Date()))) {
                aVar.f9706b = 0;
                aVar.mo8755c().mo6181a(C2201v.m6614b(Integer.valueOf(1)).mo6539d(60, TimeUnit.SECONDS).mo6505a((C1710e<? super T>) new C3409f<Object>(aVar), (C1710e<? super Throwable>) C3410g.f9720a));
            }
        }
        this.f10559I = new C3288g(this);
        this.dataCenter.lambda$put$1$DataCenter("data_sticker_message_manager", this.f10559I);
        this.f10563M = LinkCrossRoomDataHolder.m11103a();
        this.f10563M.observe("data_pk_state", this);
        C6600d b = C6610k.m13986b();
        b.mo12668a(C6605h.GESTURE_MAGIC, (C6601a) new C3736a());
        b.mo12668a(C6605h.STICKER, (C6601a) new C3740d());
        b.mo12668a(C6605h.REVERSE_CAMERA, (C6601a) new C3738b());
        b.mo12668a(C6605h.REVERSE_MIRROR, (C6601a) this.f10583v);
    }

    /* renamed from: a */
    public final void mo9101a(C3032a aVar) {
        this.f10571j = aVar;
    }

    /* renamed from: b */
    public final void mo8528b(C3184m mVar) {
        m9539c(mVar);
    }

    /* renamed from: c */
    private void m9539c(C3184m mVar) {
        this.f10567f.mo8756a(mVar.f9232a, mVar.f9233b, mVar.f9234c, mVar.f9235d);
    }

    /* renamed from: d */
    public final void mo8585d(float f) {
        if (this.f10569h != null) {
            this.f10569h.mo8541c(f);
        }
    }

    public void onEvent(C5154aa aaVar) {
        if (this.f10553C != null) {
            this.f10553C.onEvent(aaVar);
        }
    }

    /* renamed from: a */
    private <T> void m9538a(Class<T> cls) {
        C4495a.m10823a().mo10300a(cls).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C5204w) {
                    VideoWidget2.this.onEvent((C5204w) t);
                } else if (t instanceof C3057c) {
                    VideoWidget2.this.onEvent((C3057c) t);
                } else {
                    if (t instanceof C5154aa) {
                        VideoWidget2.this.onEvent((C5154aa) t);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo8583b(float f) {
        if (this.f10569h != null) {
            this.f10569h.mo8538a(f);
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo9100a(HashMap<String, String> hashMap) {
        long j;
        if (this.f10575n != null) {
            j = this.f10575n.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: b */
    public final void mo8529b(C8688c cVar) {
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.valueOf(false));
        this.f10567f.mo8766e();
        C3395f.m9156f().mo8740a().mo8273b("livegame");
    }

    /* renamed from: c */
    public final void mo8584c(float f) {
        if (this.f10569h != null) {
            this.f10569h.mo8540b(f);
        }
    }

    /* renamed from: a */
    public final void mo8582a(float f) {
        if (this.f10569h != null) {
            this.f10569h.mo8542d(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9104b(boolean z) {
        String str;
        this.f10576o.removeMessages(100);
        if (this.f10568g.mo8593b() != 0) {
            Message message = new Message();
            message.what = 100;
            message.obj = this.f10568g.mo8595c();
            Bundle bundle = new Bundle();
            String str2 = "action_type";
            if (z) {
                str = "click";
            } else {
                str = "draw";
            }
            bundle.putString(str2, str);
            message.setData(bundle);
            this.f10576o.sendMessageDelayed(message, ((Long) LiveSettingKeys.LIVE_FILTER_EFFECTIVELY_USE_TIME.mo9431a()).longValue() * 1000);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 1505611330 && key.equals("data_pk_state")) {
                c = 0;
            }
            if (c == 0 && ((C4632d) kVData.getData()) == C4632d.PENAL && ((C4631c) this.f10563M.get("data_pk_result")) == C4631c.RIGHT_WON) {
                if (this.f10572k != null && this.f10572k.isShowing()) {
                    C3761as.m9597a(this.f10572k);
                }
                if (this.f10573l != null && this.f10573l.isShowing()) {
                    this.f10573l.dismiss();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9102a(C3033b bVar) {
        this.f10560J = bVar;
    }

    public void handleMsg(Message message) {
        if (isViewValid()) {
            boolean z = false;
            if (message.what == 100) {
                String str = (String) message.obj;
                String string = message.getData().getString("action_type");
                HashMap hashMap = new HashMap();
                String str2 = "filter_id";
                if (str == null) {
                    str = "";
                }
                hashMap.put(str2, str);
                C8049c.m15979a().mo14202a("live_take_filter_effective_use", mo9100a(hashMap), new C8059j().mo14214b("live_take").mo14213a("live_take_detail").mo14219g(string).mo14218f("click"));
                this.dataCenter.lambda$put$1$DataCenter("data_has_filter_effective", Boolean.valueOf(true));
                return;
            }
            if (message.what == 101 && this.f10571j != null) {
                C3032a aVar = this.f10571j;
                if ((message.obj instanceof Integer) && ((Integer) message.obj).intValue() == 0) {
                    z = true;
                }
                aVar.mo8245a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo8525a(C3184m mVar) {
        m9539c(mVar);
    }

    public void onEvent(C3057c cVar) {
        if (cVar.f8934a == 1) {
            this.f10568g.mo8594b("live_take_detail", mo9100a(new HashMap<>()));
            mo9103a(true);
            mo9104b(false);
        } else if (cVar.f8934a == 2) {
            this.f10568g.mo8591a("live_take_detail", mo9100a(new HashMap<>()));
            mo9103a(false);
            mo9104b(false);
        } else if (cVar.f8934a == 3) {
            mo9104b(true);
            return;
        }
        float a = C3261l.m8929a(C3266p.m8943a().f9434b, this.f10568g.mo8593b());
        if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
            if (!C9414h.m18630a(C3266p.m8943a().f9434b) && this.f10568g.mo8593b() >= 0 && this.f10568g.mo8593b() < C3266p.m8943a().f9434b.size()) {
                C8688c b = C3395f.m9156f().mo8741b().mo8551a().mo8649b(C3287f.m9014a("beautyTag", (FilterModel) C3266p.m8943a().f9434b.get(this.f10568g.mo8593b())));
                if (!(b == null || b.f23749j == null)) {
                    C3040c a2 = C3395f.m9156f().mo8740a();
                    a2.mo8268a(C3037b.f8916d, b);
                    Float c = a2.mo8275c(b.f23749j.f23764b);
                    if (c == null) {
                        c = Float.valueOf(C3366v.m9114a(b, b.f23749j.f23763a));
                    }
                    int i = (int) a;
                    if (c.floatValue() > C3366v.m9114a(b, i)) {
                        a2.mo8267a(b.f23749j.f23764b, C3366v.m9114a(b, i));
                    }
                }
            }
        } else if (this.f10569h.f9268d > (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * a) / 100.0f) {
            this.f10569h.mo8542d(a / 100.0f);
        }
        C3261l.m8930a(this.f10575n.getId());
    }

    /* renamed from: a */
    public final void mo8526a(C8688c cVar) {
        this.dataCenter.lambda$put$1$DataCenter("cmd_duty_gift_changed", Boolean.valueOf(true));
        this.f10567f.mo8765d();
        C3395f.m9156f().mo8740a().mo8268a("livegame", cVar);
    }

    public void onEvent(C5204w wVar) {
        String str;
        int i = wVar.f13924a;
        if (i != 2) {
            if (i != 28) {
                switch (i) {
                    case 21:
                        if (this.f10563M.f12609D == C4630b.SHOW) {
                            C4575an.m10981a((int) R.string.eoc);
                            return;
                        }
                        if (this.f10572k == null) {
                            this.f10572k = new C3344m(this.context, this.dataCenter, C3395f.m9156f().mo8741b().mo8551a());
                            this.f10572k.setOnDismissListener(C3757ao.f10625a);
                        }
                        if (!this.f10572k.isShowing()) {
                            this.f10572k.show();
                            return;
                        }
                        return;
                    case 22:
                        this.f10574m = !this.f10574m;
                        this.f10567f.mo8764c();
                        if (!this.f10551A) {
                            Context context = this.context;
                            if (this.f10574m) {
                                str = this.context.getResources().getString(R.string.es3);
                            } else {
                                str = this.context.getResources().getString(R.string.es4);
                            }
                            C4204a.m10423a(context, str);
                        }
                        C8068g.m16014a(this.context);
                        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                        this.f10575n.getId();
                        return;
                }
            } else if (this.f10563M.f12609D == C4630b.SHOW) {
                C4575an.m10981a((int) R.string.eob);
                return;
            } else {
                if (this.f10573l == null) {
                    if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NEW_GESTURE_DIALOG.mo9431a()).booleanValue()) {
                        this.f10573l = C3310a.m9044a(this.dataCenter);
                    } else {
                        this.f10573l = new C3306e(this.context, C3395f.m9156f().mo8741b().mo8551a(), this.dataCenter);
                    }
                    this.f10573l.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss(DialogInterface dialogInterface) {
                            String str;
                            C8049c a = C8049c.m15979a();
                            String str2 = "gesture_switch";
                            Object[] objArr = new Object[4];
                            objArr[0] = new C8059j().mo14213a("live_take_detail").mo14214b("live_take");
                            if (((Boolean) C4525b.f12373ap.mo10345a()).booleanValue()) {
                                str = "on";
                            } else {
                                str = "off";
                            }
                            objArr[1] = new C8054e(str);
                            objArr[2] = new C8060k();
                            objArr[3] = Room.class;
                            a.mo14203a(str2, objArr);
                            VideoWidget2.this.mo9108i();
                        }
                    });
                }
                if (!this.f10573l.isShowing()) {
                    this.f10573l.show(this.f10587z, C3306e.class.getSimpleName());
                    if (this.f10582u != null && !this.f10582u.isDisposed()) {
                        this.f10582u.dispose();
                    }
                    C8049c.m15979a().mo14203a("anchor_more_function_click_gesture", new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), new C8060k(), Room.class);
                } else {
                    return;
                }
            }
            return;
        }
        this.f10567f.mo8762b();
        this.f10574m = false;
    }

    /* renamed from: a */
    public final Client mo9036a(InteractConfig interactConfig, Boolean bool) {
        return this.f10383b.mo8292a(interactConfig, bool);
    }

    /* renamed from: a */
    public final void mo8650a(C8688c cVar, boolean z) {
        C3395f.m9156f().mo8740a().mo8268a("effect_gift", cVar);
    }

    /* renamed from: b */
    public final void mo8651b(String str, String str2, boolean z) {
        this.f10570i.mo8789a(str, str2, z);
    }

    public VideoWidget2(C3424f fVar, C8725y yVar, C3048a aVar) {
        super(fVar, aVar);
        this.f10561K = yVar;
    }
}
