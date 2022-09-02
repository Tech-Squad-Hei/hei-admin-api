# PayingApi

All URIs are relative to *https://api-dev.hei.school*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDelayPenaltyChange**](PayingApi.md#createDelayPenaltyChange) | **POST** /delay_penalty_change | Change current delay penalty configuration
[**createStudentFees**](PayingApi.md#createStudentFees) | **POST** /students/{student_id}/fees | Create student fees
[**createStudentPayments**](PayingApi.md#createStudentPayments) | **POST** /students/{student_id}/fees/{fee_id}/payments | Create student payments
[**getDelayPenalty**](PayingApi.md#getDelayPenalty) | **GET** /delay_penalty | Get current delay penalty
[**getFees**](PayingApi.md#getFees) | **GET** /fees | Get all student fees filtered by status
[**getStudentFeeById**](PayingApi.md#getStudentFeeById) | **GET** /students/{student_id}/fees/{fee_id} | Get student fee by identifier
[**getStudentFees**](PayingApi.md#getStudentFees) | **GET** /students/{student_id}/fees | Get all student fees ordered by due datetime desc
[**getStudentPayments**](PayingApi.md#getStudentPayments) | **GET** /students/{student_id}/fees/{fee_id}/payments | Get all student payments of a specific fee. Resulting list is ordered by creation datetime desc.


<a name="createDelayPenaltyChange"></a>
# **createDelayPenaltyChange**
> DelayPenalty createDelayPenaltyChange(createDelayPenaltyChange)

Change current delay penalty configuration

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    CreateDelayPenaltyChange createDelayPenaltyChange = new CreateDelayPenaltyChange(); // CreateDelayPenaltyChange | Delay penalties to create
    try {
      DelayPenalty result = apiInstance.createDelayPenaltyChange(createDelayPenaltyChange);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#createDelayPenaltyChange");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDelayPenaltyChange** | [**CreateDelayPenaltyChange**](CreateDelayPenaltyChange.md)| Delay penalties to create |

### Return type

[**DelayPenalty**](DelayPenalty.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of created delay penalties |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="createStudentFees"></a>
# **createStudentFees**
> List&lt;Fee&gt; createStudentFees(studentId, createFee)

Create student fees

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String studentId = "studentId_example"; // String | 
    List<CreateFee> createFee = Arrays.asList(); // List<CreateFee> | Student fees to create
    try {
      List<Fee> result = apiInstance.createStudentFees(studentId, createFee);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#createStudentFees");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**|  |
 **createFee** | [**List&lt;CreateFee&gt;**](CreateFee.md)| Student fees to create |

### Return type

[**List&lt;Fee&gt;**](Fee.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created student fees |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="createStudentPayments"></a>
# **createStudentPayments**
> List&lt;Payment&gt; createStudentPayments(studentId, feeId, createPayment)

Create student payments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String studentId = "studentId_example"; // String | 
    String feeId = "feeId_example"; // String | 
    List<CreatePayment> createPayment = Arrays.asList(); // List<CreatePayment> | Student payments to create
    try {
      List<Payment> result = apiInstance.createStudentPayments(studentId, feeId, createPayment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#createStudentPayments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**|  |
 **feeId** | **String**|  |
 **createPayment** | [**List&lt;CreatePayment&gt;**](CreatePayment.md)| Student payments to create |

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created student payments |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getDelayPenalty"></a>
# **getDelayPenalty**
> DelayPenalty getDelayPenalty()

Get current delay penalty

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    try {
      DelayPenalty result = apiInstance.getDelayPenalty();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#getDelayPenalty");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DelayPenalty**](DelayPenalty.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Active delay penalty |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getFees"></a>
# **getFees**
> List&lt;Fee&gt; getFees(status, page, pageSize)

Get all student fees filtered by status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String status = "LATE"; // String | See the PaymentStatus object for its value.
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      List<Fee> result = apiInstance.getFees(status, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#getFees");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| See the PaymentStatus object for its value. | [optional] [default to LATE] [enum: UNPAID, LATE, PAID]
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Fee&gt;**](Fee.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of filtered student fees |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getStudentFeeById"></a>
# **getStudentFeeById**
> Fee getStudentFeeById(studentId, feeId)

Get student fee by identifier

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String studentId = "studentId_example"; // String | 
    String feeId = "feeId_example"; // String | 
    try {
      Fee result = apiInstance.getStudentFeeById(studentId, feeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#getStudentFeeById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**|  |
 **feeId** | **String**|  |

### Return type

[**Fee**](Fee.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Identified student fee |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getStudentFees"></a>
# **getStudentFees**
> List&lt;Fee&gt; getStudentFees(studentId, page, pageSize, status)

Get all student fees ordered by due datetime desc

Fees can be filtered with an optional payment status parameter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String studentId = "studentId_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String status = "status_example"; // String | 
    try {
      List<Fee> result = apiInstance.getStudentFees(studentId, page, pageSize, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#getStudentFees");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **status** | **String**|  | [optional] [enum: UNPAID, PAID, LATE]

### Return type

[**List&lt;Fee&gt;**](Fee.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of all student fees |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getStudentPayments"></a>
# **getStudentPayments**
> List&lt;Payment&gt; getStudentPayments(studentId, feeId, page, pageSize)

Get all student payments of a specific fee. Resulting list is ordered by creation datetime desc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PayingApi apiInstance = new PayingApi(defaultClient);
    String studentId = "studentId_example"; // String | 
    String feeId = "feeId_example"; // String | 
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      List<Payment> result = apiInstance.getStudentPayments(studentId, feeId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayingApi#getStudentPayments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **String**|  |
 **feeId** | **String**|  |
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of all student payments |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

