package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.friends.api.C32559b;
import com.p683ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecomendFriendItemView.C32661a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity */
public class RecommendFriendActivity extends AmeActivity implements OnClickListener, C32661a {

    /* renamed from: a */
    public C32719ai f85064a;

    /* renamed from: b */
    List<User> f85065b;

    /* renamed from: c */
    private RecyclerView f85066c;

    /* renamed from: d */
    private TextView f85067d;

    /* renamed from: e */
    private C39971i f85068e;

    /* renamed from: f */
    private ImageView f85069f;

    /* renamed from: g */
    private TextView f85070g;

    /* renamed from: h */
    private RecommendApi f85071h;

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo66226a() {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                RecommendFriendActivity.this.finish();
                RecommendFriendActivity.this.dismissProgressDialog();
            }
        });
    }

    /* renamed from: c */
    private List<User> m75519c() {
        List subList = this.f85064a.mo50673a().subList(this.f85065b.size(), this.f85064a.mo50673a().size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < subList.size(); i++) {
            User user = (User) subList.get(i);
            if (user != null && user.getFollowStatus() == 1) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m75520d() {
        if (this.f85064a != null && !C9376b.m18558a((Collection<T>) this.f85064a.mo50673a())) {
            boolean z = false;
            Iterator it = this.f85064a.mo50673a().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((User) it.next()).getFollowStatus() == 1) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                C26890h.onEvent(MobClick.obtain().setEventName("follow_skip").setLabelName("recommend"));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo66227b() {
        C26890h.onEvent(MobClick.obtain().setEventName("follow_default_count").setLabelName("recommend").setValue(String.valueOf(m75517a(this.f85065b).size())).setJsonObject(new C26898j().mo54849a("uid", m75518b(m75517a(this.f85065b))).mo54850a()));
        C26890h.onEvent(MobClick.obtain().setEventName("follow_manual_count").setLabelName("recommend").setValue(String.valueOf(m75519c().size())).setJsonObject(new C26898j().mo54849a("uid", m75518b(m75519c())).mo54850a()));
    }

    /* renamed from: a */
    static List<User> m75517a(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (C9376b.m18558a((Collection<T>) list)) {
            return arrayList;
        }
        for (User user : list) {
            if (1 == user.getFollowStatus()) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static String m75518b(List<User> list) {
        StringBuilder sb;
        if (C9376b.m18558a((Collection<T>) list)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (User uid : list) {
            sb2.append(uid.getUid());
            sb2.append(",");
        }
        if (sb2.length() > 0) {
            sb = new StringBuilder(sb2.substring(0, sb2.length() - 1));
        } else {
            sb = sb2;
        }
        return sb.toString();
    }

    @C53771m
    public void onProfileFollowEvent(C24530d dVar) {
        if (isViewValid() && (dVar.f64952b instanceof User) && this.f85064a != null) {
            User user = (User) dVar.f64952b;
            List a = this.f85064a.mo50673a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                User user2 = (User) a.get(i);
                if (TextUtils.equals(user2.getUid(), user.getUid())) {
                    user2.setFollowStatus(dVar.f64951a);
                    this.f85064a.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo66223a(User user) {
        int i;
        if (isViewValid()) {
            if (!C32718ah.m75598a(this)) {
                C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = i ^ 1;
            if (this.f85068e != null) {
                this.f85068e.mo66349a(new C39970a().mo81871a(user.getUid()).mo81874b(user.getSecUid()).mo81869a(i2).mo81873b(1).mo81877d(user.getFollowerStatus()).mo81872a());
                if (i2 == 0) {
                    C26890h.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("recommend").setValue(user.getUid()));
                } else {
                    C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend").setValue(user.getUid()));
                    new C23253w().mo48161b("recommend").mo48166f(user.getUid()).mo48076e();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.dv);
        this.f85066c = (RecyclerView) findViewById(R.id.ca3);
        this.f85067d = (TextView) findViewById(R.id.dke);
        this.f85070g = (TextView) findViewById(R.id.cs6);
        this.f85069f = (ImageView) findViewById(R.id.az9);
        this.f85064a = new C32719ai();
        this.f85064a.f85222a = this;
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        int i = 1;
        wrapLinearLayoutManager.mo4731b(1);
        this.f85066c.setLayoutManager(wrapLinearLayoutManager);
        this.f85066c.setOverScrollMode(2);
        this.f85066c.setHasFixedSize(true);
        this.f85066c.setAdapter(this.f85064a);
        this.f85067d.setOnClickListener(this);
        this.f85070g.setOnClickListener(this);
        this.f85069f.setOnClickListener(this);
        this.f85068e = new C39971i();
        this.f85071h = C32559b.m75337a();
        showProgressDialog();
        if (!C20854a.m53167g().isUidContactPermisioned()) {
            i = 2;
        }
        this.f85071h.recommendList(null, null, null, Integer.valueOf(3), null, Integer.valueOf(i), C37940g.m84832a().mo77416b(), Integer.valueOf(C47945d.m103733b()), null).mo20a((C0011g<TResult, TContinuationResult>) new C32716af<TResult,TContinuationResult>(this), C0013i.f25b);
        this.f85071h.modifyUser(0);
    }

    public void onClick(View view) {
        Pair pair;
        StringBuilder sb;
        StringBuilder sb2;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.dke) {
            List<User> a = this.f85064a.mo50673a();
            if (C9376b.m18558a((Collection<T>) a)) {
                finish();
            } else {
                if (C9376b.m18558a((Collection<T>) a)) {
                    pair = new Pair("", "");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder();
                    for (User user : a) {
                        sb3.append(user.getUid());
                        sb3.append(",");
                        sb4.append(user.getSecUid());
                        sb4.append(",");
                    }
                    if (sb3.length() > 0) {
                        sb = new StringBuilder(sb3.substring(0, sb3.length() - 1));
                    } else {
                        sb = sb3;
                    }
                    if (sb4.length() > 0) {
                        sb2 = new StringBuilder(sb4.substring(0, sb4.length() - 1));
                    } else {
                        sb2 = sb4;
                    }
                    pair = new Pair(sb.toString(), sb2.toString());
                }
                this.f85071h.followUsers((String) pair.first, (String) pair.second, 1).mo30c(new C32717ag(this), C0013i.f25b);
                C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend_all"));
                new C23253w().mo48161b("recommend_all").mo48076e();
            }
            mo66226a();
        } else if (id == R.id.cs6) {
            mo66226a();
            C26890h.onEvent(MobClick.obtain().setEventName("follow_finish").setLabelName("recommend"));
            mo66227b();
            m75520d();
        } else {
            if (id == R.id.az9) {
                mo66226a();
                C26890h.onEvent(MobClick.obtain().setEventName("follow_close").setLabelName("recommend"));
                mo66227b();
                m75520d();
            }
        }
    }
}
