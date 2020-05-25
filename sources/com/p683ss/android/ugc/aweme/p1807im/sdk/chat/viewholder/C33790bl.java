package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.C2240a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodContent;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bl */
public class C33790bl extends C33809cc {
    public C33790bl(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        if (baseContent instanceof ShareGoodContent) {
            ShareGoodContent shareGoodContent = (ShareGoodContent) baseContent;
            this.f87727w.setText(shareGoodContent.getTitle());
            this.f87728x.setVisibility(0);
            String valueOf = String.valueOf(shareGoodContent.getUserCount());
            if (shareGoodContent.getUserCount() >= 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                double userCount = (double) shareGoodContent.getUserCount();
                Double.isNaN(userCount);
                String format = decimalFormat.format(userCount / 10000.0d);
                if (format.endsWith("0") && format.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                    format = format.substring(0, format.indexOf(ClassUtils.PACKAGE_SEPARATOR));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(format);
                sb.append("w");
                valueOf = sb.toString();
            }
            this.f87728x.setText(C2240a.m6773a(Locale.getDefault(), this.f87728x.getContext().getString(R.string.bhq), new Object[]{valueOf}));
            this.f87729y.setText(R.string.bhp);
            ((C13833a) this.f87726v.getHierarchy()).mo25902b((int) R.drawable.dai);
            C23515d.m57669a(this.f87726v, shareGoodContent.getAvatar());
            this.f87708j.setTag(50331648, Integer.valueOf(34));
            this.f87708j.setTag(67108864, shareGoodContent);
        }
    }
}
