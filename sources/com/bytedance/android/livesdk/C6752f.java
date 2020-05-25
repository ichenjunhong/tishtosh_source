package com.bytedance.android.livesdk;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.feed.C2976b;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.C4995b;
import com.bytedance.android.livesdk.chatroom.C4995b.C4996a;
import com.bytedance.android.livesdk.chatroom.LiveOntologyInfoManager$$Lambda$0;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.C4986a;
import com.bytedance.android.livesdk.chatroom.p307c.C5037c;
import com.bytedance.android.livesdk.chatroom.p307c.C5045f;
import com.bytedance.android.livesdk.chatroom.p310f.C5234s;
import com.bytedance.android.livesdk.chatroom.p310f.C5240v;
import com.bytedance.android.livesdk.chatroom.p310f.C5240v.C5241a;
import com.bytedance.android.livesdk.chatroom.widget.C6660ar;
import com.bytedance.android.livesdk.chatroom.widget.C6660ar.C6664a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.live.C7742a;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.FeedDraw;
import com.bytedance.android.livesdk.live.p394b.C7745a;
import com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver;
import com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver.C8026a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4625z;
import com.bytedance.android.livesdk.p279af.C4625z.C4626a;
import com.bytedance.android.livesdk.p399o.C8031b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p414s.C8247a;
import com.bytedance.android.livesdk.player.C8108r;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.viewmodel.C8421e;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager.C8477e;
import com.bytedance.android.livesdkapi.C8611d;
import com.bytedance.android.livesdkapi.depend.live.C8638a;
import com.bytedance.android.livesdkapi.depend.live.C8646e;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.live.C8659j;
import com.bytedance.android.livesdkapi.depend.live.C8659j.C8660a;
import com.bytedance.android.livesdkapi.depend.live.C8662l;
import com.bytedance.android.livesdkapi.depend.live.C8665o;
import com.bytedance.android.livesdkapi.depend.live.C8666p;
import com.bytedance.android.livesdkapi.depend.live.C8671u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.android.livesdkapi.p450h.C8759i;
import com.bytedance.android.livesdkapi.p450h.C8760j;
import com.bytedance.android.livesdkapi.p450h.C8761k;
import com.bytedance.android.livesdkapi.view.C8865b;
import com.bytedance.android.p160b.C2833b;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p661d.p662a.C10632b;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.f */
public class C6752f extends C3846a implements C4626a, C8657i, C8660a, C8865b {

    /* renamed from: H */
    private static boolean f18444H = true;

    /* renamed from: a */
    public static boolean f18445a = true;

    /* renamed from: A */
    private long f18446A = -1;

    /* renamed from: B */
    private boolean f18447B = false;

    /* renamed from: F */
    private boolean f18448F = false;

    /* renamed from: G */
    private boolean f18449G = false;

    /* renamed from: I */
    private boolean f18450I = false;

    /* renamed from: J */
    private boolean f18451J = false;

    /* renamed from: K */
    private boolean f18452K = false;

    /* renamed from: L */
    private LiveNetworkBroadcastReceiver f18453L = new LiveNetworkBroadcastReceiver();

    /* renamed from: M */
    private C8026a f18454M = new C8026a() {
    };

    /* renamed from: N */
    private int f18455N = -1;

    /* renamed from: O */
    private C8108r f18456O;

    /* renamed from: P */
    private long f18457P = 0;

