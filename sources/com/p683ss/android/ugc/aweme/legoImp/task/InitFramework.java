package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1162e.C19139a;
import com.p683ss.android.p1162e.C19140b;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47955u;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFramework */
public class InitFramework implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    private void initializeLaunchLog() {
        C19140b.m46665a(C11010c.m22280a());
        try {
            Editor edit = C35807d.m80935a(C19140b.f52739a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception unused) {
        }
        C19140b.m46665a(C11010c.m22280a()).f52741b = new C19139a() {
            public final void onEvent(Map<String, String> map) {
                C26883g.m64995a("launch_log", map);
            }
        };
    }

    public void run(Context context) {
        C48016e.m103936a(context);
        initializeLaunchLog();
        C47955u a = C47955u.m103766a();
        if (context != null && a.f120564b == null) {
            new Thread(new Runnable(context) {

                /* renamed from: a */
                final /* synthetic */ Context f120565a;

                public final void run() {
                    String a = C47955u.m103767a(this.f120565a.getApplicationContext(), "ttnet_config.json");
                    if (!TextUtils.isEmpty(a)) {
                        try {
                            C47955u.this.f120564b = new JSONObject(a);
                            C47955u.this.f120563a = C47955u.this.f120564b.optBoolean("boe_proxy_enabled", false);
                        } catch (JSONException unused) {
                        }
                    }
                }

                {
                    this.f120565a = r2;
                }
            }).start();
        }
    }
}
