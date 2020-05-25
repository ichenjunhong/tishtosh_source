package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34551h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.XPlanAwemeBannerConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34980b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.t */
public final class C35284t {

    /* renamed from: c */
    private static C35284t f90618c;

    /* renamed from: d */
    private static volatile long f90619d;

    /* renamed from: a */
    public SharedPreferences f90620a;

    /* renamed from: b */
    public SharedPreferences f90621b = C35807d.m80935a(C11010c.m22280a(), "iuserstate", 0);

    /* renamed from: e */
    private SharedPreferences f90622e = C35807d.m80935a(C11010c.m22280a(), "imbase_bydid", 0);

    /* renamed from: a */
    public final void mo73399a(boolean z) {
        this.f90620a.edit().putBoolean("user_x_active", true).commit();
    }

    /* renamed from: B */
    public final String mo73376B() {
        return this.f90620a.getString("hotsoon_relation_notice", "");
    }

    /* renamed from: C */
    public final boolean mo73377C() {
        return this.f90620a.getBoolean("enable_active_by_privacy", false);
    }

    /* renamed from: F */
    public final long mo73380F() {
        long j = this.f90620a.getLong("last_relation_fetch_max_time", 0);
        if (j >= 0) {
            return j;
        }
        return 0;
    }

    /* renamed from: G */
    public final long mo73381G() {
        return this.f90620a.getLong("last_relation_full_fetch_time", 0);
    }

    /* renamed from: H */
    public final long mo73382H() {
        return this.f90620a.getLong("last_relation_cold_up_diff_fetch_time", 0);
    }

    /* renamed from: I */
    public final long mo73383I() {
        return this.f90620a.getLong("last_relation_ws_diff_fetch_time", 0);
    }

    /* renamed from: J */
    public final long mo73384J() {
        return this.f90620a.getLong("last_relation_font_diff_fetch_time", 0);
    }

    /* renamed from: K */
    public final long mo73385K() {
        return this.f90620a.getLong("last_relation_loader_diff_fetch_time", 0);
    }

    /* renamed from: N */
    public final int mo73388N() {
        return this.f90620a.getInt("key_group_create_cell_click_count", 0);
    }

    /* renamed from: P */
    public final long mo73390P() {
        return this.f90620a.getLong("key_group_create_cell_last_time", 0);
    }

    /* renamed from: Q */
    public final long mo73391Q() {
        return this.f90620a.getLong("last_friends_relation_fetch_time", 0);
    }

    /* renamed from: b */
    public final int mo73400b() {
        return this.f90620a.getInt("last_msghelper_unread_count", 0);
    }

    /* renamed from: d */
    public final int mo73410d() {
        return this.f90620a.getInt("last_xcard_unread_dot", 0);
    }

    /* renamed from: g */
    public final long mo73421g() {
        return this.f90620a.getLong("flip_chat_last_msg_time", 0);
    }

    /* renamed from: h */
    public final long mo73424h() {
        return this.f90620a.getLong("flip_chat_last_unread_msg_time", 0);
    }

    /* renamed from: i */
    public final long mo73427i() {
        return this.f90620a.getLong("flip_chat_last_unread_dot_msg_time", 0);
    }

    /* renamed from: j */
    public final long mo73430j() {
        return this.f90621b.getLong("userid", -1);
    }

    /* renamed from: k */
    public final String mo73432k() {
        return this.f90621b.getString("token", "");
    }

    /* renamed from: n */
    public final void mo73438n() {
        this.f90620a.edit().remove("banner_config").commit();
    }

    /* renamed from: p */
    public final int mo73440p() {
        return this.f90620a.getInt("create_group_guide_v2_version", -1);
    }

    /* renamed from: q */
    public final int mo73441q() {
        return this.f90620a.getInt("create_group_guide_v2_show_times", 0);
    }

    /* renamed from: r */
    public final long mo73442r() {
        return this.f90620a.getLong("create_group_guide_v2_last_show_time", 0);
    }

    /* renamed from: u */
    public final int mo73445u() {
        return this.f90620a.getInt("notification_tips_show_times", 0);
    }

    /* renamed from: v */
    public final Set<String> mo73446v() {
        return this.f90620a.getStringSet("notification_shown_conversation", new HashSet());
    }

