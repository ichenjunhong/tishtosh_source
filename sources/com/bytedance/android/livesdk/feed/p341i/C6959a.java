package com.bytedance.android.livesdk.feed.p341i;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.live.C2981a;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.dislike.C6862b;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p340h.C6953a;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8638a;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.live.C8670t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.i.a */
public abstract class C6959a extends C3923a<FeedItem> {

    /* renamed from: b */
    private final C2180b<FeedItem> f19037b;

    /* renamed from: c */
    protected final C6861a f19038c;

    /* renamed from: d */
    protected final C6957i f19039d;

    /* renamed from: e */
    protected final FeedDataKey f19040e;

    /* renamed from: f */
    protected final boolean f19041f;

    /* renamed from: g */
    protected final C8757g f19042g;

    /* renamed from: h */
    protected C6945f f19043h;

    /* renamed from: i */
    protected boolean f19044i;

    /* renamed from: j */
    public Room f19045j;

    /* renamed from: k */
    private final C2180b<Boolean> f19046k;

    /* renamed from: l */
    private final C2180b<Object> f19047l;

    /* renamed from: m */
    private final C2180b<Object> f19048m;

    /* renamed from: n */
    private C7023m f19049n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13074a(FeedItem feedItem, Room room, int i);

    /* renamed from: c */
    public final void mo9282c() {
        super.mo9282c();
        m14580a(this.f19045j);
    }

