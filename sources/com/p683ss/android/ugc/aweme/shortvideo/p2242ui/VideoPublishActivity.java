package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.greenscreen.C32890f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.C42386b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43447bb;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43886a;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43894h;
import com.p683ss.android.ugc.aweme.shortvideo.p2219p.C44351b;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.p683ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47768ci;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity */
public class VideoPublishActivity extends AmeSSActivity implements C45205n {

    /* renamed from: a */
    TextView f113732a;

    /* renamed from: b */
    TextView f113733b;

    /* renamed from: c */
    TextView f113734c;

    /* renamed from: d */
    public VideoPublishEditModel f113735d;

    /* renamed from: e */
    private C45054bg f113736e;

    /* renamed from: f */
    private boolean f113737f;

    /* renamed from: g */
    private int f113738g;

    /* renamed from: h */
    private boolean f113739h;

    /* renamed from: i */
    private ToolSafeHandler f113740i = new ToolSafeHandler(this);

    /* renamed from: j */
    private String f113741j;

    /* renamed from: k */
    private boolean f113742k;

    /* renamed from: l */
    private boolean f113743l;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final boolean mo78676a() {
        return this.f113742k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo91169e() {
        C43214dh.m94817a().mo87855e();
        finish();
    }

    public void finish() {
        m98169a(false);
        super.finish();
        overridePendingTransition(0, R.anim.r);
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("video_post_page");
    }

    public void onBackPressed() {
        if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            mo91167c();
            mo91169e();
            return;
        }
        mo91168d();
        mo91169e();
    }

    public void onDestroy() {
        m98169a(false);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
        C45412b.m98979a().leave(this, "video_publish");
    }

    public void onPause() {
        super.onPause();
        if (this.f113735d != null) {
            C45412b.m98979a().pause(this, "video_publish", this.f113735d.creationId, this.f113735d.mShootWay);
        }
    }