    /* renamed from: w */
    public final boolean mo73447w() {
        return this.f90620a.getBoolean("enable_associative_emoji", true);
    }

    /* renamed from: x */
    public final int mo73448x() {
        return this.f90620a.getInt("associative_emoji_avoid_times", 0);
    }

    /* renamed from: y */
    public final boolean mo73449y() {
        return this.f90620a.getBoolean("has_show_new_member_can_see_old_msg_tips", false);
    }

    /* renamed from: z */
    public final boolean mo73450z() {
        if (!this.f90620a.getBoolean("invite_fans_enter_group_tip", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private HashMap<String, List<String>> m79781R() {
        try {
            HashMap<String, List<String>> hashMap = (HashMap) C35277o.m79760a(this.f90620a.getString("key_group_follow_guide_shown_uids", ""), HashMap.class);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }

    /* renamed from: A */
    public final void mo73375A() {
        this.f90620a.edit().putBoolean("invite_fans_enter_group_tip", true).commit();
    }

    /* renamed from: E */
    public final boolean mo73379E() {
        boolean z = this.f90620a.getBoolean("chat_call_guide_bubble_show", false);
        if (!z) {
            this.f90620a.edit().putBoolean("chat_call_guide_bubble_show", true).commit();
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final LinkedHashMap<String, Integer> mo73387M() {
        try {
            return (LinkedHashMap) C35277o.m79759a().mo34885a(this.f90620a.getString("shareVideoFriendsIds", ""), new C17956a<LinkedHashMap<String, Integer>>() {
            }.f49843c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: O */
    public final void mo73389O() {
        this.f90620a.edit().putInt("key_group_create_cell_click_count", mo73388N() + 1).commit();
    }

    /* renamed from: c */
    public final C35262bt mo73405c() {
        String string = this.f90620a.getString("key_x_pre_download_task_info", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (C35262bt) C35277o.m79760a(string, C35262bt.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo73420f() {
        return this.f90620a.getBoolean("flip_chat_deleted_state", false);
    }

    /* renamed from: l */
    public final C34551h mo73434l() {
        String string = this.f90620a.getString("banner_config_v2", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (C34551h) C35277o.m79760a(string, C34551h.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final XPlanAwemeBannerConfig mo73436m() {
        String string = this.f90620a.getString("banner_config", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (XPlanAwemeBannerConfig) C35277o.m79760a(string, XPlanAwemeBannerConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    public final boolean mo73439o() {
        if (System.currentTimeMillis() - this.f90620a.getLong("token_fetch_time", 0) > 14400000) {
            return true;
        }
        return false;
    }

    private C35284t() {
        f90619d = C35265e.m79733d();
        Context a = C11010c.m22280a();
        StringBuilder sb = new StringBuilder("imbase_");
        sb.append(f90619d);
        this.f90620a = C35807d.m80935a(a, sb.toString(), 0);
    }

    /* renamed from: a */
    public static synchronized C35284t m79782a() {
        C35284t tVar;
        synchronized (C35284t.class) {
            long d = C35265e.m79733d();
            if (f90618c == null || d != f90619d) {
                synchronized (C35284t.class) {
                    if (f90618c == null || d != f90619d) {
                        f90618c = new C35284t();
                    }
                }
            }
            tVar = f90618c;
        }
        return tVar;
    }

    /* renamed from: D */
    public final boolean mo73378D() {
        if (!C34886b.m78989c()) {
            return false;
        }
        int i = this.f90620a.getInt("share_panel_times_with_active", 0);
        if (i >= 5) {
            return false;
        }
        this.f90620a.edit().putInt("share_panel_times_with_active", i + 1).commit();
        return true;
    }

    /* renamed from: L */
    public final List<C34980b> mo73386L() {
        ArrayList arrayList = new ArrayList();
        try {
            Set<String> stringSet = this.f90620a.getStringSet("last_relation_fetch_missing_page_list", new HashSet());
            if (!C9376b.m18558a((Collection<T>) stringSet)) {
                for (String a : stringSet) {
                    arrayList.add(C35277o.m79760a(a, C34980b.class));
                }
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean mo73416e() {
        return this.f90620a.getBoolean("user_x_active", false);
    }

    /* renamed from: s */
    public final boolean mo73443s() {
        if (this.f90620a.getInt("show_privacy_hint_count", 0) >= 2) {
            return false;
        }
        if (System.currentTimeMillis() - this.f90620a.getLong("show_privacy_hint_time", 0) > 432000000) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final List<C29366a> mo73444t() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String a : this.f90620a.getStringSet("group_greet_msg", new HashSet())) {
                arrayList.add(C35277o.m79760a(a, C29366a.class));
            }
            return arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo73392a(int i) {
        this.f90620a.edit().putInt("last_msghelper_unread_count", i).commit();
    }

    /* renamed from: c */
    public final void mo73406c(long j) {
        this.f90620a.edit().putLong("flip_chat_last_unread_dot_msg_time", j).commit();
    }

    /* renamed from: e */
    public final void mo73414e(long j) {
        this.f90620a.edit().putLong("last_relation_full_fetch_time", j).commit();
    }

    /* renamed from: f */
    public final void mo73419f(long j) {
        this.f90620a.edit().putLong("last_relation_cold_up_diff_fetch_time", j).commit();
    }

    /* renamed from: l */
    public final void mo73435l(long j) {
        this.f90620a.edit().putLong("key_remove_recommend_time", j).commit();
    }

    /* renamed from: m */
    public final void mo73437m(long j) {
        this.f90620a.edit().putLong("last_friends_relation_fetch_time", j).commit();
    }

    /* renamed from: a */
    public final void mo73393a(long j) {
        this.f90620a.edit().putLong("flip_chat_last_msg_time", j).commit();
    }

    /* renamed from: b */
    public final void mo73402b(long j) {
        this.f90620a.edit().putLong("flip_chat_last_unread_msg_time", j).commit();
    }

    /* renamed from: d */
    public final void mo73412d(long j) {
        this.f90620a.edit().putLong("last_relation_fetch_max_time", j).commit();
    }

    /* renamed from: e */
    public final void mo73415e(boolean z) {
        this.f90620a.edit().putBoolean("notice_under_16_deleted_state", true).commit();
    }

    /* renamed from: g */
    public final void mo73422g(int i) {
        this.f90620a.edit().putInt("notification_tips_show_times", i).commit();
    }

    /* renamed from: h */
    public final void mo73425h(int i) {
        this.f90620a.edit().putInt("associative_emoji_avoid_times", i).commit();
    }

    /* renamed from: i */
    public final void mo73428i(int i) {
        this.f90620a.edit().putInt("key_group_create_cell_status", i).commit();
    }

    /* renamed from: j */
    public final void mo73431j(long j) {
        this.f90620a.edit().putLong("key_group_create_cell_last_time", j).commit();
    }

    /* renamed from: k */
    public final void mo73433k(long j) {
        this.f90620a.edit().putLong("key_group_follow_guide_last_time", j).commit();
    }

    /* renamed from: b */
    public final void mo73401b(int i) {
        switch (i) {
            case 1:
                this.f90620a.edit().putBoolean("sync_alert_del_msg", true).commit();
                return;
            case 2:
                this.f90620a.edit().putBoolean("sync_alert_unfollow", true).commit();
                return;
            case 3:
                this.f90620a.edit().putBoolean("sync_alert_block", true).commit();
                break;
        }
    }

    /* renamed from: c */
    public final void mo73407c(boolean z) {
        this.f90620a.edit().putBoolean("has_show_new_member_can_see_old_msg_tips", true).commit();
    }

    /* renamed from: d */
    public final void mo73413d(boolean z) {
        this.f90620a.edit().putBoolean("enable_active_by_privacy", z).commit();
    }

    /* renamed from: f */
    public final void mo73418f(int i) {
        this.f90620a.edit().putInt("create_group_guide_v2_version", i).commit();
        this.f90620a.edit().putInt("create_group_guide_v2_show_times", 0).commit();
        this.f90620a.edit().putLong("create_group_guide_v2_last_show_time", 0).commit();
    }

    /* renamed from: g */
    public final void mo73423g(long j) {
        this.f90620a.edit().putLong("last_relation_ws_diff_fetch_time", j).commit();
    }

    /* renamed from: h */
    public final void mo73426h(long j) {
        this.f90620a.edit().putLong("last_relation_font_diff_fetch_time", j).commit();
    }

    /* renamed from: i */
    public final void mo73429i(long j) {
        this.f90620a.edit().putLong("last_relation_loader_diff_fetch_time", j).commit();
    }

    /* renamed from: a */
    public final void mo73394a(C35262bt btVar) {
        if (btVar == null) {
            try {
                this.f90620a.edit().remove("key_x_pre_download_task_info");
            } catch (Exception unused) {
            }
            return;
        }
        this.f90620a.edit().putString("key_x_pre_download_task_info", C35277o.m79761a(btVar)).commit();
    }

    /* renamed from: b */
    public final void mo73403b(String str) {
        Editor edit = this.f90620a.edit();
        String str2 = "hotsoon_relation_notice";
        if (str == null) {
            str = "";
        }
        edit.putString(str2, str).commit();
    }

    /* renamed from: c */
    public final boolean mo73408c(int i) {
        switch (i) {
            case 1:
                if (!this.f90620a.getBoolean("sync_alert_del_msg", false)) {
                    return true;
                }
                return false;
            case 2:
                if (!this.f90620a.getBoolean("sync_alert_unfollow", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f90620a.getBoolean("sync_alert_block", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public final void mo73411d(int i) {
        switch (i) {
            case 2:
                this.f90620a.edit().putBoolean("goto_x_1st_from_profile", true).commit();
                break;
            case 3:
                this.f90620a.edit().putBoolean("goto_x_1st_from_profile_more", true).commit();
                break;
            case 4:
                this.f90620a.edit().putBoolean("goto_x_1st_from_contacts", true).commit();
                break;
        }
        this.f90622e.edit().putLong("goto_x_1st_alert_time", System.currentTimeMillis()).commit();
    }

    /* renamed from: e */
    public final boolean mo73417e(int i) {
        if (System.currentTimeMillis() - this.f90622e.getLong("goto_x_1st_alert_time", 0) <= FbUploadTokenTime.group0) {
            return false;
        }
        switch (i) {
            case 2:
                if (!this.f90620a.getBoolean("goto_x_1st_from_profile", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f90620a.getBoolean("goto_x_1st_from_profile_more", false)) {
                    return true;
                }
                return false;
            case 4:
                if (!this.f90620a.getBoolean("goto_x_1st_from_contacts", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void mo73395a(String str) {
        this.f90621b.edit().putString("token", str).commit();
        if (!TextUtils.isEmpty(str)) {
            this.f90620a.edit().putLong("token_fetch_time", System.currentTimeMillis()).commit();
        }
    }

    /* renamed from: b */
    public final void mo73404b(boolean z) {
        this.f90620a.edit().putBoolean("flip_chat_deleted_state", z).commit();
    }

    /* renamed from: c */
    public final boolean mo73409c(String str) {
        if (!C34886b.m78989c()) {
            return false;
        }
        String string = this.f90620a.getString("chat_show_user_active_tips_times", "");
        if (string == null) {
            string = "";
        }
        List asList = Arrays.asList(string.split(","));
        if (asList.size() >= 3 || asList.contains(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(string)) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(",");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(str);
        this.f90620a.edit().putString("chat_show_user_active_tips_times", sb2.toString()).commit();
        return true;
    }

    /* renamed from: a */
    public final void mo73397a(List<C34980b> list) {
        HashSet hashSet = new HashSet();
        try {
            if (!C9376b.m18558a((Collection<T>) list)) {
                for (C34980b a : list) {
                    hashSet.add(C35277o.m79761a(a));
                }
            }
            this.f90620a.edit().putStringSet("last_relation_fetch_missing_page_list", hashSet).commit();
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }

    /* renamed from: a */
    public final void mo73398a(Set<String> set) {
        this.f90620a.edit().putStringSet("notification_shown_conversation", set).commit();
    }

    /* renamed from: a */
    public final void mo73396a(String str, List<String> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    HashMap R = m79781R();
                    ArrayList arrayList = new ArrayList();
                    if (R.containsKey(str) && R.get(str) != null) {
                        arrayList.addAll((Collection) R.get(str));
                    }
                    arrayList.addAll(list);
                    R.put(str, arrayList);
                    this.f90620a.edit().putString("key_group_follow_guide_shown_uids", C35277o.m79761a(R)).commit();
                }
            } catch (Exception unused) {
            }
        }
    }
}
