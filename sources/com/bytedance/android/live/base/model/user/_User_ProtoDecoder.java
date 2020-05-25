package com.bytedance.android.live.base.model.user;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;

public final class _User_ProtoDecoder implements C2888b<User> {
    public final User decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static User decodeStatic(C2895g gVar) throws Exception {
        User user = new User();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return user;
            } else if (b == 1013) {
                user.backgroundImgUrl = C2896h.m8234e(gVar);
            } else if (b != 1028) {
                switch (b) {
                    case 1:
                        user.f8810id = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        user.shortId = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        user.nickName = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        user.gender = C2896h.m8231b(gVar);
                        break;
                    case 5:
                        user.signature = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        user.level = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        user.birthday = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        user.telephone = C2896h.m8234e(gVar);
                        break;
                    case 9:
                        user.avatarThumb = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        user.avatarMedium = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        user.avatarLarge = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 12:
                        user.isVerified = C2896h.m8230a(gVar);
                        break;
                    case 13:
                        user.experience = C2896h.m8231b(gVar);
                        break;
                    case 14:
                        user.city = C2896h.m8234e(gVar);
                        break;
                    case 15:
                        user.status = C2896h.m8231b(gVar);
                        break;
                    case 16:
                        user.createTime = C2896h.m8232c(gVar);
                        break;
                    case 17:
                        user.modifyTime = C2896h.m8232c(gVar);
                        break;
                    case 18:
                        user.secret = C2896h.m8231b(gVar);
                        break;
                    case 19:
                        user.shareQrcodeUri = C2896h.m8234e(gVar);
                        break;
                    case 20:
                        user.incomeSharePercent = C2896h.m8231b(gVar);
                        break;
                    case 21:
                        if (user.badgeImageList == null) {
                            user.badgeImageList = new ArrayList();
                        }
                        user.badgeImageList.add(_ImageModel_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 22:
                        user.followInfo = _FollowInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 23:
                        user.userHonor = _UserHonor_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 24:
                        user.fansClub = _FansClubMember_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 25:
                        user.border = _BorderInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        user.specialId = C2896h.m8234e(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        user.avatarBorder = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 28:
                        user.medal = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 29:
                        if (user.userBadges == null) {
                            user.userBadges = new ArrayList();
                        }
                        user.userBadges.add(_ImageModel_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 30:
                        if (user.newUserBadges == null) {
                            user.newUserBadges = new ArrayList();
                        }
                        user.newUserBadges.add(_ImageModel_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 31:
                        user.topVipNo = (int) C2896h.m8232c(gVar);
                        break;
                    case 32:
                        user.userAttr = _UserAttr_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 33:
                        user.ownRoom = _User_OwnRoom_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        switch (b) {
                            case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                                user.fanTicketCount = C2896h.m8232c(gVar);
                                break;
                            case 36:
                                user.anchorInfo = _AnchorInfo_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 37:
                                user.linkMicStats = C2896h.m8231b(gVar);
                                break;
                            case 38:
                                user.displayId = C2896h.m8234e(gVar);
                                break;
                            case 39:
                                user.enableShowCommerceSale = C2896h.m8230a(gVar);
                                break;
                            default:
                                switch (b) {
                                    case BaseNotice.LIKE /*41*/:
                                        user.payScores = C2896h.m8232c(gVar);
                                        break;
                                    case 42:
                                        user.anchorLevel = _AnchorLevel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 43:
                                        user.verifiedContent = C2896h.m8234e(gVar);
                                        break;
                                    case 44:
                                        user.authorInfo = _Author_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case BaseNotice.f96882AT /*45*/:
                                        if (user.topFans == null) {
                                            user.topFans = new ArrayList();
                                        }
                                        user.topFans.add(decodeStatic(gVar));
                                        break;
                                    case 46:
                                        user.secUid = C2896h.m8234e(gVar);
                                        break;
                                    case 47:
                                        user.userRole = C2896h.m8231b(gVar);
                                        break;
                                    case 48:
                                        user.xiguaUserParams = _XiguaUserParams_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 49:
                                        user.rewardInfo = _ActivityRewardInfo_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 50:
                                        user.nobleLevelInfo = _NobleLevelInfo_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 51:
                                        user.fraternityInfo = _FraternityInfo_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 52:
                                        user.personalCard = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    case 53:
                                        user.authenticationInfo = _AuthenticationInfo_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                    default:
                                        switch (b) {
                                            case 1043:
                                                user.verifiedReason = C2896h.m8234e(gVar);
                                                break;
                                            case 1044:
                                                user.enableCarManagementPermission = C2896h.m8230a(gVar);
                                                break;
                                            default:
                                                C2896h.m8236g(gVar);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                user.idStr = C2896h.m8234e(gVar);
            }
        }
    }
}
