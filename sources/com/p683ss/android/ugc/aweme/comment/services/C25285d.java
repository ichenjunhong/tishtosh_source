package com.p683ss.android.ugc.aweme.comment.services;

import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.d */
public interface C25285d {
    /* renamed from: a */
    void mo51779a(int i, int i2, String str, String str2, String str3);

    /* renamed from: a */
    void mo51780a(Exception exc, int i, Comment comment);

    /* renamed from: b */
    void mo51781b(Comment comment);

    /* renamed from: b */
    void mo51782b(String str);

    /* renamed from: c */
    void mo51783c(Comment comment);

    /* renamed from: e */
    void mo51784e(boolean z);

    /* renamed from: e_ */
    void mo51785e_(boolean z);

    /* renamed from: f */
    void mo51786f(boolean z);

    /* renamed from: h */
    Aweme mo51787h();

    /* renamed from: i */
    Comment mo51788i();

    /* renamed from: j */
    String mo51789j();

    /* renamed from: k */
    int mo51790k();

    /* renamed from: l */
    boolean mo51791l();

    /* renamed from: m */
    boolean mo51792m();

    void onEvent(C32385a aVar);
}
