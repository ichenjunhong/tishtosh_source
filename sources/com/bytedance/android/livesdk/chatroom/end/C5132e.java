package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.constraint.Group;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.media.C2992f;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3031a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p230g.C3864ab;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4187f;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.EndPageRecommendRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout.C5123a;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i.C50162;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.bytedance.android.livesdkapi.depend.p434b.C8616b;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p661d.p662a.C10632b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.e */
public final class C5132e extends C5145k implements C4187f, C8614a, C9382a {

    /* renamed from: a */
    public static String f13721a = "sslocal://webcast_webview?url=https%3A%2F%2Fwj.toutiao.com%2F6K0526Um%2F%3Fbanner_id%3D373&type=fullscreen&title=&hide_more=0&hide_nav_bar=0&hide_status_bar=0";

    /* renamed from: B */
    private TextView f13722B;

    /* renamed from: F */
    private TextView f13723F;

    /* renamed from: G */
    private TextView f13724G;

    /* renamed from: H */
    private TextView f13725H;

    /* renamed from: I */
    private TextView f13726I;

    /* renamed from: J */
    private HSImageView f13727J;

    /* renamed from: K */
    private View f13728K;

    /* renamed from: L */
    private View f13729L;

    /* renamed from: M */
    private View f13730M;

    /* renamed from: N */
    private View f13731N;

    /* renamed from: O */
    private HSImageView f13732O;

    /* renamed from: P */
    private HSImageView f13733P;

    /* renamed from: Q */
    private ImageView f13734Q;

    /* renamed from: R */
    private ImageView f13735R;

    /* renamed from: S */
    private VHeadView f13736S;

    /* renamed from: T */
    private TextView f13737T;

    /* renamed from: U */
    private ImageView f13738U;

    /* renamed from: V */
    private TextView f13739V;

    /* renamed from: W */
    private ImageView f13740W;

    /* renamed from: X */
    private ImageView f13741X;

    /* renamed from: Y */
    private TextView f13742Y;

    /* renamed from: Z */
    private TextView f13743Z;

    /* renamed from: aa */
    private TextView f13744aa;

    /* renamed from: ab */
    private String f13745ab;

    /* renamed from: ac */
    private List<C2992f> f13746ac;

    /* renamed from: ad */
    private String f13747ad;

    /* renamed from: ae */
    private CharSequence f13748ae;

    /* renamed from: af */
    private CharSequence f13749af;

    /* renamed from: ag */
    private CharSequence f13750ag;

    /* renamed from: ah */
    private C9381g f13751ah = new C9381g(this);

    /* renamed from: ai */
    private C8614a f13752ai;

    /* renamed from: aj */
    private long f13753aj;

    /* renamed from: ak */
    private TextView f13754ak;

    /* renamed from: al */
    private TopFansLayout f13755al;

    /* renamed from: am */
    private LinearLayout f13756am;

    /* renamed from: an */
    private TextView f13757an;

    /* renamed from: ao */
    private TextView f13758ao;

    /* renamed from: ap */
    private TextView f13759ap;

    /* renamed from: aq */
    private View f13760aq;

