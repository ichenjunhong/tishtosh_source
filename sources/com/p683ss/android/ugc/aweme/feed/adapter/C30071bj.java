package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bj */
public class C30071bj extends C30102n {
    public C30071bj(C52671b<? super C30022am, ? extends View> bVar, final C52671b<? super C30069bh, ? extends VideoViewHolder> bVar2) {
        C52711k.m112240b(bVar, "viewProducer");
        C52711k.m112240b(bVar2, "producer");
        super(0, C30103o.f78598a, bVar, new C52671b<C30069bh, VideoViewHolder>() {
            public final /* synthetic */ Object invoke(Object obj) {
                C30069bh bhVar = (C30069bh) obj;
                C52711k.m112240b(bhVar, "it");
                VideoViewHolder videoViewHolder = (VideoViewHolder) bVar2.invoke(bhVar);
                C30016ag agVar = videoViewHolder;
                OnTouchListener onTouchListener = bhVar.f78500h;
                C30722a aVar = bhVar.f78501i;
                if (agVar instanceof VideoViewHolder) {
                    VideoViewHolder videoViewHolder2 = (VideoViewHolder) agVar;
                    videoViewHolder2.f78516h.mo48228a("bind_title_touch_listener", (Object) onTouchListener);
                    if (videoViewHolder2.mLongPressLayout != null) {
                        videoViewHolder2.mLongPressLayout.setListener(aVar);
                    }
                }
                return videoViewHolder;
            }
        }, null);
    }

    public /* synthetic */ C30071bj(C52671b bVar, C52671b bVar2, int i, C52707g gVar) {
        this(C30103o.m70650a(), bVar2);
    }
}
