package com.p683ss.android.ugc.awemepushlib.p2406a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.a.a */
public final class C48427a {
    /* renamed from: a */
    private static String m104781a() {
        StringBuilder sb = new StringBuilder(C23057c.f61424b);
        sb.append(C11010c.m22289j());
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m104783a(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        if (C23057c.f61423a.equals(str)) {
            return true;
        }
        String a = m104781a();
        if (C9431p.m18664a(a) || !a.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m104784b(String str) {
        if (C9431p.m18664a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m104781a();
            if (C23057c.f61423a.equals(scheme) || C23057c.f61425c.equals(scheme)) {
                str = str.replace(scheme, a);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public static Intent m104780a(Context context, C48428b bVar) {
        Intent intent;
        if (!C9431p.m18664a(bVar.openUrl)) {
            Uri parse = Uri.parse(bVar.openUrl);
            String scheme = parse.getScheme();
            if (C23057c.f61423a.equals(scheme)) {
                bVar.openUrl = m104784b(bVar.openUrl);
                parse = Uri.parse(bVar.openUrl);
            }
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            if (m104783a(scheme)) {
                intent.putExtra(C23060d.f61429c, true);
            }
            if (bVar.extra.pre_o_urls.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = bVar.extra.pre_o_urls.iterator();
                while (it.hasNext()) {
                    arrayList.add(m104784b((String) it.next()));
                }
                intent.putExtra("pre_o_urls", arrayList);
            }
            if (!TextUtils.isEmpty(bVar.extra.push_user_id)) {
                intent.putExtra("push_user_id", bVar.extra.push_user_id);
                if (TextUtils.isEmpty(parse.getQueryParameter("multi_account_push_uid"))) {
                    parse = parse.buildUpon().appendQueryParameter("multi_account_push_uid", bVar.extra.push_user_id).build();
                }
            }
            intent.setData(parse);
            intent.setPackage(context.getPackageName());
        } else {
            intent = null;
        }
        if (intent == null) {
            return C18920g.m46046a(context, context.getPackageName());
        }
        return intent;
    }

    /* renamed from: a */
    public static Map<String, String> m104782a(C48428b bVar, int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rule_id", String.valueOf(bVar.f121792id));
            if (!TextUtils.isEmpty(bVar.openUrl)) {
                Uri parse = Uri.parse(bVar.openUrl);
                if (parse != null) {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("push_id"))) {
                        hashMap.put("rule_id", parse.getQueryParameter("push_id"));
                    }
                    if (!TextUtils.isEmpty(parse.getQueryParameter("gd_label"))) {
                        hashMap.put("push_label", parse.getQueryParameter("gd_label"));
                    }
                    String host = parse.getHost();
                    if (C22858c.f61208d.equals(host) && !TextUtils.isEmpty(parse.getQueryParameter("id"))) {
                        hashMap.put("group_id", parse.getQueryParameter("id"));
                    } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(parse.getLastPathSegment())) {
                        hashMap.put("group_id", parse.getLastPathSegment());
                    }
                    String path = parse.getPath();
                    if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains(C22858c.f61208d)) {
                        hashMap.put("tag_id", parse.getLastPathSegment());
                    }
                }
            }
            String str6 = "push_channel";
            String str7 = "unknown";
            switch (i) {
                case 1:
                    str7 = "MI";
                    break;
                case 2:
                    str7 = "MYSELF";
                    break;
                case 3:
                    str7 = "IXINTUI";
                    break;
                case 4:
                    str7 = "GETUI";
                    break;
                case 5:
                    str7 = "GCM";
                    break;
                case 6:
                    str7 = "UMENG";
                    break;
                case 7:
                    str7 = "HW";
                    break;
                case 8:
                    str7 = "MZ";
                    break;
                case 9:
                    str7 = "ALIYUN";
                    break;
                case 10:
                    str7 = "OPPO";
                    break;
            }
            hashMap.put(str6, str7);
            String str8 = "push_delay";
            if (bVar.extra.turn_screen_on) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str8, str);
            hashMap.put("post_back", bVar.postBack);
            String str9 = "click_position";
            if (z) {
                str2 = "notify";
            } else {
                str2 = "alert";
            }
            hashMap.put(str9, str2);
            String str10 = "mediastyle";
            if (bVar.extra.style == 5) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put(str10, str3);
            String str11 = "colorized";
            if (TextUtils.isEmpty(bVar.extra.bg_color)) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            hashMap.put(str11, str4);
            String str12 = "is_banner_deleted";
            if (bVar.extra.isBannerDeteled) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            hashMap.put(str12, str5);
            if (bVar.extra != null) {
                if (!TextUtils.isEmpty(bVar.extra.authorId)) {
                    hashMap.put("author_id", bVar.extra.authorId);
                }
                if (!TextUtils.isEmpty(bVar.extra.roomId)) {
                    hashMap.put("room_id", bVar.extra.roomId);
                }
                if (!TextUtils.isEmpty(bVar.extra.userId)) {
                    hashMap.put("user_id", bVar.extra.userId);
                }
                if (!TextUtils.isEmpty(bVar.extra.musicId)) {
                    hashMap.put("music_id", bVar.extra.musicId);
                }
                if (!TextUtils.isEmpty(bVar.extra.challengeId)) {
                    hashMap.put("tag_id", bVar.extra.challengeId);
                }
                if (!TextUtils.isEmpty(bVar.extra.tagId)) {
                    hashMap.put("tag_id", bVar.extra.tagId);
                }
                if (!TextUtils.isEmpty(bVar.extra.poiId)) {
                    hashMap.put("poi_id", bVar.extra.poiId);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
