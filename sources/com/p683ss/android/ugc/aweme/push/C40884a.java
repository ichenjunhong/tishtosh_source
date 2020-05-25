package com.p683ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.push.a */
public final class C40884a {
    /* renamed from: b */
    private static boolean m90456b(Activity activity) {
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack.length <= 0 || !activityStack[0].equals(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m90455a(Activity activity) {
        String str;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("backurl");
                if (((Intent) intent.getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY")) == null) {
                    boolean booleanExtra = intent.getBooleanExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", false);
                    if (!TextUtils.isEmpty(stringExtra) && !TextUtils.equals("__BACKURL__", stringExtra) && !booleanExtra) {
                        try {
                            Uri parse = Uri.parse(stringExtra);
                            Intent intent2 = new Intent();
                            intent2.setData(parse);
                            intent2.setAction("android.intent.action.VIEW");
                            intent2.addCategory("android.intent.category.BROWSABLE");
                            intent2.setComponent(null);
                            intent2.setSelector(null);
                            activity.startActivityIfNeeded(intent2, -1);
                            activity.moveTaskToBack(true);
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    String stringExtra2 = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                    int intExtra = intent.getIntExtra("extra_story_is_friend", -1);
                    boolean booleanExtra2 = intent.getBooleanExtra("is_from_push", false);
                    if (!intent.getBooleanExtra("is_have_intents", false)) {
                        if ((!C23794bh.m58398l().mo47709b() || booleanExtra2) && m90456b(activity)) {
                            if (TextUtils.isEmpty(stringExtra2)) {
                                str = "aweme://main";
                            } else {
                                StringBuilder sb = new StringBuilder("aweme://main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=");
                                sb.append(stringExtra2);
                                str = sb.toString();
                            }
                            if (intExtra != -1) {
                                C41302w.m91042a().f104758d.mo83855b("extra_story_is_friend");
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("&extra_story_is_friend");
                                sb2.append("=");
                                sb2.append(intExtra);
                                str = sb2.toString();
                            }
                            C41302w.m91042a().mo83858a((Activity) null, str);
                            return;
                        }
                        if (!TextUtils.isEmpty(stringExtra2)) {
                            C47718bf.m103288a(new C40903f(stringExtra2));
                        }
                    }
                }
            }
        }
    }
}
