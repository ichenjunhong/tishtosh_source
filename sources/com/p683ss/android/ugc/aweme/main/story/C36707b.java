package com.p683ss.android.ugc.aweme.main.story;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1418i.C23547c;
import com.p683ss.android.ugc.aweme.commercialize.p1566f.C25831b;
import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.model.StoryResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.main.story.b */
public final class C36707b {

    /* renamed from: a */
    public static boolean f93832a = true;

    /* renamed from: d */
    public static HorizontalFeedApi f93833d = ((HorizontalFeedApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(HorizontalFeedApi.class));

    /* renamed from: b */
    public int f93834b = 2;

    /* renamed from: c */
    public long f93835c;

    public C36707b(int i) {
        this.f93834b = i;
    }

    /* renamed from: a */
    public final void mo75791a(long j) {
        if (j != C23542f.m57718c().mo48700a("last_update_time", -1)) {
            C23542f.m57718c().mo48708b("last_update_time", j);
        }
    }

    /* renamed from: a */
    public final void mo75792a(final C23547c<StoryResponse> cVar) {
        final String str;
        if (f93832a) {
            str = "1";
        } else {
            str = "0";
        }
        final String str2 = "0";
        C0013i.m16a((Callable<TResult>) new Callable<StoryResponse>() {
            public final /* synthetic */ Object call() throws Exception {
                StoryResponse storyResponse = (StoryResponse) C36707b.f93833d.getStory(C36707b.this.f93835c, 20, C36707b.this.f93834b, str, str2).get();
                C36707b.this.mo75791a((long) storyResponse.getLatestTime());
                C36707b.this.f93835c = storyResponse.getCursor();
                C25831b.m62485a(storyResponse.getCommerceStoryFeed());
                return storyResponse;
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<StoryResponse, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (cVar != null) {
                    if (iVar.mo33d() || iVar.mo31c()) {
                        cVar.mo48716a(iVar.mo35f());
                    } else {
                        cVar.mo48717a(iVar.mo34e());
                    }
                }
                return null;
            }
        }, C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo75793a(boolean z, C23547c<C36705a> cVar) {
        String str;
        String str2;
        if (f93832a) {
            str = "1";
        } else {
            str = "0";
        }
        if (f93832a || !z) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        C0013i.m18a((Callable<TResult>) new C36710c<TResult>(this, str, str2), (Executor) C24076h.m58902c()).mo19a((C0011g<TResult, TContinuationResult>) new C36711d<TResult,TContinuationResult>(this, str, str2)).mo20a((C0011g<TResult, TContinuationResult>) new C36712e<TResult,TContinuationResult>(cVar), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C36705a mo75790a(String str, String str2, C0013i iVar) throws Exception {
        C36705a aVar = new C36705a();
        if (iVar.mo26b() && C46635b.m101190a()) {
            aVar.f93829b = (C36744d) iVar.mo34e();
        }
        this.f93835c = 0;
        try {
            aVar.f93828a = (StoryResponse) f93833d.getStory(0, 20, this.f93834b, str, str2).get();
            mo75791a((long) aVar.f93828a.getLatestTime());
            this.f93835c = aVar.f93828a.getCursor();
            C25831b.m62485a(aVar.f93828a.getCommerceStoryFeed());
        } catch (Exception e) {
            if (!aVar.mo75788b()) {
                throw e;
            }
        }
        f93832a = false;
        return aVar;
    }
}
