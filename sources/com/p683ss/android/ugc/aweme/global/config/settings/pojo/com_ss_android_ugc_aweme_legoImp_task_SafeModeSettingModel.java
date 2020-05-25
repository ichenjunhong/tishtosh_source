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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel */
public final class com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel extends Message<com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel> ADAPTER = new C32845x21534270();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 225106561)
    public final Boolean enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 206815346)
    public final List<String> freeze_api;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 160972354)
    public final Long freeze_duration;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel, Builder> {
        public Boolean enable;
        public List<String> freeze_api = Internal.newMutableList();
        public Long freeze_duration;

        public final com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel build() {
            return new com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel(this.enable, this.freeze_duration, this.freeze_api, super.buildUnknownFields());
        }

        public final Builder enable(Boolean bool) {
            this.enable = bool;
            return this;
        }

        public final Builder freeze_duration(Long l) {
            this.freeze_duration = l;
            return this;
        }

        public final Builder freeze_api(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.freeze_api = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel$ProtoAdapter_com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel */
    static final class C32845x21534270 extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel> {
        public final com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel redact(com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel) {
            return com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel;
        }

        public C32845x21534270() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel.class);
        }

        public final com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(225106561, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.enable) + ProtoAdapter.INT64.encodedSizeWithTag(160972354, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_duration) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(206815346, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_api) + com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 225106561, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.enable);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 160972354, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_duration);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 206815346, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_api);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.unknownFields());
        }

        public final com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel decode(ProtoReader protoReader, com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel2 = (com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel.class, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel);
            if (com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel2 != null) {
                builder = com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.freeze_api = newMutableList;
                    }
                    return builder.build();
                } else if (nextTag == 160972354) {
                    builder.freeze_duration((Long) ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 206815346) {
                    newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 225106561) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }
    }

    public final List<String> getFreezeApi() {
        return this.freeze_api;
    }

    public final Boolean getEnable() throws C10174a {
        if (this.enable != null) {
            return this.enable;
        }
        throw new C10174a();
    }

    public final Long getFreezeDuration() throws C10174a {
        if (this.freeze_duration != null) {
            return this.freeze_duration;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.enable = this.enable;
        builder.freeze_duration = this.freeze_duration;
        builder.freeze_api = Internal.copyOf("freeze_api", this.freeze_api);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.enable != null) {
            i = this.enable.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.freeze_duration != null) {
            i3 = this.freeze_duration.hashCode();
        }
        int hashCode2 = ((i4 + i3) * 37) + this.freeze_api.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.enable != null) {
            sb.append(", enable=");
            sb.append(this.enable);
        }
        if (this.freeze_duration != null) {
            sb.append(", freeze_duration=");
            sb.append(this.freeze_duration);
        }
        if (!this.freeze_api.isEmpty()) {
            sb.append(", freeze_api=");
            sb.append(this.freeze_api);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel)) {
            return false;
        }
        com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel = (com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.unknownFields()) || !Internal.equals(this.enable, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.enable) || !Internal.equals(this.freeze_duration, com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_duration) || !this.freeze_api.equals(com_ss_android_ugc_aweme_legoimp_task_safemodesettingmodel.freeze_api)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel(Boolean bool, Long l, List<String> list) {
        this(bool, l, list, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_legoImp_task_SafeModeSettingModel(Boolean bool, Long l, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable = bool;
        this.freeze_duration = l;
        this.freeze_api = Internal.immutableCopyOf("freeze_api", list);
    }
}
