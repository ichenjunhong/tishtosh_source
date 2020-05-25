package com.p683ss.android.ugc.aweme.donation;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.donation.d */
public final class C29038d extends C26840g<C29048i> {

    /* renamed from: a */
    public final C29020b f75983a;

    public C29038d(C29020b bVar) {
        C52711k.m112240b(bVar, "fragment");
        this.f75983a = bVar;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bi0, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C29043h(inflate, this.f75983a);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        long j;
        UrlModel urlModel;
        List list;
        Object obj;
        if ((vVar instanceof C29043h) && mo50673a() != null && mo50673a().get(i) != null) {
            C29043h hVar = (C29043h) vVar;
            Object obj2 = mo50673a().get(i);
            C52711k.m112236a(obj2, "data[position]");
            C29048i iVar = (C29048i) obj2;
            C52711k.m112240b(iVar, "donorStruct");
            if (C52711k.m112239a((Object) iVar.f76003e, (Object) Boolean.valueOf(true))) {
                TextView textView = hVar.f75991b;
                C52711k.m112236a((Object) textView, "username");
                View view = hVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                textView.setText(view.getContext().getString(R.string.g9o));
                C12203q.m24642a((int) R.drawable.dcj).mo23118a("Donation").mo23116a((C12197k) hVar.f75990a).mo23110a((int) R.color.atv).mo23121a();
                hVar.f75990a.setOnClickListener(C29045b.f75995a);
                hVar.f75991b.setOnClickListener(C29046c.f75996a);
            } else {
                OnClickListener dVar = new C29047d(hVar, iVar);
                hVar.f75990a.setOnClickListener(dVar);
                hVar.f75991b.setOnClickListener(dVar);
                TextView textView2 = hVar.f75991b;
                C52711k.m112236a((Object) textView2, "username");
                textView2.setText(C47915gg.m103660i(iVar.f75999a));
                User user = iVar.f75999a;
                List list2 = null;
                if (user != null) {
                    urlModel = user.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                IAccountUserService userService = C20854a.m53161a().userService();
                C52711k.m112236a((Object) userService, "AccountProxyService\n    …           .userService()");
                User curUser = userService.getCurUser();
                if (!(curUser == null || curUser.getUid() == null)) {
                    String uid = curUser.getUid();
                    User user2 = iVar.f75999a;
                    if (user2 != null) {
                        obj = user2.getUid();
                    } else {
                        obj = null;
                    }
                    if (C52711k.m112239a((Object) uid, obj)) {
                        urlModel = curUser.getAvatarThumb();
                    }
                }
                if (hVar.f75990a != null) {
                    if (urlModel != null) {
                        list = urlModel.getUrlList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        if (urlModel != null) {
                            list2 = urlModel.getUrlList();
                        }
                        if (list2.size() != 0) {
                            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel));
                            int[] a2 = C47788ct.m103417a(100);
                            if (a2 == null) {
                                C52711k.m112234a();
                            }
                            C12208t b = a.mo23125b(a2);
                            int i2 = C29043h.f75988f;
                            b.mo23111a(i2, i2).mo23127c(true).mo23118a("Donation").mo23110a((int) R.color.atv).mo23116a((C12197k) hVar.f75990a).mo23121a();
                        }
                    }
                }
            }
            View view2 = hVar.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            Long l = iVar.f76000b;
            if (l != null) {
                j = l.longValue();
            } else {
                j = System.currentTimeMillis();
            }
            String b2 = C47903fw.m103625b(context, j * 1000);
            C52711k.m112236a((Object) b2, "TimeUtils.formatCreateTi…sc(context, time * 1000L)");
            String replace = new C52820l("(.)").replace((CharSequence) b2, "$1⁠");
            String str = iVar.f76001c;
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            View view3 = hVar.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            sb.append(view3.getContext().getString(R.string.g9m));
            sb.append(' ');
            sb.append(iVar.f76001c);
            sb.append(' ');
            sb.append(replace);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            CharSequence charSequence = spannableStringBuilder;
            int a3 = C52830p.m112419a(charSequence, str, 0, false, 6, (Object) null);
            int a4 = C52830p.m112419a(charSequence, replace, 0, false, 6, (Object) null);
            View view4 = hVar.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            Context context2 = view4.getContext();
            C52711k.m112236a((Object) context2, "itemView.context");
            spannableStringBuilder.setSpan(new DonationVH$bind$$inlined$apply$lambda$1(context2.getResources().getColor(R.color.avn), hVar, str, replace), a3, str.length() + a3, 34);
            View view5 = hVar.itemView;
            C52711k.m112236a((Object) view5, "itemView");
            Context context3 = view5.getContext();
            C52711k.m112236a((Object) context3, "itemView.context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context3.getResources().getColor(R.color.avv)), a4, replace.length() + a4, 34);
            TextView textView3 = hVar.f75992c;
            C52711k.m112236a((Object) textView3, "desc");
            textView3.setText(charSequence);
            TextView textView4 = hVar.f75993d;
            C52711k.m112236a((Object) textView4, "tiktokMatching");
            StringBuilder sb2 = new StringBuilder("+ ");
            String str2 = iVar.f76002d;
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            textView4.setText(sb2.toString());
        }
    }
}
