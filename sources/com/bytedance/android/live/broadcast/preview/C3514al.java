package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.effect.C3236c;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3266p.C3271a;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p198b.C3066c;
import com.bytedance.android.live.broadcast.p198b.C3066c.C3067a;
import com.bytedance.android.live.broadcast.p198b.C3076j.C3077a;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView.C3620a;
import com.bytedance.android.live.broadcast.share.C3622b;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.C4192k;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C4220b;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdk.p279af.C4571ak;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.p416t.C8299d;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.C8803g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p672e.C10753b;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.preview.al */
public final class C3514al extends C3846a implements C3067a, C3077a, C3620a, C8682e, C9382a {

    /* renamed from: a */
    static C17971f f10002a = C2942b.m8369a();

    /* renamed from: s */
    private static String f10003s = "https://webcast.tiktokv.com/falcon/webcast_mt/page/obs_intro/index.html";

    /* renamed from: A */
    private EditText f10004A;

    /* renamed from: B */
    private int f10005B;

    /* renamed from: F */
    private int f10006F;

    /* renamed from: G */
    private TextView f10007G;

    /* renamed from: H */
    private View f10008H;

    /* renamed from: I */
    private View f10009I;

    /* renamed from: J */
    private View f10010J;

    /* renamed from: K */
    private View f10011K;

    /* renamed from: L */
    private View f10012L;

    /* renamed from: M */
    private View f10013M;

    /* renamed from: N */
    private View f10014N;

    /* renamed from: O */
    private View f10015O;

    /* renamed from: P */
    private View f10016P;

    /* renamed from: Q */
    private View f10017Q;

    /* renamed from: R */
    private TextView f10018R;

    /* renamed from: S */
    private View f10019S;

    /* renamed from: T */
    private View f10020T;

    /* renamed from: U */
    private TextView f10021U;

    /* renamed from: V */
    private View f10022V;

    /* renamed from: W */
    private C3066c f10023W;

    /* renamed from: X */
    private ImageView f10024X;

    /* renamed from: Y */
    private TextView f10025Y;

    /* renamed from: Z */
    private View f10026Z;

    /* renamed from: aa */
    private ImageView f10027aa;

    /* renamed from: ab */
    private TextView f10028ab;

    /* renamed from: ac */
    private TextView f10029ac;

    /* renamed from: ad */
    private View f10030ad;

    /* renamed from: ae */
    private View f10031ae;

    /* renamed from: af */
    private View f10032af;

    /* renamed from: ag */
    private View f10033ag;

    /* renamed from: ah */
    private AbsStartLiveShareView f10034ah;

    /* renamed from: ai */
    private C3236c f10035ai;

    /* renamed from: aj */
    private boolean f10036aj;

    /* renamed from: ak */
    private C10753b f10037ak;

    /* renamed from: al */
    private C4703e f10038al;

    /* renamed from: am */
    private Game f10039am;

    /* renamed from: an */
    private String f10040an;

    /* renamed from: ao */
    private ProgressDialog f10041ao;

    /* renamed from: ap */
    private String f10042ap;

    /* renamed from: aq */
    private C1690c f10043aq;

    /* renamed from: ar */
    private boolean f10044ar;

    /* renamed from: as */
    private OnClickListener f10045as;

    /* renamed from: at */
    private C3199a f10046at;

    /* renamed from: b */
    public Activity f10047b;

    /* renamed from: c */
    public View f10048c;

    /* renamed from: d */
    CheckedTextView f10049d;

    /* renamed from: e */
    C8548h f10050e;

    /* renamed from: f */
    public HSImageView f10051f;

    /* renamed from: g */
    public TextView f10052g;

    /* renamed from: h */
    public C4182c f10053h;

    /* renamed from: i */
    public C3007g f10054i;

    /* renamed from: j */
    public String f10055j;

    /* renamed from: k */
    public C8681d f10056k;

    /* renamed from: l */
    public C8710m f10057l;

    /* renamed from: m */
    public User f10058m;

    /* renamed from: n */
    public final C1689b f10059n;

    /* renamed from: o */
    int f10060o;

    /* renamed from: p */
    public int f10061p;

    /* renamed from: q */
    C4220b f10062q;

    /* renamed from: r */
    boolean f10063r;

    /* renamed from: t */
    private C9381g f10064t;

    /* renamed from: u */
    private View f10065u;

    /* renamed from: v */
    private Room f10066v;

    /* renamed from: w */
    private boolean f10067w;

    /* renamed from: x */
    private ImageView f10068x;

    /* renamed from: y */
    private View f10069y;

    /* renamed from: z */
    private HSImageView f10070z;

    /* renamed from: n */
    public final Fragment mo8913n() {
        return this;
    }

    /* renamed from: g */
    public final String mo8907g() {
        return C3617q.INST.getBeautyFilePath();
    }

    /* renamed from: h */
    public final String mo8908h() {
        return C3617q.INST.getFaceReshapeFilePath();
    }

    /* renamed from: j */
    public final int mo8910j() {
        return ((Integer) C4525b.f12433g.mo10347b()).intValue();
    }

    public final void onPause() {
        super.onPause();
        if (!this.f10044ar) {
            this.f10064t.removeMessages(2333);
        }
    }

