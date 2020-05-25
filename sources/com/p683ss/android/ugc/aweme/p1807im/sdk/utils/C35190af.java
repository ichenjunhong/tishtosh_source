package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33353ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCouponContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareRankingListContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34546c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34551h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.XPlanAwemeBannerConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.ImServiceProvider;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.af */
public final class C35190af {

    /* renamed from: a */
    public static C33353ab f90474a;

    /* renamed from: b */
    public static String f90475b;

    /* renamed from: c */
    private static final HashSet<String> f90476c;

    /* renamed from: a */
    public static void m79461a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_type", str2);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("enter_chat").setLabelName("message").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m79468a(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("chat_type", str3);
        hashMap.put("enter_from", str5);
        hashMap.put("enter_method", str4);
        hashMap.put("process_id", str6);
        C26890h.m65011a("enter_chat", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79457a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CustomActionPushReceiver.f104056a, str);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("im_to_myself").setLabelName("chat").setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m79466a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_from", "chat");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("group_id", str2);
            }
            jSONObject.put("enter_method", str4);
            jSONObject.put("user_type", str3);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public final void mo73319a(C11207p pVar) {
        m79448a(pVar, "click");
    }

    /* renamed from: a */
    public final void mo73320a(SharePackage sharePackage, IMContact iMContact, boolean z) {
        m79455a(sharePackage, iMContact, z, false);
    }

    /* renamed from: a */
    public final void mo73321a(SharePackage sharePackage, IMContact iMContact, boolean z, boolean z2, String str) {
        if (sharePackage != null) {
            String str2 = sharePackage.f106895d;
            if ("aweme".equals(str2)) {
                m79481b(sharePackage, iMContact, z, z2, str);
            } else if ("poi".equals(str2)) {
                m79480b(sharePackage, iMContact, z);
            } else if ("music".equals(str2)) {
                m79489c(sharePackage, iMContact, z);
            } else if ("challenge".equals(str2)) {
                m79495d(sharePackage, iMContact, z);
            } else if ("ranking".equals(str2)) {
                m79502e(sharePackage, iMContact, z);
            } else if ("user".equals(str2)) {
                m79507f(sharePackage, iMContact, z);
            } else if ("web".equals(str2)) {
                m79512g(sharePackage, iMContact, z);
            } else if (CustomActionPushReceiver.f104061f.equals(str2)) {
                m79517h(sharePackage, iMContact, z);
            } else if ("good".equals(str2) || "good_window".equals(str2)) {
                m79522i(sharePackage, iMContact, z);
            } else if ("coupon".equals(str2)) {
                m79526j(sharePackage, iMContact, z);
            } else if ("mix".equals(str2)) {
                m79454a(sharePackage, iMContact);
            } else {
                if ("sticker".equals(str2)) {
                    m79479b(sharePackage, iMContact);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m79475a(Map<String, String> map, IMContact iMContact) {
        if (iMContact == null) {
            map.put("to_user_id", TEVideoRecorder.FACE_BEAUTY_NULL);
            map.put("conversation_id", TEVideoRecorder.FACE_BEAUTY_NULL);
        } else if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            map.put("to_user_id", iMUser.getUid());
            map.put("conversation_id", C11190e.m22687a(Long.valueOf(Long.parseLong(iMUser.getUid())).longValue()));
        } else {
            if (iMContact instanceof IMConversation) {
                map.put("conversation_id", ((IMConversation) iMContact).getConversationId());
                map.put("to_user_id", TEVideoRecorder.FACE_BEAUTY_NULL);
            }
        }
    }

    /* renamed from: a */
    private void m79454a(SharePackage sharePackage, IMContact iMContact) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "compilation_detail");
        hashMap.put("previous_page", sharePackage.f106900i.getString("previous_page"));
        hashMap.put("compilation_id", sharePackage.f106900i.getString("compilation_id"));
        hashMap.put("author_id", sharePackage.f106900i.getString("user_id"));
        hashMap.put("platform", "chat");
        String str = "";
        if (iMContact instanceof IMUser) {
            str = "private";
        } else if (iMContact instanceof IMConversation) {
            str = "group";
        }
        hashMap.put("chat_type", str);
        m79475a((Map<String, String>) hashMap, iMContact);
        C26890h.m65011a("share_compilation", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79450a(ShareRankingListContent shareRankingListContent, String str, String str2, boolean z) {
        if (shareRankingListContent != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("to_user_id", str);
            hashMap.put("conversation_id", str2);
            hashMap.put("enter_from", "chat");
            hashMap.put("action_type", z ? "click" : "show");
            C26890h.m65011a("hot_search_icon", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m79469a(String str, String str2, LinkedHashMap<String, Integer> linkedHashMap) {
        if (!linkedHashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (Entry entry : linkedHashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(',');
                sb2.append(entry.getValue());
                sb2.append(',');
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", C9395d.m18571a(str));
            hashMap.put("md5", str2);
            hashMap.put("emoji_name", sb.toString());
            hashMap.put("cnt", sb2.toString());
            hashMap.put("enter_from", "chat");
            C26890h.m65011a("send_emoji", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m79464a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = null;
        }
        C26890h.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m79451a(C35464a aVar) {
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("value", aVar.getCreativeId());
                jSONObject.put("log_extra", aVar.getLogExtra());
                jSONObject.put("value", aVar.getCreativeId());
                C26890h.onEvent(MobClick.obtain().setEventName("message_ad").setLabelName("message_action").setJsonObject(jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m79485b(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        hashMap.put("enter_from", str2);
        hashMap.put("enter_method", str3);
        C26890h.m65011a("enter_personal_detail", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m79484b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", str);
            C26890h.m65011a(str2, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m79473a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("action_type", z ? "clear" : "post");
        C26890h.m65011a("group_notice_edit", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m79486b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", str2);
        hashMap.put("to_status", str3);
        C26890h.m65011a(str4, (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79476a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "1" : "0");
        C26890h.m65011a("upload_emoji", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79459a(String str, int i, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("account_type", str);
        hashMap.put("client_order", String.valueOf(i));
        if (i2 > 0) {
            if (z) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i2));
            } else {
                hashMap.put("notice_type", "yellow_dot");
            }
        }
        C26890h.m65011a("show_official_message", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79471a(String str, String str2, List<C29366a> list, boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((C29366a) list.get(i)).getId());
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        hashMap.put("conversation_id", str2);
        hashMap.put("to_user_id", str);
        hashMap.put("emoji_id", sb.toString());
        if (z) {
            C26890h.m65011a("greeting_emoji_alert_close", (Map<String, String>) hashMap);
        } else {
            C26890h.m65011a("greeting_emoji_alert_show", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m79453a(SharePackage sharePackage, BaseContent baseContent, int i) {
        String a = C35197am.m79555a(sharePackage.f106895d);
        if (!TextUtils.isEmpty(a)) {
            String str = baseContent == null ? "share" : "forward";
            HashMap hashMap = new HashMap();
            hashMap.put("message_category", a);
            hashMap.put("contact_number", String.valueOf(i));
            hashMap.put("action_type", str);
            C26890h.m65011a("multi_send_message", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m79465a(String str, String str2, String str3, BaseContent baseContent) {
        HashMap hashMap = new HashMap();
        hashMap.put("message_category", str);
        hashMap.put("to_user_id", str3);
        hashMap.put("conversation_id", str2);
        hashMap.put("from_user_id", C35265e.m79730b().toString());
        if ("poi_coupon".equals(str) && (baseContent instanceof ShareCouponContent)) {
            ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent;
            hashMap.put("coupon_id", shareCouponContent.getCouponId());
            hashMap.put("activity_id", shareCouponContent.getActivityId());
        }
        C26890h.m65011a("message_forward", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private static void m79474a(Map<String, String> map) {
        C34551h l = C35284t.m79782a().mo73434l();
        if (l != null) {
            C34546c a = l.mo72619a();
            XPlanAwemeBannerConfig m = C35284t.m79782a().mo73436m();
            if (a == null && m != null) {
                map.put("banner_content", m.getBodyText());
                map.put("content_type", m.getBodyText());
                return;
            }
            if (a != null) {
                map.put("banner_content", a.f89058a);
                map.put("content_type", a.f89068k);
            }
        }
    }

    /* renamed from: a */
    public static void m79472a(String str, Map<String, String> map) {
        C26890h.m65011a(str, map);
    }

    /* renamed from: a */
    public static void m79470a(String str, String str2, List<IMUser> list, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str);
        hashMap.put("type", str2);
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(((IMUser) list.get(i)).getUid());
                if (i != list.size() - 1) {
                    sb.append(",");
                }
            }
            hashMap.put("to_user_list", sb.toString());
        } else {
            hashMap.put("to_user_list", TEVideoRecorder.FACE_BEAUTY_NULL);
        }
        String str4 = "action";
        if (TextUtils.isEmpty(str3)) {
            str3 = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        hashMap.put(str4, str3);
        C26890h.m65011a("group_chat_member_notice", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79462a(String str, String str2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("from_user_id", str2);
        hashMap.put("member", String.valueOf(i));
        C26890h.m65011a("group_chat_confirm_join", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m79487b(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("from_user_id", str3);
        hashMap.put("search_query", str4);
        hashMap.put("emoji_show", str5);
        hashMap.put("emoji_click", str6);
        C26890h.m65011a("auto_emoji_click", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79452a(SharePackage sharePackage) {
        if (sharePackage != null) {
            C26890h.m65011a("emoji_shortcut_click", C23089d.m56640a().mo47828a("group_id", sharePackage.f106900i.get("aid")).mo47828a("author_id", sharePackage.f106900i.get("author_id")).mo47828a("enter_from", sharePackage.f106900i.get("enter_from")).mo47829a("enter_method", "share_to_chat").f61491a);
        }
    }

    /* renamed from: a */
    public static void m79460a(String str, long j) {
        C26890h.m65011a("not_fullscreen_play_time", C23089d.m56640a().mo47829a("enter_from", "chat").mo47829a("group_id", str).mo47827a("duration", j).f61491a);
    }

    /* renamed from: a */
    public static void m79463a(String str, String str2, int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("toast_type", str2);
        hashMap.put("follow_show_cnt", String.valueOf(i));
        hashMap.put("follow_auto_cnt", String.valueOf(i2));
        hashMap.put("follow_cnt", String.valueOf(i3));
        C26890h.m65011a("group_inflow_toast_click", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79467a(String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("event_type", str3);
        hashMap.put("enter_from", str2);
        hashMap.put("card_type", str4);
        hashMap.put("rec_uid", str5);
        C26890h.m65011a("follow_card", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79456a(SharePackage sharePackage, String str, String str2, List<IMContact> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "chat");
        Bundle bundle = sharePackage.f106900i;
        hashMap.put("group_id", bundle.getString("item_id_string"));
        hashMap.put("author_id", bundle.getString("author_id"));
        hashMap.put("enter_from", bundle.getString("enter_from"));
        hashMap.put("conversation_id", "");
        hashMap.put("chat_cnt", str);
        hashMap.put("is_with_text", TextUtils.isEmpty(str2) ? "0" : "1");
        String str3 = "";
        if (!C9376b.m18558a((Collection<T>) list)) {
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMUser) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(",");
                    sb.append(((IMUser) iMContact).getUid());
                    str3 = sb.toString();
                } else if (iMContact instanceof IMConversation) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(",");
                    sb2.append(((IMConversation) iMContact).getConversationId());
                    str3 = sb2.toString();
                }
            }
        }
        hashMap.put("to_user_id", str3);
        C26890h.m65011a("share_video_to_chat", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static C35190af m79442a() {
        return new C35190af();
    }

    /* renamed from: e */
    public static void m79501e() {
        C26890h.m65011a("create_group_offsite_invite_show", (Map<String, String>) new HashMap<String,String>());
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f90476c = hashSet;
        hashSet.add("duoshan_banner_show");
        f90476c.add("duoshan_banner_click");
        f90476c.add("duoshan_download_notice");
    }

    /* renamed from: b */
    public static void m79477b() {
        C26890h.onEvent(MobClick.obtain().setEventName("click_emoji").setLabelName("chat"));
    }

    /* renamed from: c */
    public static void m79488c() {
        C26890h.onEvent(MobClick.obtain().setEventName("save_pic_success").setLabelName("chat"));
    }

    /* renamed from: d */
    public static void m79494d() {
        C26890h.m65011a("show_million_pound", C23089d.m56640a().mo47829a("enter_from", "click_duoshan_banner").mo47826a("is_million_pound", 1).f61491a);
    }

    /* renamed from: f */
    public static void m79506f() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("process_id", f90475b);
        C26890h.m65011a("show_keyboard", (Map<String, String>) hashMap);
    }

    /* renamed from: g */
    public static void m79511g() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("process_id", f90475b);
        C26890h.m65011a("show_emoji_panel", (Map<String, String>) hashMap);
    }

    /* renamed from: h */
    public static void m79516h() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("process_id", f90475b);
        hashMap.put("enter_method", "click_recommend");
        C26890h.m65011a("show_gif_panel", (Map<String, String>) hashMap);
    }

    /* renamed from: i */
    public static void m79521i() {
        HashMap hashMap = new HashMap();
        hashMap.put("action_on", "share_board");
        C26890h.m65011a("slide_up_full_screen_show", (Map<String, String>) hashMap);
    }

    /* renamed from: j */
    public static void m79525j() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "chat");
        hashMap.put("process_id", f90475b);
        hashMap.put("enter_method", "click_icon");
        C26890h.m65011a("show_gif_panel", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79449a(C33353ab abVar) {
        f90474a = abVar;
    }

    /* renamed from: d */
    public static void m79496d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        C26890h.m65011a("auto_emoji_show", (Map<String, String>) hashMap);
    }

    /* renamed from: f */
    public static void m79508f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C26890h.m65011a("invite_fans_to_group_entry", (Map<String, String>) hashMap);
    }

    /* renamed from: g */
    public static void m79513g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C26890h.m65011a("group_notice_button", (Map<String, String>) hashMap);
    }

    /* renamed from: h */
    public static void m79518h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        C26890h.m65011a("share_comment_toast", (Map<String, String>) hashMap);
    }

    /* renamed from: i */
    public static void m79523i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("show_type", str);
        C26890h.m65011a("show_commerce_message", (Map<String, String>) hashMap);
    }

    /* renamed from: j */
    public static void m79527j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        C26890h.m65011a("search_contact", (Map<String, String>) hashMap);
    }

    /* renamed from: l */
    public static void m79530l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str);
        C26890h.m65011a("create_group_click", (Map<String, String>) hashMap);
    }

    /* renamed from: m */
    public static void m79531m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C26890h.m65011a("auto_emoji_show", (Map<String, String>) hashMap);
    }

    /* renamed from: n */
    public static void m79532n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        C26890h.m65011a("inner_push_alert_show", (Map<String, String>) hashMap);
    }

    /* renamed from: o */
    public static void m79533o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", str);
        C26890h.m65011a("im_official_alert", (Map<String, String>) hashMap);
    }

    /* renamed from: r */
    public static void m79536r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", "cell");
        C26890h.m65011a(str, (Map<String, String>) hashMap);
    }

    /* renamed from: s */
    public static void m79537s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        C26890h.m65011a("group_follow_layer_show", (Map<String, String>) hashMap);
    }

    /* renamed from: t */
    public static void m79538t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", str);
        C26890h.m65011a("create_chat_click", (Map<String, String>) hashMap);
    }

    /* renamed from: e */
    public static int m79500e(String str) {
        if (C34004b.m77717a().mo71949f().showNewStyle()) {
            return C34169a.m77980a().mo72157a(str);
        }
        return 0;
    }

    /* renamed from: k */
    public static void m79529k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "message");
        hashMap.put("banner_content", str);
        C26890h.m65011a("duoshan_banner_content_show", (Map<String, String>) hashMap);
    }

    /* renamed from: p */
    public static void m79534p(String str) {
        C26890h.m65011a("im_warning_close", C23089d.m56640a().mo47829a("warning_type", "未成年防诱骗").mo47829a("from_user_id", str).f61491a);
    }

    /* renamed from: q */
    public static void m79535q(String str) {
        C26890h.m65011a("im_warning_show", C23089d.m56640a().mo47829a("warning_type", "未成年防诱骗").mo47829a("from_user_id", str).f61491a);
    }

    /* renamed from: a */
    public static void m79443a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contact_num", i);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("share_chat").setLabelName("confirm").setJsonObject(jSONObject));
    }

    /* renamed from: c */
    public static void m79490c(String str) {
        C26890h.onEvent(MobClick.obtain().setEventName("unblock").setLabelName("chat").setValue(str));
    }

    /* renamed from: b */
    public static void m79482b(String str) {
        C26890h.onEvent(MobClick.obtain().setEventName("delete").setLabelName("message").setValue(String.valueOf(C11190e.m22685a(str))));
    }

    /* renamed from: a */
    public static void m79458a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("fans_cnt", String.valueOf(i));
        C26890h.m65011a("invite_fans_to_group", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m79478b(int i, String str) {
        C0777a aVar = new C0777a();
        aVar.put("enter_from", "message");
        aVar.put("banner_id", String.valueOf(i));
        C26890h.m65011a(str, (Map<String, String>) aVar);
    }

    /* renamed from: e */
    public static void m79503e(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("kicked_user", str2);
        hashMap.put("conversation_id", str);
        C26890h.m65011a("kick_group", (Map<String, String>) hashMap);
    }

    /* renamed from: g */
    public static void m79514g(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", str2);
        C26890h.m65011a("exit_chat", (Map<String, String>) hashMap);
    }

    /* renamed from: h */
    public static void m79519h(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("toast_type", str2);
        C26890h.m65011a("group_inflow_toast_show", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    private void m79479b(SharePackage sharePackage, IMContact iMContact) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "prop_page");
        hashMap.put("group_id", sharePackage.f106900i.getString("group_id"));
        hashMap.put("author_id", sharePackage.f106900i.getString("user_id"));
        hashMap.put("prop_id", sharePackage.f106900i.getString("sticker_id"));
        hashMap.put("log_pb", sharePackage.f106900i.getString("log_pb"));
        hashMap.put("platform", "chat");
        String str = "";
        if (iMContact instanceof IMUser) {
            str = "private";
        } else if (iMContact instanceof IMConversation) {
            str = "group";
        }
        hashMap.put("chat_type", str);
        m79475a((Map<String, String>) hashMap, iMContact);
        C26890h.m65011a("share_prop", (Map<String, String>) hashMap);
    }

    /* renamed from: d */
    public static void m79497d(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str2);
        hashMap.put("conversation_id", str);
        C26890h.m65011a("chat_report_click", (Map<String, String>) hashMap);
    }

    /* renamed from: f */
    public static void m79509f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("update_cnt", m79500e(str));
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName("chat_cell_show").setLabelName(str2).setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public static void m79444a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str);
            switch (i) {
                case 1:
                    hashMap.put("enter_from", "message");
                    m79474a((Map<String, String>) hashMap);
                    break;
                case 2:
                    hashMap.put("enter_from", "others_homepage");
                    break;
                case 3:
                    hashMap.put("enter_from", "others_homepage");
                    break;
                case 4:
                    hashMap.put("enter_from", "contact");
                    break;
                case 5:
                    hashMap.put("enter_from", "chat");
                    break;
                case 6:
                    hashMap.put("enter_from", "message");
                    break;
                case 7:
                    hashMap.put("enter_from", "chat");
                    break;
                case 8:
                    hashMap.put("enter_from", "share_board");
                    break;
                case 9:
                    hashMap.put("enter_from", "share_board");
                    break;
                case 10:
                    hashMap.put("enter_from", "homepage_story");
                    break;
                case 12:
                    hashMap.put("enter_from", "chat");
                    break;
                default:
                    return;
            }
            C26890h.m65011a("duoshan_download_notice", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: c */
    public static void m79491c(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("add_cnt", str2);
        hashMap.put("conversation_id", str);
        C26890h.m65011a("group_add_complete_click", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79448a(C11207p pVar, String str) {
        String str2;
        String str3;
        if (pVar != null) {
            if (pVar.getConversationType() == C11170a.f30116b) {
                str2 = "group";
            } else {
                str2 = "private";
            }
            String i = C35197am.m79571i(pVar);
            long a = C11190e.m22685a(pVar.getConversationId());
            boolean z = false;
            if (pVar.getLocalExt() != null && pVar.getLocalExt().containsKey("key_resend")) {
                z = true;
            }
            HashMap hashMap = new HashMap();
            if (a > 0) {
                hashMap.put("to_user_id", String.valueOf(a));
                String a2 = ImServiceProvider.INSTANCE.getFamiliarService().mo72369a(String.valueOf(a));
                if (a2 != null) {
                    hashMap.put("rec_type", a2);
                }
            }
            if (!TextUtils.isEmpty(i)) {
                hashMap.put(CustomActionPushReceiver.f104056a, i);
            }
            hashMap.put("conversation_id", pVar.getConversationId());
            hashMap.put("chat_type", str2);
            String str4 = "is_resend";
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put(str4, str3);
            hashMap.put("enter_from", "message");
            hashMap.put("enter_method", str);
            String str5 = f90475b;
            if (TextUtils.isEmpty(str5) && pVar.getLocalExt() != null) {
                str5 = (String) pVar.getLocalExt().get("process_id");
            }
            hashMap.put("process_id", str5);
            C26890h.m65011a("send_message", (Map<String, String>) hashMap);
        }
    }

    /* renamed from: b */
    public static void m79483b(String str, int i) {
        if (i > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_cnt", String.valueOf(i));
            C26890h.m65011a(str, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: c */
    private void m79489c(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("music_id", sharePackage.f106900i.getString("music_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        hashMap.put("process_id", sharePackage.f106900i.getString("process_id", ""));
        C26890h.m65011a("share_music", (Map<String, String>) hashMap);
    }

    /* renamed from: d */
    private void m79495d(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("tag_id", sharePackage.f106900i.getString("challenge_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        hashMap.put("process_id", sharePackage.f106900i.getString("process_id", ""));
        C26890h.m65011a("share_tag", (Map<String, String>) hashMap);
    }

    /* renamed from: f */
    private void m79507f(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("user_id", sharePackage.f106896e);
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("share_profile", (Map<String, String>) hashMap);
    }

    /* renamed from: i */
    public static void m79524i(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        String str4 = "conversation_id";
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put(str4, str2);
        hashMap.put("enter_method", str3);
        C26890h.m65011a(str, (Map<String, String>) hashMap);
    }

    /* renamed from: j */
    public static void m79528j(String str, String str2, String str3) {
        C26890h.m65011a("client_show", C23089d.m56640a().mo47829a("enter_from", "chat").mo47829a("author_id", str).mo47829a("group_id", str2).mo47829a(C42311c.f106865i, "video").mo47829a("display", "card").mo47829a("is_auto_play", str3).f61491a);
    }

    /* renamed from: a */
    public static void m79446a(long j, long j2, int i) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "inner_push");
        hashMap.put("enter_method", "inner_push");
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("room_id", String.valueOf(j2));
        String str2 = "anchor_type";
        if (i == 0) {
            str = "old";
        } else {
            str = "new";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("livesdk_live_abandon", (Map<String, String>) hashMap);
    }

    /* renamed from: e */
    private void m79502e(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        int i = sharePackage.f106900i.getInt("aweme_type");
        if (i == 1801) {
            hashMap.put("hot_search_type", "general");
        } else if (i == 1802) {
            hashMap.put("hot_search_type", "video");
        } else if (i == 1803) {
            hashMap.put("hot_search_type", "music");
        }
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("share_tag", (Map<String, String>) hashMap);
    }

    /* renamed from: g */
    private void m79512g(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", C23060d.f61427a);
        hashMap.put("url", sharePackage.f106899h);
        hashMap.put("group_id", sharePackage.f106900i.getString("group_id"));
        hashMap.put("webview_type", sharePackage.f106900i.getString("webview_type"));
        hashMap.put("previous_page", sharePackage.f106900i.getString("previous_type"));
        m79475a((Map<String, String>) hashMap, iMContact);
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("share_webview", (Map<String, String>) hashMap);
    }

    /* renamed from: h */
    private void m79517h(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("anchor_id", sharePackage.f106900i.getString("live_id"));
        hashMap.put("room_id", sharePackage.f106896e);
        hashMap.put("request_id", sharePackage.f106900i.getString("request_id"));
        hashMap.put("user_type", sharePackage.f106900i.getString("user_type"));
        hashMap.put("previous_page", sharePackage.f106900i.getString("previous_type"));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("share_live", (Map<String, String>) hashMap);
    }

    /* renamed from: i */
    private void m79522i(SharePackage sharePackage, IMContact iMContact, boolean z) {
        if ("good".equals(sharePackage.f106895d)) {
            HashMap hashMap = new HashMap();
            m79475a((Map<String, String>) hashMap, iMContact);
            hashMap.put("author_id", sharePackage.f106900i.getString("user_id"));
            hashMap.put("commodity_id", sharePackage.f106900i.getString("commodity_id"));
            hashMap.put("commodity_type", sharePackage.f106900i.getString("commodity_type"));
            C26890h.m65011a("share_product", (Map<String, String>) hashMap);
            return;
        }
        if ("good_window".equals(sharePackage.f106895d)) {
            HashMap hashMap2 = new HashMap();
            m79475a((Map<String, String>) hashMap2, iMContact);
            hashMap2.put("author_id", sharePackage.f106900i.getString("user_id"));
            C26890h.m65011a("share_store", (Map<String, String>) hashMap2);
        }
    }

    /* renamed from: j */
    private void m79526j(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("poi_id", sharePackage.f106900i.getString("poi_id"));
        hashMap.put("from_user_id", C35265e.m79730b().toString());
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("coupon_id", sharePackage.f106900i.getString("coupon_id"));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        C26890h.m65011a("share_coupon", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    private void m79480b(SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        m79475a((Map<String, String>) hashMap, iMContact);
        hashMap.put("poi_id", sharePackage.f106900i.getString("poi_id", ""));
        String str2 = "platform";
        if (z) {
            str = "chat_merge";
        } else {
            str = "chat";
        }
        hashMap.put(str2, str);
        if (!TextUtils.isEmpty(sharePackage.f106900i.getString("enter_from"))) {
            hashMap.put("enter_from", sharePackage.f106900i.getString("enter_from", ""));
        }
        C26890h.m65011a("share_poi", (Map<String, String>) hashMap);
    }

    /* renamed from: d */
    public static void m79498d(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str2);
        hashMap.put("chat_type", str3);
        C26890h.m65011a("chat_setting_click", (Map<String, String>) hashMap);
    }

    /* renamed from: e */
    public static void m79504e(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("author_id", str);
        hashMap.put("message_id", str2);
        hashMap.put(CustomActionPushReceiver.f104056a, str3);
        C26890h.m65011a("click_in_message", (Map<String, String>) hashMap);
    }

    /* renamed from: f */
    public static void m79510f(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("chat_type", "group");
        hashMap.put("master_id", C35265e.m79730b().toString());
        hashMap.put("status", str2);
        hashMap.put("enter_method", str3);
        C26890h.m65011a("create_group", (Map<String, String>) hashMap);
    }

    /* renamed from: g */
    public static void m79515g(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        hashMap.put("action_type", str2);
        hashMap.put("enter_from", str3);
        C26890h.m65011a("inner_push", (Map<String, String>) hashMap);
    }

    /* renamed from: h */
    public static void m79520h(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("chat_type", str);
        hashMap.put("action_type", str2);
        hashMap.put("alert_method", str3);
        C26890h.m65011a("inner_push_button", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m79445a(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str);
            switch (i) {
                case 1:
                    hashMap.put("enter_from", "message");
                    m79474a((Map<String, String>) hashMap);
                    break;
                case 2:
                    hashMap.put("enter_from", "others_homepage");
                    hashMap.put("message_style", "click_message");
                    break;
                case 3:
                    hashMap.put("enter_from", "others_homepage");
                    hashMap.put("message_style", "click_stranger_chat_button");
                    break;
                case 4:
                    hashMap.put("enter_from", "contact");
                    hashMap.put("message_style", "click_contact");
                    break;
                case 5:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_sync");
                    break;
                case 6:
                    hashMap.put("enter_from", "message");
                    hashMap.put("message_style", "group_chat");
                    break;
                case 7:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_unable");
                    break;
                case 8:
                    hashMap.put("enter_from", "share_board");
                    break;
                case 9:
                    hashMap.put("enter_from", "share_board");
                    break;
                case 10:
                    hashMap.put("enter_from", "homepage_story");
                    hashMap.put("message_style", "duoshan_story");
                    break;
                case 12:
                    hashMap.put("enter_from", "chat");
                    hashMap.put("message_style", "duoshan_red_envelope");
                    break;
                default:
                    return;
            }
            if (f90476c.contains(str2)) {
                hashMap.remove("message_style");
                hashMap.remove("enter_method");
            }
            C26890h.m65011a(str2, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: c */
    public static void m79492c(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", C9395d.m18571a(str));
        hashMap.put("emoji_id", str3);
        C26890h.m65011a("greeting_emoji", (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    private void m79455a(SharePackage sharePackage, IMContact iMContact, boolean z, boolean z2) {
        mo73321a(sharePackage, iMContact, z, false, "");
    }

    /* renamed from: d */
    public static void m79499d(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        String str5 = "conversation_id";
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put(str5, str2);
        hashMap.put("enter_method", str3);
        hashMap.put("status", str4);
        C26890h.m65011a(str, (Map<String, String>) hashMap);
    }

    /* renamed from: e */
    public static void m79505e(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("to_user_id", str4);
        hashMap.put("enter_from", str2);
        hashMap.put("enter_method", str3);
        C26890h.m65011a("follow", (Map<String, String>) hashMap);
    }

    /* renamed from: c */
    public static void m79493c(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", str);
        hashMap.put("from_user_id", str2);
        hashMap.put("to_user_id", str3);
        hashMap.put("status", str4);
        C26890h.m65011a("group_chat_show_invite", (Map<String, String>) hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c1 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02e6 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0329 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0338 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0343 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0346 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0156 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016d A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0195 A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019d A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01fc A[Catch:{ JSONException -> 0x0367 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0254 A[Catch:{ JSONException -> 0x0367 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m79481b(com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r5, com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact r6, boolean r7, boolean r8, java.lang.String r9) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x036c
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.m79333a(r5)
            if (r0 == 0) goto L_0x036c
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            android.os.Bundle r5 = r5.f106900i
            java.lang.String r1 = "chat_list"
            com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77718b()     // Catch:{ JSONException -> 0x00a7 }
            boolean r2 = r2.isMtCase()     // Catch:{ JSONException -> 0x00a7 }
            if (r2 == 0) goto L_0x002a
            int r2 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.m80104a()     // Catch:{ JSONException -> 0x00a7 }
            r3 = 5
            if (r2 == r3) goto L_0x0028
            int r2 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.m80104a()     // Catch:{ JSONException -> 0x00a7 }
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r1 = "chat_head"
        L_0x002a:
            java.lang.String r2 = "platform"
            if (r8 == 0) goto L_0x0031
            java.lang.String r9 = "duoshan"
            goto L_0x003e
        L_0x0031:
            if (r7 == 0) goto L_0x0036
            java.lang.String r9 = "chat_merge"
            goto L_0x003e
        L_0x0036:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x00a7 }
            if (r7 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r9 = r1
        L_0x003e:
            r0.put(r2, r9)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r7 = "group_id"
            java.lang.String r8 = "item_id_string"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x00a7 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00a7 }
            if (r6 != 0) goto L_0x005d
            java.lang.String r7 = "to_user_id"
            java.lang.String r8 = "null"
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r7 = "conversation_id"
            java.lang.String r8 = "null"
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00a7 }
            goto L_0x00a7
        L_0x005d:
            boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser     // Catch:{ JSONException -> 0x00a7 }
            if (r7 == 0) goto L_0x0090
            r7 = r6
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r7     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r8 = r7.getUid()     // Catch:{ JSONException -> 0x00a7 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r9 = "to_user_id"
            java.lang.String r1 = r7.getUid()     // Catch:{ JSONException -> 0x00a7 }
            r0.put(r9, r1)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r9 = "rec_type"
            java.lang.String r7 = r7.getRecType()     // Catch:{ JSONException -> 0x00a7 }
            r0.put(r9, r7)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r7 = "conversation_id"
            long r8 = r8.longValue()     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r8 = com.bytedance.p702im.core.p706c.C11190e.m22687a(r8)     // Catch:{ JSONException -> 0x00a7 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00a7 }
            goto L_0x00a7
        L_0x0090:
            boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation     // Catch:{ JSONException -> 0x00a7 }
            if (r7 == 0) goto L_0x00a7
            r7 = r6
            com.ss.android.ugc.aweme.im.service.model.IMConversation r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r7     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r8 = "conversation_id"
            java.lang.String r7 = r7.getConversationId()     // Catch:{ JSONException -> 0x00a7 }
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x00a7 }
            java.lang.String r7 = "to_user_id"
            java.lang.String r8 = "null"
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x00a7 }
        L_0x00a7:
            java.lang.String r7 = "enter_from"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "enter_from"
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "previous_page"
            java.lang.String r9 = "previous_page"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "author_id"
            java.lang.String r9 = "author_id"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "poi_id"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x00ea
            java.lang.String r8 = "poi_id"
            java.lang.String r9 = "poi_id"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "poi_type"
            java.lang.String r9 = "poi_type"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
        L_0x00ea:
            java.lang.String r8 = "city_info"
            java.lang.String r9 = "city_info"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "distance_info"
            java.lang.String r9 = "distance_info"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r9)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "content_type"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r9 = "content_type"
            r0.put(r9, r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "homepage_hot"
            boolean r8 = r8.equals(r7)     // Catch:{ JSONException -> 0x0367 }
            r9 = 1
            if (r8 != 0) goto L_0x012f
            java.lang.String r8 = "homepage_follow"
            boolean r8 = r8.equals(r7)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x012f
            java.lang.String r8 = "homepage_fresh"
            boolean r8 = r8.equals(r7)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x012f
            java.lang.String r8 = "hot_search_video_board"
            boolean r8 = r8.equals(r7)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r8 = 0
            goto L_0x0130
        L_0x012f:
            r8 = 1
        L_0x0130:
            if (r8 == 0) goto L_0x014e
            java.lang.String r8 = "log_pb"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x014e
            java.lang.String r8 = "log_pb"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "log_pb"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ JSONException -> 0x0367 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x014e:
            java.lang.String r8 = "play_mode"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x015b
            java.lang.String r1 = "play_mode"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0367 }
        L_0x015b:
            java.lang.String r8 = "enter_method"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r1 = "play_list_type"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0367 }
            if (r2 != 0) goto L_0x0172
            java.lang.String r2 = "playlist_type"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x0172:
            java.lang.String r1 = "play_list_id_key"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "play_list_id_value"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ JSONException -> 0x0367 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0367 }
            if (r3 != 0) goto L_0x018d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0367 }
            if (r3 != 0) goto L_0x018d
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0367 }
        L_0x018d:
            java.lang.String r1 = "more_button"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r1 == 0) goto L_0x019d
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "more_button"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x019d:
            java.lang.String r1 = "head"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r1 == 0) goto L_0x01ad
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "head"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x01ad:
            java.lang.String r1 = "download_window"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r1 == 0) goto L_0x01bd
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "download_window"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x01bd:
            java.lang.String r1 = "chat_forward"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r1 == 0) goto L_0x01cd
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "forward"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x01cd:
            java.lang.String r1 = "forward"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r1 == 0) goto L_0x01dd
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "forward"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x01dd:
            java.lang.String r1 = "icon"
            boolean r8 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x01ed
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "icon"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            goto L_0x01f4
        L_0x01ed:
            java.lang.String r8 = "enter_method"
            java.lang.String r1 = "icon"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x01f4:
            java.lang.String r8 = "is_long_item"
            int r8 = r5.getInt(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x0201
            java.lang.String r1 = "is_long_item"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0367 }
        L_0x0201:
            java.lang.String r8 = "from_group_id"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r1 = "from_user_id"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r2 != 0) goto L_0x0223
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0367 }
            if (r2 != 0) goto L_0x0223
            java.lang.String r2 = "from_group_id"
            r0.put(r2, r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "from_user_id"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x0223:
            java.lang.String r8 = "repost_from_group_id"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r1 = "repost_from_user_id"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r2 != 0) goto L_0x024c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0367 }
            if (r2 != 0) goto L_0x024c
            java.lang.String r2 = "is_reposted"
            java.lang.String r3 = "1"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "repost_from_group_id"
            r0.put(r2, r8)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "repost_from_user_id"
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x024c:
            java.lang.String r8 = "homepage_familiar"
            boolean r8 = r8.equals(r7)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x0288
            java.lang.String r8 = "relation_type"
            java.lang.String r1 = "relation_type"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "video_type"
            java.lang.String r1 = "video_type"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "rec_uid"
            java.lang.String r1 = "rec_uid"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r1 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "request_id"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r1 = r1.mo60161a(r2)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x0288:
            java.lang.String r8 = "homepage_channel"
            boolean r8 = android.text.TextUtils.equals(r7, r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x0298
            java.lang.String r8 = "homepage_fresh"
            boolean r8 = android.text.TextUtils.equals(r7, r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x02bb
        L_0x0298:
            com.ss.android.ugc.aweme.im.service.IIMService r8 = com.p683ss.android.ugc.aweme.p1807im.DefaultIMService.provideIMService_Monster()     // Catch:{ JSONException -> 0x0367 }
            com.ss.android.ugc.aweme.im.service.IIMService r8 = (com.p683ss.android.ugc.aweme.p1807im.service.IIMService) r8     // Catch:{ JSONException -> 0x0367 }
            com.ss.android.ugc.aweme.im.service.b r8 = r8.getAbInterface()     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = r8.mo70326g()     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x02bb
            com.ss.android.ugc.aweme.bl.b r8 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()     // Catch:{ JSONException -> 0x0367 }
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "tab_channels_save_data_last_i18n_name"
            java.lang.String r8 = r8.mo49460a(r1, r2)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r1 = "tab_name"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0367 }
        L_0x02bb:
            boolean r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x02cc
            java.lang.String r8 = "compilation_id"
            java.lang.String r1 = "compilation_id"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x02cc:
            java.lang.String r8 = "search_result"
            boolean r8 = android.text.TextUtils.equals(r7, r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x02dc
            java.lang.String r8 = "general_search"
            boolean r7 = android.text.TextUtils.equals(r7, r8)     // Catch:{ JSONException -> 0x0367 }
            if (r7 == 0) goto L_0x033d
        L_0x02dc:
            java.lang.String r7 = "is_fullscreen"
            java.lang.Object r7 = r5.get(r7)     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = r7 instanceof java.lang.Boolean     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x031f
            java.lang.String r8 = "request_id"
            java.lang.String r1 = "request_id"
            java.lang.Object r1 = r5.get(r1)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r8 = "log_pb"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x0367 }
            if (r8 != 0) goto L_0x030d
            java.lang.String r8 = "log_pb"
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0367 }
            java.lang.String r2 = "log_pb"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ JSONException -> 0x0367 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0367 }
            r0.put(r8, r1)     // Catch:{ JSONException -> 0x0367 }
        L_0x030d:
            java.lang.String r8 = "is_fullscreen"
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x0367 }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x0367 }
            if (r7 == 0) goto L_0x031a
            java.lang.String r7 = "1"
            goto L_0x031c
        L_0x031a:
            java.lang.String r7 = "0"
        L_0x031c:
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x0367 }
        L_0x031f:
            java.lang.String r7 = "video_tag"
            java.lang.Object r7 = r5.get(r7)     // Catch:{ JSONException -> 0x0367 }
            boolean r8 = r7 instanceof java.lang.String     // Catch:{ JSONException -> 0x0367 }
            if (r8 == 0) goto L_0x032e
            java.lang.String r8 = "video_tag"
            r0.put(r8, r7)     // Catch:{ JSONException -> 0x0367 }
        L_0x032e:
            java.lang.String r8 = "rank"
            java.lang.Object r5 = r5.get(r8)     // Catch:{ JSONException -> 0x0367 }
            boolean r7 = r7 instanceof java.lang.String     // Catch:{ JSONException -> 0x0367 }
            if (r7 == 0) goto L_0x033d
            java.lang.String r7 = "rank"
            r0.put(r7, r5)     // Catch:{ JSONException -> 0x0367 }
        L_0x033d:
            java.lang.String r5 = "chat_type"
            boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser     // Catch:{ JSONException -> 0x0367 }
            if (r7 == 0) goto L_0x0346
            java.lang.String r6 = "private"
            goto L_0x0364
        L_0x0346:
            boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation     // Catch:{ JSONException -> 0x0367 }
            if (r7 == 0) goto L_0x0362
            r7 = r6
            com.ss.android.ugc.aweme.im.service.model.IMConversation r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r7     // Catch:{ JSONException -> 0x0367 }
            int r7 = r7.getConversationType()     // Catch:{ JSONException -> 0x0367 }
            if (r7 != r9) goto L_0x0356
            java.lang.String r6 = "private"
            goto L_0x0364
        L_0x0356:
            com.ss.android.ugc.aweme.im.service.model.IMConversation r6 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r6     // Catch:{ JSONException -> 0x0367 }
            int r6 = r6.getConversationType()     // Catch:{ JSONException -> 0x0367 }
            r7 = 2
            if (r6 != r7) goto L_0x0362
            java.lang.String r6 = "group"
            goto L_0x0364
        L_0x0362:
            java.lang.String r6 = ""
        L_0x0364:
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0367 }
        L_0x0367:
            java.lang.String r5 = "share_video"
            com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r5, r0)
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79481b(com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.service.model.IMContact, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m79447a(long j, long j2, String str, int i, String str2, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "inner_push");
        hashMap.put("enter_method", "inner_push");
        hashMap.put("anchor_id", String.valueOf(j));
        hashMap.put("room_id", String.valueOf(j2));
        hashMap.put("request_page", str);
        String str5 = "anchor_type";
        if (i == 0) {
            str4 = "old";
        } else {
            str4 = "new";
        }
        hashMap.put(str5, str4);
        hashMap.put("action_type", "click");
        hashMap.put("request_id", str2);
        hashMap.put("log_pb", str3);
        C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
    }
}
