package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1323ae.p1326c.C22471a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ProfileStarRankView */
public class ProfileStarRankView extends FrameLayout {

    /* renamed from: a */
    public RemoteImageView f103156a;

    /* renamed from: b */
    public List<AvatarWithBorderView> f103157b;

    /* renamed from: c */
    public boolean f103158c;

    /* renamed from: d */
    public Challenge f103159d;

    /* renamed from: e */
    private ViewStub f103160e;

    /* renamed from: f */
    private boolean f103161f;

    /* renamed from: g */
    private ConstraintLayout f103162g;

    /* renamed from: h */
    private ConstraintLayout f103163h;

    /* renamed from: i */
    private DmtTextView f103164i;

    /* renamed from: j */
    private DmtTextView f103165j;

    /* renamed from: k */
    private ImageView f103166k;

    /* renamed from: l */
    private AvatarWithBorderView f103167l;

    /* renamed from: m */
    private AvatarWithBorderView f103168m;

    /* renamed from: n */
    private AvatarWithBorderView f103169n;

    public ViewGroup getHitRankView() {
        mo82695a();
        return this.f103163h;
    }

    public ViewGroup getStarRankView() {
        mo82695a();
        return this.f103162g;
    }

    /* access modifiers changed from: 0000 */
    public String getEnterFrom() {
        if (this.f103158c) {
            return "challenge";
        }
        return "others_homepage";
    }

    /* renamed from: a */
    public void mo82695a() {
        if (!this.f103161f) {
            this.f103160e.inflate();
            this.f103161f = true;
            this.f103156a = (RemoteImageView) findViewById(R.id.ayg);
            this.f103162g = (ConstraintLayout) findViewById(R.id.e23);
            this.f103163h = (ConstraintLayout) findViewById(R.id.e20);
            this.f103164i = (DmtTextView) findViewById(R.id.dg9);
            this.f103165j = (DmtTextView) findViewById(R.id.da7);
            this.f103166k = (ImageView) findViewById(R.id.b4b);
            this.f103167l = (AvatarWithBorderView) findViewById(R.id.b1c);
            this.f103168m = (AvatarWithBorderView) findViewById(R.id.b1d);
            this.f103169n = (AvatarWithBorderView) findViewById(R.id.b1e);
            this.f103157b.add(this.f103167l);
            this.f103157b.add(this.f103168m);
            this.f103157b.add(this.f103169n);
            for (AvatarWithBorderView avatarWithBorderView : this.f103157b) {
                avatarWithBorderView.setBorderColor(R.color.a03);
                avatarWithBorderView.setBorderWidth(1);
            }
        }
    }

    public ProfileStarRankView(Context context) {
        this(context, null);
    }

    public void setBackgroundImage(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo82695a();
            C23515d.m57677a(this.f103156a, str);
        }
    }

    public void setVisibility(int i) {
        if (i == 0) {
            mo82695a();
        }
        super.setVisibility(i);
    }

    public void setHitRankPeopleNumber(int i) {
        mo82695a();
        this.f103165j.setText(getResources().getString(R.string.bbd, new Object[]{C33095b.m76068a((long) i)}));
    }

    public void setHitRankUsers(List<User> list) {
        if (list != null) {
            int min = Math.min(list.size(), 3);
            for (int i = 0; i < min; i++) {
                User user = (User) list.get(i);
                if (user != null) {
                    C23515d.m57669a((RemoteImageView) this.f103157b.get(i), user.getAvatarThumb());
                }
            }
        }
    }

    public void setRank(int i) {
        String str;
        if (i > 0) {
            mo82695a();
            if (i <= 30) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                str = sb.toString();
                this.f103166k.setImageResource(C22471a.f60527a[i - 1]);
            } else {
                str = "30+";
                this.f103166k.setImageResource(R.drawable.dnh);
            }
            this.f103164i.setText(getResources().getString(R.string.dqv, new Object[]{str}));
        }
    }

    public ProfileStarRankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103157b = new ArrayList();
        this.f103160e = new ViewStub(getContext());
        this.f103160e.setLayoutResource(R.layout.bqi);
        addView(this.f103160e);
    }
}