    /* renamed from: f */
    public final void mo13152f() {
        if (this.f19041f) {
            C10753b a = C10753b.m21793a(this.itemView.getContext());
            long a2 = a.mo19440a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0);
            if (a2 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > a2 && currentTimeMillis - a2 <= 5500) {
                    a.mo19441a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) Long.valueOf(-1)).mo19443a();
                    int[] iArr = new int[2];
                    this.itemView.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    View view = (View) this.itemView.getParent();
                    if (view != null) {
                        view.getLocationInWindow(iArr2);
                        int max = Math.max(0, iArr2[1] - iArr[1]);
                        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
                        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.od);
                        View inflate = View.inflate(this.itemView.getContext(), R.layout.aoc, null);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.fj);
                        ((LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - (((float) dimensionPixelSize) / 2.0f)) - ((float) max));
                        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
                        inflate.setOnClickListener(new C6976e(popupWindow));
                        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
                        lottieAnimationView.getClass();
                        popupWindow.setOnDismissListener(new C6977f(lottieAnimationView));
                        lottieAnimationView.setAnimation("dislike_live_tips.json");
                        lottieAnimationView.mo6658c(true);
                        lottieAnimationView.mo6654b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13151a(Boolean bool) throws Exception {
        if (bool.booleanValue() && this.f10935a) {
            m14580a(this.f19045j);
        }
    }

    /* renamed from: a */
    private void m14580a(Room room) {
        long j;
        String str;
        String str2;
        if (room != null) {
            if (room.getOwner() == null) {
                j = 0;
            } else {
                j = room.getOwner().getId();
            }
            HashMap hashMap = new HashMap();
            if (C6926k.f18950l != null) {
                TextUtils.isEmpty(C6926k.f18950l.f19016h);
            }
            hashMap.put("enter_from_merge", "live_merge");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(j));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("show_type", "stay");
            String str3 = "live_type";
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put(str3, str);
            String str4 = "streaming_type";
            if (room.isThirdParty) {
                str2 = "thirdparty";
            } else {
                str2 = "general";
            }
            hashMap.put(str4, str2);
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", CustomActionPushReceiver.f104061f);
            hashMap.put("event_type", "core");
            hashMap.put("event_module", CustomActionPushReceiver.f104061f);
            hashMap.put("action_type", "click");
            hashMap.put("request_page", C8830k.m17330d().mo15060m().mo10874f());
            if (this.f19044i) {
                hashMap.put("live_window_mode", "small_picture");
            }
            C7007b.m14649a((Map<String, String>) hashMap, this.itemView.getContext());
            C7007b.m14648a("live_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    private static void m14579a(Bundle bundle, Room room) {
        Boolean bool = (Boolean) LiveSettingKeys.ENABLE_ENTER_ROOM_OPT_REUSE_ROOM_PLAYER.mo9431a();
        if (bool == null || bool.booleanValue()) {
            bundle.putBundle("live.intent.extra.WARM_UP_ROOM_ARGS", C8750a.m17219b(room));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13150a(Room room, C2981a aVar) throws Exception {
        this.f19039d.mo13099a(this.f19040e, String.valueOf(room.getId()));
        C4204a.m10421a(this.itemView.getContext(), (int) R.string.eag);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            this.itemView.setOnLongClickListener(null);
            this.f19045j = null;
            return;
        }
        this.f19045j = (Room) feedItem.item;
        if (this.f19041f) {
            this.itemView.setOnLongClickListener(new C6973b(this));
        } else {
            this.itemView.setOnLongClickListener(null);
        }
        mo13074a(feedItem, this.f19045j, i);
        if (this.f19046k != null) {
            mo9279a(this.f19046k.mo6505a((C1710e<? super T>) new C6974c<Object>(this), C6975d.f19064a));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13149a(Room room, PopupWindow popupWindow, View view) {
        String str = this.f19040e.f18991b;
        C6861a aVar = this.f19038c;
        mo9279a(aVar.f18800a.dislikeRoom(room.getId(), room.getOwnerUserId(), room.getRequestId(), str, str, room.getLog_pb()).mo6541d(C6862b.f18801a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6980i<Object>(this, room), (C1710e<? super Throwable>) new C6981j<Object>(this)));
        String str2 = this.f19040e.f18991b;
        if (str2.contains(CustomActionPushReceiver.f104061f) && C6926k.f18950l != null) {
            this.f19043h = C6926k.f18950l;
            str2 = C6926k.f18950l.f19016h;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_merge");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("log_pb", room.getLog_pb());
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "core");
        hashMap.put("event_module", str2);
        C7007b.m14648a("live_dislike", (Map<String, String>) hashMap);
        C6982k.m14605a(popupWindow);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo13069a(FeedItem feedItem, boolean z, String str, Bundle bundle) {
        String str2;
        FeedItem feedItem2 = feedItem;
        Bundle bundle2 = bundle;
        boolean z2 = false;
        if (feedItem2 == null || !(feedItem2.item instanceof Room)) {
            return false;
        }
        Room room = (Room) feedItem2.item;
        if (!room.isPullUrlValid()) {
            return false;
        }
        room.setLog_pb(feedItem2.logPb);
        room.setRequestId(feedItem2.resId);
        Context context = this.itemView.getContext();
        if (!C6982k.m14606a(context)) {
            C4204a.m10421a(context, (int) R.string.eas);
            return false;
        }
        if (C8830k.m17330d() == null || C8830k.m17330d().mo15051d() == null) {
            C7007b.m14648a("livesdk_rd_plugin_init_failed", (Map<String, String>) new HashMap<String,String>());
            C4204a.m10421a(context, (int) R.string.eai);
        } else {
            C8661k kVar = (C8661k) C4116c.m10249a(C8661k.class);
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (kVar != null) {
                if (!C8830k.m17330d().mo15051d().mo14281i() || !TextUtils.equals(C8830k.m17330d().mo15051d().mo14283k(), this.f19045j.buildPullUrl())) {
                    kVar.recordEnterStart(C8638a.FEED);
                } else {
                    kVar.recordEnterStart(C8638a.FEED_WITH_PREVIEW);
                }
            }
            if (z) {
                C6953a aVar = new C6953a(this.f19040e, this.f19039d);
                int b = aVar.mo13142b(this.f19045j.getId());
                this.f19042g.mo15418a(aVar);
                Bundle a = C8670t.m17142a(context, b, "live_cover", str, 1, this.f19041f, bundle);
                hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                hashMap.put("location", "before start activity");
                if (a.get("live.intent.extra.USER_ID") == null) {
                    a.putString("live.intent.extra.USER_ID", String.valueOf(this.f19045j.getOwnerUserId()));
                }
                if (this.f19043h != null) {
                    if (this.f19043h.f19019k == 1) {
                        z2 = true;
                    }
                    if (z2) {
                        a.putString("double_stream_feed_url", this.f19040e.f18990a);
                    }
                }
                C7007b.m14648a("feed_enter_room", (Map<String, String>) hashMap);
                if (!(C8830k.m17331e() == null || C8830k.m17331e().mo13048j() == null)) {
                    m14579a(a, this.f19045j);
                    C7007b.m14647a(context, bundle2);
                    C8830k.m17331e().mo13048j().mo15568a(context, this.f19045j.getId(), a);
                }
                if (this.f19041f) {
                    C10753b a2 = C10753b.m21793a(context);
                    if (a2.mo19440a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0) >= 0) {
                        a2.mo19441a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) Long.valueOf(System.currentTimeMillis())).mo19443a();
                    }
                }
                hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                hashMap.put("location", "after sp");
                C7007b.m14648a("feed_enter_room", (Map<String, String>) hashMap);
            } else {
                Room room2 = this.f19045j;
                String str3 = this.f19040e.f18991b;
                Bundle bundle3 = new Bundle();
                bundle3.putString("live.intent.extra.ENTER_LIVE_SOURCE", str3);
                bundle3.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle2);
                bundle3.putBundle("live.intent.extra.EXTRA_ROOM_ARGS", C8750a.m17218a(room2));
                if (!(C8830k.m17331e() == null || C8830k.m17331e().mo13048j() == null)) {
                    bundle3.putAll(C8750a.m17218a(this.f19045j));
                    if (bundle3.get("live.intent.extra.USER_ID") == null) {
                        bundle3.putString("live.intent.extra.USER_ID", String.valueOf(this.f19045j.getOwnerUserId()));
                    }
                    if (this.f19044i) {
                        bundle3.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
                        bundle3.putString("live.intent.extra.FROM_NEW_STYLE_SOURCE", C8830k.m17330d().mo15060m().mo10874f());
                        bundle3.putString("enter_from_live_source", "live_square");
                        bundle3.putString("live.intent.extra.WINDOW_MODE", "small_picture");
                        if (C8830k.m17330d() != null) {
                            str2 = C8830k.m17330d().mo15060m().mo10872d();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            List c = C7128p.m14812d().mo13185c();
                            if (!C9414h.m18630a(c) && c.get(0) != null) {
                                bundle3.putString("live.intent.extra.FEED_URL", ((C6945f) c.get(0)).f19012d);
                            }
                        } else {
                            bundle3.putString("live.intent.extra.FEED_URL", str2);
                        }
                    }
                    m14579a(bundle3, this.f19045j);
                    C7007b.m14647a(context, bundle2);
                    C8830k.m17331e().mo13048j().mo15568a(context, this.f19045j.getId(), bundle3);
                }
            }
            this.f19037b.onNext(feedItem2);
        }
        return true;
    }

    public C6959a(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        boolean z;
        super(view);
        this.f19038c = aVar;
        this.f19039d = iVar;
        this.f19040e = feedDataKey;
        if (feedDataKey == null || mVar == null || !mVar.mo13184b(feedDataKey.f18992c)) {
            z = false;
        } else {
            z = true;
        }
        this.f19041f = z;
        this.f19042g = gVar;
        this.f19037b = bVar;
        this.f19046k = bVar2;
        this.f19047l = bVar4;
        this.f19048m = bVar3;
        if (feedDataKey.f18991b.equals(CustomActionPushReceiver.f104061f)) {
            this.f19043h = C6926k.f18950l;
        } else {
            this.f19043h = mVar.mo13182a(feedDataKey.f18992c);
        }
        this.f19049n = mVar;
    }
}
