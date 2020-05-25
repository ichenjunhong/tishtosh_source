package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3864ab;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.api.C4987a;
import com.bytedance.android.livesdk.chatroom.end.C5142j.C5144a;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.C5118b;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.live.p393a.C7743a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdk.schema.interfaces.C8261b.C8262a;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.a */
public final class C5125a extends C5145k implements C5144a, C8614a, C9382a {

    /* renamed from: a */
    public View f13695a;

    /* renamed from: b */
    public List<Room> f13696b;

    /* renamed from: c */
    public DataCenter f13697c;

    /* renamed from: d */
    private C8614a f13698d;

    /* renamed from: e */
    private Activity f13699e;

    /* renamed from: f */
    private C9381g f13700f = new C9381g(this);

    /* renamed from: g */
    private VHeadView f13701g;

    /* renamed from: h */
    private TextView f13702h;

    /* renamed from: i */
    private HSImageView f13703i;

    /* renamed from: j */
    private TopFansLayout f13704j;

    /* renamed from: k */
    private View f13705k;

    /* renamed from: l */
    private View f13706l;

    /* renamed from: m */
    private LinearLayout f13707m;

    /* renamed from: n */
    private View f13708n;

    /* renamed from: o */
    private List<LiveRecommendBar> f13709o = new ArrayList();

    /* renamed from: p */
    private boolean f13710p = false;

    /* renamed from: q */
    private C5142j f13711q;

    /* renamed from: r */
    private OnClickListener f13712r = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (view.getTag() != null && (view.getTag() instanceof Room)) {
                Room room = (Room) view.getTag();
                Bundle bundle = new Bundle();
                String str2 = "enter_from";
                if (C5125a.this.f13798y) {
                    str = "anchor_live_ending";
                } else {
                    str = "live_end";
                }
                bundle.putString(str2, str);
                bundle.putString("log_pb", room.getLog_pb());
                bundle.putString("request_id", room.getRequestId());
                bundle.putString("enter_from_merge", "live_end");
                bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
                bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
                bundle.putString("enter_method", "live_cover");
                bundle.putString("is_fans", C5125a.m11772a(room));
                DataCenter dataCenter = C5125a.this.f13697c;
                if (dataCenter != null && ((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue()) {
                    bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", ((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue());
                    bundle.putString("live.intent.extra.FROM_NEW_STYLE_SOURCE", (String) dataCenter.get("data_live_new_feed_style_from", ""));
                    bundle.putString("enter_from_live_source", (String) dataCenter.get("data_live_first_enter_source", ""));
                    bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
                    bundle.putString("live.intent.extra.FEED_URL", (String) dataCenter.get("data_live_new_feed_url", ""));
                }
                C8260a i = C4514j.m10883j().mo10328i();
                Context context = C5125a.this.getContext();
                C8262a j = new C8262a().mo14437a(room.getId()).mo14447h(room.getRequestId()).mo14441b("live_end").mo14450k("live_cover").mo14448i(room.getLog_pb()).mo14440b(room.getUserFrom()).mo14436a(room.getOrientation()).mo14449j("live_end");
                j.f22600q = bundle;
                j.f22582F = room;
                i.openRoom(context, j);
                C4514j.m10883j().mo10324e().f21348a = new C7743a("live_end");
                if (!(C5125a.this.f13697c == null || !((Boolean) C5125a.this.f13697c.get("is_embedded_live_room", Boolean.valueOf(false))).booleanValue() || C5125a.this.getActivity() == null)) {
                    C5125a.this.getActivity().finish();
                }
            }
        }
    };

