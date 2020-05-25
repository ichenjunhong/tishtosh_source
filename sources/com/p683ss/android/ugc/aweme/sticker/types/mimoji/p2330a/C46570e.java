package com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46564a;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46579c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46580d;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.e */
public final class C46570e extends C1322a<C1352v> {

    /* renamed from: a */
    public List<? extends StickerWrapper> f117480a = new ArrayList();

    /* renamed from: b */
    public int f117481b;

    /* renamed from: c */
    final C46579c f117482c;

    /* renamed from: d */
    private final int f117483d = 3;

    /* renamed from: e */
    private final int f117484e;

    /* renamed from: f */
    private final int f117485f = 1;

    /* renamed from: g */
    private final C46571a f117486g = new C46571a(this);

    /* renamed from: h */
    private final AppCompatActivity f117487h;

    /* renamed from: i */
    private final C46313c f117488i;

    /* renamed from: j */
    private final String f117489j;

    /* renamed from: k */
    private final C46354l f117490k;

    /* renamed from: l */
    private final C46580d f117491l;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.e$a */
    public static final class C46571a implements C46569d {

        /* renamed from: a */
        final /* synthetic */ C46570e f117492a;

        C46571a(C46570e eVar) {
            this.f117492a = eVar;
        }

        /* renamed from: a */
        public final void mo93368a(int i) {
            if (this.f117492a.f117481b != i) {
                StickerWrapper stickerWrapper = (StickerWrapper) this.f117492a.f117480a.get(i);
                if (stickerWrapper.f115781c != 2) {
                    C17971f D = C39629l.m88232a().mo58566D();
                    Effect effect = stickerWrapper.f115779a;
                    C52711k.m112236a((Object) effect, "stickerWrapper.effect");
                    ResourceListModel resourceListModel = (ResourceListModel) D.mo34884a(effect.getResourceId(), ResourceListModel.class);
                    if (stickerWrapper.f115781c != 3 || resourceListModel == null) {
                        this.f117492a.mo93369a(i);
                        return;
                    }
                    C46570e eVar = this.f117492a;
                    ((StickerWrapper) eVar.f117480a.get(i)).f115781c = 2;
                    eVar.notifyItemChanged(i);
                    C46579c cVar = eVar.f117482c;
                    if (cVar != null) {
                        cVar.mo93058a((StickerWrapper) eVar.f117480a.get(i), resourceListModel, i, new C46572b(eVar, i));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.e$b */
    public static final class C46572b implements C46564a {

        /* renamed from: a */
        final /* synthetic */ C46570e f117493a;

        /* renamed from: b */
        final /* synthetic */ int f117494b;

        /* renamed from: a */
        public final void mo93365a(Exception exc) {
            ((StickerWrapper) this.f117493a.f117480a.get(this.f117494b)).f115781c = 3;
            this.f117493a.notifyItemChanged(this.f117494b);
        }

        C46572b(C46570e eVar, int i) {
            this.f117493a = eVar;
            this.f117494b = i;
        }

        /* renamed from: a */
        public final void mo93366a(String str, StickerWrapper stickerWrapper, boolean z) {
            Effect effect;
            C52711k.m112240b(str, "id");
            ((StickerWrapper) this.f117493a.f117480a.get(this.f117494b)).f115781c = 1;
            StickerWrapper stickerWrapper2 = (StickerWrapper) this.f117493a.f117480a.get(this.f117494b);
            if (stickerWrapper != null) {
                effect = stickerWrapper.f115779a;
            } else {
                effect = null;
            }
            stickerWrapper2.f115779a = effect;
            if (z) {
                this.f117493a.mo93369a(this.f117494b);
            }
        }
    }

    public final int getItemCount() {
        if (this.f117480a.size() >= this.f117483d) {
            return this.f117483d;
        }
        return this.f117480a.size() + 1;
    }

    /* renamed from: a */
    public final void mo93370a(List<? extends StickerWrapper> list) {
        C52711k.m112240b(list, "list");
        this.f117480a = list;
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        if (this.f117480a.size() >= this.f117483d || i != this.f117480a.size()) {
            return this.f117484e;
        }
        return this.f117485f;
    }

    /* renamed from: a */
    public final void mo93369a(int i) {
        if (i >= 0) {
            notifyItemChanged(this.f117481b);
            this.f117481b = i;
            notifyItemChanged(this.f117481b);
            C46579c cVar = this.f117482c;
            if (cVar != null) {
                cVar.mo93057a((StickerWrapper) this.f117480a.get(this.f117481b));
            }
            LiveData b = this.f117490k.mo92989g().mo93014b();
            C0198r b2 = ((TabSelectViewModel) C0214z.m440a((FragmentActivity) this.f117487h).mo359a(TabSelectViewModel.class)).mo93421b(this.f117489j);
            Effect effect = (Effect) b.getValue();
            if (effect != null) {
                C46313c cVar2 = this.f117488i;
                C52711k.m112236a((Object) effect, "this");
                C52711k.m112236a((Object) b2, "curTab");
                String str = (String) b2.getValue();
                if (str == null) {
                    str = "";
                }
                cVar2.mo93044b(effect, str, "click_banner");
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == this.f117484e) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x4, viewGroup, false);
            AppCompatActivity appCompatActivity = this.f117487h;
            C52711k.m112236a((Object) inflate, "view");
            return new C46576h(appCompatActivity, inflate, this.f117486g);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fv, viewGroup, false);
        AppCompatActivity appCompatActivity2 = this.f117487h;
        String str = this.f117489j;
        C46354l lVar = this.f117490k;
        C46313c cVar = this.f117488i;
        C52711k.m112236a((Object) inflate2, "view");
        C46565a aVar = new C46565a(appCompatActivity2, str, lVar, cVar, inflate2, this.f117491l);
        return aVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        String str;
        C52711k.m112240b(vVar, "holder");
        if (getItemViewType(i) == this.f117484e) {
            C46576h hVar = (C46576h) vVar;
            StickerWrapper stickerWrapper = (StickerWrapper) this.f117480a.get(i);
            if (i == this.f117481b) {
                z = true;
            } else {
                z = false;
            }
            C52711k.m112240b(stickerWrapper, "stickerWrapper");
            hVar.f117509a.mo93970a(z);
            switch (stickerWrapper.f115781c) {
                case 1:
                    hVar.f117509a.mo93971a(false, 8388693);
                    hVar.f117509a.setShowDownloadIcon(false);
                    hVar.f117509a.mo93963a();
                    break;
                case 2:
                    hVar.f117509a.setShowDownloadIcon(false);
                    hVar.f117509a.mo93963a();
                    hVar.f117509a.mo93971a(true, 8388693);
                    break;
                case 3:
                    hVar.f117509a.mo93971a(false, 8388693);
                    hVar.f117509a.setShowDownloadIcon(true);
                    hVar.f117509a.mo93972b();
                    break;
            }
            AVDmtImageTextView aVDmtImageTextView = hVar.f117509a;
            Effect effect = stickerWrapper.f115779a;
            if (effect != null) {
                UrlModel iconUrl = effect.getIconUrl();
                if (iconUrl != null) {
                    List urlList = iconUrl.getUrlList();
                    if (urlList != null) {
                        str = (String) urlList.get(0);
                        aVDmtImageTextView.mo93969a(str);
                        hVar.itemView.setOnClickListener(new C46577a(hVar, i));
                        return;
                    }
                }
            }
            str = null;
            aVDmtImageTextView.mo93969a(str);
            hVar.itemView.setOnClickListener(new C46577a(hVar, i));
            return;
        }
        C46565a aVar = (C46565a) vVar;
        aVar.f117473a.setOnClickListener(new C46566a(aVar));
    }

    public C46570e(AppCompatActivity appCompatActivity, C46313c cVar, String str, C46354l lVar, C46580d dVar, C46579c cVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(cVar, "mobHelper");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(lVar, "stickerDataManager");
        this.f117487h = appCompatActivity;
        this.f117488i = cVar;
        this.f117489j = str;
        this.f117490k = lVar;
        this.f117491l = dVar;
        this.f117482c = cVar2;
    }
}
