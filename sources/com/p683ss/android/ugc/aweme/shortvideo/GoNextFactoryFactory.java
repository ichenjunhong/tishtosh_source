package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p2615tt.appbrandimpl.C51928d;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43671d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43674g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.model.StickerPoiUtilsKt;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44985aq;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoRecordNewActivity;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47768ci;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory */
public class GoNextFactoryFactory implements C0183j {

    /* renamed from: a */
    public C45330z f106995a = new C45330z();

    /* renamed from: b */
    ASCameraView f106996b;

    /* renamed from: c */
    public C43225dr f106997c;

    /* renamed from: d */
    public ShortVideoContextViewModel f106998d = ((ShortVideoContextViewModel) C0214z.m440a(this.f106997c.mo87882I()).mo359a(ShortVideoContextViewModel.class));

    /* renamed from: e */
    public long f106999e;

    /* renamed from: f */
    public int f107000f;

    /* renamed from: g */
    public int f107001g;

    /* renamed from: h */
    String f107002h;

    /* renamed from: a */
    private static boolean m93011a(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((TimeSpeedModelExtension) it.next()).isSupportRetake()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m93010a(ShortVideoContext shortVideoContext) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = shortVideoContext.mo86376q().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getBubbleTexts() != null) {
                linkedHashSet.addAll(timeSpeedModelExtension.getBubbleTexts());
            }
            if (timeSpeedModelExtension.getARTexts() != null) {
                linkedHashSet2.addAll(timeSpeedModelExtension.getARTexts());
            }
        }
        shortVideoContext.f107066aR.addAll(linkedHashSet);
        shortVideoContext.f107065aQ.addAll(linkedHashSet2);
    }

    public GoNextFactoryFactory(C43225dr drVar, ASCameraView aSCameraView) {
        this.f106997c = drVar;
        this.f106996b = aSCameraView;
        this.f106997c.getLifecycle().mo324a(this);
    }

    /* renamed from: a */
    private static List<AVChallenge> m93008a(ArrayList<TimeSpeedModelExtension> arrayList, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C43214dh.m94817a().f109287b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getHashtag() != null && !TextUtils.isEmpty(timeSpeedModelExtension.getHashtag().cid)) {
                linkedHashSet.add(timeSpeedModelExtension.getHashtag());
            } else if (timeSpeedModelExtension.getHashtag() != null) {
                AVChallenge hashtag = timeSpeedModelExtension.getHashtag();
                StringBuilder sb = new StringBuilder("try to add challenge, but cid is null ,name:");
                sb.append(hashtag.challengeName);
                sb.append(",stickerId:");
                sb.append(hashtag.stickerId);
                C50203g.m108361b(sb.toString());
            }
        }
        linkedHashSet.removeAll(Collections.singleton(null));
        if (z) {
            linkedHashSet.removeAll(C43214dh.m94817a().f109287b);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: a */
    public static void m93009a(Context context, ShortVideoContext shortVideoContext) {
        String str;
        int i;
        int i2;
        AVTextExtraStruct aVTextExtraStruct;
        if (!TextUtils.isEmpty(shortVideoContext.f107041T) && !C23715d.m58202a((Collection<T>) shortVideoContext.f107044W)) {
            return;
        }
        if (shortVideoContext.mo86362d()) {
            User fromUser = shortVideoContext.f107036O.getFromUser();
            String awemeId = shortVideoContext.f107036O.getAwemeId();
            StringBuilder sb = new StringBuilder("@");
            sb.append(C43853fv.m96286a(fromUser));
            String sb2 = sb.toString();
            String string = context.getString(R.string.h35, new Object[]{sb2});
            if (string.endsWith(sb2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ");
                string = sb3.toString();
            }
            int indexOf = string.indexOf(sb2);
            int length = sb2.length() + indexOf;
            ArrayList arrayList = new ArrayList();
            arrayList.add(AVTextExtraStructHelper.createDuetStruct(indexOf, length, fromUser.getUid(), awemeId));
            shortVideoContext.f107044W = arrayList;
            shortVideoContext.f107041T = string;
            shortVideoContext.f107042U = string;
            if (shortVideoContext.mo86362d()) {
                shortVideoContext.f107036O.setChain(string);
                shortVideoContext.f107043V = true;
            }
        } else if (shortVideoContext.mo86367h()) {
            StringBuilder sb4 = new StringBuilder("@");
            sb4.append(shortVideoContext.f107125r.getUserName());
            String sb5 = sb4.toString();
            String string2 = context.getString(R.string.fw3, new Object[]{sb5});
            if (string2.endsWith(sb5)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(string2);
                sb6.append(" ");
                string2 = sb6.toString();
            }
            int indexOf2 = string2.indexOf(sb5);
            int length2 = sb5.length() + indexOf2;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(AVTextExtraStructHelper.createCommentStruct(indexOf2, length2, shortVideoContext.f107125r.getUserId()));
            shortVideoContext.f107044W = arrayList2;
            shortVideoContext.f107041T = string2;
        } else if (shortVideoContext.mo86366g()) {
            StringBuilder sb7 = new StringBuilder("@");
            sb7.append(C43853fv.m96286a(shortVideoContext.f107035N.reactionFromAuthor));
            String sb8 = sb7.toString();
            String string3 = context.getString(R.string.d3r, new Object[]{sb8});
            if (string3.endsWith(sb8)) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(string3);
                sb9.append(" ");
                string3 = sb9.toString();
            }
            int indexOf3 = string3.indexOf(sb8);
            int length3 = sb8.length() + indexOf3;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(AVTextExtraStructHelper.createDuetStruct(indexOf3, length3, shortVideoContext.f107035N.reactionFromAuthor.getUid(), shortVideoContext.f107035N.reactionFromId));
            shortVideoContext.f107044W = arrayList3;
            shortVideoContext.f107041T = string3;
        } else if (shortVideoContext.mo86365f()) {
            String str2 = "";
            if (shortVideoContext.f107095au == 1) {
                String a = C43853fv.m96286a(shortVideoContext.f107024C);
                str = context.getString(R.string.oc, new Object[]{a});
                i2 = str.indexOf(a) - 1;
                i = i2 + 1 + a.length();
            } else {
                StringBuilder sb10 = new StringBuilder("@");
                sb10.append(C43853fv.m96286a(shortVideoContext.f107024C));
                String sb11 = sb10.toString();
                String string4 = context.getString(R.string.au6, new Object[]{sb11});
                StringBuilder sb12 = new StringBuilder();
                sb12.append(string4);
                sb12.append(" ");
                str = sb12.toString();
                if (!TextUtils.isEmpty(shortVideoContext.f107025D)) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(str);
                    sb13.append("#");
                    sb13.append(shortVideoContext.f107025D);
                    sb13.append(" ");
                    str = sb13.toString();
                }
                i2 = str.indexOf(sb11);
                i = i2 + sb11.length();
                str2 = shortVideoContext.f107026E;
            }
            ArrayList arrayList4 = new ArrayList();
            if (str2 == null || shortVideoContext.f107024C == null) {
                aVTextExtraStruct = AVTextExtraStructHelper.createAtStruct(i2, i, shortVideoContext.f107024C.getUid());
            } else {
                aVTextExtraStruct = AVTextExtraStructHelper.createDuetStruct(i2, i, shortVideoContext.f107024C.getUid(), str2);
            }
            arrayList4.add(aVTextExtraStruct);
            shortVideoContext.f107044W = arrayList4;
            shortVideoContext.f107041T = str;
        } else if (shortVideoContext.f107054aF == null || TextUtils.isEmpty(shortVideoContext.f107054aF.getExtra())) {
            if (!C9376b.m18558a((Collection<T>) shortVideoContext.f107077ac) || !C9376b.m18558a((Collection<T>) shortVideoContext.f107078ad)) {
                StringBuilder sb14 = new StringBuilder();
                if (!C9376b.m18558a((Collection<T>) shortVideoContext.f107077ac)) {
                    Iterator it = shortVideoContext.f107077ac.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        sb14.append("#");
                        sb14.append(str3);
                        sb14.append(" ");
                    }
                }
                if (!C9376b.m18558a((Collection<T>) shortVideoContext.f107078ad)) {
                    ArrayList arrayList5 = new ArrayList();
                    for (TaskMentionedUser taskMentionedUser : shortVideoContext.f107078ad) {
                        if (!TextUtils.isEmpty(taskMentionedUser.getNickname()) && !TextUtils.isEmpty(taskMentionedUser.getUserId())) {
                            sb14.append("@");
                            sb14.append(taskMentionedUser.getNickname());
                            sb14.append(" ");
                            int indexOf4 = sb14.indexOf(taskMentionedUser.getNickname()) - 1;
                            arrayList5.add(AVTextExtraStructHelper.createAtStruct(indexOf4, indexOf4 + 1 + taskMentionedUser.getNickname().length(), taskMentionedUser.getUserId()));
                        }
                    }
                    shortVideoContext.f107044W = arrayList5;
                }
                shortVideoContext.f107041T = sb14.toString();
            }
        } else {
            C51928d dVar = (C51928d) C39618d.f101161b.mo34884a(shortVideoContext.f107054aF.getExtra(), C51928d.class);
            if (dVar != null && !C9376b.m18558a((Collection<T>) dVar.f129606a)) {
                StringBuilder sb15 = new StringBuilder();
                for (String str4 : dVar.f129606a) {
                    sb15.append("#");
                    sb15.append(str4);
                    sb15.append(" ");
                }
                shortVideoContext.f107041T = sb15.toString();
            }
        }
    }

    /* renamed from: a */
    public static Intent m93006a(ShortVideoContextViewModel shortVideoContextViewModel, int i, VideoRecordNewActivity videoRecordNewActivity) {
        Serializable serializable;
        boolean z;
        boolean z2;
        boolean z3;
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f107134a;
        Workspace workspace = shortVideoContextViewModel.f107134a.f107118k;
        C43789em q = shortVideoContext.mo86376q();
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (shortVideoContext.mo86361c()) {
            intent.putExtra("music_start", shortVideoContext.f107113f);
        }
        intent.putExtra("face_beauty", C39618d.f101151O.mo83118b(C40796a.BeautyModel));
        intent.putExtra("filter_id", 0);
        intent.putExtra("extra_record_video_selected_filter_index", shortVideoContext.f107073aY);
        intent.putExtra("extra_record_video_selected_filter_intensity", shortVideoContext.f107074aZ);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", ShortVideoContext.m93016a((ArrayList<TimeSpeedModelExtension>) q));
        intent.putExtra("hard_encode", shortVideoContext.f107127t);
        intent.putExtra("restore", shortVideoContext.f107101b);
        intent.putExtra("camera", i);
        intent.putExtra("filter_lables", shortVideoContext.f107082ah.toString());
        intent.putExtra("filter_ids", shortVideoContext.f107083ai.toString());
        intent.putExtra("smooth_skin_labels", shortVideoContext.f107084aj.toString());
        intent.putExtra("smooth_reshape_labels", shortVideoContext.f107085ak.toString());
        intent.putExtra("smooth_tanning_labels", shortVideoContext.f107087am.toString());
        intent.putExtra("smooth_eyes_labels", shortVideoContext.f107086al.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(q));
        intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(q));
        intent.putExtra("extra_beauty_type", shortVideoContext.f107129v);
        intent.putParcelableArrayListExtra("extra_beauty_data", RecordScene.getBeautyMetadatas(q));
        intent.putExtra("extra_video_record_metadata", C47768ci.m103397a(shortVideoContext.f107130w));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(q));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(q));
        intent.putExtra("sticker_info", RecordScene.getStickerInfo(q));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(q));
        intent.putExtra("shoot_way", shortVideoContext.f107132y);
        intent.putExtra("creation_id", shortVideoContext.f107131x);
        intent.putExtra("poi_struct_in_tools_line", shortVideoContext.f107034M);
        C44985aq findLastDoorplateLevelPoi = StickerPoiUtilsKt.findLastDoorplateLevelPoi(q);
        String str = "default_select_sticker_poi";
        if (findLastDoorplateLevelPoi == null) {
            serializable = null;
        } else {
            serializable = new C29067e(findLastDoorplateLevelPoi);
        }
        intent.putExtra(str, serializable);
        C46806g.m101652a(intent, C44309n.m97061b(shortVideoContext), C46804e.RECORD, C46804e.EDIT);
        intent.putExtra("draft_id", shortVideoContext.f107022A);
        intent.putExtra("max_duration", shortVideoContext.f107110c);
        intent.putExtra("wav_form", shortVideoContext.f107111d);
        intent.putExtra("origin", 1);
        intent.putExtra("challenge", (Serializable) m93008a((ArrayList<TimeSpeedModelExtension>) q, shortVideoContext.f107046Y));
        intent.putExtra("task_id", shortVideoContext.f107076ab);
        intent.putExtra("tag_id", shortVideoContext.f107080af);
        intent.putExtra("challenge_names", shortVideoContext.f107077ac);
        if (!C9376b.m18558a((Collection<T>) shortVideoContext.f107078ad)) {
            intent.putExtra("task_mentioned_users", (Serializable) shortVideoContext.f107078ad);
        }
        intent.putExtra("video_title", shortVideoContext.f107041T);
        intent.putExtra("video_title_chain", shortVideoContext.f107042U);
        intent.putExtra("disable_delete_title_chain", shortVideoContext.f107043V);
        intent.putExtra("struct_list", (Serializable) shortVideoContext.f107044W);
        intent.putExtra("is_rivate", shortVideoContext.f107045X);
        intent.putExtra("duet_from", shortVideoContext.f107026E);
        intent.putExtra("duet_author", shortVideoContext.f107024C);
        intent.putExtra("duet_hash_tag", shortVideoContext.f107025D);
        intent.putExtra("shoot_mode", shortVideoContext.f107081ag);
        intent.putExtra("duration_mode", shortVideoContext.f107089ao);
        intent.putExtra("record_mode", shortVideoContext.f107095au);
        intent.putExtra("record_game_score", shortVideoContext.f107096av);
        intent.putExtra("reaction_params", shortVideoContext.f107035N);
        String str2 = "is_muted";
        if (!shortVideoContext.f107040S || shortVideoContext.f107095au == 1) {
            z = false;
        } else {
            z = true;
        }
        intent.putExtra(str2, z);
        intent.putExtra("music_origin", shortVideoContext.f107115h);
        intent.putExtra("extract_model", shortVideoContext.f107092ar);
        intent.putExtra("micro_app_info", shortVideoContext.f107054aF);
        String str3 = "enter_record_from_other_platform";
        if (videoRecordNewActivity == null || !shortVideoContext.f107055aG) {
            z2 = false;
        } else {
            z2 = true;
        }
        intent.putExtra(str3, z2);
        String str4 = "back_to_main_after_publish";
        if (shortVideoContext.f107054aF == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        intent.putExtra(str4, z3);
        intent.putExtra("extra_import_compile_cost_time", shortVideoContext.f107093as - shortVideoContext.f107094at);
        intent.putExtra("extra_start_enter_edit_page", shortVideoContext.f107094at);
        if (shortVideoContext.f107062aN != null) {
            intent.putExtra("story_festival_model", shortVideoContext.f107062aN);
        }
        m93010a(shortVideoContext);
        if (!C23715d.m58202a((Collection<T>) shortVideoContext.f107065aQ)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.f107065aQ);
        }
        if (!C23715d.m58202a((Collection<T>) shortVideoContext.f107066aR)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.f107066aR);
        }
        if (!C23715d.m58202a((Collection<T>) shortVideoContext.f107071aW)) {
            intent.putIntegerArrayListExtra("extra_countdown_mode", shortVideoContext.f107071aW);
        }
        intent.putExtra("av_et_parameter", shortVideoContext.mo86370k());
        if (shortVideoContext.f107063aO != null) {
            intent.putExtra("extra_mention_user_model", shortVideoContext.f107063aO);
        }
        intent.putExtra("enter_from", shortVideoContext.f107133z);
        intent.putExtra("send_to_user_head", shortVideoContext.f107064aP);
        if (shortVideoContext.f107068aT != null) {
            intent.putExtra("extra_draft_transform_model", shortVideoContext.f107068aT);
        }
        if (shortVideoContext.f107069aU != null) {
            intent.putExtra("extra_ve_cher_effect_param", shortVideoContext.f107069aU);
        }
        StringBuilder sb = new StringBuilder();
        if (!C23715d.m58202a((Collection<T>) shortVideoContext.f107103bb)) {
            Iterator it = shortVideoContext.f107103bb.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(",");
                }
                sb.append(str5);
            }
        }
        intent.putExtra("picture_source", sb.toString());
        intent.putExtra("contain_backgroundvideo", shortVideoContext.mo86378s());
        shortVideoContext.f107102ba = 0;
        intent.putExtra("use_music_before_edit", shortVideoContext.mo86361c());
        intent.putExtra("support_retake", m93011a((ArrayList<TimeSpeedModelExtension>) q));
        intent.putExtra("extra_duet_layout", shortVideoContext.f107104bc);
        intent.putExtra("extra_suggest_human_volume", shortVideoContext.f107029H);
        intent.putExtra("extra_suggest_video_volume", shortVideoContext.f107030I);
        intent.putExtra("extra_success_enable_aec", shortVideoContext.f107031J);
        intent.putExtra("comment_video_model", shortVideoContext.f107125r);
        intent.putStringArrayListExtra("extra_camera_lens_info", RecordScene.getCameraLensInfoList(q));
        if (shortVideoContext.mo86362d()) {
            intent.putExtra("stitch_params", shortVideoContext.f107036O);
            if (shortVideoContext.f107036O.getMusic() != null) {
                intent.putExtra("music_start", (int) Math.max(0, ((long) shortVideoContext.f107113f) - shortVideoContext.f107036O.getDuration()));
            }
        }
        if (shortVideoContext.f107081ag == 13) {
            C43895j jVar = new C43895j();
            jVar.greenScreen = 1;
            intent.putExtra("av_upload_struct", jVar);
            if (!TextUtils.isEmpty(shortVideoContext.f107107bf)) {
                intent.putExtra("green_screen_default_image", shortVideoContext.f107107bf);
            }
            intent.putParcelableArrayListExtra("green_screen_image_list", RecordScene.getGreenScreenImages(q));
        }
        return intent;
    }

    /* renamed from: a */
    public static EditPreviewInfo m93007a(ShortVideoContext shortVideoContext, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        EditPreviewInfo editPreviewInfo;
        int i;
        if (!C43223dp.m94850a() || multiEditVideoStatusRecordData == null || shortVideoContext.mo86362d()) {
            editPreviewInfo = new C43674g().mo89103a(new EditVideoSegment(str, str2, C43668b.m95933a(str)));
        } else {
            int i2 = shortVideoContext.f107116i;
            if (shortVideoContext.mo86365f()) {
                i = shortVideoContext.f107117j / 2;
            } else {
                i = shortVideoContext.f107117j;
            }
            editPreviewInfo = new C43671d(i2, i).mo89101a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
        }
        if (!(shortVideoContext.f107036O == null || shortVideoContext.f107036O.getVideoSegment() == null)) {
            editPreviewInfo.getVideoList().add(0, shortVideoContext.f107036O.getVideoSegment());
            shortVideoContext.f107036O.setConcatVideoPath(str);
            shortVideoContext.f107036O.setConcatAudioPath(str2);
        }
        return editPreviewInfo;
    }
}
