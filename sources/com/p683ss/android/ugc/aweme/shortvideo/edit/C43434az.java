package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.C0198r;
import android.content.Intent;
import android.text.TextUtils;
import com.google.p1057b.p1058a.C17418j;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.greenscreen.C32890f;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import dmt.p2652av.video.C52928al;
import dmt.p2652av.video.VEPreviewParams;
import dmt.p2652av.video.VEVideoPublishEditViewModel;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.az */
public final class C43434az {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.az$a */
    static final class C43435a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f109818a;

        C43435a(VideoPublishEditModel videoPublishEditModel) {
            this.f109818a = videoPublishEditModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((VideoPublishEditModel) obj, "it");
            return C17418j.fromNullable(C52928al.m112612a(this.f109818a.videoPath()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.az$b */
    static final class C43436b<T> implements C1710e<C17418j<int[]>> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f109819a;

        /* renamed from: b */
        final /* synthetic */ VEVideoPublishEditViewModel f109820b;

        /* renamed from: c */
        final /* synthetic */ float f109821c;

        /* renamed from: d */
        final /* synthetic */ String f109822d;

        C43436b(VideoPublishEditModel videoPublishEditModel, VEVideoPublishEditViewModel vEVideoPublishEditViewModel, float f, String str) {
            this.f109819a = videoPublishEditModel;
            this.f109820b = vEVideoPublishEditViewModel;
            this.f109821c = f;
            this.f109822d = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            C17418j jVar = (C17418j) obj;
            VideoPublishEditModel videoPublishEditModel = this.f109819a;
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f109820b;
            float f = this.f109821c;
            String str2 = this.f109822d;
            int[] iArr = (int[]) jVar.orNull();
            String str3 = "";
            C0198r a = vEVideoPublishEditViewModel.mo110455a();
            C52711k.m112236a((Object) a, "mViewModel.previewParams");
            VEPreviewParams vEPreviewParams = (VEPreviewParams) a.getValue();
            if (vEPreviewParams != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(vEPreviewParams.previewWidth);
                sb.append('*');
                sb.append(vEPreviewParams.previewHeight);
                str3 = sb.toString();
            }
            C23089d a2 = C23089d.m56640a();
            String str4 = "file_fps";
            int i2 = 0;
            if (iArr != null) {
                i = iArr[7];
            } else {
                i = 0;
            }
            C23089d a3 = a2.mo47826a(str4, i).mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47828a("play_fps", (Object) Float.valueOf(f)).mo47829a("next_action", str2).mo47826a("beautify_used", C23778b.m58354b(C23778b.f63365a)).mo47829a("beautify_info", C23778b.m58352a(C23778b.f63365a)).mo47826a("is_composer", C23778b.m58355c(C23778b.f63365a)).mo47829a("preview_resolution", str3).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds);
            String str5 = "is_hardcode";
            if (C40797m.m90243a()) {
                str = "1";
            } else {
                str = "0";
            }
            C23089d a4 = a3.mo47829a(str5, str).mo47826a("video_quality", C40797m.m90251f()).mo47829a("bit_rate", String.valueOf(C40797m.m90249d()));
            String str6 = "file_bitrate";
            if (iArr != null) {
                i2 = iArr[6];
            }
            C26890h.m65011a("tool_performance_edit_preview", a4.mo47826a(str6, i2).mo47829a("resolution", videoPublishEditModel.getVideoResolution()).mo47829a("content_type", C43434az.m95202a(videoPublishEditModel)).mo47829a("content_source", C43434az.m95207b(videoPublishEditModel)).mo47829a("prop_list", videoPublishEditModel.mStickerID).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.az$c */
    static final class C43437c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f109823a;

        C43437c(VideoPublishEditModel videoPublishEditModel) {
            this.f109823a = videoPublishEditModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((VideoPublishEditModel) obj, "it");
            return C17418j.fromNullable(C52928al.m112612a(this.f109823a.videoPath()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.az$d */
    static final class C43438d<T> implements C1710e<C17418j<int[]>> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f109824a;

        /* renamed from: b */
        final /* synthetic */ Intent f109825b;

        C43438d(VideoPublishEditModel videoPublishEditModel, Intent intent) {
            this.f109824a = videoPublishEditModel;
            this.f109825b = intent;
        }

        public final /* synthetic */ void accept(Object obj) {
            C43434az.m95204a(this.f109824a, this.f109825b, (int[]) ((C17418j) obj).orNull());
        }
    }

    /* renamed from: a */
    public static final String m95202a(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        return C43855fx.m96289b(videoPublishEditModel);
    }

    /* renamed from: b */
    public static final String m95207b(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        return C43855fx.m96288a(videoPublishEditModel);
    }

    /* renamed from: d */
    public static final void m95210d(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        C26890h.m65011a("change_music_toast_show", new C23089d().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).f61491a);
    }

    /* renamed from: c */
    public static final void m95209c(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        C26890h.m65011a("enter_video_shoot_page", C23089d.m56640a().mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47826a("draft_id", videoPublishEditModel.draftId).mo47829a("filter_list", videoPublishEditModel.mCurFilterLabels).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo47829a("content_type", m95202a(videoPublishEditModel)).mo47829a("content_source", m95207b(videoPublishEditModel)).f61491a);
    }

    /* renamed from: a */
    public static final void m95203a(VideoPublishEditModel videoPublishEditModel, Intent intent) {
        m95204a(videoPublishEditModel, null, C52928al.m112612a(videoPublishEditModel.videoPath()));
    }

    /* renamed from: a */
    public static final void m95206a(VideoPublishEditModel videoPublishEditModel, String str) {
        C52711k.m112240b(videoPublishEditModel, "model");
        C52711k.m112240b(str, "modMethod");
        C26890h.m65011a("click_auto_subtitle", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("enter_method", str).mo47829a("content_source", m95207b(videoPublishEditModel)).mo47829a("content_type", m95202a(videoPublishEditModel)).f61491a);
    }

    /* renamed from: b */
    public static final void m95208b(VideoPublishEditModel videoPublishEditModel, String str) {
        C52711k.m112240b(videoPublishEditModel, "model");
        C52711k.m112240b(str, "enterMethod");
        C26890h.m65011a("text_delete", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("is_subtitle", "1").mo47829a("enter_method", str).mo47829a("content_source", m95207b(videoPublishEditModel)).mo47829a("content_type", m95202a(videoPublishEditModel)).f61491a);
    }

    /* renamed from: a */
    public static final void m95204a(VideoPublishEditModel videoPublishEditModel, Intent intent, int[] iArr) {
        String str;
        int i;
        int i2;
        List list;
        Object obj;
        Object obj2;
        VideoFileInfo videoFileInfo;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        String str5;
        String str6;
        float f;
        float f2;
        C52711k.m112240b(videoPublishEditModel, "model");
        C23089d a = C23089d.m56640a().mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("shoot_way", videoPublishEditModel.mShootWay).mo47826a("draft_id", videoPublishEditModel.draftId).mo47829a("filter_list", videoPublishEditModel.mCurFilterLabels).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds);
        String str7 = "is_hardcode";
        if (C40797m.m90243a()) {
            str = "1";
        } else {
            str = "0";
        }
        C23089d a2 = a.mo47829a(str7, str).mo47829a("bite_rate", String.valueOf(C40797m.m90249d()));
        String str8 = "file_bitrate";
        boolean z3 = false;
        if (iArr != null) {
            i = iArr[6];
        } else {
            i = 0;
        }
        C23089d a3 = a2.mo47826a(str8, i).mo47826a("video_quality", C40797m.m90251f()).mo47829a("resolution", videoPublishEditModel.getVideoResolution()).mo47829a("content_type", m95202a(videoPublishEditModel)).mo47829a("content_source", m95207b(videoPublishEditModel)).mo47826a("draft_version", videoPublishEditModel.getNewVersion()).mo47829a("prop_list", videoPublishEditModel.mStickerID).mo47826a("record_mode", videoPublishEditModel.recordMode);
        String str9 = "edit_fps";
        if (iArr != null) {
            i2 = iArr[7];
        } else {
            i2 = 0;
        }
        C23089d a4 = a3.mo47826a(str9, i2);
        if (!videoPublishEditModel.isStitchMode() || videoPublishEditModel.getPreviewInfo().getVideoList().size() < 2) {
            list = videoPublishEditModel.getPreviewInfo().getVideoList();
        } else {
            list = videoPublishEditModel.getPreviewInfo().getVideoList().subList(1, videoPublishEditModel.getPreviewInfo().getVideoList().size());
        }
        Iterable iterable = list;
        Iterator it = iterable.iterator();
        float f3 = 1.0f;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) obj;
                float fps = (float) editVideoSegment.getVideoFileInfo().getFps();
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    f = videoCutInfo.getSpeed();
                } else {
                    f = 1.0f;
                }
                float f4 = fps * f;
                do {
                    Object next = it.next();
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) next;
                    float fps2 = (float) editVideoSegment2.getVideoFileInfo().getFps();
                    VideoCutInfo videoCutInfo2 = editVideoSegment2.getVideoCutInfo();
                    if (videoCutInfo2 != null) {
                        f2 = videoCutInfo2.getSpeed();
                    } else {
                        f2 = 1.0f;
                    }
                    float f5 = fps2 * f2;
                    if (Float.compare(f4, f5) < 0) {
                        obj = next;
                        f4 = f5;
                    }
                } while (it.hasNext());
            }
        }
        EditVideoSegment editVideoSegment3 = (EditVideoSegment) obj;
        if (editVideoSegment3 != null) {
            String str10 = "aim_fps";
            float fps3 = (float) editVideoSegment3.getVideoFileInfo().getFps();
            VideoCutInfo videoCutInfo3 = editVideoSegment3.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                f3 = videoCutInfo3.getSpeed();
            }
            a4.mo47828a(str10, (Object) Float.valueOf(fps3 * f3));
        } else {
            a4.mo47826a("aim_fps", 0);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            obj2 = null;
        } else {
            obj2 = it2.next();
            if (it2.hasNext()) {
                EditVideoSegment editVideoSegment4 = (EditVideoSegment) obj2;
                int min = Math.min(editVideoSegment4.getVideoFileInfo().getWidth(), editVideoSegment4.getVideoFileInfo().getHeight());
                do {
                    Object next2 = it2.next();
                    EditVideoSegment editVideoSegment5 = (EditVideoSegment) next2;
                    int min2 = Math.min(editVideoSegment5.getVideoFileInfo().getWidth(), editVideoSegment5.getVideoFileInfo().getHeight());
                    if (min < min2) {
                        obj2 = next2;
                        min = min2;
                    }
                } while (it2.hasNext());
            }
        }
        EditVideoSegment editVideoSegment6 = (EditVideoSegment) obj2;
        if (editVideoSegment6 != null) {
            videoFileInfo = editVideoSegment6.getVideoFileInfo();
        } else {
            videoFileInfo = null;
        }
        String str11 = "max_res_minlen";
        if (videoFileInfo != null) {
            i3 = videoFileInfo.getWidth();
        } else {
            i3 = 0;
        }
        if (videoFileInfo != null) {
            i4 = videoFileInfo.getHeight();
        } else {
            i4 = 0;
        }
        a4.mo47826a(str11, Math.min(i3, i4));
        String str12 = "max_res_maxlen";
        if (videoFileInfo != null) {
            i5 = videoFileInfo.getWidth();
        } else {
            i5 = 0;
        }
        if (videoFileInfo != null) {
            i6 = videoFileInfo.getHeight();
        } else {
            i6 = 0;
        }
        a4.mo47826a(str12, Math.max(i5, i6));
        if (videoPublishEditModel.isGreenScreen()) {
            str2 = "";
        } else {
            str2 = videoPublishEditModel.mStickerID;
        }
        a4.mo47829a("prop_list", str2);
        if (TextUtils.equals(m95207b(videoPublishEditModel), "upload")) {
            a4.mo47826a("fast_import", videoPublishEditModel.isFastImport ? 1 : 0);
            String str13 = "upload_type";
            if (videoPublishEditModel.mFromMultiCut) {
                str6 = "multiple_content";
            } else {
                str6 = "single_content";
            }
            a4.mo47829a(str13, str6);
            a4.mo47826a("fast_import_fail", videoPublishEditModel.fastImportErrorCode);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.mBindMvId)) {
            a4.mo47829a("mv_id", videoPublishEditModel.mBindMvId);
        }
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i8 = videoPublishEditModel.videoCount;
            i7 = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.frames != null) {
                i8 = videoPublishEditModel.extractFramesModel.frames.size();
            } else if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null) {
                i8 = 0;
            } else {
                i7 = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
                i8 = 0;
            }
            i7 = 0;
        }
        a4.mo47826a("video_cnt", i8);
        a4.mo47826a("pic_cnt", i7);
        a4.mo47826a("beautify_used", C23778b.m58354b(C23778b.f63365a));
        a4.mo47829a("beautify_info", C23778b.m58351a());
        a4.mo47829a("music_selected_from", videoPublishEditModel.getMusicOrigin());
        String str14 = "is_multi_content";
        if (i8 + i7 > 1) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        a4.mo47826a(str14, i9);
        a4.mo47829a("mix_type", C45624b.m99356a(i8, i7));
        String str15 = "reply_comment_id";
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str3 = videoPublishEditModel.commentVideoModel.getCommentId();
        } else {
            str3 = "";
        }
        a4.mo47829a(str15, str3);
        String str16 = "reply_user_id";
        if (CommentUtils.needMob(videoPublishEditModel)) {
            str4 = videoPublishEditModel.commentVideoModel.getUserId();
        } else {
            str4 = "";
        }
        a4.mo47829a(str16, str4);
        if (intent != null) {
            String str17 = "is_speed_change";
            if (intent.getBooleanExtra("extra_is_change_speed", false)) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            a4.mo47829a(str17, str5);
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            StringBuilder sb = new StringBuilder();
            String str18 = videoPublishEditModel.pic2VideoSource;
            C52711k.m112236a((Object) str18, "model.pic2VideoSource");
            List<String> b = C52830p.m112452b((CharSequence) str18, new String[]{","}, false, 0, 6, (Object) null);
            if (!b.isEmpty()) {
                for (String str19 : b) {
                    if (str19.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (sb.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            sb.append(",");
                        }
                        sb.append(str19);
                    }
                }
            }
            if (sb.length() > 0) {
                z3 = true;
            }
            if (z3) {
                a4.mo47829a("picture_source", sb.toString());
            }
        }
        if (videoPublishEditModel.isGreenScreen()) {
            a4.mo47826a("is_greenscreen", 1);
            a4.mo47829a("background_id_list", C32890f.m75776a(videoPublishEditModel.greenScreenImages));
            a4.mo47829a("background_type_list", C32890f.m75777b(videoPublishEditModel.greenScreenImages));
        }
        C26890h.m65011a("enter_video_edit_page", a4.f61491a);
    }

    /* renamed from: a */
    public static final void m95205a(VideoPublishEditModel videoPublishEditModel, VEVideoPublishEditViewModel vEVideoPublishEditViewModel, float f, String str) {
        C52711k.m112240b(videoPublishEditModel, "model");
        C52711k.m112240b(vEVideoPublishEditViewModel, "mViewModel");
        C52711k.m112240b(str, "nextAction");
        C2201v.m6614b(videoPublishEditModel).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C43435a<Object,Object>(videoPublishEditModel)).mo6545f((C1710e<? super T>) new C43436b<Object>(videoPublishEditModel, vEVideoPublishEditViewModel, f, str));
    }
}
