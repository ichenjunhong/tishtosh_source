package com.p683ss.android.ugc.aweme.poi.p2074ui.upload;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SquareImageView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.e */
public final class C39427e extends C1322a<C39428a> {

    /* renamed from: a */
    public boolean f100845a = true;

    /* renamed from: b */
    private final List<String> f100846b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.e$a */
    public static final class C39428a extends C1352v {

        /* renamed from: a */
        SquareImageView f100847a;

        /* renamed from: b */
        DmtTextView f100848b;

        /* renamed from: c */
        View f100849c;

        /* renamed from: d */
        View f100850d;

        public C39428a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.c37);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.poi_upload_img)");
            this.f100847a = (SquareImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.dn8);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.user_nick_name)");
            this.f100848b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.d2v);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.top_divider)");
            this.f100849c = findViewById3;
            View findViewById4 = view.findViewById(R.id.lu);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.bottom_divider)");
            this.f100850d = findViewById4;
        }
    }

    public final int getItemCount() {
        List<String> list = this.f100846b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C39427e(List<String> list) {
        this.f100846b = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bns, viewGroup, false);
        C52711k.m112236a((Object) inflate, "itemView");
        return new C39428a(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C39428a aVar, int i) {
        String str;
        float f;
        float f2;
        C52711k.m112240b(aVar, "holder");
        List<String> list = this.f100846b;
        if (list != null) {
            str = (String) list.get(i);
        } else {
            str = null;
        }
        int itemCount = getItemCount();
        boolean z = this.f100845a;
        if (i == 0) {
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            f = C9432q.m18687b(view.getContext(), 16.0f);
        } else {
            View view2 = aVar.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            f = C9432q.m18687b(view2.getContext(), 8.0f);
        }
        LayoutParams layoutParams = aVar.f100849c.getLayoutParams();
        layoutParams.height = (int) f;
        aVar.f100849c.setLayoutParams(layoutParams);
        if (i == itemCount - 1) {
            View view3 = aVar.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            f2 = C9432q.m18687b(view3.getContext(), 16.0f);
        } else {
            View view4 = aVar.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            f2 = C9432q.m18687b(view4.getContext(), 8.0f);
        }
        LayoutParams layoutParams2 = aVar.f100850d.getLayoutParams();
        layoutParams2.height = (int) f2;
        aVar.f100850d.setLayoutParams(layoutParams2);
        if (str != null) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            C23515d.m57677a((RemoteImageView) aVar.f100847a, sb.toString());
        }
        if (z) {
            aVar.f100848b.setVisibility(0);
            DmtTextView dmtTextView = aVar.f100848b;
            View view5 = aVar.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            String string = view5.getContext().getString(R.string.b70);
            C52711k.m112236a((Object) string, "itemView.context.getStri….string.friends_nickname)");
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
            String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            return;
        }
        aVar.f100848b.setVisibility(8);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i, List list) {
        C39428a aVar = (C39428a) vVar;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(aVar, i);
            return;
        }
        Object obj = list.get(0);
        if (obj == null) {
            throw new C52857u("null cannot be cast to non-null type kotlin.Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            aVar.f100848b.setVisibility(0);
            DmtTextView dmtTextView = aVar.f100848b;
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            String string = view.getContext().getString(R.string.b70);
            C52711k.m112236a((Object) string, "itemView.context.getStri….string.friends_nickname)");
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
            String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
        } else {
            aVar.f100848b.setVisibility(8);
        }
    }
}
