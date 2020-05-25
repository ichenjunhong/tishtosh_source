package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.sdk.webview.C19761i.C19762a;
import com.p683ss.android.sdk.webview.C19763j;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47727bn;
import com.p683ss.android.ugc.aweme.web.p2398b.C48269b;
import com.p683ss.android.ugc.aweme.web.p2398b.C48270c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FontTask */
public class FontTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        if (!TextUtils.equals(I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(C11010c.m22280a()).mo70122b(), "th")) {
            C10749b.m21787a().mo19436a(context, C47727bn.f120235a);
            C48270c a = C48270c.m104565a();
            Map<String, String> map = C47727bn.f120236b;
            if (context != null) {
                a.f121477b = context.getApplicationContext();
            }
            a.f121476a = map;
            C19763j.m48282a().mo41195a((C19762a) new C48269b(false));
        }
    }
}
