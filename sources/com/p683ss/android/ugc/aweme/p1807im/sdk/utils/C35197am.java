package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.internal.p710a.C11322u;
import com.bytedance.p702im.core.p703a.C11165c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImApiHbWhenWsDisableExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ActionContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ChatCallContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommandShareContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommentContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DouYinRedPacketContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EPlatformCardContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupInviteContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareChallengeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCompilationContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCouponContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodWindowContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMiniAppContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareMusicContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareStickerContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareWebContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StickerEmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemCompatContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoRedEnvelopeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoRedEnvelopeNewYearContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.VideoUpdateTipsContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34401d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.am */
public class C35197am {

    /* renamed from: a */
    public static Handler f90485a = null;

    /* renamed from: b */
    public static int f90486b = 10;

    /* renamed from: c */
    private static long f90487c;

    /* renamed from: a */
    public static int m79552a() {
        if (C35279p.m79763a()) {
            return 6000;
        }
        return 500;
    }

    /* renamed from: e */
    private static Handler m79566e() {
        if (f90485a == null) {
            synchronized (C35197am.class) {
                if (f90485a == null) {
                    f90485a = new Handler(Looper.getMainLooper()) {
                        public final void handleMessage(Message message) {
                            super.handleMessage(message);
                            if (message.what == C35197am.f90486b) {
                                C35197am.m79562c();
                            }
                        }
                    };
                }
            }
        }
        return f90485a;
    }

    /* renamed from: b */
    public static void m79560b() {
        C11165c.m22588a();
        if (!C11165c.m22590a(C35279p.m79763a() ^ true ? 1 : 0) || SystemClock.uptimeMillis() - f90487c <= 10000) {
            m79558a(false);
            return;
        }
        f90487c = SystemClock.uptimeMillis();
        C11165c.m22588a().mo20514b(4);
        m79558a(true);
    }

    /* renamed from: c */
    public static void m79562c() {
        C11165c.m22588a();
        if (!C11165c.m22590a(C35279p.m79763a() ^ true ? 1 : 0) || SystemClock.uptimeMillis() - f90487c <= 2000) {
            m79558a(false);
            return;
        }
        f90487c = SystemClock.uptimeMillis();
        C11165c.m22588a().mo20514b(3);
        m79558a(true);
    }

    /* renamed from: d */
    public static void m79565d() {
        C11165c.m22588a();
        if (C11165c.m22590a(C35279p.m79763a() ^ true ? 1 : 0) && SystemClock.uptimeMillis() - f90487c > 5000) {
            f90487c = SystemClock.uptimeMillis();
            C11165c.m22588a().mo20517e();
        }
    }

    /* renamed from: a */
    public static void m79556a(C11207p pVar) {
        if (pVar != null) {
            C11213r.m22773e(pVar);
        }
    }

    /* renamed from: b */
    public static void m79561b(C11207p pVar) {
        if (pVar != null) {
            C11213r.m22772d(pVar);
        }
    }

    /* renamed from: c */
    public static void m79563c(C11207p pVar) {
        m79557a(pVar, null);
    }

