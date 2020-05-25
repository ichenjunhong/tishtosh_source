package com.p683ss.android.ugc.aweme.flowfeed.p1752a;

import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout.C31830a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.a.a */
public abstract class C31745a extends C26840g<Comment> implements C25147a, C31747c {

    /* renamed from: a */
    public final C31748d f82920a = new C31748d(this);

    /* renamed from: b */
    public Aweme f82921b;

    /* renamed from: c */
    public List<User> f82922c;

    /* renamed from: d */
    public C31830a f82923d;

    /* renamed from: e */
    public boolean f82924e;

    /* renamed from: f */
    public String f82925f;

    /* renamed from: g */
    public int f82926g;

    /* renamed from: a */
    public final void mo64620a(C31752g gVar) {
        C52711k.m112240b(gVar, "params");
        this.f82921b = gVar.f82948a;
        this.f82922c = gVar.f82949b;
        this.f82923d = gVar.f82950c;
        this.f82924e = gVar.f82951d;
        this.f82925f = gVar.f82952e;
        this.f82926g = gVar.f82953f;
    }
}
