/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1/recommendation.proto

package com.google.cloud.recommender.v1;

public final class RecommendationOuterClass {
  private RecommendationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Recommendation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Recommendation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_OperationGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_OperationGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ValueMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_CostProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_CostProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Impact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Impact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/recommender/v1/recommenda"
          + "tion.proto\022\033google.cloud.recommender.v1\032"
          + "\031google/api/resource.proto\032\036google/proto"
          + "buf/duration.proto\032\034google/protobuf/stru"
          + "ct.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\027google/type/money.proto\"\270\004\n\016Recommend"
          + "ation\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t"
          + "\022\033\n\023recommender_subtype\030\014 \001(\t\0225\n\021last_re"
          + "fresh_time\030\004 \001(\0132\032.google.protobuf.Times"
          + "tamp\022;\n\016primary_impact\030\005 \001(\0132#.google.cl"
          + "oud.recommender.v1.Impact\022>\n\021additional_"
          + "impact\030\006 \003(\0132#.google.cloud.recommender."
          + "v1.Impact\022C\n\007content\030\007 \001(\01322.google.clou"
          + "d.recommender.v1.RecommendationContent\022H"
          + "\n\nstate_info\030\n \001(\01324.google.cloud.recomm"
          + "ender.v1.RecommendationStateInfo\022\014\n\004etag"
          + "\030\013 \001(\t:\224\001\352A\220\001\n)recommender.googleapis.co"
          + "m/Recommendation\022cprojects/{project}/loc"
          + "ations/{location}/recommenders/{recommen"
          + "der}/recommendations/{recommendation}\"^\n"
          + "\025RecommendationContent\022E\n\020operation_grou"
          + "ps\030\002 \003(\0132+.google.cloud.recommender.v1.O"
          + "perationGroup\"L\n\016OperationGroup\022:\n\nopera"
          + "tions\030\001 \003(\0132&.google.cloud.recommender.v"
          + "1.Operation\"\327\004\n\tOperation\022\016\n\006action\030\001 \001("
          + "\t\022\025\n\rresource_type\030\002 \001(\t\022\020\n\010resource\030\003 \001"
          + "(\t\022\014\n\004path\030\004 \001(\t\022\027\n\017source_resource\030\005 \001("
          + "\t\022\023\n\013source_path\030\006 \001(\t\022\'\n\005value\030\007 \001(\0132\026."
          + "google.protobuf.ValueH\000\022B\n\rvalue_matcher"
          + "\030\n \001(\0132).google.cloud.recommender.v1.Val"
          + "ueMatcherH\000\022M\n\014path_filters\030\010 \003(\01327.goog"
          + "le.cloud.recommender.v1.Operation.PathFi"
          + "ltersEntry\022Z\n\023path_value_matchers\030\013 \003(\0132"
          + "=.google.cloud.recommender.v1.Operation."
          + "PathValueMatchersEntry\032J\n\020PathFiltersEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google."
          + "protobuf.Value:\0028\001\032c\n\026PathValueMatchersE"
          + "ntry\022\013\n\003key\030\001 \001(\t\0228\n\005value\030\002 \001(\0132).googl"
          + "e.cloud.recommender.v1.ValueMatcher:\0028\001B"
          + "\014\n\npath_value\":\n\014ValueMatcher\022\031\n\017matches"
          + "_pattern\030\001 \001(\tH\000B\017\n\rmatch_variant\"_\n\016Cos"
          + "tProjection\022 \n\004cost\030\001 \001(\0132\022.google.type."
          + "Money\022+\n\010duration\030\002 \001(\0132\031.google.protobu"
          + "f.Duration\"\200\002\n\006Impact\022>\n\010category\030\001 \001(\0162"
          + ",.google.cloud.recommender.v1.Impact.Cat"
          + "egory\022F\n\017cost_projection\030d \001(\0132+.google."
          + "cloud.recommender.v1.CostProjectionH\000\"`\n"
          + "\010Category\022\030\n\024CATEGORY_UNSPECIFIED\020\000\022\010\n\004C"
          + "OST\020\001\022\014\n\010SECURITY\020\002\022\017\n\013PERFORMANCE\020\003\022\021\n\r"
          + "MANAGEABILITY\020\004B\014\n\nprojection\"\336\002\n\027Recomm"
          + "endationStateInfo\022I\n\005state\030\001 \001(\0162:.googl"
          + "e.cloud.recommender.v1.RecommendationSta"
          + "teInfo.State\022_\n\016state_metadata\030\002 \003(\0132G.g"
          + "oogle.cloud.recommender.v1.Recommendatio"
          + "nStateInfo.StateMetadataEntry\0324\n\022StateMe"
          + "tadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:"
          + "\0028\001\"a\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006A"
          + "CTIVE\020\001\022\013\n\007CLAIMED\020\006\022\r\n\tSUCCEEDED\020\003\022\n\n\006F"
          + "AILED\020\004\022\r\n\tDISMISSED\020\005B\377\001\n\037com.google.cl"
          + "oud.recommender.v1P\001ZFgoogle.golang.org/"
          + "genproto/googleapis/cloud/recommender/v1"
          + ";recommender\242\002\004CREC\252\002\033Google.Cloud.Recom"
          + "mender.V1\352Al\n&recommender.googleapis.com"
          + "/Recommender\022Bprojects/{project}/locatio"
          + "ns/{location}/recommenders/{recommender}"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_recommender_v1_Recommendation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1_Recommendation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Recommendation_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "RecommenderSubtype",
              "LastRefreshTime",
              "PrimaryImpact",
              "AdditionalImpact",
              "Content",
              "StateInfo",
              "Etag",
            });
    internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1_RecommendationContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor,
            new java.lang.String[] {
              "OperationGroups",
            });
    internal_static_google_cloud_recommender_v1_OperationGroup_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommender_v1_OperationGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_OperationGroup_descriptor,
            new java.lang.String[] {
              "Operations",
            });
    internal_static_google_cloud_recommender_v1_Operation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommender_v1_Operation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_descriptor,
            new java.lang.String[] {
              "Action",
              "ResourceType",
              "Resource",
              "Path",
              "SourceResource",
              "SourcePath",
              "Value",
              "ValueMatcher",
              "PathFilters",
              "PathValueMatchers",
              "PathValue",
            });
    internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor =
        internal_static_google_cloud_recommender_v1_Operation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor =
        internal_static_google_cloud_recommender_v1_Operation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommender_v1_ValueMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor,
            new java.lang.String[] {
              "MatchesPattern", "MatchVariant",
            });
    internal_static_google_cloud_recommender_v1_CostProjection_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommender_v1_CostProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_CostProjection_descriptor,
            new java.lang.String[] {
              "Cost", "Duration",
            });
    internal_static_google_cloud_recommender_v1_Impact_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommender_v1_Impact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Impact_descriptor,
            new java.lang.String[] {
              "Category", "CostProjection", "Projection",
            });
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor,
            new java.lang.String[] {
              "State", "StateMetadata",
            });
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}