    public void onResume() {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", true);
        super.onResume();
        if (this.f113736e != null) {
            C45054bg bgVar = this.f113736e;
            if (bgVar.f114131q == null || !bgVar.f114131q.isPoiOrderRate()) {
                z = false;
            }
            if (z) {
                this.f113734c.setText(R.string.crz);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onResume", false);
    }

    /* renamed from: f */
    private void m98170f() {
        long j;
        long longExtra = getIntent().getLongExtra("draft_to_edit_start_time", -1);
        if (longExtra == -1) {
            j = -1;
        } else {
            j = System.currentTimeMillis() - longExtra;
        }
        long longExtra2 = getIntent().getLongExtra("draft_modify_time", -1);
        long longExtra3 = getIntent().getLongExtra("draft_file_size", -1);
        int i = 1;
        EditPreviewInfo previewInfo = this.f113735d.getPreviewInfo();
        if (previewInfo != null) {
            i = previewInfo.getVideoList().size();
        }
        C47702b.f120193a.mo94984a("tool_performance_draft_to_publish", C23089d.m56640a().mo47827a("duration", j).mo47827a("video_size", longExtra3).mo47826a("video_count", i).mo47829a("music_id", this.f113735d.musicId).mo47827a("modify_time", longExtra2).f61491a);
    }

    /* renamed from: c */
    public final void mo91167c() {
        C43886a aVar;
        C45054bg bgVar = (C45054bg) getSupportFragmentManager().mo2222a((int) R.id.ajf);
        bgVar.mo91423b("enter_video_edit_page");
        bgVar.mo91426h();
        bgVar.mo91427i();
        VideoPublishEditModel videoPublishEditModel = bgVar.f114131q;
        String str = videoPublishEditModel.title;
        String str2 = videoPublishEditModel.chain;
        boolean z = videoPublishEditModel.disableDeleteChain;
        List list = videoPublishEditModel.structList;
        int i = videoPublishEditModel.isPrivate;
        String str3 = videoPublishEditModel.poiId;
        List list2 = videoPublishEditModel.challenges;
        C29067e eVar = videoPublishEditModel.defaultSelectStickerPoi;
        C52711k.m112240b(videoPublishEditModel, "model");
        if (videoPublishEditModel.isMvThemeVideoType()) {
            aVar = new C43886a(videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, videoPublishEditModel.mvCreateVideoData.videoCoverImgPath);
        } else if (videoPublishEditModel.isStatusVideoType()) {
            aVar = new C43886a(videoPublishEditModel.statusCreateVideoData.getVideoCoverStartTime(), videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath());
        } else {
            aVar = new C43886a((int) (videoPublishEditModel.mVideoCoverStartTm * 1000.0f), null, 2, null);
        }
        C43894h hVar = new C43894h(str, str2, z, list, i, str3, list2, eVar, aVar, videoPublishEditModel.stickerChallenge, videoPublishEditModel.compileProbeResult);
        hVar.f111174i = videoPublishEditModel.commentSetting;
        hVar.f111178m = videoPublishEditModel.commerceData;
        hVar.f111179n = videoPublishEditModel.allowDownloadSetting;
        hVar.f111180o = videoPublishEditModel.videoCategory;
        C53755c.m114319a().mo112960d(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo91166b() {
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        int i3;
        int i4;
        String str4;
        String str5;
        String str6;
        if (getIntent().getIntExtra("fromDraft", 0) == 0) {
            if (this.f113735d.isReviewVideo()) {
                this.f113732a.setText(R.string.pm);
                this.f113733b.setVisibility(0);
                this.f113733b.setOnClickListener(new C45048ba(this));
                this.f113732a.setOnClickListener(new C47687av() {
                    /* renamed from: a */
                    public final void mo59929a(View view) {
                        VideoPublishActivity.this.mo91168d();
                        VideoPublishActivity.this.mo91169e();
                    }
                });
            } else {
                if (this.f113735d.mIsFromDraft) {
                    this.f113733b.setVisibility(0);
                    this.f113733b.setOnClickListener(new C45049bb(this));
                }
                this.f113732a.setOnClickListener(new C47687av() {
                    /* renamed from: a */
                    public final void mo59929a(View view) {
                        C26890h.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page"));
                        C43434az.m95203a(VideoPublishActivity.this.f113735d, (Intent) null);
                        VideoPublishActivity.this.mo91167c();
                        VideoPublishActivity.this.mo91169e();
                    }
                });
            }
            this.f113735d.challenges = (List) getIntent().getSerializableExtra("challenge");
            this.f113735d.nationalTaskId = getIntent().getStringExtra("task_id");
            this.f113735d.tagId = getIntent().getStringExtra("tag_id");
        } else {
            this.f113732a.setText(R.string.pm);
            this.f113732a.setOnClickListener(new C47687av() {
                /* renamed from: a */
                public final void mo59929a(View view) {
                    VideoPublishActivity.this.mo91168d();
                    VideoPublishActivity.this.mo91169e();
                }
            });
            this.f113733b.setVisibility(0);
            this.f113733b.setOnClickListener(new C45050bc(this));
            this.f113735d.mIsFromDraft = true;
            m98170f();
            StringBuilder sb = new StringBuilder("[Filter Intensity] VideoPublishActivity 从草稿箱来 mSelectedFilterIntensity:");
            sb.append(this.f113735d.mSelectedFilterIntensity);
            sb.append(" mSelectedId:");
            sb.append(this.f113735d.mSelectedId);
            sb.append(" mUseFilter:");
            sb.append(this.f113735d.mUseFilter);
            C50203g.m108358a(sb.toString());
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("args", this.f113735d);
        bundle.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
        bundle.putInt("extra_stick_point_type", getIntent().getIntExtra("extra_stick_point_type", 0));
        bundle.putBoolean("enter_record_from_other_platform", this.f113737f);
        bundle.putBoolean("extra_enter_from_live", this.f113743l);
        bundle.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        if (getIntent().getBooleanExtra("review_video_fast_publish", false)) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f113736e = (C45054bg) supportFragmentManager.mo2222a((int) R.id.ajf);
        if (this.f113736e == null) {
            this.f113736e = new C45054bg();
            this.f113736e.setArguments(bundle);
            supportFragmentManager.mo2225a().mo2175a((int) R.id.ajf, (Fragment) this.f113736e).mo2189b();
        }
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f113735d.creationId).mo47829a("shoot_way", this.f113735d.mShootWay).mo47826a("draft_id", this.f113735d.draftId).mo47829a("filter_list", this.f113735d.mCurFilterLabels).mo47829a("filter_id_list", this.f113735d.mCurFilterIds);
        String str7 = "is_hardcode";
        if (C40797m.m90243a()) {
            str = "1";
        } else {
            str = "0";
        }
        C23089d a2 = a.mo47829a(str7, str).mo47829a("bite_rate", String.valueOf(C40797m.m90249d())).mo47826a("video_quality", C40797m.m90251f()).mo47829a("resolution", this.f113735d.getVideoResolution()).mo47829a("content_type", C43855fx.m96289b(this.f113735d));
        String str8 = "improve_status";
        if (this.f113735d.autoEnhanceOn) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C23089d a3 = a2.mo47829a(str8, str2);
        String str9 = "is_dubbed";
        if (this.f113735d.veAudioRecorderParam == null || !this.f113735d.veAudioRecorderParam.hasRecord()) {
            i = 0;
        } else {
            i = 1;
        }
        C23089d a4 = a3.mo47826a(str9, i);
        String str10 = "improve_method";
        if (this.f113735d.autoEnhanceType == 1) {
            str3 = "light";
        } else {
            str3 = "hdr";
        }
        C23089d a5 = a4.mo47829a(str10, str3).mo47829a("content_source", this.f113735d.getAvetParameter().getContentSource()).mo47826a("is_subtitled", this.f113735d.hasSubtitle() ? 1 : 0).mo47826a("location_gps_cnt", this.f113735d.getCoordinateCount());
        if (this.f113735d.mFromCut || this.f113735d.mFromMultiCut) {
            i3 = this.f113735d.videoCount;
            i2 = this.f113735d.photoCount;
            String str11 = "upload_type";
            if (this.f113735d.mFromMultiCut) {
                str6 = "multiple_content";
            } else {
                str6 = "single_content";
            }
            a5.mo47829a(str11, str6);
        } else {
            if (this.f113735d.extractFramesModel != null && this.f113735d.extractFramesModel.frames != null) {
                i3 = this.f113735d.extractFramesModel.frames.size();
            } else if (this.f113735d.mvCreateVideoData == null || this.f113735d.mvCreateVideoData.selectMediaList == null) {
                i3 = 0;
            } else {
                i2 = this.f113735d.mvCreateVideoData.selectMediaList.size();
                i3 = 0;
            }
            i2 = 0;
        }
        a5.mo47826a("video_cnt", i3);
        a5.mo47826a("pic_cnt", i2);
        a5.mo47829a("music_selected_from", this.f113735d.getMusicOrigin());
        String str12 = "is_multi_content";
        if (i3 + i2 > 1) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        a5.mo47826a(str12, i4);
        a5.mo47829a("mix_type", C45624b.m99356a(i3, i2));
        String str13 = "reply_comment_id";
        if (CommentUtils.needMob(this.f113735d)) {
            str4 = this.f113735d.commentVideoModel.getCommentId();
        } else {
            str4 = "";
        }
        a5.mo47829a(str13, str4);
        String str14 = "reply_user_id";
        if (CommentUtils.needMob(this.f113735d)) {
            str5 = this.f113735d.commentVideoModel.getUserId();
        } else {
            str5 = "";
        }
        a5.mo47829a(str14, str5);
        if (!TextUtils.isEmpty(this.f113735d.getBindMvId())) {
            a5.mo47829a("mv_id", this.f113735d.getBindMvId());
        }
        if (!TextUtils.isEmpty(this.f113735d.pic2VideoSource)) {
            StringBuilder sb2 = new StringBuilder();
            String[] split = this.f113735d.pic2VideoSource.split(",");
            if (!C23715d.m58203a((T[]) split)) {
                for (String str15 : split) {
                    if (!str15.isEmpty()) {
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(str15);
                    }
                }
            }
            if (!TextUtils.isEmpty(sb2)) {
                a5.mo47829a("picture_source", sb2.toString());
            }
        }
        if (this.f113735d.isGreenScreen()) {
            a5.mo47826a("is_greenscreen", 1);
            a5.mo47829a("background_id_list", C32890f.m75776a(this.f113735d.greenScreenImages));
            a5.mo47829a("background_type_list", C32890f.m75777b(this.f113735d.greenScreenImages));
        }
        C26890h.m65011a("enter_video_post_page", a5.f61491a);
        C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("creation_id", this.f113735d.creationId).mo47829a("enter_from", "publish").mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
        C45422a.m98993a((Activity) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo91168d() {
        String str;
        Object obj;
        boolean z;
        C43434az.m95203a(this.f113735d, (Intent) null);
        C45054bg bgVar = (C45054bg) getSupportFragmentManager().mo2222a((int) R.id.ajf);
        bgVar.mo91423b("enter_video_edit_page");
        bgVar.mo91426h();
        bgVar.mo91427i();
        VideoPublishEditModel videoPublishEditModel = bgVar.f114131q;
        Intent intent = new Intent();
        intent.putExtra("draft_to_edit_from", this.f113738g);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("workspace", C42386b.m93131a(videoPublishEditModel));
        } else {
            intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        }
        intent.putExtra("sticker_challenge", videoPublishEditModel.stickerChallenge);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("dir", C43307ea.f109491d);
        intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
        intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
        if (videoPublishEditModel.mBeautyMetadatas != null && !videoPublishEditModel.mBeautyMetadatas.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
        }
        intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
        intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
        intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
        intent.putExtra("filter_lables", videoPublishEditModel.mCurFilterLabels);
        intent.putExtra("filter_ids", videoPublishEditModel.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", videoPublishEditModel.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", videoPublishEditModel.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", videoPublishEditModel.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", videoPublishEditModel.mTanningLabels);
        intent.putExtra("extra_aweme_speed", videoPublishEditModel.videoSpeed);
        intent.putExtra("extra_av_camera_ids", videoPublishEditModel.cameraIds);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("extra_beauty_type", videoPublishEditModel.beautyType);
        }
        intent.putExtra("extra_video_record_metadata", C47768ci.m103397a(videoPublishEditModel.metadataMap));
        intent.putExtra("music_start", videoPublishEditModel.mMusicStart);
        intent.putExtra("extra_music_end", videoPublishEditModel.mMusicEnd);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("max_duration", videoPublishEditModel.maxDuration);
        }
        intent.putExtra("wav_form", videoPublishEditModel.audioTrack);
        intent.putExtra("video_segment", videoPublishEditModel.mVideoSegmentsDesc);
        intent.putExtra("content_type", C43855fx.m96289b(videoPublishEditModel));
        String str2 = "content_source";
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
            str = "upload";
        } else {
            str = "shoot";
        }
        intent.putExtra(str2, str);
        intent.putExtra("default_select_sticker_poi", videoPublishEditModel.defaultSelectStickerPoi);
        intent.putExtra("hard_encode", videoPublishEditModel.mHardEncode);
        intent.putExtra("sticker_path", videoPublishEditModel.mStickerPath);
        intent.putExtra("sticker_id", videoPublishEditModel.mStickerID);
        intent.putExtra("first_sticker_music_ids", videoPublishEditModel.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        boolean z2 = true;
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("isFromDraft", true);
        }
        intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("effectList", videoPublishEditModel.mEffectList);
        }
        StringBuilder sb = new StringBuilder("effect list from publish : ");
        if (videoPublishEditModel.mEffectList != null) {
            obj = Integer.valueOf(videoPublishEditModel.mEffectList.size());
        } else {
            obj = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(obj);
        intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
        intent.putExtra("origin", videoPublishEditModel.mOrigin);
        intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
        intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
        intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
        intent.putExtra("challenge", (Serializable) videoPublishEditModel.challenges);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("shoot_way", "draft_again");
        } else {
            intent.putExtra("shoot_way", "direct_shoot");
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.chain);
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.disableDeleteChain);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("poi_struct_in_tools_line", videoPublishEditModel.poiId);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        }
        intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
        intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
        intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
        intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
        intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
        intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
        intent.putExtra("task_id", videoPublishEditModel.nationalTaskId);
        intent.putExtra("tag_id", videoPublishEditModel.tagId);
        intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
        intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
        intent.putExtra("record_mode", videoPublishEditModel.recordMode);
        intent.putExtra("record_game_score", videoPublishEditModel.gameScore);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("time_effect", videoPublishEditModel.mTimeEffect);
        intent.putExtra("reaction_params", videoPublishEditModel.reactionParams);
        intent.putExtra("is_muted", videoPublishEditModel.isMuted);
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
        }
        intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", videoPublishEditModel.veCherEffectParam);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", videoPublishEditModel.veAudioEffectParam);
        }
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            intent.putExtra("audio_record_param", videoPublishEditModel.veAudioRecorderParam);
        }
        if (videoPublishEditModel.videoCategory != null) {
            intent.putExtra("video_category", videoPublishEditModel.videoCategory);
        }
        if (videoPublishEditModel.commentVideoModel != null) {
            intent.putExtra("comment_video_model", videoPublishEditModel.commentVideoModel);
        }
        C46806g.m101652a(intent, C44309n.m97057a((BaseShortVideoContext) videoPublishEditModel), C46804e.PUBLISH, C46804e.EDIT);
        intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
        intent.putExtra("infosticker_model", videoPublishEditModel.infoStickerModel);
        intent.putExtra("extra_auto_enhance_type", videoPublishEditModel.autoEnhanceType);
        intent.putExtra("extra_auto_enhance_state", videoPublishEditModel.autoEnhanceOn);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        if (C39618d.f101152P.mo83104b(C40790a.RecommentMusicByAIPolicy) != 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("key_status_video_data", videoPublishEditModel.statusCreateVideoData);
        intent.putExtra("av_upload_struct", videoPublishEditModel.uploadMiscInfoStruct);
        if (videoPublishEditModel.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
        }
        intent.putExtra("extra_multi_edit_video_data", videoPublishEditModel.multiEditVideoRecordData);
        intent.putExtra("extra_stickpoint_mode", videoPublishEditModel.isStickPointMode);
        intent.putExtra("key_stick_point_data", videoPublishEditModel.stickPointData);
        intent.putExtra("cutsame_data", videoPublishEditModel.cutSameEditData);
        if (!z || videoPublishEditModel == null || !TextUtils.isEmpty(videoPublishEditModel.getDuetFrom()) || videoPublishEditModel.getReactionParams() != null) {
            z2 = false;
        }
        if (z) {
            C39618d.f101168i.mo80585g().mo80590a(videoPublishEditModel.extractFramesModel, z2, videoPublishEditModel.creationId);
            if (C44351b.m97144a() == 2) {
                C39618d.f101168i.mo80584f();
            }
        }
        intent.setClass(this, VEVideoPublishEditActivity.class);
        intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
        intent.putExtra("extra_av_enable_fast_import_resolution", videoPublishEditModel.fastImportResolution);
        if (videoPublishEditModel.getPreviewInfo() != null) {
            intent.putExtra("extra_edit_preview_info", videoPublishEditModel.getPreviewInfo());
        }
        if (videoPublishEditModel.draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", videoPublishEditModel.draftEditTransferModel);
        }
        intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
        intent.putExtra("use_music_before_edit", videoPublishEditModel.mUseMusicBeforeEdit);
        if (!TextUtils.isEmpty(videoPublishEditModel.reviewVideoId)) {
            intent.putExtra("video_id", videoPublishEditModel.reviewVideoId);
        }
        if (!videoPublishEditModel.isReviewVideo() || !this.f113739h) {
            C43763r.m96182a(false);
        }
        intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
        if (videoPublishEditModel.publishFromLive()) {
            intent.putExtra("live_publish_model", videoPublishEditModel.livePublishModel);
        }
        intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.isGreenScreen()) {
            intent.putExtra("green_screen_default_image", videoPublishEditModel.greenScreenDefaultImage);
            intent.putParcelableArrayListExtra("green_screen_image_list", videoPublishEditModel.greenScreenImages);
        }
        startActivity(intent);
    }

    /* renamed from: a */
    private void m98169a(boolean z) {
        this.f113742k = z;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "video_publish");
        super.onCreate(bundle);
        m98169a(true);
        setContentView((int) R.layout.es);
        this.f113732a = (TextView) findViewById(R.id.ij);
        this.f113733b = (TextView) findViewById(R.id.q7);
        this.f113734c = (TextView) findViewById(R.id.title);
        this.f113735d = (VideoPublishEditModel) getIntent().getSerializableExtra("args");
        this.f113737f = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.f113743l = getIntent().getBooleanExtra("extra_enter_from_live", false);
        this.f113738g = getIntent().getIntExtra("draft_to_edit_from", 0);
        this.f113741j = getIntent().getStringExtra("review_video_id");
        if (this.f113735d != null) {
            mo91166b();
        } else if (!TextUtils.isEmpty(this.f113741j)) {
            this.f113739h = false;
            String stringExtra = getIntent().getStringExtra("review_video_draft_primary_key");
            if (!TextUtils.isEmpty(stringExtra)) {
                C46797a.m101642a().execute(new C45001az(this, stringExtra));
            } else {
                String stringExtra2 = getIntent().getStringExtra("video_path");
                this.f113735d = new VideoPublishEditModel();
                new C43447bb("VideoPublishActivity");
                if (!C43447bb.m95226a(this.f113735d, getIntent(), stringExtra2)) {
                    C10691a.m21542b(getApplicationContext(), (int) R.string.at3).mo19066a();
                } else {
                    this.f113735d.reviewVideoId = this.f113741j;
                    this.f113739h = true;
                    C43763r.m96182a(true);
                    C45318u.m98794a(this.f113735d.creationId);
                    mo91166b();
                }
            }
        } else {
            C50203g.m108361b("VideoPublishActivity onCreate error, model == null");
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity", "onCreate", false);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f113736e != null && this.f113736e.isAdded()) {
            this.f113736e.onActivityResult(i, i2, intent);
        }
    }
}
