package com.bytedance.android.livesdk.feed.p341i;

import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3899m.C3902a;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p231a.C3858h;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.livesdk.feed.C6828b;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7106t;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p342j.C7006a;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdk.feed.p347o.C7034a;
import com.bytedance.android.livesdk.feed.p347o.C7035b.C7044c;
import com.bytedance.android.livesdk.feed.p347o.C7035b.C7047d;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p094l.C2180b;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.feed.i.l */
public abstract class C6983l extends C6959a {

    /* renamed from: k */
    TextView f19074k;

    /* renamed from: l */
    protected HSImageView f19075l;

    /* renamed from: m */
    HSImageView f19076m;

    /* renamed from: n */
    View f19077n;

    /* renamed from: o */
    TextView f19078o;

    /* renamed from: p */
    protected View f19079p;

    /* renamed from: q */
    protected TextView f19080q;

    /* renamed from: r */
    ImageView f19081r;

    /* renamed from: s */
    View f19082s;

    /* renamed from: t */
    TextView f19083t;

    /* renamed from: u */
    View f19084u;

    /* renamed from: v */
    String f19085v = C3922z.m9903a((int) R.string.eau);

    /* renamed from: w */
    C7106t f19086w;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13071a(ImageModel imageModel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13073a(FeedItem feedItem);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo13075e();

    /* renamed from: g */
    public final void mo13161g() {
        String str;
        Room room = this.f19045j;
        if (room != null) {
            TextView textView = this.f19083t;
            if (room.getStatus() == 4) {
                str = C3922z.m9903a((int) R.string.eaj);
            } else {
                str = C3922z.m9903a((int) R.string.eay);
            }
            textView.setText(str);
            if (room.getStatus() == 4) {
                this.f19078o.setVisibility(4);
            } else {
                this.f19078o.setVisibility(0);
                this.f19078o.setText(C7034a.m14680a((long) room.getUserCount()));
            }
            this.f19084u.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C52860x mo13160b(FeedItem feedItem) {
        C7044c a = ((C7044c) ((C7044c) ((C7044c) ((C7044c) ((C7044c) ((C7044c) new C7044c(this.itemView.getContext()).mo13194a("Room ID", feedItem, "item/id", null)).mo13194a("User ID", feedItem, "item/owner/id", null)).mo13194a("Nickname", feedItem, "item/owner/nickname", null)).mo13194a("Stream URL", feedItem, "item/stream_url/rtmp_pull_url", null)).mo13193a((Object) feedItem)).mo13196b()).mo13202b(feedItem).mo13201a(new C6988o(feedItem));
        View view = this.itemView;
        C52711k.m112240b(view, "anchor");
        ScrollView scrollView = new ScrollView(a.f19186c);
        scrollView.addView(a.f19185b);
        a.f19184a.setContentView(scrollView);
        a.f19184a.setFocusable(true);
        if (VERSION.SDK_INT >= 21) {
            a.f19184a.setElevation((float) a.mo13190a(5.0f));
        }
        a.f19184a.setBackgroundDrawable(a.f19186c.getResources().getDrawable(a.mo13191a(16842836)));
        a.f19184a.showAsDropDown(view);
        return C52860x.f131107a;
    }

    /* renamed from: a */
    protected static void m14607a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13072a(ImageModel imageModel, Room room) {
        final String str;
        final long[] jArr = new long[1];
        if (C6926k.f18950l != null) {
            str = C6926k.f18950l.f19016h;
        } else {
            str = "live_live";
        }
        this.f19086w = new C7106t();
        C3902a aVar = new C3902a(imageModel);
        aVar.f10916i = true;
        aVar.f10915h = false;
        aVar.f10910c = 300;
        final Room room2 = room;
        aVar.f10914g = new C3910a() {
            /* renamed from: a */
            public final void mo9270a(ImageModel imageModel) {
                jArr[0] = SystemClock.currentThreadTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C7007b.m14648a("live_cover_show_start", (Map<String, String>) hashMap);
                C6983l.this.f19086w.f19317a = SystemClock.uptimeMillis();
            }

            /* renamed from: a */
            public final void mo9272a(ImageModel imageModel, Exception exc) {
                String str;
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("is_success", "0");
                int i = 0;
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C7007b.m14648a("live_cover_show_finish", (Map<String, String>) hashMap);
                C7106t tVar = C6983l.this.f19086w;
                String uri = imageModel.getUri();
                tVar.mo13236b();
                JSONObject jSONObject = new JSONObject();
                if (exc instanceof C2944a) {
                    i = ((C2944a) exc).getErrorCode();
                }
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = "";
                }
                C7106t.m9730a(jSONObject, "error_code", (long) i);
                C7106t.m9731a(jSONObject, "error_msg", str);
                C7106t.m9731a(jSONObject, "url", uri);
                C3837e.m9749b("ttlive_feed_image_load_all", 1, jSONObject);
                C3837e.m9744a("ttlive_feed_image_load_error", 1, jSONObject);
            }

            /* renamed from: a */
            public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                String str;
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", room2.getRequestId());
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("is_success", "1");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                C7007b.m14648a("live_cover_show_finish", (Map<String, String>) hashMap);
                C7106t tVar = C6983l.this.f19086w;
                if (imageModel == null) {
                    str = "";
                } else {
                    str = imageModel.getUri();
                }
                long b = tVar.mo13236b();
                JSONObject jSONObject = new JSONObject();
                C7106t.m9731a(jSONObject, "url", str);
                C3837e.m9742a("ttlive_feed_image_load_all", 0, b, jSONObject);
            }
        };
        C3899m.m9862a(this.f19075l, aVar.f10908a, aVar.f10909b, 300, aVar.f10911d, aVar.f10912e, aVar.f10913f, aVar.f10914g, aVar.f10915h, aVar.f10916i);
        if (C6828b.f18712a) {
            C3858h a = C3858h.m9785a();
            List<String> urls = imageModel.getUrls();
            int e = mo13075e();
            if (urls != null) {
                for (String put : urls) {
                    a.f10884a.put(put, Integer.valueOf(e));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13159a(FeedItem feedItem, Room room, View view) {
        mo13073a(feedItem);
        C7006a b = C7006a.m14645b();
        if (room != null && view != null) {
            JSONObject jSONObject = new JSONObject();
            User owner = room.getOwner();
            if (owner != null) {
                String title = room.title();
                String nickName = owner.getNickName();
                String city = owner.getCity();
                try {
                    jSONObject.put("title", title);
                    jSONObject.put("nickName", nickName);
                    jSONObject.put("city", city);
                    jSONObject.put("action", "View#onClick()");
                    jSONObject.put("className", view.getClass().getName());
                } catch (JSONException unused) {
                }
                b.mo9198a("ttlive_page", jSONObject);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13074a(FeedItem feedItem, Room room, int i) {
        ImageModel imageModel;
        FeedItem feedItem2 = feedItem;
        Room room2 = room;
        boolean z = false;
        m14607a(this.f19082s, 0);
        m14607a(this.f19079p, 8);
        this.f19081r.setVisibility(8);
        if (room2.redEnvelopeNumber > 0) {
            this.f19077n.setVisibility(0);
        } else {
            this.f19077n.setVisibility(4);
        }
        User owner = room.getOwner();
        String str = null;
        if (!TextUtils.isEmpty(room.getTitle())) {
            this.f19074k.setText(C3897k.m9852a("#%s", room.getTitle()));
        } else if (owner != null) {
            this.f19074k.setText(owner.getNickName());
        } else {
            this.f19074k.setText(null);
        }
        if (!C6828b.f18714c) {
            imageModel = room.getCover();
        } else if (owner == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarMedium();
        }
        if (imageModel == null || C9414h.m18630a(imageModel.getUrls())) {
            this.f19075l.setImageResource(2131955972);
            mo13071a(imageModel);
        } else {
            mo13072a(imageModel, room2);
        }
        ImageModel feedRoomLabel = room.getFeedRoomLabel();
        if (feedRoomLabel == null || C9414h.m18630a(feedRoomLabel.getUrls())) {
            this.f19076m.setVisibility(8);
        } else {
            this.f19076m.setVisibility(0);
            C3899m.m9863a(this.f19076m, feedRoomLabel, null, -1, -1, null, new C3910a() {
                /* renamed from: a */
                public final void mo9270a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo9272a(ImageModel imageModel, Exception exc) {
                }

                /* renamed from: a */
                public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                    LayoutParams layoutParams = C6983l.this.f19076m.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    C6983l.this.f19076m.setLayoutParams(layoutParams);
                }
            }, feedRoomLabel.isAnimated());
        }
        mo13161g();
        if (owner != null) {
            str = owner.getCity();
        }
        if (C9431p.m18664a(str)) {
            this.f19080q.setVisibility(8);
            m14607a(this.f19079p, 8);
        } else {
            this.f19080q.setText(str);
            this.f19080q.setVisibility(0);
        }
        this.itemView.setOnClickListener(new C6986m(this, feedItem2, room2));
        if (C4098q.m10218a()) {
            C4097p<Boolean> pVar = LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU;
            C52711k.m112236a((Object) pVar, "LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU");
            Object a = pVar.mo9431a();
            C52711k.m112236a(a, "LiveFeedSettings.ENABLE_LIVE_FEED_DEBUG_MENU.value");
            if (((Boolean) a).booleanValue()) {
                z = true;
            }
        }
        if (z) {
            View view = this.itemView;
            C6987n nVar = new C6987n(this, feedItem2);
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(nVar, "onTriggered");
            view.setOnTouchListener(new C7047d(nVar));
        }
        room2.setLog_pb(feedItem2.logPb);
        room2.setRequestId(feedItem2.resId);
    }

    public C6983l(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        super(view, aVar, iVar, feedDataKey, mVar, gVar, bVar, bVar2, bVar3, bVar4);
        this.f19074k = (TextView) view.findViewById(R.id.title);
        this.f19075l = (HSImageView) view.findViewById(R.id.bcj);
        this.f19076m = (HSImageView) view.findViewById(R.id.be4);
        this.f19077n = view.findViewById(R.id.can);
        this.f19078o = (TextView) view.findViewById(R.id.gq);
        this.f19079p = view.findViewById(R.id.b26);
        this.f19080q = (TextView) view.findViewById(R.id.bi5);
        this.f19081r = (ImageView) view.findViewById(R.id.bec);
        this.f19082s = view.findViewById(R.id.be7);
        this.f19083t = (TextView) view.findViewById(R.id.be6);
        this.f19084u = view.findViewById(R.id.bd8);
    }
}
