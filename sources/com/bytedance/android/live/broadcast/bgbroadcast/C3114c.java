package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.C3023a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.bgbroadcast.p199a.C3089f;
import com.bytedance.android.live.broadcast.bgbroadcast.p200b.C3110b;
import com.bytedance.android.live.broadcast.p198b.C3072h;
import com.bytedance.android.live.broadcast.p203e.C3187a;
import com.bytedance.android.live.broadcast.p203e.C3187a.C3188a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3862aa;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4184d;
import com.bytedance.android.live.room.C4184d.C4185a;
import com.bytedance.android.live.room.C4187f;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.C8580y;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5177aw;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6170b;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6171c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.C8601a;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.C8868a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.p975o.C14234d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.c */
public final class C3114c extends C3846a implements C0199s<KVData>, C3133n, C3188a, C8677a {

    /* renamed from: a */
    public C8601a f9079a = null;

    /* renamed from: b */
    public Room f9080b;

    /* renamed from: c */
    public DataCenter f9081c;

    /* renamed from: d */
    public C4184d f9082d;

    /* renamed from: e */
    public C6164eu f9083e;

    /* renamed from: f */
    public C3187a f9084f;

    /* renamed from: g */
    public C3106b f9085g;

    /* renamed from: h */
    private boolean f9086h;

    /* renamed from: i */
    private boolean f9087i;

    /* renamed from: j */
    private C4128f f9088j = new C4128f() {
        /* renamed from: a */
        public final void mo8456a(List<C7505d> list) {
        }

        /* renamed from: b */
        public final void mo8457b(List<GiftPage> list) {
        }
    };

