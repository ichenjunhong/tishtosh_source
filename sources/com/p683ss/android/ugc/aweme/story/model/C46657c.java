package com.p683ss.android.ugc.aweme.story.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.p1418i.C23545a;
import com.p683ss.android.ugc.aweme.base.p1418i.C23547c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.main.story.C36705a;
import com.p683ss.android.ugc.aweme.main.story.C36707b;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.C46637c;
import com.p683ss.android.ugc.aweme.story.model.C46660d.C46661a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.story.model.c */
public final class C46657c extends C23545a<C46660d> {

    /* renamed from: a */
    public List<String> f117686a = new ArrayList();

    /* renamed from: b */
    public List<Story> f117687b = new ArrayList();

    /* renamed from: c */
    public boolean f117688c = true;

    /* renamed from: d */
    private Map<String, C46655a> f117689d = new HashMap();

    /* renamed from: e */
    private int f117690e = 3;

    /* renamed from: f */
    private C36707b f117691f;

    /* renamed from: b */
    public final int mo93588b() {
        return this.f117686a.size();
    }

    /* renamed from: a */
    public final void mo93585a(C46660d dVar) {
        mo48712a();
        mo48714a(dVar);
    }

    /* renamed from: a */
    public final C46655a mo93583a(String str) {
        return (C46655a) this.f117689d.get(str);
    }

    /* renamed from: a */
    public final String mo93584a(int i) {
        return (String) this.f117686a.get(i);
    }

    /* renamed from: a */
    public final void mo93587a(boolean z, boolean z2) {
        m101251a(true, z, z2);
    }

    /* renamed from: a */
    public final void mo93586a(boolean z, StoryResponse storyResponse) {
        String str;
        if (!z) {
            this.f117686a.clear();
            this.f117687b.clear();
            String curUserId = C20902b.m53242a().getCurUserId();
            C46655a aVar = (C46655a) this.f117689d.get(curUserId);
            this.f117689d.clear();
            if (aVar != null) {
                this.f117689d.put(curUserId, aVar);
            }
        }
        List<Story> storyFeed = storyResponse.getStoryFeed();
        String requestId = storyResponse.getRequestId();
        if (!C9376b.m18558a((Collection<T>) storyFeed)) {
            for (Story story : storyFeed) {
                if (story != null && !story.isStory()) {
                    if (!story.isLive() || C46635b.m101190a()) {
                        if (story.isNewLiveType()) {
                            C41589c.m91432a();
                            if (!MigrateABTestModel.getInstance().isSkyLightRecommendLive()) {
                            }
                        }
                        if (story.isFollowing() && C46637c.m101192a().mo93526a(story.getUid())) {
                            story.setRead();
                        }
                        if (story.isLive()) {
                            str = story.getLiveUid();
                            this.f117687b.add(story);
                        } else {
                            str = story.getUserInfo().getUid();
                        }
                        StoryDetail storyDetail = null;
                        if (story.isFollowing() && story.getAwemes() != null) {
                            storyDetail = new StoryDetail();
                            storyDetail.setRequestId(requestId);
                            List awemes = story.getAwemes();
                            int size = awemes.size();
                            for (int i = 0; i < size; i++) {
                                Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) awemes.get(i));
                                IRequestIdService a = C23325e.m57379a();
                                StringBuilder sb = new StringBuilder();
                                sb.append(updateAweme.getAid());
                                sb.append(8000);
                                a.setRequestIdAndIndex(sb.toString(), requestId, i);
                                awemes.set(i, updateAweme);
                            }
                            storyDetail.setAwemeList(awemes);
                        }
                        this.f117686a.add(str);
                        this.f117689d.put(str, new C46655a(story, storyDetail));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m101251a(boolean z, final boolean z2, boolean z3) {
        int i;
        if (!z2 || this.f117688c) {
            if (this.f117691f == null) {
                if (z3) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.f117691f = new C36707b(i);
            }
            if (z2) {
                this.f117691f.mo75792a((C23547c<StoryResponse>) new C23547c<StoryResponse>() {
                    /* renamed from: a */
                    public final void mo48716a(Exception exc) {
                        C46657c.this.mo93585a(new C46660d(9999, exc));
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo48717a(Object obj) {
                        boolean z;
                        StoryResponse storyResponse = (StoryResponse) obj;
                        C46657c.this.f117688c = storyResponse.hasMore;
                        int size = C46657c.this.f117686a.size();
                        C46657c.this.mo93586a(z2, storyResponse);
                        C46657c cVar = C46657c.this;
                        boolean z2 = z2;
                        boolean z3 = C46657c.this.f117688c;
                        String str = storyResponse.requestId;
                        if (storyResponse.autoOpenWindow == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C46661a aVar = new C46661a(z2, size, z3, str, z, true);
                        cVar.mo93585a(new C46660d(1, aVar));
                    }
                });
            } else {
                this.f117691f.mo75793a(true, new C23547c<C36705a>() {
                    /* renamed from: a */
                    public final void mo48716a(Exception exc) {
                        C46657c.this.mo93585a(new C46660d(9999, exc));
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo48717a(Object obj) {
                        int i;
                        boolean z;
                        C36705a aVar = (C36705a) obj;
                        C46657c cVar = C46657c.this;
                        if (aVar.mo75787a()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        cVar.mo93585a(new C46660d(6, Integer.valueOf(i)));
                        C46657c.this.mo93585a(new C46660d(5, aVar.f93829b));
                        if (aVar.f93828a != null) {
                            StoryResponse storyResponse = aVar.f93828a;
                            C46657c.this.f117688c = storyResponse.hasMore;
                            C46657c.this.mo93586a(z2, storyResponse);
                            C46657c cVar2 = C46657c.this;
                            boolean z2 = z2;
                            boolean z3 = C46657c.this.f117688c;
                            String str = storyResponse.requestId;
                            if (aVar.f93828a.autoOpenWindow == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C46661a aVar2 = new C46661a(z2, 0, z3, str, z, aVar.mo75787a());
                            cVar2.mo93585a(new C46660d(1, aVar2));
                        }
                    }
                });
            }
        }
    }
}
