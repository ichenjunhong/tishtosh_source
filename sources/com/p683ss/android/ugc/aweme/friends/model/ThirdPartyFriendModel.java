package com.p683ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.friends.api.FriendApi;
import com.p683ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32568a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel */
public class ThirdPartyFriendModel extends C32568a<Friend> {
    private static Set<String> invitedContacts;
    private final String accessToken;
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    private boolean isSensitiveRegion;
    private final String platform;
    private final String secretAccessToken;

    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    private C0013i<FriendList<Friend>> uploadContacts() {
        return C0013i.m16a((Callable<TResult>) new ThirdPartyFriendModel$$Lambda$3<TResult>(this)).mo29c(new ThirdPartyFriendModel$$Lambda$4(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$4$ThirdPartyFriendModel() throws Exception {
        List<ContactModelV2> a = C47673an.m103183a(C11010c.m22280a());
        if (C9376b.m18558a((Collection<T>) a)) {
            return new UploadContactsResult();
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (ContactModelV2 contactModelV2 : a) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C9395d.m18572a(instance.digest(contactModelV2.nationalNumber(str).getBytes("UTF-8"))));
                    sb.append(C9395d.m18572a(instance.digest(str2.getBytes("UTF-8"))));
                    hashMap.put(sb.toString(), contactModel);
                }
            }
        }
        return UploadContactsApi.m75335a(a, 1);
    }

    public void addInvitedContact(String str) {
        SystemSmsInvitedCacheHelper.addInvitedContact(str);
    }

    public ThirdPartyFriendModel(String str) {
        this(str, null, null);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$fetchList$3$ThirdPartyFriendModel(C0013i iVar) throws Exception {
        ((FriendList) iVar.mo34e()).friends = sortByFollowStatus(((FriendList) iVar.mo34e()).friends);
        return iVar.mo34e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C0013i lambda$fetchList$1$ThirdPartyFriendModel(C0013i iVar) throws Exception {
        if (!this.isSensitiveRegion) {
            return this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).mo29c(new ThirdPartyFriendModel$$Lambda$6(this, iVar));
        }
        if (!iVar.mo33d()) {
            iVar.getClass();
            return C0013i.m16a(ThirdPartyFriendModel$$Lambda$5.get$Lambda(iVar));
        }
        throw iVar.mo35f();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$fetchList$2$ThirdPartyFriendModel(C0013i iVar) throws Exception {
        FriendList friendList = (FriendList) ((List) iVar.mo34e()).get(0);
        FriendList friendList2 = (FriendList) ((List) iVar.mo34e()).get(1);
        if (this.isSensitiveRegion) {
            return friendList2;
        }
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus(friendList.friends), friendList2.friends);
        return friendList;
    }

    private <T extends User> List<Friend> sortByFollowStatus(List<T> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (T t : list) {
            if (t.getFollowStatus() == 0) {
                arrayList.add(i, Friend.copyFrom(t));
                i++;
                i2++;
                i3++;
            } else if (t.getFollowStatus() == 4) {
                arrayList.add(i2, Friend.copyFrom(t));
                i2++;
                i3++;
            } else if (t.getFollowStatus() == 1) {
                arrayList.add(i3, Friend.copyFrom(t));
                i3++;
            } else {
                arrayList.add(Friend.copyFrom(t));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$uploadContacts$5$ThirdPartyFriendModel(C0013i iVar) throws Exception {
        ArrayList arrayList;
        UploadContactsResult uploadContactsResult = (UploadContactsResult) iVar.mo34e();
        List<ContactModel> list = uploadContactsResult.contacts;
        boolean z = false;
        if (!C9376b.m18558a((Collection<T>) list)) {
            arrayList = new ArrayList(list.size());
            int i = 0;
            for (ContactModel contactModel : list) {
                HashMap<String, ContactModel> hashMap = this.hashContactsMap;
                StringBuilder sb = new StringBuilder();
                sb.append(contactModel.phoneNumber);
                sb.append(contactModel.name);
                ContactModel contactModel2 = (ContactModel) hashMap.get(sb.toString());
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                }
                Friend friend = new Friend(contactModel.phoneNumber);
                friend.setNickname(contactModel.name);
                if (SystemSmsInvitedCacheHelper.contains(contactModel.phoneNumber)) {
                    friend.setInvited(true);
                    arrayList.add(friend);
                } else {
                    arrayList.add(i, friend);
                    i++;
                }
            }
        } else {
            arrayList = null;
        }
        List sortByFollowStatus = sortByFollowStatus(uploadContactsResult.users);
        FriendList friendList = new FriendList();
        friendList.friends = insertUnRegisteredContacts(sortByFollowStatus, arrayList);
        if (sortByFollowStatus != null) {
            z = true;
        }
        this.isSensitiveRegion = z;
        SharePrefCache.inst().getIsContactsUploaded().mo47776a(Boolean.valueOf(true));
        return friendList;
    }

    private List<Friend> insertUnRegisteredContacts(List<Friend> list, List<Friend> list2) {
        if (C9376b.m18558a((Collection<T>) list2)) {
            return list;
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            return list2;
        }
        int i = 0;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (((Friend) list.get(size)).getFollowStatus() == 0) {
                i = size + 1;
                break;
            } else {
                size--;
            }
        }
        list.addAll(i, list2);
        return list;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$null$0$ThirdPartyFriendModel(C0013i iVar, C0013i iVar2) throws Exception {
        ((FriendList) iVar2.mo34e()).friends = insertUnRegisteredContacts(sortByFollowStatus(((FriendList) iVar2.mo34e()).friends), ((FriendList) iVar.mo34e()).friends);
        return (FriendList) iVar2.mo34e();
    }

    public ThirdPartyFriendModel(String str, String str2, String str3) {
        this.hashContactsMap = new HashMap<>();
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.friendApi = (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(FriendApi.class);
    }

    public void fetchList(int i, int i2, int i3) {
        if (!this.platform.equals("contact")) {
            this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken).mo29c(new ThirdPartyFriendModel$$Lambda$2(this)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else if (!((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo47782d()).booleanValue()) {
            uploadContacts().mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new ThirdPartyFriendModel$$Lambda$0<TResult,C0013i<TContinuationResult>>(this)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            C0013i.m15a((Collection<? extends C0013i<TResult>>) Arrays.asList(new C0013i[]{this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken), uploadContacts()})).mo29c(new ThirdPartyFriendModel$$Lambda$1(this)).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