    /* renamed from: ar */
    private OnClickListener f13761ar = new OnClickListener() {
        public final void onClick(View view) {
            float f;
            float f2;
            C8828a aVar;
            int id = view.getId();
            if (id == R.id.iw) {
                C5132e.this.mo11034d();
            } else if (id == R.id.d1o) {
                C5132e.this.mo11033c();
            } else {
                int i = 0;
                if (id == R.id.ag8) {
                    C8068g.m16014a((Context) C5132e.this.f13771k);
                    C5132e.this.mo11022a(0, "live_ending");
                } else if (id == R.id.ck3) {
                    C5132e.this.mo11022a(0, "anchor_live_ending");
                } else if (id == R.id.czy) {
                    C5132e.this.mo11022a(1, "anchor_live_ending");
                } else {
                    if (id == R.id.ov) {
                        C8068g.m16014a((Context) C5132e.this.f13771k);
                        C5132e.this.f13797x.getId();
                        C5132e.this.f13768h = true;
                        TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15408a((C8738a) C4528e.CLICK_RECORD_BUTTON_IN_END_LIVE, C5132e.this.f13768h);
                        C5132e.this.f13764d.setVisibility(8);
                        if (C5132e.this.f13772l != null) {
                            C5132e.this.f13772l.mo8244c();
                        }
                        C8049c.m15979a().mo14203a("pm_live_take_video_add", new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("anchor_live_ending"), new C8060k());
                        if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo9431a()).booleanValue()) {
                            aVar = C8828a.Camera;
                        } else {
                            aVar = C8828a.LiveResource;
                        }
                        if (aVar.isInstalled()) {
                            C5132e.this.mo11023b();
                        } else {
                            aVar.checkInstall(C5132e.this.getContext(), "live_end", new C8768a() {
                                /* renamed from: a */
                                public final void mo8214a(String str) {
                                    C5132e.this.f13770j.mo6181a(((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).loadShortVideoRes().mo6505a((C1710e<? super T>) new C5140h<Object>(this), C5141i.f13792a));
                                }
                            });
                        }
                    } else if (id == R.id.ss || id == R.id.d7t || id == R.id.bca) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("room_id", String.valueOf(C5132e.this.f13797x.getId()));
                        hashMap.put("anchor_id", String.valueOf(C5132e.this.f13797x.getOwner().getId()));
                        hashMap.put("event_page", "anchor_live_ending");
                        C8049c.m15979a().mo14202a("livesdk_live_assit_guide_click", hashMap, new Object[0]);
                        if (C5132e.this.f13783w) {
                            C4514j.m10883j().mo10328i().handle(C5132e.this.getContext(), Uri.parse(new C18922i(C5132e.f13721a).mo38774a()));
                        }
                    } else {
                        float f3 = 0.0f;
                        if (id == R.id.dty) {
                            if (!C8607a.f23572a) {
                                C8049c.m15979a().mo14203a("pm_live_take_count_click", new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("anchor_live_ending"), new C8060k());
                                C5132e.this.f13766f.setVisibility(0);
                                C5132e.this.f13766f.setPivotY(0.0f);
                                C5132e eVar = C5132e.this;
                                ViewPropertyAnimator animate = C5132e.this.f13766f.animate();
                                if (!C5132e.this.f13776p) {
                                    f3 = 1.0f;
                                }
                                eVar.f13775o = animate.scaleY(f3).setDuration(200).setListener(new AnimatorListener() {
                                    public final void onAnimationCancel(Animator animator) {
                                    }

                                    public final void onAnimationRepeat(Animator animator) {
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        C5132e.this.f13773m.setClickable(true);
                                    }
                                });
                                ViewPropertyAnimator animate2 = C5132e.this.f13762b.animate();
                                if (!C5132e.this.f13776p) {
                                    f = C9432q.m18687b((Context) C5132e.this.f13771k, 56.0f);
                                } else {
                                    f = -C9432q.m18687b((Context) C5132e.this.f13771k, 56.0f);
                                }
                                animate2.translationYBy(f).setDuration(200).start();
                                if (C5132e.this.f13782v != null) {
                                    ViewPropertyAnimator animate3 = C5132e.this.f13782v.animate();
                                    if (!C5132e.this.f13776p) {
                                        f2 = C9432q.m18687b((Context) C5132e.this.f13771k, 56.0f);
                                    } else {
                                        f2 = -C9432q.m18687b((Context) C5132e.this.f13771k, 56.0f);
                                    }
                                    animate3.translationYBy(f2).setDuration(200).start();
                                }
                                C5132e.this.f13775o.start();
                                C5132e.this.f13774n.animate().rotationBy(180.0f).setDuration(200).start();
                                C5132e.this.f13773m.setClickable(false);
                                C5132e.this.f13776p = !C5132e.this.f13776p;
                            }
                        } else if (view.equals(C5132e.this.f13780t)) {
                            if (C5132e.this.mo8452l()) {
                                C4116c.m10249a(C8612a.class);
                                C5132e.this.getContext();
                            }
                        } else if (view.equals(C5132e.this.f13779s) || view.equals(C5132e.this.f13778r)) {
                            if (C5132e.this.mo8452l()) {
                                if (C5132e.this.f13781u.getVisibility() == 0) {
                                    i = 8;
                                }
                                C5132e.this.f13781u.setVisibility(i);
                                if (i == 0) {
                                    C5132e.this.f13779s.animate().rotation(180.0f).start();
                                } else {
                                    C5132e.this.f13779s.animate().rotation(0.0f).start();
                                }
                            }
                        } else if (!(id != R.id.aeq || C5132e.this.f13797x == null || C5132e.this.f13797x.getId() == 0)) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("roomId", C5132e.this.f13797x.getId());
                            bundle.putLong("anchor_id", C5132e.this.f13797x.getOwnerUserId());
                            TTLiveSDKContext.getHostService().mo10313f().mo14430a((Context) C5132e.this.f13771k, "//livend/submitfeedbackacitivity", bundle);
                            HashMap hashMap2 = new HashMap(1);
                            hashMap2.put("anchor_id", String.valueOf(C5132e.this.f13797x.getOwnerUserId()));
                            TTLiveSDKContext.getHostService().mo10311d().mo15567a("livesdk_live_end_feedback_click", hashMap2);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: b */
    public LinearLayout f13762b;

    /* renamed from: c */
    public LinearLayout f13763c;

    /* renamed from: d */
    public TextView f13764d;

    /* renamed from: e */
    TextView f13765e;

    /* renamed from: f */
    public View f13766f;

    /* renamed from: g */
    View f13767g;

    /* renamed from: h */
    public boolean f13768h;

    /* renamed from: i */
    public String f13769i;

    /* renamed from: j */
    public final C1689b f13770j = new C1689b();

    /* renamed from: k */
    public Activity f13771k;

    /* renamed from: l */
    public C3031a f13772l;

    /* renamed from: m */
    public View f13773m;

    /* renamed from: n */
    public ImageView f13774n;

    /* renamed from: o */
    public ViewPropertyAnimator f13775o;

    /* renamed from: p */
    public boolean f13776p = true;

    /* renamed from: q */
    public RelativeLayout f13777q;

    /* renamed from: r */
    public View f13778r;

    /* renamed from: s */
    public View f13779s;

    /* renamed from: t */
    public TextView f13780t;

    /* renamed from: u */
    public Group f13781u;

    /* renamed from: v */
    public View f13782v;

    /* renamed from: w */
    public boolean f13783w;

    public final void onResume() {
        super.onResume();
    }

    public final void onStart() {
        super.onStart();
    }

    /* renamed from: b */
    public final void mo11023b() {
        this.f13751ah.postDelayed(new Runnable() {
            public final void run() {
                if (TTLiveSDKContext.getHostService().mo10310c().startVideoRecordActivity(C5132e.this.f13771k, "live_end_dialog")) {
                    C5132e.this.f13771k.finish();
                }
            }
        }, 200);
    }

    public final void onStop() {
        super.onStop();
        if (this.f13775o != null) {
            this.f13775o.cancel();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f13751ah != null) {
            this.f13751ah.removeCallbacks(null);
        }
        this.f13770j.mo6180a();
    }

    /* renamed from: a */
    public final boolean mo8466a() {
        if (this.f13752ai == null || !this.f13752ai.mo8466a()) {
            return false;
        }
        if (this.f13771k != null) {
            this.f13771k.finish();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9602a(C3031a aVar) {
        this.f13772l = aVar;
    }

    public final void onEvent(C8616b bVar) {
        if (bVar != null && isAdded()) {
            ((FragmentActivity) this.f13771k).getSupportFragmentManager();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f13797x != null) {
            C5014i a = C5014i.m11508a();
            C9381g gVar = this.f13751ah;
            long id = this.f13797x.getId();
            C10632b a2 = C10632b.m21416a();
            C50162 r0 = new Callable(true, id, 4, true, 1) {

                /* renamed from: a */
                final /* synthetic */ boolean f13434a;

                /* renamed from: b */
                final /* synthetic */ long f13435b;

                /* renamed from: c */
                final /* synthetic */ int f13436c;

                /* renamed from: d */
                final /* synthetic */ boolean f13437d;

                /* renamed from: e */
                final /* synthetic */ int f13438e;

                public final Object call() throws Exception {
                    C4177d dVar = (C4177d) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getRoomStats(this.f13434a, this.f13435b, this.f13436c, this.f13437d, this.f13438e).execute().f33552b;
                    if (dVar.extra != null) {
                        ((Room) dVar.data).nowTime = dVar.extra.now / 1000;
                    }
                    return (Room) dVar.data;
                }

                {
                    this.f13434a = r2;
                    this.f13435b = r3;
                    this.f13436c = r5;
                    this.f13437d = r6;
                    this.f13438e = r7;
                }
            };
            a2.mo18874a(gVar, r0, 12);
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(null);
        }
    }

    public final void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        this.f13747ad = bundle.getString("live_end_banned_url", null);
        this.f13748ae = bundle.getCharSequence("live_end_banned_title", null);
        this.f13749af = bundle.getCharSequence("live_end_banned_reason", null);
        this.f13750ag = bundle.getCharSequence("live_end_banned_content", null);
    }

    /* renamed from: a */
    private void m11784a(List<C2992f> list) {
        String str;
        int size = list.size();
        int i = 0;
        if (size <= 0) {
            this.f13740W.setVisibility(0);
            this.f13741X.setVisibility(0);
        }
        if (size == 1) {
            this.f13741X.setVisibility(0);
        }
        int i2 = 0;
        while (i2 < size) {
            C2992f fVar = (C2992f) list.get(i2);
            if (!(fVar == null || fVar.f8802a == null)) {
                if (i2 == 0) {
                    C5213c.m11820a(this.f13732O, fVar.f8802a);
                    this.f13734Q.setVisibility(i);
                    this.f13730M.setOnClickListener(this.f13761ar);
                }
                if (i2 == 1) {
                    C5213c.m11820a(this.f13733P, fVar.f8802a);
                    this.f13735R.setVisibility(i);
                    this.f13731N.setOnClickListener(this.f13761ar);
                }
                Room room = this.f13797x;
                if (room != null) {
                    Media media = (Media) C4514j.m10883j().mo10320a().mo34884a(fVar.f8803b, Media.class);
                    if (media != null) {
                        String str2 = "anchor_live_ending";
                        long id = room.getId();
                        long userFrom = room.getUserFrom();
                        String requestId = room.getRequestId();
                        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
                        if (room.isLiveTypeAudio()) {
                            str = "voice_live";
                        } else {
                            str = "video_live";
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_page", str2);
                        hashMap.put("event_module", "video");
                        hashMap.put("room_id", String.valueOf(id));
                        hashMap.put("video_id", String.valueOf(media.getId()));
                        hashMap.put("request_id", requestId);
                        hashMap.put("log_pb", room.getLog_pb());
                        hashMap.put("live_type", str);
                        hashMap.put("source", String.valueOf(userFrom));
                        if (media != null) {
                            if (media.getVideoPicNum() > 0) {
                                hashMap.put("video_type", "photofilm");
                            } else {
                                hashMap.put("video_type", "video");
                            }
                            if (media.getMusic() != null) {
                                hashMap.put("music", media.getMusic().f8779d);
                                hashMap.put("music_id", String.valueOf(media.getMusic().f8776a));
                            }
                            if (media.getHashTag() != null) {
                                hashMap.put("hashtag_content", media.getHashTag().f8756b);
                                hashMap.put("hashtag_id", String.valueOf(media.getHashTag().f8755a));
                            }
                        }
                        C8049c.m15979a().mo14202a("video_show", hashMap, new C8059j().mo14214b("video_view").mo14218f("show"));
                        i2++;
                        i = 0;
                    }
                }
            }
            i2++;
            i = 0;
        }
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f13771k != null && !this.f13771k.isFinishing()) {
            int i = message.what;
            if (message.obj instanceof Exception) {
                if ((!C8607a.f23572a || !(i == 21 || i == 22)) && (message.obj instanceof C2949a)) {
                    C4204a.m10423a((Context) this.f13771k, ((C2949a) message.obj).getPrompt());
                }
                return;
            }
            if (12 == i && (message.obj instanceof Room)) {
                Room room = (Room) message.obj;
                if (!(room == null || room.getStats() == null)) {
                    if (room.isLiveTypeAudio()) {
                        this.f13722B.setText(R.string.eg5);
                    }
                    RoomStats stats = room.getStats();
                    long totalUser = (long) stats.getTotalUser();
                    String a = C3890e.m9833a(totalUser);
                    if (C3890e.m9837e(totalUser)) {
                        this.f13723F.setText(C3864ab.m9794a(a, 0.6777f, a.length() - 1, a.length()));
                    } else {
                        this.f13723F.setText(a);
                    }
                    String a2 = C3890e.m9833a(stats.getTicket());
                    if (C3890e.m9837e(stats.getTicket())) {
                        this.f13724G.setText(C3864ab.m9794a(a2, 0.6777f, a2.length() - 1, a2.length()));
                    } else {
                        this.f13724G.setText(a2);
                    }
                    String a3 = C3890e.m9833a((long) stats.getFollowCount());
                    if (C3890e.m9837e((long) stats.getFollowCount())) {
                        this.f13725H.setText(C3864ab.m9794a(a3, 0.6777f, a3.length() - 1, a3.length()));
                    } else {
                        this.f13725H.setText(a3);
                    }
                    String a4 = C3890e.m9833a((long) stats.getGiftUVCount());
                    if (C3890e.m9837e((long) stats.getGiftUVCount())) {
                        this.f13726I.setText(C3864ab.m9794a(a4, 0.6777f, a4.length() - 1, a4.length()));
                    } else {
                        this.f13726I.setText(a4);
                    }
                    this.f13774n.setRotation(180.0f);
                    room.getHealthScoreInfo();
                    if (!C8607a.f23572a && mo8452l() && room.getStats() != null && room.getStats().userComposition != null) {
                        RoomStats stats2 = room.getStats();
                        this.f13766f.setVisibility(0);
                        TextView textView = this.f13742Y;
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf((int) (stats2.userComposition.f8733a * 100.0d)));
                        sb.append("%");
                        textView.setText(sb.toString());
                        TextView textView2 = this.f13743Z;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(String.valueOf((int) (stats2.userComposition.f8734b * 100.0d)));
                        sb2.append("%");
                        textView2.setText(sb2.toString());
                        TextView textView3 = this.f13744aa;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(String.valueOf((int) (stats2.userComposition.f8735c * 100.0d)));
                        sb3.append("%");
                        textView3.setText(sb3.toString());
                    }
                    User owner = this.f13797x.getOwner();
                    if (owner != null && owner.isFollowing()) {
                        this.f13799z = true;
                    }
                    if (C9414h.m18630a(room.getTopFanTickets())) {
                        C9432q.m18691b((View) this.f13763c, 8);
                    } else {
                        this.f13755al.mo11006a(this.f13771k, this, room, this.f13745ab);
                        this.f13755al.setTopFansCallBack(new C5123a() {
                            /* renamed from: a */
                            public final void mo11015a() {
                                C5132e.this.f13763c.setVisibility(8);
                            }
                        });
                    }
                    RoomStats stats3 = room.getStats();
                    if (stats3 != null) {
                        String douPlusPromotion = stats3.getDouPlusPromotion();
                        if (!TextUtils.isEmpty(douPlusPromotion)) {
                            C18085o oVar = (C18085o) C2942b.m8369a().mo34884a(douPlusPromotion, C18085o.class);
                            if (oVar != null) {
                                C18082l b = oVar.mo35022b("live_click");
                                C18082l b2 = oVar.mo35022b("is_dou_plus_on");
                                C18082l b3 = oVar.mo35022b("task_list_path");
                                if (b != null && !TextUtils.isEmpty(b.mo34905c()) && b2 != null && b2.mo34910g() == 1 && b3 != null && !TextUtils.isEmpty(b3.mo34905c())) {
                                    this.f13769i = b3.mo34905c();
                                    String c = b.mo34905c();
                                    if (this.f13782v == null) {
                                        this.f13782v = mo11032a(R.id.b7g);
                                        if (this.f13782v != null) {
                                            this.f13759ap = (TextView) this.f13782v.findViewById(R.id.a75);
                                            this.f13780t = (TextView) this.f13782v.findViewById(R.id.a78);
                                            this.f13781u = (Group) this.f13782v.findViewById(R.id.a76);
                                            this.f13778r = this.f13782v.findViewById(R.id.a7d);
                                            this.f13779s = this.f13782v.findViewById(R.id.a7c);
                                            this.f13781u.setReferencedIds(new int[]{R.id.a75, R.id.a74, R.id.a78});
                                            this.f13780t.setOnClickListener(this.f13761ar);
                                            this.f13778r.setOnClickListener(this.f13761ar);
                                            this.f13779s.setOnClickListener(this.f13761ar);
                                        }
                                    }
                                    this.f13781u.setVisibility(8);
                                    this.f13782v.setVisibility(0);
                                    this.f13759ap.setText(c);
                                }
                            }
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(room.getId()));
                String str3 = "live_type";
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                hashMap.put("time", String.valueOf(room.getFinishTime() - room.getCreateTime()));
                String str4 = "streaming_type";
                if (this.f13797x.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put(str4, str2);
                C8049c.m15979a().mo14202a("live_over", hashMap, new C8059j().mo14213a("live_take_page").mo14218f("click").mo14214b("live_take"));
            }
            if (21 == i) {
                this.f13746ac = (List) message.obj;
                m11784a(this.f13746ac);
            }
        }
    }

    /* renamed from: a */
    public final void mo11022a(int i, String str) {
        if (SystemClock.elapsedRealtime() - this.f13753aj >= 1000 && this.f13771k != null && !this.f13771k.isFinishing() && this.f13746ac != null && i <= this.f13746ac.size() - 1) {
            C8068g.m16014a((Context) this.f13771k);
            this.f13797x.getId();
            C2992f fVar = (C2992f) this.f13746ac.get(i);
            this.f13753aj = SystemClock.elapsedRealtime();
            TTLiveSDKContext.getHostService().mo10313f().mo14428a(fVar.f8803b, str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        long id;
        int i;
        super.onViewCreated(view, bundle);
        this.f13728K = mo11032a(R.id.d8);
        this.f13723F = (TextView) mo11032a(R.id.dtw);
        this.f13722B = (TextView) mo11032a(R.id.dtx);
        this.f13725H = (TextView) mo11032a(R.id.bqd);
        this.f13726I = (TextView) mo11032a(R.id.a0_);
        this.f13724G = (TextView) mo11032a(R.id.d02);
        View a = mo11032a(R.id.iw);
        this.f13727J = (HSImageView) mo11032a(R.id.bd6);
        this.f13762b = (LinearLayout) mo11032a(R.id.chu);
        this.f13763c = (LinearLayout) mo11032a(R.id.a0b);
        this.f13755al = (TopFansLayout) mo11032a(R.id.d3p);
        this.f13729L = mo11032a(R.id.dor);
        this.f13730M = mo11032a(R.id.ck3);
        this.f13731N = mo11032a(R.id.czy);
        this.f13732O = (HSImageView) mo11032a(R.id.dp4);
        this.f13733P = (HSImageView) mo11032a(R.id.dp5);
        this.f13734Q = (ImageView) mo11032a(R.id.ck0);
        this.f13735R = (ImageView) mo11032a(R.id.czw);
        this.f13729L.setVisibility(8);
        this.f13736S = (VHeadView) mo11032a(R.id.d1o);
        this.f13737T = (TextView) mo11032a(R.id.d1p);
        this.f13764d = (TextView) mo11032a(R.id.c_m);
        this.f13738U = (ImageView) mo11032a(R.id.ov);
        this.f13739V = (TextView) mo11032a(R.id.dq6);
        this.f13740W = (ImageView) mo11032a(R.id.as8);
        this.f13741X = (ImageView) mo11032a(R.id.as9);
        this.f13765e = (TextView) mo11032a(R.id.d7t);
        this.f13754ak = (TextView) mo11032a(R.id.bc8);
        this.f13773m = mo11032a(R.id.dty);
        this.f13774n = (ImageView) mo11032a(R.id.bed);
        C9432q.m18691b((View) this.f13774n, 8);
        this.f13766f = mo11032a(R.id.dmf);
        this.f13742Y = (TextView) mo11032a(R.id.bcc);
        this.f13743Z = (TextView) mo11032a(R.id.be1);
        this.f13744aa = (TextView) mo11032a(R.id.bd_);
        this.f13767g = mo11032a(R.id.ss);
        this.f13756am = (LinearLayout) mo11032a(R.id.bdc);
        this.f13757an = (TextView) mo11032a(R.id.bdb);
        this.f13777q = (RelativeLayout) mo11032a(R.id.aog);
        this.f13758ao = (TextView) mo11032a(R.id.aoh);
        this.f13760aq = mo11032a(R.id.aeq);
        this.f13760aq.setOnClickListener(this.f13761ar);
        this.f13773m.setOnClickListener(this.f13761ar);
        this.f13738U.setOnClickListener(this.f13761ar);
        a.setOnClickListener(this.f13761ar);
        this.f13736S.setOnClickListener(this.f13761ar);
        this.f13765e.setOnClickListener(this.f13761ar);
        this.f13767g.setOnClickListener(this.f13761ar);
        mo11032a(R.id.bca).setOnClickListener(this.f13761ar);
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "show");
        hashMap.put("event_module", CustomActionPushReceiver.f104061f);
        String str2 = "room_id";
        if (this.f13797x == null) {
            str = "0";
        } else {
            str = String.valueOf(this.f13797x.getId());
        }
        hashMap.put(str2, str);
        String str3 = "user_id";
        if (this.f13797x == null) {
            id = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        } else {
            id = this.f13797x.getOwner().getId();
        }
        hashMap.put(str3, String.valueOf(id));
        C8049c.m15979a().mo14202a("live_assit_guide_show", hashMap, new Object[0]);
        if (this.f13797x != null) {
            User owner = this.f13797x.getOwner();
            if (owner != null) {
                C5213c.m11815a((ImageView) this.f13736S, owner.getAvatarThumb(), (int) R.drawable.bt6);
                if (owner.displayId == null || !((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                    this.f13737T.setText(owner.getNickName());
                } else {
                    this.f13737T.setText(owner.displayId);
                }
            }
            C9381g gVar = this.f13751ah;
            ((EndPageRecommendRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(EndPageRecommendRetrofitApi.class)).getVideos(this.f13797x.getId()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4176c<C2992f>>(gVar) {

                /* renamed from: a */
                final /* synthetic */ Handler f13372a;

                {
                    this.f13372a = r1;
                }

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    C4176c cVar = (C4176c) obj;
                    if (this.f13372a != null) {
                        Message obtainMessage = this.f13372a.obtainMessage(21);
                        obtainMessage.obj = cVar.f11365b;
                        this.f13372a.sendMessage(obtainMessage);
                    }
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>(gVar) {

                /* renamed from: a */
                final /* synthetic */ Handler f13373a;

                {
                    this.f13373a = r1;
                }

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    if (this.f13373a != null) {
                        Message obtainMessage = this.f13373a.obtainMessage(21);
                        obtainMessage.obj = th;
                        this.f13373a.sendMessage(obtainMessage);
                    }
                }
            });
            this.f13738U.setVisibility(0);
            if (C8607a.f23572a) {
                this.f13765e.setVisibility(8);
            } else {
                this.f13765e.setVisibility(0);
            }
            if (owner != null && owner.getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14527a(true);
            }
            float a2 = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
            if (owner != null) {
                C5213c.m11821a(this.f13727J, owner.getAvatarLarge(), (C14234d) new C4620v(8, a2, null));
            }
            C8068g.m16014a((Context) this.f13771k);
            this.f13797x.getId();
            this.f13739V.setText(R.string.eg8);
            TextView textView = this.f13764d;
            if (this.f13768h || C8607a.f23572a) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            C8068g.m16014a((Context) this.f13771k);
            this.f13797x.getId();
            C4639e.m11122a().mo10414a(Integer.valueOf(0));
            ((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.mo9431a()).booleanValue();
            long j = 0;
            if (this.f13797x.getId() > 0 && this.f13797x.getId() == ((Long) C4525b.f12448v.mo10345a()).longValue()) {
                j = Math.max(0, SystemClock.elapsedRealtime() - ((Long) C4525b.f12449w.mo10345a()).longValue());
            }
            int i2 = (int) j;
            C9432q.m18682a(this.f13754ak, (CharSequence) this.f13771k.getResources().getString(R.string.e3x, new Object[]{C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i2 / 3600000), Integer.valueOf((i2 % 3600000) / 60000), Integer.valueOf((i2 % 60000) / 1000)})}));
            if (!TextUtils.isEmpty(this.f13747ad)) {
                C4514j.m10883j().mo10322c().mo10490a((Context) getActivity(), C4704c.m11227b(this.f13747ad).mo10506a(true).mo10505a(getContext().getResources().getString(R.string.e3o)));
            }
            this.f13760aq.setVisibility(0);
            C4116c.m10249a(C8612a.class);
            this.f13767g.setClickable(false);
            ((BannerRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(BannerRetrofitApi.class)).queryLiveEndPageBanner().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5138f<Object>(this), C5139g.f13790a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.akl, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo9601a(Activity activity, Room room, C8614a aVar, String str) {
        this.f13771k = activity;
        this.f13797x = room;
        this.f13798y = true;
        this.f13768h = TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15409a(C4528e.CLICK_RECORD_BUTTON_IN_END_LIVE);
        this.f13752ai = aVar;
        this.f13745ab = str;
    }
}
