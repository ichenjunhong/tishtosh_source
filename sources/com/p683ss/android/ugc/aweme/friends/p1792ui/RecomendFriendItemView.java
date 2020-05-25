package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecomendFriendItemView */
public class RecomendFriendItemView extends LinearLayout {

    /* renamed from: a */
    public C32661a f85039a;

    /* renamed from: b */
    private TextView f85040b;

    /* renamed from: c */
    private AvatarImageView f85041c;

    /* renamed from: d */
    private TextView f85042d;

    /* renamed from: e */
    private TextView f85043e;

    /* renamed from: f */
    private TextView f85044f;

    /* renamed from: g */
    private ImageView f85045g;

    /* renamed from: h */
    private User f85046h;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecomendFriendItemView$a */
    public interface C32661a {
        /* renamed from: a */
        void mo66223a(User user);
    }

    public User getData() {
        return this.f85046h;
    }

    public void setListener(C32661a aVar) {
        this.f85039a = aVar;
    }

    public RecomendFriendItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo66217a(int i) {
        if (i == 0) {
            this.f85044f.setText(getContext().getString(R.string.b3w));
            this.f85044f.setTextColor(getContext().getResources().getColor(R.color.oa));
            this.f85044f.setBackground(getResources().getDrawable(R.drawable.op));
            return;
        }
        if (i == 1) {
            this.f85044f.setText(getContext().getString(R.string.b55));
            this.f85044f.setBackground(getResources().getDrawable(R.drawable.or));
            this.f85044f.setTextColor(getContext().getResources().getColor(R.color.o_));
        }
    }

    public void setData(final User user) {
        if (user != null) {
            this.f85046h = user;
            if (!C9431p.m18664a(user.getWeiboVerify()) || !C9431p.m18664a(user.getCustomVerify())) {
                this.f85045g.setVisibility(0);
            } else {
                this.f85045g.setVisibility(8);
            }
            this.f85040b.setText(user.getNickname());
            C23515d.m57669a((RemoteImageView) this.f85041c, user.getAvatarThumb());
            TextView textView = this.f85042d;
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.b57));
            sb.append(C33095b.m76068a((long) user.getFollowerCount()));
            textView.setText(sb.toString());
            this.f85043e.setText(user.getSignature());
            this.f85044f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (RecomendFriendItemView.this.f85039a != null) {
                        RecomendFriendItemView.this.f85039a.mo66223a(user);
                        User user = user;
                        int i = 1;
                        if (user.getFollowStatus() == 1) {
                            i = 0;
                        }
                        user.setFollowStatus(i);
                        RecomendFriendItemView.this.mo66217a(user.getFollowStatus());
                    }
                }
            });
            mo66217a(user.getFollowStatus());
            this.f85041c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C41302w a = C41302w.m91042a();
                    StringBuilder sb = new StringBuilder("aweme://user/profile/");
                    sb.append(user.getUid());
                    a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", user.getSecUid()).mo83871a());
                }
            });
        }
    }

    public RecomendFriendItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecomendFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.z5, this);
        setOrientation(0);
        this.f85040b = (TextView) findViewById(R.id.dl2);
        this.f85041c = (AvatarImageView) findViewById(R.id.ay2);
        this.f85042d = (TextView) findViewById(R.id.dkf);
        this.f85043e = (TextView) findViewById(R.id.dkb);
        this.f85044f = (TextView) findViewById(R.id.dkd);
        this.f85045g = (ImageView) findViewById(R.id.dod);
    }
}
