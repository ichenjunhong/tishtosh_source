package com.p683ss.android.ugc.aweme.services.video;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContextOld.C38721a;
import com.p683ss.android.ugc.aweme.services.IInternalAVService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44352a;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44358f;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl */
public final class VideoCoverServiceImpl implements IVideoCoverService {
    public final void getPhotoMovieCover(PhotoMovieContext photoMovieContext, C38719a aVar) {
        C52711k.m112240b(photoMovieContext, "photoMovieContext");
        C52711k.m112240b(aVar, "onPhotoMovieCover");
        C0013i.m16a((Callable<TResult>) new VideoCoverServiceImpl$getPhotoMovieCover$1<TResult>(photoMovieContext, aVar));
    }

    public final void getPhotoMovieCover(PhotoMovieContextOld photoMovieContextOld, C38721a aVar) {
        C52711k.m112240b(photoMovieContextOld, "photoMovieContext");
        C52711k.m112240b(aVar, "onPhotoMovieCover");
        C0013i.m16a((Callable<TResult>) new VideoCoverServiceImpl$getPhotoMovieCover$2<TResult>(photoMovieContextOld, aVar));
    }

    public final void getVideoCoverByCallback(C29059c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        C52711k.m112240b(cVar, "draft");
        ArrayList arrayList = new ArrayList();
        if (cVar.f76125C != null) {
            EffectListModel effectListModel = cVar.f76125C;
            C52711k.m112236a((Object) effectListModel, "draft.effectListModel");
            arrayList.addAll(effectListModel.getEffectPointModels());
        }
        int i = cVar.f76155m;
        EffectPointModel effectPointModel = null;
        if (i != 0) {
            effectPointModel = new EffectPointModel();
            effectPointModel.setKey(String.valueOf(i));
            effectPointModel.setEndPoint(cVar.f76132J);
        }
        if (effectPointModel != null) {
            arrayList.add(effectPointModel);
            if (TextUtils.equals(effectPointModel.getKey(), "1")) {
                z = true;
                StringBuilder sb = new StringBuilder("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
                sb.append(arrayList);
                sb.append("\n filterId:");
                sb.append(cVar.mo58790b());
                C45407ay.m98973d(sb.toString());
                List list = arrayList;
                IInternalAVService createIInternalAVServicebyMonsterPlugin = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
                C52711k.m112236a((Object) createIInternalAVServicebyMonsterPlugin, "ServiceManager.get().get…nalAVService::class.java)");
                C31459g filter = createIInternalAVServicebyMonsterPlugin.getFilterService().getFilter(cVar.f76153k);
                C52711k.m112236a((Object) filter, "ServiceManager.get().get…e.getFilter(draft.filter)");
                C44352a.m97145a(list, filter.f82331h, cVar.mo58780aq(), (int) (cVar.f76138P * 1000.0f), z, C29061d.m68500e(cVar), onVideoCoverCallback);
            }
        }
        z = false;
        StringBuilder sb2 = new StringBuilder("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
        sb2.append(arrayList);
        sb2.append("\n filterId:");
        sb2.append(cVar.mo58790b());
        C45407ay.m98973d(sb2.toString());
        List list2 = arrayList;
        IInternalAVService createIInternalAVServicebyMonsterPlugin2 = AVServiceImpl.createIInternalAVServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIInternalAVServicebyMonsterPlugin2, "ServiceManager.get().get…nalAVService::class.java)");
        C31459g filter2 = createIInternalAVServicebyMonsterPlugin2.getFilterService().getFilter(cVar.f76153k);
        C52711k.m112236a((Object) filter2, "ServiceManager.get().get…e.getFilter(draft.filter)");
        C44352a.m97145a(list2, filter2.f82331h, cVar.mo58780aq(), (int) (cVar.f76138P * 1000.0f), z, C29061d.m68500e(cVar), onVideoCoverCallback);
    }

    public final void getVideoCoverByCallback(String str, int i, OnGetVideoCoverCallback onGetVideoCoverCallback) {
        C44358f.m97151a(str, i, onGetVideoCoverCallback);
    }
}
