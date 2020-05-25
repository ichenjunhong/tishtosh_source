package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.router.C41312z;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder */
public class MusicBannerViewHolder extends C1352v {

    /* renamed from: a */
    public int f66184a;

    /* renamed from: b */
    protected Banner f66185b;

    /* renamed from: c */
    private int f66186c;

    /* renamed from: d */
    private int[] f66187d = new int[2];
    SmartImageView mSdCover;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder$a */
    class C25003a implements OnAttachStateChangeListener, Runnable {

        /* renamed from: b */
        private boolean f66189b;

        /* renamed from: a */
        private void m60811a() {
            this.f66189b = false;
            MusicBannerViewHolder.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = MusicBannerViewHolder.this.f66185b;
            Rect rect = new Rect();
            if (!MusicBannerViewHolder.m60809a(MusicBannerViewHolder.this.itemView) || !MusicBannerViewHolder.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f66189b) {
                    C26890h.m65011a("banner_show", C23089d.m56640a().mo47829a("enter_from", "change_music_page").mo47829a("banner_id", MusicBannerViewHolder.this.f66185b.getBid()).mo47829a("client_order", Integer.toString(MusicBannerViewHolder.this.f66184a)).f61491a);
                }
                this.f66189b = z;
            }
            MusicBannerViewHolder.this.itemView.postDelayed(this, 250);
        }

        public final void onViewDetachedFromWindow(View view) {
            m60811a();
        }

        private C25003a() {
        }

        public final void onViewAttachedToWindow(View view) {
            m60811a();
            run();
        }
    }

    public void clickCover() {
        String str;
        String str2;
        if (this.f66185b != null && !TextUtils.isEmpty(this.f66185b.getSchema())) {
            String schema = this.f66185b.getSchema();
            if (schema == null || !schema.startsWith("aweme://assmusic/category/")) {
                String uuid = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.itemView.getContext(), this.f66185b.getSchema()).withParam("process_id", uuid).open(10086);
                List a = C41312z.m91070a(this.f66185b.getSchema());
                if (!C9376b.m18558a((Collection<T>) a) && a.size() > 1) {
                    C24963c.m60719a(new C24803a("change_music_page", "", "click_banner", C24963c.m60726b()), (String) a.get(1), true, uuid);
                }
            } else {
                if (!schema.contains("?")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(schema);
                    sb.append("?musicType=");
                    sb.append(this.f66186c);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(schema);
                    sb2.append("&musicType=");
                    sb2.append(this.f66186c);
                    str = sb2.toString();
                }
                SmartRouter.buildRoute(this.itemView.getContext(), str).open(10086);
                String b = C41312z.m91072b(this.f66185b.getSchema(), LeakCanaryFileProvider.f132049i);
                String str3 = "click_banner";
                String bid = this.f66185b.getBid();
                String str4 = "change_music_page";
                List a2 = C41312z.m91070a(str);
                if (C9376b.m18558a((Collection<T>) a2) || a2.size() < 2) {
                    str2 = "";
                } else {
                    str2 = (String) a2.get(1);
                }
                C24963c.m60724a(b, str3, bid, str4, str2);
            }
            C26890h.m65011a("banner_click", C23089d.m56640a().mo47829a("enter_from", "change_music_page").mo47829a("banner_id", this.f66185b.getBid()).mo47829a("client_order", Integer.toString(this.f66184a)).f61491a);
        }
    }

    /* renamed from: a */
    public static boolean m60809a(View view) {
        boolean z;
        if (view == null || !C1056u.m3018B(view)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    public MusicBannerViewHolder(View view, int i) {
        super(view);
        this.f66186c = i;
        C25003a aVar = new C25003a();
        view.addOnAttachStateChangeListener(aVar);
        if (C1056u.m3018B(view)) {
            aVar.run();
        }
        ButterKnife.bind((Object) this, view);
        this.f66187d[0] = C9432q.m18670a(view.getContext()) - ((int) (C9432q.m18687b(view.getContext(), 16.0f) * 2.0f));
        this.f66187d[1] = (int) (((float) this.f66187d[0]) * 0.26239067f);
    }

    /* renamed from: a */
    public final void mo50991a(Banner banner, int i) {
        if (banner != null && banner != this.f66185b) {
            this.f66185b = banner;
            if (this.f66185b.getBannerUrl() != null && !C9376b.m18558a((Collection<T>) this.f66185b.getBannerUrl().getUrlList())) {
                C12203q.m24645a((Object) C23608p.m57874a(this.f66185b.getBannerUrl())).mo23125b(C47788ct.m103417a(601)).mo23120a(this.f66187d).mo23119a(true).mo23118a("MusicBannerViewHolder").mo23116a((C12197k) this.mSdCover).mo23121a();
            }
            new C25592b((float) C23728o.m58241a(4.0d), this.itemView.getContext().getResources().getColor(R.color.a3a)).setAlpha(76);
            this.f66184a = i + 1;
        }
    }
}
