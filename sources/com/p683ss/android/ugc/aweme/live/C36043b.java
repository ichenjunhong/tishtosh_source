package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.C8608c;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.C8643b;
import com.bytedance.android.livesdkapi.depend.live.C8644c;
import com.bytedance.android.livesdkapi.depend.live.C8645d;
import com.bytedance.android.livesdkapi.depend.live.C8647f;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.live.C8663m;
import com.bytedance.android.livesdkapi.depend.live.C8667q;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f.C8684a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.p431c.C8610b;
import com.bytedance.android.livesdkapi.p455i.C8818h;
import com.bytedance.android.livesdkapi.p457k.C8832a;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.android.livesdkapi.service.C8860c;
import com.bytedance.android.livesdkapi.service.C8863f;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.live.feedpage.C36082a;
import com.p683ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.p683ss.android.ugc.aweme.live.p1919b.C36059a;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.live.settings.C36167c;
import com.p683ss.android.ugc.aweme.p1803i.C33087a;
import com.p683ss.android.ugc.aweme.p1803i.C33088b;
import com.p683ss.android.ugc.aweme.p1803i.C33089c;
import com.p683ss.android.ugc.aweme.p1803i.C33089c.C33090a;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.port.internal.C39655e.C39656a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.story.live.C46639b;
import com.p683ss.android.ugc.aweme.story.model.Story;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.b */
public class C36043b implements ILiveOuterService {
    public void changeLiveHostConfigNetState(boolean z) {
    }

    public void monitorImageNetwork(Object obj) {
    }

    public void tryShowTakeLiveBubble(Fragment fragment, View view, boolean z) {
    }

    public C33087a getDebugHandler() {
        return new C33087a() {
            /* renamed from: a */
            public final Class mo70084a() {
                return null;
            }

            /* renamed from: b */
            public final Class mo70085b() {
                return null;
            }

            /* renamed from: c */
            public final Class mo70086c() {
                return null;
            }
        };
    }

    public C46639b getILiveAllService() {
        return new C46639b() {
            /* renamed from: a */
            public final String mo74804a() {
                return "";
            }

            /* renamed from: a */
            public final void mo74805a(Context context, long j, String str, Bundle bundle, String str2, ArrayList<Long> arrayList) {
            }

            /* renamed from: a */
            public final void mo74806a(String str, Bundle bundle, Context context) {
            }

            /* renamed from: a */
            public final boolean mo74807a(User user) {
                return false;
            }

            /* renamed from: b */
            public final void mo74808b() {
            }
        };
    }

