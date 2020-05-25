package com.p683ss.android.ugc.aweme.feed.model;

import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelHelper */
public final class RelationLabelHelper {
    public static final RelationLabelHelper INSTANCE = new RelationLabelHelper();

    private RelationLabelHelper() {
    }

    public static final boolean hasNewFollowRelationLabel(Integer num) {
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewRelationLabel(Aweme aweme) {
        RelationLabelNew relationLabelNew;
        if (aweme != null) {
            relationLabelNew = aweme.feedRelationLabel;
        } else {
            relationLabelNew = null;
        }
        if (relationLabelNew != null) {
            return true;
        }
        return false;
    }

    public static final boolean hasNewFollowRelationLabel(Aweme aweme) {
        Integer num;
        if (aweme != null) {
            RelationLabelNew relationLabelNew = aweme.feedRelationLabel;
            if (relationLabelNew != null) {
                num = relationLabelNew.getType();
                return hasNewFollowRelationLabel(num);
            }
        }
        num = null;
        return hasNewFollowRelationLabel(num);
    }

    public static final boolean hasNewInteractiveRelationLabel(Aweme aweme) {
        Integer num;
        if (aweme != null) {
            RelationLabelNew relationLabelNew = aweme.feedRelationLabel;
            if (relationLabelNew != null) {
                num = relationLabelNew.getType();
                return hasNewInteractiveRelationLabel(num);
            }
        }
        num = null;
        return hasNewInteractiveRelationLabel(num);
    }

    public static final User convertLabelUser2user(RelationLabelUser relationLabelUser) {
        C52711k.m112240b(relationLabelUser, "labelUser");
        User user = new User();
        user.setUid(String.valueOf(relationLabelUser.getUid()));
        user.setSecUid(relationLabelUser.getSecUid());
        user.setNickname(relationLabelUser.getNickName());
        user.setRemarkName(relationLabelUser.getRemarkName());
        user.setAvatarLarger(relationLabelUser.getAvatarLarger());
        user.setAvatarThumb(relationLabelUser.getAvatarThumb());
        user.setFollowStatus(relationLabelUser.getFollowStatus());
        return user;
    }

    public static final List<User> convertLabelUsers2Users(List<RelationLabelUser> list) {
        C52711k.m112240b(list, "labelUsers");
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        List<User> arrayList = new ArrayList<>();
        for (RelationLabelUser convertLabelUser2user : list) {
            arrayList.add(convertLabelUser2user(convertLabelUser2user));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean hasCommentId(com.p683ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.RelationLabelNew r0 = r3.getFeedRelationLabel()
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r0 = r0.getType()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r1 = 0
            if (r0 != 0) goto L_0x0012
            goto L_0x003c
        L_0x0012:
            int r0 = r0.intValue()
            r2 = 3
            if (r0 != r2) goto L_0x003c
            r0 = 1
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.feed.model.RelationLabelNew r3 = r3.getFeedRelationLabel()
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.feed.model.RelationLabelExtra r3 = r3.getExtra()
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.getCid()
            if (r3 == 0) goto L_0x0038
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            return r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper.hasCommentId(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final boolean hasNewInteractiveRelationLabel(Integer num) {
        if ((num != null && num.intValue() == 1) || ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 3) || ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5))))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean hasDuoShanLabel(com.p683ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r0 = 1
            r1 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x001a }
            java.lang.String r3 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ a -> 0x001a }
            java.lang.Integer r2 = r2.getShowFromDuoshanLabel()     // Catch:{ a -> 0x001a }
            if (r2 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            int r2 = r2.intValue()     // Catch:{ a -> 0x001a }
            if (r2 != r0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 != 0) goto L_0x001e
            return r1
        L_0x001e:
            if (r4 == 0) goto L_0x0055
            java.util.List r4 = r4.getVideoLabels()
            if (r4 == 0) goto L_0x0055
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0036
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0036
            return r1
        L_0x0036:
            java.util.Iterator r4 = r4.iterator()
        L_0x003a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r4.next()
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r2 = (com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel) r2
            if (r2 == 0) goto L_0x0050
            int r2 = r2.labelType
            r3 = 100
            if (r2 != r3) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 == 0) goto L_0x003a
            return r0
        L_0x0054:
            return r1
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper.hasDuoShanLabel(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final RelationLabelNew mockStarCommentLabel(User user) {
        C52711k.m112240b(user, "user");
        RelationLabelNew relationLabelNew = new RelationLabelNew();
        relationLabelNew.setType(Integer.valueOf(4));
        List arrayList = new ArrayList();
        RelationLabelUser relationLabelUser = new RelationLabelUser();
        String uid = user.getUid();
        C52711k.m112236a((Object) uid, "user.uid");
        relationLabelUser.setUid(Long.parseLong(uid));
        relationLabelUser.setSecUid(user.getSecUid());
        relationLabelUser.setNickName(user.getNickname());
        relationLabelUser.setRemarkName(user.getRemarkName());
        relationLabelUser.setAvatarLarger(user.getAvatarLarger());
        relationLabelUser.setAvatarThumb(user.getAvatarThumb());
        relationLabelUser.setFollowStatus(user.getFollowStatus());
        arrayList.add(relationLabelUser);
        relationLabelNew.setUserList(arrayList);
        return relationLabelNew;
    }
}
