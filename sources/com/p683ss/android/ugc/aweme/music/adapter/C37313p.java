package com.p683ss.android.ugc.aweme.music.adapter;

import android.graphics.drawable.Animatable;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.p522b.C9376b;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p683ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.p */
public final class C37313p extends C26840g<ExternalMusicInfo> {

    /* renamed from: a */
    public C37314a f95227a;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.p$a */
    public interface C37314a {
        /* renamed from: a */
        void mo76608a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.p$b */
    class C37315b extends C1352v {

        /* renamed from: a */
        View f95228a;

        /* renamed from: b */
        ImageView f95229b;

        /* renamed from: c */
        public WrapContentRemoteImageView f95230c;

        /* renamed from: d */
        Animation f95231d;

        /* renamed from: a */
        public final void mo76609a() {
            if (this.f95229b != null) {
                this.f95229b.clearAnimation();
            }
            if (this.f95228a != null) {
                this.f95228a.setVisibility(8);
            }
        }

        C37315b(View view) {
            super(view);
            this.f95230c = (WrapContentRemoteImageView) view.findViewById(R.id.b4v);
            this.f95228a = view.findViewById(R.id.czp);
            this.f95229b = (ImageView) view.findViewById(R.id.czo);
            this.f95231d = AnimationUtils.loadAnimation(view.getContext(), R.anim.ak);
            this.f95230c.setOnClickListener(new C37319q(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.p$c */
    class C37317c extends C1352v {

        /* renamed from: a */
        View f95234a;

        /* renamed from: b */
        public View f95235b;

        /* renamed from: c */
        ImageView f95236c;

        /* renamed from: d */
        public WrapContentRemoteImageView f95237d;

        /* renamed from: e */
        Animation f95238e;

        /* renamed from: a */
        public final void mo76610a() {
            if (this.f95236c != null) {
                this.f95236c.clearAnimation();
            }
            if (this.f95234a != null) {
                this.f95234a.setVisibility(8);
            }
        }

        C37317c(View view) {
            super(view);
            this.f95237d = (WrapContentRemoteImageView) view.findViewById(R.id.b4v);
            this.f95235b = view.findViewById(R.id.dt_);
            this.f95234a = view.findViewById(R.id.czp);
            this.f95236c = (ImageView) view.findViewById(R.id.czo);
            this.f95238e = AnimationUtils.loadAnimation(view.getContext(), R.anim.ak);
            this.f95237d.setOnClickListener(new C37320r(this));
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (MusicService.createIMusicServicebyMonsterPlugin().getIsUseMusicPartnersNewStyle()) {
            return new C37317c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blp, viewGroup, false));
        }
        return new C37315b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blo, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (MusicService.createIMusicServicebyMonsterPlugin().getIsUseMusicPartnersNewStyle()) {
            C37317c cVar = (C37317c) vVar;
            List list = this.f70670n;
            if (!C9376b.m18558a((Collection<T>) list) && i >= 0 && i < list.size()) {
                ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i);
                if (externalMusicInfo != null) {
                    if (!(cVar.f95234a == null || cVar.f95236c == null)) {
                        cVar.f95234a.setVisibility(0);
                        cVar.f95236c.startAnimation(cVar.f95238e);
                    }
                    if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                        List musicCoverUrl = MusicService.createIMusicServicebyMonsterPlugin().getMusicCoverUrl(externalMusicInfo.getPartnerName());
                        if (!C9376b.m18558a((Collection<T>) musicCoverUrl) && cVar.f95237d != null) {
                            if (i == list.size() - 1) {
                                cVar.f95235b.setVisibility(8);
                            }
                            cVar.f95237d.mo95598a((String) musicCoverUrl.get(0), null, new C13790c<C14045f>() {
                                public final void onFailure(String str, Throwable th) {
                                    super.onFailure(str, th);
                                    C37317c.this.mo76610a();
                                }

                                public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                                    C14045f fVar = (C14045f) obj;
                                    C37317c.this.mo76610a();
                                    C37317c.this.f95237d.mo95597a(fVar);
                                }

                                public final void onIntermediateImageFailed(String str, Throwable th) {
                                    super.onIntermediateImageFailed(str, th);
                                    C37317c.this.mo76610a();
                                    C37317c.this.f95235b.setVisibility(8);
                                    C37317c.this.f95237d.setVisibility(8);
                                }

                                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                    C14045f fVar = (C14045f) obj;
                                    C37317c.this.mo76610a();
                                    C37317c.this.f95237d.mo95597a(fVar);
                                }
                            });
                        }
                    }
                }
            }
        } else {
            C37315b bVar = (C37315b) vVar;
            List list2 = this.f70670n;
            if (!C9376b.m18558a((Collection<T>) list2) && i >= 0 && i < list2.size()) {
                ExternalMusicInfo externalMusicInfo2 = (ExternalMusicInfo) list2.get(i);
                if (externalMusicInfo2 != null) {
                    if (!(bVar.f95228a == null || bVar.f95229b == null)) {
                        bVar.f95228a.setVisibility(0);
                        bVar.f95229b.startAnimation(bVar.f95231d);
                    }
                    String partnerName = externalMusicInfo2.getPartnerName();
                    if ((!TextUtils.equals(externalMusicInfo2.getExternalSongKey(), "resso") || C35837h.m80973a() == "IN") && !TextUtils.isEmpty(partnerName)) {
                        List musicCoverUrl2 = MusicService.createIMusicServicebyMonsterPlugin().getMusicCoverUrl(externalMusicInfo2.getPartnerName());
                        if (!C9376b.m18558a((Collection<T>) musicCoverUrl2) && bVar.f95230c != null) {
                            bVar.f95230c.mo95598a((String) musicCoverUrl2.get(0), null, new C13790c<C14045f>() {
                                public final void onFailure(String str, Throwable th) {
                                    super.onFailure(str, th);
                                    C37315b.this.mo76609a();
                                }

                                public final void onIntermediateImageFailed(String str, Throwable th) {
                                    super.onIntermediateImageFailed(str, th);
                                    C37315b.this.mo76609a();
                                }

                                public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                                    C14045f fVar = (C14045f) obj;
                                    C37315b.this.mo76609a();
                                    C37315b.this.f95230c.mo95597a(fVar);
                                }

                                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                    C14045f fVar = (C14045f) obj;
                                    C37315b.this.mo76609a();
                                    C37315b.this.f95230c.mo95597a(fVar);
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
