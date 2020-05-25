package com.bytedance.android.livesdk.schema;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.event.C5198q;
import com.bytedance.android.livesdk.chatroom.p306bl.C5013h;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.schema.interfaces.C8261b;
import com.bytedance.android.livesdk.schema.interfaces.C8261b.C8262a;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.p450h.C8750a;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;

public class RoomActionHandler implements C8261b {
    private static final String XT_LEARNING_ROOM_TYPE = "1";
    private boolean isFromPush;
    private boolean isNewFeedStyle;

    private boolean shouldConfirmAndNeverAlert() {
        return false;
    }

    public boolean canHandle(Uri uri) {
        if (TextUtils.equals(CustomActionPushReceiver.f104061f, uri.getHost())) {
            return true;
        }
        if (!TextUtils.equals("webcast_room", uri.getHost()) || (!TextUtils.equals("/", uri.getPath()) && !TextUtils.equals("", uri.getPath()))) {
            return false;
        }
        return true;
    }

    private void toastClickLog(C8262a aVar, boolean z) {
        String str;
        if (aVar.f22585b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("toast_type", aVar.f22585b);
            String str2 = "choose_type";
            if (z) {
                str = "cancel";
            } else {
                str = "yes_never";
            }
            hashMap.put(str2, str);
            C8049c.m15979a().mo14202a("livesdk_toast_click", hashMap, Room.class);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$handle$0$RoomActionHandler(long j, C2204x xVar) throws Exception {
        String str;
        try {
            Room a = C5013h.m11506a(false, j, 3);
            User owner = a.getOwner();
            if (a.getStatus() == 4) {
                str = "live_finish";
            } else {
                str = "live_on";
            }
            logPushCheckLiveState(owner, j, str);
        } catch (Exception e) {
            C3831a.m9714b("ttlive_push", (Throwable) e);
        }
    }

    public void logPushClick(String str, String str2) {
        if (this.isFromPush) {
            C8049c.m15979a().mo14202a("livesdk_push_click", C8066a.m16007a().mo14221a("anchor_id", str2).mo14221a("room_id", str).f22045a, new Object[0]);
        }
    }

    private void jumpToOtherRoom(Room room, C8262a aVar) {
        C5197p pVar = new C5197p(aVar.f22584a);
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", aVar.f22586c);
        bundle.putString("source", aVar.f22588e);
        bundle.putString("enter_from_merge", aVar.f22587d);
        bundle.putString("enter_method", aVar.f22589f);
        bundle.putLong("anchor_id", aVar.f22599p);
        bundle.putString("top_message_type", aVar.f22604u);
        bundle.putString(CustomActionPushReceiver.f104056a, aVar.f22590g);
        bundle.putLong("live.intent.extra.FROM_ROOM_ID", room.getId());
        bundle.putInt("orientation", aVar.f22601r);
        if (!C9431p.m18664a(aVar.f22591h)) {
            bundle.putString("gift_id", aVar.f22591h);
        }
        if (!TextUtils.isEmpty(aVar.f22606w)) {
            bundle.putString("pop_type", aVar.f22606w);
        }
        pVar.f13910c = bundle;
        pVar.f13909b = aVar.f22585b;
        bundle.putBoolean("live.intent.extra.OPEN_PICK_PROFILE_PANEL", aVar.f22608y);
        bundle.putBoolean("live.intent.extra.OPEN_PICK_TOP", aVar.f22609z);
        bundle.putLong("live.intent.extra.FROM_PORTAL_ID", aVar.f22607x);
        if (aVar.f22581E != null) {
            bundle.putString("enable_feed_drawer", aVar.f22581E);
        }
        if ("true".equals(aVar.f22602s)) {
            C4495a.m10823a().mo10301a((Object) new C5198q(pVar));
        } else {
            C4495a.m10823a().mo10301a((Object) pVar);
        }
    }

    public boolean handle(final Context context, final Uri uri) {
        String queryParameter = uri.getQueryParameter("room_id");
        long j = 0;
        if (!TextUtils.isEmpty(queryParameter)) {
            long parseLong = Long.parseLong(queryParameter);
            if (parseLong > 0) {
                String str = "";
                String queryParameter2 = uri.getQueryParameter("enter_from_merge");
                String queryParameter3 = uri.getQueryParameter("enter_method");
                String queryParameter4 = uri.getQueryParameter("inner_push_type");
                String queryParameter5 = uri.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    try {
                        j = Long.parseLong(queryParameter5);
                    } catch (NumberFormatException unused) {
                    }
                }
                logPushClick(queryParameter, queryParameter5);
                if (this.isFromPush) {
                    C2201v.m6601a((C2205y<T>) new C8256f<T>(this, parseLong)).mo6529b(C2168a.m6521b()).mo6551j();
                }
                C8262a a = new C8262a().mo14437a(parseLong);
                a.f22603t = str;
                C8262a g = a.mo14438a(uri.getQueryParameter("enter_live_source")).mo14441b(uri.getQueryParameter("enter_from_v3")).mo14449j(queryParameter2).mo14450k(uri.getQueryParameter("enter_method")).mo14442c(uri.getQueryParameter("enter_from_module")).mo14443d(uri.getQueryParameter("msg_type")).mo14440b(j).mo14444e(uri.getQueryParameter("gift_id")).mo14445f(uri.getQueryParameter("tip")).mo14450k(queryParameter3).mo14453n(queryParameter4).mo14447h(uri.getQueryParameter("request_id")).mo14448i(uri.getQueryParameter("log_pb")).mo14446g(uri.getQueryParameter("tip_i18n"));
                g.f22604u = uri.getQueryParameter("top_message_type");
                g.f22605v = -1;
                C8262a a2 = g.mo14436a(-1);
                a2.f22606w = uri.getQueryParameter("pop_type");
                C8262a l = a2.mo14452m(uri.getQueryParameter("video_id")).mo14451l(uri.getQueryParameter("back_room"));
                l.f22578B = "";
                l.f22579C = "";
                l.f22581E = "";
                return handleEnterRoom(context, l.mo14439a((HashMap) null));
            }
        } else {
            final String queryParameter6 = uri.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter6)) {
                long parseLong2 = Long.parseLong(queryParameter6);
                if (parseLong2 > 0) {
                    TTLiveSDKContext.getHostService().mo10315h().mo14530b(parseLong2).mo6159b((C1683ag<? super T>) new C1683ag<User>() {
                        public final void onSubscribe(C1690c cVar) {
                        }

                        public final void onError(Throwable th) {
                            RoomActionHandler.this.logPushClick("-1", queryParameter6);
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            String str;
                            User user = (User) obj;
                            RoomActionHandler.this.logPushClick(String.valueOf(user.getLiveRoomId()), queryParameter6);
                            long liveRoomId = user.getLiveRoomId();
                            RoomActionHandler roomActionHandler = RoomActionHandler.this;
                            if (liveRoomId > 0) {
                                str = "live_on";
                            } else {
                                str = "live_finish";
                            }
                            roomActionHandler.logPushCheckLiveState(user, liveRoomId, str);
                            if (liveRoomId > 0) {
                                RoomActionHandler.this.handleEnterRoom(context, new C8262a().mo14437a(liveRoomId).mo14438a(uri.getQueryParameter("enter_live_source")).mo14441b(uri.getQueryParameter("enter_from_v3")).mo14450k(uri.getQueryParameter("enter_method")).mo14449j(uri.getQueryParameter("enter_from_merge")).mo14442c(uri.getQueryParameter("enter_from_module")).mo14443d(uri.getQueryParameter("msg_type")).mo14444e(uri.getQueryParameter("gift_id")).mo14445f(uri.getQueryParameter("tip")).mo14452m(uri.getQueryParameter("video_id")).mo14446g(uri.getQueryParameter("tip_i18n")).mo14453n(uri.getQueryParameter("inner_push_type")).mo14439a((HashMap) null));
                                return;
                            }
                            TTLiveSDKContext.getHostService().mo10310c().centerToast(context, TTLiveSDKContext.getHostService().mo10308a().context().getString(R.string.enu), 1);
                        }
                    });
                }
            }
        }
        return false;
    }

    public boolean handleEnterRoom(Context context, C8262a aVar) {
        Bundle bundle;
        long j = 0;
        if (aVar.f22584a <= 0) {
            return false;
        }
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom == null) {
            Boolean bool = (Boolean) LiveSettingKeys.ENABLE_ENTER_ROOM_OPT_FROM_LIVE_AUDIENCE_END.mo9431a();
            if (bool == null || !bool.booleanValue() || aVar.f22582F == null) {
                bundle = new Bundle();
            } else {
                bundle = C8750a.m17218a(aVar.f22582F);
            }
            bundle.putLong("live.intent.extra.ROOM_ID", aVar.f22584a);
            bundle.putString("live.intent.extra.ENTER_LIVE_SOURCE", aVar.f22585b);
            bundle.putString("live.intent.extra.REQUEST_ID", aVar.f22597n);
            bundle.putString("live.intent.extra.LOG_PB", aVar.f22598o);
            bundle.putLong("live.intent.extra.USER_FROM", aVar.f22599p);
            bundle.putInt("orientation", aVar.f22601r);
            bundle.putInt("enter_room_type", aVar.f22605v);
            bundle.putString("author_id", aVar.f22603t);
            bundle.putString("pop_type", aVar.f22606w);
            bundle.putLong("live.intent.extra.FROM_PORTAL_ID", aVar.f22607x);
            if (aVar.f22580D != null) {
                bundle.putBoolean("enter_from_effect_ad", true);
                bundle.putSerializable("live_effect_ad_log_extra_map", aVar.f22580D);
            }
            try {
                j = Long.parseLong(aVar.f22603t);
            } catch (Exception unused) {
            }
            bundle.putLong("anchor_id", j);
            if (aVar.f22581E != null) {
                bundle.putString("enable_feed_drawer", aVar.f22581E);
            }
            if (aVar.f22600q == null) {
                aVar.f22600q = new Bundle();
            }
            aVar.f22600q.putString("enter_from", aVar.f22586c);
            aVar.f22600q.putString("enter_from_merge", aVar.f22587d);
            aVar.f22600q.putString("pop_type", aVar.f22606w);
            aVar.f22600q.putString("enter_method", aVar.f22589f);
            aVar.f22600q.putBoolean("live.intent.extra.OPEN_GIFT_PANEL", aVar.f22594k);
            aVar.f22600q.putBoolean("live.intent.extra.OPEN_PROP_PANEL", aVar.f22595l);
            aVar.f22600q.putString("top_message_type", aVar.f22604u);
            aVar.f22600q.putString("video_id", aVar.f22577A);
            aVar.f22600q.putBoolean("live.intent.extra.OPEN_PICK_PROFILE_PANEL", aVar.f22608y);
            aVar.f22600q.putBoolean("live.intent.extra.OPEN_PICK_TOP", aVar.f22609z);
            aVar.f22600q.putString("request_page", aVar.f22578B);
            aVar.f22600q.putString("anchor_type", aVar.f22579C);
            aVar.f22600q.putString("inner_push_type", aVar.f22583G);
            if (aVar.f22596m != null) {
                aVar.f22600q.putAll(aVar.f22596m);
            }
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", aVar.f22600q);
            TTLiveSDKContext.getHostService().mo10314g().mo15568a(context, aVar.f22584a, bundle);
            return true;
        } else if (currentRoom.getOwner() != null && currentRoom.getOwner().getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
            new C8552a(context, 0).mo14996a(false).mo15008c((int) R.string.esa).mo15003b(0, (int) R.string.esc, C8257g.f22572a).mo15011d();
            return true;
        } else if (currentRoom.getId() == aVar.f22584a) {
            Class liveActivityClass = TTLiveSDKContext.getHostService().mo10310c().getLiveActivityClass();
            if (liveActivityClass != null && !liveActivityClass.isAssignableFrom(context.getClass())) {
                ((Activity) context).finish();
            }
            return true;
        } else if (2 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            new C8552a(context, 0).mo14996a(false).mo15008c((int) R.string.esd).mo15003b(0, (int) R.string.esc, C8258h.f22573a).mo15011d();
            return true;
        } else if (!TextUtils.isEmpty(aVar.f22592i) || !TextUtils.isEmpty(aVar.f22593j)) {
            Spannable spannable = null;
            if (!TextUtils.isEmpty(aVar.f22593j)) {
                try {
                    C8851g gVar = (C8851g) C4514j.m10883j().mo10320a().mo34884a(aVar.f22593j, C8851g.class);
                    if (gVar != null) {
                        String a = C7676b.m15696a().mo14036a(gVar.f24155a);
                        String str = gVar.f24156b;
                        if (TextUtils.isEmpty(a)) {
                            a = str;
                        }
                        spannable = C5115z.m11758a(a, gVar);
                    }
                } catch (Exception e) {
                    C3831a.m9716d("RoomSchemaHandler", e.getMessage());
                }
            }
            if (spannable == null || spannable == C5115z.f13664a) {
                spannable = new SpannableString(aVar.f22592i);
            }
            if (!TextUtils.isEmpty(spannable)) {
                new C8552a(context, 1).mo14996a(false).mo15009c((CharSequence) spannable).mo15003b(2, (int) R.string.ese, (OnClickListener) new C8259i(this, currentRoom, aVar)).mo15003b(3, (int) R.string.esb, C8265j.f22610a).mo15011d();
            }
            return true;
        } else {
            jumpToOtherRoom(currentRoom, aVar);
            return true;
        }
    }

    private /* synthetic */ void lambda$handleEnterRoom$6(C8262a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        toastClickLog(aVar, true);
    }

    public void logPushCheckLiveState(User user, long j, String str) {
        if (this.isFromPush) {
            C8049c a = C8049c.m15979a();
            String str2 = "livesdk_push_click_lookup_anchor";
            C8066a a2 = C8066a.m16007a().mo14221a("anchor_id", String.valueOf(user.getId())).mo14221a("anchor_status", str);
            String str3 = "room_id";
            if (j <= 0) {
                j = 0;
            }
            a.mo14202a(str2, a2.mo14221a(str3, String.valueOf(j)).f22045a, new Object[0]);
        }
    }

    private /* synthetic */ void lambda$handleEnterRoom$8(Room room, C8262a aVar, DialogInterface dialogInterface, int i) {
        C8262a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f22584a, aVar2.f22587d, aVar2.f22589f, aVar2.f22586c, aVar2.f22588e, aVar2.f22590g, aVar2.f22591h, aVar2.f22585b, aVar2.f22601r, aVar2.f22602s, aVar2.f22599p, aVar2.f22604u, aVar2.f22606w, aVar2.f22607x);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$handleEnterRoom$3$RoomActionHandler(Room room, C8262a aVar, DialogInterface dialogInterface, int i) {
        C8262a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f22584a, aVar2.f22587d, aVar2.f22589f, aVar2.f22586c, aVar2.f22588e, aVar2.f22590g, aVar2.f22591h, aVar2.f22585b, aVar2.f22601r, aVar2.f22602s, aVar2.f22599p, aVar2.f22604u, aVar2.f22606w, aVar2.f22607x);
        dialogInterface.dismiss();
    }

    private /* synthetic */ void lambda$handleEnterRoom$5(Room room, C8262a aVar, DialogInterface dialogInterface, int i) {
        C8262a aVar2 = aVar;
        Room room2 = room;
        Room room3 = room2;
        jumpToOtherRoom(room3, aVar2.f22584a, aVar2.f22587d, aVar2.f22589f, aVar2.f22586c, aVar2.f22588e, aVar2.f22590g, aVar2.f22591h, aVar2.f22585b, aVar2.f22601r, aVar2.f22602s, aVar2.f22599p, aVar2.f22604u, aVar2.f22606w, aVar2.f22607x);
        if (shouldConfirmAndNeverAlert()) {
            C4525b.f12354aW.mo10346a(Boolean.valueOf(false));
        }
        dialogInterface.dismiss();
        toastClickLog(aVar2, false);
    }

    private /* synthetic */ void lambda$handleEnterRoom$7(Room room, C8262a aVar, DialogInterface dialogInterface, int i) {
        C8262a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f22584a, aVar2.f22587d, aVar2.f22589f, aVar2.f22586c, aVar2.f22588e, aVar2.f22590g, aVar2.f22591h, aVar2.f22585b, aVar2.f22601r, aVar2.f22602s, aVar2.f22599p, aVar2.f22604u, aVar2.f22606w, aVar2.f22607x);
        if (shouldConfirmAndNeverAlert()) {
            C4525b.f12354aW.mo10346a(Boolean.valueOf(false));
        }
        C4525b.f12354aW.mo10346a(Boolean.valueOf(false));
        dialogInterface.dismiss();
    }

    private void jumpToOtherRoom(Room room, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, long j2, String str9, String str10, long j3) {
        long j4 = j;
        C5197p pVar = new C5197p(j);
        Bundle bundle = new Bundle();
        String str11 = str3;
        bundle.putString("enter_from", str3);
        String str12 = str4;
        bundle.putString("source", str4);
        String str13 = str;
        bundle.putString("enter_from_merge", str);
        String str14 = str2;
        bundle.putString("enter_method", str2);
        bundle.putLong("anchor_id", j2);
        bundle.putString("top_message_type", str9);
        if (!TextUtils.isEmpty(str10)) {
            bundle.putString("pop_type", str10);
        }
        bundle.putLong("live.intent.extra.FROM_PORTAL_ID", j3);
        String str15 = str5;
        bundle.putString(CustomActionPushReceiver.f104056a, str5);
        bundle.putLong("live.intent.extra.FROM_ROOM_ID", room.getId());
        bundle.putInt("orientation", i);
        if (!C9431p.m18664a(str6)) {
            String str16 = str6;
            bundle.putString("gift_id", str6);
        }
        pVar.f13910c = bundle;
        pVar.f13909b = str7;
        if ("true".equals(str8)) {
            C4495a.m10823a().mo10301a((Object) new C5198q(pVar));
        } else {
            C4495a.m10823a().mo10301a((Object) pVar);
        }
    }
}
