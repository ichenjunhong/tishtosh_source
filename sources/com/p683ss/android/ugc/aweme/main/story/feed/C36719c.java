package com.p683ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.C23556a.C23557a;
import com.p683ss.android.ugc.aweme.base.mvvm.impl.C23563a;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.main.p1942e.C36619b;
import com.p683ss.android.ugc.aweme.main.story.p1945a.C36706a;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.story.model.C46655a;
import com.p683ss.android.ugc.aweme.story.model.Story;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.c */
public class C36719c extends C23563a<StoryFeedItemView> {

    /* renamed from: b */
    public static final String f93852b = "c";

    /* renamed from: c */
    public String f93853c = "";

    /* renamed from: d */
    public boolean f93854d = true;

    /* renamed from: e */
    public long f93855e;

    /* renamed from: f */
    public C23556a f93856f;

    /* renamed from: g */
    public CharSequence f93857g;

    /* renamed from: h */
    public OnClickListener f93858h;

    /* renamed from: i */
    public C36706a f93859i;

    /* renamed from: j */
    C36727d f93860j;

    /* renamed from: k */
    public C36726a f93861k;

    /* renamed from: l */
    public int f93862l;

    /* renamed from: com.ss.android.ugc.aweme.main.story.feed.c$a */
    public enum C36726a {
        NEW,
        DOWNLOADING,
        READ,
        LIVE,
        FOLLOWING_NEW,
        FOLLOWING_READ
    }

    /* renamed from: f */
    public final String mo75822f() {
        return this.f93859i.f93830a;
    }

