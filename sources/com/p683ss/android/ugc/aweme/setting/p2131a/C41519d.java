package com.p683ss.android.ugc.aweme.setting.p2131a;

import android.app.Activity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.a.d */
public final class C41519d extends C26840g<User> {

    /* renamed from: a */
    protected Activity f105208a;

    public C41519d(Activity activity) {
        this.f105208a = activity;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.bk9);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(R.string.dle);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) appCompatTextView2));
        return a_;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new C41516a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bu9, viewGroup, false), this.f105208a);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        String str;
        C41516a aVar = (C41516a) vVar;
        User user = (User) this.f70670n.get(i);
        if (user != null) {
            boolean z = false;
            aVar.f105202g = 0;
            if (aVar.f105202g != 0) {
                aVar.f105199d.setBackgroundColor(aVar.f105199d.getResources().getColor(R.color.aso));
                aVar.f105197b.setTextColor(aVar.f105199d.getResources().getColor(R.color.a2m));
                aVar.f105198c.setTextColor(aVar.f105199d.getResources().getColor(R.color.a1y));
            }
            aVar.f105201f = 0;
            if (aVar.f105201f == 1) {
                z = true;
            }
            aVar.f105203h = z;
            aVar.f105200e = user;
            if (aVar.f105203h) {
                if (aVar.f105200e.getStoryBlockInfo() == null) {
                    StoryBlockInfo storyBlockInfo = new StoryBlockInfo();
                    storyBlockInfo.setBlock(true);
                    aVar.f105200e.setStoryBlockInfo(storyBlockInfo);
                }
                aVar.mo85300a(true);
            } else {
                aVar.f105200e.setBlock(true);
            }
            C23515d.m57669a((RemoteImageView) aVar.f105196a, aVar.f105200e.getAvatarThumb());
            aVar.f105197b.setText(aVar.f105200e.getNickname());
            TextView textView = aVar.f105198c;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            sb.append(str);
            textView.setText(sb.toString());
        }
    }
}
