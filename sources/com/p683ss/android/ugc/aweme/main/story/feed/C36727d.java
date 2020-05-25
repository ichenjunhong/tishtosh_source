package com.p683ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.C23563a;
import com.p683ss.android.ugc.aweme.base.p1418i.C23545a;
import com.p683ss.android.ugc.aweme.base.p1418i.C23546b;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.widget.DividerView;
import com.p683ss.android.ugc.aweme.base.widget.commonitem.p1424a.C23755b;
import com.p683ss.android.ugc.aweme.base.widget.p1422a.C23746a;
import com.p683ss.android.ugc.aweme.base.widget.p1422a.C23746a.C23747a;
import com.p683ss.android.ugc.aweme.base.widget.recyclerview.C23760c;
import com.p683ss.android.ugc.aweme.base.widget.recyclerview.p1425a.C23757a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.story.feed.C36719c.C36726a;
import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import com.p683ss.android.ugc.aweme.main.story.p1945a.C36706a;
import com.p683ss.android.ugc.aweme.main.widget.StoryFeedLoadMoreProgressBar;
import com.p683ss.android.ugc.aweme.story.model.C46657c;
import com.p683ss.android.ugc.aweme.story.model.C46660d;
import com.p683ss.android.ugc.aweme.story.model.C46660d.C46661a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.d */
public class C36727d extends C23563a<StoryFeedPanel> implements C23546b<C46660d> {

    /* renamed from: h */
    private static final String f93872h = "d";

    /* renamed from: b */
    public final List<C23562e> f93873b = new ArrayList();

    /* renamed from: c */
    C46657c f93874c = new C46657c();

    /* renamed from: d */
    public C46661a f93875d;

    /* renamed from: e */
    public String f93876e;

    /* renamed from: f */
    public C36716a f93877f;

    /* renamed from: g */
    public String f93878g = "toplist_homepage_hot";

    /* renamed from: i */
    private C23760c f93879i;

    /* renamed from: j */
    private C23746a f93880j;

    /* renamed from: k */
    private Class f93881k;

    /* renamed from: l */
    private boolean f93882l;

    /* renamed from: a */
    public final void mo75832a(boolean z) {
        this.f93874c.mo93587a(z, this.f93882l);
    }

    /* renamed from: a */
    public final C23562e mo75831a(int i) {
        if (!C9376b.m18558a((Collection<T>) this.f93873b) && i < this.f93873b.size()) {
            return (C23562e) this.f93873b.get(i);
        }
        return null;
    }

    public C36727d(Class cls) {
        boolean z;
        double d;
        this.f93874c.mo48713a((C23546b) this);
        this.f93881k = cls;
        if (cls == StoryFeedItemViewBig.class) {
            z = true;
        } else {
            z = false;
        }
        this.f93882l = z;
        if (this.f93882l) {
            d = 16.0d;
        } else {
            d = 8.0d;
        }
        this.f93880j = new C23746a(C23728o.m58241a(d), C23747a.HORIZONTAL);
    }

    /* renamed from: a */
    public final C1322a mo75830a(Context context) {
        if (this.f93879i == null) {
            HashMap hashMap = new HashMap();
            if (this.f93881k != null) {
                hashMap.put(C36719c.class, this.f93881k);
            } else {
                hashMap.put(C36719c.class, StoryFeedItemView.class);
            }
            hashMap.put(C23755b.class, StoryFeedLoadMoreProgressBar.class);
            hashMap.put(C23746a.class, DividerView.class);
            this.f93879i = new C23760c(context, this.f93873b, hashMap) {
                /* renamed from: b */
                public final C23562e mo49215b() {
                    return null;
                }

                /* renamed from: f */
                public final void mo49217f() {
                    C18842a.m45933a(new Runnable() {
                        public final void run() {
                            C36727d.this.mo75832a(true);
                        }
                    }, 500);
                }
            };
            if (this.f93875d != null && !this.f93875d.f117700c) {
                this.f93879i.mo49221d();
            }
        }
        return this.f93879i;
    }

    /* renamed from: a */
    static String m82663a(List<Aweme> list, String str) {
        for (Aweme aweme : list) {
            if (C23710a.m58196a(aweme.getAuthor().getUid(), str)) {
                return aweme.getAid();
            }
        }
        return null;
    }

    /* renamed from: b */
    static int m82664b(List<Aweme> list, String str) {
        if (list == null) {
            return 0;
        }
        for (Aweme aweme : list) {
            if (aweme != null && aweme.getAuthor() != null && C23710a.m58196a(aweme.getAuthor().getUid(), str)) {
                return aweme.getEnterpriseType();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48715a(C23545a aVar, Object obj) {
        C36726a aVar2;
        C46660d dVar = (C46660d) obj;
        if (this.f93874c == aVar) {
            int i = dVar.f117696a;
            if (i == 1) {
                this.f93875d = (C46661a) dVar.f117697b;
                if (this.f93879i != null) {
                    if (this.f93875d.f117700c) {
                        C23757a aVar3 = this.f93879i.f63342a;
                        if (!aVar3.f63334c) {
                            aVar3.f63334c = true;
                        }
                    } else {
                        this.f93879i.mo49221d();
                    }
                }
                C46661a aVar4 = this.f93875d;
                this.f93876e = aVar4.f117701d;
                if (!aVar4.f117698a) {
                    this.f93873b.clear();
                    this.f93873b.add(this.f93880j);
                } else if (this.f93879i != null) {
                    this.f93879i.mo49220c();
                }
                for (int i2 = aVar4.f117699b; i2 < this.f93874c.mo93588b(); i2++) {
                    this.f93873b.add(new C36719c(new C36706a(this.f93874c.mo93584a(i2), this.f93874c), this, aVar4.f117701d));
                }
                mo48749b();
                if (this.f93877f != null) {
                    this.f93877f.mo65166a(this.f93873b, aVar4);
                }
            } else if (i != 9999) {
                int i3 = 0;
                switch (i) {
                    case 4:
                        String str = (String) dVar.f117697b;
                        C36719c cVar = null;
                        if (!C9431p.m18665a(str, C20902b.m53242a().getCurUserId())) {
                            while (true) {
                                if (i3 < this.f93873b.size()) {
                                    C23562e eVar = (C23562e) this.f93873b.get(i3);
                                    if (!(eVar instanceof C36719c) || !str.equals(((C36719c) eVar).mo75822f())) {
                                        i3++;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                            if (i3 != -1) {
                                cVar = (C36719c) this.f93873b.get(i3);
                            }
                        }
                        if (cVar != null) {
                            try {
                                if (cVar.f93859i.mo75789a().f117676a.isFollowing()) {
                                    aVar2 = C36726a.FOLLOWING_READ;
                                } else {
                                    aVar2 = C36726a.READ;
                                }
                                cVar.mo75818a(aVar2);
                            } catch (Exception e) {
                                C32458a.m75143a(e);
                            }
                            cVar.mo48749b();
                            return;
                        }
                        break;
                    case 5:
                        ((StoryFeedPanel) mo48745a()).setLivePageItemView((C36744d) dVar.f117697b);
                        return;
                    case 6:
                        ((StoryFeedPanel) mo48745a()).setPanelVisibility(((Integer) dVar.f117697b).intValue(), false);
                        break;
                }
            } else if (this.f93879i != null) {
                this.f93879i.mo49220c();
            }
        }
    }
}
