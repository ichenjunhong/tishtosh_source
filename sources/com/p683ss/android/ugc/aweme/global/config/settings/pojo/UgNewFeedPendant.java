package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant */
public final class UgNewFeedPendant extends Message<UgNewFeedPendant, Builder> {
    public static final DefaultValueProtoAdapter<UgNewFeedPendant> ADAPTER = new ProtoAdapter_UgNewFeedPendant();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 16)
    public final List<String> big_png_fragments_urls;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer disappear_after;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 2, tag = 15)
    public final List<Integer> fragment_lottie_frame_list;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgFrequentLimit#ADAPTER", tag = 8)
    public final UgFrequentLimit frequent_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String lottie_file_md5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 11)
    public final List<String> lottie_file_zip;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 14)
    public final Boolean mini_pendant_closable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 13)
    public final Boolean mini_pendant_switchable;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser#ADAPTER", tag = 2)
    public final UgNewUser new_user;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer pendant_type;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", label = 2, tag = 1)
    public final List<UrlModel> resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean show_in_follow;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer show_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 17)
    public final List<String> small_png_fragments_urls;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 12)
    public final Boolean teenager_mode_enable;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UgUserLimit#ADAPTER", tag = 5)
    public final UgUserLimit user_limit;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgNewFeedPendant, Builder> {
        public List<String> big_png_fragments_urls = Internal.newMutableList();
        public Integer disappear_after;
        public List<Integer> fragment_lottie_frame_list = Internal.newMutableList();
        public UgFrequentLimit frequent_limit;
        public String h5_link;
        public String lottie_file_md5;
        public List<String> lottie_file_zip = Internal.newMutableList();
        public Boolean mini_pendant_closable;
        public Boolean mini_pendant_switchable;
        public UgNewUser new_user;
        public Integer pendant_type = Integer.valueOf(0);
        public List<UrlModel> resource_url = Internal.newMutableList();
        public Boolean show_in_follow;
        public Integer show_times;
        public List<String> small_png_fragments_urls = Internal.newMutableList();
        public Boolean teenager_mode_enable;
        public UgUserLimit user_limit;

        public final UgNewFeedPendant build() {
            return new UgNewFeedPendant(this, super.buildUnknownFields());
        }

        public final Builder disappear_after(Integer num) {
            this.disappear_after = num;
            return this;
        }

        public final Builder frequent_limit(UgFrequentLimit ugFrequentLimit) {
            this.frequent_limit = ugFrequentLimit;
            return this;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder lottie_file_md5(String str) {
            this.lottie_file_md5 = str;
            return this;
        }

        public final Builder mini_pendant_closable(Boolean bool) {
            this.mini_pendant_closable = bool;
            return this;
        }

        public final Builder mini_pendant_switchable(Boolean bool) {
            this.mini_pendant_switchable = bool;
            return this;
        }

        public final Builder new_user(UgNewUser ugNewUser) {
            this.new_user = ugNewUser;
            return this;
        }

        public final Builder pendant_type(Integer num) {
            this.pendant_type = num;
            return this;
        }

        public final Builder show_in_follow(Boolean bool) {
            this.show_in_follow = bool;
            return this;
        }

        public final Builder show_times(Integer num) {
            this.show_times = num;
            return this;
        }

        public final Builder teenager_mode_enable(Boolean bool) {
            this.teenager_mode_enable = bool;
            return this;
        }

        public final Builder user_limit(UgUserLimit ugUserLimit) {
            this.user_limit = ugUserLimit;
            return this;
        }

        public final Builder big_png_fragments_urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.big_png_fragments_urls = list;
            return this;
        }

        public final Builder fragment_lottie_frame_list(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.fragment_lottie_frame_list = list;
            return this;
        }

        public final Builder lottie_file_zip(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.lottie_file_zip = list;
            return this;
        }

        public final Builder resource_url(List<UrlModel> list) {
            Internal.checkElementsNotNull(list);
            this.resource_url = list;
            return this;
        }

        public final Builder small_png_fragments_urls(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.small_png_fragments_urls = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant$ProtoAdapter_UgNewFeedPendant */
    static final class ProtoAdapter_UgNewFeedPendant extends DefaultValueProtoAdapter<UgNewFeedPendant> {
        public final UgNewFeedPendant redact(UgNewFeedPendant ugNewFeedPendant) {
            return ugNewFeedPendant;
        }

        public ProtoAdapter_UgNewFeedPendant() {
            super(FieldEncoding.LENGTH_DELIMITED, UgNewFeedPendant.class);
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgNewFeedPendant) null);
        }

        public final int encodedSize(UgNewFeedPendant ugNewFeedPendant) {
            return UrlModel.ADAPTER.asRepeated().encodedSizeWithTag(1, ugNewFeedPendant.resource_url) + UgNewUser.ADAPTER.encodedSizeWithTag(2, ugNewFeedPendant.new_user) + ProtoAdapter.INT32.encodedSizeWithTag(3, ugNewFeedPendant.disappear_after) + ProtoAdapter.STRING.encodedSizeWithTag(4, ugNewFeedPendant.h5_link) + UgUserLimit.ADAPTER.encodedSizeWithTag(5, ugNewFeedPendant.user_limit) + ProtoAdapter.INT32.encodedSizeWithTag(6, ugNewFeedPendant.show_times) + ProtoAdapter.BOOL.encodedSizeWithTag(7, ugNewFeedPendant.show_in_follow) + UgFrequentLimit.ADAPTER.encodedSizeWithTag(8, ugNewFeedPendant.frequent_limit) + ProtoAdapter.INT32.encodedSizeWithTag(9, ugNewFeedPendant.pendant_type) + ProtoAdapter.STRING.encodedSizeWithTag(10, ugNewFeedPendant.lottie_file_md5) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, ugNewFeedPendant.lottie_file_zip) + ProtoAdapter.BOOL.encodedSizeWithTag(12, ugNewFeedPendant.teenager_mode_enable) + ProtoAdapter.BOOL.encodedSizeWithTag(13, ugNewFeedPendant.mini_pendant_switchable) + ProtoAdapter.BOOL.encodedSizeWithTag(14, ugNewFeedPendant.mini_pendant_closable) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(15, ugNewFeedPendant.fragment_lottie_frame_list) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(16, ugNewFeedPendant.big_png_fragments_urls) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(17, ugNewFeedPendant.small_png_fragments_urls) + ugNewFeedPendant.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            UrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, ugNewFeedPendant.resource_url);
            UgNewUser.ADAPTER.encodeWithTag(protoWriter, 2, ugNewFeedPendant.new_user);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, ugNewFeedPendant.disappear_after);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ugNewFeedPendant.h5_link);
            UgUserLimit.ADAPTER.encodeWithTag(protoWriter, 5, ugNewFeedPendant.user_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, ugNewFeedPendant.show_times);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, ugNewFeedPendant.show_in_follow);
            UgFrequentLimit.ADAPTER.encodeWithTag(protoWriter, 8, ugNewFeedPendant.frequent_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, ugNewFeedPendant.pendant_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, ugNewFeedPendant.lottie_file_md5);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, ugNewFeedPendant.lottie_file_zip);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, ugNewFeedPendant.teenager_mode_enable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, ugNewFeedPendant.mini_pendant_switchable);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, ugNewFeedPendant.mini_pendant_closable);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 15, ugNewFeedPendant.fragment_lottie_frame_list);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 16, ugNewFeedPendant.big_png_fragments_urls);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 17, ugNewFeedPendant.small_png_fragments_urls);
            protoWriter.writeBytes(ugNewFeedPendant.unknownFields());
        }

        public final UgNewFeedPendant decode(ProtoReader protoReader, UgNewFeedPendant ugNewFeedPendant) throws IOException {
            Builder builder;
            UgNewFeedPendant ugNewFeedPendant2 = (UgNewFeedPendant) C10617a.m21405a().mo18840a(UgNewFeedPendant.class, ugNewFeedPendant);
            if (ugNewFeedPendant2 != null) {
                builder = ugNewFeedPendant2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<UrlModel> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            List<Integer> newMutableList3 = Internal.newMutableList();
            List<String> newMutableList4 = Internal.newMutableList();
            List<String> newMutableList5 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(UrlModel.ADAPTER.decode(protoReader, C10617a.m21405a().mo18839a(UrlModel.class)));
                            break;
                        case 2:
                            builder.new_user((UgNewUser) UgNewUser.ADAPTER.decode(protoReader, builder.new_user));
                            break;
                        case 3:
                            builder.disappear_after((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.h5_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.user_limit((UgUserLimit) UgUserLimit.ADAPTER.decode(protoReader, builder.user_limit));
                            break;
                        case 6:
                            builder.show_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.show_in_follow((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            builder.frequent_limit((UgFrequentLimit) UgFrequentLimit.ADAPTER.decode(protoReader, builder.frequent_limit));
                            break;
                        case 9:
                            builder.pendant_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 10:
                            builder.lottie_file_md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.teenager_mode_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 13:
                            builder.mini_pendant_switchable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 14:
                            builder.mini_pendant_closable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 15:
                            newMutableList3.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 16:
                            newMutableList4.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 17:
                            newMutableList5.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (ugNewFeedPendant2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.resource_url = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.lottie_file_zip = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder.fragment_lottie_frame_list = newMutableList3;
                    }
                    if (!newMutableList4.isEmpty()) {
                        builder.big_png_fragments_urls = newMutableList4;
                    }
                    if (!newMutableList5.isEmpty()) {
                        builder.small_png_fragments_urls = newMutableList5;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getBigPngFragmentsUrls() {
        return this.big_png_fragments_urls;
    }

    public final List<Integer> getFragmentLottieFrameList() {
        return this.fragment_lottie_frame_list;
    }

    public final List<String> getLottieFileZip() {
        return this.lottie_file_zip;
    }

    public final List<UrlModel> getResourceUrl() {
        return this.resource_url;
    }

    public final List<String> getSmallPngFragmentsUrls() {
        return this.small_png_fragments_urls;
    }

    public final Integer getDisappearAfter() throws C10174a {
        if (this.disappear_after != null) {
            return this.disappear_after;
        }
        throw new C10174a();
    }

    public final UgFrequentLimit getFrequentLimit() throws C10174a {
        if (this.frequent_limit != null) {
            return this.frequent_limit;
        }
        throw new C10174a();
    }

    public final String getH5Link() throws C10174a {
        if (this.h5_link != null) {
            return this.h5_link;
        }
        throw new C10174a();
    }

    public final String getLottieFileMd5() throws C10174a {
        if (this.lottie_file_md5 != null) {
            return this.lottie_file_md5;
        }
        throw new C10174a();
    }

    public final Boolean getMiniPendantClosable() throws C10174a {
        if (this.mini_pendant_closable != null) {
            return this.mini_pendant_closable;
        }
        throw new C10174a();
    }

    public final Boolean getMiniPendantSwitchable() throws C10174a {
        if (this.mini_pendant_switchable != null) {
            return this.mini_pendant_switchable;
        }
        throw new C10174a();
    }

    public final UgNewUser getNewUser() throws C10174a {
        if (this.new_user != null) {
            return this.new_user;
        }
        throw new C10174a();
    }

    public final Integer getPendantType() throws C10174a {
        if (this.pendant_type != null) {
            return this.pendant_type;
        }
        throw new C10174a();
    }

    public final Boolean getShowInFollow() throws C10174a {
        if (this.show_in_follow != null) {
            return this.show_in_follow;
        }
        throw new C10174a();
    }

    public final Integer getShowTimes() throws C10174a {
        if (this.show_times != null) {
            return this.show_times;
        }
        throw new C10174a();
    }

    public final Boolean getTeenagerModeEnable() throws C10174a {
        if (this.teenager_mode_enable != null) {
            return this.teenager_mode_enable;
        }
        throw new C10174a();
    }

    public final UgUserLimit getUserLimit() throws C10174a {
        if (this.user_limit != null) {
            return this.user_limit;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = Internal.copyOf("resource_url", this.resource_url);
        builder.new_user = this.new_user;
        builder.disappear_after = this.disappear_after;
        builder.h5_link = this.h5_link;
        builder.user_limit = this.user_limit;
        builder.show_times = this.show_times;
        builder.show_in_follow = this.show_in_follow;
        builder.frequent_limit = this.frequent_limit;
        builder.pendant_type = this.pendant_type;
        builder.lottie_file_md5 = this.lottie_file_md5;
        builder.lottie_file_zip = Internal.copyOf("lottie_file_zip", this.lottie_file_zip);
        builder.teenager_mode_enable = this.teenager_mode_enable;
        builder.mini_pendant_switchable = this.mini_pendant_switchable;
        builder.mini_pendant_closable = this.mini_pendant_closable;
        builder.fragment_lottie_frame_list = Internal.copyOf("fragment_lottie_frame_list", this.fragment_lottie_frame_list);
        builder.big_png_fragments_urls = Internal.copyOf("big_png_fragments_urls", this.big_png_fragments_urls);
        builder.small_png_fragments_urls = Internal.copyOf("small_png_fragments_urls", this.small_png_fragments_urls);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.resource_url.hashCode()) * 37;
        int i13 = 0;
        if (this.new_user != null) {
            i = this.new_user.hashCode();
        } else {
            i = 0;
        }
        int i14 = (hashCode + i) * 37;
        if (this.disappear_after != null) {
            i2 = this.disappear_after.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 37;
        if (this.h5_link != null) {
            i3 = this.h5_link.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 37;
        if (this.user_limit != null) {
            i4 = this.user_limit.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 37;
        if (this.show_times != null) {
            i5 = this.show_times.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 37;
        if (this.show_in_follow != null) {
            i6 = this.show_in_follow.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        if (this.frequent_limit != null) {
            i7 = this.frequent_limit.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        if (this.pendant_type != null) {
            i8 = this.pendant_type.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        if (this.lottie_file_md5 != null) {
            i9 = this.lottie_file_md5.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode2 = (((i21 + i9) * 37) + this.lottie_file_zip.hashCode()) * 37;
        if (this.teenager_mode_enable != null) {
            i10 = this.teenager_mode_enable.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (hashCode2 + i10) * 37;
        if (this.mini_pendant_switchable != null) {
            i11 = this.mini_pendant_switchable.hashCode();
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 37;
        if (this.mini_pendant_closable != null) {
            i13 = this.mini_pendant_closable.hashCode();
        }
        int hashCode3 = ((((((i23 + i13) * 37) + this.fragment_lottie_frame_list.hashCode()) * 37) + this.big_png_fragments_urls.hashCode()) * 37) + this.small_png_fragments_urls.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.resource_url.isEmpty()) {
            sb.append(", resource_url=");
            sb.append(this.resource_url);
        }
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        if (this.disappear_after != null) {
            sb.append(", disappear_after=");
            sb.append(this.disappear_after);
        }
        if (this.h5_link != null) {
            sb.append(", h5_link=");
            sb.append(this.h5_link);
        }
        if (this.user_limit != null) {
            sb.append(", user_limit=");
            sb.append(this.user_limit);
        }
        if (this.show_times != null) {
            sb.append(", show_times=");
            sb.append(this.show_times);
        }
        if (this.show_in_follow != null) {
            sb.append(", show_in_follow=");
            sb.append(this.show_in_follow);
        }
        if (this.frequent_limit != null) {
            sb.append(", frequent_limit=");
            sb.append(this.frequent_limit);
        }
        if (this.pendant_type != null) {
            sb.append(", pendant_type=");
            sb.append(this.pendant_type);
        }
        if (this.lottie_file_md5 != null) {
            sb.append(", lottie_file_md5=");
            sb.append(this.lottie_file_md5);
        }
        if (!this.lottie_file_zip.isEmpty()) {
            sb.append(", lottie_file_zip=");
            sb.append(this.lottie_file_zip);
        }
        if (this.teenager_mode_enable != null) {
            sb.append(", teenager_mode_enable=");
            sb.append(this.teenager_mode_enable);
        }
        if (this.mini_pendant_switchable != null) {
            sb.append(", mini_pendant_switchable=");
            sb.append(this.mini_pendant_switchable);
        }
        if (this.mini_pendant_closable != null) {
            sb.append(", mini_pendant_closable=");
            sb.append(this.mini_pendant_closable);
        }
        if (!this.fragment_lottie_frame_list.isEmpty()) {
            sb.append(", fragment_lottie_frame_list=");
            sb.append(this.fragment_lottie_frame_list);
        }
        if (!this.big_png_fragments_urls.isEmpty()) {
            sb.append(", big_png_fragments_urls=");
            sb.append(this.big_png_fragments_urls);
        }
        if (!this.small_png_fragments_urls.isEmpty()) {
            sb.append(", small_png_fragments_urls=");
            sb.append(this.small_png_fragments_urls);
        }
        StringBuilder replace = sb.replace(0, 2, "UgNewFeedPendant{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgNewFeedPendant)) {
            return false;
        }
        UgNewFeedPendant ugNewFeedPendant = (UgNewFeedPendant) obj;
        if (!unknownFields().equals(ugNewFeedPendant.unknownFields()) || !this.resource_url.equals(ugNewFeedPendant.resource_url) || !Internal.equals(this.new_user, ugNewFeedPendant.new_user) || !Internal.equals(this.disappear_after, ugNewFeedPendant.disappear_after) || !Internal.equals(this.h5_link, ugNewFeedPendant.h5_link) || !Internal.equals(this.user_limit, ugNewFeedPendant.user_limit) || !Internal.equals(this.show_times, ugNewFeedPendant.show_times) || !Internal.equals(this.show_in_follow, ugNewFeedPendant.show_in_follow) || !Internal.equals(this.frequent_limit, ugNewFeedPendant.frequent_limit) || !Internal.equals(this.pendant_type, ugNewFeedPendant.pendant_type) || !Internal.equals(this.lottie_file_md5, ugNewFeedPendant.lottie_file_md5) || !this.lottie_file_zip.equals(ugNewFeedPendant.lottie_file_zip) || !Internal.equals(this.teenager_mode_enable, ugNewFeedPendant.teenager_mode_enable) || !Internal.equals(this.mini_pendant_switchable, ugNewFeedPendant.mini_pendant_switchable) || !Internal.equals(this.mini_pendant_closable, ugNewFeedPendant.mini_pendant_closable) || !this.fragment_lottie_frame_list.equals(ugNewFeedPendant.fragment_lottie_frame_list) || !this.big_png_fragments_urls.equals(ugNewFeedPendant.big_png_fragments_urls) || !this.small_png_fragments_urls.equals(ugNewFeedPendant.small_png_fragments_urls)) {
            return false;
        }
        return true;
    }

    public UgNewFeedPendant(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = Internal.immutableCopyOf("resource_url", builder.resource_url);
        this.new_user = builder.new_user;
        this.disappear_after = builder.disappear_after;
        this.h5_link = builder.h5_link;
        this.user_limit = builder.user_limit;
        this.show_times = builder.show_times;
        this.show_in_follow = builder.show_in_follow;
        this.frequent_limit = builder.frequent_limit;
        this.pendant_type = builder.pendant_type;
        this.lottie_file_md5 = builder.lottie_file_md5;
        this.lottie_file_zip = Internal.immutableCopyOf("lottie_file_zip", builder.lottie_file_zip);
        this.teenager_mode_enable = builder.teenager_mode_enable;
        this.mini_pendant_switchable = builder.mini_pendant_switchable;
        this.mini_pendant_closable = builder.mini_pendant_closable;
        this.fragment_lottie_frame_list = Internal.immutableCopyOf("fragment_lottie_frame_list", builder.fragment_lottie_frame_list);
        this.big_png_fragments_urls = Internal.immutableCopyOf("big_png_fragments_urls", builder.big_png_fragments_urls);
        this.small_png_fragments_urls = Internal.immutableCopyOf("small_png_fragments_urls", builder.small_png_fragments_urls);
    }
}
