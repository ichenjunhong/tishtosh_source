package com.p683ss.android.ugc.aweme.share.p2155f.p2156a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35451f;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.f.a.a */
public interface C42010a {

    /* renamed from: com.ss.android.ugc.aweme.share.f.a.a$a */
    public static class C42011a implements C42010a {

        /* renamed from: a */
        public Activity f106339a;

        /* renamed from: b */
        private List<C42307b> f106340b;

        /* renamed from: c */
        private LinearLayout f106341c;

        /* renamed from: d */
        private int f106342d = ((int) C9432q.m18687b((Context) this.f106339a, 33.0f));

        /* renamed from: e */
        private int f106343e = ((int) C9432q.m18687b((Context) this.f106339a, 3.0f));

        /* renamed from: f */
        private int f106344f = ((int) C9432q.m18687b((Context) this.f106339a, 4.5f));

        /* renamed from: g */
        private SharePackage f106345g;

        /* renamed from: a */
        private List<C42307b> m91986a(Aweme aweme) {
            this.f106345g = C41979aq.m91946a().parseAweme(this.f106339a, aweme, 0, "", "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(C41922a.m91868a().getImChannel(this.f106345g, "", 8));
            arrayList.add(C42044a.m92009a("weixin_moments", this.f106339a));
            arrayList.add(C42044a.m92009a("weixin", this.f106339a));
            arrayList.add(C42044a.m92009a("qq", this.f106339a));
            arrayList.add(C42044a.m92009a("weibo", this.f106339a));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C42307b) it.next()).mo86141a(this.f106339a)) {
                    it.remove();
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final LinearLayout mo86090a(Aweme aweme, PhotoContext photoContext) {
            for (int i = 0; i < this.f106340b.size(); i++) {
                if (i == 0) {
                    LinearLayout linearLayout = this.f106341c;
                    ImageView a = m91985a((C42307b) this.f106340b.get(i), aweme, photoContext.mPhotoLocalPath);
                    LayoutParams layoutParams = new LayoutParams(this.f106342d, this.f106342d);
                    layoutParams.setMargins(0, 0, this.f106344f, 0);
                    a.setLayoutParams(layoutParams);
                    linearLayout.addView(a);
                } else if (i == this.f106340b.size() - 1) {
                    LinearLayout linearLayout2 = this.f106341c;
                    ImageView a2 = m91985a((C42307b) this.f106340b.get(i), aweme, photoContext.mPhotoLocalPath);
                    LayoutParams layoutParams2 = new LayoutParams(this.f106342d, this.f106342d);
                    layoutParams2.setMargins(this.f106344f, 0, 0, 0);
                    a2.setLayoutParams(layoutParams2);
                    linearLayout2.addView(a2);
                } else {
                    LinearLayout linearLayout3 = this.f106341c;
                    ImageView a3 = m91985a((C42307b) this.f106340b.get(i), aweme, photoContext.mPhotoLocalPath);
                    LayoutParams layoutParams3 = new LayoutParams(this.f106342d, this.f106342d);
                    layoutParams3.setMargins(this.f106344f, 0, this.f106344f, 0);
                    a3.setLayoutParams(layoutParams3);
                    linearLayout3.addView(a3);
                }
            }
            return this.f106341c;
        }

        public C42011a(Activity activity, Aweme aweme, LinearLayout linearLayout) {
            this.f106339a = activity;
            this.f106340b = m91986a(aweme);
            this.f106341c = linearLayout;
        }

        /* renamed from: a */
        private ImageView m91985a(final C42307b bVar, Aweme aweme, final String str) {
            RemoteImageView remoteImageView = new RemoteImageView(this.f106339a);
            C35451f shareService = C33200k.m76279d().getShareService();
            if (!TextUtils.equals(bVar.mo86136b(), "chat_merge") || !C23794bh.m58394h().mo70343a() || shareService == null || shareService.mo72374a("aweme") != 0) {
                remoteImageView.setImageDrawable(C0726c.m2091a((Context) this.f106339a, bVar.mo86140e()));
            } else {
                C23794bh.m58394h().mo70341a(this.f106339a, remoteImageView, 3);
            }
            remoteImageView.setPadding(this.f106343e, this.f106343e, this.f106343e, this.f106343e);
            remoteImageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    Uri uri;
                    ClickInstrumentation.onClick(view);
                    C26890h.onEvent(MobClick.obtain().setEventName("share_bodydance_card").setLabelName(bVar.mo86136b()));
                    Activity activity = C42011a.this.f106339a;
                    String str = str;
                    if (TextUtils.isEmpty(str)) {
                        uri = null;
                    } else {
                        uri = C47722bj.m103304a(activity, new File(str));
                    }
                    bVar.mo49947a((C42318f) new C42323i(uri, str), (Context) C42011a.this.f106339a);
                }
            });
            return remoteImageView;
        }
    }

    /* renamed from: a */
    LinearLayout mo86090a(Aweme aweme, PhotoContext photoContext);
}