    /* renamed from: Q */
    private final Runnable f18458Q = new Runnable() {
        public final void run() {
            List list;
            ArrayList arrayList = new ArrayList(100);
            if (C6752f.this.f18466f != null) {
                list = C6752f.this.f18466f.mo13146d();
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(list);
                if (!C9414h.m18630a(arrayList2)) {
                    try {
                        int currentItem = C6752f.this.f18462b.getCurrentItem();
                        if (currentItem >= 0) {
                            if (currentItem < arrayList2.size()) {
                                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                    } catch (Throwable unused) {
                    }
                }
            }
            C6752f.this.f18470j.mo14099a(arrayList);
        }
    };

    /* renamed from: R */
    private final Handler f18459R = new Handler(Looper.getMainLooper());

    /* renamed from: S */
    private boolean f18460S = false;

    /* renamed from: T */
    private C8646e f18461T = new C7185g(this);

    /* renamed from: b */
    LiveVerticalViewPager f18462b;

    /* renamed from: c */
    FrameLayout f18463c;

    /* renamed from: d */
    public C6660ar f18464d;

    /* renamed from: e */
    PopupWindow f18465e;

    /* renamed from: f */
    public C8758h f18466f;

    /* renamed from: g */
    public C7742a f18467g;

    /* renamed from: h */
    public boolean f18468h;

    /* renamed from: i */
    Runnable f18469i = null;

    /* renamed from: j */
    public RoomStatsViewModel f18470j;

    /* renamed from: k */
    public C6765b f18471k;

    /* renamed from: l */
    C6764a f18472l;

    /* renamed from: m */
    public C8247a f18473m;

    /* renamed from: n */
    C4189h f18474n;

    /* renamed from: o */
    C8757g f18475o;

    /* renamed from: p */
    C8665o f18476p;

    /* renamed from: q */
    C8666p f18477q;

    /* renamed from: r */
    public boolean f18478r = ((Boolean) LiveSettingKeys.ENABLE_SLIDE_ENTER_ROOM_OPT.mo9431a()).booleanValue();

    /* renamed from: s */
    public String f18479s;

    /* renamed from: t */
    long f18480t = 0;

    /* renamed from: u */
    public boolean f18481u = true;

    /* renamed from: v */
    C5241a f18482v = new C5241a() {
    };

    /* renamed from: w */
    private C4625z f18483w;

    /* renamed from: x */
    private TelephonyManager f18484x;

    /* renamed from: y */
    private List<String> f18485y = Arrays.asList(new String[]{"homepage_hot", "live_merge", "homepage_follow"});

    /* renamed from: z */
    private boolean f18486z;

    /* renamed from: com.bytedance.android.livesdk.f$a */
    class C6764a {

        /* renamed from: a */
        public final String f18521a;

        /* renamed from: b */
        C1690c f18522b;

        /* renamed from: a */
        public final void mo12899a() {
            if (this.f18522b != null) {
                this.f18522b.dispose();
                this.f18522b = null;
            }
        }

        private C6764a(String str) {
            this.f18521a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.f$b */
    class C6765b implements C0997e {

        /* renamed from: a */
        public C8659j f18524a;

        /* renamed from: b */
        int f18525b;

        /* renamed from: d */
        private int f18527d = -1;

        /* renamed from: e */
        private long f18528e = -1;

        /* renamed from: f */
        private String f18529f;

        /* renamed from: g */
        private int f18530g;

        /* renamed from: h */
        private int f18531h;

        /* renamed from: i */
        private int f18532i;

        /* renamed from: j */
        private final String f18533j;

        public final void onPageScrollStateChanged(int i) {
            this.f18530g = i;
            if (this.f18524a != null) {
                this.f18524a.mo12029a(i);
            }
            if (this.f18525b != C6752f.this.f18467g.getCount() - 1) {
                C3974b.m10061a().mo9378a(C3983a.ScrollWatchLivePlay.name(), (C0184k) C6752f.this, C6752f.this.getContext(), i);
            }
        }

        public final void onPageSelected(int i) {
            C8659j b = C6752f.this.f18467g.mo14091b(i);
            if (b != this.f18524a) {
                C5045f a = C5045f.m11544a();
                switch (a.f13512f) {
                    case 0:
                        a.mo10908a("live.mt.slide_up_guide.need_show");
                        break;
                    case 1:
                        a.mo10908a("toplive.fullscreen.browsing.slide_up_guide.need_show");
                        break;
                }
                if (C6752f.this.getContext() == null) {
                    C8064d.m16005b();
                    C8064d.m9721c("LiveRoomFragment", "onPageSelected getContext==null");
                    return;
                }
                C8029a a2 = C8029a.m15933a();
                LiveVerticalViewPager liveVerticalViewPager = C6752f.this.f18462b;
                if (!(liveVerticalViewPager == null || i == -1)) {
                    JSONObject a3 = C8029a.m15937a(a2.mo14188a((View) liveVerticalViewPager, "ViewPage#onPageSelected()"));
                    C8029a.m15938a(a3, "position", i);
                    C8029a.m15939a(a3, "description", "room scroll change");
                    C8029a.f21972a.mo9200b(C8030b.Page.info, a3);
                }
                this.f18525b = i;
                this.f18527d = i;
                if (this.f18524a != null) {
                    if (C6752f.this.f18478r) {
                        this.f18524a.mo12044d();
                    } else {
                        this.f18524a.mo12065t();
                    }
                }
                if (b != null) {
                    b.mo12064s();
                    Fragment i2 = b.mo12049i();
                    if (i2.getArguments() != null) {
                        i2.getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", System.currentTimeMillis());
                    }
                }
                if (C6752f.this.f18478r) {
                    if (!(this.f18528e == -1 || this.f18529f == null)) {
                        ((C4139d) C4116c.m10249a(C4139d.class)).stopRoomPlayer(this.f18529f, false);
                        ((C4139d) C4116c.m10249a(C4139d.class)).recycleRoomPlayer(this.f18529f);
                    }
                    if (b != null) {
                        Room b2 = C6752f.this.mo12870b(i);
                        Bundle a4 = C6752f.this.f18466f.mo13138a(i);
                        if (b2 != null && a4 != null) {
                            m14195a(b, b2, ((C4139d) C4116c.m10249a(C4139d.class)).warmUp(b2.getId(), a4, C6752f.this.getContext()));
                        } else if (b2 != null) {
                            m14195a(b, b2, ((C4139d) C4116c.m10249a(C4139d.class)).warmUp(b2, C6752f.this.getContext()));
                        }
                    }
                }
                if (this.f18530g == 0) {
                    mo12900a(i, b);
                    C6752f.this.mo12872c(i);
                }
            }
        }

        C6765b(String str) {
            this.f18533j = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo12900a(int i, C8659j jVar) {
            C3982g.m10091b(C3983a.ScrollWatchLivePlay);
            C3974b.m10061a().mo9384b(C3983a.ScrollWatchLivePlay.name(), (C0184k) C6752f.this, C6752f.this.getContext());
            C3974b.m10061a().mo9377a(C3983a.ScrollWatchLivePlay.name(), (C0184k) C6752f.this, C6752f.this.getContext());
            C6752f.this.mo12885q();
            ((C4193l) C4116c.m10249a(C4193l.class)).recordEnterStart(C8638a.SLIDE);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f18524a != null) {
                this.f18524a.mo12049i().getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STOP_KEY_TYPE", C5037c.m11522a((Object) jVar));
                if (C6752f.this.f18478r) {
                    this.f18524a.mo12045e();
                } else {
                    this.f18524a.mo12046f();
                }
                this.f18524a.mo12049i().getArguments().remove("live.intent.extra.ENTER_TYPE");
                this.f18524a.mo12049i().getArguments().remove("live.intent.extra.PAGE_DELAY_TYPE");
                if (C6752f.f18445a) {
                    C6752f.f18445a = false;
                    C10753b a = C10753b.m21793a(C6752f.this.getContext());
                    String s = C6752f.this.mo12887s();
                    if (a.mo19444a(s, true)) {
                        a.mo19441a(s, (Object) Boolean.valueOf(false)).mo19443a();
                    }
                }
            }
            if (jVar != null) {
                if (this.f18524a != null) {
                    jVar.mo12049i().getArguments().putString("live.intent.extra.ENTER_TYPE", "draw");
                    jVar.mo12049i().getArguments().putString("live.intent.extra.PAGE_DELAY_TYPE", "slide");
                    jVar.mo12049i().getArguments().putString("enter_live_from_page", this.f18524a.mo12049i().getArguments().getString("enter_live_from_page"));
                    jVar.mo12049i().getArguments().putInt("current_room_position", i);
                    jVar.mo12049i().getArguments().putString("live.intent.extra.EXTRA_ENTER_FEED_STYLE", C6752f.this.f18479s);
                    jVar.mo12049i().getArguments().putLong("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME", currentTimeMillis);
                    jVar.mo12049i().getArguments().putString("live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE", "slide");
                    Room b = C6752f.this.mo12870b(i);
                    if (b != null && b.isFromRecommendCard) {
                        jVar.mo12049i().getArguments().putString("enter_from_merge_recommend", "pop_card");
                    }
                }
                jVar.mo12041b();
                if (this.f18524a != null) {
                    C8038g a2 = C8049c.m15979a().mo14201a(C8059j.class);
                    if (a2 != null) {
                        a2.mo14194a("action_type", "draw");
                    }
                    if (C6752f.this.f18466f instanceof MultiRoomIdListProvider) {
                        long j = C6752f.this.f18466f.mo13138a(i).getLong("anchor_id");
                        if (j > 0) {
                            jVar.mo12049i().getArguments().putLong("anchor_id", j);
                        }
                    }
                    C6752f.this.mo12865a(this.f18533j, "draw", jVar, jVar.mo12049i().getArguments());
                    C6752f.this.mo12864a(this.f18533j, 0, "draw", jVar.mo12049i().getArguments(), null);
                    Bundle arguments = jVar.mo12049i().getArguments();
                    if (C6752f.this.mo12886r() && arguments != null) {
                        ((C7745a) C6752f.this.f18466f).mo14097b(arguments.getLong("live.intent.extra.ROOM_ID", 0));
                    }
                }
            }
            this.f18524a = jVar;
            this.f18527d = -1;
            if (C6752f.this.f18478r) {
                this.f18528e = -1;
                this.f18529f = null;
            }
            C6752f.this.mo12876g();
            C6752f.this.mo12877h();
        }

        /* renamed from: a */
        private void m14195a(C8659j jVar, Room room, C2833b bVar) {
            if (bVar != null) {
                this.f18529f = bVar.getPlayerTag();
                this.f18528e = room.getId();
                jVar.mo12049i().getArguments().putString("live.intent.extra.WARM_UP_PLAYER_TAG", this.f18529f);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (!(C6752f.this.f18473m == null || C6752f.this.f18473m.mo14408a() == null)) {
                C6752f.this.f18473m.mo14408a().onPageScrolled(i, f, i2);
            }
            if (i != this.f18527d || f >= 1.0E-10f) {
                if (C6752f.this.f18478r && this.f18527d != -1 && i != this.f18527d && f < 1.0E-10f) {
                    Room b = C6752f.this.mo12870b(i);
                    if (!(b == null || this.f18528e == -1 || b.getId() == this.f18528e)) {
                        if (this.f18529f != null) {
                            ((C4139d) C4116c.m10249a(C4139d.class)).stopRoomPlayer(this.f18529f, false);
                            ((C4139d) C4116c.m10249a(C4139d.class)).recycleRoomPlayer(this.f18529f);
                            this.f18529f = null;
                        }
                        this.f18528e = -1;
                    }
                    mo12900a(i, C6752f.this.f18467g.mo14091b(i));
                }
                return;
            }
            C8659j b2 = C6752f.this.f18467g.mo14091b(i);
            if (b2 != this.f18524a) {
                mo12900a(i, b2);
                C6752f.this.mo12872c(i);
            }
            if (this.f18532i >= 0 && i != this.f18532i) {
                if (i < this.f18532i) {
                    this.f18531h = 0;
                } else {
                    this.f18531h++;
                }
                this.f18532i = i;
                if (this.f18531h > 15) {
                    this.f18532i = -1;
                    C6752f fVar = C6752f.this;
                    if (fVar.f18472l != null) {
                        C10753b a = C10753b.m21793a(fVar.getContext());
                        if (a.mo19444a("live.pref.PREF_SHOW_DISLIKE_TIPS", true)) {
                            a.mo19441a("live.pref.PREF_SHOW_DISLIKE_TIPS", (Object) Boolean.valueOf(false)).mo19443a();
                            View inflate = View.inflate(fVar.getContext(), R.layout.aoc, null);
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.fj);
                            LayoutParams layoutParams = (LayoutParams) lottieAnimationView.getLayoutParams();
                            layoutParams.topMargin = (int) ((((float) fVar.getActivity().getWindow().getDecorView().getHeight()) / 2.0f) - (((float) fVar.getResources().getDimensionPixelSize(R.dimen.od)) / 2.0f));
                            PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                            inflate.setOnClickListener(new C8121r(popupWindow));
                            popupWindow.showAtLocation(fVar.getActivity().getWindow().getDecorView(), 51, 0, 0);
                            lottieAnimationView.getClass();
                            popupWindow.setOnDismissListener(new C8246s(lottieAnimationView));
                            lottieAnimationView.setAnimation("dislike_live_tips.json");
                            lottieAnimationView.mo6658c(true);
                            lottieAnimationView.mo6654b();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final Fragment mo12869b() {
        return this;
    }

    /* renamed from: d */
    public final C8665o mo12873d() {
        return this.f18476p;
    }

    /* renamed from: e */
    public final C8666p mo12874e() {
        return this.f18477q;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: a */
    public final boolean mo12867a() {
        C8659j c = mo12871c();
        return c != null && c.mo8466a();
    }

    /* renamed from: a */
    public final boolean mo12868a(Room room) {
        if (this.f18472l == null) {
            return false;
        }
        String str = this.f18472l.f18521a;
        View inflate = View.inflate(getContext(), R.layout.aod, null);
        View findViewById = inflate.findViewById(R.id.a5z);
        ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).gravity = 17;
        this.f18465e = new PopupWindow(inflate, -1, -1, true);
        inflate.setOnClickListener(new C8272t(this));
        findViewById.setOnClickListener(new C7667i(this, room));
        this.f18465e.showAtLocation(getActivity().getWindow().getDecorView(), 51, 0, 0);
        return true;
    }

    /* renamed from: a */
    public final void mo12864a(String str, long j, String str2, Bundle bundle, Bundle bundle2) {
        long j2;
        final String str3;
        Bundle bundle3 = bundle;
        String string = bundle3.getString("live.intent.extra.REQUEST_ID");
        if (TextUtils.isEmpty(string)) {
            Bundle bundle4 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            string = bundle4 != null ? bundle4.getString("request_id") : "";
        }
        final String str4 = string;
        Bundle bundle5 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        final String string2 = bundle5 != null ? bundle5.getString("request_page") : "";
        final String string3 = bundle5 != null ? bundle5.getString("anchor_type") : "";
        final String string4 = bundle3.getString("live.intent.extra.LOG_PB");
        final long j3 = bundle3.getLong("live.intent.extra.USER_FROM");
        final long j4 = bundle3.getLong("live.intent.extra.ROOM_ID", 0);
        bundle3.getLong("live.intent.extra.USER_ID", 0);
        long j5 = bundle3.getLong("anchor_id", 0);
        final String string5 = bundle3.getString("live.intent.extra.SOURCE_EXTRA");
        final String string6 = bundle3.getString("scene_id");
        final String str5 = "";
        final String string7 = bundle3.getString("card_id");
        final String string8 = bundle3.getString("card_position");
        Bundle bundle6 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle6 != null) {
            Bundle bundle7 = bundle6.getBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1");
            String str6 = (bundle7 == null || !bundle7.containsKey("subtab")) ? str : (String) bundle7.get("subtab");
            if (j5 == 0) {
                j5 = bundle6.getLong("anchor_id", 0);
            }
            j2 = j5;
            str3 = str6;
        } else {
            str3 = str;
            j2 = j5;
        }
        C675410 r24 = r0;
        final long j6 = j;
        C10632b a = C10632b.m21416a();
        final String str7 = str2;
        final Bundle bundle8 = bundle6;
        final Bundle bundle9 = bundle2;
        final long j7 = j2;
        final Bundle bundle10 = bundle;
        C675410 r0 = new Callable(this) {

            /* renamed from: s */
            final /* synthetic */ C6752f f18506s;

            public final Object call() throws Exception {
                String str;
                String str2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("request_id", str4);
                    jSONObject.put("log_pb", string4);
                    jSONObject.put("source", j3);
                    jSONObject.put("from_room_id", j6);
                    jSONObject.put("enter_type", str7);
                    if (!str5.equals(str3)) {
                        jSONObject.put("is_fix", str3);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        jSONObject.put("moment_room_source", string5);
                    }
                    if (bundle9 != null) {
                        for (String str3 : bundle9.keySet()) {
                            jSONObject.put(str3, String.valueOf(bundle9.get(str3)));
                        }
                    }
                } catch (Exception unused) {
                }
                if (C8049c.m15979a().mo14201a(C8059j.class).mo14192a().containsKey("video_id")) {
                    jSONObject.put("video_id", C8049c.m15979a().mo14201a(C8059j.class).mo14192a().get("video_id"));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(j4));
                hashMap.put("anchor_id", String.valueOf(j7));
                hashMap.put("request_id", str4);
                hashMap.put("log_pb", string4);
                if (!TextUtils.isEmpty(string5)) {
                    hashMap.put("moment_room_source", string5);
                }
                hashMap.put("is_preview", this.f18506s.getArguments().getString("is_preview", "0"));
                hashMap.put("is_sale", "unknown");
                hashMap.put("orientation", String.valueOf(this.f18506s.getArguments().getInt("orientation")));
                if (bundle10 != null && bundle10.containsKey("live.intent.extra.WINDOW_MODE")) {
                    hashMap.put("live_window_mode", bundle10.getString("live.intent.extra.WINDOW_MODE", ""));
                }
                if (this.f18506s.f18481u) {
                    if (bundle8 != null) {
                        TextUtils.isEmpty(bundle8.getString("log_pb"));
                        if (!TextUtils.isEmpty(bundle8.getString("request_id"))) {
                            hashMap.put("request_id", bundle8.getString("request_id"));
                        }
                        if (!TextUtils.isEmpty(bundle8.getString("log_pb"))) {
                            hashMap.put("log_pb", bundle8.getString("log_pb"));
                        }
                    }
                    C5234s.m11848a(this.f18506s.f18481u, bundle10);
                    this.f18506s.f18481u = false;
                } else {
                    C8038g a = C8049c.m15979a().mo14201a(Room.class);
                    if (a instanceof C8045n) {
                        C8045n nVar = (C8045n) a;
                        nVar.f21980b = String.valueOf(j4);
                        nVar.f21981c = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
                    }
                    C5234s.m11848a(this.f18506s.f18481u, bundle10);
                }
                if (!TextUtils.isEmpty(string6) && "draw".equals(str7)) {
                    hashMap.put("scene_id", string6);
                }
                hashMap.put("growth_deepevent", "1");
                hashMap.put("live_cover_mode", this.f18506s.f18479s);
                String str4 = "is_video_head";
                if (this.f18506s.getArguments().getBoolean("live.intent.extra.IS_VIDEO_HEAD", false)) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str4, str);
                hashMap.put("request_page", string2);
                hashMap.put("anchor_type", string3);
                if (bundle10.getBoolean("enter_from_dou_plus", false) || bundle10.getBoolean("enter_from_effect_ad")) {
                    String str5 = "is_other_channel";
                    if (bundle10.getBoolean("enter_from_effect_ad")) {
                        str2 = "effective_ad";
                    } else {
                        str2 = "dou_plus";
                    }
                    hashMap.put(str5, str2);
                }
                Bundle bundle = bundle10.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
                if (!(bundle == null || bundle.getBundle("log_extra") == null)) {
                    String string = bundle.getBundle("log_extra").getString("enter_from_merge");
                    if (!TextUtils.isEmpty(string)) {
                        hashMap.put("previous_page", string);
                    }
                }
                hashMap.put("request_page", C4995b.m11478a().mo10874f());
                C8049c.m15979a().mo14202a("rec_live_play", hashMap, new C8059j().mo14214b("live_view").mo14219g(str7));
                return null;
            }

            {
                this.f18506s = r4;
            }
        };
        a.mo18874a(null, r24, 0);
    }

    /* renamed from: a */
    public final void mo12865a(String str, String str2, C8659j jVar, Bundle bundle) {
        String str3 = str2;
        Bundle bundle2 = bundle;
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        String string = bundle2.getString("live.intent.extra.REQUEST_ID");
        if (TextUtils.isEmpty(string)) {
            Bundle bundle3 = bundle2.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            string = bundle3 != null ? bundle3.getString("request_id") : "";
        }
        String string2 = bundle2.getString("live.intent.extra.LOG_PB");
        long j = bundle2.getLong("live.intent.extra.ROOM_ID", 0);
        long j2 = bundle2.getLong("anchor_id", 0);
        String str4 = (String) a.mo14192a().get("enter_from");
        String str5 = (String) a.mo14192a().get("source");
        String string3 = bundle2.getString("live.intent.extra.SOURCE_EXTRA");
        boolean z = bundle2.getBoolean("live.intent.extra.IS_THIRD_PARTY", false);
        String string4 = bundle2.getString("scene_id");
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        hashMap.put("anchor_id", String.valueOf(j2));
        C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
        if (a2 instanceof C8045n) {
            C8045n nVar = (C8045n) a2;
            nVar.f21980b = String.valueOf(j);
            nVar.f21981c = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        }
        String string5 = bundle2.getString("enter_from_merge", "");
        String string6 = bundle2.getString("enter_method", "");
        hashMap.put("request_id", string);
        hashMap.put("log_pb", string2);
        hashMap.put("streaming_type", z ? "thirdparty" : "general");
        hashMap.put("action_type", str3);
        hashMap.put("enter_from_merge", string5);
        hashMap.put("enter_method", string6);
        hashMap.put("live_cover_mode", this.f18479s);
        if (!TextUtils.isEmpty(string3)) {
            hashMap.put("moment_room_source", string3);
        }
        if (!TextUtils.isEmpty(string4) && "draw".equals(str3)) {
            hashMap.put("scene_id", string4);
        }
        if ("draw".equals(str3)) {
            hashMap.put("orientation", "0");
        }
        if (bundle2 != null && bundle2.containsKey("live.intent.extra.WINDOW_MODE")) {
            hashMap.put("live_window_mode", bundle2.getString("live.intent.extra.WINDOW_MODE", ""));
        }
        C8049c.m15979a().mo14202a("live_show", hashMap, new C8059j().mo14213a(str4).mo14214b("live_view").mo14218f("core").mo14215c(str5));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12863a(String str, long j, String str2) {
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        if (a != null && a.mo14192a() != null && a.mo14192a().get("enter_method") != null && getArguments() != null) {
            Bundle arguments = getArguments();
            if (TextUtils.isEmpty(str)) {
                str = arguments.getString("live.intent.extra.USER_ID");
            }
            String string = arguments.getString("livesdk_live_push_status", "");
            if (j == 0) {
                j = arguments.getLong("live.intent.extra.ROOM_ID", 0);
            }
            if (a.mo14192a().get("enter_method") != null && TextUtils.equals(a.mo14192a().get("enter_method").toString(), "push")) {
                C8049c.m15979a().mo14202a("livesdk_push_error", C8066a.m16007a().mo14221a("anchor_id", str).mo14221a("anchor_status", str2).mo14221a("room_id", String.valueOf(j)).mo14221a("push_lookup_status", string).f22045a, new Object[0]);
            }
        }
    }

    /* renamed from: v */
    private void m14152v() {
        this.f18459R.removeCallbacks(this.f18458Q);
    }

    /* renamed from: r */
    public final boolean mo12886r() {
        return this.f18466f instanceof C7745a;
    }

    /* renamed from: h */
    public final void mo12877h() {
        m14152v();
        this.f18459R.postDelayed(this.f18458Q, 180000);
    }

    /* renamed from: k */
    public final boolean mo12880k() {
        return C5234s.m11849a(getArguments());
    }

    /* renamed from: m */
    public final void mo12881m() {
        this.f18463c.post(new C8119q(this));
    }

    public void onStop() {
        if (this.f18464d != null) {
            this.f18464d.mo12785c();
        }
        super.onStop();
    }

    /* renamed from: w */
    private void m14153w() {
        if (this.f18469i != null && this.f18462b != null && !this.f18448F) {
            this.f18462b.post(new C8070p(this));
        }
    }

    /* renamed from: x */
    private static boolean m14154x() {
        if (C4116c.m10249a(C4193l.class) == null) {
            return false;
        }
        return ((C4193l) C4116c.m10249a(C4193l.class)).isInteracting();
    }

    /* renamed from: y */
    private boolean m14155y() {
        if (!C10753b.m21793a(C3922z.m9915e()).mo19444a(m14146A(), true)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C8659j mo12871c() {
        if (this.f18467g == null || this.f18467g.getCount() == 0) {
            return null;
        }
        return this.f18467g.mo14091b(this.f18462b.getCurrentItem());
    }

    /* renamed from: j */
    public final boolean mo12879j() {
        if (!"homepage_hot".equals(mo12888t()) || !"video_head".equals(mo12889u())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo12882n() {
        if (this.f18465e != null && this.f18465e.isShowing()) {
            C8441w.m16641a(this.f18465e);
        }
        mo12883o();
    }

    /* renamed from: o */
    public final void mo12883o() {
        if (this.f18464d != null) {
            this.f18464d.mo12784b();
            this.f18463c.postDelayed(new Runnable() {
                public final void run() {
                    if (C6752f.this.mo8452l() && C6752f.this.f18464d != null) {
                        C6752f.this.f18463c.removeView(C6752f.this.f18464d);
                        C6752f.this.f18464d.mo12785c();
                        C6752f.this.f18464d = null;
                    }
                }
            }, 320);
        }
        C5240v.m11856a();
    }

    public void onResume() {
        super.onResume();
        m14153w();
        this.f18450I = false;
        this.f18474n.mo14274d(false);
        mo12887s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo12884p() {
        boolean z;
        if (this.f18462b != null) {
            LiveVerticalViewPager liveVerticalViewPager = this.f18462b;
            if (this.f18486z || this.f18468h || this.f18460S || m14154x()) {
                z = false;
            } else {
                z = true;
            }
            liveVerticalViewPager.setEnabled(z);
        }
    }

    /* renamed from: q */
    public final void mo12885q() {
        if (getArguments() != null) {
            getArguments().putString("is_preview", "0");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public String mo12888t() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "";
        }
        Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle == null) {
            return "";
        }
        return bundle.getString("enter_from_merge", "");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public String mo12889u() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return "";
        }
        Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle == null) {
            return "";
        }
        return bundle.getString("enter_method", "");
    }

    /* renamed from: A */
    private String m14146A() {
        if (!mo12886r() || this.f18455N == 0) {
            return "live.pref.SHOW_SCROLL_TIPS";
        }
        StringBuilder sb = new StringBuilder("live.pref.SHOW_SCROLL_TIPS_");
        sb.append(((C7745a) this.f18466f).f21295c);
        return sb.toString();
    }

    /* renamed from: B */
    private String m14147B() {
        String t = mo12888t();
        String str = "";
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle == null) {
                str = "";
            } else {
                str = bundle.getString("enter_method", "");
            }
        }
        if (!"homepage_follow".equals(t) || !"live_cover".equals(str)) {
            return "";
        }
        return "live.pref.SHOW_SCROLL_TIPS_follow_story";
    }

    /* renamed from: z */
    private String m14156z() {
        String t = mo12888t();
        if (this.f18485y == null || !this.f18485y.contains(t)) {
            C10753b.m21793a(C3922z.m9915e()).mo19441a("live.pref.SHOW_SCROLL_TIPS", (Object) Boolean.valueOf(false)).mo19443a();
            return "live.pref.SHOW_SCROLL_TIPS";
        }
        StringBuilder sb = new StringBuilder("live.pref.SHOW_SCROLL_TIPS_");
        sb.append(t);
        return sb.toString();
    }

    /* renamed from: f */
    public final void mo12875f() {
        C8659j c = mo12871c();
        if (c != null) {
            c.mo12043c();
        }
        try {
            this.f18462b.setAdapter(null);
        } catch (Exception unused) {
        }
        if (this.f18467g != null) {
            this.f18467g.mo14090a();
            this.f18467g = null;
        }
        if (this.f18466f != null) {
            this.f18466f.mo13144c();
            this.f18466f = null;
        }
    }

    /* renamed from: g */
    public final void mo12876g() {
        int currentItem = this.f18462b.getCurrentItem();
        if (currentItem >= 0 && this.f18467g != null) {
            int count = this.f18467g.getCount() - currentItem;
            int i = 0;
            C2976b bVar = (C2976b) CoreSettingKeys.LIVE_FEED_PRELOAD.mo9431a();
            if (bVar != null) {
                i = bVar.f8725c;
            }
            if (i <= 0) {
                i = 2;
            }
            if (count <= i) {
                this.f18466f.mo13143b(currentItem);
            }
        }
    }

    /* renamed from: s */
    public final String mo12887s() {
        String B = m14147B();
        if (!C9431p.m18664a(B)) {
            return B;
        }
        String z = m14156z();
        if (m14155y()) {
            C10753b.m21793a(C3922z.m9915e()).mo19441a(z, (Object) Boolean.valueOf(false)).mo19443a();
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo12878i() {
        boolean z;
        getArguments();
        if (((Integer) LiveSettingKeys.SLIDE_UP_SHOW_AB.mo9431a()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f18466f.mo13141b() <= 1 || mo12879j() || mo12880k() || this.f18468h) {
            return false;
        }
        String s = mo12887s();
        C10753b a = C10753b.m21793a(getContext());
        if (!a.mo19444a(s, true)) {
            mo12883o();
            return false;
        }
        a.mo19441a(s, (Object) Boolean.valueOf(false)).mo19443a();
        if (this.f18464d != null) {
            this.f18463c.removeView(this.f18464d);
        }
        this.f18464d = new C6660ar(getContext());
        this.f18464d.mo12783a("Gesture_SlideUp.json", "images/");
        this.f18464d.setDestText(C3922z.m9903a((int) R.string.f1j));
        this.f18464d.mo12782a();
        this.f18464d.setClickListener(new C6664a() {
            /* renamed from: a */
            public final void mo12794a() {
                C6752f.this.f18464d.setClickable(false);
                C6752f.this.mo12883o();
            }
        });
        this.f18463c.addView(this.f18464d);
        return true;
    }

    public void onPause() {
        C8758h hVar;
        FeedItem feedItem;
        if (getActivity() != null && getActivity().isFinishing()) {
            if (this.f18466f instanceof C8760j) {
                int currentItem = this.f18462b.getCurrentItem();
                if (currentItem >= 0 && currentItem < this.f18466f.mo13141b()) {
                    long j = this.f18466f.mo13138a(currentItem).getLong("live.intent.extra.ROOM_ID", 0);
                    if (j != 0) {
                        ((C8760j) this.f18466f).mo13145c(j);
                    }
                }
            } else if (this.f18455N == 0 && ((Integer) LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE.mo9431a()).intValue() == 1 && this.f18455N == 0) {
                if (this.f18475o == null || this.f18475o.mo15417a() == null) {
                    hVar = null;
                } else {
                    hVar = this.f18475o.mo15417a();
                }
                int currentItem2 = this.f18462b.getCurrentItem();
                if (currentItem2 > 0 && currentItem2 < this.f18466f.mo13141b() && hVar != null) {
                    int a = hVar.mo13137a(this.f18466f.mo13138a(0));
                    if (a >= 0) {
                        C7745a aVar = (C7745a) this.f18466f;
                        int size = aVar.f21293a.size();
                        if (1 <= currentItem2 && size > currentItem2) {
                            feedItem = (FeedItem) aVar.f21293a.get(currentItem2);
                        } else {
                            feedItem = null;
                        }
                        hVar.mo13139a(a, feedItem);
                    }
                }
            }
        }
        super.onPause();
        C4995b a2 = C4995b.m11478a();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.hashCode() == a2.f13382d && activity.isFinishing()) {
            a2.f13380b = false;
            a2.f13381c = null;
        }
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C5045f.m11544a().mo10909b();
        m14152v();
        ((C4193l) C4116c.m10249a(C4193l.class)).removeInteractStateChangeListener(this.f18461T);
        if (this.f18466f instanceof C7745a) {
            C7745a aVar = (C7745a) this.f18466f;
            if (FeedDraw.needCollectUnRead(aVar.f21295c)) {
                aVar.mo14098e();
            }
        }
        if (this.f18450I || getActivity() == null || getActivity().getLifecycle().mo323a().isAtLeast(C0178b.INITIALIZED)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.getLifecycle().mo324a(new LiveRoomFragment$2(this, activity));
            }
        } else {
            mo12875f();
            if (this.f18475o.mo15417a() == this.f18466f) {
                this.f18475o.mo15418a(null);
            }
            C8123a.f22180a = null;
        }
        if (this.f18447B) {
            this.f18447B = false;
        } else {
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(null);
        }
        ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController().mo14272c(((IHostContext) C4116c.m10249a(IHostContext.class)).context());
        C8580y.m16962a().mo15067b();
        if (this.f18474n != null) {
            this.f18474n.mo9622c();
            if (getArguments() == null) {
                str = null;
            } else {
                str = getArguments().getString("live.intent.extra.WARM_UP_PLAYER_TAG");
            }
            if (str != null) {
                this.f18474n.mo9616a(true, str);
                ((C4139d) C4116c.m10249a(C4139d.class)).stopRoomPlayer(str, false);
                ((C4139d) C4116c.m10249a(C4139d.class)).recycleRoomPlayer(str);
            }
        }
        if (!(this.f18483w == null || this.f18484x == null)) {
            this.f18484x.listen(this.f18483w, 0);
            this.f18483w = null;
        }
        if (this.f18446A > 0) {
            this.f18446A = 0;
        }
        if ((getActivity() instanceof C8611d) && !this.f18450I) {
            getActivity();
        }
        if (this.f18471k != null) {
            this.f18471k.f18524a = null;
            this.f18471k = null;
            this.f18469i = null;
        }
    }

    /* renamed from: a */
    public final void mo12866a(boolean z) {
        this.f18460S = z;
        mo12884p();
    }

    /* renamed from: a */
    public final void mo12860a(long j) {
        this.f18446A = j;
        m14148a(126, "leave for profile");
        this.f18476p.mo12891a();
    }

    /* renamed from: b */
    public final Room mo12870b(int i) {
        List d = this.f18466f.mo13146d();
        if (C3914u.m9892a(d) || i < 0 || i >= d.size()) {
            return null;
        }
        return (Room) d.get(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f18486z = z;
        mo12884p();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = "enter_from_dou_plus";
        boolean z = false;
        if (getArguments() != null && getArguments().getBoolean("enter_from_dou_plus", false)) {
            z = true;
        }
        bundle.putBoolean(str, z);
    }

    /* renamed from: a */
    private void m14151a(long... jArr) {
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            Room room = (Room) C8761k.m17247a().f24030a.get(j);
            if (room != null) {
                arrayList.add(room);
            }
        }
        if (!C9414h.m18630a(arrayList)) {
            this.f18466f.mo14087b((List<Room>) arrayList);
            this.f18475o.mo15418a(this.f18466f);
        }
    }

    /* renamed from: c */
    public final void mo12872c(int i) {
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("has_page_slide", true);
        }
        List d = this.f18466f.mo13146d();
        if (i >= 0 && d.size() > i) {
            ((Room) d.get(i)).getId();
            if (getActivity() instanceof C8662l) {
                getActivity();
            }
        }
    }

    /* renamed from: a */
    public final void mo10409a(int i) {
        switch (i) {
            case 0:
                this.f18474n.mo14270a(false, getContext());
                return;
            case 1:
                return;
            case 2:
                this.f18474n.mo14270a(true, getContext());
                break;
        }
    }

    public void onCreate(Bundle bundle) {
        if (mo12879j()) {
            C5045f.m11544a().mo10907a(0);
        } else if (mo12880k()) {
            C5045f.m11544a().mo10907a(1);
        }
        this.f18480t = System.currentTimeMillis();
        C3982g.m10091b(C3983a.StartLivePlay);
        C3974b.m10061a().mo9377a(C3983a.StartLivePlay.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9384b(C3983a.StartLivePlay.name(), (C0184k) this, getContext());
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        hashMap.put("location", "live detail after super oncreate");
        TTLiveSDKContext.getHostService().mo10311d().mo15567a("feed_enter_room", hashMap);
        this.f18456O = new C8108r();
        this.f18475o = C8759i.m17243b();
        this.f18474n = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
        this.f18474n.mo9618b();
        ((C4193l) C4116c.m10249a(C4193l.class)).registerInteractStateChangeListener(this.f18461T);
        this.f18470j = (RoomStatsViewModel) C0214z.m439a((Fragment) this, (C0212b) new C8421e()).mo359a(RoomStatsViewModel.class);
        this.f18470j.f21314a.observe(this, new C7703j(this));
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        hashMap.put("location", "finish live detail oncreate");
        TTLiveSDKContext.getHostService().mo10311d().mo15567a("feed_enter_room", hashMap);
        ((C4139d) C4116c.m10249a(C4139d.class)).getDnsOptimizer().mo9576a(false);
        if (this.f18476p == null) {
            this.f18476p = new C8665o() {
                /* renamed from: a */
                public final void mo12891a() {
                    FragmentActivity activity = C6752f.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            };
        }
        if (this.f18477q == null) {
            this.f18477q = new C8666p() {
                /* renamed from: a */
                public final void mo12892a(View view, View view2) {
                    FragmentActivity activity = C6752f.this.getActivity();
                    if (VERSION.SDK_INT >= 21) {
                        C3865ac.m9796a((Activity) activity);
                    }
                }

                /* renamed from: a */
                public final void mo12893a(boolean z, View view, View view2, View view3, View view4) {
                    FragmentActivity activity = C6752f.this.getActivity();
                    if (activity != null) {
                        Window window = activity.getWindow();
                        if (window != null) {
                            if (!z) {
                                activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
                            } else if (C3894h.m9842a(activity)) {
                                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                            }
                        }
                    }
                }
            };
        }
        C4995b a = C4995b.m11478a();
        FragmentActivity activity = getActivity();
        Bundle arguments = getArguments();
        if (!a.f13380b && activity != null) {
            a.f13380b = true;
            C4995b.f13378a++;
            a.f13381c = new C4996a(arguments);
            a.f13382d = activity.hashCode();
            a.f13383e = new LiveOntologyInfoManager$$Lambda$0(a);
            activity.getLifecycle().mo324a(a.f13383e);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("page_name", C6752f.class.getName());
        C8064d.m16005b().mo9199b("ttlive_page", (Map<String, ?>) hashMap2);
    }

    /* renamed from: a */
    public final void mo12862a(String str) {
        C8659j c = mo12871c();
        if (c != null) {
            C8671u g = c.mo12047g();
            if (g == C8671u.LIVE_STARTED || g == C8671u.DETACHED) {
                c.mo12032a(c.mo12049i().getArguments());
                Bundle arguments = getArguments();
                if (arguments != null) {
                    m14150a(arguments.getString("live.intent.extra.ENTER_LIVE_SOURCE"), arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA"));
                    C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                    if (a != null) {
                        a.mo14194a("action_type", str);
                    }
                    if (g == C8671u.LIVE_STARTED) {
                        return;
                    }
                }
            }
            if (this.f18448F) {
                this.f18448F = false;
                m14153w();
            } else if (TextUtils.equals(str, "click")) {
                c.mo12041b();
            } else {
                if (this.f18471k != null) {
                    C6765b bVar = this.f18471k;
                    bVar.mo12900a(bVar.f18525b, c);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027b, code lost:
        if (com.bytedance.common.utility.C9431p.m18664a(r3) == false) goto L_0x0281;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0287  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r21) {
        /*
            r20 = this;
            r11 = r20
            r0 = r21
            super.onActivityCreated(r21)
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            r2 = 0
            if (r1 == 0) goto L_0x0037
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            boolean r1 = com.bytedance.android.live.core.p230g.C3894h.m9842a(r1)
            if (r1 == 0) goto L_0x0025
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            android.view.Window r1 = r1.getWindow()
            r3 = 48
            r1.setSoftInputMode(r3)
        L_0x0025:
            r11.f18486z = r2
            r20.mo12884p()
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            android.view.Window r1 = r1.getWindow()
            r3 = 128(0x80, float:1.794E-43)
            r1.addFlags(r3)
        L_0x0037:
            boolean r1 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r1 != 0) goto L_0x005d
            com.bytedance.android.livesdk.af.z r1 = new com.bytedance.android.livesdk.af.z
            r1.<init>(r11)
            r11.f18483w = r1
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            r11.f18484x = r1
            android.telephony.TelephonyManager r1 = r11.f18484x
            if (r1 == 0) goto L_0x005d
            android.telephony.TelephonyManager r1 = r11.f18484x
            com.bytedance.android.livesdk.af.z r3 = r11.f18483w
            r4 = 32
            r1.listen(r3, r4)
        L_0x005d:
            if (r0 == 0) goto L_0x0074
            android.os.Bundle r1 = r20.getArguments()
            if (r1 == 0) goto L_0x0074
            android.os.Bundle r1 = r20.getArguments()
            java.lang.String r3 = "enter_from_dou_plus"
            java.lang.String r4 = "enter_from_dou_plus"
            boolean r0 = r0.getBoolean(r4, r2)
            r1.putBoolean(r3, r0)
        L_0x0074:
            android.os.Bundle r0 = r20.getArguments()
            r20.mo12875f()
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            r3 = 0
            if (r1 == 0) goto L_0x009a
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.mo10315h()
            if (r1 == 0) goto L_0x009a
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.mo10315h()
            long r5 = r1.mo14529b()
            goto L_0x009b
        L_0x009a:
            r5 = r3
        L_0x009b:
            r1 = 1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ec
            java.lang.Class<com.bytedance.android.live.room.l> r7 = com.bytedance.android.live.room.C4193l.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.room.l r7 = (com.bytedance.android.live.room.C4193l) r7
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r7.getCurrentRoom()
            if (r7 == 0) goto L_0x00ec
            com.bytedance.android.live.base.model.user.User r8 = r7.getOwner()
            if (r8 == 0) goto L_0x00ec
            com.bytedance.android.live.base.model.user.User r8 = r7.getOwner()
            long r8 = r8.getId()
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x00ec
            android.content.Context r0 = r20.getContext()
            r3 = 2132551007(0x7f1c255f, float:2.075536E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r2)
            com.bytedance.android.livesdk.C8441w.m16642a(r0)
            r11.f18447B = r1
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r1 = r11.getString(r3)
            r11.m14148a(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            long r1 = r7.getId()
            java.lang.String r3 = "user_is_broadcasting"
            r11.mo12863a(r0, r1, r3)
            com.bytedance.android.livesdkapi.depend.live.o r0 = r11.f18476p
            r0.mo12891a()
            return
        L_0x00ec:
            java.lang.String r5 = "live.intent.extra.ENTER_LIVE_SOURCE"
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r6 = "live.intent.extra.EXTRA_ENTER_FEED_STYLE"
            java.lang.String r6 = r0.getString(r6)
            r11.f18479s = r6
            java.lang.String r7 = "live.intent.extra.FROM_ROOM_ID"
            long r7 = r0.getLong(r7, r3)
            java.lang.String r9 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r9 = r0.getBundle(r9)
            java.lang.String r10 = "live.intent.extra.DISLIKE_ENABLED"
            boolean r10 = r0.getBoolean(r10, r2)
            java.lang.String r12 = ""
            if (r9 == 0) goto L_0x012a
            java.lang.String r12 = "live.intent.extra.ENTER_LIVE_TIME"
            long r12 = r9.getLong(r12, r3)
            r11.f18457P = r12
            java.lang.String r12 = "enter_from_merge"
            java.lang.String r12 = r9.getString(r12)
            java.lang.String r13 = "enter_method"
            java.lang.String r13 = r9.getString(r13)
            r19 = r12
            r12 = r9
            r9 = r19
            goto L_0x0132
        L_0x012a:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r13 = r12
            r12 = r9
            r9 = r5
        L_0x0132:
            java.lang.String r14 = "live.intent.extra.IS_MULTI"
            boolean r14 = r12.getBoolean(r14, r2)
            if (r14 == 0) goto L_0x013f
            java.lang.String r14 = "live.intent.extra.IS_MULTI"
            r0.putBoolean(r14, r1)
        L_0x013f:
            java.lang.String r14 = "live.intent.extra.POSITION"
            int r14 = r12.getInt(r14, r2)
            if (r14 == 0) goto L_0x0152
            java.lang.String r14 = "live.intent.extra.POSITION"
            java.lang.String r15 = "live.intent.extra.POSITION"
            int r15 = r12.getInt(r15, r2)
            r0.putInt(r14, r15)
        L_0x0152:
            java.lang.String r14 = "live_cell_position"
            java.lang.String r15 = "live_cell_position"
            java.lang.String r15 = r0.getString(r15)
            r12.putString(r14, r15)
            java.lang.String r14 = "live.intent.extra.EXTRA_FLAG_FROM_NEW_AB_OF_BACK_PRE_ROOM"
            boolean r14 = r12.getBoolean(r14, r2)
            r11.f18451J = r14
            java.lang.String r14 = "live.intent.extra.WINDOW_MODE"
            java.lang.String r15 = ""
            java.lang.String r14 = r12.getString(r14, r15)
            boolean r14 = com.bytedance.common.utility.C9431p.m18664a(r14)
            if (r14 == 0) goto L_0x0180
            java.lang.String r14 = "live.intent.extra.WINDOW_MODE"
            java.lang.String r15 = "live.intent.extra.WINDOW_MODE"
            java.lang.String r3 = ""
            java.lang.String r3 = r0.getString(r15, r3)
            r12.putString(r14, r3)
        L_0x0180:
            java.lang.String r3 = "double_stream_feed_url"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r4 = r4 ^ r1
            java.lang.String r14 = "homepage_follow"
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto L_0x01a5
            java.lang.String r14 = "live_cell_cover"
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x01a3
            java.lang.String r14 = "live_cell"
            boolean r14 = android.text.TextUtils.equals(r14, r13)
            if (r14 == 0) goto L_0x01a5
        L_0x01a3:
            r14 = 1
            goto L_0x01a6
        L_0x01a5:
            r14 = 0
        L_0x01a6:
            if (r0 == 0) goto L_0x0225
            java.lang.String r15 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r15 = r0.getBundle(r15)
            java.lang.String r2 = "1"
            java.lang.String r1 = "enable_feed_drawer"
            r16 = r3
            java.lang.String r3 = "0"
            java.lang.String r1 = r0.getString(r1, r3)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x01d5
            if (r15 == 0) goto L_0x01d3
            java.lang.String r1 = "1"
            java.lang.String r2 = "enable_feed_drawer"
            java.lang.String r3 = "0"
            java.lang.String r2 = r15.getString(r2, r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r1 = 0
            goto L_0x01d6
        L_0x01d5:
            r1 = 1
        L_0x01d6:
            if (r1 == 0) goto L_0x0227
            java.lang.String r1 = "live.intent.extra.FROM_NEW_STYLE"
            r2 = 1
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "live.intent.extra.WINDOW_MODE"
            java.lang.String r2 = "full_screen"
            r0.putString(r1, r2)
            java.lang.String r1 = "live.intent.extra.FEED_URL"
            com.bytedance.android.livesdkapi.service.d r2 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            if (r2 == 0) goto L_0x021c
            com.bytedance.android.livesdkapi.service.d r2 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            com.bytedance.android.livesdkapi.host.b r2 = r2.mo13055q()
            if (r2 == 0) goto L_0x021c
            com.bytedance.android.livesdkapi.service.d r2 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            com.bytedance.android.livesdkapi.host.b r2 = r2.mo13055q()
            r17 = r7
            r7 = -1
            java.util.Map r2 = r2.mo13238a(r7)
            if (r2 == 0) goto L_0x021e
            java.lang.String r3 = "feed_url"
            java.lang.Object r3 = r2.get(r3)
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x021e
            java.lang.String r3 = "feed_url"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0220
        L_0x021c:
            r17 = r7
        L_0x021e:
            java.lang.String r2 = ""
        L_0x0220:
            r0.putString(r1, r2)
            r1 = 1
            goto L_0x022a
        L_0x0225:
            r16 = r3
        L_0x0227:
            r17 = r7
            r1 = 0
        L_0x022a:
            r2 = -1
            if (r1 == 0) goto L_0x0239
            java.lang.String r1 = "live.intent.extra.IS_MULTI"
            r3 = 0
            r0.putBoolean(r1, r3)
            r7 = r16
            r1 = 0
            r3 = -1
            goto L_0x02eb
        L_0x0239:
            r3 = 0
            if (r0 == 0) goto L_0x027e
            java.lang.String r1 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r1 = r0.getBundle(r1)
            java.lang.String r7 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r7 = r0.getBoolean(r7, r3)
            if (r7 != 0) goto L_0x0257
            if (r1 == 0) goto L_0x0255
            java.lang.String r7 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r7 = r1.getBoolean(r7, r3)
            if (r7 == 0) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r3 = 0
            goto L_0x0258
        L_0x0257:
            r3 = 1
        L_0x0258:
            if (r3 == 0) goto L_0x027e
            java.lang.String r3 = "live.intent.extra.FEED_URL"
            java.lang.String r7 = ""
            java.lang.String r3 = r0.getString(r3, r7)
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r7 == 0) goto L_0x0281
            if (r1 == 0) goto L_0x0274
            java.lang.String r3 = "live.intent.extra.FEED_URL"
            java.lang.String r7 = ""
            java.lang.String r1 = r1.getString(r3, r7)
        L_0x0272:
            r3 = r1
            goto L_0x0277
        L_0x0274:
            java.lang.String r1 = ""
            goto L_0x0272
        L_0x0277:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r1 != 0) goto L_0x027e
            goto L_0x0281
        L_0x027e:
            java.lang.String r1 = ""
            r3 = r1
        L_0x0281:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r1 != 0) goto L_0x028b
            r7 = r3
            r1 = 1
        L_0x0289:
            r3 = 0
            goto L_0x02eb
        L_0x028b:
            if (r4 == 0) goto L_0x02a1
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x029d
            r1 = 1
            goto L_0x029e
        L_0x029d:
            r1 = 0
        L_0x029e:
            r7 = r16
            goto L_0x0289
        L_0x02a1:
            if (r14 == 0) goto L_0x02b8
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.live.model.FeedDraw> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FOLLOW_DRAW_URL
            java.lang.Object r1 = r1.mo9431a()
            com.bytedance.android.livesdk.live.model.FeedDraw r1 = (com.bytedance.android.livesdk.live.model.FeedDraw) r1
            java.lang.String r3 = r1.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r7 = 1
            r1 = r1 ^ r7
            r7 = r3
            r3 = 1
            goto L_0x02eb
        L_0x02b8:
            r1 = 2
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.live.model.FeedDraw> r3 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW
            java.lang.Object r3 = r3.mo9431a()
            com.bytedance.android.livesdk.live.model.FeedDraw r3 = (com.bytedance.android.livesdk.live.model.FeedDraw) r3
            java.lang.String r3 = r3.getUrl()
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r7 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW_ENABLE
            java.lang.Object r7 = r7.mo9431a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x02e7
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.live.model.FeedDraw> r7 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW
            java.lang.Object r7 = r7.mo9431a()
            com.bytedance.android.livesdk.live.model.FeedDraw r7 = (com.bytedance.android.livesdk.live.model.FeedDraw) r7
            java.lang.String r8 = com.bytedance.android.livesdk.live.model.FeedDraw.conventRequestFrom(r9, r13)
            boolean r7 = r7.isSupportedRequestFrom(r8)
            if (r7 == 0) goto L_0x02e7
            r7 = 1
            goto L_0x02e8
        L_0x02e7:
            r7 = 0
        L_0x02e8:
            r1 = r7
            r7 = r3
            r3 = 2
        L_0x02eb:
            if (r1 == 0) goto L_0x02ee
            r2 = r3
        L_0x02ee:
            r11.f18455N = r2
            r2 = 0
            r11.f18468h = r2
            java.lang.String r3 = "live.intent.extra.IS_MULTI"
            boolean r3 = r0.getBoolean(r3, r2)
            java.lang.String r8 = "live.intent.extra.POSITION"
            int r8 = r0.getInt(r8, r2)
            if (r8 >= 0) goto L_0x0302
            r8 = 0
        L_0x0302:
            java.lang.String r2 = "live.intent.extra.ENTER_ROOM_IDS"
            long[] r2 = r0.getLongArray(r2)
            if (r1 == 0) goto L_0x0355
            boolean r1 = com.bytedance.android.livesdk.chatroom.p310f.C5239u.m11855a(r13)
            if (r1 == 0) goto L_0x0313
            r20.getArguments()
        L_0x0313:
            if (r4 == 0) goto L_0x0318
            java.lang.String r1 = "draw"
            goto L_0x031a
        L_0x0318:
            java.lang.String r1 = ""
        L_0x031a:
            java.lang.String r2 = "drawer_cover"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x034a
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x034a
            com.bytedance.android.livesdk.chatroom.b r1 = com.bytedance.android.livesdk.chatroom.C4995b.m11478a()
            java.lang.String r1 = r1.mo10871c()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0339
            java.lang.String r1 = ""
            goto L_0x034a
        L_0x0339:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_drawer"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x034a:
            com.bytedance.android.livesdk.live.b.a r2 = new com.bytedance.android.livesdk.live.b.a
            r2.<init>(r0, r7, r1)
            r11.f18466f = r2
            r1 = r8
        L_0x0352:
            r2 = 1
            goto L_0x03c5
        L_0x0355:
            if (r3 == 0) goto L_0x0360
            com.bytedance.android.livesdkapi.h.g r1 = r11.f18475o
            com.bytedance.android.livesdkapi.h.h r1 = r1.mo15417a()
            r11.f18466f = r1
            goto L_0x03c3
        L_0x0360:
            if (r2 == 0) goto L_0x03ab
            int r1 = r2.length
            if (r1 <= 0) goto L_0x03ab
            boolean r1 = com.bytedance.android.livesdk.chatroom.p310f.C5239u.m11855a(r13)
            if (r1 == 0) goto L_0x0387
            r20.getArguments()
            com.bytedance.android.livesdk.list.c r1 = new com.bytedance.android.livesdk.list.c
            r1.<init>(r0)
            r11.f18466f = r1
            r1 = 1
            long[] r1 = new long[r1]
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            r14 = 0
            long r14 = r0.getLong(r2, r14)
            r2 = 0
            r1[r2] = r14
            r11.m14151a(r1)
            goto L_0x03c3
        L_0x0387:
            java.lang.String r1 = "live.intent.extra.ROOM_ID"
            long r3 = r0.getLong(r1)
            r1 = 0
        L_0x038e:
            int r7 = r2.length
            if (r1 >= r7) goto L_0x039b
            r14 = r2[r1]
            int r7 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0398
            goto L_0x039c
        L_0x0398:
            int r1 = r1 + 1
            goto L_0x038e
        L_0x039b:
            r1 = r8
        L_0x039c:
            com.bytedance.android.livesdk.list.MultiRoomIdListProvider r3 = new com.bytedance.android.livesdk.list.MultiRoomIdListProvider
            android.arch.lifecycle.h r4 = r20.getLifecycle()
            r3.<init>(r4, r2, r0)
            r11.f18466f = r3
            r11.m14151a(r2)
            goto L_0x0352
        L_0x03ab:
            com.bytedance.android.livesdk.list.c r1 = new com.bytedance.android.livesdk.list.c
            r1.<init>(r0)
            r11.f18466f = r1
            r1 = 1
            long[] r1 = new long[r1]
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            r14 = 0
            long r14 = r0.getLong(r2, r14)
            r2 = 0
            r1[r2] = r14
            r11.m14151a(r1)
        L_0x03c3:
            r2 = r3
            r1 = r8
        L_0x03c5:
            com.bytedance.android.livesdkapi.h.k r3 = com.bytedance.android.livesdkapi.p450h.C8761k.m17247a()
            android.util.LongSparseArray<com.bytedance.android.livesdkapi.depend.model.live.Room> r3 = r3.f24030a
            r3.clear()
            com.bytedance.android.livesdk.chatroom.c.f r3 = com.bytedance.android.livesdk.chatroom.p307c.C5045f.m11544a()
            com.bytedance.android.livesdkapi.h.h r4 = r11.f18466f
            boolean r7 = r3.f13507a
            if (r7 == 0) goto L_0x03df
            r3.f13508b = r4
            if (r4 == 0) goto L_0x03df
            r4.mo15415a(r3)
        L_0x03df:
            java.lang.String r3 = "live.intent.extra.EXTRA_ROOM_MANUAL_START"
            r4 = 0
            boolean r3 = r0.getBoolean(r3, r4)
            r11.f18448F = r3
            java.lang.String r3 = "live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM"
            boolean r0 = r0.getBoolean(r3, r4)
            r11.f18449G = r0
            r11.m14150a(r5, r12)
            r0 = r20
            r3 = r5
            r4 = r6
            r5 = r17
            r7 = r10
            r8 = r9
            r9 = r13
            r10 = r12
            r0.m14149a(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.C6752f.onActivityCreated(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m14148a(int i, String str) {
        if (this.f18456O != null) {
            this.f18456O.mo14295a(i, str);
        }
    }

    /* renamed from: a */
    private void m14150a(String str, Bundle bundle) {
        if (bundle != null) {
            C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
            if (a != null) {
                a.mo14193a("source");
                a.mo14193a("enter_from");
                a.mo14193a("enter_from_merge");
                a.mo14193a("video_id");
                a.mo14193a("superior_page_from");
                a.mo14193a("push_type");
                a.mo14193a("instation_push_type");
                a.mo14193a("from_room_id");
                a.mo14193a("enter_method");
                a.mo14193a("top_message_type");
                a.mo14193a("card_id");
                a.mo14193a("card_position");
                a.mo14193a("inner_push_type");
                if (bundle.containsKey("enter_method")) {
                    a.mo14194a("enter_method", bundle.getString("enter_method", ""));
                }
                if (bundle.containsKey("enter_from_merge")) {
                    a.mo14194a("enter_from_merge", bundle.getString("enter_from_merge", ""));
                }
                if (bundle.containsKey("source")) {
                    String string = bundle.getString("source", "");
                    bundle.remove("source");
                    a.mo14194a("source", String.valueOf(string));
                }
                a.mo14194a("enter_from", str);
                if (bundle.containsKey("enter_from")) {
                    a.mo14194a("enter_from", bundle.getString("enter_from", ""));
                }
                if (bundle.containsKey("from_room_id")) {
                    long j = bundle.getLong("from_room_id", 0);
                    bundle.remove("from_room_id");
                    a.mo14194a("from_room_id", String.valueOf(j));
                }
                if (bundle.containsKey("video_id")) {
                    long j2 = bundle.getLong("video_id", 0);
                    String valueOf = String.valueOf(j2);
                    if (j2 == 0) {
                        valueOf = bundle.getString("video_id");
                    }
                    bundle.remove("video_id");
                    a.mo14194a("video_id", valueOf);
                }
                if (bundle.containsKey("superior_page_from")) {
                    String string2 = bundle.getString("superior_page_from", "");
                    bundle.remove("superior_page_from");
                    a.mo14194a("superior_page_from", string2);
                }
                if (bundle.containsKey("push_type")) {
                    String string3 = bundle.getString("push_type", "");
                    bundle.remove("push_type");
                    a.mo14194a("push_type", string3);
                }
                if (bundle.containsKey("instation_push_type")) {
                    int i = bundle.getInt("instation_push_type", 0);
                    bundle.remove("instation_push_type");
                    a.mo14194a("instation_push_type", String.valueOf(i));
                }
                if (bundle.containsKey("top_message_type")) {
                    String string4 = bundle.getString("top_message_type", "");
                    bundle.remove("top_message_type");
                    a.mo14194a("top_message_type", string4);
                }
                if (bundle.containsKey("gd_label")) {
                    a.mo14194a("gd_label", bundle.getString("gd_label", ""));
                }
                if (bundle.containsKey("card_id")) {
                    a.mo14194a("card_id", bundle.getString("card_id"));
                }
                if (bundle.containsKey("card_position")) {
                    a.mo14194a("card_position", bundle.getString("card_position"));
                }
                if (bundle.containsKey("inner_push_type")) {
                    a.mo14194a("inner_push_type", bundle.getString("inner_push_type"));
                }
            }
        }
        if (getArguments() != null && getArguments().containsKey("sort_type")) {
            C8031b.m15946a().mo14191a(getArguments().getLong("live.intent.extra.ROOM_ID"), "sort_type", getArguments().getString("sort_type"));
            getArguments().remove("sort_type");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.akq, viewGroup, false);
        this.f18462b = (LiveVerticalViewPager) inflate.findViewById(R.id.ds2);
        this.f18463c = (FrameLayout) inflate.findViewById(R.id.yw);
        this.f18463c.setBackgroundColor(getResources().getColor(R.color.t1));
        C5045f a = C5045f.m11544a();
        FrameLayout frameLayout = this.f18463c;
        if (a.f13507a) {
            a.f13511e = frameLayout;
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo12861a(long j, String str, Bundle bundle, boolean z) {
        long j2;
        long j3 = j;
        Bundle bundle2 = bundle;
        bundle2.putLong("live.intent.extra.ENTER_LIVE_TIME", this.f18457P);
        bundle2.putString("live.intent.extra.WINDOW_MODE", "full_screen");
        bundle2.putBoolean("live.intent.extra.IS_BACK_PRE_ROOM_NOW", z);
        getContext();
        Bundle bundle3 = new Bundle();
        bundle3.putLong("live.intent.extra.ROOM_ID", j3);
        bundle3.putString("live.intent.extra.ENTER_LIVE_SOURCE", str);
        bundle3.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
        if (bundle2 != null) {
            bundle3.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", bundle2.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA"));
        }
        Bundle bundle4 = bundle3.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA");
        if (!(bundle4 == null || getArguments() == null)) {
            bundle4.putBoolean("live.intent.extra.IS_MULTI", getArguments().getBoolean("live.intent.extra.IS_MULTI", false));
            bundle4.putInt("live.intent.extra.POSITION", this.f18462b.getCurrentItem());
        }
        if (bundle2 != null) {
            bundle2.getBoolean("live.intent.extra.EXTRA_FLAG_FROM_NEW_AB_OF_BACK_PRE_ROOM");
        }
        bundle3.putLongArray("live.intent.extra.ENTER_ROOM_IDS", bundle2.getLongArray("live.intent.extra.ENTER_ROOM_IDS"));
        bundle3.putString("back_live_source", bundle2.getString("back_live_source", ""));
        bundle3.putInt("orientation", bundle2.getInt("orientation", 0));
        C8659j c = mo12871c();
        if (c != null) {
            long j4 = c.mo12049i().getArguments().getLong("live.intent.extra.ROOM_ID", 0);
            if (j4 != 0) {
                bundle3.putLong("live.intent.extra.FROM_ROOM_ID", j4);
            }
            Object obj = c.mo12049i().getArguments().get("live.intent.extra.USER_ID");
            if (obj != null && bundle3.get("live.intent.extra.USER_ID") == null) {
                bundle3.putString("live.intent.extra.USER_ID", String.valueOf(obj));
            }
            bundle3.putString("enter_live_from_page", c.mo12049i().getArguments().getString("enter_live_from_page"));
            j2 = j4;
        } else {
            j2 = 0;
        }
        this.f18450I = true;
        bundle3.putInt("live.intent.extra.SCREEN_ORIENTATION", 1);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            bundle3.putBoolean("live.intent.extra.FROM_NEW_STYLE", arguments.getBoolean("live.intent.extra.FROM_NEW_STYLE", false));
            bundle3.putString("enter_from_live_source", arguments.getString("enter_from_live_source"));
            bundle3.putString("live.intent.extra.WINDOW_MODE", "full_screen");
            bundle3.putString("live.intent.extra.FEED_URL", arguments.getString("live.intent.extra.FEED_URL", ""));
        }
        long j5 = bundle2.getLong("live.intent.extra.FROM_PORTAL_ID");
        if (j5 > 0) {
            bundle3.putLong("live.intent.extra.FROM_PORTAL_ID", j5);
            ((C4002ac) ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).ping(j2, j5, C4986a.JUMP_TO_ROOM).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9406a(C7707k.f21208a, C7733l.f21265a);
        }
        TTLiveSDKContext.getHostService().mo10314g().mo15568a(getContext(), j3, bundle3);
        if (this.f18449G && getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: a */
    private void m14149a(int i, boolean z, String str, String str2, long j, boolean z2, String str3, String str4, Bundle bundle) {
        String str5 = str;
        if (this.f18466f == null) {
            m14148a(124, "list provider is null");
            mo12863a("", 0, "room_list_provider_error");
            this.f18476p.mo12891a();
            return;
        }
        final String str6 = str;
        final String str7 = str3;
        final String str8 = str4;
        final Bundle bundle2 = bundle;
        C67585 r0 = new C7742a(getChildFragmentManager(), this.f18466f) {
            public final void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                C6752f.this.f18462b.post(new Runnable() {
                    public final void run() {
                        if (C6752f.this.getActivity() != null && !C6752f.this.getActivity().isFinishing()) {
                            if (!(C6752f.this.mo12871c() == null || C6752f.this.f18471k == null)) {
                                C6752f.this.f18471k.onPageSelected(C6752f.this.f18462b.getCurrentItem());
                            }
                            C6752f.this.mo12876g();
                        }
                    }
                });
                C6752f.this.mo12887s();
            }

            public final Object instantiateItem(ViewGroup viewGroup, int i) {
                C8659j jVar = (C8659j) super.instantiateItem(viewGroup, i);
                jVar.mo12035a((C8660a) C6752f.this);
                jVar.mo12049i().getArguments().putString("live.intent.extra.ENTER_LIVE_SOURCE", str6);
                jVar.mo12049i().getArguments().putString("enter_from_merge", str7);
                jVar.mo12049i().getArguments().putString("enter_method", str8);
                if (C6752f.this.mo12886r()) {
                    jVar.mo12049i().getArguments().putString("scene_id", "1005");
                }
                jVar.mo12049i().getArguments().putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
                return jVar;
            }
        };
        this.f18467g = r0;
        this.f18462b.setOffscreenPageLimit(1);
        try {
            this.f18462b.setAdapter(this.f18467g);
        } catch (Exception unused) {
        }
        int i2 = i;
        this.f18462b.mo14781a(i, false);
        this.f18471k = new C6765b(str);
        this.f18462b.setOnPageChangeListener(this.f18471k);
        C8027o oVar = new C8027o(this, str2, bundle, str, j);
        this.f18469i = oVar;
        m14153w();
        mo12884p();
        this.f18462b.setOverScrollListener(new C8477e() {

            /* renamed from: b */
            private long f18517b;

            /* renamed from: b */
            public final void mo12896b() {
                if (System.currentTimeMillis() - this.f18517b > 2500) {
                    this.f18517b = System.currentTimeMillis();
                    if (C6752f.this.getContext() != null && !C6752f.this.mo12879j() && !C6752f.this.mo12880k()) {
                        C4575an.m10985a(C6752f.this.getContext(), C6752f.this.getString(R.string.h0t));
                    }
                }
            }

            /* renamed from: a */
            public final void mo12895a() {
                boolean z;
                if (System.currentTimeMillis() - this.f18517b > 2500) {
                    this.f18517b = System.currentTimeMillis();
                    if (C6752f.this.getContext() != null && !C6752f.this.mo12879j() && !C6752f.this.mo12880k()) {
                        C6752f fVar = C6752f.this;
                        if (!"following_window".equals(fVar.mo12888t()) || !"live_cover".equals(fVar.mo12889u())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            C4575an.m10985a(C6752f.this.getContext(), C6752f.this.getString(R.string.f23));
                        }
                    }
                }
            }
        });
        if (this.f18472l != null) {
            this.f18472l.mo12899a();
        }
        if (z2) {
            this.f18472l = new C6764a(str);
        } else {
            this.f18472l = null;
        }
    }
}