    /* renamed from: k */
    private ServiceConnection f9089k = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            C3114c.this.f9079a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (C3114c.this.f9081c != null) {
                C3114c.this.f9079a = (C8601a) iBinder;
                if (C3114c.this.f9079a.isLiveFinished()) {
                    C3831a.m9707a("BgBroadcastFragment", "room close onServiceConnected isLiveFinished");
                    C3114c.this.mo8444d();
                    return;
                }
                C3114c.this.f9079a.setLiveStatusListener(new C3130k(this));
                if (C3114c.this.f9085g != null && C3114c.this.f9085g.mo8398g()) {
                    if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo9431a()).intValue() == 0 && (C3114c.this.f9085g instanceof C3089f)) {
                        C3114c.this.f9079a.startStream(C3114c.this.f9085g.mo8399h());
                    } else if (C3114c.this.f9085g instanceof C3110b) {
                        C3114c.this.f9079a.startStream(C3114c.this.f9085g.mo8399h());
                    }
                }
                if (!(C3114c.this.f9080b == null || C3114c.this.f9081c == null || C3114c.this.f9081c.get("data_message_manager", null) != null)) {
                    C3114c.this.f9081c.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C4116c.m10249a(IMessageService.class)).messageManagerProvider(C3114c.this.f9080b.getId(), false, C3114c.this.getContext()));
                }
                C3114c.this.mo8442c();
            }
        }
    };

    /* renamed from: l */
    private C4128f f9090l = new C4128f() {
        /* renamed from: a */
        public final void mo8456a(List<C7505d> list) {
        }

        /* renamed from: b */
        public final void mo8457b(List<GiftPage> list) {
        }
    };

    /* renamed from: m */
    private C3072h f9091m;

    /* renamed from: n */
    private boolean f9092n;

    /* renamed from: o */
    private int f9093o;

    public final void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    public final void mo8438a(boolean z, String str) {
        if (mo8452l()) {
            m8658o();
            this.f9083e.mo12196a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo8437a(boolean z, CharSequence charSequence, String str) {
        if (mo8452l()) {
            m8658o();
            this.f9083e.mo12195a(false, null, new OnClickListener(null) {
                public final void onClick(View view) {
                    ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(C3114c.this.getContext(), C4704c.m11227b(null).mo10506a(true));
                }
            });
        }
    }

    /* renamed from: l */
    public final boolean mo8452l() {
        if (!this.f9086h) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ Activity mo8453m() {
        return super.getActivity();
    }

    /* renamed from: o */
    private void m8658o() {
        if (this.f9083e == null) {
            this.f9083e = C6164eu.m13343a((Context) getActivity(), 1);
        }
    }

    /* renamed from: e */
    public final C8868a mo8445e() {
        return (C8868a) this.f9081c.get("data_room_text_message_presenter", null);
    }

    /* renamed from: f */
    public final void mo8446f() {
        if (this.f9079a != null) {
            this.f9079a.startAudio();
        }
    }

    /* renamed from: g */
    public final void mo8447g() {
        if (mo8452l()) {
            m8659p();
        }
    }

    /* renamed from: h */
    public final void mo8448h() {
        C4204a.m10422a(getContext(), (int) R.string.es6, 5000);
    }

    /* renamed from: j */
    public final void mo8450j() {
        if (this.f9079a != null) {
            this.f9079a.stopAudio();
        }
    }

    /* renamed from: k */
    public final void mo8451k() {
        if (this.f9079a != null) {
            this.f9079a.startBgActivity();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo8454n() {
        if (mo8452l() && this.f9085g != null) {
            this.f9085g.mo8396e();
        }
    }

    public final void onPause() {
        super.onPause();
        this.f9085g.mo8394c();
    }

    public final void onResume() {
        super.onResume();
        this.f9085g.mo8393b();
    }

    /* renamed from: i */
    public final void mo8449i() {
        m8657a(8);
        m8661r();
        C3831a.m9707a("BgBroadcastFragment", "room close forceEndLive");
        mo8444d();
    }

    /* renamed from: p */
    private void m8659p() {
        if (this.f9091m == null) {
            this.f9091m = C3072h.m8560a(getContext(), this.f9084f);
            this.f9084f.f9246h = this.f9091m;
        }
        if (getActivity() != null) {
            this.f9091m.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    /* renamed from: q */
    private void m8660q() {
        if (this.f9082d != null) {
            this.f9082d.mo9589d();
            getActivity().getSupportFragmentManager().mo2225a().mo2177a((Fragment) this.f9082d).mo2200e();
            this.f9082d = null;
            C8580y.m16962a().mo15067b();
        }
    }

    /* renamed from: r */
    private void m8661r() {
        try {
            if (this.f9079a != null) {
                this.f9079a.stopService();
            }
            if (this.f9087i) {
                getActivity().stopService(m8656a(getContext()));
                this.f9087i = false;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo8431a() {
        try {
            if (C7182h.m14893a("control_view") != null) {
                C7182h.m14893a("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) != null) {
                C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).dismiss();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public final boolean mo8441b() {
        List<Fragment> f = getActivity().getSupportFragmentManager().mo2238f();
        if (f != null) {
            for (Fragment fragment : f) {
                if ((fragment instanceof C8614a) && ((C8614a) fragment).mo8466a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void onStart() {
        super.onStart();
        if (!((Boolean) C4525b.f12361ad.mo10345a()).booleanValue()) {
            getActivity().bindService(m8656a(getContext()), this.f9089k, 1);
        }
    }

    public final void onDestroy() {
        if (this.f9080b != null) {
            ((IMessageService) C4116c.m10249a(IMessageService.class)).release(this.f9080b.getId());
            LinkCrossRoomDataHolder.m11105a(this.f9080b.getId());
        }
        m8660q();
        if (this.f9084f != null) {
            this.f9084f.mo8247a();
            this.f9084f = null;
        }
        if (this.f9083e != null && this.f9083e.isShowing()) {
            this.f9083e.dismiss();
        }
        this.f9083e = null;
        if (this.f9085g != null) {
            this.f9085g.mo8395d();
            this.f9085g = null;
        }
        if (this.f9081c != null) {
            this.f9081c.removeObserver(this);
        }
        super.onDestroy();
        this.f9086h = true;
    }

    /* renamed from: c */
    public final void mo8442c() {
        Bundle bundle;
        C8710m mVar;
        if (mo8452l() && this.f9081c != null) {
            C0654k supportFragmentManager = getActivity().getSupportFragmentManager();
            if (supportFragmentManager.mo2224a("AbsInteractionFragment") == null) {
                if (getArguments() != null) {
                    bundle = getArguments().getBundle("extra");
                } else {
                    bundle = null;
                }
                this.f9082d = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createInteractionFragment(getActivity().getRequestedOrientation());
                this.f9082d.setArguments(bundle);
                this.f9081c.lambda$put$1$DataCenter("data_room", this.f9080b);
                this.f9082d.mo9585a(this.f9081c, true, new C4185a() {
                    /* renamed from: a */
                    public final void mo8464a(C7861cb cbVar) {
                        if (C3114c.this.f9084f != null) {
                            C3114c.this.f9084f.mo8531a(cbVar);
                        }
                    }
                }, null);
                if (this.f9081c != null) {
                    this.f9081c.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C5177aw(this.f9092n, this.f9093o));
                }
                C4184d dVar = this.f9082d;
                if (this.f9080b.isScreenshot) {
                    mVar = C8710m.SCREEN_RECORD;
                } else {
                    mVar = C8710m.THIRD_PARTY;
                }
                dVar.mo9584a(mVar);
                C0679r a = supportFragmentManager.mo2225a();
                a.mo2178a((Fragment) this.f9082d, "AbsInteractionFragment");
                a.mo2200e();
                this.f9082d.mo9586a((Runnable) new C3124e(this));
            }
        }
    }

    /* renamed from: d */
    public final void mo8444d() {
        boolean z = true;
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(1);
        }
        if (this.f9085g != null) {
            this.f9085g.mo8400i();
        }
        try {
            if (C7182h.m14893a("control_view") != null) {
                C7182h.m14893a("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) != null) {
                C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).dismiss();
            }
        } catch (Throwable unused2) {
        }
        if (mo8452l()) {
            FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.aai);
            if (frameLayout.getChildCount() <= 0) {
                m8660q();
                frameLayout.setVisibility(0);
                C3831a.m9707a("BgBroadcastFragment", "room close new LiveBroadcastEndFragment");
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USE_NEW_BROADCAST_END.mo9431a()).booleanValue() || TextUtils.isEmpty(this.f9080b.finish_url)) {
                    z = false;
                }
                C4187f createLiveBroadcastEndFragment = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createLiveBroadcastEndFragment(z);
                createLiveBroadcastEndFragment.mo9601a(getActivity(), this.f9080b, C3125f.f9105a, "");
                C0679r a = getActivity().getSupportFragmentManager().mo2225a();
                if (this.f9082d != null && this.f9082d.isAdded()) {
                    a.mo2177a((Fragment) this.f9082d);
                }
                this.f9082d = null;
                try {
                    a.mo2176a(R.id.aai, (Fragment) createLiveBroadcastEndFragment, "live_end").mo2195c();
                } catch (Throwable th) {
                    C3831a.m9716d("BgBroadcastFragmentadd LiveBroadcastEndFragment", th.toString());
                }
                if (this.f9085g != null) {
                    this.f9085g.mo8397f();
                }
                m8661r();
                mo8431a();
            }
        }
    }

    /* renamed from: a */
    public final void mo8433a(CharSequence charSequence) {
        if (mo8452l()) {
            m8658o();
            this.f9083e.mo12194a(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo8439b(CharSequence charSequence) {
        if (mo8452l()) {
            m8658o();
            this.f9083e.mo12197b(charSequence);
        }
    }

    /* renamed from: c */
    public final void mo8443c(boolean z) {
        if (this.f9079a != null) {
            this.f9079a.startStream(false);
        }
    }

    /* renamed from: a */
    private static Intent m8656a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ((IHostApp) C4116c.m10249a(IHostApp.class)).getBgBroadcastServiceName()));
        return intent;
    }

    public final void onEvent(C5204w wVar) {
        switch (wVar.f13924a) {
            case 5:
                m8661r();
                getActivity().finish();
                return;
            case 6:
            case 8:
                mo8440b(false);
                return;
            case 7:
                m8657a(1);
                C3831a.m9707a("BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                mo8444d();
                return;
            default:
                if (this.f9085g != null) {
                    this.f9085g.onEvent(wVar);
                }
                return;
        }
    }

    /* renamed from: a */
    private void m8657a(int i) {
        if (this.f9080b.isThirdParty) {
            C3395f.m9156f().mo8742c().mo9024g().sendStatus(this.f9080b.getId(), 4, this.f9080b.getStreamId(), i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a(C3128i.f9110a, C3129j.f9111a);
        }
        if (this.f9079a != null) {
            this.f9079a.stopStream(i);
        }
        this.f9084f.mo8534e();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1559753544) {
                if (hashCode == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                    c = 1;
                }
            } else if (key.equals("text_msg_widget_ready")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if ((this.f9085g instanceof C3089f) && this.f9081c.get("data_room_text_message_presenter", null) != null) {
                        C3089f fVar = (C3089f) this.f9085g;
                        C8868a aVar = (C8868a) this.f9081c.get("data_room_text_message_presenter", null);
                        if (!(aVar == null || fVar.f9036h == null)) {
                            fVar.f9036h.setPresenter(aVar);
                        }
                        return;
                    }
                case 1:
                    m8659p();
                    this.f9084f.f9243e = false;
                    break;
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Room room;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        C4193l lVar = (C4193l) C4116c.m10249a(C4193l.class);
        if (lVar != null) {
            room = lVar.getCurrentRoom();
        } else {
            room = null;
        }
        this.f9080b = room;
        if (!Room.isValid(this.f9080b) || !this.f9080b.isPullUrlValid()) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f9081c = DataCenter.create(C0214z.m438a((Fragment) this), this);
        this.f9081c.observeForever("text_msg_widget_ready", this);
        this.f9081c.observe("cmd_show_illegal_dialog", this);
        C3862aa.m9793a(getActivity());
        ((C4002ac) C4495a.m10823a().mo10300a(C5204w.class).mo6513a(C4064k.m10180a(this)).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C3123d<Object>(this));
    }

    /* renamed from: b */
    public final void mo8440b(boolean z) {
        Object obj;
        int i;
        String str;
        CharSequence charSequence = 0;
        if (this.f9081c != null) {
            obj = this.f9081c.get("data_member_count");
        } else {
            obj = null;
        }
        if (obj == null || !(obj instanceof Integer)) {
            i = 0;
        } else {
            i = ((Integer) obj).intValue();
        }
        if (i <= 0) {
            str = C3922z.m9903a((int) R.string.eeq);
        } else {
            str = getResources().getQuantityString(R.plurals.w, i, new Object[]{Integer.valueOf(i)});
        }
        if (!TextUtils.isEmpty(str) && i > 0) {
            String valueOf = String.valueOf(i);
            int indexOf = str.indexOf(valueOf);
            if (indexOf != -1) {
                Spannable spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(-56832), indexOf, valueOf.length() + indexOf, 34);
                charSequence = spannableString;
            }
        }
        long j = 0;
        if (this.f9080b != null) {
            j = this.f9080b.getId();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        C8049c.m15979a().mo14202a("anchor_close_live_popup", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
        C8552a a = new C8552a(getContext()).mo15012d((int) R.string.f37);
        if (charSequence == 0) {
            charSequence = str;
        }
        a.mo15009c(charSequence).mo15003b(0, (int) R.string.exh, (DialogInterface.OnClickListener) new C3126g(this, hashMap, z)).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) new C3127h(hashMap)).mo15002b(z);
    }

    public final void onActivityCreated(Bundle bundle) {
        C3862aa.m9793a(getActivity());
        super.onActivityCreated(bundle);
        if (C3894h.m9842a(getActivity()) && getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(48);
        }
        if (!Room.isValid(this.f9080b) || !this.f9080b.isPullUrlValid() || C8830k.m17330d() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        LinkCrossRoomDataHolder.m11104a(this.f9080b.getId(), C0214z.m438a((Fragment) this), this);
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
        this.f9084f = new C3187a(this.f9080b.getId(), getContext());
        this.f9084f.mo8520a(this);
        if (this.f9080b.isScreenshot) {
            this.f9085g = new C3089f(this.f9080b, this);
        } else {
            this.f9085g = new C3110b(this.f9080b, this);
        }
        this.f9085g.mo8392a();
        if (!((Boolean) C4525b.f12361ad.mo10345a()).booleanValue()) {
            if (VERSION.SDK_INT >= 26) {
                getActivity().startForegroundService(m8656a(getContext()));
            } else {
                getActivity().startService(m8656a(getContext()));
            }
            this.f9087i = true;
        } else {
            C3831a.m9707a("BgBroadcastFragment", "room close LIVE_GAME_QUIT_CLICKED is true");
            mo8444d();
        }
        ((IGiftService) C4116c.m10249a(IGiftService.class)).syncGiftList(this.f9090l, this.f9080b.getId(), 2, true);
        if (this.f9080b.isScreenshot && VERSION.SDK_INT >= 21 && ((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo9431a()).intValue() == 1) {
            C3023a.m8461a().mo8215b();
            startActivityForResult(((MediaProjectionManager) getActivity().getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
        }
    }

    /* renamed from: a */
    public final void mo8435a(boolean z) {
        if (mo8452l() && this.f9083e != null) {
            m8658o();
            if (z) {
                this.f9083e.setCancelable(false);
                this.f9083e.show();
                this.f9083e.mo12193a((OnClickListener) new OnClickListener() {
                    public final void onClick(View view) {
                        if (C3114c.this.f9084f != null) {
                            C3114c.this.f9084f.mo8532b();
                            C3114c.this.f9083e.dismiss();
                        }
                    }
                });
                this.f9083e.f16544a = new C6170b() {
                    /* renamed from: a */
                    public final void mo8462a() {
                        C4204a.m10424a(C3114c.this.getContext(), C3922z.m9903a((int) R.string.eol), 1);
                    }
                };
                this.f9083e.f16545b = new C6171c() {
                    /* renamed from: a */
                    public final void mo8463a() {
                        C4204a.m10424a(C3114c.this.getContext(), C3922z.m9903a((int) R.string.eol), 1);
                    }
                };
                return;
            }
            this.f9083e.dismiss();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!Room.isValid(this.f9080b) || !this.f9080b.isPullUrlValid()) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        float a = (float) (C9432q.m18670a(getContext()) / C9432q.m18688b(getContext()));
        C5213c.m11821a((HSImageView) getView().findViewById(R.id.iz), this.f9080b.getOwner().getAvatarThumb(), (C14234d) new C4620v(5, a, null));
        C5213c.m11821a((HSImageView) getView().findViewById(R.id.dox), this.f9080b.getOwner().getAvatarThumb(), (C14234d) new C4620v(5, a, null));
    }

    /* renamed from: a */
    public final void mo8432a(int i, int i2) {
        if (i > i2) {
            this.f9092n = true;
            this.f9093o = ((i2 * C3922z.m9910c()) / i) + ((int) C9432q.m18687b(getContext(), 96.0f));
        } else {
            this.f9092n = false;
        }
        if (this.f9082d != null) {
            this.f9081c.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C5177aw(this.f9092n, this.f9093o));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.agj, viewGroup, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000 && i2 == -1 && this.f9079a != null) {
            this.f9079a.setData(intent, this.f9085g.mo8399h());
            this.f9079a.startStream(this.f9085g.mo8399h());
            if (this.f9081c != null && this.f9081c.get("data_message_manager", null) == null) {
                this.f9081c.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C4116c.m10249a(IMessageService.class)).messageManagerProvider(this.f9080b.getId(), false, getContext()));
            }
            mo8442c();
        }
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo8436a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (mo8452l() && this.f9082d != null) {
            this.f9082d.mo9587a(z, charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8434a(HashMap hashMap, boolean z, DialogInterface dialogInterface, int i) {
        C8049c.m15979a().mo14202a("anchor_close_live_confirm", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
        dialogInterface.dismiss();
        C4525b.f12361ad.mo10346a(Boolean.valueOf(true));
        m8657a(1);
        mo8444d();
        if (z) {
            this.f9079a.startBgActivity();
        }
    }
}