    /* renamed from: d */
    public static long m79564d(C11207p pVar) {
        if (pVar == null) {
            return -1;
        }
        try {
            return Long.valueOf((String) pVar.getExt().get("old_client_message_id")).longValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static boolean m79568f(C11207p pVar) {
        boolean z = false;
        if (pVar == null) {
            return false;
        }
        if (pVar.getMsgType() == 1002) {
            try {
                if (((SayHelloContent) C33888y.content(pVar)).getType() == 100200) {
                    z = true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: e */
    public static boolean m79567e(C11207p pVar) {
        Map ext = pVar.getExt();
        if (ext == null || !ext.containsKey("source_aid")) {
            return false;
        }
        return TextUtils.equals((CharSequence) ext.get("source_aid"), "1349");
    }

    /* renamed from: h */
    public static boolean m79570h(C11207p pVar) {
        boolean z = false;
        if (!pVar.isRecalled() || pVar.getExt() == null || !pVar.getExt().containsKey("s:recall_role")) {
            return false;
        }
        try {
            if (Integer.valueOf((String) pVar.getExt().get("s:recall_role")).intValue() == 4) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: a */
    public static void m79558a(boolean z) {
        if (f90485a != null) {
            if (z || !f90485a.hasMessages(f90486b)) {
                f90485a.removeMessages(f90486b);
            } else {
                return;
            }
        }
        if (C34401d.m78329a().mo72406b()) {
            C35459a.m80148a("MessageUtil", "ws connected");
            return;
        }
        int a = C10181b.m20511a().mo18168a(ImApiHbWhenWsDisableExperiment.class, true, "im_api_hb_when_ws_disable", 31744, -1);
        if (a < 0) {
            C35459a.m80150b("MessageUtil", "api hb disable");
        } else if (a == 0) {
            C35459a.m80150b("MessageUtil", "ab test not config");
        } else {
            if (a < 10000) {
                a = 10000;
            }
            StringBuilder sb = new StringBuilder("delayNetPullMsg interval=");
            sb.append(a);
            C35459a.m80150b("MessageUtil", sb.toString());
            m79566e().sendMessageDelayed(m79566e().obtainMessage(f90486b), (long) a);
        }
    }

    /* renamed from: g */
    public static boolean m79569g(C11207p pVar) {
        if (pVar.getConversationType() == C11170a.f30116b && pVar.isRecalled() && pVar.getExt() != null && pVar.getExt().containsKey("s:recall_role")) {
            String str = (String) pVar.getExt().get("s:recall_role");
            if (!TextUtils.isEmpty(str)) {
                int intValue = Integer.valueOf(str).intValue();
                if (intValue == GroupRole.OWNER.getValue() || intValue == GroupRole.MANAGER.getValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m79555a(String str) {
        String str2 = "";
        if (TextUtils.equals(str, "aweme")) {
            return "video";
        }
        if (TextUtils.equals(str, "pic")) {
            return "pic";
        }
        if (TextUtils.equals(str, "gif")) {
            return "gif";
        }
        if (TextUtils.equals(str, "text")) {
            return "text";
        }
        if (TextUtils.equals(str, "music")) {
            return "music_card";
        }
        if (TextUtils.equals(str, "poi")) {
            return "poi_card";
        }
        if (TextUtils.equals(str, "challenge")) {
            return "tag_card";
        }
        if (TextUtils.equals(str, "ranking")) {
            return "hot_search_card";
        }
        if (TextUtils.equals(str, "game")) {
            return "game";
        }
        if (TextUtils.equals(str, "user")) {
            return "profile";
        }
        if (TextUtils.equals(str, CustomActionPushReceiver.f104061f)) {
            return CustomActionPushReceiver.f104061f;
        }
        if (TextUtils.equals(str, "web")) {
            return C23060d.f61427a;
        }
        if (TextUtils.equals(str, "coupon")) {
            return "poi_coupon";
        }
        return str2;
    }

    /* renamed from: i */
    public static String m79571i(C11207p pVar) {
        String str = "";
        BaseContent content = C33888y.content(pVar);
        int msgType = pVar.getMsgType();
        if (msgType != 2) {
            if (msgType != 5) {
                if (msgType == 17) {
                    return "audio";
                }
                if (msgType == 22 || msgType == 25) {
                    return "page";
                }
                if (msgType != 27) {
                    if (msgType == 30) {
                        return "video";
                    }
                    switch (msgType) {
                        case 7:
                            String str2 = "";
                            if (content instanceof TextContent) {
                                str2 = ((TextContent) content).getText();
                            }
                            int a = C29408b.m69340a(C11010c.m22280a(), str2);
                            if (a == 1) {
                                return "emoji";
                            }
                            if (a == 0) {
                                return "text";
                            }
                            if (a == 2) {
                                return "text_emoji";
                            }
                            return str;
                        case 8:
                            return "share_video";
                        default:
                            switch (msgType) {
                                case 71:
                                    return "share";
                                case 72:
                                    return "sticker";
                                default:
                                    return "unknown";
                            }
                    }
                }
            } else if (content.getType() == 501) {
                return "favoriate_emoji";
            } else {
                if (content.getType() == 502) {
                    return "giphy";
                }
                if (!C34004b.m77718b().isMtCase()) {
                    return "emoji";
                }
                return "sticker";
            }
        }
        return "pic";
    }

    /* renamed from: a */
    public static int m79553a(BaseContent baseContent) {
        String str;
        if (baseContent instanceof TextContent) {
            return 7;
        }
        if (baseContent instanceof SystemContent) {
            return 1;
        }
        if (baseContent instanceof SystemCompatContent) {
            return 1006;
        }
        if (baseContent instanceof SharePictureContent) {
            return 12;
        }
        if (baseContent instanceof ShareMusicContent) {
            return 22;
        }
        if (baseContent instanceof ShareAwemeContent) {
            return 8;
        }
        if (baseContent instanceof CommandShareContent) {
            return 13;
        }
        if (baseContent instanceof StoryPictureContent) {
            return 27;
        }
        if (baseContent instanceof OnlyPictureContent) {
            return 2;
        }
        if (baseContent instanceof EmojiContent) {
            if (baseContent instanceof StickerEmojiContent) {
                return 51;
            }
            return 5;
        } else if (baseContent instanceof VideoUpdateTipsContent) {
            return 14;
        } else {
            if (baseContent instanceof CommentContent) {
                return 16;
            }
            if (baseContent instanceof AudioContent) {
                return 17;
            }
            if (baseContent instanceof SharePoiContent) {
                return 20;
            }
            if (baseContent instanceof ShareCouponContent) {
                return 28;
            }
            if (baseContent instanceof ShareRankingListContent) {
                if (baseContent.getType() == 2301) {
                    return 23;
                }
                return 18;
            } else if (baseContent instanceof ShareChallengeContent) {
                return 19;
            } else {
                if (baseContent instanceof ShareMiniAppContent) {
                    return 24;
                }
                if (baseContent instanceof ShareLiveContent) {
                    return 21;
                }
                if (baseContent instanceof ShareUserContent) {
                    return 25;
                }
                if (baseContent instanceof ShareWebContent) {
                    return 26;
                }
                if (baseContent instanceof StoryVideoContent) {
                    return 30;
                }
                if (baseContent instanceof StoryReplyContent) {
                    return 32;
                }
                if (baseContent instanceof CommonRedEnvelopeContent) {
                    return 35;
                }
                if (baseContent instanceof VideoRedEnvelopeContent) {
                    return 36;
                }
                if (baseContent instanceof VideoRedEnvelopeNewYearContent) {
                    return 38;
                }
                if (baseContent instanceof SelfStoryReplyContent) {
                    return 53;
                }
                if (baseContent instanceof ShareGoodContent) {
                    return 61;
                }
                if (baseContent instanceof ShareGoodWindowContent) {
                    return 62;
                }
                if (baseContent instanceof EPlatformCardContent) {
                    return 70;
                }
                if (baseContent instanceof GroupInviteContent) {
                    return 58;
                }
                if (baseContent instanceof GroupNoticeContent) {
                    return 1001;
                }
                if (baseContent instanceof ShareCompilationContent) {
                    return 71;
                }
                if (baseContent instanceof ShareStickerContent) {
                    return 72;
                }
                if (baseContent instanceof ChatCallContent) {
                    if (!C34004b.m77717a().f87929a.f91092a) {
                        C32458a.m75144a("Cannot send chat call message!!!");
                        return 73;
                    }
                    throw new IllegalArgumentException("Cannot send chat call message!!!");
                } else if (baseContent instanceof ActionContent) {
                    return 2000;
                } else {
                    if (baseContent instanceof DouYinRedPacketContent) {
                        return 74;
                    }
                    if (!C34004b.m77717a().f87929a.f91092a) {
                        HashMap hashMap = new HashMap();
                        String str2 = "error";
                        if (baseContent != null) {
                            try {
                                str = C35277o.m79761a(baseContent);
                            } catch (Exception e) {
                                hashMap.put("error", e.getMessage());
                            }
                        } else {
                            str = "";
                        }
                        hashMap.put(str2, str);
                        C35265e.m79726a("error_msg_content", hashMap);
                        return -1;
                    }
                    throw new IllegalArgumentException("Message Type is NONE!!!");
                }
            }
        }
    }

    /* renamed from: a */
    public static C11207p m79554a(C11207p pVar, List<String> list) {
        if (list == null || list.isEmpty()) {
            return pVar;
        }
        pVar.getExt().put("s:mentioned_users", C11322u.m23120a(list, ","));
        return pVar;
    }

    /* renamed from: a */
    public static boolean m79559a(C11207p pVar, BaseContent baseContent) {
        if (baseContent == null || pVar == null || pVar.getExt() == null || !TextUtils.equals((CharSequence) pVar.getExt().get("awe:from:commerce"), "1")) {
            return false;
        }
        int msgType = pVar.getMsgType();
        if (msgType == 70 || (msgType == 26 && baseContent.isCard)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m79557a(final C11207p pVar, final C11162b<C11207p> bVar) {
        String str;
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(uptimeMillis);
        pVar.getLocalExt().put("send_sdk_time", sb.toString());
        if (pVar != null) {
            Map ext = pVar.getExt();
            if (!ext.containsKey("old_client_message_id")) {
                ext.put("old_client_message_id", String.valueOf(C35267g.m79739a()));
            }
            if (C35265e.m79729a(String.valueOf(C11190e.m22685a(pVar.getConversationId())))) {
                if (7 == pVar.getMsgType()) {
                    str = "message";
                } else if (5 == pVar.getMsgType() || 2 == pVar.getMsgType()) {
                    str = "chat_pic";
                } else {
                    str = "insite_share";
                }
                C35190af.m79442a();
                C35190af.m79457a(str);
                pVar.setMsgStatus(2);
            }
            if (pVar.getLocalExt().get("send_time") != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() - Long.parseLong((String) pVar.getLocalExt().get("send_time"));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(currentTimeMillis);
                    pVar.getLocalExt().put("send_app_consume_time", sb2.toString());
                } catch (NumberFormatException unused) {
                }
            }
            C11213r.m22768a(pVar, (C11162b<C11207p>) new C11162b<C11207p>() {
                /* renamed from: a */
                public final void mo20508a(C11202k kVar) {
                    C35281r.m79772a(pVar, kVar);
                    if (bVar != null) {
                        bVar.mo20508a(kVar);
                    }
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
                    C11207p pVar = (C11207p) obj;
                    C35281r.m79772a(pVar, (C11202k) null);
                    if (bVar != null) {
                        bVar.mo20506a(pVar);
                    }
                }
            });
        }
    }
}
