package com.p683ss.android.ugc.aweme.flowfeed.p1754c;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout.C31830a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.c.e */
public interface C31758e extends C31830a {
    /* renamed from: a */
    void mo64658a(Context context, Aweme aweme);

    /* renamed from: a */
    void mo64659a(View view, View view2, Aweme aweme);

    /* renamed from: a */
    void mo64660a(View view, View view2, Aweme aweme, User user);

    /* renamed from: a */
    void mo64661a(View view, View view2, User user);

    /* renamed from: a */
    void mo64662a(View view, View view2, User user, String str, String str2);

    /* renamed from: a */
    void mo64663a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme);

    /* renamed from: a */
    void mo64664a(Aweme aweme);

    /* renamed from: a */
    void mo64665a(Aweme aweme, List<String> list);

    /* renamed from: a */
    void mo64666a(User user, List<String> list, OnShowListener onShowListener, OnDismissListener onDismissListener);

    /* renamed from: b */
    void mo64667b(View view, View view2, Aweme aweme);

    /* renamed from: b */
    void mo64668b(View view, View view2, Aweme aweme, User user);

    /* renamed from: b */
    void mo64669b(Aweme aweme);

    /* renamed from: c */
    C26875a mo64670c();

    /* renamed from: c */
    C26875a mo64671c(Aweme aweme);
}
