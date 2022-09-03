

# Fee

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**studentId** | **String** |  |  [optional]
**remainingAmount** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**comment** | **String** |  |  [optional]
**totalAmount** | **Integer** |  |  [optional]
**creationDatetime** | **OffsetDateTime** |  |  [optional]
**dueDatetime** | **OffsetDateTime** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
UNPAID | &quot;UNPAID&quot;
PAID | &quot;PAID&quot;
LATE | &quot;LATE&quot;



## Enum: TypeEnum

Name | Value
---- | -----
TUITION | &quot;TUITION&quot;
HARDWARE | &quot;HARDWARE&quot;



