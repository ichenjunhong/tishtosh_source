package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.experiment.EnableFriendsEnhanceFollowBackExperiment;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32541p;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40574y;
import com.p683ss.android.ugc.aweme.profile.util.C40575z;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.aj */
public final class C32720aj extends IRecommendFriendItemViewV2 {

    /* renamed from: a */
    protected TextView f85223a;

    /* renamed from: b */
    protected AvatarImageWithVerify f85224b;

    /* renamed from: c */
    protected TextView f85225c;

    /* renamed from: d */
    protected FollowUserBtn f85226d;

    /* renamed from: e */
    protected TextView f85227e;

    /* renamed from: f */
    public C23452y<User> f85228f;

    /* renamed from: g */
    User f85229g;

    /* renamed from: h */
    public int f85230h;

    /* renamed from: i */
    ImageView f85231i;

    /* renamed from: j */
    public String f85232j;

    /* renamed from: k */
    public int f85233k;

    /* renamed from: l */
    boolean f85234l;

    /* renamed from: m */
    HashMap<String, Boolean> f85235m;

    /* renamed from: n */
    protected int f85236n;

    /* renamed from: o */
    private View f85237o;

    /* renamed from: p */
    private RecyclerView f85238p;

    /* renamed from: q */
    private View f85239q;

    /* renamed from: r */
    private LinearLayout f85240r;

    /* renamed from: s */
    private C40574y f85241s;

    /* renamed from: t */
    private RelativeUserAvatarListView f85242t;

    /* renamed from: u */
    private int f85243u;

    /* renamed from: v */
    private boolean f85244v;

    /* renamed from: w */
    private C32506c f85245w;

    /* renamed from: x */
    private C31980a f85246x;

    /* renamed from: y */
    private C32726a f85247y;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.aj$a */
    public interface C32726a {
    }

    public final User getData() {
        return this.f85229g;
    }

    /* access modifiers changed from: protected */
    public final int getLayoutId() {
        return R.layout.bbd;
    }

