package com.p683ss.android.ugc.aweme.comment.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.comment.adapter.C25104b.C25106b;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.c */
public final class C25107c extends C1352v {

    /* renamed from: a */
    public C25106b f66527a;

    /* renamed from: b */
    public CommentAtSummonFriendItem f66528b;

    /* renamed from: c */
    Aweme f66529c;

    /* renamed from: a */
    public static String m61016a(CommentAtUser commentAtUser) {
        if (commentAtUser == null) {
            return "";
        }
        if (!TextUtils.isEmpty(commentAtUser.uniqueId)) {
            return commentAtUser.uniqueId;
        }
        if (commentAtUser.shortId == null) {
            return "";
        }
        return commentAtUser.shortId;
    }

    public C25107c(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C25107c f66530a;

            {
                this.f66530a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f66530a.f66528b;
                if (commentAtSummonFriendItem != null) {
                    C25106b bVar = this.f66530a.f66527a;
                    if (bVar != null) {
                        bVar.mo51192a(this.f66530a.getPosition(), commentAtSummonFriendItem);
                    }
                }
            }
        });
        ((DmtTextView) view.findViewById(R.id.f2o)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C25107c f66531a;

            {
                this.f66531a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f66531a.f66528b;
                if (commentAtSummonFriendItem != null) {
                    C25106b bVar = this.f66531a.f66527a;
                    if (bVar != null) {
                        bVar.mo51193a(CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser));
                    }
                }
            }
        });
    }
}