    /* renamed from: o */
    private boolean m9329o() {
        Boolean bool = (Boolean) this.f10010J.getTag(R.id.d5k);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: p */
    private void m9330p() {
        View view = this.f10014N;
        int i = 8;
        if (!(this.f10021U.getVisibility() == 8 && this.f10048c.getVisibility() == 8)) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: r */
    private static float m9332r() {
        return ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * ((Float) C4525b.f12318N.mo10345a()).floatValue();
    }

    /* renamed from: m */
    public final void mo8912m() {
        if (this.f10050e != null && this.f10050e.isShowing()) {
            this.f10050e.dismiss();
        }
    }

    /* renamed from: q */
    private int m9331q() {
        C5728aq aqVar = (C5728aq) f10002a.mo34884a((String) ((Map) C4525b.f12315K.mo10345a()).get(this.f10057l.name()), C5728aq.class);
        if (aqVar == null) {
            return -1;
        }
        return aqVar.f15081a;
    }

    /* renamed from: b */
    public final void mo8902b() {
        if (!C3617q.INST.isLoadedRes()) {
            C8828a.LiveResource.preload();
            if (this.f10050e == null) {
                this.f10050e = new C8552a(getContext(), 2).mo15005b((OnDismissListener) new C3529as(this)).mo15011d();
            }
            C3617q.INST.isLoadedRes.observe(this, new C3530at(this));
        }
    }

    /* renamed from: i */
    public final List<Pair<String, String>> mo8909i() {
        ArrayList arrayList = new ArrayList();
        for (FilterModel filterModel : C3266p.m8943a().f9434b) {
            arrayList.add(new Pair(filterModel.getName(), filterModel.getFilterPath()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m9325d() {
        ((C8777a) C4116c.m10249a(C8777a.class)).mo15489b().mo15407a((C8738a) C4528e.LAST_SHARE_CHANNEL, this.f10042ap);
        C4525b.f12445s.mo10346a(this.f10042ap);
        C8049c.m15979a().mo14203a("live_action", new Object[0]);
        if (this.f10066v != null) {
            if (!C8828a.LiveResource.isInstalled()) {
                C8828a.LiveResource.checkInstall(this.f10047b, new C8768a() {
                    /* renamed from: a */
                    public final void mo8214a(String str) {
                        C8828a.LiveResource.load(C3514al.this.f10047b, true);
                        C3514al.this.mo8896a();
                    }
                });
            } else {
                mo8896a();
            }
        }
    }

    /* renamed from: c */
    public final void mo8904c() {
        if (this.f10032af != null) {
            C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
            if (C8607a.f23572a || a == null || !a.isEnableShowCommerceSale() || this.f10057l != C8710m.VIDEO) {
                this.f10032af.setVisibility(8);
                return;
            }
            this.f10032af.setVisibility(0);
            ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).liveCommerceService().mo9607b(Long.valueOf(a.getId())).mo6505a((C1710e<? super T>) new C3531au<Object>(this), (C1710e<? super Throwable>) new C3532av<Object>(this));
        }
    }

    /* renamed from: k */
    public final void mo8911k() {
        if (C8828a.LiveResource.isInstalled()) {
            mo8902b();
        } else if (!C3548bk.m9365a(this.f10047b)) {
            C4204a.m10421a((Context) this.f10047b, (int) R.string.e79);
        } else if (C9425l.m18652c(this.f10047b) == C9426a.MOBILE_2G) {
            C4204a.m10421a((Context) this.f10047b, (int) R.string.ex9);
        } else {
            if (this.f10061p <= 3) {
                C8828a.LiveResource.checkInstall(getContext(), new C8768a() {
                    /* renamed from: a */
                    public final void mo8214a(String str) {
                        if (!C3547bj.m9364a(C3514al.this.f10047b)) {
                            C4204a.m10421a((Context) C3514al.this.f10047b, (int) R.string.e79);
                        } else if (C9425l.m18652c(C3514al.this.f10047b) == C9426a.MOBILE_2G) {
                            C4204a.m10421a((Context) C3514al.this.f10047b, (int) R.string.ex9);
                        } else {
                            C3514al.this.mo8902b();
                        }
                    }
                });
            }
        }
    }

    public final void onDestroyView() {
        if (!this.f10044ar) {
            C3266p.m8943a().mo8632b((C3271a) new C3540bc(this));
            if (this.f10023W != null && this.f10023W.isShowing()) {
                this.f10023W.dismiss();
                this.f10023W.f8945a = null;
            }
            if (this.f10050e != null && this.f10050e.isShowing()) {
                this.f10050e.dismiss();
            }
            if (this.f10053h != null) {
                this.f10053h.mo9579b();
                this.f10053h = null;
            }
            this.f10023W = null;
            if (this.f10043aq != null && !this.f10043aq.isDisposed()) {
                this.f10043aq.dispose();
            }
            this.f10055j = null;
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10494a(this.f10038al);
            this.f10059n.mo6180a();
        }
        super.onDestroyView();
    }

    /* renamed from: e */
    private boolean m9327e() {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(getActivity(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev_)).mo14539a(-1).mo14544d("video_take").mo14545e("open_live").mo14543c("bottom_tab").mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                public final void onSubscribe(C1690c cVar) {
                    super.onSubscribe(cVar);
                    C3514al.this.f10059n.mo6181a(cVar);
                }
            });
            return false;
        } else if (!C3548bk.m9365a(this.f10047b)) {
            C4204a.m10421a((Context) this.f10047b, (int) R.string.e79);
            return false;
        } else if (C9425l.m18652c(this.f10047b) == C9426a.MOBILE_2G) {
            C4204a.m10421a((Context) this.f10047b, (int) R.string.ex9);
            return false;
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(getActivity(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev_)).mo14539a(-1).mo14544d("video_take").mo14545e("open_live").mo14543c("bottom_tab").mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                public final void onSubscribe(C1690c cVar) {
                    super.onSubscribe(cVar);
                    C3514al.this.f10059n.mo6181a(cVar);
                }
            });
            return false;
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a().childrenManagerForbidCreateLiveRoom()) {
            return true;
        } else {
            C4204a.m10421a((Context) this.f10047b, (int) R.string.e4y);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo8896a() {
        Class cls;
        try {
            Activity activity = this.f10047b;
            if (this.f10057l.isStreamingBackground) {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(6);
            } else {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(5);
            }
            Intent intent = new Intent(activity, cls);
            if (C8710m.THIRD_PARTY == this.f10057l || C8710m.SCREEN_RECORD == this.f10057l) {
                C4525b.f12361ad.mo10346a(Boolean.valueOf(false));
            }
            if (C8710m.SCREEN_RECORD == this.f10057l) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", m9329o());
            }
            C4525b.f12314J.mo10346a(this.f10057l.name());
            this.f10047b.startActivity(intent);
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(this.f10066v);
            ((C8777a) C4116c.m10249a(C8777a.class)).mo15488a().mo15411a(true);
            this.f10047b.finish();
            this.f10047b.overridePendingTransition(0, 0);
            ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager().mo8930a();
        } catch (Exception unused) {
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f10044ar) {
            if (this.f10067w) {
                m9325d();
                this.f10067w = false;
            }
            if (this.f10056k != null) {
                this.f10056k.mo8943a(m9332r());
                this.f10056k.mo8947b(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * ((Float) C4525b.f12319O.mo10345a()).floatValue());
                this.f10056k.mo8949c(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * ((Float) C4525b.f12320P.mo10345a()).floatValue());
                this.f10056k.mo8950d(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * ((Float) C4525b.f12321Q.mo10345a()).floatValue());
            }
            if (!this.f10036aj) {
                if (!C8299d.m16446a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.f10035ai == null || this.f10035ai.getDialog() == null || !this.f10035ai.getDialog().isShowing())) {
                    this.f10048c.setVisibility(0);
                    this.f10048c.setOnClickListener(this.f10045as);
                    m9330p();
                }
            }
            this.f10048c.setVisibility(8);
            m9330p();
        }
    }

