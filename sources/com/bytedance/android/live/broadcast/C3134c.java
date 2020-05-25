package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.p188b.C2964a;
import com.bytedance.android.live.broadcast.PhoneStateReceiver.C3021a;
import com.bytedance.android.live.broadcast.api.C3031a;
import com.bytedance.android.live.broadcast.api.C3031a.C3032a;
import com.bytedance.android.live.broadcast.api.C3031a.C3033b;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.model.C3057c;
import com.bytedance.android.live.broadcast.api.model.C3058d;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p196c.C3049b;
import com.bytedance.android.live.broadcast.dutygift.DutyGiftControlWidget;
import com.bytedance.android.live.broadcast.dutygift.DutyGiftControlWidget.C3170a;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.effect.C3236c;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.C3256i;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.C3297n;
import com.bytedance.android.live.broadcast.p198b.C3072h;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.live.broadcast.p202d.C3164c;
import com.bytedance.android.live.broadcast.p202d.C3165d;
import com.bytedance.android.live.broadcast.p202d.C3166e;
import com.bytedance.android.live.broadcast.p203e.C3187a;
import com.bytedance.android.live.broadcast.p203e.C3187a.C3188a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p212g.C3397a;
import com.bytedance.android.live.broadcast.p212g.C3398b;
import com.bytedance.android.live.broadcast.p213h.C3430b;
import com.bytedance.android.live.broadcast.p213h.C3441c.C3442a;
import com.bytedance.android.live.broadcast.p213h.p214a.C3424f;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.broadcast.p213h.p218d.C3446b;
import com.bytedance.android.live.broadcast.widget.AbsCaptureWidget;
import com.bytedance.android.live.broadcast.widget.AudioWidget;
import com.bytedance.android.live.broadcast.widget.C3772g;
import com.bytedance.android.live.broadcast.widget.VideoWidget2;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3862aa;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4184d;
import com.bytedance.android.live.room.C4184d.C4185a;
import com.bytedance.android.live.room.C4187f;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p256b.C4198a;
import com.bytedance.android.live.uikit.p256b.C4200b;
import com.bytedance.android.live.uikit.p256b.C4203d;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.C8580y;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6170b;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6171c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7520p;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p385j.p386a.C7704a;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.C8693aa;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.android.livesdkapi.depend.p434b.C8617c;
import com.bytedance.android.livesdkapi.p445e.C8729a;
import com.bytedance.android.livesdkapi.p445e.C8734d;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.avframework.engine.MediaEngineFactory;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p683ss.avframework.utils.AVLog;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.c */
public final class C3134c extends C3846a implements C0199s<KVData>, C3021a, C3031a, C3049b, C3188a, C3397a, C3424f, C9382a {

    /* renamed from: N */
    private static final int[][] f9115N = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: A */
    private Queue<KVData> f9116A = new LinkedList();

    /* renamed from: B */
    private boolean f9117B = false;

    /* renamed from: F */
    private C3072h f9118F;

    /* renamed from: G */
    private boolean f9119G;

    /* renamed from: H */
    private C3446b f9120H;

    /* renamed from: I */
    private C3048a f9121I;

    /* renamed from: J */
    private PhoneStateReceiver f9122J;

    /* renamed from: K */
    private C3398b f9123K;

    /* renamed from: L */
    private View f9124L;

    /* renamed from: M */
    private C4128f f9125M = new C4128f() {
        /* renamed from: a */
        public final void mo8456a(List<C7505d> list) {
            if (C3134c.this.f9129c != null && !C3134c.this.f9129c.isLiveTypeAudio()) {
                C3297n.m9029a(C3134c.this.f9129c.getId());
            }
        }

        /* renamed from: b */
        public final void mo8457b(List<GiftPage> list) {
            if (C3134c.this.f9129c != null && !C3134c.this.f9129c.isLiveTypeAudio()) {
                C3297n.m9029a(C3134c.this.f9129c.getId());
            }
        }
    };

    /* renamed from: O */
    private boolean f9126O;

    /* renamed from: a */
    boolean f9127a = true;

    /* renamed from: b */
    C8680c f9128b;

    /* renamed from: c */
    public Room f9129c;

    /* renamed from: d */
    C4184d f9130d;

    /* renamed from: e */
    public DataCenter f9131e;

    /* renamed from: f */
    FrameLayout f9132f;

    /* renamed from: g */
    FrameLayout f9133g;

    /* renamed from: h */
    HSImageView f9134h;

    /* renamed from: i */
    public C6164eu f9135i;

    /* renamed from: j */
    public C3187a f9136j;

    /* renamed from: k */
    public C6736d f9137k;

    /* renamed from: l */
    public C3256i f9138l;

    /* renamed from: m */
    C4187f f9139m;

    /* renamed from: n */
    String f9140n;

    /* renamed from: o */
    CharSequence f9141o;

    /* renamed from: p */
    CharSequence f9142p;

    /* renamed from: q */
    CharSequence f9143q;

    /* renamed from: r */
    public AbsCaptureWidget f9144r;

    /* renamed from: s */
    DutyGiftControlWidget f9145s;

    /* renamed from: t */
    C1689b f9146t = new C1689b();

    /* renamed from: u */
    C1689b f9147u = new C1689b();