    public C36065d getLive() {
        return new C36065d() {
            /* renamed from: a */
            public final Fragment mo15024a(Context context, Bundle bundle) {
                return null;
            }

            /* renamed from: a */
            public final Fragment mo15025a(C8680c cVar, Bundle bundle) {
                return null;
            }

            /* renamed from: a */
            public final LiveActivityProxy mo15026a(FragmentActivity fragmentActivity, int i) {
                return null;
            }

            /* renamed from: a */
            public final C8643b mo15027a(Context context, ViewGroup viewGroup) {
                return null;
            }

            /* renamed from: a */
            public final C8645d mo15028a(Context context, ViewGroup viewGroup, long j) {
                return null;
            }

            /* renamed from: a */
            public final C8657i mo15029a(long j, Bundle bundle) {
                return null;
            }

            /* renamed from: a */
            public final C8677a mo15030a(Bundle bundle) {
                return null;
            }

            /* renamed from: a */
            public final IMessageManager mo15032a(long j, Context context, String str) {
                return null;
            }

            /* renamed from: a */
            public final <T> T mo15033a(String str, T t) {
                return t;
            }

            /* renamed from: a */
            public final String mo15034a(long j, Bundle bundle, Context context) {
                return null;
            }

            /* renamed from: a */
            public final void mo15035a() {
            }

            /* renamed from: a */
            public final void mo15036a(long j, C8859b bVar) {
            }

            /* renamed from: a */
            public final void mo15037a(long j, C8860c cVar) {
            }

            /* renamed from: a */
            public final void mo74829a(Activity activity, HashMap<String, String> hashMap) {
            }

            /* renamed from: a */
            public final void mo15038a(Context context) {
            }

            /* renamed from: a */
            public final void mo15039a(Context context, C8633b bVar) {
            }

            /* renamed from: a */
            public final void mo15040a(Context context, C8818h hVar) {
            }

            /* renamed from: a */
            public final void mo15041a(String str) {
            }

            /* renamed from: a */
            public final void mo15042a(String str, boolean z) {
            }

            /* renamed from: a */
            public final void mo15043a(Locale locale) {
            }

            /* renamed from: a */
            public final void mo15044a(boolean z) {
            }

            /* renamed from: a */
            public final boolean mo15045a(Context context, Uri uri) {
                return false;
            }

            /* renamed from: b */
            public final Fragment mo15046b(Context context, Bundle bundle) {
                return null;
            }

            /* renamed from: b */
            public final C8610b mo15047b(Bundle bundle) {
                return null;
            }

            /* renamed from: b */
            public final C8863f mo15048b() {
                return null;
            }

            /* renamed from: b */
            public final void mo15049b(String str) {
            }

            /* renamed from: c */
            public final C8661k mo15050c() {
                return null;
            }

            /* renamed from: d */
            public final C8649h mo15051d() {
                return null;
            }

            /* renamed from: e */
            public final C8640b mo15052e() {
                return null;
            }

            /* renamed from: f */
            public final Fragment mo15053f() {
                return null;
            }

            /* renamed from: g */
            public final C8644c mo15054g() {
                return null;
            }

            /* renamed from: h */
            public final C8683f mo15055h() {
                return null;
            }

            /* renamed from: i */
            public final int mo15056i() {
                return 0;
            }

            /* renamed from: j */
            public final int mo15057j() {
                return 0;
            }

            /* renamed from: k */
            public final C8667q mo15058k() {
                return null;
            }

            /* renamed from: l */
            public final String mo15059l() {
                return null;
            }

            /* renamed from: m */
            public final C8608c mo15060m() {
                return null;
            }

            /* renamed from: n */
            public final C8647f mo15061n() {
                return null;
            }

            /* renamed from: o */
            public final C8663m mo15062o() {
                return null;
            }

            /* renamed from: p */
            public final boolean mo74830p() {
                return false;
            }

            /* renamed from: q */
            public final void mo74831q() {
            }

            /* renamed from: a */
            public final C8682e mo15031a(C8832a aVar) {
                return new C8682e() {
                    /* renamed from: a */
                    public final void mo8898a(C8681d dVar) {
                    }

                    /* renamed from: b */
                    public final void mo8903b(int i) {
                    }

                    /* renamed from: c */
                    public final void mo8905c(int i) {
                    }

                    /* renamed from: d */
                    public final void mo8906d(int i) {
                    }

                    /* renamed from: g */
                    public final String mo8907g() {
                        return null;
                    }

                    /* renamed from: h */
                    public final String mo8908h() {
                        return null;
                    }

                    /* renamed from: i */
                    public final List<Pair<String, String>> mo8909i() {
                        return null;
                    }

                    /* renamed from: j */
                    public final int mo8910j() {
                        return 0;
                    }

                    /* renamed from: k */
                    public final void mo8911k() {
                    }

                    /* renamed from: m */
                    public final void mo8912m() {
                    }

                    /* renamed from: n */
                    public final Fragment mo8913n() {
                        return null;
                    }
                };
            }
        };
    }

    public C36059a getLiveCommonManager() {
        return new C36059a() {
        };
    }

    public C36071e getLiveFeedFactory() {
        return new C36071e() {
            /* renamed from: a */
            public final void mo74832a(Context context) {
            }

            /* renamed from: a */
            public final void mo74833a(Map<String, String> map) {
            }
        };
    }

    public C36075f getLiveInitService() {
        return new C36075f() {
            /* renamed from: a */
            public final boolean mo74818a() {
                return false;
            }

            /* renamed from: b */
            public final boolean mo74819b() {
                return false;
            }
        };
    }

