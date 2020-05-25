package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.experiment.C29503d;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l.C40449a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l.C40450b;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.j */
public final class C40438j extends C26840g<User> {

    /* renamed from: a */
    public int f103237a;

    /* renamed from: b */
    public C40443b f103238b;

    /* renamed from: c */
    public C40442a f103239c;

    /* renamed from: d */
    public C26872d f103240d;

    /* renamed from: e */
    public String f103241e;

    /* renamed from: f */
    public int f103242f;

    /* renamed from: g */
    public Map<String, Integer> f103243g = new HashMap();

    /* renamed from: h */
    public C40449a f103244h = new C40449a() {
        /* renamed from: a */
        public final void mo82741a(User user, int i) {
            if (i >= 0 && i < C40438j.this.f70670n.size()) {
                C40438j.this.f70670n.remove(i);
                C40438j.this.notifyItemRemoved(i);
                if (C40438j.this.f103238b != null) {
                    C40438j.this.f103238b.mo60645a(user, i);
                    if (C40438j.this.f70670n.isEmpty()) {
                        C40438j.this.f103238b.mo60646b(user, i);
                    }
                }
                if (i != C40438j.this.f70670n.size()) {
                    C40438j jVar = C40438j.this;
                    jVar.notifyItemRangeChanged(i, jVar.f70670n.size() - i);
                }
                if (C40438j.this.f70699x) {
                    if (C40438j.this.f70670n.size() <= 10) {
                        C40438j.this.mo54798c(false);
                    } else {
                        C40438j.this.mo54798c(true);
                    }
                }
            }
        }
    };

    /* renamed from: i */
    public C40450b f103245i;

    /* renamed from: j */
    private boolean f103246j = false;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.j$a */
    public interface C40442a {
        /* renamed from: a */
        void mo82717a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.j$b */
    public interface C40443b {
        /* renamed from: a */
        void mo60645a(User user, int i);

        /* renamed from: b */
        void mo60646b(User user, int i);

        /* renamed from: c */
        void mo60647c(User user, int i);

        /* renamed from: d */
        void mo60648d(User user, int i);
    }

    /* renamed from: a */
    public final List<User> mo50673a() {
        return this.f70670n;
    }

    /* renamed from: a */
    public final void mo51182a(C1352v vVar) {
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (((User) this.f70670n.get(i)) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private User m89843b(int i) {
        if (this.f70670n == null || i < 0 || i >= this.f70670n.size()) {
            return null;
        }
        return (User) this.f70670n.get(i);
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zb, viewGroup, false);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C40438j.this.f103239c != null) {
                    C40438j.this.f103239c.mo82717a();
                }
            }
        });
        return new C40422a(inflate);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof C40448l) || this.f103240d == null) {
            if ((vVar instanceof C40434i) && !this.f103246j) {
                ((C40434i) vVar).mo82737a();
                this.f103246j = true;
            }
            return;
        }
        this.f103240d.mo50455a(vVar);
    }

    /* renamed from: a */
    public final void mo50303a(List<User> list) {
        if (list != null && list.size() != 0) {
            if (this.f70670n == null) {
                this.f70670n = new ArrayList();
            }
            this.f70670n.clear();
            this.f70670n.addAll(list);
            if (C32782b.f85367a.mo66362a()) {
                int a = C29503d.m69640a();
                if (a >= this.f70670n.size()) {
                    this.f70670n.add(new RecommendContact());
                } else {
                    this.f70670n.add(a, new RecommendContact());
                }
            }
            for (int i = 0; i < this.f70670n.size(); i++) {
                User user = (User) this.f70670n.get(i);
                if (!(user instanceof RecommendContact)) {
                    this.f103243g.put(user.getUid(), Integer.valueOf(i));
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C40434i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z9, viewGroup, false), this.f103242f);
        }
        return new C40448l(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z9, viewGroup, false), this.f103242f);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C40448l) {
            C40448l lVar = (C40448l) vVar;
            User b = m89843b(i);
            C40449a aVar = this.f103244h;
            C40450b bVar = this.f103245i;
            C40443b bVar2 = this.f103238b;
            int i2 = this.f103237a;
            String str = this.f103241e;
            if (b != null) {
                lVar.f103268h = bVar2;
                lVar.f103264d = b;
                lVar.f103266f = aVar;
                lVar.f103267g = bVar;
                lVar.f103265e = i;
                UserVerify userVerify = new UserVerify(b.getAvatarThumb(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), Integer.valueOf(b.getVerificationType()), b.getWeiboVerify());
                lVar.f103261a.setUserData(userVerify);
                lVar.f103261a.mo48964b();
                lVar.mo82744a(lVar.f103264d);
                TextView textView = lVar.f103263c;
                int i3 = lVar.f103271k;
                User user = lVar.f103264d;
                if (i3 == 0) {
                    StringBuilder sb = new StringBuilder("@");
                    sb.append(user.getUniqueId());
                    textView.setText(sb.toString());
                    textView.setMaxLines(1);
                } else {
                    textView.setText(user.getRecommendReason());
                }
                lVar.mo82743a(lVar.f103264d.getFollowStatus(), lVar.f103264d.getFollowerStatus());
                lVar.mo82745a(lVar.f103264d, lVar.f103264d.getFollowStatus());
                LayoutParams layoutParams = (LayoutParams) lVar.f103269i.getLayoutParams();
                if (i != 0) {
                    i2 = 0;
                }
                layoutParams.leftMargin = i2;
                lVar.f103269i.setLayoutParams(layoutParams);
                lVar.f103270j = str;
                C41589c.m91432a();
                C41589c.m91434f();
                C47916gh.m103675a(lVar.itemView.getContext(), b.getCustomVerify(), b.getEnterpriseVerifyReason(), lVar.f103262b);
            }
            return;
        }
        if (vVar instanceof C40434i) {
            C40434i iVar = (C40434i) vVar;
            RecommendContact recommendContact = (RecommendContact) m89843b(i);
            C52711k.m112240b(recommendContact, "contact");
            iVar.f103223b.setPlaceHolder(R.drawable.b9g);
            iVar.f103224c.setText(R.string.b30);
            iVar.f103225d.setText(R.string.e7);
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            C41589c.m91434f();
            iVar.f103227f.setOnClickListener(new C40435a(iVar, recommendContact, i));
            iVar.f103226e.setText(R.string.acd);
            iVar.f103226e.setBackgroundResource(R.drawable.cjh);
            TextView textView2 = iVar.f103226e;
            Context context = iVar.f103222a;
            C52711k.m112236a((Object) context, "mContext");
            textView2.setTextColor(context.getResources().getColor(R.color.jf));
            iVar.f103226e.setOnClickListener(new C40436b(iVar, recommendContact, i));
            iVar.f103228g = new C52682m<RecommendContact, Integer, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    RecommendContact recommendContact = (RecommendContact) obj;
                    Integer num = (Integer) obj2;
                    if (C40438j.this.f103244h != null) {
                        C40438j.this.f103244h.mo82741a(recommendContact, num.intValue());
                    }
                    return null;
                }
            };
        }
    }
}
