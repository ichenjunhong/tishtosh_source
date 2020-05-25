package com.bytedance.android.livesdkapi.depend.model.live;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.live._RoomStats_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class _Room_ProtoDecoder implements C2888b<Room> {
    public final Room decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static Room decodeStatic(C2895g gVar) throws Exception {
        Room room = new Room();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        room.f23771id = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        room.idStr = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        room.status = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        room.ownerUserId = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        room.title = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        room.userCount = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        room.createTime = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        room.linkMicLayout = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        room.finishTime = C2896h.m8232c(gVar);
                        break;
                    case 11:
                        room.dynamicCoverUri = C2896h.m8234e(gVar);
                        break;
                    case 12:
                        if (room.dynamicCoverDict == null) {
                            room.dynamicCoverDict = new LinkedHashMap();
                        }
                        long a2 = gVar.mo7514a();
                        Long l = null;
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo7517b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        l = Long.valueOf(C2896h.m8232c(gVar));
                                        break;
                                    case 2:
                                        obj = C2896h.m8234e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    room.dynamicCoverDict.put(l, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 13:
                        room.lastPingTime = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        room.liveId = C2896h.m8232c(gVar);
                        break;
                    case 15:
                        room.streamProvider = C2896h.m8232c(gVar);
                        break;
                    case 16:
                        room.platform = (int) C2896h.m8232c(gVar);
                        break;
                    case 17:
                        room.clientVersion = String.valueOf(C2896h.m8232c(gVar));
                        break;
                    case 18:
                        room.withLinkMic = C2896h.m8230a(gVar);
                        break;
                    case 19:
                        room.enableRoomPerspective = C2896h.m8230a(gVar);
                        break;
                    case 20:
                        room.cover = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 21:
                        room.dynamicCover = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 22:
                        room.dynamicCoverLow = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 23:
                        room.shareUrl = C2896h.m8234e(gVar);
                        break;
                    case 24:
                        room.anchorShareText = C2896h.m8234e(gVar);
                        break;
                    case 25:
                        room.userShareText = C2896h.m8234e(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        room.streamId = C2896h.m8232c(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        room.streamIdStr = C2896h.m8234e(gVar);
                        break;
                    case 28:
                        room.streamUrl = _StreamUrl_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 29:
                        room.mosaicStatus = (int) C2896h.m8232c(gVar);
                        break;
                    case 30:
                        room.mosaicTip = C2896h.m8234e(gVar);
                        break;
                    case 31:
                        room.cellStyle = C2896h.m8232c(gVar);
                        break;
                    case 32:
                        room.linkMicInfoGson = _RoomLinkInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 33:
                        room.redEnvelopeNumber = (int) C2896h.m8232c(gVar);
                        break;
                    case 34:
                        if (room.decorationList == null) {
                            room.decorationList = new ArrayList();
                        }
                        room.decorationList.add(_RoomDecoration_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                        if (room.topFanTickets == null) {
                            room.topFanTickets = new ArrayList();
                        }
                        room.topFanTickets.add(_TopFanTicket_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 36:
                        room.stats = _RoomStats_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 37:
                        room.dailyRankContent = C2896h.m8234e(gVar);
                        break;
                    case 38:
                        room.distance = C2896h.m8234e(gVar);
                        break;
                    case 39:
                        room.distanceCity = C2896h.m8234e(gVar);
                        break;
                    case 40:
                        room.location = C2896h.m8234e(gVar);
                        break;
                    case BaseNotice.LIKE /*41*/:
                        room.realDistance = C2896h.m8234e(gVar);
                        break;
                    case 42:
                        room.feedRoomLabel = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 43:
                        room.labels = C2896h.m8234e(gVar);
                        break;
                    case 44:
                        room.livingRoomAttrs = _RoomUserAttr_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case BaseNotice.f96882AT /*45*/:
                        if (room.adminUserIds == null) {
                            room.adminUserIds = new ArrayList();
                        }
                        room.adminUserIds.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    case 46:
                        room.owner = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 47:
                        room.privateInfo = C2896h.m8234e(gVar);
                        break;
                    case 48:
                        room.hasCommerceGoods = C2896h.m8230a(gVar);
                        break;
                    case 49:
                        room.liveTypeNormal = C2896h.m8230a(gVar);
                        break;
                    case 50:
                        room.liveTypeLinkmic = C2896h.m8230a(gVar);
                        break;
                    case 51:
                        room.liveTypeAudio = C2896h.m8230a(gVar);
                        break;
                    case 52:
                        room.isThirdParty = C2896h.m8230a(gVar);
                        break;
                    case 53:
                        room.isScreenshot = C2896h.m8230a(gVar);
                        break;
                    case 54:
                        room.liveTypeSandbox = C2896h.m8230a(gVar);
                        break;
                    case 59:
                        room.mGroupId = C2896h.m8232c(gVar);
                        break;
                    case 60:
                        room.orientation = (int) C2896h.m8232c(gVar);
                        break;
                    case UnReadVideoExperiment.RELATION_LIST /*64*/:
                        room.popularity = C2896h.m8232c(gVar);
                        break;
                    case 65:
                        room.popularityStr = C2896h.m8234e(gVar);
                        break;
                    case 72:
                        room.mRoomAuthStatus = _RoomAuthStatus_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 73:
                        if (room.mRoomTabs == null) {
                            room.mRoomTabs = new ArrayList();
                        }
                        room.mRoomTabs.add(_RoomTab_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 74:
                        room.introduction = C2896h.m8234e(gVar);
                        break;
                    case 75:
                        room.burstInfo = _BurstInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 76:
                        room.healthScoreInfo = _UserHealthScoreInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 77:
                        room.isReplay = C2896h.m8230a(gVar);
                        break;
                    case 78:
                        room.vid = C2896h.m8234e(gVar);
                        break;
                    case 79:
                        room.mGroupSource = (int) C2896h.m8232c(gVar);
                        break;
                    case 80:
                        room.mLotteryFinishTime = C2896h.m8232c(gVar);
                        break;
                    case 81:
                        room.mPlayTagInfo = _LivePlayTagInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 82:
                        room.mPortraitCover = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 83:
                        room.background = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 84:
                        room.layout = C2896h.m8232c(gVar);
                        break;
                    case 85:
                        room.mWaitCopy = C2896h.m8234e(gVar);
                        break;
                    case 86:
                        room.mGuideButton = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 87:
                        room.mPreviewCopy = C2896h.m8234e(gVar);
                        break;
                    case 88:
                        room.showInquiryBall = C2896h.m8230a(gVar);
                        break;
                    case 89:
                        room.matchInfo = _MatchInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 90:
                        room.unusedEffect = C2896h.m8230a(gVar);
                        break;
                    case 91:
                        room.giftMessageStyle = (int) C2896h.m8232c(gVar);
                        break;
                    case 92:
                        room.distanceKm = C2896h.m8234e(gVar);
                        break;
                    case 93:
                        room.finish_url = C2896h.m8234e(gVar);
                        break;
                    case 94:
                        room.officialRoomInfo = _OfficialRoomInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                room.init();
                return room;
            }
        }
    }
}