    /* renamed from: s */
    private OnClickListener f13713s = new OnClickListener() {
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.ai0) {
                C5125a.this.mo11019b();
            } else if (id == R.id.iw || id == R.id.b_v) {
                C5125a.this.mo11034d();
            } else {
                if (id == R.id.d1o) {
                    C5125a.this.mo11033c();
                }
            }
        }
    };

    /* renamed from: t */
    private C5118b f13714t = new C5118b() {
        /* renamed from: a */
        public final void mo11004a() {
            if (C5125a.this.getUserVisibleHint() && C5125a.this.f13696b.size() >= 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C5125a.this.f13696b.get(0));
                arrayList.add(C5125a.this.f13696b.get(1));
                C5125a.this.f13696b.removeAll(arrayList);
                C5125a.this.mo11018a((List<Room>) arrayList);
            }
        }
    };

    /* renamed from: a */
    public final boolean mo8466a() {
        return this.f13698d != null && this.f13698d.mo8466a();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f13700f != null) {
            this.f13700f.removeCallbacks(null);
        }
    }

    public final void onPause() {
        super.onPause();
        if (!C9376b.m18558a((Collection<T>) this.f13709o)) {
            for (LiveRecommendBar liveRecommendBar : this.f13709o) {
                if (liveRecommendBar != null) {
                    liveRecommendBar.mo10997a();
                }
            }
        }
    }

    public final void onResume() {
        C5118b bVar;
        super.onResume();
        if (!C9376b.m18558a((Collection<T>) this.f13709o)) {
            for (LiveRecommendBar liveRecommendBar : this.f13709o) {
                if (liveRecommendBar != null && getUserVisibleHint()) {
                    if (this.f13709o.indexOf(liveRecommendBar) == 0) {
                        bVar = this.f13714t;
                    } else {
                        bVar = null;
                    }
                    liveRecommendBar.mo10998a(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo11019b() {
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", CustomActionPushReceiver.f104061f);
            bundle.putString("v1_source", "follow");
            TTLiveSDKContext.getHostService().mo10315h().mo14516a(getContext(), C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14539a(-1).mo14544d("live_detail").mo14545e("follow").mo14543c(CustomActionPushReceiver.f104061f).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
        } else if (this.f13797x != null) {
            User owner = this.f13797x.getOwner();
            if (owner != null) {
                this.f13711q.mo11031a(owner.getId(), this.f13797x, this.f13796A, this);
            }
            if (C4600j.m11040b(this.f13697c) && this.f13797x.author() != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("anchor_id", String.valueOf(this.f13797x.author().getId()));
                    jSONObject.put("room_id", String.valueOf(this.f13797x.getId()));
                } catch (JSONException unused) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.f13697c));
            }
            if (C4600j.m11043d(this.f13697c) && this.f13797x.author() != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("anchor_id", String.valueOf(this.f13797x.author().getId()));
                    jSONObject2.put("room_id", String.valueOf(this.f13797x.getId()));
                } catch (JSONException unused2) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.f13697c));
            }
        }
    }

    /* renamed from: a */
    public static String m11772a(Room room) {
        if (room == null) {
            return "0";
        }
        User owner = room.getOwner();
        if (owner == null) {
            return "0";
        }
        FollowInfo followInfo = owner.getFollowInfo();
        if (followInfo == null) {
            return "0";
        }
        long followStatus = followInfo.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return "1";
        }
        return "0";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f13797x != null) {
            C5014i.m11508a().mo10889a((Handler) this.f13700f, false, this.f13797x.getId(), 4, 12);
            this.f13711q = new C5142j();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        C5118b bVar;
        super.setUserVisibleHint(z);
        if (!C9376b.m18558a((Collection<T>) this.f13709o)) {
            for (LiveRecommendBar liveRecommendBar : this.f13709o) {
                if (liveRecommendBar != null) {
                    if (z) {
                        if (this.f13709o.indexOf(liveRecommendBar) == 0) {
                            bVar = this.f13714t;
                        } else {
                            bVar = null;
                        }
                        liveRecommendBar.mo10998a(bVar);
                    } else {
                        liveRecommendBar.mo10997a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m11773a(RoomStats roomStats) {
        View a = mo11032a(R.id.aub);
        if (roomStats != null && mo8452l()) {
            C9432q.m18691b(a, 0);
            TextView textView = (TextView) mo11032a(R.id.auh);
            if (textView != null) {
                C9432q.m18682a(textView, (CharSequence) C3890e.m9833a(roomStats.getTicket()));
                String a2 = C3890e.m9833a(roomStats.getTicket());
                if (C3890e.m9837e(roomStats.getTicket())) {
                    textView.setText(C3864ab.m9794a(a2, 0.6777f, a2.length() - 1, a2.length()));
                } else {
                    textView.setText(a2);
                }
            }
        }
    }

    /* renamed from: b */
    private void m11775b(Room room) {
        String str;
        String str2;
        if (room != null) {
            if (this.f13798y) {
                str = "anchor_live_ending";
            } else {
                str = "live_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("action_type", "click");
            hashMap.put("event_page", str);
            hashMap.put("enter_from", "live_detail");
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(room.getId()));
            String str3 = "live_type";
            if (room.isLiveTypeAudio()) {
                str2 = "voice_live";
            } else {
                str2 = "video_live";
            }
            hashMap.put(str3, str2);
            hashMap.put("enter_from_merge", "live_end");
            hashMap.put("enter_method", "live_cover");
            hashMap.put("is_fans", m11772a(room));
            if (room.getLinkMicInfo() == null) {
                C8049c.m15979a().mo14202a("live_show", hashMap, new C8059j());
                return;
            }
            C2201v.m6614b(room.getLinkMicInfo()).mo6541d(C5129b.f13718a).mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5130c<Object>(hashMap), C5131d.f13720a);
        }
    }

    /* renamed from: a */
    public final void mo11007a(C8686a aVar) {
        if (this.f13699e != null) {
            if (this.f13705k != null && this.f13705k.getVisibility() == 0) {
                this.f13705k.setVisibility(8);
            }
            C4204a.m10421a((Context) this.f13699e, (int) R.string.ehg);
        }
    }

    public final void handleMsg(Message message) {
        boolean z;
        if (this.f13699e != null && !this.f13699e.isFinishing()) {
            int i = message.what;
            if (message.obj instanceof Exception) {
                if ((!C8607a.f23572a || !(i == 21 || i == 22)) && (message.obj instanceof C2949a)) {
                    C4204a.m10423a((Context) this.f13699e, ((C2949a) message.obj).getPrompt());
                }
                return;
            }
            if (12 == i && (message.obj instanceof Room)) {
                Room room = (Room) message.obj;
                if (!(room == null || room.getStats() == null)) {
                    User owner = this.f13797x.getOwner();
                    if (owner != null && owner.isFollowing()) {
                        this.f13799z = true;
                        C9432q.m18691b(this.f13705k, 8);
                    }
                    if (C9414h.m18630a(room.getTopFanTickets())) {
                        C9432q.m18691b((View) this.f13704j, 8);
                    } else {
                        this.f13704j.setFollowVisible(false);
                        this.f13704j.setDataCenter(this.f13697c);
                        this.f13704j.mo11006a(this.f13699e, this, room, this.f13796A);
                        m11773a(room.getStats());
                    }
                }
            }
            if (22 == i && (message.obj instanceof List)) {
                try {
                    List<Room> list = (List) message.obj;
                    if (this.f13706l.getVisibility() == 0) {
                        this.f13696b.addAll(list);
                    } else if (mo8452l() && list != null && !list.isEmpty()) {
                        if (list.size() >= 2) {
                            this.f13706l.setVisibility(0);
                            int b = (int) C9432q.m18687b(getContext(), 8.0f);
                            int a = (int) (((((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 32.0f)) - ((float) b)) / 2.0f);
                            this.f13707m = (LinearLayout) this.f13706l.findViewById(R.id.bce);
                            this.f13707m.setLayoutParams(this.f13707m.getLayoutParams());
                            LayoutInflater from = LayoutInflater.from(getContext());
                            for (int i2 = 0; i2 < 2; i2++) {
                                Room room2 = (Room) list.get(i2);
                                if (Room.isValid(room2)) {
                                    View inflate = from.inflate(R.layout.apf, null);
                                    if (i2 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    m11774a(room2, inflate, z);
                                    LayoutParams layoutParams = new LayoutParams(a, a);
                                    if (i2 == 0) {
                                        layoutParams.rightMargin = b;
                                    }
                                    inflate.setLayoutParams(layoutParams);
                                    inflate.setOnClickListener(this.f13712r);
                                    this.f13707m.addView(inflate);
                                }
                            }
                            this.f13696b = list;
                            if (this.f13696b.size() > 2) {
                                this.f13696b.remove(0);
                                this.f13696b.remove(0);
                            } else {
                                C4987a.m11475a(this.f13700f, this.f13797x.getId());
                            }
                        }
                    }
                } catch (Throwable th) {
                    C3831a.m9714b("LiveEnd", th);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11008a(Throwable th) {
        if (this.f13699e != null && th != null) {
            C9432q.m18691b(this.f13705k, 0);
            if (th instanceof C2949a) {
                C4204a.m10423a((Context) this.f13699e, ((C2949a) th).getPrompt());
            } else {
                C4204a.m10421a((Context) this.f13699e, (int) R.string.ehf);
            }
        }
    }

    /* renamed from: a */
    public final void mo11018a(List<Room> list) {
        boolean z;
        if (this.f13707m.getChildCount() >= 2) {
            int i = 0;
            while (i < list.size() && i < 2) {
                Room room = (Room) list.get(i);
                if (Room.isValid(room)) {
                    View childAt = this.f13707m.getChildAt(i);
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m11774a(room, childAt, z);
                }
                i++;
            }
            if (this.f13696b.size() <= 4) {
                C4987a.m11475a(this.f13700f, this.f13797x.getId());
            }
        }
    }

    /* renamed from: a */
    public final void mo11017a(DataCenter dataCenter, Bundle bundle) {
        this.f13697c = dataCenter;
        this.f13710p = C8123a.m16196a(dataCenter, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        User user;
        super.onViewCreated(view, bundle);
        this.f13701g = (VHeadView) mo11032a(R.id.d1o);
        this.f13702h = (TextView) mo11032a(R.id.d1p);
        this.f13703i = (HSImageView) mo11032a(R.id.bd6);
        this.f13704j = (TopFansLayout) mo11032a(R.id.d3p);
        this.f13705k = mo11032a(R.id.ai0);
        this.f13706l = mo11032a(R.id.c_9);
        this.f13708n = mo11032a(R.id.title);
        this.f13695a = mo11032a(R.id.iw);
        this.f13695a.setOnClickListener(this.f13713s);
        this.f13701g.setOnClickListener(this.f13713s);
        this.f13705k.setOnClickListener(this.f13713s);
        C9432q.m18691b(mo11032a(R.id.ejb), 8);
        getView();
        OnClickListener onClickListener = this.f13713s;
        DataCenter dataCenter = this.f13697c;
        if (this.f13797x != null) {
            user = this.f13797x.getOwner();
        } else {
            user = null;
        }
        if (user != null) {
            C5213c.m11815a((ImageView) this.f13701g, user.getAvatarThumb(), (int) R.drawable.bt6);
            this.f13702h.setText(user.displayId);
        }
        if (this.f13797x != null) {
            C4987a.m11475a(this.f13700f, this.f13797x.getId());
            m11773a(this.f13797x.getStats());
        }
        if (user != null && user.isFollowing()) {
            C9432q.m18691b(this.f13705k, 8);
        }
        if (user != null && user.getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
            TTLiveSDKContext.getHostService().mo10315h().mo14527a(true);
        }
        float a = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
        if (user != null) {
            C5213c.m11821a(this.f13703i, user.getAvatarLarge(), (C14234d) new C4620v(8, a, null));
        }
        C9432q.m18691b((View) this.f13704j, 8);
        if (!(getContext() == null || this.f13708n == null)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f13708n.getLayoutParams();
            marginLayoutParams.topMargin = (int) C9432q.m18687b(getContext(), 100.0f);
            this.f13708n.setLayoutParams(marginLayoutParams);
        }
        C8068g.m16014a((Context) this.f13699e);
        if (this.f13797x != null) {
            this.f13797x.getId();
        }
        C8038g a2 = C8049c.m15979a().mo14201a(C8059j.class);
        C8038g a3 = C8049c.m15979a().mo14201a(Room.class);
        C8049c.m15979a().mo14202a("livesdk_finish_show", C8066a.m16007a().mo14220a(a2, "enter_from_merge", "enter_method", "enter_from", "source", "action_type", "video_id").mo14220a(a3, "anchor_id", "room_id", "log_pb", "request_id").f22045a, new Object[0]);
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        C4116c.m10249a(C8612a.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.ak1, viewGroup, false);
    }

    /* renamed from: a */
    private void m11774a(Room room, View view, boolean z) {
        C5118b bVar;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.a22);
        TextView textView = (TextView) view.findViewById(R.id.aal);
        LiveRecommendBar liveRecommendBar = (LiveRecommendBar) view.findViewById(R.id.aak);
        if (!this.f13709o.contains(liveRecommendBar)) {
            this.f13709o.add(liveRecommendBar);
        }
        if (room.getOwner() != null && !TextUtils.isEmpty(room.getOwner().getNickName())) {
            C9432q.m18682a(textView, (CharSequence) room.getOwner().getNickName());
        }
        ImageModel imageModel = null;
        if (z) {
            bVar = this.f13714t;
        } else {
            bVar = null;
        }
        liveRecommendBar.mo10998a(bVar);
        if (room.getOwner() != null) {
            imageModel = room.getOwner().getAvatarMedium();
        }
        if (imageModel != null) {
            C5213c.m11820a(hSImageView, imageModel);
        }
        view.setTag(room);
        m11775b(room);
    }

    /* renamed from: a */
    public final void mo11016a(Activity activity, Room room, C8614a aVar, String str) {
        this.f13699e = activity;
        this.f13797x = room;
        this.f13698d = aVar;
        this.f13796A = str;
        this.f13798y = false;
    }
}