    /* renamed from: d */
    public final boolean mo75820d() {
        if (this.f93861k == C36726a.LIVE) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final String mo75824h() {
        if (this.f93854d) {
            return "toplist_homepage_follow";
        }
        String str = this.f93860j.f93878g;
        if (str == null) {
            return "toplist_homepage_hot";
        }
        return str;
    }

    /* renamed from: e */
    public final boolean mo75821e() {
        if (this.f93861k == C36726a.FOLLOWING_NEW || this.f93861k == C36726a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo75823g() {
        if (mo75820d()) {
            return this.f93859i.f93830a.replace(CustomActionPushReceiver.f104061f, "");
        }
        return this.f93859i.f93830a;
    }

    /* renamed from: c */
    public final int mo75819c() {
        if (this.f93860j == null) {
            return -1;
        }
        C36727d dVar = this.f93860j;
        String f = mo75822f();
        int i = 0;
        for (int i2 = 0; i2 < dVar.f93874c.mo93588b(); i2++) {
            String a = dVar.f93874c.mo93584a(i2);
            if (dVar.f93874c.mo93583a(a).f117676a.isFollowing()) {
                i++;
                if (C23710a.m58196a(f, a)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: i */
    private void m82655i() {
        String str;
        if (this.f93859i.mo75789a() != null) {
            final Story story = this.f93859i.mo75789a().f117676a;
            final User userInfo = story.getUserInfo();
            this.f93856f = new C23556a(C23557a.URL_MODEL, userInfo.getAvatarThumb());
            if (!TextUtils.isEmpty(userInfo.getRemarkName())) {
                str = userInfo.getRemarkName();
            } else {
                str = userInfo.getNickname();
            }
            this.f93857g = str;
            switch (this.f93861k) {
                case LIVE:
                    this.f93855e = userInfo.roomId;
                    this.f93862l = story.type;
                    this.f93858h = new OnClickListener() {
                        public final void onClick(View view) {
                            int i;
                            int i2;
                            ClickInstrumentation.onClick(view);
                            Rect c = C23729p.m58268c(view);
                            String h = C36719c.this.mo75824h();
                            if (userInfo != null) {
                                userInfo.setRequestId(C36719c.this.f93853c);
                            }
                            C33089c liveWatcherUtils = C36173w.m81665a().getLiveWatcherUtils();
                            Context context = view.getContext();
                            User user = userInfo;
                            List<Story> list = C36719c.this.f93859i.f93831b.f117687b;
                            if (C36719c.this.f93854d) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            boolean z = C36719c.this.f93859i.f93831b.f117688c;
                            if (story == null) {
                                i2 = 1;
                            } else {
                                i2 = story.type;
                            }
                            liveWatcherUtils.mo70092a(context, user, c, list, h, i, z, i2);
                            C53755c.m114319a().mo112960d(new C36619b(1));
                        }
                    };
                    return;
                case FOLLOWING_NEW:
                case FOLLOWING_READ:
                    this.f93858h = new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            C36719c.this.f93861k = C36726a.FOLLOWING_READ;
                            C36719c.this.mo48749b();
                            C36719c cVar = C36719c.this;
                            C18842a.m45933a(new Runnable() {
                                public final void run() {
                                    C36719c.this.f93861k = C36726a.FOLLOWING_READ;
                                    C36719c.this.mo48749b();
                                }
                            }, 2000);
                            if (!(cVar.f93860j == null || cVar.f93859i == null)) {
                                C36727d dVar = cVar.f93860j;
                                view.getContext();
                                String str = cVar.f93859i.f93830a;
                                try {
                                    boolean isRead = dVar.f93874c.mo93583a(str).f117676a.isRead();
                                    ArrayList arrayList = new ArrayList();
                                    for (int i = 0; i < dVar.f93874c.mo93588b(); i++) {
                                        String a = dVar.f93874c.mo93584a(i);
                                        Story story = dVar.f93874c.mo93583a(a).f117676a;
                                        if (story.isFollowing() && (isRead || !story.isRead())) {
                                            arrayList.addAll(dVar.f93874c.mo93583a(a).f117677b.getAwemeList());
                                        }
                                    }
                                    C367302 r0 = new C26875a<Aweme, Object>() {

                                        /* renamed from: a */
                                        List<Aweme> f93885a;

                                        public final boolean checkParams(Object... objArr) {
                                            return false;
                                        }

                                        public final List getItems() {
                                            return this.f93885a;
                                        }

                                        public final boolean isHasMore() {
                                            return false;
                                        }

                                        public final void loadMoreList(Object... objArr) {
                                        }

                                        public final void refreshList(Object... objArr) {
                                        }

                                        public final void setItems(List<Aweme> list) {
                                            this.f93885a = list;
                                        }
                                    };
                                    r0.setItems(arrayList);
                                    C31213v.m72896a((C26875a) r0);
                                    String a2 = C36727d.m82663a((List<Aweme>) arrayList, str);
                                    int b = C36727d.m82664b(arrayList, str);
                                    C41302w a3 = C41302w.m91042a();
                                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                                    sb.append(a2);
                                    a3.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "toplist_friend").mo83870a("video_from", "from_window_following").mo83868a("profile_enterprise_type", b).mo83871a());
                                } catch (Exception e) {
                                    C32458a.m75143a(e);
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("order", C36719c.this.mo75819c());
                            } catch (JSONException unused) {
                            }
                            C26890h.onEvent(MobClick.obtain().setEventName("head_click").setLabelName("toplist").setValue(C36719c.this.mo75822f()).setJsonObject(jSONObject));
                        }
                    };
                    return;
                default:
                    this.f93858h = new OnClickListener() {
                        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
                            if (r5 == false) goto L_0x002c;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void onClick(android.view.View r5) {
                            /*
                                r4 = this;
                                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                                com.ss.android.ugc.aweme.main.story.feed.c r5 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.this
                                com.ss.android.ugc.aweme.main.story.feed.c$a r5 = r5.f93861k
                                com.ss.android.ugc.aweme.main.story.feed.c$a r0 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.C36726a.READ
                                r1 = 0
                                if (r5 == r0) goto L_0x003a
                                com.ss.android.ugc.aweme.main.story.feed.c r5 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.this
                                com.ss.android.ugc.aweme.main.story.a.a r5 = r5.f93859i
                                com.ss.android.ugc.aweme.story.model.a r5 = r5.mo75789a()
                                com.ss.android.ugc.aweme.story.model.StoryDetail r0 = r5.f117677b
                                r2 = 1
                                if (r0 == 0) goto L_0x002b
                                com.ss.android.ugc.aweme.story.model.StoryDetail r0 = r5.f117677b
                                if (r0 == 0) goto L_0x0027
                                com.ss.android.ugc.aweme.story.model.StoryDetail r5 = r5.f117677b
                                boolean r5 = r5.needDownloadFirstCover()
                                if (r5 == 0) goto L_0x0027
                                r5 = 1
                                goto L_0x0028
                            L_0x0027:
                                r5 = 0
                            L_0x0028:
                                if (r5 != 0) goto L_0x002b
                                goto L_0x002c
                            L_0x002b:
                                r2 = 0
                            L_0x002c:
                                if (r2 != 0) goto L_0x003a
                                com.ss.android.ugc.aweme.main.story.feed.c r5 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.this
                                com.ss.android.ugc.aweme.main.story.feed.c$a r0 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.C36726a.DOWNLOADING
                                r5.f93861k = r0
                                com.ss.android.ugc.aweme.main.story.feed.c r5 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.this
                                r5.mo48749b()
                                return
                            L_0x003a:
                                com.ss.android.ugc.aweme.main.story.feed.c r5 = com.p683ss.android.ugc.aweme.main.story.feed.C36719c.this
                                com.ss.android.ugc.aweme.main.story.feed.c$5 r0 = new com.ss.android.ugc.aweme.main.story.feed.c$5
                                r0.<init>()
                                r2 = 2000(0x7d0, float:2.803E-42)
                                com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45933a(r0, r2)
                                com.ss.android.ugc.aweme.main.story.a.a r5 = r5.f93859i
                                com.ss.android.ugc.aweme.story.model.a r5 = r5.mo75789a()
                                com.ss.android.ugc.aweme.story.model.Story r5 = r5.f117676a
                                com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                java.lang.String r3 = "aweme://aweme/detail/"
                                r2.<init>(r3)
                                java.util.List r5 = r5.getAwemes()
                                java.lang.Object r5 = r5.get(r1)
                                com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r5
                                java.lang.String r5 = r5.getAid()
                                r2.append(r5)
                                java.lang.String r5 = r2.toString()
                                r0.mo83861a(r5)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.story.feed.C36719c.C367223.onClick(android.view.View):void");
                        }
                    };
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo75818a(C36726a aVar) {
        boolean z;
        boolean z2;
        if (this.f93861k != aVar) {
            C36726a aVar2 = this.f93861k;
            boolean d = mo75820d();
            boolean e = mo75821e();
            this.f93861k = aVar;
            boolean d2 = mo75820d();
            boolean e2 = mo75821e();
            boolean z3 = false;
            if (d != d2) {
                z = true;
            } else {
                z = false;
            }
            if (e != e2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (aVar2 == null || z || z2) {
                z3 = true;
            }
            if (z3) {
                m82655i();
            }
        }
    }

    public C36719c(C36706a aVar, C36727d dVar, String str) {
        C36726a aVar2;
        this.f93859i = aVar;
        this.f93860j = dVar;
        if (this.f93859i != null) {
            C46655a a = this.f93859i.mo75789a();
            if (a == null) {
                StringBuilder sb = new StringBuilder("loadCommonStatus() called, with appstory = [null], mModel.getUid() = [");
                sb.append(this.f93859i.f93830a);
                sb.append("], UserManager.inst().getCurUserId() = [");
                sb.append(C20902b.m53242a().getCurUserId());
                sb.append("]");
                C32458a.m75144a(sb.toString());
            } else if (a.f117676a.isLive()) {
                mo75818a(C36726a.LIVE);
            } else if (a.f117676a.isFollowing()) {
                if (a.f117676a.isRead()) {
                    aVar2 = C36726a.FOLLOWING_READ;
                } else {
                    aVar2 = C36726a.FOLLOWING_NEW;
                }
                mo75818a(aVar2);
            } else if (a.f117676a.isRead()) {
                mo75818a(C36726a.READ);
            } else {
                mo75818a(C36726a.NEW);
            }
        }
        this.f93853c = str;
    }
}