    /* renamed from: v */
    public C3199a f9148v = new C3199a() {
        /* renamed from: a */
        public final void mo8488a(int i) {
            boolean z;
            if (C3134c.this.f9144r instanceof C3772g) {
                C3261l g = ((C3772g) C3134c.this.f9144r).mo9106g();
                if (g == null) {
                    C3831a.m9716d("LiveBroadcastFragment", "filterHelper is null!");
                    return;
                }
                int b = g.mo8593b();
                float a = C3261l.m8929a(C3266p.m8943a().f9434b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                    C3197a h = ((C3772g) C3134c.this.f9144r).mo9107h();
                    if (h.f9268d > (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * a) / 100.0f) {
                        h.mo8542d(a / 100.0f);
                    }
                } else if (!C9414h.m18630a(C3266p.m8943a().f9434b) && i >= 0 && i < C3266p.m8943a().f9434b.size()) {
                    C8688c b2 = C3395f.m9156f().mo8741b().mo8551a().mo8649b(C3287f.m9014a("beautyTag", (FilterModel) C3266p.m8943a().f9434b.get(i)));
                    if (!(b2 == null || b2.f23749j == null)) {
                        C3040c a2 = C3395f.m9156f().mo8740a();
                        a2.mo8268a(C3037b.f8916d, b2);
                        Float c = a2.mo8275c(b2.f23749j.f23764b);
                        if (c == null) {
                            c = Float.valueOf(C3366v.m9114a(b2, b2.f23749j.f23763a));
                        }
                        int i2 = (int) a;
                        if (c.floatValue() > C3366v.m9114a(b2, i2)) {
                            a2.mo8267a(b2.f23749j.f23764b, C3366v.m9114a(b2, i2));
                        }
                    }
                }
                g.mo8588a(i);
                C3772g gVar = (C3772g) C3134c.this.f9144r;
                if (i < b) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.mo9103a(z);
            }
            String str = "";
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            if (!C9431p.m18664a(str) && !str.equals("0")) {
                C3134c.this.f9131e.lambda$put$1$DataCenter("cmd_toolbar_click_filter", str);
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", "click");
                hashMap.put("filter_id", str);
                C8049c.m15979a().mo14202a("live_take_filter_select", C3134c.this.mo8471a(hashMap), new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), new C8060k());
            }
            C3261l.m8930a(C3134c.this.f9129c.getId());
            C4495a.m10823a().mo10301a((Object) new C3057c(3));
        }
    };

    /* renamed from: w */
    private C8725y f9149w;

    /* renamed from: x */
    private boolean f9150x;

    /* renamed from: y */
    private C9381g f9151y = new C9381g(this);

    /* renamed from: z */
    private Handler f9152z = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.android.live.broadcast.c$a */
    class C3147a {

        /* renamed from: a */
        int f9169a;

        private C3147a() {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c$b */
    class C3148b implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3148b() {
        }

        public final void onClick(View view) {
            C8049c.m15979a().mo14202a("live_take_beauty_click", C3134c.this.mo8471a(new HashMap<>()), new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), new C8060k());
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                C3395f.m9156f().mo8741b().mo8552a(C3134c.this.getActivity(), Boolean.valueOf(false));
                return;
            }
            if (C3134c.this.f9137k == null) {
                C3134c.this.f9137k = C3236c.m8868a((C3252a) C3134c.this.f9144r, C3134c.this.f9148v, false, 1);
            }
            if (C3134c.this.f9137k.getDialog() == null || !C3134c.this.f9137k.getDialog().isShowing()) {
                C3134c.this.f9137k.show(C3134c.this.getActivity().getSupportFragmentManager(), "beautyDialogTag");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.c$c */
    class C3149c implements C0199s<KVData>, C6601a {

        /* renamed from: a */
        View f9172a;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        private C3149c() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            KVData kVData = (KVData) obj;
            if (kVData != null) {
                String key = kVData.getKey();
                char c = 65535;
                if (key.hashCode() == 982604344 && key.equals("cmd_toolbar_click_filter")) {
                    c = 0;
                }
                if (c == 0 && !C3266p.m8943a().mo8636d()) {
                    this.f9172a.setVisibility(8);
                }
            }
        }

        public final void onClick(View view) {
            C8049c.m15979a().mo14202a("live_take_filter_click", C3134c.this.mo8471a(new HashMap<>()), new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), new C8060k());
            if (C3134c.this.f9138l == null || C3134c.this.f9138l.getDialog() == null || !C3134c.this.f9138l.getDialog().isShowing()) {
                C3134c.this.f9138l = C3256i.m8926a(C3134c.this.f9148v, C3266p.m8943a().f9434b, false);
                C3134c.this.f9138l.show(C3134c.this.getActivity().getSupportFragmentManager(), "filterDialogTag");
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            dataCenter.removeObserver(this);
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f9172a = view.findViewById(R.id.cam);
            if (C3266p.m8943a().mo8636d()) {
                this.f9172a.setVisibility(0);
            }
            dataCenter.observe("cmd_toolbar_click_filter", this);
        }
    }

    public final void onEvent(C3058d dVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8472a() {
        if (this.f9130d != null) {
            if (this.f9144r != null) {
                this.f9144r.mo9029e();
            }
            this.f9130d.mo9589d();
            getActivity().getSupportFragmentManager().mo2225a().mo2177a((Fragment) this.f9130d).mo2200e();
            this.f9130d = null;
            C8580y.m16962a().mo15067b();
        }
    }

    /* renamed from: a */
    public final void mo8312a(int i) {
        String str = "";
        int i2 = BaseNotice.HASHTAG;
        int i3 = 1;
        switch (i) {
            case 1:
                str = "stream push failed";
                i3 = 6;
                break;
            case 2:
                i2 = 104;
                str = "enter background timeout";
                break;
            case 3:
                C4204a.m10421a(getContext(), (int) R.string.epn);
                str = "broadcast error";
                break;
            default:
                i2 = 0;
                break;
        }
        if (i > 0) {
            C4204a.m10423a(getContext(), getString(R.string.epl));
            C3161a.m8758a(false, i2, str);
            StringBuilder sb = new StringBuilder("room close onStreamEnd code:");
            sb.append(i);
            C3831a.m9707a("LiveBroadcastFragment", sb.toString());
            mo8473b();
            this.f9120H.mo8842a(i3);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("errCode", String.valueOf(i2));
        hashMap.put("errMsg", str);
        C3982g.m10085a(C3983a.CreateLive, hashMap);
    }

    /* renamed from: a */
    public final void mo8433a(CharSequence charSequence) {
        if (mo8452l()) {
            m8715m();
            this.f9135i.mo12194a(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo8438a(boolean z, String str) {
        if (mo8452l()) {
            m8715m();
            this.f9135i.mo12196a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo8437a(boolean z, CharSequence charSequence, String str) {
        if (mo8452l()) {
            m8715m();
            this.f9135i.mo12195a(false, null, new OnClickListener(null) {
                public final void onClick(View view) {
                    ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(C3134c.this.getContext(), C4704c.m11227b(null).mo10506a(true));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo8435a(boolean z) {
        if (mo8452l() && this.f9135i != null) {
            m8715m();
            if (z) {
                this.f9135i.setCancelable(false);
                this.f9135i.show();
                this.f9135i.mo12193a((OnClickListener) new OnClickListener() {
                    public final void onClick(View view) {
                        if (C3134c.this.f9136j != null) {
                            C3134c.this.f9136j.mo8532b();
                            C3134c.this.f9135i.dismiss();
                        }
                    }
                });
                this.f9135i.f16544a = new C6170b() {
                    /* renamed from: a */
                    public final void mo8462a() {
                        C4204a.m10424a(C3134c.this.getContext(), C3922z.m9903a((int) R.string.eol), 1);
                    }
                };
                this.f9135i.f16545b = new C6171c() {
                    /* renamed from: a */
                    public final void mo8463a() {
                        C4204a.m10424a(C3134c.this.getContext(), C3922z.m9903a((int) R.string.eol), 1);
                    }
                };
                return;
            }
            this.f9135i.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8436a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (mo8452l() && this.f9130d != null) {
            this.f9130d.mo9587a(z, charSequence, charSequence2);
        }
    }

    /* renamed from: a */
    public final void mo8209a(String str) {
        if (TelephonyManager.EXTRA_STATE_IDLE.equals(str)) {
            this.f9121I.mo8303b();
            return;
        }
        if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(str)) {
            this.f9121I.mo8304c();
        }
    }

    /* renamed from: m */
    private void m8715m() {
        if (this.f9135i == null) {
            this.f9135i = C6164eu.m13343a((Context) getActivity(), 1);
        }
    }

    /* renamed from: g */
    public final void mo8447g() {
        if (mo8452l()) {
            m8716n();
        }
    }

    /* renamed from: h */
    public final void mo8448h() {
        C4204a.m10421a(getContext(), (int) R.string.es6);
    }

    /* renamed from: i */
    public final void mo8449i() {
        mo8474b(8);
        C3831a.m9707a("LiveBroadcastFragment", "room close forceEndLive");
        mo8473b();
    }

    public final void onPause() {
        super.onPause();
        this.f9128b.mo15138a(this.f9122J);
        this.f9121I.mo8304c();
    }

    /* renamed from: j */
    private void m8713j() {
        if (this.f10827C && !this.f9119G && !this.f9117B) {
            m8714k();
        }
    }

    /* renamed from: c */
    public final void mo8244c() {
        this.f9152z.removeCallbacksAndMessages(null);
        this.f9121I.mo8293a();
        if (this.f9129c != null && this.f9129c.isLiveTypeAudio()) {
            this.f9121I.mo8307f();
        }
    }

    /* renamed from: d */
    public final void mo8313d() {
        if (this.f9130d != null) {
            this.f9130d.mo9591f();
        }
        C3982g.m10092c(C3983a.CreateLive);
        C3974b.m10061a().mo9374a(C3983a.CreateLive.name());
    }

    public final void onStop() {
        super.onStop();
        this.f9147u.mo6180a();
        if (!this.f9119G && this.f9120H != null) {
            C3446b bVar = this.f9120H;
            if (bVar.f9858a) {
                bVar.mo8843a(3, 0);
            }
        }
    }

    /* renamed from: n */
    private void m8716n() {
        if (this.f9118F == null) {
            this.f9118F = C3072h.m8560a(getContext(), this.f9136j);
            this.f9136j.f9246h = this.f9118F;
        }
        if (getActivity() != null) {
            this.f9118F.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    /* renamed from: e */
    public final void mo8314e() {
        if (mo8452l() && this.f9130d != null) {
            this.f9130d.mo9581a(0.0f);
        }
        if (!this.f9119G) {
            C4204a.m10421a(getContext(), (int) R.string.epm);
            HashMap hashMap = new HashMap();
            hashMap.put("error_type", "1");
            C8049c.m15979a().mo14202a("livesdk_anchor_network_error", hashMap, new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo8315f() {
        C4204a.m10421a(getContext(), (int) R.string.es2);
        HashMap hashMap = new HashMap();
        hashMap.put("error_type", "2");
        C8049c.m15979a().mo14202a("livesdk_anchor_network_error", hashMap, new Object[0]);
    }

    /* renamed from: k */
    private void m8714k() {
        if (this.f9129c != null && this.f9152z != null && this.f9121I != null && this.f9151y != null) {
            this.f9152z.removeCallbacksAndMessages(null);
            if (!this.f9119G) {
                if (TextUtils.isEmpty(this.f9129c.getStreamUrl().f23789q)) {
                    this.f9129c.getStreamUrl().f23789q = this.f9129c.getStreamUrl().mo15381a();
                }
                if (this.f9129c != null && this.f9129c.isLiveTypeAudio()) {
                    this.f9121I.mo8306e();
                }
                if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_URL_LIST.mo9431a()).booleanValue()) {
                    this.f9121I.mo8300a(this.f9129c.getStreamUrl().f23777e);
                } else {
                    this.f9121I.mo8299a(this.f9129c.getStreamUrl().f23789q);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8473b() {
        this.f9119G = true;
        if (mo8452l()) {
            if (this.f9138l != null) {
                this.f9138l.dismiss();
            }
            if (this.f9137k != null) {
                this.f9137k.dismiss();
            }
            if (this.f9145s != null) {
                DutyGiftControlWidget dutyGiftControlWidget = this.f9145s;
                if (dutyGiftControlWidget.f9207i != null && dutyGiftControlWidget.f9207i.isShowing()) {
                    dutyGiftControlWidget.f9207i.dismiss();
                }
                C3170a aVar = dutyGiftControlWidget.f9199a;
                if (aVar.f9213a != null && aVar.f9213a.isShowing()) {
                    aVar.f9213a.dismiss();
                }
            }
            C4116c.m10249a(C8734d.class);
            this.f9151y.post(new C3448j(this));
        }
    }

    public final void onResume() {
        super.onResume();
        this.f9147u.mo6180a();
        m8710a(C7520p.class);
        m8710a(C5204w.class);
        m8710a(C8617c.class);
        m8710a(C7704a.class);
        this.f9128b.mo15139a(this.f9122J, new IntentFilter("android.intent.action.PHONE_STATE"));
        if (this.f9119G) {
            this.f9151y.removeCallbacksAndMessages(null);
            return;
        }
        this.f9121I.mo8303b();
        C3446b bVar = this.f9120H;
        if (bVar.f9858a) {
            bVar.mo8843a(2, 0);
        }
        while (!this.f9116A.isEmpty()) {
            onChanged((KVData) this.f9116A.poll());
        }
    }

    public final void onDestroy() {
        this.f9131e.removeObserver(this);
        mo8472a();
        this.f9131e.removeObserver(this);
        if (this.f9123K != null) {
            this.f9123K.mo8750a();
        }
        if (this.f9136j != null) {
            this.f9136j.mo8247a();
            this.f9136j = null;
        }
        if (this.f9135i != null) {
            this.f9135i.dismiss();
            this.f9135i = null;
        }
        if (this.f9121I != null) {
            this.f9121I.mo8305d();
        }
        if (this.f9131e != null) {
            this.f9131e.removeObserver(this);
        }
        if (this.f9146t != null) {
            this.f9146t.mo6180a();
        }
        if (this.f9129c != null) {
            ((IMessageService) C4116c.m10249a(IMessageService.class)).release(this.f9129c.getId());
            LinkCrossRoomDataHolder.m11105a(this.f9129c.getId());
        }
        this.f9151y.removeCallbacksAndMessages(null);
        ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(null);
        C4116c.m10249a(C8734d.class);
        C4638d.m11114a().mo10419b();
        if (this.f9129c != null) {
            this.f9129c.getId();
        }
        ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController().mo9622c();
        try {
            ((IGiftService) C4116c.m10249a(IGiftService.class)).clearAssets("effects");
        } catch (IllegalStateException unused) {
        }
        super.onDestroy();
        C3161a.m8759b(false);
    }

    /* renamed from: a */
    public final void mo8311a(float f) {
        if (mo8452l() && this.f9130d != null) {
            this.f9130d.mo9581a(f);
        }
    }

    /* renamed from: b */
    public final void mo8439b(CharSequence charSequence) {
        if (mo8452l()) {
            m8715m();
            this.f9135i.mo12197b(charSequence);
        }
    }

    /* renamed from: a */
    private <T> void m8710a(Class<T> cls) {
        this.f9147u.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C7520p) {
                    C3134c.this.onEvent((C7520p) t);
                } else if (t instanceof C5204w) {
                    C3134c.this.onEvent((C5204w) t);
                } else if (t instanceof C8617c) {
                    C3134c.this.onEvent((C8617c) t);
                } else {
                    if (t instanceof C7704a) {
                        C3134c.this.onEvent((C7704a) t);
                    }
                }
            }
        }));
    }

    public final void onEvent(C8617c cVar) {
        if (cVar.f23585a == 1) {
            C4204a.m10421a(getContext(), (int) R.string.enf);
            return;
        }
        if (cVar.f23585a == 0) {
            C4204a.m10421a(getContext(), (int) R.string.eno);
        }
    }

    /* renamed from: a */
    private void m8711a(Object obj) {
        if (obj instanceof C8729a) {
            final C8729a aVar = (C8729a) obj;
            try {
                final String str = (String) aVar.mo15405a();
                Bundle bundle = new Bundle();
                bundle.putInt("mode", 1);
                bundle.putString("outputPathOrigin", "");
                bundle.putString("outputPathWithEffect", str);
                bundle.putInt("interval", 0);
                bundle.putInt("frameCount", 1);
                this.f9121I.mo8294a(bundle, (CatchVideoCallback) new CatchVideoCallback() {
                    public final void onComplete() {
                    }

                    public final void onError(int i, String str) {
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m8712b(boolean z) {
        String str;
        if (!this.f9119G) {
            mo8474b(1);
        }
        String str2 = "LiveBroadcastFragment";
        StringBuilder sb = new StringBuilder("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        sb.append(str);
        C3831a.m9707a(str2, sb.toString());
        mo8473b();
        if (z) {
            C3161a.m8758a(false, 103, "room banned");
        } else {
            C3161a.m8758a(true, 0, null);
        }
    }

    /* renamed from: c */
    public final void mo8470c(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            StringBuilder sb = new StringBuilder("room close onStatusResult errorCode:");
            sb.append(i);
            C3831a.m9707a("LiveBroadcastFragment", sb.toString());
            m8712b(false);
        }
    }

    public final void onEvent(C7520p pVar) {
        if (this.f9129c != null && !this.f9129c.isLiveTypeAudio()) {
            long j = pVar.f20640a;
            for (C7505d dVar : ((IGiftService) C4116c.m10249a(IGiftService.class)).getStickerGifts()) {
                if (dVar.f20558s == j) {
                    C3297n.m9029a(this.f9129c.getId());
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m8706a(C5200s sVar) {
        if (sVar.f13914a == 0) {
            this.f9132f.post(new C3461n(this));
        } else if (sVar.f13914a == 1) {
            this.f9132f.post(new C3462o(this));
        } else if (sVar.f13914a != 2) {
            if (sVar.f13914a == 3) {
                this.f9132f.post(new C3382f(this));
            }
        } else if (sVar.f13915b instanceof SurfaceView) {
            this.f9132f.post(new C3463p(this, (SurfaceView) sVar.f13915b));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        C3862aa.m9793a(getActivity());
        super.onActivityCreated(bundle);
        C0654k supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("AbsInteractionFragment");
        if (a != null) {
            try {
                supportFragmentManager.mo2225a().mo2177a(a).mo2200e();
            } catch (Exception e) {
                C8064d.m16005b();
                C8064d.m9718a(6, e.getStackTrace());
            }
        }
        ((C4139d) C4116c.m10249a(C4139d.class)).getGpuInfoFetcher().mo9526a(getActivity(), this.f9124L, C3160d.f9194a);
    }

    public final void onCreate(Bundle bundle) {
        C3161a.m8759b(true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        this.f9131e = DataCenter.create(C0214z.m438a((Fragment) this), this);
        C8828a.LiveResource.preload();
        C3023a.m8461a().mo8215b();
        ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController().mo9618b();
        this.f9146t.mo6180a();
        this.f9146t.mo6181a(C4495a.m10823a().mo10300a(C3058d.class).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C3058d) {
                    C3134c.this.onEvent((C3058d) t);
                }
            }
        }));
        this.f9131e.observeForever("cmd_interact_state_change", this).observeForever("cmd_pk_state_change", this).observeForever("cmd_screenshot_live_room", this).observeForever("cmd_show_illegal_dialog", this);
    }

    public final void onEvent(C7704a aVar) {
        C8049c.m15979a().mo14203a(aVar.f21199a, new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), Room.class);
    }

    /* renamed from: a */
    private void m8707a(C5202u uVar) {
        if (uVar.f13919a == 7) {
            this.f9117B = true;
            this.f9120H.mo8841a();
        } else if (uVar.f13919a == 8) {
            this.f9117B = false;
        } else if (uVar.f13919a == 10) {
            this.f9133g.removeAllViews();
            SurfaceView surfaceView = (SurfaceView) uVar.f13920b;
            surfaceView.setLayoutParams(new LayoutParams(-1, -1));
            this.f9133g.addView(surfaceView);
        } else {
            if (uVar.f13919a == 11) {
                this.f9133g.removeAllViews();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8474b(int i) {
        if (this.f9130d != null) {
            this.f9130d.mo9588c();
        }
        this.f9120H.mo8842a(i);
        this.f9151y.removeCallbacksAndMessages(null);
        if (this.f9136j != null) {
            this.f9136j.mo8534e();
        }
        mo8244c();
        this.f9119G = true;
        C3982g.m10092c(C3983a.CreateLive);
        C3974b.m10061a().mo9374a(C3983a.CreateLive.name());
    }

    public final void handleMsg(Message message) {
        boolean z;
        int i = message.what;
        if (3 == i) {
            Object obj = message.obj;
            C3147a aVar = new C3147a();
            if (obj instanceof C2949a) {
                aVar.f9169a = ((C2949a) obj).getErrorCode();
            }
            if (aVar.f9169a == 30001 || aVar.f9169a == 50002 || aVar.f9169a == 30003) {
                StringBuilder sb = new StringBuilder("room close handleUpdateRoomStatusResult errorCode:");
                sb.append(aVar.f9169a);
                C3831a.m9707a("LiveBroadcastFragment", sb.toString());
                m8712b(false);
            }
        } else if (message.obj instanceof Exception) {
            if (13 == i) {
                this.f9150x = false;
                m8713j();
            }
        } else {
            if (13 == i) {
                this.f9150x = false;
                String str = (String) message.obj;
                StreamUrl streamUrl = this.f9129c.getStreamUrl();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f9149w.f23972b);
                streamUrl.f23788p = sb2.toString();
                m8713j();
            }
            if (35 == i) {
                final C8693aa aaVar = (C8693aa) message.obj;
                if (aaVar != null) {
                    double d = aaVar.f23804b;
                    long j = aaVar.f23807e;
                    if (((Double) C4525b.f12411bi.mo10345a()).doubleValue() < 9.0d || d >= 9.0d) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (C8693aa.f23803a == aaVar.f23806d && ((Long) C4525b.f12412bj.mo10345a()).longValue() != j) {
                        z = true;
                    }
                    if (z) {
                        C4198a aVar2 = new C4198a(getContext());
                        aVar2.f11386c = 48;
                        aVar2.f11390g = 5000;
                        aVar2.f11395l = true;
                        aVar2.f11396m = false;
                        C31448 r0 = new C4203d() {
                            /* renamed from: a */
                            public final void mo8486a(View view) {
                                view.setOnClickListener(new OnClickListener() {
                                    public final void onClick(View view) {
                                        if (!TextUtils.isEmpty(aaVar.f23808f)) {
                                            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(C3134c.this.getContext(), C4704c.m11227b(aaVar.f23808f).mo10506a(true));
                                        }
                                    }
                                });
                            }
                        };
                        aVar2.f11387d = aVar2.mo9648a(R.layout.ajw);
                        r0.mo8486a(aVar2.f11387d);
                        String str2 = "";
                        if (!aVar2.mo9652d()) {
                            aVar2.f11393j = str2;
                            if (aVar2.f11387d != null) {
                                aVar2.f11388e = (TextView) aVar2.f11387d.findViewById(R.id.text);
                                aVar2.f11391h = (ImageView) aVar2.f11387d.findViewById(R.id.aqa);
                            }
                            if (aVar2.f11391h != null) {
                                aVar2.f11391h.setVisibility(8);
                            }
                            aVar2.f11387d.measure(MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT));
                        }
                        C4200b a = C4200b.m10416a();
                        if (!a.f11412a.contains(aVar2) && a.f11412a.size() <= a.f11414c) {
                            a.f11412a.offer(aVar2);
                            if (!a.f11413b) {
                                a.mo9656b();
                            }
                        }
                    }
                    C4525b.f12411bi.mo10346a(Double.valueOf(d));
                    C4525b.f12412bj.mo10346a(Long.valueOf(j));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0139, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.bytedance.android.livesdk.chatroom.event.C5204w r10) {
        /*
            r9 = this;
            int r0 = r10.f13924a
            r1 = 3
            if (r0 == r1) goto L_0x0159
            r1 = 11
            r2 = 1
            if (r0 == r1) goto L_0x0142
            r1 = 17
            if (r0 == r1) goto L_0x013a
            r1 = 0
            switch(r0) {
                case 5: goto L_0x013a;
                case 6: goto L_0x0057;
                case 7: goto L_0x0014;
                case 8: goto L_0x0057;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0139
        L_0x0014:
            com.bytedance.android.livesdk.message.model.c r10 = r10.f13926c
            boolean r0 = r10 instanceof com.bytedance.android.livesdk.message.model.C8009t
            if (r0 == 0) goto L_0x0053
            com.bytedance.android.livesdk.message.model.t r10 = (com.bytedance.android.livesdk.message.model.C8009t) r10
            int r0 = r10.f21914a
            r3 = 4
            if (r0 != r3) goto L_0x0053
            com.bytedance.android.livesdk.message.model.t$a r0 = r10.f21916c
            if (r0 == 0) goto L_0x004f
            com.bytedance.android.livesdk.message.model.t$a r0 = r10.f21916c
            java.lang.String r0 = r0.f21917a
            r9.f9140n = r0
            com.bytedance.android.livesdk.message.model.t$a r0 = r10.f21916c
            com.bytedance.android.livesdkapi.message.g r0 = r0.f21919c
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r0, r1)
            r9.f9141o = r0
            com.bytedance.android.livesdk.message.model.t$a r0 = r10.f21916c
            com.bytedance.android.livesdkapi.message.g r0 = r0.f21920d
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r0, r1)
            r9.f9142p = r0
            com.bytedance.android.livesdk.message.model.t$a r10 = r10.f21916c
            com.bytedance.android.livesdkapi.message.g r10 = r10.f21921e
            java.lang.String r0 = ""
            android.text.Spannable r10 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r10, r0)
            r9.f9143q = r10
        L_0x004f:
            r9.m8712b(r2)
            return
        L_0x0053:
            r9.m8712b(r1)
            return
        L_0x0057:
            com.bytedance.ies.sdk.widgets.DataCenter r10 = r9.f9131e
            r0 = 0
            if (r10 == 0) goto L_0x0065
            com.bytedance.ies.sdk.widgets.DataCenter r10 = r9.f9131e
            java.lang.String r3 = "data_member_count"
            java.lang.Object r10 = r10.get(r3)
            goto L_0x0066
        L_0x0065:
            r10 = r0
        L_0x0066:
            if (r10 == 0) goto L_0x0073
            boolean r3 = r10 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0073
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L_0x0074
        L_0x0073:
            r10 = 0
        L_0x0074:
            if (r10 > 0) goto L_0x0082
            android.content.res.Resources r3 = r9.getResources()
            r4 = 2132550502(0x7f1c2366, float:2.0754337E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0095
        L_0x0082:
            android.content.res.Resources r3 = r9.getResources()
            r4 = 2132410409(0x7f1a0029, float:2.0470194E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5[r1] = r6
            java.lang.String r3 = r3.getQuantityString(r4, r10, r5)
        L_0x0095:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00bf
            if (r10 <= 0) goto L_0x00bf
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r4 = r3.indexOf(r10)
            r5 = -1
            if (r4 == r5) goto L_0x00bf
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r3)
            android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
            r6 = -56832(0xffffffffffff2200, float:NaN)
            r5.<init>(r6)
            int r10 = r10.length()
            int r10 = r10 + r4
            r6 = 34
            r0.setSpan(r5, r4, r10, r6)
        L_0x00bf:
            r4 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r9.f9129c
            if (r10 == 0) goto L_0x00cb
            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r9.f9129c
            long r4 = r10.getId()
        L_0x00cb:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r6 = "room_id"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r10.put(r6, r4)
            com.bytedance.android.livesdk.o.c r4 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r5 = "anchor_close_live_popup"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.bytedance.android.livesdk.o.c.j r7 = new com.bytedance.android.livesdk.o.c.j
            r7.<init>()
            java.lang.String r8 = "live_take_detail"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14213a(r8)
            java.lang.String r8 = "click"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14218f(r8)
            java.lang.String r8 = "live_take"
            com.bytedance.android.livesdk.o.c.j r7 = r7.mo14214b(r8)
            r6[r1] = r7
            com.bytedance.android.livesdk.o.c.k r7 = new com.bytedance.android.livesdk.o.c.k
            r7.<init>()
            r6[r2] = r7
            r4.mo14202a(r5, r10, r6)
            com.bytedance.android.livesdk.widget.C8555i.m16887a()
            android.content.Context r4 = r9.getContext()
            com.bytedance.android.livesdk.widget.i$a r4 = com.bytedance.android.livesdk.widget.C8555i.m16886a(r4)
            r5 = 2132551462(0x7f1c2726, float:2.0756284E38)
            com.bytedance.android.livesdk.widget.i$a r4 = r4.mo15012d(r5)
            if (r0 != 0) goto L_0x011a
            r0 = r3
        L_0x011a:
            com.bytedance.android.livesdk.widget.i$a r0 = r4.mo15009c(r0)
            r3 = 2132551220(0x7f1c2634, float:2.0755793E38)
            com.bytedance.android.live.broadcast.k r4 = new com.bytedance.android.live.broadcast.k
            r4.<init>(r9, r10)
            com.bytedance.android.livesdk.widget.i$a r0 = r0.mo15003b(r1, r3, r4)
            r1 = 2132550023(0x7f1c2187, float:2.0753365E38)
            com.bytedance.android.live.broadcast.l r3 = new com.bytedance.android.live.broadcast.l
            r3.<init>(r9, r10)
            com.bytedance.android.livesdk.widget.i$a r10 = r0.mo15003b(r2, r1, r3)
            r10.mo15011d()
        L_0x0139:
            return
        L_0x013a:
            android.support.v4.app.FragmentActivity r10 = r9.getActivity()
            r10.finish()
            return
        L_0x0142:
            r9.mo8474b(r2)
            android.content.Context r10 = r9.getContext()
            r0 = 2132551088(0x7f1c25b0, float:2.0755525E38)
            r1 = 1
            com.bytedance.android.live.uikit.p257c.C4204a.m10422a(r10, r0, r1)
            android.support.v4.app.FragmentActivity r10 = r9.getActivity()
            r10.finish()
            return
        L_0x0159:
            boolean r10 = r9.f9150x
            if (r10 == 0) goto L_0x015e
            return
        L_0x015e:
            com.bytedance.android.live.core.widget.HSImageView r10 = r9.f9134h
            r0 = 8
            r10.setVisibility(r0)
            r9.m8713j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3134c.onEvent(com.bytedance.android.livesdk.chatroom.event.w):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (mo8452l() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (!this.f10827C) {
                this.f9116A.offer(kVData);
                return;
            }
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode != -1180299966) {
                    if (hashCode != -553175398) {
                        if (hashCode == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                            c = 2;
                        }
                    } else if (key.equals("cmd_screenshot_live_room")) {
                        c = 3;
                    }
                } else if (key.equals("cmd_interact_state_change")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m8707a((C5202u) kVData.getData());
                    return;
                case 1:
                    m8706a((C5200s) kVData.getData());
                    return;
                case 2:
                    m8716n();
                    this.f9136j.f9243e = false;
                    return;
                case 3:
                    m8711a(kVData.getData());
                    break;
            }
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo8471a(HashMap<String, String> hashMap) {
        long j;
        if (this.f9129c != null) {
            j = this.f9129c.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        String str;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        Bundle bundle2;
        C8710m mVar;
        C2964a aVar;
        super.onViewCreated(view, bundle);
        this.f9124L = view;
        WidgetManager dataCenter = WidgetManager.m22273of((Fragment) this, getView()).setDataCenter(this.f9131e);
        this.f9134h = (HSImageView) getView().findViewById(R.id.bc4);
        this.f9133g = (FrameLayout) getView().findViewById(R.id.f5);
        this.f9132f = (FrameLayout) getView().findViewById(R.id.c4e);
        if (this.f9132f != null && ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_FIX_LIVE_END.mo9431a()).booleanValue()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9132f.getLayoutParams();
            layoutParams.leftMargin = 1;
            layoutParams.rightMargin = 1;
            this.f9132f.setLayoutParams(layoutParams);
        }
        this.f9129c = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        this.f9131e.lambda$put$1$DataCenter("data_room", this.f9129c);
        if (getArguments() != null) {
            Bundle bundle3 = getArguments().getBundle("extra");
            if (bundle3 == null) {
                aVar = null;
            } else {
                aVar = (C2964a) bundle3.getSerializable("data_dou_plus_promote_entry");
            }
            Room room = this.f9129c;
            DataCenter dataCenter2 = this.f9131e;
            if (aVar == null) {
                aVar = C2964a.defaultOne();
            }
            if (room != null) {
                room.isDouPlusPromotion = aVar.hasDouPlusEntry;
            }
            if (dataCenter2 != null) {
                dataCenter2.lambda$put$1$DataCenter("data_dou_plus_promote_entry", aVar);
            }
        }
        if (!Room.isValid(this.f9129c) || this.f9129c.getStreamUrl() == null) {
            getActivity().finish();
            return;
        }
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        if (a instanceof C8045n) {
            ((C8045n) a).mo14197a(this.f9129c);
        }
        LinkCrossRoomDataHolder.m11104a(this.f9129c.getId(), C0214z.m438a((Fragment) this), this);
        this.f9149w = this.f9129c.getStreamUrlExtraSafely();
        if (this.f9129c.isLiveTypeAudio()) {
            HSImageView hSImageView = (HSImageView) getView().findViewById(R.id.c7v);
            View findViewById = getView().findViewById(R.id.c7w);
            hSImageView.setVisibility(0);
            findViewById.setVisibility(0);
            C5213c.m11821a(hSImageView, this.f9129c.getOwner().getAvatarLarge(), (C14234d) new C4620v(5, ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext())), null));
        }
        this.f9136j = new C3187a(this.f9129c.getId(), getContext());
        this.f9136j.mo8520a(this);
        this.f9123K = new C3398b(this.f9129c);
        this.f9123K.f9698a = this;
        this.f9120H = new C3446b(this.f9123K);
        this.f9120H.mo8841a();
        boolean isLiveTypeAudio = this.f9129c.isLiveTypeAudio();
        int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.mo9431a()).intValue();
        int[] iArr = (intValue <= 0 || intValue > f9115N.length) ? new int[]{this.f9149w.mo15392c(), this.f9149w.mo15393d(), this.f9149w.mo15394e(), this.f9149w.f23978h} : f9115N[intValue - 1];
        int intValue2 = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo9431a()).intValue();
        if (intValue2 <= 0) {
            z = this.f9149w.f23979i;
        } else if (intValue2 == 2) {
            z = true;
        } else {
            z = false;
        }
        int b = this.f9149w.mo15391b();
        int a2 = this.f9149w.mo15390a();
        if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a()).length == 2) {
            b = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a())[0].intValue();
            a2 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a())[1].intValue();
        }
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo9431a()).intValue() >= 0) {
            i10 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo9431a()).intValue();
        }
        if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a()).length == 3) {
            i8 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[0].intValue();
            i7 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[1].intValue();
            i9 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[2].intValue();
        }
        int i11 = i8;
        int i12 = i9;
        int intValue3 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_BITRATE_ADAPT.mo9431a()).intValue();
        if (intValue3 < 0) {
            i = this.f9149w.f23980j;
        } else {
            i = intValue3;
        }
        boolean z4 = this.f9149w.f23988r;
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_HW_ROI.mo9431a()).booleanValue()) {
            z4 = true;
        }
        boolean z5 = this.f9149w.f23989s;
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_SW_ROI.mo9431a()).booleanValue()) {
            z5 = true;
        }
        C3442a h = new C3442a(getContext()).mo8820a(isLiveTypeAudio ? 1 : 0).mo8836f(b).mo8837g(a2).mo8832c(i7).mo8830b(i11).mo8834d(i12).mo8838h(i10);
        if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.mo9431a()).booleanValue()) {
            str = this.f9129c.getStreamUrl().f23786n;
        } else {
            str = "";
        }
        C3442a a3 = h.mo8831b(str).mo8835e(this.f9149w.mo15395f()).mo8828a(z).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8823a((C3439a) new C3165d()).mo8824a((C3440b) new C3166e()).mo8825a((C3443a) new C3164c());
        a3.f9851t = i;
        if (this.f9149w.f23985o) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        a3.f9855x = i2;
        a3.f9853v = this.f9149w.f23986p;
        a3.f9854w = this.f9149w.f23987q;
        a3.f9856y = z4;
        String rOIResPath = C3617q.INST.getROIResPath();
        a3.f9857z = z5;
        a3.f9820A = rOIResPath;
        a3.f9821B = ((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_BACKGROUND_STOP_MIC.mo9431a()).booleanValue();
        if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.mo9431a()).intValue() == 1) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        C3442a i13 = a3.mo8839i(i3);
        Room room2 = this.f9129c;
        DataCenter dataCenter3 = this.f9131e;
        if ((room2 == null || !room2.isDouPlusPromotion) && (dataCenter3 == null || !((C2964a) dataCenter3.get("data_dou_plus_promote_entry", C2964a.defaultOne())).hasDouPlusEntry)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i13.mo8822a(300000);
        } else {
            i13.mo8822a((long) ((Integer) LiveConfigSettingKeys.LIVE_MAX_ENTER_BACKGROUND_TIME.mo9431a()).intValue());
        }
        int intValue4 = ((Integer) LiveConfigSettingKeys.LIVE_PUSH_STREAM_LOG_LEVEL.mo9431a()).intValue();
        C3831a.m9716d("LiveBroadcastFragment", "setLogLevel");
        MediaEngineFactory.setLogLevel(intValue4);
        AVLog.setupLogIODevice(new C3186e(C8064d.m16005b(), C8030b.PushStream.info));
        if (((Integer) C4525b.f12433g.mo10347b()).intValue() == 0) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        if (this.f9129c.isLiveTypeAudio()) {
            i4 = 4;
        }
        C3442a a4 = i13.mo8840j(i4).mo8833c(C3617q.INST.getModelFilePath()).mo8826a((Object) C3617q.INST.getResourceFinder(getContext()));
        C8725y yVar = this.f9149w;
        if (yVar.f23990t == 0) {
            i5 = 720;
        } else {
            i5 = yVar.f23990t;
        }
        C8725y yVar2 = this.f9149w;
        if (yVar2.f23991u == 0) {
            i6 = 1280;
        } else {
            i6 = yVar2.f23991u;
        }
        a4.mo8821a(i5, i6);
        if (((Integer) LiveConfigSettingKeys.LIVE_USE_EFFECT_ALGORITHM_mAB.mo9431a()).intValue() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        i13.f9828I = z3;
        this.f9121I = new C3430b(i13.mo8829a());
        this.f9121I.mo8296a((C3049b) this);
        if (this.f9129c.isLiveTypeAudio()) {
            this.f9134h.setBackgroundResource(R.drawable.bj5);
            this.f9144r = new AudioWidget(this, this.f9121I);
        } else {
            C5213c.m11821a(this.f9134h, this.f9129c.getOwner().getAvatarThumb(), (C14234d) new C4620v(5, (float) (C3922z.m9910c() / C3922z.m9908b()), null));
            this.f9144r = new VideoWidget2(this, this.f9149w, this.f9121I);
        }
        dataCenter.load(R.id.c4e, this.f9144r);
        int i14 = this.f9129c.getStreamUrl().f23775c;
        String str2 = this.f9149w.f23971a;
        if (2 == i14 && !C9431p.m18664a(str2)) {
            ((C4193l) C4116c.m10249a(C4193l.class)).roomManager().mo9630a((Handler) this.f9151y, str2);
            this.f9150x = true;
        }
        this.f9131e.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C4116c.m10249a(IMessageService.class)).messageManagerProvider(this.f9129c.getId(), true, getContext()));
        C3982g.m10091b(C3983a.ShowBInteractionFirstWidget);
        C3974b.m10061a().mo9377a(C3983a.ShowBInteractionFirstWidget.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9384b(C3983a.ShowBInteractionFirstWidget.name(), (C0184k) this, getContext());
        C0654k supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment a5 = supportFragmentManager.mo2224a("AbsInteractionFragment");
        if (a5 != null) {
            supportFragmentManager.mo2225a().mo2177a(a5).mo2195c();
        }
        if (getArguments() != null) {
            bundle2 = getArguments().getBundle("extra");
        } else {
            bundle2 = null;
        }
        this.f9130d = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createInteractionFragment(1);
        this.f9130d.setArguments(bundle2);
        this.f9130d.mo9582a(this.f9121I);
        this.f9131e.lambda$put$1$DataCenter("data_room", this.f9129c);
        this.f9130d.mo9585a(this.f9131e, true, new C4185a() {
            /* renamed from: a */
            public final void mo8464a(C7861cb cbVar) {
                if (C3134c.this.f9136j != null) {
                    C3134c.this.f9136j.mo8531a(cbVar);
                }
            }
        }, null);
        if (!this.f9129c.isLiveTypeAudio()) {
            this.f9130d.mo9583a((C5281ao) this.f9144r);
            ((C3772g) this.f9144r).mo9102a((C3033b) this.f9130d);
            ((C3772g) this.f9144r).mo9101a((C3032a) this.f9130d);
            this.f9130d.mo9586a((Runnable) new C3447i(this));
        }
        C4184d dVar = this.f9130d;
        if (this.f9129c.isLiveTypeAudio()) {
            mVar = C8710m.AUDIO;
        } else {
            mVar = C8710m.VIDEO;
        }
        dVar.mo9584a(mVar);
        this.f9130d.show(getActivity().getSupportFragmentManager(), "AbsInteractionFragment");
        if (this.f9129c != null && !this.f9129c.isLiveTypeAudio()) {
            C3297n.m9029a(this.f9129c.getId());
        }
        this.f9122J = new PhoneStateReceiver(this);
        ((IGiftService) C4116c.m10249a(IGiftService.class)).syncGiftList(this.f9125M, this.f9129c.getId(), 2, true);
        C6600d b2 = C6610k.m13986b();
        b2.mo12668a(C6605h.FILTER, (C6601a) new C3149c());
        b2.mo12668a(C6605h.BEAUTY, (C6601a) new C3148b());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f9130d != null) {
            this.f9130d.onActivityResult(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.akk, viewGroup, false);
        inflate.setBackgroundColor(Color.parseColor("#303342"));
        return inflate;
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        if (!this.f9126O) {
            this.f9126O = true;
            this.f9134h.post(new C3396g(this));
        }
        this.f9121I.mo8301a(eGLContext, i, i2, i3, i4, j);
    }

    /* renamed from: a */
    static final /* synthetic */ void m8708a(C8064d dVar, String str, int i, String str2, String str3, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdktag", str2);
            jSONObject.put("sdkmsg", str3);
            if (th != null) {
                jSONObject.put("throwable", th);
            }
            switch (i) {
                case 2:
                case 3:
                    dVar.mo9200b(str, jSONObject);
                    return;
                case 4:
                    dVar.mo9198a(str, jSONObject);
                    return;
                case 5:
                    if (!TextUtils.isEmpty(str)) {
                        C3831a.m9715c(str, dVar.mo9195a(str, jSONObject, null));
                        return;
                    }
                    break;
                case 6:
                case 7:
                    if (!TextUtils.isEmpty(str)) {
                        C3831a.m9716d(str, dVar.mo9195a(str, jSONObject, null));
                        break;
                    } else {
                        return;
                    }
            }
        } catch (JSONException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("errtag", e.getClass());
            hashMap.put("AVLog.ILogFilter", e.getMessage());
            dVar.mo9201c("LiveBroadcastFragment", (Map<String, ?>) hashMap);
        }
    }
}
