package com.bytedance.jirafast.p751d;

import android.content.SharedPreferences;
import com.bytedance.jirafast.C11991a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.bytedance.jirafast.d.a */
public class C12015a {

    /* renamed from: a */
    public static String f31760a = "jira_shared_preferences";

    /* renamed from: b */
    public static String f31761b = "JIRA_DEFAULT_COMPONENT";

    /* renamed from: c */
    public static String f31762c = "JIRA_DEFAULT_EPIC";

    /* renamed from: d */
    public static String f31763d = "JIRA_DEFAULT_VERSION";

    /* renamed from: e */
    public static String f31764e = "JIRA_DEFAULT_FIX_VERSION";

    /* renamed from: f */
    public static String f31765f = "jira_default_assignee";

    /* renamed from: g */
    public static String f31766g = "jira_default_reporter";

    /* renamed from: h */
    public static String f31767h = "jira_default_project";

    /* renamed from: i */
    public static String f31768i = "jira_rest_api2_url";

    /* renamed from: j */
    public static String f31769j = "jira_projects";

    /* renamed from: k */
    public static String f31770k = "jira_auth_username";

    /* renamed from: l */
    public static String f31771l = "jira_auth_password";

    /* renamed from: m */
    public static String f31772m = "jira_title";

    /* renamed from: n */
    public static String f31773n = "jira_des";

    /* renamed from: o */
    public static String f31774o = "jira_aid";

    /* renamed from: p */
    public static String f31775p = "jira_disbale_shot_observer";

    /* renamed from: q */
    public static String f31776q = "jira_reporter";

    /* renamed from: r */
    public static String f31777r = "jira_default_qa_page";

    /* renamed from: s */
    public static String f31778s = "jira_appname";

    /* renamed from: t */
    public static String f31779t = "jira_version";

    /* renamed from: u */
    public static String f31780u = "jira_channel";

    /* renamed from: v */
    public static String f31781v = "jira_email";

    /* renamed from: w */
    public static String f31782w = "jira_is_i18n";

    /* renamed from: x */
    public static String f31783x = "jira_url_host";

    /* renamed from: z */
    private static C12015a f31784z;

    /* renamed from: y */
    public SharedPreferences f31785y = C35807d.m80935a(C11991a.m24390a(), f31760a, 0);

    private C12015a() {
    }

    /* renamed from: a */
    public static C12015a m24416a() {
        if (f31784z == null) {
            synchronized (C12015a.class) {
                if (f31784z == null) {
                    f31784z = new C12015a();
                }
            }
        }
        return f31784z;
    }

    /* renamed from: c */
    public final boolean mo22758c(String str) {
        return this.f31785y.getBoolean(str, false);
    }

    /* renamed from: a */
    public final String mo22755a(String str) {
        return this.f31785y.getString(str, "");
    }

    /* renamed from: b */
    public static <T extends Serializable> List<T> m24418b(String str) {
        StringBuilder sb = new StringBuilder("jiracaceh_obj_");
        sb.append(str);
        return C12025f.m24441b(sb.toString());
    }

    /* renamed from: a */
    public static <T extends Serializable> void m24417a(String str, List<T> list) {
        StringBuilder sb = new StringBuilder("jiracaceh_obj_");
        sb.append(str);
        C12025f.m24440a(sb.toString(), list);
    }

    /* renamed from: a */
    public final void mo22756a(String str, String str2) {
        this.f31785y.edit().putString(str, str2).commit();
    }

    /* renamed from: a */
    public final void mo22757a(String str, boolean z) {
        this.f31785y.edit().putBoolean(str, z).commit();
    }
}