    private String getUserInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.fft));
        sb.append(":");
        sb.append(C33095b.m76068a((long) this.f85229g.getAwemeCount()));
        sb.append("  ");
        sb.append(getContext().getString(R.string.b57));
        sb.append(":");
        sb.append(C33095b.m76068a((long) this.f85229g.getFollowerCount()));
        return sb.toString();
    }

    public final void setEnterFrom(String str) {
        this.f85232j = str;
    }

    public final void setFollowFromType(int i) {
        this.f85233k = i;
    }

    public final void setFollowStatusChangeCallback(C32726a aVar) {
        this.f85247y = aVar;
    }

    public final void setListener(C23452y<User> yVar) {
        this.f85228f = yVar;
    }

    public final void setPositionInApiList(int i) {
        this.f85230h = i;
    }

    public final void setRecommendAwemeClickListener(C32506c cVar) {
        this.f85245w = cVar;
    }

    public final void setRecommendUserType(int i) {
        this.f85236n = i;
    }

    public final void setNewFriendRecommendMask(boolean z) {
        int i;
        View view = this.f85237o;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public final void setRecommendItemData(User user) {
        if (!C9376b.m18558a((Collection<T>) user.getRecommendAwemeItems())) {
            this.f85238p.setVisibility(0);
            C32541p createRecommendAwemeAdapter = C32616c.f84865a.createRecommendAwemeAdapter();
            createRecommendAwemeAdapter.mo65844a(this.f85245w);
            createRecommendAwemeAdapter.mo50303a(user.getRecommendAwemeItems());
            createRecommendAwemeAdapter.mo65845b(this.f85230h);
            this.f85238p.setAdapter(createRecommendAwemeAdapter);
            return;
        }
        this.f85238p.setVisibility(8);
    }

    public final void setData(final User user) {
        if (user != null) {
            this.f85229g = user;
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f85223a.setText(user.getRemarkName());
            } else {
                this.f85223a.setText(user.getNickname());
            }
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f85224b.setUserData(userVerify);
            this.f85224b.mo48964b();
            C47916gh.m103675a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f85223a);
            mo66305a(user, user.getFollowStatus());
            this.f85246x.f83488c = new C32727ak(this);
            this.f85246x.mo65173a(user);
            setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C32720aj.this.f85228f != null) {
                        C32720aj.this.f85228f.mo48614a(BaseNotice.HASHTAG, user, C32720aj.this.f85230h, C32720aj.this, "click_head");
                    }
                }
            });
            if (this.f85234l) {
                if (user.getFollowStatus() == 0) {
                    this.f85231i.setVisibility(0);
                } else {
                    this.f85231i.setVisibility(4);
                }
                this.f85231i.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C32720aj.this.f85228f != null) {
                            C32720aj.this.f85228f.mo48614a(102, user, C32720aj.this.f85230h, C32720aj.this, "");
                        }
                    }
                });
            }
            this.f85223a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C32720aj.this.f85228f != null) {
                        C32720aj.this.f85228f.mo48614a(BaseNotice.HASHTAG, user, C32720aj.this.f85230h, C32720aj.this, "click_name");
                    }
                }
            });
            setRecommendItemData(user);
            if (C29504e.m69644d()) {
                TextView textView = this.f85227e;
                if (textView != null) {
                    this.f85242t.setVisibility(0);
                    textView.setMaxLines(2);
                    m75601a(user, textView);
                    this.f85242t.mo66274a(user.getRelativeUserInfos(), textView, this.f85244v);
                }
                return;
            }
            m75601a(user, this.f85227e);
            TextView textView2 = this.f85225c;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(getUserInfo());
            }
        }
    }

    public C32720aj(Context context, HashMap<String, Boolean> hashMap) {
        this(context, (AttributeSet) null, hashMap);
    }

    /* renamed from: a */
    private static void m75601a(User user, TextView textView) {
        textView.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView.setText(user.getSignature());
        } else {
            textView.setText(R.string.dk2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo66305a(User user, int i) {
        if (C29504e.m69643c() == 2 || C29504e.m69643c() == 3) {
            if (this.f85235m != null && this.f85235m.get(user.getUid()) != null) {
                ((Boolean) this.f85235m.get(user.getUid())).booleanValue();
                this.f85235m.put(user.getUid(), Boolean.valueOf(false));
            } else if (this.f85239q != null) {
                this.f85239q.setVisibility(8);
            }
        }
    }

    private C32720aj(Context context, AttributeSet attributeSet, HashMap<String, Boolean> hashMap) {
        this(context, null, 0, hashMap, false, false);
    }

    public C32720aj(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        this(context, null, 0, hashMap, z, false);
    }

    private C32720aj(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        this(context, attributeSet, 0, hashMap, z, false, true);
    }

    private C32720aj(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap, boolean z, boolean z2, boolean z3) {
        Context context2;
        float f;
        super(context, attributeSet, i);
        this.f85232j = "";
        this.f85233k = 12;
        this.f85235m = new HashMap<>();
        boolean z4 = false;
        this.f85236n = 0;
        this.f85244v = z2;
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        if (!z2) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            setBackgroundResource(typedValue.resourceId);
        }
        this.f85223a = (TextView) findViewById(R.id.dl2);
        this.f85224b = (AvatarImageWithVerify) findViewById(R.id.ay2);
        this.f85225c = (TextView) findViewById(R.id.dkf);
        this.f85226d = (FollowUserBtn) findViewById(R.id.nr);
        this.f85227e = (TextView) findViewById(R.id.d98);
        this.f85239q = findViewById(R.id.b0_);
        this.f85231i = (ImageView) findViewById(R.id.ayh);
        this.f85237o = findViewById(R.id.bqf);
        this.f85238p = (RecyclerView) findViewById(R.id.bbz);
        this.f85238p.mo4798a((C1331h) new C32528d(0, (int) C9432q.m18687b(this.f85238p.getContext(), 4.0f), 0));
        this.f85238p.setLayoutManager(new WrapLinearLayoutManager(this.f85238p.getContext(), 0, false) {
            /* renamed from: e */
            public final boolean mo4742e() {
                return false;
            }
        });
        this.f85235m = hashMap;
        if (C10181b.m20511a().mo18172a(EnableFriendsEnhanceFollowBackExperiment.class, true, "friends_enhance_followback", 31744, false) && z) {
            z4 = true;
        }
        this.f85234l = z4;
        if (!this.f85234l) {
            this.f85231i.setVisibility(8);
        }
        if (z2) {
            this.f85231i.setImageResource(R.drawable.cyk);
        }
        this.f85246x = new C31980a(this.f85226d, new C31988e() {
            /* renamed from: a */
            public final String mo56221a() {
                return C32720aj.this.f85232j;
            }

            /* renamed from: c */
            public final int mo56223c() {
                return C32720aj.this.f85233k;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                if (C32720aj.this.f85228f != null) {
                    C32720aj.this.f85228f.mo48614a(100, user, C32720aj.this.f85230h, C32720aj.this, "");
                }
            }
        });
        this.f85240r = (LinearLayout) findViewById(R.id.cxc);
        float a = (float) C9432q.m18670a(getContext());
        if (this.f85234l) {
            context2 = getContext();
            f = 210.0f;
        } else {
            context2 = getContext();
            f = 185.0f;
        }
        this.f85243u = (int) (a - C9432q.m18687b(context2, f));
        this.f85241s = new C40575z(this.f85240r, this.f85243u, this.f85244v, true);
        this.f85242t = (RelativeUserAvatarListView) findViewById(R.id.cb3);
    }
}
