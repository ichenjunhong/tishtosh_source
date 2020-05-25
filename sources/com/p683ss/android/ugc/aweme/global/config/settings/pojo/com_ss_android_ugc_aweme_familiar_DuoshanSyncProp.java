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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanSyncProp */
public final class com_ss_android_ugc_aweme_familiar_DuoshanSyncProp extends Message<com_ss_android_ugc_aweme_familiar_DuoshanSyncProp, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_familiar_DuoshanSyncProp> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanSyncProp();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanUrlModel#ADAPTER", label = 2, tag = 128897035)
    public final List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> avatar_urls;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 124218344)
    public final Boolean enable_sync_to_duoshan;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 194013004)
    public final Boolean is_registered_duoshan;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 230043122)
    public final String sync_duoshan_cmpl_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 76173584)
    public final String sync_duoshan_relation_count_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 85009677)
    public final String sync_duoshan_relation_desc_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 232373728)
    public final String sync_duoshan_relation_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 72274932)
    public final String sync_history_to_duoshan_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 102439959)
    public final String sync_single_to_duoshan_toast;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 240870349)
    public final Integer sync_to_duoshan_guide_frequency;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 140605997)
    public final Long sync_to_duoshan_guide_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 44206617)
    public final Integer sync_to_duoshan_popup_frequency;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 172927612)
    public final Long sync_to_duoshan_popup_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 256720300)
    public final Integer sync_to_duoshan_toast_frequency;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 15190767)
    public final Boolean synced_history_to_duoshan;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanSyncProp$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_familiar_DuoshanSyncProp, Builder> {
        public List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> avatar_urls = Internal.newMutableList();
        public Boolean enable_sync_to_duoshan;
        public Boolean is_registered_duoshan;
        public String sync_duoshan_cmpl_toast;
        public String sync_duoshan_relation_count_toast;
        public String sync_duoshan_relation_desc_toast;
        public String sync_duoshan_relation_toast;
        public String sync_history_to_duoshan_toast;
        public String sync_single_to_duoshan_toast;
        public Integer sync_to_duoshan_guide_frequency;
        public Long sync_to_duoshan_guide_interval;
        public Integer sync_to_duoshan_popup_frequency;
        public Long sync_to_duoshan_popup_interval;
        public Integer sync_to_duoshan_toast_frequency;
        public Boolean synced_history_to_duoshan;

        public final com_ss_android_ugc_aweme_familiar_DuoshanSyncProp build() {
            com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop = new com_ss_android_ugc_aweme_familiar_DuoshanSyncProp(this.enable_sync_to_duoshan, this.sync_duoshan_relation_toast, this.avatar_urls, this.sync_to_duoshan_toast_frequency, this.sync_duoshan_cmpl_toast, this.sync_duoshan_relation_count_toast, this.sync_duoshan_relation_desc_toast, this.sync_history_to_duoshan_toast, this.sync_single_to_duoshan_toast, this.synced_history_to_duoshan, this.is_registered_duoshan, this.sync_to_duoshan_popup_frequency, this.sync_to_duoshan_popup_interval, this.sync_to_duoshan_guide_frequency, this.sync_to_duoshan_guide_interval, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_familiar_duoshansyncprop;
        }

        public final Builder enable_sync_to_duoshan(Boolean bool) {
            this.enable_sync_to_duoshan = bool;
            return this;
        }

        public final Builder is_registered_duoshan(Boolean bool) {
            this.is_registered_duoshan = bool;
            return this;
        }

        public final Builder sync_duoshan_cmpl_toast(String str) {
            this.sync_duoshan_cmpl_toast = str;
            return this;
        }

        public final Builder sync_duoshan_relation_count_toast(String str) {
            this.sync_duoshan_relation_count_toast = str;
            return this;
        }

        public final Builder sync_duoshan_relation_desc_toast(String str) {
            this.sync_duoshan_relation_desc_toast = str;
            return this;
        }

        public final Builder sync_duoshan_relation_toast(String str) {
            this.sync_duoshan_relation_toast = str;
            return this;
        }

        public final Builder sync_history_to_duoshan_toast(String str) {
            this.sync_history_to_duoshan_toast = str;
            return this;
        }

        public final Builder sync_single_to_duoshan_toast(String str) {
            this.sync_single_to_duoshan_toast = str;
            return this;
        }

        public final Builder sync_to_duoshan_guide_frequency(Integer num) {
            this.sync_to_duoshan_guide_frequency = num;
            return this;
        }

        public final Builder sync_to_duoshan_guide_interval(Long l) {
            this.sync_to_duoshan_guide_interval = l;
            return this;
        }

        public final Builder sync_to_duoshan_popup_frequency(Integer num) {
            this.sync_to_duoshan_popup_frequency = num;
            return this;
        }

        public final Builder sync_to_duoshan_popup_interval(Long l) {
            this.sync_to_duoshan_popup_interval = l;
            return this;
        }

        public final Builder sync_to_duoshan_toast_frequency(Integer num) {
            this.sync_to_duoshan_toast_frequency = num;
            return this;
        }

        public final Builder synced_history_to_duoshan(Boolean bool) {
            this.synced_history_to_duoshan = bool;
            return this;
        }

        public final Builder avatar_urls(List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> list) {
            Internal.checkElementsNotNull(list);
            this.avatar_urls = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanSyncProp$ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanSyncProp */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanSyncProp extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_familiar_DuoshanSyncProp> {
        public final com_ss_android_ugc_aweme_familiar_DuoshanSyncProp redact(com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop) {
            return com_ss_android_ugc_aweme_familiar_duoshansyncprop;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanSyncProp() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_familiar_DuoshanSyncProp.class);
        }

        public final com_ss_android_ugc_aweme_familiar_DuoshanSyncProp decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_familiar_DuoshanSyncProp) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(124218344, com_ss_android_ugc_aweme_familiar_duoshansyncprop.enable_sync_to_duoshan) + ProtoAdapter.STRING.encodedSizeWithTag(232373728, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_toast) + com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.ADAPTER.asRepeated().encodedSizeWithTag(128897035, com_ss_android_ugc_aweme_familiar_duoshansyncprop.avatar_urls) + ProtoAdapter.INT32.encodedSizeWithTag(256720300, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_toast_frequency) + ProtoAdapter.STRING.encodedSizeWithTag(230043122, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_cmpl_toast) + ProtoAdapter.STRING.encodedSizeWithTag(76173584, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_count_toast) + ProtoAdapter.STRING.encodedSizeWithTag(85009677, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_desc_toast) + ProtoAdapter.STRING.encodedSizeWithTag(72274932, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_history_to_duoshan_toast) + ProtoAdapter.STRING.encodedSizeWithTag(102439959, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_single_to_duoshan_toast) + ProtoAdapter.BOOL.encodedSizeWithTag(15190767, com_ss_android_ugc_aweme_familiar_duoshansyncprop.synced_history_to_duoshan) + ProtoAdapter.BOOL.encodedSizeWithTag(194013004, com_ss_android_ugc_aweme_familiar_duoshansyncprop.is_registered_duoshan) + ProtoAdapter.INT32.encodedSizeWithTag(44206617, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_frequency) + ProtoAdapter.INT64.encodedSizeWithTag(172927612, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_interval) + ProtoAdapter.INT32.encodedSizeWithTag(240870349, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_frequency) + ProtoAdapter.INT64.encodedSizeWithTag(140605997, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_interval) + com_ss_android_ugc_aweme_familiar_duoshansyncprop.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 124218344, com_ss_android_ugc_aweme_familiar_duoshansyncprop.enable_sync_to_duoshan);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 232373728, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_toast);
            com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 128897035, com_ss_android_ugc_aweme_familiar_duoshansyncprop.avatar_urls);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 256720300, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_toast_frequency);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 230043122, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_cmpl_toast);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 76173584, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_count_toast);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 85009677, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_desc_toast);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 72274932, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_history_to_duoshan_toast);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 102439959, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_single_to_duoshan_toast);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15190767, com_ss_android_ugc_aweme_familiar_duoshansyncprop.synced_history_to_duoshan);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 194013004, com_ss_android_ugc_aweme_familiar_duoshansyncprop.is_registered_duoshan);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 44206617, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_frequency);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 172927612, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_interval);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 240870349, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_frequency);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 140605997, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_interval);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_familiar_duoshansyncprop.unknownFields());
        }

        public final com_ss_android_ugc_aweme_familiar_DuoshanSyncProp decode(ProtoReader protoReader, com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop2 = (com_ss_android_ugc_aweme_familiar_DuoshanSyncProp) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_familiar_DuoshanSyncProp.class, com_ss_android_ugc_aweme_familiar_duoshansyncprop);
            if (com_ss_android_ugc_aweme_familiar_duoshansyncprop2 != null) {
                builder = com_ss_android_ugc_aweme_familiar_duoshansyncprop2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 15190767:
                            builder.synced_history_to_duoshan((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 44206617:
                            builder.sync_to_duoshan_popup_frequency((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 72274932:
                            builder.sync_history_to_duoshan_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 76173584:
                            builder.sync_duoshan_relation_count_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 85009677:
                            builder.sync_duoshan_relation_desc_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 102439959:
                            builder.sync_single_to_duoshan_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 124218344:
                            builder.enable_sync_to_duoshan((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 128897035:
                            newMutableList.add(com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.ADAPTER.decode(protoReader, C10617a.m21405a().mo18839a(com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.class)));
                            break;
                        case 140605997:
                            builder.sync_to_duoshan_guide_interval((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 172927612:
                            builder.sync_to_duoshan_popup_interval((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 194013004:
                            builder.is_registered_duoshan((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 230043122:
                            builder.sync_duoshan_cmpl_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 232373728:
                            builder.sync_duoshan_relation_toast((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 240870349:
                            builder.sync_to_duoshan_guide_frequency((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 256720300:
                            builder.sync_to_duoshan_toast_frequency((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_familiar_duoshansyncprop2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.avatar_urls = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> getAvatarUrls() {
        return this.avatar_urls;
    }

    public final Boolean getEnableSyncToDuoshan() throws C10174a {
        if (this.enable_sync_to_duoshan != null) {
            return this.enable_sync_to_duoshan;
        }
        throw new C10174a();
    }

    public final Boolean getIsRegisteredDuoshan() throws C10174a {
        if (this.is_registered_duoshan != null) {
            return this.is_registered_duoshan;
        }
        throw new C10174a();
    }

    public final String getSyncDuoshanCmplToast() throws C10174a {
        if (this.sync_duoshan_cmpl_toast != null) {
            return this.sync_duoshan_cmpl_toast;
        }
        throw new C10174a();
    }

    public final String getSyncDuoshanRelationCountToast() throws C10174a {
        if (this.sync_duoshan_relation_count_toast != null) {
            return this.sync_duoshan_relation_count_toast;
        }
        throw new C10174a();
    }

    public final String getSyncDuoshanRelationDescToast() throws C10174a {
        if (this.sync_duoshan_relation_desc_toast != null) {
            return this.sync_duoshan_relation_desc_toast;
        }
        throw new C10174a();
    }

    public final String getSyncDuoshanRelationToast() throws C10174a {
        if (this.sync_duoshan_relation_toast != null) {
            return this.sync_duoshan_relation_toast;
        }
        throw new C10174a();
    }

    public final String getSyncHistoryToDuoshanToast() throws C10174a {
        if (this.sync_history_to_duoshan_toast != null) {
            return this.sync_history_to_duoshan_toast;
        }
        throw new C10174a();
    }

    public final String getSyncSingleToDuoshanToast() throws C10174a {
        if (this.sync_single_to_duoshan_toast != null) {
            return this.sync_single_to_duoshan_toast;
        }
        throw new C10174a();
    }

    public final Integer getSyncToDuoshanGuideFrequency() throws C10174a {
        if (this.sync_to_duoshan_guide_frequency != null) {
            return this.sync_to_duoshan_guide_frequency;
        }
        throw new C10174a();
    }

    public final Long getSyncToDuoshanGuideInterval() throws C10174a {
        if (this.sync_to_duoshan_guide_interval != null) {
            return this.sync_to_duoshan_guide_interval;
        }
        throw new C10174a();
    }

    public final Integer getSyncToDuoshanPopupFrequency() throws C10174a {
        if (this.sync_to_duoshan_popup_frequency != null) {
            return this.sync_to_duoshan_popup_frequency;
        }
        throw new C10174a();
    }

    public final Long getSyncToDuoshanPopupInterval() throws C10174a {
        if (this.sync_to_duoshan_popup_interval != null) {
            return this.sync_to_duoshan_popup_interval;
        }
        throw new C10174a();
    }

    public final Integer getSyncToDuoshanToastFrequency() throws C10174a {
        if (this.sync_to_duoshan_toast_frequency != null) {
            return this.sync_to_duoshan_toast_frequency;
        }
        throw new C10174a();
    }

    public final Boolean getSyncedHistoryToDuoshan() throws C10174a {
        if (this.synced_history_to_duoshan != null) {
            return this.synced_history_to_duoshan;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable_sync_to_duoshan = this.enable_sync_to_duoshan;
        builder.sync_duoshan_relation_toast = this.sync_duoshan_relation_toast;
        builder.avatar_urls = Internal.copyOf("avatar_urls", this.avatar_urls);
        builder.sync_to_duoshan_toast_frequency = this.sync_to_duoshan_toast_frequency;
        builder.sync_duoshan_cmpl_toast = this.sync_duoshan_cmpl_toast;
        builder.sync_duoshan_relation_count_toast = this.sync_duoshan_relation_count_toast;
        builder.sync_duoshan_relation_desc_toast = this.sync_duoshan_relation_desc_toast;
        builder.sync_history_to_duoshan_toast = this.sync_history_to_duoshan_toast;
        builder.sync_single_to_duoshan_toast = this.sync_single_to_duoshan_toast;
        builder.synced_history_to_duoshan = this.synced_history_to_duoshan;
        builder.is_registered_duoshan = this.is_registered_duoshan;
        builder.sync_to_duoshan_popup_frequency = this.sync_to_duoshan_popup_frequency;
        builder.sync_to_duoshan_popup_interval = this.sync_to_duoshan_popup_interval;
        builder.sync_to_duoshan_guide_frequency = this.sync_to_duoshan_guide_frequency;
        builder.sync_to_duoshan_guide_interval = this.sync_to_duoshan_guide_interval;
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
        int i12;
        int i13;
        int i14 = this.hashCode;
        if (i14 != 0) {
            return i14;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i15 = 0;
        if (this.enable_sync_to_duoshan != null) {
            i = this.enable_sync_to_duoshan.hashCode();
        } else {
            i = 0;
        }
        int i16 = (hashCode + i) * 37;
        if (this.sync_duoshan_relation_toast != null) {
            i2 = this.sync_duoshan_relation_toast.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i16 + i2) * 37) + this.avatar_urls.hashCode()) * 37;
        if (this.sync_to_duoshan_toast_frequency != null) {
            i3 = this.sync_to_duoshan_toast_frequency.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (hashCode2 + i3) * 37;
        if (this.sync_duoshan_cmpl_toast != null) {
            i4 = this.sync_duoshan_cmpl_toast.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 37;
        if (this.sync_duoshan_relation_count_toast != null) {
            i5 = this.sync_duoshan_relation_count_toast.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 37;
        if (this.sync_duoshan_relation_desc_toast != null) {
            i6 = this.sync_duoshan_relation_desc_toast.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 37;
        if (this.sync_history_to_duoshan_toast != null) {
            i7 = this.sync_history_to_duoshan_toast.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 37;
        if (this.sync_single_to_duoshan_toast != null) {
            i8 = this.sync_single_to_duoshan_toast.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 37;
        if (this.synced_history_to_duoshan != null) {
            i9 = this.synced_history_to_duoshan.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 37;
        if (this.is_registered_duoshan != null) {
            i10 = this.is_registered_duoshan.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 37;
        if (this.sync_to_duoshan_popup_frequency != null) {
            i11 = this.sync_to_duoshan_popup_frequency.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 37;
        if (this.sync_to_duoshan_popup_interval != null) {
            i12 = this.sync_to_duoshan_popup_interval.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 37;
        if (this.sync_to_duoshan_guide_frequency != null) {
            i13 = this.sync_to_duoshan_guide_frequency.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 37;
        if (this.sync_to_duoshan_guide_interval != null) {
            i15 = this.sync_to_duoshan_guide_interval.hashCode();
        }
        int i28 = i27 + i15;
        this.hashCode = i28;
        return i28;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable_sync_to_duoshan != null) {
            sb.append(", enable_sync_to_duoshan=");
            sb.append(this.enable_sync_to_duoshan);
        }
        if (this.sync_duoshan_relation_toast != null) {
            sb.append(", sync_duoshan_relation_toast=");
            sb.append(this.sync_duoshan_relation_toast);
        }
        if (!this.avatar_urls.isEmpty()) {
            sb.append(", avatar_urls=");
            sb.append(this.avatar_urls);
        }
        if (this.sync_to_duoshan_toast_frequency != null) {
            sb.append(", sync_to_duoshan_toast_frequency=");
            sb.append(this.sync_to_duoshan_toast_frequency);
        }
        if (this.sync_duoshan_cmpl_toast != null) {
            sb.append(", sync_duoshan_cmpl_toast=");
            sb.append(this.sync_duoshan_cmpl_toast);
        }
        if (this.sync_duoshan_relation_count_toast != null) {
            sb.append(", sync_duoshan_relation_count_toast=");
            sb.append(this.sync_duoshan_relation_count_toast);
        }
        if (this.sync_duoshan_relation_desc_toast != null) {
            sb.append(", sync_duoshan_relation_desc_toast=");
            sb.append(this.sync_duoshan_relation_desc_toast);
        }
        if (this.sync_history_to_duoshan_toast != null) {
            sb.append(", sync_history_to_duoshan_toast=");
            sb.append(this.sync_history_to_duoshan_toast);
        }
        if (this.sync_single_to_duoshan_toast != null) {
            sb.append(", sync_single_to_duoshan_toast=");
            sb.append(this.sync_single_to_duoshan_toast);
        }
        if (this.synced_history_to_duoshan != null) {
            sb.append(", synced_history_to_duoshan=");
            sb.append(this.synced_history_to_duoshan);
        }
        if (this.is_registered_duoshan != null) {
            sb.append(", is_registered_duoshan=");
            sb.append(this.is_registered_duoshan);
        }
        if (this.sync_to_duoshan_popup_frequency != null) {
            sb.append(", sync_to_duoshan_popup_frequency=");
            sb.append(this.sync_to_duoshan_popup_frequency);
        }
        if (this.sync_to_duoshan_popup_interval != null) {
            sb.append(", sync_to_duoshan_popup_interval=");
            sb.append(this.sync_to_duoshan_popup_interval);
        }
        if (this.sync_to_duoshan_guide_frequency != null) {
            sb.append(", sync_to_duoshan_guide_frequency=");
            sb.append(this.sync_to_duoshan_guide_frequency);
        }
        if (this.sync_to_duoshan_guide_interval != null) {
            sb.append(", sync_to_duoshan_guide_interval=");
            sb.append(this.sync_to_duoshan_guide_interval);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_familiar_DuoshanSyncProp{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_familiar_DuoshanSyncProp)) {
            return false;
        }
        com_ss_android_ugc_aweme_familiar_DuoshanSyncProp com_ss_android_ugc_aweme_familiar_duoshansyncprop = (com_ss_android_ugc_aweme_familiar_DuoshanSyncProp) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_familiar_duoshansyncprop.unknownFields()) || !Internal.equals(this.enable_sync_to_duoshan, com_ss_android_ugc_aweme_familiar_duoshansyncprop.enable_sync_to_duoshan) || !Internal.equals(this.sync_duoshan_relation_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_toast) || !this.avatar_urls.equals(com_ss_android_ugc_aweme_familiar_duoshansyncprop.avatar_urls) || !Internal.equals(this.sync_to_duoshan_toast_frequency, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_toast_frequency) || !Internal.equals(this.sync_duoshan_cmpl_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_cmpl_toast) || !Internal.equals(this.sync_duoshan_relation_count_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_count_toast) || !Internal.equals(this.sync_duoshan_relation_desc_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_duoshan_relation_desc_toast) || !Internal.equals(this.sync_history_to_duoshan_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_history_to_duoshan_toast) || !Internal.equals(this.sync_single_to_duoshan_toast, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_single_to_duoshan_toast) || !Internal.equals(this.synced_history_to_duoshan, com_ss_android_ugc_aweme_familiar_duoshansyncprop.synced_history_to_duoshan) || !Internal.equals(this.is_registered_duoshan, com_ss_android_ugc_aweme_familiar_duoshansyncprop.is_registered_duoshan) || !Internal.equals(this.sync_to_duoshan_popup_frequency, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_frequency) || !Internal.equals(this.sync_to_duoshan_popup_interval, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_popup_interval) || !Internal.equals(this.sync_to_duoshan_guide_frequency, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_frequency) || !Internal.equals(this.sync_to_duoshan_guide_interval, com_ss_android_ugc_aweme_familiar_duoshansyncprop.sync_to_duoshan_guide_interval)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_familiar_DuoshanSyncProp(Boolean bool, String str, List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> list, Integer num, String str2, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, Integer num2, Long l, Integer num3, Long l2) {
        this(bool, str, list, num, str2, str3, str4, str5, str6, bool2, bool3, num2, l, num3, l2, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_familiar_DuoshanSyncProp(Boolean bool, String str, List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> list, Integer num, String str2, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, Integer num2, Long l, Integer num3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_sync_to_duoshan = bool;
        this.sync_duoshan_relation_toast = str;
        List<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> list2 = list;
        this.avatar_urls = Internal.immutableCopyOf("avatar_urls", list);
        this.sync_to_duoshan_toast_frequency = num;
        this.sync_duoshan_cmpl_toast = str2;
        this.sync_duoshan_relation_count_toast = str3;
        this.sync_duoshan_relation_desc_toast = str4;
        this.sync_history_to_duoshan_toast = str5;
        this.sync_single_to_duoshan_toast = str6;
        this.synced_history_to_duoshan = bool2;
        this.is_registered_duoshan = bool3;
        this.sync_to_duoshan_popup_frequency = num2;
        this.sync_to_duoshan_popup_interval = l;
        this.sync_to_duoshan_guide_frequency = num3;
        this.sync_to_duoshan_guide_interval = l2;
    }
}
