package com.p683ss.android.ugc.aweme.photo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44149m;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k.C43883a;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.i */
public final class C38678i implements C44149m {

    /* renamed from: a */
    ShortVideoContext f98380a;

    /* renamed from: b */
    public final Activity f98381b;

    /* renamed from: com.ss.android.ugc.aweme.photo.i$a */
    static final class C38679a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38678i f98382a;

        /* renamed from: b */
        final /* synthetic */ String f98383b;

        /* renamed from: c */
        final /* synthetic */ C45547d f98384c;

        C38679a(C38678i iVar, String str, C45547d dVar) {
            this.f98382a = iVar;
            this.f98383b = str;
            this.f98384c = dVar;
        }

        public final void run() {
            final PhotoContext a = C38681j.m86035a(this.f98383b, new C38655c());
            if (a != null) {
                a.md5 = C43883a.m96396a(new File(this.f98383b));
            }
            C18842a.m45934b(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C38679a f98385a;

                {
                    this.f98385a = r1;
                }

                public final void run() {
                    String str;
                    this.f98385a.f98384c.dismiss();
                    if (a == null) {
                        C10691a.m21542b((Context) this.f98385a.f98382a.f98381b, (int) R.string.bqm).mo19066a();
                        return;
                    }
                    C38678i iVar = this.f98385a.f98382a;
                    PhotoContext photoContext = a;
                    ShortVideoContext shortVideoContext = iVar.f98380a;
                    if (shortVideoContext == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    photoContext.mShootWay = shortVideoContext.f107132y;
                    C43214dh a = C43214dh.m94817a();
                    C52711k.m112236a((Object) a, "PublishManager.inst()");
                    photoContext.challenges = a.f109287b;
                    ShortVideoContext shortVideoContext2 = iVar.f98380a;
                    if (shortVideoContext2 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    photoContext.mPoiId = shortVideoContext2.f107034M;
                    ShortVideoContext shortVideoContext3 = iVar.f98380a;
                    if (shortVideoContext3 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    photoContext.microAppModel = shortVideoContext3.f107054aF;
                    ShortVideoContext shortVideoContext4 = iVar.f98380a;
                    if (shortVideoContext4 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    photoContext.mFromOtherPlatform = shortVideoContext4.f107055aG;
                    C43214dh a2 = C43214dh.m94817a();
                    C52711k.m112236a((Object) a2, "PublishManager.inst()");
                    C43804f fVar = a2.f109289d;
                    if (fVar != null) {
                        C10691a.m21548c((Context) iVar.f98381b, (int) R.string.gtt).mo19066a();
                        C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "12").mo47829a("task_id", fVar.f110924a).f61491a);
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
                    ShortVideoContext shortVideoContext5 = iVar.f98380a;
                    if (shortVideoContext5 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    String str2 = shortVideoContext5.f107131x;
                    ShortVideoContext shortVideoContext6 = iVar.f98380a;
                    if (shortVideoContext6 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    String str3 = "";
                    String str4 = "";
                    if (shortVideoContext6 != null && CommentUtils.needMob(shortVideoContext6)) {
                        CommentVideoModel commentVideoModel = shortVideoContext6.f107125r;
                        String commentId = commentVideoModel.getCommentId();
                        str4 = commentVideoModel.getUserId();
                        str3 = commentId;
                    }
                    String str5 = "upload_content_next";
                    C23089d a3 = C23089d.m56640a();
                    String str6 = "shoot_way";
                    if (shortVideoContext6 != null) {
                        str = shortVideoContext6.f107132y;
                    } else {
                        str = "";
                    }
                    C26890h.m65011a(str5, a3.mo47829a(str6, str).mo47829a("creation_id", str2).mo47829a("content_type", "photo").mo47826a("video_cnt", 0).mo47826a("pic_cnt", 1).mo47826a("is_multi_content", 0).mo47829a("mix_type", C45624b.m99356a(0, 1)).mo47826a("is_add_more", 0).mo47829a("reply_comment_id", str3).mo47829a("reply_user_id", str4).f61491a);
                    ShortVideoContext shortVideoContext7 = iVar.f98380a;
                    if (shortVideoContext7 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    C46806g.m101653a(C44309n.m97061b(shortVideoContext7), C44309n.m97055a(photoContext), C46804e.RECORD, C46804e.EDIT);
                    ShortVideoContext shortVideoContext8 = iVar.f98380a;
                    if (shortVideoContext8 == null) {
                        C52711k.m112237a("shortVideoContext");
                    }
                    if (shortVideoContext8.f107055aG) {
                        Activity activity = iVar.f98381b;
                        Intent intent = new Intent(activity, PhotoEditActivity.class);
                        intent.putExtra("photo_model", photoContext);
                        activity.startActivityForResult(intent, BaseNotice.CHECK_PROFILE);
                        return;
                    }
                    PhotoEditActivity.m86002a((Context) iVar.f98381b, photoContext);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo78609a() {
    }

    public C38678i(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f98381b = activity;
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        C52711k.m112240b(intent, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C52711k.m112236a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<MediaModel> list = parcelableArrayListExtra;
            List arrayList = new ArrayList();
            for (MediaModel b : list) {
                String b2 = b.mo76675b();
                C52711k.m112236a((Object) b2, "it.lngLatStr");
                arrayList.add(b2);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C52711k.m112236a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f98380a = (ShortVideoContext) parcelableExtra;
            String a = C52575l.m112120a(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(a)) {
                ShortVideoContext shortVideoContext = this.f98380a;
                if (shortVideoContext == null) {
                    C52711k.m112237a("shortVideoContext");
                }
                shortVideoContext.f107100az = a;
            }
            String str = ((MediaModel) list.get(0)).f95383b;
            C52711k.m112236a((Object) str, "selectedMediaData[0].filePath");
            C45547d b3 = C45547d.m99208b(this.f98381b, "");
            C52711k.m112236a((Object) b3, "dialog");
            b3.setIndeterminate(true);
            C23729p.m58256a((Dialog) b3);
            C18842a.m45932a(new C38679a(this, str, b3));
        }
    }
}