    /* renamed from: f */
    private void m9328f() {
        String str;
        boolean z;
        this.f10006F = 10001;
        if (m9327e()) {
            if (this.f10057l != C8710m.THIRD_PARTY || m9331q() != -1) {
                if (this.f10057l.isStreamingBackground) {
                    Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                    if (currentRoom != null && ((currentRoom.isScreenshot && this.f10057l == C8710m.SCREEN_RECORD) || (currentRoom.isThirdParty && this.f10057l == C8710m.THIRD_PARTY))) {
                        this.f10066v = currentRoom;
                        m9325d();
                        return;
                    }
                }
                long j = 0;
                if (this.f10057l == C8710m.SCREEN_RECORD) {
                    if (VERSION.SDK_INT >= 21) {
                        Game game = this.f10039am;
                        if (game == null) {
                            C4575an.m10981a((int) R.string.f1z);
                            this.f10013M.performClick();
                            return;
                        }
                        j = game.gameId;
                        if (BgBroadcastServiceImpl.getProjection() == null) {
                            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                            if (mediaProjectionManager == null) {
                                C4575an.m10981a((int) R.string.f1x);
                                return;
                            } else {
                                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 20001);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                long j2 = j;
                this.f10006F = 109;
                if (this.f10041ao == null) {
                    this.f10041ao = C4571ak.m10972a(this.f10047b, getString(R.string.e8x));
                }
                if (!this.f10041ao.isShowing()) {
                    this.f10041ao.show();
                }
                String obj = this.f10004A.getText().toString();
                m9323b(obj);
                C4192k roomManager = ((C4193l) C4116c.m10249a(C4193l.class)).roomManager();
                C9381g gVar = this.f10064t;
                if (this.f10054i == null) {
                    str = null;
                } else {
                    str = (String) this.f10054i.f8841b.get(0);
                }
                String str2 = str;
                C8710m mVar = this.f10057l;
                int q = m9331q();
                if (this.f10057l != C8710m.VIDEO || this.f10049d == null || !this.f10049d.isChecked()) {
                    z = false;
                } else {
                    z = true;
                }
                roomManager.mo9631a(gVar, obj, str2, mVar, q, j2, z, 1);
                C8068g.m16014a((Context) this.f10047b);
            } else if (getActivity() != null) {
                new C8552a(getActivity(), 0).mo14996a(false).mo15009c((CharSequence) getActivity().getString(R.string.eyr)).mo15003b(0, (int) R.string.e42, (DialogInterface.OnClickListener) new C3526ap(this)).mo15011d();
            }
        }
    }

    /* renamed from: a */
    public final void mo8898a(C8681d dVar) {
        this.f10056k = dVar;
    }

    /* renamed from: b */
    public final void mo8903b(int i) {
        this.f10005B = i;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void onEvent(C5206y yVar) {
        mo8904c();
    }

    /* renamed from: a */
    public final void mo8899a(String str) {
        this.f10042ap = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8897a(int i) {
        this.f10008H.setVisibility(i);
        this.f10007G.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo8905c(int i) {
        C4525b.f12433g.mo10348b(Integer.valueOf(i));
    }

    /* renamed from: e */
    private void m9326e(int i) {
        this.f10004A.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    /* renamed from: a */
    public final void mo8901a(boolean z) {
        if (z) {
            if (C3266p.m8943a().mo8636d()) {
                this.f10012L.setVisibility(0);
                return;
            }
            this.f10012L.setVisibility(8);
        }
    }

    /* renamed from: c */
    private boolean m9324c(String str) {
        if (!isAdded()) {
            return false;
        }
        Fragment a = getChildFragmentManager().mo2224a(str);
        if (a != null && (a instanceof C0649f)) {
            C0649f fVar = (C0649f) a;
            if (fVar.getDialog() != null && fVar.getDialog().isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo8363a(C5728aq aqVar) {
        String str;
        int i;
        TextView textView = this.f10021U;
        if (aqVar == null) {
            str = getString(R.string.etf);
        } else {
            str = aqVar.f15082b;
        }
        textView.setText(str);
        View view = this.f10022V;
        if (aqVar == null) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        Map map = (Map) C4525b.f12315K.mo10345a();
        map.put(this.f10057l.name(), f10002a.mo34889b(aqVar));
        C4525b.f12315K.mo10346a(map);
    }

    /* renamed from: b */
    private static void m9323b(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", "live_action");
        hashMap.put("event_module", "title");
        hashMap.put("live_edit_type", "title");
        String str3 = "title_status";
        if (str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        hashMap.put(str3, str2);
        C8049c.m15979a().mo14202a("live_edit_features", hashMap, new Object[0]);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event_type", "click");
        hashMap2.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap2.put("event_page", "live_action");
        hashMap2.put("event_module", "action");
        hashMap2.put("is_beauty", "off");
        C8049c.m15979a().mo14202a("live_action", hashMap2, new Object[0]);
    }

    /* renamed from: a */
    public final void mo8900a(Throwable th) {
        String str;
        if (th instanceof C2949a) {
            str = ((C2949a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.eyk);
        }
        this.f10055j = null;
        if (mo8452l()) {
            this.f10053h.mo9579b();
            C4204a.m10423a(getContext(), str);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f10047b = getActivity();
        this.f10064t = new C9381g(this);
        if (!this.f10044ar) {
            this.f10053h = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createImagePicker(this.f10047b, this, "cover", 1, 1, 750, 750, new C3523am(this));
            C8068g.m16014a((Context) this.f10047b);
            this.f10065u.post(new C3528ar(this));
            this.f10034ah.mo9000a(getActivity(), this);
            C3266p.m8943a().mo8628a((C3271a) new C3534ax(this));
            C3266p.m8943a().mo8634c();
            this.f10031ae.setVisibility(0);
            this.f10011K.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo8906d(int i) {
        long j;
        boolean c = m9324c("beauty_filter_dialog_tag");
        boolean c2 = m9324c("filter_dialog_tag");
        if (!c && !c2) {
            String str = "";
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "draw");
            hashMap.put("filter_id", str);
            C8049c a = C8049c.m15979a();
            String str2 = "live_take_filter_select";
            if (this.f10066v != null) {
                j = this.f10066v.getId();
            } else {
                j = 0;
            }
            hashMap.put("room_id", String.valueOf(j));
            a.mo14202a(str2, hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            C4525b.f12317M.mo10346a(Integer.valueOf(i));
            float a2 = C3261l.m8929a(C3266p.m8943a().f9434b, i);
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                if (!C9414h.m18630a(C3266p.m8943a().f9434b) && i >= 0 && i < C3266p.m8943a().f9434b.size()) {
                    C8688c b = C3395f.m9156f().mo8741b().mo8551a().mo8649b(C3287f.m9014a("beautyTag", (FilterModel) C3266p.m8943a().f9434b.get(i)));
                    if (b != null) {
                        C3040c a3 = C3395f.m9156f().mo8740a();
                        a3.mo8268a(C3037b.f8916d, b);
                        int i2 = (int) a2;
                        if (a3.mo8275c(b.f23749j.f23764b).floatValue() > C3366v.m9114a(b, i2)) {
                            a3.mo8267a(b.f23749j.f23764b, C3366v.m9114a(b, i2));
                        }
                    }
                }
            } else if (m9332r() > (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * a2) / 100.0f) {
                float f = a2 / 100.0f;
                this.f10056k.mo8943a(f);
                C4525b.f12318N.mo10346a(Float.valueOf(f));
            }
        }
    }

    /* renamed from: a */
    public final void mo8352a(C8710m mVar) {
        String str;
        int i;
        boolean z;
        if (mo8452l()) {
            if (this.f10065u != null) {
                View view = this.f10065u;
                if (mVar != C8710m.VIDEO) {
                    z = true;
                } else {
                    z = false;
                }
                view.setClickable(z);
            }
            if (mVar != this.f10057l) {
                this.f10057l = mVar;
                if (!(this.f10038al == null || this.f10038al.f12813a == null)) {
                    this.f10038al.f12813a.setVisibility(4);
                }
                if (this.f10029ac != null) {
                    this.f10029ac.setVisibility(4);
                }
                if (this.f10023W != null && this.f10023W.isShowing()) {
                    this.f10023W.dismiss();
                }
                int i2 = 8;
                switch (mVar) {
                    case VIDEO:
                        this.f10021U.setVisibility(0);
                        this.f10068x.setVisibility(0);
                        this.f10069y.setVisibility(8);
                        this.f10009I.setVisibility(0);
                        this.f10010J.setVisibility(8);
                        this.f10030ad.setVisibility(8);
                        this.f10013M.setVisibility(8);
                        this.f10070z.setVisibility(8);
                        this.f10007G.setText(R.string.e52);
                        this.f10018R.setText(R.string.enc);
                        this.f10031ae.setVisibility(0);
                        this.f10011K.setVisibility(0);
                        break;
                    case AUDIO:
                        this.f10021U.setVisibility(0);
                        this.f10068x.setVisibility(4);
                        this.f10069y.setVisibility(8);
                        this.f10009I.setVisibility(8);
                        this.f10010J.setVisibility(8);
                        this.f10030ad.setVisibility(8);
                        this.f10013M.setVisibility(8);
                        this.f10070z.setVisibility(0);
                        this.f10007G.setText(R.string.e54);
                        this.f10018R.setText(R.string.ena);
                        this.f10031ae.setVisibility(8);
                        this.f10011K.setVisibility(8);
                        break;
                    case THIRD_PARTY:
                        this.f10021U.setVisibility(0);
                        this.f10068x.setVisibility(4);
                        this.f10069y.setVisibility(0);
                        this.f10009I.setVisibility(8);
                        this.f10010J.setVisibility(8);
                        this.f10030ad.setVisibility(8);
                        this.f10013M.setVisibility(8);
                        this.f10070z.setVisibility(0);
                        this.f10007G.setText(R.string.e55);
                        this.f10018R.setText(R.string.enb);
                        this.f10031ae.setVisibility(8);
                        this.f10011K.setVisibility(8);
                        break;
                    case SCREEN_RECORD:
                        this.f10021U.setVisibility(8);
                        this.f10068x.setVisibility(4);
                        this.f10069y.setVisibility(0);
                        this.f10009I.setVisibility(8);
                        this.f10010J.setVisibility(0);
                        this.f10030ad.setVisibility(0);
                        this.f10013M.setVisibility(0);
                        Game game = this.f10039am;
                        if (game == null) {
                            this.f10026Z.setVisibility(0);
                            this.f10024X.setVisibility(8);
                            this.f10025Y.setText(R.string.et6);
                        } else {
                            this.f10026Z.setVisibility(8);
                            this.f10024X.setVisibility(0);
                            C5213c.m11814a(this.f10024X, game.icon);
                            this.f10025Y.setText(game.name);
                        }
                        Boolean bool = (Boolean) this.f10010J.getTag(R.id.d5k);
                        if (bool == null) {
                            bool = Boolean.valueOf(this.f10037ak.mo19444a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
                            this.f10010J.setTag(R.id.d5k, bool);
                        }
                        if (!bool.booleanValue()) {
                            this.f10027aa.setImageResource(R.drawable.c01);
                            this.f10028ab.setText(R.string.eta);
                        } else {
                            this.f10027aa.setImageResource(R.drawable.c00);
                            this.f10028ab.setText(R.string.et8);
                        }
                        this.f10070z.setVisibility(0);
                        this.f10007G.setText(R.string.e53);
                        this.f10018R.setText(R.string.en_);
                        this.f10031ae.setVisibility(8);
                        this.f10011K.setVisibility(8);
                        break;
                }
                C5728aq aqVar = (C5728aq) f10002a.mo34884a((String) ((Map) C4525b.f12315K.mo10345a()).get(this.f10057l.name()), C5728aq.class);
                TextView textView = this.f10021U;
                if (aqVar == null) {
                    str = getString(R.string.etf);
                } else {
                    str = aqVar.f15082b;
                }
                textView.setText(str);
                View view2 = this.f10022V;
                if (aqVar == null) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
                View view3 = this.f10020T;
                if (this.f10057l != C8710m.SCREEN_RECORD) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
                m9330p();
                if (mVar != C8710m.VIDEO) {
                    float a = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
                    if (mVar == C8710m.AUDIO) {
                        this.f10070z.setBackgroundResource(R.drawable.bj5);
                    } else if (this.f10058m == null || this.f10058m.getAvatarLarge() == null) {
                        this.f10070z.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25757b(C14232c.m29168a((int) R.drawable.buk).mo26458a((C14234d) new C4620v(5, a, null)).mo26449a())).mo25759b(this.f10070z.getController())).mo25763d());
                    } else {
                        C5213c.m11821a(this.f10070z, this.f10058m.getAvatarLarge(), (C14234d) new C4620v(5, a, null));
                    }
                    this.f10070z.setVisibility(0);
                }
                mo8904c();
            }
        }
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z = false;
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            if (message.what == 1) {
                if (mo8452l()) {
                    if (this.f10041ao != null) {
                        this.f10041ao.dismiss();
                    }
                    if (exc instanceof C2949a) {
                        int errorCode = ((C2949a) exc).getErrorCode();
                        if (errorCode != 10018) {
                            switch (errorCode) {
                                case 30010:
                                    if (this.f10047b != null) {
                                        if (this.f10062q == null) {
                                            C4221a aVar = new C4221a(this.f10047b);
                                            aVar.mo9689a((CharSequence) getString(R.string.f37)).mo9694b(R.string.e45, new C3543bf(this)).mo9685a((int) R.string.f34, (DialogInterface.OnClickListener) new C3544bg(this)).mo9693b((int) R.string.f35);
                                            aVar.mo9686a((OnCancelListener) new C3545bh(this));
                                            this.f10062q = aVar.mo9692a();
                                            this.f10062q.setCanceledOnTouchOutside(true);
                                        }
                                        this.f10062q.show();
                                        C8068g.m16014a((Context) this.f10047b);
                                        break;
                                    }
                                    break;
                                case 30011:
                                    new C8552a(getContext(), 0).mo14996a(true).mo15008c((int) R.string.f21).mo15003b(0, (int) R.string.e4g, (DialogInterface.OnClickListener) new C3541bd(this)).mo15003b(1, (int) R.string.e41, C3542be.f10099a).mo15001b().show();
                                    break;
                                default:
                                    C4602l.m11047a((Context) this.f10047b, (Throwable) exc, (int) R.string.e8y);
                                    break;
                            }
                        } else {
                            C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                            if (!(this.f10047b == null || a == null)) {
                                this.f10059n.mo6181a(C3395f.m9156f().mo8742c().mo9017a().getBanUserInfo().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3524an<Object>(this), C3525ao.f10082a));
                            }
                        }
                    } else {
                        C4602l.m11047a((Context) this.f10047b, (Throwable) exc, (int) R.string.e8y);
                    }
                }
                C8068g.m16014a((Context) this.f10047b);
                if (this.f10057l == C8710m.AUDIO) {
                    z = true;
                }
                C3161a.m8755a(exc, z);
            }
            return;
        }
        if (message.what == 1) {
            this.f10066v = (Room) message.obj;
            if (!Room.isValid(this.f10066v)) {
                if (this.f10041ao != null) {
                    this.f10041ao.dismiss();
                }
                IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                C4602l.m11047a((Context) this.f10047b, (Throwable) illegalStateException, (int) R.string.e8y);
                if (this.f10057l == C8710m.AUDIO) {
                    z = true;
                }
                C3161a.m8755a(illegalStateException, z);
                return;
            }
            long id = this.f10066v.getId();
            if (this.f10041ao != null && this.f10041ao.isShowing()) {
                this.f10041ao.dismiss();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("enter_from", this.f10040an);
            hashMap.put("event_page", "live_take_page");
            hashMap.put("room_id", String.valueOf(this.f10066v.getId()));
            String str10 = "live_type";
            if (this.f10066v.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put(str10, str);
            hashMap.put("streaming_type", this.f10057l.logStreamingType);
            if (this.f10057l == C8710m.SCREEN_RECORD) {
                Game game = this.f10039am;
                if (game != null) {
                    hashMap.put("game_name", game.name);
                }
            }
            C8049c.m15979a().mo14202a("live_take", hashMap, new Object[0]);
            if (this.f10004A.getText() != null && !TextUtils.isEmpty(this.f10004A.getText())) {
                HashMap hashMap2 = new HashMap();
                String str11 = "live_type";
                if (this.f10066v.isLiveTypeAudio()) {
                    str9 = "voice_live";
                } else {
                    str9 = "video_live";
                }
                hashMap2.put(str11, str9);
                hashMap2.put("streaming_type", this.f10057l.logStreamingType);
                C8049c.m15979a().mo14202a("pm_live_take_title_write", hashMap2, new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_page"), new C8060k());
            }
            C3261l.m8930a(id);
            float floatValue = ((Float) C4525b.f12318N.mo10345a()).floatValue() * 100.0f;
            float floatValue2 = ((Float) C4525b.f12319O.mo10345a()).floatValue() * 100.0f;
            float floatValue3 = ((Float) C4525b.f12320P.mo10345a()).floatValue() * 100.0f;
            float floatValue4 = ((Float) C4525b.f12321Q.mo10345a()).floatValue() * 100.0f;
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event_page", "live_take_page");
            String str12 = "live_type";
            if (this.f10066v.isLiveTypeAudio()) {
                str2 = "voice_live";
            } else {
                str2 = "video_live";
            }
            hashMap3.put(str12, str2);
            hashMap3.put("streaming_type", this.f10057l.logStreamingType);
            hashMap3.put("anchor_id", String.valueOf(this.f10058m.getId()));
            String str13 = "is_tag";
            if (m9331q() == -1) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            hashMap3.put(str13, str3);
            String str14 = "is_beauty";
            if (this.f10057l == C8710m.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            hashMap3.put(str14, str4);
            String str15 = "beauty_white";
            if (this.f10057l != C8710m.VIDEO) {
                str5 = "0";
            } else {
                str5 = String.valueOf(floatValue);
            }
            hashMap3.put(str15, str5);
            String str16 = "beauty_skin";
            if (this.f10057l != C8710m.VIDEO) {
                str6 = "0";
            } else {
                str6 = String.valueOf(floatValue2);
            }
            hashMap3.put(str16, str6);
            String str17 = "beauty_bigeye";
            if (this.f10057l != C8710m.VIDEO) {
                str7 = "0";
            } else {
                str7 = String.valueOf(floatValue3);
            }
            hashMap3.put(str17, str7);
            String str18 = "beauty_facethin";
            if (this.f10057l != C8710m.VIDEO) {
                str8 = "0";
            } else {
                str8 = String.valueOf(floatValue4);
            }
            hashMap3.put(str18, str8);
            C8049c.m15979a().mo14202a("pm_live_take_edit_features", hashMap3, new C8059j().mo14214b("live_take").mo14218f("click"));
            if (TextUtils.isEmpty(this.f10042ap)) {
                m9325d();
            } else {
                ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(this.f10066v);
                this.f10067w = C3622b.m9456a(this.f10047b, this.f10042ap, this.f10066v);
                C4525b.f12445s.mo10346a(this.f10042ap);
                String str19 = this.f10042ap;
                if (C9431p.m18665a(this.f10042ap, "weixin_moment")) {
                    str19 = "weixin_moment";
                }
                C8068g.m16014a((Context) this.f10047b);
                this.f10066v.getId();
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event_belong", "live_interact");
                hashMap4.put("event_page", "live_take_page");
                hashMap4.put("room_id", String.valueOf(this.f10066v.getId()));
                hashMap4.put("platform", str19);
                C8049c.m15979a().mo14202a("live_take_share", hashMap4, new Object[0]);
                if (!this.f10067w) {
                    m9325d();
                } else {
                    int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.mo9431a()).intValue();
                    if (intValue > 0) {
                        this.f10064t.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
                    }
                }
            }
        } else if (message.what == 2333) {
            m9325d();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f10037ak = C10753b.m21793a(getContext());
        String a = this.f10037ak.mo19442a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a)) {
            this.f10039am = Game.fromJson(a);
        }
        this.f10070z = (HSImageView) this.f10065u.findViewById(R.id.c7v);
        this.f10016P = this.f10065u.findViewById(R.id.dgc);
        this.f10018R = (TextView) this.f10065u.findViewById(R.id.dgb);
        this.f10018R.setOnClickListener(this.f10045as);
        this.f10068x = (ImageView) this.f10065u.findViewById(R.id.ajy);
        this.f10068x.setOnClickListener(this.f10045as);
        this.f10069y = this.f10065u.findViewById(R.id.bde);
        this.f10069y.setOnClickListener(this.f10045as);
        this.f10019S = this.f10065u.findViewById(R.id.ue);
        this.f10019S.setOnClickListener(this.f10045as);
        this.f10017Q = this.f10065u.findViewById(R.id.cs9);
        this.f10004A = (EditText) this.f10065u.findViewById(R.id.be_);
        this.f10014N = this.f10065u.findViewById(R.id.cxn);
        this.f10048c = this.f10065u.findViewById(R.id.d61);
        this.f10020T = this.f10065u.findViewById(R.id.cq7);
        this.f10021U = (TextView) this.f10065u.findViewById(R.id.cq6);
        this.f10021U.setOnClickListener(this.f10045as);
        this.f10022V = this.f10065u.findViewById(R.id.uq);
        this.f10022V.setOnClickListener(this.f10045as);
        this.f10015O = this.f10065u.findViewById(R.id.dfv);
        this.f10034ah = (AbsStartLiveShareView) this.f10065u.findViewById(R.id.drc);
        this.f10008H = this.f10065u.findViewById(R.id.clo);
        this.f10009I = this.f10065u.findViewById(R.id.clm);
        this.f10009I.setOnClickListener(this.f10045as);
        this.f10010J = this.f10065u.findViewById(R.id.clx);
        this.f10010J.setOnClickListener(this.f10045as);
        this.f10011K = this.f10065u.findViewById(R.id.clq);
        this.f10011K.setOnClickListener(this.f10045as);
        this.f10012L = this.f10065u.findViewById(R.id.avj);
        this.f10013M = this.f10065u.findViewById(R.id.clr);
        this.f10013M.setOnClickListener(this.f10045as);
        this.f10031ae = this.f10065u.findViewById(R.id.cm1);
        this.f10032af = this.f10065u.findViewById(R.id.cln);
        this.f10032af.setOnClickListener(this.f10045as);
        this.f10049d = (CheckedTextView) this.f10065u.findViewById(R.id.yf);
        this.f10024X = (ImageView) this.f10065u.findViewById(R.id.cls);
        this.f10026Z = this.f10065u.findViewById(R.id.clt);
        this.f10025Y = (TextView) this.f10065u.findViewById(R.id.clu);
        this.f10027aa = (ImageView) this.f10065u.findViewById(R.id.cly);
        this.f10028ab = (TextView) this.f10065u.findViewById(R.id.clz);
        this.f10030ad = this.f10065u.findViewById(R.id.cm2);
        this.f10007G = (TextView) this.f10065u.findViewById(R.id.ajk);
        this.f10007G.setOnClickListener(this.f10045as);
        this.f10029ac = (TextView) this.f10065u.findViewById(R.id.dbb);
        this.f10051f = (HSImageView) this.f10065u.findViewById(R.id.bcj);
        this.f10051f.setImageResource(R.drawable.bnz);
        this.f10051f.setOnClickListener(this.f10045as);
        this.f10052g = (TextView) this.f10065u.findViewById(R.id.dba);
        this.f10033ag = this.f10065u.findViewById(R.id.bck);
        if (this.f10005B != 0) {
            m9326e(this.f10005B);
        } else {
            m9326e(20);
        }
        if (!this.f10044ar) {
            this.f10058m.getAvatarMedium();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                int intValue = ((Integer) C4525b.f12447u.mo10345a()).intValue();
                if (C8299d.m16446a((Context) activity, "android.permission.ACCESS_FINE_LOCATION")) {
                    this.f10048c.setVisibility(8);
                    C4525b.f12447u.mo10346a(Integer.valueOf(0));
                } else if (intValue <= 5) {
                    this.f10048c.setVisibility(0);
                    this.f10048c.setOnClickListener(this.f10045as);
                    C4525b.f12447u.mo10346a(Integer.valueOf(intValue + 1));
                } else {
                    this.f10036aj = true;
                }
                m9330p();
            }
            this.f10018R.setVisibility(0);
            this.f10016P.setVisibility(0);
        }
        C3197a.m8831a();
        if (mo8452l()) {
            this.f10052g.setText(getString(R.string.efa));
            this.f10052g.setAlpha(0.64f);
            this.f10059n.mo6181a(C3395f.m9156f().mo8742c().mo9022e().anchorCoverStatus().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3533aw<Object>(this), C3535ay.f10092a));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f10044ar) {
            if (i != 20001 || VERSION.SDK_INT < 21) {
                C4116c.m10249a(C8803g.class);
                if (i2 != 0) {
                    this.f10053h.mo9578a(i, i2, intent);
                } else if (i == 10001) {
                    m9328f();
                } else {
                    if (i == 10002) {
                        if (this.f10035ai == null) {
                            this.f10035ai = C3236c.m8869a(new C3252a() {
                                /* renamed from: a */
                                public final void mo8582a(float f) {
                                    if (C3514al.this.f10056k != null) {
                                        C3514al.this.f10056k.mo8943a(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * f);
                                    }
                                }

                                /* renamed from: b */
                                public final void mo8583b(float f) {
                                    if (C3514al.this.f10056k != null) {
                                        C3514al.this.f10056k.mo8947b(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * f);
                                    }
                                }

                                /* renamed from: c */
                                public final void mo8584c(float f) {
                                    if (C3514al.this.f10056k != null) {
                                        C3514al.this.f10056k.mo8949c(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * f);
                                    }
                                }

                                /* renamed from: d */
                                public final void mo8585d(float f) {
                                    if (C3514al.this.f10056k != null) {
                                        C3514al.this.f10056k.mo8950d(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * f);
                                    }
                                }
                            }, this.f10046at, true, 0, true);
                            this.f10035ai.f9349a = new C3527aq(this);
                        }
                        this.f10035ai.show(getChildFragmentManager(), "beauty_filter_dialog_tag");
                        mo8897a(8);
                    }
                }
            } else {
                if (i2 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i2, intent);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            m9328f();
                            return;
                        }
                    }
                }
                C4575an.m10981a((int) R.string.f1x);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10065u = LayoutInflater.from(getContext()).inflate(R.layout.akt, viewGroup, false);
        if (C4116c.m10249a(C4282a.class) == null || ((C4282a) C4116c.m10249a(C4282a.class)).user() == null) {
            C4575an.m10981a((int) R.string.e_x);
            getActivity().finish();
            this.f10044ar = true;
        } else {
            this.f10058m = (User) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
            if (this.f10058m.getId() != ((Long) C4525b.f12312H.mo10345a()).longValue()) {
                C4525b.f12312H.mo10346a(Long.valueOf(this.f10058m.getId()));
                C4525b.f12314J.mo10346a(C8710m.VIDEO.name());
            }
        }
        C4495a.m10823a().mo10300a(C5206y.class).mo6513a(C4064k.m10180a(this)).mo6545f((C1710e<? super T>) new C1710e<C5206y>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C3514al.this.onEvent((C5206y) obj);
            }
        });
        return this.f10065u;
    }
}