    public C39655e getLiveModule() {
        return new C39655e() {
            /* renamed from: a */
            public final View mo74809a() {
                return null;
            }

            /* renamed from: a */
            public final void mo74810a(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
            }

            /* renamed from: a */
            public final void mo74811a(ViewGroup viewGroup) {
            }

            /* renamed from: a */
            public final void mo74812a(ViewGroup viewGroup, Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo74813a(C39656a aVar) {
            }

            /* renamed from: a */
            public final void mo74814a(View... viewArr) {
            }

            /* renamed from: b */
            public final ImageView mo74815b() {
                return null;
            }
        };
    }

    public C36095h getLiveOuterSettingService() {
        return new C36095h() {
            /* renamed from: a */
            public final C36097j mo74816a() {
                return null;
            }

            /* renamed from: a */
            public final void mo74817a(C36167c cVar) {
            }
        };
    }

    public C36098k getLiveServiceAdapter() {
        return new C36098k() {
            /* renamed from: a */
            public final void mo74826a(boolean z) {
            }

            /* renamed from: a */
            public final boolean mo74827a() {
                return false;
            }

            /* renamed from: b */
            public final void mo74828b(boolean z) {
            }
        };
    }

    public C36082a getLiveStateManager() {
        return new C36082a() {
            /* renamed from: a */
            public final LiveStateApi mo74798a() {
                return null;
            }

            /* renamed from: a */
            public final void mo74799a(long j) {
            }

            /* renamed from: a */
            public final void mo74800a(User user, List<User> list, C1710e<Long> eVar) {
            }

            /* renamed from: a */
            public final void mo74801a(Class cls, User user, C1710e<Map<Long, Long>> eVar) {
            }

            /* renamed from: a */
            public final void mo74802a(List<Aweme> list) {
            }

            /* renamed from: b */
            public final void mo74803b(List<FollowFeed> list) {
            }
        };
    }

    public C33089c getLiveWatcherUtils() {
        return new C33089c() {
            /* renamed from: a */
            public final void mo70087a() {
            }

            /* renamed from: a */
            public final void mo70088a(Context context, long j, Bundle bundle, String str, ArrayList<Long> arrayList) {
            }

            /* renamed from: a */
            public final void mo70089a(Context context, Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo70090a(Context context, Bundle bundle, String str) {
            }

            /* renamed from: a */
            public final void mo70091a(Context context, User user, Rect rect, String str, Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo70092a(Context context, User user, Rect rect, List<Story> list, String str, int i, boolean z, int i2) {
            }

            /* renamed from: a */
            public final void mo70093a(Context context, User user, C33090a aVar) {
            }

            /* renamed from: a */
            public final void mo70094a(Context context, User user, String str) {
            }

            /* renamed from: a */
            public final void mo70095a(Context context, User user, String str, String str2, Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo70096a(Context context, User user, boolean z, C33090a aVar) {
            }

            /* renamed from: a */
            public final void mo70097a(C36006a aVar) {
            }
        };
    }

    public C8683f startLiveManager() {
        return new C8683f() {
            /* renamed from: a */
            public final void mo8930a() {
            }

            /* renamed from: a */
            public final void mo8931a(C8684a aVar) {
            }

            /* renamed from: b */
            public final void mo8932b(C8684a aVar) {
            }
        };
    }

    public C33088b generateLivPreview(final AbsActivity absActivity) {
        return new C33088b() {
        };
    }

    public C36068c generateLivePlayHelper(Runnable runnable, C36067b bVar) {
        return new C36068c() {
            /* renamed from: a */
            public final void mo74820a() {
            }

            /* renamed from: a */
            public final void mo74821a(boolean z) {
            }

            /* renamed from: a */
            public final void mo74822a(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
            }

            /* renamed from: b */
            public final void mo74823b() {
            }

            /* renamed from: c */
            public final void mo74824c() {
            }

            /* renamed from: d */
            public final TextureRenderView mo74825d() {
                return null;
            }
        };
    }
}
