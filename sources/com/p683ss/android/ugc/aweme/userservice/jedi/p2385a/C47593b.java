package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import android.arch.lifecycle.C0199s;
import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.story.api.p2334b.C46624b;
import com.p683ss.android.ugc.aweme.userservice.jedi.C47591a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b */
public final class C47593b {

    /* renamed from: a */
    public final ConcurrentHashMap<String, User> f120054a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final C0199s<FollowStatus> f120055b = new C47595a(this);

    /* renamed from: c */
    private final C0199s<C46624b> f120056c = new C47597b(this);

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$a */
    static final class C47595a<T> implements C0199s<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ C47593b f120058a;

        /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$a$a */
        static final class C47596a<T> implements C1710e<C11575f<? extends User>> {

            /* renamed from: a */
            final /* synthetic */ FollowStatus f120059a;

            /* renamed from: b */
            final /* synthetic */ C47595a f120060b;

            /* renamed from: c */
            final /* synthetic */ FollowStatus f120061c;

            C47596a(FollowStatus followStatus, C47595a aVar, FollowStatus followStatus2) {
                this.f120059a = followStatus;
                this.f120060b = aVar;
                this.f120061c = followStatus2;
            }

            public final /* synthetic */ void accept(Object obj) {
                User user = (User) ((C11575f) obj).mo22313a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        C52711k.m112236a((Object) clone, "user");
                        int followStatus = clone.getFollowStatus();
                        FollowStatus followStatus2 = this.f120059a;
                        C52711k.m112236a((Object) followStatus2, "this");
                        if (followStatus != followStatus2.followStatus) {
                            FollowStatus followStatus3 = this.f120059a;
                            C52711k.m112236a((Object) followStatus3, "this");
                            clone.setFollowStatus(followStatus3.followStatus);
                            Map map = this.f120060b.f120058a.f120054a;
                            String uid = clone.getUid();
                            C52711k.m112236a((Object) uid, "user.uid");
                            map.put(uid, clone);
                            C47603g a = C47591a.m103051a();
                            String uid2 = clone.getUid();
                            C52711k.m112236a((Object) uid2, "user.uid");
                            a.mo22280a(uid2, clone);
                        }
                    }
                }
            }
        }

        C47595a(C47593b bVar) {
            this.f120058a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            if (followStatus != null) {
                String str = followStatus.userId;
                if (str != null) {
                    C47591a.m103051a().mo22278a(str).mo6545f((C1710e<? super T>) new C47596a<Object>(followStatus, this, followStatus));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$b */
    static final class C47597b<T> implements C0199s<C46624b> {

        /* renamed from: a */
        final /* synthetic */ C47593b f120062a;

        /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.b$b$a */
        static final class C47598a<T> implements C1710e<C11575f<? extends User>> {

            /* renamed from: a */
            final /* synthetic */ C47597b f120063a;

            C47598a(C47597b bVar) {
                this.f120063a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                User user = (User) ((C11575f) obj).mo22313a();
                if (user != null) {
                    User clone = user.clone();
                    if (clone != null) {
                        C52711k.m112236a((Object) clone, "user");
                        clone.setHasUnreadStory(false);
                        Map map = this.f120063a.f120062a.f120054a;
                        String uid = clone.getUid();
                        C52711k.m112236a((Object) uid, "user.uid");
                        map.put(uid, clone);
                        C47603g a = C47591a.m103051a();
                        String uid2 = clone.getUid();
                        C52711k.m112236a((Object) uid2, "user.uid");
                        a.mo22280a(uid2, clone);
                    }
                }
            }
        }

        C47597b(C47593b bVar) {
            this.f120062a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C46624b bVar = (C46624b) obj;
            if (bVar != null && bVar.f117626b) {
                C47603g a = C47591a.m103051a();
                String str = bVar.f117625a;
                C52711k.m112236a((Object) str, "this.userId");
                a.mo22278a(str).mo6545f((C1710e<? super T>) new C47598a<Object>(this));
            }
        }
    }

    public C47593b() {
        C23552a.m57751a().mo48724a("#FollowStatus", FollowStatus.class).observeForever(this.f120055b);
        C52711k.m112240b(this.f120056c, "storyReadObserver");
        C11571b.m23673a((C11536c<K, V>) C47591a.m103052b().f120072d).mo22301a(true, (C11574e<?, ?>[]) new C11574e[0]).mo6514a(C2168a.m6523d()).mo6545f((C1710e<? super T>) new C1710e<List<? extends C52847n<? extends String, ? extends User>>>(this) {

            /* renamed from: a */
            final /* synthetic */ C47593b f120057a;

            {
                this.f120057a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                boolean z;
                List<C52847n> list = (List) obj;
                C52711k.m112236a((Object) list, "pairList");
                for (C52847n nVar : list) {
                    C47593b bVar = this.f120057a;
                    User user = (User) this.f120057a.f120054a.get(nVar.getFirst());
                    User user2 = (User) nVar.getSecond();
                    if (!(user == null || user2 == null || user.getFollowStatus() == user2.getFollowStatus())) {
                        FollowStatus followStatus = new FollowStatus(user2.getUid(), user2.getFollowStatus());
                        if (user.getFollowStatus() == 0 || user2.getFollowStatus() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        followStatus.isFollowChange = z;
                        C47718bf.m103288a(followStatus);
                        C23552a.m57751a().mo48724a("#FollowStatus", FollowStatus.class).postValue(followStatus);
                        MainServiceImpl.createIMainServicebyMonsterPlugin().updateIMUserFollowStatus(user2);
                    }
                    this.f120057a.f120054a.put(nVar.getFirst(), nVar.getSecond());
                }
            }
        });
    }
}
