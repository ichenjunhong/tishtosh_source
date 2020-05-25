package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.I18nFollowUserBtn;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.aq */
public final class C32741aq extends IRecommendFriendItemViewV2 {

    /* renamed from: a */
    public String f85291a;

    /* renamed from: b */
    public C23452y<User> f85292b;

    /* renamed from: c */
    public final int f85293c;

    /* renamed from: d */
    public int f85294d;

    /* renamed from: e */
    public HashMap<String, Boolean> f85295e;

    /* renamed from: f */
    public C32743a f85296f;

    /* renamed from: g */
    private User f85297g;

    /* renamed from: h */
    private final C31980a f85298h;

    /* renamed from: i */
    private HashMap f85299i;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aq$a */
    public interface C32743a {
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aq$b */
    static final class C32744b implements C31984a {

        /* renamed from: a */
        final /* synthetic */ C32741aq f85301a;

        /* renamed from: b */
        final /* synthetic */ User f85302b;

        C32744b(C32741aq aqVar, User user) {
            this.f85301a = aqVar;
            this.f85302b = user;
        }

        /* renamed from: a */
        public final void mo56224a(FollowStatus followStatus) {
            if (followStatus != null) {
                HashMap<String, Boolean> hashMap = this.f85301a.f85295e;
                if (hashMap != null) {
                    hashMap.put(this.f85302b.getUid(), Boolean.valueOf(true));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aq$c */
    static final class C32745c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32741aq f85303a;

        /* renamed from: b */
        final /* synthetic */ User f85304b;

        C32745c(C32741aq aqVar, User user) {
            this.f85303a = aqVar;
            this.f85304b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C23452y<User> yVar = this.f85303a.f85292b;
            if (yVar != null) {
                yVar.mo48614a(BaseNotice.HASHTAG, this.f85304b, this.f85303a.f85294d, this.f85303a, "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aq$d */
    static final class C32746d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32741aq f85305a;

        /* renamed from: b */
        final /* synthetic */ User f85306b;

        C32746d(C32741aq aqVar, User user) {
            this.f85305a = aqVar;
            this.f85306b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C23452y<User> yVar = this.f85305a.f85292b;
            if (yVar != null) {
                yVar.mo48614a(BaseNotice.HASHTAG, this.f85306b, this.f85305a.f85294d, this.f85305a, "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aq$e */
    static final class C32747e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32741aq f85307a;

        /* renamed from: b */
        final /* synthetic */ User f85308b;

        C32747e(C32741aq aqVar, User user) {
            this.f85307a = aqVar;
            this.f85308b = user;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C23452y<User> yVar = this.f85307a.f85292b;
            if (yVar != null) {
                yVar.mo48614a(BaseNotice.HASHTAG, this.f85308b, this.f85307a.f85294d, this.f85307a, "click_head");
            }
        }
    }

    /* renamed from: a */
    public final View mo66184a(int i) {
        if (this.f85299i == null) {
            this.f85299i = new HashMap();
        }
        View view = (View) this.f85299i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f85299i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final User getData() {
        return this.f85297g;
    }

    public final void setFollowStatusChangeCallback(C32743a aVar) {
        this.f85296f = aVar;
    }

    public final void setListener(C23452y<User> yVar) {
        this.f85292b = yVar;
    }

    public final void setPositionInApiList(int i) {
        this.f85294d = i;
    }

    public final void setEnterFrom(String str) {
        C52711k.m112240b(str, "enterFrom");
        this.f85291a = str;
    }

    public final void setData(User user) {
        boolean z;
        String remarkName;
        if (user != null) {
            this.f85297g = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            ((AvatarImageWithVerify) mo66184a(R.id.ay2)).setUserData(userVerify);
            ((AvatarImageWithVerify) mo66184a(R.id.ay2)).mo48964b();
            DmtTextView dmtTextView = (DmtTextView) mo66184a(R.id.f5j);
            C52711k.m112236a((Object) dmtTextView, "txt_nick_name");
            CharSequence remarkName2 = user.getRemarkName();
            if (remarkName2 == null || C52830p.m112402a(remarkName2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                remarkName = user.getNickname();
            } else {
                remarkName = user.getRemarkName();
            }
            dmtTextView.setText(remarkName);
            DmtTextView dmtTextView2 = (DmtTextView) mo66184a(R.id.f2k);
            C52711k.m112236a((Object) dmtTextView2, "tv_handle");
            dmtTextView2.setText(C47915gg.m103656e(user));
            C47916gh.m103675a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), (DmtTextView) mo66184a(R.id.f2k));
            this.f85298h.f83488c = new C32744b(this, user);
            this.f85298h.mo65173a(user);
            if (!TextUtils.isEmpty(user.getRecommendReason())) {
                DmtTextView dmtTextView3 = (DmtTextView) mo66184a(R.id.d98);
                C52711k.m112236a((Object) dmtTextView3, "tv_desc");
                dmtTextView3.setText(user.getRecommendReason());
            } else if (!TextUtils.isEmpty(user.getSignature())) {
                DmtTextView dmtTextView4 = (DmtTextView) mo66184a(R.id.d98);
                C52711k.m112236a((Object) dmtTextView4, "tv_desc");
                dmtTextView4.setText(user.getSignature());
            } else {
                ((DmtTextView) mo66184a(R.id.d98)).setText(R.string.dk2);
            }
            ((DmtTextView) mo66184a(R.id.f5j)).setOnClickListener(new C32745c(this, user));
            ((DmtTextView) mo66184a(R.id.f2k)).setOnClickListener(new C32746d(this, user));
            setOnClickListener(new C32747e(this, user));
        }
    }

    private C32741aq(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hashMap, "followClickMap");
        super(context, attributeSet, i);
        this.f85291a = "";
        this.f85293c = 12;
        LayoutInflater.from(context).inflate(R.layout.bbe, this);
        this.f85295e = hashMap;
        this.f85298h = new C31980a((I18nFollowUserBtn) mo66184a(R.id.nr), new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C32741aq f85300a;

            /* renamed from: a */
            public final String mo56221a() {
                return this.f85300a.f85291a;
            }

            /* renamed from: c */
            public final int mo56223c() {
                return this.f85300a.f85293c;
            }

            {
                this.f85300a = r1;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                C52711k.m112240b(user, "user");
                C23452y<User> yVar = this.f85300a.f85292b;
                if (yVar != null) {
                    yVar.mo48614a(100, user, this.f85300a.f85294d, this.f85300a, "");
                }
            }
        });
    }

    public /* synthetic */ C32741aq(Context context, AttributeSet attributeSet, int i, HashMap hashMap, int i2, C52707g gVar) {
        this(context, null, 0, hashMap);
    }
}
