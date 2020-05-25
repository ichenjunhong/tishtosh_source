package com.p683ss.android.ugc.gamora.recorder.localmedia;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a */
public final class C49895a extends C12924i {

    /* renamed from: i */
    public static final C49896a f125037i = new C49896a(null);

    /* renamed from: j */
    private ShortVideoContext f125038j;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.a$a */
    public static final class C49896a {
        private C49896a() {
        }

        public /* synthetic */ C49896a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        Activity activity = this.f33840g_;
        if (activity != null) {
            C0209x a = C0214z.m440a((FragmentActivity) activity).mo359a(ShortVideoContextViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
            C52711k.m112236a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
            this.f125038j = shortVideoContext;
            Bundle bundle2 = this.f33839g;
            if (bundle2 == null) {
                C52711k.m112234a();
            }
            Object obj = bundle2.get("local_media_argument");
            if (obj != null) {
                LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("key_support_flag", localMediaArgument.f125029c);
                bundle3.putBoolean("Key_enable_multi_video", localMediaArgument.f125030d);
                bundle3.putLong("Key_min_duration", localMediaArgument.f125032f);
                bundle3.putInt("key_photo_select_min_count", localMediaArgument.f125033g);
                bundle3.putInt("key_photo_select_max_count", localMediaArgument.f125034h);
                bundle3.putInt("key_video_select_min_count", localMediaArgument.f125035i);
                bundle3.putInt("key_video_select_max_count", localMediaArgument.f125036j);
                bundle3.putInt("key_choose_scene", localMediaArgument.f125031e);
                String str = "key_short_video_context";
                ShortVideoContext shortVideoContext2 = this.f125038j;
                if (shortVideoContext2 == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                bundle3.putParcelable(str, shortVideoContext2);
                bundle3.putInt("key_choose_request_code", localMediaArgument.f125027a);
                Intent intent = new Intent(this.f33840g_, MvChoosePhotoActivity.class);
                intent.putExtras(bundle3);
                if (localMediaArgument.f125028b > 0) {
                    Activity v = mo24477v();
                    intent.putExtra("key_start_activity_request_code", localMediaArgument.f125028b);
                    v.startActivityForResult(intent, localMediaArgument.f125028b);
                } else {
                    mo24477v().startActivity(intent);
                }
                mo24479x().mo24529c(this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        return new View(viewGroup.getContext());
    }
}
